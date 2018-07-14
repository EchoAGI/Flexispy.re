package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class TaskStackBuilder$TaskStackBuilderImplHoneycomb
  implements TaskStackBuilder.TaskStackBuilderImpl
{
  public PendingIntent getPendingIntent(Context paramContext, Intent[] paramArrayOfIntent, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    paramArrayOfIntent[0].addFlags(268468224);
    return TaskStackBuilderHoneycomb.getActivitiesPendingIntent(paramContext, paramInt1, paramArrayOfIntent, paramInt2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */