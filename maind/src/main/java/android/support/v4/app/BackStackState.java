package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mBreadCrumbShortTitleRes;
  final CharSequence mBreadCrumbShortTitleText;
  final int mBreadCrumbTitleRes;
  final CharSequence mBreadCrumbTitleText;
  final int mIndex;
  final String mName;
  final int[] mOps;
  final int mTransition;
  final int mTransitionStyle;
  
  static
  {
    BackStackState.1 local1 = new android/support/v4/app/BackStackState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BackStackState(Parcel paramParcel)
  {
    Object localObject = paramParcel.createIntArray();
    this.mOps = ((int[])localObject);
    int i = paramParcel.readInt();
    this.mTransition = i;
    i = paramParcel.readInt();
    this.mTransitionStyle = i;
    localObject = paramParcel.readString();
    this.mName = ((String)localObject);
    i = paramParcel.readInt();
    this.mIndex = i;
    i = paramParcel.readInt();
    this.mBreadCrumbTitleRes = i;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.mBreadCrumbTitleText = ((CharSequence)localObject);
    i = paramParcel.readInt();
    this.mBreadCrumbShortTitleRes = i;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.mBreadCrumbShortTitleText = ((CharSequence)localObject);
  }
  
  public BackStackState(FragmentManagerImpl paramFragmentManagerImpl, BackStackRecord paramBackStackRecord)
  {
    int i = 0;
    for (BackStackRecord.Op localOp = paramBackStackRecord.mHead; localOp != null; localOp = localOp.next)
    {
      localObject = localOp.removed;
      if (localObject != null)
      {
        localObject = localOp.removed;
        int j = ((ArrayList)localObject).size();
        i += j;
      }
    }
    Object localObject = new int[paramBackStackRecord.mNumOp * 7 + i];
    this.mOps = ((int[])localObject);
    boolean bool = paramBackStackRecord.mAddToBackStack;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Not on back stack");
      throw ((Throwable)localObject);
    }
    localOp = paramBackStackRecord.mHead;
    int m = 0;
    int n = 0;
    if (localOp != null)
    {
      localObject = this.mOps;
      m = n + 1;
      int i1 = localOp.cmd;
      localObject[n] = i1;
      int[] arrayOfInt = this.mOps;
      n = m + 1;
      localObject = localOp.fragment;
      if (localObject != null) {
        localObject = localOp.fragment;
      }
      for (k = ((Fragment)localObject).mIndex;; k = -1)
      {
        arrayOfInt[m] = k;
        localObject = this.mOps;
        m = n + 1;
        i1 = localOp.enterAnim;
        localObject[n] = i1;
        localObject = this.mOps;
        n = m + 1;
        i1 = localOp.exitAnim;
        localObject[m] = i1;
        localObject = this.mOps;
        m = n + 1;
        i1 = localOp.popEnterAnim;
        localObject[n] = i1;
        localObject = this.mOps;
        n = m + 1;
        i1 = localOp.popExitAnim;
        localObject[m] = i1;
        localObject = localOp.removed;
        if (localObject == null) {
          break label428;
        }
        int i2 = localOp.removed.size();
        localObject = this.mOps;
        m = n + 1;
        localObject[n] = i2;
        int i3 = 0;
        for (n = m; i3 < i2; n = m)
        {
          arrayOfInt = this.mOps;
          m = n + 1;
          localObject = (Fragment)localOp.removed.get(i3);
          k = ((Fragment)localObject).mIndex;
          arrayOfInt[n] = k;
          i3 += 1;
        }
      }
      m = n;
      for (;;)
      {
        localOp = localOp.next;
        n = m;
        break;
        label428:
        localObject = this.mOps;
        m = n + 1;
        i1 = 0;
        arrayOfInt = null;
        localObject[n] = 0;
      }
    }
    int k = paramBackStackRecord.mTransition;
    this.mTransition = k;
    k = paramBackStackRecord.mTransitionStyle;
    this.mTransitionStyle = k;
    localObject = paramBackStackRecord.mName;
    this.mName = ((String)localObject);
    k = paramBackStackRecord.mIndex;
    this.mIndex = k;
    k = paramBackStackRecord.mBreadCrumbTitleRes;
    this.mBreadCrumbTitleRes = k;
    localObject = paramBackStackRecord.mBreadCrumbTitleText;
    this.mBreadCrumbTitleText = ((CharSequence)localObject);
    k = paramBackStackRecord.mBreadCrumbShortTitleRes;
    this.mBreadCrumbShortTitleRes = k;
    localObject = paramBackStackRecord.mBreadCrumbShortTitleText;
    this.mBreadCrumbShortTitleText = ((CharSequence)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public BackStackRecord instantiate(FragmentManagerImpl paramFragmentManagerImpl)
  {
    int i = 1;
    BackStackRecord localBackStackRecord = new android/support/v4/app/BackStackRecord;
    localBackStackRecord.<init>(paramFragmentManagerImpl);
    int j = 0;
    for (;;)
    {
      localObject1 = this.mOps;
      int k = localObject1.length;
      if (j >= k) {
        break;
      }
      BackStackRecord.Op localOp = new android/support/v4/app/BackStackRecord$Op;
      localOp.<init>();
      localObject1 = this.mOps;
      int i1 = j + 1;
      k = localObject1[j];
      localOp.cmd = k;
      boolean bool1 = FragmentManagerImpl.DEBUG;
      Object localObject2;
      int[] arrayOfInt;
      int i2;
      if (bool1)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("BSE ").append(localBackStackRecord).append(" set base fragment #");
        arrayOfInt = this.mOps;
        i2 = arrayOfInt[i1];
        localObject2 = i2;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = this.mOps;
      j = i1 + 1;
      int i3 = localObject1[i1];
      Fragment localFragment1;
      if (i3 >= 0)
      {
        localObject1 = paramFragmentManagerImpl.mActive;
        localFragment1 = (Fragment)((ArrayList)localObject1).get(i3);
      }
      for (localOp.fragment = localFragment1;; localOp.fragment = null)
      {
        localObject1 = this.mOps;
        i1 = j + 1;
        int m = localObject1[j];
        localOp.enterAnim = m;
        localObject1 = this.mOps;
        j = i1 + 1;
        m = localObject1[i1];
        localOp.exitAnim = m;
        localObject1 = this.mOps;
        i1 = j + 1;
        m = localObject1[j];
        localOp.popEnterAnim = m;
        localObject1 = this.mOps;
        j = i1 + 1;
        m = localObject1[i1];
        localOp.popExitAnim = m;
        localObject1 = this.mOps;
        i1 = j + 1;
        int i4 = localObject1[j];
        if (i4 <= 0) {
          break;
        }
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(i4);
        localOp.removed = ((ArrayList)localObject1);
        int i5 = 0;
        while (i5 < i4)
        {
          bool2 = FragmentManagerImpl.DEBUG;
          if (bool2)
          {
            localObject1 = "FragmentManager";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("BSE ").append(localBackStackRecord).append(" set remove fragment #");
            arrayOfInt = this.mOps;
            i2 = arrayOfInt[i1];
            localObject2 = i2;
            Log.v((String)localObject1, (String)localObject2);
          }
          localObject1 = paramFragmentManagerImpl.mActive;
          localObject2 = this.mOps;
          j = i1 + 1;
          int i6 = localObject2[i1];
          Fragment localFragment2 = (Fragment)((ArrayList)localObject1).get(i6);
          localObject1 = localOp.removed;
          ((ArrayList)localObject1).add(localFragment2);
          i5 += 1;
          i1 = j;
        }
        boolean bool2 = false;
        localObject1 = null;
      }
      j = i1;
      localBackStackRecord.addOp(localOp);
    }
    int n = this.mTransition;
    localBackStackRecord.mTransition = n;
    n = this.mTransitionStyle;
    localBackStackRecord.mTransitionStyle = n;
    Object localObject1 = this.mName;
    localBackStackRecord.mName = ((String)localObject1);
    n = this.mIndex;
    localBackStackRecord.mIndex = n;
    localBackStackRecord.mAddToBackStack = i;
    n = this.mBreadCrumbTitleRes;
    localBackStackRecord.mBreadCrumbTitleRes = n;
    localObject1 = this.mBreadCrumbTitleText;
    localBackStackRecord.mBreadCrumbTitleText = ((CharSequence)localObject1);
    n = this.mBreadCrumbShortTitleRes;
    localBackStackRecord.mBreadCrumbShortTitleRes = n;
    localObject1 = this.mBreadCrumbShortTitleText;
    localBackStackRecord.mBreadCrumbShortTitleText = ((CharSequence)localObject1);
    localBackStackRecord.bumpBackStackNesting(i);
    return localBackStackRecord;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.mOps;
    paramParcel.writeIntArray((int[])localObject);
    int i = this.mTransition;
    paramParcel.writeInt(i);
    i = this.mTransitionStyle;
    paramParcel.writeInt(i);
    localObject = this.mName;
    paramParcel.writeString((String)localObject);
    i = this.mIndex;
    paramParcel.writeInt(i);
    i = this.mBreadCrumbTitleRes;
    paramParcel.writeInt(i);
    TextUtils.writeToParcel(this.mBreadCrumbTitleText, paramParcel, 0);
    i = this.mBreadCrumbShortTitleRes;
    paramParcel.writeInt(i);
    TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, paramParcel, 0);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/BackStackState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */