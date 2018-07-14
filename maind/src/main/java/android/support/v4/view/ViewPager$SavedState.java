package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.ParcelableCompat;
import android.view.View.BaseSavedState;

public class ViewPager$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  Parcelable adapterState;
  ClassLoader loader;
  int position;
  
  static
  {
    ViewPager.SavedState.1 local1 = new android/support/v4/view/ViewPager$SavedState$1;
    local1.<init>();
    CREATOR = ParcelableCompat.newCreator(local1);
  }
  
  ViewPager$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    if (paramClassLoader == null)
    {
      localObject = getClass();
      paramClassLoader = ((Class)localObject).getClassLoader();
    }
    int i = paramParcel.readInt();
    this.position = i;
    Object localObject = paramParcel.readParcelable(paramClassLoader);
    this.adapterState = ((Parcelable)localObject);
    this.loader = paramClassLoader;
  }
  
  public ViewPager$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("FragmentPager.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder = localStringBuilder.append(str).append(" position=");
    int i = this.position;
    return i + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = this.position;
    paramParcel.writeInt(i);
    Parcelable localParcelable = this.adapterState;
    paramParcel.writeParcelable(localParcelable, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */