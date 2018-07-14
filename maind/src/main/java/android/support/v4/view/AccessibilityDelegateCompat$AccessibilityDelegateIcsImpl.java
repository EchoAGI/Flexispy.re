package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl
  extends AccessibilityDelegateCompat.AccessibilityDelegateStubImpl
{
  public boolean dispatchPopulateAccessibilityEvent(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return AccessibilityDelegateCompatIcs.dispatchPopulateAccessibilityEvent(paramObject, paramView, paramAccessibilityEvent);
  }
  
  public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl.1 local1 = new android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;
    local1.<init>(this, paramAccessibilityDelegateCompat);
    return AccessibilityDelegateCompatIcs.newAccessibilityDelegateBridge(local1);
  }
  
  public Object newAccessiblityDelegateDefaultImpl()
  {
    return AccessibilityDelegateCompatIcs.newAccessibilityDelegateDefaultImpl();
  }
  
  public void onInitializeAccessibilityEvent(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompatIcs.onInitializeAccessibilityEvent(paramObject, paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(Object paramObject, View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    Object localObject = paramAccessibilityNodeInfoCompat.getInfo();
    AccessibilityDelegateCompatIcs.onInitializeAccessibilityNodeInfo(paramObject, paramView, localObject);
  }
  
  public void onPopulateAccessibilityEvent(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompatIcs.onPopulateAccessibilityEvent(paramObject, paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return AccessibilityDelegateCompatIcs.onRequestSendAccessibilityEvent(paramObject, paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public void sendAccessibilityEvent(Object paramObject, View paramView, int paramInt)
  {
    AccessibilityDelegateCompatIcs.sendAccessibilityEvent(paramObject, paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompatIcs.sendAccessibilityEventUnchecked(paramObject, paramView, paramAccessibilityEvent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */