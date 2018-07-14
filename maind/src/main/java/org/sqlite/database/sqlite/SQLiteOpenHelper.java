package org.sqlite.database.sqlite;

import android.content.Context;
import android.util.Log;
import java.io.File;
import org.sqlite.database.DatabaseErrorHandler;

public abstract class SQLiteOpenHelper
{
  private static final boolean DEBUG_STRICT_READONLY;
  private static final String TAG = SQLiteOpenHelper.class.getSimpleName();
  private final Context mContext;
  private SQLiteDatabase mDatabase;
  private boolean mEnableWriteAheadLogging;
  private final DatabaseErrorHandler mErrorHandler;
  private final SQLiteDatabase.CursorFactory mFactory;
  private boolean mIsInitializing;
  private final String mName;
  private final int mNewVersion;
  
  public SQLiteOpenHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    this(paramContext, paramString, paramCursorFactory, paramInt, null);
  }
  
  public SQLiteOpenHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    int i = 1;
    if (paramInt < i)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Version must be >= 1, was " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.mContext = paramContext;
    this.mName = paramString;
    this.mFactory = paramCursorFactory;
    this.mNewVersion = paramInt;
    this.mErrorHandler = paramDatabaseErrorHandler;
  }
  
  private SQLiteDatabase getDatabaseLocked(boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject3 = this.mDatabase;
    if (localObject3 != null)
    {
      localObject3 = this.mDatabase;
      bool1 = ((SQLiteDatabase)localObject3).isOpen();
      if (bool1) {
        break label64;
      }
      this.mDatabase = null;
    }
    label64:
    do
    {
      bool1 = this.mIsInitializing;
      if (!bool1) {
        break label95;
      }
      localObject3 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject3).<init>("getDatabase called recursively");
      throw ((Throwable)localObject3);
      if (!paramBoolean) {
        break;
      }
      localObject3 = this.mDatabase;
      bool1 = ((SQLiteDatabase)localObject3).isReadOnly();
    } while (bool1);
    localObject3 = this.mDatabase;
    return (SQLiteDatabase)localObject3;
    label95:
    localObject1 = this.mDatabase;
    boolean bool1 = true;
    try
    {
      this.mIsInitializing = bool1;
      if (localObject1 != null)
      {
        if (paramBoolean)
        {
          bool1 = ((SQLiteDatabase)localObject1).isReadOnly();
          if (bool1)
          {
            ((SQLiteDatabase)localObject1).reopenReadWrite();
            localObject3 = localObject1;
          }
        }
      }
      else
      {
        for (;;)
        {
          try
          {
            onConfigure((SQLiteDatabase)localObject3);
            i = ((SQLiteDatabase)localObject3).getVersion();
            int k = this.mNewVersion;
            if (i == k) {
              break label568;
            }
            boolean bool2 = ((SQLiteDatabase)localObject3).isReadOnly();
            if (!bool2) {
              break label532;
            }
            localObject1 = new org/sqlite/database/sqlite/SQLiteException;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Can't upgrade read-only database from version ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            i1 = ((SQLiteDatabase)localObject3).getVersion();
            localObject5 = ((StringBuilder)localObject5).append(i1);
            localObject6 = " to ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            i1 = this.mNewVersion;
            localObject5 = ((StringBuilder)localObject5).append(i1);
            localObject6 = ": ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = this.mName;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            ((SQLiteException)localObject1).<init>((String)localObject5);
            throw ((Throwable)localObject1);
          }
          finally
          {
            localObject1 = localObject3;
            localObject3 = localObject7;
          }
          this.mIsInitializing = false;
          if (localObject1 != null)
          {
            localObject5 = this.mDatabase;
            if (localObject1 != localObject5) {
              ((SQLiteDatabase)localObject1).close();
            }
          }
          throw ((Throwable)localObject3);
          localObject3 = this.mName;
          if (localObject3 == null)
          {
            bool1 = false;
            localObject3 = null;
            localObject1 = SQLiteDatabase.create(null);
            localObject3 = localObject1;
          }
          else
          {
            try
            {
              localObject3 = this.mName;
              localObject5 = this.mFactory;
              localObject6 = this.mErrorHandler;
              localObject1 = SQLiteDatabase.openOrCreateDatabase((String)localObject3, (SQLiteDatabase.CursorFactory)localObject5, (DatabaseErrorHandler)localObject6);
              localObject3 = localObject1;
            }
            catch (SQLiteException localSQLiteException)
            {
              if (!paramBoolean) {
                break label398;
              }
            }
          }
        }
        throw localSQLiteException;
      }
    }
    finally
    {
      for (;;)
      {
        continue;
        label398:
        Object localObject5 = TAG;
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        Object localObject8 = "Couldn't open ";
        localObject6 = ((StringBuilder)localObject6).append((String)localObject8);
        localObject8 = this.mName;
        localObject6 = ((StringBuilder)localObject6).append((String)localObject8);
        localObject8 = " for writing (will try read-only):";
        localObject6 = ((StringBuilder)localObject6).append((String)localObject8);
        localObject6 = ((StringBuilder)localObject6).toString();
        Log.e((String)localObject5, (String)localObject6, localThrowable);
        Object localObject4 = this.mContext;
        localObject5 = this.mName;
        localObject4 = ((Context)localObject4).getDatabasePath((String)localObject5);
        localObject4 = ((File)localObject4).getPath();
        localObject5 = this.mFactory;
        int i1 = 1;
        localObject8 = this.mErrorHandler;
        localObject1 = SQLiteDatabase.openDatabase((String)localObject4, (SQLiteDatabase.CursorFactory)localObject5, i1, (DatabaseErrorHandler)localObject8);
        localObject4 = localObject1;
        continue;
        label532:
        ((SQLiteDatabase)localObject4).beginTransaction();
        if (i == 0) {}
        for (;;)
        {
          label568:
          int j;
          int n;
          try
          {
            onCreate((SQLiteDatabase)localObject4);
            i = this.mNewVersion;
            ((SQLiteDatabase)localObject4).setVersion(i);
            ((SQLiteDatabase)localObject4).setTransactionSuccessful();
            ((SQLiteDatabase)localObject4).endTransaction();
            onOpen((SQLiteDatabase)localObject4);
            j = ((SQLiteDatabase)localObject4).isReadOnly();
            if (j != 0)
            {
              localObject1 = TAG;
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              localObject6 = "Opened ";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject6 = this.mName;
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject6 = " in read-only mode";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject5 = ((StringBuilder)localObject5).toString();
              Log.w((String)localObject1, (String)localObject5);
            }
            this.mDatabase = ((SQLiteDatabase)localObject4);
            this.mIsInitializing = false;
            if (localObject4 == null) {
              break;
            }
            localObject1 = this.mDatabase;
            if (localObject4 == localObject1) {
              break;
            }
            ((SQLiteDatabase)localObject4).close();
            break;
          }
          finally
          {
            int m;
            ((SQLiteDatabase)localObject4).endTransaction();
          }
          m = this.mNewVersion;
          if (j > m)
          {
            n = this.mNewVersion;
            onDowngrade((SQLiteDatabase)localObject4, j, n);
          }
          else
          {
            n = this.mNewVersion;
            onUpgrade((SQLiteDatabase)localObject4, j, n);
          }
        }
        localObject4 = localObject2;
      }
    }
  }
  
  public void close()
  {
    boolean bool;
    try
    {
      bool = this.mIsInitializing;
      if (bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        String str = "Closed during initialization";
        localIllegalStateException.<init>(str);
        throw localIllegalStateException;
      }
    }
    finally {}
    SQLiteDatabase localSQLiteDatabase = this.mDatabase;
    if (localSQLiteDatabase != null)
    {
      localSQLiteDatabase = this.mDatabase;
      bool = localSQLiteDatabase.isOpen();
      if (bool)
      {
        localSQLiteDatabase = this.mDatabase;
        localSQLiteDatabase.close();
        bool = false;
        localSQLiteDatabase = null;
        this.mDatabase = null;
      }
    }
  }
  
  public String getDatabaseName()
  {
    return this.mName;
  }
  
  public SQLiteDatabase getReadableDatabase()
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localSQLiteDatabase = getDatabaseLocked(false);
      return localSQLiteDatabase;
    }
    finally {}
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    boolean bool = true;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getDatabaseLocked(bool);
      return localSQLiteDatabase;
    }
    finally {}
  }
  
  public void onConfigure(SQLiteDatabase paramSQLiteDatabase) {}
  
  public abstract void onCreate(SQLiteDatabase paramSQLiteDatabase);
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    SQLiteException localSQLiteException = new org/sqlite/database/sqlite/SQLiteException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Can't downgrade database from version " + paramInt1 + " to " + paramInt2;
    localSQLiteException.<init>((String)localObject);
    throw localSQLiteException;
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase) {}
  
  public abstract void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);
  
  /* Error */
  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 185	org/sqlite/database/sqlite/SQLiteOpenHelper:mEnableWriteAheadLogging	Z
    //   6: istore_2
    //   7: iload_2
    //   8: iload_1
    //   9: if_icmpeq +59 -> 68
    //   12: aload_0
    //   13: getfield 69	org/sqlite/database/sqlite/SQLiteOpenHelper:mDatabase	Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull +45 -> 63
    //   21: aload_0
    //   22: getfield 69	org/sqlite/database/sqlite/SQLiteOpenHelper:mDatabase	Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   25: astore_3
    //   26: aload_3
    //   27: invokevirtual 75	org/sqlite/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   30: istore_2
    //   31: iload_2
    //   32: ifeq +31 -> 63
    //   35: aload_0
    //   36: getfield 69	org/sqlite/database/sqlite/SQLiteOpenHelper:mDatabase	Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   39: astore_3
    //   40: aload_3
    //   41: invokevirtual 85	org/sqlite/database/sqlite/SQLiteDatabase:isReadOnly	()Z
    //   44: istore_2
    //   45: iload_2
    //   46: ifne +17 -> 63
    //   49: iload_1
    //   50: ifeq +21 -> 71
    //   53: aload_0
    //   54: getfield 69	org/sqlite/database/sqlite/SQLiteOpenHelper:mDatabase	Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   57: astore_3
    //   58: aload_3
    //   59: invokevirtual 188	org/sqlite/database/sqlite/SQLiteDatabase:enableWriteAheadLogging	()Z
    //   62: pop
    //   63: aload_0
    //   64: iload_1
    //   65: putfield 185	org/sqlite/database/sqlite/SQLiteOpenHelper:mEnableWriteAheadLogging	Z
    //   68: aload_0
    //   69: monitorexit
    //   70: return
    //   71: aload_0
    //   72: getfield 69	org/sqlite/database/sqlite/SQLiteOpenHelper:mDatabase	Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   75: astore_3
    //   76: aload_3
    //   77: invokevirtual 191	org/sqlite/database/sqlite/SQLiteDatabase:disableWriteAheadLogging	()V
    //   80: goto -17 -> 63
    //   83: astore_3
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_3
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	SQLiteOpenHelper
    //   0	88	1	paramBoolean	boolean
    //   6	40	2	bool	boolean
    //   16	61	3	localSQLiteDatabase	SQLiteDatabase
    //   83	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	83	finally
    //   12	16	83	finally
    //   21	25	83	finally
    //   26	30	83	finally
    //   35	39	83	finally
    //   40	44	83	finally
    //   53	57	83	finally
    //   58	63	83	finally
    //   64	68	83	finally
    //   68	70	83	finally
    //   71	75	83	finally
    //   76	80	83	finally
    //   84	86	83	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteOpenHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */