package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter
{
  public static final int POSITION_NONE = 254;
  public static final int POSITION_UNCHANGED = 255;
  private DataSetObservable mObservable;
  
  public PagerAdapter()
  {
    DataSetObservable localDataSetObservable = new android/database/DataSetObservable;
    localDataSetObservable.<init>();
    this.mObservable = localDataSetObservable;
  }
  
  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Required method destroyItem was not overridden");
    throw localUnsupportedOperationException;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    destroyItem(paramViewGroup, paramInt, paramObject);
  }
  
  public void finishUpdate(View paramView) {}
  
  public void finishUpdate(ViewGroup paramViewGroup)
  {
    finishUpdate(paramViewGroup);
  }
  
  public abstract int getCount();
  
  public int getItemPosition(Object paramObject)
  {
    return -1;
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return null;
  }
  
  public float getPageWidth(int paramInt)
  {
    return 1.0F;
  }
  
  public Object instantiateItem(View paramView, int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Required method instantiateItem was not overridden");
    throw localUnsupportedOperationException;
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    return instantiateItem(paramViewGroup, paramInt);
  }
  
  public abstract boolean isViewFromObject(View paramView, Object paramObject);
  
  public void notifyDataSetChanged()
  {
    this.mObservable.notifyChanged();
  }
  
  void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.mObservable.registerObserver(paramDataSetObserver);
  }
  
  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable saveState()
  {
    return null;
  }
  
  public void setPrimaryItem(View paramView, int paramInt, Object paramObject) {}
  
  public void setPrimaryItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    setPrimaryItem(paramViewGroup, paramInt, paramObject);
  }
  
  public void startUpdate(View paramView) {}
  
  public void startUpdate(ViewGroup paramViewGroup)
  {
    startUpdate(paramViewGroup);
  }
  
  void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.mObservable.unregisterObserver(paramDataSetObserver);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/PagerAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */