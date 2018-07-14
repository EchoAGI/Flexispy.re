package com.android.lame;

public class SimpleLame
{
  public static native void close();
  
  public static native int encode(short[] paramArrayOfShort1, short[] paramArrayOfShort2, int paramInt, byte[] paramArrayOfByte);
  
  public static native int flush(byte[] paramArrayOfByte);
  
  public static native void init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/lame/SimpleLame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */