package org.apache.commons.lang;

import java.io.UnsupportedEncodingException;

public class CharEncoding
{
  public static final String ISO_8859_1 = "ISO-8859-1";
  public static final String US_ASCII = "US-ASCII";
  public static final String UTF_16 = "UTF-16";
  public static final String UTF_16BE = "UTF-16BE";
  public static final String UTF_16LE = "UTF-16LE";
  public static final String UTF_8 = "UTF-8";
  
  public static boolean isSupported(String paramString)
  {
    boolean bool = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool;
      try
      {
        String str = new java/lang/String;
        byte[] arrayOfByte = ArrayUtils.EMPTY_BYTE_ARRAY;
        str.<init>(arrayOfByte, paramString);
        bool = true;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/CharEncoding.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */