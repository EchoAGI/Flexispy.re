package org.sqlite.database.sqlite;

 enum SQLiteConnectionPool$AcquiredConnectionStatus
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new org/sqlite/database/sqlite/SQLiteConnectionPool$AcquiredConnectionStatus;
    ((AcquiredConnectionStatus)localObject).<init>("NORMAL", 0);
    NORMAL = (AcquiredConnectionStatus)localObject;
    localObject = new org/sqlite/database/sqlite/SQLiteConnectionPool$AcquiredConnectionStatus;
    ((AcquiredConnectionStatus)localObject).<init>("RECONFIGURE", j);
    RECONFIGURE = (AcquiredConnectionStatus)localObject;
    localObject = new org/sqlite/database/sqlite/SQLiteConnectionPool$AcquiredConnectionStatus;
    ((AcquiredConnectionStatus)localObject).<init>("DISCARD", i);
    DISCARD = (AcquiredConnectionStatus)localObject;
    localObject = new AcquiredConnectionStatus[3];
    AcquiredConnectionStatus localAcquiredConnectionStatus = NORMAL;
    localObject[0] = localAcquiredConnectionStatus;
    localAcquiredConnectionStatus = RECONFIGURE;
    localObject[j] = localAcquiredConnectionStatus;
    localAcquiredConnectionStatus = DISCARD;
    localObject[i] = localAcquiredConnectionStatus;
    $VALUES = (AcquiredConnectionStatus[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnectionPool$AcquiredConnectionStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */