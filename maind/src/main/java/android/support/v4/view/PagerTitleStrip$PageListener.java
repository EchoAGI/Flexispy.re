package android.support.v4.view;

import android.database.DataSetObserver;

class PagerTitleStrip$PageListener
  extends DataSetObserver
  implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener
{
  private int mScrollState;
  
  private PagerTitleStrip$PageListener(PagerTitleStrip paramPagerTitleStrip) {}
  
  public void onAdapterChanged(PagerAdapter paramPagerAdapter1, PagerAdapter paramPagerAdapter2)
  {
    this.this$0.updateAdapter(paramPagerAdapter1, paramPagerAdapter2);
  }
  
  public void onChanged()
  {
    PagerTitleStrip localPagerTitleStrip = this.this$0;
    int i = this.this$0.mPager.getCurrentItem();
    PagerAdapter localPagerAdapter = this.this$0.mPager.getAdapter();
    localPagerTitleStrip.updateText(i, localPagerAdapter);
  }
  
  public void onPageScrollStateChanged(int paramInt)
  {
    this.mScrollState = paramInt;
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    float f = 0.5F;
    boolean bool = paramFloat < f;
    if (bool) {
      paramInt1 += 1;
    }
    this.this$0.updateTextPositions(paramInt1, paramFloat, false);
  }
  
  public void onPageSelected(int paramInt)
  {
    int i = this.mScrollState;
    if (i == 0)
    {
      PagerTitleStrip localPagerTitleStrip = this.this$0;
      ViewPager localViewPager = this.this$0.mPager;
      int j = localViewPager.getCurrentItem();
      PagerAdapter localPagerAdapter = this.this$0.mPager.getAdapter();
      localPagerTitleStrip.updateText(j, localPagerAdapter);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/PagerTitleStrip$PageListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */