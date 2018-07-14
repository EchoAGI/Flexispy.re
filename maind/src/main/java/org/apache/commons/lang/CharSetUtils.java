package org.apache.commons.lang;

public class CharSetUtils
{
  public static int count(String paramString1, String paramString2)
  {
    int i = 0;
    boolean bool = StringUtils.isEmpty(paramString1);
    if (!bool)
    {
      bool = StringUtils.isEmpty(paramString2);
      if (!bool) {
        break label22;
      }
    }
    for (;;)
    {
      return i;
      label22:
      bool = true;
      String[] arrayOfString = new String[bool];
      arrayOfString[0] = paramString2;
      i = count(paramString1, arrayOfString);
    }
  }
  
  public static int count(String paramString, String[] paramArrayOfString)
  {
    boolean bool1 = StringUtils.isEmpty(paramString);
    int i;
    if (!bool1)
    {
      bool1 = ArrayUtils.isEmpty(paramArrayOfString);
      if (!bool1) {}
    }
    else
    {
      i = 0;
    }
    for (;;)
    {
      return i;
      CharSet localCharSet = CharSet.getInstance(paramArrayOfString);
      i = 0;
      char[] arrayOfChar = paramString.toCharArray();
      int j = arrayOfChar.length;
      int k = 0;
      while (k < j)
      {
        char c = arrayOfChar[k];
        boolean bool2 = localCharSet.contains(c);
        if (bool2) {
          i += 1;
        }
        k += 1;
      }
    }
  }
  
  public static String delete(String paramString1, String paramString2)
  {
    boolean bool = StringUtils.isEmpty(paramString1);
    if (!bool)
    {
      bool = StringUtils.isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      String[] arrayOfString = new String[1];
      bool = false;
      arrayOfString[0] = paramString2;
      paramString1 = delete(paramString1, arrayOfString);
    }
  }
  
  public static String delete(String paramString, String[] paramArrayOfString)
  {
    boolean bool = StringUtils.isEmpty(paramString);
    if (!bool)
    {
      bool = ArrayUtils.isEmpty(paramArrayOfString);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString;
      label20:
      bool = false;
      paramString = modify(paramString, paramArrayOfString, false);
    }
  }
  
  public static CharSet evaluateSet(String[] paramArrayOfString)
  {
    CharSet localCharSet;
    if (paramArrayOfString == null) {
      localCharSet = null;
    }
    for (;;)
    {
      return localCharSet;
      localCharSet = new org/apache/commons/lang/CharSet;
      localCharSet.<init>(paramArrayOfString);
    }
  }
  
  public static String keep(String paramString1, String paramString2)
  {
    int i;
    String str;
    if (paramString1 == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return str;
      i = paramString1.length();
      if (i != 0)
      {
        bool = StringUtils.isEmpty(paramString2);
        if (!bool) {}
      }
      else
      {
        str = "";
        continue;
      }
      String[] arrayOfString = new String[1];
      boolean bool = false;
      arrayOfString[0] = paramString2;
      str = keep(paramString1, arrayOfString);
    }
  }
  
  public static String keep(String paramString, String[] paramArrayOfString)
  {
    int i;
    String str;
    if (paramString == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return str;
      i = paramString.length();
      if (i != 0)
      {
        bool = ArrayUtils.isEmpty(paramArrayOfString);
        if (!bool) {}
      }
      else
      {
        str = "";
        continue;
      }
      boolean bool = true;
      str = modify(paramString, paramArrayOfString, bool);
    }
  }
  
  private static String modify(String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    CharSet localCharSet = CharSet.getInstance(paramArrayOfString);
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int i = paramString.length();
    localStringBuffer.<init>(i);
    char[] arrayOfChar = paramString.toCharArray();
    int j = arrayOfChar.length;
    int k = 0;
    while (k < j)
    {
      i = arrayOfChar[k];
      boolean bool = localCharSet.contains(i);
      if (bool == paramBoolean)
      {
        char c = arrayOfChar[k];
        localStringBuffer.append(c);
      }
      k += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static String squeeze(String paramString1, String paramString2)
  {
    boolean bool = StringUtils.isEmpty(paramString1);
    if (!bool)
    {
      bool = StringUtils.isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      String[] arrayOfString = new String[1];
      bool = false;
      arrayOfString[0] = paramString2;
      paramString1 = squeeze(paramString1, arrayOfString);
    }
  }
  
  public static String squeeze(String paramString, String[] paramArrayOfString)
  {
    boolean bool1 = StringUtils.isEmpty(paramString);
    if (!bool1)
    {
      bool1 = ArrayUtils.isEmpty(paramArrayOfString);
      if (!bool1) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString;
      label20:
      CharSet localCharSet = CharSet.getInstance(paramArrayOfString);
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      int i = paramString.length();
      localStringBuffer.<init>(i);
      char[] arrayOfChar = paramString.toCharArray();
      int j = arrayOfChar.length;
      char c1 = ' ';
      char c2 = ' ';
      int k = 0;
      if (k < j)
      {
        c2 = arrayOfChar[k];
        boolean bool2 = localCharSet.contains(c2);
        if ((bool2) && (c2 == c1) && (k != 0)) {}
        for (;;)
        {
          k += 1;
          break;
          localStringBuffer.append(c2);
          c1 = c2;
        }
      }
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String translate(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = StringUtils.isEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return paramString1;
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      int i = paramString1.length();
      localStringBuffer.<init>(i);
      char[] arrayOfChar1 = paramString1.toCharArray();
      char[] arrayOfChar2 = paramString3.toCharArray();
      int j = arrayOfChar1.length;
      i = paramString3.length();
      int k = i + -1;
      int m = 0;
      if (m < j)
      {
        i = arrayOfChar1[m];
        int n = paramString2.indexOf(i);
        i = -1;
        if (n != i)
        {
          if (n > k) {
            n = k;
          }
          i = arrayOfChar2[n];
          localStringBuffer.append(i);
        }
        for (;;)
        {
          m += 1;
          break;
          char c = arrayOfChar1[m];
          localStringBuffer.append(c);
        }
      }
      paramString1 = localStringBuffer.toString();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/CharSetUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */