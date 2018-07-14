package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxWallPaperThumbnailEvent
  extends FxEvent
{
  private long mActualFileSize;
  private FxMediaType mFormat;
  private long mParingId;
  private String m_ActualFullPath;
  private String m_ThumbnailFullPath;
  
  public String getActualFullPath()
  {
    return this.m_ActualFullPath;
  }
  
  public long getActualSize()
  {
    return this.mActualFileSize;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.WALLPAPER_THUMBNAIL;
  }
  
  public FxMediaType getFormat()
  {
    return this.mFormat;
  }
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public String getThumbnailFullPath()
  {
    return this.m_ThumbnailFullPath;
  }
  
  public void setActualFullPath(String paramString)
  {
    this.m_ActualFullPath = paramString;
  }
  
  public void setActualSize(long paramLong)
  {
    this.mActualFileSize = paramLong;
  }
  
  public void setFormat(FxMediaType paramFxMediaType)
  {
    this.mFormat = paramFxMediaType;
  }
  
  public void setParingId(long paramLong)
  {
    this.mParingId = paramLong;
  }
  
  public void setThumbnailFullPath(String paramString)
  {
    this.m_ThumbnailFullPath = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxWallPaperThumbnailEvent {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" mParingId =");
    long l = this.mParingId;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", mFormat =");
    Object localObject = this.mFormat;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", mActualFileSize =");
    l = this.mActualFileSize;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", m_ThumbnailFullPath =");
    localObject = this.m_ThumbnailFullPath;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", m_ActualFullPath =");
    localObject = this.m_ActualFullPath;
    localStringBuilder2.append((String)localObject);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxWallPaperThumbnailEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */