package com.vvt.location;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

class h
  extends Thread
{
  private g b;
  private TimerTask c;
  private Timer d;
  
  private h(a parama) {}
  
  public void a()
  {
    boolean bool1 = false;
    String str = null;
    boolean bool2 = a.c();
    if (bool2) {}
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = this.c;
      ((TimerTask)localObject).cancel();
      this.c = null;
    }
    localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((Timer)localObject).cancel();
      this.d = null;
    }
    localObject = new java/io/File;
    str = a.f(this.a);
    ((File)localObject).<init>(str);
    bool1 = ((File)localObject).exists();
    if (bool1)
    {
      bool1 = a.c();
      if (bool1) {}
      ((File)localObject).delete();
    }
    localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((g)localObject).a();
      bool2 = a.c();
      if (!bool2) {}
    }
    bool2 = a.c();
    if (bool2) {}
  }
  
  public void run()
  {
    long l1 = 10000L;
    boolean bool = a.c();
    if (bool) {}
    bool = a.c();
    if (bool) {}
    Object localObject1 = new com/vvt/location/g;
    Object localObject2 = this.a;
    Object localObject3 = a.a(this.a);
    a locala1 = this.a;
    long l2 = a.b(locala1);
    ((g)localObject1).<init>((a)localObject2, (d)localObject3, l2);
    this.b = ((g)localObject1);
    this.b.setName("LocationListenerThread");
    localObject1 = this.b;
    localObject2 = a.c(this.a);
    ((g)localObject1).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
    this.b.start();
    localObject1 = this.a;
    long l3 = a.d((a)localObject1);
    bool = l3 < l1;
    if (bool)
    {
      localObject1 = this.a;
      a.a((a)localObject1, l1);
    }
    localObject1 = new com/vvt/location/i;
    ((i)localObject1).<init>(this);
    this.c = ((TimerTask)localObject1);
    bool = a.c();
    if (bool) {}
    localObject1 = new java/util/Timer;
    ((Timer)localObject1).<init>();
    this.d = ((Timer)localObject1);
    localObject1 = this.a;
    localObject2 = this.d;
    localObject3 = this.c;
    locala1 = this.a;
    l2 = a.d(locala1);
    a locala2 = this.a;
    l1 = a.d(locala2);
    a.a((a)localObject1, (Timer)localObject2, (TimerTask)localObject3, l2, l1);
    bool = a.c();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */