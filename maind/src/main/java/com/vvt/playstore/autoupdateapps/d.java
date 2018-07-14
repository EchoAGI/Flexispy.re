package com.vvt.playstore.autoupdateapps;

import java.util.Hashtable;

class d
{
  private String b;
  private Hashtable c;
  private Hashtable d;
  
  public d(b paramb)
  {
    Hashtable localHashtable = new java/util/Hashtable;
    localHashtable.<init>();
    this.c = localHashtable;
    localHashtable = new java/util/Hashtable;
    localHashtable.<init>();
    this.d = localHashtable;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void a(String paramString1, String paramString2)
  {
    synchronized (this.c)
    {
      Hashtable localHashtable2 = this.c;
      localHashtable2.put(paramString1, paramString2);
      return;
    }
  }
  
  public Hashtable b()
  {
    return this.c;
  }
  
  public void b(String paramString1, String paramString2)
  {
    synchronized (this.d)
    {
      Hashtable localHashtable2 = this.d;
      localHashtable2.put(paramString1, paramString2);
      return;
    }
  }
  
  public Hashtable c()
  {
    return this.d;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/playstore/autoupdateapps/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */