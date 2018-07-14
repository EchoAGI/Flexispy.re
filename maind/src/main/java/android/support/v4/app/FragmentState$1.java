package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class FragmentState$1
  implements Parcelable.Creator
{
  public FragmentState createFromParcel(Parcel paramParcel)
  {
    FragmentState localFragmentState = new android/support/v4/app/FragmentState;
    localFragmentState.<init>(paramParcel);
    return localFragmentState;
  }
  
  public FragmentState[] newArray(int paramInt)
  {
    return new FragmentState[paramInt];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */