package com.vvt.pushnotification.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g
  extends e
{
  private Handler a = null;
  private Runnable b = null;
  private boolean c = false;
  private boolean d = false;
  private int e = 0;
  private final List f;
  
  public g(Context paramContext)
  {
    super(paramContext);
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.f = ((List)localObject);
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    this.a = ((Handler)localObject);
  }
  
  private void b(d paramd)
  {
    for (;;)
    {
      try
      {
        i = this.e;
        j = 1;
        if (i == j)
        {
          paramd.e();
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        int j;
        continue;
      }
      i = this.e;
      j = -1;
      if (i == j) {
        paramd.f();
      }
    }
  }
  
  private void c()
  {
    int i = this.c;
    i locali;
    if (i != 0)
    {
      i = 0;
      locali = null;
      this.b = null;
      return;
    }
    boolean bool = d();
    label30:
    Handler localHandler;
    Runnable localRunnable;
    if (bool)
    {
      i = 1;
      int k = this.e;
      if (k != i)
      {
        this.e = i;
        e();
      }
      locali = new com/vvt/pushnotification/a/a/i;
      locali.<init>(this);
      this.b = locali;
      localHandler = this.a;
      localRunnable = this.b;
      if (!bool) {
        break label106;
      }
    }
    label106:
    for (int j = 300000;; j = 180000)
    {
      long l = j;
      localHandler.postDelayed(localRunnable, l);
      break;
      j = -1;
      break label30;
    }
  }
  
  private void e()
  {
    Object localObject = this.f;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (d)localIterator.next();
      b((d)localObject);
    }
  }
  
  public void a(d paramd)
  {
    this.f.add(paramd);
    b(paramd);
  }
  
  public boolean a()
  {
    int i = 1;
    for (;;)
    {
      try
      {
        int j = this.d;
        if (j != 0) {
          return i;
        }
        j = 0;
        Thread localThread = null;
        this.c = false;
        j = 1;
        this.d = j;
        j = d();
        if (j != 0)
        {
          j = i;
          this.e = j;
          localThread = new java/lang/Thread;
          h localh = new com/vvt/pushnotification/a/a/h;
          localh.<init>(this);
          localThread.<init>(localh);
          localThread.start();
        }
        else
        {
          int k = -1;
        }
      }
      finally {}
    }
  }
  
  public void b()
  {
    boolean bool = true;
    try
    {
      this.c = bool;
      bool = false;
      Handler localHandler = null;
      this.d = false;
      bool = false;
      localHandler = null;
      this.e = 0;
      localHandler = this.a;
      Runnable localRunnable = this.b;
      localHandler.removeCallbacks(localRunnable);
      return;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/a/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */