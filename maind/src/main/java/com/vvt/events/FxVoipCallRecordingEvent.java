package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;
import java.util.Iterator;

public class FxVoipCallRecordingEvent
  extends FxEvent
{
  private FxEventDirection mDirection;
  private long mDuration;
  private String mFileName;
  private String mFilePath;
  private FxVoipCallLogEvent.FxIsMonitor mIsMonitor;
  private int mMediaType;
  private String mOwnerContactName;
  private String mOwnerId;
  private ArrayList mRecipientStore;
  private FxVoipCategory mVoipCategory;
  
  public FxVoipCallRecordingEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mRecipientStore = localArrayList;
  }
  
  public FxEventDirection getDirection()
  {
    return this.mDirection;
  }
  
  public long getDuration()
  {
    return this.mDuration;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.VOIP_CALL_RECORDING;
  }
  
  public String getFileName()
  {
    return this.mFileName;
  }
  
  public String getFilePath()
  {
    return this.mFilePath;
  }
  
  public FxVoipCallLogEvent.FxIsMonitor getIsMonitor()
  {
    return this.mIsMonitor;
  }
  
  public int getMediaType()
  {
    return this.mMediaType;
  }
  
  public String getOwnerContactName()
  {
    return this.mOwnerContactName;
  }
  
  public String getOwnerId()
  {
    return this.mOwnerId;
  }
  
  public h getRecipient(int paramInt)
  {
    return (h)this.mRecipientStore.get(paramInt);
  }
  
  public int getRecipientCount()
  {
    return this.mRecipientStore.size();
  }
  
  public ArrayList getRecipientStore()
  {
    return this.mRecipientStore;
  }
  
  public FxVoipCategory getVoipCategory()
  {
    return this.mVoipCategory;
  }
  
  public void setDirection(FxEventDirection paramFxEventDirection)
  {
    this.mDirection = paramFxEventDirection;
  }
  
  public void setDuration(long paramLong)
  {
    this.mDuration = paramLong;
  }
  
  public void setFileName(String paramString)
  {
    this.mFileName = paramString;
  }
  
  public void setFilePath(String paramString)
  {
    this.mFilePath = paramString;
  }
  
  public void setIsMonitor(FxVoipCallLogEvent.FxIsMonitor paramFxIsMonitor)
  {
    this.mIsMonitor = paramFxIsMonitor;
  }
  
  public void setMediaType(int paramInt)
  {
    this.mMediaType = paramInt;
  }
  
  public void setOwnerContactName(String paramString)
  {
    this.mOwnerContactName = paramString;
  }
  
  public void setOwnerId(String paramString)
  {
    this.mOwnerId = paramString;
  }
  
  public void setRecipientStore(ArrayList paramArrayList)
  {
    this.mRecipientStore = paramArrayList;
  }
  
  public void setVoipCategory(FxVoipCategory paramFxVoipCategory)
  {
    this.mVoipCategory = paramFxVoipCategory;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxVoipCallRecordingEvent {");
    Object localObject1 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = getDirection();
    Object localObject2 = FxEventDirection.IN;
    if (localObject1 == localObject2)
    {
      localObject1 = localStringBuilder1.append(", Direction =");
      localObject2 = "IN";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      localObject1 = this.mRecipientStore;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.mRecipientStore;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (h)((Iterator)localObject2).next();
        localStringBuilder1.append(" FxRecipient {");
        StringBuilder localStringBuilder2 = localStringBuilder1.append("ContactName =");
        String str = ((h)localObject1).c();
        localStringBuilder2.append(str);
        localStringBuilder2 = localStringBuilder1.append(" Recipient =");
        localObject1 = ((h)localObject1).b();
        localStringBuilder2.append((String)localObject1);
        localObject1 = localStringBuilder1.append(" }");
        ((StringBuilder)localObject1).toString();
      }
      localObject1 = getDirection();
      localObject2 = FxEventDirection.OUT;
      if (localObject1 == localObject2)
      {
        localObject1 = localStringBuilder1.append(", Direction =");
        localObject2 = "OUT";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      else
      {
        localObject1 = getDirection();
        localObject2 = FxEventDirection.MISSED_CALL;
        if (localObject1 == localObject2)
        {
          localObject1 = localStringBuilder1.append(", Direction =");
          localObject2 = "MISSED CALL";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        else
        {
          localObject1 = localStringBuilder1.append(", Direction =");
          localObject2 = "Invalid";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
      }
    }
    localObject1 = localStringBuilder1.append(", Duration =");
    l = getDuration();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", VoipCategory =");
    localObject2 = this.mVoipCategory;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = localStringBuilder1.append(", OwnerId =");
    localObject2 = getOwnerId();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", OwnerContactName =");
    localObject2 = getOwnerContactName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", FileName =");
    localObject2 = getFileName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", MediaType =");
    int i = getMediaType();
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder1.append(", FilePath =");
    localObject2 = getFilePath();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    ((StringBuilder)localObject1).append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxVoipCallRecordingEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */