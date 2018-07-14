package org.sqlite.os;

import android.os.RemoteException;

public final class CancellationSignal
{
  private boolean mCancelInProgress;
  private boolean mIsCanceled;
  private CancellationSignal.OnCancelListener mOnCancelListener;
  private ICancellationSignal mRemote;
  
  public static ICancellationSignal createTransport()
  {
    CancellationSignal.Transport localTransport = new org/sqlite/os/CancellationSignal$Transport;
    localTransport.<init>(null);
    return localTransport;
  }
  
  public static CancellationSignal fromTransport(ICancellationSignal paramICancellationSignal)
  {
    boolean bool = paramICancellationSignal instanceof CancellationSignal.Transport;
    if (bool) {
      paramICancellationSignal = (CancellationSignal.Transport)paramICancellationSignal;
    }
    for (CancellationSignal localCancellationSignal = paramICancellationSignal.mCancellationSignal;; localCancellationSignal = null)
    {
      return localCancellationSignal;
      bool = false;
    }
  }
  
  private void waitForCancelFinishedLocked()
  {
    for (;;)
    {
      boolean bool = this.mCancelInProgress;
      if (!bool) {
        break;
      }
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  /* Error */
  public void cancel()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	org/sqlite/os/CancellationSignal:mIsCanceled	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iconst_1
    //   15: istore_1
    //   16: aload_0
    //   17: iload_1
    //   18: putfield 33	org/sqlite/os/CancellationSignal:mIsCanceled	Z
    //   21: iconst_1
    //   22: istore_1
    //   23: aload_0
    //   24: iload_1
    //   25: putfield 26	org/sqlite/os/CancellationSignal:mCancelInProgress	Z
    //   28: aload_0
    //   29: getfield 36	org/sqlite/os/CancellationSignal:mOnCancelListener	Lorg/sqlite/os/CancellationSignal$OnCancelListener;
    //   32: astore_2
    //   33: aload_0
    //   34: getfield 38	org/sqlite/os/CancellationSignal:mRemote	Lorg/sqlite/os/ICancellationSignal;
    //   37: astore_3
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_2
    //   41: ifnull +9 -> 50
    //   44: aload_2
    //   45: invokeinterface 43 1 0
    //   50: aload_3
    //   51: ifnull +9 -> 60
    //   54: aload_3
    //   55: invokeinterface 48 1 0
    //   60: aload_0
    //   61: monitorenter
    //   62: iconst_0
    //   63: istore_1
    //   64: aconst_null
    //   65: astore_2
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield 26	org/sqlite/os/CancellationSignal:mCancelInProgress	Z
    //   71: aload_0
    //   72: invokevirtual 51	java/lang/Object:notifyAll	()V
    //   75: aload_0
    //   76: monitorexit
    //   77: goto -64 -> 13
    //   80: astore_2
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_2
    //   84: athrow
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    //   90: astore_2
    //   91: aload_0
    //   92: monitorenter
    //   93: aconst_null
    //   94: astore_3
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield 26	org/sqlite/os/CancellationSignal:mCancelInProgress	Z
    //   100: aload_0
    //   101: invokevirtual 51	java/lang/Object:notifyAll	()V
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_2
    //   107: athrow
    //   108: astore_2
    //   109: goto -49 -> 60
    //   112: astore_2
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_2
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	CancellationSignal
    //   6	58	1	bool	boolean
    //   32	34	2	localOnCancelListener	CancellationSignal.OnCancelListener
    //   80	4	2	localObject1	Object
    //   85	4	2	localObject2	Object
    //   90	17	2	localObject3	Object
    //   108	1	2	localRemoteException	RemoteException
    //   112	4	2	localObject4	Object
    //   37	58	3	localICancellationSignal	ICancellationSignal
    // Exception table:
    //   from	to	target	type
    //   67	71	80	finally
    //   71	75	80	finally
    //   75	77	80	finally
    //   81	83	80	finally
    //   2	6	85	finally
    //   11	13	85	finally
    //   17	21	85	finally
    //   24	28	85	finally
    //   28	32	85	finally
    //   33	37	85	finally
    //   38	40	85	finally
    //   86	88	85	finally
    //   44	50	90	finally
    //   54	60	90	finally
    //   54	60	108	android/os/RemoteException
    //   96	100	112	finally
    //   100	104	112	finally
    //   104	106	112	finally
    //   113	115	112	finally
  }
  
  public boolean isCanceled()
  {
    try
    {
      boolean bool = this.mIsCanceled;
      return bool;
    }
    finally {}
  }
  
  public void setOnCancelListener(CancellationSignal.OnCancelListener paramOnCancelListener)
  {
    for (;;)
    {
      try
      {
        waitForCancelFinishedLocked();
        CancellationSignal.OnCancelListener localOnCancelListener = this.mOnCancelListener;
        if (localOnCancelListener == paramOnCancelListener) {
          return;
        }
        this.mOnCancelListener = paramOnCancelListener;
        boolean bool = this.mIsCanceled;
        if ((!bool) || (paramOnCancelListener == null)) {
          continue;
        }
      }
      finally {}
      paramOnCancelListener.onCancel();
    }
  }
  
  public void setRemote(ICancellationSignal paramICancellationSignal)
  {
    for (;;)
    {
      try
      {
        waitForCancelFinishedLocked();
        ICancellationSignal localICancellationSignal = this.mRemote;
        if (localICancellationSignal == paramICancellationSignal) {
          return;
        }
        this.mRemote = paramICancellationSignal;
        boolean bool = this.mIsCanceled;
        if ((!bool) || (paramICancellationSignal == null)) {
          continue;
        }
      }
      finally {}
      try
      {
        paramICancellationSignal.cancel();
      }
      catch (RemoteException localRemoteException) {}
    }
  }
  
  public void throwIfCanceled()
  {
    boolean bool = isCanceled();
    if (bool)
    {
      OperationCanceledException localOperationCanceledException = new org/sqlite/os/OperationCanceledException;
      localOperationCanceledException.<init>();
      throw localOperationCanceledException;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/os/CancellationSignal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */