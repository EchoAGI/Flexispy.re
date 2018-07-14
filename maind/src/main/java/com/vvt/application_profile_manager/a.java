package com.vvt.application_profile_manager;

import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageStats;
import java.util.HashMap;

class a
  extends IPackageStatsObserver.Stub
{
  a(ApplicationProfileManagerImpl paramApplicationProfileManagerImpl, HashMap paramHashMap) {}
  
  public void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    synchronized (this.b)
    {
      Object localObject1 = this.b;
      int i = -1;
      ApplicationProfileManagerImpl.a((ApplicationProfileManagerImpl)localObject1, i);
      localObject1 = this.a;
      String str = paramPackageStats.packageName;
      long l1 = paramPackageStats.codeSize;
      long l2 = paramPackageStats.dataSize;
      l1 += l2;
      l2 = paramPackageStats.cacheSize;
      l1 += l2;
      Long localLong = Long.valueOf(l1);
      ((HashMap)localObject1).put(str, localLong);
      localObject1 = this.b;
      localObject1.notify();
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/application_profile_manager/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */