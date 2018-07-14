package com.vvt.location;

import android.os.Looper;
import com.vvt.http.a;
import com.vvt.http.d;
import com.vvt.http.request.b;

class m
  extends Thread
{
  private b a;
  private d b;
  
  public m(b paramb, d paramd)
  {
    this.a = paramb;
    this.b = paramd;
  }
  
  public void a()
  {
    Looper localLooper = Looper.myLooper();
    if (localLooper != null) {
      localLooper.quit();
    }
  }
  
  public void run()
  {
    Looper.prepare();
    a locala = new com/vvt/http/a;
    locala.<init>();
    b localb = this.a;
    d locald = this.b;
    locala.a(localb, locald);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */