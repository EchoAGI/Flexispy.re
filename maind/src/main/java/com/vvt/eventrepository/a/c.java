package com.vvt.eventrepository.a;

import android.database.sqlite.SQLiteDatabase;
import com.vvt.base.FxEvent;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAlertGpsEvent;
import com.vvt.events.FxCallingModuleType;
import com.vvt.events.FxLocationEvent;
import com.vvt.events.FxLocationMapProvider;
import com.vvt.events.FxLocationMethod;
import java.util.ArrayList;
import java.util.List;

public class c
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  private x c;
  
  public c(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
    x localx = new com/vvt/eventrepository/a/x;
    SQLiteDatabase localSQLiteDatabase = this.b;
    FxCallingModuleType localFxCallingModuleType = FxCallingModuleType.ALERT;
    localx.<init>(localSQLiteDatabase, localFxCallingModuleType);
    this.c = localx;
  }
  
  private FxAlertGpsEvent a(FxLocationEvent paramFxLocationEvent)
  {
    FxAlertGpsEvent localFxAlertGpsEvent = new com/vvt/events/FxAlertGpsEvent;
    localFxAlertGpsEvent.<init>();
    long l = paramFxLocationEvent.getEventId();
    localFxAlertGpsEvent.setEventId(l);
    l = paramFxLocationEvent.getCellId();
    localFxAlertGpsEvent.setCellId(l);
    l = paramFxLocationEvent.getEventTime();
    localFxAlertGpsEvent.setEventTime(l);
    double d = paramFxLocationEvent.getLatitude();
    localFxAlertGpsEvent.setLatitude(d);
    d = paramFxLocationEvent.getLongitude();
    localFxAlertGpsEvent.setLongitude(d);
    d = paramFxLocationEvent.getAltitude();
    localFxAlertGpsEvent.setAltitude(d);
    float f = paramFxLocationEvent.getHeading();
    localFxAlertGpsEvent.setHeading(f);
    f = paramFxLocationEvent.getHeadingAccuracy();
    localFxAlertGpsEvent.setHeadingAccuracy(f);
    f = paramFxLocationEvent.getHorizontalAccuracy();
    localFxAlertGpsEvent.setHorizontalAccuracy(f);
    f = paramFxLocationEvent.getSpeed();
    localFxAlertGpsEvent.setSpeed(f);
    f = paramFxLocationEvent.getSpeedAccuracy();
    localFxAlertGpsEvent.setSpeedAccuracy(f);
    f = paramFxLocationEvent.getVerticalAccuracy();
    localFxAlertGpsEvent.setVerticalAccuracy(f);
    l = paramFxLocationEvent.getAreaCode();
    localFxAlertGpsEvent.setAreaCode(l);
    Object localObject = paramFxLocationEvent.getCellName();
    localFxAlertGpsEvent.setCellName((String)localObject);
    localObject = paramFxLocationEvent.getMobileCountryCode();
    localFxAlertGpsEvent.setMobileCountryCode((String)localObject);
    localObject = paramFxLocationEvent.getNetworkId();
    localFxAlertGpsEvent.setNetworkId((String)localObject);
    localObject = paramFxLocationEvent.getNetworkName();
    localFxAlertGpsEvent.setNetworkName((String)localObject);
    boolean bool = paramFxLocationEvent.isMockLocaion();
    localFxAlertGpsEvent.setIsMockLocaion(bool);
    localObject = paramFxLocationEvent.getMethod();
    localFxAlertGpsEvent.setMethod((FxLocationMethod)localObject);
    localObject = paramFxLocationEvent.getMapProvider();
    localFxAlertGpsEvent.setMapProvider((FxLocationMapProvider)localObject);
    return localFxAlertGpsEvent;
  }
  
  private FxLocationEvent a(FxAlertGpsEvent paramFxAlertGpsEvent)
  {
    FxLocationEvent localFxLocationEvent = new com/vvt/events/FxLocationEvent;
    localFxLocationEvent.<init>();
    long l = paramFxAlertGpsEvent.getCellId();
    localFxLocationEvent.setCellId(l);
    l = paramFxAlertGpsEvent.getEventTime();
    localFxLocationEvent.setEventTime(l);
    double d = paramFxAlertGpsEvent.getLatitude();
    localFxLocationEvent.setLatitude(d);
    d = paramFxAlertGpsEvent.getLongitude();
    localFxLocationEvent.setLongitude(d);
    d = paramFxAlertGpsEvent.getAltitude();
    localFxLocationEvent.setAltitude(d);
    float f = paramFxAlertGpsEvent.getHeading();
    localFxLocationEvent.setHeading(f);
    f = paramFxAlertGpsEvent.getHeadingAccuracy();
    localFxLocationEvent.setHeadingAccuracy(f);
    f = paramFxAlertGpsEvent.getHorizontalAccuracy();
    localFxLocationEvent.setHorizontalAccuracy(f);
    f = paramFxAlertGpsEvent.getSpeed();
    localFxLocationEvent.setSpeed(f);
    f = paramFxAlertGpsEvent.getSpeedAccuracy();
    localFxLocationEvent.setSpeedAccuracy(f);
    f = paramFxAlertGpsEvent.getVerticalAccuracy();
    localFxLocationEvent.setVerticalAccuracy(f);
    l = paramFxAlertGpsEvent.getAreaCode();
    localFxLocationEvent.setAreaCode(l);
    Object localObject = paramFxAlertGpsEvent.getCellName();
    localFxLocationEvent.setCellName((String)localObject);
    localObject = paramFxAlertGpsEvent.getMobileCountryCode();
    localFxLocationEvent.setMobileCountryCode((String)localObject);
    localObject = paramFxAlertGpsEvent.getNetworkId();
    localFxLocationEvent.setNetworkId((String)localObject);
    localObject = paramFxAlertGpsEvent.getNetworkName();
    localFxLocationEvent.setNetworkName((String)localObject);
    boolean bool = paramFxAlertGpsEvent.isMockLocaion();
    localFxLocationEvent.setIsMockLocaion(bool);
    localObject = paramFxAlertGpsEvent.getMethod();
    localFxLocationEvent.setMethod((FxLocationMethod)localObject);
    localObject = paramFxAlertGpsEvent.getMapProvider();
    localFxLocationEvent.setMapProvider((FxLocationMapProvider)localObject);
    return localFxLocationEvent;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxAlertGpsEvent)paramFxEvent;
    FxLocationEvent localFxLocationEvent = a(paramFxEvent);
    return this.c.a(localFxLocationEvent);
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    List localList = this.c.a(paramQueryOrder, paramInt);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    new FxLocationEvent();
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      i = localList.size();
      if (j >= i) {
        break;
      }
      new FxAlertGpsEvent();
      localObject = (FxLocationEvent)localList.get(j);
      localObject = a((FxLocationEvent)localObject);
      localArrayList.add(localObject);
      i = j + 1;
    }
    boolean bool = a;
    if (bool) {}
    return localArrayList;
  }
  
  public void a()
  {
    this.c.a();
  }
  
  public int b(long paramLong)
  {
    return this.c.b(paramLong);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */