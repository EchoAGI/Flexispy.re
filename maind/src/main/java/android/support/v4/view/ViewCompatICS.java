package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class ViewCompatICS
{
  public static boolean canScrollHorizontally(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
  
  public static boolean canScrollVertically(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }
  
  public static void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    paramView.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public static void onInitializeAccessibilityNodeInfo(View paramView, Object paramObject)
  {
    paramObject = (AccessibilityNodeInfo)paramObject;
    paramView.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)paramObject);
  }
  
  public static void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    paramView.onPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public static void setAccessibilityDelegate(View paramView, Object paramObject)
  {
    paramObject = (View.AccessibilityDelegate)paramObject;
    paramView.setAccessibilityDelegate((View.AccessibilityDelegate)paramObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewCompatICS.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */