package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class AsyncTaskLoader
  extends Loader
{
  static final boolean DEBUG = false;
  static final String TAG = "AsyncTaskLoader";
  volatile AsyncTaskLoader.LoadTask mCancellingTask;
  Handler mHandler;
  long mLastLoadCompleteTime = -10000L;
  volatile AsyncTaskLoader.LoadTask mTask;
  long mUpdateThrottle;
  
  public AsyncTaskLoader(Context paramContext)
  {
    super(paramContext);
  }
  
  public boolean cancelLoad()
  {
    boolean bool1 = false;
    Object localObject = this.mTask;
    boolean bool2;
    AsyncTaskLoader.LoadTask localLoadTask;
    if (localObject != null)
    {
      localObject = this.mCancellingTask;
      if (localObject == null) {
        break label66;
      }
      localObject = this.mTask;
      bool2 = ((AsyncTaskLoader.LoadTask)localObject).waiting;
      if (bool2)
      {
        this.mTask.waiting = false;
        localObject = this.mHandler;
        localLoadTask = this.mTask;
        ((Handler)localObject).removeCallbacks(localLoadTask);
      }
      this.mTask = null;
    }
    for (;;)
    {
      return bool1;
      label66:
      localObject = this.mTask;
      bool2 = ((AsyncTaskLoader.LoadTask)localObject).waiting;
      if (bool2)
      {
        this.mTask.waiting = false;
        localObject = this.mHandler;
        localLoadTask = this.mTask;
        ((Handler)localObject).removeCallbacks(localLoadTask);
        this.mTask = null;
      }
      else
      {
        localObject = this.mTask;
        bool1 = ((AsyncTaskLoader.LoadTask)localObject).cancel(false);
        if (bool1)
        {
          localObject = this.mTask;
          this.mCancellingTask = ((AsyncTaskLoader.LoadTask)localObject);
        }
        this.mTask = null;
      }
    }
  }
  
  void dispatchOnCancelled(AsyncTaskLoader.LoadTask paramLoadTask, Object paramObject)
  {
    onCanceled(paramObject);
    AsyncTaskLoader.LoadTask localLoadTask = this.mCancellingTask;
    if (localLoadTask == paramLoadTask)
    {
      long l = SystemClock.uptimeMillis();
      this.mLastLoadCompleteTime = l;
      localLoadTask = null;
      this.mCancellingTask = null;
      executePendingTask();
    }
  }
  
  void dispatchOnLoadComplete(AsyncTaskLoader.LoadTask paramLoadTask, Object paramObject)
  {
    AsyncTaskLoader.LoadTask localLoadTask = this.mTask;
    if (localLoadTask != paramLoadTask) {
      dispatchOnCancelled(paramLoadTask, paramObject);
    }
    for (;;)
    {
      return;
      boolean bool = isAbandoned();
      if (bool)
      {
        onCanceled(paramObject);
      }
      else
      {
        long l = SystemClock.uptimeMillis();
        this.mLastLoadCompleteTime = l;
        bool = false;
        localLoadTask = null;
        this.mTask = null;
        deliverResult(paramObject);
      }
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Object localObject = this.mTask;
    if (localObject != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      localObject = this.mTask;
      paramPrintWriter.print(localObject);
      paramPrintWriter.print(" waiting=");
      localObject = this.mTask;
      bool = ((AsyncTaskLoader.LoadTask)localObject).waiting;
      paramPrintWriter.println(bool);
    }
    localObject = this.mCancellingTask;
    if (localObject != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      localObject = this.mCancellingTask;
      paramPrintWriter.print(localObject);
      paramPrintWriter.print(" waiting=");
      localObject = this.mCancellingTask;
      bool = ((AsyncTaskLoader.LoadTask)localObject).waiting;
      paramPrintWriter.println(bool);
    }
    long l1 = this.mUpdateThrottle;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      TimeUtils.formatDuration(this.mUpdateThrottle, paramPrintWriter);
      localObject = " mLastLoadCompleteTime=";
      paramPrintWriter.print((String)localObject);
      l1 = this.mLastLoadCompleteTime;
      l2 = SystemClock.uptimeMillis();
      TimeUtils.formatDuration(l1, l2, paramPrintWriter);
      paramPrintWriter.println();
    }
  }
  
  void executePendingTask()
  {
    Object localObject = this.mCancellingTask;
    boolean bool1;
    AsyncTaskLoader.LoadTask localLoadTask;
    if (localObject == null)
    {
      localObject = this.mTask;
      if (localObject != null)
      {
        localObject = this.mTask;
        bool1 = ((AsyncTaskLoader.LoadTask)localObject).waiting;
        if (bool1)
        {
          localObject = this.mTask;
          bool2 = false;
          ((AsyncTaskLoader.LoadTask)localObject).waiting = false;
          localObject = this.mHandler;
          localLoadTask = this.mTask;
          ((Handler)localObject).removeCallbacks(localLoadTask);
        }
        long l1 = this.mUpdateThrottle;
        long l2 = 0L;
        bool1 = l1 < l2;
        if (!bool1) {
          break label166;
        }
        long l3 = SystemClock.uptimeMillis();
        l1 = this.mLastLoadCompleteTime;
        l2 = this.mUpdateThrottle;
        l1 += l2;
        bool1 = l3 < l1;
        if (!bool1) {
          break label166;
        }
        localObject = this.mTask;
        boolean bool2 = true;
        ((AsyncTaskLoader.LoadTask)localObject).waiting = bool2;
        localObject = this.mHandler;
        localLoadTask = this.mTask;
        l2 = this.mLastLoadCompleteTime;
        long l4 = this.mUpdateThrottle;
        l2 += l4;
        ((Handler)localObject).postAtTime(localLoadTask, l2);
      }
    }
    for (;;)
    {
      return;
      label166:
      localLoadTask = this.mTask;
      Executor localExecutor = ModernAsyncTask.THREAD_POOL_EXECUTOR;
      bool1 = false;
      localObject = (Void[])null;
      localLoadTask.executeOnExecutor(localExecutor, null);
    }
  }
  
  public abstract Object loadInBackground();
  
  public void onCanceled(Object paramObject) {}
  
  protected void onForceLoad()
  {
    super.onForceLoad();
    cancelLoad();
    AsyncTaskLoader.LoadTask localLoadTask = new android/support/v4/content/AsyncTaskLoader$LoadTask;
    localLoadTask.<init>(this);
    this.mTask = localLoadTask;
    executePendingTask();
  }
  
  protected Object onLoadInBackground()
  {
    return loadInBackground();
  }
  
  public void setUpdateThrottle(long paramLong)
  {
    this.mUpdateThrottle = paramLong;
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool)
    {
      Handler localHandler = new android/os/Handler;
      localHandler.<init>();
      this.mHandler = localHandler;
    }
  }
  
  public void waitForLoader()
  {
    AsyncTaskLoader.LoadTask localLoadTask = this.mTask;
    if (localLoadTask != null) {}
    try
    {
      CountDownLatch localCountDownLatch = AsyncTaskLoader.LoadTask.access$000(localLoadTask);
      localCountDownLatch.await();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/AsyncTaskLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */