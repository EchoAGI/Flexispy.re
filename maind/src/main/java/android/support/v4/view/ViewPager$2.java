package android.support.v4.view;

import android.view.animation.Interpolator;

final class ViewPager$2
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    float f = 1.0F;
    paramFloat -= f;
    return paramFloat * paramFloat * paramFloat * paramFloat * paramFloat + f;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */