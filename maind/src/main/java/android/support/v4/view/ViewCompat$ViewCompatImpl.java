package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

abstract interface ViewCompat$ViewCompatImpl
{
  public abstract boolean canScrollHorizontally(View paramView, int paramInt);
  
  public abstract boolean canScrollVertically(View paramView, int paramInt);
  
  public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView);
  
  public abstract int getImportantForAccessibility(View paramView);
  
  public abstract int getOverScrollMode(View paramView);
  
  public abstract boolean hasTransientState(View paramView);
  
  public abstract void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat);
  
  public abstract void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract void postInvalidateOnAnimation(View paramView);
  
  public abstract void postInvalidateOnAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void postOnAnimation(View paramView, Runnable paramRunnable);
  
  public abstract void postOnAnimationDelayed(View paramView, Runnable paramRunnable, long paramLong);
  
  public abstract void setAccessibilityDelegate(View paramView, AccessibilityDelegateCompat paramAccessibilityDelegateCompat);
  
  public abstract void setHasTransientState(View paramView, boolean paramBoolean);
  
  public abstract void setImportantForAccessibility(View paramView, int paramInt);
  
  public abstract void setOverScrollMode(View paramView, int paramInt);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewCompat$ViewCompatImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */