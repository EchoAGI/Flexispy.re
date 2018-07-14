package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Fragment$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final Bundle mState;
  
  static
  {
    Fragment.SavedState.1 local1 = new android/support/v4/app/Fragment$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  Fragment$SavedState(Bundle paramBundle)
  {
    this.mState = paramBundle;
  }
  
  Fragment$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    Bundle localBundle = paramParcel.readBundle();
    this.mState = localBundle;
    if (paramClassLoader != null)
    {
      localBundle = this.mState;
      if (localBundle != null)
      {
        localBundle = this.mState;
        localBundle.setClassLoader(paramClassLoader);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bundle localBundle = this.mState;
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/Fragment$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */