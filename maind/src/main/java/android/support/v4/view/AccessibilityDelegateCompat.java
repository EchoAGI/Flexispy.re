package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class AccessibilityDelegateCompat
{
  private static final Object DEFAULT_DELEGATE;
  private static final AccessibilityDelegateCompat.AccessibilityDelegateImpl IMPL;
  final Object mBridge;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;
      ((AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl)localObject).<init>();
      IMPL = (AccessibilityDelegateCompat.AccessibilityDelegateImpl)localObject;
    }
    for (;;)
    {
      DEFAULT_DELEGATE = IMPL.newAccessiblityDelegateDefaultImpl();
      return;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i >= j)
      {
        localObject = new android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;
        ((AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl)localObject).<init>();
        IMPL = (AccessibilityDelegateCompat.AccessibilityDelegateImpl)localObject;
      }
      else
      {
        localObject = new android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateStubImpl;
        ((AccessibilityDelegateCompat.AccessibilityDelegateStubImpl)localObject).<init>();
        IMPL = (AccessibilityDelegateCompat.AccessibilityDelegateImpl)localObject;
      }
    }
  }
  
  public AccessibilityDelegateCompat()
  {
    Object localObject = IMPL.newAccessiblityDelegateBridge(this);
    this.mBridge = localObject;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    return localAccessibilityDelegateImpl.dispatchPopulateAccessibilityEvent(localObject, paramView, paramAccessibilityEvent);
  }
  
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    return localAccessibilityDelegateImpl.getAccessibilityNodeProvider(localObject, paramView);
  }
  
  Object getBridge()
  {
    return this.mBridge;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    localAccessibilityDelegateImpl.onInitializeAccessibilityEvent(localObject, paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    localAccessibilityDelegateImpl.onInitializeAccessibilityNodeInfo(localObject, paramView, paramAccessibilityNodeInfoCompat);
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    localAccessibilityDelegateImpl.onPopulateAccessibilityEvent(localObject, paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    return localAccessibilityDelegateImpl.onRequestSendAccessibilityEvent(localObject, paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    return localAccessibilityDelegateImpl.performAccessibilityAction(localObject, paramView, paramInt, paramBundle);
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    localAccessibilityDelegateImpl.sendAccessibilityEvent(localObject, paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityDelegateCompat.AccessibilityDelegateImpl localAccessibilityDelegateImpl = IMPL;
    Object localObject = DEFAULT_DELEGATE;
    localAccessibilityDelegateImpl.sendAccessibilityEventUnchecked(localObject, paramView, paramAccessibilityEvent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/AccessibilityDelegateCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */