package android.support.v4.content;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class ModernAsyncTask$2
  extends ModernAsyncTask.WorkerRunnable
{
  ModernAsyncTask$2(ModernAsyncTask paramModernAsyncTask)
  {
    super(null);
  }
  
  public Object call()
  {
    ModernAsyncTask.access$200(this.this$0).set(true);
    Process.setThreadPriority(10);
    ModernAsyncTask localModernAsyncTask = this.this$0;
    Object localObject = this.this$0;
    Object[] arrayOfObject = this.mParams;
    localObject = ((ModernAsyncTask)localObject).doInBackground(arrayOfObject);
    return ModernAsyncTask.access$300(localModernAsyncTask, localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/ModernAsyncTask$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */