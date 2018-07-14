package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxAudioConversationEvent
  extends FxEvent
{
  private String mFileName;
  private String mFilePath;
  private FxMediaType mFormat;
  private long mParingId;
  private b m_EmbededCallInfo;
  
  public b getEmbededCallInfo()
  {
    return this.m_EmbededCallInfo;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.AUDIO_CONVERSATION;
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
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public void setEmbededCallInfo(b paramb)
  {
    this.m_EmbededCallInfo = paramb;
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
  
  public void setParingId(long paramLong)
  {
    this.mParingId = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxAudioConversationEvent {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", ParingId =");
    l = this.mParingId;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", Format =");
    Object localObject = this.mFormat;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", FileName =");
    localObject = this.mFileName;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", FilePath =");
    localObject = this.mFilePath;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", ");
    localObject = this.m_EmbededCallInfo;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    localStringBuilder2.append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxAudioConversationEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */