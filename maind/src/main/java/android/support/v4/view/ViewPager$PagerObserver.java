package android.support.v4.view;

import android.database.DataSetObserver;

class ViewPager$PagerObserver
  extends DataSetObserver
{
  private ViewPager$PagerObserver(ViewPager paramViewPager) {}
  
  public void onChanged()
  {
    this.this$0.dataSetChanged();
  }
  
  public void onInvalidated()
  {
    this.this$0.dataSetChanged();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager$PagerObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */