package com.vvt.capture.location.ref.command;

import com.vvt.base.FxEvent;
import java.io.Serializable;

public class RemoteLocationMetadata
  implements Serializable
{
  private static final long serialVersionUID = 5528517299278040943L;
  private int mCallingModule;
  private FxEvent mEvent;
  
  public int getCallingModule()
  {
    return this.mCallingModule;
  }
  
  public FxEvent getEvent()
  {
    return this.mEvent;
  }
  
  public void setCallingModule(int paramInt)
  {
    this.mCallingModule = paramInt;
  }
  
  public void setEvent(FxEvent paramFxEvent)
  {
    this.mEvent = paramFxEvent;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/ref/command/RemoteLocationMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */