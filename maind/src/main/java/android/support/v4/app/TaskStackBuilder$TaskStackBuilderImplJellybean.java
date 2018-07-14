package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class TaskStackBuilder$TaskStackBuilderImplJellybean
  implements TaskStackBuilder.TaskStackBuilderImpl
{
  public PendingIntent getPendingIntent(Context paramContext, Intent[] paramArrayOfIntent, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    paramArrayOfIntent[0].addFlags(268468224);
    return TaskStackBuilderJellybean.getActivitiesPendingIntent(paramContext, paramInt1, paramArrayOfIntent, paramInt2, paramBundle);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/TaskStackBuilder$TaskStackBuilderImplJellybean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */