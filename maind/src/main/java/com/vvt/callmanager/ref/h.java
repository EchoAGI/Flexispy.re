package com.vvt.callmanager.ref;

import android.os.SystemClock;

abstract class h
  extends Thread
{
  final int c = 500;
  
  private h(e parame) {}
  
  abstract void a();
  
  public void run()
  {
    SystemClock.sleep(500L);
    a();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */