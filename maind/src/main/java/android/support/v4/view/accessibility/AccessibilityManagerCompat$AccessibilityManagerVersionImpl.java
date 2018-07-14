package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

abstract interface AccessibilityManagerCompat$AccessibilityManagerVersionImpl
{
  public abstract boolean addAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat);
  
  public abstract List getEnabledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager, int paramInt);
  
  public abstract List getInstalledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager);
  
  public abstract boolean isTouchExplorationEnabled(AccessibilityManager paramAccessibilityManager);
  
  public abstract Object newAccessiblityStateChangeListener(AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat);
  
  public abstract boolean removeAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */