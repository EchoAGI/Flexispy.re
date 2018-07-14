package com.fx.daemon.util;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;

public class a
  extends Thread
{
  private ConditionVariable a;
  private ContentObserver b;
  private ContentResolver c;
  private Looper d;
  private Uri e;
  
  public a(ContentResolver paramContentResolver, Uri paramUri, ConditionVariable paramConditionVariable)
  {
    this.c = paramContentResolver;
    this.e = paramUri;
    this.a = paramConditionVariable;
  }
  
  public void a()
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = this.b;
      if (localObject != null)
      {
        localObject = this.c;
        ContentObserver localContentObserver = this.b;
        ((ContentResolver)localObject).unregisterContentObserver(localContentObserver);
        localObject = null;
        this.b = null;
      }
    }
    localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((Looper)localObject).quit();
    }
  }
  
  public void run()
  {
    Looper.prepare();
    Object localObject1 = Looper.myLooper();
    this.d = ((Looper)localObject1);
    localObject1 = new com/fx/daemon/util/b;
    Object localObject2 = new android/os/Handler;
    ((Handler)localObject2).<init>();
    ((b)localObject1).<init>(this, (Handler)localObject2);
    this.b = ((ContentObserver)localObject1);
    localObject1 = this.c;
    localObject2 = this.e;
    ContentObserver localContentObserver = this.b;
    ((ContentResolver)localObject1).registerContentObserver((Uri)localObject2, false, localContentObserver);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/util/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */