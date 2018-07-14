package com.krecorder.encoder;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class AMREncoder
  extends AudioEncoderBase
{
  private FileOutputStream fos;
  
  static
  {
    System.loadLibrary("amr");
  }
  
  public AMREncoder(FileOutputStream paramFileOutputStream)
  {
    this.fos = paramFileOutputStream;
  }
  
  private native void nativeClose();
  
  private native int nativeEncode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  private native int nativeInit(int paramInt);
  
  private native void nativeReset();
  
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
      localException.<init>("Failed to encode data");
      throw localException;
    }
    return i;
  }
  
  public void init()
  {
    int i = 6;
    Object localObject1 = this.fos;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/Exception;
      ((Exception)localObject1).<init>("No fileOutputStream located");
      throw ((Throwable)localObject1);
    }
    int j = getProfile();
    j = nativeInit(j);
    if (j != 0)
    {
      localObject1 = new java/lang/Exception;
      ((Exception)localObject1).<init>("Failed to initialize encoder");
      throw ((Throwable)localObject1);
    }
    localObject1 = ByteBuffer.allocate(i);
    Charset localCharset = Charset.forName("ASCII");
    Object localObject2 = "#!AMR\n".getBytes(localCharset);
    ((ByteBuffer)localObject1).put((byte[])localObject2);
    localObject2 = this.fos;
    localObject1 = ((ByteBuffer)localObject1).array();
    ((FileOutputStream)localObject2).write((byte[])localObject1, 0, i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/encoder/AMREncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */