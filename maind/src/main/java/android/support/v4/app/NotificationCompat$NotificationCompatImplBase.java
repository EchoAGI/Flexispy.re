package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

class NotificationCompat$NotificationCompatImplBase
  implements NotificationCompat.NotificationCompatImpl
{
  public Notification getNotification(NotificationCompat.Builder paramBuilder)
  {
    Notification localNotification = paramBuilder.mNotification;
    Context localContext = paramBuilder.mContext;
    CharSequence localCharSequence1 = paramBuilder.mContentTitle;
    CharSequence localCharSequence2 = paramBuilder.mContentText;
    PendingIntent localPendingIntent = paramBuilder.mContentIntent;
    localNotification.setLatestEventInfo(localContext, localCharSequence1, localCharSequence2, localPendingIntent);
    return localNotification;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NotificationCompat$NotificationCompatImplBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */