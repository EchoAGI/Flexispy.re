package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
  extends ViewGroup
{
  private static final int CLOSE_ENOUGH = 2;
  private static final Comparator COMPARATOR;
  private static final boolean DEBUG = false;
  private static final int DEFAULT_GUTTER_SIZE = 16;
  private static final int DEFAULT_OFFSCREEN_PAGES = 1;
  private static final int INVALID_POINTER = 255;
  private static final int[] LAYOUT_ATTRS;
  private static final int MAX_SETTLE_DURATION = 600;
  private static final int MIN_DISTANCE_FOR_FLING = 25;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  private static final String TAG = "ViewPager";
  private static final boolean USE_CACHE;
  private static final Interpolator sInterpolator;
  private int mActivePointerId;
  private PagerAdapter mAdapter;
  private ViewPager.OnAdapterChangeListener mAdapterChangeListener;
  private int mBottomPageBounds;
  private boolean mCalledSuper;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCloseEnough;
  private int mCurItem;
  private int mDecorChildCount;
  private int mDefaultGutterSize;
  private long mFakeDragBeginTime;
  private boolean mFakeDragging;
  private boolean mFirstLayout;
  private float mFirstOffset;
  private int mFlingDistance;
  private int mGutterSize;
  private boolean mIgnoreGutter;
  private boolean mInLayout;
  private float mInitialMotionX;
  private ViewPager.OnPageChangeListener mInternalPageChangeListener;
  private boolean mIsBeingDragged;
  private boolean mIsUnableToDrag;
  private final ArrayList mItems;
  private float mLastMotionX;
  private float mLastMotionY;
  private float mLastOffset;
  private EdgeEffectCompat mLeftEdge;
  private Drawable mMarginDrawable;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private boolean mNeedCalculatePageOffsets;
  private ViewPager.PagerObserver mObserver;
  private int mOffscreenPageLimit;
  private ViewPager.OnPageChangeListener mOnPageChangeListener;
  private int mPageMargin;
  private boolean mPopulatePending;
  private Parcelable mRestoredAdapterState;
  private ClassLoader mRestoredClassLoader;
  private int mRestoredCurItem;
  private EdgeEffectCompat mRightEdge;
  private int mScrollState;
  private Scroller mScroller;
  private boolean mScrollingCacheEnabled;
  private final ViewPager.ItemInfo mTempItem;
  private final Rect mTempRect;
  private int mTopPageBounds;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  
  static
  {
    Object localObject = new int[1];
    localObject[0] = 16842931;
    LAYOUT_ATTRS = (int[])localObject;
    localObject = new android/support/v4/view/ViewPager$1;
    ((ViewPager.1)localObject).<init>();
    COMPARATOR = (Comparator)localObject;
    localObject = new android/support/v4/view/ViewPager$2;
    ((ViewPager.2)localObject).<init>();
    sInterpolator = (Interpolator)localObject;
  }
  
  public ViewPager(Context paramContext)
  {
    super(paramContext);
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mItems = ((ArrayList)localObject);
    localObject = new android/support/v4/view/ViewPager$ItemInfo;
    ((ViewPager.ItemInfo)localObject).<init>();
    this.mTempItem = ((ViewPager.ItemInfo)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTempRect = ((Rect)localObject);
    this.mRestoredCurItem = j;
    this.mRestoredAdapterState = null;
    this.mRestoredClassLoader = null;
    this.mFirstOffset = -3.4028235E38F;
    this.mLastOffset = Float.MAX_VALUE;
    this.mOffscreenPageLimit = i;
    this.mActivePointerId = j;
    this.mFirstLayout = i;
    this.mNeedCalculatePageOffsets = false;
    this.mScrollState = 0;
    initViewPager();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mItems = ((ArrayList)localObject);
    localObject = new android/support/v4/view/ViewPager$ItemInfo;
    ((ViewPager.ItemInfo)localObject).<init>();
    this.mTempItem = ((ViewPager.ItemInfo)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTempRect = ((Rect)localObject);
    this.mRestoredCurItem = j;
    this.mRestoredAdapterState = null;
    this.mRestoredClassLoader = null;
    this.mFirstOffset = -3.4028235E38F;
    this.mLastOffset = Float.MAX_VALUE;
    this.mOffscreenPageLimit = i;
    this.mActivePointerId = j;
    this.mFirstLayout = i;
    this.mNeedCalculatePageOffsets = false;
    this.mScrollState = 0;
    initViewPager();
  }
  
  private void calculatePageOffsets(ViewPager.ItemInfo paramItemInfo1, int paramInt, ViewPager.ItemInfo paramItemInfo2)
  {
    Object localObject = this.mAdapter;
    int i = ((PagerAdapter)localObject).getCount();
    int j = getWidth();
    float f3;
    int m;
    int n;
    ViewPager.ItemInfo localItemInfo;
    if (j > 0)
    {
      k = this.mPageMargin;
      f1 = k;
      f2 = j;
      f3 = f1 / f2;
      if (paramItemInfo2 == null) {
        break label519;
      }
      m = paramItemInfo2.position;
      k = paramItemInfo1.position;
      if (m < k)
      {
        n = 0;
        localItemInfo = null;
        f1 = paramItemInfo2.offset;
        f2 = paramItemInfo2.widthFactor;
        f1 += f2;
        f4 = f1 + f3;
        i1 = m + 1;
      }
    }
    else
    {
      for (;;)
      {
        k = paramItemInfo1.position;
        if (i1 > k) {
          break label519;
        }
        localObject = this.mItems;
        k = ((ArrayList)localObject).size();
        if (n >= k) {
          break label519;
        }
        localObject = this.mItems;
        for (localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(n);; localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(n))
        {
          k = localItemInfo.position;
          if (i1 <= k) {
            break;
          }
          localObject = this.mItems;
          k = ((ArrayList)localObject).size() + -1;
          if (n >= k) {
            break;
          }
          n += 1;
          localObject = this.mItems;
        }
        f3 = 0.0F;
        break;
        for (;;)
        {
          k = localItemInfo.position;
          if (i1 >= k) {
            break;
          }
          localObject = this.mAdapter;
          f1 = ((PagerAdapter)localObject).getPageWidth(i1) + f3;
          f4 += f1;
          i1 += 1;
        }
        localItemInfo.offset = f4;
        f1 = localItemInfo.widthFactor + f3;
        f4 += f1;
        i1 += 1;
      }
    }
    int k = paramItemInfo1.position;
    if (m > k)
    {
      localObject = this.mItems;
      k = ((ArrayList)localObject).size();
      n = k + -1;
      localItemInfo = null;
      f4 = paramItemInfo2.offset;
      i1 = m + -1;
      for (;;)
      {
        k = paramItemInfo1.position;
        if ((i1 < k) || (n < 0)) {
          break;
        }
        localObject = this.mItems;
        for (localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(n);; localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(n))
        {
          k = localItemInfo.position;
          if ((i1 >= k) || (n <= 0)) {
            break;
          }
          n += -1;
          localObject = this.mItems;
        }
        for (;;)
        {
          k = localItemInfo.position;
          if (i1 <= k) {
            break;
          }
          localObject = this.mAdapter;
          f1 = ((PagerAdapter)localObject).getPageWidth(i1) + f3;
          f4 -= f1;
          i1 += -1;
        }
        f1 = localItemInfo.widthFactor + f3;
        f4 -= f1;
        localItemInfo.offset = f4;
        i1 += -1;
      }
    }
    label519:
    localObject = this.mItems;
    int i2 = ((ArrayList)localObject).size();
    float f4 = paramItemInfo1.offset;
    int i1 = paramItemInfo1.position + -1;
    k = paramItemInfo1.position;
    int i3;
    if (k == 0)
    {
      f1 = paramItemInfo1.offset;
      this.mFirstOffset = f1;
      k = paramItemInfo1.position;
      i3 = i + -1;
      if (k != i3) {
        break label719;
      }
      f1 = paramItemInfo1.offset;
      f2 = paramItemInfo1.widthFactor;
      f1 += f2;
      i3 = 1065353216;
      f2 = 1.0F;
      f1 -= f2;
      label622:
      this.mLastOffset = f1;
      i4 = paramInt + -1;
    }
    int i5;
    for (;;)
    {
      if (i4 < 0) {
        break label787;
      }
      localObject = this.mItems;
      localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(i4);
      for (;;)
      {
        k = localItemInfo.position;
        if (i1 <= k) {
          break;
        }
        localObject = this.mAdapter;
        i5 = i1 + -1;
        f1 = ((PagerAdapter)localObject).getPageWidth(i1) + f3;
        f4 -= f1;
        i1 = i5;
      }
      k = -8388609;
      f1 = -3.4028235E38F;
      break;
      label719:
      k = 2139095039;
      f1 = Float.MAX_VALUE;
      break label622;
      f1 = localItemInfo.widthFactor + f3;
      f4 -= f1;
      localItemInfo.offset = f4;
      k = localItemInfo.position;
      if (k == 0) {
        this.mFirstOffset = f4;
      }
      i4 += -1;
      i1 += -1;
    }
    label787:
    float f1 = paramItemInfo1.offset;
    float f2 = paramItemInfo1.widthFactor;
    f1 += f2;
    f4 = f1 + f3;
    k = paramItemInfo1.position;
    i1 = k + 1;
    int i4 = paramInt + 1;
    while (i4 < i2)
    {
      localObject = this.mItems;
      localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(i4);
      for (;;)
      {
        k = localItemInfo.position;
        if (i1 >= k) {
          break;
        }
        localObject = this.mAdapter;
        i5 = i1 + 1;
        f1 = ((PagerAdapter)localObject).getPageWidth(i1) + f3;
        f4 += f1;
        i1 = i5;
      }
      k = localItemInfo.position;
      i3 = i + -1;
      if (k == i3)
      {
        f1 = localItemInfo.widthFactor + f4;
        i3 = 1065353216;
        f2 = 1.0F;
        f1 -= f2;
        this.mLastOffset = f1;
      }
      localItemInfo.offset = f4;
      f1 = localItemInfo.widthFactor + f3;
      f4 += f1;
      i4 += 1;
      i1 += 1;
    }
    this.mNeedCalculatePageOffsets = false;
  }
  
  private void completeScroll()
  {
    int i = this.mScrollState;
    int j = 2;
    if (i == j) {}
    for (int k = 1;; k = 0)
    {
      Object localObject;
      if (k != 0)
      {
        setScrollingCacheEnabled(false);
        this.mScroller.abortAnimation();
        int m = getScrollX();
        int n = getScrollY();
        int i1 = this.mScroller.getCurrX();
        localObject = this.mScroller;
        int i2 = ((Scroller)localObject).getCurrY();
        if ((m != i1) || (n != i2)) {
          scrollTo(i1, i2);
        }
        setScrollState(0);
      }
      this.mPopulatePending = false;
      int i3 = 0;
      for (;;)
      {
        localObject = this.mItems;
        i = ((ArrayList)localObject).size();
        if (i3 >= i) {
          break;
        }
        localObject = this.mItems;
        ViewPager.ItemInfo localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(i3);
        boolean bool = localItemInfo.scrolling;
        if (bool)
        {
          k = 1;
          localItemInfo.scrolling = false;
        }
        i3 += 1;
      }
    }
    if (k != 0) {
      populate();
    }
  }
  
  private int determineTargetPage(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt3);
    int j = this.mFlingDistance;
    int k;
    if (i > j)
    {
      i = Math.abs(paramInt2);
      j = this.mMinimumVelocity;
      if (i > j) {
        if (paramInt2 > 0) {
          k = paramInt1;
        }
      }
    }
    for (;;)
    {
      ArrayList localArrayList1 = this.mItems;
      i = localArrayList1.size();
      if (i > 0)
      {
        localArrayList1 = this.mItems;
        f1 = 0.0F;
        ViewPager.ItemInfo localItemInfo1 = (ViewPager.ItemInfo)localArrayList1.get(0);
        localArrayList1 = this.mItems;
        ArrayList localArrayList2 = this.mItems;
        j = localArrayList2.size() + -1;
        ViewPager.ItemInfo localItemInfo2 = (ViewPager.ItemInfo)localArrayList1.get(j);
        i = localItemInfo1.position;
        j = localItemInfo2.position;
        j = Math.min(k, j);
        k = Math.max(i, j);
      }
      return k;
      k = paramInt1 + 1;
      continue;
      float f2 = paramInt1 + paramFloat;
      j = 1056964608;
      float f1 = 0.5F;
      f2 += f1;
      k = (int)f2;
    }
  }
  
  private void endDrag()
  {
    this.mIsBeingDragged = false;
    this.mIsUnableToDrag = false;
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    if (localVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      localVelocityTracker = null;
      this.mVelocityTracker = null;
    }
  }
  
  private Rect getChildRectInPagerCoordinates(Rect paramRect, View paramView)
  {
    int i = 0;
    if (paramRect == null)
    {
      paramRect = new android/graphics/Rect;
      paramRect.<init>();
    }
    if (paramView == null)
    {
      paramRect.set(0, 0, 0, 0);
      return paramRect;
    }
    i = paramView.getLeft();
    paramRect.left = i;
    i = paramView.getRight();
    paramRect.right = i;
    i = paramView.getTop();
    paramRect.top = i;
    i = paramView.getBottom();
    paramRect.bottom = i;
    Object localObject;
    for (ViewParent localViewParent = paramView.getParent();; localViewParent = ((ViewGroup)localObject).getParent())
    {
      boolean bool = localViewParent instanceof ViewGroup;
      if ((!bool) || (localViewParent == this)) {
        break;
      }
      localObject = localViewParent;
      localObject = (ViewGroup)localViewParent;
      int j = paramRect.left;
      int k = ((ViewGroup)localObject).getLeft();
      j += k;
      paramRect.left = j;
      j = paramRect.right;
      k = ((ViewGroup)localObject).getRight();
      j += k;
      paramRect.right = j;
      j = paramRect.top;
      k = ((ViewGroup)localObject).getTop();
      j += k;
      paramRect.top = j;
      j = paramRect.bottom;
      k = ((ViewGroup)localObject).getBottom();
      j += k;
      paramRect.bottom = j;
    }
  }
  
  private ViewPager.ItemInfo infoForCurrentScrollPosition()
  {
    float f1 = 0.0F;
    int i = getWidth();
    int j;
    float f2;
    float f4;
    int m;
    float f5;
    float f6;
    int n;
    Object localObject1;
    int i1;
    if (i > 0)
    {
      j = getScrollX();
      f2 = j;
      float f3 = i;
      f4 = f2 / f3;
      if (i > 0)
      {
        j = this.mPageMargin;
        f2 = j;
        f3 = i;
        f1 = f2 / f3;
      }
      m = -1;
      f5 = 0.0F;
      f6 = 0.0F;
      n = 1;
      localObject1 = null;
      i1 = 0;
    }
    for (;;)
    {
      Object localObject2 = this.mItems;
      j = ((ArrayList)localObject2).size();
      ViewPager.ItemInfo localItemInfo;
      float f7;
      if (i1 < j)
      {
        localObject2 = this.mItems;
        localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject2).get(i1);
        if (n == 0)
        {
          j = localItemInfo.position;
          int i2 = m + 1;
          if (j != i2)
          {
            localItemInfo = this.mTempItem;
            f2 = f5 + f6 + f1;
            localItemInfo.offset = f2;
            j = m + 1;
            localItemInfo.position = j;
            localObject2 = this.mAdapter;
            i2 = localItemInfo.position;
            f2 = ((PagerAdapter)localObject2).getPageWidth(i2);
            localItemInfo.widthFactor = f2;
            i1 += -1;
          }
        }
        f7 = localItemInfo.offset;
        f2 = localItemInfo.widthFactor + f7;
        float f8 = f2 + f1;
        boolean bool;
        if (n == 0)
        {
          bool = f4 < f7;
          if (bool) {}
        }
        else
        {
          bool = f4 < f8;
          if (!bool)
          {
            localObject2 = this.mItems;
            int k = ((ArrayList)localObject2).size() + -1;
            if (i1 != k) {
              break label280;
            }
          }
          localObject1 = localItemInfo;
        }
      }
      return (ViewPager.ItemInfo)localObject1;
      f4 = 0.0F;
      break;
      label280:
      n = 0;
      m = localItemInfo.position;
      f5 = f7;
      f6 = localItemInfo.widthFactor;
      localObject1 = localItemInfo;
      i1 += 1;
    }
  }
  
  private boolean isGutterDrag(float paramFloat1, float paramFloat2)
  {
    float f = this.mGutterSize;
    boolean bool1 = paramFloat1 < f;
    if (bool1)
    {
      bool1 = paramFloat2 < 0.0F;
      if (bool1) {}
    }
    else
    {
      int i = getWidth();
      int j = this.mGutterSize;
      f = i - j;
      bool2 = paramFloat1 < f;
      if (!bool2) {
        break label74;
      }
      bool2 = paramFloat2 < 0.0F;
      if (!bool2) {
        break label74;
      }
    }
    boolean bool2 = true;
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool2;
      label74:
      bool2 = false;
    }
  }
  
  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = MotionEventCompat.getActionIndex(paramMotionEvent);
    int j = MotionEventCompat.getPointerId(paramMotionEvent, i);
    int k = this.mActivePointerId;
    if (j == k) {
      if (i != 0) {
        break label81;
      }
    }
    label81:
    for (int m = 1;; m = 0)
    {
      float f = MotionEventCompat.getX(paramMotionEvent, m);
      this.mLastMotionX = f;
      k = MotionEventCompat.getPointerId(paramMotionEvent, m);
      this.mActivePointerId = k;
      VelocityTracker localVelocityTracker = this.mVelocityTracker;
      if (localVelocityTracker != null)
      {
        localVelocityTracker = this.mVelocityTracker;
        localVelocityTracker.clear();
      }
      return;
    }
  }
  
  private boolean pageScrolled(int paramInt)
  {
    boolean bool1 = false;
    IllegalStateException localIllegalStateException = null;
    ArrayList localArrayList = this.mItems;
    int i = localArrayList.size();
    float f1;
    if (i == 0)
    {
      this.mCalledSuper = false;
      f1 = 0.0F;
      localArrayList = null;
      onPageScrolled(0, 0.0F, 0);
      boolean bool2 = this.mCalledSuper;
      if (!bool2)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("onPageScrolled did not call superclass implementation");
        throw localIllegalStateException;
      }
    }
    else
    {
      ViewPager.ItemInfo localItemInfo = infoForCurrentScrollPosition();
      int k = getWidth();
      int j = this.mPageMargin;
      int m = k + j;
      j = this.mPageMargin;
      f1 = j;
      float f2 = k;
      float f3 = f1 / f2;
      int n = localItemInfo.position;
      f1 = paramInt;
      f2 = k;
      f1 /= f2;
      f2 = localItemInfo.offset;
      f1 -= f2;
      f2 = localItemInfo.widthFactor + f3;
      float f4 = f1 / f2;
      f1 = m * f4;
      int i1 = (int)f1;
      this.mCalledSuper = false;
      onPageScrolled(n, f4, i1);
      bool1 = this.mCalledSuper;
      if (!bool1)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("onPageScrolled did not call superclass implementation");
        throw localIllegalStateException;
      }
      bool1 = true;
    }
    return bool1;
  }
  
  private boolean performDrag(float paramFloat)
  {
    boolean bool1 = false;
    float f1 = this.mLastMotionX - paramFloat;
    float f2 = paramFloat;
    this.mLastMotionX = paramFloat;
    float f3 = getScrollX();
    float f4 = f3 + f1;
    int i = getWidth();
    float f5 = i;
    float f6 = this.mFirstOffset;
    float f7 = f5 * f6;
    f5 = i;
    f6 = this.mLastOffset;
    float f8 = f5 * f6;
    int j = 1;
    int k = 1;
    Object localObject1 = this.mItems;
    f6 = 0.0F;
    ViewPager.ItemInfo localItemInfo1 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(0);
    localObject1 = this.mItems;
    Object localObject2 = this.mItems;
    int m = ((ArrayList)localObject2).size() + -1;
    ViewPager.ItemInfo localItemInfo2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(m);
    int n = localItemInfo1.position;
    if (n != 0)
    {
      j = 0;
      f5 = localItemInfo1.offset;
      f6 = i;
      f7 = f5 * f6;
    }
    n = localItemInfo2.position;
    localObject2 = this.mAdapter;
    m = ((PagerAdapter)localObject2).getCount() + -1;
    if (n != m)
    {
      k = 0;
      f5 = localItemInfo2.offset;
      f6 = i;
      f8 = f5 * f6;
    }
    boolean bool2 = f4 < f7;
    float f9;
    if (bool2)
    {
      if (j != 0)
      {
        f9 = f7 - f4;
        localObject1 = this.mLeftEdge;
        f6 = Math.abs(f9);
        f2 = i;
        f6 /= f2;
        bool1 = ((EdgeEffectCompat)localObject1).onPull(f6);
      }
      f4 = f7;
    }
    for (;;)
    {
      f5 = this.mLastMotionX;
      f6 = (int)f4;
      f6 = f4 - f6;
      f5 += f6;
      this.mLastMotionX = f5;
      int i1 = (int)f4;
      m = getScrollY();
      scrollTo(i1, m);
      i1 = (int)f4;
      pageScrolled(i1);
      return bool1;
      boolean bool3 = f4 < f8;
      if (bool3)
      {
        if (k != 0)
        {
          f9 = f4 - f8;
          localObject1 = this.mRightEdge;
          f6 = Math.abs(f9);
          f2 = i;
          f6 /= f2;
          bool1 = ((EdgeEffectCompat)localObject1).onPull(f6);
        }
        f4 = f8;
      }
    }
  }
  
  private void recomputeScrollPosition(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1;
    float f2;
    if (paramInt2 > 0)
    {
      Object localObject = this.mItems;
      boolean bool1 = ((ArrayList)localObject).isEmpty();
      if (!bool1)
      {
        int k = paramInt1 + paramInt3;
        int m = paramInt2 + paramInt4;
        int n = getScrollX();
        f1 = n;
        f2 = m;
        float f3 = f1 / f2;
        f1 = k * f3;
        int i1 = (int)f1;
        int i = getScrollY();
        scrollTo(i1, i);
        localObject = this.mScroller;
        boolean bool2 = ((Scroller)localObject).isFinished();
        if (!bool2)
        {
          j = this.mScroller.getDuration();
          int i2 = this.mScroller.timePassed();
          int i3 = j - i2;
          j = this.mCurItem;
          ViewPager.ItemInfo localItemInfo1 = infoForPosition(j);
          localObject = this.mScroller;
          i2 = 0;
          f2 = 0.0F;
          float f4 = localItemInfo1.offset;
          float f5 = paramInt1;
          f4 *= f5;
          int i4 = (int)f4;
          f5 = 0.0F;
          ((Scroller)localObject).startScroll(i1, 0, i4, 0, i3);
        }
        return;
      }
    }
    int j = this.mCurItem;
    ViewPager.ItemInfo localItemInfo2 = infoForPosition(j);
    if (localItemInfo2 != null)
    {
      f1 = localItemInfo2.offset;
      f2 = this.mLastOffset;
    }
    for (float f6 = Math.min(f1, f2);; f6 = 0.0F)
    {
      f1 = paramInt1 * f6;
      int i5 = (int)f1;
      j = getScrollX();
      if (i5 == j) {
        break;
      }
      completeScroll();
      j = getScrollY();
      scrollTo(i5, j);
      break;
    }
  }
  
  private void removeNonDecorViews()
  {
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      View localView = getChildAt(i);
      ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
      boolean bool = localLayoutParams.isDecor;
      if (!bool)
      {
        removeViewAt(i);
        i += -1;
      }
      i += 1;
    }
  }
  
  private void setScrollState(int paramInt)
  {
    int i = this.mScrollState;
    if (i == paramInt) {}
    for (;;)
    {
      return;
      this.mScrollState = paramInt;
      ViewPager.OnPageChangeListener localOnPageChangeListener = this.mOnPageChangeListener;
      if (localOnPageChangeListener != null)
      {
        localOnPageChangeListener = this.mOnPageChangeListener;
        localOnPageChangeListener.onPageScrollStateChanged(paramInt);
      }
    }
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    boolean bool = this.mScrollingCacheEnabled;
    if (bool != paramBoolean) {
      this.mScrollingCacheEnabled = paramBoolean;
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i = paramArrayList.size();
    int j = getDescendantFocusability();
    int k = 393216;
    int i1;
    if (j != k)
    {
      int n = 0;
      for (;;)
      {
        k = getChildCount();
        if (n >= k) {
          break;
        }
        View localView = getChildAt(n);
        k = localView.getVisibility();
        if (k == 0)
        {
          ViewPager.ItemInfo localItemInfo = infoForChild(localView);
          if (localItemInfo != null)
          {
            k = localItemInfo.position;
            i1 = this.mCurItem;
            if (k == i1) {
              localView.addFocusables(paramArrayList, paramInt1, paramInt2);
            }
          }
        }
        n += 1;
      }
    }
    k = 262144;
    if (j == k)
    {
      k = paramArrayList.size();
      if (i != k) {}
    }
    else
    {
      boolean bool1 = isFocusable();
      if (bool1) {
        break label147;
      }
    }
    for (;;)
    {
      return;
      label147:
      int m = paramInt2 & 0x1;
      i1 = 1;
      if (m == i1)
      {
        boolean bool2 = isInTouchMode();
        if (bool2)
        {
          bool2 = isFocusableInTouchMode();
          if (!bool2) {
            continue;
          }
        }
      }
      if (paramArrayList != null) {
        paramArrayList.add(this);
      }
    }
  }
  
  ViewPager.ItemInfo addNewItem(int paramInt1, int paramInt2)
  {
    ViewPager.ItemInfo localItemInfo = new android/support/v4/view/ViewPager$ItemInfo;
    localItemInfo.<init>();
    localItemInfo.position = paramInt1;
    Object localObject = this.mAdapter.instantiateItem(this, paramInt1);
    localItemInfo.object = localObject;
    localObject = this.mAdapter;
    float f = ((PagerAdapter)localObject).getPageWidth(paramInt1);
    localItemInfo.widthFactor = f;
    if (paramInt2 >= 0)
    {
      localObject = this.mItems;
      int i = ((ArrayList)localObject).size();
      if (paramInt2 < i) {}
    }
    else
    {
      localObject = this.mItems;
      ((ArrayList)localObject).add(localItemInfo);
    }
    for (;;)
    {
      return localItemInfo;
      localObject = this.mItems;
      ((ArrayList)localObject).add(paramInt2, localItemInfo);
    }
  }
  
  public void addTouchables(ArrayList paramArrayList)
  {
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      View localView = getChildAt(i);
      j = localView.getVisibility();
      if (j == 0)
      {
        ViewPager.ItemInfo localItemInfo = infoForChild(localView);
        if (localItemInfo != null)
        {
          j = localItemInfo.position;
          int k = this.mCurItem;
          if (j == k) {
            localView.addTouchables(paramArrayList);
          }
        }
      }
      i += 1;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool1 = checkLayoutParams(paramLayoutParams);
    if (!bool1) {
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    Object localObject = paramLayoutParams;
    localObject = (ViewPager.LayoutParams)paramLayoutParams;
    bool1 = ((ViewPager.LayoutParams)localObject).isDecor;
    boolean bool2 = paramView instanceof ViewPager.Decor;
    bool1 |= bool2;
    ((ViewPager.LayoutParams)localObject).isDecor = bool1;
    bool1 = this.mInLayout;
    if (bool1)
    {
      if (localObject != null)
      {
        bool1 = ((ViewPager.LayoutParams)localObject).isDecor;
        if (bool1)
        {
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          localIllegalStateException.<init>("Cannot add pager decor view during layout");
          throw localIllegalStateException;
        }
      }
      bool1 = true;
      ((ViewPager.LayoutParams)localObject).needsMeasure = bool1;
      addViewInLayout(paramView, paramInt, paramLayoutParams);
    }
    for (;;)
    {
      return;
      super.addView(paramView, paramInt, paramLayoutParams);
    }
  }
  
  public boolean arrowScroll(int paramInt)
  {
    int i = 66;
    int j = 17;
    View localView1 = findFocus();
    if (localView1 == this) {
      localView1 = null;
    }
    boolean bool = false;
    Object localObject = FocusFinder.getInstance();
    View localView2 = ((FocusFinder)localObject).findNextFocus(this, localView1, paramInt);
    int k;
    int m;
    if ((localView2 != null) && (localView2 != localView1)) {
      if (paramInt == j)
      {
        localObject = this.mTempRect;
        k = getChildRectInPagerCoordinates((Rect)localObject, localView2).left;
        localObject = this.mTempRect;
        localObject = getChildRectInPagerCoordinates((Rect)localObject, localView1);
        m = ((Rect)localObject).left;
        if ((localView1 != null) && (k >= m)) {
          bool = pageLeft();
        }
      }
    }
    for (;;)
    {
      int n;
      if (bool)
      {
        n = SoundEffectConstants.getContantForFocusDirection(paramInt);
        playSoundEffect(n);
      }
      return bool;
      bool = localView2.requestFocus();
      continue;
      if (paramInt == i)
      {
        localObject = this.mTempRect;
        k = getChildRectInPagerCoordinates((Rect)localObject, localView2).left;
        localObject = this.mTempRect;
        localObject = getChildRectInPagerCoordinates((Rect)localObject, localView1);
        m = ((Rect)localObject).left;
        if ((localView1 != null) && (k <= m))
        {
          bool = pageRight();
        }
        else
        {
          bool = localView2.requestFocus();
          continue;
          if (paramInt != j)
          {
            n = 1;
            if (paramInt != n) {}
          }
          else
          {
            bool = pageLeft();
            continue;
          }
          if (paramInt != i)
          {
            n = 2;
            if (paramInt != n) {}
          }
          else
          {
            bool = pageRight();
          }
        }
      }
    }
  }
  
  public boolean beginFakeDrag()
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = this.mIsBeingDragged;
    if (bool2) {
      return bool1;
    }
    this.mFakeDragging = i;
    setScrollState(i);
    this.mLastMotionX = 0.0F;
    this.mInitialMotionX = 0.0F;
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      this.mVelocityTracker = localVelocityTracker;
    }
    for (;;)
    {
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
      localVelocityTracker = this.mVelocityTracker;
      localVelocityTracker.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      this.mFakeDragBeginTime = l;
      bool1 = i;
      break;
      localVelocityTracker = this.mVelocityTracker;
      localVelocityTracker.clear();
    }
  }
  
  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = paramView instanceof ViewGroup;
    int i1;
    boolean bool2;
    if (bool1)
    {
      Object localObject = paramView;
      localObject = (ViewGroup)paramView;
      int k = ((View)paramView).getScrollX();
      int m = ((View)paramView).getScrollY();
      int n = ((ViewGroup)localObject).getChildCount();
      i1 = n + -1;
      if (i1 >= 0)
      {
        View localView = ((ViewGroup)localObject).getChildAt(i1);
        int i = paramInt2 + k;
        int i2 = localView.getLeft();
        if (i >= i2)
        {
          i = paramInt2 + k;
          i2 = localView.getRight();
          if (i < i2)
          {
            i = paramInt3 + m;
            i2 = localView.getTop();
            if (i >= i2)
            {
              i = paramInt3 + m;
              i2 = localView.getBottom();
              if (i < i2)
              {
                i2 = 1;
                i = paramInt2 + k;
                int i3 = localView.getLeft();
                int i4 = i - i3;
                i = paramInt3 + m;
                i3 = localView.getTop();
                int i5 = i - i3;
                i3 = paramInt1;
                bool2 = canScroll(localView, i2, paramInt1, i4, i5);
                if (bool2) {
                  bool2 = true;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      i1 += -1;
      break;
      if (paramBoolean)
      {
        int j = -paramInt1;
        bool3 = ViewCompat.canScrollHorizontally((View)paramView, j);
        if (bool3)
        {
          bool3 = true;
          continue;
        }
      }
      boolean bool3 = false;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof ViewPager.LayoutParams;
    if (bool)
    {
      bool = super.checkLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void computeScroll()
  {
    Scroller localScroller = this.mScroller;
    boolean bool = localScroller.isFinished();
    if (!bool)
    {
      localScroller = this.mScroller;
      bool = localScroller.computeScrollOffset();
      if (bool)
      {
        int i = getScrollX();
        int j = getScrollY();
        int k = this.mScroller.getCurrX();
        localScroller = this.mScroller;
        int m = localScroller.getCurrY();
        if ((i != k) || (j != m))
        {
          scrollTo(k, m);
          bool = pageScrolled(k);
          if (!bool)
          {
            this.mScroller.abortAnimation();
            bool = false;
            localScroller = null;
            scrollTo(0, m);
          }
        }
        ViewCompat.postInvalidateOnAnimation(this);
      }
    }
    for (;;)
    {
      return;
      completeScroll();
    }
  }
  
  void dataSetChanged()
  {
    boolean bool1 = true;
    Object localObject1 = this.mItems;
    int i = ((ArrayList)localObject1).size();
    int j = this.mOffscreenPageLimit * 2 + 1;
    boolean bool3;
    int k;
    int m;
    int n;
    label72:
    ViewPager.ItemInfo localItemInfo;
    int i1;
    if (i < j)
    {
      localObject1 = this.mItems;
      i = ((ArrayList)localObject1).size();
      localObject2 = this.mAdapter;
      j = ((PagerAdapter)localObject2).getCount();
      if (i < j)
      {
        bool3 = bool1;
        k = this.mCurItem;
        m = 0;
        n = 0;
        localObject1 = this.mItems;
        i = ((ArrayList)localObject1).size();
        if (n >= i) {
          break label326;
        }
        localItemInfo = (ViewPager.ItemInfo)this.mItems.get(n);
        localObject1 = this.mAdapter;
        localObject2 = localItemInfo.object;
        i1 = ((PagerAdapter)localObject1).getItemPosition(localObject2);
        i = -1;
        if (i1 != i) {
          break label145;
        }
      }
    }
    for (;;)
    {
      n += 1;
      break label72;
      bool3 = false;
      break;
      label145:
      i = -2;
      if (i1 == i)
      {
        localObject1 = this.mItems;
        ((ArrayList)localObject1).remove(n);
        n += -1;
        if (m == 0)
        {
          localObject1 = this.mAdapter;
          ((PagerAdapter)localObject1).startUpdate(this);
          m = 1;
        }
        localObject1 = this.mAdapter;
        j = localItemInfo.position;
        Object localObject3 = localItemInfo.object;
        ((PagerAdapter)localObject1).destroyItem(this, j, localObject3);
        bool3 = true;
        i = this.mCurItem;
        j = localItemInfo.position;
        if (i == j)
        {
          i = this.mCurItem;
          localObject2 = this.mAdapter;
          j = ((PagerAdapter)localObject2).getCount() + -1;
          i = Math.min(i, j);
          k = Math.max(0, i);
          bool3 = true;
        }
      }
      else
      {
        i = localItemInfo.position;
        if (i != i1)
        {
          i = localItemInfo.position;
          j = this.mCurItem;
          if (i == j) {
            k = i1;
          }
          localItemInfo.position = i1;
          bool3 = true;
        }
      }
    }
    label326:
    if (m != 0)
    {
      localObject1 = this.mAdapter;
      ((PagerAdapter)localObject1).finishUpdate(this);
    }
    localObject1 = this.mItems;
    Object localObject2 = COMPARATOR;
    Collections.sort((List)localObject1, (Comparator)localObject2);
    if (bool3)
    {
      int i2 = getChildCount();
      n = 0;
      while (n < i2)
      {
        View localView = getChildAt(n);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        boolean bool2 = localLayoutParams.isDecor;
        if (!bool2)
        {
          bool2 = false;
          localObject1 = null;
          localLayoutParams.widthFactor = 0.0F;
        }
        n += 1;
      }
      setCurrentItemInternal(k, false, bool1);
      requestLayout();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    if (!bool)
    {
      bool = executeKeyEvent(paramKeyEvent);
      if (!bool) {
        break label24;
      }
    }
    label24:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      int k = localView.getVisibility();
      if (k == 0)
      {
        ViewPager.ItemInfo localItemInfo = infoForChild(localView);
        if (localItemInfo != null)
        {
          k = localItemInfo.position;
          int m = this.mCurItem;
          if (k == m)
          {
            bool = localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
            if (!bool) {}
          }
        }
      }
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      j += 1;
      break;
    }
  }
  
  float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((float)((paramFloat - 0.5F) * 0.4712389167638204D));
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    super.draw(paramCanvas);
    boolean bool1 = false;
    int j = ViewCompat.getOverScrollMode(this);
    Object localObject;
    if (j != 0)
    {
      if (j == i)
      {
        localObject = this.mAdapter;
        if (localObject != null)
        {
          localObject = this.mAdapter;
          int k = ((PagerAdapter)localObject).getCount();
          if (k <= i) {}
        }
      }
    }
    else
    {
      localObject = this.mLeftEdge;
      boolean bool2 = ((EdgeEffectCompat)localObject).isFinished();
      int i1;
      int i2;
      int i3;
      float f2;
      float f3;
      if (!bool2)
      {
        i1 = paramCanvas.save();
        int m = getHeight();
        i = getPaddingTop();
        m -= i;
        i = getPaddingBottom();
        i2 = m - i;
        i3 = getWidth();
        paramCanvas.rotate(270.0F);
        m = -i2;
        i = getPaddingTop();
        f2 = m + i;
        f1 = this.mFirstOffset;
        f3 = i3;
        f1 *= f3;
        paramCanvas.translate(f2, f1);
        this.mLeftEdge.setSize(i2, i3);
        localObject = this.mLeftEdge;
        bool3 = ((EdgeEffectCompat)localObject).draw(paramCanvas);
        bool1 = false | bool3;
        paramCanvas.restoreToCount(i1);
      }
      localObject = this.mRightEdge;
      boolean bool3 = ((EdgeEffectCompat)localObject).isFinished();
      if (!bool3)
      {
        i1 = paramCanvas.save();
        i3 = getWidth();
        int n = getHeight();
        i = getPaddingTop();
        n -= i;
        i = getPaddingBottom();
        i2 = n - i;
        paramCanvas.rotate(90.0F);
        f2 = -getPaddingTop();
        f1 = -(this.mLastOffset + 1.0F);
        f3 = i3;
        f1 *= f3;
        paramCanvas.translate(f2, f1);
        this.mRightEdge.setSize(i2, i3);
        localObject = this.mRightEdge;
        boolean bool4 = ((EdgeEffectCompat)localObject).draw(paramCanvas);
        bool1 |= bool4;
        paramCanvas.restoreToCount(i1);
      }
    }
    for (;;)
    {
      if (bool1) {
        ViewCompat.postInvalidateOnAnimation(this);
      }
      return;
      this.mLeftEdge.finish();
      localObject = this.mRightEdge;
      ((EdgeEffectCompat)localObject).finish();
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.mMarginDrawable;
    if (localDrawable != null)
    {
      boolean bool = localDrawable.isStateful();
      if (bool)
      {
        int[] arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
  }
  
  public void endFakeDrag()
  {
    boolean bool1 = true;
    boolean bool2 = this.mFakeDragging;
    if (!bool2)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("No fake drag in progress. Call beginFakeDrag first.");
      throw localIllegalStateException;
    }
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    float f1 = this.mMaximumVelocity;
    localVelocityTracker.computeCurrentVelocity(1000, f1);
    int i = this.mActivePointerId;
    int j = (int)VelocityTrackerCompat.getXVelocity(localVelocityTracker, i);
    this.mPopulatePending = bool1;
    int k = getWidth();
    int m = getScrollX();
    ViewPager.ItemInfo localItemInfo = infoForCurrentScrollPosition();
    int n = localItemInfo.position;
    float f2 = m;
    f1 = k;
    f2 /= f1;
    f1 = localItemInfo.offset;
    f2 -= f1;
    f1 = localItemInfo.widthFactor;
    float f3 = f2 / f1;
    f2 = this.mLastMotionX;
    f1 = this.mInitialMotionX;
    int i1 = (int)(f2 - f1);
    int i2 = determineTargetPage(n, f3, j, i1);
    setCurrentItemInternal(i2, bool1, bool1, j);
    endDrag();
    this.mFakeDragging = false;
  }
  
  public boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = 1;
    boolean bool1 = false;
    int j = paramKeyEvent.getAction();
    if (j == 0)
    {
      j = paramKeyEvent.getKeyCode();
      switch (j)
      {
      }
    }
    for (;;)
    {
      return bool1;
      j = 17;
      bool1 = arrowScroll(j);
      continue;
      j = 66;
      bool1 = arrowScroll(j);
      continue;
      j = Build.VERSION.SDK_INT;
      int m = 11;
      if (j >= m)
      {
        boolean bool2 = KeyEventCompat.hasNoModifiers(paramKeyEvent);
        if (bool2)
        {
          int k = 2;
          bool1 = arrowScroll(k);
        }
        else
        {
          boolean bool3 = KeyEventCompat.hasModifiers(paramKeyEvent, i);
          if (bool3) {
            bool1 = arrowScroll(i);
          }
        }
      }
    }
  }
  
  public void fakeDragBy(float paramFloat)
  {
    boolean bool1 = this.mFakeDragging;
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("No fake drag in progress. Call beginFakeDrag first.");
      throw ((Throwable)localObject1);
    }
    float f1 = this.mLastMotionX + paramFloat;
    this.mLastMotionX = f1;
    float f2 = getScrollX();
    float f3 = f2 - paramFloat;
    int k = getWidth();
    f1 = k;
    float f4 = this.mFirstOffset;
    float f5 = f1 * f4;
    f1 = k;
    f4 = this.mLastOffset;
    float f6 = f1 * f4;
    Object localObject1 = this.mItems;
    f4 = 0.0F;
    ViewPager.ItemInfo localItemInfo1 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(0);
    localObject1 = this.mItems;
    Object localObject2 = this.mItems;
    int m = ((ArrayList)localObject2).size() + -1;
    ViewPager.ItemInfo localItemInfo2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(m);
    int i = localItemInfo1.position;
    if (i != 0)
    {
      f1 = localItemInfo1.offset;
      f4 = k;
      f5 = f1 * f4;
    }
    i = localItemInfo2.position;
    localObject2 = this.mAdapter;
    m = ((PagerAdapter)localObject2).getCount() + -1;
    if (i != m)
    {
      f1 = localItemInfo2.offset;
      f4 = k;
      f6 = f1 * f4;
    }
    boolean bool2 = f3 < f5;
    if (bool2) {
      f3 = f5;
    }
    for (;;)
    {
      f1 = this.mLastMotionX;
      f4 = (int)f3;
      f4 = f3 - f4;
      f1 += f4;
      this.mLastMotionX = f1;
      int j = (int)f3;
      m = getScrollY();
      scrollTo(j, m);
      j = (int)f3;
      pageScrolled(j);
      long l1 = SystemClock.uptimeMillis();
      long l2 = this.mFakeDragBeginTime;
      float f7 = this.mLastMotionX;
      MotionEvent localMotionEvent = MotionEvent.obtain(l2, l1, 2, f7, 0.0F, 0);
      this.mVelocityTracker.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      return;
      boolean bool3 = f3 < f6;
      if (bool3) {
        f3 = f6;
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    ViewPager.LayoutParams localLayoutParams = new android/support/v4/view/ViewPager$LayoutParams;
    localLayoutParams.<init>();
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ViewPager.LayoutParams localLayoutParams = new android/support/v4/view/ViewPager$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  public PagerAdapter getAdapter()
  {
    return this.mAdapter;
  }
  
  public int getCurrentItem()
  {
    return this.mCurItem;
  }
  
  public int getOffscreenPageLimit()
  {
    return this.mOffscreenPageLimit;
  }
  
  public int getPageMargin()
  {
    return this.mPageMargin;
  }
  
  ViewPager.ItemInfo infoForAnyChild(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != this)
    {
      boolean bool;
      if (localViewParent != null)
      {
        bool = localViewParent instanceof View;
        if (bool) {}
      }
      else
      {
        bool = false;
      }
    }
    for (ViewPager.ItemInfo localItemInfo = null;; localItemInfo = infoForChild(paramView))
    {
      return localItemInfo;
      paramView = localViewParent;
      paramView = (View)localViewParent;
      break;
    }
  }
  
  ViewPager.ItemInfo infoForChild(View paramView)
  {
    int i = 0;
    Object localObject1 = this.mItems;
    int j = ((ArrayList)localObject1).size();
    ViewPager.ItemInfo localItemInfo;
    if (i < j)
    {
      localItemInfo = (ViewPager.ItemInfo)this.mItems.get(i);
      localObject1 = this.mAdapter;
      Object localObject2 = localItemInfo.object;
      boolean bool = ((PagerAdapter)localObject1).isViewFromObject(paramView, localObject2);
      if (!bool) {}
    }
    for (;;)
    {
      return localItemInfo;
      i += 1;
      break;
      localItemInfo = null;
    }
  }
  
  ViewPager.ItemInfo infoForPosition(int paramInt)
  {
    int i = 0;
    ArrayList localArrayList = this.mItems;
    int j = localArrayList.size();
    ViewPager.ItemInfo localItemInfo;
    if (i < j)
    {
      localArrayList = this.mItems;
      localItemInfo = (ViewPager.ItemInfo)localArrayList.get(i);
      j = localItemInfo.position;
      if (j != paramInt) {}
    }
    for (;;)
    {
      return localItemInfo;
      i += 1;
      break;
      localItemInfo = null;
    }
  }
  
  void initViewPager()
  {
    int i = 1;
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(i);
    Context localContext = getContext();
    Object localObject = new android/widget/Scroller;
    Interpolator localInterpolator = sInterpolator;
    ((Scroller)localObject).<init>(localContext, localInterpolator);
    this.mScroller = ((Scroller)localObject);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    int j = ViewConfigurationCompat.getScaledPagingTouchSlop(localViewConfiguration);
    this.mTouchSlop = j;
    j = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.mMinimumVelocity = j;
    j = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.mMaximumVelocity = j;
    localObject = new android/support/v4/widget/EdgeEffectCompat;
    ((EdgeEffectCompat)localObject).<init>(localContext);
    this.mLeftEdge = ((EdgeEffectCompat)localObject);
    localObject = new android/support/v4/widget/EdgeEffectCompat;
    ((EdgeEffectCompat)localObject).<init>(localContext);
    this.mRightEdge = ((EdgeEffectCompat)localObject);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    j = (int)(25.0F * f1);
    this.mFlingDistance = j;
    j = (int)(2.0F * f1);
    this.mCloseEnough = j;
    float f2 = 16.0F * f1;
    j = (int)f2;
    this.mDefaultGutterSize = j;
    localObject = new android/support/v4/view/ViewPager$MyAccessibilityDelegate;
    ((ViewPager.MyAccessibilityDelegate)localObject).<init>(this);
    ViewCompat.setAccessibilityDelegate(this, (AccessibilityDelegateCompat)localObject);
    j = ViewCompat.getImportantForAccessibility(this);
    if (j == 0) {
      ViewCompat.setImportantForAccessibility(this, i);
    }
  }
  
  public boolean isFakeDragging()
  {
    return this.mFakeDragging;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = this.mPageMargin;
    Object localObject;
    int j;
    int k;
    float f1;
    float f2;
    float f3;
    int m;
    ViewPager.ItemInfo localItemInfo;
    float f4;
    int n;
    int i2;
    int i3;
    int i4;
    if (i > 0)
    {
      localObject = this.mMarginDrawable;
      if (localObject != null)
      {
        localObject = this.mItems;
        i = ((ArrayList)localObject).size();
        if (i > 0)
        {
          localObject = this.mAdapter;
          if (localObject != null)
          {
            j = getScrollX();
            k = getWidth();
            i = this.mPageMargin;
            f1 = i;
            f2 = k;
            f3 = f1 / f2;
            m = 0;
            localObject = this.mItems;
            f2 = 0.0F;
            localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(0);
            f4 = localItemInfo.offset;
            n = this.mItems.size();
            int i1 = localItemInfo.position;
            localObject = this.mItems;
            i2 = n + -1;
            localObject = (ViewPager.ItemInfo)((ArrayList)localObject).get(i2);
            i3 = ((ViewPager.ItemInfo)localObject).position;
            i4 = i1;
          }
        }
      }
    }
    for (;;)
    {
      float f5;
      if (i4 < i3)
      {
        for (;;)
        {
          i = localItemInfo.position;
          if ((i4 <= i) || (m >= n)) {
            break;
          }
          localObject = this.mItems;
          m += 1;
          localItemInfo = (ViewPager.ItemInfo)((ArrayList)localObject).get(m);
        }
        i = localItemInfo.position;
        if (i4 != i) {
          break label413;
        }
        f1 = localItemInfo.offset;
        f2 = localItemInfo.widthFactor;
        f1 += f2;
        f2 = k;
        f5 = f1 * f2;
        f1 = localItemInfo.offset;
        f2 = localItemInfo.widthFactor;
        f1 += f2;
      }
      for (f4 = f1 + f3;; f4 += f1)
      {
        f1 = this.mPageMargin + f5;
        f2 = j;
        boolean bool = f1 < f2;
        if (bool)
        {
          localObject = this.mMarginDrawable;
          i2 = (int)f5;
          int i5 = this.mTopPageBounds;
          int i6 = this.mPageMargin;
          int i7 = i6;
          float f6 = i6;
          float f7 = f6;
          f7 = f6 + f5;
          float f8 = 0.5F;
          f7 += f8;
          f6 = f7;
          i7 = (int)f7;
          i6 = this.mBottomPageBounds;
          ((Drawable)localObject).setBounds(i2, i5, i7, i6);
          localObject = this.mMarginDrawable;
          ((Drawable)localObject).draw(paramCanvas);
        }
        f1 = j + k;
        bool = f5 < f1;
        if (!bool) {
          break;
        }
        return;
        label413:
        localObject = this.mAdapter;
        float f9 = ((PagerAdapter)localObject).getPageWidth(i4);
        f1 = f4 + f9;
        f2 = k;
        f5 = f1 * f2;
        f1 = f9 + f3;
      }
      i4 += 1;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction() & 0xFF;
    int j = 3;
    float f1 = 4.2E-45F;
    Object localObject1;
    if (i != j)
    {
      j = 1;
      f1 = Float.MIN_VALUE;
      if (i != j) {}
    }
    else
    {
      this.mIsBeingDragged = false;
      this.mIsUnableToDrag = false;
      j = -1;
      f1 = 0.0F / 0.0F;
      this.mActivePointerId = j;
      localObject1 = this.mVelocityTracker;
      if (localObject1 != null)
      {
        this.mVelocityTracker.recycle();
        j = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.mVelocityTracker = null;
      }
      j = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
    boolean bool1;
    for (;;)
    {
      return j;
      if (i == 0) {
        break;
      }
      bool1 = this.mIsBeingDragged;
      if (bool1)
      {
        bool1 = true;
        f1 = Float.MIN_VALUE;
      }
      else
      {
        bool1 = this.mIsUnableToDrag;
        if (!bool1) {
          break;
        }
        bool1 = false;
        f1 = 0.0F;
        localObject1 = null;
      }
    }
    switch (i)
    {
    }
    for (;;)
    {
      localObject1 = this.mVelocityTracker;
      if (localObject1 == null)
      {
        localObject1 = VelocityTracker.obtain();
        this.mVelocityTracker = ((VelocityTracker)localObject1);
      }
      localObject1 = this.mVelocityTracker;
      ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
      bool1 = this.mIsBeingDragged;
      break;
      int n = this.mActivePointerId;
      int k = -1;
      f1 = 0.0F / 0.0F;
      if (n != k)
      {
        int i1 = MotionEventCompat.findPointerIndex(paramMotionEvent, n);
        float f2 = MotionEventCompat.getX(paramMotionEvent, i1);
        f1 = this.mLastMotionX;
        float f3 = f2 - f1;
        float f4 = Math.abs(f3);
        float f5 = MotionEventCompat.getY(paramMotionEvent, i1);
        f1 = this.mLastMotionY;
        float f6 = Math.abs(f5 - f1);
        f1 = 0.0F;
        localObject1 = null;
        boolean bool2 = f3 < 0.0F;
        Object localObject2;
        if (bool2)
        {
          f1 = this.mLastMotionX;
          bool2 = isGutterDrag(f1, f3);
          if (!bool2)
          {
            int i2 = (int)f3;
            int i3 = (int)f2;
            int i4 = (int)f5;
            localObject1 = this;
            localObject2 = this;
            bool2 = canScroll(this, false, i2, i3, i4);
            if (bool2)
            {
              this.mLastMotionX = f2;
              this.mInitialMotionX = f2;
              this.mLastMotionY = f5;
              this.mIsUnableToDrag = true;
              bool2 = false;
              f1 = 0.0F;
              localObject1 = null;
              break;
            }
          }
        }
        f1 = this.mTouchSlop;
        bool2 = f4 < f1;
        if (bool2)
        {
          bool2 = f4 < f6;
          if (bool2)
          {
            this.mIsBeingDragged = true;
            setScrollState(1);
            f1 = 0.0F;
            localObject1 = null;
            bool2 = f3 < 0.0F;
            if (bool2)
            {
              f1 = this.mInitialMotionX;
              i5 = this.mTouchSlop;
              f7 = i5;
              f1 += f7;
              label475:
              this.mLastMotionX = f1;
              bool2 = true;
              f1 = Float.MIN_VALUE;
              setScrollingCacheEnabled(bool2);
            }
          }
        }
        for (;;)
        {
          bool2 = this.mIsBeingDragged;
          if (!bool2) {
            break;
          }
          bool2 = performDrag(f2);
          if (!bool2) {
            break;
          }
          ViewCompat.postInvalidateOnAnimation(this);
          break;
          f1 = this.mInitialMotionX;
          i5 = this.mTouchSlop;
          f7 = i5;
          f1 -= f7;
          break label475;
          f1 = this.mTouchSlop;
          bool2 = f6 < f1;
          if (bool2)
          {
            bool2 = true;
            f1 = Float.MIN_VALUE;
            this.mIsUnableToDrag = bool2;
          }
        }
        f1 = paramMotionEvent.getX();
        this.mInitialMotionX = f1;
        this.mLastMotionX = f1;
        f1 = paramMotionEvent.getY();
        this.mLastMotionY = f1;
        int m = MotionEventCompat.getPointerId(paramMotionEvent, 0);
        this.mActivePointerId = m;
        f1 = 0.0F;
        this.mIsUnableToDrag = false;
        localObject1 = this.mScroller;
        ((Scroller)localObject1).computeScrollOffset();
        m = this.mScrollState;
        int i5 = 2;
        float f7 = 2.8E-45F;
        if (m == i5)
        {
          localObject1 = this.mScroller;
          m = ((Scroller)localObject1).getFinalX();
          localObject2 = this.mScroller;
          i5 = ((Scroller)localObject2).getCurrX();
          m = Math.abs(m - i5);
          i5 = this.mCloseEnough;
          if (m > i5)
          {
            this.mScroller.abortAnimation();
            localObject1 = null;
            this.mPopulatePending = false;
            populate();
            this.mIsBeingDragged = true;
            m = 1;
            f1 = Float.MIN_VALUE;
            setScrollState(m);
            continue;
          }
        }
        completeScroll();
        m = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.mIsBeingDragged = false;
        continue;
        onSecondaryPointerUp(paramMotionEvent);
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    this.mInLayout = i;
    populate();
    int n = 0;
    float f2 = 0.0F;
    i = 0;
    f1 = 0.0F;
    this.mInLayout = false;
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i6 = getPaddingRight();
    int i7 = getPaddingBottom();
    int i8 = getScrollX();
    int i9 = 0;
    int i10 = 0;
    View localView;
    int i11;
    ViewPager.LayoutParams localLayoutParams;
    int i12;
    int i13;
    int j;
    if (i10 < i1)
    {
      localView = getChildAt(i10);
      n = localView.getVisibility();
      i11 = 8;
      i = n;
      if (n != i11)
      {
        localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        i12 = 0;
        i13 = 0;
        i = localLayoutParams.isDecor;
        n = i;
        if (i != 0)
        {
          j = localLayoutParams.gravity;
          n = j;
          int i14 = j & 0x7;
          j = localLayoutParams.gravity;
          n = j;
          int i15 = j & 0x70;
          switch (i14)
          {
          default: 
            i12 = i4;
            switch (i15)
            {
            default: 
              label232:
              i13 = i5;
            }
            break;
          }
        }
      }
      for (;;)
      {
        i12 += i8;
        n = localView.getMeasuredWidth() + i12;
        i11 = localView.getMeasuredHeight() + i13;
        j = n;
        localView.layout(i12, i13, n, i11);
        i9 += 1;
        i10 += 1;
        break;
        i12 = i4;
        n = localView.getMeasuredWidth();
        i4 += n;
        break label232;
        n = localView.getMeasuredWidth();
        n = (i2 - n) / 2;
        j = n;
        i12 = Math.max(n, i4);
        break label232;
        n = i2 - i6;
        i11 = localView.getMeasuredWidth();
        i12 = n - i11;
        n = localView.getMeasuredWidth();
        i6 += n;
        break label232;
        i13 = i5;
        n = localView.getMeasuredHeight();
        i5 += n;
        continue;
        n = localView.getMeasuredHeight();
        n = (i3 - n) / 2;
        j = n;
        i13 = Math.max(n, i5);
        continue;
        n = i3 - i7;
        i11 = localView.getMeasuredHeight();
        i13 = n - i11;
        n = localView.getMeasuredHeight();
        i7 += n;
      }
    }
    i10 = 0;
    while (i10 < i1)
    {
      localView = getChildAt(i10);
      n = localView.getVisibility();
      i11 = 8;
      j = n;
      if (n != i11)
      {
        localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        int k = localLayoutParams.isDecor;
        n = k;
        if (k == 0)
        {
          ViewPager.ItemInfo localItemInfo = infoForChild(localView);
          if (localItemInfo != null)
          {
            k = i2;
            f2 = i2;
            f1 = localItemInfo.offset;
            f2 *= f1;
            f1 = f2;
            int i16 = (int)f2;
            i12 = i4 + i16;
            i13 = i5;
            k = localLayoutParams.needsMeasure;
            n = k;
            if (k != 0)
            {
              localLayoutParams.needsMeasure = false;
              n = i2 - i4 - i6;
              k = n;
              f2 = n;
              f1 = localLayoutParams.widthFactor;
              f2 *= f1;
              f1 = f2;
              m = (int)f2;
              n = m;
              int i17 = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
              n = i3 - i5 - i7;
              i11 = 1073741824;
              int i18 = View.MeasureSpec.makeMeasureSpec(n, i11);
              m = i17;
              localView.measure(i17, i18);
            }
            n = localView.getMeasuredWidth() + i12;
            i11 = localView.getMeasuredHeight() + i13;
            m = n;
            localView.layout(i12, i13, n, i11);
          }
        }
      }
      i10 += 1;
    }
    int m = i5;
    this.mTopPageBounds = i5;
    n = i3 - i7;
    m = n;
    this.mBottomPageBounds = n;
    this.mDecorChildCount = i9;
    this.mFirstLayout = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    int i = getDefaultSize(0, paramInt1);
    float f2 = 0.0F;
    int j = getDefaultSize(0, paramInt2);
    setMeasuredDimension(i, j);
    int k = getMeasuredWidth();
    int m = k / 10;
    int n = this.mDefaultGutterSize;
    i = n;
    i = Math.min(m, n);
    n = i;
    this.mGutterSize = i;
    i = getPaddingLeft();
    i = k - i;
    j = getPaddingRight();
    int i5 = i - j;
    i = getMeasuredHeight();
    j = getPaddingTop();
    i -= j;
    j = getPaddingBottom();
    int i6 = i - j;
    int i7 = getChildCount();
    int i8 = 0;
    n = i7;
    View localView;
    ViewPager.LayoutParams localLayoutParams;
    label291:
    label336:
    label346:
    int i17;
    if (i8 < i7)
    {
      localView = getChildAt(i8);
      i = localView.getVisibility();
      j = 8;
      n = i;
      int i12;
      int i13;
      int i14;
      if (i != j)
      {
        localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        if (localLayoutParams != null)
        {
          int i1 = localLayoutParams.isDecor;
          i = i1;
          if (i1 != 0)
          {
            i2 = localLayoutParams.gravity;
            i = i2;
            int i9 = i2 & 0x7;
            i2 = localLayoutParams.gravity;
            i = i2;
            int i10 = i2 & 0x70;
            int i11 = -1 << -1;
            i12 = -1 << -1;
            i = 48;
            f1 = 6.7E-44F;
            i2 = i10;
            if (i10 != i)
            {
              i = 80;
              f1 = 1.12E-43F;
              if (i10 != i) {
                break label531;
              }
            }
            i13 = 1;
            i = 3;
            f1 = 4.2E-45F;
            i2 = i;
            f2 = f1;
            if (i9 != i)
            {
              i = 5;
              f1 = 7.0E-45F;
              i2 = i;
              f2 = f1;
              if (i9 != i) {
                break label537;
              }
            }
            i14 = 1;
            if (i13 == 0) {
              break label543;
            }
            i11 = 1073741824;
            int i15 = i5;
            int i16 = i6;
            i2 = localLayoutParams.width;
            i = i2;
            j = -2;
            if (i2 != j)
            {
              i11 = 1073741824;
              i2 = localLayoutParams.width;
              i = i2;
              j = -1;
              if (i2 != j)
              {
                i2 = localLayoutParams.width;
                i15 = i2;
              }
            }
            i2 = localLayoutParams.height;
            i = i2;
            j = -2;
            if (i2 != j)
            {
              i12 = 1073741824;
              i2 = localLayoutParams.height;
              i = i2;
              j = -1;
              if (i2 != j) {
                i16 = localLayoutParams.height;
              }
            }
            i2 = i15;
            i17 = View.MeasureSpec.makeMeasureSpec(i15, i11);
            int i18 = View.MeasureSpec.makeMeasureSpec(i16, i12);
            i2 = i17;
            localView.measure(i17, i18);
            if (i13 == 0) {
              break label556;
            }
            i = localView.getMeasuredHeight();
            i6 -= i;
          }
        }
      }
      for (;;)
      {
        i8 += 1;
        break;
        label531:
        i13 = 0;
        break label291;
        label537:
        i14 = 0;
        break label336;
        label543:
        if (i14 == 0) {
          break label346;
        }
        i12 = 1073741824;
        break label346;
        label556:
        if (i14 != 0)
        {
          i = localView.getMeasuredWidth();
          i5 -= i;
        }
      }
    }
    int i2 = 1073741824;
    f2 = 2.0F;
    i = View.MeasureSpec.makeMeasureSpec(i5, i2);
    i2 = i;
    this.mChildWidthMeasureSpec = i;
    i2 = 1073741824;
    f2 = 2.0F;
    i = View.MeasureSpec.makeMeasureSpec(i6, i2);
    i2 = i;
    this.mChildHeightMeasureSpec = i;
    i2 = 1;
    f2 = Float.MIN_VALUE;
    this.mInLayout = i2;
    populate();
    i = 0;
    f1 = 0.0F;
    i2 = 0;
    f2 = 0.0F;
    this.mInLayout = false;
    i7 = getChildCount();
    i8 = 0;
    for (;;)
    {
      i2 = i7;
      if (i8 >= i7) {
        break;
      }
      localView = getChildAt(i8);
      i = localView.getVisibility();
      j = 8;
      i2 = i;
      if (i != j)
      {
        localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        if (localLayoutParams != null)
        {
          int i3 = localLayoutParams.isDecor;
          i = i3;
          if (i3 != 0) {}
        }
        else
        {
          f1 = i5;
          f2 = localLayoutParams.widthFactor;
          f1 *= f2;
          f2 = f1;
          int i4 = (int)f1;
          i = i4;
          j = 1073741824;
          i17 = View.MeasureSpec.makeMeasureSpec(i4, j);
          i = this.mChildHeightMeasureSpec;
          i4 = i17;
          localView.measure(i17, i);
        }
      }
      i8 += 1;
    }
  }
  
  protected void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = this.mDecorChildCount;
    if (i > 0)
    {
      int k = getScrollX();
      int m = getPaddingLeft();
      int n = getPaddingRight();
      int i1 = getWidth();
      int i2 = getChildCount();
      int i3 = 0;
      while (i3 < i2)
      {
        View localView = getChildAt(i3);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        boolean bool = localLayoutParams.isDecor;
        if (!bool)
        {
          i3 += 1;
        }
        else
        {
          int j = localLayoutParams.gravity;
          int i4 = j & 0x7;
          int i5 = 0;
          switch (i4)
          {
          default: 
            i5 = m;
          }
          for (;;)
          {
            i5 += k;
            j = localView.getLeft();
            int i6 = i5 - j;
            if (i6 == 0) {
              break;
            }
            localView.offsetLeftAndRight(i6);
            break;
            i5 = m;
            j = localView.getWidth();
            m += j;
            continue;
            j = localView.getMeasuredWidth();
            j = (i1 - j) / 2;
            i5 = Math.max(j, m);
            continue;
            j = i1 - n;
            int i7 = localView.getMeasuredWidth();
            i5 = j - i7;
            j = localView.getMeasuredWidth();
            n += j;
          }
        }
      }
    }
    ViewPager.OnPageChangeListener localOnPageChangeListener = this.mOnPageChangeListener;
    if (localOnPageChangeListener != null)
    {
      localOnPageChangeListener = this.mOnPageChangeListener;
      localOnPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
    localOnPageChangeListener = this.mInternalPageChangeListener;
    if (localOnPageChangeListener != null)
    {
      localOnPageChangeListener = this.mInternalPageChangeListener;
      localOnPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
    this.mCalledSuper = true;
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i = getChildCount();
    int j = paramInt & 0x2;
    int k;
    int m;
    int n;
    int i1;
    if (j != 0)
    {
      k = 0;
      m = 1;
      n = i;
      i1 = k;
      label28:
      if (i1 == n) {
        break label132;
      }
      View localView = getChildAt(i1);
      j = localView.getVisibility();
      if (j != 0) {
        break label122;
      }
      ViewPager.ItemInfo localItemInfo = infoForChild(localView);
      if (localItemInfo == null) {
        break label122;
      }
      j = localItemInfo.position;
      int i2 = this.mCurItem;
      if (j != i2) {
        break label122;
      }
      bool = localView.requestFocus(paramInt, paramRect);
      if (!bool) {
        break label122;
      }
    }
    label122:
    label132:
    for (boolean bool = true;; bool = false)
    {
      return bool;
      k = i + -1;
      m = -1;
      n = -1;
      break;
      i1 += m;
      break label28;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool1 = paramParcelable instanceof ViewPager.SavedState;
    if (!bool1) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      Object localObject1 = paramParcelable;
      localObject1 = (ViewPager.SavedState)paramParcelable;
      Object localObject2 = ((ViewPager.SavedState)localObject1).getSuperState();
      super.onRestoreInstanceState((Parcelable)localObject2);
      localObject2 = this.mAdapter;
      int i;
      if (localObject2 != null)
      {
        localObject2 = this.mAdapter;
        Parcelable localParcelable = ((ViewPager.SavedState)localObject1).adapterState;
        ClassLoader localClassLoader = ((ViewPager.SavedState)localObject1).loader;
        ((PagerAdapter)localObject2).restoreState(localParcelable, localClassLoader);
        i = ((ViewPager.SavedState)localObject1).position;
        localParcelable = null;
        boolean bool2 = true;
        setCurrentItemInternal(i, false, bool2);
      }
      else
      {
        i = ((ViewPager.SavedState)localObject1).position;
        this.mRestoredCurItem = i;
        localObject2 = ((ViewPager.SavedState)localObject1).adapterState;
        this.mRestoredAdapterState = ((Parcelable)localObject2);
        localObject2 = ((ViewPager.SavedState)localObject1).loader;
        this.mRestoredClassLoader = ((ClassLoader)localObject2);
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    ViewPager.SavedState localSavedState = new android/support/v4/view/ViewPager$SavedState;
    localSavedState.<init>(localParcelable);
    int i = this.mCurItem;
    localSavedState.position = i;
    Object localObject = this.mAdapter;
    if (localObject != null)
    {
      localObject = this.mAdapter.saveState();
      localSavedState.adapterState = ((Parcelable)localObject);
    }
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      int i = this.mPageMargin;
      int j = this.mPageMargin;
      recomputeScrollPosition(paramInt1, paramInt3, i, j);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject1 = this;
    boolean bool1 = this.mFakeDragging;
    boolean bool2 = bool1;
    float f1;
    if (bool1)
    {
      bool2 = true;
      f1 = Float.MIN_VALUE;
    }
    for (;;)
    {
      return bool2;
      i5 = paramMotionEvent.getAction();
      if (i5 == 0)
      {
        i5 = paramMotionEvent.getEdgeFlags();
        if (i5 != 0)
        {
          i5 = 0;
          f1 = 0.0F;
          localObject2 = null;
          continue;
        }
      }
      localObject1 = this;
      localObject1 = this.mAdapter;
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject1 = this;
        localObject1 = this.mAdapter;
        localObject2 = localObject1;
        i5 = ((PagerAdapter)localObject1).getCount();
        if (i5 != 0) {
          break;
        }
      }
      i5 = 0;
      f1 = 0.0F;
      localObject2 = null;
    }
    localObject1 = this;
    localObject1 = this.mVelocityTracker;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = VelocityTracker.obtain();
      localObject1 = localObject2;
      this.mVelocityTracker = ((VelocityTracker)localObject2);
    }
    localObject1 = this;
    localObject1 = this.mVelocityTracker;
    localObject2 = localObject1;
    ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
    int i8 = paramMotionEvent.getAction();
    int i9 = 0;
    int i = i8 & 0xFF;
    int i5 = i;
    switch (i)
    {
    }
    for (;;)
    {
      if (i9 != 0) {
        ViewCompat.postInvalidateOnAnimation(this);
      }
      i5 = 1;
      f1 = Float.MIN_VALUE;
      break;
      localObject1 = this;
      localObject1 = this.mScroller;
      localObject2 = localObject1;
      ((Scroller)localObject1).abortAnimation();
      this.mPopulatePending = false;
      populate();
      i = 1;
      float f2 = Float.MIN_VALUE;
      this.mIsBeingDragged = i;
      localObject1 = this;
      int i10 = 1;
      setScrollState(i10);
      f1 = paramMotionEvent.getX();
      f2 = f1;
      this.mInitialMotionX = f1;
      this.mLastMotionX = f1;
      f1 = 0.0F;
      localObject2 = null;
      localObject1 = paramMotionEvent;
      i10 = 0;
      i5 = MotionEventCompat.getPointerId(paramMotionEvent, 0);
      i = i5;
      this.mActivePointerId = i5;
      continue;
      localObject1 = this;
      int j = this.mIsBeingDragged;
      i5 = j;
      float f3;
      boolean bool3;
      if (j == 0)
      {
        int k = this.mActivePointerId;
        i5 = k;
        localObject1 = paramMotionEvent;
        i10 = k;
        int i11 = MotionEventCompat.findPointerIndex(paramMotionEvent, k);
        f3 = MotionEventCompat.getX(paramMotionEvent, i11);
        localObject1 = this;
        f2 = this.mLastMotionX;
        f1 = f2;
        float f4 = Math.abs(f3 - f2);
        localObject1 = paramMotionEvent;
        float f5 = MotionEventCompat.getY(paramMotionEvent, i11);
        localObject1 = this;
        f2 = this.mLastMotionY;
        f1 = f2;
        float f6 = Math.abs(f5 - f2);
        k = this.mTouchSlop;
        i5 = k;
        f2 = k;
        f1 = f2;
        i6 = f4 < f2;
        if (i6 > 0)
        {
          i6 = f4 < f6;
          if (i6 > 0)
          {
            k = 1;
            f2 = Float.MIN_VALUE;
            this.mIsBeingDragged = k;
            f2 = this.mInitialMotionX;
            f1 = f2;
            f1 = f3 - f2;
            bool3 = false;
            i6 = f1 < 0.0F;
            if (i6 <= 0) {
              break label630;
            }
            f1 = this.mInitialMotionX;
            k = this.mTouchSlop;
            bool3 = k;
            f2 = k;
          }
        }
      }
      int i12;
      for (f1 += f2;; f1 -= f2)
      {
        f2 = f1;
        this.mLastMotionX = f1;
        localObject1 = this;
        i10 = 1;
        setScrollState(i10);
        i6 = 1;
        f1 = Float.MIN_VALUE;
        i10 = i6;
        setScrollingCacheEnabled(i6);
        localObject1 = this;
        int m = this.mIsBeingDragged;
        i6 = m;
        if (m == 0) {
          break;
        }
        int n = this.mActivePointerId;
        i6 = n;
        localObject1 = paramMotionEvent;
        i10 = n;
        i12 = MotionEventCompat.findPointerIndex(paramMotionEvent, n);
        f3 = MotionEventCompat.getX(paramMotionEvent, i12);
        localObject1 = this;
        i6 = performDrag(f3);
        i9 = 0x0 | i6;
        break;
        label630:
        f1 = this.mInitialMotionX;
        n = this.mTouchSlop;
        bool3 = n;
        f2 = n;
      }
      localObject1 = this;
      int i1 = this.mIsBeingDragged;
      int i6 = i1;
      if (i1 != 0)
      {
        VelocityTracker localVelocityTracker = this.mVelocityTracker;
        localObject1 = this;
        int i2 = this.mMaximumVelocity;
        bool3 = i2;
        f2 = i2;
        localObject1 = localVelocityTracker;
        i10 = 1000;
        localVelocityTracker.computeCurrentVelocity(i10, f2);
        localObject1 = this;
        i2 = this.mActivePointerId;
        i6 = i2;
        localObject1 = localVelocityTracker;
        i10 = i2;
        f1 = VelocityTrackerCompat.getXVelocity(localVelocityTracker, i2);
        f2 = f1;
        int i13 = (int)f1;
        i2 = 1;
        f2 = Float.MIN_VALUE;
        this.mPopulatePending = i2;
        int i14 = getWidth();
        int i15 = getScrollX();
        ViewPager.ItemInfo localItemInfo = infoForCurrentScrollPosition();
        int i16 = localItemInfo.position;
        f1 = i15;
        i2 = i14;
        f2 = i14;
        f1 /= f2;
        f2 = localItemInfo.offset;
        f1 -= f2;
        f2 = localItemInfo.widthFactor;
        float f7 = f1 / f2;
        localObject1 = this;
        i2 = this.mActivePointerId;
        i6 = i2;
        localObject1 = paramMotionEvent;
        i10 = i2;
        i12 = MotionEventCompat.findPointerIndex(paramMotionEvent, i2);
        f3 = MotionEventCompat.getX(paramMotionEvent, i12);
        localObject1 = this;
        f2 = this.mInitialMotionX;
        f1 = f2;
        f1 = f3 - f2;
        f2 = f1;
        int i17 = (int)f1;
        int i18 = determineTargetPage(i16, f7, i13, i17);
        i10 = 1;
        boolean bool4 = true;
        setCurrentItemInternal(i18, i10, bool4, i13);
        f1 = 0.0F / 0.0F;
        i2 = -1;
        f2 = f1;
        this.mActivePointerId = i2;
        endDrag();
        localObject1 = this.mLeftEdge;
        localObject2 = localObject1;
        i6 = ((EdgeEffectCompat)localObject1).onRelease();
        localObject1 = this;
        localObject1 = this.mRightEdge;
        bool3 = ((EdgeEffectCompat)localObject1).onRelease();
        i9 = i6 | bool3;
        continue;
        localObject1 = this;
        int i3 = this.mIsBeingDragged;
        i6 = i3;
        if (i3 != 0)
        {
          int i4 = this.mCurItem;
          i6 = i4;
          boolean bool5 = true;
          i10 = i4;
          bool4 = true;
          setCurrentItemInternal(i4, bool4, bool5);
          f1 = 0.0F / 0.0F;
          i4 = -1;
          f2 = f1;
          this.mActivePointerId = i4;
          endDrag();
          localObject1 = this.mLeftEdge;
          localObject2 = localObject1;
          i6 = ((EdgeEffectCompat)localObject1).onRelease();
          localObject1 = this;
          localObject1 = this.mRightEdge;
          bool3 = ((EdgeEffectCompat)localObject1).onRelease();
          i9 = i6 | bool3;
          continue;
          int i19 = MotionEventCompat.getActionIndex(paramMotionEvent);
          localObject1 = paramMotionEvent;
          f3 = MotionEventCompat.getX(paramMotionEvent, i19);
          f2 = f3;
          this.mLastMotionX = f3;
          int i7 = MotionEventCompat.getPointerId(paramMotionEvent, i19);
          i4 = i7;
          this.mActivePointerId = i7;
          continue;
          onSecondaryPointerUp(paramMotionEvent);
          localObject1 = this;
          i4 = this.mActivePointerId;
          i7 = i4;
          localObject1 = paramMotionEvent;
          i10 = i4;
          i7 = MotionEventCompat.findPointerIndex(paramMotionEvent, i4);
          i10 = i7;
          f1 = MotionEventCompat.getX(paramMotionEvent, i7);
          f2 = f1;
          this.mLastMotionX = f1;
        }
      }
    }
  }
  
  boolean pageLeft()
  {
    boolean bool = true;
    int i = this.mCurItem;
    if (i > 0)
    {
      i = this.mCurItem + -1;
      setCurrentItem(i, bool);
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  boolean pageRight()
  {
    boolean bool = true;
    PagerAdapter localPagerAdapter1 = this.mAdapter;
    if (localPagerAdapter1 != null)
    {
      int i = this.mCurItem;
      PagerAdapter localPagerAdapter2 = this.mAdapter;
      int j = localPagerAdapter2.getCount() + -1;
      if (i < j)
      {
        i = this.mCurItem + 1;
        setCurrentItem(i, bool);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  void populate()
  {
    int i = this.mCurItem;
    populate(i);
  }
  
  void populate(int paramInt)
  {
    ViewPager.ItemInfo localItemInfo = null;
    Object localObject1 = this;
    int i = this.mCurItem;
    int i1 = i;
    if (i != paramInt)
    {
      i = this.mCurItem;
      i1 = i;
      localItemInfo = infoForPosition(i);
      i = paramInt;
      this.mCurItem = paramInt;
    }
    localObject1 = this;
    localObject1 = this.mAdapter;
    Object localObject2 = localObject1;
    if (localObject1 == null) {}
    float f1;
    int i6;
    label369:
    float f3;
    label521:
    int i15;
    View localView1;
    int m;
    label777:
    label792:
    label922:
    label928:
    label1093:
    label1099:
    label1239:
    label1245:
    label1448:
    boolean bool3;
    do
    {
      do
      {
        int j;
        do
        {
          return;
          localObject1 = this;
          j = this.mPopulatePending;
          i1 = j;
        } while (j != 0);
        localObject2 = getWindowToken();
      } while (localObject2 == null);
      localObject1 = this.mAdapter;
      localObject2 = localObject1;
      ((PagerAdapter)localObject1).startUpdate(this);
      localObject1 = this;
      int i5 = this.mOffscreenPageLimit;
      f1 = 0.0F;
      int k = this.mCurItem;
      i6 = k;
      i6 = k - i5;
      int i7 = Math.max(0, i6);
      localObject1 = this.mAdapter;
      localObject2 = localObject1;
      int i8 = ((PagerAdapter)localObject1).getCount();
      i1 = i8 + -1;
      localObject1 = this;
      k = this.mCurItem;
      i6 = k;
      i6 = k + i5;
      int i9 = Math.min(i1, i6);
      Object localObject3 = null;
      int i10 = 0;
      localObject1 = this;
      localObject1 = this.mItems;
      localObject2 = localObject1;
      i1 = ((ArrayList)localObject1).size();
      k = i1;
      if (i10 < i1)
      {
        localObject1 = this;
        localObject1 = this.mItems;
        localObject2 = localObject1;
        localObject4 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i10);
        i1 = ((ViewPager.ItemInfo)localObject4).position;
        localObject1 = this;
        i6 = this.mCurItem;
        k = i1;
        if (i1 < i6) {
          break label777;
        }
        i1 = ((ViewPager.ItemInfo)localObject4).position;
        i6 = this.mCurItem;
        k = i1;
        if (i1 == i6) {
          localObject3 = localObject4;
        }
      }
      if ((localObject3 == null) && (i8 > 0))
      {
        localObject1 = this;
        k = this.mCurItem;
        i1 = k;
        localObject3 = addNewItem(k, i10);
      }
      float f2;
      int i11;
      int i12;
      float f5;
      boolean bool2;
      Object localObject5;
      int i13;
      if (localObject3 != null)
      {
        f2 = 0.0F;
        i11 = i10 + -1;
        if (i11 >= 0)
        {
          localObject1 = this;
          localObject1 = this.mItems;
          localObject2 = localObject1;
          localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
          localObject4 = localObject2;
          f1 = 2.0F;
          f3 = ((ViewPager.ItemInfo)localObject3).widthFactor;
          float f4 = f1 - f3;
          localObject1 = this;
          k = this.mCurItem;
          i1 = k;
          i12 = k + -1;
          if (i12 >= 0)
          {
            bool1 = f2 < f4;
            if (bool1) {
              break label928;
            }
            k = i12;
            if (i12 >= i7) {
              break label928;
            }
            if (localObject4 != null) {
              break label792;
            }
          }
          f5 = ((ViewPager.ItemInfo)localObject3).widthFactor;
          i11 = i10 + 1;
          f1 = 2.0F;
          boolean bool1 = f5 < f1;
          if (bool1)
          {
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            int i2 = ((ArrayList)localObject1).size();
            k = i2;
            if (i11 >= i2) {
              break label1093;
            }
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
            localObject4 = localObject2;
            localObject1 = this;
            k = this.mCurItem;
            i2 = k;
            i12 = k + 1;
            k = i12;
            if (i12 < i8)
            {
              f1 = 2.0F;
              bool2 = f5 < f1;
              if ((bool2) || (i12 <= i9)) {
                break label1245;
              }
              if (localObject4 != null) {
                break label1099;
              }
            }
          }
          localObject1 = this;
          calculatePageOffsets((ViewPager.ItemInfo)localObject3, i10, localItemInfo);
        }
      }
      else
      {
        localObject1 = this;
        localObject5 = this.mAdapter;
        localObject1 = this;
        k = this.mCurItem;
        i13 = k;
        if (localObject3 == null) {
          break label1448;
        }
        localObject1 = ((ViewPager.ItemInfo)localObject3).object;
      }
      for (localObject2 = localObject1;; localObject2 = null)
      {
        localObject1 = localObject5;
        ((PagerAdapter)localObject5).setPrimaryItem(this, i13, localObject2);
        localObject1 = this;
        localObject1 = this.mAdapter;
        localObject2 = localObject1;
        ((PagerAdapter)localObject1).finishUpdate(this);
        int i14 = getChildCount();
        i15 = 0;
        while (i15 < i14)
        {
          localObject1 = this;
          localView1 = getChildAt(i15);
          ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView1.getLayoutParams();
          localObject1 = localLayoutParams;
          m = localLayoutParams.isDecor;
          bool2 = m;
          if (m == 0)
          {
            f3 = localLayoutParams.widthFactor;
            f1 = f3;
            i6 = 0;
            localObject5 = null;
            bool2 = f3 < 0.0F;
            if (!bool2)
            {
              localObject1 = this;
              localObject4 = infoForChild(localView1);
              if (localObject4 != null)
              {
                f3 = ((ViewPager.ItemInfo)localObject4).widthFactor;
                f1 = f3;
                localLayoutParams.widthFactor = f3;
              }
            }
          }
          i15 += 1;
        }
        i10 += 1;
        break;
        localObject4 = null;
        break label369;
        int i3 = ((ViewPager.ItemInfo)localObject4).position;
        m = i12;
        if (i12 == i3)
        {
          m = ((ViewPager.ItemInfo)localObject4).scrolling;
          i3 = m;
          if (m == 0)
          {
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            ((ArrayList)localObject1).remove(i11);
            localObject1 = this;
            localObject2 = this.mAdapter;
            localObject5 = ((ViewPager.ItemInfo)localObject4).object;
            localObject1 = localObject2;
            ((PagerAdapter)localObject2).destroyItem(this, i12, localObject5);
            i11 += -1;
            i10 += -1;
            if (i11 < 0) {
              break label922;
            }
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
          }
        }
        for (localObject4 = localObject2;; localObject4 = null)
        {
          i12 += -1;
          break;
        }
        if (localObject4 != null)
        {
          i3 = ((ViewPager.ItemInfo)localObject4).position;
          m = i12;
          if (i12 == i3)
          {
            f3 = ((ViewPager.ItemInfo)localObject4).widthFactor;
            f1 = f3;
            f2 += f3;
            i11 += -1;
            if (i11 >= 0)
            {
              localObject1 = this;
              localObject1 = this.mItems;
              localObject2 = localObject1;
              localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
            }
            for (localObject4 = localObject2;; localObject4 = null) {
              break;
            }
          }
        }
        i3 = i11 + 1;
        localObject1 = this;
        localObject4 = addNewItem(i12, i3);
        f3 = ((ViewPager.ItemInfo)localObject4).widthFactor;
        f1 = f3;
        f2 += f3;
        i10 += 1;
        if (i11 >= 0)
        {
          localObject1 = this.mItems;
          localObject2 = localObject1;
          localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
        }
        for (localObject4 = localObject2;; localObject4 = null) {
          break;
        }
        localObject4 = null;
        break label521;
        i3 = ((ViewPager.ItemInfo)localObject4).position;
        m = i12;
        if (i12 == i3)
        {
          m = ((ViewPager.ItemInfo)localObject4).scrolling;
          i3 = m;
          if (m == 0)
          {
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            ((ArrayList)localObject1).remove(i11);
            localObject1 = this;
            localObject2 = this.mAdapter;
            localObject5 = ((ViewPager.ItemInfo)localObject4).object;
            localObject1 = localObject2;
            ((PagerAdapter)localObject2).destroyItem(this, i12, localObject5);
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            i3 = ((ArrayList)localObject1).size();
            m = i3;
            if (i11 >= i3) {
              break label1239;
            }
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
          }
        }
        for (localObject4 = localObject2;; localObject4 = null)
        {
          i12 += 1;
          break;
        }
        if (localObject4 != null)
        {
          i3 = ((ViewPager.ItemInfo)localObject4).position;
          m = i12;
          if (i12 == i3)
          {
            f3 = ((ViewPager.ItemInfo)localObject4).widthFactor;
            f1 = f3;
            f5 += f3;
            i11 += 1;
            localObject1 = this;
            localObject1 = this.mItems;
            localObject2 = localObject1;
            i3 = ((ArrayList)localObject1).size();
            m = i3;
            if (i11 < i3)
            {
              localObject1 = this;
              localObject1 = this.mItems;
              localObject2 = localObject1;
              localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
            }
            for (localObject4 = localObject2;; localObject4 = null) {
              break;
            }
          }
        }
        localObject1 = this;
        localObject4 = addNewItem(i12, i11);
        i11 += 1;
        f3 = ((ViewPager.ItemInfo)localObject4).widthFactor;
        f1 = f3;
        f5 += f3;
        localObject1 = this.mItems;
        localObject2 = localObject1;
        i3 = ((ArrayList)localObject1).size();
        m = i3;
        if (i11 < i3)
        {
          localObject1 = this;
          localObject1 = this.mItems;
          localObject2 = localObject1;
          localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(i11);
        }
        for (localObject4 = localObject2;; localObject4 = null) {
          break;
        }
        i3 = 0;
        f1 = 0.0F;
      }
      bool3 = hasFocus();
    } while (!bool3);
    View localView2 = findFocus();
    if (localView2 != null) {
      localObject1 = this;
    }
    for (Object localObject4 = infoForAnyChild(localView2);; localObject4 = null)
    {
      int i4;
      if (localObject4 != null)
      {
        i4 = ((ViewPager.ItemInfo)localObject4).position;
        localObject1 = this;
        i6 = this.mCurItem;
        m = i4;
        if (i4 == i6) {
          break;
        }
      }
      i15 = 0;
      for (;;)
      {
        i4 = getChildCount();
        m = i4;
        if (i15 >= i4) {
          break;
        }
        localObject1 = this;
        localView1 = getChildAt(i15);
        localObject4 = infoForChild(localView1);
        if (localObject4 != null)
        {
          i4 = ((ViewPager.ItemInfo)localObject4).position;
          i6 = this.mCurItem;
          m = i4;
          if (i4 == i6)
          {
            f1 = 2.8E-45F;
            int n = 2;
            f3 = f1;
            boolean bool4 = localView1.requestFocus(n);
            if (bool4) {
              break;
            }
          }
        }
        i15 += 1;
      }
    }
  }
  
  public void setAdapter(PagerAdapter paramPagerAdapter)
  {
    boolean bool = true;
    Object localObject1 = this.mAdapter;
    Object localObject2;
    int j;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = this.mAdapter;
      localObject2 = this.mObserver;
      ((PagerAdapter)localObject1).unregisterDataSetObserver((DataSetObserver)localObject2);
      localObject1 = this.mAdapter;
      ((PagerAdapter)localObject1).startUpdate(this);
      int i = 0;
      for (;;)
      {
        localObject1 = this.mItems;
        j = ((ArrayList)localObject1).size();
        if (i >= j) {
          break;
        }
        ViewPager.ItemInfo localItemInfo = (ViewPager.ItemInfo)this.mItems.get(i);
        localObject1 = this.mAdapter;
        int k = localItemInfo.position;
        localObject3 = localItemInfo.object;
        ((PagerAdapter)localObject1).destroyItem(this, k, localObject3);
        i += 1;
      }
      this.mAdapter.finishUpdate(this);
      localObject1 = this.mItems;
      ((ArrayList)localObject1).clear();
      removeNonDecorViews();
      this.mCurItem = 0;
      scrollTo(0, 0);
    }
    PagerAdapter localPagerAdapter = this.mAdapter;
    this.mAdapter = paramPagerAdapter;
    localObject1 = this.mAdapter;
    if (localObject1 != null)
    {
      localObject1 = this.mObserver;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v4/view/ViewPager$PagerObserver;
        ((ViewPager.PagerObserver)localObject1).<init>(this, null);
        this.mObserver = ((ViewPager.PagerObserver)localObject1);
      }
      localObject1 = this.mAdapter;
      localObject2 = this.mObserver;
      ((PagerAdapter)localObject1).registerDataSetObserver((DataSetObserver)localObject2);
      this.mPopulatePending = false;
      this.mFirstLayout = bool;
      j = this.mRestoredCurItem;
      if (j < 0) {
        break label312;
      }
      localObject1 = this.mAdapter;
      localObject2 = this.mRestoredAdapterState;
      localObject3 = this.mRestoredClassLoader;
      ((PagerAdapter)localObject1).restoreState((Parcelable)localObject2, (ClassLoader)localObject3);
      j = this.mRestoredCurItem;
      setCurrentItemInternal(j, false, bool);
      j = -1;
      this.mRestoredCurItem = j;
      this.mRestoredAdapterState = null;
      this.mRestoredClassLoader = null;
    }
    for (;;)
    {
      localObject1 = this.mAdapterChangeListener;
      if ((localObject1 != null) && (localPagerAdapter != paramPagerAdapter))
      {
        localObject1 = this.mAdapterChangeListener;
        ((ViewPager.OnAdapterChangeListener)localObject1).onAdapterChanged(localPagerAdapter, paramPagerAdapter);
      }
      return;
      label312:
      populate();
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    this.mPopulatePending = false;
    boolean bool = this.mFirstLayout;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      setCurrentItemInternal(paramInt, bool, false);
      return;
    }
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, paramBoolean, false);
  }
  
  void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setCurrentItemInternal(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void setCurrentItemInternal(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = true;
    Object localObject = this.mAdapter;
    int i;
    if (localObject != null)
    {
      localObject = this.mAdapter;
      i = ((PagerAdapter)localObject).getCount();
      if (i > 0) {}
    }
    else
    {
      setScrollingCacheEnabled(false);
    }
    for (;;)
    {
      return;
      if (!paramBoolean2)
      {
        i = this.mCurItem;
        if (i == paramInt1)
        {
          localObject = this.mItems;
          i = ((ArrayList)localObject).size();
          if (i != 0)
          {
            setScrollingCacheEnabled(false);
            continue;
          }
        }
      }
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      for (;;)
      {
        int j = this.mOffscreenPageLimit;
        i = this.mCurItem + j;
        if (paramInt1 <= i)
        {
          i = this.mCurItem - j;
          if (paramInt1 >= i) {
            break;
          }
        }
        int k = 0;
        for (;;)
        {
          localObject = this.mItems;
          i = ((ArrayList)localObject).size();
          if (k >= i) {
            break;
          }
          localObject = (ViewPager.ItemInfo)this.mItems.get(k);
          ((ViewPager.ItemInfo)localObject).scrolling = bool;
          k += 1;
        }
        localObject = this.mAdapter;
        i = ((PagerAdapter)localObject).getCount();
        if (paramInt1 >= i)
        {
          localObject = this.mAdapter;
          i = ((PagerAdapter)localObject).getCount();
          paramInt1 = i + -1;
        }
      }
      i = this.mCurItem;
      if (i != paramInt1) {}
      int m;
      for (;;)
      {
        populate(paramInt1);
        ViewPager.ItemInfo localItemInfo = infoForPosition(paramInt1);
        m = 0;
        if (localItemInfo != null)
        {
          int n = getWidth();
          float f1 = n;
          float f2 = this.mFirstOffset;
          float f3 = localItemInfo.offset;
          float f4 = this.mLastOffset;
          f3 = Math.min(f3, f4);
          f2 = Math.max(f2, f3);
          f1 *= f2;
          m = (int)f1;
        }
        if (!paramBoolean1) {
          break label389;
        }
        smoothScrollTo(m, 0, paramInt2);
        if (bool)
        {
          localObject = this.mOnPageChangeListener;
          if (localObject != null)
          {
            localObject = this.mOnPageChangeListener;
            ((ViewPager.OnPageChangeListener)localObject).onPageSelected(paramInt1);
          }
        }
        if (!bool) {
          break;
        }
        localObject = this.mInternalPageChangeListener;
        if (localObject == null) {
          break;
        }
        localObject = this.mInternalPageChangeListener;
        ((ViewPager.OnPageChangeListener)localObject).onPageSelected(paramInt1);
        break;
        bool = false;
      }
      label389:
      if (bool)
      {
        localObject = this.mOnPageChangeListener;
        if (localObject != null)
        {
          localObject = this.mOnPageChangeListener;
          ((ViewPager.OnPageChangeListener)localObject).onPageSelected(paramInt1);
        }
      }
      if (bool)
      {
        localObject = this.mInternalPageChangeListener;
        if (localObject != null)
        {
          localObject = this.mInternalPageChangeListener;
          ((ViewPager.OnPageChangeListener)localObject).onPageSelected(paramInt1);
        }
      }
      completeScroll();
      scrollTo(m, 0);
    }
  }
  
  ViewPager.OnPageChangeListener setInternalPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    ViewPager.OnPageChangeListener localOnPageChangeListener = this.mInternalPageChangeListener;
    this.mInternalPageChangeListener = paramOnPageChangeListener;
    return localOnPageChangeListener;
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    int i = 1;
    if (paramInt < i)
    {
      String str1 = "ViewPager";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Requested offscreen page limit ").append(paramInt);
      String str2 = " too small; defaulting to ";
      localObject = str2 + i;
      Log.w(str1, (String)localObject);
      paramInt = 1;
    }
    int j = this.mOffscreenPageLimit;
    if (paramInt != j)
    {
      this.mOffscreenPageLimit = paramInt;
      populate();
    }
  }
  
  void setOnAdapterChangeListener(ViewPager.OnAdapterChangeListener paramOnAdapterChangeListener)
  {
    this.mAdapterChangeListener = paramOnAdapterChangeListener;
  }
  
  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mOnPageChangeListener = paramOnPageChangeListener;
  }
  
  public void setPageMargin(int paramInt)
  {
    int i = this.mPageMargin;
    this.mPageMargin = paramInt;
    int j = getWidth();
    recomputeScrollPosition(j, j, paramInt, i);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt)
  {
    Drawable localDrawable = getContext().getResources().getDrawable(paramInt);
    setPageMarginDrawable(localDrawable);
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.mMarginDrawable = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    if (paramDrawable == null) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }
  
  void smoothScrollTo(int paramInt1, int paramInt2)
  {
    smoothScrollTo(paramInt1, paramInt2, 0);
  }
  
  void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getChildCount();
    Scroller localScroller;
    if (i == 0)
    {
      i = 0;
      f1 = 0.0F;
      localScroller = null;
      setScrollingCacheEnabled(false);
    }
    int j;
    int k;
    int m;
    int n;
    for (;;)
    {
      return;
      j = getScrollX();
      k = getScrollY();
      m = paramInt1 - j;
      n = paramInt2 - k;
      if ((m != 0) || (n != 0)) {
        break;
      }
      completeScroll();
      populate();
      i = 0;
      f1 = 0.0F;
      localScroller = null;
      setScrollState(0);
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    int i1 = getWidth();
    int i2 = i1 / 2;
    i = 1065353216;
    int i3 = Math.abs(m);
    float f2 = i3;
    float f3 = 1.0F * f2;
    f2 = i1;
    f3 /= f2;
    float f4 = Math.min(1.0F, f3);
    float f1 = i2;
    f3 = i2;
    f2 = distanceInfluenceForSnapDuration(f4);
    f3 *= f2;
    float f5 = f1 + f3;
    int i4 = 0;
    paramInt3 = Math.abs(paramInt3);
    if (paramInt3 > 0)
    {
      f3 = paramInt3;
      f3 = Math.abs(f5 / f3);
      f1 = 1000.0F * f3;
      i = Math.round(f1);
    }
    for (i4 = i * 4;; i4 = (int)f1)
    {
      i = 600;
      f1 = 8.41E-43F;
      i4 = Math.min(i4, i);
      localScroller = this.mScroller;
      localScroller.startScroll(j, k, m, n, i4);
      ViewCompat.postInvalidateOnAnimation(this);
      break;
      f1 = i1;
      PagerAdapter localPagerAdapter = this.mAdapter;
      i3 = this.mCurItem;
      f3 = localPagerAdapter.getPageWidth(i3);
      float f6 = f1 * f3;
      f1 = Math.abs(m);
      f3 = this.mPageMargin + f6;
      float f7 = f1 / f3;
      i = 1065353216;
      f1 = 1.0F + f7;
      f3 = 100.0F;
      f1 *= f3;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = this.mMarginDrawable;
      if (paramDrawable != localDrawable) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */