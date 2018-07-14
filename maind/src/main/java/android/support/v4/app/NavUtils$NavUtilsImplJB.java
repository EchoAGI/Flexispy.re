package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

class NavUtils$NavUtilsImplJB
  extends NavUtils.NavUtilsImplBase
{
  public Intent getParentActivityIntent(Activity paramActivity)
  {
    Intent localIntent = NavUtilsJB.getParentActivityIntent(paramActivity);
    if (localIntent == null) {
      localIntent = super.getParentActivityIntent(paramActivity);
    }
    return localIntent;
  }
  
  public String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str = NavUtilsJB.getParentActivityName(paramActivityInfo);
    if (str == null) {
      str = super.getParentActivityName(paramContext, paramActivityInfo);
    }
    return str;
  }
  
  public void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    NavUtilsJB.navigateUpTo(paramActivity, paramIntent);
  }
  
  public boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    return NavUtilsJB.shouldUpRecreateTask(paramActivity, paramIntent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NavUtils$NavUtilsImplJB.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */