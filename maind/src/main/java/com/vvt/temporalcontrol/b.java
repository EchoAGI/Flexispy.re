package com.vvt.temporalcontrol;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.temporalcontrol.normal.NormalTaskScheduler;

public class b
{
  public static a a(RunningMode paramRunningMode, Context paramContext)
  {
    Object localObject = null;
    RunningMode localRunningMode = RunningMode.NORMAL;
    if (paramRunningMode != localRunningMode)
    {
      localRunningMode = RunningMode.LIMITED_1;
      if (paramRunningMode != localRunningMode) {}
    }
    else
    {
      localObject = new com/vvt/temporalcontrol/normal/NormalTaskScheduler;
      ((NormalTaskScheduler)localObject).<init>(paramContext);
    }
    for (;;)
    {
      return (a)localObject;
      localRunningMode = RunningMode.FULL;
      if (paramRunningMode == localRunningMode)
      {
        localObject = new com/vvt/temporalcontrol/b/a;
        ((com.vvt.temporalcontrol.b.a)localObject).<init>();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */