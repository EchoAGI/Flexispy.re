package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public class ViewConfigurationCompat
{
  static final ViewConfigurationCompat.ViewConfigurationVersionImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/ViewConfigurationCompat$FroyoViewConfigurationVersionImpl;
      ((ViewConfigurationCompat.FroyoViewConfigurationVersionImpl)localObject).<init>();
    }
    for (IMPL = (ViewConfigurationCompat.ViewConfigurationVersionImpl)localObject;; IMPL = (ViewConfigurationCompat.ViewConfigurationVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;
      ((ViewConfigurationCompat.BaseViewConfigurationVersionImpl)localObject).<init>();
    }
  }
  
  public static int getScaledPagingTouchSlop(ViewConfiguration paramViewConfiguration)
  {
    return IMPL.getScaledPagingTouchSlop(paramViewConfiguration);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewConfigurationCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */