package com.vvt.pushnotification.a.a;

import android.content.Context;

public class f
  implements d
{
  private static final boolean a = com.vvt.pushnotification.a.a;
  private static final boolean b = com.vvt.pushnotification.a.e;
  private c c;
  private d d;
  
  public f(boolean paramBoolean, Context paramContext)
  {
    Object localObject;
    if (paramBoolean)
    {
      localObject = new com/vvt/pushnotification/a/a/g;
      ((g)localObject).<init>(paramContext);
      this.c = ((c)localObject);
      localObject = (g)this.c;
      ((g)localObject).a(this);
    }
    for (;;)
    {
      return;
      localObject = new com/vvt/pushnotification/a/a/a;
      ((a)localObject).<init>(paramContext);
      this.c = ((c)localObject);
      localObject = (a)this.c;
      ((a)localObject).a(this);
    }
  }
  
  public void a(d paramd)
  {
    this.d = paramd;
  }
  
  public boolean a()
  {
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      c localc = this.c;
      bool1 = localc.a();
      boolean bool2 = a;
      if (bool2) {}
      return bool1;
    }
    finally {}
  }
  
  public void b()
  {
    try
    {
      boolean bool = a;
      if (bool) {}
      c localc = this.c;
      localc.b();
      bool = a;
      if (bool) {}
      return;
    }
    finally {}
  }
  
  /* Error */
  public boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	com/vvt/pushnotification/a/a/f:MyUncaughtExceptionHandler	Lcom/vvt/pushnotification/a/a/MyUncaughtExceptionHandler;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +31 -> 39
    //   11: aload_0
    //   12: getfield 34	com/vvt/pushnotification/a/a/f:MyUncaughtExceptionHandler	Lcom/vvt/pushnotification/a/a/MyUncaughtExceptionHandler;
    //   15: astore_1
    //   16: aload_1
    //   17: instanceof 29
    //   20: istore_2
    //   21: iload_2
    //   22: ifeq +17 -> 39
    //   25: iconst_1
    //   26: istore_2
    //   27: getstatic 18	com/vvt/pushnotification/a/a/f:a	Z
    //   30: istore_3
    //   31: iload_3
    //   32: ifeq +3 -> 35
    //   35: aload_0
    //   36: monitorexit
    //   37: iload_2
    //   38: ireturn
    //   39: iconst_0
    //   40: istore_2
    //   41: aconst_null
    //   42: astore_1
    //   43: goto -16 -> 27
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	f
    //   6	37	1	localc	MyUncaughtExceptionHandler
    //   46	4	1	localObject	Object
    //   20	21	2	bool1	boolean
    //   30	2	3	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	46	finally
    //   11	15	46	finally
    //   27	30	46	finally
  }
  
  public void d()
  {
    try
    {
      boolean bool = a;
      if (bool) {}
      c localc = this.c;
      localc.b();
      localc = this.c;
      localc.a();
      bool = a;
      if (bool) {}
      return;
    }
    finally {}
  }
  
  public void e()
  {
    boolean bool = a;
    if (bool) {}
    d locald = this.d;
    if (locald != null)
    {
      locald = this.d;
      locald.e();
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  public void f()
  {
    boolean bool = a;
    if (bool) {}
    d locald = this.d;
    if (locald != null)
    {
      locald = this.d;
      locald.f();
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = b;
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/a/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */