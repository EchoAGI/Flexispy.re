package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

class NavUtilsJB
{
  public static Intent getParentActivityIntent(Activity paramActivity)
  {
    return paramActivity.getParentActivityIntent();
  }
  
  public static String getParentActivityName(ActivityInfo paramActivityInfo)
  {
    return paramActivityInfo.parentActivityName;
  }
  
  public static void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    paramActivity.navigateUpTo(paramIntent);
  }
  
  public static boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    return paramActivity.shouldUpRecreateTask(paramIntent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NavUtilsJB.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */