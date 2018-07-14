package org.sqlite.database.sqlite;

final class SQLiteConnectionPool$ConnectionWaiter
{
  public SQLiteConnection mAssignedConnection;
  public int mConnectionFlags;
  public RuntimeException mException;
  public ConnectionWaiter mNext;
  public int mNonce;
  public int mPriority;
  public String mSql;
  public long mStartTime;
  public Thread mThread;
  public boolean mWantPrimaryConnection;
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */