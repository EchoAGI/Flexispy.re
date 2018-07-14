package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Hex
  implements BinaryEncoder, BinaryDecoder
{
  public static final String DEFAULT_CHARSET_NAME = "UTF-8";
  private static final char[] DIGITS_LOWER;
  private static final char[] DIGITS_UPPER;
  private final String charsetName;
  
  static
  {
    int i = 16;
    char[] arrayOfChar = new char[i];
    char[] tmp8_7 = arrayOfChar;
    char[] tmp9_8 = tmp8_7;
    char[] tmp9_8 = tmp8_7;
    tmp9_8[0] = 48;
    tmp9_8[1] = 49;
    char[] tmp18_9 = tmp9_8;
    char[] tmp18_9 = tmp9_8;
    tmp18_9[2] = 50;
    tmp18_9[3] = 51;
    char[] tmp27_18 = tmp18_9;
    char[] tmp27_18 = tmp18_9;
    tmp27_18[4] = 52;
    tmp27_18[5] = 53;
    char[] tmp36_27 = tmp27_18;
    char[] tmp36_27 = tmp27_18;
    tmp36_27[6] = 54;
    tmp36_27[7] = 55;
    char[] tmp47_36 = tmp36_27;
    char[] tmp47_36 = tmp36_27;
    tmp47_36[8] = 56;
    tmp47_36[9] = 57;
    char[] tmp58_47 = tmp47_36;
    char[] tmp58_47 = tmp47_36;
    tmp58_47[10] = 97;
    tmp58_47[11] = 98;
    char[] tmp69_58 = tmp58_47;
    char[] tmp69_58 = tmp58_47;
    tmp69_58[12] = 99;
    tmp69_58[13] = 100;
    tmp69_58[14] = 101;
    tmp69_58[15] = 102;
    DIGITS_LOWER = arrayOfChar;
    arrayOfChar = new char[i];
    char[] tmp99_98 = arrayOfChar;
    char[] tmp100_99 = tmp99_98;
    char[] tmp100_99 = tmp99_98;
    tmp100_99[0] = 48;
    tmp100_99[1] = 49;
    char[] tmp109_100 = tmp100_99;
    char[] tmp109_100 = tmp100_99;
    tmp109_100[2] = 50;
    tmp109_100[3] = 51;
    char[] tmp118_109 = tmp109_100;
    char[] tmp118_109 = tmp109_100;
    tmp118_109[4] = 52;
    tmp118_109[5] = 53;
    char[] tmp127_118 = tmp118_109;
    char[] tmp127_118 = tmp118_109;
    tmp127_118[6] = 54;
    tmp127_118[7] = 55;
    char[] tmp138_127 = tmp127_118;
    char[] tmp138_127 = tmp127_118;
    tmp138_127[8] = 56;
    tmp138_127[9] = 57;
    char[] tmp149_138 = tmp138_127;
    char[] tmp149_138 = tmp138_127;
    tmp149_138[10] = 65;
    tmp149_138[11] = 66;
    char[] tmp160_149 = tmp149_138;
    char[] tmp160_149 = tmp149_138;
    tmp160_149[12] = 67;
    tmp160_149[13] = 68;
    tmp160_149[14] = 69;
    tmp160_149[15] = 70;
    DIGITS_UPPER = arrayOfChar;
  }
  
  public Hex()
  {
    this.charsetName = "UTF-8";
  }
  
  public Hex(String paramString)
  {
    this.charsetName = paramString;
  }
  
  public static byte[] decodeHex(char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;
    int j = i & 0x1;
    if (j != 0)
    {
      DecoderException localDecoderException = new org/apache/commons/codec/DecoderException;
      localDecoderException.<init>("Odd number of characters.");
      throw localDecoderException;
    }
    j = i >> 1;
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    int m = 0;
    while (m < i)
    {
      int n = toDigit(paramArrayOfChar[m], m) << 4;
      m += 1;
      j = toDigit(paramArrayOfChar[m], m);
      n |= j;
      m += 1;
      j = (byte)(n & 0xFF);
      arrayOfByte[k] = j;
      k += 1;
    }
    return arrayOfByte;
  }
  
  public static char[] encodeHex(byte[] paramArrayOfByte)
  {
    return encodeHex(paramArrayOfByte, true);
  }
  
  public static char[] encodeHex(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (char[] arrayOfChar = DIGITS_LOWER;; arrayOfChar = DIGITS_UPPER) {
      return encodeHex(paramArrayOfByte, arrayOfChar);
    }
  }
  
  protected static char[] encodeHex(byte[] paramArrayOfByte, char[] paramArrayOfChar)
  {
    int i = paramArrayOfByte.length;
    int j = i << 1;
    char[] arrayOfChar = new char[j];
    int k = 0;
    int m = 0;
    int n = 0;
    while (k < i)
    {
      m = n + 1;
      j = (paramArrayOfByte[k] & 0xF0) >>> 4;
      j = paramArrayOfChar[j];
      arrayOfChar[n] = j;
      n = m + 1;
      j = paramArrayOfByte[k] & 0xF;
      j = paramArrayOfChar[j];
      arrayOfChar[m] = j;
      k += 1;
    }
    return arrayOfChar;
  }
  
  public static String encodeHexString(byte[] paramArrayOfByte)
  {
    String str = new java/lang/String;
    char[] arrayOfChar = encodeHex(paramArrayOfByte);
    str.<init>(arrayOfChar);
    return str;
  }
  
  protected static int toDigit(char paramChar, int paramInt)
  {
    int i = Character.digit(paramChar, 16);
    int j = -1;
    if (i == j)
    {
      DecoderException localDecoderException = new org/apache/commons/codec/DecoderException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "Illegal hexadecimal charcter " + paramChar + " at index " + paramInt;
      localDecoderException.<init>((String)localObject);
      throw localDecoderException;
    }
    return i;
  }
  
  public Object decode(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (bool) {}
    for (;;)
    {
      try
      {
        paramObject = (String)paramObject;
        localObject = ((String)paramObject).toCharArray();
        return decodeHex((char[])localObject);
      }
      catch (ClassCastException localClassCastException)
      {
        Object localObject;
        DecoderException localDecoderException = new org/apache/commons/codec/DecoderException;
        String str = localClassCastException.getMessage();
        localDecoderException.<init>(str, localClassCastException);
        throw localDecoderException;
      }
      paramObject = (char[])paramObject;
      paramObject = (char[])paramObject;
      localObject = paramObject;
    }
  }
  
  public byte[] decode(byte[] paramArrayOfByte)
  {
    try
    {
      localObject = new java/lang/String;
      str = getCharsetName();
      ((String)localObject).<init>(paramArrayOfByte, str);
      localObject = ((String)localObject).toCharArray();
      return decodeHex((char[])localObject);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject = new org/apache/commons/codec/DecoderException;
      String str = localUnsupportedEncodingException.getMessage();
      ((DecoderException)localObject).<init>(str, localUnsupportedEncodingException);
      throw ((Throwable)localObject);
    }
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (bool) {}
    for (;;)
    {
      try
      {
        paramObject = (String)paramObject;
        localObject1 = getCharsetName();
        localObject2 = ((String)paramObject).getBytes((String)localObject1);
        return encodeHex((byte[])localObject2);
      }
      catch (ClassCastException localClassCastException)
      {
        Object localObject2;
        localObject1 = new org/apache/commons/codec/EncoderException;
        str = localClassCastException.getMessage();
        ((EncoderException)localObject1).<init>(str, localClassCastException);
        throw ((Throwable)localObject1);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Object localObject1 = new org/apache/commons/codec/EncoderException;
        String str = localUnsupportedEncodingException.getMessage();
        ((EncoderException)localObject1).<init>(str, localUnsupportedEncodingException);
        throw ((Throwable)localObject1);
      }
      paramObject = (byte[])paramObject;
      paramObject = (byte[])paramObject;
      localObject2 = paramObject;
    }
  }
  
  public byte[] encode(byte[] paramArrayOfByte)
  {
    String str1 = encodeHexString(paramArrayOfByte);
    String str2 = getCharsetName();
    return StringUtils.getBytesUnchecked(str1, str2);
  }
  
  public String getCharsetName()
  {
    return this.charsetName;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    String str = super.toString();
    localStringBuffer = localStringBuffer.append(str).append("[charsetName=");
    str = this.charsetName;
    return str + "]";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/binary/Hex.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */