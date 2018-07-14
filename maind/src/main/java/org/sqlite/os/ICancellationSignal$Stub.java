package org.sqlite.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ICancellationSignal$Stub
  extends Binder
  implements ICancellationSignal
{
  private static final String DESCRIPTOR = "org.sqlite.os.ICancellationSignal";
  static final int TRANSACTION_cancel = 1;
  
  public ICancellationSignal$Stub()
  {
    attachInterface(this, "org.sqlite.os.ICancellationSignal");
  }
  
  public static ICancellationSignal asInterface(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ICancellationSignal)localObject;
      localObject = paramIBinder.queryLocalInterface("org.sqlite.os.ICancellationSignal");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ICancellationSignal;
        if (bool)
        {
          localObject = (ICancellationSignal)localObject;
          continue;
        }
      }
      localObject = new org/sqlite/os/ICancellationSignal$Stub$Proxy;
      ((ICancellationSignal.Stub.Proxy)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      String str = "org.sqlite.os.ICancellationSignal";
      paramParcel2.writeString(str);
      continue;
      str = "org.sqlite.os.ICancellationSignal";
      paramParcel1.enforceInterface(str);
      cancel();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/os/ICancellationSignal$Stub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */