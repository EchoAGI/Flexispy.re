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
import com.vvt.events.FxMediaType;
import com.vvt.events.FxPanicImageEvent;
import com.vvt.events.c;
import com.vvt.events.f;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbIdNotFoundException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import com.vvt.io.exception.FxFileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ab
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public ab(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private long a(long paramLong, FxPanicImageEvent paramFxPanicImageEvent)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(paramFxPanicImageEvent.getActualSize());
    localContentValues.put("actual_size", (Integer)localObject1);
    localObject1 = Long.valueOf(paramLong);
    localContentValues.put("media_id", (Long)localObject1);
    Object localObject2 = "actual_duration";
    localObject1 = Integer.valueOf(0);
    localContentValues.put((String)localObject2, (Integer)localObject1);
    try
    {
      localObject2 = this.b;
      localObject1 = "thumbnail";
      return ((SQLiteDatabase)localObject2).insert((String)localObject1, null, localContentValues);
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
      localObject1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject1, localThrowable);
    }
  }
  
  private long a(FxPanicImageEvent paramFxPanicImageEvent)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(0);
    localContentValues.put("has_thumbnail", (Integer)localObject1);
    localObject1 = Integer.valueOf(0);
    localContentValues.put("thumbnail_delivered", (Integer)localObject1);
    long l = paramFxPanicImageEvent.getEventTime();
    localObject1 = Long.valueOf(l);
    localContentValues.put("time", (Long)localObject1);
    localObject1 = paramFxPanicImageEvent.getActualFullPath();
    localContentValues.put("full_path", (String)localObject1);
    Object localObject2 = "media_event_type";
    int i = FxEventType.PANIC_IMAGE.getNumber();
    localObject1 = Integer.valueOf(i);
    localContentValues.put((String)localObject2, (Integer)localObject1);
    try
    {
      localObject2 = this.b;
      localObject1 = "media";
      return ((SQLiteDatabase)localObject2).insert((String)localObject1, null, localContentValues);
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
      localObject1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject1, localThrowable);
    }
  }
  
  private void b(long paramLong, FxPanicImageEvent paramFxPanicImageEvent)
  {
    Object localObject1 = paramFxPanicImageEvent.getGeoTag();
    Object localObject2;
    Object localObject3;
    float f;
    Object localObject4;
    if (localObject1 != null)
    {
      localObject2 = new android/content/ContentValues;
      ((ContentValues)localObject2).<init>();
      localObject3 = Long.valueOf(paramLong);
      ((ContentValues)localObject2).put("_id", (Long)localObject3);
      f = ((c)localObject1).c();
      localObject3 = Float.valueOf(f);
      ((ContentValues)localObject2).put("altitude", (Float)localObject3);
      localObject3 = Double.valueOf(((c)localObject1).a());
      ((ContentValues)localObject2).put("latitude", (Double)localObject3);
      double d = ((c)localObject1).b();
      localObject1 = Double.valueOf(d);
      ((ContentValues)localObject2).put("longitude", (Double)localObject1);
      localObject4 = paramFxPanicImageEvent.getNetworkId();
      ((ContentValues)localObject2).put("network_id", (String)localObject4);
      localObject4 = paramFxPanicImageEvent.getAreaCode();
      ((ContentValues)localObject2).put("area_code", (String)localObject4);
      int i = paramFxPanicImageEvent.getCellId();
      localObject4 = Integer.valueOf(i);
      ((ContentValues)localObject2).put("cell_id", (Integer)localObject4);
      localObject1 = "country_code";
      localObject4 = paramFxPanicImageEvent.getCountryCode();
      ((ContentValues)localObject2).put((String)localObject1, (String)localObject4);
    }
    try
    {
      localObject1 = this.b;
      localObject4 = "gps_tag";
      f = 0.0F;
      localObject3 = null;
      ((SQLiteDatabase)localObject1).insert((String)localObject4, null, (ContentValues)localObject2);
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
      localObject4 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject4, localThrowable);
    }
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxPanicImageEvent)paramFxEvent;
    Object localObject3;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localSQLiteDatabase.beginTransaction();
      long l1 = a(paramFxEvent);
      a(l1, paramFxEvent);
      b(l1, paramFxEvent);
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (bool)
      {
        localObject2 = this.b;
        FxEventType localFxEventType = FxEventType.PANIC_IMAGE;
        FxEventDirection localFxEventDirection = FxEventDirection.UNKNOWN;
        n.a((SQLiteDatabase)localObject2, l1, localFxEventType, localFxEventDirection);
      }
      localObject2 = this.b;
      ((SQLiteDatabase)localObject2).setTransactionSuccessful();
      this.b.endTransaction();
      return l1;
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
      Object localObject2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>((String)localObject2, localThrowable);
    }
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    int i = FxEventType.PANIC_IMAGE.getNumber();
    Object localObject5 = Integer.toString(i);
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    localObject6 = ((StringBuilder)localObject6).append("SELECT media._id, longitude, latitude, altitude, cell_id, area_code, network_id, country_code, time, media.full_path as actual_path, media_event_type, thumbnail_delivered, has_thumbnail, thumbnail.full_path as thumbnail_path, actual_size, actual_duration FROM media LEFT JOIN gps_tag ON gps_tag._id = media._id LEFT JOIN thumbnail ON media._id = thumbnail.media_id WHERE media.thumbnail_delivered = 0 AND media.media_event_type = ? ");
    Object localObject7 = " ORDER BY media.";
    localObject2 = ((StringBuilder)localObject6).append((String)localObject7).append((String)localObject2);
    localObject6 = " LIMIT ";
    localObject2 = (String)localObject6 + (String)localObject4;
    localObject4 = null;
    for (;;)
    {
      try
      {
        localObject6 = this.b;
        int j = 1;
        localObject7 = new String[j];
        localObject7[0] = localObject5;
        localObject4 = ((SQLiteDatabase)localObject6).rawQuery((String)localObject2, (String[])localObject7);
        long l1;
        if (localObject4 != null)
        {
          boolean bool1 = ((Cursor)localObject4).moveToNext();
          if (bool1)
          {
            localObject6 = new com/vvt/events/FxPanicImageEvent;
            ((FxPanicImageEvent)localObject6).<init>();
            localObject2 = "_id";
            int k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            l1 = ((Cursor)localObject4).getLong(k);
            localObject2 = "time";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            long l2 = ((Cursor)localObject4).getLong(k);
            localObject2 = "altitude";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            float f1 = ((Cursor)localObject4).getFloat(k);
            localObject2 = "latitude";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            float f2 = ((Cursor)localObject4).getFloat(k);
            localObject2 = "longitude";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            float f3 = ((Cursor)localObject4).getFloat(k);
            localObject2 = "actual_path";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            String str2 = ((Cursor)localObject4).getString(k);
            localObject2 = "actual_size";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            int m = ((Cursor)localObject4).getInt(k);
            localObject2 = "actual_duration";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            int n = ((Cursor)localObject4).getInt(k);
            localObject2 = "cell_id";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            int i1 = ((Cursor)localObject4).getInt(k);
            localObject2 = "area_code";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            String str3 = ((Cursor)localObject4).getString(k);
            localObject2 = "network_id";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            String str4 = ((Cursor)localObject4).getString(k);
            localObject2 = "country_code";
            k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
            String str5 = ((Cursor)localObject4).getString(k);
            localObject2 = new com/vvt/events/c;
            ((c)localObject2).<init>();
            ((c)localObject2).a(f1);
            double d1 = f2;
            ((c)localObject2).a(d1);
            d1 = f3;
            ((c)localObject2).b(d1);
            k = 0;
            localObject2 = null;
            localObject2 = new byte[0];
            if (str2 == null) {
              break label931;
            }
            localObject2 = new java/io/File;
            ((File)localObject2).<init>(str2);
            bool2 = ((File)localObject2).exists();
            if (bool2)
            {
              localObject2 = d.c(str2);
              localObject5 = localObject2;
              localObject2 = FxMediaType.UNKNOWN;
              if (str2 != null)
              {
                localObject8 = "";
                boolean bool3 = str2.endsWith((String)localObject8);
                if (!bool3)
                {
                  localObject8 = new java/io/File;
                  ((File)localObject8).<init>(str2);
                  bool3 = ((File)localObject8).exists();
                  if (bool3)
                  {
                    localObject2 = d.a(str2);
                    localObject2 = f.a((String)localObject2);
                  }
                }
              }
              Object localObject8 = new com/vvt/events/c;
              ((c)localObject8).<init>();
              ((c)localObject8).a(f1);
              double d2 = f2;
              ((c)localObject8).a(d2);
              d2 = f3;
              ((c)localObject8).b(d2);
              ((FxPanicImageEvent)localObject6).setGeoTag((c)localObject8);
              ((FxPanicImageEvent)localObject6).setActualFullPath(str2);
              ((FxPanicImageEvent)localObject6).setAreaCode(str3);
              ((FxPanicImageEvent)localObject6).setCellId(i1);
              ((FxPanicImageEvent)localObject6).setCountryCode(str5);
              ((FxPanicImageEvent)localObject6).setEventId(l1);
              ((FxPanicImageEvent)localObject6).setEventTime(l2);
              ((FxPanicImageEvent)localObject6).setFormat((FxMediaType)localObject2);
              ((FxPanicImageEvent)localObject6).setImageData((byte[])localObject5);
              ((FxPanicImageEvent)localObject6).setNetworkId(str4);
              ((FxPanicImageEvent)localObject6).setActualDuration(n);
              ((FxPanicImageEvent)localObject6).setActualSize(m);
              localObject2 = "unknown";
              ((FxPanicImageEvent)localObject6).setNetworkName((String)localObject2);
              localObject2 = "unknown";
              ((FxPanicImageEvent)localObject6).setCellName((String)localObject2);
              ((List)localObject1).add(localObject6);
              continue;
            }
          }
        }
        String str1;
        FxFileNotFoundException localFxFileNotFoundException;
        int i2;
        if (localObject4 == null) {
          break label919;
        }
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        try
        {
          localObject5 = new com/vvt/exceptions/database/FxDbCorruptException;
          str1 = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject5).<init>(str1);
          throw ((Throwable)localObject5);
        }
        finally
        {
          if (localObject4 != null) {
            ((Cursor)localObject4).close();
          }
        }
        localFxFileNotFoundException = new com/vvt/io/exception/FxFileNotFoundException;
        localObject5 = "Cannot upload media file.\nFile has been removed.\nPairing ID: %s";
        i2 = 1;
        localObject1 = new Object[i2];
        localObject6 = null;
        localObject7 = Long.valueOf(l1);
        localObject1[0] = localObject7;
        localObject5 = String.format((String)localObject5, (Object[])localObject1);
        localFxFileNotFoundException.<init>((String)localObject5);
        throw localFxFileNotFoundException;
      }
      finally
      {
        localObject5 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject1 = localThrowable.getMessage();
        ((FxDbOperationException)localObject5).<init>((String)localObject1, localThrowable);
      }
      ((Cursor)localObject4).close();
      label919:
      boolean bool2 = a;
      if (bool2) {}
      return (List)localObject1;
      label931:
      localObject5 = localThrowable;
    }
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "media";
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
    int i = 1;
    Object localObject2;
    int j;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject2 = this.b;
      localObject3 = "media";
      j = ((SQLiteDatabase)localObject2).delete((String)localObject3, (String)localObject1, null);
      if (j < i)
      {
        localObject1 = new com/vvt/exceptions/database/FxDbIdNotFoundException;
        localObject2 = "Pairing ID: %s not found!";
        int k = 1;
        localObject3 = new Object[k];
        Long localLong = Long.valueOf(paramLong);
        localObject3[0] = localLong;
        localObject2 = String.format((String)localObject2, (Object[])localObject3);
        ((FxDbIdNotFoundException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
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
    return j;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */