package com.vvt.callmanager.a;

import android.media.AudioManager;
import android.os.Looper;
import java.util.Timer;
import java.util.TimerTask;

public class a
  extends Thread
{
  private AudioManager a;
  private Looper b;
  private c c;
  private Timer d;
  private TimerTask e;
  private int f;
  
  public a(AudioManager paramAudioManager, c paramc)
  {
    this.a = paramAudioManager;
    this.c = paramc;
    int i = this.a.getMode();
    this.f = i;
  }
  
  public void a()
  {
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((TimerTask)localObject).cancel();
      this.e = null;
    }
    localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((Timer)localObject).cancel();
      this.d = null;
    }
    localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Looper)localObject).quit();
    }
  }
  
  public void run()
  {
    long l = 1000L;
    Looper.prepare();
    Object localObject = Looper.myLooper();
    this.b = ((Looper)localObject);
    localObject = new com/vvt/callmanager/a/b;
    ((b)localObject).<init>(this);
    this.e = ((TimerTask)localObject);
    localObject = new java/util/Timer;
    ((Timer)localObject).<init>();
    this.d = ((Timer)localObject);
    localObject = this.d;
    TimerTask localTimerTask = this.e;
    ((Timer)localObject).schedule(localTimerTask, l, l);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */