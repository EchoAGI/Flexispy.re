package android.support.v4.content;

public enum ModernAsyncTask$Status
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new android/support/v4/content/ModernAsyncTask$Status;
    ((Status)localObject).<init>("PENDING", 0);
    PENDING = (Status)localObject;
    localObject = new android/support/v4/content/ModernAsyncTask$Status;
    ((Status)localObject).<init>("RUNNING", j);
    RUNNING = (Status)localObject;
    localObject = new android/support/v4/content/ModernAsyncTask$Status;
    ((Status)localObject).<init>("FINISHED", i);
    FINISHED = (Status)localObject;
    localObject = new Status[3];
    Status localStatus = PENDING;
    localObject[0] = localStatus;
    localStatus = RUNNING;
    localObject[j] = localStatus;
    localStatus = FINISHED;
    localObject[i] = localStatus;
    $VALUES = (Status[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/ModernAsyncTask$Status.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */