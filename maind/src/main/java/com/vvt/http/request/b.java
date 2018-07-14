package com.vvt.http.request;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class b
{
  private ArrayList a;
  private String b = "";
  private MethodType c;
  private ContentType d;
  private int e;
  private HashMap f;
  private String g;
  private String h;
  private String i;
  private String j;
  
  public b()
  {
    Object localObject = MethodType.GET;
    this.c = ((MethodType)localObject);
    localObject = ContentType.BINARY_OCTET_STREAM;
    this.d = ((ContentType)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.f = ((HashMap)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.a = ((ArrayList)localObject);
    this.i = "Android";
  }
  
  public ArrayList a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(ContentType paramContentType)
  {
    this.d = paramContentType;
  }
  
  public void a(MethodType paramMethodType)
  {
    this.c = paramMethodType;
  }
  
  public void a(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    int k = (int)localFile.length();
    a(paramString, 0, k);
  }
  
  public void a(String paramString, int paramInt)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    long l1 = localFile.length();
    long l2 = paramInt;
    int k = (int)(l1 - l2);
    a(paramString, paramInt, k);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    e locale = new com/vvt/http/request/e;
    locale.<init>(paramString);
    locale.a(paramInt1);
    locale.b(paramInt2);
    this.a.add(locale);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.f.put(paramString1, paramString2);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    c localc = new com/vvt/http/request/c;
    localc.<init>(paramArrayOfByte);
    this.a.add(localc);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    c localc = new com/vvt/http/request/c;
    localc.<init>(paramArrayOfByte);
    localc.a(paramInt);
    this.a.add(localc);
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public MethodType c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.g = paramString;
  }
  
  public ContentType d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.h = paramString;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public void e(String paramString)
  {
    this.j = paramString;
  }
  
  public HashMap f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public String h()
  {
    return this.h;
  }
  
  public String i()
  {
    return this.i;
  }
  
  public String j()
  {
    return this.j;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/request/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */