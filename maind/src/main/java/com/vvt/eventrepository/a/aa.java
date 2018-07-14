package com.vvt.eventrepository.a;

import android.database.sqlite.SQLiteDatabase;
import com.vvt.base.FxEvent;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxCallingModuleType;
import com.vvt.events.FxLocationEvent;
import com.vvt.events.FxLocationMapProvider;
import com.vvt.events.FxLocationMethod;
import com.vvt.events.FxPanicGpsEvent;
import java.util.ArrayList;
import java.util.List;

public class aa
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  private x c;
  
  public aa(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
    x localx = new com/vvt/eventrepository/a/x;
    SQLiteDatabase localSQLiteDatabase = this.b;
    FxCallingModuleType localFxCallingModuleType = FxCallingModuleType.PANIC;
    localx.<init>(localSQLiteDatabase, localFxCallingModuleType);
    this.c = localx;
  }
  
  private FxLocationEvent a(FxPanicGpsEvent paramFxPanicGpsEvent)
  {
    FxLocationEvent localFxLocationEvent = new com/vvt/events/FxLocationEvent;
    localFxLocationEvent.<init>();
    long l = paramFxPanicGpsEvent.getCellId();
    localFxLocationEvent.setCellId(l);
    l = paramFxPanicGpsEvent.getEventTime();
    localFxLocationEvent.setEventTime(l);
    double d = paramFxPanicGpsEvent.getLatitude();
    localFxLocationEvent.setLatitude(d);
    d = paramFxPanicGpsEvent.getLongitude();
    localFxLocationEvent.setLongitude(d);
    d = paramFxPanicGpsEvent.getAltitude();
    localFxLocationEvent.setAltitude(d);
    float f = paramFxPanicGpsEvent.getHeading();
    localFxLocationEvent.setHeading(f);
    f = paramFxPanicGpsEvent.getHeadingAccuracy();
    localFxLocationEvent.setHeadingAccuracy(f);
    f = paramFxPanicGpsEvent.getHorizontalAccuracy();
    localFxLocationEvent.setHorizontalAccuracy(f);
    f = paramFxPanicGpsEvent.getSpeed();
    localFxLocationEvent.setSpeed(f);
    f = paramFxPanicGpsEvent.getSpeedAccuracy();
    localFxLocationEvent.setSpeedAccuracy(f);
    f = paramFxPanicGpsEvent.getVerticalAccuracy();
    localFxLocationEvent.setVerticalAccuracy(f);
    l = paramFxPanicGpsEvent.getAreaCode();
    localFxLocationEvent.setAreaCode(l);
    Object localObject = paramFxPanicGpsEvent.getCellName();
    localFxLocationEvent.setCellName((String)localObject);
    localObject = paramFxPanicGpsEvent.getMobileCountryCode();
    localFxLocationEvent.setMobileCountryCode((String)localObject);
    localObject = paramFxPanicGpsEvent.getNetworkId();
    localFxLocationEvent.setNetworkId((String)localObject);
    localObject = paramFxPanicGpsEvent.getNetworkName();
    localFxLocationEvent.setNetworkName((String)localObject);
    boolean bool = paramFxPanicGpsEvent.isMockLocaion();
    localFxLocationEvent.setIsMockLocaion(bool);
    localObject = paramFxPanicGpsEvent.getMethod();
    localFxLocationEvent.setMethod((FxLocationMethod)localObject);
    localObject = paramFxPanicGpsEvent.getMapProvider();
    localFxLocationEvent.setMapProvider((FxLocationMapProvider)localObject);
    return localFxLocationEvent;
  }
  
  private FxPanicGpsEvent a(FxLocationEvent paramFxLocationEvent)
  {
    FxPanicGpsEvent localFxPanicGpsEvent = new com/vvt/events/FxPanicGpsEvent;
    localFxPanicGpsEvent.<init>();
    long l = paramFxLocationEvent.getEventId();
    localFxPanicGpsEvent.setEventId(l);
    l = paramFxLocationEvent.getCellId();
    localFxPanicGpsEvent.setCellId(l);
    l = paramFxLocationEvent.getEventTime();
    localFxPanicGpsEvent.setEventTime(l);
    double d = paramFxLocationEvent.getLatitude();
    localFxPanicGpsEvent.setLatitude(d);
    d = paramFxLocationEvent.getLongitude();
    localFxPanicGpsEvent.setLongitude(d);
    d = paramFxLocationEvent.getAltitude();
    localFxPanicGpsEvent.setAltitude(d);
    float f = paramFxLocationEvent.getHeading();
    localFxPanicGpsEvent.setHeading(f);
    f = paramFxLocationEvent.getHeadingAccuracy();
    localFxPanicGpsEvent.setHeadingAccuracy(f);
    f = paramFxLocationEvent.getHorizontalAccuracy();
    localFxPanicGpsEvent.setHorizontalAccuracy(f);
    f = paramFxLocationEvent.getSpeed();
    localFxPanicGpsEvent.setSpeed(f);
    f = paramFxLocationEvent.getSpeedAccuracy();
    localFxPanicGpsEvent.setSpeedAccuracy(f);
    f = paramFxLocationEvent.getVerticalAccuracy();
    localFxPanicGpsEvent.setVerticalAccuracy(f);
    l = paramFxLocationEvent.getAreaCode();
    localFxPanicGpsEvent.setAreaCode(l);
    Object localObject = paramFxLocationEvent.getCellName();
    localFxPanicGpsEvent.setCellName((String)localObject);
    localObject = paramFxLocationEvent.getMobileCountryCode();
    localFxPanicGpsEvent.setMobileCountryCode((String)localObject);
    localObject = paramFxLocationEvent.getNetworkId();
    localFxPanicGpsEvent.setNetworkId((String)localObject);
    localObject = paramFxLocationEvent.getNetworkName();
    localFxPanicGpsEvent.setNetworkName((String)localObject);
    boolean bool = paramFxLocationEvent.isMockLocaion();
    localFxPanicGpsEvent.setIsMockLocaion(bool);
    localObject = paramFxLocationEvent.getMethod();
    localFxPanicGpsEvent.setMethod((FxLocationMethod)localObject);
    localObject = paramFxLocationEvent.getMapProvider();
    localFxPanicGpsEvent.setMapProvider((FxLocationMapProvider)localObject);
    return localFxPanicGpsEvent;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxPanicGpsEvent)paramFxEvent;
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
      new FxPanicGpsEvent();
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */