package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;

class AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl
  extends AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl
{
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object paramObject, View paramView)
  {
    Object localObject = AccessibilityDelegateCompatJellyBean.getAccessibilityNodeProvider(paramObject, paramView);
    AccessibilityNodeProviderCompat localAccessibilityNodeProviderCompat;
    if (localObject != null)
    {
      localAccessibilityNodeProviderCompat = new android/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
      localAccessibilityNodeProviderCompat.<init>(localObject);
    }
    for (;;)
    {
      return localAccessibilityNodeProviderCompat;
      localAccessibilityNodeProviderCompat = null;
    }
  }
  
  public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl.1 local1 = new android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;
    local1.<init>(this, paramAccessibilityDelegateCompat);
    return AccessibilityDelegateCompatJellyBean.newAccessibilityDelegateBridge(local1);
  }
  
  public boolean performAccessibilityAction(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return AccessibilityDelegateCompatJellyBean.performAccessibilityAction(paramObject, paramView, paramInt, paramBundle);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */