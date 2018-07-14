package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxRemoteCameraImageEvent
  extends FxEvent
{
  private int mCameraType;
  private String mFileName;
  private String mFilePath;
  private FxMediaType mFormat;
  private long mParingId;
  private c m_GeoTag;
  
  public int getCameraType()
  {
    return this.mCameraType;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.REMOTE_CAMERA_IMAGE;
  }
  
  public String getFileName()
  {
    return this.mFileName;
  }
  
  public String getFilePath()
  {
    return this.mFilePath;
  }
  
  public FxMediaType getFormat()
  {
    return this.mFormat;
  }
  
  public c getGeoTag()
  {
    return this.m_GeoTag;
  }
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public void setCameraType(int paramInt)
  {
    this.mCameraType = paramInt;
  }
  
  public void setFileName(String paramString)
  {
    this.mFileName = paramString;
  }
  
  public void setFilePath(String paramString)
  {
    this.mFilePath = paramString;
  }
  
  public void setFormat(FxMediaType paramFxMediaType)
  {
    this.mFormat = paramFxMediaType;
  }
  
  public void setGeoTag(c paramc)
  {
    this.m_GeoTag = paramc;
  }
  
  public void setParingId(long paramLong)
  {
    this.mParingId = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxRemoteCameraImageEvent {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", ParingId  =");
    l = getParingId();
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", FileName =");
    Object localObject = getFileName();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", FilePath =");
    localObject = getFilePath();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", MediaType =");
    localObject = getFormat();
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", CameraType =");
    int i = getCameraType();
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    localStringBuilder2.append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxRemoteCameraImageEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */