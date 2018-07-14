package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

public class PagerTitleStrip
  extends ViewGroup
  implements ViewPager.Decor
{
  private static final int[] ATTRS;
  private static final PagerTitleStrip.PagerTitleStripImpl IMPL;
  private static final float SIDE_ALPHA = 0.6F;
  private static final String TAG = "PagerTitleStrip";
  private static final int[] TEXT_ATTRS;
  private static final int TEXT_SPACING = 16;
  TextView mCurrText;
  private int mGravity;
  private int mLastKnownCurrentPage = -1;
  private float mLastKnownPositionOffset;
  TextView mNextText;
  private int mNonPrimaryAlpha;
  private final PagerTitleStrip.PageListener mPageListener;
  ViewPager mPager;
  TextView mPrevText;
  private int mScaledTextSpacing;
  int mTextColor;
  private boolean mUpdatingPositions;
  private boolean mUpdatingText;
  
  static
  {
    Object localObject = new int[4];
    localObject[0] = 16842804;
    localObject[1] = 16842901;
    localObject[2] = 16842904;
    localObject[3] = 16842927;
    ATTRS = (int[])localObject;
    localObject = new int[1];
    int i = 16843660;
    localObject[0] = i;
    TEXT_ATTRS = (int[])localObject;
    int j = Build.VERSION.SDK_INT;
    int k = 14;
    if (j >= k)
    {
      localObject = new android/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;
      ((PagerTitleStrip.PagerTitleStripImplIcs)localObject).<init>();
    }
    for (IMPL = (PagerTitleStrip.PagerTitleStripImpl)localObject;; IMPL = (PagerTitleStrip.PagerTitleStripImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;
      ((PagerTitleStrip.PagerTitleStripImplBase)localObject).<init>();
    }
  }
  
  public PagerTitleStrip(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PagerTitleStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int j = -1082130432;
    float f1 = -1.0F;
    this.mLastKnownPositionOffset = f1;
    Object localObject = new android/support/v4/view/PagerTitleStrip$PageListener;
    int m = 0;
    TextUtils.TruncateAt localTruncateAt = null;
    ((PagerTitleStrip.PageListener)localObject).<init>(this, null);
    this.mPageListener = ((PagerTitleStrip.PageListener)localObject);
    localObject = new android/widget/TextView;
    ((TextView)localObject).<init>(paramContext);
    this.mPrevText = ((TextView)localObject);
    addView((View)localObject);
    localObject = new android/widget/TextView;
    ((TextView)localObject).<init>(paramContext);
    this.mCurrText = ((TextView)localObject);
    addView((View)localObject);
    localObject = new android/widget/TextView;
    ((TextView)localObject).<init>(paramContext);
    this.mNextText = ((TextView)localObject);
    addView((View)localObject);
    localObject = ATTRS;
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int n = localTypedArray1.getResourceId(0, 0);
    if (n != 0)
    {
      this.mPrevText.setTextAppearance(paramContext, n);
      this.mCurrText.setTextAppearance(paramContext, n);
      localObject = this.mNextText;
      ((TextView)localObject).setTextAppearance(paramContext, n);
    }
    j = 1;
    f1 = Float.MIN_VALUE;
    int i1 = localTypedArray1.getDimensionPixelSize(j, 0);
    if (i1 != 0)
    {
      f1 = i1;
      setTextSize(0, f1);
    }
    boolean bool1 = localTypedArray1.hasValue(i);
    if (bool1)
    {
      int i2 = localTypedArray1.getColor(i, 0);
      this.mPrevText.setTextColor(i2);
      this.mCurrText.setTextColor(i2);
      localObject = this.mNextText;
      ((TextView)localObject).setTextColor(i2);
    }
    m = 80;
    int k = localTypedArray1.getInteger(3, m);
    this.mGravity = k;
    localTypedArray1.recycle();
    k = this.mCurrText.getTextColors().getDefaultColor();
    this.mTextColor = k;
    k = 1058642330;
    f1 = 0.6F;
    setNonPrimaryAlpha(f1);
    localObject = this.mPrevText;
    localTruncateAt = TextUtils.TruncateAt.END;
    ((TextView)localObject).setEllipsize(localTruncateAt);
    localObject = this.mCurrText;
    localTruncateAt = TextUtils.TruncateAt.END;
    ((TextView)localObject).setEllipsize(localTruncateAt);
    localObject = this.mNextText;
    localTruncateAt = TextUtils.TruncateAt.END;
    ((TextView)localObject).setEllipsize(localTruncateAt);
    boolean bool2 = false;
    if (n != 0)
    {
      localObject = TEXT_ATTRS;
      TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(n, (int[])localObject);
      bool2 = localTypedArray2.getBoolean(0, false);
      localTypedArray2.recycle();
    }
    if (bool2)
    {
      setSingleLineAllCaps(this.mPrevText);
      setSingleLineAllCaps(this.mCurrText);
      localObject = this.mNextText;
      setSingleLineAllCaps((TextView)localObject);
    }
    for (;;)
    {
      float f2 = paramContext.getResources().getDisplayMetrics().density;
      k = (int)(16.0F * f2);
      this.mScaledTextSpacing = k;
      return;
      this.mPrevText.setSingleLine();
      this.mCurrText.setSingleLine();
      localObject = this.mNextText;
      ((TextView)localObject).setSingleLine();
    }
  }
  
  private static void setSingleLineAllCaps(TextView paramTextView)
  {
    IMPL.setSingleLineAllCaps(paramTextView);
  }
  
  int getMinHeight()
  {
    int i = 0;
    Drawable localDrawable = getBackground();
    if (localDrawable != null) {
      i = localDrawable.getIntrinsicHeight();
    }
    return i;
  }
  
  public int getTextSpacing()
  {
    return this.mScaledTextSpacing;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    boolean bool = localViewParent instanceof ViewPager;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("PagerTitleStrip must be a direct child of a ViewPager.");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = localViewParent;
    localObject2 = (ViewPager)localViewParent;
    PagerAdapter localPagerAdapter = ((ViewPager)localObject2).getAdapter();
    Object localObject1 = this.mPageListener;
    ((ViewPager)localObject2).setInternalPageChangeListener((ViewPager.OnPageChangeListener)localObject1);
    localObject1 = this.mPageListener;
    ((ViewPager)localObject2).setOnAdapterChangeListener((ViewPager.OnAdapterChangeListener)localObject1);
    this.mPager = ((ViewPager)localObject2);
    updateAdapter(null, localPagerAdapter);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.mPager;
    if (localObject != null)
    {
      localObject = this.mPager.getAdapter();
      updateAdapter((PagerAdapter)localObject, null);
      this.mPager.setInternalPageChangeListener(null);
      localObject = this.mPager;
      ((ViewPager)localObject).setOnAdapterChangeListener(null);
      this.mPager = null;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = 0.0F;
    ViewPager localViewPager = this.mPager;
    if (localViewPager != null)
    {
      float f2 = this.mLastKnownPositionOffset;
      boolean bool1 = f2 < 0.0F;
      if (!bool1) {
        f1 = this.mLastKnownPositionOffset;
      }
      localViewPager = this.mPager;
      int i = localViewPager.getCurrentItem();
      boolean bool2 = true;
      updateTextPositions(i, f1, bool2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n = 1073741824;
    if (i != n)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Must measure with an exact width");
      throw ((Throwable)localObject);
    }
    int i1 = m;
    int i2 = getMinHeight();
    n = getPaddingTop();
    int i3 = getPaddingBottom();
    int i4 = n + i3;
    i1 = m - i4;
    n = (int)(k * 0.8F);
    i3 = -1 << -1;
    int i5 = View.MeasureSpec.makeMeasureSpec(n, i3);
    int i6 = View.MeasureSpec.makeMeasureSpec(i1, -1 << -1);
    this.mPrevText.measure(i5, i6);
    this.mCurrText.measure(i5, i6);
    Object localObject = this.mNextText;
    ((TextView)localObject).measure(i5, i6);
    n = 1073741824;
    if (j == n) {
      setMeasuredDimension(k, m);
    }
    for (;;)
    {
      return;
      localObject = this.mCurrText;
      int i7 = ((TextView)localObject).getMeasuredHeight();
      n = i7 + i4;
      n = Math.max(i2, n);
      setMeasuredDimension(k, n);
    }
  }
  
  public void requestLayout()
  {
    boolean bool = this.mUpdatingText;
    if (!bool) {
      super.requestLayout();
    }
  }
  
  public void setGravity(int paramInt)
  {
    this.mGravity = paramInt;
    requestLayout();
  }
  
  public void setNonPrimaryAlpha(float paramFloat)
  {
    int i = (int)(255.0F * paramFloat) & 0xFF;
    this.mNonPrimaryAlpha = i;
    i = this.mNonPrimaryAlpha << 24;
    int j = this.mTextColor & 0xFFFFFF;
    int k = i | j;
    this.mPrevText.setTextColor(k);
    this.mNextText.setTextColor(k);
  }
  
  public void setTextColor(int paramInt)
  {
    this.mTextColor = paramInt;
    this.mCurrText.setTextColor(paramInt);
    int i = this.mNonPrimaryAlpha << 24;
    int j = this.mTextColor & 0xFFFFFF;
    int k = i | j;
    this.mPrevText.setTextColor(k);
    this.mNextText.setTextColor(k);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    this.mPrevText.setTextSize(paramInt, paramFloat);
    this.mCurrText.setTextSize(paramInt, paramFloat);
    this.mNextText.setTextSize(paramInt, paramFloat);
  }
  
  public void setTextSpacing(int paramInt)
  {
    this.mScaledTextSpacing = paramInt;
    requestLayout();
  }
  
  void updateAdapter(PagerAdapter paramPagerAdapter1, PagerAdapter paramPagerAdapter2)
  {
    if (paramPagerAdapter1 != null)
    {
      localObject = this.mPageListener;
      paramPagerAdapter1.unregisterDataSetObserver((DataSetObserver)localObject);
    }
    if (paramPagerAdapter2 != null)
    {
      localObject = this.mPageListener;
      paramPagerAdapter2.registerDataSetObserver((DataSetObserver)localObject);
    }
    Object localObject = this.mPager;
    if (localObject != null)
    {
      this.mLastKnownCurrentPage = -1;
      float f = -1.0F;
      this.mLastKnownPositionOffset = f;
      localObject = this.mPager;
      int i = ((ViewPager)localObject).getCurrentItem();
      updateText(i, paramPagerAdapter2);
      requestLayout();
    }
  }
  
  void updateText(int paramInt, PagerAdapter paramPagerAdapter)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = -1 << -1;
    int k;
    CharSequence localCharSequence;
    TextView localTextView;
    if (paramPagerAdapter != null)
    {
      k = paramPagerAdapter.getCount();
      this.mUpdatingText = i;
      localCharSequence = null;
      if ((paramInt >= i) && (paramPagerAdapter != null))
      {
        i = paramInt + -1;
        localCharSequence = paramPagerAdapter.getPageTitle(i);
      }
      localObject = this.mPrevText;
      ((TextView)localObject).setText(localCharSequence);
      localTextView = this.mCurrText;
      if ((paramPagerAdapter == null) || (paramInt >= k)) {
        break label303;
      }
    }
    for (Object localObject = paramPagerAdapter.getPageTitle(paramInt);; localObject = null)
    {
      localTextView.setText((CharSequence)localObject);
      localCharSequence = null;
      i = paramInt + 1;
      if ((i < k) && (paramPagerAdapter != null))
      {
        i = paramInt + 1;
        localCharSequence = paramPagerAdapter.getPageTitle(i);
      }
      this.mNextText.setText(localCharSequence);
      i = getWidth();
      int m = getPaddingLeft();
      i -= m;
      m = getPaddingRight();
      int n = i - m;
      i = getHeight();
      m = getPaddingTop();
      i -= m;
      m = getPaddingBottom();
      int i1 = i - m;
      f1 = n;
      m = 1061997773;
      float f2 = 0.8F;
      f1 *= f2;
      int i2 = View.MeasureSpec.makeMeasureSpec((int)f1, j);
      int i3 = View.MeasureSpec.makeMeasureSpec(i1, j);
      this.mPrevText.measure(i2, i3);
      this.mCurrText.measure(i2, i3);
      localObject = this.mNextText;
      ((TextView)localObject).measure(i2, i3);
      this.mLastKnownCurrentPage = paramInt;
      boolean bool = this.mUpdatingPositions;
      if (!bool)
      {
        f1 = this.mLastKnownPositionOffset;
        updateTextPositions(paramInt, f1, false);
      }
      this.mUpdatingText = false;
      return;
      k = 0;
      break;
      label303:
      bool = false;
      f1 = 0.0F;
    }
  }
  
  void updateTextPositions(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Object localObject1 = this;
    int i = this.mLastKnownCurrentPage;
    int m = paramInt;
    Object localObject2;
    float f1;
    int n;
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    float f3;
    int j;
    int i13;
    int i15;
    int i16;
    int i21;
    int i22;
    int i23;
    int i27;
    int i29;
    int i30;
    int i31;
    if (paramInt != i)
    {
      localObject1 = this.mPager;
      localObject2 = localObject1;
      localObject2 = ((ViewPager)localObject1).getAdapter();
      localObject1 = this;
      updateText(paramInt, (PagerAdapter)localObject2);
      m = 1;
      f1 = Float.MIN_VALUE;
      this.mUpdatingPositions = m;
      localObject1 = this;
      localObject1 = this.mPrevText;
      localObject2 = localObject1;
      n = ((TextView)localObject1).getMeasuredWidth();
      localObject1 = this;
      localObject1 = this.mCurrText;
      localObject2 = localObject1;
      int i1 = ((TextView)localObject1).getMeasuredWidth();
      localObject1 = this;
      localObject1 = this.mNextText;
      localObject2 = localObject1;
      i2 = ((TextView)localObject1).getMeasuredWidth();
      int i3 = i1 / 2;
      i4 = getWidth();
      i5 = getHeight();
      i6 = getPaddingLeft();
      i7 = getPaddingRight();
      i8 = getPaddingTop();
      i9 = getPaddingBottom();
      int i10 = i6 + i3;
      int i11 = i7 + i3;
      int i12 = i4 - i10 - i11;
      float f2 = paramFloat + 0.5F;
      f3 = 1.0F;
      boolean bool1 = f2 < f3;
      if (bool1)
      {
        j = 1065353216;
        f3 = 1.0F;
        f2 -= f3;
      }
      j = i4 - i11;
      f1 = i12;
      float f4 = f1;
      f4 = f1 * f2;
      f1 = f4;
      m = (int)f4;
      i13 = m;
      int i14 = j - m;
      j = i1 / 2;
      i15 = i14 - j;
      i16 = i15 + i1;
      localObject1 = this;
      localObject1 = this.mPrevText;
      localObject2 = localObject1;
      int i17 = ((TextView)localObject1).getBaseline();
      localObject1 = this;
      localObject1 = this.mCurrText;
      localObject2 = localObject1;
      int i18 = ((TextView)localObject1).getBaseline();
      localObject1 = this;
      localObject1 = this.mNextText;
      localObject2 = localObject1;
      int i19 = ((TextView)localObject1).getBaseline();
      m = i17;
      j = Math.max(i17, i18);
      m = j;
      int i20 = Math.max(j, i19);
      i21 = i20 - i17;
      i22 = i20 - i18;
      i23 = i20 - i19;
      localObject1 = this;
      localObject1 = this.mPrevText;
      localObject2 = localObject1;
      j = ((TextView)localObject1).getMeasuredHeight();
      int i24 = i21 + j;
      localObject1 = this;
      localObject1 = this.mCurrText;
      localObject2 = localObject1;
      j = ((TextView)localObject1).getMeasuredHeight();
      int i25 = i22 + j;
      localObject1 = this;
      localObject1 = this.mNextText;
      localObject2 = localObject1;
      j = ((TextView)localObject1).getMeasuredHeight();
      int i26 = i23 + j;
      j = Math.max(i24, i25);
      m = j;
      i27 = Math.max(j, i26);
      localObject1 = this;
      m = this.mGravity;
      j = m;
      int i28 = m & 0x70;
      switch (i28)
      {
      default: 
        i29 = i8 + i21;
        i30 = i8 + i22;
        i31 = i8 + i23;
      }
    }
    for (;;)
    {
      localObject1 = this;
      localObject2 = this.mCurrText;
      localObject1 = this;
      i13 = this.mCurrText.getMeasuredHeight() + i30;
      localObject1 = localObject2;
      ((TextView)localObject2).layout(i15, i30, i16, i13);
      localObject1 = this;
      m = this.mScaledTextSpacing;
      j = m;
      j = i15 - m - n;
      m = i6;
      int i32 = Math.min(i6, j);
      localObject2 = this.mPrevText;
      i13 = i32 + n;
      localObject1 = this;
      int i33 = this.mPrevText.getMeasuredHeight() + i29;
      localObject1 = localObject2;
      ((TextView)localObject2).layout(i32, i29, i13, i33);
      j = i4 - i7 - i2;
      localObject1 = this;
      m = this.mScaledTextSpacing;
      i13 = m;
      i13 = m + i16;
      int i34 = Math.max(j, i13);
      localObject2 = this.mNextText;
      i13 = i34 + i2;
      localObject1 = this;
      i33 = this.mNextText.getMeasuredHeight() + i31;
      localObject1 = localObject2;
      ((TextView)localObject2).layout(i34, i31, i13, i33);
      f1 = paramFloat;
      this.mLastKnownPositionOffset = paramFloat;
      j = 0;
      f3 = 0.0F;
      localObject2 = null;
      m = 0;
      localObject1 = null;
      f1 = 0.0F;
      this.mUpdatingPositions = false;
      for (;;)
      {
        return;
        if (paramBoolean) {
          break;
        }
        f1 = this.mLastKnownPositionOffset;
        f3 = f1;
        boolean bool2 = paramFloat < f1;
        if (bool2) {
          break;
        }
      }
      int i35 = i5 - i8 - i9;
      int k = i35 - i27;
      int i36 = k / 2;
      i29 = i36 + i21;
      i30 = i36 + i22;
      i31 = i36 + i23;
      continue;
      k = i5 - i9;
      int i37 = k - i27;
      i29 = i37 + i21;
      i30 = i37 + i22;
      i31 = i37 + i23;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/PagerTitleStrip.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */