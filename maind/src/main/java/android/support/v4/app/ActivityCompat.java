package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;

public class ActivityCompat
  extends ContextCompat
{
  public static boolean invalidateOptionsMenu(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int k = 11;
    if (i >= k) {
      ActivityCompatHoneycomb.invalidateOptionsMenu(paramActivity);
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ActivityCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */