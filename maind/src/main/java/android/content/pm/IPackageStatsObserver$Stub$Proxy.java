package android.content.pm;

import android.os.IBinder;
import android.os.Parcel;

class IPackageStatsObserver$Stub$Proxy
  implements IPackageStatsObserver
{
  private IBinder mRemote;
  
  IPackageStatsObserver$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "android.content.pm.IPackageStatsObserver";
  }
  
  public void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    int i = 0;
    int j = 1;
    Parcel localParcel = Parcel.obtain();
    String str = "android.content.pm.IPackageStatsObserver";
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken(str);
        int k;
        if (paramPackageStats != null)
        {
          k = 1;
          localParcel.writeInt(k);
          k = 0;
          str = null;
          paramPackageStats.writeToParcel(localParcel, 0);
          if (paramBoolean)
          {
            localParcel.writeInt(j);
            IBinder localIBinder = this.mRemote;
            i = 1;
            k = 0;
            str = null;
            int m = 1;
            localIBinder.transact(i, localParcel, null, m);
          }
        }
        else
        {
          k = 0;
          str = null;
          localParcel.writeInt(0);
          continue;
        }
        j = 0;
      }
      finally
      {
        localParcel.recycle();
      }
      Object localObject2 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/content/pm/IPackageStatsObserver$Stub$Proxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */