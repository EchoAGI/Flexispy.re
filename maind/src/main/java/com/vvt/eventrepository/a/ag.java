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
import com.vvt.events.FxRecipientType;
import com.vvt.events.FxSMSEvent;
import com.vvt.events.h;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class ag
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public ag(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    Object localObject5 = this.b;
    String str2 = "sms";
    Cursor localCursor = n.a((SQLiteDatabase)localObject5, str2, null, (String)localObject2, (String)localObject4);
    if (localCursor != null) {
      try
      {
        for (;;)
        {
          boolean bool = localCursor.moveToNext();
          if (!bool) {
            break;
          }
          localObject5 = new com/vvt/events/FxSMSEvent;
          ((FxSMSEvent)localObject5).<init>();
          localObject2 = "_id";
          int i = localCursor.getColumnIndex((String)localObject2);
          long l1 = localCursor.getLong(i);
          localObject2 = "time";
          i = localCursor.getColumnIndex((String)localObject2);
          long l2 = localCursor.getLong(i);
          localObject2 = "direction";
          i = localCursor.getColumnIndex((String)localObject2);
          int j = localCursor.getInt(i);
          localObject2 = "conversation_id";
          i = localCursor.getColumnIndex((String)localObject2);
          long l3 = localCursor.getLong(i);
          localObject2 = "message";
          i = localCursor.getColumnIndex((String)localObject2);
          String str3 = localCursor.getString(i);
          localObject2 = "contact_name";
          i = localCursor.getColumnIndex((String)localObject2);
          String str4 = localCursor.getString(i);
          localObject2 = "sender_number";
          i = localCursor.getColumnIndex((String)localObject2);
          String str5 = localCursor.getString(i);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject4 = "sms_id = ";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
          localObject2 = ((StringBuilder)localObject2).append(l1);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject4 = this.b;
          List localList = n.e((SQLiteDatabase)localObject4, (String)localObject2);
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
            localObject2 = (h)localObject2;
            ((FxSMSEvent)localObject5).addRecipient((h)localObject2);
            i = k + 1;
            k = i;
          }
          localObject2 = FxEventDirection.forValue(j);
          ((FxSMSEvent)localObject5).setSenderNumber(str5);
          ((FxSMSEvent)localObject5).setContactName(str4);
          ((FxSMSEvent)localObject5).setDirection((FxEventDirection)localObject2);
          ((FxSMSEvent)localObject5).setConversationId(l3);
          ((FxSMSEvent)localObject5).setSMSData(str3);
          ((FxSMSEvent)localObject5).setEventTime(l2);
          ((FxSMSEvent)localObject5).setEventId(l1);
          ((List)localObject1).add(localObject5);
        }
        String str1;
        if (localCursor == null) {
          return localObject1;
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
    }
    localCursor.close();
    return (List)localObject1;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxSMSEvent)paramFxEvent;
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    Object localObject3 = paramFxEvent.getSenderNumber();
    ((ContentValues)localObject1).put("sender_number", (String)localObject3);
    localObject3 = paramFxEvent.getContactName();
    ((ContentValues)localObject1).put("contact_name", (String)localObject3);
    int i = paramFxEvent.getDirection().getNumber();
    localObject3 = Integer.valueOf(i);
    ((ContentValues)localObject1).put("direction", (Integer)localObject3);
    localObject3 = paramFxEvent.getSMSData();
    ((ContentValues)localObject1).put("message", (String)localObject3);
    localObject3 = Long.valueOf(paramFxEvent.getEventTime());
    ((ContentValues)localObject1).put("time", (Long)localObject3);
    Object localObject4 = "conversation_id";
    long l1 = paramFxEvent.getConversationId();
    localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject1).put((String)localObject4, (Long)localObject3);
    try
    {
      localObject4 = this.b;
      ((SQLiteDatabase)localObject4).beginTransaction();
      localObject4 = this.b;
      localObject3 = "sms";
      Object localObject5 = null;
      long l2 = ((SQLiteDatabase)localObject4).insert((String)localObject3, null, (ContentValues)localObject1);
      localObject5 = new android/content/ContentValues;
      ((ContentValues)localObject5).<init>();
      int j = 0;
      localObject1 = null;
      Object localObject6;
      for (;;)
      {
        int k = paramFxEvent.getRecipientCount();
        if (j >= k) {
          break;
        }
        localObject6 = paramFxEvent.getRecipient(j);
        String str2 = "sms_id";
        Object localObject7 = Long.valueOf(l2);
        ((ContentValues)localObject5).put(str2, (Long)localObject7);
        str2 = "recipient_type";
        localObject7 = ((h)localObject6).a();
        int m = ((FxRecipientType)localObject7).getNumber();
        localObject7 = Integer.valueOf(m);
        ((ContentValues)localObject5).put(str2, (Integer)localObject7);
        str2 = "recipient";
        localObject7 = ((h)localObject6).b();
        ((ContentValues)localObject5).put(str2, (String)localObject7);
        str2 = "contact_name";
        localObject6 = ((h)localObject6).c();
        ((ContentValues)localObject5).put(str2, (String)localObject6);
        localObject6 = this.b;
        str2 = "recipient";
        m = 0;
        localObject7 = null;
        ((SQLiteDatabase)localObject6).insert(str2, null, (ContentValues)localObject5);
        j += 1;
      }
      long l3 = 0L;
      boolean bool = l2 < l3;
      if (bool)
      {
        localObject1 = this.b;
        localObject5 = FxEventType.SMS;
        localObject6 = paramFxEvent.getDirection();
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
    new ArrayList();
    List localList = b(paramQueryOrder, paramInt);
    boolean bool = a;
    if (bool) {}
    return localList;
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "sms";
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
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject1 = "sms";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = "_id=";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/ag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */