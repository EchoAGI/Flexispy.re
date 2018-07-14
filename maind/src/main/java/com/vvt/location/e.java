package com.vvt.location;

import android.os.ConditionVariable;
import java.util.TimerTask;

class e
  extends TimerTask
{
  private ConditionVariable b;
  private g c;
  private boolean d;
  
  private e(a parama) {}
  
  public boolean cancel()
  {
    boolean bool = a.c();
    if (bool) {}
    bool = true;
    this.d = bool;
    Object localObject = this.b;
    if (localObject != null)
    {
      bool = a.c();
      if (bool) {}
      this.b.open();
      bool = false;
      localObject = null;
      this.b = null;
    }
    localObject = this.c;
    if (localObject != null)
    {
      localObject = this.c;
      ((g)localObject).a();
      bool = a.c();
      if (!bool) {}
    }
    return super.cancel();
  }
  
  public void run()
  {
    boolean bool = a.c();
    if (bool) {}
    this.d = false;
    bool = a.c();
    if (bool) {}
    Object localObject1 = new com/vvt/location/g;
    Object localObject2 = this.a;
    d locald = a.a(this.a);
    a locala = this.a;
    long l1 = a.b(locala);
    ((g)localObject1).<init>((a)localObject2, locald, l1);
    this.c = ((g)localObject1);
    localObject1 = this.c;
    localObject2 = a.c(this.a);
    ((g)localObject1).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
    localObject1 = this.c;
    ((g)localObject1).start();
    bool = a.c();
    if (bool) {}
    localObject1 = new android/os/ConditionVariable;
    ((ConditionVariable)localObject1).<init>(false);
    this.b = ((ConditionVariable)localObject1);
    localObject1 = this.b;
    localObject2 = this.a;
    long l2 = a.g((a)localObject2);
    ((ConditionVariable)localObject1).block(l2);
    this.b = null;
    bool = a.c();
    if (bool) {}
    localObject1 = this.c;
    if (localObject1 != null)
    {
      localObject1 = this.c;
      ((g)localObject1).a();
      this.c = null;
    }
    bool = this.d;
    if (!bool)
    {
      bool = a.c();
      if (bool) {}
      localObject1 = this.a;
      a.e((a)localObject1);
    }
    bool = a.c();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */