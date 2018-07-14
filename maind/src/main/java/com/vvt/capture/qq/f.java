package com.vvt.capture.qq;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;

public class f
  implements SQLiteDatabase.CursorFactory
{
  public Cursor newCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    d locald = new com/vvt/capture/qq/d;
    locald.<init>(paramSQLiteDatabase, paramSQLiteCursorDriver, paramString, paramSQLiteQuery, null);
    return locald;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */