package com.vvt.eventrepository.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;

public class r
  extends o
{
  private SQLiteDatabase a;
  
  public r(SQLiteDatabase paramSQLiteDatabase)
  {
    this.a = paramSQLiteDatabase;
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.a;
      localObject = "event_base";
      str2 = null;
      localSQLiteDatabase.delete((String)localObject, null, null);
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject = new com/vvt/exceptions/database/FxDbCorruptException;
      String str1 = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject).<init>(str1);
      throw ((Throwable)localObject);
    }
    finally
    {
      localObject = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject).<init>(str2, localThrowable);
    }
  }
  
  public int b(long paramLong)
  {
    Object localObject1;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.a;
      localObject1 = "event_base";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = "event_id=";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject2 = ((StringBuilder)localObject2).append(paramLong);
      localObject2 = ((StringBuilder)localObject2).toString();
      str2 = null;
      return localSQLiteDatabase.delete((String)localObject1, (String)localObject2, null);
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
      String str1 = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject1).<init>(str1);
      throw ((Throwable)localObject1);
    }
    finally
    {
      localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
      Object localObject2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject1).<init>((String)localObject2, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */