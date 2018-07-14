package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class ah
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public ah(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxSystemEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject2 = paramFxEvent.getMessage();
    localContentValues.put("message", (String)localObject2);
    localObject2 = Integer.valueOf(paramFxEvent.getDirection().getNumber());
    localContentValues.put("direction", (Integer)localObject2);
    int i = paramFxEvent.getLogType().getNumber();
    localObject2 = Integer.valueOf(i);
    localContentValues.put("log_type", (Integer)localObject2);
    Object localObject3 = "time";
    long l1 = paramFxEvent.getEventTime();
    localObject2 = Long.valueOf(l1);
    localContentValues.put((String)localObject3, (Long)localObject2);
    try
    {
      localObject3 = this.b;
      ((SQLiteDatabase)localObject3).beginTransaction();
      localObject3 = this.b;
      localObject2 = "system";
      FxEventType localFxEventType = null;
      long l2 = ((SQLiteDatabase)localObject3).insert((String)localObject2, null, localContentValues);
      l1 = 0L;
      boolean bool = l2 < l1;
      if (bool)
      {
        localObject2 = this.b;
        localFxEventType = FxEventType.SYSTEM;
        FxEventDirection localFxEventDirection = FxEventDirection.UNKNOWN;
        n.a((SQLiteDatabase)localObject2, l2, localFxEventType, localFxEventDirection);
      }
      localObject2 = this.b;
      ((SQLiteDatabase)localObject2).setTransactionSuccessful();
      this.b.endTransaction();
      return l2;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject3).<init>(str);
        throw ((Throwable)localObject3);
      }
      finally
      {
        this.b.endTransaction();
      }
    }
    finally
    {
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>((String)localObject2, localThrowable);
    }
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    boolean bool1 = false;
    Cursor localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "system";
    String str2 = n.a(paramQueryOrder);
    String str3 = Integer.toString(paramInt);
    int i = 0;
    String str4 = null;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, str2, str3);
      if (localCursor != null) {
        for (;;)
        {
          boolean bool2 = localCursor.moveToNext();
          if (!bool2) {
            break;
          }
          localObject2 = new com/vvt/events/FxSystemEvent;
          ((FxSystemEvent)localObject2).<init>();
          str2 = "_id";
          int j = localCursor.getColumnIndex(str2);
          long l1 = localCursor.getLong(j);
          str4 = "time";
          i = localCursor.getColumnIndex(str4);
          long l2 = localCursor.getLong(i);
          Object localObject3 = "direction";
          int k = localCursor.getColumnIndex((String)localObject3);
          k = localCursor.getInt(k);
          Object localObject4 = "log_type";
          int m = localCursor.getColumnIndex((String)localObject4);
          m = localCursor.getInt(m);
          String str5 = "message";
          int n = localCursor.getColumnIndex(str5);
          str5 = localCursor.getString(n);
          localObject3 = FxEventDirection.forValue(k);
          localObject4 = FxSystemEventCategories.forValue(m);
          ((FxSystemEvent)localObject2).setDirection((FxEventDirection)localObject3);
          ((FxSystemEvent)localObject2).setEventId(l1);
          ((FxSystemEvent)localObject2).setEventTime(l2);
          ((FxSystemEvent)localObject2).setLogType((FxSystemEventCategories)localObject4);
          ((FxSystemEvent)localObject2).setMessage(str5);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label357;
      }
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str1);
        throw ((Throwable)localObject2);
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
    localCursor.close();
    label357:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "system";
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
    Object localObject2;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject2 = this.b;
      str2 = "system";
      return ((SQLiteDatabase)localObject2).delete(str2, (String)localObject1, null);
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
      String str1 = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject2).<init>(str1);
      throw ((Throwable)localObject2);
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */