package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MenuItem;

public class MenuCompat
{
  static final MenuCompat.MenuVersionImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/MenuCompat$HoneycombMenuVersionImpl;
      ((MenuCompat.HoneycombMenuVersionImpl)localObject).<init>();
    }
    for (IMPL = (MenuCompat.MenuVersionImpl)localObject;; IMPL = (MenuCompat.MenuVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/MenuCompat$BaseMenuVersionImpl;
      ((MenuCompat.BaseMenuVersionImpl)localObject).<init>();
    }
  }
  
  public static boolean setShowAsAction(MenuItem paramMenuItem, int paramInt)
  {
    return IMPL.setShowAsAction(paramMenuItem, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/MenuCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */