package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl
  implements ConnectivityManagerCompat.ConnectivityManagerCompatImpl
{
  public boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
  {
    boolean bool = true;
    NetworkInfo localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo == null) {}
    for (;;)
    {
      return bool;
      int i = localNetworkInfo.getType();
      switch (i)
      {
      case 0: 
      default: 
        break;
      case 1: 
        bool = false;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */