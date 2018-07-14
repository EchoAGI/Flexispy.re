package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxBrowserUrlEvent
  extends FxEvent
{
  boolean isBlocked;
  private String owningApp;
  private String title;
  private String url;
  private long visitTimeMs;
  
  public FxEventType getEventType()
  {
    return FxEventType.BROWSER_URL;
  }
  
  public String getOwningApp()
  {
    return this.owningApp;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public long getVisitTimeMs()
  {
    return this.visitTimeMs;
  }
  
  public boolean isBlocked()
  {
    return this.isBlocked;
  }
  
  public void setBlocked(boolean paramBoolean)
  {
    this.isBlocked = paramBoolean;
  }
  
  public void setOwningApp(String paramString)
  {
    this.owningApp = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
  
  public void setVisitTimeMs(long paramLong)
  {
    this.visitTimeMs = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxBrowserUrlEvent {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", title =");
    String str = this.title;
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", url =");
    str = this.url;
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", visitTimeMs =");
    l = this.visitTimeMs;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", isBlocked =");
    boolean bool = this.isBlocked;
    localStringBuilder2.append(bool);
    localStringBuilder2 = localStringBuilder1.append(", owningApp =");
    str = this.owningApp;
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    localStringBuilder2.append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxBrowserUrlEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */