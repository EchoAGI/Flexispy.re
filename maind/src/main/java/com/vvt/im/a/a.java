package com.vvt.im.a;

import android.os.ConditionVariable;
import java.net.URL;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private static boolean d;
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    bool2 = a;
    if (bool2) {}
    d = false;
    ConditionVariable localConditionVariable = new android/os/ConditionVariable;
    localConditionVariable.<init>();
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString1);
      Thread localThread = new java/lang/Thread;
      b localb = new com/vvt/im/a/b;
      localb.<init>(paramString1, localURL, paramString2, localConditionVariable);
      localThread.<init>(localb);
      localThread.start();
      long l = 180000L;
      bool2 = localConditionVariable.block(l);
      if (bool2) {
        bool1 = d;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = b;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */