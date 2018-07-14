package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;

public class AccessibilityServiceInfoCompat
{
  public static final int FEEDBACK_ALL_MASK = 255;
  private static final AccessibilityServiceInfoCompat.AccessibilityServiceInfoVersionImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;
      ((AccessibilityServiceInfoCompat.AccessibilityServiceInfoIcsImpl)localObject).<init>();
    }
    for (IMPL = (AccessibilityServiceInfoCompat.AccessibilityServiceInfoVersionImpl)localObject;; IMPL = (AccessibilityServiceInfoCompat.AccessibilityServiceInfoVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;
      ((AccessibilityServiceInfoCompat.AccessibilityServiceInfoStubImpl)localObject).<init>();
    }
  }
  
  public static String feedbackTypeToString(int paramInt)
  {
    int i = 1;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "[";
    localStringBuilder.append(str);
    while (paramInt > 0)
    {
      int j = Integer.numberOfTrailingZeros(paramInt);
      int k = i << j;
      j = k ^ 0xFFFFFFFF;
      paramInt &= j;
      j = localStringBuilder.length();
      if (j > i)
      {
        str = ", ";
        localStringBuilder.append(str);
      }
      switch (k)
      {
      default: 
        break;
      case 1: 
        str = "FEEDBACK_SPOKEN";
        localStringBuilder.append(str);
        break;
      case 4: 
        str = "FEEDBACK_AUDIBLE";
        localStringBuilder.append(str);
        break;
      case 2: 
        str = "FEEDBACK_HAPTIC";
        localStringBuilder.append(str);
        break;
      case 16: 
        str = "FEEDBACK_GENERIC";
        localStringBuilder.append(str);
        break;
      case 8: 
        str = "FEEDBACK_VISUAL";
        localStringBuilder.append(str);
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static String flagToString(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (String str = null;; str = "DEFAULT") {
      return str;
    }
  }
  
  public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return IMPL.getCanRetrieveWindowContent(paramAccessibilityServiceInfo);
  }
  
  public static String getDescription(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return IMPL.getDescription(paramAccessibilityServiceInfo);
  }
  
  public static String getId(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return IMPL.getId(paramAccessibilityServiceInfo);
  }
  
  public static ResolveInfo getResolveInfo(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return IMPL.getResolveInfo(paramAccessibilityServiceInfo);
  }
  
  public static String getSettingsActivityName(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    return IMPL.getSettingsActivityName(paramAccessibilityServiceInfo);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/accessibilityservice/AccessibilityServiceInfoCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */