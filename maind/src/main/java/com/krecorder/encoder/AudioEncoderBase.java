package com.krecorder.encoder;

public abstract class AudioEncoderBase
{
  private int bitrate;
  private int channels;
  private int profile;
  private int quality;
  private int sampleRate;
  private int sbr;
  private int vbr;
  
  public AudioEncoderBase()
  {
    this.profile = i;
    this.channels = j;
    this.quality = i;
    this.sampleRate = 8000;
    this.vbr = j;
    this.sbr = 0;
    this.bitrate = 128000;
  }
  
  public boolean canFlush()
  {
    return false;
  }
  
  public abstract void close();
  
  public abstract int encode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public int flush(byte[] paramArrayOfByte)
  {
    Exception localException = new java/lang/Exception;
    localException.<init>("Not implemented");
    throw localException;
  }
  
  public int getBitRate()
  {
    return this.bitrate;
  }
  
  public int getChannels()
  {
    return this.channels;
  }
  
  public int getProfile()
  {
    return this.profile;
  }
  
  public int getQuality()
  {
    return this.quality;
  }
  
  public int getSampleRate()
  {
    return this.sampleRate;
  }
  
  public int getSpectralBandReplication()
  {
    return this.sbr;
  }
  
  public int getVariableBitRate()
  {
    return this.vbr;
  }
  
  public abstract void init();
  
  public void setBitRate(int paramInt)
  {
    this.bitrate = paramInt;
  }
  
  public void setChannels(int paramInt)
  {
    this.channels = paramInt;
  }
  
  public void setProfile(int paramInt)
  {
    this.profile = paramInt;
  }
  
  public void setQuality(int paramInt)
  {
    this.quality = paramInt;
  }
  
  public void setSampleRate(int paramInt)
  {
    this.sampleRate = paramInt;
  }
  
  public void setSpectralBandReplication(int paramInt)
  {
    this.sbr = paramInt;
  }
  
  public void setVariableBitRate(int paramInt)
  {
    this.vbr = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/encoder/AudioEncoderBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */