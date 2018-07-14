package org.sqlite.database.sqlite;

import android.util.Log;
import android.util.Printer;
import java.util.ArrayList;

final class SQLiteConnection$OperationLog
{
  private static final int COOKIE_GENERATION_SHIFT = 8;
  private static final int COOKIE_INDEX_MASK = 255;
  private static final int MAX_RECENT_OPERATIONS = 20;
  private int mGeneration;
  private int mIndex;
  private final SQLiteConnection.Operation[] mOperations;
  
  private SQLiteConnection$OperationLog()
  {
    SQLiteConnection.Operation[] arrayOfOperation = new SQLiteConnection.Operation[20];
    this.mOperations = arrayOfOperation;
  }
  
  private boolean endOperationDeferLogLocked(int paramInt)
  {
    SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
    if (localOperation != null)
    {
      long l = System.currentTimeMillis();
      localOperation.mEndTime = l;
      boolean bool = true;
      localOperation.mFinished = bool;
    }
    return false;
  }
  
  private SQLiteConnection.Operation getOperationLocked(int paramInt)
  {
    int i = paramInt & 0xFF;
    SQLiteConnection.Operation[] arrayOfOperation = this.mOperations;
    SQLiteConnection.Operation localOperation = arrayOfOperation[i];
    int j = localOperation.mCookie;
    if (j == paramInt) {}
    for (;;)
    {
      return localOperation;
      i = 0;
      localOperation = null;
    }
  }
  
  private void logOperationLocked(int paramInt, String paramString)
  {
    Object localObject1 = getOperationLocked(paramInt);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((SQLiteConnection.Operation)localObject1).describe((StringBuilder)localObject2, false);
    if (paramString != null)
    {
      localObject1 = ((StringBuilder)localObject2).append(", ");
      ((StringBuilder)localObject1).append(paramString);
    }
    localObject2 = ((StringBuilder)localObject2).toString();
    Log.d("SQLiteConnection", (String)localObject2);
  }
  
  private int newOperationCookieLocked(int paramInt)
  {
    int i = this.mGeneration;
    int j = i + 1;
    this.mGeneration = j;
    return i << 8 | paramInt;
  }
  
  public int beginOperation(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    int i = 0;
    Object localObject1 = null;
    int k;
    Object localObject3;
    for (;;)
    {
      synchronized (this.mOperations)
      {
        int j = this.mIndex + 1;
        k = j % 20;
        localObject3 = this.mOperations;
        localObject3 = localObject3[k];
        int m;
        if (localObject3 == null)
        {
          localObject3 = new org/sqlite/database/sqlite/SQLiteConnection$Operation;
          m = 0;
          localObject4 = null;
          ((SQLiteConnection.Operation)localObject3).<init>(null);
          localObject4 = this.mOperations;
          localObject4[k] = localObject3;
          long l = System.currentTimeMillis();
          ((SQLiteConnection.Operation)localObject3).mStartTime = l;
          ((SQLiteConnection.Operation)localObject3).mKind = paramString1;
          ((SQLiteConnection.Operation)localObject3).mSql = paramString2;
          if (paramArrayOfObject == null) {
            break;
          }
          localObject4 = ((SQLiteConnection.Operation)localObject3).mBindArgs;
          if (localObject4 == null)
          {
            localObject4 = new java/util/ArrayList;
            ((ArrayList)localObject4).<init>();
            ((SQLiteConnection.Operation)localObject3).mBindArgs = ((ArrayList)localObject4);
            m = paramArrayOfObject.length;
            if (i >= m) {
              break;
            }
            localObject4 = paramArrayOfObject[i];
            if (localObject4 == null) {
              break label272;
            }
            boolean bool = localObject4 instanceof byte[];
            if (!bool) {
              break label272;
            }
            localObject4 = ((SQLiteConnection.Operation)localObject3).mBindArgs;
            localObject5 = SQLiteConnection.access$500();
            ((ArrayList)localObject4).add(localObject5);
            i += 1;
            continue;
          }
        }
        else
        {
          m = 0;
          localObject4 = null;
          ((SQLiteConnection.Operation)localObject3).mFinished = false;
          m = 0;
          localObject4 = null;
          ((SQLiteConnection.Operation)localObject3).mException = null;
          localObject4 = ((SQLiteConnection.Operation)localObject3).mBindArgs;
          if (localObject4 == null) {
            continue;
          }
          localObject4 = ((SQLiteConnection.Operation)localObject3).mBindArgs;
          ((ArrayList)localObject4).clear();
        }
      }
      Object localObject4 = ((SQLiteConnection.Operation)localObject3).mBindArgs;
      ((ArrayList)localObject4).clear();
      continue;
      label272:
      Object localObject5 = ((SQLiteConnection.Operation)localObject3).mBindArgs;
      ((ArrayList)localObject5).add(localObject4);
    }
    i = newOperationCookieLocked(k);
    ((SQLiteConnection.Operation)localObject3).mCookie = i;
    this.mIndex = k;
    i = ((SQLiteConnection.Operation)localObject3).mCookie;
    return i;
  }
  
  public String describeCurrentOperation()
  {
    synchronized (this.mOperations)
    {
      Object localObject1 = this.mOperations;
      int i = this.mIndex;
      localObject1 = localObject1[i];
      if (localObject1 != null)
      {
        boolean bool = ((SQLiteConnection.Operation)localObject1).mFinished;
        if (!bool)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ((SQLiteConnection.Operation)localObject1).describe(localStringBuilder, false);
          localObject1 = localStringBuilder.toString();
          return (String)localObject1;
        }
      }
      localObject1 = null;
    }
  }
  
  public void dump(Printer paramPrinter, boolean paramBoolean)
  {
    SQLiteConnection.Operation[] arrayOfOperation = this.mOperations;
    Object localObject6;
    Object localObject3;
    for (Object localObject1 = "  Most recently executed operations:";; localObject3 = localObject6) {
      try
      {
        paramPrinter.println((String)localObject1);
        int i = this.mIndex;
        localObject1 = this.mOperations;
        Object localObject4 = localObject1[i];
        int j;
        if (localObject4 != null)
        {
          j = 0;
          localObject1 = localObject4;
          int k = 0;
          localObject4 = null;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          Object localObject5 = "    ";
          localObject5 = localStringBuilder.append((String)localObject5);
          localObject5 = ((StringBuilder)localObject5).append(k);
          String str = ": [";
          ((StringBuilder)localObject5).append(str);
          localObject5 = SQLiteConnection.Operation.access$600((SQLiteConnection.Operation)localObject1);
          localStringBuilder.append((String)localObject5);
          localObject5 = "] ";
          localStringBuilder.append((String)localObject5);
          ((SQLiteConnection.Operation)localObject1).describe(localStringBuilder, paramBoolean);
          localObject1 = localStringBuilder.toString();
          paramPrinter.println((String)localObject1);
          if (i > 0)
          {
            j = i + -1;
            k += 1;
            localObject6 = this.mOperations;
            localObject6 = localObject6[j];
            if (localObject6 != null)
            {
              int m = 20;
              if (k < m) {
                continue;
              }
            }
          }
        }
        for (;;)
        {
          return;
          j = 19;
          break;
          localObject1 = "    <none>";
          paramPrinter.println((String)localObject1);
        }
        i = j;
      }
      finally {}
    }
  }
  
  public void endOperation(int paramInt)
  {
    synchronized (this.mOperations)
    {
      boolean bool = endOperationDeferLogLocked(paramInt);
      if (bool)
      {
        bool = false;
        Object localObject1 = null;
        logOperationLocked(paramInt, null);
      }
      return;
    }
  }
  
  public boolean endOperationDeferLog(int paramInt)
  {
    synchronized (this.mOperations)
    {
      boolean bool = endOperationDeferLogLocked(paramInt);
      return bool;
    }
  }
  
  public void failOperation(int paramInt, Exception paramException)
  {
    synchronized (this.mOperations)
    {
      SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
      if (localOperation != null) {
        localOperation.mException = paramException;
      }
      return;
    }
  }
  
  public void logOperation(int paramInt, String paramString)
  {
    synchronized (this.mOperations)
    {
      logOperationLocked(paramInt, paramString);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnection$OperationLog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */