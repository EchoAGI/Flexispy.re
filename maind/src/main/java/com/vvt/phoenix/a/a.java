package com.vvt.phoenix.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class a
{
  public static int a(byte[] paramArrayOfByte)
  {
    int i = (paramArrayOfByte[0] & 0xFF | 0x0) << 8;
    int j = paramArrayOfByte[1] & 0xFF;
    return i | j;
  }
  
  public static byte[] a(double paramDouble)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putDouble(paramDouble);
    return localByteBuffer.array();
  }
  
  public static byte[] a(float paramFloat)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putFloat(paramFloat);
    return localByteBuffer.array();
  }
  
  public static byte[] a(int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(paramInt);
    return localByteBuffer.array();
  }
  
  public static byte[] a(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(paramLong);
    return localByteBuffer.array();
  }
  
  public static byte[] a(String paramString)
  {
    Object localObject = "UTF-8";
    try
    {
      localObject = paramString.getBytes((String)localObject);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        byte[] arrayOfByte = new byte[0];
      }
    }
    return (byte[])localObject;
  }
  
  public static byte[] a(short paramShort)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.putShort(paramShort);
    return localByteBuffer.array();
  }
  
  public static long b(byte[] paramArrayOfByte)
  {
    int i = 8;
    long l1 = paramArrayOfByte[0] & 0xFF;
    long l2 = (0L | l1) << i;
    l1 = paramArrayOfByte[1] & 0xFF;
    l2 = (l2 | l1) << i;
    l1 = paramArrayOfByte[2] & 0xFF;
    l2 = (l2 | l1) << i;
    l1 = paramArrayOfByte[3] & 0xFF;
    return l2 | l1;
  }
  
  public static long c(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length);
    localByteBuffer.put(paramArrayOfByte);
    return localByteBuffer.getLong(0);
  }
  
  public static String d(byte[] paramArrayOfByte)
  {
    try
    {
      str1 = new java/lang/String;
      String str2 = "UTF-8";
      str1.<init>(paramArrayOfByte, str2);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        Object localObject = null;
      }
    }
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */