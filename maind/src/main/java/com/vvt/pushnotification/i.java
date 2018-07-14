package com.vvt.pushnotification;

import com.codebutler.android_websockets.e;
import java.util.concurrent.CountDownLatch;

class i
  implements e
{
  i(h paramh) {}
  
  public void a()
  {
    boolean bool = h.g();
    if (bool) {}
    CountDownLatch localCountDownLatch = h.a(this.a);
    if (localCountDownLatch != null)
    {
      localCountDownLatch = h.a(this.a);
      localCountDownLatch.countDown();
    }
  }
  
  public void a(int paramInt, String paramString, Exception paramException)
  {
    boolean bool = h.h();
    if (bool) {}
    Object localObject = h.a(this.a);
    if (localObject != null)
    {
      h.a(this.a, paramException);
      localObject = h.a(this.a);
      ((CountDownLatch)localObject).countDown();
    }
    for (;;)
    {
      return;
      if (paramException != null)
      {
        localObject = this.a;
        h.a((h)localObject, paramException);
      }
    }
  }
  
  public void a(Exception paramException)
  {
    boolean bool = h.h();
    if (bool) {}
    CountDownLatch localCountDownLatch = h.a(this.a);
    if (localCountDownLatch != null)
    {
      h.a(this.a, paramException);
      localCountDownLatch = h.a(this.a);
      localCountDownLatch.countDown();
    }
  }
  
  public void a(String paramString)
  {
    boolean bool = h.g();
    if (bool) {}
    this.a.a(paramString);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    boolean bool = h.g();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */