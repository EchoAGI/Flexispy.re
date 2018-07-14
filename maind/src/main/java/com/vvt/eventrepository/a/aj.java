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
import com.vvt.events.FxVoipCallLogEvent;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCategory;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class aj
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public aj(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "voip_call_log";
    Object localObject3 = n.a(paramQueryOrder);
    String str2 = Integer.toString(paramInt);
    int i = 0;
    String str3 = null;
    boolean bool1 = false;
    Cursor localCursor = null;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, (String)localObject3, str2);
      if (localCursor != null) {
        for (;;)
        {
          boolean bool2 = localCursor.moveToNext();
          if (!bool2) {
            break;
          }
          localObject2 = new com/vvt/events/FxVoipCallLogEvent;
          ((FxVoipCallLogEvent)localObject2).<init>();
          localObject3 = "_id";
          int j = localCursor.getColumnIndex((String)localObject3);
          long l1 = localCursor.getLong(j);
          str3 = "time";
          i = localCursor.getColumnIndex(str3);
          long l2 = localCursor.getLong(i);
          String str4 = "category";
          int k = localCursor.getColumnIndex(str4);
          k = localCursor.getInt(k);
          Object localObject4 = "direction";
          int m = localCursor.getColumnIndex((String)localObject4);
          m = localCursor.getInt(m);
          String str5 = "duration";
          int n = localCursor.getColumnIndex(str5);
          n = localCursor.getInt(n);
          String str6 = "user_id";
          int i1 = localCursor.getColumnIndex(str6);
          str6 = localCursor.getString(i1);
          String str7 = "contact_name";
          int i2 = localCursor.getColumnIndex(str7);
          str7 = localCursor.getString(i2);
          String str8 = "transferred_bytes";
          int i3 = localCursor.getColumnIndex(str8);
          i3 = localCursor.getInt(i3);
          String str9 = "is_monitor";
          int i4 = localCursor.getColumnIndex(str9);
          i4 = localCursor.getInt(i4);
          String str10 = "frame_strip_id";
          int i5 = localCursor.getColumnIndex(str10);
          i5 = localCursor.getInt(i5);
          localObject4 = FxEventDirection.forValue(m);
          ((FxVoipCallLogEvent)localObject2).setEventId(l1);
          ((FxVoipCallLogEvent)localObject2).setEventTime(l2);
          localObject3 = FxVoipCategory.forValue(k);
          ((FxVoipCallLogEvent)localObject2).setVoipCategory((FxVoipCategory)localObject3);
          ((FxVoipCallLogEvent)localObject2).setDirection((FxEventDirection)localObject4);
          l1 = n;
          ((FxVoipCallLogEvent)localObject2).setDuration(l1);
          ((FxVoipCallLogEvent)localObject2).setUserId(str6);
          ((FxVoipCallLogEvent)localObject2).setContactName(str7);
          l1 = i3;
          ((FxVoipCallLogEvent)localObject2).setTransferredBytes(l1);
          localObject3 = FxVoipCallLogEvent.FxIsMonitor.forValue(i4);
          ((FxVoipCallLogEvent)localObject2).setIsMonitor((FxVoipCallLogEvent.FxIsMonitor)localObject3);
          l1 = i5;
          ((FxVoipCallLogEvent)localObject2).setFrameStripId(l1);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label533;
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
      localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject3, localThrowable);
    }
    localCursor.close();
    label533:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxVoipCallLogEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject2 = Long.valueOf(paramFxEvent.getEventTime());
    localContentValues.put("time", (Long)localObject2);
    localObject2 = Integer.valueOf(paramFxEvent.getVoipCategory().getValue());
    localContentValues.put("category", (Integer)localObject2);
    localObject2 = Integer.valueOf(paramFxEvent.getDirection().getNumber());
    localContentValues.put("direction", (Integer)localObject2);
    localObject2 = Long.valueOf(paramFxEvent.getDuration());
    localContentValues.put("duration", (Long)localObject2);
    localObject2 = paramFxEvent.getUserId();
    localContentValues.put("user_id", (String)localObject2);
    localObject2 = paramFxEvent.getContactName();
    localContentValues.put("contact_name", (String)localObject2);
    localObject2 = Long.valueOf(paramFxEvent.getTransferredBytes());
    localContentValues.put("transferred_bytes", (Long)localObject2);
    int i = paramFxEvent.getIsMonitor().getValue();
    localObject2 = Integer.valueOf(i);
    localContentValues.put("is_monitor", (Integer)localObject2);
    Object localObject3 = "frame_strip_id";
    long l1 = paramFxEvent.getFrameStripId();
    localObject2 = Long.valueOf(l1);
    localContentValues.put((String)localObject3, (Long)localObject2);
    try
    {
      localObject3 = this.b;
      ((SQLiteDatabase)localObject3).beginTransaction();
      localObject3 = this.b;
      localObject2 = "voip_call_log";
      FxEventType localFxEventType = null;
      long l2 = ((SQLiteDatabase)localObject3).insert((String)localObject2, null, localContentValues);
      l1 = 0L;
      boolean bool = l2 < l1;
      if (bool)
      {
        localObject2 = this.b;
        localFxEventType = FxEventType.VOIP_CALL_LOG;
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
      localObject = "voip_call_log";
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
      str2 = "voip_call_log";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/aj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */