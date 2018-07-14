package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;

class NotificationCompatHoneycomb
{
  static Notification add(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap)
  {
    Notification.Builder localBuilder = new android/app/Notification$Builder;
    localBuilder.<init>(paramContext);
    long l = paramNotification.when;
    localBuilder = localBuilder.setWhen(l);
    int i = paramNotification.icon;
    int j = paramNotification.iconLevel;
    localBuilder = localBuilder.setSmallIcon(i, j);
    Object localObject = paramNotification.contentView;
    localBuilder = localBuilder.setContent((RemoteViews)localObject);
    localObject = paramNotification.tickerText;
    localBuilder = localBuilder.setTicker((CharSequence)localObject, paramRemoteViews);
    localObject = paramNotification.sound;
    j = paramNotification.audioStreamType;
    localBuilder = localBuilder.setSound((Uri)localObject, j);
    localObject = paramNotification.vibrate;
    localBuilder = localBuilder.setVibrate((long[])localObject);
    i = paramNotification.ledARGB;
    j = paramNotification.ledOnMS;
    int k = paramNotification.ledOffMS;
    localObject = localBuilder.setLights(i, j, k);
    int m = paramNotification.flags & 0x2;
    label192:
    label218:
    int i2;
    if (m != 0)
    {
      m = 1;
      localObject = ((Notification.Builder)localObject).setOngoing(m);
      int n = paramNotification.flags & 0x8;
      if (n == 0) {
        break label325;
      }
      n = 1;
      localObject = ((Notification.Builder)localObject).setOnlyAlertOnce(n);
      int i1 = paramNotification.flags & 0x10;
      if (i1 == 0) {
        break label334;
      }
      i1 = 1;
      localBuilder = ((Notification.Builder)localObject).setAutoCancel(i1);
      i = paramNotification.defaults;
      localBuilder = localBuilder.setDefaults(i).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1);
      localObject = paramNotification.deleteIntent;
      localObject = localBuilder.setDeleteIntent((PendingIntent)localObject);
      i2 = paramNotification.flags & 0x80;
      if (i2 == 0) {
        break label343;
      }
      i2 = 1;
    }
    for (;;)
    {
      return ((Notification.Builder)localObject).setFullScreenIntent(paramPendingIntent2, i2).setLargeIcon(paramBitmap).setNumber(paramInt).getNotification();
      int i3 = 0;
      localBuilder = null;
      break;
      label325:
      i3 = 0;
      localBuilder = null;
      break label192;
      label334:
      i3 = 0;
      localBuilder = null;
      break label218;
      label343:
      i3 = 0;
      localBuilder = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NotificationCompatHoneycomb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */