package org.apache.commons.lang;

public class WordUtils
{
  public static String abbreviate(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    int i = -1;
    if (paramString1 == null) {
      j = 0;
    }
    for (String str = null;; str = "")
    {
      return str;
      j = paramString1.length();
      if (j != 0) {
        break;
      }
    }
    int j = paramString1.length();
    if (paramInt1 > j) {
      paramInt1 = paramString1.length();
    }
    if (paramInt2 != i)
    {
      j = paramString1.length();
      if (paramInt2 <= j) {}
    }
    else
    {
      paramInt2 = paramString1.length();
    }
    if (paramInt2 < paramInt1) {
      paramInt2 = paramInt1;
    }
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    str = " ";
    int k = StringUtils.indexOf(paramString1, str, paramInt1);
    if (k == i)
    {
      str = paramString1.substring(0, paramInt2);
      localStringBuffer.append(str);
      j = paramString1.length();
      if (paramInt2 != j)
      {
        str = StringUtils.defaultString(paramString2);
        localStringBuffer.append(str);
      }
    }
    for (;;)
    {
      str = localStringBuffer.toString();
      break;
      if (k > paramInt2)
      {
        str = paramString1.substring(0, paramInt2);
        localStringBuffer.append(str);
        str = StringUtils.defaultString(paramString2);
        localStringBuffer.append(str);
      }
      else
      {
        str = paramString1.substring(0, k);
        localStringBuffer.append(str);
        str = StringUtils.defaultString(paramString2);
        localStringBuffer.append(str);
      }
    }
  }
  
  public static String capitalize(String paramString)
  {
    return capitalize(paramString, null);
  }
  
  public static String capitalize(String paramString, char[] paramArrayOfChar)
  {
    int i;
    if (paramArrayOfChar == null)
    {
      i = -1;
      if (paramString != null)
      {
        int j = paramString.length();
        if ((j != 0) && (i != 0)) {
          break label31;
        }
      }
    }
    for (;;)
    {
      return paramString;
      i = paramArrayOfChar.length;
      break;
      label31:
      int k = paramString.length();
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(k);
      int m = 1;
      int n = 0;
      if (n < k)
      {
        char c2 = paramString.charAt(n);
        boolean bool = isDelimiter(c2, paramArrayOfChar);
        if (bool)
        {
          localStringBuffer.append(c2);
          m = 1;
        }
        for (;;)
        {
          n += 1;
          break;
          if (m != 0)
          {
            char c1 = Character.toTitleCase(c2);
            localStringBuffer.append(c1);
            m = 0;
          }
          else
          {
            localStringBuffer.append(c2);
          }
        }
      }
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String capitalizeFully(String paramString)
  {
    return capitalizeFully(paramString, null);
  }
  
  public static String capitalizeFully(String paramString, char[] paramArrayOfChar)
  {
    int i;
    if (paramArrayOfChar == null)
    {
      i = -1;
      if (paramString != null)
      {
        int j = paramString.length();
        if ((j != 0) && (i != 0)) {
          break label31;
        }
      }
    }
    for (;;)
    {
      return paramString;
      i = paramArrayOfChar.length;
      break;
      label31:
      paramString = capitalize(paramString.toLowerCase(), paramArrayOfChar);
    }
  }
  
  public static String initials(String paramString)
  {
    return initials(paramString, null);
  }
  
  public static String initials(String paramString, char[] paramArrayOfChar)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString;
      label15:
      if (paramArrayOfChar == null) {
        break;
      }
      i = paramArrayOfChar.length;
      if (i != 0) {
        break;
      }
      paramString = "";
    }
    int j = paramString.length();
    int i = j / 2 + 1;
    char[] arrayOfChar = new char[i];
    int k = 0;
    int m = 1;
    int n = 0;
    int i1 = 0;
    label60:
    char c;
    boolean bool;
    if (n < j)
    {
      c = paramString.charAt(n);
      bool = isDelimiter(c, paramArrayOfChar);
      if (bool)
      {
        m = 1;
        k = i1;
      }
    }
    for (;;)
    {
      n += 1;
      i1 = k;
      break label60;
      if (m != 0)
      {
        k = i1 + 1;
        arrayOfChar[i1] = c;
        m = 0;
        continue;
        paramString = new java/lang/String;
        bool = false;
        paramString.<init>(arrayOfChar, 0, i1);
        break;
      }
      k = i1;
    }
  }
  
  private static boolean isDelimiter(char paramChar, char[] paramArrayOfChar)
  {
    boolean bool;
    if (paramArrayOfChar == null) {
      bool = Character.isWhitespace(paramChar);
    }
    for (;;)
    {
      return bool;
      int i = 0;
      int j = paramArrayOfChar.length;
      for (;;)
      {
        if (i >= j) {
          break label44;
        }
        c = paramArrayOfChar[i];
        if (paramChar == c)
        {
          c = '\001';
          break;
        }
        i += 1;
      }
      label44:
      char c = '\000';
    }
  }
  
  public static String swapCase(String paramString)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString;
      label15:
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(i);
      boolean bool1 = true;
      char c1 = '\000';
      char c2 = '\000';
      int j = 0;
      if (j < i)
      {
        c1 = paramString.charAt(j);
        boolean bool2 = Character.isUpperCase(c1);
        if (bool2) {
          c2 = Character.toLowerCase(c1);
        }
        for (;;)
        {
          localStringBuffer.append(c2);
          bool1 = Character.isWhitespace(c1);
          j += 1;
          break;
          bool2 = Character.isTitleCase(c1);
          if (bool2)
          {
            c2 = Character.toLowerCase(c1);
          }
          else
          {
            bool2 = Character.isLowerCase(c1);
            if (bool2)
            {
              if (bool1) {
                c2 = Character.toTitleCase(c1);
              } else {
                c2 = Character.toUpperCase(c1);
              }
            }
            else {
              c2 = c1;
            }
          }
        }
      }
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String uncapitalize(String paramString)
  {
    return uncapitalize(paramString, null);
  }
  
  public static String uncapitalize(String paramString, char[] paramArrayOfChar)
  {
    int i;
    if (paramArrayOfChar == null)
    {
      i = -1;
      if (paramString != null)
      {
        int j = paramString.length();
        if ((j != 0) && (i != 0)) {
          break label31;
        }
      }
    }
    for (;;)
    {
      return paramString;
      i = paramArrayOfChar.length;
      break;
      label31:
      int k = paramString.length();
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(k);
      int m = 1;
      int n = 0;
      if (n < k)
      {
        char c2 = paramString.charAt(n);
        boolean bool = isDelimiter(c2, paramArrayOfChar);
        if (bool)
        {
          localStringBuffer.append(c2);
          m = 1;
        }
        for (;;)
        {
          n += 1;
          break;
          if (m != 0)
          {
            char c1 = Character.toLowerCase(c2);
            localStringBuffer.append(c1);
            m = 0;
          }
          else
          {
            localStringBuffer.append(c2);
          }
        }
      }
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String wrap(String paramString, int paramInt)
  {
    return wrap(paramString, paramInt, null, false);
  }
  
  public static String wrap(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    int i = 32;
    int j;
    if (paramString1 == null) {
      j = 0;
    }
    StringBuffer localStringBuffer;
    for (String str = null;; str = localStringBuffer.toString())
    {
      return str;
      if (paramString2 == null) {
        paramString2 = SystemUtils.LINE_SEPARATOR;
      }
      j = 1;
      if (paramInt < j) {
        paramInt = 1;
      }
      int k = paramString1.length();
      int m = 0;
      localStringBuffer = new java/lang/StringBuffer;
      j = k + 32;
      localStringBuffer.<init>(j);
      for (;;)
      {
        j = k - m;
        if (j <= paramInt) {
          break;
        }
        j = paramString1.charAt(m);
        if (j == i)
        {
          m += 1;
        }
        else
        {
          j = paramInt + m;
          int n = paramString1.lastIndexOf(i, j);
          if (n >= m)
          {
            str = paramString1.substring(m, n);
            localStringBuffer.append(str);
            localStringBuffer.append(paramString2);
            m = n + 1;
          }
          else if (paramBoolean)
          {
            j = paramInt + m;
            str = paramString1.substring(m, j);
            localStringBuffer.append(str);
            localStringBuffer.append(paramString2);
            m += paramInt;
          }
          else
          {
            j = paramInt + m;
            n = paramString1.indexOf(i, j);
            if (n >= 0)
            {
              str = paramString1.substring(m, n);
              localStringBuffer.append(str);
              localStringBuffer.append(paramString2);
              m = n + 1;
            }
            else
            {
              str = paramString1.substring(m);
              localStringBuffer.append(str);
              m = k;
            }
          }
        }
      }
      str = paramString1.substring(m);
      localStringBuffer.append(str);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/WordUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */