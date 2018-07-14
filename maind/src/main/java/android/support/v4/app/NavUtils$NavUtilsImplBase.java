package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

class NavUtils$NavUtilsImplBase
  implements NavUtils.NavUtilsImpl
{
  public Intent getParentActivityIntent(Activity paramActivity)
  {
    String str = NavUtils.getParentActivityName(paramActivity);
    if (str == null) {}
    for (Intent localIntent = null;; localIntent = localIntent.setClassName(paramActivity, str))
    {
      return localIntent;
      localIntent = new android/content/Intent;
      localIntent.<init>();
    }
  }
  
  public String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
  {
    int i = 0;
    StringBuilder localStringBuilder = null;
    Object localObject = paramActivityInfo.metaData;
    String str1;
    if (localObject == null) {
      str1 = null;
    }
    for (;;)
    {
      return str1;
      localObject = paramActivityInfo.metaData;
      String str2 = "android.support.PARENT_ACTIVITY";
      str1 = ((Bundle)localObject).getString(str2);
      if (str1 == null)
      {
        str1 = null;
      }
      else
      {
        localStringBuilder = null;
        i = str1.charAt(0);
        int j = 46;
        if (i == j)
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject = paramContext.getPackageName();
          localStringBuilder = localStringBuilder.append((String)localObject).append(str1);
          str1 = localStringBuilder.toString();
        }
      }
    }
  }
  
  public void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.addFlags(67108864);
    paramActivity.startActivity(paramIntent);
    paramActivity.finish();
  }
  
  public boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    Object localObject = paramActivity.getIntent();
    String str = ((Intent)localObject).getAction();
    boolean bool;
    if (str != null)
    {
      localObject = "android.intent.action.MAIN";
      bool = str.equals(localObject);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NavUtils$NavUtilsImplBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */