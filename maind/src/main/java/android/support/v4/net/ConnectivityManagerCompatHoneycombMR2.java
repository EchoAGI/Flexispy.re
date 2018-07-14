package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompatHoneycombMR2
{
  public static boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
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
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 8: 
      default: 
        break;
      case 1: 
      case 7: 
      case 9: 
        bool = false;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/net/ConnectivityManagerCompatHoneycombMR2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */