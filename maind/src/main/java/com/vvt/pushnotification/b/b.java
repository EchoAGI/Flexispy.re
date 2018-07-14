package com.vvt.pushnotification.b;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b
{
  private static final boolean a = com.vvt.pushnotification.a.a;
  private int b = 6;
  private ScheduledExecutorService c;
  private a d;
  
  public b(a parama)
  {
    this.d = parama;
    ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
    localScheduledThreadPoolExecutor.<init>(1);
    this.c = localScheduledThreadPoolExecutor;
  }
  
  public void a()
  {
    int i = this.b;
    boolean bool;
    if (i > 0)
    {
      bool = a;
      if (bool) {}
      ScheduledExecutorService localScheduledExecutorService = this.c;
      c localc = new com/vvt/pushnotification/b/c;
      localc.<init>(this);
      int j = this.b;
      long l1 = j;
      int k = this.b;
      long l2 = k;
      TimeUnit localTimeUnit = TimeUnit.MINUTES;
      localScheduledExecutorService.scheduleAtFixedRate(localc, l1, l2, localTimeUnit);
    }
    for (;;)
    {
      return;
      bool = a;
      if (!bool) {}
    }
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    this.c.shutdownNow();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */