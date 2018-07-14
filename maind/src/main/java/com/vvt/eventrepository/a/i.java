package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxBrowserUrlEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class i
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public i(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    Cursor localCursor = null;
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    String str1 = "browser_url";
    Object localObject4 = n.a(paramQueryOrder);
    String str3 = Integer.toString(paramInt);
    for (;;)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = this.b;
        localCursor = n.a(localSQLiteDatabase, str1, null, (String)localObject4, str3);
        if (localCursor == null) {
          break label386;
        }
        boolean bool1 = localCursor.moveToNext();
        if (!bool1) {
          break label386;
        }
        localObject4 = new com/vvt/events/FxBrowserUrlEvent;
        ((FxBrowserUrlEvent)localObject4).<init>();
        str1 = "_id";
        i = localCursor.getColumnIndex(str1);
        long l1 = localCursor.getLong(i);
        str1 = "time";
        i = localCursor.getColumnIndex(str1);
        long l2 = localCursor.getLong(i);
        str1 = "title";
        i = localCursor.getColumnIndex(str1);
        str1 = localCursor.getString(i);
        String str4 = "url";
        int j = localCursor.getColumnIndex(str4);
        str4 = localCursor.getString(j);
        String str5 = "visit_time";
        int k = localCursor.getColumnIndex(str5);
        long l3 = localCursor.getLong(k);
        String str6 = "is_blocked";
        int m = localCursor.getColumnIndex(str6);
        m = localCursor.getInt(m);
        str7 = "owning_app";
        int n = localCursor.getColumnIndex(str7);
        str7 = localCursor.getString(n);
        ((FxBrowserUrlEvent)localObject4).setEventId(l1);
        ((FxBrowserUrlEvent)localObject4).setEventTime(l2);
        ((FxBrowserUrlEvent)localObject4).setTitle(str1);
        ((FxBrowserUrlEvent)localObject4).setUrl(str4);
        ((FxBrowserUrlEvent)localObject4).setVisitTimeMs(l3);
        if (m <= 0) {
          continue;
        }
        i = 1;
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        try
        {
          int i;
          String str7;
          localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
          String str2 = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject1).<init>(str2);
          throw ((Throwable)localObject1);
        }
        finally
        {
          if (localCursor != null) {
            localCursor.close();
          }
        }
        bool2 = false;
        Object localObject3 = null;
        continue;
      }
      finally
      {
        localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject4 = localThrowable.getMessage();
        ((FxDbOperationException)localObject1).<init>((String)localObject4, localThrowable);
      }
      ((FxBrowserUrlEvent)localObject4).setBlocked(i);
      ((FxBrowserUrlEvent)localObject4).setOwningApp(str7);
      ((List)localObject1).add(localObject4);
    }
    label386:
    if (localCursor != null) {
      localCursor.close();
    }
    boolean bool2 = a;
    if (bool2) {}
    return (List)localObject1;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxBrowserUrlEvent)paramFxEvent;
    localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    localObject2 = Long.valueOf(paramFxEvent.getEventTime());
    ((ContentValues)localObject1).put("time", (Long)localObject2);
    localObject2 = paramFxEvent.getTitle();
    ((ContentValues)localObject1).put("title", (String)localObject2);
    localObject2 = paramFxEvent.getUrl();
    ((ContentValues)localObject1).put("url", (String)localObject2);
    Object localObject3 = "visit_time";
    long l1 = paramFxEvent.getVisitTimeMs();
    localObject2 = Long.valueOf(l1);
    ((ContentValues)localObject1).put((String)localObject3, (Long)localObject2);
    localObject2 = "is_blocked";
    int i = paramFxEvent.isBlocked();
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      localObject3 = Integer.valueOf(i);
      ((ContentValues)localObject1).put((String)localObject2, (Integer)localObject3);
      localObject3 = "owning_app";
      localObject2 = paramFxEvent.getOwningApp();
      ((ContentValues)localObject1).put((String)localObject3, (String)localObject2);
      try
      {
        localObject3 = this.b;
        ((SQLiteDatabase)localObject3).beginTransaction();
        localObject3 = this.b;
        localObject2 = "browser_url";
        FxEventType localFxEventType = null;
        long l2 = ((SQLiteDatabase)localObject3).insert((String)localObject2, null, (ContentValues)localObject1);
        l1 = 0L;
        boolean bool = l2 < l1;
        if (bool)
        {
          localObject2 = this.b;
          localFxEventType = FxEventType.BROWSER_URL;
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
          int j;
          localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
          String str = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
        finally
        {
          this.b.endTransaction();
        }
      }
      finally
      {
        localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject2 = localThrowable.getMessage();
        ((FxDbOperationException)localObject1).<init>((String)localObject2, localThrowable);
      }
      j = 0;
      localObject3 = null;
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
      localObject = "browser_url";
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
      str2 = "browser_url";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */