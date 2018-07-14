package com.vvt.callmanager.a;

import android.media.AudioManager;
import java.util.TimerTask;

class b
  extends TimerTask
{
  b(a parama) {}
  
  public void run()
  {
    c localc = a.a(this.a);
    if (localc != null)
    {
      localc = a.a(this.a);
      AudioManager localAudioManager = a.b(this.a);
      int i = localAudioManager.getMode();
      localc.a(i);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */