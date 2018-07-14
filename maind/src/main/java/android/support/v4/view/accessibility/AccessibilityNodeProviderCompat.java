package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class AccessibilityNodeProviderCompat
{
  private static final AccessibilityNodeProviderCompat.AccessibilityNodeProviderImpl IMPL;
  private final Object mProvider;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl;
      ((AccessibilityNodeProviderCompat.AccessibilityNodeProviderJellyBeanImpl)localObject).<init>();
    }
    for (IMPL = (AccessibilityNodeProviderCompat.AccessibilityNodeProviderImpl)localObject;; IMPL = (AccessibilityNodeProviderCompat.AccessibilityNodeProviderImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl;
      ((AccessibilityNodeProviderCompat.AccessibilityNodeProviderStubImpl)localObject).<init>();
    }
  }
  
  public AccessibilityNodeProviderCompat()
  {
    Object localObject = IMPL.newAccessibilityNodeProviderBridge(this);
    this.mProvider = localObject;
  }
  
  public AccessibilityNodeProviderCompat(Object paramObject)
  {
    this.mProvider = paramObject;
  }
  
  public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int paramInt)
  {
    return null;
  }
  
  public List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    return null;
  }
  
  public Object getProvider()
  {
    return this.mProvider;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityNodeProviderCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */