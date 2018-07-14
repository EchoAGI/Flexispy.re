package com.google.webp;

public class libwebpJNI
{
  public static final native byte[] WebPDecodeARGB(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  public static final native byte[] WebPDecodeBGR(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  public static final native byte[] WebPDecodeBGRA(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  public static final native byte[] WebPDecodeRGB(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  public static final native byte[] WebPDecodeRGBA(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  public static final native int WebPGetDecoderVersion();
  
  public static final native int WebPGetEncoderVersion();
  
  public static final native int WebPGetInfo(byte[] paramArrayOfByte, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  public static final native byte[] wrap_WebPEncodeBGR(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, float paramFloat);
  
  public static final native byte[] wrap_WebPEncodeBGRA(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, float paramFloat);
  
  public static final native byte[] wrap_WebPEncodeLosslessBGR(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5);
  
  public static final native byte[] wrap_WebPEncodeLosslessBGRA(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5);
  
  public static final native byte[] wrap_WebPEncodeLosslessRGB(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5);
  
  public static final native byte[] wrap_WebPEncodeLosslessRGBA(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5);
  
  public static final native byte[] wrap_WebPEncodeRGB(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, float paramFloat);
  
  public static final native byte[] wrap_WebPEncodeRGBA(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, float paramFloat);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/google/webp/libwebpJNI.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */