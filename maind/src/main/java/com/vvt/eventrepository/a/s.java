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
import com.vvt.events.FxIMAccountEvent;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.util.ArrayList;
import java.util.List;

public class s
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public s(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private void a(Cursor paramCursor)
  {
    if (paramCursor != null) {
      for (;;)
      {
        boolean bool1 = paramCursor.moveToNext();
        if (!bool1) {
          break;
        }
        int i = paramCursor.getColumnIndex("profile_picture_path");
        String str1 = paramCursor.getString(i);
        if (str1 != null)
        {
          String str2 = "";
          boolean bool2 = str1.equals(str2);
          if (!bool2) {
            try
            {
              d.b(str1);
            }
            catch (IllegalArgumentException localIllegalArgumentException) {}
          }
        }
      }
    }
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxIMAccountEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    long l1 = paramFxEvent.getEventTime();
    Object localObject2 = Long.valueOf(l1);
    localContentValues.put("time", (Long)localObject2);
    int i = paramFxEvent.getImServiceId();
    localObject2 = Integer.valueOf(i);
    localContentValues.put("im_service_id", (Integer)localObject2);
    localObject2 = paramFxEvent.getOwnerId();
    localContentValues.put("owner_id", (String)localObject2);
    localObject2 = paramFxEvent.getOwnerDisplayName();
    localContentValues.put("display_name", (String)localObject2);
    localObject2 = paramFxEvent.getOwnerProfilePicturePath();
    localContentValues.put("profile_picture_path", (String)localObject2);
    Object localObject3 = "status_message";
    localObject2 = paramFxEvent.getOwnerStatusMessage();
    localContentValues.put((String)localObject3, (String)localObject2);
    try
    {
      localObject3 = this.b;
      ((SQLiteDatabase)localObject3).beginTransaction();
      localObject3 = this.b;
      localObject2 = "im_account";
      FxEventType localFxEventType = null;
      long l2 = ((SQLiteDatabase)localObject3).insert((String)localObject2, null, localContentValues);
      l1 = 0L;
      boolean bool = l2 < l1;
      if (bool)
      {
        localObject2 = this.b;
        localFxEventType = FxEventType.IM_ACCOUNT;
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
    boolean bool1 = false;
    Cursor localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "im_account";
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
          localObject2 = new com/vvt/events/FxIMAccountEvent;
          ((FxIMAccountEvent)localObject2).<init>();
          str2 = "_id";
          int j = localCursor.getColumnIndex(str2);
          long l1 = localCursor.getLong(j);
          str4 = "time";
          i = localCursor.getColumnIndex(str4);
          long l2 = localCursor.getLong(i);
          String str5 = "im_service_id";
          int k = localCursor.getColumnIndex(str5);
          k = localCursor.getInt(k);
          String str6 = "owner_id";
          int m = localCursor.getColumnIndex(str6);
          str6 = localCursor.getString(m);
          String str7 = "display_name";
          int n = localCursor.getColumnIndex(str7);
          str7 = localCursor.getString(n);
          String str8 = "profile_picture_path";
          int i1 = localCursor.getColumnIndex(str8);
          str8 = localCursor.getString(i1);
          String str9 = "status_message";
          int i2 = localCursor.getColumnIndex(str9);
          str9 = localCursor.getString(i2);
          ((FxIMAccountEvent)localObject2).setEventId(l1);
          ((FxIMAccountEvent)localObject2).setEventTime(l2);
          ((FxIMAccountEvent)localObject2).setImServiceId(k);
          ((FxIMAccountEvent)localObject2).setOwnerId(str6);
          ((FxIMAccountEvent)localObject2).setOwnerDisplayName(str7);
          ((FxIMAccountEvent)localObject2).setOwnerProfilePicturePath(str8);
          ((FxIMAccountEvent)localObject2).setOwnerStatusMessage(str9);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label409;
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
    label409:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public void a()
  {
    Cursor localCursor = null;
    Object localObject2;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject2 = "im_account";
      str2 = null;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, null, null);
      a(localCursor);
      localSQLiteDatabase = this.b;
      localObject2 = "im_account";
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
      localObject3 = "_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = this.b;
      str2 = "im_account";
      localCursor = n.a((SQLiteDatabase)localObject3, str2, (String)localObject1, null, null);
      a(localCursor);
      localObject3 = this.b;
      str2 = "im_account";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */