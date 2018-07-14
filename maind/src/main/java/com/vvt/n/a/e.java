package com.vvt.n.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class e
  extends BroadcastReceiver
{
  private e(c paramc) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = c.c();
    if (bool) {}
    Thread localThread = new java/lang/Thread;
    Runnable localRunnable = c.a(this.a);
    localThread.<init>(localRunnable);
    localThread.start();
    bool = c.c();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */