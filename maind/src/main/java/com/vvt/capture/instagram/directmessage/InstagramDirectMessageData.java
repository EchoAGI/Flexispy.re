package com.vvt.capture.instagram.directmessage;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.b;
import com.vvt.im.events.info.c;
import com.vvt.im.events.info.d;
import com.vvt.im.events.info.f;
import java.util.List;

public class InstagramDirectMessageData
{
  private int a;
  private long b;
  private String c;
  private InstagramDirectMessageData.Direction d;
  private String e;
  private List f;
  private d g;
  private c h;
  private f i;
  private b j;
  private List k;
  
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
  
  public void a(InstagramDirectMessageData.Direction paramDirection)
  {
    this.d = paramDirection;
  }
  
  public void a(b paramb)
  {
    this.j = paramb;
  }
  
  public void a(c paramc)
  {
    this.h = paramc;
  }
  
  public void a(d paramd)
  {
    this.g = paramd;
  }
  
  public void a(f paramf)
  {
    this.i = paramf;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public void a(List paramList)
  {
    this.f = paramList;
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
    this.k = paramList;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public InstagramDirectMessageData.Direction d()
  {
    return this.d;
  }
  
  public List e()
  {
    return this.f;
  }
  
  public d f()
  {
    return this.g;
  }
  
  public c g()
  {
    return this.h;
  }
  
  public f h()
  {
    return this.i;
  }
  
  public b i()
  {
    return this.j;
  }
  
  public List j()
  {
    return this.k;
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
    localObject1 = ((StringBuilder)localObject1).append("direction: ");
    Object localObject2 = this.d;
    localObject1 = localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(" text: ");
    localObject2 = this.c;
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
    localObject2 = this.i.a();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("|");
    localObject2 = this.i.b();
    localObject1 = (String)localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = this.h;
    if (localObject1 != null)
    {
      localObject1 = this.h;
      double d1 = ((c)localObject1).a();
      double d2 = 0.0D;
      boolean bool = d1 < d2;
      if (bool)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("\nlocation: (");
        d1 = this.h.a();
        localObject1 = ((StringBuilder)localObject1).append(d1).append(",");
        d1 = this.h.b();
        localObject1 = ((StringBuilder)localObject1).append(d1).append(") name: ");
        localObject2 = this.h.c();
        localObject1 = (String)localObject2;
        localStringBuilder.append((String)localObject1);
      }
    }
    localObject1 = this.k;
    int n;
    if (localObject1 != null)
    {
      localObject1 = this.k;
      n = ((List)localObject1).size();
      if (n > 0)
      {
        localObject1 = this.k.get(0);
        if (localObject1 != null)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = ((StringBuilder)localObject1).append("attachments: ");
          localObject1 = ((a)this.k.get(0)).a();
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(" ");
          localObject1 = ((a)this.k.get(0)).c();
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(" ");
          localObject1 = ((a)this.k.get(0)).f();
          localObject1 = (String)localObject1;
          localStringBuilder.append((String)localObject1);
        }
      }
    }
    localObject1 = this.f;
    if (localObject1 != null)
    {
      localObject1 = this.f;
      n = ((List)localObject1).size();
      if (n > 0)
      {
        localObject1 = this.f.get(0);
        if (localObject1 != null)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("participants: ");
          localObject2 = this.f.toString();
          localObject1 = (String)localObject2;
          localStringBuilder.append((String)localObject1);
        }
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/InstagramDirectMessageData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */