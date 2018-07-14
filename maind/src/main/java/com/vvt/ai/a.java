package com.vvt.ai;

public class a
{
  public static boolean a(Thread paramThread, long paramLong)
  {
    paramThread.start();
    long l1 = System.currentTimeMillis() + paramLong;
    boolean bool1 = paramThread.isAlive();
    long l2;
    if (bool1)
    {
      l2 = System.currentTimeMillis();
      bool1 = l2 < l1;
      if (!bool1) {}
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      return bool2;
      l2 = 500L;
      try
      {
        Thread.sleep(l2);
      }
      catch (InterruptedException localInterruptedException) {}
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ai/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */