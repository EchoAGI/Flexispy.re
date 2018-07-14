package com.vvt.io;

import android.os.FileObserver;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

class h
  extends FileObserver
{
  private Handler b;
  private FxFileObserver.ObservingMode c;
  private String d;
  private String e;
  private Timer f;
  private TimerTask g;
  private boolean h = true;
  private int i = -1;
  private long j = 0L;
  
  public h(FxFileObserver paramFxFileObserver, String paramString1, String paramString2, FxFileObserver.ObservingMode paramObservingMode, Handler paramHandler)
  {
    super(paramString2);
    this.d = paramString2;
    this.e = paramString1;
    this.c = paramObservingMode;
    this.b = paramHandler;
  }
  
  private void a()
  {
    int k = this.i;
    if (k > 0)
    {
      Handler localHandler = this.b;
      int m = this.i;
      localHandler.sendEmptyMessage(m);
      k = -1;
      this.i = k;
      long l = 0L;
      this.j = l;
    }
  }
  
  private void a(int paramInt)
  {
    boolean bool1 = FxFileObserver.c();
    if (bool1) {}
    bool1 = FxFileObserver.c();
    if (bool1) {}
    Object localObject = this.c;
    FxFileObserver.ObservingMode localObservingMode = FxFileObserver.ObservingMode.MODE_ALL_NOTIFY;
    if (localObject == localObservingMode)
    {
      localObject = this.b;
      ((Handler)localObject).sendEmptyMessage(paramInt);
    }
    for (;;)
    {
      bool1 = FxFileObserver.c();
      if (bool1) {}
      return;
      localObject = this.c;
      localObservingMode = FxFileObserver.ObservingMode.MODE_MINIMUM_NOTIFY;
      if (localObject == localObservingMode)
      {
        int k = this.i;
        boolean bool3;
        if (k > 0)
        {
          boolean bool2 = FxFileObserver.c();
          if (bool2) {}
          int m = this.i;
          if (m != paramInt)
          {
            bool3 = FxFileObserver.c();
            if (bool3) {}
            bool3 = FxFileObserver.c();
            if (bool3) {}
            a();
            bool3 = FxFileObserver.c();
            if (bool3) {}
            b(paramInt);
          }
          else
          {
            bool3 = FxFileObserver.c();
            if (bool3) {}
            long l1 = b();
            boolean bool4 = FxFileObserver.c();
            if (bool4) {}
            long l2 = 0L;
            bool4 = l1 < l2;
            if (!bool4)
            {
              bool3 = FxFileObserver.c();
              if (bool3) {}
              a();
            }
            else
            {
              bool4 = FxFileObserver.c();
              if (bool4) {}
              a(l1);
            }
          }
        }
        else
        {
          bool3 = FxFileObserver.c();
          if (bool3) {}
          b(paramInt);
        }
      }
    }
  }
  
  private void a(long paramLong)
  {
    try
    {
      c();
      Object localObject1 = new com/vvt/io/i;
      ((i)localObject1).<init>(this);
      this.g = ((TimerTask)localObject1);
      localObject1 = new java/util/Timer;
      ((Timer)localObject1).<init>();
      this.f = ((Timer)localObject1);
      localObject1 = this.f;
      TimerTask localTimerTask = this.g;
      ((Timer)localObject1).schedule(localTimerTask, paramLong);
      boolean bool = FxFileObserver.c();
      if (bool) {}
      return;
    }
    finally {}
  }
  
  private long b()
  {
    long l1 = System.currentTimeMillis();
    long l2 = this.j;
    l1 -= l2;
    return 3000L - l1;
  }
  
  private void b(int paramInt)
  {
    this.i = paramInt;
    long l = System.currentTimeMillis();
    this.j = l;
    l = b();
    a(l);
    boolean bool = FxFileObserver.c();
    if (bool) {}
  }
  
  private void c()
  {
    try
    {
      Object localObject1 = this.g;
      if (localObject1 != null)
      {
        localObject1 = this.g;
        ((TimerTask)localObject1).cancel();
        localObject1 = null;
        this.g = null;
      }
      localObject1 = this.f;
      if (localObject1 != null)
      {
        localObject1 = this.f;
        ((Timer)localObject1).cancel();
        localObject1 = null;
        this.f = null;
      }
      return;
    }
    finally {}
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = this.h;
    if (!bool2) {
      return;
    }
    c();
    bool2 = FxFileObserver.c();
    if (bool2) {}
    Object localObject = this.e;
    String str = this.d;
    bool2 = ((String)localObject).equals(str);
    if (bool2)
    {
      localObject = this.a;
      int k = FxFileObserver.b((FxFileObserver)localObject);
      if (k > 0)
      {
        localObject = this.a;
        k = FxFileObserver.b((FxFileObserver)localObject) & paramInt;
        if (k == 0) {
          break label124;
        }
      }
    }
    for (;;)
    {
      if (bool1) {
        a(paramInt);
      }
      bool1 = this.h;
      if (!bool1) {
        break;
      }
      FxFileObserver localFxFileObserver = this.a;
      FxFileObserver.c(localFxFileObserver);
      break;
      label124:
      bool1 = false;
      localFxFileObserver = null;
    }
  }
  
  public void stopWatching()
  {
    c();
    this.h = false;
    super.stopWatching();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */