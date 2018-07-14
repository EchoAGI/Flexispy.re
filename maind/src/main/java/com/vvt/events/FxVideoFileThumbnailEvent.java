package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class FxVideoFileThumbnailEvent
  extends FxEvent
{
  private int mActualDuration;
  private long mActualFileSize;
  private String mActualFullPath;
  private FxMediaType mFormat;
  private long mParingId;
  private ArrayList mThumbnailList;
  private byte[] mVideoData;
  
  public FxVideoFileThumbnailEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mThumbnailList = localArrayList;
  }
  
  public void addThumbnail(j paramj)
  {
    this.mThumbnailList.add(paramj);
  }
  
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
    return this.mActualFullPath;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.VIDEO_FILE_THUMBNAIL;
  }
  
  public FxMediaType getFormat()
  {
    return this.mFormat;
  }
  
  public int getImagesCount()
  {
    return 0;
  }
  
  public ArrayList getListOfThumbnail()
  {
    return this.mThumbnailList;
  }
  
  public long getParingId()
  {
    return this.mParingId;
  }
  
  public j getThumbnail(int paramInt)
  {
    return (j)this.mThumbnailList.get(paramInt);
  }
  
  public byte[] getVideoData()
  {
    return this.mVideoData;
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
    this.mActualFullPath = paramString;
  }
  
  public void setFormat(FxMediaType paramFxMediaType)
  {
    this.mFormat = paramFxMediaType;
  }
  
  public void setParingId(long paramLong)
  {
    this.mParingId = paramLong;
  }
  
  public void setVideoData(byte[] paramArrayOfByte)
  {
    this.mVideoData = paramArrayOfByte;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxVideoFileThumbnailEvent {");
    Object localObject1 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", ParingId =");
    l = this.mParingId;
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", Format =");
    Object localObject2 = this.mFormat;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = this.mVideoData;
    int i;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder1.append(", VideoData Size=");
      localObject2 = this.mVideoData;
      i = localObject2.length;
      ((StringBuilder)localObject1).append(i);
    }
    for (;;)
    {
      localObject1 = localStringBuilder1.append(", Size =");
      l = this.mActualFileSize;
      ((StringBuilder)localObject1).append(l);
      localObject1 = localStringBuilder1.append(", Duration =");
      i = this.mActualDuration;
      ((StringBuilder)localObject1).append(i);
      localObject1 = this.mThumbnailList;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.mThumbnailList;
      int j = ((ArrayList)localObject1).size();
      if (j <= 0) {
        break;
      }
      localObject1 = this.mThumbnailList;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (j)((Iterator)localObject2).next();
        localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>();
        localObject3 = " ";
        localStringBuilder2 = localStringBuilder2.append((String)localObject3);
        localObject1 = ((j)localObject1).toString();
        localObject1 = (String)localObject1;
        localStringBuilder1.append((String)localObject1);
      }
      localObject1 = localStringBuilder1.append(", VideoData Size=");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = new java/util/Date;
    l = super.getEventTime();
    ((Date)localObject1).<init>(l);
    StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
    localStringBuilder2.<init>();
    localStringBuilder2 = localStringBuilder2.append(" EventTime = ");
    Object localObject3 = new java/text/SimpleDateFormat;
    ((SimpleDateFormat)localObject3).<init>("yyyy-MM-dd hh:mm:ss");
    localObject1 = ((SimpleDateFormat)localObject3).format((Date)localObject1);
    localObject1 = (String)localObject1;
    localStringBuilder1.append((String)localObject1);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxVideoFileThumbnailEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */