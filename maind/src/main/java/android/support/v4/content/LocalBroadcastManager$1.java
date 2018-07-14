package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class LocalBroadcastManager$1
  extends Handler
{
  LocalBroadcastManager$1(LocalBroadcastManager paramLocalBroadcastManager, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    switch (i)
    {
    default: 
      super.handleMessage(paramMessage);
    }
    for (;;)
    {
      return;
      LocalBroadcastManager localLocalBroadcastManager = this.this$0;
      LocalBroadcastManager.access$000(localLocalBroadcastManager);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/LocalBroadcastManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */