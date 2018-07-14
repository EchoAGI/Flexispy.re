package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment
  extends Fragment
{
  static final int INTERNAL_EMPTY_ID = 16711681;
  static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
  static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
  ListAdapter mAdapter;
  CharSequence mEmptyText;
  View mEmptyView;
  private final Handler mHandler;
  ListView mList;
  View mListContainer;
  boolean mListShown;
  private final AdapterView.OnItemClickListener mOnClickListener;
  View mProgressContainer;
  private final Runnable mRequestFocus;
  TextView mStandardEmptyView;
  
  public ListFragment()
  {
    Object localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.mHandler = ((Handler)localObject);
    localObject = new android/support/v4/app/ListFragment$1;
    ((ListFragment.1)localObject).<init>(this);
    this.mRequestFocus = ((Runnable)localObject);
    localObject = new android/support/v4/app/ListFragment$2;
    ((ListFragment.2)localObject).<init>(this);
    this.mOnClickListener = ((AdapterView.OnItemClickListener)localObject);
  }
  
  private void ensureList()
  {
    Object localObject1 = this.mList;
    if (localObject1 != null) {
      return;
    }
    Object localObject2 = getView();
    if (localObject2 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Content view not yet created");
      throw ((Throwable)localObject1);
    }
    boolean bool1 = localObject2 instanceof ListView;
    label50:
    Object localObject3;
    if (bool1)
    {
      localObject2 = (ListView)localObject2;
      this.mList = ((ListView)localObject2);
      bool1 = true;
      this.mListShown = bool1;
      localObject1 = this.mList;
      localObject3 = this.mOnClickListener;
      ((ListView)localObject1).setOnItemClickListener((AdapterView.OnItemClickListener)localObject3);
      localObject1 = this.mAdapter;
      if (localObject1 == null) {
        break label342;
      }
      ListAdapter localListAdapter = this.mAdapter;
      bool1 = false;
      localObject1 = null;
      this.mAdapter = null;
      setListAdapter(localListAdapter);
    }
    for (;;)
    {
      localObject1 = this.mHandler;
      localObject3 = this.mRequestFocus;
      ((Handler)localObject1).post((Runnable)localObject3);
      break;
      int i = 16711681;
      localObject1 = (TextView)((View)localObject2).findViewById(i);
      this.mStandardEmptyView = ((TextView)localObject1);
      localObject1 = this.mStandardEmptyView;
      if (localObject1 == null)
      {
        i = 16908292;
        localObject1 = ((View)localObject2).findViewById(i);
        this.mEmptyView = ((View)localObject1);
      }
      for (;;)
      {
        localObject1 = ((View)localObject2).findViewById(16711682);
        this.mProgressContainer = ((View)localObject1);
        localObject1 = ((View)localObject2).findViewById(16711683);
        this.mListContainer = ((View)localObject1);
        localObject4 = ((View)localObject2).findViewById(16908298);
        boolean bool2 = localObject4 instanceof ListView;
        if (bool2) {
          break label254;
        }
        if (localObject4 != null) {
          break;
        }
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        throw ((Throwable)localObject1);
        localObject1 = this.mStandardEmptyView;
        int j = 8;
        ((TextView)localObject1).setVisibility(j);
      }
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
      throw ((Throwable)localObject1);
      label254:
      Object localObject4 = (ListView)localObject4;
      this.mList = ((ListView)localObject4);
      localObject1 = this.mEmptyView;
      if (localObject1 != null)
      {
        localObject1 = this.mList;
        localObject3 = this.mEmptyView;
        ((ListView)localObject1).setEmptyView((View)localObject3);
        break label50;
      }
      localObject1 = this.mEmptyText;
      if (localObject1 == null) {
        break label50;
      }
      localObject1 = this.mStandardEmptyView;
      localObject3 = this.mEmptyText;
      ((TextView)localObject1).setText((CharSequence)localObject3);
      localObject1 = this.mList;
      localObject3 = this.mStandardEmptyView;
      ((ListView)localObject1).setEmptyView((View)localObject3);
      break label50;
      label342:
      localObject1 = this.mProgressContainer;
      if (localObject1 != null) {
        setListShown(false, false);
      }
    }
  }
  
  private void setListShown(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 17432577;
    int j = 17432576;
    int k = 8;
    ensureList();
    Object localObject = this.mProgressContainer;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Can't be used with a custom content view");
      throw ((Throwable)localObject);
    }
    boolean bool = this.mListShown;
    if (bool == paramBoolean1) {
      return;
    }
    this.mListShown = paramBoolean1;
    Animation localAnimation;
    if (paramBoolean1)
    {
      if (paramBoolean2)
      {
        localObject = this.mProgressContainer;
        localAnimation = AnimationUtils.loadAnimation(getActivity(), i);
        ((View)localObject).startAnimation(localAnimation);
        localObject = this.mListContainer;
        localAnimation = AnimationUtils.loadAnimation(getActivity(), j);
        ((View)localObject).startAnimation(localAnimation);
      }
      for (;;)
      {
        this.mProgressContainer.setVisibility(k);
        localObject = this.mListContainer;
        ((View)localObject).setVisibility(0);
        break;
        this.mProgressContainer.clearAnimation();
        localObject = this.mListContainer;
        ((View)localObject).clearAnimation();
      }
    }
    if (paramBoolean2)
    {
      localObject = this.mProgressContainer;
      localAnimation = AnimationUtils.loadAnimation(getActivity(), j);
      ((View)localObject).startAnimation(localAnimation);
      localObject = this.mListContainer;
      localAnimation = AnimationUtils.loadAnimation(getActivity(), i);
      ((View)localObject).startAnimation(localAnimation);
    }
    for (;;)
    {
      this.mProgressContainer.setVisibility(0);
      localObject = this.mListContainer;
      ((View)localObject).setVisibility(k);
      break;
      this.mProgressContainer.clearAnimation();
      localObject = this.mListContainer;
      ((View)localObject).clearAnimation();
    }
  }
  
  public ListAdapter getListAdapter()
  {
    return this.mAdapter;
  }
  
  public ListView getListView()
  {
    ensureList();
    return this.mList;
  }
  
  public long getSelectedItemId()
  {
    ensureList();
    return this.mList.getSelectedItemId();
  }
  
  public int getSelectedItemPosition()
  {
    ensureList();
    return this.mList.getSelectedItemPosition();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int i = 17;
    int j = -2;
    int k = -1;
    FragmentActivity localFragmentActivity = getActivity();
    FrameLayout localFrameLayout1 = new android/widget/FrameLayout;
    localFrameLayout1.<init>(localFragmentActivity);
    LinearLayout localLinearLayout = new android/widget/LinearLayout;
    localLinearLayout.<init>(localFragmentActivity);
    localLinearLayout.setId(16711682);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setVisibility(8);
    localLinearLayout.setGravity(i);
    ProgressBar localProgressBar = new android/widget/ProgressBar;
    localProgressBar.<init>(localFragmentActivity, null, 16842874);
    Object localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(j, j);
    localLinearLayout.addView(localProgressBar, (ViewGroup.LayoutParams)localObject);
    localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(k, k);
    localFrameLayout1.addView(localLinearLayout, (ViewGroup.LayoutParams)localObject);
    FrameLayout localFrameLayout2 = new android/widget/FrameLayout;
    localFrameLayout2.<init>(localFragmentActivity);
    localFrameLayout2.setId(16711683);
    TextView localTextView = new android/widget/TextView;
    localObject = getActivity();
    localTextView.<init>((Context)localObject);
    localTextView.setId(16711681);
    localTextView.setGravity(i);
    localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(k, k);
    localFrameLayout2.addView(localTextView, (ViewGroup.LayoutParams)localObject);
    ListView localListView = new android/widget/ListView;
    localObject = getActivity();
    localListView.<init>((Context)localObject);
    localListView.setId(16908298);
    localListView.setDrawSelectorOnTop(false);
    localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(k, k);
    localFrameLayout2.addView(localListView, (ViewGroup.LayoutParams)localObject);
    localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(k, k);
    localFrameLayout1.addView(localFrameLayout2, (ViewGroup.LayoutParams)localObject);
    localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(k, k);
    localFrameLayout1.setLayoutParams((ViewGroup.LayoutParams)localObject);
    return localFrameLayout1;
  }
  
  public void onDestroyView()
  {
    Handler localHandler = this.mHandler;
    Runnable localRunnable = this.mRequestFocus;
    localHandler.removeCallbacks(localRunnable);
    this.mList = null;
    this.mListShown = false;
    this.mListContainer = null;
    this.mProgressContainer = null;
    this.mEmptyView = null;
    this.mStandardEmptyView = null;
    super.onDestroyView();
  }
  
  public void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong) {}
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    ensureList();
  }
  
  public void setEmptyText(CharSequence paramCharSequence)
  {
    ensureList();
    Object localObject = this.mStandardEmptyView;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Can't be used with a custom content view");
      throw ((Throwable)localObject);
    }
    this.mStandardEmptyView.setText(paramCharSequence);
    localObject = this.mEmptyText;
    if (localObject == null)
    {
      localObject = this.mList;
      TextView localTextView = this.mStandardEmptyView;
      ((ListView)localObject).setEmptyView(localTextView);
    }
    this.mEmptyText = paramCharSequence;
  }
  
  public void setListAdapter(ListAdapter paramListAdapter)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    Object localObject = this.mAdapter;
    if (localObject != null) {}
    for (boolean bool3 = bool2;; bool3 = false)
    {
      this.mAdapter = paramListAdapter;
      localObject = this.mList;
      if (localObject != null)
      {
        localObject = this.mList;
        ((ListView)localObject).setAdapter(paramListAdapter);
        boolean bool4 = this.mListShown;
        if ((!bool4) && (!bool3))
        {
          localObject = getView().getWindowToken();
          if (localObject != null) {
            bool1 = bool2;
          }
          setListShown(bool2, bool1);
        }
      }
      return;
    }
  }
  
  public void setListShown(boolean paramBoolean)
  {
    setListShown(paramBoolean, true);
  }
  
  public void setListShownNoAnimation(boolean paramBoolean)
  {
    setListShown(paramBoolean, false);
  }
  
  public void setSelection(int paramInt)
  {
    ensureList();
    this.mList.setSelection(paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ListFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */