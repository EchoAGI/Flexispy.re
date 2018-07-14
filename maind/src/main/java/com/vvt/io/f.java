package com.vvt.io;

import android.os.Handler;
import android.os.Message;

class f
  extends Handler
{
  f(e parame) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    boolean bool2 = FxFileObserver.c();
    if (bool2) {}
    try
    {
      Object localObject = this.a;
      localObject = ((e)localObject).a;
      localObject = FxFileObserver.a((FxFileObserver)localObject);
      ((g)localObject).a(i);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = FxFileObserver.d();
        if (!bool1) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */