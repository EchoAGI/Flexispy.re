package org.apache.commons.lang.text;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.Validate;

public class ExtendedMessageFormat
  extends MessageFormat
{
  private static final String DUMMY_PATTERN = "";
  private static final char END_FE = '}';
  private static final String ESCAPED_QUOTE = "''";
  private static final char QUOTE = '\'';
  private static final char START_FE = '{';
  private static final char START_FMT = ',';
  private static final long serialVersionUID = -2362048321261811743L;
  private final Map registry;
  private String toPattern;
  
  public ExtendedMessageFormat(String paramString)
  {
    this(paramString, localLocale);
  }
  
  public ExtendedMessageFormat(String paramString, Locale paramLocale)
  {
    this(paramString, paramLocale, null);
  }
  
  public ExtendedMessageFormat(String paramString, Locale paramLocale, Map paramMap)
  {
    super("");
    setLocale(paramLocale);
    this.registry = paramMap;
    applyPattern(paramString);
  }
  
  public ExtendedMessageFormat(String paramString, Map paramMap)
  {
    this(paramString, localLocale, paramMap);
  }
  
  private StringBuffer appendQuotedString(String paramString, ParsePosition paramParsePosition, StringBuffer paramStringBuffer, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    char c1 = '\'';
    int j = paramParsePosition.getIndex();
    char[] arrayOfChar = paramString.toCharArray();
    if (paramBoolean)
    {
      char c2 = arrayOfChar[j];
      if (c2 == c1)
      {
        next(paramParsePosition);
        if (paramStringBuffer != null) {}
      }
    }
    for (;;)
    {
      return (StringBuffer)localObject1;
      localObject1 = paramStringBuffer.append(c1);
      continue;
      int n = j;
      int i1 = paramParsePosition.getIndex();
      int k = paramString.length();
      if (i1 >= k) {
        break;
      }
      int m;
      if (paramBoolean)
      {
        localObject2 = paramString.substring(i1);
        String str = "''";
        boolean bool = ((String)localObject2).startsWith(str);
        if (bool)
        {
          m = paramParsePosition.getIndex() - n;
          paramStringBuffer.append(arrayOfChar, n, m).append(c1);
          localObject2 = "''";
          m = ((String)localObject2).length() + i1;
          paramParsePosition.setIndex(m);
          n = paramParsePosition.getIndex();
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        m = paramParsePosition.getIndex();
        m = arrayOfChar[m];
        switch (m)
        {
        default: 
          next(paramParsePosition);
        }
      }
      next(paramParsePosition);
      if (paramStringBuffer != null)
      {
        i = paramParsePosition.getIndex() - n;
        localObject1 = paramStringBuffer.append(arrayOfChar, n, i);
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = "Unterminated quoted string at position " + j;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private boolean containsElements(Collection paramCollection)
  {
    boolean bool1 = false;
    if (paramCollection != null)
    {
      int i = paramCollection.size();
      if (i != 0) {
        break label19;
      }
    }
    for (;;)
    {
      return bool1;
      label19:
      Iterator localIterator = paramCollection.iterator();
      Object localObject;
      do
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = localIterator.next();
      } while (localObject == null);
      bool1 = true;
    }
  }
  
  private Format getFormat(String paramString)
  {
    Object localObject = this.registry;
    String str1;
    String str2;
    int i;
    FormatFactory localFormatFactory;
    if (localObject != null)
    {
      str1 = paramString;
      str2 = null;
      i = 44;
      int j = paramString.indexOf(i);
      if (j > 0)
      {
        str1 = paramString.substring(0, j).trim();
        i = j + 1;
        localObject = paramString.substring(i);
        str2 = ((String)localObject).trim();
      }
      localObject = this.registry;
      localFormatFactory = (FormatFactory)((Map)localObject).get(str1);
      if (localFormatFactory != null) {
        localObject = getLocale();
      }
    }
    for (localObject = localFormatFactory.getFormat(str1, str2, (Locale)localObject);; localObject = null)
    {
      return (Format)localObject;
      i = 0;
    }
  }
  
  private void getQuotedString(String paramString, ParsePosition paramParsePosition, boolean paramBoolean)
  {
    appendQuotedString(paramString, paramParsePosition, null, paramBoolean);
  }
  
  private String insertFormats(String paramString, ArrayList paramArrayList)
  {
    boolean bool = containsElements(paramArrayList);
    if (!bool) {}
    for (;;)
    {
      return paramString;
      StringBuffer localStringBuffer1 = new java/lang/StringBuffer;
      int i = paramString.length() * 2;
      localStringBuffer1.<init>(i);
      ParsePosition localParsePosition1 = new java/text/ParsePosition;
      localParsePosition1.<init>(0);
      int j = -1;
      int k = 0;
      i = localParsePosition1.getIndex();
      int n = paramString.length();
      if (i < n)
      {
        i = localParsePosition1.getIndex();
        char c2 = paramString.charAt(i);
        switch (c2)
        {
        }
        for (;;)
        {
          localStringBuffer1.append(c2);
          next(localParsePosition1);
          break;
          appendQuotedString(paramString, localParsePosition1, localStringBuffer1, false);
          break;
          k += 1;
          i = 1;
          if (k != i) {
            break;
          }
          j += 1;
          i = 123;
          StringBuffer localStringBuffer2 = localStringBuffer1.append(i);
          ParsePosition localParsePosition2 = next(localParsePosition1);
          int i1 = readArgumentIndex(paramString, localParsePosition2);
          localStringBuffer2.append(i1);
          String str = (String)paramArrayList.get(j);
          if (str == null) {
            break;
          }
          char c1 = ',';
          localStringBuffer2 = localStringBuffer1.append(c1);
          localStringBuffer2.append(str);
          break;
          int m;
          k += -1;
        }
      }
      paramString = localStringBuffer1.toString();
    }
  }
  
  private ParsePosition next(ParsePosition paramParsePosition)
  {
    int i = paramParsePosition.getIndex() + 1;
    paramParsePosition.setIndex(i);
    return paramParsePosition;
  }
  
  private String parseFormatDescription(String paramString, ParsePosition paramParsePosition)
  {
    int i = paramParsePosition.getIndex();
    seekNonWs(paramString, paramParsePosition);
    int j = paramParsePosition.getIndex();
    int k = 1;
    int m = paramParsePosition.getIndex();
    int n = paramString.length();
    if (m < n)
    {
      m = paramParsePosition.getIndex();
      m = paramString.charAt(m);
      switch (m)
      {
      }
      for (;;)
      {
        next(paramParsePosition);
        break;
        k += 1;
        continue;
        k += -1;
        if (k == 0)
        {
          m = paramParsePosition.getIndex();
          return paramString.substring(j, m);
          m = 0;
          localIllegalArgumentException = null;
          getQuotedString(paramString, paramParsePosition, false);
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>();
    localObject = "Unterminated format element at position " + i;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  private int readArgumentIndex(String paramString, ParsePosition paramParsePosition)
  {
    int i = 125;
    int j = 44;
    int k = paramParsePosition.getIndex();
    seekNonWs(paramString, paramParsePosition);
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int m = 0;
    while (m == 0)
    {
      int n = paramParsePosition.getIndex();
      int i2 = paramString.length();
      if (n < i2)
      {
        n = paramParsePosition.getIndex();
        int i3 = paramString.charAt(n);
        boolean bool1 = Character.isWhitespace(i3);
        int i1;
        if (bool1)
        {
          seekNonWs(paramString, paramParsePosition);
          i1 = paramParsePosition.getIndex();
          i3 = paramString.charAt(i1);
          if ((i3 != j) && (i3 != i))
          {
            m = 1;
            next(paramParsePosition);
            continue;
          }
        }
        if ((i3 == j) || (i3 == i))
        {
          i1 = localStringBuffer.length();
          if (i1 > 0) {
            try
            {
              String str1 = localStringBuffer.toString();
              return Integer.parseInt(str1);
            }
            catch (NumberFormatException localNumberFormatException) {}
          }
        }
        boolean bool2 = Character.isDigit(i3);
        if (!bool2) {}
        for (m = 1;; m = 0)
        {
          localStringBuffer.append(i3);
          break;
        }
      }
    }
    if (m != 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("Invalid format argument index at position ").append(k).append(": ");
      j = paramParsePosition.getIndex();
      String str2 = paramString.substring(k, j);
      localObject = str2;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>();
    localObject = "Unterminated format element at position " + k;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  private void seekNonWs(String paramString, ParsePosition paramParsePosition)
  {
    int i = 0;
    char[] arrayOfChar = paramString.toCharArray();
    int j;
    int k;
    do
    {
      StrMatcher localStrMatcher = StrMatcher.splitMatcher();
      j = paramParsePosition.getIndex();
      i = localStrMatcher.isMatch(arrayOfChar, j);
      k = paramParsePosition.getIndex() + i;
      paramParsePosition.setIndex(k);
      if (i <= 0) {
        break;
      }
      k = paramParsePosition.getIndex();
      j = paramString.length();
    } while (k < j);
  }
  
  public final void applyPattern(String paramString)
  {
    Object localObject1 = this;
    localObject1 = this.registry;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      super.applyPattern(paramString);
      localObject2 = super.toPattern();
      localObject1 = localObject2;
      this.toPattern = ((String)localObject2);
    }
    for (;;)
    {
      return;
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>();
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      int i = paramString.length();
      localStringBuffer.<init>(i);
      ParsePosition localParsePosition = new java/text/ParsePosition;
      i = 0;
      localObject2 = null;
      localObject1 = null;
      localParsePosition.<init>(0);
      char[] arrayOfChar = paramString.toCharArray();
      int i1 = 0;
      for (;;)
      {
        i = localParsePosition.getIndex();
        int i2 = paramString.length();
        if (i >= i2) {
          break;
        }
        i = localParsePosition.getIndex();
        i = arrayOfChar[i];
        switch (i)
        {
        default: 
          i = localParsePosition.getIndex();
          i = arrayOfChar[i];
          localStringBuffer.append(i);
          localObject1 = this;
          next(localParsePosition);
          break;
        case 39: 
          boolean bool1 = true;
          localObject1 = this;
          appendQuotedString(paramString, localParsePosition, localStringBuffer, bool1);
        }
      }
      i1 += 1;
      localObject1 = this;
      seekNonWs(paramString, localParsePosition);
      int i5 = localParsePosition.getIndex();
      localObject2 = next(localParsePosition);
      int i6 = readArgumentIndex(paramString, (ParsePosition)localObject2);
      localObject2 = localStringBuffer.append('{');
      localObject1 = localObject2;
      ((StringBuffer)localObject2).append(i6);
      localObject1 = this;
      seekNonWs(paramString, localParsePosition);
      Format localFormat1 = null;
      String str = null;
      int j = localParsePosition.getIndex();
      j = arrayOfChar[j];
      int i3 = 44;
      if (j == i3)
      {
        localObject2 = next(localParsePosition);
        str = parseFormatDescription(paramString, (ParsePosition)localObject2);
        localFormat1 = getFormat(str);
        if (localFormat1 == null)
        {
          j = 44;
          localObject2 = localStringBuffer.append(j);
          localObject1 = localObject2;
          ((StringBuffer)localObject2).append(str);
        }
      }
      localArrayList1.add(localFormat1);
      if (localFormat1 == null) {
        str = null;
      }
      localArrayList2.add(str);
      int k = localArrayList1.size();
      label398:
      int m;
      if (k == i1)
      {
        k = 1;
        Validate.isTrue(k);
        m = localArrayList2.size();
        if (m != i1) {
          break label504;
        }
        m = 1;
      }
      for (;;)
      {
        Validate.isTrue(m);
        int n = localParsePosition.getIndex();
        n = arrayOfChar[n];
        int i4 = 125;
        if (n == i4) {
          break;
        }
        localObject2 = new java/lang/IllegalArgumentException;
        Object localObject3 = new java/lang/StringBuffer;
        ((StringBuffer)localObject3).<init>();
        localObject3 = ((StringBuffer)localObject3).append("Unreadable format element at position ");
        localObject1 = localObject3;
        localObject3 = i5;
        ((IllegalArgumentException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
        n = 0;
        localObject2 = null;
        break label398;
        label504:
        n = 0;
        localObject2 = null;
      }
      localObject2 = localStringBuffer.toString();
      localObject1 = this;
      super.applyPattern((String)localObject2);
      localObject2 = super.toPattern();
      localObject2 = insertFormats((String)localObject2, localArrayList2);
      localObject1 = localObject2;
      this.toPattern = ((String)localObject2);
      localObject1 = this;
      boolean bool2 = containsElements(localArrayList1);
      if (bool2)
      {
        Format[] arrayOfFormat = getFormats();
        int i7 = 0;
        Iterator localIterator = localArrayList1.iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          Format localFormat2 = (Format)localIterator.next();
          if (localFormat2 != null) {
            arrayOfFormat[i7] = localFormat2;
          }
          i7 += 1;
        }
        localObject1 = this;
        super.setFormats(arrayOfFormat);
      }
    }
  }
  
  public void setFormat(int paramInt, Format paramFormat)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void setFormatByArgumentIndex(int paramInt, Format paramFormat)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void setFormats(Format[] paramArrayOfFormat)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void setFormatsByArgumentIndex(Format[] paramArrayOfFormat)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public String toPattern()
  {
    return this.toPattern;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/ExtendedMessageFormat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */