package android.support.v4.content;

import java.util.concurrent.CountDownLatch;

final class AsyncTaskLoader$LoadTask
  extends ModernAsyncTask
  implements Runnable
{
  private CountDownLatch done;
  Object result;
  boolean waiting;
  
  AsyncTaskLoader$LoadTask(AsyncTaskLoader paramAsyncTaskLoader)
  {
    CountDownLatch localCountDownLatch = new java/util/concurrent/CountDownLatch;
    localCountDownLatch.<init>(1);
    this.done = localCountDownLatch;
  }
  
  protected Object doInBackground(Void... paramVarArgs)
  {
    Object localObject = this.this$0.onLoadInBackground();
    this.result = localObject;
    return this.result;
  }
  
  protected void onCancelled()
  {
    try
    {
      AsyncTaskLoader localAsyncTaskLoader = this.this$0;
      Object localObject2 = this.result;
      localAsyncTaskLoader.dispatchOnCancelled(this, localObject2);
      return;
    }
    finally
    {
      this.done.countDown();
    }
  }
  
  protected void onPostExecute(Object paramObject)
  {
    try
    {
      AsyncTaskLoader localAsyncTaskLoader = this.this$0;
      localAsyncTaskLoader.dispatchOnLoadComplete(this, paramObject);
      return;
    }
    finally
    {
      this.done.countDown();
    }
  }
  
  public void run()
  {
    this.waiting = false;
    this.this$0.executePendingTask();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/AsyncTaskLoader$LoadTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */