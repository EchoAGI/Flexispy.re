package com.vvt.aj;

import android.os.SystemClock;

public abstract class a
  extends Thread
{
  private static final boolean a = com.vvt.ak.a.a;
  private final String b;
  private final long c;
  private boolean d = false;
  
  public a(String paramString, long paramLong)
  {
    this.b = paramString;
    this.c = paramLong;
  }
  
  private final void a(long paramLong)
  {
    long l1 = 1000L;
    long l2 = paramLong * l1;
    l2 -= l1;
    SystemClock.sleep(l1);
    boolean bool1 = a;
    if (bool1) {}
    bool1 = this.d;
    boolean bool2;
    if (bool1)
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      return;
      long l3 = 0L;
      bool1 = l2 < l3;
      if (bool1) {
        break;
      }
      bool2 = this.d;
      if (!bool2)
      {
        a();
      }
      else
      {
        bool2 = a;
        if (!bool2) {}
      }
    }
  }
  
  public abstract void a();
  
  public final void b()
  {
    this.d = true;
  }
  
  public void run()
  {
    this.d = false;
    long l = this.c;
    a(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/aj/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */