package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSettingEvent;
import com.vvt.events.i;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import java.util.ArrayList;
import java.util.List;

public class af
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public af(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  /* Error */
  private void a(long paramLong, FxSettingEvent paramFxSettingEvent)
  {
    // Byte code:
    //   0: new 21	java/lang/StringBuilder
    //   3: astore 4
    //   5: aload 4
    //   7: invokespecial 22	java/lang/StringBuilder:<init>	()V
    //   10: ldc 24
    //   12: astore 5
    //   14: aload 4
    //   16: aload 5
    //   18: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: lload_1
    //   22: invokevirtual 31	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   25: astore 4
    //   27: aload 4
    //   29: invokevirtual 35	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: astore 6
    //   34: aload_0
    //   35: getfield 19	com/vvt/eventrepository/a/af:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   38: astore 4
    //   40: ldc 37
    //   42: astore 5
    //   44: iconst_0
    //   45: istore 7
    //   47: aconst_null
    //   48: astore 8
    //   50: aload 4
    //   52: aload 5
    //   54: aconst_null
    //   55: aload 6
    //   57: aconst_null
    //   58: aconst_null
    //   59: aconst_null
    //   60: aconst_null
    //   61: invokevirtual 43	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   64: astore 5
    //   66: ldc 45
    //   68: astore 4
    //   70: aload 5
    //   72: ifnull +172 -> 244
    //   75: aload 5
    //   77: invokeinterface 51 1 0
    //   82: istore 9
    //   84: iload 9
    //   86: ifeq +158 -> 244
    //   89: new 53	com/vvt/events/i
    //   92: astore 4
    //   94: aload 4
    //   96: invokespecial 54	com/vvt/events/i:<init>	()V
    //   99: ldc 56
    //   101: astore 8
    //   103: aload 5
    //   105: aload 8
    //   107: invokeinterface 60 2 0
    //   112: istore 7
    //   114: aload 5
    //   116: iload 7
    //   118: invokeinterface 64 2 0
    //   123: istore 7
    //   125: ldc 66
    //   127: astore 6
    //   129: aload 5
    //   131: aload 6
    //   133: invokeinterface 60 2 0
    //   138: istore 10
    //   140: aload 5
    //   142: iload 10
    //   144: invokeinterface 70 2 0
    //   149: astore 6
    //   151: aload 4
    //   153: iload 7
    //   155: invokevirtual 73	com/vvt/events/i:a	(I)V
    //   158: aload 4
    //   160: aload 6
    //   162: invokevirtual 76	com/vvt/events/i:a	(Ljava/lang/String;)V
    //   165: aload_3
    //   166: aload 4
    //   168: invokevirtual 82	com/vvt/events/FxSettingEvent:addSettingElement	(Lcom/vvt/events/i;)V
    //   171: goto -96 -> 75
    //   174: astore 4
    //   176: new 84	com/vvt/exceptions/database/FxDbCorruptException
    //   179: astore 8
    //   181: aload 4
    //   183: invokevirtual 89	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   186: astore 4
    //   188: aload 8
    //   190: aload 4
    //   192: invokespecial 91	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   195: aload 8
    //   197: athrow
    //   198: astore 4
    //   200: aload 5
    //   202: ifnull +10 -> 212
    //   205: aload 5
    //   207: invokeinterface 94 1 0
    //   212: aload 4
    //   214: athrow
    //   215: astore 4
    //   217: aconst_null
    //   218: astore 5
    //   220: new 96	com/vvt/exceptions/database/FxDbOperationException
    //   223: astore 8
    //   225: aload 4
    //   227: invokevirtual 99	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   230: astore 6
    //   232: aload 8
    //   234: aload 6
    //   236: aload 4
    //   238: invokespecial 102	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   241: aload 8
    //   243: athrow
    //   244: aload 5
    //   246: ifnull +10 -> 256
    //   249: aload 5
    //   251: invokeinterface 94 1 0
    //   256: return
    //   257: astore 4
    //   259: goto -39 -> 220
    //   262: astore 4
    //   264: aconst_null
    //   265: astore 5
    //   267: goto -91 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	this	af
    //   0	270	1	paramLong	long
    //   0	270	3	paramFxSettingEvent	FxSettingEvent
    //   3	164	4	localObject1	Object
    //   174	8	4	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   186	5	4	str1	String
    //   198	15	4	localObject2	Object
    //   215	22	4	localThrowable	Throwable
    //   257	1	4	localObject3	Object
    //   262	1	4	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   12	254	5	localObject4	Object
    //   32	203	6	str2	String
    //   45	109	7	i	int
    //   48	194	8	localObject5	Object
    //   82	3	9	bool	boolean
    //   138	5	10	j	int
    // Exception table:
    //   from	to	target	type
    //   75	82	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   89	92	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   94	99	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   105	112	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   116	123	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   131	138	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   142	149	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   153	158	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   160	165	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   166	171	174	android/database/sqlite/SQLiteDatabaseCorruptException
    //   176	179	198	finally
    //   181	186	198	finally
    //   190	195	198	finally
    //   195	198	198	finally
    //   220	223	198	finally
    //   225	230	198	finally
    //   236	241	198	finally
    //   241	244	198	finally
    //   34	38	215	finally
    //   60	64	215	finally
    //   75	82	257	finally
    //   89	92	257	finally
    //   94	99	257	finally
    //   105	112	257	finally
    //   116	123	257	finally
    //   131	138	257	finally
    //   142	149	257	finally
    //   153	158	257	finally
    //   160	165	257	finally
    //   166	171	257	finally
    //   34	38	262	android/database/sqlite/SQLiteDatabaseCorruptException
    //   60	64	262	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  private void b(long paramLong, FxSettingEvent paramFxSettingEvent)
  {
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    this.b.beginTransaction();
    int i = 0;
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      for (;;)
      {
        int j = paramFxSettingEvent.getSettingElementCount();
        if (i >= j) {
          break;
        }
        localObject3 = paramFxSettingEvent.getSettingElement(i);
        String str2 = "event_id";
        Object localObject4 = Long.valueOf(paramLong);
        ((ContentValues)localObject1).put(str2, (Long)localObject4);
        str2 = "setting_id";
        int k = ((i)localObject3).a();
        localObject4 = Integer.valueOf(k);
        ((ContentValues)localObject1).put(str2, (Integer)localObject4);
        str2 = "setting_value";
        localObject3 = ((i)localObject3).b();
        ((ContentValues)localObject1).put(str2, (String)localObject3);
        localObject3 = this.b;
        str2 = "settingid_event";
        k = 0;
        localObject4 = null;
        ((SQLiteDatabase)localObject3).insert(str2, null, (ContentValues)localObject1);
        i += 1;
      }
      localSQLiteDatabase = this.b;
      localSQLiteDatabase.setTransactionSuccessful();
      this.b.endTransaction();
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject1).<init>(str1);
        throw ((Throwable)localObject1);
      }
      finally
      {
        this.b.endTransaction();
      }
    }
    finally
    {
      localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
      Object localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject1).<init>((String)localObject3, localThrowable);
    }
  }
  
  public long a(FxEvent paramFxEvent)
  {
    long l1 = 0L;
    paramFxEvent = (FxSettingEvent)paramFxEvent;
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject2 = "time";
    long l2 = paramFxEvent.getEventTime();
    Object localObject3 = Long.valueOf(l2);
    localContentValues.put((String)localObject2, (Long)localObject3);
    try
    {
      localObject2 = this.b;
      ((SQLiteDatabase)localObject2).beginTransaction();
      localObject2 = this.b;
      localObject3 = "setting_event";
      FxEventType localFxEventType = null;
      long l3 = ((SQLiteDatabase)localObject2).insert((String)localObject3, null, localContentValues);
      boolean bool = l3 < l1;
      if (bool) {
        b(l3, paramFxEvent);
      }
      bool = l3 < l1;
      if (bool)
      {
        localObject3 = this.b;
        localFxEventType = FxEventType.SETTINGS;
        FxEventDirection localFxEventDirection = FxEventDirection.UNKNOWN;
        n.a((SQLiteDatabase)localObject3, l3, localFxEventType, localFxEventDirection);
      }
      localObject3 = this.b;
      ((SQLiteDatabase)localObject3).setTransactionSuccessful();
      this.b.endTransaction();
      return l3;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
      finally
      {
        this.b.endTransaction();
      }
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject3, localThrowable);
    }
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    boolean bool1 = false;
    Cursor localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = "setting_event";
    String str2 = n.a(paramQueryOrder);
    String str3 = Integer.toString(paramInt);
    int i = 0;
    String str4 = null;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, str2, str3);
      if (localCursor != null) {
        for (;;)
        {
          boolean bool2 = localCursor.moveToNext();
          if (!bool2) {
            break;
          }
          localObject2 = new com/vvt/events/FxSettingEvent;
          ((FxSettingEvent)localObject2).<init>();
          str2 = "_id";
          int j = localCursor.getColumnIndex(str2);
          long l1 = localCursor.getLong(j);
          str4 = "time";
          i = localCursor.getColumnIndex(str4);
          long l2 = localCursor.getLong(i);
          ((FxSettingEvent)localObject2).setEventId(l1);
          ((FxSettingEvent)localObject2).setEventTime(l2);
          a(l1, (FxSettingEvent)localObject2);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label252;
      }
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str1);
        throw ((Throwable)localObject2);
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
    localCursor.close();
    label252:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "setting_event";
      str2 = null;
      localSQLiteDatabase.delete((String)localObject, null, null);
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject = new com/vvt/exceptions/database/FxDbCorruptException;
      String str1 = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject).<init>(str1);
      throw ((Throwable)localObject);
    }
    finally
    {
      localObject = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject).<init>(str2, localThrowable);
    }
  }
  
  public int b(long paramLong)
  {
    Object localObject2;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject2 = this.b;
      str2 = "setting_event";
      return ((SQLiteDatabase)localObject2).delete(str2, (String)localObject1, null);
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
      String str1 = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject2).<init>(str1);
      throw ((Throwable)localObject2);
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/af.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */