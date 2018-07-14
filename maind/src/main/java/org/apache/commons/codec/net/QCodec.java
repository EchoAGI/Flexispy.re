package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

public class QCodec
  extends RFC1522Codec
  implements StringEncoder, StringDecoder
{
  private static final byte BLANK = 32;
  private static final BitSet PRINTABLE_CHARS;
  private static final byte UNDERSCORE = 95;
  private final String charset;
  private boolean encodeBlanks = false;
  
  static
  {
    BitSet localBitSet = new java/util/BitSet;
    localBitSet.<init>(256);
    PRINTABLE_CHARS = localBitSet;
    PRINTABLE_CHARS.set(32);
    PRINTABLE_CHARS.set(33);
    PRINTABLE_CHARS.set(34);
    PRINTABLE_CHARS.set(35);
    PRINTABLE_CHARS.set(36);
    PRINTABLE_CHARS.set(37);
    PRINTABLE_CHARS.set(38);
    PRINTABLE_CHARS.set(39);
    PRINTABLE_CHARS.set(40);
    PRINTABLE_CHARS.set(41);
    PRINTABLE_CHARS.set(42);
    PRINTABLE_CHARS.set(43);
    PRINTABLE_CHARS.set(44);
    PRINTABLE_CHARS.set(45);
    PRINTABLE_CHARS.set(46);
    localBitSet = PRINTABLE_CHARS;
    int i = 47;
    localBitSet.set(i);
    int j = 48;
    int k;
    for (;;)
    {
      k = 57;
      if (j > k) {
        break;
      }
      localBitSet = PRINTABLE_CHARS;
      localBitSet.set(j);
      j += 1;
    }
    PRINTABLE_CHARS.set(58);
    PRINTABLE_CHARS.set(59);
    PRINTABLE_CHARS.set(60);
    PRINTABLE_CHARS.set(62);
    localBitSet = PRINTABLE_CHARS;
    i = 64;
    localBitSet.set(i);
    j = 65;
    for (;;)
    {
      k = 90;
      if (j > k) {
        break;
      }
      localBitSet = PRINTABLE_CHARS;
      localBitSet.set(j);
      j += 1;
    }
    PRINTABLE_CHARS.set(91);
    PRINTABLE_CHARS.set(92);
    PRINTABLE_CHARS.set(93);
    PRINTABLE_CHARS.set(94);
    localBitSet = PRINTABLE_CHARS;
    i = 96;
    localBitSet.set(i);
    j = 97;
    for (;;)
    {
      k = 122;
      if (j > k) {
        break;
      }
      localBitSet = PRINTABLE_CHARS;
      localBitSet.set(j);
      j += 1;
    }
    PRINTABLE_CHARS.set(123);
    PRINTABLE_CHARS.set(124);
    PRINTABLE_CHARS.set(125);
    PRINTABLE_CHARS.set(126);
  }
  
  public QCodec()
  {
    this("UTF-8");
  }
  
  public QCodec(String paramString)
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
    localObject2 = str + " cannot be decoded using Q codec";
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
    int i = 95;
    int j;
    byte[] arrayOfByte1;
    if (paramArrayOfByte == null)
    {
      j = 0;
      arrayOfByte1 = null;
    }
    for (;;)
    {
      return arrayOfByte1;
      int k = 0;
      int m = 0;
      j = paramArrayOfByte.length;
      byte[] arrayOfByte2;
      if (m < j)
      {
        j = paramArrayOfByte[m];
        if (j == i) {
          k = 1;
        }
      }
      else
      {
        if (k == 0) {
          break label127;
        }
        j = paramArrayOfByte.length;
        arrayOfByte2 = new byte[j];
        m = 0;
        label59:
        j = paramArrayOfByte.length;
        if (m >= j) {
          break label117;
        }
        int n = paramArrayOfByte[m];
        if (n == i) {
          break label105;
        }
        arrayOfByte2[m] = n;
      }
      for (;;)
      {
        m += 1;
        break label59;
        m += 1;
        break;
        label105:
        j = 32;
        arrayOfByte2[m] = j;
      }
      label117:
      arrayOfByte1 = QuotedPrintableCodec.decodeQuotedPrintable(arrayOfByte2);
      continue;
      label127:
      arrayOfByte1 = QuotedPrintableCodec.decodeQuotedPrintable(paramArrayOfByte);
    }
  }
  
  protected byte[] doEncoding(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = null;
    }
    boolean bool;
    do
    {
      return arrayOfByte;
      BitSet localBitSet = PRINTABLE_CHARS;
      arrayOfByte = QuotedPrintableCodec.encodeQuotedPrintable(localBitSet, paramArrayOfByte);
      bool = this.encodeBlanks;
    } while (!bool);
    int j = 0;
    for (;;)
    {
      int i = arrayOfByte.length;
      if (j >= i) {
        break;
      }
      i = arrayOfByte[j];
      int k = 32;
      if (i == k)
      {
        i = 95;
        arrayOfByte[j] = i;
      }
      j += 1;
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
    localObject2 = str + " cannot be encoded using Q codec";
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
    return "Q";
  }
  
  public boolean isEncodeBlanks()
  {
    return this.encodeBlanks;
  }
  
  public void setEncodeBlanks(boolean paramBoolean)
  {
    this.encodeBlanks = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/net/QCodec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */