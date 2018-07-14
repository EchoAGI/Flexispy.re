package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

class ShareCompatICS
{
  private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";
  
  public static void configureMenuItem(MenuItem paramMenuItem, Activity paramActivity, Intent paramIntent)
  {
    ActionProvider localActionProvider = paramMenuItem.getActionProvider();
    Object localObject1 = null;
    boolean bool = localActionProvider instanceof ShareActionProvider;
    if (!bool)
    {
      localObject1 = new android/widget/ShareActionProvider;
      ((ShareActionProvider)localObject1).<init>(paramActivity);
    }
    for (;;)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(".sharecompat_");
      String str = paramActivity.getClass().getName();
      localObject2 = str;
      ((ShareActionProvider)localObject1).setShareHistoryFileName((String)localObject2);
      ((ShareActionProvider)localObject1).setShareIntent(paramIntent);
      paramMenuItem.setActionProvider((ActionProvider)localObject1);
      return;
      localObject1 = localActionProvider;
      localObject1 = (ShareActionProvider)localActionProvider;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ShareCompatICS.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */