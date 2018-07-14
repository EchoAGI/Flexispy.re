package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

class AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1
  implements AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge
{
  AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1(AccessibilityNodeProviderCompat.AccessibilityNodeProviderJellyBeanImpl paramAccessibilityNodeProviderJellyBeanImpl, AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat) {}
  
  public Object createAccessibilityNodeInfo(int paramInt)
  {
    Object localObject = this.val$compat;
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = ((AccessibilityNodeProviderCompat)localObject).createAccessibilityNodeInfo(paramInt);
    if (localAccessibilityNodeInfoCompat == null) {}
    for (localObject = null;; localObject = localAccessibilityNodeInfoCompat.getInfo()) {
      return localObject;
    }
  }
  
  public List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    Object localObject = this.val$compat;
    List localList = ((AccessibilityNodeProviderCompat)localObject).findAccessibilityNodeInfosByText(paramString, paramInt);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat)localList.get(j);
      localObject = localAccessibilityNodeInfoCompat.getInfo();
      localArrayList.add(localObject);
      j += 1;
    }
    return localArrayList;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.val$compat.performAction(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */