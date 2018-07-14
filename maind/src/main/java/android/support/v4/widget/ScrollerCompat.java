package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Scroller;

class ScrollerCompat
{
  Scroller mScroller;
  
  ScrollerCompat(Context paramContext)
  {
    Scroller localScroller = new android/widget/Scroller;
    localScroller.<init>(paramContext);
    this.mScroller = localScroller;
  }
  
  public static ScrollerCompat from(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;
      ((ScrollerCompat.ScrollerCompatImplIcs)localObject).<init>(paramContext);
    }
    for (;;)
    {
      return (ScrollerCompat)localObject;
      localObject = new android/support/v4/widget/ScrollerCompat;
      ((ScrollerCompat)localObject).<init>(paramContext);
    }
  }
  
  public void abortAnimation()
  {
    this.mScroller.abortAnimation();
  }
  
  public boolean computeScrollOffset()
  {
    return this.mScroller.computeScrollOffset();
  }
  
  public void fling(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.mScroller.fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public float getCurrVelocity()
  {
    return 0.0F;
  }
  
  public int getCurrX()
  {
    return this.mScroller.getCurrX();
  }
  
  public int getCurrY()
  {
    return this.mScroller.getCurrY();
  }
  
  public int getDuration()
  {
    return this.mScroller.getDuration();
  }
  
  public boolean isFinished()
  {
    return this.mScroller.isFinished();
  }
  
  public void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mScroller.startScroll(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.mScroller.startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/ScrollerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */