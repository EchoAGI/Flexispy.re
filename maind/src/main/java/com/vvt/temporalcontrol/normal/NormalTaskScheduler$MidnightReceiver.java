package com.vvt.temporalcontrol.normal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vvt.temporalcontrol.c;

public class NormalTaskScheduler$MidnightReceiver
  extends BroadcastReceiver
{
  public NormalTaskScheduler$MidnightReceiver(NormalTaskScheduler paramNormalTaskScheduler) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = NormalTaskScheduler.e();
    if (bool) {}
    c localc = NormalTaskScheduler.e(this.a);
    if (localc != null)
    {
      localc = NormalTaskScheduler.e(this.a);
      localc.a();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/normal/NormalTaskScheduler$MidnightReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */