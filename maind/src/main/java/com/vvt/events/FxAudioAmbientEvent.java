package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxAudioAmbientEvent
  extends FxEvent
{
  private long mDuration;
  private String mFilePath;
  private FxMediaType mFormat;
  private long mParingId;
  private String m_FileName;
  
  public long getDuration()
  {
    return this.mDuration;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.AUDIO_AMBIENT;
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
    return this.mFormat;
  }
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public void setDuration(long paramLong)
  {
    this.mDuration = paramLong;
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
    this.mFormat = paramFxMediaType;
  }
  
  public void setParingId(long paramLong)
  {
    this.mParingId = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxAudioAmbientEvent {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", ParingId =");
    l = this.mParingId;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", Format =");
    Object localObject = this.mFormat;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", Duration =");
    l = this.mDuration;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", FileName =");
    localObject = this.m_FileName;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", FilePath =");
    localObject = this.mFilePath;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    localStringBuilder2.append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxAudioAmbientEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */