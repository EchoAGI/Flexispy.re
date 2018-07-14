package org.sqlite.database.sqlite;

import android.os.ParcelFileDescriptor;

public final class SQLiteStatement
  extends SQLiteProgram
{
  SQLiteStatement(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject)
  {
    super(paramSQLiteDatabase, paramString, paramArrayOfObject, null);
  }
  
  public void execute()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getSession();
      String str = getSql();
      Object[] arrayOfObject = getBindArgs();
      int i = getConnectionFlags();
      localSQLiteSession.execute(str, arrayOfObject, i, null);
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public long executeInsert()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getSession();
      String str = getSql();
      Object[] arrayOfObject = getBindArgs();
      int i = getConnectionFlags();
      long l = localSQLiteSession.executeForLastInsertedRowId(str, arrayOfObject, i, null);
      return l;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public int executeUpdateDelete()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getSession();
      String str = getSql();
      Object[] arrayOfObject = getBindArgs();
      int i = getConnectionFlags();
      int j = localSQLiteSession.executeForChangedRowCount(str, arrayOfObject, i, null);
      return j;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public ParcelFileDescriptor simpleQueryForBlobFileDescriptor()
  {
    acquireReference();
    try
    {
      Object localObject1 = getSession();
      String str = getSql();
      Object[] arrayOfObject = getBindArgs();
      int i = getConnectionFlags();
      localObject1 = ((SQLiteSession)localObject1).executeForBlobFileDescriptor(str, arrayOfObject, i, null);
      return (ParcelFileDescriptor)localObject1;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public long simpleQueryForLong()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getSession();
      String str = getSql();
      Object[] arrayOfObject = getBindArgs();
      int i = getConnectionFlags();
      long l = localSQLiteSession.executeForLong(str, arrayOfObject, i, null);
      return l;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public String simpleQueryForString()
  {
    acquireReference();
    try
    {
      Object localObject1 = getSession();
      String str = getSql();
      Object[] arrayOfObject = getBindArgs();
      int i = getConnectionFlags();
      localObject1 = ((SQLiteSession)localObject1).executeForString(str, arrayOfObject, i, null);
      return (String)localObject1;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SQLiteProgram: ");
    String str = getSql();
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteStatement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */