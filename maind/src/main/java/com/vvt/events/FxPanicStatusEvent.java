package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FxPanicStatusEvent
  extends FxEvent
{
  private boolean status;
  
  public FxEventType getEventType()
  {
    return FxEventType.PANIC_STATUS;
  }
  
  public boolean getStatus()
  {
    return this.status;
  }
  
  public void setStatus(boolean paramBoolean)
  {
    this.status = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxPanicGpsEvent {");
    Object localObject = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject).append(l);
    localObject = localStringBuilder1.append(", status =");
    boolean bool = getStatus();
    ((StringBuilder)localObject).append(bool);
    localObject = new java/util/Date;
    l = super.getEventTime();
    ((Date)localObject).<init>(l);
    StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
    localStringBuilder2.<init>();
    localStringBuilder2 = localStringBuilder2.append(" EventTime = ");
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd hh:mm:ss");
    localObject = localSimpleDateFormat.format((Date)localObject);
    localObject = (String)localObject;
    localStringBuilder1.append((String)localObject);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxPanicStatusEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */