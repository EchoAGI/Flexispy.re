package com.krecorder.call.callrecorder;

import android.os.Handler;
import android.os.Looper;
import com.krecorder.call.recording.MediaFormat;
import com.krecorder.encoder.AACEncoder;
import com.krecorder.encoder.AMREncoder;
import com.krecorder.encoder.AMREncoder.Mode;
import com.krecorder.encoder.AudioEncoderBase;
import com.krecorder.encoder.LameEncoder;
import com.krecorder.encoder.WavEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class p
  implements Runnable
{
  p(o paramo) {}
  
  public void run()
  {
    int i = 1;
    Object localObject1 = this.a;
    ??? = o.a(this.a);
    o.a((o)localObject1, (String)???, i);
    localObject1 = this.a;
    boolean bool1 = ((o)localObject1).a();
    if (!bool1)
    {
      localObject1 = this.a;
      ((o)localObject1).a(i);
    }
    for (;;)
    {
      return;
      localObject1 = this.a;
      bool1 = o.b((o)localObject1);
      int j;
      if (!bool1)
      {
        localObject1 = this.a;
        j = o.c((o)localObject1);
        if (j <= 0) {}
      }
      try
      {
        localObject1 = this.a;
        j = o.c((o)localObject1);
        long l1 = j;
        Thread.sleep(l1);
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject8;
        int m;
        Object localObject3;
        boolean bool3;
        Object localObject6;
        for (;;) {}
      }
      localObject1 = this.a;
      ??? = o.d(this.a).c();
      o.a((o)localObject1, (File)???);
      try
      {
        localObject1 = this.a;
        ??? = new java/io/FileOutputStream;
        localObject8 = this.a;
        localObject8 = o.e((o)localObject8);
        ((FileOutputStream)???).<init>((File)localObject8);
        o.a((o)localObject1, (FileOutputStream)???);
        localObject1 = o.f(this.a);
        if (localObject1 != null) {
          break label382;
        }
        boolean bool2 = o.g();
        if (bool2) {}
        try
        {
          localObject1 = s.a;
          ??? = this.a;
          ??? = o.d((o)???);
          ??? = ((j)???).b();
          m = ((MediaFormat)???).ordinal();
          int k = localObject1[m];
          switch (k)
          {
          default: 
            localObject1 = new java/lang/Exception;
            ??? = "Unknown media format";
            ((Exception)localObject1).<init>((String)???);
            throw ((Throwable)localObject1);
          }
        }
        catch (Exception localException1)
        {
          ??? = this.a;
          Object localObject2 = localException1.getMessage();
          o.a((o)???, (String)localObject2);
          localObject2 = this.a;
          ((o)localObject2).a(i);
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        ??? = this.a;
        localObject3 = localFileNotFoundException.getMessage();
        o.a((o)???, (String)localObject3);
        localObject3 = this.a;
        ((o)localObject3).a(i);
      }
      continue;
      bool3 = o.g();
      if (bool3) {}
      localObject3 = this.a;
      ??? = new com/krecorder/encoder/LameEncoder;
      ((LameEncoder)???).<init>();
      o.a((o)localObject3, (AudioEncoderBase)???);
      localObject3 = this.a;
      localObject3 = o.f((o)localObject3);
      m = 128;
      ((AudioEncoderBase)localObject3).setBitRate(m);
      localObject3 = this.a;
      localObject3 = o.f((o)localObject3);
      ((AudioEncoderBase)localObject3).init();
      for (;;)
      {
        label382:
        localObject3 = this.a;
        ??? = new com/krecorder/call/callrecorder/u;
        localObject8 = this.a;
        Object localObject9 = "RecordBuffering";
        int n = -16;
        ((u)???).<init>((o)localObject8, (String)localObject9, n);
        o.a((o)localObject3, (u)???);
        localObject3 = o.h(this.a);
        ((u)localObject3).start();
        try
        {
          localObject3 = this.a;
          ??? = new com/krecorder/call/callrecorder/t;
          localObject8 = this.a;
          localObject9 = this.a;
          localObject9 = o.h((o)localObject9);
          localObject9 = ((u)localObject9).getLooper();
          ((t)???).<init>((o)localObject8, (Looper)localObject9);
          o.a((o)localObject3, (t)???);
          try
          {
            localObject3 = this.a;
            localObject3 = o.j((o)localObject3);
            ??? = this.a;
            ??? = o.i((o)???);
            ((e)localObject3).a((Handler)???);
            localObject3 = this.a;
            ??? = this.a;
            ??? = o.a((o)???);
            boolean bool4 = false;
            localObject8 = null;
            o.a((o)localObject3, (String)???, false);
            localObject3 = this.a;
            synchronized (o.k((o)localObject3))
            {
              localObject3 = this.a;
              localObject3 = o.k((o)localObject3);
              long l2 = 5000L;
              localObject3.wait(l2);
              localObject3 = this.a;
              bool3 = o.l((o)localObject3);
              if (bool3) {
                break label953;
              }
              localObject3 = this.a;
              bool4 = true;
              o.a((o)localObject3, bool4);
              localObject3 = new java/lang/Exception;
              localObject8 = "Audio was never read after a timeout and seems to be in limbo";
              ((Exception)localObject3).<init>((String)localObject8);
              throw ((Throwable)localObject3);
            }
          }
          catch (Exception localException2)
          {
            ??? = this.a;
            localObject5 = localException2.getMessage();
            o.a((o)???, (String)localObject5);
            localObject5 = this.a;
            ((o)localObject5).a(i);
          }
          bool3 = o.g();
          if (bool3) {}
          localObject5 = this.a;
          ??? = new com/krecorder/encoder/AACEncoder;
          ((AACEncoder)???).<init>();
          o.a((o)localObject5, (AudioEncoderBase)???);
          localObject5 = this.a;
          localObject5 = o.f((o)localObject5);
          m = 2;
          ((AudioEncoderBase)localObject5).setProfile(m);
          localObject5 = this.a;
          localObject5 = o.f((o)localObject5);
          m = 128000;
          ((AudioEncoderBase)localObject5).setBitRate(m);
          localObject5 = this.a;
          localObject5 = o.f((o)localObject5);
          m = 1;
          ((AudioEncoderBase)localObject5).setVariableBitRate(m);
          localObject5 = this.a;
          localObject5 = o.f((o)localObject5);
          ((AudioEncoderBase)localObject5).init();
        }
        catch (Exception localException3)
        {
          Object localObject5;
          ??? = this.a;
          localObject6 = localException3.getMessage();
          o.a((o)???, (String)localObject6);
          localObject6 = this.a;
          ((o)localObject6).a(i);
        }
        bool3 = o.g();
        if (bool3) {}
        localObject5 = this.a;
        ??? = new com/krecorder/encoder/WavEncoder;
        localObject8 = this.a;
        localObject8 = o.g((o)localObject8);
        localObject9 = this.a;
        localObject9 = o.d((o)localObject9);
        localObject9 = ((j)localObject9).c();
        ((WavEncoder)???).<init>((FileOutputStream)localObject8, (File)localObject9);
        o.a((o)localObject5, (AudioEncoderBase)???);
        localObject5 = this.a;
        localObject5 = o.f((o)localObject5);
        ((AudioEncoderBase)localObject5).init();
        continue;
        bool3 = o.g();
        if (bool3) {}
        localObject5 = this.a;
        ??? = new com/krecorder/encoder/AMREncoder;
        localObject8 = this.a;
        localObject8 = o.g((o)localObject8);
        ((AMREncoder)???).<init>((FileOutputStream)localObject8);
        o.a((o)localObject5, (AudioEncoderBase)???);
        localObject5 = this.a;
        localObject5 = o.f((o)localObject5);
        ??? = AMREncoder.Mode.MR122;
        m = ((AMREncoder.Mode)???).ordinal();
        ((AudioEncoderBase)localObject5).setProfile(m);
        localObject5 = this.a;
        localObject5 = o.f((o)localObject5);
        ((AudioEncoderBase)localObject5).init();
      }
      continue;
      label953:
      localObject6 = this.a;
      m = 0;
      ??? = null;
      ((o)localObject6).a(0);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */