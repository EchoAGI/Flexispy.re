package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.ag.b;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMMSEvent;
import com.vvt.events.FxRecipientType;
import com.vvt.events.h;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class z
  extends o
{
  private static final boolean a = com.vvt.eventrepository.a.a;
  private static final boolean b = com.vvt.eventrepository.a.e;
  private SQLiteDatabase c;
  
  public z(SQLiteDatabase paramSQLiteDatabase)
  {
    this.c = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Cursor localCursor = null;
    Object localObject2 = "mms";
    Object localObject4 = n.a(paramQueryOrder);
    Object localObject5 = Integer.toString(paramInt);
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.c;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, (String)localObject4, (String)localObject5);
      if (localCursor != null) {
        for (;;)
        {
          boolean bool1 = localCursor.moveToNext();
          if (!bool1) {
            break;
          }
          localObject5 = new com/vvt/events/FxMMSEvent;
          ((FxMMSEvent)localObject5).<init>();
          localObject2 = "_id";
          int i = localCursor.getColumnIndex((String)localObject2);
          long l1 = localCursor.getLong(i);
          localObject2 = "conversation_id";
          i = localCursor.getColumnIndex((String)localObject2);
          long l2 = localCursor.getLong(i);
          localObject2 = "time";
          i = localCursor.getColumnIndex((String)localObject2);
          long l3 = localCursor.getLong(i);
          localObject2 = "direction";
          i = localCursor.getColumnIndex((String)localObject2);
          int j = localCursor.getInt(i);
          localObject2 = "contact_name";
          i = localCursor.getColumnIndex((String)localObject2);
          String str2 = localCursor.getString(i);
          localObject2 = "sender_number";
          i = localCursor.getColumnIndex((String)localObject2);
          String str3 = localCursor.getString(i);
          localObject2 = "subject";
          i = localCursor.getColumnIndex((String)localObject2);
          String str4 = localCursor.getString(i);
          localObject2 = "message";
          i = localCursor.getColumnIndex((String)localObject2);
          String str5 = localCursor.getString(i);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject4 = "mms_id = ";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
          localObject2 = ((StringBuilder)localObject2).append(l1);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject4 = this.c;
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
            ((FxMMSEvent)localObject5).addRecipient((h)localObject2);
            i = k + 1;
            k = i;
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject4 = "mms_id = ";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
          localObject2 = ((StringBuilder)localObject2).append(l1);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject4 = this.c;
          localList = n.f((SQLiteDatabase)localObject4, (String)localObject2);
          i = 0;
          localObject2 = null;
          k = 0;
          localObject4 = null;
          for (;;)
          {
            i = localList.size();
            if (k >= i) {
              break;
            }
            localObject2 = localList.get(k);
            localObject2 = (com.vvt.events.a)localObject2;
            ((FxMMSEvent)localObject5).addAttachment((com.vvt.events.a)localObject2);
            i = k + 1;
            k = i;
          }
          localObject2 = FxEventDirection.forValue(j);
          ((FxMMSEvent)localObject5).setConversationId(l2);
          ((FxMMSEvent)localObject5).setSenderNumber(str3);
          ((FxMMSEvent)localObject5).setContactName(str2);
          ((FxMMSEvent)localObject5).setDirection((FxEventDirection)localObject2);
          ((FxMMSEvent)localObject5).setBody(str5);
          ((FxMMSEvent)localObject5).setSubject(str4);
          ((FxMMSEvent)localObject5).setEventTime(l3);
          ((FxMMSEvent)localObject5).setEventId(l1);
          ((List)localObject1).add(localObject5);
        }
      }
      String str1;
      if (localCursor == null) {
        break label676;
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
    label676:
    boolean bool2 = a;
    if (bool2) {}
    return (List)localObject1;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    int i = 0;
    SQLiteDatabase localSQLiteDatabase = null;
    paramFxEvent = (FxMMSEvent)paramFxEvent;
    Object localObject2 = new android/content/ContentValues;
    ((ContentValues)localObject2).<init>();
    Object localObject3 = Long.valueOf(paramFxEvent.getConversationId());
    ((ContentValues)localObject2).put("conversation_id", (Long)localObject3);
    localObject3 = paramFxEvent.getSenderNumber();
    ((ContentValues)localObject2).put("sender_number", (String)localObject3);
    localObject3 = paramFxEvent.getContactName();
    ((ContentValues)localObject2).put("contact_name", (String)localObject3);
    int j = paramFxEvent.getDirection().getNumber();
    localObject3 = Integer.valueOf(j);
    ((ContentValues)localObject2).put("direction", (Integer)localObject3);
    localObject3 = paramFxEvent.getSubject();
    ((ContentValues)localObject2).put("subject", (String)localObject3);
    localObject3 = paramFxEvent.getBody();
    ((ContentValues)localObject2).put("message", (String)localObject3);
    Object localObject4 = "time";
    long l1 = paramFxEvent.getEventTime();
    localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject2).put((String)localObject4, (Long)localObject3);
    try
    {
      localObject4 = this.c;
      ((SQLiteDatabase)localObject4).beginTransaction();
      localObject4 = this.c;
      localObject3 = "mms";
      int k = 0;
      Object localObject5 = null;
      long l2 = ((SQLiteDatabase)localObject4).insert((String)localObject3, null, (ContentValues)localObject2);
      localObject5 = new android/content/ContentValues;
      ((ContentValues)localObject5).<init>();
      int m = 0;
      localObject2 = null;
      Object localObject6;
      Object localObject7;
      for (;;)
      {
        int n = paramFxEvent.getRecipientCount();
        if (m >= n) {
          break;
        }
        localObject6 = paramFxEvent.getRecipient(m);
        localObject7 = "mms_id";
        Object localObject8 = Long.valueOf(l2);
        ((ContentValues)localObject5).put((String)localObject7, (Long)localObject8);
        localObject7 = "recipient_type";
        localObject8 = ((h)localObject6).a();
        int i1 = ((FxRecipientType)localObject8).getNumber();
        localObject8 = Integer.valueOf(i1);
        ((ContentValues)localObject5).put((String)localObject7, (Integer)localObject8);
        localObject7 = "recipient";
        localObject8 = ((h)localObject6).b();
        ((ContentValues)localObject5).put((String)localObject7, (String)localObject8);
        localObject7 = "contact_name";
        localObject6 = ((h)localObject6).c();
        ((ContentValues)localObject5).put((String)localObject7, (String)localObject6);
        localObject6 = this.c;
        localObject7 = "recipient";
        i1 = 0;
        localObject8 = null;
        ((SQLiteDatabase)localObject6).insert((String)localObject7, null, (ContentValues)localObject5);
        m += 1;
      }
      localObject2 = new android/content/ContentValues;
      ((ContentValues)localObject2).<init>();
      for (;;)
      {
        k = paramFxEvent.getAttachmentCount();
        if (i >= k) {
          break;
        }
        localObject5 = paramFxEvent.getAttachment(i);
        localObject6 = "mms_id";
        localObject7 = Long.valueOf(l2);
        ((ContentValues)localObject2).put((String)localObject6, (Long)localObject7);
        localObject6 = "full_path";
        localObject7 = ((com.vvt.events.a)localObject5).a();
        ((ContentValues)localObject2).put((String)localObject6, (String)localObject7);
        localObject6 = "file_path";
        localObject5 = ((com.vvt.events.a)localObject5).b();
        ((ContentValues)localObject2).put((String)localObject6, (String)localObject5);
        localObject5 = this.c;
        localObject6 = "attachment";
        localObject7 = null;
        ((SQLiteDatabase)localObject5).insert((String)localObject6, null, (ContentValues)localObject2);
        i += 1;
      }
      long l3 = 0L;
      boolean bool = l2 < l3;
      if (bool)
      {
        localSQLiteDatabase = this.c;
        localObject2 = FxEventType.MMS;
        localObject5 = paramFxEvent.getDirection();
        n.a(localSQLiteDatabase, l2, (FxEventType)localObject2, (FxEventDirection)localObject5);
      }
      localSQLiteDatabase = this.c;
      localSQLiteDatabase.setTransactionSuccessful();
      this.c.endTransaction();
      return l2;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
      finally
      {
        this.c.endTransaction();
      }
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject4 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject4, localThrowable);
    }
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    new ArrayList();
    return b(paramQueryOrder, paramInt);
  }
  
  public void a()
  {
    Object localObject2;
    try
    {
      Object localObject1 = this.c;
      int i = 0;
      localObject2 = null;
      localObject3 = n.f((SQLiteDatabase)localObject1, null);
      int j = ((List)localObject3).size();
      int k = 0;
      localObject1 = null;
      i = 0;
      localObject2 = null;
      if (i < j)
      {
        localObject1 = ((List)localObject3).get(i);
        localObject1 = (com.vvt.events.a)localObject1;
        localObject1 = ((com.vvt.events.a)localObject1).b();
        for (;;)
        {
          try
          {
            boolean bool2 = b.a((String)localObject1);
            if (!bool2)
            {
              File localFile = new java/io/File;
              localFile.<init>((String)localObject1);
              bool2 = localFile.exists();
              if (!bool2) {
                continue;
              }
              d.b((String)localObject1);
            }
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            boolean bool1 = b;
            if (!bool1) {
              continue;
            }
            continue;
          }
          k = i + 1;
          i = k;
          break;
          bool1 = a;
          if (!bool1) {}
        }
      }
      SQLiteDatabase localSQLiteDatabase = this.c;
      localObject2 = "mms";
      localObject3 = null;
      j = 0;
      localSQLiteDatabase.delete((String)localObject2, null, null);
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
      String str = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject2).<init>(str);
      throw ((Throwable)localObject2);
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      Object localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject3, localThrowable);
    }
  }
  
  public int b(long paramLong)
  {
    Object localObject4;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "mms_id = ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject4 = this.c;
      localObject5 = n.f((SQLiteDatabase)localObject4, (String)localObject1);
      int i = ((List)localObject5).size();
      int j = 0;
      localObject1 = null;
      int k = 0;
      localObject4 = null;
      if (k < i)
      {
        localObject1 = ((List)localObject5).get(k);
        localObject1 = (com.vvt.events.a)localObject1;
        localObject1 = ((com.vvt.events.a)localObject1).b();
        for (;;)
        {
          try
          {
            boolean bool2 = b.a((String)localObject1);
            if (!bool2)
            {
              File localFile = new java/io/File;
              localFile.<init>((String)localObject1);
              bool2 = localFile.exists();
              if (!bool2) {
                continue;
              }
              d.b((String)localObject1);
            }
          }
          finally
          {
            boolean bool1 = b;
            if (!bool1) {
              continue;
            }
            continue;
          }
          j = k + 1;
          k = j;
          break;
          bool1 = a;
          if (!bool1) {}
        }
      }
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "_id=";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).append(paramLong);
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject4 = this.c;
      localObject5 = "mms";
      i = 0;
      return ((SQLiteDatabase)localObject4).delete((String)localObject5, (String)localObject3, null);
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject4 = new com/vvt/exceptions/database/FxDbCorruptException;
      String str = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject4).<init>(str);
      throw ((Throwable)localObject4);
    }
    finally
    {
      localObject4 = new com/vvt/exceptions/database/FxDbOperationException;
      Object localObject5 = localThrowable.getMessage();
      ((FxDbOperationException)localObject4).<init>((String)localObject5, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */