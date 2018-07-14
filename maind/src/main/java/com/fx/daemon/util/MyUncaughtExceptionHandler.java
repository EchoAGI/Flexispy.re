package com.fx.daemon.util;

import android.os.Process;
import com.vvt.ak.a;
import java.util.concurrent.Callable;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
  private static final boolean b = a.e;
  public String a;
  private Callable c;
  private String d;
  
  public MyUncaughtExceptionHandler(String paramString1, String paramString2, Callable paramCallable) {
    this.a = paramString1;
    this.d = paramString2;
    this.c = paramCallable;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable) {
    bool = b;
    if (bool) {}
    d.a(this.d, paramThrowable);
    Callable localCallable = this.c;
    if (localCallable != null) {}
    try
    {
      localCallable = this.c;
      localCallable.call();
    } catch (Exception localException) {
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/util/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */