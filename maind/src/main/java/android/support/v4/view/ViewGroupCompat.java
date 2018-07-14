package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ViewGroupCompat
{
  static final ViewGroupCompat.ViewGroupCompatImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;
      ((ViewGroupCompat.ViewGroupCompatIcsImpl)localObject).<init>();
    }
    for (IMPL = (ViewGroupCompat.ViewGroupCompatImpl)localObject;; IMPL = (ViewGroupCompat.ViewGroupCompatImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;
      ((ViewGroupCompat.ViewGroupCompatStubImpl)localObject).<init>();
    }
  }
  
  public static boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return IMPL.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewGroupCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */