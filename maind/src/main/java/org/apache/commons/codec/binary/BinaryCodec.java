package org.apache.commons.codec.binary;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class BinaryCodec
  implements BinaryDecoder, BinaryEncoder
{
  private static final int[] BITS;
  private static final int BIT_0 = 1;
  private static final int BIT_1 = 2;
  private static final int BIT_2 = 4;
  private static final int BIT_3 = 8;
  private static final int BIT_4 = 16;
  private static final int BIT_5 = 32;
  private static final int BIT_6 = 64;
  private static final int BIT_7 = 128;
  private static final byte[] EMPTY_BYTE_ARRAY;
  private static final char[] EMPTY_CHAR_ARRAY = new char[0];
  
  static
  {
    EMPTY_BYTE_ARRAY = new byte[0];
    int[] arrayOfInt = new int[8];
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 2;
    arrayOfInt[2] = 4;
    arrayOfInt[3] = 8;
    arrayOfInt[4] = 16;
    arrayOfInt[5] = 32;
    arrayOfInt[6] = 64;
    arrayOfInt[7] = '';
    BITS = arrayOfInt;
  }
  
  public static byte[] fromAscii(byte[] paramArrayOfByte)
  {
    boolean bool = isEmpty(paramArrayOfByte);
    if (bool)
    {
      arrayOfByte = EMPTY_BYTE_ARRAY;
      return arrayOfByte;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length >> 3];
    int j = 0;
    int i = paramArrayOfByte.length;
    int k = i + -1;
    for (;;)
    {
      i = arrayOfByte.length;
      if (j >= i) {
        break;
      }
      int m = 0;
      for (;;)
      {
        int[] arrayOfInt1 = BITS;
        i = arrayOfInt1.length;
        if (m >= i) {
          break;
        }
        i = k - m;
        i = paramArrayOfByte[i];
        int n = 49;
        if (i == n)
        {
          i = arrayOfByte[j];
          int[] arrayOfInt2 = BITS;
          n = arrayOfInt2[m];
          i = (byte)(i | n);
          arrayOfByte[j] = i;
        }
        m += 1;
      }
      j += 1;
      k += -8;
    }
  }
  
  public static byte[] fromAscii(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      i = paramArrayOfChar.length;
      if (i != 0) {}
    }
    else
    {
      arrayOfByte = EMPTY_BYTE_ARRAY;
      return arrayOfByte;
    }
    byte[] arrayOfByte = new byte[paramArrayOfChar.length >> 3];
    int j = 0;
    int i = paramArrayOfChar.length;
    int k = i + -1;
    for (;;)
    {
      i = arrayOfByte.length;
      if (j >= i) {
        break;
      }
      int m = 0;
      for (;;)
      {
        int[] arrayOfInt1 = BITS;
        i = arrayOfInt1.length;
        if (m >= i) {
          break;
        }
        i = k - m;
        i = paramArrayOfChar[i];
        int n = 49;
        if (i == n)
        {
          i = arrayOfByte[j];
          int[] arrayOfInt2 = BITS;
          n = arrayOfInt2[m];
          i = (byte)(i | n);
          arrayOfByte[j] = i;
        }
        m += 1;
      }
      j += 1;
      k += -8;
    }
  }
  
  private static boolean isEmpty(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      i = paramArrayOfByte.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static byte[] toAsciiBytes(byte[] paramArrayOfByte)
  {
    boolean bool = isEmpty(paramArrayOfByte);
    if (bool)
    {
      arrayOfByte = EMPTY_BYTE_ARRAY;
      return arrayOfByte;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length << 3];
    int j = 0;
    int i = arrayOfByte.length;
    int k = i + -1;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (j >= i) {
        break;
      }
      int m = 0;
      int[] arrayOfInt1 = BITS;
      i = arrayOfInt1.length;
      if (m < i)
      {
        i = paramArrayOfByte[j];
        int[] arrayOfInt2 = BITS;
        int n = arrayOfInt2[m];
        i &= n;
        if (i == 0)
        {
          i = k - m;
          n = 48;
          arrayOfByte[i] = n;
        }
        for (;;)
        {
          m += 1;
          break;
          i = k - m;
          n = 49;
          arrayOfByte[i] = n;
        }
      }
      j += 1;
      k += -8;
    }
  }
  
  public static char[] toAsciiChars(byte[] paramArrayOfByte)
  {
    boolean bool = isEmpty(paramArrayOfByte);
    if (bool)
    {
      arrayOfChar = EMPTY_CHAR_ARRAY;
      return arrayOfChar;
    }
    char[] arrayOfChar = new char[paramArrayOfByte.length << 3];
    int j = 0;
    int i = arrayOfChar.length;
    int k = i + -1;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (j >= i) {
        break;
      }
      int m = 0;
      int[] arrayOfInt1 = BITS;
      i = arrayOfInt1.length;
      if (m < i)
      {
        i = paramArrayOfByte[j];
        int[] arrayOfInt2 = BITS;
        int n = arrayOfInt2[m];
        i &= n;
        if (i == 0)
        {
          i = k - m;
          n = 48;
          arrayOfChar[i] = n;
        }
        for (;;)
        {
          m += 1;
          break;
          i = k - m;
          n = 49;
          arrayOfChar[i] = n;
        }
      }
      j += 1;
      k += -8;
    }
  }
  
  public static String toAsciiString(byte[] paramArrayOfByte)
  {
    String str = new java/lang/String;
    char[] arrayOfChar = toAsciiChars(paramArrayOfByte);
    str.<init>(arrayOfChar);
    return str;
  }
  
  public Object decode(Object paramObject)
  {
    if (paramObject == null) {
      localObject = EMPTY_BYTE_ARRAY;
    }
    for (;;)
    {
      return localObject;
      boolean bool = paramObject instanceof byte[];
      if (bool)
      {
        paramObject = (byte[])paramObject;
        localObject = fromAscii((byte[])paramObject);
      }
      else
      {
        bool = paramObject instanceof char[];
        if (bool)
        {
          paramObject = (char[])paramObject;
          localObject = fromAscii((char[])paramObject);
        }
        else
        {
          bool = paramObject instanceof String;
          if (!bool) {
            break;
          }
          paramObject = (String)paramObject;
          localObject = fromAscii(((String)paramObject).toCharArray());
        }
      }
    }
    Object localObject = new org/apache/commons/codec/DecoderException;
    ((DecoderException)localObject).<init>("argument not a byte array");
    throw ((Throwable)localObject);
  }
  
  public byte[] decode(byte[] paramArrayOfByte)
  {
    return fromAscii(paramArrayOfByte);
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool = paramObject instanceof byte[];
    if (!bool)
    {
      EncoderException localEncoderException = new org/apache/commons/codec/EncoderException;
      localEncoderException.<init>("argument not a byte array");
      throw localEncoderException;
    }
    return toAsciiChars((byte[])paramObject);
  }
  
  public byte[] encode(byte[] paramArrayOfByte)
  {
    return toAsciiBytes(paramArrayOfByte);
  }
  
  public byte[] toByteArray(String paramString)
  {
    if (paramString == null) {}
    for (byte[] arrayOfByte = EMPTY_BYTE_ARRAY;; arrayOfByte = fromAscii(paramString.toCharArray())) {
      return arrayOfByte;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/binary/BinaryCodec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */