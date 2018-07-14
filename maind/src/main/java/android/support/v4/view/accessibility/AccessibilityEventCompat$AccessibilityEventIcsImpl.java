package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

class AccessibilityEventCompat$AccessibilityEventIcsImpl
  extends AccessibilityEventCompat.AccessibilityEventStubImpl
{
  public void appendRecord(AccessibilityEvent paramAccessibilityEvent, Object paramObject)
  {
    AccessibilityEventCompatIcs.appendRecord(paramAccessibilityEvent, paramObject);
  }
  
  public Object getRecord(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    return AccessibilityEventCompatIcs.getRecord(paramAccessibilityEvent, paramInt);
  }
  
  public int getRecordCount(AccessibilityEvent paramAccessibilityEvent)
  {
    return AccessibilityEventCompatIcs.getRecordCount(paramAccessibilityEvent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */