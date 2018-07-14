package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

final class ViewPager$SavedState$1
  implements ParcelableCompatCreatorCallbacks
{
  public ViewPager.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    ViewPager.SavedState localSavedState = new android/support/v4/view/ViewPager$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public ViewPager.SavedState[] newArray(int paramInt)
  {
    return new ViewPager.SavedState[paramInt];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager$SavedState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */