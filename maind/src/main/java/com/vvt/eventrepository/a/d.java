package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxApplicationEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class d
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public d(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "application";
    String str2 = n.a(paramQueryOrder);
    String str3 = Integer.toString(paramInt);
    int i = 0;
    String str4 = null;
    boolean bool1 = false;
    Cursor localCursor = null;
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
          localObject2 = new com/vvt/events/FxApplicationEvent;
          ((FxApplicationEvent)localObject2).<init>();
          str2 = "_id";
          int j = localCursor.getColumnIndex(str2);
          long l1 = localCursor.getLong(j);
          str4 = "time";
          i = localCursor.getColumnIndex(str4);
          long l2 = localCursor.getLong(i);
          String str5 = "state";
          int k = localCursor.getColumnIndex(str5);
          k = localCursor.getInt(k);
          String str6 = "type";
          int m = localCursor.getColumnIndex(str6);
          m = localCursor.getInt(m);
          String str7 = "app_id";
          int n = localCursor.getColumnIndex(str7);
          str7 = localCursor.getString(n);
          String str8 = "name";
          int i1 = localCursor.getColumnIndex(str8);
          str8 = localCursor.getString(i1);
          String str9 = "version";
          int i2 = localCursor.getColumnIndex(str9);
          str9 = localCursor.getString(i2);
          String str10 = "size";
          int i3 = localCursor.getColumnIndex(str10);
          i3 = localCursor.getInt(i3);
          Object localObject3 = "icon";
          int i4 = localCursor.getColumnIndex((String)localObject3);
          localObject3 = localCursor.getBlob(i4);
          ((FxApplicationEvent)localObject2).setEventId(l1);
          ((FxApplicationEvent)localObject2).setEventTime(l2);
          ((FxApplicationEvent)localObject2).setState(k);
          ((FxApplicationEvent)localObject2).setType(m);
          ((FxApplicationEvent)localObject2).setApplicationId(str7);
          ((FxApplicationEvent)localObject2).setName(str8);
          ((FxApplicationEvent)localObject2).setVersion(str9);
          ((FxApplicationEvent)localObject2).setSize(i3);
          ((FxApplicationEvent)localObject2).setIcon((byte[])localObject3);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label464;
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
    label464:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxApplicationEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    long l1 = paramFxEvent.getEventTime();
    Object localObject2 = Long.valueOf(l1);
    localContentValues.put("time", (Long)localObject2);
    localObject2 = Integer.valueOf(paramFxEvent.getState());
    localContentValues.put("state", (Integer)localObject2);
    localObject2 = Integer.valueOf(paramFxEvent.getType());
    localContentValues.put("type", (Integer)localObject2);
    localObject2 = paramFxEvent.getApplicationId();
    localContentValues.put("app_id", (String)localObject2);
    localObject2 = paramFxEvent.getName();
    localContentValues.put("name", (String)localObject2);
    localObject2 = paramFxEvent.getVersion();
    localContentValues.put("version", (String)localObject2);
    int i = paramFxEvent.getSize();
    localObject2 = Integer.valueOf(i);
    localContentValues.put("size", (Integer)localObject2);
    Object localObject3 = "icon";
    localObject2 = paramFxEvent.getIcon();
    localContentValues.put((String)localObject3, (byte[])localObject2);
    try
    {
      localObject3 = this.b;
      ((SQLiteDatabase)localObject3).beginTransaction();
      localObject3 = this.b;
      localObject2 = "application";
      FxEventType localFxEventType = null;
      long l2 = ((SQLiteDatabase)localObject3).insert((String)localObject2, null, localContentValues);
      l1 = 0L;
      boolean bool = l2 < l1;
      if (bool)
      {
        localObject2 = this.b;
        localFxEventType = FxEventType.APPLICATION;
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
    new ArrayList();
    return b(paramQueryOrder, paramInt);
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "application";
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
      str2 = "application";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */