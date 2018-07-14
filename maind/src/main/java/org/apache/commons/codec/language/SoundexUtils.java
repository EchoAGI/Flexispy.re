package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.StringEncoder;

final class SoundexUtils
{
  static String clean(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0) {}
    }
    else
    {
      return paramString;
    }
    int k = paramString.length();
    char[] arrayOfChar = new char[k];
    int m = 0;
    int n = 0;
    int i1 = 0;
    label33:
    if (n < k)
    {
      boolean bool = Character.isLetter(paramString.charAt(n));
      if (!bool) {
        break label135;
      }
      m = i1 + 1;
      int j = paramString.charAt(n);
      arrayOfChar[i1] = j;
    }
    for (;;)
    {
      n += 1;
      i1 = m;
      break label33;
      if (i1 == k)
      {
        localObject = Locale.ENGLISH;
        paramString = paramString.toUpperCase((Locale)localObject);
        break;
      }
      Object localObject = new java/lang/String;
      ((String)localObject).<init>(arrayOfChar, 0, i1);
      Locale localLocale = Locale.ENGLISH;
      paramString = ((String)localObject).toUpperCase(localLocale);
      break;
      label135:
      m = i1;
    }
  }
  
  static int difference(StringEncoder paramStringEncoder, String paramString1, String paramString2)
  {
    String str1 = paramStringEncoder.encode(paramString1);
    String str2 = paramStringEncoder.encode(paramString2);
    return differenceEncoded(str1, str2);
  }
  
  static int differenceEncoded(String paramString1, String paramString2)
  {
    int i;
    if ((paramString1 == null) || (paramString2 == null)) {
      i = 0;
    }
    for (;;)
    {
      return i;
      int j = paramString1.length();
      int k = paramString2.length();
      int m = Math.min(j, k);
      i = 0;
      int n = 0;
      while (n < m)
      {
        j = paramString1.charAt(n);
        k = paramString2.charAt(n);
        if (j == k) {
          i += 1;
        }
        n += 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/language/SoundexUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */