package com.vvt.b;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
{
  public static a a(PackageManager paramPackageManager, String paramString)
  {
    a locala = null;
    long l = 0L;
    Object localObject1 = null;
    try
    {
      localObject1 = paramPackageManager.getApplicationInfo(paramString, 0);
      i = 1;
      localObject5 = paramPackageManager.getPackageInfo(paramString, i);
      str = a(paramString, paramPackageManager);
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject6;
        ByteArrayOutputStream localByteArrayOutputStream;
        int j;
        label153:
        Object localObject2 = null;
        i = 0;
        localObject5 = null;
        String str = null;
      }
    }
    try
    {
      localObject5 = ((PackageInfo)localObject5).versionName;
    }
    catch (Exception localException3)
    {
      Object localObject3 = null;
      i = 0;
      localObject5 = null;
      break label153;
    }
    try
    {
      localObject6 = new java/io/File;
      localObject1 = ((ApplicationInfo)localObject1).sourceDir;
      ((File)localObject6).<init>((String)localObject1);
      l = ((File)localObject6).lastModified();
      localObject1 = paramPackageManager.getApplicationIcon(paramString);
      localObject1 = (BitmapDrawable)localObject1;
      localObject1 = ((BitmapDrawable)localObject1).getBitmap();
      localObject6 = Bitmap.Config.ARGB_8888;
      localByteArrayOutputStream = null;
      localObject6 = ((Bitmap)localObject1).copy((Bitmap.Config)localObject6, false);
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localObject1 = Bitmap.CompressFormat.PNG;
      j = 100;
      ((Bitmap)localObject6).compress((Bitmap.CompressFormat)localObject1, j, localByteArrayOutputStream);
      localObject1 = localByteArrayOutputStream.toByteArray();
    }
    catch (Exception localException4)
    {
      Object localObject4 = null;
      break label153;
    }
    try
    {
      localByteArrayOutputStream.close();
      ((Bitmap)localObject6).recycle();
    }
    catch (Exception localException1)
    {
      break label153;
    }
    locala = new com/vvt/b/a;
    locala.<init>();
    locala.b(paramString);
    locala.a(str);
    locala.c((String)localObject5);
    locala.a(l);
    locala.a(0);
    locala.a((byte[])localObject1);
    return locala;
  }
  
  private static String a(String paramString, PackageManager paramPackageManager)
  {
    Object localObject1 = null;
    if (paramString == null) {}
    for (Object localObject2 = "N/A";; localObject2 = ((StringBuilder)localObject1).toString())
    {
      return (String)localObject2;
      localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>("android.intent.action.MAIN", null);
      ((Intent)localObject2).addCategory("android.intent.category.LAUNCHER");
      localObject2 = paramPackageManager.queryIntentActivities((Intent)localObject2, 0);
      Object localObject3 = new java/util/HashSet;
      ((HashSet)localObject3).<init>();
      Object localObject4 = ((List)localObject2).iterator();
      boolean bool1 = ((Iterator)localObject4).hasNext();
      ApplicationInfo localApplicationInfo;
      if (bool1)
      {
        localObject2 = ((ResolveInfo)((Iterator)localObject4).next()).activityInfo;
        if (localObject2 != null)
        {
          localApplicationInfo = ((ActivityInfo)localObject2).applicationInfo;
          String str = localApplicationInfo.packageName;
          boolean bool3 = paramString.equalsIgnoreCase(str);
          if ((localObject2 == null) || (!bool3)) {}
        }
      }
      try
      {
        localObject1 = paramPackageManager.getResourcesForApplication(localApplicationInfo);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        int j;
        int i;
        for (;;) {}
      }
      if (localObject1 != null)
      {
        j = ((ActivityInfo)localObject2).labelRes;
        if (j != 0) {
          i = ((ActivityInfo)localObject2).labelRes;
        }
      }
      for (localObject2 = ((Resources)localObject1).getString(i);; localObject2 = localApplicationInfo.loadLabel(paramPackageManager).toString())
      {
        ((HashSet)localObject3).add(localObject2);
        localObject2 = localObject1;
        break;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ((HashSet)localObject3).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (String)((Iterator)localObject3).next();
        int k = ((StringBuilder)localObject1).length();
        if (k > 0)
        {
          localObject4 = ", ";
          ((StringBuilder)localObject1).append((String)localObject4);
        }
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
  }
  
  public static HashSet a(PackageManager paramPackageManager, boolean paramBoolean)
  {
    int i = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    boolean bool = false;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localObject1 = paramPackageManager.getInstalledApplications(0);
        Iterator localIterator = ((List)localObject1).iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject1 = localIterator.next();
          localObject1 = (ApplicationInfo)localObject1;
          if (!paramBoolean)
          {
            j = ((ApplicationInfo)localObject1).flags & 0x1;
            if (i == j) {}
          }
          else
          {
            j = i;
            if (j == 0) {
              continue;
            }
            str = ((ApplicationInfo)localObject1).packageName;
            if (str == null) {
              continue;
            }
            localObject1 = ((ApplicationInfo)localObject1).packageName;
            localHashSet.add(localObject1);
          }
        }
        else
        {
          return localHashSet;
        }
      }
      finally {}
      int j = 0;
      String str = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */