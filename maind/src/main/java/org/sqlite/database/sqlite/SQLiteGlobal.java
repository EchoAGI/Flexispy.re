package org.sqlite.database.sqlite;

import android.os.StatFs;

public final class SQLiteGlobal
{
  private static final String TAG = "SQLiteGlobal";
  private static int sDefaultPageSize;
  private static final Object sLock;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    sLock = localObject;
  }
  
  public static String getDefaultJournalMode()
  {
    return "delete";
  }
  
  public static int getDefaultPageSize()
  {
    synchronized (sLock)
    {
      int i = sDefaultPageSize;
      if (i == 0)
      {
        StatFs localStatFs = new android/os/StatFs;
        String str = "/data";
        localStatFs.<init>(str);
        i = localStatFs.getBlockSize();
        sDefaultPageSize = i;
      }
      i = 1024;
      return i;
    }
  }
  
  public static String getDefaultSyncMode()
  {
    return "normal";
  }
  
  public static int getJournalSizeLimit()
  {
    return 10000;
  }
  
  public static int getWALAutoCheckpoint()
  {
    return Math.max(1, 1000);
  }
  
  public static int getWALConnectionPoolSize()
  {
    return Math.max(2, 10);
  }
  
  public static String getWALSyncMode()
  {
    return "normal";
  }
  
  private static native int nativeReleaseMemory();
  
  public static int releaseMemory()
  {
    return nativeReleaseMemory();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteGlobal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */