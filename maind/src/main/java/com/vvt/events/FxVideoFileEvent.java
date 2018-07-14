package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxVideoFileEvent
  extends FxEvent
{
  private String mFileName;
  private String mFilePath;
  private FxMediaType mMediaType;
  private long mParingId;
  
  public FxEventType getEventType()
  {
    return FxEventType.VIDEO_FILE;
  }
  
  public String getFileName()
  {
    return this.mFileName;
  }
  
  public String getFilePath()
  {
    return this.mFilePath;
  }
  
  public FxMediaType getMediaType()
  {
    return this.mMediaType;
  }
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public void setFileName(String paramString)
  {
    this.mFileName = paramString;
  }
  
  public void setFilePath(String paramString)
  {
    this.mFilePath = paramString;
  }
  
  public void setMediaType(FxMediaType paramFxMediaType)
  {
    this.mMediaType = paramFxMediaType;
  }
  
  public void setParingId(long paramLong)
  {
    this.mParingId = paramLong;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxVideoFileEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */