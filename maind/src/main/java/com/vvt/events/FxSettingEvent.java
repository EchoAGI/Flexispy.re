package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;
import java.util.Iterator;

public class FxSettingEvent
  extends FxEvent
{
  private ArrayList mSettingElements;
  
  public FxSettingEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mSettingElements = localArrayList;
  }
  
  public void addSettingElement(i parami)
  {
    this.mSettingElements.add(parami);
  }
  
  public void deleteSettingElement(int paramInt)
  {
    this.mSettingElements.remove(paramInt);
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.SETTINGS;
  }
  
  public i getSettingElement(int paramInt)
  {
    return (i)this.mSettingElements.get(paramInt);
  }
  
  public int getSettingElementCount()
  {
    return this.mSettingElements.size();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxSettingEvent {");
    Object localObject = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject).append(l);
    localObject = this.mSettingElements;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (i)localIterator.next();
      StringBuilder localStringBuilder2 = localStringBuilder1.append(" element =");
      localObject = ((i)localObject).toString();
      localStringBuilder2.append((String)localObject);
    }
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxSettingEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */