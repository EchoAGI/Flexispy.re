package org.sqlite.database.sqlite;

import org.sqlite.database.SQLException;

public class SQLiteException
  extends SQLException
{
  public SQLiteException() {}
  
  public SQLiteException(String paramString)
  {
    super(paramString);
  }
  
  public SQLiteException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */