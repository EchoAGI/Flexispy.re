package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class TaskStackBuilder$TaskStackBuilderImplBase
  implements TaskStackBuilder.TaskStackBuilderImpl
{
  public PendingIntent getPendingIntent(Context paramContext, Intent[] paramArrayOfIntent, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    int i = paramArrayOfIntent.length + -1;
    Intent localIntent = paramArrayOfIntent[i];
    localIntent.addFlags(268435456);
    return PendingIntent.getActivity(paramContext, paramInt1, localIntent, paramInt2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */