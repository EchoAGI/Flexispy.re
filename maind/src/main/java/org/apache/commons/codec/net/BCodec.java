package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.Base64;

public class BCodec
  extends RFC1522Codec
  implements StringEncoder, StringDecoder
{
  private final String charset;
  
  public BCodec()
  {
    this("UTF-8");
  }
  
  public BCodec(String paramString)
  {
    this.charset = paramString;
  }
  
  public Object decode(Object paramObject)
  {
    boolean bool;
    if (paramObject == null) {
      bool = false;
    }
    for (Object localObject1 = null;; localObject1 = decode((String)paramObject))
    {
      return localObject1;
      bool = paramObject instanceof String;
      if (!bool) {
        break;
      }
      paramObject = (String)paramObject;
    }
    localObject1 = new org/apache/commons/codec/DecoderException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = ((StringBuffer)localObject2).append("Objects of type ");
    String str = paramObject.getClass().getName();
    localObject2 = str + " cannot be decoded using BCodec";
    ((DecoderException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public String decode(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        localObject = decodeText(paramString);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localObject = new org/apache/commons/codec/DecoderException;
        String str = localUnsupportedEncodingException.getMessage();
        ((DecoderException)localObject).<init>(str, localUnsupportedEncodingException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  protected byte[] doDecoding(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (byte[] arrayOfByte = null;; arrayOfByte = Base64.decodeBase64(paramArrayOfByte)) {
      return arrayOfByte;
    }
  }
  
  protected byte[] doEncoding(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (byte[] arrayOfByte = null;; arrayOfByte = Base64.encodeBase64(paramArrayOfByte)) {
      return arrayOfByte;
    }
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool;
    if (paramObject == null) {
      bool = false;
    }
    for (Object localObject1 = null;; localObject1 = encode((String)paramObject))
    {
      return localObject1;
      bool = paramObject instanceof String;
      if (!bool) {
        break;
      }
      paramObject = (String)paramObject;
    }
    localObject1 = new org/apache/commons/codec/EncoderException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = ((StringBuffer)localObject2).append("Objects of type ");
    String str = paramObject.getClass().getName();
    localObject2 = str + " cannot be encoded using BCodec";
    ((EncoderException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public String encode(String paramString)
  {
    if (paramString == null) {}
    for (String str = null;; str = encode(paramString, str))
    {
      return str;
      str = getDefaultCharset();
    }
  }
  
  public String encode(String paramString1, String paramString2)
  {
    Object localObject;
    if (paramString1 == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        localObject = encodeText(paramString1, paramString2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localObject = new org/apache/commons/codec/EncoderException;
        String str = localUnsupportedEncodingException.getMessage();
        ((EncoderException)localObject).<init>(str, localUnsupportedEncodingException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public String getDefaultCharset()
  {
    return this.charset;
  }
  
  protected String getEncoding()
  {
    return "B";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/net/BCodec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */