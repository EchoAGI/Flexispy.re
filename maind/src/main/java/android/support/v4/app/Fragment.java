package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.util.DebugUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;

public class Fragment
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  static final int ACTIVITY_CREATED = 2;
  static final int CREATED = 1;
  static final int INITIALIZING = 0;
  static final int RESUMED = 5;
  static final int STARTED = 4;
  static final int STOPPED = 3;
  private static final HashMap sClassMap;
  FragmentActivity mActivity;
  boolean mAdded;
  View mAnimatingAway;
  Bundle mArguments;
  int mBackStackNesting;
  boolean mCalled;
  boolean mCheckedForLoaderManager;
  ViewGroup mContainer;
  int mContainerId;
  boolean mDeferStart;
  boolean mDetached;
  int mFragmentId;
  FragmentManagerImpl mFragmentManager;
  boolean mFromLayout;
  boolean mHasMenu;
  boolean mHidden;
  boolean mInLayout;
  int mIndex;
  View mInnerView;
  LoaderManagerImpl mLoaderManager;
  boolean mLoadersStarted;
  boolean mMenuVisible;
  int mNextAnim;
  boolean mRemoving;
  boolean mRestored;
  boolean mResumed;
  boolean mRetainInstance;
  boolean mRetaining;
  Bundle mSavedFragmentState;
  SparseArray mSavedViewState;
  int mState = 0;
  int mStateAfterAnimating;
  String mTag;
  Fragment mTarget;
  int mTargetIndex;
  int mTargetRequestCode;
  boolean mUserVisibleHint;
  View mView;
  String mWho;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    sClassMap = localHashMap;
  }
  
  public Fragment()
  {
    this.mIndex = i;
    this.mTargetIndex = i;
    this.mMenuVisible = bool;
    this.mUserVisibleHint = bool;
  }
  
  public static Fragment instantiate(Context paramContext, String paramString)
  {
    return instantiate(paramContext, paramString, null);
  }
  
  public static Fragment instantiate(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      localObject1 = sClassMap;
      Object localObject2 = ((HashMap)localObject1).get(paramString);
      localObject2 = (Class)localObject2;
      if (localObject2 == null)
      {
        localObject1 = paramContext.getClassLoader();
        localObject2 = ((ClassLoader)localObject1).loadClass(paramString);
        localObject1 = sClassMap;
        ((HashMap)localObject1).put(paramString, localObject2);
      }
      Object localObject3 = ((Class)localObject2).newInstance();
      localObject3 = (Fragment)localObject3;
      if (paramBundle != null)
      {
        localObject1 = localObject3.getClass();
        localObject1 = ((Class)localObject1).getClassLoader();
        paramBundle.setClassLoader((ClassLoader)localObject1);
        ((Fragment)localObject3).mArguments = paramBundle;
      }
      return (Fragment)localObject3;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject1 = new android/support/v4/app/Fragment$InstantiationException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public";
      ((Fragment.InstantiationException)localObject1).<init>((String)localObject4, localClassNotFoundException);
      throw ((Throwable)localObject1);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject1 = new android/support/v4/app/Fragment$InstantiationException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public";
      ((Fragment.InstantiationException)localObject1).<init>((String)localObject4, localInstantiationException);
      throw ((Throwable)localObject1);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject1 = new android/support/v4/app/Fragment$InstantiationException;
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public";
      ((Fragment.InstantiationException)localObject1).<init>((String)localObject4, localIllegalAccessException);
      throw ((Throwable)localObject1);
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    Object localObject1 = Integer.toHexString(this.mFragmentId);
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mContainerId=#");
    localObject1 = Integer.toHexString(this.mContainerId);
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mTag=");
    localObject1 = this.mTag;
    paramPrintWriter.println((String)localObject1);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    int i = this.mState;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mIndex=");
    i = this.mIndex;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mWho=");
    localObject1 = this.mWho;
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mBackStackNesting=");
    i = this.mBackStackNesting;
    paramPrintWriter.println(i);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    boolean bool = this.mAdded;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mRemoving=");
    bool = this.mRemoving;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mResumed=");
    bool = this.mResumed;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mFromLayout=");
    bool = this.mFromLayout;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mInLayout=");
    bool = this.mInLayout;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    bool = this.mHidden;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mDetached=");
    bool = this.mDetached;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mMenuVisible=");
    bool = this.mMenuVisible;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mHasMenu=");
    bool = this.mHasMenu;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    bool = this.mRetainInstance;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mRetaining=");
    bool = this.mRetaining;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mUserVisibleHint=");
    bool = this.mUserVisibleHint;
    paramPrintWriter.println(bool);
    localObject1 = this.mFragmentManager;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      localObject1 = this.mFragmentManager;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mActivity;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mActivity=");
      localObject1 = this.mActivity;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mArguments;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      localObject1 = this.mArguments;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mSavedFragmentState;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      localObject1 = this.mSavedFragmentState;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mSavedViewState;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      localObject1 = this.mSavedViewState;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mTarget;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      localObject1 = this.mTarget;
      paramPrintWriter.print(localObject1);
      localObject1 = " mTargetRequestCode=";
      paramPrintWriter.print((String)localObject1);
      j = this.mTargetRequestCode;
      paramPrintWriter.println(j);
    }
    int j = this.mNextAnim;
    if (j != 0)
    {
      paramPrintWriter.print(paramString);
      localObject1 = "mNextAnim=";
      paramPrintWriter.print((String)localObject1);
      j = this.mNextAnim;
      paramPrintWriter.println(j);
    }
    localObject1 = this.mContainer;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      localObject1 = this.mContainer;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mView;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      localObject1 = this.mView;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mInnerView;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      localObject1 = this.mView;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mAnimatingAway;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      localObject1 = this.mAnimatingAway;
      paramPrintWriter.println(localObject1);
      paramPrintWriter.print(paramString);
      localObject1 = "mStateAfterAnimating=";
      paramPrintWriter.print((String)localObject1);
      j = this.mStateAfterAnimating;
      paramPrintWriter.println(j);
    }
    localObject1 = this.mLoaderManager;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      localObject1 = this.mLoaderManager;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      String str = "  ";
      localObject2 = str;
      ((LoaderManagerImpl)localObject1).dump((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public final FragmentActivity getActivity()
  {
    return this.mActivity;
  }
  
  public final Bundle getArguments()
  {
    return this.mArguments;
  }
  
  public final FragmentManager getFragmentManager()
  {
    return this.mFragmentManager;
  }
  
  public final int getId()
  {
    return this.mFragmentId;
  }
  
  public LayoutInflater getLayoutInflater(Bundle paramBundle)
  {
    return this.mActivity.getLayoutInflater();
  }
  
  public LoaderManager getLoaderManager()
  {
    boolean bool1 = true;
    Object localObject1 = this.mLoaderManager;
    if (localObject1 != null) {}
    for (localObject1 = this.mLoaderManager;; localObject1 = this.mLoaderManager)
    {
      return (LoaderManager)localObject1;
      localObject1 = this.mActivity;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Fragment " + this + " not attached to Activity";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      this.mCheckedForLoaderManager = bool1;
      localObject1 = this.mActivity;
      int i = this.mIndex;
      boolean bool2 = this.mLoadersStarted;
      localObject1 = ((FragmentActivity)localObject1).getLoaderManager(i, bool2, bool1);
      this.mLoaderManager = ((LoaderManagerImpl)localObject1);
    }
  }
  
  public final Resources getResources()
  {
    Object localObject1 = this.mActivity;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return this.mActivity.getResources();
  }
  
  public final boolean getRetainInstance()
  {
    return this.mRetainInstance;
  }
  
  public final String getString(int paramInt)
  {
    return getResources().getString(paramInt);
  }
  
  public final String getString(int paramInt, Object... paramVarArgs)
  {
    return getResources().getString(paramInt, paramVarArgs);
  }
  
  public final String getTag()
  {
    return this.mTag;
  }
  
  public final Fragment getTargetFragment()
  {
    return this.mTarget;
  }
  
  public final int getTargetRequestCode()
  {
    return this.mTargetRequestCode;
  }
  
  public final CharSequence getText(int paramInt)
  {
    return getResources().getText(paramInt);
  }
  
  public boolean getUserVisibleHint()
  {
    return this.mUserVisibleHint;
  }
  
  public View getView()
  {
    return this.mView;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  void initState()
  {
    this.mIndex = -1;
    this.mWho = null;
    this.mAdded = false;
    this.mRemoving = false;
    this.mResumed = false;
    this.mFromLayout = false;
    this.mInLayout = false;
    this.mRestored = false;
    this.mBackStackNesting = 0;
    this.mFragmentManager = null;
    this.mActivity = null;
    this.mFragmentId = 0;
    this.mContainerId = 0;
    this.mTag = null;
    this.mHidden = false;
    this.mDetached = false;
    this.mRetaining = false;
    this.mLoaderManager = null;
    this.mLoadersStarted = false;
    this.mCheckedForLoaderManager = false;
  }
  
  public final boolean isAdded()
  {
    FragmentActivity localFragmentActivity = this.mActivity;
    boolean bool;
    if (localFragmentActivity != null)
    {
      bool = this.mAdded;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localFragmentActivity = null;
    }
  }
  
  public final boolean isDetached()
  {
    return this.mDetached;
  }
  
  public final boolean isHidden()
  {
    return this.mHidden;
  }
  
  final boolean isInBackStack()
  {
    int i = this.mBackStackNesting;
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final boolean isInLayout()
  {
    return this.mInLayout;
  }
  
  public final boolean isRemoving()
  {
    return this.mRemoving;
  }
  
  public final boolean isResumed()
  {
    return this.mResumed;
  }
  
  public final boolean isVisible()
  {
    boolean bool = isAdded();
    Object localObject;
    int i;
    if (bool)
    {
      bool = isHidden();
      if (!bool)
      {
        localObject = this.mView;
        if (localObject != null)
        {
          localObject = this.mView.getWindowToken();
          if (localObject != null)
          {
            localObject = this.mView;
            i = ((View)localObject).getVisibility();
            if (i == 0) {
              i = 1;
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject = null;
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    this.mCalled = true;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void onAttach(Activity paramActivity)
  {
    this.mCalled = true;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.mCalled = true;
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.mCalled = true;
  }
  
  public Animation onCreateAnimation(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    getActivity().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public void onDestroy()
  {
    int i = 1;
    this.mCalled = i;
    boolean bool1 = this.mCheckedForLoaderManager;
    if (!bool1)
    {
      this.mCheckedForLoaderManager = i;
      localObject = this.mActivity;
      i = this.mIndex;
      boolean bool2 = this.mLoadersStarted;
      localObject = ((FragmentActivity)localObject).getLoaderManager(i, bool2, false);
      this.mLoaderManager = ((LoaderManagerImpl)localObject);
    }
    Object localObject = this.mLoaderManager;
    if (localObject != null)
    {
      localObject = this.mLoaderManager;
      ((LoaderManagerImpl)localObject).doDestroy();
    }
  }
  
  public void onDestroyOptionsMenu() {}
  
  public void onDestroyView()
  {
    this.mCalled = true;
  }
  
  public void onDetach()
  {
    this.mCalled = true;
  }
  
  public void onHiddenChanged(boolean paramBoolean) {}
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.mCalled = true;
  }
  
  public void onLowMemory()
  {
    this.mCalled = true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onOptionsMenuClosed(Menu paramMenu) {}
  
  public void onPause()
  {
    this.mCalled = true;
  }
  
  public void onPrepareOptionsMenu(Menu paramMenu) {}
  
  public void onResume()
  {
    this.mCalled = true;
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    int i = 1;
    this.mCalled = i;
    boolean bool1 = this.mLoadersStarted;
    if (!bool1)
    {
      this.mLoadersStarted = i;
      bool1 = this.mCheckedForLoaderManager;
      if (!bool1)
      {
        this.mCheckedForLoaderManager = i;
        localObject = this.mActivity;
        i = this.mIndex;
        boolean bool2 = this.mLoadersStarted;
        localObject = ((FragmentActivity)localObject).getLoaderManager(i, bool2, false);
        this.mLoaderManager = ((LoaderManagerImpl)localObject);
      }
      Object localObject = this.mLoaderManager;
      if (localObject != null)
      {
        localObject = this.mLoaderManager;
        ((LoaderManagerImpl)localObject).doStart();
      }
    }
  }
  
  public void onStop()
  {
    this.mCalled = true;
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {}
  
  void performDestroyView()
  {
    onDestroyView();
    LoaderManagerImpl localLoaderManagerImpl = this.mLoaderManager;
    if (localLoaderManagerImpl != null)
    {
      localLoaderManagerImpl = this.mLoaderManager;
      localLoaderManagerImpl.doReportNextStart();
    }
  }
  
  void performReallyStop()
  {
    boolean bool1 = this.mLoadersStarted;
    Object localObject;
    if (bool1)
    {
      this.mLoadersStarted = false;
      bool1 = this.mCheckedForLoaderManager;
      if (!bool1)
      {
        bool1 = true;
        this.mCheckedForLoaderManager = bool1;
        localObject = this.mActivity;
        int i = this.mIndex;
        boolean bool2 = this.mLoadersStarted;
        localObject = ((FragmentActivity)localObject).getLoaderManager(i, bool2, false);
        this.mLoaderManager = ((LoaderManagerImpl)localObject);
      }
      localObject = this.mLoaderManager;
      if (localObject != null)
      {
        localObject = this.mActivity;
        bool1 = ((FragmentActivity)localObject).mRetaining;
        if (bool1) {
          break label93;
        }
        localObject = this.mLoaderManager;
        ((LoaderManagerImpl)localObject).doStop();
      }
    }
    for (;;)
    {
      return;
      label93:
      localObject = this.mLoaderManager;
      ((LoaderManagerImpl)localObject).doRetain();
    }
  }
  
  void performStart()
  {
    onStart();
    LoaderManagerImpl localLoaderManagerImpl = this.mLoaderManager;
    if (localLoaderManagerImpl != null)
    {
      localLoaderManagerImpl = this.mLoaderManager;
      localLoaderManagerImpl.doReportStart();
    }
  }
  
  void performStop()
  {
    onStop();
  }
  
  public void registerForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(this);
  }
  
  final void restoreViewState()
  {
    Object localObject = this.mSavedViewState;
    if (localObject != null)
    {
      localObject = this.mInnerView;
      SparseArray localSparseArray = this.mSavedViewState;
      ((View)localObject).restoreHierarchyState(localSparseArray);
      localObject = null;
      this.mSavedViewState = null;
    }
  }
  
  public void setArguments(Bundle paramBundle)
  {
    int i = this.mIndex;
    if (i >= 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Fragment already active");
      throw localIllegalStateException;
    }
    this.mArguments = paramBundle;
  }
  
  public void setHasOptionsMenu(boolean paramBoolean)
  {
    boolean bool = this.mHasMenu;
    if (bool != paramBoolean)
    {
      this.mHasMenu = paramBoolean;
      bool = isAdded();
      if (bool)
      {
        bool = isHidden();
        if (!bool)
        {
          FragmentActivity localFragmentActivity = this.mActivity;
          localFragmentActivity.supportInvalidateOptionsMenu();
        }
      }
    }
  }
  
  final void setIndex(int paramInt)
  {
    this.mIndex = paramInt;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("android:fragment:");
    int i = this.mIndex;
    localObject = i;
    this.mWho = ((String)localObject);
  }
  
  public void setInitialSavedState(Fragment.SavedState paramSavedState)
  {
    int i = this.mIndex;
    if (i >= 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Fragment already active");
      throw ((Throwable)localObject);
    }
    if (paramSavedState != null)
    {
      localObject = paramSavedState.mState;
      if (localObject == null) {}
    }
    for (Object localObject = paramSavedState.mState;; localObject = null)
    {
      this.mSavedFragmentState = ((Bundle)localObject);
      return;
      i = 0;
    }
  }
  
  public void setMenuVisibility(boolean paramBoolean)
  {
    boolean bool = this.mMenuVisible;
    if (bool != paramBoolean)
    {
      this.mMenuVisible = paramBoolean;
      bool = this.mHasMenu;
      if (bool)
      {
        bool = isAdded();
        if (bool)
        {
          bool = isHidden();
          if (!bool)
          {
            FragmentActivity localFragmentActivity = this.mActivity;
            localFragmentActivity.supportInvalidateOptionsMenu();
          }
        }
      }
    }
  }
  
  public void setRetainInstance(boolean paramBoolean)
  {
    this.mRetainInstance = paramBoolean;
  }
  
  public void setTargetFragment(Fragment paramFragment, int paramInt)
  {
    this.mTarget = paramFragment;
    this.mTargetRequestCode = paramInt;
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    boolean bool = this.mUserVisibleHint;
    int i;
    FragmentManagerImpl localFragmentManagerImpl;
    if ((!bool) && (paramBoolean))
    {
      i = this.mState;
      int j = 4;
      if (i < j)
      {
        localFragmentManagerImpl = this.mFragmentManager;
        localFragmentManagerImpl.performPendingDeferredStart(this);
      }
    }
    this.mUserVisibleHint = paramBoolean;
    if (!paramBoolean) {
      i = 1;
    }
    for (;;)
    {
      this.mDeferStart = i;
      return;
      i = 0;
      localFragmentManagerImpl = null;
    }
  }
  
  public void startActivity(Intent paramIntent)
  {
    Object localObject1 = this.mActivity;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mActivity.startActivityFromFragment(this, paramIntent, -1);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    Object localObject1 = this.mActivity;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mActivity.startActivityFromFragment(this, paramIntent, paramInt);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    DebugUtils.buildShortClassTag(this, localStringBuilder);
    int i = this.mIndex;
    if (i >= 0)
    {
      str = " #";
      localStringBuilder.append(str);
      i = this.mIndex;
      localStringBuilder.append(i);
    }
    i = this.mFragmentId;
    if (i != 0)
    {
      localStringBuilder.append(" id=0x");
      i = this.mFragmentId;
      str = Integer.toHexString(i);
      localStringBuilder.append(str);
    }
    String str = this.mTag;
    if (str != null)
    {
      localStringBuilder.append(" ");
      str = this.mTag;
      localStringBuilder.append(str);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void unregisterForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/Fragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */