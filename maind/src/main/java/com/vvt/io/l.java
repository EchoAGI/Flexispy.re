package com.vvt.io;

import android.os.FileObserver;

class l
  extends FileObserver
{
  private String b;
  
  public l(j paramj, String paramString1, String paramString2)
  {
    super(paramString2);
    this.b = paramString1;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    boolean bool = j.b();
    if (bool) {}
    bool = j.b();
    if (bool) {}
    j localj = this.a;
    String str = a();
    j.a(localj, str);
    localj = this.a;
    str = a();
    j.b(localj, str);
    bool = j.b();
    if (bool) {}
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("FileObserver[");
    String str = this.b;
    return str + "]";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */