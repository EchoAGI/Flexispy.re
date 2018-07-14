package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class ViewCompat
{
  private static final long FAKE_FRAME_TIME = 10L;
  static final ViewCompat.ViewCompatImpl IMPL;
  public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
  public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
  public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
  public static final int OVER_SCROLL_ALWAYS = 0;
  public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
  public static final int OVER_SCROLL_NEVER = 2;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i < j)
    {
      localObject = Build.VERSION.CODENAME;
      String str = "JellyBean";
      boolean bool = ((String)localObject).equals(str);
      if (!bool) {}
    }
    else
    {
      localObject = new android/support/v4/view/ViewCompat$JBViewCompatImpl;
      ((ViewCompat.JBViewCompatImpl)localObject).<init>();
      IMPL = (ViewCompat.ViewCompatImpl)localObject;
    }
    for (;;)
    {
      return;
      int k = 14;
      if (i >= k)
      {
        localObject = new android/support/v4/view/ViewCompat$ICSViewCompatImpl;
        ((ViewCompat.ICSViewCompatImpl)localObject).<init>();
        IMPL = (ViewCompat.ViewCompatImpl)localObject;
      }
      else
      {
        k = 11;
        if (i >= k)
        {
          localObject = new android/support/v4/view/ViewCompat$HCViewCompatImpl;
          ((ViewCompat.HCViewCompatImpl)localObject).<init>();
          IMPL = (ViewCompat.ViewCompatImpl)localObject;
        }
        else
        {
          k = 9;
          if (i >= k)
          {
            localObject = new android/support/v4/view/ViewCompat$GBViewCompatImpl;
            ((ViewCompat.GBViewCompatImpl)localObject).<init>();
            IMPL = (ViewCompat.ViewCompatImpl)localObject;
          }
          else
          {
            localObject = new android/support/v4/view/ViewCompat$BaseViewCompatImpl;
            ((ViewCompat.BaseViewCompatImpl)localObject).<init>();
            IMPL = (ViewCompat.ViewCompatImpl)localObject;
          }
        }
      }
    }
  }
  
  public static boolean canScrollHorizontally(View paramView, int paramInt)
  {
    return IMPL.canScrollHorizontally(paramView, paramInt);
  }
  
  public static boolean canScrollVertically(View paramView, int paramInt)
  {
    return IMPL.canScrollVertically(paramView, paramInt);
  }
  
  public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView)
  {
    return IMPL.getAccessibilityNodeProvider(paramView);
  }
  
  public static int getImportantForAccessibility(View paramView)
  {
    return IMPL.getImportantForAccessibility(paramView);
  }
  
  public static int getOverScrollMode(View paramView)
  {
    return IMPL.getOverScrollMode(paramView);
  }
  
  public static boolean hasTransientState(View paramView)
  {
    return IMPL.hasTransientState(paramView);
  }
  
  public static void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    IMPL.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public static void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    IMPL.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
  }
  
  public static void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    IMPL.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public static void postInvalidateOnAnimation(View paramView)
  {
    IMPL.postInvalidateOnAnimation(paramView);
  }
  
  public static void postInvalidateOnAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    IMPL.postInvalidateOnAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void postOnAnimation(View paramView, Runnable paramRunnable)
  {
    IMPL.postOnAnimation(paramView, paramRunnable);
  }
  
  public static void postOnAnimationDelayed(View paramView, Runnable paramRunnable, long paramLong)
  {
    IMPL.postOnAnimationDelayed(paramView, paramRunnable, paramLong);
  }
  
  public static void setAccessibilityDelegate(View paramView, AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    IMPL.setAccessibilityDelegate(paramView, paramAccessibilityDelegateCompat);
  }
  
  public static void setHasTransientState(View paramView, boolean paramBoolean)
  {
    IMPL.setHasTransientState(paramView, paramBoolean);
  }
  
  public static void setImportantForAccessibility(View paramView, int paramInt)
  {
    IMPL.setImportantForAccessibility(paramView, paramInt);
  }
  
  public static void setOverScrollMode(View paramView, int paramInt)
  {
    IMPL.setOverScrollMode(paramView, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */