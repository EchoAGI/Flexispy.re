package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

public class ContextCompat
{
  public static boolean startActivities(Context paramContext, Intent[] paramArrayOfIntent)
  {
    return startActivities(paramContext, paramArrayOfIntent, null);
  }
  
  public static boolean startActivities(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    boolean bool = true;
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {
      ContextCompatJellybean.startActivities(paramContext, paramArrayOfIntent, paramBundle);
    }
    for (;;)
    {
      return bool;
      j = 11;
      if (i >= j) {
        ContextCompatHoneycomb.startActivities(paramContext, paramArrayOfIntent);
      } else {
        bool = false;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/ContextCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */