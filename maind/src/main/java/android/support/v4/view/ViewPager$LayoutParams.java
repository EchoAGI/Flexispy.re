package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class ViewPager$LayoutParams
  extends ViewGroup.LayoutParams
{
  public int gravity;
  public boolean isDecor;
  public boolean needsMeasure;
  public float widthFactor = 0.0F;
  
  public ViewPager$LayoutParams()
  {
    super(i, i);
  }
  
  public ViewPager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = ViewPager.access$300();
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = localTypedArray.getInteger(0, 48);
    this.gravity = i;
    localTypedArray.recycle();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager$LayoutParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */