package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

public class NavUtils
{
  private static final NavUtils.NavUtilsImpl IMPL;
  public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
  private static final String TAG = "NavUtils";
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/app/NavUtils$NavUtilsImplJB;
      ((NavUtils.NavUtilsImplJB)localObject).<init>();
    }
    for (IMPL = (NavUtils.NavUtilsImpl)localObject;; IMPL = (NavUtils.NavUtilsImpl)localObject)
    {
      return;
      localObject = new android/support/v4/app/NavUtils$NavUtilsImplBase;
      ((NavUtils.NavUtilsImplBase)localObject).<init>();
    }
  }
  
  public static Intent getParentActivityIntent(Activity paramActivity)
  {
    return IMPL.getParentActivityIntent(paramActivity);
  }
  
  public static Intent getParentActivityIntent(Context paramContext, ComponentName paramComponentName)
  {
    String str1 = getParentActivityName(paramContext, paramComponentName);
    if (str1 == null) {}
    String str2;
    for (Intent localIntent = null;; localIntent = localIntent.setClassName(str2, str1))
    {
      return localIntent;
      localIntent = new android/content/Intent;
      localIntent.<init>();
      str2 = paramComponentName.getPackageName();
    }
  }
  
  public static Intent getParentActivityIntent(Context paramContext, Class paramClass)
  {
    Object localObject = new android/content/ComponentName;
    ((ComponentName)localObject).<init>(paramContext, paramClass);
    String str = getParentActivityName(paramContext, (ComponentName)localObject);
    if (str == null) {}
    for (localObject = null;; localObject = ((Intent)localObject).setClassName(paramContext, str))
    {
      return (Intent)localObject;
      localObject = new android/content/Intent;
      ((Intent)localObject).<init>();
    }
  }
  
  public static String getParentActivityName(Activity paramActivity)
  {
    try
    {
      localObject = paramActivity.getComponentName();
      return getParentActivityName(paramActivity, (ComponentName)localObject);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>(localNameNotFoundException);
      throw ((Throwable)localObject);
    }
  }
  
  public static String getParentActivityName(Context paramContext, ComponentName paramComponentName)
  {
    ActivityInfo localActivityInfo = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    return IMPL.getParentActivityName(paramContext, localActivityInfo);
  }
  
  public static void navigateUpFromSameTask(Activity paramActivity)
  {
    Intent localIntent = getParentActivityIntent(paramActivity);
    if (localIntent == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Activity ");
      String str = paramActivity.getClass().getSimpleName();
      localObject = str + " does not have a parent activity name specified." + " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> " + " element in your manifest?)";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    navigateUpTo(paramActivity, localIntent);
  }
  
  public static void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    IMPL.navigateUpTo(paramActivity, paramIntent);
  }
  
  public static boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    return IMPL.shouldUpRecreateTask(paramActivity, paramIntent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NavUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */