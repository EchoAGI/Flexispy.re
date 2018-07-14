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

public class QuotedPrintableCodec
  implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder
{
  private static final byte ESCAPE_CHAR = 61;
  private static final BitSet PRINTABLE_CHARS;
  private static final byte SPACE = 32;
  private static final byte TAB = 9;
  private final String charset;
  
  static
  {
    BitSet localBitSet = new java/util/BitSet;
    int i = 256;
    localBitSet.<init>(i);
    PRINTABLE_CHARS = localBitSet;
    int j = 33;
    int k;
    for (;;)
    {
      k = 60;
      if (j > k) {
        break;
      }
      localBitSet = PRINTABLE_CHARS;
      localBitSet.set(j);
      j += 1;
    }
    j = 62;
    for (;;)
    {
      k = 126;
      if (j > k) {
        break;
      }
      localBitSet = PRINTABLE_CHARS;
      localBitSet.set(j);
      j += 1;
    }
    PRINTABLE_CHARS.set(9);
    PRINTABLE_CHARS.set(32);
  }
  
  public QuotedPrintableCodec()
  {
    this("UTF-8");
  }
  
  public QuotedPrintableCodec(String paramString)
  {
    this.charset = paramString;
  }
  
  public static final byte[] decodeQuotedPrintable(byte[] paramArrayOfByte)
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
        i = 61;
        int m;
        if (n == i) {
          k += 1;
        }
        for (;;)
        {
          try
          {
            i = paramArrayOfByte[m];
            int i1 = Utils.digit16(i);
            m += 1;
            byte b = paramArrayOfByte[m];
            int i2 = Utils.digit16(b);
            int j = (char)((i1 << 4) + i2);
            localByteArrayOutputStream.write(j);
            m += 1;
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            localObject = new org/apache/commons/codec/DecoderException;
            ((DecoderException)localObject).<init>("Invalid quoted-printable encoding", localArrayIndexOutOfBoundsException);
            throw ((Throwable)localObject);
          }
          localByteArrayOutputStream.write(n);
        }
      }
    }
  }
  
  private static final void encodeQuotedPrintable(int paramInt, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    int i = 16;
    paramByteArrayOutputStream.write(61);
    int j = Character.toUpperCase(Character.forDigit(paramInt >> 4 & 0xF, i));
    int k = Character.toUpperCase(Character.forDigit(paramInt & 0xF, i));
    paramByteArrayOutputStream.write(j);
    paramByteArrayOutputStream.write(k);
  }
  
  public static final byte[] encodeQuotedPrintable(BitSet paramBitSet, byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null) {
      i = 0;
    }
    ByteArrayOutputStream localByteArrayOutputStream;
    for (byte[] arrayOfByte = null;; arrayOfByte = localByteArrayOutputStream.toByteArray())
    {
      return arrayOfByte;
      if (paramBitSet == null) {
        paramBitSet = PRINTABLE_CHARS;
      }
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      int j = 0;
      i = paramArrayOfByte.length;
      if (j < i)
      {
        int k = paramArrayOfByte[j];
        if (k < 0) {
          k += 256;
        }
        boolean bool = paramBitSet.get(k);
        if (bool) {
          localByteArrayOutputStream.write(k);
        }
        for (;;)
        {
          j += 1;
          break;
          encodeQuotedPrintable(k, localByteArrayOutputStream);
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
    localObject2 = str + " cannot be quoted-printable decoded";
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
    return decodeQuotedPrintable(paramArrayOfByte);
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
    localObject2 = str + " cannot be quoted-printable encoded";
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
    return encodeQuotedPrintable(PRINTABLE_CHARS, paramArrayOfByte);
  }
  
  public String getDefaultCharset()
  {
    return this.charset;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/net/QuotedPrintableCodec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */