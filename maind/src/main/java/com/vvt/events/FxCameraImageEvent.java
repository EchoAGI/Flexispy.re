package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxCameraImageEvent
  extends FxEvent
{
  private String mFilePath;
  private String m_FileName;
  public c m_GeoTag;
  private FxMediaType m_MediaType;
  private long m_ParingId;
  
  public FxEventType getEventType()
  {
    return FxEventType.CAMERA_IMAGE;
  }
  
  public String getFileName()
  {
    return this.m_FileName;
  }
  
  public String getFilePath()
  {
    return this.mFilePath;
  }
  
  public FxMediaType getFormat()
  {
    return this.m_MediaType;
  }
  
  public c getGeo()
  {
    return this.m_GeoTag;
  }
  
  public long getParingId()
  {
    return this.m_ParingId;
  }
  
  public void setFileName(String paramString)
  {
    this.m_FileName = paramString;
  }
  
  public void setFilePath(String paramString)
  {
    this.mFilePath = paramString;
  }
  
  public void setFormat(FxMediaType paramFxMediaType)
  {
    this.m_MediaType = paramFxMediaType;
  }
  
  public void setGeo(c paramc)
  {
    this.m_GeoTag = paramc;
  }
  
  public void setParingId(long paramLong)
  {
    this.m_ParingId = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxCameraImageEvent {");
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
    localStringBuilder2 = localStringBuilder1.append(", GeoTag =");
    localObject = getGeo();
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    localStringBuilder2.append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxCameraImageEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */