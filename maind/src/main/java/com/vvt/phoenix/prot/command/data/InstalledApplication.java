package com.vvt.phoenix.prot.command.data;

public class InstalledApplication
{
  private String a;
  private String b;
  private String c;
  private String d;
  private int e;
  private int f;
  private byte[] g;
  private InstalledApplication.ApplicationType h;
  
  public InstalledApplication()
  {
    InstalledApplication.ApplicationType localApplicationType = InstalledApplication.ApplicationType.NON_BROWSER;
    this.h = localApplicationType;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(InstalledApplication.ApplicationType paramApplicationType)
  {
    this.h = paramApplicationType;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.g = paramArrayOfByte;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public byte[] g()
  {
    return this.g;
  }
  
  public InstalledApplication.ApplicationType h()
  {
    return this.h;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/InstalledApplication.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */