package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;

public class MenuItemCompat
{
  static final MenuItemCompat.MenuVersionImpl IMPL;
  public static final int SHOW_AS_ACTION_ALWAYS = 2;
  public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
  public static final int SHOW_AS_ACTION_IF_ROOM = 1;
  public static final int SHOW_AS_ACTION_NEVER = 0;
  public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;
      ((MenuItemCompat.HoneycombMenuVersionImpl)localObject).<init>();
    }
    for (IMPL = (MenuItemCompat.MenuVersionImpl)localObject;; IMPL = (MenuItemCompat.MenuVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/MenuItemCompat$BaseMenuVersionImpl;
      ((MenuItemCompat.BaseMenuVersionImpl)localObject).<init>();
    }
  }
  
  public static MenuItem setActionView(MenuItem paramMenuItem, View paramView)
  {
    return IMPL.setActionView(paramMenuItem, paramView);
  }
  
  public static boolean setShowAsAction(MenuItem paramMenuItem, int paramInt)
  {
    return IMPL.setShowAsAction(paramMenuItem, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/MenuItemCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */