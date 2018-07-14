package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class ParcelableCompat$CompatCreator
  implements Parcelable.Creator
{
  final ParcelableCompatCreatorCallbacks mCallbacks;
  
  public ParcelableCompat$CompatCreator(ParcelableCompatCreatorCallbacks paramParcelableCompatCreatorCallbacks)
  {
    this.mCallbacks = paramParcelableCompatCreatorCallbacks;
  }
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return this.mCallbacks.createFromParcel(paramParcel, null);
  }
  
  public Object[] newArray(int paramInt)
  {
    return this.mCallbacks.newArray(paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/os/ParcelableCompat$CompatCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */