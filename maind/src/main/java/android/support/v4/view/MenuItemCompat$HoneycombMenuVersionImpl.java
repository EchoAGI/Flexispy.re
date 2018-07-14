package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

class MenuItemCompat$HoneycombMenuVersionImpl
  implements MenuItemCompat.MenuVersionImpl
{
  public MenuItem setActionView(MenuItem paramMenuItem, View paramView)
  {
    return MenuItemCompatHoneycomb.setActionView(paramMenuItem, paramView);
  }
  
  public boolean setShowAsAction(MenuItem paramMenuItem, int paramInt)
  {
    MenuItemCompatHoneycomb.setShowAsAction(paramMenuItem, paramInt);
    return true;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */