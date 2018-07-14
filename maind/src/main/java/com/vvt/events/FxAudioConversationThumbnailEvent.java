package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxAudioConversationThumbnailEvent
  extends FxEvent
{
  private long mActualDuration;
  private long mActualFileSize;
  private byte[] mAudioData;
  private FxMediaType mFormat;
  private long mParingId;
  private String m_ActualFullPath;
  public b m_EmbededCallInfo;
  
  public long getActualDuration()
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
  
  public b getEmbededCallInfo()
  {
    return this.m_EmbededCallInfo;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.AUDIO_CONVERSATION_THUMBNAIL;
  }
  
  public FxMediaType getFormat()
  {
    return this.mFormat;
  }
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public void setActualDuration(long paramLong)
  {
    this.mActualDuration = paramLong;
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
  
  public void setEmbededCallInfo(b paramb)
  {
    this.m_EmbededCallInfo = paramb;
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
    localStringBuilder1.append("FxAudioConversationThumbnailEvent {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", ParingId =");
    l = this.mParingId;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", Format =");
    Object localObject = this.mFormat;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", ActualFileSize =");
    l = this.mActualFileSize;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", ActualDuration =");
    l = this.mActualDuration;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", ");
    localObject = this.m_EmbededCallInfo;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", ActualFullPath =");
    localObject = this.m_ActualFullPath;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    localStringBuilder2.append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxAudioConversationThumbnailEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */