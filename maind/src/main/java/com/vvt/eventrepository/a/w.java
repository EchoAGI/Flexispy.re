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
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.e;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class w
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public w(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private void a(Cursor paramCursor)
  {
    if (paramCursor != null) {
      for (;;)
      {
        boolean bool1 = paramCursor.moveToNext();
        if (bool1)
        {
          int i = paramCursor.getColumnIndex("thumbnail_path");
          String str1 = paramCursor.getString(i);
          int j = paramCursor.getColumnIndex("file_path");
          String str2 = paramCursor.getString(j);
          if (str1 != null)
          {
            String str3 = "";
            boolean bool3 = str1.equals(str3);
            if (bool3) {}
          }
          try
          {
            com.vvt.io.d.b(str1);
            if (str2 != null)
            {
              str1 = "";
              boolean bool2 = str2.equals(str1);
              if (!bool2) {
                try
                {
                  com.vvt.io.d.b(str2);
                }
                catch (IllegalArgumentException localIllegalArgumentException1) {}
              }
            }
          }
          catch (IllegalArgumentException localIllegalArgumentException2)
          {
            for (;;) {}
          }
        }
      }
    }
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxIMMessageEvent)paramFxEvent;
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    long l1 = paramFxEvent.getEventTime();
    Object localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject1).put("time", (Long)localObject3);
    localObject3 = Integer.valueOf(paramFxEvent.getDirection().getNumber());
    ((ContentValues)localObject1).put("direction", (Integer)localObject3);
    localObject3 = Integer.valueOf(paramFxEvent.getImServiceId());
    ((ContentValues)localObject1).put("im_service_id", (Integer)localObject3);
    localObject3 = paramFxEvent.getConversationId();
    ((ContentValues)localObject1).put("conversation_id", (String)localObject3);
    localObject3 = paramFxEvent.getSenderId();
    ((ContentValues)localObject1).put("message_originator_id", (String)localObject3);
    localObject3 = paramFxEvent.getMessageLocation().a();
    ((ContentValues)localObject1).put("message_location_place", (String)localObject3);
    localObject3 = Double.valueOf(paramFxEvent.getMessageLocation().b());
    ((ContentValues)localObject1).put("message_lattitude", (Double)localObject3);
    double d1 = paramFxEvent.getMessageLocation().c();
    localObject3 = Double.valueOf(d1);
    ((ContentValues)localObject1).put("message_longitude", (Double)localObject3);
    float f1 = paramFxEvent.getMessageLocation().d();
    localObject3 = Float.valueOf(f1);
    ((ContentValues)localObject1).put("message_hor_accuracy", (Float)localObject3);
    int i = paramFxEvent.getTextRepresentation();
    localObject3 = Integer.valueOf(i);
    ((ContentValues)localObject1).put("text_representation", (Integer)localObject3);
    Object localObject4 = "message_data";
    localObject3 = paramFxEvent.getMessage();
    ((ContentValues)localObject1).put((String)localObject4, (String)localObject3);
    try
    {
      localObject4 = this.b;
      ((SQLiteDatabase)localObject4).beginTransaction();
      localObject4 = this.b;
      localObject3 = "im_message";
      Object localObject5 = null;
      long l2 = ((SQLiteDatabase)localObject4).insert((String)localObject3, null, (ContentValues)localObject1);
      localObject5 = new android/content/ContentValues;
      ((ContentValues)localObject5).<init>();
      int j = 0;
      localObject1 = null;
      Object localObject6;
      Object localObject7;
      for (;;)
      {
        int k = paramFxEvent.getAttachmentCount();
        if (j >= k) {
          break;
        }
        localObject6 = paramFxEvent.getAttachment(j);
        localObject7 = "msg_id";
        Object localObject8 = Long.valueOf(l2);
        ((ContentValues)localObject5).put((String)localObject7, (Long)localObject8);
        localObject7 = "fullname";
        localObject8 = ((com.vvt.events.d)localObject6).a();
        ((ContentValues)localObject5).put((String)localObject7, (String)localObject8);
        localObject7 = "mime_type";
        localObject8 = ((com.vvt.events.d)localObject6).c();
        ((ContentValues)localObject5).put((String)localObject7, (String)localObject8);
        localObject7 = "thumbnail_path";
        localObject8 = ((com.vvt.events.d)localObject6).d();
        ((ContentValues)localObject5).put((String)localObject7, (String)localObject8);
        localObject7 = "file_path";
        localObject6 = ((com.vvt.events.d)localObject6).b();
        ((ContentValues)localObject5).put((String)localObject7, (String)localObject6);
        localObject6 = this.b;
        localObject7 = "im_attachment";
        localObject8 = null;
        ((SQLiteDatabase)localObject6).insert((String)localObject7, null, (ContentValues)localObject5);
        j += 1;
      }
      localObject1 = paramFxEvent.getShareLocation();
      if (localObject1 != null)
      {
        localObject5 = new android/content/ContentValues;
        ((ContentValues)localObject5).<init>();
        localObject6 = "msg_id";
        localObject7 = Long.valueOf(l2);
        ((ContentValues)localObject5).put((String)localObject6, (Long)localObject7);
        localObject6 = "hor_accuracy";
        float f2 = ((e)localObject1).d();
        localObject7 = Float.valueOf(f2);
        ((ContentValues)localObject5).put((String)localObject6, (Float)localObject7);
        localObject6 = "lattitude";
        double d2 = ((e)localObject1).b();
        localObject7 = Double.valueOf(d2);
        ((ContentValues)localObject5).put((String)localObject6, (Double)localObject7);
        localObject6 = "longitude";
        d2 = ((e)localObject1).c();
        localObject7 = Double.valueOf(d2);
        ((ContentValues)localObject5).put((String)localObject6, (Double)localObject7);
        localObject6 = "location_place";
        localObject1 = ((e)localObject1).a();
        ((ContentValues)localObject5).put((String)localObject6, (String)localObject1);
        localObject1 = this.b;
        localObject6 = "im_share_location";
        f2 = 0.0F;
        localObject7 = null;
        ((SQLiteDatabase)localObject1).insert((String)localObject6, null, (ContentValues)localObject5);
      }
      long l3 = 0L;
      boolean bool = l2 < l3;
      if (bool)
      {
        localObject1 = this.b;
        localObject5 = FxEventType.IM_MESSAGE;
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
        String str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject4).<init>(str);
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
    Object localObject2 = "im_message";
    Object localObject4 = n.a(paramQueryOrder);
    Object localObject5 = Integer.toString(paramInt);
    Object localObject6 = this;
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
          localObject5 = new com/vvt/events/FxIMMessageEvent;
          ((FxIMMessageEvent)localObject5).<init>();
          localObject2 = "_id";
          int i = localCursor.getColumnIndex((String)localObject2);
          long l1 = localCursor.getLong(i);
          localObject2 = "time";
          i = localCursor.getColumnIndex((String)localObject2);
          long l2 = localCursor.getLong(i);
          localObject2 = "direction";
          i = localCursor.getColumnIndex((String)localObject2);
          i = localCursor.getInt(i);
          localObject4 = "im_service_id";
          int j = localCursor.getColumnIndex((String)localObject4);
          j = localCursor.getInt(j);
          String str2 = "conversation_id";
          int k = localCursor.getColumnIndex(str2);
          str2 = localCursor.getString(k);
          String str3 = "message_originator_id";
          int m = localCursor.getColumnIndex(str3);
          str3 = localCursor.getString(m);
          String str4 = "message_location_place";
          int n = localCursor.getColumnIndex(str4);
          str4 = localCursor.getString(n);
          String str5 = "message_lattitude";
          int i1 = localCursor.getColumnIndex(str5);
          double d1 = localCursor.getDouble(i1);
          String str6 = "message_longitude";
          localObject6 = str6;
          int i2 = localCursor.getColumnIndex(str6);
          double d2 = localCursor.getDouble(i2);
          String str7 = "message_hor_accuracy";
          localObject6 = str7;
          int i3 = localCursor.getColumnIndex(str7);
          float f = localCursor.getFloat(i3);
          String str8 = "text_representation";
          localObject6 = str8;
          int i4 = localCursor.getColumnIndex(str8);
          i4 = localCursor.getInt(i4);
          String str9 = "message_data";
          localObject6 = str9;
          int i5 = localCursor.getColumnIndex(str9);
          str9 = localCursor.getString(i5);
          Object localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>();
          Object localObject8 = "msg_id = ";
          localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
          localObject6 = localObject7;
          localObject7 = ((StringBuilder)localObject7).append(l1);
          localObject7 = ((StringBuilder)localObject7).toString();
          localObject6 = this;
          localObject6 = this.b;
          localObject8 = localObject6;
          localObject7 = n.b((SQLiteDatabase)localObject6, (String)localObject7);
          boolean bool3 = a;
          if (bool3) {}
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          Object localObject9 = "msg_id = ";
          localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
          localObject6 = localObject8;
          localObject8 = ((StringBuilder)localObject8).append(l1);
          localObject8 = ((StringBuilder)localObject8).toString();
          localObject6 = this;
          localObject6 = this.b;
          localObject9 = localObject6;
          localObject8 = n.c((SQLiteDatabase)localObject6, (String)localObject8);
          boolean bool4 = a;
          if (bool4) {}
          localObject2 = FxEventDirection.forValue(i);
          localObject9 = new com/vvt/events/e;
          ((e)localObject9).<init>();
          localObject6 = localObject9;
          ((e)localObject9).a(f);
          ((e)localObject9).a(d1);
          ((e)localObject9).b(d2);
          ((e)localObject9).a(str4);
          ((FxIMMessageEvent)localObject5).setEventId(l1);
          ((FxIMMessageEvent)localObject5).setEventTime(l2);
          ((FxIMMessageEvent)localObject5).setDirection((FxEventDirection)localObject2);
          ((FxIMMessageEvent)localObject5).setImServiceId(j);
          ((FxIMMessageEvent)localObject5).setConversationId(str2);
          ((FxIMMessageEvent)localObject5).setSenderId(str3);
          ((FxIMMessageEvent)localObject5).setMessageLocation((e)localObject9);
          ((FxIMMessageEvent)localObject5).setTextRepresentation(i4);
          localObject6 = str9;
          ((FxIMMessageEvent)localObject5).setMessage(str9);
          i = ((List)localObject8).size();
          if (i > 0)
          {
            i = 0;
            localObject2 = null;
            localObject6 = localObject8;
            localObject2 = ((List)localObject8).get(0);
            localObject2 = (e)localObject2;
            ((FxIMMessageEvent)localObject5).setShareLocation((e)localObject2);
          }
          i = 0;
          localObject2 = null;
          j = 0;
          localObject4 = null;
          for (;;)
          {
            i = ((List)localObject7).size();
            if (j >= i) {
              break;
            }
            localObject6 = localObject7;
            localObject2 = ((List)localObject7).get(j);
            localObject2 = (com.vvt.events.d)localObject2;
            ((FxIMMessageEvent)localObject5).addAttachment((com.vvt.events.d)localObject2);
            i = j + 1;
            j = i;
          }
          ((List)localObject1).add(localObject5);
        }
      }
      String str1;
      if (localCursor == null) {
        break label883;
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
    label883:
    boolean bool2 = a;
    if (bool2) {}
    return (List)localObject1;
  }
  
  public void a()
  {
    Cursor localCursor = null;
    Object localObject2;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject2 = "im_attachment";
      str2 = null;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, null, null);
      a(localCursor);
      localSQLiteDatabase = this.b;
      localObject2 = "im_message";
      str2 = null;
      localSQLiteDatabase.delete((String)localObject2, null, null);
      if (localCursor != null) {
        localCursor.close();
      }
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
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
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
  }
  
  public int b(long paramLong)
  {
    Cursor localCursor = null;
    Object localObject3;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "msg_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = this.b;
      str2 = "im_attachment";
      localCursor = n.a((SQLiteDatabase)localObject3, str2, (String)localObject1, null, null);
      a(localCursor);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = this.b;
      str2 = "im_message";
      int i = ((SQLiteDatabase)localObject3).delete(str2, (String)localObject1, null);
      if (localCursor != null) {
        localCursor.close();
      }
      return i;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject3).<init>(str1);
        throw ((Throwable)localObject3);
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
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>(str2, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */