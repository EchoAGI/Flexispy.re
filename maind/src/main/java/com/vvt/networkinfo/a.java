package com.vvt.networkinfo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class a
{
  private Context a;
  
  public a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static boolean a(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public DataConnectionType a()
  {
    Object localObject = this.a;
    String str = "connectivity";
    localObject = ((ConnectivityManager)((Context)localObject).getSystemService(str)).getActiveNetworkInfo();
    if (localObject != null)
    {
      boolean bool = ((NetworkInfo)localObject).isAvailable();
      if (bool)
      {
        bool = ((NetworkInfo)localObject).isConnectedOrConnecting();
        if (bool)
        {
          bool = a(((NetworkInfo)localObject).getType());
          if (bool) {
            localObject = DataConnectionType.MOBILE_DATA;
          }
        }
      }
    }
    for (;;)
    {
      return (DataConnectionType)localObject;
      int i = ((NetworkInfo)localObject).getType();
      int j = 1;
      if (i != j)
      {
        int k = ((NetworkInfo)localObject).getType();
        i = 9;
        if (k != i) {}
      }
      else
      {
        localObject = DataConnectionType.WIFI;
        continue;
      }
      localObject = DataConnectionType.NONE;
      continue;
      localObject = DataConnectionType.NONE;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/networkinfo/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */