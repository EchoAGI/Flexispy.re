package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class AccessibilityNodeProviderCompatJellyBean$1
  extends AccessibilityNodeProvider
{
  AccessibilityNodeProviderCompatJellyBean$1(AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge paramAccessibilityNodeInfoBridge) {}
  
  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    return (AccessibilityNodeInfo)this.val$bridge.createAccessibilityNodeInfo(paramInt);
  }
  
  public List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    return this.val$bridge.findAccessibilityNodeInfosByText(paramString, paramInt);
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.val$bridge.performAction(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityNodeProviderCompatJellyBean$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */