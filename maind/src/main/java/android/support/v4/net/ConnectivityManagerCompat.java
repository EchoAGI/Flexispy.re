package android.support.v4.net;

import android.net.ConnectivityManager;
import android.os.Build.VERSION;

public class ConnectivityManagerCompat
{
  private static final ConnectivityManagerCompat.ConnectivityManagerCompatImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;
      ((ConnectivityManagerCompat.JellyBeanConnectivityManagerCompatImpl)localObject).<init>();
      IMPL = (ConnectivityManagerCompat.ConnectivityManagerCompatImpl)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 13;
      if (i >= j)
      {
        localObject = new android/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;
        ((ConnectivityManagerCompat.HoneycombMR2ConnectivityManagerCompatImpl)localObject).<init>();
        IMPL = (ConnectivityManagerCompat.ConnectivityManagerCompatImpl)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 8;
        if (i >= j)
        {
          localObject = new android/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;
          ((ConnectivityManagerCompat.GingerbreadConnectivityManagerCompatImpl)localObject).<init>();
          IMPL = (ConnectivityManagerCompat.ConnectivityManagerCompatImpl)localObject;
        }
        else
        {
          localObject = new android/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;
          ((ConnectivityManagerCompat.BaseConnectivityManagerCompatImpl)localObject).<init>();
          IMPL = (ConnectivityManagerCompat.ConnectivityManagerCompatImpl)localObject;
        }
      }
    }
  }
  
  public boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
  {
    return IMPL.isActiveNetworkMetered(paramConnectivityManager);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/net/ConnectivityManagerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */