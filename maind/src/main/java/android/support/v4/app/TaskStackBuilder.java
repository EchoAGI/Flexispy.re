package android.support.v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskStackBuilder
  implements Iterable
{
  private static final TaskStackBuilder.TaskStackBuilderImpl IMPL;
  private static final String TAG = "TaskStackBuilder";
  private final ArrayList mIntents;
  private final Context mSourceContext;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;
      ((TaskStackBuilder.TaskStackBuilderImplHoneycomb)localObject).<init>();
    }
    for (IMPL = (TaskStackBuilder.TaskStackBuilderImpl)localObject;; IMPL = (TaskStackBuilder.TaskStackBuilderImpl)localObject)
    {
      return;
      localObject = new android/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;
      ((TaskStackBuilder.TaskStackBuilderImplBase)localObject).<init>();
    }
  }
  
  private TaskStackBuilder(Context paramContext)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mIntents = localArrayList;
    this.mSourceContext = paramContext;
  }
  
  public static TaskStackBuilder create(Context paramContext)
  {
    TaskStackBuilder localTaskStackBuilder = new android/support/v4/app/TaskStackBuilder;
    localTaskStackBuilder.<init>(paramContext);
    return localTaskStackBuilder;
  }
  
  public static TaskStackBuilder from(Context paramContext)
  {
    return create(paramContext);
  }
  
  public TaskStackBuilder addNextIntent(Intent paramIntent)
  {
    this.mIntents.add(paramIntent);
    return this;
  }
  
  public TaskStackBuilder addParentStack(Activity paramActivity)
  {
    Object localObject = this.mIntents;
    int i = ((ArrayList)localObject).size();
    Intent localIntent = NavUtils.getParentActivityIntent(paramActivity);
    while (localIntent != null)
    {
      localObject = this.mIntents;
      ((ArrayList)localObject).add(i, localIntent);
      try
      {
        localObject = localIntent.getComponent();
        localIntent = NavUtils.getParentActivityIntent(paramActivity, (ComponentName)localObject);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>(localNameNotFoundException);
        throw ((Throwable)localObject);
      }
    }
    return this;
  }
  
  public TaskStackBuilder addParentStack(Class paramClass)
  {
    Object localObject = this.mIntents;
    int i = ((ArrayList)localObject).size();
    try
    {
      localObject = this.mSourceContext;
      ComponentName localComponentName;
      for (Intent localIntent = NavUtils.getParentActivityIntent((Context)localObject, paramClass); localIntent != null; localIntent = NavUtils.getParentActivityIntent((Context)localObject, localComponentName))
      {
        localObject = this.mIntents;
        ((ArrayList)localObject).add(i, localIntent);
        localObject = this.mSourceContext;
        localComponentName = localIntent.getComponent();
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>(localNameNotFoundException);
      throw ((Throwable)localObject);
    }
  }
  
  public Intent editIntentAt(int paramInt)
  {
    return (Intent)this.mIntents.get(paramInt);
  }
  
  public Intent getIntent(int paramInt)
  {
    return editIntentAt(paramInt);
  }
  
  public int getIntentCount()
  {
    return this.mIntents.size();
  }
  
  public Intent[] getIntents()
  {
    ArrayList localArrayList = this.mIntents;
    Intent[] arrayOfIntent = new Intent[this.mIntents.size()];
    return (Intent[])localArrayList.toArray(arrayOfIntent);
  }
  
  public PendingIntent getPendingIntent(int paramInt1, int paramInt2)
  {
    return getPendingIntent(paramInt1, paramInt2, null);
  }
  
  public PendingIntent getPendingIntent(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    Object localObject1 = this.mIntents;
    boolean bool = ((ArrayList)localObject1).isEmpty();
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("No intents added to TaskStackBuilder; cannot getPendingIntent");
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mIntents;
    Object localObject2 = new Intent[this.mIntents.size()];
    Intent[] arrayOfIntent = (Intent[])((ArrayList)localObject1).toArray((Object[])localObject2);
    arrayOfIntent[0].addFlags(268484608);
    localObject1 = IMPL;
    localObject2 = this.mSourceContext;
    return ((TaskStackBuilder.TaskStackBuilderImpl)localObject1).getPendingIntent((Context)localObject2, arrayOfIntent, paramInt1, paramInt2, paramBundle);
  }
  
  public Iterator iterator()
  {
    return this.mIntents.iterator();
  }
  
  public void startActivities()
  {
    startActivities(null);
  }
  
  public void startActivities(Bundle paramBundle)
  {
    Object localObject = this.mIntents;
    boolean bool = ((ArrayList)localObject).isEmpty();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No intents added to TaskStackBuilder; cannot startActivities");
      throw ((Throwable)localObject);
    }
    localObject = this.mIntents;
    Intent[] arrayOfIntent1 = new Intent[this.mIntents.size()];
    Intent[] arrayOfIntent2 = (Intent[])((ArrayList)localObject).toArray(arrayOfIntent1);
    localObject = arrayOfIntent2[0];
    int j = 268484608;
    ((Intent)localObject).addFlags(j);
    localObject = this.mSourceContext;
    bool = ContextCompat.startActivities((Context)localObject, arrayOfIntent2, paramBundle);
    if (!bool)
    {
      int i = arrayOfIntent2.length + -1;
      Intent localIntent = arrayOfIntent2[i];
      i = 268435456;
      localIntent.addFlags(i);
      localObject = this.mSourceContext;
      ((Context)localObject).startActivity(localIntent);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/TaskStackBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */