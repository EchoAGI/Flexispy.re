package org.sqlite.database.sqlite;

class SQLiteDatabase$1
  extends ThreadLocal
{
  SQLiteDatabase$1(SQLiteDatabase paramSQLiteDatabase) {}
  
  protected SQLiteSession initialValue()
  {
    return this.this$0.createSession();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteDatabase$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */