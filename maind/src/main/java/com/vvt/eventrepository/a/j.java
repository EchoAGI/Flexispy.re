package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxCallLogEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class j
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public j(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    boolean bool1 = false;
    Cursor localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "call_log";
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
          localObject2 = new com/vvt/events/FxCallLogEvent;
          ((FxCallLogEvent)localObject2).<init>();
          str2 = "_id";
          int j = localCursor.getColumnIndex(str2);
          long l1 = localCursor.getLong(j);
          str4 = "time";
          i = localCursor.getColumnIndex(str4);
          long l2 = localCursor.getLong(i);
          Object localObject3 = "direction";
          int k = localCursor.getColumnIndex((String)localObject3);
          k = localCursor.getInt(k);
          String str5 = "duration";
          int m = localCursor.getColumnIndex(str5);
          m = localCursor.getInt(m);
          String str6 = "number";
          int n = localCursor.getColumnIndex(str6);
          str6 = localCursor.getString(n);
          String str7 = "contact_name";
          int i1 = localCursor.getColumnIndex(str7);
          str7 = localCursor.getString(i1);
          localObject3 = FxEventDirection.forValue(k);
          ((FxCallLogEvent)localObject2).setContactName(str7);
          long l3 = m;
          ((FxCallLogEvent)localObject2).setDuration(l3);
          ((FxCallLogEvent)localObject2).setDirection((FxEventDirection)localObject3);
          ((FxCallLogEvent)localObject2).setEventTime(l2);
          ((FxCallLogEvent)localObject2).setNumber(str6);
          ((FxCallLogEvent)localObject2).setEventId(l1);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label388;
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
    label388:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxCallLogEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject2 = paramFxEvent.getContactName();
    localContentValues.put("contact_name", (String)localObject2);
    int i = paramFxEvent.getDirection().getNumber();
    localObject2 = Integer.valueOf(i);
    localContentValues.put("direction", (Integer)localObject2);
    localObject2 = Long.valueOf(paramFxEvent.getDuration());
    localContentValues.put("duration", (Long)localObject2);
    localObject2 = paramFxEvent.getNubmer();
    localContentValues.put("number", (String)localObject2);
    Object localObject3 = "time";
    long l1 = paramFxEvent.getEventTime();
    localObject2 = Long.valueOf(l1);
    localContentValues.put((String)localObject3, (Long)localObject2);
    try
    {
      localObject3 = this.b;
      ((SQLiteDatabase)localObject3).beginTransaction();
      localObject3 = this.b;
      localObject2 = "call_log";
      FxEventType localFxEventType = null;
      long l2 = ((SQLiteDatabase)localObject3).insert((String)localObject2, null, localContentValues);
      l1 = 0L;
      boolean bool = l2 < l1;
      if (bool)
      {
        localObject2 = this.b;
        localFxEventType = FxEventType.CALL_LOG;
        FxEventDirection localFxEventDirection = paramFxEvent.getDirection();
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
    new ArrayList();
    return b(paramQueryOrder, paramInt);
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "call_log";
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
      str2 = "call_log";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */