package com.vvt.appengine;

import com.vvt.ak.a;
import com.vvt.io.d;
import com.vvt.io.p;
import java.io.File;

public class AppStartUpHandler {
    public enum AppStartUpMethod {
        START_STICKY,
        ALARM_MANAGER,
        PHONE_STATE,
        USER_PRESENT,
        BOOT_COMPLETED,
        SMS_RECEIVED,
        STARTUP_SCRIPT
    }

    private static final String a = AppStartUpHandler.class.getSimpleName();
    private static final boolean b = a.a;
    private static final boolean c = a.e;

    public static String a(String paramString) {
        boolean bool1 = b;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        bool1 = false;
        String str1 = null;
        for (;;) {
            try {
                str2 = p.a(paramString, str2);
                boolean bool2 = b;
                if (bool2) {}
                File localFile = new java.io.File("app_start_up_method");
                bool2 = localFile.exists();
                if (!bool2) {
                    continue;
                }
                str1 = d.d(str2);
                bool3 = b;
                if (!bool3) {}
            } catch (Exception e) {
                boolean bool3 = c;
                if (!bool3) {
                    continue;
                }
                continue;
            }

            bool3 = b;
            if (bool3) {}
            return str1;
            bool3 = b;
            if (!bool3) {}
        }
    }

    public static void a(String paramString, AppStartUpHandler.AppStartUpMethod paramAppStartUpMethod) {
        try {
            byte[] localObject = paramAppStartUpMethod.toString().getBytes("UTF-8");
            d.a(localObject , paramString, "app_start_up_method");
        } catch (Exception e) {
        }
    }

    public static void removeFromPath(String path) {
        File localFile = new java.io.File(path, "app_start_up_method");
        localFile.delete();
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/AppStartUpHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */