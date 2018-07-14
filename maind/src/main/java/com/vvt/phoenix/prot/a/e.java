package com.vvt.phoenix.prot.a;

import com.vvt.ag.b;
import com.vvt.phoenix.prot.command.ac;
import com.vvt.phoenix.prot.command.ad;
import com.vvt.phoenix.prot.command.ae;
import com.vvt.phoenix.prot.command.af;
import com.vvt.phoenix.prot.command.ag;
import com.vvt.phoenix.prot.command.ah;
import com.vvt.phoenix.prot.command.ai;
import com.vvt.phoenix.prot.command.data.Criteria;
import com.vvt.phoenix.prot.command.data.Criteria.Recurrence;
import com.vvt.phoenix.prot.command.data.InstalledApplication;
import com.vvt.phoenix.prot.command.data.InstalledApplication.ApplicationType;
import com.vvt.phoenix.prot.command.data.Note;
import com.vvt.phoenix.prot.command.data.TemporalControl;
import com.vvt.phoenix.prot.command.data.TemporalControl.Action;
import com.vvt.phoenix.prot.command.data.g;
import com.vvt.phoenix.prot.command.data.h;
import com.vvt.phoenix.prot.command.data.i;
import com.vvt.phoenix.prot.command.data.j;
import com.vvt.phoenix.prot.command.data.k;
import com.vvt.phoenix.prot.command.r;
import com.vvt.phoenix.prot.command.u;
import com.vvt.phoenix.prot.command.v;
import com.vvt.phoenix.prot.command.x;
import com.vvt.phoenix.prot.command.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class e
{
  private static final boolean a;
  
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
  
  public static byte[] a(ac paramac)
  {
    int i = 19;
    int j = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    for (;;)
    {
      try
      {
        int k = paramac.b();
        short s = (short)k;
        Object localObject3 = com.vvt.phoenix.a.a.a(s);
        m = 0;
        localObject4 = null;
        n = 2;
        localByteArrayOutputStream.write((byte[])localObject3, 0, n);
        if (j >= k) {
          break;
        }
        localObject3 = paramac.a(j);
        localObject4 = ((InstalledApplication)localObject3).a();
        com.vvt.phoenix.a.d.a((String)localObject4, localByteArrayOutputStream);
        localObject4 = ((InstalledApplication)localObject3).b();
        com.vvt.phoenix.a.d.a((String)localObject4, localByteArrayOutputStream);
        localObject4 = ((InstalledApplication)localObject3).c();
        com.vvt.phoenix.a.d.a((String)localObject4, localByteArrayOutputStream);
        localObject4 = ((InstalledApplication)localObject3).d();
        if (localObject4 != null)
        {
          n = ((String)localObject4).length();
          if (n == i)
          {
            localObject4 = com.vvt.phoenix.a.a.a((String)localObject4);
            n = 0;
            i1 = 19;
            localByteArrayOutputStream.write((byte[])localObject4, 0, i1);
            m = ((InstalledApplication)localObject3).e();
            localObject4 = com.vvt.phoenix.a.a.a(m);
            n = 0;
            i1 = 4;
            localByteArrayOutputStream.write((byte[])localObject4, 0, i1);
            m = (byte)((InstalledApplication)localObject3).f();
            localByteArrayOutputStream.write(m);
            localObject4 = ((InstalledApplication)localObject3).g();
            if (localObject4 == null) {
              break label345;
            }
            n = localObject4.length;
            byte[] arrayOfByte = com.vvt.phoenix.a.a.a(n);
            int i2 = 4;
            localByteArrayOutputStream.write(arrayOfByte, 0, i2);
            i1 = 0;
            arrayOfByte = null;
            localByteArrayOutputStream.write((byte[])localObject4, 0, n);
            localObject3 = ((InstalledApplication)localObject3).h();
            s = (byte)((InstalledApplication.ApplicationType)localObject3).getValue();
            localByteArrayOutputStream.write(s);
            j += 1;
            continue;
          }
          com.vvt.io.d.a(localByteArrayOutputStream);
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          str = "installed date field length is invalid: 19 String length is expected.";
          localIllegalArgumentException.<init>(str);
          throw localIllegalArgumentException;
        }
      }
      finally
      {
        com.vvt.io.d.a(localByteArrayOutputStream);
      }
      com.vvt.io.d.a(localByteArrayOutputStream);
      localObject2 = new java/lang/IllegalArgumentException;
      String str = "installed date field is empty";
      ((IllegalArgumentException)localObject2).<init>(str);
      throw ((Throwable)localObject2);
      label345:
      int m = 4;
      Object localObject4 = new byte[m];
      Object tmp356_354 = localObject4;
      Object tmp357_356 = tmp356_354;
      Object tmp357_356 = tmp356_354;
      tmp357_356[0] = 0;
      tmp357_356[1] = 0;
      tmp357_356[2] = 0;
      tmp357_356[3] = 0;
      int n = 0;
      int i1 = 4;
      localByteArrayOutputStream.write((byte[])localObject4, 0, i1);
    }
    Object localObject2 = localByteArrayOutputStream.toByteArray();
    com.vvt.io.d.a(localByteArrayOutputStream);
    bool = a;
    if (bool) {}
    return (byte[])localObject2;
  }
  
  public static byte[] a(ad paramad)
  {
    return new byte[0];
  }
  
  public static byte[] a(ae paramae)
  {
    int i = 19;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      short s = (short)paramae.c();
      Object localObject1 = com.vvt.phoenix.a.a.a(s);
      localObject4 = null;
      int j = 2;
      localByteArrayOutputStream.write((byte[])localObject1, 0, j);
      localObject1 = paramae.b();
      localObject4 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject4).hasNext();
        if (!bool2) {
          break label344;
        }
        localObject1 = ((Iterator)localObject4).next();
        localObject1 = (Note)localObject1;
        Object localObject5 = ((Note)localObject1).a();
        com.vvt.phoenix.a.d.a((String)localObject5, localByteArrayOutputStream);
        localObject5 = ((Note)localObject1).b();
        if (localObject5 == null) {
          break label263;
        }
        int k = ((String)localObject5).length();
        if (k != i) {
          break;
        }
        localObject5 = com.vvt.phoenix.a.a.a((String)localObject5);
        k = 0;
        int m = localObject5.length;
        localByteArrayOutputStream.write((byte[])localObject5, 0, m);
        localObject5 = ((Note)localObject1).c();
        if (localObject5 == null) {
          break label317;
        }
        k = ((String)localObject5).length();
        if (k != i) {
          break label290;
        }
        localObject5 = com.vvt.phoenix.a.a.a((String)localObject5);
        k = 0;
        m = localObject5.length;
        localByteArrayOutputStream.write((byte[])localObject5, 0, m);
        localObject5 = ((Note)localObject1).d();
        com.vvt.phoenix.a.d.b((String)localObject5, localByteArrayOutputStream);
        localObject1 = ((Note)localObject1).e();
        com.vvt.phoenix.a.d.c((String)localObject1, localByteArrayOutputStream);
      }
      bool2 = a;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
    if (bool2) {}
    Object localObject3 = new java/lang/IllegalArgumentException;
    Object localObject4 = "Creation date time length is invalid: 19 String length is expected.";
    ((IllegalArgumentException)localObject3).<init>((String)localObject4);
    throw ((Throwable)localObject3);
    label263:
    boolean bool2 = a;
    if (bool2) {}
    localObject3 = new java/lang/IllegalArgumentException;
    localObject4 = "Creation date time is empty";
    ((IllegalArgumentException)localObject3).<init>((String)localObject4);
    throw ((Throwable)localObject3);
    label290:
    bool2 = a;
    if (bool2) {}
    localObject3 = new java/lang/IllegalArgumentException;
    localObject4 = "Last modified date time length is invalid: 19 String length is expected.";
    ((IllegalArgumentException)localObject3).<init>((String)localObject4);
    throw ((Throwable)localObject3);
    label317:
    bool2 = a;
    if (bool2) {}
    localObject3 = new java/lang/IllegalArgumentException;
    localObject4 = "Last modified date time is empty";
    ((IllegalArgumentException)localObject3).<init>((String)localObject4);
    throw ((Throwable)localObject3);
    label344:
    localObject3 = localByteArrayOutputStream.toByteArray();
    com.vvt.io.d.a(localByteArrayOutputStream);
    boolean bool3 = a;
    if (bool3) {}
    return (byte[])localObject3;
  }
  
  public static byte[] a(af paramaf)
  {
    int i = 0;
    byte[] arrayOfByte = null;
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      int j = paramaf.b();
      short s = (short)j;
      Object localObject2 = com.vvt.phoenix.a.a.a(s);
      int k = 0;
      String str = null;
      int m = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, m);
      while (i < j)
      {
        localObject2 = paramaf.a(i);
        k = (byte)((h)localObject2).a();
        localByteArrayOutputStream.write(k);
        str = ((h)localObject2).b();
        com.vvt.phoenix.a.d.a(str, localByteArrayOutputStream);
        localObject2 = ((h)localObject2).c();
        com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
        i += 1;
      }
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      bool = a;
      if (bool) {}
      return arrayOfByte;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
  }
  
  public static byte[] a(ag paramag)
  {
    int i = 0;
    byte[] arrayOfByte = null;
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      short s = (short)paramag.b();
      Object localObject2 = com.vvt.phoenix.a.a.a(s);
      int k = 0;
      int m = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, m);
      for (;;)
      {
        int j = paramag.b();
        if (i >= j) {
          break;
        }
        localObject2 = paramag.a(i);
        k = (byte)((g)localObject2).a();
        localByteArrayOutputStream.write(k);
        localObject2 = ((g)localObject2).b();
        com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
        i += 1;
      }
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      bool = a;
      if (bool) {}
      return arrayOfByte;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
  }
  
  public static byte[] a(ah paramah)
  {
    int i = 0;
    byte[] arrayOfByte = null;
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      int j = paramah.b();
      short s = (short)j;
      Object localObject2 = com.vvt.phoenix.a.a.a(s);
      int k = 0;
      Object localObject3 = null;
      int m = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, m);
      while (i < j)
      {
        localObject2 = paramah.a(i);
        localObject3 = ((k)localObject2).a();
        com.vvt.phoenix.a.d.a((String)localObject3, localByteArrayOutputStream);
        long l = ((k)localObject2).b();
        k = (int)l;
        localObject3 = com.vvt.phoenix.a.a.a(k);
        m = 0;
        int n = 4;
        localByteArrayOutputStream.write((byte[])localObject3, 0, n);
        localObject3 = ((k)localObject2).c();
        com.vvt.phoenix.a.d.b((String)localObject3, localByteArrayOutputStream);
        localObject3 = ((k)localObject2).d();
        com.vvt.phoenix.a.d.b((String)localObject3, localByteArrayOutputStream);
        localObject2 = ((k)localObject2).e();
        com.vvt.phoenix.a.d.b((String)localObject2, localByteArrayOutputStream);
        i += 1;
      }
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      bool = a;
      if (bool) {}
      return arrayOfByte;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
  }
  
  public static byte[] a(ai paramai)
  {
    short s1 = 0;
    Object localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      int k = paramai.b();
      int j = (short)k;
      Object localObject3 = com.vvt.phoenix.a.a.a(j);
      TemporalControl localTemporalControl = null;
      short s2 = 2;
      localByteArrayOutputStream.write((byte[])localObject3, 0, s2);
      j = 0;
      localObject3 = null;
      while (j < k)
      {
        localTemporalControl = paramai.a(j);
        Object localObject4 = localTemporalControl.a();
        s1 = (short)(byte)((TemporalControl.Action)localObject4).getValue();
        localObject1 = com.vvt.phoenix.a.a.a(s1);
        boolean bool3 = false;
        TemporalControl.Action localAction = null;
        int n = 1;
        localByteArrayOutputStream.write((byte[])localObject1, 0, n);
        localObject1 = localTemporalControl.b();
        long l1 = ((com.vvt.phoenix.prot.command.data.a)localObject1).a();
        byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(l1);
        int i1 = 4;
        localByteArrayOutputStream.write(arrayOfByte2, 0, i1);
        long l2 = 0L;
        bool3 = l1 < l2;
        int m;
        if (bool3)
        {
          localAction = TemporalControl.Action.RECORD_SCREENSHOT;
          if (localObject4 == localAction)
          {
            localObject1 = (i)localObject1;
            long l3 = ((i)localObject1).b();
            localObject1 = com.vvt.phoenix.a.a.a(l3);
            s2 = 0;
            localObject4 = null;
            m = 4;
            localByteArrayOutputStream.write((byte[])localObject1, 0, m);
          }
        }
        else
        {
          localObject1 = localTemporalControl.c();
          localObject4 = ((Criteria)localObject1).a();
          s2 = (short)(byte)((Criteria.Recurrence)localObject4).getValue();
          localObject4 = com.vvt.phoenix.a.a.a(s2);
          m = 0;
          localAction = null;
          n = 1;
          localByteArrayOutputStream.write((byte[])localObject4, 0, n);
          s2 = (short)(byte)((Criteria)localObject1).b();
          localObject4 = com.vvt.phoenix.a.a.a(s2);
          m = 0;
          localAction = null;
          n = 1;
          localByteArrayOutputStream.write((byte[])localObject4, 0, n);
          s2 = (short)(byte)((Criteria)localObject1).c();
          localObject4 = com.vvt.phoenix.a.a.a(s2);
          m = 0;
          localAction = null;
          n = 1;
          localByteArrayOutputStream.write((byte[])localObject4, 0, n);
          s2 = (short)(byte)((Criteria)localObject1).d();
          localObject4 = com.vvt.phoenix.a.a.a(s2);
          m = 0;
          localAction = null;
          n = 1;
          localByteArrayOutputStream.write((byte[])localObject4, 0, n);
          s1 = (short)(byte)((Criteria)localObject1).e();
          localObject1 = com.vvt.phoenix.a.a.a(s1);
          s2 = 0;
          localObject4 = null;
          m = 1;
          localByteArrayOutputStream.write((byte[])localObject1, 0, m);
          localObject1 = localTemporalControl.d();
          localObject1 = com.vvt.phoenix.a.a.a((String)localObject1);
          s2 = 0;
          localObject4 = null;
          m = 10;
          localByteArrayOutputStream.write((byte[])localObject1, 0, m);
          localObject1 = localTemporalControl.e();
          localObject1 = com.vvt.phoenix.a.a.a((String)localObject1);
          s2 = 0;
          localObject4 = null;
          m = 10;
          localByteArrayOutputStream.write((byte[])localObject1, 0, m);
          localObject1 = localTemporalControl.f();
          localObject1 = com.vvt.phoenix.a.a.a((String)localObject1);
          s2 = 0;
          localObject4 = null;
          m = 5;
          localByteArrayOutputStream.write((byte[])localObject1, 0, m);
          localObject1 = localTemporalControl.g();
          localObject1 = com.vvt.phoenix.a.a.a((String)localObject1);
          localTemporalControl = null;
          s2 = 5;
          localByteArrayOutputStream.write((byte[])localObject1, 0, s2);
          int i = j + 1;
          j = i;
          continue;
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = "Doesn't support this action: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).append(localObject4);
        localObject1 = ((StringBuilder)localObject1).toString();
        bool2 = a;
        if (bool2) {}
        localObject3 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
    byte[] arrayOfByte1 = localByteArrayOutputStream.toByteArray();
    com.vvt.io.d.a(localByteArrayOutputStream);
    boolean bool2 = a;
    if (bool2) {}
    return arrayOfByte1;
  }
  
  public static byte[] a(com.vvt.phoenix.prot.command.d paramd)
  {
    boolean bool1 = a;
    if (bool1) {}
    localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    bool1 = false;
    byte[] arrayOfByte = null;
    try
    {
      com.vvt.phoenix.prot.command.c localc = paramd.d();
      short s = (short)localc.a();
      Object localObject2 = com.vvt.phoenix.a.a.a(s);
      int j = 0;
      int k = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, k);
      s = (short)localc.b();
      localObject2 = com.vvt.phoenix.a.a.a(s);
      j = 0;
      k = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, k);
      localObject2 = localc.c();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      s = (short)localc.d();
      localObject2 = com.vvt.phoenix.a.a.a(s);
      j = 0;
      k = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, k);
      localObject2 = localc.e();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      localObject2 = localc.f();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      s = (byte)localc.g();
      localByteArrayOutputStream.write(s);
      localObject2 = localc.h();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      localObject2 = localc.i();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      localObject2 = localc.j();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      localObject2 = localc.k();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      localObject2 = localc.l();
      com.vvt.phoenix.a.d.a((String)localObject2, localByteArrayOutputStream);
      int i = localc.o();
      if (i > 0)
      {
        j = 100;
        if (i <= j) {}
      }
      else
      {
        i = 255;
      }
      i = (byte)i;
      localByteArrayOutputStream.write(i);
      i = (byte)paramd.a();
      localByteArrayOutputStream.write(i);
      i = (byte)localc.m();
      localByteArrayOutputStream.write(i);
      i = (byte)localc.n();
      localByteArrayOutputStream.write(i);
      i = paramd.b();
      localObject2 = com.vvt.phoenix.a.a.a(i);
      localc = null;
      j = 4;
      localByteArrayOutputStream.write((byte[])localObject2, 0, j);
      long l = paramd.c();
      i = (int)l;
      localObject2 = com.vvt.phoenix.a.a.a(i);
      localc = null;
      j = 4;
      localByteArrayOutputStream.write((byte[])localObject2, 0, j);
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      bool2 = a;
      if (!bool2) {}
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool2 = a;
        if (!bool2) {}
      }
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
    com.vvt.io.d.a(localByteArrayOutputStream);
    return arrayOfByte;
  }
  
  public static byte[] a(r paramr)
  {
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      Object localObject1 = paramr.b();
      com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
      localObject1 = paramr.c();
      com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
      localObject1 = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      boolean bool2 = a;
      if (bool2) {}
      return (byte[])localObject1;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
  }
  
  public static byte[] a(u paramu)
  {
    int i = 2;
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    byte[] arrayOfByte1 = paramu.b();
    if (arrayOfByte1 != null)
    {
      int j = arrayOfByte1.length;
      short s = (short)j;
      byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(s);
      localByteArrayOutputStream.write(arrayOfByte2, 0, i);
      localByteArrayOutputStream.write(arrayOfByte1, 0, j);
    }
    for (;;)
    {
      arrayOfByte1 = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      bool = a;
      if (bool) {}
      return arrayOfByte1;
      arrayOfByte1 = new byte[i];
      byte[] tmp91_89 = arrayOfByte1;
      tmp91_89[0] = 0;
      tmp91_89[1] = 0;
      localByteArrayOutputStream.write(arrayOfByte1, 0, i);
    }
  }
  
  public static byte[] a(v paramv)
  {
    int i = 255;
    int j = 0;
    String str1 = null;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      int k = paramv.b();
      short s = (short)k;
      byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(s);
      int m = 0;
      int n = 2;
      localByteArrayOutputStream.write(arrayOfByte2, 0, n);
      m = 0;
      if (m < k)
      {
        com.vvt.phoenix.prot.command.data.c localc = paramv.a(m);
        String str2 = localc.a();
        if (str2 != null)
        {
          arrayOfByte2 = com.vvt.phoenix.a.a.a(str2);
          j = arrayOfByte2.length;
          if (j > i)
          {
            j = 255;
            str1 = b.a(str2, j);
            arrayOfByte2 = com.vvt.phoenix.a.a.a(str1);
            j = arrayOfByte2.length;
          }
          int i1 = (byte)j;
          localByteArrayOutputStream.write(i1);
          i1 = 0;
          str2 = null;
          localByteArrayOutputStream.write(arrayOfByte2, 0, j);
        }
        for (;;)
        {
          str1 = localc.b();
          com.vvt.phoenix.a.d.b(str1, localByteArrayOutputStream);
          str1 = localc.c();
          com.vvt.phoenix.a.d.a(str1, localByteArrayOutputStream);
          j = m + 1;
          m = j;
          break;
          j = 0;
          str1 = null;
          localByteArrayOutputStream.write(0);
        }
      }
      arrayOfByte1 = localByteArrayOutputStream.toByteArray();
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
    byte[] arrayOfByte1;
    com.vvt.io.d.a(localByteArrayOutputStream);
    boolean bool2 = a;
    if (bool2) {}
    return arrayOfByte1;
  }
  
  public static byte[] a(x paramx)
  {
    return new byte[0];
  }
  
  public static byte[] a(z paramz)
  {
    int i = 0;
    byte[] arrayOfByte = null;
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      int j = paramz.b();
      short s = (short)j;
      Object localObject2 = com.vvt.phoenix.a.a.a(s);
      String str = null;
      int k = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, k);
      while (i < j)
      {
        localObject2 = paramz.a(i);
        str = ((j)localObject2).a();
        com.vvt.phoenix.a.d.b(str, localByteArrayOutputStream);
        localObject2 = ((j)localObject2).b();
        com.vvt.phoenix.a.d.b((String)localObject2, localByteArrayOutputStream);
        i += 1;
      }
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      bool = a;
      if (bool) {}
      return arrayOfByte;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */