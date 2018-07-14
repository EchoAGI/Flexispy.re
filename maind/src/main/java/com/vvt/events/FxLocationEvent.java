package com.vvt.events;

import com.vvt.base.FxEventType;
import java.io.Serializable;

public class FxLocationEvent
  extends FxLocationBase
  implements Serializable
{
  private static final long serialVersionUID = -2266958230483220700L;
  
  public FxEventType getEventType()
  {
    return FxEventType.LOCATION;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxLocationEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */