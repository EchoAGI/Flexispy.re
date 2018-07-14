package org.sqlite.database.sqlite;

import android.util.LruCache;
import android.util.Printer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class SQLiteConnection$PreparedStatementCache
  extends LruCache
{
  public SQLiteConnection$PreparedStatementCache(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    super(paramInt);
  }
  
  public void dump(Printer paramPrinter)
  {
    Object localObject1 = "  Prepared statement cache:";
    paramPrinter.println((String)localObject1);
    Object localObject2 = snapshot();
    boolean bool1 = ((Map)localObject2).isEmpty();
    if (!bool1)
    {
      bool1 = false;
      localObject1 = null;
      localObject2 = ((Map)localObject2).entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      int i;
      for (int j = 0;; j = i)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = (SQLiteConnection.PreparedStatement)((Map.Entry)localObject1).getValue();
        boolean bool2 = ((SQLiteConnection.PreparedStatement)localObject2).mInCache;
        if (bool2)
        {
          localObject1 = (String)((Map.Entry)localObject1).getKey();
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("    ").append(j).append(": statementPtr=0x");
          long l = ((SQLiteConnection.PreparedStatement)localObject2).mStatementPtr;
          String str = Long.toHexString(l);
          localObject3 = ((StringBuilder)localObject3).append(str).append(", numParameters=");
          int k = ((SQLiteConnection.PreparedStatement)localObject2).mNumParameters;
          localObject3 = ((StringBuilder)localObject3).append(k).append(", type=");
          k = ((SQLiteConnection.PreparedStatement)localObject2).mType;
          localObject3 = ((StringBuilder)localObject3).append(k);
          str = ", readOnly=";
          localObject3 = ((StringBuilder)localObject3).append(str);
          boolean bool3 = ((SQLiteConnection.PreparedStatement)localObject2).mReadOnly;
          localObject2 = ((StringBuilder)localObject3).append(bool3);
          localObject3 = ", sql=\"";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
          localObject1 = SQLiteConnection.access$300((String)localObject1);
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = "\"";
          localObject1 = (String)localObject2;
          paramPrinter.println((String)localObject1);
        }
        i = j + 1;
      }
    }
    localObject1 = "    <none>";
    paramPrinter.println((String)localObject1);
  }
  
  protected void entryRemoved(boolean paramBoolean, String paramString, SQLiteConnection.PreparedStatement paramPreparedStatement1, SQLiteConnection.PreparedStatement paramPreparedStatement2)
  {
    SQLiteConnection localSQLiteConnection = null;
    paramPreparedStatement1.mInCache = false;
    boolean bool = paramPreparedStatement1.mInUse;
    if (!bool)
    {
      localSQLiteConnection = this.this$0;
      SQLiteConnection.access$200(localSQLiteConnection, paramPreparedStatement1);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnection$PreparedStatementCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */