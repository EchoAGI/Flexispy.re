package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityDelegateCompatIcs
{
  public static boolean dispatchPopulateAccessibilityEvent(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public static Object newAccessibilityDelegateBridge(AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge paramAccessibilityDelegateBridge)
  {
    AccessibilityDelegateCompatIcs.1 local1 = new android/support/v4/view/AccessibilityDelegateCompatIcs$1;
    local1.<init>(paramAccessibilityDelegateBridge);
    return local1;
  }
  
  public static Object newAccessibilityDelegateDefaultImpl()
  {
    View.AccessibilityDelegate localAccessibilityDelegate = new android/view/View$AccessibilityDelegate;
    localAccessibilityDelegate.<init>();
    return localAccessibilityDelegate;
  }
  
  public static void onInitializeAccessibilityEvent(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public static void onInitializeAccessibilityNodeInfo(Object paramObject1, View paramView, Object paramObject2)
  {
    paramObject1 = (View.AccessibilityDelegate)paramObject1;
    paramObject2 = (AccessibilityNodeInfo)paramObject2;
    ((View.AccessibilityDelegate)paramObject1).onInitializeAccessibilityNodeInfo(paramView, (AccessibilityNodeInfo)paramObject2);
  }
  
  public static void onPopulateAccessibilityEvent(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public static boolean onRequestSendAccessibilityEvent(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public static void sendAccessibilityEvent(Object paramObject, View paramView, int paramInt)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEvent(paramView, paramInt);
  }
  
  public static void sendAccessibilityEventUnchecked(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/AccessibilityDelegateCompatIcs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */