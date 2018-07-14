package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

class AccessibilityManagerCompat$AccessibilityManagerIcsImpl
  extends AccessibilityManagerCompat.AccessibilityManagerStubImpl
{
  public boolean addAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat)
  {
    Object localObject = paramAccessibilityStateChangeListenerCompat.mListener;
    return AccessibilityManagerCompatIcs.addAccessibilityStateChangeListener(paramAccessibilityManager, localObject);
  }
  
  public List getEnabledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager, int paramInt)
  {
    return AccessibilityManagerCompatIcs.getEnabledAccessibilityServiceList(paramAccessibilityManager, paramInt);
  }
  
  public List getInstalledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager)
  {
    return AccessibilityManagerCompatIcs.getInstalledAccessibilityServiceList(paramAccessibilityManager);
  }
  
  public boolean isTouchExplorationEnabled(AccessibilityManager paramAccessibilityManager)
  {
    return AccessibilityManagerCompatIcs.isTouchExplorationEnabled(paramAccessibilityManager);
  }
  
  public Object newAccessiblityStateChangeListener(AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat)
  {
    AccessibilityManagerCompat.AccessibilityManagerIcsImpl.1 local1 = new android/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1;
    local1.<init>(this, paramAccessibilityStateChangeListenerCompat);
    return AccessibilityManagerCompatIcs.newAccessibilityStateChangeListener(local1);
  }
  
  public boolean removeAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat)
  {
    Object localObject = paramAccessibilityStateChangeListenerCompat.mListener;
    return AccessibilityManagerCompatIcs.removeAccessibilityStateChangeListener(paramAccessibilityManager, localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */