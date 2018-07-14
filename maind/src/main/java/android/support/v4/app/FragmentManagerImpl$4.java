package android.support.v4.app;

import android.os.Handler;

class FragmentManagerImpl$4
  implements Runnable
{
  FragmentManagerImpl$4(FragmentManagerImpl paramFragmentManagerImpl, int paramInt1, int paramInt2) {}
  
  public void run()
  {
    FragmentManagerImpl localFragmentManagerImpl = this.this$0;
    Handler localHandler = this.this$0.mActivity.mHandler;
    int i = this.val$id;
    int j = this.val$flags;
    localFragmentManagerImpl.popBackStackState(localHandler, null, i, j);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentManagerImpl$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */