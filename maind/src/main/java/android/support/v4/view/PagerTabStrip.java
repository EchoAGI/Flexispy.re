package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.TextView;

public class PagerTabStrip
  extends PagerTitleStrip
{
  private static final int FULL_UNDERLINE_HEIGHT = 1;
  private static final int INDICATOR_HEIGHT = 3;
  private static final int MIN_PADDING_BOTTOM = 6;
  private static final int MIN_STRIP_HEIGHT = 32;
  private static final int MIN_TEXT_SPACING = 64;
  private static final int TAB_PADDING = 16;
  private static final int TAB_SPACING = 32;
  private static final String TAG = "PagerTabStrip";
  private boolean mDrawFullUnderline;
  private boolean mDrawFullUnderlineSet;
  private int mFullUnderlineHeight;
  private boolean mIgnoreTap;
  private int mIndicatorColor;
  private int mIndicatorHeight;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private int mMinPaddingBottom;
  private int mMinStripHeight;
  private int mMinTextSpacing;
  private int mTabAlpha;
  private int mTabPadding;
  private final Paint mTabPaint;
  private final Rect mTempRect;
  private int mTouchSlop;
  
  public PagerTabStrip(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PagerTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.mTabPaint = ((Paint)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mTempRect = ((Rect)localObject1);
    this.mTabAlpha = 255;
    this.mDrawFullUnderline = false;
    this.mDrawFullUnderlineSet = false;
    int i = this.mTextColor;
    this.mIndicatorColor = i;
    localObject1 = this.mTabPaint;
    int j = this.mIndicatorColor;
    ((Paint)localObject1).setColor(j);
    float f2 = paramContext.getResources().getDisplayMetrics().density;
    i = (int)(3.0F * f2 + f1);
    this.mIndicatorHeight = i;
    i = (int)(6.0F * f2 + f1);
    this.mMinPaddingBottom = i;
    i = (int)(64.0F * f2);
    this.mMinTextSpacing = i;
    i = (int)(16.0F * f2 + f1);
    this.mTabPadding = i;
    i = (int)(1.0F * f2 + f1);
    this.mFullUnderlineHeight = i;
    float f3 = 32.0F * f2 + f1;
    i = (int)f3;
    this.mMinStripHeight = i;
    i = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.mTouchSlop = i;
    i = getPaddingLeft();
    j = getPaddingTop();
    int k = getPaddingRight();
    int m = getPaddingBottom();
    setPadding(i, j, k, m);
    i = getTextSpacing();
    setTextSpacing(i);
    setWillNotDraw(false);
    this.mPrevText.setFocusable(bool);
    localObject1 = this.mPrevText;
    Object localObject2 = new android/support/v4/view/PagerTabStrip$1;
    ((PagerTabStrip.1)localObject2).<init>(this);
    ((TextView)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    this.mNextText.setFocusable(bool);
    localObject1 = this.mNextText;
    localObject2 = new android/support/v4/view/PagerTabStrip$2;
    ((PagerTabStrip.2)localObject2).<init>(this);
    ((TextView)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    localObject1 = getBackground();
    if (localObject1 == null) {
      this.mDrawFullUnderline = bool;
    }
  }
  
  public boolean getDrawFullUnderline()
  {
    return this.mDrawFullUnderline;
  }
  
  int getMinHeight()
  {
    int i = super.getMinHeight();
    int j = this.mMinStripHeight;
    return Math.max(i, j);
  }
  
  public int getTabIndicatorColor()
  {
    return this.mIndicatorColor;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = 16777215;
    super.onDraw(paramCanvas);
    int j = getHeight();
    int k = this.mCurrText.getLeft();
    int n = this.mTabPadding;
    int i1 = k - n;
    k = this.mCurrText.getRight();
    n = this.mTabPadding;
    int i2 = k + n;
    k = this.mIndicatorHeight;
    int i3 = j - k;
    Object localObject = this.mTabPaint;
    n = this.mTabAlpha << 24;
    int i4 = this.mIndicatorColor & i;
    n |= i4;
    ((Paint)localObject).setColor(n);
    float f1 = i1;
    float f2 = i3;
    float f3 = i2;
    float f4 = j;
    Paint localPaint = this.mTabPaint;
    localObject = paramCanvas;
    paramCanvas.drawRect(f1, f2, f3, f4, localPaint);
    boolean bool = this.mDrawFullUnderline;
    if (bool)
    {
      localObject = this.mTabPaint;
      i4 = this.mIndicatorColor & i;
      n = 0xFF000000 | i4;
      ((Paint)localObject).setColor(n);
      n = 0;
      f1 = 0.0F;
      int m = this.mFullUnderlineHeight;
      f2 = j - m;
      m = getWidth();
      f3 = m;
      f4 = j;
      localPaint = this.mTabPaint;
      localObject = paramCanvas;
      paramCanvas.drawRect(0.0F, f2, f3, f4, localPaint);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    Object localObject = null;
    int k = paramMotionEvent.getAction();
    if (k != 0)
    {
      boolean bool5 = this.mIgnoreTap;
      if (bool5) {
        return bool2;
      }
    }
    float f3 = paramMotionEvent.getX();
    float f4 = paramMotionEvent.getY();
    switch (k)
    {
    }
    for (;;)
    {
      bool2 = bool1;
      f2 = f1;
      break;
      this.mInitialMotionX = f3;
      this.mInitialMotionY = f4;
      this.mIgnoreTap = false;
      continue;
      f2 = this.mInitialMotionX;
      f2 = Math.abs(f3 - f2);
      int m = this.mTouchSlop;
      float f5 = m;
      bool2 = f2 < f5;
      if (!bool2)
      {
        f2 = this.mInitialMotionY;
        f2 = Math.abs(f4 - f2);
        m = this.mTouchSlop;
        f5 = m;
        bool2 = f2 < f5;
        if (!bool2) {}
      }
      else
      {
        this.mIgnoreTap = bool1;
        continue;
        localObject = this.mCurrText;
        int i = ((TextView)localObject).getLeft();
        m = this.mTabPadding;
        f2 = i - m;
        boolean bool3 = f3 < f2;
        ViewPager localViewPager;
        if (bool3)
        {
          localObject = this.mPager;
          localViewPager = this.mPager;
          m = localViewPager.getCurrentItem() + -1;
          ((ViewPager)localObject).setCurrentItem(m);
        }
        else
        {
          localObject = this.mCurrText;
          int j = ((TextView)localObject).getRight();
          m = this.mTabPadding;
          f2 = j + m;
          boolean bool4 = f3 < f2;
          if (bool4)
          {
            localObject = this.mPager;
            localViewPager = this.mPager;
            m = localViewPager.getCurrentItem() + 1;
            ((ViewPager)localObject).setCurrentItem(m);
          }
        }
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(paramInt);
    boolean bool = this.mDrawFullUnderlineSet;
    if (!bool)
    {
      i = 0xFF000000 & paramInt;
      if (i != 0) {
        break label31;
      }
    }
    label31:
    for (int i = 1;; i = 0)
    {
      this.mDrawFullUnderline = i;
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    boolean bool = this.mDrawFullUnderlineSet;
    if (!bool) {
      if (paramDrawable != null) {
        break label26;
      }
    }
    label26:
    for (bool = true;; bool = false)
    {
      this.mDrawFullUnderline = bool;
      return;
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    boolean bool = this.mDrawFullUnderlineSet;
    if (!bool) {
      if (paramInt != 0) {
        break label26;
      }
    }
    label26:
    for (bool = true;; bool = false)
    {
      this.mDrawFullUnderline = bool;
      return;
    }
  }
  
  public void setDrawFullUnderline(boolean paramBoolean)
  {
    this.mDrawFullUnderline = paramBoolean;
    this.mDrawFullUnderlineSet = true;
    invalidate();
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.mMinPaddingBottom;
    if (paramInt4 < i) {
      paramInt4 = this.mMinPaddingBottom;
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setTabIndicatorColor(int paramInt)
  {
    this.mIndicatorColor = paramInt;
    Paint localPaint = this.mTabPaint;
    int i = this.mIndicatorColor;
    localPaint.setColor(i);
    invalidate();
  }
  
  public void setTabIndicatorColorResource(int paramInt)
  {
    int i = getContext().getResources().getColor(paramInt);
    setTabIndicatorColor(i);
  }
  
  public void setTextSpacing(int paramInt)
  {
    int i = this.mMinTextSpacing;
    if (paramInt < i) {
      paramInt = this.mMinTextSpacing;
    }
    super.setTextSpacing(paramInt);
  }
  
  void updateTextPositions(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Rect localRect = this.mTempRect;
    int i = getHeight();
    int j = this.mCurrText.getLeft();
    int k = this.mTabPadding;
    int m = j - k;
    j = this.mCurrText.getRight();
    k = this.mTabPadding;
    int n = j + k;
    j = this.mIndicatorHeight;
    int i1 = i - j;
    localRect.set(m, i1, n, i);
    super.updateTextPositions(paramInt, paramFloat, paramBoolean);
    j = (int)(Math.abs(paramFloat - 0.5F) * 2.0F * 255.0F);
    this.mTabAlpha = j;
    j = this.mCurrText.getLeft();
    k = this.mTabPadding;
    m = j - k;
    j = this.mCurrText.getRight();
    k = this.mTabPadding;
    n = j + k;
    localRect.union(m, i1, n, i);
    invalidate(localRect);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/PagerTabStrip.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */