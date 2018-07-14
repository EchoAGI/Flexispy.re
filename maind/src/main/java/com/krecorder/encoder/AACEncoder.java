package com.krecorder.encoder;

public class AACEncoder
  extends AudioEncoderBase
{
  public static final int FORMAT_AAC_ELD = 39;
  public static final int FORMAT_AAC_HE = 5;
  public static final int FORMAT_AAC_LC = 2;
  public static final int FORMAT_AAC_LD = 23;
  
  static
  {
    System.loadLibrary("aac");
  }
  
  private native void nativeClose();
  
  private native int nativeEncode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  private native int nativeOpen(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  private native void nativeSetLogFile(String paramString);
  
  public void close()
  {
    nativeClose();
  }
  
  public int encode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = nativeEncode(paramArrayOfByte1, paramArrayOfByte2);
    int j = -1;
    if (i == j)
    {
      Exception localException = new java/lang/Exception;
      localException.<init>("Failed to encode buffer");
      throw localException;
    }
    return i;
  }
  
  public void init()
  {
    int i = getChannels();
    int j = getSampleRate();
    int k = getBitRate();
    int m = getProfile();
    int n = getVariableBitRate();
    int i1 = getSpectralBandReplication();
    Object localObject = this;
    int i2 = nativeOpen(i, j, k, m, n, i1);
    if (i2 != 0)
    {
      localObject = new java/lang/Exception;
      ((Exception)localObject).<init>("Failed to initialize aac encoder");
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/encoder/AACEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */