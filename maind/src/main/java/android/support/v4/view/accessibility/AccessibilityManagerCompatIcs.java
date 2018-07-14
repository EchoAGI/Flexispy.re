package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import java.util.List;

class AccessibilityManagerCompatIcs
{
  public static boolean addAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, Object paramObject)
  {
    paramObject = (AccessibilityManager.AccessibilityStateChangeListener)paramObject;
    return paramAccessibilityManager.addAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener)paramObject);
  }
  
  public static List getEnabledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager, int paramInt)
  {
    return paramAccessibilityManager.getEnabledAccessibilityServiceList(paramInt);
  }
  
  public static List getInstalledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager)
  {
    return paramAccessibilityManager.getInstalledAccessibilityServiceList();
  }
  
  public static boolean isTouchExplorationEnabled(AccessibilityManager paramAccessibilityManager)
  {
    return paramAccessibilityManager.isTouchExplorationEnabled();
  }
  
  public static Object newAccessibilityStateChangeListener(AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge paramAccessibilityStateChangeListenerBridge)
  {
    AccessibilityManagerCompatIcs.1 local1 = new android/support/v4/view/accessibility/AccessibilityManagerCompatIcs$1;
    local1.<init>(paramAccessibilityStateChangeListenerBridge);
    return local1;
  }
  
  public static boolean removeAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, Object paramObject)
  {
    paramObject = (AccessibilityManager.AccessibilityStateChangeListener)paramObject;
    return paramAccessibilityManager.removeAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener)paramObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityManagerCompatIcs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */