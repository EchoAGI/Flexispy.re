package com.vvt.events;

import com.vvt.base.FxEventType;

public class FxAlertGpsEvent
  extends FxLocationBase
{
  private static final long serialVersionUID = -1646361632737364064L;
  
  public FxAlertGpsEvent()
  {
    FxLocationCallingModule localFxLocationCallingModule = FxLocationCallingModule.MODULE_ALERT;
    setCallingModule(localFxLocationCallingModule);
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.ALERT_GPS;
  }
  
  public String toString()
  {
    return super.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxAlertGpsEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */