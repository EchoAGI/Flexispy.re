package android.support.v4.view.accessibility;

public abstract class AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat
{
  final Object mListener;
  
  public AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat()
  {
    Object localObject = AccessibilityManagerCompat.access$000().newAccessiblityStateChangeListener(this);
    this.mListener = localObject;
  }
  
  public abstract void onAccessibilityStateChanged(boolean paramBoolean);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */