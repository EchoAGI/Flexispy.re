package org.sqlite.os;

import android.os.IBinder;
import android.os.Parcel;

class ICancellationSignal$Stub$Proxy
  implements ICancellationSignal
{
  private IBinder mRemote;
  
  ICancellationSignal$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public void cancel()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "org.sqlite.os.ICancellationSignal";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 1;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public String getInterfaceDescriptor()
  {
    return "org.sqlite.os.ICancellationSignal";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/os/ICancellationSignal$Stub$Proxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */