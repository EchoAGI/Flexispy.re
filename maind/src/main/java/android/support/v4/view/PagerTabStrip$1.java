package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

class PagerTabStrip$1
  implements View.OnClickListener
{
  PagerTabStrip$1(PagerTabStrip paramPagerTabStrip) {}
  
  public void onClick(View paramView)
  {
    ViewPager localViewPager = this.this$0.mPager;
    int i = this.this$0.mPager.getCurrentItem() + -1;
    localViewPager.setCurrentItem(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/PagerTabStrip$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */