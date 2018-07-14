package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

final class AccessibilityManagerCompatIcs$1
  implements AccessibilityManager.AccessibilityStateChangeListener
{
  AccessibilityManagerCompatIcs$1(AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge paramAccessibilityStateChangeListenerBridge) {}
  
  public void onAccessibilityStateChanged(boolean paramBoolean)
  {
    this.val$bridge.onAccessibilityStateChanged(paramBoolean);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityManagerCompatIcs$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */