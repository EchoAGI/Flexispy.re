package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;

class ShareCompat$ShareCompatImplICS
  extends ShareCompat.ShareCompatImplBase
{
  public void configureMenuItem(MenuItem paramMenuItem, ShareCompat.IntentBuilder paramIntentBuilder)
  {
    Object localObject = paramIntentBuilder.getActivity();
    Intent localIntent = paramIntentBuilder.getIntent();
    ShareCompatICS.configureMenuItem(paramMenuItem, (Activity)localObject, localIntent);
    boolean bool = shouldAddChooserIntent(paramMenuItem);
    if (bool)
    {
      localObject = paramIntentBuilder.createChooserIntent();
      paramMenuItem.setIntent((Intent)localObject);
    }
  }
  
  boolean shouldAddChooserIntent(MenuItem paramMenuItem)
  {
    boolean bool = paramMenuItem.hasSubMenu();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ShareCompat$ShareCompatImplICS.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */