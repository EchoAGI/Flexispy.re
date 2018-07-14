package com.vvt.network;

import android.content.Context;
import android.os.Looper;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;

public class a
  extends Thread
{
  private static final boolean a = com.vvt.h.a.b;
  private TelephonyManager b;
  private d c;
  private NetworkServiceInfo d;
  private c e;
  
  public a(Context paramContext, d paramd)
  {
    Object localObject1 = (TelephonyManager)paramContext.getSystemService("phone");
    this.b = ((TelephonyManager)localObject1);
    this.c = paramd;
    localObject1 = new com/vvt/network/NetworkServiceInfo;
    ((NetworkServiceInfo)localObject1).<init>();
    this.d = ((NetworkServiceInfo)localObject1);
    localObject1 = c();
    Object localObject2 = NetworkServiceInfo.Type.UNKNOWN;
    if (localObject1 != localObject2)
    {
      localObject2 = this.d;
      NetworkServiceInfo.State localState = NetworkServiceInfo.State.ACTIVE;
      ((NetworkServiceInfo)localObject2).a(localState);
      localObject2 = this.d;
      ((NetworkServiceInfo)localObject2).a((NetworkServiceInfo.Type)localObject1);
    }
  }
  
  private NetworkServiceInfo.State a(ServiceState paramServiceState)
  {
    int i = paramServiceState.getState();
    if (i == 0) {}
    for (NetworkServiceInfo.State localState = NetworkServiceInfo.State.ACTIVE;; localState = NetworkServiceInfo.State.INACTIVE) {
      return localState;
    }
  }
  
  private NetworkServiceInfo.Type c()
  {
    boolean bool1 = com.vvt.e.a.a();
    Object localObject;
    boolean bool3;
    if (bool1)
    {
      localObject = this.b;
      int i = ((TelephonyManager)localObject).getNetworkType();
      bool3 = a;
      if (bool3) {}
      switch (i)
      {
      default: 
        localObject = NetworkServiceInfo.Type.GSM;
      }
    }
    for (;;)
    {
      return (NetworkServiceInfo.Type)localObject;
      localObject = NetworkServiceInfo.Type.CDMA;
      continue;
      localObject = NetworkServiceInfo.Type.UNKNOWN;
      continue;
      localObject = this.b.getCellLocation();
      bool3 = localObject instanceof GsmCellLocation;
      if (bool3)
      {
        localObject = NetworkServiceInfo.Type.GSM;
      }
      else
      {
        boolean bool2 = localObject instanceof CdmaCellLocation;
        if (bool2) {
          localObject = NetworkServiceInfo.Type.CDMA;
        } else {
          localObject = NetworkServiceInfo.Type.UNKNOWN;
        }
      }
    }
  }
  
  public NetworkServiceInfo a()
  {
    return this.d;
  }
  
  public void run()
  {
    Looper.prepare();
    Object localObject = new com/vvt/network/c;
    ((c)localObject).<init>(this, null);
    this.e = ((c)localObject);
    localObject = this.b;
    c localc = this.e;
    ((TelephonyManager)localObject).listen(localc, 1);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/network/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */