package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.StringUtils;

abstract class RFC1522Codec
{
  protected static final String POSTFIX = "?=";
  protected static final String PREFIX = "=?";
  protected static final char SEP = '?';
  
  protected String decodeText(String paramString)
  {
    int i = 63;
    boolean bool1;
    Object localObject1;
    if (paramString == null)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = "=?";
      bool1 = paramString.startsWith((String)localObject1);
      if (bool1)
      {
        localObject1 = "?=";
        bool1 = paramString.endsWith((String)localObject1);
        if (bool1) {}
      }
      else
      {
        localObject1 = new org/apache/commons/codec/DecoderException;
        ((DecoderException)localObject1).<init>("RFC 1522 violation: malformed encoded content");
        throw ((Throwable)localObject1);
      }
      int j = paramString.length();
      int k = j + -2;
      int m = 2;
      int n = paramString.indexOf(i, m);
      if (n == k)
      {
        localObject1 = new org/apache/commons/codec/DecoderException;
        ((DecoderException)localObject1).<init>("RFC 1522 violation: charset token not found");
        throw ((Throwable)localObject1);
      }
      String str1 = paramString.substring(m, n);
      localObject1 = "";
      boolean bool2 = str1.equals(localObject1);
      if (bool2)
      {
        localObject1 = new org/apache/commons/codec/DecoderException;
        ((DecoderException)localObject1).<init>("RFC 1522 violation: charset not specified");
        throw ((Throwable)localObject1);
      }
      m = n + 1;
      n = paramString.indexOf(i, m);
      if (n == k)
      {
        localObject1 = new org/apache/commons/codec/DecoderException;
        ((DecoderException)localObject1).<init>("RFC 1522 violation: encoding token not found");
        throw ((Throwable)localObject1);
      }
      String str2 = paramString.substring(m, n);
      localObject1 = getEncoding();
      bool2 = ((String)localObject1).equalsIgnoreCase(str2);
      if (!bool2)
      {
        localObject1 = new org/apache/commons/codec/DecoderException;
        Object localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "This codec cannot decode " + str2 + " encoded content";
        ((DecoderException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      m = n + 1;
      n = paramString.indexOf(i, m);
      byte[] arrayOfByte = StringUtils.getBytesUsAscii(paramString.substring(m, n));
      arrayOfByte = doDecoding(arrayOfByte);
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>(arrayOfByte, str1);
    }
  }
  
  protected abstract byte[] doDecoding(byte[] paramArrayOfByte);
  
  protected abstract byte[] doEncoding(byte[] paramArrayOfByte);
  
  protected String encodeText(String paramString1, String paramString2)
  {
    char c = '?';
    if (paramString1 == null) {}
    StringBuffer localStringBuffer;
    for (Object localObject = null;; localObject = localStringBuffer.toString())
    {
      return (String)localObject;
      localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>();
      localStringBuffer.append("=?");
      localStringBuffer.append(paramString2);
      localStringBuffer.append(c);
      localObject = getEncoding();
      localStringBuffer.append((String)localObject);
      localStringBuffer.append(c);
      localObject = paramString1.getBytes(paramString2);
      byte[] arrayOfByte = doEncoding((byte[])localObject);
      localObject = StringUtils.newStringUsAscii(arrayOfByte);
      localStringBuffer.append((String)localObject);
      localStringBuffer.append("?=");
    }
  }
  
  protected abstract String getEncoding();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/net/RFC1522Codec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */