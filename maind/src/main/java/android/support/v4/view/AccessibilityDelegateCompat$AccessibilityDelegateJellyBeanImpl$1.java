package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1
  implements AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean
{
  AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1(AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl paramAccessibilityDelegateJellyBeanImpl, AccessibilityDelegateCompat paramAccessibilityDelegateCompat) {}
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.val$compat.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public Object getAccessibilityNodeProvider(View paramView)
  {
    Object localObject = this.val$compat;
    AccessibilityNodeProviderCompat localAccessibilityNodeProviderCompat = ((AccessibilityDelegateCompat)localObject).getAccessibilityNodeProvider(paramView);
    if (localAccessibilityNodeProviderCompat != null) {}
    for (localObject = localAccessibilityNodeProviderCompat.getProvider();; localObject = null) {
      return localObject;
    }
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.val$compat.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, Object paramObject)
  {
    AccessibilityDelegateCompat localAccessibilityDelegateCompat = this.val$compat;
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = new android/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    localAccessibilityNodeInfoCompat.<init>(paramObject);
    localAccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.val$compat.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.val$compat.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return this.val$compat.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    this.val$compat.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.val$compat.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */