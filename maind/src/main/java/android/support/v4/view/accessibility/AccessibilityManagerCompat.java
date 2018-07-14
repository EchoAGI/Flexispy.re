package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public class AccessibilityManagerCompat
{
  private static final AccessibilityManagerCompat.AccessibilityManagerVersionImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;
      ((AccessibilityManagerCompat.AccessibilityManagerIcsImpl)localObject).<init>();
    }
    for (IMPL = (AccessibilityManagerCompat.AccessibilityManagerVersionImpl)localObject;; IMPL = (AccessibilityManagerCompat.AccessibilityManagerVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;
      ((AccessibilityManagerCompat.AccessibilityManagerStubImpl)localObject).<init>();
    }
  }
  
  public static boolean addAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat)
  {
    return IMPL.addAccessibilityStateChangeListener(paramAccessibilityManager, paramAccessibilityStateChangeListenerCompat);
  }
  
  public static List getEnabledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager, int paramInt)
  {
    return IMPL.getEnabledAccessibilityServiceList(paramAccessibilityManager, paramInt);
  }
  
  public static List getInstalledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager)
  {
    return IMPL.getInstalledAccessibilityServiceList(paramAccessibilityManager);
  }
  
  public static boolean isTouchExplorationEnabled(AccessibilityManager paramAccessibilityManager)
  {
    return IMPL.isTouchExplorationEnabled(paramAccessibilityManager);
  }
  
  public static boolean removeAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat)
  {
    return IMPL.removeAccessibilityStateChangeListener(paramAccessibilityManager, paramAccessibilityStateChangeListenerCompat);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityManagerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */