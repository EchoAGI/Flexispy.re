package android.support.v4.content;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class ModernAsyncTask
{
  private static final int CORE_POOL_SIZE = 5;
  private static final int KEEP_ALIVE = 1;
  private static final String LOG_TAG = "AsyncTask";
  private static final int MAXIMUM_POOL_SIZE = 128;
  private static final int MESSAGE_POST_PROGRESS = 2;
  private static final int MESSAGE_POST_RESULT = 1;
  public static final Executor THREAD_POOL_EXECUTOR;
  private static volatile Executor sDefaultExecutor = THREAD_POOL_EXECUTOR;
  private static final ModernAsyncTask.InternalHandler sHandler;
  private static final BlockingQueue sPoolWorkQueue;
  private static final ThreadFactory sThreadFactory;
  private final FutureTask mFuture;
  private volatile ModernAsyncTask.Status mStatus;
  private final AtomicBoolean mTaskInvoked;
  private final ModernAsyncTask.WorkerRunnable mWorker;
  
  static
  {
    Object localObject = new android/support/v4/content/ModernAsyncTask$1;
    ((ModernAsyncTask.1)localObject).<init>();
    sThreadFactory = (ThreadFactory)localObject;
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>(10);
    sPoolWorkQueue = (BlockingQueue)localObject;
    localObject = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    BlockingQueue localBlockingQueue = sPoolWorkQueue;
    ThreadFactory localThreadFactory = sThreadFactory;
    ((ThreadPoolExecutor)localObject).<init>(5, 128, 1L, localTimeUnit, localBlockingQueue, localThreadFactory);
    THREAD_POOL_EXECUTOR = (Executor)localObject;
    localObject = new android/support/v4/content/ModernAsyncTask$InternalHandler;
    ((ModernAsyncTask.InternalHandler)localObject).<init>(null);
    sHandler = (ModernAsyncTask.InternalHandler)localObject;
  }
  
  public ModernAsyncTask()
  {
    Object localObject = ModernAsyncTask.Status.PENDING;
    this.mStatus = ((ModernAsyncTask.Status)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.mTaskInvoked = ((AtomicBoolean)localObject);
    localObject = new android/support/v4/content/ModernAsyncTask$2;
    ((ModernAsyncTask.2)localObject).<init>(this);
    this.mWorker = ((ModernAsyncTask.WorkerRunnable)localObject);
    localObject = new android/support/v4/content/ModernAsyncTask$3;
    ModernAsyncTask.WorkerRunnable localWorkerRunnable = this.mWorker;
    ((ModernAsyncTask.3)localObject).<init>(this, localWorkerRunnable);
    this.mFuture = ((FutureTask)localObject);
  }
  
  public static void execute(Runnable paramRunnable)
  {
    sDefaultExecutor.execute(paramRunnable);
  }
  
  private void finish(Object paramObject)
  {
    boolean bool = isCancelled();
    if (bool) {
      onCancelled(paramObject);
    }
    for (;;)
    {
      ModernAsyncTask.Status localStatus = ModernAsyncTask.Status.FINISHED;
      this.mStatus = localStatus;
      return;
      onPostExecute(paramObject);
    }
  }
  
  public static void init()
  {
    sHandler.getLooper();
  }
  
  private Object postResult(Object paramObject)
  {
    int i = 1;
    ModernAsyncTask.InternalHandler localInternalHandler = sHandler;
    ModernAsyncTask.AsyncTaskResult localAsyncTaskResult = new android/support/v4/content/ModernAsyncTask$AsyncTaskResult;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramObject;
    localAsyncTaskResult.<init>(this, arrayOfObject);
    localInternalHandler.obtainMessage(i, localAsyncTaskResult).sendToTarget();
    return paramObject;
  }
  
  private void postResultIfNotInvoked(Object paramObject)
  {
    AtomicBoolean localAtomicBoolean = this.mTaskInvoked;
    boolean bool = localAtomicBoolean.get();
    if (!bool) {
      postResult(paramObject);
    }
  }
  
  public static void setDefaultExecutor(Executor paramExecutor)
  {
    sDefaultExecutor = paramExecutor;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return this.mFuture.cancel(paramBoolean);
  }
  
  protected abstract Object doInBackground(Object... paramVarArgs);
  
  public final ModernAsyncTask execute(Object... paramVarArgs)
  {
    Executor localExecutor = sDefaultExecutor;
    return executeOnExecutor(localExecutor, paramVarArgs);
  }
  
  public final ModernAsyncTask executeOnExecutor(Executor paramExecutor, Object... paramVarArgs)
  {
    Object localObject = this.mStatus;
    ModernAsyncTask.Status localStatus = ModernAsyncTask.Status.PENDING;
    int j;
    if (localObject != localStatus)
    {
      localObject = ModernAsyncTask.4.$SwitchMap$android$support$v4$content$ModernAsyncTask$Status;
      localStatus = this.mStatus;
      int i = localStatus.ordinal();
      j = localObject[i];
    }
    switch (j)
    {
    default: 
      localObject = ModernAsyncTask.Status.RUNNING;
      this.mStatus = ((ModernAsyncTask.Status)localObject);
      onPreExecute();
      this.mWorker.mParams = paramVarArgs;
      localObject = this.mFuture;
      paramExecutor.execute((Runnable)localObject);
      return this;
    case 1: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot execute task: the task is already running.");
      throw ((Throwable)localObject);
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Cannot execute task: the task has already been executed (a task can be executed only once)");
    throw ((Throwable)localObject);
  }
  
  public final Object get()
  {
    return this.mFuture.get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.mFuture.get(paramLong, paramTimeUnit);
  }
  
  public final ModernAsyncTask.Status getStatus()
  {
    return this.mStatus;
  }
  
  public final boolean isCancelled()
  {
    return this.mFuture.isCancelled();
  }
  
  protected void onCancelled() {}
  
  protected void onCancelled(Object paramObject)
  {
    onCancelled();
  }
  
  protected void onPostExecute(Object paramObject) {}
  
  protected void onPreExecute() {}
  
  protected void onProgressUpdate(Object... paramVarArgs) {}
  
  protected final void publishProgress(Object... paramVarArgs)
  {
    boolean bool = isCancelled();
    if (!bool)
    {
      Object localObject = sHandler;
      int i = 2;
      ModernAsyncTask.AsyncTaskResult localAsyncTaskResult = new android/support/v4/content/ModernAsyncTask$AsyncTaskResult;
      localAsyncTaskResult.<init>(this, paramVarArgs);
      localObject = ((ModernAsyncTask.InternalHandler)localObject).obtainMessage(i, localAsyncTaskResult);
      ((Message)localObject).sendToTarget();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/ModernAsyncTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */