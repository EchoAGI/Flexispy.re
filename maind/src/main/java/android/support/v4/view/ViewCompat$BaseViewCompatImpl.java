package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class ViewCompat$BaseViewCompatImpl
  implements ViewCompat.ViewCompatImpl
{
  public boolean canScrollHorizontally(View paramView, int paramInt)
  {
    return false;
  }
  
  public boolean canScrollVertically(View paramView, int paramInt)
  {
    return false;
  }
  
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView)
  {
    return null;
  }
  
  long getFrameTime()
  {
    return 10;
  }
  
  public int getImportantForAccessibility(View paramView)
  {
    return 0;
  }
  
  public int getOverScrollMode(View paramView)
  {
    return 2;
  }
  
  public boolean hasTransientState(View paramView)
  {
    return false;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  
  public void postInvalidateOnAnimation(View paramView)
  {
    long l = getFrameTime();
    paramView.postInvalidateDelayed(l);
  }
  
  public void postInvalidateOnAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    long l = getFrameTime();
    paramView.postInvalidateDelayed(l, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void postOnAnimation(View paramView, Runnable paramRunnable)
  {
    long l = getFrameTime();
    paramView.postDelayed(paramRunnable, l);
  }
  
  public void postOnAnimationDelayed(View paramView, Runnable paramRunnable, long paramLong)
  {
    long l = getFrameTime() + paramLong;
    paramView.postDelayed(paramRunnable, l);
  }
  
  public void setAccessibilityDelegate(View paramView, AccessibilityDelegateCompat paramAccessibilityDelegateCompat) {}
  
  public void setHasTransientState(View paramView, boolean paramBoolean) {}
  
  public void setImportantForAccessibility(View paramView, int paramInt) {}
  
  public void setOverScrollMode(View paramView, int paramInt) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewCompat$BaseViewCompatImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */