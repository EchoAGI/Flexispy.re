package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity
  extends Activity
{
  private static final String FRAGMENTS_TAG = "android:support:fragments";
  private static final int HONEYCOMB = 11;
  static final int MSG_REALLY_STOPPED = 1;
  static final int MSG_RESUME_PENDING = 2;
  private static final String TAG = "FragmentActivity";
  SparseArrayCompat mAllLoaderManagers;
  boolean mCheckedForLoaderManager;
  boolean mCreated;
  final FragmentManagerImpl mFragments;
  final Handler mHandler;
  LoaderManagerImpl mLoaderManager;
  boolean mLoadersStarted;
  boolean mOptionsMenuInvalidated;
  boolean mReallyStopped;
  boolean mResumed;
  boolean mRetaining;
  boolean mStopped;
  
  public FragmentActivity()
  {
    Object localObject = new android/support/v4/app/FragmentActivity$1;
    ((FragmentActivity.1)localObject).<init>(this);
    this.mHandler = ((Handler)localObject);
    localObject = new android/support/v4/app/FragmentManagerImpl;
    ((FragmentManagerImpl)localObject).<init>();
    this.mFragments = ((FragmentManagerImpl)localObject);
  }
  
  void doReallyStop(boolean paramBoolean)
  {
    int i = 1;
    boolean bool = this.mReallyStopped;
    if (!bool)
    {
      this.mReallyStopped = i;
      this.mRetaining = paramBoolean;
      Handler localHandler = this.mHandler;
      localHandler.removeMessages(i);
      onReallyStop();
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = Build.VERSION.SDK_INT;
    int k = 11;
    if (i >= k) {}
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    Object localObject1 = Integer.toHexString(System.identityHashCode(this));
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.println(" State:");
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    Object localObject2 = "  ";
    String str1 = (String)localObject2;
    paramPrintWriter.print(str1);
    paramPrintWriter.print("mCreated=");
    boolean bool = this.mCreated;
    paramPrintWriter.print(bool);
    paramPrintWriter.print("mResumed=");
    bool = this.mResumed;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mStopped=");
    bool = this.mStopped;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mReallyStopped=");
    bool = this.mReallyStopped;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(str1);
    paramPrintWriter.print("mLoadersStarted=");
    bool = this.mLoadersStarted;
    paramPrintWriter.println(bool);
    localObject1 = this.mLoaderManager;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      int j = System.identityHashCode(this.mLoaderManager);
      localObject1 = Integer.toHexString(j);
      paramPrintWriter.print((String)localObject1);
      paramPrintWriter.println(":");
      localObject1 = this.mLoaderManager;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      String str2 = "  ";
      localObject2 = str2;
      ((LoaderManagerImpl)localObject1).dump((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.mFragments.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public Object getLastCustomNonConfigurationInstance()
  {
    FragmentActivity.NonConfigurationInstances localNonConfigurationInstances = (FragmentActivity.NonConfigurationInstances)getLastNonConfigurationInstance();
    if (localNonConfigurationInstances != null) {}
    for (Object localObject = localNonConfigurationInstances.custom;; localObject = null) {
      return localObject;
    }
  }
  
  LoaderManagerImpl getLoaderManager(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    SparseArrayCompat localSparseArrayCompat = this.mAllLoaderManagers;
    if (localSparseArrayCompat == null)
    {
      localSparseArrayCompat = new android/support/v4/util/SparseArrayCompat;
      localSparseArrayCompat.<init>();
      this.mAllLoaderManagers = localSparseArrayCompat;
    }
    localSparseArrayCompat = this.mAllLoaderManagers;
    LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)localSparseArrayCompat.get(paramInt);
    if (localLoaderManagerImpl == null) {
      if (paramBoolean2)
      {
        localLoaderManagerImpl = new android/support/v4/app/LoaderManagerImpl;
        localLoaderManagerImpl.<init>(this, paramBoolean1);
        localSparseArrayCompat = this.mAllLoaderManagers;
        localSparseArrayCompat.put(paramInt, localLoaderManagerImpl);
      }
    }
    for (;;)
    {
      return localLoaderManagerImpl;
      localLoaderManagerImpl.updateActivity(this);
    }
  }
  
  public FragmentManager getSupportFragmentManager()
  {
    return this.mFragments;
  }
  
  public LoaderManager getSupportLoaderManager()
  {
    boolean bool1 = true;
    LoaderManagerImpl localLoaderManagerImpl = this.mLoaderManager;
    if (localLoaderManagerImpl != null) {}
    for (localLoaderManagerImpl = this.mLoaderManager;; localLoaderManagerImpl = this.mLoaderManager)
    {
      return localLoaderManagerImpl;
      this.mCheckedForLoaderManager = bool1;
      int i = -1;
      boolean bool2 = this.mLoadersStarted;
      localLoaderManagerImpl = getLoaderManager(i, bool2, bool1);
      this.mLoaderManager = localLoaderManagerImpl;
    }
  }
  
  void invalidateSupportFragmentIndex(int paramInt)
  {
    SparseArrayCompat localSparseArrayCompat = this.mAllLoaderManagers;
    if (localSparseArrayCompat != null)
    {
      localSparseArrayCompat = this.mAllLoaderManagers;
      LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)localSparseArrayCompat.get(paramInt);
      if (localLoaderManagerImpl != null)
      {
        boolean bool = localLoaderManagerImpl.mRetaining;
        if (!bool)
        {
          localLoaderManagerImpl.doDestroy();
          localSparseArrayCompat = this.mAllLoaderManagers;
          localSparseArrayCompat.remove(paramInt);
        }
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = paramInt1 >> 16;
    Object localObject1;
    int j;
    Object localObject2;
    String str;
    if (i != 0)
    {
      i += -1;
      localObject1 = this.mFragments.mActive;
      if ((localObject1 != null) && (i >= 0))
      {
        localObject1 = this.mFragments.mActive;
        j = ((ArrayList)localObject1).size();
        if (i < j) {}
      }
      else
      {
        localObject1 = "FragmentActivity";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Activity result fragment index out of range: 0x");
        str = Integer.toHexString(paramInt1);
        localObject2 = str;
        Log.w((String)localObject1, (String)localObject2);
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.mFragments.mActive;
      Fragment localFragment = (Fragment)((ArrayList)localObject1).get(i);
      if (localFragment == null)
      {
        localObject1 = "FragmentActivity";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Activity result no fragment exists for index: 0x");
        str = Integer.toHexString(paramInt1);
        localObject2 = str;
        Log.w((String)localObject1, (String)localObject2);
      }
      else
      {
        j = (char)-1 & paramInt1;
        localFragment.onActivityResult(j, paramInt2, paramIntent);
        continue;
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
      }
    }
  }
  
  public void onAttachFragment(Fragment paramFragment) {}
  
  public void onBackPressed()
  {
    FragmentManagerImpl localFragmentManagerImpl = this.mFragments;
    boolean bool = localFragmentManagerImpl.popBackStackImmediate();
    if (!bool) {
      finish();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mFragments.dispatchConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.mFragments.attachActivity(this);
    Object localObject = getLayoutInflater().getFactory();
    if (localObject == null)
    {
      localObject = getLayoutInflater();
      ((LayoutInflater)localObject).setFactory(this);
    }
    super.onCreate(paramBundle);
    FragmentActivity.NonConfigurationInstances localNonConfigurationInstances = (FragmentActivity.NonConfigurationInstances)getLastNonConfigurationInstance();
    if (localNonConfigurationInstances != null)
    {
      localObject = localNonConfigurationInstances.loaders;
      this.mAllLoaderManagers = ((SparseArrayCompat)localObject);
    }
    Parcelable localParcelable;
    FragmentManagerImpl localFragmentManagerImpl;
    if (paramBundle != null)
    {
      localObject = "android:support:fragments";
      localParcelable = paramBundle.getParcelable((String)localObject);
      localFragmentManagerImpl = this.mFragments;
      if (localNonConfigurationInstances == null) {
        break label102;
      }
    }
    label102:
    for (localObject = localNonConfigurationInstances.fragments;; localObject = null)
    {
      localFragmentManagerImpl.restoreAllState(localParcelable, (ArrayList)localObject);
      this.mFragments.dispatchCreate();
      return;
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    boolean bool1;
    if (paramInt == 0)
    {
      bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      FragmentManagerImpl localFragmentManagerImpl = this.mFragments;
      MenuInflater localMenuInflater = getMenuInflater();
      boolean bool2 = localFragmentManagerImpl.dispatchCreateOptionsMenu(paramMenu, localMenuInflater);
      bool1 |= bool2;
      int i = Build.VERSION.SDK_INT;
      int j = 11;
      if (i < j) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = true;
      continue;
      bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
    }
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Fragment localFragment = null;
    int i = 0;
    int j = 1;
    int k = -1;
    Object localObject1 = "fragment";
    boolean bool = ((String)localObject1).equals(paramString);
    if (!bool) {}
    for (localObject1 = super.onCreateView(paramString, paramContext, paramAttributeSet);; localObject1 = localFragment.mView)
    {
      return (View)localObject1;
      String str1 = paramAttributeSet.getAttributeValue(null, "class");
      localObject1 = FragmentActivity.FragmentTag.Fragment;
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1);
      if (str1 == null) {
        str1 = localTypedArray.getString(0);
      }
      int i1 = localTypedArray.getResourceId(j, k);
      int m = 2;
      String str2 = localTypedArray.getString(m);
      localTypedArray.recycle();
      if (0 != 0) {
        i = null.getId();
      }
      Object localObject2;
      String str3;
      if ((i == k) && (i1 == k) && (str2 == null))
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str3 = paramAttributeSet.getPositionDescription();
        localObject2 = str3 + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      if (i1 != k)
      {
        localObject1 = this.mFragments;
        localFragment = ((FragmentManagerImpl)localObject1).findFragmentById(i1);
      }
      if ((localFragment == null) && (str2 != null))
      {
        localObject1 = this.mFragments;
        localFragment = ((FragmentManagerImpl)localObject1).findFragmentByTag(str2);
      }
      if ((localFragment == null) && (i != k))
      {
        localObject1 = this.mFragments;
        localFragment = ((FragmentManagerImpl)localObject1).findFragmentById(i);
      }
      int n = FragmentManagerImpl.DEBUG;
      if (n != 0)
      {
        localObject1 = "FragmentActivity";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("onCreateView: id=0x");
        str3 = Integer.toHexString(i1);
        localObject2 = ((StringBuilder)localObject2).append(str3).append(" fname=").append(str1);
        str3 = " existing=";
        localObject2 = str3 + localFragment;
        Log.v((String)localObject1, (String)localObject2);
      }
      if (localFragment == null)
      {
        localFragment = Fragment.instantiate(this, str1);
        localFragment.mFromLayout = j;
        if (i1 != 0)
        {
          n = i1;
          localFragment.mFragmentId = n;
          localFragment.mContainerId = i;
          localFragment.mTag = str2;
          localFragment.mInLayout = j;
          localObject1 = this.mFragments;
          localFragment.mFragmentManager = ((FragmentManagerImpl)localObject1);
          localObject1 = localFragment.mSavedFragmentState;
          localFragment.onInflate(this, paramAttributeSet, (Bundle)localObject1);
          localObject1 = this.mFragments;
          ((FragmentManagerImpl)localObject1).addFragment(localFragment, j);
        }
      }
      for (;;)
      {
        localObject1 = localFragment.mView;
        if (localObject1 != null) {
          break label702;
        }
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Fragment " + str1 + " did not create a view.";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        n = i;
        break;
        n = localFragment.mInLayout;
        if (n != 0)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str3 = paramAttributeSet.getPositionDescription();
          localObject2 = ((StringBuilder)localObject2).append(str3).append(": Duplicate id 0x");
          str3 = Integer.toHexString(i1);
          localObject2 = ((StringBuilder)localObject2).append(str3).append(", tag ").append(str2).append(", or parent id 0x");
          str3 = Integer.toHexString(i);
          localObject2 = str3 + " with another fragment for " + str1;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        localFragment.mInLayout = j;
        n = localFragment.mRetaining;
        if (n == 0)
        {
          localObject1 = localFragment.mSavedFragmentState;
          localFragment.onInflate(this, paramAttributeSet, (Bundle)localObject1);
        }
        localObject1 = this.mFragments;
        ((FragmentManagerImpl)localObject1).moveToState(localFragment);
      }
      label702:
      if (i1 != 0)
      {
        localObject1 = localFragment.mView;
        ((View)localObject1).setId(i1);
      }
      localObject1 = localFragment.mView.getTag();
      if (localObject1 == null)
      {
        localObject1 = localFragment.mView;
        ((View)localObject1).setTag(str2);
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    doReallyStop(false);
    this.mFragments.dispatchDestroy();
    LoaderManagerImpl localLoaderManagerImpl = this.mLoaderManager;
    if (localLoaderManagerImpl != null)
    {
      localLoaderManagerImpl = this.mLoaderManager;
      localLoaderManagerImpl.doDestroy();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 5;
    if (i < j)
    {
      i = 4;
      if (paramInt == i)
      {
        i = paramKeyEvent.getRepeatCount();
        if (i == 0) {
          onBackPressed();
        }
      }
    }
    boolean bool;
    for (i = 1;; bool = super.onKeyDown(paramInt, paramKeyEvent)) {
      return i;
    }
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.mFragments.dispatchLowMemory();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool = super.onMenuItemSelected(paramInt, paramMenuItem);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      FragmentManagerImpl localFragmentManagerImpl;
      switch (paramInt)
      {
      default: 
        bool = false;
        localFragmentManagerImpl = null;
        break;
      case 0: 
        localFragmentManagerImpl = this.mFragments;
        bool = localFragmentManagerImpl.dispatchOptionsItemSelected(paramMenuItem);
        break;
      case 6: 
        localFragmentManagerImpl = this.mFragments;
        bool = localFragmentManagerImpl.dispatchContextItemSelected(paramMenuItem);
      }
    }
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      FragmentManagerImpl localFragmentManagerImpl = this.mFragments;
      localFragmentManagerImpl.dispatchOptionsMenuClosed(paramMenu);
    }
  }
  
  protected void onPause()
  {
    int i = 2;
    super.onPause();
    this.mResumed = false;
    Handler localHandler = this.mHandler;
    boolean bool = localHandler.hasMessages(i);
    if (bool)
    {
      localHandler = this.mHandler;
      localHandler.removeMessages(i);
      onResumeFragments();
    }
    this.mFragments.dispatchPause();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    onResumeFragments();
    this.mFragments.execPendingActions();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool1 = false;
    if ((paramInt == 0) && (paramMenu != null))
    {
      boolean bool2 = this.mOptionsMenuInvalidated;
      if (bool2)
      {
        this.mOptionsMenuInvalidated = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      boolean bool3 = super.onPreparePanel(paramInt, paramView, paramMenu);
      FragmentManagerImpl localFragmentManagerImpl = this.mFragments;
      bool2 = localFragmentManagerImpl.dispatchPrepareOptionsMenu(paramMenu);
      bool3 |= bool2;
      if (bool3)
      {
        bool2 = paramMenu.hasVisibleItems();
        if (!bool2) {}
      }
    }
    for (bool1 = true;; bool1 = super.onPreparePanel(paramInt, paramView, paramMenu)) {
      return bool1;
    }
  }
  
  void onReallyStop()
  {
    boolean bool = this.mLoadersStarted;
    LoaderManagerImpl localLoaderManagerImpl;
    if (bool)
    {
      bool = false;
      this.mLoadersStarted = false;
      localLoaderManagerImpl = this.mLoaderManager;
      if (localLoaderManagerImpl != null)
      {
        bool = this.mRetaining;
        if (bool) {
          break label51;
        }
        localLoaderManagerImpl = this.mLoaderManager;
        localLoaderManagerImpl.doStop();
      }
    }
    for (;;)
    {
      this.mFragments.dispatchReallyStop();
      return;
      label51:
      localLoaderManagerImpl = this.mLoaderManager;
      localLoaderManagerImpl.doRetain();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.mResumed = true;
    this.mFragments.execPendingActions();
  }
  
  protected void onResumeFragments()
  {
    this.mFragments.dispatchResume();
  }
  
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    SparseArrayCompat localSparseArrayCompat1 = null;
    boolean bool1 = this.mStopped;
    if (bool1)
    {
      bool1 = true;
      doReallyStop(bool1);
    }
    Object localObject1 = onRetainCustomNonConfigurationInstance();
    ArrayList localArrayList = this.mFragments.retainNonConfig();
    int j = 0;
    SparseArrayCompat localSparseArrayCompat2 = this.mAllLoaderManagers;
    if (localSparseArrayCompat2 != null)
    {
      localSparseArrayCompat2 = this.mAllLoaderManagers;
      int i = localSparseArrayCompat2.size();
      int k = i + -1;
      if (k >= 0)
      {
        localSparseArrayCompat2 = this.mAllLoaderManagers;
        LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)localSparseArrayCompat2.valueAt(k);
        boolean bool2 = localLoaderManagerImpl.mRetaining;
        if (bool2) {
          j = 1;
        }
        for (;;)
        {
          k += -1;
          break;
          localLoaderManagerImpl.doDestroy();
          localSparseArrayCompat2 = this.mAllLoaderManagers;
          localSparseArrayCompat2.removeAt(k);
        }
      }
    }
    Object localObject2;
    if ((localArrayList == null) && (j == 0) && (localObject1 == null)) {
      localObject2 = null;
    }
    for (;;)
    {
      return localObject2;
      localObject2 = new android/support/v4/app/FragmentActivity$NonConfigurationInstances;
      ((FragmentActivity.NonConfigurationInstances)localObject2).<init>();
      ((FragmentActivity.NonConfigurationInstances)localObject2).activity = null;
      ((FragmentActivity.NonConfigurationInstances)localObject2).custom = localObject1;
      ((FragmentActivity.NonConfigurationInstances)localObject2).children = null;
      ((FragmentActivity.NonConfigurationInstances)localObject2).fragments = localArrayList;
      localSparseArrayCompat1 = this.mAllLoaderManagers;
      ((FragmentActivity.NonConfigurationInstances)localObject2).loaders = localSparseArrayCompat1;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = this.mFragments;
    Parcelable localParcelable = ((FragmentManagerImpl)localObject).saveAllState();
    if (localParcelable != null)
    {
      localObject = "android:support:fragments";
      paramBundle.putParcelable((String)localObject, localParcelable);
    }
  }
  
  protected void onStart()
  {
    int i = 1;
    super.onStart();
    this.mStopped = false;
    this.mReallyStopped = false;
    Object localObject = this.mHandler;
    ((Handler)localObject).removeMessages(i);
    boolean bool1 = this.mCreated;
    if (!bool1)
    {
      this.mCreated = i;
      localObject = this.mFragments;
      ((FragmentManagerImpl)localObject).dispatchActivityCreated();
    }
    this.mFragments.noteStateNotSaved();
    localObject = this.mFragments;
    ((FragmentManagerImpl)localObject).execPendingActions();
    bool1 = this.mLoadersStarted;
    if (!bool1)
    {
      this.mLoadersStarted = i;
      localObject = this.mLoaderManager;
      if (localObject == null) {
        break label174;
      }
      localObject = this.mLoaderManager;
      ((LoaderManagerImpl)localObject).doStart();
    }
    for (;;)
    {
      this.mCheckedForLoaderManager = i;
      this.mFragments.dispatchStart();
      localObject = this.mAllLoaderManagers;
      if (localObject == null) {
        break;
      }
      localObject = this.mAllLoaderManagers;
      int j = ((SparseArrayCompat)localObject).size();
      int m = j + -1;
      while (m >= 0)
      {
        localObject = this.mAllLoaderManagers;
        LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)((SparseArrayCompat)localObject).valueAt(m);
        localLoaderManagerImpl.finishRetain();
        localLoaderManagerImpl.doReportStart();
        m += -1;
      }
      label174:
      boolean bool2 = this.mCheckedForLoaderManager;
      if (!bool2)
      {
        int k = -1;
        boolean bool3 = this.mLoadersStarted;
        localObject = getLoaderManager(k, bool3, false);
        this.mLoaderManager = ((LoaderManagerImpl)localObject);
      }
    }
  }
  
  protected void onStop()
  {
    int i = 1;
    super.onStop();
    this.mStopped = i;
    this.mHandler.sendEmptyMessage(i);
    this.mFragments.dispatchStop();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    int i = -1;
    if (paramInt != i)
    {
      i = 0xFFFF0000 & paramInt;
      if (i != 0)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("Can only use lower 16 bits for requestCode");
        throw localIllegalArgumentException;
      }
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    int i = -1;
    if (paramInt == i) {
      super.startActivityForResult(paramIntent, i);
    }
    for (;;)
    {
      return;
      i = 0xFFFF0000 & paramInt;
      if (i != 0)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("Can only use lower 16 bits for requestCode");
        throw localIllegalArgumentException;
      }
      i = paramFragment.mIndex + 1 << 16;
      int j = (char)-1 & paramInt;
      i += j;
      super.startActivityForResult(paramIntent, i);
    }
  }
  
  public void supportInvalidateOptionsMenu()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    if (i >= j) {
      ActivityCompatHoneycomb.invalidateOptionsMenu(this);
    }
    for (;;)
    {
      return;
      i = 1;
      this.mOptionsMenuInvalidated = i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */