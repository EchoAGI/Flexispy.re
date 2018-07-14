package android.support.v4.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ModernAsyncTask$1
  implements ThreadFactory
{
  private final AtomicInteger mCount;
  
  ModernAsyncTask$1()
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    this.mCount = localAtomicInteger;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("ModernAsyncTask #");
    int i = this.mCount.getAndIncrement();
    localObject = i;
    localThread.<init>(paramRunnable, (String)localObject);
    return localThread;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/ModernAsyncTask$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */