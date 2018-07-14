package org.apache.commons.lang.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StrSubstitutor
{
  public static final char DEFAULT_ESCAPE = '$';
  public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher("${");
  public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher("}");
  private char escapeChar;
  private StrMatcher prefixMatcher;
  private StrMatcher suffixMatcher;
  private StrLookup variableResolver;
  
  public StrSubstitutor()
  {
    this(null, localStrMatcher1, localStrMatcher2, '$');
  }
  
  public StrSubstitutor(Map paramMap)
  {
    this(localStrLookup, localStrMatcher1, localStrMatcher2, '$');
  }
  
  public StrSubstitutor(Map paramMap, String paramString1, String paramString2)
  {
    this(localStrLookup, paramString1, paramString2, '$');
  }
  
  public StrSubstitutor(Map paramMap, String paramString1, String paramString2, char paramChar)
  {
    this(localStrLookup, paramString1, paramString2, paramChar);
  }
  
  public StrSubstitutor(StrLookup paramStrLookup)
  {
    this(paramStrLookup, localStrMatcher1, localStrMatcher2, '$');
  }
  
  public StrSubstitutor(StrLookup paramStrLookup, String paramString1, String paramString2, char paramChar)
  {
    setVariableResolver(paramStrLookup);
    setVariablePrefix(paramString1);
    setVariableSuffix(paramString2);
    setEscapeChar(paramChar);
  }
  
  public StrSubstitutor(StrLookup paramStrLookup, StrMatcher paramStrMatcher1, StrMatcher paramStrMatcher2, char paramChar)
  {
    setVariableResolver(paramStrLookup);
    setVariablePrefixMatcher(paramStrMatcher1);
    setVariableSuffixMatcher(paramStrMatcher2);
    setEscapeChar(paramChar);
  }
  
  private void checkCyclicSubstitution(String paramString, List paramList)
  {
    boolean bool = paramList.contains(paramString);
    if (!bool) {
      return;
    }
    StrBuilder localStrBuilder = new org/apache/commons/lang/text/StrBuilder;
    localStrBuilder.<init>(256);
    localStrBuilder.append("Infinite loop in property interpolation of ");
    Object localObject = paramList.remove(0);
    localStrBuilder.append(localObject);
    localStrBuilder.append(": ");
    localStrBuilder.appendWithSeparators(paramList, "->");
    localObject = new java/lang/IllegalStateException;
    String str = localStrBuilder.toString();
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public static String replace(Object paramObject, Map paramMap)
  {
    StrSubstitutor localStrSubstitutor = new org/apache/commons/lang/text/StrSubstitutor;
    localStrSubstitutor.<init>(paramMap);
    return localStrSubstitutor.replace(paramObject);
  }
  
  public static String replace(Object paramObject, Map paramMap, String paramString1, String paramString2)
  {
    StrSubstitutor localStrSubstitutor = new org/apache/commons/lang/text/StrSubstitutor;
    localStrSubstitutor.<init>(paramMap, paramString1, paramString2);
    return localStrSubstitutor.replace(paramObject);
  }
  
  public static String replaceSystemProperties(Object paramObject)
  {
    StrSubstitutor localStrSubstitutor = new org/apache/commons/lang/text/StrSubstitutor;
    StrLookup localStrLookup = StrLookup.systemPropertiesLookup();
    localStrSubstitutor.<init>(localStrLookup);
    return localStrSubstitutor.replace(paramObject);
  }
  
  private int substitute(StrBuilder paramStrBuilder, int paramInt1, int paramInt2, List paramList)
  {
    StrMatcher localStrMatcher1 = getVariablePrefixMatcher();
    StrMatcher localStrMatcher2 = getVariableSuffixMatcher();
    int i = getEscapeChar();
    int j;
    int k;
    int m;
    char[] arrayOfChar;
    int n;
    int i1;
    if (paramList == null)
    {
      j = 1;
      k = 0;
      m = 0;
      arrayOfChar = paramStrBuilder.buffer;
      n = paramInt1 + paramInt2;
      i1 = paramInt1;
    }
    int i3;
    label199:
    String str2;
    for (;;)
    {
      if (i1 >= n) {
        break label424;
      }
      int i2 = localStrMatcher1.isMatch(arrayOfChar, i1, paramInt1, n);
      if (i2 == 0)
      {
        i1 += 1;
        continue;
        j = 0;
        break;
      }
      if (i1 > paramInt1)
      {
        i3 = i1 + -1;
        i3 = arrayOfChar[i3];
        if (i3 == i)
        {
          i3 = i1 + -1;
          paramStrBuilder.deleteCharAt(i3);
          arrayOfChar = paramStrBuilder.buffer;
          m += -1;
          k = 1;
          n += -1;
          continue;
        }
      }
      int i4 = i1;
      i1 += i2;
      int i5 = 0;
      while (i1 < n)
      {
        i5 = localStrMatcher2.isMatch(arrayOfChar, i1, paramInt1, n);
        if (i5 != 0) {
          break label199;
        }
        i1 += 1;
      }
      continue;
      String str1 = new java/lang/String;
      i3 = i4 + i2;
      int i6 = i1 - i4 - i2;
      str1.<init>(arrayOfChar, i3, i6);
      i1 += i5;
      int i7 = i1;
      if (paramList == null)
      {
        paramList = new java/util/ArrayList;
        paramList.<init>();
        str2 = new java/lang/String;
        str2.<init>(arrayOfChar, paramInt1, paramInt2);
        paramList.add(str2);
      }
      checkCyclicSubstitution(str1, paramList);
      paramList.add(str1);
      String str3 = resolveVariable(str1, paramStrBuilder, i4, i7);
      if (str3 != null)
      {
        int i8 = str3.length();
        paramStrBuilder.replace(i4, i7, str3);
        k = 1;
        int i9 = substitute(paramStrBuilder, i4, i8, paramList);
        i3 = i7 - i4;
        i3 = i8 - i3;
        i9 += i3;
        i1 += i9;
        n += i9;
        m += i9;
        arrayOfChar = paramStrBuilder.buffer;
      }
      i3 = paramList.size() + -1;
      paramList.remove(i3);
    }
    label424:
    if (j != 0) {
      if (k != 0) {
        i3 = 1;
      }
    }
    for (;;)
    {
      return i3;
      i3 = 0;
      str2 = null;
      continue;
      i3 = m;
    }
  }
  
  public char getEscapeChar()
  {
    return this.escapeChar;
  }
  
  public StrMatcher getVariablePrefixMatcher()
  {
    return this.prefixMatcher;
  }
  
  public StrLookup getVariableResolver()
  {
    return this.variableResolver;
  }
  
  public StrMatcher getVariableSuffixMatcher()
  {
    return this.suffixMatcher;
  }
  
  public String replace(Object paramObject)
  {
    if (paramObject == null) {}
    StrBuilder localStrBuilder;
    for (Object localObject = null;; localObject = localStrBuilder.toString())
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      ((StrBuilder)localObject).<init>();
      localStrBuilder = ((StrBuilder)localObject).append(paramObject);
      int i = localStrBuilder.length();
      substitute(localStrBuilder, 0, i);
    }
  }
  
  public String replace(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      StrBuilder localStrBuilder = new org/apache/commons/lang/text/StrBuilder;
      localStrBuilder.<init>(paramString);
      int i = paramString.length();
      boolean bool = substitute(localStrBuilder, 0, i);
      if (bool) {
        paramString = localStrBuilder.toString();
      }
    }
  }
  
  public String replace(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool;
    Object localObject;
    if (paramString == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      ((StrBuilder)localObject).<init>(paramInt2);
      StrBuilder localStrBuilder = ((StrBuilder)localObject).append(paramString, paramInt1, paramInt2);
      localObject = null;
      bool = substitute(localStrBuilder, 0, paramInt2);
      if (!bool)
      {
        int i = paramInt1 + paramInt2;
        localObject = paramString.substring(paramInt1, i);
      }
      else
      {
        localObject = localStrBuilder.toString();
      }
    }
  }
  
  public String replace(StringBuffer paramStringBuffer)
  {
    if (paramStringBuffer == null) {}
    StrBuilder localStrBuilder;
    for (Object localObject = null;; localObject = localStrBuilder.toString())
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      int i = paramStringBuffer.length();
      ((StrBuilder)localObject).<init>(i);
      localStrBuilder = ((StrBuilder)localObject).append(paramStringBuffer);
      i = localStrBuilder.length();
      substitute(localStrBuilder, 0, i);
    }
  }
  
  public String replace(StringBuffer paramStringBuffer, int paramInt1, int paramInt2)
  {
    if (paramStringBuffer == null) {}
    StrBuilder localStrBuilder;
    for (Object localObject = null;; localObject = localStrBuilder.toString())
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      ((StrBuilder)localObject).<init>(paramInt2);
      localStrBuilder = ((StrBuilder)localObject).append(paramStringBuffer, paramInt1, paramInt2);
      substitute(localStrBuilder, 0, paramInt2);
    }
  }
  
  public String replace(StrBuilder paramStrBuilder)
  {
    if (paramStrBuilder == null) {}
    StrBuilder localStrBuilder;
    for (Object localObject = null;; localObject = localStrBuilder.toString())
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      int i = paramStrBuilder.length();
      ((StrBuilder)localObject).<init>(i);
      localStrBuilder = ((StrBuilder)localObject).append(paramStrBuilder);
      i = localStrBuilder.length();
      substitute(localStrBuilder, 0, i);
    }
  }
  
  public String replace(StrBuilder paramStrBuilder, int paramInt1, int paramInt2)
  {
    if (paramStrBuilder == null) {}
    StrBuilder localStrBuilder;
    for (Object localObject = null;; localObject = localStrBuilder.toString())
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      ((StrBuilder)localObject).<init>(paramInt2);
      localStrBuilder = ((StrBuilder)localObject).append(paramStrBuilder, paramInt1, paramInt2);
      substitute(localStrBuilder, 0, paramInt2);
    }
  }
  
  public String replace(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {}
    StrBuilder localStrBuilder;
    for (Object localObject = null;; localObject = localStrBuilder.toString())
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      int i = paramArrayOfChar.length;
      ((StrBuilder)localObject).<init>(i);
      localStrBuilder = ((StrBuilder)localObject).append(paramArrayOfChar);
      i = paramArrayOfChar.length;
      substitute(localStrBuilder, 0, i);
    }
  }
  
  public String replace(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramArrayOfChar == null) {}
    StrBuilder localStrBuilder;
    for (Object localObject = null;; localObject = localStrBuilder.toString())
    {
      return (String)localObject;
      localObject = new org/apache/commons/lang/text/StrBuilder;
      ((StrBuilder)localObject).<init>(paramInt2);
      localStrBuilder = ((StrBuilder)localObject).append(paramArrayOfChar, paramInt1, paramInt2);
      substitute(localStrBuilder, 0, paramInt2);
    }
  }
  
  public boolean replaceIn(StringBuffer paramStringBuffer)
  {
    boolean bool = false;
    if (paramStringBuffer == null) {}
    for (;;)
    {
      return bool;
      int i = paramStringBuffer.length();
      bool = replaceIn(paramStringBuffer, 0, i);
    }
  }
  
  public boolean replaceIn(StringBuffer paramStringBuffer, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    if (paramStringBuffer == null) {}
    for (;;)
    {
      return bool1;
      Object localObject = new org/apache/commons/lang/text/StrBuilder;
      ((StrBuilder)localObject).<init>(paramInt2);
      StrBuilder localStrBuilder = ((StrBuilder)localObject).append(paramStringBuffer, paramInt1, paramInt2);
      boolean bool2 = substitute(localStrBuilder, 0, paramInt2);
      if (bool2)
      {
        int i = paramInt1 + paramInt2;
        localObject = localStrBuilder.toString();
        paramStringBuffer.replace(paramInt1, i, (String)localObject);
        i = 1;
      }
    }
  }
  
  public boolean replaceIn(StrBuilder paramStrBuilder)
  {
    boolean bool = false;
    if (paramStrBuilder == null) {}
    for (;;)
    {
      return bool;
      int i = paramStrBuilder.length();
      bool = substitute(paramStrBuilder, 0, i);
    }
  }
  
  public boolean replaceIn(StrBuilder paramStrBuilder, int paramInt1, int paramInt2)
  {
    if (paramStrBuilder == null) {}
    for (boolean bool = false;; bool = substitute(paramStrBuilder, paramInt1, paramInt2)) {
      return bool;
    }
  }
  
  protected String resolveVariable(String paramString, StrBuilder paramStrBuilder, int paramInt1, int paramInt2)
  {
    StrLookup localStrLookup = getVariableResolver();
    if (localStrLookup == null) {}
    for (String str = null;; str = localStrLookup.lookup(paramString)) {
      return str;
    }
  }
  
  public void setEscapeChar(char paramChar)
  {
    this.escapeChar = paramChar;
  }
  
  public StrSubstitutor setVariablePrefix(char paramChar)
  {
    StrMatcher localStrMatcher = StrMatcher.charMatcher(paramChar);
    return setVariablePrefixMatcher(localStrMatcher);
  }
  
  public StrSubstitutor setVariablePrefix(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Variable prefix must not be null!");
      throw ((Throwable)localObject);
    }
    Object localObject = StrMatcher.stringMatcher(paramString);
    return setVariablePrefixMatcher((StrMatcher)localObject);
  }
  
  public StrSubstitutor setVariablePrefixMatcher(StrMatcher paramStrMatcher)
  {
    if (paramStrMatcher == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Variable prefix matcher must not be null!");
      throw localIllegalArgumentException;
    }
    this.prefixMatcher = paramStrMatcher;
    return this;
  }
  
  public void setVariableResolver(StrLookup paramStrLookup)
  {
    this.variableResolver = paramStrLookup;
  }
  
  public StrSubstitutor setVariableSuffix(char paramChar)
  {
    StrMatcher localStrMatcher = StrMatcher.charMatcher(paramChar);
    return setVariableSuffixMatcher(localStrMatcher);
  }
  
  public StrSubstitutor setVariableSuffix(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Variable suffix must not be null!");
      throw ((Throwable)localObject);
    }
    Object localObject = StrMatcher.stringMatcher(paramString);
    return setVariableSuffixMatcher((StrMatcher)localObject);
  }
  
  public StrSubstitutor setVariableSuffixMatcher(StrMatcher paramStrMatcher)
  {
    if (paramStrMatcher == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Variable suffix matcher must not be null!");
      throw localIllegalArgumentException;
    }
    this.suffixMatcher = paramStrMatcher;
    return this;
  }
  
  protected boolean substitute(StrBuilder paramStrBuilder, int paramInt1, int paramInt2)
  {
    int i = substitute(paramStrBuilder, paramInt1, paramInt2, null);
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrSubstitutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */