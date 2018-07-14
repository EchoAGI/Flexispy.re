package com.vvt.capture.e.a;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.d;
import com.vvt.im.events.info.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
  extends b
{
  private int c = 0;
  private String d = "";
  private String e = "";
  private boolean f = false;
  private boolean g;
  private List h;
  private d i;
  private com.vvt.im.events.info.c j;
  private f k;
  private com.vvt.im.events.info.b l;
  private List m;
  
  public c()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.m = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.h = ((List)localObject);
    localObject = new com/vvt/im/events/info/d;
    ((d)localObject).<init>();
    a((d)localObject);
    localObject = new com/vvt/im/events/info/c;
    ((com.vvt.im.events.info.c)localObject).<init>();
    a((com.vvt.im.events.info.c)localObject);
    localObject = new com/vvt/im/events/info/f;
    ((f)localObject).<init>();
    this.k = ((f)localObject);
    localObject = new com/vvt/im/events/info/b;
    ((com.vvt.im.events.info.b)localObject).<init>();
    this.l = ((com.vvt.im.events.info.b)localObject);
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(com.vvt.im.events.info.b paramb)
  {
    this.l = paramb;
  }
  
  public void a(com.vvt.im.events.info.c paramc)
  {
    this.j = paramc;
  }
  
  public void a(d paramd)
  {
    this.i = paramd;
  }
  
  public void a(f paramf)
  {
    this.k = paramf;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(List paramList)
  {
    this.m = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(List paramList)
  {
    this.h = paramList;
  }
  
  public List c()
  {
    return this.m;
  }
  
  public List d()
  {
    return this.h;
  }
  
  public d e()
  {
    return this.i;
  }
  
  public com.vvt.im.events.info.c f()
  {
    return this.j;
  }
  
  public f g()
  {
    return this.k;
  }
  
  public com.vvt.im.events.info.b j()
  {
    return this.l;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("textRepresentation: ");
    int n = this.c;
    localStringBuilder.append(n);
    localStringBuilder.append("\ntime: ");
    long l1 = this.a;
    localStringBuilder.append(l1);
    localStringBuilder.append("\ndata: ");
    Object localObject = this.d;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\ndirection: ");
    localObject = this.b;
    localStringBuilder.append(localObject);
    localStringBuilder.append("\ndateTime: ");
    localObject = this.e;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\nisGroupChat: ");
    boolean bool1 = this.f;
    localStringBuilder.append(bool1);
    localStringBuilder.append("\nisHasMedia: ");
    bool1 = this.g;
    localStringBuilder.append(bool1);
    localStringBuilder.append("\nparticipants: ");
    int i1 = this.h.size();
    localStringBuilder.append(i1);
    localStringBuilder.append("\nownerData: ");
    localObject = this.i.toString();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\nshareLocationData: ");
    localObject = this.j.toString();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\nsenderInfo: ");
    localObject = this.k.toString();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\nconversationInfo: ");
    localObject = this.l.toString();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\nattachments: ");
    localObject = this.m;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (a)localIterator.next();
      String str = "\n";
      localStringBuilder.append(str);
      localObject = ((a)localObject).toString();
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */