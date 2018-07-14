package com.vvt.e;

public class c
  extends com.vvt.p.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static c c;
  private boolean d = false;
  private boolean e = false;
  private String f;
  
  private c(String paramString)
  {
    super(paramString);
    String str = b.a();
    this.f = str;
    boolean bool = b;
    if (bool) {}
  }
  
  public static c a()
  {
    synchronized (c.class)
    {
      Object localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = a.a();
        c localc = new com/vvt/e/c;
        localc.<init>((String)localObject1);
        c = localc;
      }
      localObject1 = c;
      return (c)localObject1;
    }
  }
  
  public void b()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = this.d;
    if (!bool1)
    {
      String str1 = b.a();
      String str2 = this.f;
      boolean bool2 = str1.equals(str2);
      if (!bool2)
      {
        this.f = str1;
        bool1 = b;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      stopWatching();
    }
  }
  
  public String c()
  {
    String str = this.f;
    if (str == null)
    {
      str = b.a();
      this.f = str;
    }
    return this.f;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/e/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */