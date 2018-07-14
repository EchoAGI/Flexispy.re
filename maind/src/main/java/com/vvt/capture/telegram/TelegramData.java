package com.vvt.capture.telegram;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.b;
import com.vvt.im.events.info.c;
import com.vvt.im.events.info.d;
import com.vvt.im.events.info.f;
import java.util.ArrayList;
import java.util.List;

public class TelegramData
{
  private int a = 0;
  private long b;
  private String c = "";
  private TelegramData.Direction d;
  private String e = "";
  private boolean f = false;
  private List g;
  private d h;
  private c i;
  private f j;
  private b k;
  private List l;
  
  public TelegramData()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.l = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.g = ((List)localObject);
    localObject = new com/vvt/im/events/info/d;
    ((d)localObject).<init>();
    a((d)localObject);
    localObject = new com/vvt/im/events/info/c;
    ((c)localObject).<init>();
    a((c)localObject);
    localObject = new com/vvt/im/events/info/f;
    ((f)localObject).<init>();
    this.j = ((f)localObject);
    localObject = new com/vvt/im/events/info/b;
    ((b)localObject).<init>();
    this.k = ((b)localObject);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(TelegramData.Direction paramDirection)
  {
    this.d = paramDirection;
  }
  
  public void a(b paramb)
  {
    this.k = paramb;
  }
  
  public void a(c paramc)
  {
    this.i = paramc;
  }
  
  public void a(d paramd)
  {
    this.h = paramd;
  }
  
  public void a(f paramf)
  {
    this.j = paramf;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public void a(List paramList)
  {
    this.g = paramList;
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(List paramList)
  {
    this.l = paramList;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public TelegramData.Direction d()
  {
    return this.d;
  }
  
  public List e()
  {
    return this.g;
  }
  
  public d f()
  {
    return this.h;
  }
  
  public c g()
  {
    return this.i;
  }
  
  public f h()
  {
    return this.j;
  }
  
  public b i()
  {
    return this.k;
  }
  
  public List j()
  {
    return this.l;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("textRepresentation: ");
    int m = this.a;
    localObject1 = m;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(" text: ");
    Object localObject2 = this.c;
    localObject1 = (String)localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(" dateTime: ");
    localObject2 = this.e;
    localObject1 = (String)localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(" sender: ");
    localObject2 = this.j.a();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("|");
    localObject2 = this.j.b();
    localObject1 = (String)localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = this.i;
    if (localObject1 != null)
    {
      localObject1 = this.i;
      double d1 = ((c)localObject1).a();
      double d2 = 0.0D;
      boolean bool = d1 < d2;
      if (bool)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("\nlocation: (");
        d1 = this.i.a();
        localObject1 = ((StringBuilder)localObject1).append(d1).append(",");
        d1 = this.i.b();
        localObject1 = ((StringBuilder)localObject1).append(d1).append(") name: ");
        localObject2 = this.i.c();
        localObject1 = (String)localObject2;
        localStringBuilder.append((String)localObject1);
      }
    }
    localObject1 = this.l;
    if (localObject1 != null)
    {
      localObject1 = this.l;
      int n = ((List)localObject1).size();
      if (n > 0)
      {
        localObject1 = this.l.get(0);
        if (localObject1 != null)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = ((StringBuilder)localObject1).append("attachments: ");
          localObject1 = ((a)this.l.get(0)).a();
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(" ");
          localObject1 = ((a)this.l.get(0)).c();
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(" ");
          localObject1 = ((a)this.l.get(0)).f();
          localObject1 = (String)localObject1;
          localStringBuilder.append((String)localObject1);
        }
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/TelegramData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */