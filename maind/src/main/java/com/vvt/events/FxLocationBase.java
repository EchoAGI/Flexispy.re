package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.io.Serializable;

public abstract class FxLocationBase
  extends FxEvent
  implements Serializable
{
  private static final long serialVersionUID = 7650705878477064129L;
  private long areaCode;
  private FxLocationCallingModule callingModule;
  private long cellId;
  private String cellName = null;
  private double mAltitude;
  private float mHeading;
  private float mHeadingAccuracy;
  private float mHorizontalAccuracy;
  private double mLat;
  private double mLon;
  private FxLocationMethod mMethod;
  private float mSpeed;
  private float mSpeedAccuracy;
  private float mVerticalAccuracy;
  private FxLocationMapProvider mapProvider;
  private String mobileCountryCode;
  private boolean mockLocaion;
  private String networkId;
  private String networkName;
  
  public FxLocationBase()
  {
    this.cellId = l;
    this.areaCode = l;
  }
  
  public double getAltitude()
  {
    return this.mAltitude;
  }
  
  public long getAreaCode()
  {
    return this.areaCode;
  }
  
  public FxLocationCallingModule getCallingModule()
  {
    return this.callingModule;
  }
  
  public long getCellId()
  {
    return this.cellId;
  }
  
  public String getCellName()
  {
    return this.cellName;
  }
  
  public abstract FxEventType getEventType();
  
  public float getHeading()
  {
    return this.mHeading;
  }
  
  public float getHeadingAccuracy()
  {
    return this.mHeadingAccuracy;
  }
  
  public float getHorizontalAccuracy()
  {
    return this.mHorizontalAccuracy;
  }
  
  public double getLatitude()
  {
    return this.mLat;
  }
  
  public double getLongitude()
  {
    return this.mLon;
  }
  
  public FxLocationMapProvider getMapProvider()
  {
    return this.mapProvider;
  }
  
  public FxLocationMethod getMethod()
  {
    return this.mMethod;
  }
  
  public String getMobileCountryCode()
  {
    return this.mobileCountryCode;
  }
  
  public String getNetworkId()
  {
    return this.networkId;
  }
  
  public String getNetworkName()
  {
    return this.networkName;
  }
  
  public float getSpeed()
  {
    return this.mSpeed;
  }
  
  public float getSpeedAccuracy()
  {
    return this.mSpeedAccuracy;
  }
  
  public float getVerticalAccuracy()
  {
    return this.mVerticalAccuracy;
  }
  
  public boolean isMockLocaion()
  {
    return this.mockLocaion;
  }
  
  public void setAltitude(double paramDouble)
  {
    this.mAltitude = paramDouble;
  }
  
  public void setAreaCode(long paramLong)
  {
    this.areaCode = paramLong;
  }
  
  public void setCallingModule(FxLocationCallingModule paramFxLocationCallingModule)
  {
    this.callingModule = paramFxLocationCallingModule;
  }
  
  public void setCellId(long paramLong)
  {
    this.cellId = paramLong;
  }
  
  public void setCellName(String paramString)
  {
    this.cellName = paramString;
  }
  
  public void setHeading(float paramFloat)
  {
    this.mHeading = paramFloat;
  }
  
  public void setHeadingAccuracy(float paramFloat)
  {
    this.mHeadingAccuracy = paramFloat;
  }
  
  public void setHorizontalAccuracy(float paramFloat)
  {
    this.mHorizontalAccuracy = paramFloat;
  }
  
  public void setIsMockLocaion(boolean paramBoolean)
  {
    this.mockLocaion = paramBoolean;
  }
  
  public void setLatitude(double paramDouble)
  {
    this.mLat = paramDouble;
  }
  
  public void setLongitude(double paramDouble)
  {
    this.mLon = paramDouble;
  }
  
  public void setMapProvider(FxLocationMapProvider paramFxLocationMapProvider)
  {
    this.mapProvider = paramFxLocationMapProvider;
  }
  
  public void setMethod(FxLocationMethod paramFxLocationMethod)
  {
    this.mMethod = paramFxLocationMethod;
  }
  
  public void setMobileCountryCode(String paramString)
  {
    this.mobileCountryCode = paramString;
  }
  
  public void setNetworkId(String paramString)
  {
    this.networkId = paramString;
  }
  
  public void setNetworkName(String paramString)
  {
    this.networkName = paramString;
  }
  
  public void setSpeed(float paramFloat)
  {
    this.mSpeed = paramFloat;
  }
  
  public void setSpeedAccuracy(float paramFloat)
  {
    this.mSpeedAccuracy = paramFloat;
  }
  
  public void setVerticalAccuracy(float paramFloat)
  {
    this.mVerticalAccuracy = paramFloat;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append(" FxLocation {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" eventId =");
    long l = super.getEventId();
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(" callingModule =");
    Object localObject = getCallingModule();
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", eventType =");
    localObject = FxEventType.forValue(getEventType().getNumber());
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", lat =");
    double d = getLatitude();
    localStringBuilder2.append(d);
    localStringBuilder2 = localStringBuilder1.append(", long =");
    d = getLongitude();
    localStringBuilder2.append(d);
    localStringBuilder2 = localStringBuilder1.append(", method =");
    localObject = getMethod();
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", horizontalAccuracy =");
    float f = getHorizontalAccuracy();
    localStringBuilder2.append(f);
    localStringBuilder2 = localStringBuilder1.append(", networkName =");
    localObject = getNetworkName();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", cellId =");
    l = getCellId();
    localStringBuilder2.append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxLocationBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */