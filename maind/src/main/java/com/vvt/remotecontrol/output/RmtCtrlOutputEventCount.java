package com.vvt.remotecontrol.output;

import java.io.Serializable;
import java.util.HashMap;

public class RmtCtrlOutputEventCount
  implements Serializable
{
  private static final long serialVersionUID = 7766094631306260580L;
  private HashMap incomingEvents;
  private HashMap otherEvents;
  private HashMap outgoingEvents;
  
  public HashMap getIncomingEvents()
  {
    return this.incomingEvents;
  }
  
  public HashMap getOtherEvents()
  {
    return this.otherEvents;
  }
  
  public HashMap getOutgoingEvents()
  {
    return this.outgoingEvents;
  }
  
  public void setIncomingEvents(HashMap paramHashMap)
  {
    this.incomingEvents = paramHashMap;
  }
  
  public void setOtherEvents(HashMap paramHashMap)
  {
    this.otherEvents = paramHashMap;
  }
  
  public void setOutgoingEvents(HashMap paramHashMap)
  {
    this.outgoingEvents = paramHashMap;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputEventCount.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */