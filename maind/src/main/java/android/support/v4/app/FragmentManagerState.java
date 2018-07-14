package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  FragmentState[] mActive;
  int[] mAdded;
  BackStackState[] mBackStack;
  
  static
  {
    FragmentManagerState.1 local1 = new android/support/v4/app/FragmentManagerState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FragmentManagerState() {}
  
  public FragmentManagerState(Parcel paramParcel)
  {
    Object localObject = FragmentState.CREATOR;
    localObject = (FragmentState[])paramParcel.createTypedArray((Parcelable.Creator)localObject);
    this.mActive = ((FragmentState[])localObject);
    localObject = paramParcel.createIntArray();
    this.mAdded = ((int[])localObject);
    localObject = BackStackState.CREATOR;
    localObject = (BackStackState[])paramParcel.createTypedArray((Parcelable.Creator)localObject);
    this.mBackStack = ((BackStackState[])localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.mActive;
    paramParcel.writeTypedArray((Parcelable[])localObject, paramInt);
    localObject = this.mAdded;
    paramParcel.writeIntArray((int[])localObject);
    localObject = this.mBackStack;
    paramParcel.writeTypedArray((Parcelable[])localObject, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentManagerState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */