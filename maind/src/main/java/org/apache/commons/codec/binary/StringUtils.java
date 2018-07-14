package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;

public class StringUtils
{
  public static byte[] getBytesIso8859_1(String paramString)
  {
    return getBytesUnchecked(paramString, "ISO-8859-1");
  }
  
  public static byte[] getBytesUnchecked(String paramString1, String paramString2)
  {
    byte[] arrayOfByte;
    if (paramString1 == null) {
      arrayOfByte = null;
    }
    for (;;)
    {
      return arrayOfByte;
      try
      {
        arrayOfByte = paramString1.getBytes(paramString2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw newIllegalStateException(paramString2, localUnsupportedEncodingException);
      }
    }
  }
  
  public static byte[] getBytesUsAscii(String paramString)
  {
    return getBytesUnchecked(paramString, "US-ASCII");
  }
  
  public static byte[] getBytesUtf16(String paramString)
  {
    return getBytesUnchecked(paramString, "UTF-16");
  }
  
  public static byte[] getBytesUtf16Be(String paramString)
  {
    return getBytesUnchecked(paramString, "UTF-16BE");
  }
  
  public static byte[] getBytesUtf16Le(String paramString)
  {
    return getBytesUnchecked(paramString, "UTF-16LE");
  }
  
  public static byte[] getBytesUtf8(String paramString)
  {
    return getBytesUnchecked(paramString, "UTF-8");
  }
  
  private static IllegalStateException newIllegalStateException(String paramString, UnsupportedEncodingException paramUnsupportedEncodingException)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>();
    localObject = paramString + ": " + paramUnsupportedEncodingException;
    localIllegalStateException.<init>((String)localObject);
    return localIllegalStateException;
  }
  
  public static String newString(byte[] paramArrayOfByte, String paramString)
  {
    String str;
    if (paramArrayOfByte == null) {
      str = null;
    }
    for (;;)
    {
      return str;
      try
      {
        str = new java/lang/String;
        str.<init>(paramArrayOfByte, paramString);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw newIllegalStateException(paramString, localUnsupportedEncodingException);
      }
    }
  }
  
  public static String newStringIso8859_1(byte[] paramArrayOfByte)
  {
    return newString(paramArrayOfByte, "ISO-8859-1");
  }
  
  public static String newStringUsAscii(byte[] paramArrayOfByte)
  {
    return newString(paramArrayOfByte, "US-ASCII");
  }
  
  public static String newStringUtf16(byte[] paramArrayOfByte)
  {
    return newString(paramArrayOfByte, "UTF-16");
  }
  
  public static String newStringUtf16Be(byte[] paramArrayOfByte)
  {
    return newString(paramArrayOfByte, "UTF-16BE");
  }
  
  public static String newStringUtf16Le(byte[] paramArrayOfByte)
  {
    return newString(paramArrayOfByte, "UTF-16LE");
  }
  
  public static String newStringUtf8(byte[] paramArrayOfByte)
  {
    return newString(paramArrayOfByte, "UTF-8");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/binary/StringUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */