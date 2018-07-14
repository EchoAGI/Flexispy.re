package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

class AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl
  extends AccessibilityServiceInfoCompat.AccessibilityServiceInfoStubImpl
{
  public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(paramAccessibilityServiceInfo);
  }
  
  public String getDescription(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return AccessibilityServiceInfoCompatIcs.getDescription(paramAccessibilityServiceInfo);
  }
  
  public String getId(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return AccessibilityServiceInfoCompatIcs.getId(paramAccessibilityServiceInfo);
  }
  
  public ResolveInfo getResolveInfo(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return AccessibilityServiceInfoCompatIcs.getResolveInfo(paramAccessibilityServiceInfo);
  }
  
  public String getSettingsActivityName(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return AccessibilityServiceInfoCompatIcs.getSettingsActivityName(paramAccessibilityServiceInfo);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */