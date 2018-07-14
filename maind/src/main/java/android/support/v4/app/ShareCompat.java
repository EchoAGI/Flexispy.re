package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;

public class ShareCompat
{
  public static final String EXTRA_CALLING_ACTIVITY = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
  public static final String EXTRA_CALLING_PACKAGE = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
  private static ShareCompat.ShareCompatImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/app/ShareCompat$ShareCompatImplJB;
      ((ShareCompat.ShareCompatImplJB)localObject).<init>();
      IMPL = (ShareCompat.ShareCompatImpl)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i >= j)
      {
        localObject = new android/support/v4/app/ShareCompat$ShareCompatImplICS;
        ((ShareCompat.ShareCompatImplICS)localObject).<init>();
        IMPL = (ShareCompat.ShareCompatImpl)localObject;
      }
      else
      {
        localObject = new android/support/v4/app/ShareCompat$ShareCompatImplBase;
        ((ShareCompat.ShareCompatImplBase)localObject).<init>();
        IMPL = (ShareCompat.ShareCompatImpl)localObject;
      }
    }
  }
  
  public static void configureMenuItem(Menu paramMenu, int paramInt, ShareCompat.IntentBuilder paramIntentBuilder)
  {
    MenuItem localMenuItem = paramMenu.findItem(paramInt);
    if (localMenuItem == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Could not find menu item with id " + paramInt + " in the supplied menu";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    configureMenuItem(localMenuItem, paramIntentBuilder);
  }
  
  public static void configureMenuItem(MenuItem paramMenuItem, ShareCompat.IntentBuilder paramIntentBuilder)
  {
    IMPL.configureMenuItem(paramMenuItem, paramIntentBuilder);
  }
  
  public static ComponentName getCallingActivity(Activity paramActivity)
  {
    ComponentName localComponentName = paramActivity.getCallingActivity();
    if (localComponentName == null)
    {
      Intent localIntent = paramActivity.getIntent();
      String str = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
      localComponentName = (ComponentName)localIntent.getParcelableExtra(str);
    }
    return localComponentName;
  }
  
  public static String getCallingPackage(Activity paramActivity)
  {
    String str1 = paramActivity.getCallingPackage();
    if (str1 == null)
    {
      Intent localIntent = paramActivity.getIntent();
      String str2 = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
      str1 = localIntent.getStringExtra(str2);
    }
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ShareCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */