package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxWallpaperEvent
  extends FxEvent
{
  private String mFileName;
  private String mFilePath;
  private FxMediaType mFormat;
  private long mParingId;
  
  public FxEventType getEventType()
  {
    return FxEventType.WALLPAPER;
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
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxWallpaperEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */