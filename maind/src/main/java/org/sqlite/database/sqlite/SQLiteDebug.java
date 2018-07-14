package org.sqlite.database.sqlite;

import android.util.Log;
import android.util.Printer;
import java.util.ArrayList;

public final class SQLiteDebug
{
  public static final boolean DEBUG_LOG_SLOW_QUERIES;
  public static final boolean DEBUG_SQL_LOG;
  public static final boolean DEBUG_SQL_STATEMENTS;
  public static final boolean DEBUG_SQL_TIME;
  
  static
  {
    int i = 2;
    DEBUG_SQL_LOG = Log.isLoggable("SQLiteLog", i);
    DEBUG_SQL_STATEMENTS = Log.isLoggable("SQLiteStatements", i);
    DEBUG_SQL_TIME = Log.isLoggable("SQLiteTime", i);
  }
  
  public static void dump(Printer paramPrinter, String[] paramArrayOfString)
  {
    boolean bool1 = false;
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      String str1 = paramArrayOfString[j];
      String str2 = "-v";
      boolean bool2 = str1.equals(str2);
      if (bool2) {
        bool1 = true;
      }
      j += 1;
    }
    SQLiteDatabase.dumpAll(paramPrinter, bool1);
  }
  
  public static SQLiteDebug.PagerStats getDatabaseInfo()
  {
    SQLiteDebug.PagerStats localPagerStats = new org/sqlite/database/sqlite/SQLiteDebug$PagerStats;
    localPagerStats.<init>();
    nativeGetPagerStats(localPagerStats);
    ArrayList localArrayList = SQLiteDatabase.getDbStats();
    localPagerStats.dbStats = localArrayList;
    return localPagerStats;
  }
  
  private static native void nativeGetPagerStats(SQLiteDebug.PagerStats paramPagerStats);
  
  public static final boolean shouldLogSlowQuery(long paramLong)
  {
    long l = '✐';
    boolean bool = paramLong < l;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteDebug.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */