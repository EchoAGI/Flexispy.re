package com.android.lame;

public class SimpleLame
{
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    init(paramInt1, paramInt2, paramInt3, paramInt4, 7);
  }
  
  public static native void close();
  
  public static native int encode(short[] paramArrayOfShort1, short[] paramArrayOfShort2, int paramInt, byte[] paramArrayOfByte);
  
  public static native int flush(byte[] paramArrayOfByte);
  
  public static native void init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/android/lame/SimpleLame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */