package com.vvt.capture.telegram.internal.SQLite;

import com.vvt.ak.a;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class SQLitePreparedStatement
{
  private static final boolean LOGE = a.e;
  private static final String TAG = SQLiteDatabaseNative.class.getSimpleName();
  private static HashMap hashMap;
  private boolean finalizeAfterQuery = false;
  private boolean isFinalized = false;
  private int queryArgsCount;
  private int sqliteStatementHandle;
  
  public SQLitePreparedStatement(SQLiteDatabaseNative paramSQLiteDatabaseNative, String paramString, boolean paramBoolean)
  {
    this.finalizeAfterQuery = paramBoolean;
    int i = paramSQLiteDatabaseNative.getSQLiteHandle();
    i = prepare(i, paramString);
    this.sqliteStatementHandle = i;
  }
  
  native void bindByteBuffer(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3);
  
  public void bindByteBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    int i = this.sqliteStatementHandle;
    int j = paramByteBuffer.limit();
    bindByteBuffer(i, paramInt, paramByteBuffer, j);
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    int i = this.sqliteStatementHandle;
    bindDouble(i, paramInt, paramDouble);
  }
  
  native void bindDouble(int paramInt1, int paramInt2, double paramDouble);
  
  native void bindInt(int paramInt1, int paramInt2, int paramInt3);
  
  public void bindInteger(int paramInt1, int paramInt2)
  {
    int i = this.sqliteStatementHandle;
    bindInt(i, paramInt1, paramInt2);
  }
  
  native void bindLong(int paramInt1, int paramInt2, long paramLong);
  
  public void bindLong(int paramInt, long paramLong)
  {
    int i = this.sqliteStatementHandle;
    bindLong(i, paramInt, paramLong);
  }
  
  native void bindNull(int paramInt1, int paramInt2);
  
  native void bindString(int paramInt1, int paramInt2, String paramString);
  
  public void bindString(int paramInt, String paramString)
  {
    int i = this.sqliteStatementHandle;
    bindString(i, paramInt, paramString);
  }
  
  void checkFinalized()
  {
    boolean bool = this.isFinalized;
    if (bool)
    {
      SQLiteException localSQLiteException = new com/vvt/capture/telegram/internal/SQLite/SQLiteException;
      localSQLiteException.<init>("Prepared query finalized");
      throw localSQLiteException;
    }
  }
  
  public void dispose()
  {
    boolean bool = this.finalizeAfterQuery;
    if (bool) {
      finalizeQuery();
    }
  }
  
  native void finalize(int paramInt);
  
  public void finalizeQuery()
  {
    boolean bool1 = this.isFinalized;
    if (bool1) {}
    for (;;)
    {
      return;
      bool1 = true;
      boolean bool2;
      try
      {
        this.isFinalized = bool1;
        int i = this.sqliteStatementHandle;
        finalize(i);
      }
      catch (SQLiteException localSQLiteException)
      {
        bool2 = LOGE;
      }
      if (!bool2) {}
    }
  }
  
  public int getStatementHandle()
  {
    return this.sqliteStatementHandle;
  }
  
  native int prepare(int paramInt, String paramString);
  
  public SQLiteCursorNative query(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null)
    {
      i = paramArrayOfObject.length;
      j = this.queryArgsCount;
      if (i == j) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    checkFinalized();
    int i = this.sqliteStatementHandle;
    reset(i);
    int k = paramArrayOfObject.length;
    i = 0;
    Object localObject = null;
    int m = 1;
    int j = 0;
    if (j < k)
    {
      localObject = paramArrayOfObject[j];
      if (localObject == null)
      {
        i = this.sqliteStatementHandle;
        bindNull(i, m);
      }
      for (;;)
      {
        m += 1;
        i = j + 1;
        j = i;
        break;
        boolean bool1 = localObject instanceof Integer;
        if (bool1)
        {
          int n = this.sqliteStatementHandle;
          localObject = (Integer)localObject;
          i = ((Integer)localObject).intValue();
          bindInt(n, m, i);
        }
        else
        {
          boolean bool2 = localObject instanceof Double;
          if (bool2)
          {
            int i1 = this.sqliteStatementHandle;
            localObject = (Double)localObject;
            double d = ((Double)localObject).doubleValue();
            bindDouble(i1, m, d);
          }
          else
          {
            boolean bool3 = localObject instanceof String;
            if (!bool3) {
              break label227;
            }
            int i2 = this.sqliteStatementHandle;
            localObject = (String)localObject;
            bindString(i2, m, (String)localObject);
          }
        }
      }
      label227:
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = new com/vvt/capture/telegram/internal/SQLite/SQLiteCursorNative;
    ((SQLiteCursorNative)localObject).<init>(this);
    return (SQLiteCursorNative)localObject;
  }
  
  public void requery()
  {
    checkFinalized();
    int i = this.sqliteStatementHandle;
    reset(i);
  }
  
  native void reset(int paramInt);
  
  public int step()
  {
    int i = this.sqliteStatementHandle;
    return step(i);
  }
  
  native int step(int paramInt);
  
  public SQLitePreparedStatement stepThis()
  {
    int i = this.sqliteStatementHandle;
    step(i);
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/SQLite/SQLitePreparedStatement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */