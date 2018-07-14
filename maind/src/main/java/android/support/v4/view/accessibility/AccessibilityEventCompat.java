package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public class AccessibilityEventCompat
{
  private static final AccessibilityEventCompat.AccessibilityEventVersionImpl IMPL;
  public static final int TYPES_ALL_MASK = 255;
  public static final int TYPE_ANNOUNCEMENT = 16384;
  public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
  public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
  public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
  public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
  public static final int TYPE_VIEW_HOVER_ENTER = 128;
  public static final int TYPE_VIEW_HOVER_EXIT = 256;
  public static final int TYPE_VIEW_SCROLLED = 4096;
  public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
  public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
  public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl;
      ((AccessibilityEventCompat.AccessibilityEventIcsImpl)localObject).<init>();
    }
    for (IMPL = (AccessibilityEventCompat.AccessibilityEventVersionImpl)localObject;; IMPL = (AccessibilityEventCompat.AccessibilityEventVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;
      ((AccessibilityEventCompat.AccessibilityEventStubImpl)localObject).<init>();
    }
  }
  
  public static void appendRecord(AccessibilityEvent paramAccessibilityEvent, AccessibilityRecordCompat paramAccessibilityRecordCompat)
  {
    AccessibilityEventCompat.AccessibilityEventVersionImpl localAccessibilityEventVersionImpl = IMPL;
    Object localObject = paramAccessibilityRecordCompat.getImpl();
    localAccessibilityEventVersionImpl.appendRecord(paramAccessibilityEvent, localObject);
  }
  
  public static AccessibilityRecordCompat getRecord(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    AccessibilityRecordCompat localAccessibilityRecordCompat = new android/support/v4/view/accessibility/AccessibilityRecordCompat;
    Object localObject = IMPL.getRecord(paramAccessibilityEvent, paramInt);
    localAccessibilityRecordCompat.<init>(localObject);
    return localAccessibilityRecordCompat;
  }
  
  public static int getRecordCount(AccessibilityEvent paramAccessibilityEvent)
  {
    return IMPL.getRecordCount(paramAccessibilityEvent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityEventCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */