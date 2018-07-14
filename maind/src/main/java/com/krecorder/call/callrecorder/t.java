package com.krecorder.call.callrecorder;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class t
  extends Handler
{
  public t(o paramo, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = 2;
    int j = -3;
    boolean bool1 = false;
    Object localObject1 = null;
    int k = 1;
    AudioRecord localAudioRecord = o.j(this.a).c();
    boolean bool2 = false;
    Object localObject2 = null;
    int m = 0;
    Object localObject7;
    if (!bool2)
    {
      localObject7 = o.j(this.a);
      if ((localObject7 != null) && (localAudioRecord != null)) {
        break label70;
      }
      bool2 = o.h();
      if (!bool2) {}
    }
    for (;;)
    {
      return;
      label70:
      int n;
      for (;;)
      {
        try
        {
          localObject7 = this.a;
          localObject7 = o.j((o)localObject7);
          if (localObject7 != null)
          {
            localObject7 = this.a;
            localObject7 = o.j((o)localObject7);
            boolean bool3 = ((e)localObject7).e();
            if (!bool3) {
              break;
            }
          }
          localObject7 = this.a;
          n = o.m((o)localObject7);
          int i2 = 3;
          if (n == i2)
          {
            bool2 = o.g();
            if (bool2) {}
            bool2 = k;
          }
          if (!bool2) {
            break label261;
          }
        }
        catch (Exception localException2)
        {
          o localo2;
          bool2 = o.h();
        }
        try
        {
          bool2 = o.g();
          if (bool2) {}
          localObject2 = this.a;
          localObject2 = o.d((o)localObject2);
          localo2 = this.a;
          k = o.n(localo2);
          ((j)localObject2).a(k);
          localObject2 = this.a;
          localObject2 = o.j((o)localObject2);
          ((e)localObject2).d();
        }
        catch (Exception localException3)
        {
          bool2 = o.h();
          if (!bool2) {
            continue;
          }
        }
      }
      localObject2 = this.a;
      ((o)localObject2).a(i);
      continue;
      if (bool2)
      {
        continue;
        label261:
        localObject7 = o.j(this.a);
        n = ((e)localObject7).b();
        Object localObject8 = new byte[n];
        n = localAudioRecord.read((byte[])localObject8, 0, n);
        ??? = this.a;
        boolean bool4 = o.o((o)???);
        if (bool4)
        {
          bool2 = o.g();
          if (!bool2) {}
        }
        else
        {
          ??? = this.a;
          bool4 = o.l((o)???);
          if (!bool4) {}
          synchronized (o.k(this.a))
          {
            boolean bool5 = o.g();
            if (bool5) {}
            Object localObject10 = this.a;
            boolean bool6 = true;
            o.b((o)localObject10, bool6);
            localObject10 = this.a;
            localObject10 = o.k((o)localObject10);
            localObject10.notify();
            if (m >= i) {
              break label516;
            }
            m += 1;
            if ((m != k) || (n != 0)) {
              break label503;
            }
          }
          try
          {
            localObject3 = this.a;
            localObject3 = o.j((o)localObject3);
            ((e)localObject3).d();
          }
          catch (Exception localException4)
          {
            for (;;)
            {
              Object localObject3;
              bool2 = o.h();
              if (!bool2) {}
            }
          }
          localObject3 = this.a;
          localObject1 = "PreRead(1) was 0 bytes";
          o.a((o)localObject3, (String)localObject1);
          localObject3 = this.a;
          ((o)localObject3).a(k);
          continue;
          localObject4 = finally;
          throw ((Throwable)localObject4);
          label503:
          int i1 = o.g();
          if (i1 == 0) {
            break;
          }
          break;
          label516:
          int i3 = -2;
          if ((i1 == i3) || (i1 == j))
          {
            Object localObject5 = "ERROR_BAD_VALUE";
            if (i1 == j) {
              localObject5 = "ERROR_INVALID_OPERATION";
            }
            try
            {
              localObject1 = this.a;
              localObject1 = o.j((o)localObject1);
              ((e)localObject1).d();
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                bool1 = o.h();
                if (!bool1) {}
              }
            }
            localObject1 = this.a;
            o.a((o)localObject1, (String)localObject5);
            localObject5 = this.a;
            ((o)localObject5).a(k);
            continue;
          }
          try
          {
            ??? = this.a;
            int i4 = o.m((o)???);
            if (i4 == k) {
              break;
            }
            ??? = this.a;
            o.a((o)???, (byte[])localObject8, i1);
            localObject8 = this.a;
            o.a((o)localObject8, i1);
          }
          catch (Exception localException5)
          {
            o localo1 = this.a;
            Object localObject6 = localException5.getMessage();
            o.a(localo1, (String)localObject6);
            localObject6 = this.a;
            ((o)localObject6).a(k);
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */