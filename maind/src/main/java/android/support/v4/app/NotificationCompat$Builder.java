package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;

public class NotificationCompat$Builder
{
  CharSequence mContentInfo;
  PendingIntent mContentIntent;
  CharSequence mContentText;
  CharSequence mContentTitle;
  Context mContext;
  PendingIntent mFullScreenIntent;
  Bitmap mLargeIcon;
  Notification mNotification;
  int mNumber;
  RemoteViews mTickerView;
  
  public NotificationCompat$Builder(Context paramContext)
  {
    Notification localNotification = new android/app/Notification;
    localNotification.<init>();
    this.mNotification = localNotification;
    this.mContext = paramContext;
    localNotification = this.mNotification;
    long l = System.currentTimeMillis();
    localNotification.when = l;
    this.mNotification.audioStreamType = -1;
  }
  
  private void setFlag(int paramInt, boolean paramBoolean)
  {
    Notification localNotification;
    int i;
    if (paramBoolean)
    {
      localNotification = this.mNotification;
      i = localNotification.flags | paramInt;
    }
    for (localNotification.flags = i;; localNotification.flags = i)
    {
      return;
      localNotification = this.mNotification;
      i = localNotification.flags;
      int j = paramInt ^ 0xFFFFFFFF;
      i &= j;
    }
  }
  
  public Notification getNotification()
  {
    return NotificationCompat.access$000().getNotification(this);
  }
  
  public Builder setAutoCancel(boolean paramBoolean)
  {
    setFlag(16, paramBoolean);
    return this;
  }
  
  public Builder setContent(RemoteViews paramRemoteViews)
  {
    this.mNotification.contentView = paramRemoteViews;
    return this;
  }
  
  public Builder setContentInfo(CharSequence paramCharSequence)
  {
    this.mContentInfo = paramCharSequence;
    return this;
  }
  
  public Builder setContentIntent(PendingIntent paramPendingIntent)
  {
    this.mContentIntent = paramPendingIntent;
    return this;
  }
  
  public Builder setContentText(CharSequence paramCharSequence)
  {
    this.mContentText = paramCharSequence;
    return this;
  }
  
  public Builder setContentTitle(CharSequence paramCharSequence)
  {
    this.mContentTitle = paramCharSequence;
    return this;
  }
  
  public Builder setDefaults(int paramInt)
  {
    Notification localNotification = this.mNotification;
    localNotification.defaults = paramInt;
    int i = paramInt & 0x4;
    if (i != 0)
    {
      localNotification = this.mNotification;
      int j = localNotification.flags | 0x1;
      localNotification.flags = j;
    }
    return this;
  }
  
  public Builder setDeleteIntent(PendingIntent paramPendingIntent)
  {
    this.mNotification.deleteIntent = paramPendingIntent;
    return this;
  }
  
  public Builder setFullScreenIntent(PendingIntent paramPendingIntent, boolean paramBoolean)
  {
    this.mFullScreenIntent = paramPendingIntent;
    setFlag(128, paramBoolean);
    return this;
  }
  
  public Builder setLargeIcon(Bitmap paramBitmap)
  {
    this.mLargeIcon = paramBitmap;
    return this;
  }
  
  public Builder setLights(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    this.mNotification.ledARGB = paramInt1;
    this.mNotification.ledOnMS = paramInt2;
    this.mNotification.ledOffMS = paramInt3;
    Notification localNotification1 = this.mNotification;
    int j = localNotification1.ledOnMS;
    int k;
    int m;
    if (j != 0)
    {
      localNotification1 = this.mNotification;
      j = localNotification1.ledOffMS;
      if (j != 0)
      {
        k = i;
        localNotification1 = this.mNotification;
        Notification localNotification2 = this.mNotification;
        m = localNotification2.flags & 0xFFFFFFFE;
        if (k == 0) {
          break label116;
        }
      }
    }
    for (;;)
    {
      i |= m;
      localNotification1.flags = i;
      return this;
      k = 0;
      break;
      label116:
      i = 0;
    }
  }
  
  public Builder setNumber(int paramInt)
  {
    this.mNumber = paramInt;
    return this;
  }
  
  public Builder setOngoing(boolean paramBoolean)
  {
    setFlag(2, paramBoolean);
    return this;
  }
  
  public Builder setOnlyAlertOnce(boolean paramBoolean)
  {
    setFlag(8, paramBoolean);
    return this;
  }
  
  public Builder setSmallIcon(int paramInt)
  {
    this.mNotification.icon = paramInt;
    return this;
  }
  
  public Builder setSmallIcon(int paramInt1, int paramInt2)
  {
    this.mNotification.icon = paramInt1;
    this.mNotification.iconLevel = paramInt2;
    return this;
  }
  
  public Builder setSound(Uri paramUri)
  {
    this.mNotification.sound = paramUri;
    this.mNotification.audioStreamType = -1;
    return this;
  }
  
  public Builder setSound(Uri paramUri, int paramInt)
  {
    this.mNotification.sound = paramUri;
    this.mNotification.audioStreamType = paramInt;
    return this;
  }
  
  public Builder setTicker(CharSequence paramCharSequence)
  {
    this.mNotification.tickerText = paramCharSequence;
    return this;
  }
  
  public Builder setTicker(CharSequence paramCharSequence, RemoteViews paramRemoteViews)
  {
    this.mNotification.tickerText = paramCharSequence;
    this.mTickerView = paramRemoteViews;
    return this;
  }
  
  public Builder setVibrate(long[] paramArrayOfLong)
  {
    this.mNotification.vibrate = paramArrayOfLong;
    return this;
  }
  
  public Builder setWhen(long paramLong)
  {
    this.mNotification.when = paramLong;
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/NotificationCompat$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */