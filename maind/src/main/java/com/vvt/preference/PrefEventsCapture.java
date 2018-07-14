package com.vvt.preference;

import com.vvt.base.FeatureId;
import com.vvt.base.FxDeliveryMethod;
import java.io.Serializable;
import java.util.HashMap;

public class PrefEventsCapture
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 6992705594412183189L;
  private FxDeliveryMethod deliveryMethod;
  private int deliveryTimer;
  private long gpsTrackingIntervalMs;
  private boolean isCaptureEnabled;
  private boolean isDeliverEnabled;
  private HashMap status;
  private int triggerNumber;
  
  public PrefEventsCapture()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.status = ((HashMap)localObject);
    localObject = FxDeliveryMethod.ANY_AVAILABLE;
    this.deliveryMethod = ((FxDeliveryMethod)localObject);
  }
  
  public int getDeliverTimer()
  {
    return this.deliveryTimer;
  }
  
  public FxDeliveryMethod getDeliveryMethod()
  {
    return this.deliveryMethod;
  }
  
  public long getGpsTrackingIntervalMs()
  {
    return this.gpsTrackingIntervalMs;
  }
  
  public int getTriggerNumber()
  {
    return this.triggerNumber;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.EVENTS_CTRL;
  }
  
  public boolean isCapture(FeatureId paramFeatureId)
  {
    Object localObject = this.status;
    boolean bool = ((HashMap)localObject).containsKey(paramFeatureId);
    if (bool)
    {
      localObject = (Boolean)this.status.get(paramFeatureId);
      bool = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean isCaptureEnabled()
  {
    return this.isCaptureEnabled;
  }
  
  public boolean isDeliverEnabled()
  {
    return this.isDeliverEnabled;
  }
  
  public void setCapture(FeatureId paramFeatureId, boolean paramBoolean)
  {
    HashMap localHashMap = this.status;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localHashMap.put(paramFeatureId, localBoolean);
  }
  
  public void setCaptureEnabled(boolean paramBoolean)
  {
    this.isCaptureEnabled = paramBoolean;
  }
  
  public void setDeliverEnabled(boolean paramBoolean)
  {
    this.isDeliverEnabled = paramBoolean;
  }
  
  public void setDeliverTimer(int paramInt)
  {
    this.deliveryTimer = paramInt;
  }
  
  public void setDeliveryMethod(FxDeliveryMethod paramFxDeliveryMethod)
  {
    this.deliveryMethod = paramFxDeliveryMethod;
  }
  
  public void setGpsTrackingIntervalMs(long paramLong)
  {
    this.gpsTrackingIntervalMs = paramLong;
  }
  
  public void setTriggerNumber(int paramInt)
  {
    this.triggerNumber = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefEventsCapture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */