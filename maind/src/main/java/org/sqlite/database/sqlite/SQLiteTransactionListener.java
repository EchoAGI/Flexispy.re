package org.sqlite.database.sqlite;

public abstract interface SQLiteTransactionListener
{
  public abstract void onBegin();
  
  public abstract void onCommit();
  
  public abstract void onRollback();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteTransactionListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */