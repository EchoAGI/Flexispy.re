package android.content.pm;

import android.os.IInterface;

public abstract interface IPackageStatsObserver
  extends IInterface
{
  public abstract void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/content/pm/IPackageStatsObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */