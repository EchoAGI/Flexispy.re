package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class FragmentManagerState$1
  implements Parcelable.Creator
{
  public FragmentManagerState createFromParcel(Parcel paramParcel)
  {
    FragmentManagerState localFragmentManagerState = new android/support/v4/app/FragmentManagerState;
    localFragmentManagerState.<init>(paramParcel);
    return localFragmentManagerState;
  }
  
  public FragmentManagerState[] newArray(int paramInt)
  {
    return new FragmentManagerState[paramInt];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentManagerState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */