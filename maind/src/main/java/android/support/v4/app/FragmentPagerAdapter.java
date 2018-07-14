package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class FragmentPagerAdapter
  extends PagerAdapter
{
  private static final boolean DEBUG = false;
  private static final String TAG = "FragmentPagerAdapter";
  private FragmentTransaction mCurTransaction = null;
  private Fragment mCurrentPrimaryItem = null;
  private final FragmentManager mFragmentManager;
  
  public FragmentPagerAdapter(FragmentManager paramFragmentManager)
  {
    this.mFragmentManager = paramFragmentManager;
  }
  
  private static String makeFragmentName(int paramInt, long paramLong)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    FragmentTransaction localFragmentTransaction = this.mCurTransaction;
    if (localFragmentTransaction == null)
    {
      localFragmentTransaction = this.mFragmentManager.beginTransaction();
      this.mCurTransaction = localFragmentTransaction;
    }
    localFragmentTransaction = this.mCurTransaction;
    paramObject = (Fragment)paramObject;
    localFragmentTransaction.detach((Fragment)paramObject);
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
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject = this.mCurTransaction;
    if (localObject == null)
    {
      localObject = this.mFragmentManager.beginTransaction();
      this.mCurTransaction = ((FragmentTransaction)localObject);
    }
    long l = getItemId(paramInt);
    int i = paramViewGroup.getId();
    String str1 = makeFragmentName(i, l);
    localObject = this.mFragmentManager;
    Fragment localFragment = ((FragmentManager)localObject).findFragmentByTag(str1);
    if (localFragment != null)
    {
      localObject = this.mCurTransaction;
      ((FragmentTransaction)localObject).attach(localFragment);
    }
    for (;;)
    {
      localObject = this.mCurrentPrimaryItem;
      if (localFragment != localObject)
      {
        localFragment.setMenuVisibility(false);
        localFragment.setUserVisibleHint(false);
      }
      return localFragment;
      localFragment = getItem(paramInt);
      localObject = this.mCurTransaction;
      int j = paramViewGroup.getId();
      int k = paramViewGroup.getId();
      String str2 = makeFragmentName(k, l);
      ((FragmentTransaction)localObject).add(j, localFragment, str2);
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
  
  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable saveState()
  {
    return null;
  }
  
  public void setPrimaryItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    boolean bool = true;
    Object localObject = paramObject;
    localObject = (Fragment)paramObject;
    Fragment localFragment = this.mCurrentPrimaryItem;
    if (localObject != localFragment)
    {
      localFragment = this.mCurrentPrimaryItem;
      if (localFragment != null)
      {
        this.mCurrentPrimaryItem.setMenuVisibility(false);
        localFragment = this.mCurrentPrimaryItem;
        localFragment.setUserVisibleHint(false);
      }
      if (localObject != null)
      {
        ((Fragment)localObject).setMenuVisibility(bool);
        ((Fragment)localObject).setUserVisibleHint(bool);
      }
      this.mCurrentPrimaryItem = ((Fragment)localObject);
    }
  }
  
  public void startUpdate(ViewGroup paramViewGroup) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentPagerAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */