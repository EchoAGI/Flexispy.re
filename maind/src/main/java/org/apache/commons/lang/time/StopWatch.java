package org.apache.commons.lang.time;

public class StopWatch
{
  private static final int STATE_RUNNING = 1;
  private static final int STATE_SPLIT = 11;
  private static final int STATE_STOPPED = 2;
  private static final int STATE_SUSPENDED = 3;
  private static final int STATE_UNSPLIT = 10;
  private static final int STATE_UNSTARTED;
  private int runningState = 0;
  private int splitState = 10;
  private long startTime;
  private long stopTime;
  
  public StopWatch()
  {
    this.startTime = l;
    this.stopTime = l;
  }
  
  public long getSplitTime()
  {
    int i = this.splitState;
    int j = 11;
    if (i != j)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch must be split to get the split time. ");
      throw localIllegalStateException;
    }
    long l1 = this.stopTime;
    long l2 = this.startTime;
    return l1 - l2;
  }
  
  public long getStartTime()
  {
    int i = this.runningState;
    if (i == 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch has not been started");
      throw localIllegalStateException;
    }
    return this.startTime;
  }
  
  public long getTime()
  {
    int i = this.runningState;
    int j = 2;
    long l1;
    long l2;
    if (i != j)
    {
      i = this.runningState;
      j = 3;
      if (i != j) {}
    }
    else
    {
      l1 = this.stopTime;
      l2 = this.startTime;
      l1 -= l2;
    }
    for (;;)
    {
      return l1;
      i = this.runningState;
      if (i == 0)
      {
        l1 = 0L;
      }
      else
      {
        i = this.runningState;
        j = 1;
        if (i != j) {
          break;
        }
        l1 = System.currentTimeMillis();
        l2 = this.startTime;
        l1 -= l2;
      }
    }
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>("Illegal running state has occured. ");
    throw localRuntimeException;
  }
  
  public void reset()
  {
    long l = -1;
    this.runningState = 0;
    this.splitState = 10;
    this.startTime = l;
    this.stopTime = l;
  }
  
  public void resume()
  {
    int i = this.runningState;
    int j = 3;
    if (i != j)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch must be suspended to resume. ");
      throw localIllegalStateException;
    }
    long l1 = this.startTime;
    long l2 = System.currentTimeMillis();
    long l3 = this.stopTime;
    l2 -= l3;
    l1 += l2;
    this.startTime = l1;
    this.stopTime = -1;
    this.runningState = 1;
  }
  
  public void split()
  {
    int i = this.runningState;
    int j = 1;
    if (i != j)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch is not running. ");
      throw localIllegalStateException;
    }
    long l = System.currentTimeMillis();
    this.stopTime = l;
    this.splitState = 11;
  }
  
  public void start()
  {
    int i = this.runningState;
    int j = 2;
    IllegalStateException localIllegalStateException;
    if (i == j)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch must be reset before being restarted. ");
      throw localIllegalStateException;
    }
    i = this.runningState;
    if (i != 0)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch already started. ");
      throw localIllegalStateException;
    }
    this.stopTime = -1;
    long l = System.currentTimeMillis();
    this.startTime = l;
    this.runningState = 1;
  }
  
  public void stop()
  {
    int i = 1;
    int j = this.runningState;
    if (j != i)
    {
      j = this.runningState;
      int k = 3;
      if (j != k)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Stopwatch is not running. ");
        throw localIllegalStateException;
      }
    }
    j = this.runningState;
    if (j == i)
    {
      long l = System.currentTimeMillis();
      this.stopTime = l;
    }
    this.runningState = 2;
  }
  
  public void suspend()
  {
    int i = this.runningState;
    int j = 1;
    if (i != j)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch must be running to suspend. ");
      throw localIllegalStateException;
    }
    long l = System.currentTimeMillis();
    this.stopTime = l;
    this.runningState = 3;
  }
  
  public String toSplitString()
  {
    return DurationFormatUtils.formatDurationHMS(getSplitTime());
  }
  
  public String toString()
  {
    return DurationFormatUtils.formatDurationHMS(getTime());
  }
  
  public void unsplit()
  {
    int i = this.splitState;
    int j = 11;
    if (i != j)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Stopwatch has not been split. ");
      throw localIllegalStateException;
    }
    this.stopTime = -1;
    this.splitState = 10;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/StopWatch.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */