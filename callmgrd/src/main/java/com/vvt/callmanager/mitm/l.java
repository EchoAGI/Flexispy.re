package com.vvt.callmanager.mitm;

import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;

class l
{
  private l(j paramj) {}
  
  public boolean a()
  {
    CellLocation localCellLocation = j.a(this.a).getCellLocation();
    boolean bool2;
    if (localCellLocation != null)
    {
      boolean bool1 = localCellLocation instanceof GsmCellLocation;
      if (!bool1)
      {
        bool2 = localCellLocation instanceof CdmaCellLocation;
        if (!bool2) {}
      }
      else
      {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localCellLocation = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */