package org.sqlite.database.sqlite;

import org.sqlite.os.CancellationSignal.OnCancelListener;

class SQLiteConnectionPool$1
  implements CancellationSignal.OnCancelListener
{
  SQLiteConnectionPool$1(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteConnectionPool.ConnectionWaiter paramConnectionWaiter, int paramInt) {}
  
  public void onCancel()
  {
    Object localObject1 = this.this$0;
    synchronized (SQLiteConnectionPool.access$000((SQLiteConnectionPool)localObject1))
    {
      localObject1 = this.val$waiter;
      int i = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mNonce;
      int j = this.val$nonce;
      if (i == j)
      {
        localObject1 = this.this$0;
        SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter = this.val$waiter;
        SQLiteConnectionPool.access$100((SQLiteConnectionPool)localObject1, localConnectionWaiter);
      }
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnectionPool$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */