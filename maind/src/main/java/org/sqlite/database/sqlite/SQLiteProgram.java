package org.sqlite.database.sqlite;

import android.database.DatabaseUtils;
import java.util.Arrays;
import org.sqlite.os.CancellationSignal;

public abstract class SQLiteProgram
  extends SQLiteClosable
{
  private static final String[] EMPTY_STRING_ARRAY = new String[0];
  private final Object[] mBindArgs;
  private final String[] mColumnNames;
  private final SQLiteDatabase mDatabase;
  private final int mNumParameters;
  private final boolean mReadOnly;
  private final String mSql;
  
  SQLiteProgram(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    this.mDatabase = paramSQLiteDatabase;
    Object localObject2 = paramString.trim();
    this.mSql = ((String)localObject2);
    localObject2 = this.mSql;
    int m = DatabaseUtils.getSqlStatementType((String)localObject2);
    switch (m)
    {
    default: 
      if (m != i) {
        break;
      }
    }
    Object localObject3;
    int n;
    for (;;)
    {
      localObject2 = new org/sqlite/database/sqlite/SQLiteStatementInfo;
      ((SQLiteStatementInfo)localObject2).<init>();
      SQLiteSession localSQLiteSession = paramSQLiteDatabase.getThreadSession();
      String str = this.mSql;
      int j = paramSQLiteDatabase.getThreadDefaultConnectionFlags(i);
      localSQLiteSession.prepare(str, j, paramCancellationSignal, (SQLiteStatementInfo)localObject2);
      boolean bool = ((SQLiteStatementInfo)localObject2).readOnly;
      this.mReadOnly = bool;
      localObject3 = ((SQLiteStatementInfo)localObject2).columnNames;
      this.mColumnNames = ((String[])localObject3);
      k = ((SQLiteStatementInfo)localObject2).numParameters;
      for (this.mNumParameters = k; paramArrayOfObject != null; this.mNumParameters = 0)
      {
        k = paramArrayOfObject.length;
        n = this.mNumParameters;
        if (k <= n) {
          break;
        }
        localObject3 = new java/lang/IllegalArgumentException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Too many bind arguments.  ");
        n = paramArrayOfObject.length;
        localObject1 = ((StringBuilder)localObject1).append(n).append(" arguments were provided but the statement needs ");
        n = this.mNumParameters;
        localObject1 = n + " arguments.";
        ((IllegalArgumentException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
        this.mReadOnly = false;
        localObject3 = EMPTY_STRING_ARRAY;
        this.mColumnNames = ((String[])localObject3);
      }
      k = 0;
      localObject3 = null;
    }
    int k = this.mNumParameters;
    if (k != 0)
    {
      k = this.mNumParameters;
      localObject3 = new Object[k];
      this.mBindArgs = ((Object[])localObject3);
      if (paramArrayOfObject != null)
      {
        localObject3 = this.mBindArgs;
        n = paramArrayOfObject.length;
        System.arraycopy(paramArrayOfObject, 0, localObject3, 0, n);
      }
    }
    for (;;)
    {
      return;
      k = 0;
      localObject3 = null;
      this.mBindArgs = null;
    }
  }
  
  private void bind(int paramInt, Object paramObject)
  {
    int i = 1;
    if (paramInt >= i)
    {
      i = this.mNumParameters;
      if (paramInt <= i) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Cannot bind argument at index ").append(paramInt).append(" because the index is out of range.  ").append("The statement has ");
      int j = this.mNumParameters;
      localObject2 = j + " parameters.";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mBindArgs;
    int k = paramInt + -1;
    localObject1[k] = paramObject;
  }
  
  public void bindAllArgsAsStrings(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      while (i != 0)
      {
        int j = i + -1;
        String str = paramArrayOfString[j];
        bindString(i, str);
        i += -1;
      }
    }
  }
  
  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "the bind value at index " + paramInt + " is null";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    bind(paramInt, paramArrayOfByte);
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    Double localDouble = Double.valueOf(paramDouble);
    bind(paramInt, localDouble);
  }
  
  public void bindLong(int paramInt, long paramLong)
  {
    Long localLong = Long.valueOf(paramLong);
    bind(paramInt, localLong);
  }
  
  public void bindNull(int paramInt)
  {
    bind(paramInt, null);
  }
  
  public void bindString(int paramInt, String paramString)
  {
    if (paramString == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "the bind value at index " + paramInt + " is null";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    bind(paramInt, paramString);
  }
  
  public void clearBindings()
  {
    Object[] arrayOfObject = this.mBindArgs;
    if (arrayOfObject != null)
    {
      arrayOfObject = this.mBindArgs;
      Arrays.fill(arrayOfObject, null);
    }
  }
  
  final Object[] getBindArgs()
  {
    return this.mBindArgs;
  }
  
  final String[] getColumnNames()
  {
    return this.mColumnNames;
  }
  
  protected final int getConnectionFlags()
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabase;
    boolean bool = this.mReadOnly;
    return localSQLiteDatabase.getThreadDefaultConnectionFlags(bool);
  }
  
  final SQLiteDatabase getDatabase()
  {
    return this.mDatabase;
  }
  
  protected final SQLiteSession getSession()
  {
    return this.mDatabase.getThreadSession();
  }
  
  final String getSql()
  {
    return this.mSql;
  }
  
  public final int getUniqueId()
  {
    return -1;
  }
  
  protected void onAllReferencesReleased()
  {
    clearBindings();
  }
  
  protected final void onCorruption()
  {
    this.mDatabase.onCorruption();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteProgram.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */