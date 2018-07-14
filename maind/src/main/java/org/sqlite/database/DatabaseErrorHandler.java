package org.sqlite.database;

import org.sqlite.database.sqlite.SQLiteDatabase;

public abstract interface DatabaseErrorHandler
{
  public abstract void onCorruption(SQLiteDatabase paramSQLiteDatabase);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/DatabaseErrorHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */