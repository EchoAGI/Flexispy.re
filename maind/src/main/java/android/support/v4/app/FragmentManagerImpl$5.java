package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class FragmentManagerImpl$5
  implements Animation.AnimationListener
{
  FragmentManagerImpl$5(FragmentManagerImpl paramFragmentManagerImpl, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Object localObject = this.val$fragment.mAnimatingAway;
    if (localObject != null)
    {
      this.val$fragment.mAnimatingAway = null;
      localObject = this.this$0;
      Fragment localFragment1 = this.val$fragment;
      Fragment localFragment2 = this.val$fragment;
      int i = localFragment2.mStateAfterAnimating;
      ((FragmentManagerImpl)localObject).moveToState(localFragment1, i, 0, 0, false);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentManagerImpl$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */