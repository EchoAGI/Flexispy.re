package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public class ParcelableCompat
{
  public static Parcelable.Creator newCreator(ParcelableCompatCreatorCallbacks paramParcelableCompatCreatorCallbacks)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 13;
    if (i >= j) {
      ParcelableCompatCreatorHoneycombMR2Stub.instantiate(paramParcelableCompatCreatorCallbacks);
    }
    ParcelableCompat.CompatCreator localCompatCreator = new android/support/v4/os/ParcelableCompat$CompatCreator;
    localCompatCreator.<init>(paramParcelableCompatCreatorCallbacks);
    return localCompatCreator;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/os/ParcelableCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */