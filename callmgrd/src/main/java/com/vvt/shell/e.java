package com.vvt.shell;

public class e
{
  private boolean a = true;
  private String b;
  
  public void a()
  {
    try
    {
      for (;;)
      {
        bool = this.a;
        if (!bool) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      boolean bool = true;
      this.a = bool;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void b()
  {
    try
    {
      for (;;)
      {
        bool = this.a;
        if (bool) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      boolean bool = false;
      Object localObject1 = null;
      this.a = false;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public String c()
  {
    return this.b;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */