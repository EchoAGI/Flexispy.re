package com.vvt.capture.c;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.b;
import com.vvt.im.events.info.c;
import com.vvt.im.events.info.d;
import com.vvt.im.events.info.f;
import java.util.ArrayList;
import java.util.List;

public class g
  extends e
{
  private int a = 0;
  private String b = "";
  private String c = "";
  private boolean d = false;
  private List e;
  private d f;
  private c g;
  private f h;
  private b i;
  private List j;
  
  public g()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.j = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.e = ((List)localObject);
    localObject = new com/vvt/im/events/info/d;
    ((d)localObject).<init>();
    a((d)localObject);
    localObject = new com/vvt/im/events/info/c;
    ((c)localObject).<init>();
    a((c)localObject);
    localObject = new com/vvt/im/events/info/f;
    ((f)localObject).<init>();
    this.h = ((f)localObject);
    localObject = new com/vvt/im/events/info/b;
    ((b)localObject).<init>();
    this.i = ((b)localObject);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(b paramb)
  {
    this.i = paramb;
  }
  
  public void a(c paramc)
  {
    this.g = paramc;
  }
  
  public void a(d paramd)
  {
    this.f = paramd;
  }
  
  public void a(f paramf)
  {
    this.h = paramf;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void a(List paramList)
  {
    this.e = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public void b(List paramList)
  {
    this.j = paramList;
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  public List d()
  {
    return this.e;
  }
  
  public d e()
  {
    return this.f;
  }
  
  public c f()
  {
    return this.g;
  }
  
  public f g()
  {
    return this.h;
  }
  
  public b j()
  {
    return this.i;
  }
  
  public List k()
  {
    return this.j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("textRepresentation: ");
    int k = this.a;
    localObject1 = k;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(" text: ");
    Object localObject2 = this.b;
    localObject1 = (String)localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(" dateTime: ");
    localObject2 = this.c;
    localObject1 = (String)localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(" sender: ");
    localObject2 = this.h.a();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("|");
    localObject2 = this.h.b();
    localObject1 = (String)localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      double d1 = ((c)localObject1).a();
      double d2 = 0.0D;
      boolean bool = d1 < d2;
      if (bool)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("\nlocation: (");
        d1 = this.g.a();
        localObject1 = ((StringBuilder)localObject1).append(d1).append(",");
        d1 = this.g.b();
        localObject1 = ((StringBuilder)localObject1).append(d1).append(") name: ");
        localObject2 = this.g.c();
        localObject1 = (String)localObject2;
        localStringBuilder.append((String)localObject1);
      }
    }
    localObject1 = this.j;
    if (localObject1 != null)
    {
      localObject1 = this.j;
      int m = ((List)localObject1).size();
      if (m > 0)
      {
        localObject1 = this.j.get(0);
        if (localObject1 != null)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = ((StringBuilder)localObject1).append("attachments: ");
          localObject1 = ((a)this.j.get(0)).a();
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(" ");
          localObject1 = ((a)this.j.get(0)).c();
          localObject1 = (String)localObject1;
          localStringBuilder.append((String)localObject1);
        }
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */