package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

class NotificationCompat$NotificationCompatImplHoneycomb
  implements NotificationCompat.NotificationCompatImpl
{
  public Notification getNotification(NotificationCompat.Builder paramBuilder)
  {
    Context localContext = paramBuilder.mContext;
    Notification localNotification = paramBuilder.mNotification;
    CharSequence localCharSequence1 = paramBuilder.mContentTitle;
    CharSequence localCharSequence2 = paramBuilder.mContentText;
    CharSequence localCharSequence3 = paramBuilder.mContentInfo;
    RemoteViews localRemoteViews = paramBuilder.mTickerView;
    int i = paramBuilder.mNumber;
    PendingIntent localPendingIntent1 = paramBuilder.mContentIntent;
    PendingIntent localPendingIntent2 = paramBuilder.mFullScreenIntent;
    Bitmap localBitmap = paramBuilder.mLargeIcon;
    return NotificationCompatHoneycomb.add(localContext, localNotification, localCharSequence1, localCharSequence2, localCharSequence3, localRemoteViews, i, localPendingIntent1, localPendingIntent2, localBitmap);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */