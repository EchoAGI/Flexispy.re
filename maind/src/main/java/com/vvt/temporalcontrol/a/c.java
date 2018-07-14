package com.vvt.temporalcontrol.a;

import android.os.Looper;

class c
  implements com.vvt.a.c
{
  c(a parama) {}
  
  public void a(String paramString)
  {
    boolean bool = a.d();
    if (bool) {}
    Object localObject = a.b(this.a);
    if (localObject != null)
    {
      localObject = a.b(this.a);
      ((d)localObject).b();
    }
    a.a(this.a, paramString);
    localObject = a.c(this.a);
    if (localObject != null)
    {
      localObject = a.c(this.a);
      ((Looper)localObject).quit();
    }
  }
  
  public void b(String paramString)
  {
    boolean bool1 = a.c();
    if (bool1) {}
    Object localObject = a.b(this.a);
    if (localObject != null)
    {
      localObject = a.b(this.a);
      ((d)localObject).a();
    }
    long l1 = System.currentTimeMillis();
    a locala = this.a;
    long l2 = a.d(locala);
    l1 -= l2;
    l2 = 1000L;
    l1 /= l2;
    boolean bool2 = a.c();
    if (bool2) {}
    locala = this.a;
    a.a(locala, paramString, l1);
    localObject = a.c(this.a);
    if (localObject != null)
    {
      localObject = a.c(this.a);
      ((Looper)localObject).quit();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */