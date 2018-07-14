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
import com.vvt.events.FxIMEvent;
import com.vvt.events.g;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class v
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public v(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxIMEvent)paramFxEvent;
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    Object localObject3 = paramFxEvent.getImServiceId();
    ((ContentValues)localObject1).put("im_service_id", (String)localObject3);
    localObject3 = paramFxEvent.getMessage();
    ((ContentValues)localObject1).put("message", (String)localObject3);
    int i = paramFxEvent.getEventDirection().getNumber();
    localObject3 = Integer.valueOf(i);
    ((ContentValues)localObject1).put("direction", (Integer)localObject3);
    long l1 = paramFxEvent.getEventTime();
    localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject1).put("time", (Long)localObject3);
    localObject3 = paramFxEvent.getUserDisplayName();
    ((ContentValues)localObject1).put("user_display_name", (String)localObject3);
    Object localObject4 = "user_id";
    localObject3 = paramFxEvent.getUserId();
    ((ContentValues)localObject1).put((String)localObject4, (String)localObject3);
    try
    {
      localObject4 = this.b;
      ((SQLiteDatabase)localObject4).beginTransaction();
      localObject4 = this.b;
      localObject3 = "im";
      Object localObject5 = null;
      long l2 = ((SQLiteDatabase)localObject4).insert((String)localObject3, null, (ContentValues)localObject1);
      localObject5 = new android/content/ContentValues;
      ((ContentValues)localObject5).<init>();
      int j = 0;
      localObject1 = null;
      Object localObject6;
      for (;;)
      {
        int k = paramFxEvent.getParticipantCount();
        if (j >= k) {
          break;
        }
        localObject6 = paramFxEvent.getParticipant(j);
        String str2 = "im_id";
        Object localObject7 = Long.valueOf(l2);
        ((ContentValues)localObject5).put(str2, (Long)localObject7);
        str2 = "name";
        localObject7 = ((g)localObject6).a();
        ((ContentValues)localObject5).put(str2, (String)localObject7);
        str2 = "uid";
        localObject6 = ((g)localObject6).b();
        ((ContentValues)localObject5).put(str2, (String)localObject6);
        localObject6 = this.b;
        str2 = "participants";
        localObject7 = null;
        ((SQLiteDatabase)localObject6).insert(str2, null, (ContentValues)localObject5);
        j += 1;
      }
      long l3 = 0L;
      boolean bool = l2 < l3;
      if (bool)
      {
        localObject1 = this.b;
        localObject5 = FxEventType.IM;
        localObject6 = paramFxEvent.getEventDirection();
        n.a((SQLiteDatabase)localObject1, l2, (FxEventType)localObject5, (FxEventDirection)localObject6);
      }
      localObject1 = this.b;
      ((SQLiteDatabase)localObject1).setTransactionSuccessful();
      this.b.endTransaction();
      return l2;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject4 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject4).<init>(str1);
        throw ((Throwable)localObject4);
      }
      finally
      {
        this.b.endTransaction();
      }
    }
    finally
    {
      localObject4 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject4).<init>((String)localObject3, localThrowable);
    }
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Cursor localCursor = null;
    Object localObject2 = "im";
    Object localObject4 = n.a(paramQueryOrder);
    Object localObject5 = Integer.toString(paramInt);
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, (String)localObject4, (String)localObject5);
      if (localCursor != null) {
        for (;;)
        {
          boolean bool1 = localCursor.moveToNext();
          if (!bool1) {
            break;
          }
          localObject5 = new com/vvt/events/FxIMEvent;
          ((FxIMEvent)localObject5).<init>();
          localObject2 = "_id";
          int i = localCursor.getColumnIndex((String)localObject2);
          long l1 = localCursor.getLong(i);
          localObject2 = "time";
          i = localCursor.getColumnIndex((String)localObject2);
          long l2 = localCursor.getLong(i);
          localObject2 = "direction";
          i = localCursor.getColumnIndex((String)localObject2);
          int j = localCursor.getInt(i);
          localObject2 = "im_service_id";
          i = localCursor.getColumnIndex((String)localObject2);
          String str2 = localCursor.getString(i);
          localObject2 = "user_display_name";
          i = localCursor.getColumnIndex((String)localObject2);
          String str3 = localCursor.getString(i);
          localObject2 = "user_id";
          i = localCursor.getColumnIndex((String)localObject2);
          String str4 = localCursor.getString(i);
          localObject2 = "message";
          i = localCursor.getColumnIndex((String)localObject2);
          String str5 = localCursor.getString(i);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject4 = "im_id = ";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
          localObject2 = ((StringBuilder)localObject2).append(l1);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject4 = this.b;
          List localList = n.a((SQLiteDatabase)localObject4, (String)localObject2);
          i = 0;
          localObject2 = null;
          int k = 0;
          localObject4 = null;
          for (;;)
          {
            i = localList.size();
            if (k >= i) {
              break;
            }
            localObject2 = localList.get(k);
            localObject2 = (g)localObject2;
            ((FxIMEvent)localObject5).addParticipant((g)localObject2);
            i = k + 1;
            k = i;
          }
          localObject2 = FxEventDirection.forValue(j);
          ((FxIMEvent)localObject5).setEventDirection((FxEventDirection)localObject2);
          ((FxIMEvent)localObject5).setUserDisplayName(str3);
          ((FxIMEvent)localObject5).setEventTime(l2);
          ((FxIMEvent)localObject5).setImServiceId(str2);
          ((FxIMEvent)localObject5).setEventId(l1);
          ((FxIMEvent)localObject5).setUserId(str4);
          ((FxIMEvent)localObject5).setMessage(str5);
          ((List)localObject1).add(localObject5);
        }
      }
      String str1;
      if (localCursor == null) {
        break label523;
      }
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject4 = new com/vvt/exceptions/database/FxDbCorruptException;
        str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject4).<init>(str1);
        throw ((Throwable)localObject4);
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
      localObject4 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject4).<init>((String)localObject1, localThrowable);
    }
    localCursor.close();
    label523:
    boolean bool2 = a;
    if (bool2) {}
    return (List)localObject1;
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "im";
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
      str2 = "im";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */