package com.vvt.callmanager.a;

import android.media.AudioManager;
import java.util.TimerTask;

class i
  extends TimerTask
{
  i(h paramh) {}
  
  public void run()
  {
    Object localObject = h.a(this.a);
    boolean bool1 = ((AudioManager)localObject).isMusicActive();
    boolean bool2 = h.b();
    if ((!bool2) || (bool1))
    {
      localObject = h.b(this.a);
      if (localObject != null)
      {
        h.b(this.a).a();
        localObject = this.a;
        ((h)localObject).a();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */