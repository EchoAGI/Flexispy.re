package android.support.v4.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

class NoSaveStateFrameLayout
  extends FrameLayout
{
  public NoSaveStateFrameLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  static ViewGroup wrap(View paramView)
  {
    int i = -1;
    NoSaveStateFrameLayout localNoSaveStateFrameLayout = new android/support/v4/app/NoSaveStateFrameLayout;
    Context localContext = paramView.getContext();
    localNoSaveStateFrameLayout.<init>(localContext);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null) {
      localNoSaveStateFrameLayout.setLayoutParams(localLayoutParams);
    }
    FrameLayout.LayoutParams localLayoutParams1 = new android/widget/FrameLayout$LayoutParams;
    localLayoutParams1.<init>(i, i);
    paramView.setLayoutParams(localLayoutParams1);
    localNoSaveStateFrameLayout.addView(paramView);
    return localNoSaveStateFrameLayout;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NoSaveStateFrameLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */