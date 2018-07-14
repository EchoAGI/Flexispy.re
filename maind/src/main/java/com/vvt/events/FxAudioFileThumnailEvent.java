package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FxAudioFileThumnailEvent
  extends FxEvent
{
  private int mActualDuration;
  private long mActualFileSize;
  private byte[] mAudioData;
  private FxMediaType mFormat;
  private long mParingId;
  private String m_ActualFullPath;
  
  public int getActualDuration()
  {
    return this.mActualDuration;
  }
  
  public long getActualFileSize()
  {
    return this.mActualFileSize;
  }
  
  public String getActualFullPath()
  {
    return this.m_ActualFullPath;
  }
  
  public byte[] getAudioData()
  {
    return this.mAudioData;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.AUDIO_FILE_THUMBNAIL;
  }
  
  public FxMediaType getFormat()
  {
    return this.mFormat;
  }
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public void setActualDuration(int paramInt)
  {
    this.mActualDuration = paramInt;
  }
  
  public void setActualFileSize(long paramLong)
  {
    this.mActualFileSize = paramLong;
  }
  
  public void setActualFullPath(String paramString)
  {
    this.m_ActualFullPath = paramString;
  }
  
  public void setAudioData(byte[] paramArrayOfByte)
  {
    this.mAudioData = paramArrayOfByte;
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
    localStringBuilder1.append("FxAudioFileThumnailEvent {");
    Object localObject1 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", ParingId =");
    l = this.mParingId;
    ((StringBuilder)localObject1).append(l);
    localObject1 = this.mAudioData;
    Object localObject2;
    int i;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder1.append(", AudioData Size=");
      localObject2 = this.mAudioData;
      i = localObject2.length;
      ((StringBuilder)localObject1).append(i);
    }
    for (;;)
    {
      localObject1 = localStringBuilder1.append(", Format =");
      localObject2 = this.mFormat;
      ((StringBuilder)localObject1).append(localObject2);
      localObject1 = localStringBuilder1.append(", Size =");
      l = this.mActualFileSize;
      ((StringBuilder)localObject1).append(l);
      localObject1 = localStringBuilder1.append(", Duration =");
      i = this.mActualDuration;
      ((StringBuilder)localObject1).append(i);
      localObject1 = localStringBuilder1.append(", ActualFullPath =");
      localObject2 = this.m_ActualFullPath;
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = new java/util/Date;
      l = super.getEventTime();
      ((Date)localObject1).<init>(l);
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>();
      localStringBuilder2 = localStringBuilder2.append(" EventTime = ");
      SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
      localSimpleDateFormat.<init>("yyyy-MM-dd hh:mm:ss");
      localObject1 = localSimpleDateFormat.format((Date)localObject1);
      localObject1 = (String)localObject1;
      localStringBuilder1.append((String)localObject1);
      return " }";
      localObject1 = localStringBuilder1.append(", AudioData Size=");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxAudioFileThumnailEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */