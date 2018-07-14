package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IPackageStatsObserver$Stub
  extends Binder
  implements IPackageStatsObserver
{
  private static final String DESCRIPTOR = "android.content.pm.IPackageStatsObserver";
  static final int TRANSACTION_onGetStatsCompleted = 1;
  
  public IPackageStatsObserver$Stub()
  {
    attachInterface(this, "android.content.pm.IPackageStatsObserver");
  }
  
  public static IPackageStatsObserver asInterface(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IPackageStatsObserver)localObject;
      localObject = paramIBinder.queryLocalInterface("android.content.pm.IPackageStatsObserver");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IPackageStatsObserver;
        if (bool)
        {
          localObject = (IPackageStatsObserver)localObject;
          continue;
        }
      }
      localObject = new android/content/pm/IPackageStatsObserver$Stub$Proxy;
      ((IPackageStatsObserver.Stub.Proxy)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      for (;;)
      {
        return i;
        localObject = "android.content.pm.IPackageStatsObserver";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "android.content.pm.IPackageStatsObserver";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject = (PackageStats)PackageStats.CREATOR.createFromParcel(paramParcel1);
      label94:
      k = paramParcel1.readInt();
      if (k == 0) {
        break label129;
      }
    }
    label129:
    int m;
    for (int k = i;; m = 0)
    {
      onGetStatsCompleted((PackageStats)localObject, k);
      break;
      j = 0;
      localObject = null;
      break label94;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/content/pm/IPackageStatsObserver$Stub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */