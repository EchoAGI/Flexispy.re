package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class ParcelableCompatCreatorHoneycombMR2
  implements Parcelable.ClassLoaderCreator
{
  private final ParcelableCompatCreatorCallbacks mCallbacks;
  
  public ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks paramParcelableCompatCreatorCallbacks)
  {
    this.mCallbacks = paramParcelableCompatCreatorCallbacks;
  }
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return this.mCallbacks.createFromParcel(paramParcel, null);
  }
  
  public Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.mCallbacks.createFromParcel(paramParcel, paramClassLoader);
  }
  
  public Object[] newArray(int paramInt)
  {
    return this.mCallbacks.newArray(paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/os/ParcelableCompatCreatorHoneycombMR2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */