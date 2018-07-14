package org.apache.commons.lang.text;

import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SystemUtils;

public class StrBuilder
  implements Cloneable
{
  static final int CAPACITY = 32;
  private static final long serialVersionUID = 7628716375283629643L;
  protected char[] buffer;
  private String newLine;
  private String nullText;
  protected int size;
  
  public StrBuilder()
  {
    this(32);
  }
  
  public StrBuilder(int paramInt)
  {
    if (paramInt <= 0) {
      paramInt = 32;
    }
    char[] arrayOfChar = new char[paramInt];
    this.buffer = arrayOfChar;
  }
  
  public StrBuilder(String paramString)
  {
    int i;
    char[] arrayOfChar;
    if (paramString == null)
    {
      i = 32;
      arrayOfChar = new char[i];
      this.buffer = arrayOfChar;
    }
    for (;;)
    {
      return;
      i = paramString.length() + 32;
      arrayOfChar = new char[i];
      this.buffer = arrayOfChar;
      append(paramString);
    }
  }
  
  private void deleteImpl(int paramInt1, int paramInt2, int paramInt3)
  {
    char[] arrayOfChar1 = this.buffer;
    char[] arrayOfChar2 = this.buffer;
    int i = this.size - paramInt2;
    System.arraycopy(arrayOfChar1, paramInt2, arrayOfChar2, paramInt1, i);
    int j = this.size - paramInt3;
    this.size = j;
  }
  
  private StrBuilder replaceImpl(StrMatcher paramStrMatcher, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (paramStrMatcher != null)
    {
      i = this.size;
      if (i != 0) {}
    }
    else
    {
      return this;
    }
    if (paramString == null) {}
    for (int j = 0;; j = paramString.length())
    {
      char[] arrayOfChar = this.buffer;
      int k = paramInt1;
      while ((k < paramInt2) && (paramInt3 != 0))
      {
        int m = paramStrMatcher.isMatch(arrayOfChar, k, paramInt1, paramInt2);
        if (m > 0)
        {
          int n = k + m;
          replaceImpl(k, n, m, paramString, j);
          paramInt2 = paramInt2 - m + j;
          i = k + j;
          k = i + -1;
          if (paramInt3 > 0) {
            paramInt3 += -1;
          }
        }
        k += 1;
      }
      break;
    }
  }
  
  private void replaceImpl(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4)
  {
    int i = this.size - paramInt3;
    int j = i + paramInt4;
    char[] arrayOfChar1;
    char[] arrayOfChar2;
    if (paramInt4 != paramInt3)
    {
      ensureCapacity(j);
      arrayOfChar1 = this.buffer;
      arrayOfChar2 = this.buffer;
      int k = paramInt1 + paramInt4;
      int m = this.size - paramInt2;
      System.arraycopy(arrayOfChar1, paramInt2, arrayOfChar2, k, m);
      this.size = j;
    }
    if (paramInt4 > 0)
    {
      i = 0;
      arrayOfChar1 = null;
      arrayOfChar2 = this.buffer;
      paramString.getChars(0, paramInt4, arrayOfChar2, paramInt1);
    }
  }
  
  public StrBuilder append(char paramChar)
  {
    int i = length() + 1;
    ensureCapacity(i);
    char[] arrayOfChar = this.buffer;
    int j = this.size;
    int k = j + 1;
    this.size = k;
    arrayOfChar[j] = paramChar;
    return this;
  }
  
  public StrBuilder append(double paramDouble)
  {
    String str = String.valueOf(paramDouble);
    return append(str);
  }
  
  public StrBuilder append(float paramFloat)
  {
    String str = String.valueOf(paramFloat);
    return append(str);
  }
  
  public StrBuilder append(int paramInt)
  {
    String str = String.valueOf(paramInt);
    return append(str);
  }
  
  public StrBuilder append(long paramLong)
  {
    String str = String.valueOf(paramLong);
    return append(str);
  }
  
  public StrBuilder append(Object paramObject)
  {
    if (paramObject == null) {}
    for (Object localObject = appendNull();; localObject = append((String)localObject))
    {
      return (StrBuilder)localObject;
      localObject = paramObject.toString();
    }
  }
  
  public StrBuilder append(String paramString)
  {
    if (paramString == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i = paramString.length();
      if (i > 0)
      {
        int j = length();
        int k = j + i;
        ensureCapacity(k);
        char[] arrayOfChar = this.buffer;
        paramString.getChars(0, i, arrayOfChar, j);
        k = this.size + i;
        this.size = k;
      }
    }
  }
  
  public StrBuilder append(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i;
      StringIndexOutOfBoundsException localStringIndexOutOfBoundsException;
      if (paramInt1 >= 0)
      {
        i = paramString.length();
        if (paramInt1 <= i) {}
      }
      else
      {
        localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
        localStringIndexOutOfBoundsException.<init>("startIndex must be valid");
        throw localStringIndexOutOfBoundsException;
      }
      if (paramInt2 >= 0)
      {
        i = paramInt1 + paramInt2;
        int j = paramString.length();
        if (i <= j) {}
      }
      else
      {
        localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
        localStringIndexOutOfBoundsException.<init>("length must be valid");
        throw localStringIndexOutOfBoundsException;
      }
      if (paramInt2 > 0)
      {
        int k = length();
        i = k + paramInt2;
        ensureCapacity(i);
        i = paramInt1 + paramInt2;
        char[] arrayOfChar = this.buffer;
        paramString.getChars(paramInt1, i, arrayOfChar, k);
        i = this.size + paramInt2;
        this.size = i;
      }
    }
  }
  
  public StrBuilder append(StringBuffer paramStringBuffer)
  {
    if (paramStringBuffer == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i = paramStringBuffer.length();
      if (i > 0)
      {
        int j = length();
        int k = j + i;
        ensureCapacity(k);
        char[] arrayOfChar = this.buffer;
        paramStringBuffer.getChars(0, i, arrayOfChar, j);
        k = this.size + i;
        this.size = k;
      }
    }
  }
  
  public StrBuilder append(StringBuffer paramStringBuffer, int paramInt1, int paramInt2)
  {
    if (paramStringBuffer == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i;
      StringIndexOutOfBoundsException localStringIndexOutOfBoundsException;
      if (paramInt1 >= 0)
      {
        i = paramStringBuffer.length();
        if (paramInt1 <= i) {}
      }
      else
      {
        localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
        localStringIndexOutOfBoundsException.<init>("startIndex must be valid");
        throw localStringIndexOutOfBoundsException;
      }
      if (paramInt2 >= 0)
      {
        i = paramInt1 + paramInt2;
        int j = paramStringBuffer.length();
        if (i <= j) {}
      }
      else
      {
        localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
        localStringIndexOutOfBoundsException.<init>("length must be valid");
        throw localStringIndexOutOfBoundsException;
      }
      if (paramInt2 > 0)
      {
        int k = length();
        i = k + paramInt2;
        ensureCapacity(i);
        i = paramInt1 + paramInt2;
        char[] arrayOfChar = this.buffer;
        paramStringBuffer.getChars(paramInt1, i, arrayOfChar, k);
        i = this.size + paramInt2;
        this.size = i;
      }
    }
  }
  
  public StrBuilder append(StrBuilder paramStrBuilder)
  {
    if (paramStrBuilder == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i = paramStrBuilder.length();
      if (i > 0)
      {
        int j = length();
        int k = j + i;
        ensureCapacity(k);
        char[] arrayOfChar1 = paramStrBuilder.buffer;
        char[] arrayOfChar2 = this.buffer;
        System.arraycopy(arrayOfChar1, 0, arrayOfChar2, j, i);
        k = this.size + i;
        this.size = k;
      }
    }
  }
  
  public StrBuilder append(StrBuilder paramStrBuilder, int paramInt1, int paramInt2)
  {
    if (paramStrBuilder == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i;
      StringIndexOutOfBoundsException localStringIndexOutOfBoundsException;
      if (paramInt1 >= 0)
      {
        i = paramStrBuilder.length();
        if (paramInt1 <= i) {}
      }
      else
      {
        localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
        localStringIndexOutOfBoundsException.<init>("startIndex must be valid");
        throw localStringIndexOutOfBoundsException;
      }
      if (paramInt2 >= 0)
      {
        i = paramInt1 + paramInt2;
        int j = paramStrBuilder.length();
        if (i <= j) {}
      }
      else
      {
        localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
        localStringIndexOutOfBoundsException.<init>("length must be valid");
        throw localStringIndexOutOfBoundsException;
      }
      if (paramInt2 > 0)
      {
        int k = length();
        i = k + paramInt2;
        ensureCapacity(i);
        i = paramInt1 + paramInt2;
        char[] arrayOfChar = this.buffer;
        paramStrBuilder.getChars(paramInt1, i, arrayOfChar, k);
        i = this.size + paramInt2;
        this.size = i;
      }
    }
  }
  
  public StrBuilder append(boolean paramBoolean)
  {
    int i = 101;
    int j;
    char[] arrayOfChar;
    int k;
    int m;
    if (paramBoolean)
    {
      j = this.size + 4;
      ensureCapacity(j);
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = 't';
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = 'r';
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = 'u';
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = i;
    }
    for (;;)
    {
      return this;
      j = this.size + 5;
      ensureCapacity(j);
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = 'f';
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = 'a';
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = 'l';
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = 's';
      arrayOfChar = this.buffer;
      k = this.size;
      m = k + 1;
      this.size = m;
      arrayOfChar[k] = i;
    }
  }
  
  public StrBuilder append(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i = paramArrayOfChar.length;
      if (i > 0)
      {
        int j = length();
        int k = j + i;
        ensureCapacity(k);
        char[] arrayOfChar = this.buffer;
        System.arraycopy(paramArrayOfChar, 0, arrayOfChar, j, i);
        k = this.size + i;
        this.size = k;
      }
    }
  }
  
  public StrBuilder append(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramArrayOfChar == null) {
      this = appendNull();
    }
    for (;;)
    {
      return this;
      int i;
      Object localObject1;
      Object localObject2;
      if (paramInt1 >= 0)
      {
        i = paramArrayOfChar.length;
        if (paramInt1 <= i) {}
      }
      else
      {
        localObject1 = new java/lang/StringIndexOutOfBoundsException;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "Invalid startIndex: " + paramInt2;
        ((StringIndexOutOfBoundsException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      if (paramInt2 >= 0)
      {
        i = paramInt1 + paramInt2;
        int j = paramArrayOfChar.length;
        if (i <= j) {}
      }
      else
      {
        localObject1 = new java/lang/StringIndexOutOfBoundsException;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "Invalid length: " + paramInt2;
        ((StringIndexOutOfBoundsException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      if (paramInt2 > 0)
      {
        int k = length();
        i = k + paramInt2;
        ensureCapacity(i);
        localObject1 = this.buffer;
        System.arraycopy(paramArrayOfChar, paramInt1, localObject1, k, paramInt2);
        i = this.size + paramInt2;
        this.size = i;
      }
    }
  }
  
  public StrBuilder appendAll(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      int i = paramCollection.size();
      if (i > 0)
      {
        Iterator localIterator = paramCollection.iterator();
        for (;;)
        {
          boolean bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          Object localObject = localIterator.next();
          append(localObject);
        }
      }
    }
    return this;
  }
  
  public StrBuilder appendAll(Iterator paramIterator)
  {
    if (paramIterator != null) {
      for (;;)
      {
        boolean bool = paramIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject = paramIterator.next();
        append(localObject);
      }
    }
    return this;
  }
  
  public StrBuilder appendAll(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null)
    {
      int i = paramArrayOfObject.length;
      if (i > 0)
      {
        int j = 0;
        for (;;)
        {
          i = paramArrayOfObject.length;
          if (j >= i) {
            break;
          }
          Object localObject = paramArrayOfObject[j];
          append(localObject);
          j += 1;
        }
      }
    }
    return this;
  }
  
  public StrBuilder appendFixedWidthPadLeft(int paramInt1, int paramInt2, char paramChar)
  {
    String str = String.valueOf(paramInt1);
    return appendFixedWidthPadLeft(str, paramInt2, paramChar);
  }
  
  public StrBuilder appendFixedWidthPadLeft(Object paramObject, int paramInt, char paramChar)
  {
    int i;
    String str;
    int j;
    char[] arrayOfChar1;
    int k;
    if (paramInt > 0)
    {
      i = this.size + paramInt;
      ensureCapacity(i);
      if (paramObject != null) {
        break label98;
      }
      str = getNullText();
      if (str == null) {
        str = "";
      }
      j = str.length();
      if (j < paramInt) {
        break label107;
      }
      i = j - paramInt;
      arrayOfChar1 = this.buffer;
      k = this.size;
      str.getChars(i, j, arrayOfChar1, k);
    }
    for (;;)
    {
      i = this.size + paramInt;
      this.size = i;
      return this;
      label98:
      str = paramObject.toString();
      break;
      label107:
      int m = paramInt - j;
      int n = 0;
      while (n < m)
      {
        arrayOfChar2 = this.buffer;
        int i1 = this.size + n;
        arrayOfChar2[i1] = paramChar;
        n += 1;
      }
      i = 0;
      char[] arrayOfChar2 = null;
      arrayOfChar1 = this.buffer;
      k = this.size + m;
      str.getChars(0, j, arrayOfChar1, k);
    }
  }
  
  public StrBuilder appendFixedWidthPadRight(int paramInt1, int paramInt2, char paramChar)
  {
    String str = String.valueOf(paramInt1);
    return appendFixedWidthPadRight(str, paramInt2, paramChar);
  }
  
  public StrBuilder appendFixedWidthPadRight(Object paramObject, int paramInt, char paramChar)
  {
    int i;
    String str;
    int j;
    char[] arrayOfChar;
    int k;
    if (paramInt > 0)
    {
      i = this.size + paramInt;
      ensureCapacity(i);
      if (paramObject != null) {
        break label90;
      }
      str = getNullText();
      if (str == null) {
        str = "";
      }
      j = str.length();
      if (j < paramInt) {
        break label99;
      }
      arrayOfChar = this.buffer;
      k = this.size;
      str.getChars(0, paramInt, arrayOfChar, k);
    }
    for (;;)
    {
      i = this.size + paramInt;
      this.size = i;
      return this;
      label90:
      str = paramObject.toString();
      break;
      label99:
      int m = paramInt - j;
      arrayOfChar = this.buffer;
      k = this.size;
      str.getChars(0, j, arrayOfChar, k);
      int n = 0;
      while (n < m)
      {
        arrayOfChar = this.buffer;
        k = this.size + j + n;
        arrayOfChar[k] = paramChar;
        n += 1;
      }
    }
  }
  
  public StrBuilder appendNewLine()
  {
    String str = this.newLine;
    if (str == null)
    {
      str = SystemUtils.LINE_SEPARATOR;
      append(str);
    }
    for (;;)
    {
      return this;
      str = this.newLine;
      this = append(str);
    }
  }
  
  public StrBuilder appendNull()
  {
    String str = this.nullText;
    if (str == null) {}
    for (;;)
    {
      return this;
      str = this.nullText;
      this = append(str);
    }
  }
  
  public StrBuilder appendPadding(int paramInt, char paramChar)
  {
    if (paramInt >= 0)
    {
      int i = this.size + paramInt;
      ensureCapacity(i);
      int j = 0;
      while (j < paramInt)
      {
        char[] arrayOfChar = this.buffer;
        int k = this.size;
        int m = k + 1;
        this.size = m;
        arrayOfChar[k] = paramChar;
        j += 1;
      }
    }
    return this;
  }
  
  public StrBuilder appendSeparator(char paramChar)
  {
    int i = size();
    if (i > 0) {
      append(paramChar);
    }
    return this;
  }
  
  public StrBuilder appendSeparator(char paramChar1, char paramChar2)
  {
    int i = size();
    if (i > 0) {
      append(paramChar1);
    }
    for (;;)
    {
      return this;
      append(paramChar2);
    }
  }
  
  public StrBuilder appendSeparator(char paramChar, int paramInt)
  {
    if (paramInt > 0) {
      append(paramChar);
    }
    return this;
  }
  
  public StrBuilder appendSeparator(String paramString)
  {
    return appendSeparator(paramString, null);
  }
  
  public StrBuilder appendSeparator(String paramString, int paramInt)
  {
    if ((paramString != null) && (paramInt > 0)) {
      append(paramString);
    }
    return this;
  }
  
  public StrBuilder appendSeparator(String paramString1, String paramString2)
  {
    boolean bool = isEmpty();
    if (bool) {}
    for (String str = paramString2;; str = paramString1)
    {
      if (str != null) {
        append(str);
      }
      return this;
    }
  }
  
  public StrBuilder appendWithSeparators(Collection paramCollection, String paramString)
  {
    if (paramCollection != null)
    {
      int i = paramCollection.size();
      if (i > 0)
      {
        if (paramString == null) {
          paramString = "";
        }
        Iterator localIterator = paramCollection.iterator();
        for (;;)
        {
          boolean bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          Object localObject = localIterator.next();
          append(localObject);
          bool = localIterator.hasNext();
          if (bool) {
            append(paramString);
          }
        }
      }
    }
    return this;
  }
  
  public StrBuilder appendWithSeparators(Iterator paramIterator, String paramString)
  {
    if (paramIterator != null)
    {
      if (paramString == null) {
        paramString = "";
      }
      for (;;)
      {
        boolean bool = paramIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject = paramIterator.next();
        append(localObject);
        bool = paramIterator.hasNext();
        if (bool) {
          append(paramString);
        }
      }
    }
    return this;
  }
  
  public StrBuilder appendWithSeparators(Object[] paramArrayOfObject, String paramString)
  {
    if (paramArrayOfObject != null)
    {
      int i = paramArrayOfObject.length;
      if (i > 0)
      {
        if (paramString == null) {
          paramString = "";
        }
        i = 0;
        Object localObject = paramArrayOfObject[0];
        append(localObject);
        int j = 1;
        for (;;)
        {
          i = paramArrayOfObject.length;
          if (j >= i) {
            break;
          }
          append(paramString);
          localObject = paramArrayOfObject[j];
          append(localObject);
          j += 1;
        }
      }
    }
    return this;
  }
  
  public StrBuilder appendln(char paramChar)
  {
    return append(paramChar).appendNewLine();
  }
  
  public StrBuilder appendln(double paramDouble)
  {
    return append(paramDouble).appendNewLine();
  }
  
  public StrBuilder appendln(float paramFloat)
  {
    return append(paramFloat).appendNewLine();
  }
  
  public StrBuilder appendln(int paramInt)
  {
    return append(paramInt).appendNewLine();
  }
  
  public StrBuilder appendln(long paramLong)
  {
    return append(paramLong).appendNewLine();
  }
  
  public StrBuilder appendln(Object paramObject)
  {
    return append(paramObject).appendNewLine();
  }
  
  public StrBuilder appendln(String paramString)
  {
    return append(paramString).appendNewLine();
  }
  
  public StrBuilder appendln(String paramString, int paramInt1, int paramInt2)
  {
    return append(paramString, paramInt1, paramInt2).appendNewLine();
  }
  
  public StrBuilder appendln(StringBuffer paramStringBuffer)
  {
    return append(paramStringBuffer).appendNewLine();
  }
  
  public StrBuilder appendln(StringBuffer paramStringBuffer, int paramInt1, int paramInt2)
  {
    return append(paramStringBuffer, paramInt1, paramInt2).appendNewLine();
  }
  
  public StrBuilder appendln(StrBuilder paramStrBuilder)
  {
    return append(paramStrBuilder).appendNewLine();
  }
  
  public StrBuilder appendln(StrBuilder paramStrBuilder, int paramInt1, int paramInt2)
  {
    return append(paramStrBuilder, paramInt1, paramInt2).appendNewLine();
  }
  
  public StrBuilder appendln(boolean paramBoolean)
  {
    return append(paramBoolean).appendNewLine();
  }
  
  public StrBuilder appendln(char[] paramArrayOfChar)
  {
    return append(paramArrayOfChar).appendNewLine();
  }
  
  public StrBuilder appendln(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    return append(paramArrayOfChar, paramInt1, paramInt2).appendNewLine();
  }
  
  public Reader asReader()
  {
    StrBuilder.StrBuilderReader localStrBuilderReader = new org/apache/commons/lang/text/StrBuilder$StrBuilderReader;
    localStrBuilderReader.<init>(this);
    return localStrBuilderReader;
  }
  
  public StrTokenizer asTokenizer()
  {
    StrBuilder.StrBuilderTokenizer localStrBuilderTokenizer = new org/apache/commons/lang/text/StrBuilder$StrBuilderTokenizer;
    localStrBuilderTokenizer.<init>(this);
    return localStrBuilderTokenizer;
  }
  
  public Writer asWriter()
  {
    StrBuilder.StrBuilderWriter localStrBuilderWriter = new org/apache/commons/lang/text/StrBuilder$StrBuilderWriter;
    localStrBuilderWriter.<init>(this);
    return localStrBuilderWriter;
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  public char charAt(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = length();
      if (paramInt < i) {}
    }
    else
    {
      StringIndexOutOfBoundsException localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
      localStringIndexOutOfBoundsException.<init>(paramInt);
      throw localStringIndexOutOfBoundsException;
    }
    return this.buffer[paramInt];
  }
  
  public StrBuilder clear()
  {
    this.size = 0;
    return this;
  }
  
  public boolean contains(char paramChar)
  {
    char[] arrayOfChar = this.buffer;
    int i = 0;
    char c = this.size;
    if (i < c)
    {
      c = arrayOfChar[i];
      if (c != paramChar) {}
    }
    for (c = '\001';; c = '\000')
    {
      return c;
      i += 1;
      break;
    }
  }
  
  public boolean contains(String paramString)
  {
    boolean bool = false;
    int i = indexOf(paramString, 0);
    if (i >= 0) {
      bool = true;
    }
    return bool;
  }
  
  public boolean contains(StrMatcher paramStrMatcher)
  {
    boolean bool = false;
    int i = indexOf(paramStrMatcher, 0);
    if (i >= 0) {
      bool = true;
    }
    return bool;
  }
  
  public StrBuilder delete(int paramInt1, int paramInt2)
  {
    paramInt2 = validateRange(paramInt1, paramInt2);
    int i = paramInt2 - paramInt1;
    if (i > 0) {
      deleteImpl(paramInt1, paramInt2, i);
    }
    return this;
  }
  
  public StrBuilder deleteAll(char paramChar)
  {
    char c1 = '\000';
    for (;;)
    {
      char c2 = this.size;
      if (c1 >= c2) {
        break;
      }
      char[] arrayOfChar = this.buffer;
      c2 = arrayOfChar[c1];
      if (c2 == paramChar)
      {
        char c3 = c1;
        do
        {
          c1 += '\001';
          c2 = this.size;
          if (c1 >= c2) {
            break;
          }
          arrayOfChar = this.buffer;
          c2 = arrayOfChar[c1];
        } while (c2 == paramChar);
        char c4 = c1 - c3;
        deleteImpl(c3, c1, c4);
        c1 -= c4;
      }
      c1 += '\001';
    }
    return this;
  }
  
  public StrBuilder deleteAll(String paramString)
  {
    int i = 0;
    if (paramString == null) {}
    for (int j = 0; j > 0; j = paramString.length()) {
      for (int k = indexOf(paramString, 0); k >= 0; k = indexOf(paramString, k))
      {
        i = k + j;
        deleteImpl(k, i, j);
      }
    }
    return this;
  }
  
  public StrBuilder deleteAll(StrMatcher paramStrMatcher)
  {
    int i = this.size;
    return replace(paramStrMatcher, null, 0, i, -1);
  }
  
  public StrBuilder deleteCharAt(int paramInt)
  {
    if (paramInt >= 0)
    {
      i = this.size;
      if (paramInt < i) {}
    }
    else
    {
      StringIndexOutOfBoundsException localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
      localStringIndexOutOfBoundsException.<init>(paramInt);
      throw localStringIndexOutOfBoundsException;
    }
    int i = paramInt + 1;
    deleteImpl(paramInt, i, 1);
    return this;
  }
  
  public StrBuilder deleteFirst(char paramChar)
  {
    int i = 0;
    for (;;)
    {
      char c = this.size;
      if (i < c)
      {
        char[] arrayOfChar = this.buffer;
        c = arrayOfChar[i];
        if (c == paramChar)
        {
          c = i + 1;
          int j = 1;
          deleteImpl(i, c, j);
        }
      }
      else
      {
        return this;
      }
      i += 1;
    }
  }
  
  public StrBuilder deleteFirst(String paramString)
  {
    int i = 0;
    if (paramString == null) {}
    for (int j = 0;; j = paramString.length())
    {
      if (j > 0)
      {
        int k = indexOf(paramString, 0);
        if (k >= 0)
        {
          i = k + j;
          deleteImpl(k, i, j);
        }
      }
      return this;
    }
  }
  
  public StrBuilder deleteFirst(StrMatcher paramStrMatcher)
  {
    int i = this.size;
    return replace(paramStrMatcher, null, 0, i, 1);
  }
  
  public boolean endsWith(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool2;
      int i = paramString.length();
      if (i == 0)
      {
        bool2 = bool1;
      }
      else
      {
        int j = this.size;
        if (i <= j)
        {
          j = this.size;
          int k = j - i;
          int m = 0;
          for (;;)
          {
            if (m >= i) {
              break label105;
            }
            char[] arrayOfChar = this.buffer;
            j = arrayOfChar[k];
            int n = paramString.charAt(m);
            if (j != n) {
              break;
            }
            m += 1;
            k += 1;
          }
          label105:
          bool2 = bool1;
        }
      }
    }
  }
  
  public StrBuilder ensureCapacity(int paramInt)
  {
    char[] arrayOfChar1 = this.buffer;
    int i = arrayOfChar1.length;
    if (paramInt > i)
    {
      char[] arrayOfChar2 = this.buffer;
      i = paramInt * 2;
      arrayOfChar1 = new char[i];
      this.buffer = arrayOfChar1;
      arrayOfChar1 = this.buffer;
      int j = this.size;
      System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, j);
    }
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof StrBuilder;
    if (bool) {
      paramObject = (StrBuilder)paramObject;
    }
    for (bool = equals((StrBuilder)paramObject);; bool = false) {
      return bool;
    }
  }
  
  public boolean equals(StrBuilder paramStrBuilder)
  {
    boolean bool = true;
    if (this == paramStrBuilder) {}
    label89:
    for (;;)
    {
      return bool;
      int i = this.size;
      int j = paramStrBuilder.size;
      if (i != j)
      {
        bool = false;
      }
      else
      {
        char[] arrayOfChar1 = this.buffer;
        char[] arrayOfChar2 = paramStrBuilder.buffer;
        i = this.size;
        int k = i + -1;
        for (;;)
        {
          if (k < 0) {
            break label89;
          }
          i = arrayOfChar1[k];
          j = arrayOfChar2[k];
          if (i != j)
          {
            bool = false;
            break;
          }
          k += -1;
        }
      }
    }
  }
  
  public boolean equalsIgnoreCase(StrBuilder paramStrBuilder)
  {
    boolean bool = true;
    if (this == paramStrBuilder) {}
    label110:
    for (;;)
    {
      return bool;
      int i = this.size;
      int j = paramStrBuilder.size;
      if (i != j)
      {
        bool = false;
      }
      else
      {
        char[] arrayOfChar1 = this.buffer;
        char[] arrayOfChar2 = paramStrBuilder.buffer;
        i = this.size;
        int k = i + -1;
        for (;;)
        {
          if (k < 0) {
            break label110;
          }
          char c1 = arrayOfChar1[k];
          char c2 = arrayOfChar2[k];
          if (c1 != c2)
          {
            i = Character.toUpperCase(c1);
            j = Character.toUpperCase(c2);
            if (i != j)
            {
              bool = false;
              break;
            }
          }
          k += -1;
        }
      }
    }
  }
  
  public void getChars(int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    if (paramInt1 < 0)
    {
      localObject = new java/lang/StringIndexOutOfBoundsException;
      ((StringIndexOutOfBoundsException)localObject).<init>(paramInt1);
      throw ((Throwable)localObject);
    }
    if (paramInt2 >= 0)
    {
      int i = length();
      if (paramInt2 <= i) {}
    }
    else
    {
      localObject = new java/lang/StringIndexOutOfBoundsException;
      ((StringIndexOutOfBoundsException)localObject).<init>(paramInt2);
      throw ((Throwable)localObject);
    }
    if (paramInt1 > paramInt2)
    {
      localObject = new java/lang/StringIndexOutOfBoundsException;
      ((StringIndexOutOfBoundsException)localObject).<init>("end < start");
      throw ((Throwable)localObject);
    }
    Object localObject = this.buffer;
    int j = paramInt2 - paramInt1;
    System.arraycopy(localObject, paramInt1, paramArrayOfChar, paramInt3, j);
  }
  
  public char[] getChars(char[] paramArrayOfChar)
  {
    int i = length();
    if (paramArrayOfChar != null)
    {
      int j = paramArrayOfChar.length;
      if (j >= i) {}
    }
    else
    {
      paramArrayOfChar = new char[i];
    }
    System.arraycopy(this.buffer, 0, paramArrayOfChar, 0, i);
    return paramArrayOfChar;
  }
  
  public String getNewLineText()
  {
    return this.newLine;
  }
  
  public String getNullText()
  {
    return this.nullText;
  }
  
  public int hashCode()
  {
    char[] arrayOfChar = this.buffer;
    int i = 0;
    int j = this.size;
    int k = j + -1;
    while (k >= 0)
    {
      j = i * 31;
      int m = arrayOfChar[k];
      i = j + m;
      k += -1;
    }
    return i;
  }
  
  public int indexOf(char paramChar)
  {
    return indexOf(paramChar, 0);
  }
  
  public int indexOf(char paramChar, int paramInt)
  {
    int i = -1;
    if (paramInt < 0) {
      paramInt = 0;
    }
    int j = this.size;
    int k;
    if (paramInt >= j) {
      k = i;
    }
    for (;;)
    {
      return k;
      char[] arrayOfChar = this.buffer;
      k = paramInt;
      for (;;)
      {
        j = this.size;
        if (k >= j) {
          break label70;
        }
        j = arrayOfChar[k];
        if (j == paramChar) {
          break;
        }
        k += 1;
      }
      label70:
      k = i;
    }
  }
  
  public int indexOf(String paramString)
  {
    return indexOf(paramString, 0);
  }
  
  public int indexOf(String paramString, int paramInt)
  {
    int i = 0;
    int j = -1;
    if (paramInt < 0) {
      paramInt = 0;
    }
    int k;
    if (paramString != null)
    {
      k = this.size;
      if (paramInt < k) {}
    }
    else
    {
      paramInt = j;
    }
    for (;;)
    {
      return paramInt;
      int m = paramString.length();
      k = 1;
      if (m == k)
      {
        j = paramString.charAt(0);
        paramInt = indexOf(j, paramInt);
      }
      else if (m != 0)
      {
        i = this.size;
        if (m > i)
        {
          paramInt = j;
        }
        else
        {
          char[] arrayOfChar = this.buffer;
          i = this.size - m;
          int n = i + 1;
          int i1 = paramInt;
          if (i1 < n)
          {
            int i2 = 0;
            for (;;)
            {
              if (i2 >= m) {
                break label172;
              }
              i = paramString.charAt(i2);
              k = i1 + i2;
              k = arrayOfChar[k];
              if (i != k)
              {
                i1 += 1;
                break;
              }
              i2 += 1;
            }
            label172:
            paramInt = i1;
          }
          else
          {
            paramInt = j;
          }
        }
      }
    }
  }
  
  public int indexOf(StrMatcher paramStrMatcher)
  {
    return indexOf(paramStrMatcher, 0);
  }
  
  public int indexOf(StrMatcher paramStrMatcher, int paramInt)
  {
    int i = -1;
    if (paramInt < 0) {
      paramInt = 0;
    }
    int j;
    int k;
    if (paramStrMatcher != null)
    {
      j = this.size;
      if (paramInt < j) {}
    }
    else
    {
      k = i;
    }
    for (;;)
    {
      return k;
      int m = this.size;
      char[] arrayOfChar = this.buffer;
      k = paramInt;
      for (;;)
      {
        if (k >= m) {
          break label79;
        }
        j = paramStrMatcher.isMatch(arrayOfChar, k, paramInt, m);
        if (j > 0) {
          break;
        }
        k += 1;
      }
      label79:
      k = i;
    }
  }
  
  public StrBuilder insert(int paramInt, char paramChar)
  {
    validateIndex(paramInt);
    int i = this.size + 1;
    ensureCapacity(i);
    char[] arrayOfChar1 = this.buffer;
    char[] arrayOfChar2 = this.buffer;
    int j = paramInt + 1;
    int k = this.size - paramInt;
    System.arraycopy(arrayOfChar1, paramInt, arrayOfChar2, j, k);
    this.buffer[paramInt] = paramChar;
    i = this.size + 1;
    this.size = i;
    return this;
  }
  
  public StrBuilder insert(int paramInt, double paramDouble)
  {
    String str = String.valueOf(paramDouble);
    return insert(paramInt, str);
  }
  
  public StrBuilder insert(int paramInt, float paramFloat)
  {
    String str = String.valueOf(paramFloat);
    return insert(paramInt, str);
  }
  
  public StrBuilder insert(int paramInt1, int paramInt2)
  {
    String str = String.valueOf(paramInt2);
    return insert(paramInt1, str);
  }
  
  public StrBuilder insert(int paramInt, long paramLong)
  {
    String str = String.valueOf(paramLong);
    return insert(paramInt, str);
  }
  
  public StrBuilder insert(int paramInt, Object paramObject)
  {
    if (paramObject == null) {
      localObject = this.nullText;
    }
    for (Object localObject = insert(paramInt, (String)localObject);; localObject = insert(paramInt, (String)localObject))
    {
      return (StrBuilder)localObject;
      localObject = paramObject.toString();
    }
  }
  
  public StrBuilder insert(int paramInt, String paramString)
  {
    validateIndex(paramInt);
    if (paramString == null) {
      paramString = this.nullText;
    }
    if (paramString == null) {}
    for (int i = 0;; i = paramString.length())
    {
      if (i > 0)
      {
        int j = this.size;
        int k = j + i;
        ensureCapacity(k);
        char[] arrayOfChar1 = this.buffer;
        char[] arrayOfChar2 = this.buffer;
        int m = paramInt + i;
        int n = this.size - paramInt;
        System.arraycopy(arrayOfChar1, paramInt, arrayOfChar2, m, n);
        this.size = k;
        arrayOfChar1 = this.buffer;
        paramString.getChars(0, i, arrayOfChar1, paramInt);
      }
      return this;
    }
  }
  
  public StrBuilder insert(int paramInt, boolean paramBoolean)
  {
    int i = 101;
    validateIndex(paramInt);
    int j;
    char[] arrayOfChar1;
    char[] arrayOfChar2;
    int k;
    int m;
    int n;
    int i1;
    if (paramBoolean)
    {
      j = this.size + 4;
      ensureCapacity(j);
      arrayOfChar1 = this.buffer;
      arrayOfChar2 = this.buffer;
      k = paramInt + 4;
      m = this.size - paramInt;
      System.arraycopy(arrayOfChar1, paramInt, arrayOfChar2, k, m);
      arrayOfChar1 = this.buffer;
      n = paramInt + 1;
      arrayOfChar1[paramInt] = 't';
      arrayOfChar1 = this.buffer;
      paramInt = n + 1;
      arrayOfChar1[n] = 'r';
      arrayOfChar1 = this.buffer;
      n = paramInt + 1;
      i1 = 117;
      arrayOfChar1[paramInt] = i1;
      arrayOfChar1 = this.buffer;
      arrayOfChar1[n] = i;
      j = this.size + 4;
      this.size = j;
      paramInt = n;
    }
    for (;;)
    {
      return this;
      j = this.size + 5;
      ensureCapacity(j);
      arrayOfChar1 = this.buffer;
      arrayOfChar2 = this.buffer;
      k = paramInt + 5;
      m = this.size - paramInt;
      System.arraycopy(arrayOfChar1, paramInt, arrayOfChar2, k, m);
      arrayOfChar1 = this.buffer;
      n = paramInt + 1;
      arrayOfChar1[paramInt] = 'f';
      arrayOfChar1 = this.buffer;
      paramInt = n + 1;
      arrayOfChar1[n] = 'a';
      arrayOfChar1 = this.buffer;
      n = paramInt + 1;
      arrayOfChar1[paramInt] = 'l';
      arrayOfChar1 = this.buffer;
      paramInt = n + 1;
      i1 = 115;
      arrayOfChar1[n] = i1;
      arrayOfChar1 = this.buffer;
      arrayOfChar1[paramInt] = i;
      j = this.size + 5;
      this.size = j;
    }
  }
  
  public StrBuilder insert(int paramInt, char[] paramArrayOfChar)
  {
    validateIndex(paramInt);
    Object localObject;
    if (paramArrayOfChar == null)
    {
      localObject = this.nullText;
      this = insert(paramInt, (String)localObject);
    }
    for (;;)
    {
      return this;
      int i = paramArrayOfChar.length;
      if (i > 0)
      {
        int j = this.size + i;
        ensureCapacity(j);
        localObject = this.buffer;
        char[] arrayOfChar = this.buffer;
        int k = paramInt + i;
        int m = this.size - paramInt;
        System.arraycopy(localObject, paramInt, arrayOfChar, k, m);
        localObject = null;
        arrayOfChar = this.buffer;
        System.arraycopy(paramArrayOfChar, 0, arrayOfChar, paramInt, i);
        j = this.size + i;
        this.size = j;
      }
    }
  }
  
  public StrBuilder insert(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    validateIndex(paramInt1);
    Object localObject1;
    if (paramArrayOfChar == null)
    {
      localObject1 = this.nullText;
      this = insert(paramInt1, (String)localObject1);
    }
    for (;;)
    {
      return this;
      int i;
      Object localObject2;
      if (paramInt2 >= 0)
      {
        i = paramArrayOfChar.length;
        if (paramInt2 <= i) {}
      }
      else
      {
        localObject1 = new java/lang/StringIndexOutOfBoundsException;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "Invalid offset: " + paramInt2;
        ((StringIndexOutOfBoundsException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      if (paramInt3 >= 0)
      {
        i = paramInt2 + paramInt3;
        int j = paramArrayOfChar.length;
        if (i <= j) {}
      }
      else
      {
        localObject1 = new java/lang/StringIndexOutOfBoundsException;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "Invalid length: " + paramInt3;
        ((StringIndexOutOfBoundsException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      if (paramInt3 > 0)
      {
        i = this.size + paramInt3;
        ensureCapacity(i);
        localObject1 = this.buffer;
        localObject2 = this.buffer;
        int k = paramInt1 + paramInt3;
        int m = this.size - paramInt1;
        System.arraycopy(localObject1, paramInt1, localObject2, k, m);
        localObject1 = this.buffer;
        System.arraycopy(paramArrayOfChar, paramInt2, localObject1, paramInt1, paramInt3);
        i = this.size + paramInt3;
        this.size = i;
      }
    }
  }
  
  public boolean isEmpty()
  {
    int i = this.size;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int lastIndexOf(char paramChar)
  {
    int i = this.size + -1;
    return lastIndexOf(paramChar, i);
  }
  
  public int lastIndexOf(char paramChar, int paramInt)
  {
    int i = -1;
    int j = this.size;
    if (paramInt >= j)
    {
      j = this.size;
      paramInt = j + -1;
    }
    int k;
    if (paramInt < 0) {
      k = i;
    }
    for (;;)
    {
      return k;
      k = paramInt;
      for (;;)
      {
        if (k < 0) {
          break label71;
        }
        char[] arrayOfChar = this.buffer;
        j = arrayOfChar[k];
        if (j == paramChar) {
          break;
        }
        k += -1;
      }
      label71:
      k = i;
    }
  }
  
  public int lastIndexOf(String paramString)
  {
    int i = this.size + -1;
    return lastIndexOf(paramString, i);
  }
  
  public int lastIndexOf(String paramString, int paramInt)
  {
    int i = -1;
    int j = this.size;
    if (paramInt >= j)
    {
      j = this.size;
      paramInt = j + -1;
    }
    int k;
    if ((paramString == null) || (paramInt < 0)) {
      k = i;
    }
    for (;;)
    {
      return k;
      int n = paramString.length();
      int m;
      if (n > 0)
      {
        j = this.size;
        if (n <= j)
        {
          j = 1;
          if (n == j)
          {
            i = paramString.charAt(0);
            m = lastIndexOf(i, paramInt);
            continue;
          }
          j = paramInt - n;
          m = j + 1;
          if (m < 0) {
            break label181;
          }
          int i1 = 0;
          for (;;)
          {
            if (i1 >= n) {
              break label168;
            }
            j = paramString.charAt(i1);
            char[] arrayOfChar = this.buffer;
            int i2 = m + i1;
            int i3 = arrayOfChar[i2];
            if (j != i3)
            {
              m += -1;
              break;
            }
            i1 += 1;
          }
          label168:
          continue;
        }
      }
      if (n == 0) {
        m = paramInt;
      } else {
        label181:
        m = i;
      }
    }
  }
  
  public int lastIndexOf(StrMatcher paramStrMatcher)
  {
    int i = this.size;
    return lastIndexOf(paramStrMatcher, i);
  }
  
  public int lastIndexOf(StrMatcher paramStrMatcher, int paramInt)
  {
    int i = -1;
    int j = this.size;
    if (paramInt >= j)
    {
      j = this.size;
      paramInt = j + -1;
    }
    int k;
    if ((paramStrMatcher == null) || (paramInt < 0)) {
      k = i;
    }
    for (;;)
    {
      return k;
      char[] arrayOfChar = this.buffer;
      int m = paramInt + 1;
      k = paramInt;
      for (;;)
      {
        if (k < 0) {
          break label85;
        }
        j = paramStrMatcher.isMatch(arrayOfChar, k, 0, m);
        if (j > 0) {
          break;
        }
        k += -1;
      }
      label85:
      k = i;
    }
  }
  
  public String leftString(int paramInt)
  {
    String str;
    if (paramInt <= 0) {
      str = "";
    }
    for (;;)
    {
      return str;
      int i = this.size;
      char[] arrayOfChar;
      if (paramInt >= i)
      {
        str = new java/lang/String;
        arrayOfChar = this.buffer;
        int j = this.size;
        str.<init>(arrayOfChar, 0, j);
      }
      else
      {
        str = new java/lang/String;
        arrayOfChar = this.buffer;
        str.<init>(arrayOfChar, 0, paramInt);
      }
    }
  }
  
  public int length()
  {
    return this.size;
  }
  
  public String midString(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    int i;
    String str;
    if (paramInt2 > 0)
    {
      i = this.size;
      if (paramInt1 < i) {}
    }
    else
    {
      str = "";
    }
    for (;;)
    {
      return str;
      i = this.size;
      int j = paramInt1 + paramInt2;
      char[] arrayOfChar;
      if (i <= j)
      {
        str = new java/lang/String;
        arrayOfChar = this.buffer;
        int k = this.size - paramInt1;
        str.<init>(arrayOfChar, paramInt1, k);
      }
      else
      {
        str = new java/lang/String;
        arrayOfChar = this.buffer;
        str.<init>(arrayOfChar, paramInt1, paramInt2);
      }
    }
  }
  
  public StrBuilder minimizeCapacity()
  {
    char[] arrayOfChar1 = this.buffer;
    int i = arrayOfChar1.length;
    int j = length();
    if (i > j)
    {
      char[] arrayOfChar2 = this.buffer;
      i = length();
      arrayOfChar1 = new char[i];
      this.buffer = arrayOfChar1;
      arrayOfChar1 = this.buffer;
      j = this.size;
      System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, j);
    }
    return this;
  }
  
  public StrBuilder replace(int paramInt1, int paramInt2, String paramString)
  {
    paramInt2 = validateRange(paramInt1, paramInt2);
    if (paramString == null) {}
    for (int i = 0;; i = paramString.length())
    {
      int j = paramInt2 - paramInt1;
      replaceImpl(paramInt1, paramInt2, j, paramString, i);
      return this;
    }
  }
  
  public StrBuilder replace(StrMatcher paramStrMatcher, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = validateRange(paramInt1, paramInt2);
    return replaceImpl(paramStrMatcher, paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public StrBuilder replaceAll(char paramChar1, char paramChar2)
  {
    if (paramChar1 != paramChar2)
    {
      int i = 0;
      for (;;)
      {
        char c = this.size;
        if (i >= c) {
          break;
        }
        char[] arrayOfChar = this.buffer;
        c = arrayOfChar[i];
        if (c == paramChar1)
        {
          arrayOfChar = this.buffer;
          arrayOfChar[i] = paramChar2;
        }
        i += 1;
      }
    }
    return this;
  }
  
  public StrBuilder replaceAll(String paramString1, String paramString2)
  {
    int i = 0;
    int j;
    if (paramString1 == null)
    {
      j = 0;
      if (j <= 0) {
        return this;
      }
      if (paramString2 != null) {
        break label80;
      }
    }
    label80:
    for (int k = 0;; k = paramString2.length())
    {
      for (int m = indexOf(paramString1, 0); m >= 0; m = indexOf(paramString1, i))
      {
        int n = m + j;
        replaceImpl(m, n, j, paramString2, k);
        i = m + k;
      }
      j = paramString1.length();
      break;
    }
    return this;
  }
  
  public StrBuilder replaceAll(StrMatcher paramStrMatcher, String paramString)
  {
    int i = this.size;
    return replace(paramStrMatcher, paramString, 0, i, -1);
  }
  
  public StrBuilder replaceFirst(char paramChar1, char paramChar2)
  {
    int i;
    if (paramChar1 != paramChar2) {
      i = 0;
    }
    for (;;)
    {
      char c = this.size;
      if (i < c)
      {
        char[] arrayOfChar = this.buffer;
        c = arrayOfChar[i];
        if (c == paramChar1)
        {
          arrayOfChar = this.buffer;
          arrayOfChar[i] = paramChar2;
        }
      }
      else
      {
        return this;
      }
      i += 1;
    }
  }
  
  public StrBuilder replaceFirst(String paramString1, String paramString2)
  {
    int i = 0;
    int j;
    int k;
    if (paramString1 == null)
    {
      j = 0;
      if (j > 0)
      {
        k = indexOf(paramString1, 0);
        if (k >= 0) {
          if (paramString2 != null) {
            break label61;
          }
        }
      }
    }
    for (;;)
    {
      int m = k + j;
      replaceImpl(k, m, j, paramString2, i);
      return this;
      j = paramString1.length();
      break;
      label61:
      i = paramString2.length();
    }
  }
  
  public StrBuilder replaceFirst(StrMatcher paramStrMatcher, String paramString)
  {
    int i = this.size;
    return replace(paramStrMatcher, paramString, 0, i, 1);
  }
  
  public StrBuilder reverse()
  {
    int i = this.size;
    if (i == 0) {}
    for (;;)
    {
      return this;
      int j = this.size / 2;
      char[] arrayOfChar = this.buffer;
      int k = 0;
      i = this.size;
      int m = i + -1;
      while (k < j)
      {
        int n = arrayOfChar[k];
        i = arrayOfChar[m];
        arrayOfChar[k] = i;
        arrayOfChar[m] = n;
        k += 1;
        m += -1;
      }
    }
  }
  
  public String rightString(int paramInt)
  {
    String str;
    if (paramInt <= 0) {
      str = "";
    }
    for (;;)
    {
      return str;
      int i = this.size;
      char[] arrayOfChar;
      int j;
      if (paramInt >= i)
      {
        str = new java/lang/String;
        arrayOfChar = this.buffer;
        j = 0;
        int k = this.size;
        str.<init>(arrayOfChar, 0, k);
      }
      else
      {
        str = new java/lang/String;
        arrayOfChar = this.buffer;
        j = this.size - paramInt;
        str.<init>(arrayOfChar, j, paramInt);
      }
    }
  }
  
  public StrBuilder setCharAt(int paramInt, char paramChar)
  {
    if (paramInt >= 0)
    {
      int i = length();
      if (paramInt < i) {}
    }
    else
    {
      StringIndexOutOfBoundsException localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
      localStringIndexOutOfBoundsException.<init>(paramInt);
      throw localStringIndexOutOfBoundsException;
    }
    this.buffer[paramInt] = paramChar;
    return this;
  }
  
  public StrBuilder setLength(int paramInt)
  {
    Object localObject;
    if (paramInt < 0)
    {
      localObject = new java/lang/StringIndexOutOfBoundsException;
      ((StringIndexOutOfBoundsException)localObject).<init>(paramInt);
      throw ((Throwable)localObject);
    }
    int i = this.size;
    if (paramInt < i) {
      this.size = paramInt;
    }
    for (;;)
    {
      return this;
      i = this.size;
      if (paramInt > i)
      {
        ensureCapacity(paramInt);
        int j = this.size;
        int k = paramInt;
        this.size = paramInt;
        int m = j;
        while (m < k)
        {
          localObject = this.buffer;
          localObject[m] = 0;
          m += 1;
        }
      }
    }
  }
  
  public StrBuilder setNewLineText(String paramString)
  {
    this.newLine = paramString;
    return this;
  }
  
  public StrBuilder setNullText(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i == 0) {
        paramString = null;
      }
    }
    this.nullText = paramString;
    return this;
  }
  
  public int size()
  {
    return this.size;
  }
  
  public boolean startsWith(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool2;
      int i = paramString.length();
      if (i == 0)
      {
        bool2 = bool1;
      }
      else
      {
        int j = this.size;
        if (i <= j)
        {
          int k = 0;
          for (;;)
          {
            if (k >= i) {
              break label86;
            }
            char[] arrayOfChar = this.buffer;
            j = arrayOfChar[k];
            int m = paramString.charAt(k);
            if (j != m) {
              break;
            }
            k += 1;
          }
          label86:
          bool2 = bool1;
        }
      }
    }
  }
  
  public String substring(int paramInt)
  {
    int i = this.size;
    return substring(paramInt, i);
  }
  
  public String substring(int paramInt1, int paramInt2)
  {
    paramInt2 = validateRange(paramInt1, paramInt2);
    String str = new java/lang/String;
    char[] arrayOfChar = this.buffer;
    int i = paramInt2 - paramInt1;
    str.<init>(arrayOfChar, paramInt1, i);
    return str;
  }
  
  public char[] toCharArray()
  {
    int i = this.size;
    char[] arrayOfChar1;
    if (i == 0) {
      arrayOfChar1 = ArrayUtils.EMPTY_CHAR_ARRAY;
    }
    for (;;)
    {
      return arrayOfChar1;
      i = this.size;
      arrayOfChar1 = new char[i];
      char[] arrayOfChar2 = this.buffer;
      int j = this.size;
      System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, j);
    }
  }
  
  public char[] toCharArray(int paramInt1, int paramInt2)
  {
    paramInt2 = validateRange(paramInt1, paramInt2);
    int i = paramInt2 - paramInt1;
    char[] arrayOfChar1;
    if (i == 0) {
      arrayOfChar1 = ArrayUtils.EMPTY_CHAR_ARRAY;
    }
    for (;;)
    {
      return arrayOfChar1;
      arrayOfChar1 = new char[i];
      char[] arrayOfChar2 = this.buffer;
      System.arraycopy(arrayOfChar2, paramInt1, arrayOfChar1, 0, i);
    }
  }
  
  public String toString()
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.buffer;
    int i = this.size;
    str.<init>(arrayOfChar, 0, i);
    return str;
  }
  
  public StringBuffer toStringBuffer()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int i = this.size;
    localStringBuffer.<init>(i);
    char[] arrayOfChar = this.buffer;
    int j = this.size;
    return localStringBuffer.append(arrayOfChar, 0, j);
  }
  
  public StrBuilder trim()
  {
    int i = 32;
    int j = this.size;
    if (j == 0) {}
    for (;;)
    {
      return this;
      int k = this.size;
      char[] arrayOfChar = this.buffer;
      int m = 0;
      while (m < k)
      {
        j = arrayOfChar[m];
        if (j > i) {
          break;
        }
        m += 1;
      }
      while (m < k)
      {
        j = k + -1;
        j = arrayOfChar[j];
        if (j > i) {
          break;
        }
        k += -1;
      }
      j = this.size;
      if (k < j)
      {
        j = this.size;
        delete(k, j);
      }
      if (m > 0)
      {
        j = 0;
        delete(0, m);
      }
    }
  }
  
  protected void validateIndex(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = this.size;
      if (paramInt <= i) {}
    }
    else
    {
      StringIndexOutOfBoundsException localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
      localStringIndexOutOfBoundsException.<init>(paramInt);
      throw localStringIndexOutOfBoundsException;
    }
  }
  
  protected int validateRange(int paramInt1, int paramInt2)
  {
    StringIndexOutOfBoundsException localStringIndexOutOfBoundsException;
    if (paramInt1 < 0)
    {
      localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
      localStringIndexOutOfBoundsException.<init>(paramInt1);
      throw localStringIndexOutOfBoundsException;
    }
    int i = this.size;
    if (paramInt2 > i) {
      paramInt2 = this.size;
    }
    if (paramInt1 > paramInt2)
    {
      localStringIndexOutOfBoundsException = new java/lang/StringIndexOutOfBoundsException;
      localStringIndexOutOfBoundsException.<init>("end < start");
      throw localStringIndexOutOfBoundsException;
    }
    return paramInt2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */