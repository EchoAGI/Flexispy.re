package com.vvt.location;

import java.io.File;
import java.util.Timer;

class f
  extends Thread
{
  private e b;
  private Timer c;
  
  private f(a parama) {}
  
  public void a()
  {
    boolean bool1 = false;
    String str = null;
    boolean bool2 = a.c();
    if (bool2) {}
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((e)localObject).cancel();
      this.b = null;
    }
    localObject = this.c;
    if (localObject != null)
    {
      localObject = this.c;
      ((Timer)localObject).cancel();
      this.c = null;
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
    bool2 = a.c();
    if (bool2) {}
  }
  
  public void run()
  {
    long l1 = a.d(this.a);
    long l2 = a.g(this.a);
    long l3 = l1 - l2;
    Object localObject1 = new com/vvt/location/e;
    Object localObject2 = this.a;
    e locale = null;
    ((e)localObject1).<init>((a)localObject2, null);
    this.b = ((e)localObject1);
    boolean bool = a.c();
    if (bool) {}
    localObject1 = new java/util/Timer;
    ((Timer)localObject1).<init>();
    this.c = ((Timer)localObject1);
    localObject1 = this.a;
    localObject2 = this.c;
    locale = this.b;
    long l4 = a.d(this.a);
    a.a((a)localObject1, (Timer)localObject2, locale, l3, l4);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */