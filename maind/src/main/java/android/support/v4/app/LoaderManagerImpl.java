package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl
  extends LoaderManager
{
  static boolean DEBUG = false;
  static final String TAG = "LoaderManager";
  FragmentActivity mActivity;
  boolean mCreatingLoader;
  final SparseArrayCompat mInactiveLoaders;
  final SparseArrayCompat mLoaders;
  boolean mRetaining;
  boolean mRetainingStarted;
  boolean mStarted;
  
  LoaderManagerImpl(FragmentActivity paramFragmentActivity, boolean paramBoolean)
  {
    SparseArrayCompat localSparseArrayCompat = new android/support/v4/util/SparseArrayCompat;
    localSparseArrayCompat.<init>();
    this.mLoaders = localSparseArrayCompat;
    localSparseArrayCompat = new android/support/v4/util/SparseArrayCompat;
    localSparseArrayCompat.<init>();
    this.mInactiveLoaders = localSparseArrayCompat;
    this.mActivity = paramFragmentActivity;
    this.mStarted = paramBoolean;
  }
  
  private LoaderManagerImpl.LoaderInfo createAndInstallLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks paramLoaderCallbacks)
  {
    boolean bool = true;
    try
    {
      this.mCreatingLoader = bool;
      LoaderManagerImpl.LoaderInfo localLoaderInfo = createLoader(paramInt, paramBundle, paramLoaderCallbacks);
      installLoader(localLoaderInfo);
      return localLoaderInfo;
    }
    finally
    {
      this.mCreatingLoader = false;
    }
  }
  
  private LoaderManagerImpl.LoaderInfo createLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks paramLoaderCallbacks)
  {
    LoaderManagerImpl.LoaderInfo localLoaderInfo = new android/support/v4/app/LoaderManagerImpl$LoaderInfo;
    localLoaderInfo.<init>(this, paramInt, paramBundle, paramLoaderCallbacks);
    Loader localLoader = paramLoaderCallbacks.onCreateLoader(paramInt, paramBundle);
    localLoaderInfo.mLoader = localLoader;
    return localLoaderInfo;
  }
  
  public void destroyLoader(int paramInt)
  {
    boolean bool = this.mCreatingLoader;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Called while creating a loader");
      throw ((Throwable)localObject1);
    }
    bool = DEBUG;
    if (bool)
    {
      localObject1 = "LoaderManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("destroyLoader in ").append(this);
      String str = " of ";
      localObject2 = str + paramInt;
      Log.v((String)localObject1, (String)localObject2);
    }
    Object localObject1 = this.mLoaders;
    int i = ((SparseArrayCompat)localObject1).indexOfKey(paramInt);
    LoaderManagerImpl.LoaderInfo localLoaderInfo;
    if (i >= 0)
    {
      localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i);
      localObject1 = this.mLoaders;
      ((SparseArrayCompat)localObject1).removeAt(i);
      localLoaderInfo.destroy();
    }
    localObject1 = this.mInactiveLoaders;
    i = ((SparseArrayCompat)localObject1).indexOfKey(paramInt);
    if (i >= 0)
    {
      localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.mInactiveLoaders.valueAt(i);
      localObject1 = this.mInactiveLoaders;
      ((SparseArrayCompat)localObject1).removeAt(i);
      localLoaderInfo.destroy();
    }
    localObject1 = this.mActivity;
    if (localObject1 != null)
    {
      bool = hasRunningLoaders();
      if (!bool)
      {
        localObject1 = this.mActivity.mFragments;
        ((FragmentManagerImpl)localObject1).startPendingDeferredFragments();
      }
    }
  }
  
  void doDestroy()
  {
    boolean bool1 = this.mRetaining;
    Object localObject2;
    String str;
    if (!bool1)
    {
      bool1 = DEBUG;
      if (bool1)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Destroying Active in ";
        localObject2 = str + this;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = this.mLoaders;
      int i = ((SparseArrayCompat)localObject1).size();
      k = i + -1;
      while (k >= 0)
      {
        localObject1 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(k);
        ((LoaderManagerImpl.LoaderInfo)localObject1).destroy();
        k += -1;
      }
    }
    boolean bool2 = DEBUG;
    if (bool2)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Destroying Inactive in ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    Object localObject1 = this.mInactiveLoaders;
    int j = ((SparseArrayCompat)localObject1).size();
    int k = j + -1;
    while (k >= 0)
    {
      localObject1 = (LoaderManagerImpl.LoaderInfo)this.mInactiveLoaders.valueAt(k);
      ((LoaderManagerImpl.LoaderInfo)localObject1).destroy();
      k += -1;
    }
    this.mInactiveLoaders.clear();
  }
  
  void doReportNextStart()
  {
    Object localObject = this.mLoaders;
    int i = ((SparseArrayCompat)localObject).size();
    int j = i + -1;
    while (j >= 0)
    {
      localObject = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(j);
      boolean bool = true;
      ((LoaderManagerImpl.LoaderInfo)localObject).mReportNextStart = bool;
      j += -1;
    }
  }
  
  void doReportStart()
  {
    Object localObject = this.mLoaders;
    int i = ((SparseArrayCompat)localObject).size();
    int j = i + -1;
    while (j >= 0)
    {
      localObject = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(j);
      ((LoaderManagerImpl.LoaderInfo)localObject).reportStart();
      j += -1;
    }
  }
  
  void doRetain()
  {
    boolean bool = DEBUG;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Retaining in ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = this.mStarted;
    if (!bool)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("here");
      localRuntimeException.fillInStackTrace();
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Called doRetain when not started: ";
      localObject2 = str + this;
      Log.w((String)localObject1, (String)localObject2, localRuntimeException);
    }
    for (;;)
    {
      return;
      this.mRetaining = true;
      this.mStarted = false;
      localObject1 = this.mLoaders;
      int i = ((SparseArrayCompat)localObject1).size();
      int j = i + -1;
      while (j >= 0)
      {
        localObject1 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(j);
        ((LoaderManagerImpl.LoaderInfo)localObject1).retain();
        j += -1;
      }
    }
  }
  
  void doStart()
  {
    boolean bool = DEBUG;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Starting in ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = this.mStarted;
    if (bool)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("here");
      localRuntimeException.fillInStackTrace();
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Called doStart when already started: ";
      localObject2 = str + this;
      Log.w((String)localObject1, (String)localObject2, localRuntimeException);
    }
    for (;;)
    {
      return;
      this.mStarted = true;
      localObject1 = this.mLoaders;
      int i = ((SparseArrayCompat)localObject1).size();
      int j = i + -1;
      while (j >= 0)
      {
        localObject1 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(j);
        ((LoaderManagerImpl.LoaderInfo)localObject1).start();
        j += -1;
      }
    }
  }
  
  void doStop()
  {
    boolean bool = DEBUG;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Stopping in ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = this.mStarted;
    if (!bool)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("here");
      localRuntimeException.fillInStackTrace();
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Called doStop when not started: ";
      localObject2 = str + this;
      Log.w((String)localObject1, (String)localObject2, localRuntimeException);
    }
    for (;;)
    {
      return;
      localObject1 = this.mLoaders;
      int i = ((SparseArrayCompat)localObject1).size();
      int j = i + -1;
      while (j >= 0)
      {
        localObject1 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(j);
        ((LoaderManagerImpl.LoaderInfo)localObject1).stop();
        j += -1;
      }
      i = 0;
      localObject1 = null;
      this.mStarted = false;
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject = this.mLoaders;
    int i = ((SparseArrayCompat)localObject).size();
    String str1;
    String str2;
    int j;
    LoaderManagerImpl.LoaderInfo localLoaderInfo;
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str1 = "    ";
      localObject = ((StringBuilder)localObject).append(str1);
      str2 = ((StringBuilder)localObject).toString();
      j = 0;
      for (;;)
      {
        localObject = this.mLoaders;
        i = ((SparseArrayCompat)localObject).size();
        if (j >= i) {
          break;
        }
        localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        i = this.mLoaders.keyAt(j);
        paramPrintWriter.print(i);
        paramPrintWriter.print(": ");
        localObject = localLoaderInfo.toString();
        paramPrintWriter.println((String)localObject);
        localLoaderInfo.dump(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        j += 1;
      }
    }
    localObject = this.mInactiveLoaders;
    i = ((SparseArrayCompat)localObject).size();
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str1 = "    ";
      localObject = ((StringBuilder)localObject).append(str1);
      str2 = ((StringBuilder)localObject).toString();
      j = 0;
      for (;;)
      {
        localObject = this.mInactiveLoaders;
        i = ((SparseArrayCompat)localObject).size();
        if (j >= i) {
          break;
        }
        localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.mInactiveLoaders.valueAt(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        i = this.mInactiveLoaders.keyAt(j);
        paramPrintWriter.print(i);
        paramPrintWriter.print(": ");
        localObject = localLoaderInfo.toString();
        paramPrintWriter.println((String)localObject);
        localLoaderInfo.dump(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        j += 1;
      }
    }
  }
  
  void finishRetain()
  {
    boolean bool = this.mRetaining;
    if (bool)
    {
      bool = DEBUG;
      if (bool)
      {
        localObject1 = "LoaderManager";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "Finished Retaining in ";
        localObject2 = str + this;
        Log.v((String)localObject1, (String)localObject2);
      }
      this.mRetaining = false;
      Object localObject1 = this.mLoaders;
      int i = ((SparseArrayCompat)localObject1).size();
      int j = i + -1;
      while (j >= 0)
      {
        localObject1 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(j);
        ((LoaderManagerImpl.LoaderInfo)localObject1).finishRetain();
        j += -1;
      }
    }
  }
  
  public Loader getLoader(int paramInt)
  {
    boolean bool = this.mCreatingLoader;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Called while creating a loader");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mLoaders;
    LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)((SparseArrayCompat)localObject).get(paramInt);
    if (localLoaderInfo != null)
    {
      localObject = localLoaderInfo.mPendingLoader;
      if (localObject != null) {
        localObject = localLoaderInfo.mPendingLoader.mLoader;
      }
    }
    for (;;)
    {
      return (Loader)localObject;
      localObject = localLoaderInfo.mLoader;
      continue;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean hasRunningLoaders()
  {
    boolean bool1 = false;
    SparseArrayCompat localSparseArrayCompat = this.mLoaders;
    int i = localSparseArrayCompat.size();
    int j = 0;
    if (j < i)
    {
      localSparseArrayCompat = this.mLoaders;
      LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)localSparseArrayCompat.valueAt(j);
      boolean bool2 = localLoaderInfo.mStarted;
      if (bool2)
      {
        bool2 = localLoaderInfo.mDeliveredData;
        if (!bool2) {
          bool2 = true;
        }
      }
      for (;;)
      {
        bool1 |= bool2;
        j += 1;
        break;
        bool2 = false;
        localSparseArrayCompat = null;
      }
    }
    return bool1;
  }
  
  public Loader initLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks paramLoaderCallbacks)
  {
    boolean bool = this.mCreatingLoader;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Called while creating a loader");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mLoaders;
    LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)((SparseArrayCompat)localObject1).get(paramInt);
    bool = DEBUG;
    Object localObject2;
    String str;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("initLoader in ").append(this);
      str = ": args=";
      localObject2 = str + paramBundle;
      Log.v((String)localObject1, (String)localObject2);
    }
    if (localLoaderInfo == null)
    {
      localLoaderInfo = createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks);
      bool = DEBUG;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "  Created new loader ";
        localObject2 = str + localLoaderInfo;
        Log.v((String)localObject1, (String)localObject2);
      }
    }
    for (;;)
    {
      bool = localLoaderInfo.mHaveData;
      if (bool)
      {
        bool = this.mStarted;
        if (bool)
        {
          localObject1 = localLoaderInfo.mLoader;
          localObject2 = localLoaderInfo.mData;
          localLoaderInfo.callOnLoadFinished((Loader)localObject1, localObject2);
        }
      }
      return localLoaderInfo.mLoader;
      bool = DEBUG;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "  Re-using existing loader ";
        localObject2 = str + localLoaderInfo;
        Log.v((String)localObject1, (String)localObject2);
      }
      localLoaderInfo.mCallbacks = paramLoaderCallbacks;
    }
  }
  
  void installLoader(LoaderManagerImpl.LoaderInfo paramLoaderInfo)
  {
    SparseArrayCompat localSparseArrayCompat = this.mLoaders;
    int i = paramLoaderInfo.mId;
    localSparseArrayCompat.put(i, paramLoaderInfo);
    boolean bool = this.mStarted;
    if (bool) {
      paramLoaderInfo.start();
    }
  }
  
  public Loader restartLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks paramLoaderCallbacks)
  {
    boolean bool = this.mCreatingLoader;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Called while creating a loader");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mLoaders;
    LoaderManagerImpl.LoaderInfo localLoaderInfo1 = (LoaderManagerImpl.LoaderInfo)((SparseArrayCompat)localObject1).get(paramInt);
    bool = DEBUG;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("restartLoader in ").append(this);
      localObject3 = ": args=";
      localObject2 = (String)localObject3 + paramBundle;
      Log.v((String)localObject1, (String)localObject2);
    }
    if (localLoaderInfo1 != null)
    {
      localObject1 = this.mInactiveLoaders;
      LoaderManagerImpl.LoaderInfo localLoaderInfo2 = (LoaderManagerImpl.LoaderInfo)((SparseArrayCompat)localObject1).get(paramInt);
      if (localLoaderInfo2 == null) {
        break label464;
      }
      bool = localLoaderInfo1.mHaveData;
      if (!bool) {
        break label257;
      }
      bool = DEBUG;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "  Removing last inactive loader: ";
        localObject2 = (String)localObject3 + localLoaderInfo1;
        Log.v((String)localObject1, (String)localObject2);
      }
      bool = false;
      localLoaderInfo2.mDeliveredData = false;
      localLoaderInfo2.destroy();
      localLoaderInfo1.mLoader.abandon();
      localObject1 = this.mInactiveLoaders;
      ((SparseArrayCompat)localObject1).put(paramInt, localLoaderInfo1);
    }
    for (;;)
    {
      localLoaderInfo1 = createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks);
      for (localObject1 = localLoaderInfo1.mLoader;; localObject1 = localLoaderInfo1.mPendingLoader.mLoader)
      {
        return (Loader)localObject1;
        label257:
        bool = localLoaderInfo1.mStarted;
        if (!bool)
        {
          bool = DEBUG;
          if (bool)
          {
            localObject1 = "LoaderManager";
            localObject2 = "  Current loader is stopped; replacing";
            Log.v((String)localObject1, (String)localObject2);
          }
          localObject1 = this.mLoaders;
          ((SparseArrayCompat)localObject1).put(paramInt, null);
          localLoaderInfo1.destroy();
          break;
        }
        localObject1 = localLoaderInfo1.mPendingLoader;
        if (localObject1 != null)
        {
          bool = DEBUG;
          if (bool)
          {
            localObject1 = "LoaderManager";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("  Removing pending loader: ");
            localObject3 = localLoaderInfo1.mPendingLoader;
            localObject2 = localObject3;
            Log.v((String)localObject1, (String)localObject2);
          }
          localObject1 = localLoaderInfo1.mPendingLoader;
          ((LoaderManagerImpl.LoaderInfo)localObject1).destroy();
          localLoaderInfo1.mPendingLoader = null;
        }
        bool = DEBUG;
        if (bool)
        {
          localObject1 = "LoaderManager";
          localObject2 = "  Enqueuing as new pending loader";
          Log.v((String)localObject1, (String)localObject2);
        }
        localObject1 = createLoader(paramInt, paramBundle, paramLoaderCallbacks);
        localLoaderInfo1.mPendingLoader = ((LoaderManagerImpl.LoaderInfo)localObject1);
      }
      label464:
      bool = DEBUG;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "  Making last loader inactive: ";
        localObject2 = (String)localObject3 + localLoaderInfo1;
        Log.v((String)localObject1, (String)localObject2);
      }
      localLoaderInfo1.mLoader.abandon();
      localObject1 = this.mInactiveLoaders;
      ((SparseArrayCompat)localObject1).put(paramInt, localLoaderInfo1);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("LoaderManager{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" in ");
    DebugUtils.buildShortClassTag(this.mActivity, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  void updateActivity(FragmentActivity paramFragmentActivity)
  {
    this.mActivity = paramFragmentActivity;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/LoaderManagerImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */