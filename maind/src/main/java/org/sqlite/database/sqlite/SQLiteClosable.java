package org.sqlite.database.sqlite;

import java.io.Closeable;

public abstract class SQLiteClosable
  implements Closeable
{
  private int mReferenceCount = 1;
  
  public void acquireReference()
  {
    try
    {
      i = this.mReferenceCount;
      if (i <= 0)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "attempt to re-open an already-closed object: ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).append(this);
        localObject2 = ((StringBuilder)localObject2).toString();
        localIllegalStateException.<init>((String)localObject2);
        throw localIllegalStateException;
      }
    }
    finally {}
    int i = this.mReferenceCount + 1;
    this.mReferenceCount = i;
  }
  
  public void close()
  {
    releaseReference();
  }
  
  protected abstract void onAllReferencesReleased();
  
  protected void onAllReferencesReleasedFromContainer()
  {
    onAllReferencesReleased();
  }
  
  /* Error */
  public void releaseReference()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	org/sqlite/database/sqlite/SQLiteClosable:mReferenceCount	I
    //   6: iconst_m1
    //   7: iadd
    //   8: istore_1
    //   9: aload_0
    //   10: iload_1
    //   11: putfield 15	org/sqlite/database/sqlite/SQLiteClosable:mReferenceCount	I
    //   14: iload_1
    //   15: ifne +16 -> 31
    //   18: iconst_1
    //   19: istore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: iload_1
    //   23: ifeq +7 -> 30
    //   26: aload_0
    //   27: invokevirtual 42	org/sqlite/database/sqlite/SQLiteClosable:onAllReferencesReleased	()V
    //   30: return
    //   31: iconst_0
    //   32: istore_1
    //   33: aconst_null
    //   34: astore_2
    //   35: goto -15 -> 20
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	SQLiteClosable
    //   8	25	1	i	int
    //   34	1	2	localObject1	Object
    //   38	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	38	finally
    //   10	14	38	finally
    //   20	22	38	finally
    //   39	41	38	finally
  }
  
  /* Error */
  public void releaseReferenceFromContainer()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	org/sqlite/database/sqlite/SQLiteClosable:mReferenceCount	I
    //   6: iconst_m1
    //   7: iadd
    //   8: istore_1
    //   9: aload_0
    //   10: iload_1
    //   11: putfield 15	org/sqlite/database/sqlite/SQLiteClosable:mReferenceCount	I
    //   14: iload_1
    //   15: ifne +16 -> 31
    //   18: iconst_1
    //   19: istore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: iload_1
    //   23: ifeq +7 -> 30
    //   26: aload_0
    //   27: invokevirtual 45	org/sqlite/database/sqlite/SQLiteClosable:onAllReferencesReleasedFromContainer	()V
    //   30: return
    //   31: iconst_0
    //   32: istore_1
    //   33: aconst_null
    //   34: astore_2
    //   35: goto -15 -> 20
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	SQLiteClosable
    //   8	25	1	i	int
    //   34	1	2	localObject1	Object
    //   38	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	38	finally
    //   10	14	38	finally
    //   20	22	38	finally
    //   39	41	38	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteClosable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */