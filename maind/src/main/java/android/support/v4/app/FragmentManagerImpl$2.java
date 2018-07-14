package android.support.v4.app;

import android.os.Handler;

class FragmentManagerImpl$2
  implements Runnable
{
  FragmentManagerImpl$2(FragmentManagerImpl paramFragmentManagerImpl) {}
  
  public void run()
  {
    FragmentManagerImpl localFragmentManagerImpl = this.this$0;
    Handler localHandler = this.this$0.mActivity.mHandler;
    localFragmentManagerImpl.popBackStackState(localHandler, null, -1, 0);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentManagerImpl$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */