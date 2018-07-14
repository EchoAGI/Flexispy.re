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
import com.vvt.events.FxRecipientType;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCallRecordingEvent;
import com.vvt.events.FxVoipCategory;
import com.vvt.events.h;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ak
  extends o
{
  private static final boolean a = com.vvt.eventrepository.a.a;
  private static final boolean b = com.vvt.eventrepository.a.e;
  private SQLiteDatabase c;
  
  public ak(SQLiteDatabase paramSQLiteDatabase)
  {
    this.c = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = "voip_call_recording";
    Object localObject4 = n.a(paramQueryOrder);
    String str2 = Integer.toString(paramInt);
    Cursor localCursor = null;
    Object localObject5 = this;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.c;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, (String)localObject4, str2);
      if (localCursor != null) {
        for (;;)
        {
          boolean bool1 = localCursor.moveToNext();
          if (!bool1) {
            break;
          }
          localObject4 = new com/vvt/events/FxVoipCallRecordingEvent;
          ((FxVoipCallRecordingEvent)localObject4).<init>();
          localObject2 = "_id";
          int i = localCursor.getColumnIndex((String)localObject2);
          long l1 = localCursor.getLong(i);
          localObject2 = "time";
          i = localCursor.getColumnIndex((String)localObject2);
          long l2 = localCursor.getLong(i);
          localObject2 = "category";
          i = localCursor.getColumnIndex((String)localObject2);
          int j = localCursor.getInt(i);
          localObject2 = "direction";
          i = localCursor.getColumnIndex((String)localObject2);
          i = localCursor.getInt(i);
          String str3 = "duration";
          int k = localCursor.getColumnIndex(str3);
          k = localCursor.getInt(k);
          String str4 = "owner_id";
          int m = localCursor.getColumnIndex(str4);
          str4 = localCursor.getString(m);
          String str5 = "owner_contact_name";
          int n = localCursor.getColumnIndex(str5);
          str5 = localCursor.getString(n);
          String str6 = "is_monitor";
          int i1 = localCursor.getColumnIndex(str6);
          i1 = localCursor.getInt(i1);
          String str7 = "file_name";
          int i2 = localCursor.getColumnIndex(str7);
          str7 = localCursor.getString(i2);
          String str8 = "format";
          int i3 = localCursor.getColumnIndex(str8);
          i3 = localCursor.getInt(i3);
          FxEventDirection localFxEventDirection = FxEventDirection.forValue(i);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          Object localObject6 = "call_recording_id = ";
          localObject5 = localObject6;
          localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
          localObject2 = ((StringBuilder)localObject2).append(l1);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject5 = this;
          localObject5 = this.c;
          localObject6 = localObject5;
          localObject6 = n.e((SQLiteDatabase)localObject5, (String)localObject2);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          Object localObject7 = "call_recording_id = ";
          localObject5 = localObject7;
          localObject2 = ((StringBuilder)localObject2).append((String)localObject7);
          localObject2 = ((StringBuilder)localObject2).append(l1);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject5 = this;
          localObject5 = this.c;
          localObject7 = localObject5;
          localObject2 = n.f((SQLiteDatabase)localObject5, (String)localObject2);
          int i4 = ((List)localObject2).size();
          if (i4 > 0)
          {
            i4 = 0;
            localObject7 = null;
            localObject5 = null;
            localObject2 = ((List)localObject2).get(0);
            localObject2 = (com.vvt.events.a)localObject2;
            localObject2 = ((com.vvt.events.a)localObject2).b();
            ((FxVoipCallRecordingEvent)localObject4).setFilePath((String)localObject2);
          }
          ((FxVoipCallRecordingEvent)localObject4).setEventId(l1);
          ((FxVoipCallRecordingEvent)localObject4).setEventTime(l2);
          localObject2 = FxVoipCategory.forValue(j);
          ((FxVoipCallRecordingEvent)localObject4).setVoipCategory((FxVoipCategory)localObject2);
          localObject5 = localFxEventDirection;
          ((FxVoipCallRecordingEvent)localObject4).setDirection(localFxEventDirection);
          l1 = k;
          ((FxVoipCallRecordingEvent)localObject4).setDuration(l1);
          localObject2 = new java/util/ArrayList;
          localObject5 = localObject6;
          ((ArrayList)localObject2).<init>((Collection)localObject6);
          ((FxVoipCallRecordingEvent)localObject4).setRecipientStore((ArrayList)localObject2);
          ((FxVoipCallRecordingEvent)localObject4).setOwnerId(str4);
          ((FxVoipCallRecordingEvent)localObject4).setOwnerContactName(str5);
          localObject2 = FxVoipCallLogEvent.FxIsMonitor.forValue(i1);
          ((FxVoipCallRecordingEvent)localObject4).setIsMonitor((FxVoipCallLogEvent.FxIsMonitor)localObject2);
          ((FxVoipCallRecordingEvent)localObject4).setFileName(str7);
          ((FxVoipCallRecordingEvent)localObject4).setMediaType(i3);
          ((List)localObject1).add(localObject4);
        }
      }
      String str1;
      if (localCursor == null) {
        break label731;
      }
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
        str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject1).<init>(str1);
        throw ((Throwable)localObject1);
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
      localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject4 = localThrowable.getMessage();
      ((FxDbOperationException)localObject1).<init>((String)localObject4, localThrowable);
    }
    localCursor.close();
    label731:
    boolean bool2 = a;
    if (bool2) {}
    return (List)localObject1;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxVoipCallRecordingEvent)paramFxEvent;
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    Object localObject3 = Long.valueOf(paramFxEvent.getEventTime());
    ((ContentValues)localObject1).put("time", (Long)localObject3);
    localObject3 = Integer.valueOf(paramFxEvent.getVoipCategory().getValue());
    ((ContentValues)localObject1).put("category", (Integer)localObject3);
    localObject3 = Integer.valueOf(paramFxEvent.getDirection().getNumber());
    ((ContentValues)localObject1).put("direction", (Integer)localObject3);
    long l1 = paramFxEvent.getDuration();
    localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject1).put("duration", (Long)localObject3);
    localObject3 = paramFxEvent.getOwnerId();
    ((ContentValues)localObject1).put("owner_id", (String)localObject3);
    localObject3 = paramFxEvent.getOwnerContactName();
    ((ContentValues)localObject1).put("owner_contact_name", (String)localObject3);
    localObject3 = Integer.valueOf(paramFxEvent.getIsMonitor().getValue());
    ((ContentValues)localObject1).put("is_monitor", (Integer)localObject3);
    localObject3 = paramFxEvent.getFileName();
    ((ContentValues)localObject1).put("file_name", (String)localObject3);
    Object localObject4 = "format";
    int i = paramFxEvent.getMediaType();
    localObject3 = Integer.valueOf(i);
    ((ContentValues)localObject1).put((String)localObject4, (Integer)localObject3);
    try
    {
      localObject4 = this.c;
      ((SQLiteDatabase)localObject4).beginTransaction();
      localObject4 = this.c;
      localObject3 = "voip_call_recording";
      Object localObject5 = null;
      long l2 = ((SQLiteDatabase)localObject4).insert((String)localObject3, null, (ContentValues)localObject1);
      int j = a;
      if (j != 0) {}
      long l3 = 0L;
      j = l2 < l3;
      if (j > 0)
      {
        localObject5 = new android/content/ContentValues;
        ((ContentValues)localObject5).<init>();
        j = 0;
        localObject1 = null;
        for (;;)
        {
          int m = paramFxEvent.getRecipientCount();
          if (j >= m) {
            break;
          }
          localObject6 = paramFxEvent.getRecipient(j);
          str2 = "call_recording_id";
          Object localObject7 = Long.valueOf(l2);
          ((ContentValues)localObject5).put(str2, (Long)localObject7);
          str2 = "recipient_type";
          localObject7 = ((h)localObject6).a();
          int n = ((FxRecipientType)localObject7).getNumber();
          localObject7 = Integer.valueOf(n);
          ((ContentValues)localObject5).put(str2, (Integer)localObject7);
          str2 = "recipient";
          localObject7 = ((h)localObject6).b();
          ((ContentValues)localObject5).put(str2, (String)localObject7);
          str2 = "contact_name";
          localObject6 = ((h)localObject6).c();
          ((ContentValues)localObject5).put(str2, (String)localObject6);
          localObject6 = this.c;
          str2 = "recipient";
          n = 0;
          localObject7 = null;
          ((SQLiteDatabase)localObject6).insert(str2, null, (ContentValues)localObject5);
          boolean bool2 = a;
          if (bool2) {}
          int k;
          j += 1;
        }
        localObject1 = new android/content/ContentValues;
        ((ContentValues)localObject1).<init>();
        localObject5 = "call_recording_id";
        Object localObject6 = Long.valueOf(l2);
        ((ContentValues)localObject1).put((String)localObject5, (Long)localObject6);
        localObject5 = "full_path";
        localObject6 = paramFxEvent.getFileName();
        ((ContentValues)localObject1).put((String)localObject5, (String)localObject6);
        localObject5 = "file_path";
        localObject6 = paramFxEvent.getFilePath();
        ((ContentValues)localObject1).put((String)localObject5, (String)localObject6);
        localObject5 = this.c;
        localObject6 = "attachment";
        String str2 = null;
        ((SQLiteDatabase)localObject5).insert((String)localObject6, null, (ContentValues)localObject1);
        boolean bool1 = a;
        if (bool1) {}
        localObject1 = this.c;
        localObject5 = FxEventType.VOIP_CALL_RECORDING;
        localObject6 = paramFxEvent.getDirection();
        n.a((SQLiteDatabase)localObject1, l2, (FxEventType)localObject5, (FxEventDirection)localObject6);
      }
      localObject1 = this.c;
      ((SQLiteDatabase)localObject1).setTransactionSuccessful();
      this.c.endTransaction();
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
        this.c.endTransaction();
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
    return b(paramQueryOrder, paramInt);
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.c;
      localObject = "voip_call_recording";
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
    Object localObject4;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "call_recording_id = ";
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
      localObject5 = "voip_call_recording";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/ak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */