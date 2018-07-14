package com.google.webp;

public class a
{
  private static int[] a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    a = arrayOfInt;
  }
  
  public static int a(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return libwebpJNI.WebPGetInfo(paramArrayOfByte, paramLong, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public static byte[] b(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return libwebpJNI.WebPDecodeARGB(paramArrayOfByte, paramLong, paramArrayOfInt1, paramArrayOfInt2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/webp/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */