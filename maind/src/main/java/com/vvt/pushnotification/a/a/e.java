package com.vvt.pushnotification.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public abstract class e
  implements c
{
  private ConnectivityManager a;
  
  public e(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.a = localConnectivityManager;
  }
  
  public boolean d()
  {
    boolean bool1 = false;
    try
    {
      Object localObject = this.a;
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject != null)
      {
        boolean bool2 = ((NetworkInfo)localObject).isConnected();
        if (bool2) {
          bool1 = true;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/a/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */