package com.fx.psysd;

import android.os.SystemClock;

class b
  implements Runnable
{
  b(SystemDaemomMain paramSystemDaemomMain) {}
  
  public void run()
  {
    SystemClock.sleep(1000L);
    SystemDaemomMain.b(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/psysd/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */