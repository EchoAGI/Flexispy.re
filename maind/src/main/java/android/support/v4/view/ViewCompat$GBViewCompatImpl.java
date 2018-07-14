package android.support.v4.view;

import android.view.View;

class ViewCompat$GBViewCompatImpl
  extends ViewCompat.BaseViewCompatImpl
{
  public int getOverScrollMode(View paramView)
  {
    return ViewCompatGingerbread.getOverScrollMode(paramView);
  }
  
  public void setOverScrollMode(View paramView, int paramInt)
  {
    ViewCompatGingerbread.setOverScrollMode(paramView, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewCompat$GBViewCompatImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */