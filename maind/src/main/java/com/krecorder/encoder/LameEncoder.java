package com.krecorder.encoder;

public class LameEncoder
  extends AudioEncoderBase
{
  static
  {
    System.loadLibrary("lame");
  }
  
  private native void nativeClose();
  
  private native int nativeEncode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  private native int nativeFlush(byte[] paramArrayOfByte);
  
  private native int nativeInit(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  private native void nativeSetLogFile(String paramString);
  
  public boolean canFlush()
  {
    return true;
  }
  
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
      localException.<init>("Failed to encode");
      throw localException;
    }
    return i;
  }
  
  public int flush(byte[] paramArrayOfByte)
  {
    int i = nativeFlush(paramArrayOfByte);
    int j = -1;
    if (i == j)
    {
      Exception localException = new java/lang/Exception;
      localException.<init>("Failed to flush buffers");
      throw localException;
    }
    return i;
  }
  
  public void init()
  {
    int i = getChannels();
    int j = getSampleRate();
    int k = getBitRate();
    int m = getQuality();
    int n = getVariableBitRate();
    Object localObject = this;
    int i1 = nativeInit(i, j, 0, k, 0, m, n);
    if (i1 != 0)
    {
      localObject = new java/lang/Exception;
      ((Exception)localObject).<init>("Failed to initialize encoder");
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/encoder/LameEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */