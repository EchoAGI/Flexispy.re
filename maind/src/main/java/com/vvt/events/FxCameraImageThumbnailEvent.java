package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FxCameraImageThumbnailEvent
  extends FxEvent
{
  private String m_ActualFullPath;
  private long m_ActualSize;
  private FxMediaType m_Format;
  private c m_GeoTag;
  private byte[] m_ImageData;
  private long m_ParingId;
  private String m_ThumbnailFullPath;
  
  public String getActualFullPath()
  {
    return this.m_ActualFullPath;
  }
  
  public long getActualSize()
  {
    return this.m_ActualSize;
  }
  
  public byte[] getData()
  {
    return this.m_ImageData;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.CAMERA_IMAGE_THUMBNAIL;
  }
  
  public FxMediaType getFormat()
  {
    return this.m_Format;
  }
  
  public c getGeo()
  {
    return this.m_GeoTag;
  }
  
  public long getParingId()
  {
    return this.m_ParingId;
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
    this.m_ActualSize = paramLong;
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    this.m_ImageData = paramArrayOfByte;
  }
  
  public void setFormat(FxMediaType paramFxMediaType)
  {
    this.m_Format = paramFxMediaType;
  }
  
  public void setGeo(c paramc)
  {
    this.m_GeoTag = paramc;
  }
  
  public void setParingId(long paramLong)
  {
    this.m_ParingId = paramLong;
  }
  
  public void setThumbnailFullPath(String paramString)
  {
    this.m_ThumbnailFullPath = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxCameraImageThumbnailEvent {");
    Object localObject1 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", Format =");
    Object localObject2 = this.m_Format;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = localStringBuilder1.append(", ThumbnailFullPath =");
    localObject2 = this.m_ThumbnailFullPath;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", ActualFullPath =");
    localObject2 = this.m_ActualFullPath;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", ActualSize =");
    l = this.m_ActualSize;
    ((StringBuilder)localObject1).append(l);
    localObject1 = this.m_GeoTag;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder1.append(", GeoTag =");
      localObject2 = this.m_GeoTag.toString();
      ((StringBuilder)localObject1).append((String)localObject2);
    }
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
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxCameraImageThumbnailEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */