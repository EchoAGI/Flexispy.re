package com.vvt.temporalcontrol.normal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vvt.ag.b;
import com.vvt.preference.PrefTemporalControl.TemporalControlInfo;
import com.vvt.temporalcontrol.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

class a
  implements Runnable
{
  a(NormalTaskScheduler paramNormalTaskScheduler) {}
  
  public void run()
  {
    int i = 0;
    Object localObject1 = null;
    AlarmManager localAlarmManager = (AlarmManager)NormalTaskScheduler.a(this.a).getSystemService("alarm");
    Object localObject3 = new android/content/IntentFilter;
    ((IntentFilter)localObject3).<init>("com.vvt.temporalcontrol.normal.TaskScheduledReceiver");
    Object localObject4 = NormalTaskScheduler.b(this.a);
    if (localObject4 == null)
    {
      localObject4 = this.a;
      ??? = new com/vvt/temporalcontrol/normal/NormalTaskScheduler$TaskScheduledReceiver;
      NormalTaskScheduler localNormalTaskScheduler = this.a;
      ((NormalTaskScheduler.TaskScheduledReceiver)???).<init>(localNormalTaskScheduler);
      NormalTaskScheduler.a((NormalTaskScheduler)localObject4, (NormalTaskScheduler.TaskScheduledReceiver)???);
    }
    localObject4 = NormalTaskScheduler.a(this.a);
    ??? = NormalTaskScheduler.b(this.a);
    ((Context)localObject4).registerReceiver((BroadcastReceiver)???, (IntentFilter)localObject3);
    localObject3 = this.a;
    synchronized (NormalTaskScheduler.c((NormalTaskScheduler)localObject3))
    {
      localObject3 = this.a;
      localObject3 = NormalTaskScheduler.c((NormalTaskScheduler)localObject3);
      int j = ((ArrayList)localObject3).size();
      int k = NormalTaskScheduler.e();
      if (k != 0) {}
      k = 0;
      localObject3 = null;
      int m = 0;
      localObject4 = null;
      while (k < j)
      {
        localObject1 = this.a;
        localObject1 = NormalTaskScheduler.c((NormalTaskScheduler)localObject1);
        localObject1 = ((ArrayList)localObject1).get(k);
        localObject1 = (PrefTemporalControl.TemporalControlInfo)localObject1;
        Object localObject6 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getTimeBegin();
        int n = f.a((String)localObject6);
        GregorianCalendar localGregorianCalendar = f.a(n);
        long l1 = localGregorianCalendar.getTimeInMillis();
        String str1 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getTimeEnd();
        boolean bool2 = b.a(str1);
        if (!bool2) {
          m = f.a(str1);
        }
        long l2 = System.currentTimeMillis();
        l2 = f.a(n, m, l2);
        long l3 = 0L;
        boolean bool1 = l2 < l3;
        if (bool1)
        {
          localObject6 = new android/content/Intent;
          String str2 = "com.vvt.temporalcontrol.normal.TaskScheduledReceiver";
          ((Intent)localObject6).<init>(str2);
          str2 = "id";
          ((Intent)localObject6).putExtra(str2, k);
          str2 = "duration";
          ((Intent)localObject6).putExtra(str2, l2);
          str1 = "temporal_info";
          ((Intent)localObject6).putExtra(str1, (Serializable)localObject1);
          localObject1 = this.a;
          localObject1 = NormalTaskScheduler.a((NormalTaskScheduler)localObject1);
          str1 = null;
          localObject1 = PendingIntent.getBroadcast((Context)localObject1, k, (Intent)localObject6, 0);
          bool1 = false;
          localObject6 = null;
          localAlarmManager.set(0, l1, (PendingIntent)localObject1);
          localObject6 = this.a;
          localObject6 = NormalTaskScheduler.d((NormalTaskScheduler)localObject6);
          ((ArrayList)localObject6).add(localObject1);
        }
        i = k + 1;
        k = i;
      }
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/normal/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */