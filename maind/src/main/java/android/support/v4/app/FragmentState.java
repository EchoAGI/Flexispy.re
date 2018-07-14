package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final Bundle mArguments;
  final String mClassName;
  final int mContainerId;
  final boolean mDetached;
  final int mFragmentId;
  final boolean mFromLayout;
  final int mIndex;
  Fragment mInstance;
  final boolean mRetainInstance;
  Bundle mSavedFragmentState;
  final String mTag;
  
  static
  {
    FragmentState.1 local1 = new android/support/v4/app/FragmentState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FragmentState(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    this.mClassName = ((String)localObject);
    int j = paramParcel.readInt();
    this.mIndex = j;
    j = paramParcel.readInt();
    if (j != 0)
    {
      j = i;
      this.mFromLayout = j;
      j = paramParcel.readInt();
      this.mFragmentId = j;
      j = paramParcel.readInt();
      this.mContainerId = j;
      localObject = paramParcel.readString();
      this.mTag = ((String)localObject);
      j = paramParcel.readInt();
      if (j == 0) {
        break label147;
      }
      j = i;
      label96:
      this.mRetainInstance = j;
      j = paramParcel.readInt();
      if (j == 0) {
        break label155;
      }
    }
    for (;;)
    {
      this.mDetached = i;
      localObject = paramParcel.readBundle();
      this.mArguments = ((Bundle)localObject);
      localObject = paramParcel.readBundle();
      this.mSavedFragmentState = ((Bundle)localObject);
      return;
      j = 0;
      localObject = null;
      break;
      label147:
      j = 0;
      localObject = null;
      break label96;
      label155:
      i = 0;
    }
  }
  
  public FragmentState(Fragment paramFragment)
  {
    Object localObject = paramFragment.getClass().getName();
    this.mClassName = ((String)localObject);
    int i = paramFragment.mIndex;
    this.mIndex = i;
    boolean bool1 = paramFragment.mFromLayout;
    this.mFromLayout = bool1;
    int j = paramFragment.mFragmentId;
    this.mFragmentId = j;
    j = paramFragment.mContainerId;
    this.mContainerId = j;
    localObject = paramFragment.mTag;
    this.mTag = ((String)localObject);
    boolean bool2 = paramFragment.mRetainInstance;
    this.mRetainInstance = bool2;
    bool2 = paramFragment.mDetached;
    this.mDetached = bool2;
    localObject = paramFragment.mArguments;
    this.mArguments = ((Bundle)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Fragment instantiate(FragmentActivity paramFragmentActivity)
  {
    Object localObject1 = this.mInstance;
    if (localObject1 != null) {}
    for (localObject1 = this.mInstance;; localObject1 = this.mInstance)
    {
      return (Fragment)localObject1;
      localObject1 = this.mArguments;
      if (localObject1 != null)
      {
        localObject1 = this.mArguments;
        localObject2 = paramFragmentActivity.getClassLoader();
        ((Bundle)localObject1).setClassLoader((ClassLoader)localObject2);
      }
      localObject1 = this.mClassName;
      Object localObject2 = this.mArguments;
      localObject1 = Fragment.instantiate(paramFragmentActivity, (String)localObject1, (Bundle)localObject2);
      this.mInstance = ((Fragment)localObject1);
      localObject1 = this.mSavedFragmentState;
      if (localObject1 != null)
      {
        localObject1 = this.mSavedFragmentState;
        localObject2 = paramFragmentActivity.getClassLoader();
        ((Bundle)localObject1).setClassLoader((ClassLoader)localObject2);
        localObject1 = this.mInstance;
        localObject2 = this.mSavedFragmentState;
        ((Fragment)localObject1).mSavedFragmentState = ((Bundle)localObject2);
      }
      localObject1 = this.mInstance;
      int i = this.mIndex;
      ((Fragment)localObject1).setIndex(i);
      localObject1 = this.mInstance;
      boolean bool1 = this.mFromLayout;
      ((Fragment)localObject1).mFromLayout = bool1;
      this.mInstance.mRestored = true;
      localObject1 = this.mInstance;
      int j = this.mFragmentId;
      ((Fragment)localObject1).mFragmentId = j;
      localObject1 = this.mInstance;
      j = this.mContainerId;
      ((Fragment)localObject1).mContainerId = j;
      localObject1 = this.mInstance;
      localObject2 = this.mTag;
      ((Fragment)localObject1).mTag = ((String)localObject2);
      localObject1 = this.mInstance;
      boolean bool2 = this.mRetainInstance;
      ((Fragment)localObject1).mRetainInstance = bool2;
      localObject1 = this.mInstance;
      bool2 = this.mDetached;
      ((Fragment)localObject1).mDetached = bool2;
      localObject1 = this.mInstance;
      localObject2 = paramFragmentActivity.mFragments;
      ((Fragment)localObject1).mFragmentManager = ((FragmentManagerImpl)localObject2);
      boolean bool3 = FragmentManagerImpl.DEBUG;
      if (bool3)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Instantiated fragment ");
        Fragment localFragment = this.mInstance;
        localObject2 = localFragment;
        Log.v((String)localObject1, (String)localObject2);
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    Object localObject = this.mClassName;
    paramParcel.writeString((String)localObject);
    int j = this.mIndex;
    paramParcel.writeInt(j);
    int k = this.mFromLayout;
    label96:
    boolean bool;
    if (k != 0)
    {
      k = i;
      paramParcel.writeInt(k);
      int m = this.mFragmentId;
      paramParcel.writeInt(m);
      m = this.mContainerId;
      paramParcel.writeInt(m);
      localObject = this.mTag;
      paramParcel.writeString((String)localObject);
      int n = this.mRetainInstance;
      if (n == 0) {
        break label152;
      }
      n = i;
      paramParcel.writeInt(n);
      bool = this.mDetached;
      if (!bool) {
        break label161;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      localObject = this.mArguments;
      paramParcel.writeBundle((Bundle)localObject);
      localObject = this.mSavedFragmentState;
      paramParcel.writeBundle((Bundle)localObject);
      return;
      bool = false;
      localObject = null;
      break;
      label152:
      bool = false;
      localObject = null;
      break label96;
      label161:
      i = 0;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */