package android.support.v4.widget;

import android.content.Context;

class ScrollerCompat$ScrollerCompatImplIcs
  extends ScrollerCompat
{
  public ScrollerCompat$ScrollerCompatImplIcs(Context paramContext)
  {
    super(paramContext);
  }
  
  public float getCurrVelocity()
  {
    return ScrollerCompatIcs.getCurrVelocity(this.mScroller);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */