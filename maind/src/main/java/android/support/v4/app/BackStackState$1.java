package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class BackStackState$1
  implements Parcelable.Creator
{
  public BackStackState createFromParcel(Parcel paramParcel)
  {
    BackStackState localBackStackState = new android/support/v4/app/BackStackState;
    localBackStackState.<init>(paramParcel);
    return localBackStackState;
  }
  
  public BackStackState[] newArray(int paramInt)
  {
    return new BackStackState[paramInt];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/BackStackState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */