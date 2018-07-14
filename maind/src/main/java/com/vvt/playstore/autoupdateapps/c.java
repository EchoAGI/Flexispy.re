package com.vvt.playstore.autoupdateapps;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class c
  extends TimerTask
{
  c(b paramb) {}
  
  public void run()
  {
    boolean bool1 = b.e();
    if (bool1) {}
    Object localObject = b.a(this.a);
    String str1 = "power";
    localObject = (PowerManager)((Context)localObject).getSystemService(str1);
    boolean bool2 = ((PowerManager)localObject).isScreenOn();
    bool1 = b.e();
    if (bool1) {}
    localObject = b.a(this.a);
    String str2 = "activity";
    localObject = ((ActivityManager)((Context)localObject).getSystemService(str2)).getRunningTasks(1);
    boolean bool3 = b.e();
    if (bool3) {}
    localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity.getPackageName();
    bool3 = b.e();
    if (bool3) {}
    str2 = "com.android.vending";
    bool3 = ((String)localObject).equalsIgnoreCase(str2);
    if (!bool3)
    {
      str2 = "com.google.android.gsf.login";
      bool1 = ((String)localObject).equalsIgnoreCase(str2);
      if (!bool1) {}
    }
    else if (bool2)
    {
      bool1 = b.e();
      if (!bool1) {}
    }
    for (;;)
    {
      return;
      bool1 = b.e();
      if (bool1) {}
      b.b(this.a).cancel();
      localObject = this.a;
      bool1 = ((b)localObject).d();
      if (bool1)
      {
        localObject = this.a;
        ((b)localObject).a(false);
      }
      localObject = this.a;
      bool2 = false;
      str1 = null;
      b.a((b)localObject, null);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/playstore/autoupdateapps/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */