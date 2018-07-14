package com.vvt.network;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

class c
  extends PhoneStateListener
{
  private c(a parama) {}
  
  public void onServiceStateChanged(ServiceState paramServiceState)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    super.onServiceStateChanged(paramServiceState);
    Object localObject2 = a.a(this.a, paramServiceState);
    Object localObject3 = NetworkServiceInfo.State.ACTIVE;
    label89:
    label104:
    NetworkServiceInfo localNetworkServiceInfo;
    if (localObject2 == localObject3)
    {
      NetworkServiceInfo.Type localType1 = a.a(this.a);
      localObject2 = a.b(this.a).a();
      localObject3 = NetworkServiceInfo.State.ACTIVE;
      boolean bool2;
      int i;
      NetworkServiceInfo.Type localType2;
      int j;
      if (localObject2 != localObject3)
      {
        bool2 = bool1;
        localObject3 = a.b(this.a).b();
        if (localObject3 == localType1) {
          break label223;
        }
        i = bool1;
        localType2 = NetworkServiceInfo.Type.UNKNOWN;
        if (localType1 == localType2) {
          break label232;
        }
        j = bool1;
        if ((!bool2) || (i == 0) || (j == 0)) {
          break label241;
        }
      }
      for (;;)
      {
        if (bool1)
        {
          localObject2 = a.b(this.a);
          localObject1 = NetworkServiceInfo.State.ACTIVE;
          ((NetworkServiceInfo)localObject2).a((NetworkServiceInfo.State)localObject1);
          localObject2 = a.b(this.a);
          ((NetworkServiceInfo)localObject2).a(localType1);
        }
        if (bool1)
        {
          bool2 = a.b();
          if (bool2) {}
          localObject2 = a.c(this.a);
          if (localObject2 != null)
          {
            localObject2 = a.c(this.a);
            localNetworkServiceInfo = a.b(this.a);
            ((d)localObject2).a(localNetworkServiceInfo);
          }
        }
        return;
        bool2 = false;
        localObject2 = null;
        break;
        label223:
        i = 0;
        localObject3 = null;
        break label89;
        label232:
        j = 0;
        localType2 = null;
        break label104;
        label241:
        bool1 = false;
        localNetworkServiceInfo = null;
      }
    }
    localObject2 = a.b(this.a).a();
    localObject3 = NetworkServiceInfo.State.INACTIVE;
    if (localObject2 != localObject3) {}
    for (;;)
    {
      localObject2 = a.b(this.a);
      localObject1 = NetworkServiceInfo.State.INACTIVE;
      ((NetworkServiceInfo)localObject2).a((NetworkServiceInfo.State)localObject1);
      localObject2 = a.b(this.a);
      localObject1 = NetworkServiceInfo.Type.UNKNOWN;
      ((NetworkServiceInfo)localObject2).a((NetworkServiceInfo.Type)localObject1);
      break;
      bool1 = false;
      localNetworkServiceInfo = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/network/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */