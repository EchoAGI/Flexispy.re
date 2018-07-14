package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

public class URLCodec
  implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder
{
  protected static byte ESCAPE_CHAR = 0;
  static final int RADIX = 16;
  protected static final BitSet WWW_FORM_URL;
  protected String charset;
  
  static
  {
    int i = 37;
    ESCAPE_CHAR = i;
    BitSet localBitSet = new java/util/BitSet;
    int j = 256;
    localBitSet.<init>(j);
    WWW_FORM_URL = localBitSet;
    int k = 97;
    for (;;)
    {
      i = 122;
      if (k > i) {
        break;
      }
      localBitSet = WWW_FORM_URL;
      localBitSet.set(k);
      k += 1;
    }
    k = 65;
    for (;;)
    {
      i = 90;
      if (k > i) {
        break;
      }
      localBitSet = WWW_FORM_URL;
      localBitSet.set(k);
      k += 1;
    }
    k = 48;
    for (;;)
    {
      i = 57;
      if (k > i) {
        break;
      }
      localBitSet = WWW_FORM_URL;
      localBitSet.set(k);
      k += 1;
    }
    WWW_FORM_URL.set(45);
    WWW_FORM_URL.set(95);
    WWW_FORM_URL.set(46);
    WWW_FORM_URL.set(42);
    WWW_FORM_URL.set(32);
  }
  
  public URLCodec()
  {
    this("UTF-8");
  }
  
  public URLCodec(String paramString)
  {
    this.charset = paramString;
  }
  
  public static final byte[] decodeUrl(byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null) {
      i = 0;
    }
    ByteArrayOutputStream localByteArrayOutputStream;
    for (Object localObject = null;; localObject = localByteArrayOutputStream.toByteArray())
    {
      return (byte[])localObject;
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      int k = 0;
      i = paramArrayOfByte.length;
      if (k < i)
      {
        int n = paramArrayOfByte[k];
        i = 43;
        if (n == i)
        {
          i = 32;
          localByteArrayOutputStream.write(i);
        }
        for (;;)
        {
          int m;
          k += 1;
          break;
          i = ESCAPE_CHAR;
          if (n == i)
          {
            m += 1;
            try
            {
              i = paramArrayOfByte[m];
              int i1 = Utils.digit16(i);
              m += 1;
              byte b = paramArrayOfByte[m];
              int i2 = Utils.digit16(b);
              int j = (char)((i1 << 4) + i2);
              localByteArrayOutputStream.write(j);
            }
            catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
            {
              localObject = new org/apache/commons/codec/DecoderException;
              ((DecoderException)localObject).<init>("Invalid URL encoding: ", localArrayIndexOutOfBoundsException);
              throw ((Throwable)localObject);
            }
          }
          else
          {
            localByteArrayOutputStream.write(n);
          }
        }
      }
    }
  }
  
  public static final byte[] encodeUrl(BitSet paramBitSet, byte[] paramArrayOfByte)
  {
    int i = 16;
    int j;
    if (paramArrayOfByte == null) {
      j = 0;
    }
    ByteArrayOutputStream localByteArrayOutputStream;
    for (byte[] arrayOfByte = null;; arrayOfByte = localByteArrayOutputStream.toByteArray())
    {
      return arrayOfByte;
      if (paramBitSet == null) {
        paramBitSet = WWW_FORM_URL;
      }
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      int m = 0;
      j = paramArrayOfByte.length;
      if (m < j)
      {
        int n = paramArrayOfByte[m];
        if (n < 0) {
          n += 256;
        }
        boolean bool = paramBitSet.get(n);
        int k;
        int i1;
        if (bool)
        {
          k = 32;
          if (n == k) {
            i1 = 43;
          }
          localByteArrayOutputStream.write(i1);
        }
        for (;;)
        {
          m += 1;
          break;
          k = ESCAPE_CHAR;
          localByteArrayOutputStream.write(k);
          int i2 = Character.toUpperCase(Character.forDigit(i1 >> 4 & 0xF, i));
          k = Character.forDigit(i1 & 0xF, i);
          int i3 = Character.toUpperCase(k);
          localByteArrayOutputStream.write(i2);
          localByteArrayOutputStream.write(i3);
        }
      }
    }
  }
  
  public Object decode(Object paramObject)
  {
    boolean bool;
    if (paramObject == null)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      bool = paramObject instanceof byte[];
      if (bool)
      {
        paramObject = (byte[])paramObject;
        localObject1 = decode((byte[])paramObject);
      }
      else
      {
        bool = paramObject instanceof String;
        if (!bool) {
          break;
        }
        paramObject = (String)paramObject;
        localObject1 = decode((String)paramObject);
      }
    }
    Object localObject1 = new org/apache/commons/codec/DecoderException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = ((StringBuffer)localObject2).append("Objects of type ");
    String str = paramObject.getClass().getName();
    localObject2 = str + " cannot be URL decoded";
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
        localObject = getDefaultCharset();
        localObject = decode(paramString, (String)localObject);
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
  
  public String decode(String paramString1, String paramString2)
  {
    String str;
    if (paramString1 == null) {
      str = null;
    }
    for (;;)
    {
      return str;
      str = new java/lang/String;
      byte[] arrayOfByte = StringUtils.getBytesUsAscii(paramString1);
      arrayOfByte = decode(arrayOfByte);
      str.<init>(arrayOfByte, paramString2);
    }
  }
  
  public byte[] decode(byte[] paramArrayOfByte)
  {
    return decodeUrl(paramArrayOfByte);
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool;
    if (paramObject == null)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      bool = paramObject instanceof byte[];
      if (bool)
      {
        paramObject = (byte[])paramObject;
        localObject1 = encode((byte[])paramObject);
      }
      else
      {
        bool = paramObject instanceof String;
        if (!bool) {
          break;
        }
        paramObject = (String)paramObject;
        localObject1 = encode((String)paramObject);
      }
    }
    Object localObject1 = new org/apache/commons/codec/EncoderException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = ((StringBuffer)localObject2).append("Objects of type ");
    String str = paramObject.getClass().getName();
    localObject2 = str + " cannot be URL encoded";
    ((EncoderException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public String encode(String paramString)
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
        localObject = getDefaultCharset();
        localObject = encode(paramString, (String)localObject);
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
  
  public String encode(String paramString1, String paramString2)
  {
    if (paramString1 == null) {}
    for (Object localObject = null;; localObject = StringUtils.newStringUsAscii(encode((byte[])localObject)))
    {
      return (String)localObject;
      localObject = paramString1.getBytes(paramString2);
    }
  }
  
  public byte[] encode(byte[] paramArrayOfByte)
  {
    return encodeUrl(WWW_FORM_URL, paramArrayOfByte);
  }
  
  public String getDefaultCharset()
  {
    return this.charset;
  }
  
  public String getEncoding()
  {
    return this.charset;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/net/URLCodec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */