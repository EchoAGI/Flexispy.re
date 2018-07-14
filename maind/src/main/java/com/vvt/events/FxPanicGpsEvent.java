package com.vvt.events;

import com.vvt.base.FxEventType;

public class FxPanicGpsEvent
  extends FxLocationBase
{
  public FxPanicGpsEvent()
  {
    FxLocationCallingModule localFxLocationCallingModule = FxLocationCallingModule.MODULE_PANIC;
    setCallingModule(localFxLocationCallingModule);
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.PANIC_GPS;
  }
  
  public String toString()
  {
    return super.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxPanicGpsEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */