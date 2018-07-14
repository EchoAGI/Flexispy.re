package com.vvt.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class d
  extends BroadcastReceiver
{
  d(c paramc) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramIntent.getAction();
    String str = "android.intent.action.BATTERY_CHANGED";
    boolean bool1 = ((String)localObject).equals(str);
    if (bool1)
    {
      localObject = this.a;
      c.a((c)localObject, paramIntent);
    }
    for (;;)
    {
      return;
      str = "android.intent.action.BATTERY_LOW";
      bool1 = ((String)localObject).equals(str);
      if (bool1)
      {
        localObject = this.a;
        ((c)localObject).b(paramIntent);
      }
      else
      {
        str = "android.intent.action.BATTERY_OKAY";
        boolean bool2 = ((String)localObject).equals(str);
        if (bool2)
        {
          localObject = this.a;
          ((c)localObject).a(paramIntent);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/MyUncaughtExceptionHandler/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */