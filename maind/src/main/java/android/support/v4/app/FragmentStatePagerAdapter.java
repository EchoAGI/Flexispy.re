package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public abstract class FragmentStatePagerAdapter
  extends PagerAdapter
{
  private static final boolean DEBUG = false;
  private static final String TAG = "FragmentStatePagerAdapter";
  private FragmentTransaction mCurTransaction = null;
  private Fragment mCurrentPrimaryItem;
  private final FragmentManager mFragmentManager;
  private ArrayList mFragments;
  private ArrayList mSavedState;
  
  public FragmentStatePagerAdapter(FragmentManager paramFragmentManager)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mSavedState = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mFragments = localArrayList;
    this.mCurrentPrimaryItem = null;
    this.mFragmentManager = paramFragmentManager;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Object localObject1 = paramObject;
    localObject1 = (Fragment)paramObject;
    Object localObject2 = this.mCurTransaction;
    if (localObject2 == null)
    {
      localObject2 = this.mFragmentManager.beginTransaction();
      this.mCurTransaction = ((FragmentTransaction)localObject2);
    }
    for (;;)
    {
      localObject2 = this.mSavedState;
      int i = ((ArrayList)localObject2).size();
      if (i > paramInt) {
        break;
      }
      localObject2 = this.mSavedState;
      ((ArrayList)localObject2).add(null);
    }
    localObject2 = this.mSavedState;
    Fragment.SavedState localSavedState = this.mFragmentManager.saveFragmentInstanceState((Fragment)localObject1);
    ((ArrayList)localObject2).set(paramInt, localSavedState);
    this.mFragments.set(paramInt, null);
    this.mCurTransaction.remove((Fragment)localObject1);
  }
  
  public void finishUpdate(ViewGroup paramViewGroup)
  {
    Object localObject = this.mCurTransaction;
    if (localObject != null)
    {
      this.mCurTransaction.commitAllowingStateLoss();
      this.mCurTransaction = null;
      localObject = this.mFragmentManager;
      ((FragmentManager)localObject).executePendingTransactions();
    }
  }
  
  public abstract Fragment getItem(int paramInt);
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject1 = this.mFragments;
    int i = ((ArrayList)localObject1).size();
    Object localObject2;
    if (i > paramInt)
    {
      localObject1 = this.mFragments;
      localObject2 = (Fragment)((ArrayList)localObject1).get(paramInt);
      if (localObject2 == null) {}
    }
    for (;;)
    {
      return localObject2;
      localObject1 = this.mCurTransaction;
      if (localObject1 == null)
      {
        localObject1 = this.mFragmentManager.beginTransaction();
        this.mCurTransaction = ((FragmentTransaction)localObject1);
      }
      Fragment localFragment = getItem(paramInt);
      localObject1 = this.mSavedState;
      i = ((ArrayList)localObject1).size();
      if (i > paramInt)
      {
        localObject1 = this.mSavedState;
        Fragment.SavedState localSavedState = (Fragment.SavedState)((ArrayList)localObject1).get(paramInt);
        if (localSavedState != null) {
          localFragment.setInitialSavedState(localSavedState);
        }
      }
      for (;;)
      {
        localObject1 = this.mFragments;
        i = ((ArrayList)localObject1).size();
        if (i > paramInt) {
          break;
        }
        localObject1 = this.mFragments;
        j = 0;
        ((ArrayList)localObject1).add(null);
      }
      i = 0;
      localFragment.setMenuVisibility(false);
      this.mFragments.set(paramInt, localFragment);
      localObject1 = this.mCurTransaction;
      int j = paramViewGroup.getId();
      ((FragmentTransaction)localObject1).add(j, localFragment);
      localObject2 = localFragment;
    }
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    View localView = ((Fragment)paramObject).getView();
    boolean bool;
    if (localView == paramView) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      Object localObject1 = paramParcelable;
      localObject1 = (Bundle)paramParcelable;
      ((Bundle)localObject1).setClassLoader(paramClassLoader);
      Parcelable[] arrayOfParcelable = ((Bundle)localObject1).getParcelableArray("states");
      this.mSavedState.clear();
      Object localObject2 = this.mFragments;
      ((ArrayList)localObject2).clear();
      Object localObject3;
      if (arrayOfParcelable != null)
      {
        int i = 0;
        for (;;)
        {
          int j = arrayOfParcelable.length;
          if (i >= j) {
            break;
          }
          localObject3 = this.mSavedState;
          localObject2 = (Fragment.SavedState)arrayOfParcelable[i];
          ((ArrayList)localObject3).add(localObject2);
          i += 1;
        }
      }
      Set localSet = ((Bundle)localObject1).keySet();
      Iterator localIterator = localSet.iterator();
      for (;;)
      {
        int k = localIterator.hasNext();
        if (k == 0) {
          break;
        }
        String str1 = (String)localIterator.next();
        localObject2 = "f";
        k = str1.startsWith((String)localObject2);
        if (k != 0)
        {
          k = 1;
          int n = Integer.parseInt(str1.substring(k));
          localObject2 = this.mFragmentManager;
          Fragment localFragment = ((FragmentManager)localObject2).getFragment((Bundle)localObject1, str1);
          if (localFragment != null)
          {
            for (;;)
            {
              localObject2 = this.mFragments;
              m = ((ArrayList)localObject2).size();
              if (m > n) {
                break;
              }
              localObject2 = this.mFragments;
              localObject3 = null;
              ((ArrayList)localObject2).add(null);
            }
            int m = 0;
            localFragment.setMenuVisibility(false);
            localObject2 = this.mFragments;
            ((ArrayList)localObject2).set(n, localFragment);
          }
          else
          {
            localObject2 = "FragmentStatePagerAdapter";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            String str2 = "Bad fragment at key ";
            localObject3 = str2 + str1;
            Log.w((String)localObject2, (String)localObject3);
          }
        }
      }
    }
  }
  
  public Parcelable saveState()
  {
    Bundle localBundle = null;
    Object localObject = this.mSavedState;
    int i = ((ArrayList)localObject).size();
    if (i > 0)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      i = this.mSavedState.size();
      Fragment.SavedState[] arrayOfSavedState = new Fragment.SavedState[i];
      this.mSavedState.toArray(arrayOfSavedState);
      localObject = "states";
      localBundle.putParcelableArray((String)localObject, arrayOfSavedState);
    }
    int j = 0;
    for (;;)
    {
      localObject = this.mFragments;
      i = ((ArrayList)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = this.mFragments;
      Fragment localFragment = (Fragment)((ArrayList)localObject).get(j);
      if (localFragment != null)
      {
        if (localBundle == null)
        {
          localBundle = new android/os/Bundle;
          localBundle.<init>();
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str1 = "f";
        String str2 = str1 + j;
        localObject = this.mFragmentManager;
        ((FragmentManager)localObject).putFragment(localBundle, str2, localFragment);
      }
      j += 1;
    }
    return localBundle;
  }
  
  public void setPrimaryItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (Fragment)paramObject;
    Fragment localFragment = this.mCurrentPrimaryItem;
    if (localObject != localFragment)
    {
      localFragment = this.mCurrentPrimaryItem;
      if (localFragment != null)
      {
        localFragment = this.mCurrentPrimaryItem;
        localFragment.setMenuVisibility(false);
      }
      if (localObject != null)
      {
        boolean bool = true;
        ((Fragment)localObject).setMenuVisibility(bool);
      }
      this.mCurrentPrimaryItem = ((Fragment)localObject);
    }
  }
  
  public void startUpdate(ViewGroup paramViewGroup) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentStatePagerAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */