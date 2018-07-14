package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class LoaderManagerImpl$LoaderInfo
  implements Loader.OnLoadCompleteListener
{
  final Bundle mArgs;
  LoaderManager.LoaderCallbacks mCallbacks;
  Object mData;
  boolean mDeliveredData;
  boolean mDestroyed;
  boolean mHaveData;
  final int mId;
  boolean mListenerRegistered;
  Loader mLoader;
  LoaderInfo mPendingLoader;
  boolean mReportNextStart;
  boolean mRetaining;
  boolean mRetainingStarted;
  boolean mStarted;
  
  public LoaderManagerImpl$LoaderInfo(LoaderManagerImpl paramLoaderManagerImpl, int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks paramLoaderCallbacks)
  {
    this.mId = paramInt;
    this.mArgs = paramBundle;
    this.mCallbacks = paramLoaderCallbacks;
  }
  
  void callOnLoadFinished(Loader paramLoader, Object paramObject)
  {
    Object localObject1 = this.mCallbacks;
    String str1;
    Object localObject3;
    if (localObject1 != null)
    {
      str1 = null;
      localObject1 = this.this$0.mActivity;
      if (localObject1 != null)
      {
        str1 = this.this$0.mActivity.mFragments.mNoTransactionsBecause;
        localObject1 = this.this$0.mActivity.mFragments;
        localObject3 = "onLoadFinished";
        ((FragmentManagerImpl)localObject1).mNoTransactionsBecause = ((String)localObject3);
      }
    }
    try
    {
      boolean bool = LoaderManagerImpl.DEBUG;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = "  onLoadFinished in ";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        localObject3 = ((StringBuilder)localObject3).append(paramLoader);
        str2 = ": ";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        str2 = paramLoader.dataToString(paramObject);
        localObject3 = ((StringBuilder)localObject3).append(str2);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.v((String)localObject1, (String)localObject3);
      }
      localObject1 = this.mCallbacks;
      ((LoaderManager.LoaderCallbacks)localObject1).onLoadFinished(paramLoader, paramObject);
      localObject1 = this.this$0.mActivity;
      if (localObject1 != null)
      {
        localObject1 = this.this$0.mActivity.mFragments;
        ((FragmentManagerImpl)localObject1).mNoTransactionsBecause = str1;
      }
      bool = true;
      this.mDeliveredData = bool;
      return;
    }
    finally
    {
      localObject3 = this.this$0.mActivity;
      if (localObject3 != null)
      {
        localObject3 = this.this$0.mActivity.mFragments;
        ((FragmentManagerImpl)localObject3).mNoTransactionsBecause = str1;
      }
    }
  }
  
  void destroy()
  {
    boolean bool1 = LoaderManagerImpl.DEBUG;
    Object localObject3;
    String str1;
    if (bool1)
    {
      localObject1 = "LoaderManager";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str1 = "  Destroying: ";
      localObject3 = str1 + this;
      Log.v((String)localObject1, (String)localObject3);
    }
    bool1 = true;
    this.mDestroyed = bool1;
    boolean bool2 = this.mDeliveredData;
    this.mDeliveredData = false;
    Object localObject1 = this.mCallbacks;
    String str2;
    if (localObject1 != null)
    {
      localObject1 = this.mLoader;
      if (localObject1 != null)
      {
        bool1 = this.mHaveData;
        if ((bool1) && (bool2))
        {
          bool1 = LoaderManagerImpl.DEBUG;
          if (bool1)
          {
            localObject1 = "LoaderManager";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            str1 = "  Reseting: ";
            localObject3 = str1 + this;
            Log.v((String)localObject1, (String)localObject3);
          }
          str2 = null;
          localObject1 = this.this$0.mActivity;
          if (localObject1 != null)
          {
            str2 = this.this$0.mActivity.mFragments.mNoTransactionsBecause;
            localObject1 = this.this$0.mActivity.mFragments;
            localObject3 = "onLoaderReset";
            ((FragmentManagerImpl)localObject1).mNoTransactionsBecause = ((String)localObject3);
          }
        }
      }
    }
    try
    {
      localObject1 = this.mCallbacks;
      localObject3 = this.mLoader;
      ((LoaderManager.LoaderCallbacks)localObject1).onLoaderReset((Loader)localObject3);
      localObject1 = this.this$0.mActivity;
      if (localObject1 != null)
      {
        localObject1 = this.this$0.mActivity.mFragments;
        ((FragmentManagerImpl)localObject1).mNoTransactionsBecause = str2;
      }
      this.mCallbacks = null;
      this.mData = null;
      this.mHaveData = false;
      localObject1 = this.mLoader;
      if (localObject1 != null)
      {
        bool1 = this.mListenerRegistered;
        if (bool1)
        {
          this.mListenerRegistered = false;
          localObject1 = this.mLoader;
          ((Loader)localObject1).unregisterListener(this);
        }
        localObject1 = this.mLoader;
        ((Loader)localObject1).reset();
      }
      localObject1 = this.mPendingLoader;
      if (localObject1 != null)
      {
        localObject1 = this.mPendingLoader;
        ((LoaderInfo)localObject1).destroy();
      }
      return;
    }
    finally
    {
      localObject3 = this.this$0.mActivity;
      if (localObject3 != null)
      {
        localObject3 = this.this$0.mActivity.mFragments;
        ((FragmentManagerImpl)localObject3).mNoTransactionsBecause = str2;
      }
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    int i = this.mId;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mArgs=");
    Object localObject1 = this.mArgs;
    paramPrintWriter.println(localObject1);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCallbacks=");
    localObject1 = this.mCallbacks;
    paramPrintWriter.println(localObject1);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoader=");
    localObject1 = this.mLoader;
    paramPrintWriter.println(localObject1);
    localObject1 = this.mLoader;
    Object localObject2;
    String str;
    if (localObject1 != null)
    {
      localObject1 = this.mLoader;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = "  ";
      localObject2 = str;
      ((Loader)localObject1).dump((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    boolean bool = this.mHaveData;
    if (!bool)
    {
      bool = this.mDeliveredData;
      if (!bool) {}
    }
    else
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHaveData=");
      bool = this.mHaveData;
      paramPrintWriter.print(bool);
      paramPrintWriter.print("  mDeliveredData=");
      bool = this.mDeliveredData;
      paramPrintWriter.println(bool);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      localObject1 = this.mData;
      paramPrintWriter.println(localObject1);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    bool = this.mStarted;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mReportNextStart=");
    bool = this.mReportNextStart;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mDestroyed=");
    bool = this.mDestroyed;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetaining=");
    bool = this.mRetaining;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mRetainingStarted=");
    bool = this.mRetainingStarted;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mListenerRegistered=");
    bool = this.mListenerRegistered;
    paramPrintWriter.println(bool);
    localObject1 = this.mPendingLoader;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      localObject1 = this.mPendingLoader;
      paramPrintWriter.print(localObject1);
      paramPrintWriter.println(":");
      localObject1 = this.mPendingLoader;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = "  ";
      localObject2 = str;
      ((LoaderInfo)localObject1).dump((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  void finishRetain()
  {
    boolean bool1 = this.mRetaining;
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      bool1 = LoaderManagerImpl.DEBUG;
      if (bool1)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "  Finished Retaining: ";
        localObject2 = str + this;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = null;
      this.mRetaining = false;
      bool1 = this.mStarted;
      boolean bool2 = this.mRetainingStarted;
      if (bool1 != bool2)
      {
        bool1 = this.mStarted;
        if (!bool1) {
          stop();
        }
      }
    }
    bool1 = this.mStarted;
    if (bool1)
    {
      bool1 = this.mHaveData;
      if (bool1)
      {
        bool1 = this.mReportNextStart;
        if (!bool1)
        {
          localObject1 = this.mLoader;
          localObject2 = this.mData;
          callOnLoadFinished((Loader)localObject1, localObject2);
        }
      }
    }
  }
  
  public void onLoadComplete(Loader paramLoader, Object paramObject)
  {
    boolean bool = LoaderManagerImpl.DEBUG;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "onLoadComplete: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = this.mDestroyed;
    if (bool)
    {
      bool = LoaderManagerImpl.DEBUG;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject2 = "  Ignoring load complete -- destroyed";
        Log.v((String)localObject1, (String)localObject2);
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.this$0.mLoaders;
      int i = this.mId;
      localObject1 = ((SparseArrayCompat)localObject1).get(i);
      if (localObject1 != this)
      {
        bool = LoaderManagerImpl.DEBUG;
        if (bool)
        {
          localObject1 = "LoaderManager";
          localObject2 = "  Ignoring load complete -- not active";
          Log.v((String)localObject1, (String)localObject2);
        }
      }
      else
      {
        LoaderInfo localLoaderInfo1 = this.mPendingLoader;
        if (localLoaderInfo1 != null)
        {
          bool = LoaderManagerImpl.DEBUG;
          if (bool)
          {
            localObject1 = "LoaderManager";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            str = "  Switching to pending loader: ";
            localObject2 = str + localLoaderInfo1;
            Log.v((String)localObject1, (String)localObject2);
          }
          this.mPendingLoader = null;
          localObject1 = this.this$0.mLoaders;
          i = this.mId;
          ((SparseArrayCompat)localObject1).put(i, null);
          destroy();
          localObject1 = this.this$0;
          ((LoaderManagerImpl)localObject1).installLoader(localLoaderInfo1);
        }
        else
        {
          localObject1 = this.mData;
          if (localObject1 == paramObject)
          {
            bool = this.mHaveData;
            if (bool) {}
          }
          else
          {
            this.mData = paramObject;
            this.mHaveData = true;
            bool = this.mStarted;
            if (bool) {
              callOnLoadFinished(paramLoader, paramObject);
            }
          }
          localObject1 = this.this$0.mInactiveLoaders;
          i = this.mId;
          LoaderInfo localLoaderInfo2 = (LoaderInfo)((SparseArrayCompat)localObject1).get(i);
          if ((localLoaderInfo2 != null) && (localLoaderInfo2 != this))
          {
            bool = false;
            localLoaderInfo2.mDeliveredData = false;
            localLoaderInfo2.destroy();
            localObject1 = this.this$0.mInactiveLoaders;
            i = this.mId;
            ((SparseArrayCompat)localObject1).remove(i);
          }
          localObject1 = this.this$0.mActivity;
          if (localObject1 != null)
          {
            localObject1 = this.this$0;
            bool = ((LoaderManagerImpl)localObject1).hasRunningLoaders();
            if (!bool)
            {
              localObject1 = this.this$0.mActivity.mFragments;
              ((FragmentManagerImpl)localObject1).startPendingDeferredFragments();
            }
          }
        }
      }
    }
  }
  
  void reportStart()
  {
    boolean bool = this.mStarted;
    if (bool)
    {
      bool = this.mReportNextStart;
      if (bool)
      {
        Loader localLoader = null;
        this.mReportNextStart = false;
        bool = this.mHaveData;
        if (bool)
        {
          localLoader = this.mLoader;
          Object localObject = this.mData;
          callOnLoadFinished(localLoader, localObject);
        }
      }
    }
  }
  
  void retain()
  {
    boolean bool = LoaderManagerImpl.DEBUG;
    if (bool)
    {
      String str1 = "LoaderManager";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "  Retaining: ";
      localObject = str2 + this;
      Log.v(str1, (String)localObject);
    }
    this.mRetaining = true;
    bool = this.mStarted;
    this.mRetainingStarted = bool;
    this.mStarted = false;
    this.mCallbacks = null;
  }
  
  void start()
  {
    boolean bool1 = true;
    boolean bool2 = this.mRetaining;
    if (bool2)
    {
      bool2 = this.mRetainingStarted;
      if (bool2) {
        this.mStarted = bool1;
      }
    }
    for (;;)
    {
      return;
      bool2 = this.mStarted;
      if (!bool2)
      {
        this.mStarted = bool1;
        bool2 = LoaderManagerImpl.DEBUG;
        Object localObject2;
        Object localObject3;
        if (bool2)
        {
          localObject1 = "LoaderManager";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "  Starting: ";
          localObject2 = (String)localObject3 + this;
          Log.v((String)localObject1, (String)localObject2);
        }
        Object localObject1 = this.mLoader;
        int i;
        if (localObject1 == null)
        {
          localObject1 = this.mCallbacks;
          if (localObject1 != null)
          {
            localObject1 = this.mCallbacks;
            i = this.mId;
            localObject3 = this.mArgs;
            localObject1 = ((LoaderManager.LoaderCallbacks)localObject1).onCreateLoader(i, (Bundle)localObject3);
            this.mLoader = ((Loader)localObject1);
          }
        }
        localObject1 = this.mLoader;
        if (localObject1 != null)
        {
          localObject1 = this.mLoader.getClass();
          bool2 = ((Class)localObject1).isMemberClass();
          if (bool2)
          {
            localObject1 = this.mLoader.getClass();
            bool2 = Modifier.isStatic(((Class)localObject1).getModifiers());
            if (!bool2)
            {
              localObject1 = new java/lang/IllegalArgumentException;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("Object returned from onCreateLoader must not be a non-static inner member class: ");
              localObject3 = this.mLoader;
              localObject2 = localObject3;
              ((IllegalArgumentException)localObject1).<init>((String)localObject2);
              throw ((Throwable)localObject1);
            }
          }
          bool2 = this.mListenerRegistered;
          if (!bool2)
          {
            localObject1 = this.mLoader;
            i = this.mId;
            ((Loader)localObject1).registerListener(i, this);
            this.mListenerRegistered = bool1;
          }
          localObject1 = this.mLoader;
          ((Loader)localObject1).startLoading();
        }
      }
    }
  }
  
  void stop()
  {
    boolean bool = LoaderManagerImpl.DEBUG;
    Object localObject1;
    if (bool)
    {
      localObject1 = "LoaderManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "  Stopping: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    this.mStarted = false;
    bool = this.mRetaining;
    if (!bool)
    {
      localObject1 = this.mLoader;
      if (localObject1 != null)
      {
        bool = this.mListenerRegistered;
        if (bool)
        {
          this.mListenerRegistered = false;
          this.mLoader.unregisterListener(this);
          localObject1 = this.mLoader;
          ((Loader)localObject1).stopLoading();
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    localStringBuilder.append("LoaderInfo{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" #");
    int i = this.mId;
    localStringBuilder.append(i);
    localStringBuilder.append(" : ");
    DebugUtils.buildShortClassTag(this.mLoader, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/LoaderManagerImpl$LoaderInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */