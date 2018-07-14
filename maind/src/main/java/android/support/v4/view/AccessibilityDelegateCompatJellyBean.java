package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;

class AccessibilityDelegateCompatJellyBean
{
  public static Object getAccessibilityNodeProvider(Object paramObject, View paramView)
  {
    return ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
  }
  
  public static Object newAccessibilityDelegateBridge(AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean paramAccessibilityDelegateBridgeJellyBean)
  {
    AccessibilityDelegateCompatJellyBean.1 local1 = new android/support/v4/view/AccessibilityDelegateCompatJellyBean$1;
    local1.<init>(paramAccessibilityDelegateBridgeJellyBean);
    return local1;
  }
  
  public static boolean performAccessibilityAction(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/AccessibilityDelegateCompatJellyBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */