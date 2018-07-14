package android.support.v4.os;

import android.os.Parcel;

public abstract interface ParcelableCompatCreatorCallbacks
{
  public abstract Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader);
  
  public abstract Object[] newArray(int paramInt);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/os/ParcelableCompatCreatorCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */