package android.support.v4.content;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class ModernAsyncTask$3
  extends FutureTask
{
  ModernAsyncTask$3(ModernAsyncTask paramModernAsyncTask, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    Object localObject2;
    try
    {
      Object localObject1 = get();
      localObject2 = this.this$0;
      ModernAsyncTask.access$400((ModernAsyncTask)localObject2, localObject1);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject2 = "AsyncTask";
        Log.w((String)localObject2, localInterruptedException);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      localObject2 = new java/lang/RuntimeException;
      Throwable localThrowable1 = localExecutionException.getCause();
      ((RuntimeException)localObject2).<init>("An error occured while executing doInBackground()", localThrowable1);
      throw ((Throwable)localObject2);
    }
    catch (CancellationException localCancellationException)
    {
      for (;;)
      {
        localObject2 = this.this$0;
        ModernAsyncTask.access$400((ModernAsyncTask)localObject2, null);
      }
    }
    finally
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>("An error occured while executing doInBackground()", localThrowable2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/ModernAsyncTask$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */