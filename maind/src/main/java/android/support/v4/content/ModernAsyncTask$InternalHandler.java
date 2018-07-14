package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

class ModernAsyncTask$InternalHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    ModernAsyncTask.AsyncTaskResult localAsyncTaskResult = (ModernAsyncTask.AsyncTaskResult)paramMessage.obj;
    int i = paramMessage.what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      ModernAsyncTask localModernAsyncTask = localAsyncTaskResult.mTask;
      Object localObject = localAsyncTaskResult.mData[0];
      ModernAsyncTask.access$500(localModernAsyncTask, localObject);
      continue;
      localModernAsyncTask = localAsyncTaskResult.mTask;
      localObject = localAsyncTaskResult.mData;
      localModernAsyncTask.onProgressUpdate((Object[])localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/ModernAsyncTask$InternalHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */