package com.vvt.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class d
  implements LocationListener
{
  private Location b;
  
  private d(a parama) {}
  
  public Location a()
  {
    return this.b;
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    this.b = paramLocation;
    boolean bool = a.d();
    if ((bool) && (paramLocation != null))
    {
      bool = a.d();
      if (!bool) {}
    }
  }
  
  public void onProviderDisabled(String paramString)
  {
    boolean bool = a.d();
    if (bool) {}
  }
  
  public void onProviderEnabled(String paramString)
  {
    boolean bool = a.d();
    if (bool) {}
  }
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
    boolean bool = a.d();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */