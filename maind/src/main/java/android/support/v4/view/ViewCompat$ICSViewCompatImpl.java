package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class ViewCompat$ICSViewCompatImpl
  extends ViewCompat.HCViewCompatImpl
{
  public boolean canScrollHorizontally(View paramView, int paramInt)
  {
    return ViewCompatICS.canScrollHorizontally(paramView, paramInt);
  }
  
  public boolean canScrollVertically(View paramView, int paramInt)
  {
    return ViewCompatICS.canScrollVertically(paramView, paramInt);
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ViewCompatICS.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    Object localObject = paramAccessibilityNodeInfoCompat.getInfo();
    ViewCompatICS.onInitializeAccessibilityNodeInfo(paramView, localObject);
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ViewCompatICS.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegate(View paramView, AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    Object localObject = paramAccessibilityDelegateCompat.getBridge();
    ViewCompatICS.setAccessibilityDelegate(paramView, localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewCompat$ICSViewCompatImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */