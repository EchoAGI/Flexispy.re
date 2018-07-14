package org.sqlite.database.sqlite;

public class SQLiteDebug$DbStats
{
  public String cache;
  public String dbName;
  public long dbSize;
  public int lookaside;
  public long pageSize;
  
  public SQLiteDebug$DbStats(String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.dbName = paramString;
    long l2 = paramLong2 / l1;
    this.pageSize = l2;
    l2 = paramLong1 * paramLong2 / l1;
    this.dbSize = l2;
    this.lookaside = paramInt1;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramInt2 + "/" + paramInt3 + "/" + paramInt4;
    this.cache = ((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteDebug$DbStats.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */