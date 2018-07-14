package com.vvt.shell;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

class h
  extends Thread
{
  private e a;
  private Timer b;
  private TimerTask c;
  private FileInputStream d;
  
  public h(e parame, FileInputStream paramFileInputStream)
  {
    this.a = parame;
    this.d = paramFileInputStream;
  }
  
  private void a()
  {
    Object localObject = new com/vvt/shell/i;
    ((i)localObject).<init>(this);
    this.c = ((TimerTask)localObject);
    localObject = new java/util/Timer;
    ((Timer)localObject).<init>();
    this.b = ((Timer)localObject);
    localObject = this.b;
    TimerTask localTimerTask = this.c;
    ((Timer)localObject).schedule(localTimerTask, 2000L);
  }
  
  private void b()
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = this.c;
      ((TimerTask)localObject).cancel();
      this.c = null;
    }
    localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Timer)localObject).cancel();
      this.b = null;
    }
  }
  
  public void run()
  {
    a();
    int i = 4096;
    try
    {
      Object localObject = new byte[i];
      FileInputStream localFileInputStream = this.d;
      int j = localFileInputStream.read((byte[])localObject);
      b();
      e locale = this.a;
      String str = new java/lang/String;
      str.<init>((byte[])localObject, 0, j);
      locale.a(str);
      localObject = this.a;
      ((e)localObject).b();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */