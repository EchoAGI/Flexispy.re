package com.vvt.remotecontrol;

import java.io.Serializable;

public class ControlCommand
  implements Serializable
{
  private static final long serialVersionUID = -5746797506814872054L;
  private Object data;
  private RemoteFunction function;
  
  public ControlCommand() {}
  
  public ControlCommand(RemoteFunction paramRemoteFunction, Object paramObject)
  {
    this.function = paramRemoteFunction;
    this.data = paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof ControlCommand;
    Object localObject1;
    Object localObject2;
    boolean bool3;
    if (bool2)
    {
      paramObject = (ControlCommand)paramObject;
      localObject1 = this.data;
      if (localObject1 == null)
      {
        localObject1 = ((ControlCommand)paramObject).data;
        if (localObject1 == null)
        {
          bool2 = bool1;
          localObject2 = this.data;
          if (localObject2 == null) {
            break label118;
          }
          localObject2 = this.data;
          Object localObject3 = ((ControlCommand)paramObject).data;
          bool3 = localObject2.equals(localObject3);
          if (!bool3) {
            break label118;
          }
          bool3 = bool1;
          label80:
          localObject3 = this.function;
          RemoteFunction localRemoteFunction = ((ControlCommand)paramObject).function;
          if ((localObject3 != localRemoteFunction) || ((!bool2) && (!bool3))) {
            break label127;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject1 = null;
      break;
      label118:
      bool3 = false;
      localObject2 = null;
      break label80;
      label127:
      bool1 = false;
      continue;
      bool1 = false;
    }
  }
  
  public Object getData()
  {
    return this.data;
  }
  
  public RemoteFunction getFunction()
  {
    return this.function;
  }
  
  public void setData(Object paramObject)
  {
    this.data = paramObject;
  }
  
  public void setFunction(RemoteFunction paramRemoteFunction)
  {
    this.function = paramRemoteFunction;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.function;
    arrayOfObject[0] = localObject;
    localObject = this.data;
    arrayOfObject[1] = localObject;
    return String.format("func: %s, data: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/ControlCommand.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */