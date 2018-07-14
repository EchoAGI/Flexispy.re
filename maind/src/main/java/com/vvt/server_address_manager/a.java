package com.vvt.server_address_manager;

import com.vvt.base.a.b;

public abstract interface a
{
  public static final String a;
  public static final String b;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("/");
    String str = b.a(com.vvt.base.a.a.r);
    a = str;
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("/");
    str = b.a(com.vvt.base.a.a.s);
    b = str;
  }
  
  public abstract String a();
  
  public abstract void a(String paramString);
  
  public abstract String b();
  
  public abstract String c();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/server_address_manager/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */