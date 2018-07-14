package android.support.v4.app;

import android.os.Handler;

class FragmentManagerImpl$3
  implements Runnable
{
  FragmentManagerImpl$3(FragmentManagerImpl paramFragmentManagerImpl, String paramString, int paramInt) {}
  
  public void run()
  {
    FragmentManagerImpl localFragmentManagerImpl = this.this$0;
    Handler localHandler = this.this$0.mActivity.mHandler;
    String str = this.val$name;
    int i = this.val$flags;
    localFragmentManagerImpl.popBackStackState(localHandler, str, -1, i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentManagerImpl$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */