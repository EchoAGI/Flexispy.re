package com.vvt.callmanager.mitm;

class f
  implements Thread.UncaughtExceptionHandler
{
  f(MitmManager paramMitmManager) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    boolean bool = MitmManager.d();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/Mitm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */