package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Fragment$SavedState$1
  implements Parcelable.Creator
{
  public Fragment.SavedState createFromParcel(Parcel paramParcel)
  {
    Fragment.SavedState localSavedState = new android/support/v4/app/Fragment$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public Fragment.SavedState[] newArray(int paramInt)
  {
    return new Fragment.SavedState[paramInt];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/Fragment$SavedState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */