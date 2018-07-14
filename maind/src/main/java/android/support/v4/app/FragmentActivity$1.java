package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

class FragmentActivity$1
  extends Handler
{
  FragmentActivity$1(FragmentActivity paramFragmentActivity) {}
  
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
      Object localObject = this.this$0;
      boolean bool = ((FragmentActivity)localObject).mStopped;
      if (bool)
      {
        localObject = this.this$0;
        ((FragmentActivity)localObject).doReallyStop(false);
        continue;
        this.this$0.onResumeFragments();
        localObject = this.this$0.mFragments;
        ((FragmentManagerImpl)localObject).execPendingActions();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */