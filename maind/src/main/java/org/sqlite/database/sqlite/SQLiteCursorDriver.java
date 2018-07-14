package org.sqlite.database.sqlite;

import android.database.Cursor;

public abstract interface SQLiteCursorDriver
{
  public abstract void cursorClosed();
  
  public abstract void cursorDeactivated();
  
  public abstract void cursorRequeried(Cursor paramCursor);
  
  public abstract Cursor query(SQLiteDatabase.CursorFactory paramCursorFactory, String[] paramArrayOfString);
  
  public abstract void setBindArguments(String[] paramArrayOfString);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteCursorDriver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */