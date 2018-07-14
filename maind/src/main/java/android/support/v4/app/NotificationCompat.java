package android.support.v4.app;

import android.os.Build.VERSION;

public class NotificationCompat
{
  public static final int FLAG_HIGH_PRIORITY = 128;
  private static final NotificationCompat.NotificationCompatImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;
      ((NotificationCompat.NotificationCompatImplHoneycomb)localObject).<init>();
    }
    for (IMPL = (NotificationCompat.NotificationCompatImpl)localObject;; IMPL = (NotificationCompat.NotificationCompatImpl)localObject)
    {
      return;
      localObject = new android/support/v4/app/NotificationCompat$NotificationCompatImplBase;
      ((NotificationCompat.NotificationCompatImplBase)localObject).<init>();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NotificationCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */