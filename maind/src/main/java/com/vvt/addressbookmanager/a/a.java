package com.vvt.addressbookmanager.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
{
  private long a;
  private String b;
  private String c;
  private String d = "";
  private byte[] e;
  private String f;
  private String g;
  private List h;
  private long i;
  
  public a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.h = localArrayList;
  }
  
  public long a()
  {
    return this.i;
  }
  
  public void a(long paramLong)
  {
    this.i = paramLong;
  }
  
  public void a(b paramb)
  {
    this.h.add(paramb);
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
  
  public long d()
  {
    return this.a;
  }
  
  public void d(String paramString)
  {
    this.g = paramString;
  }
  
  public String e()
  {
    return this.g;
  }
  
  public byte[] f()
  {
    return this.e;
  }
  
  public String g()
  {
    return this.f;
  }
  
  public List h()
  {
    return this.h;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("Contact {");
    Object localObject1 = localStringBuilder1.append(" id =");
    long l = this.a;
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", displayName =");
    Object localObject2 = this.g;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", givenName =");
    localObject2 = this.b;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", familyName =");
    localObject2 = this.c;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", notes =");
    localObject2 = this.f;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = localStringBuilder1.append(", photo size =");
    localObject1 = this.e;
    if (localObject1 == null) {}
    int j;
    for (localObject1 = "0";; localObject1 = Integer.valueOf(j))
    {
      ((StringBuilder)localObject2).append(localObject1);
      localObject1 = this.h;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (b)((Iterator)localObject2).next();
        StringBuilder localStringBuilder2 = localStringBuilder1.append(" ContactMethod =");
        localObject1 = ((b)localObject1).a();
        localStringBuilder2.append((String)localObject1);
      }
      j = this.e.length;
    }
    localObject1 = localStringBuilder1.append(", serverId =");
    l = this.i;
    ((StringBuilder)localObject1).append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */