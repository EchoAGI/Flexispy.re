package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxPanicStatusEvent;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;

public class ac
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public ac(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  public long a(FxEvent paramFxEvent)
  {
    paramFxEvent = (FxPanicStatusEvent)paramFxEvent;
    int i = paramFxEvent.getStatus();
    if (i != 0) {}
    for (i = 1;; j = 2)
    {
      Object localObject1 = new android/content/ContentValues;
      ((ContentValues)localObject1).<init>();
      Object localObject2 = Integer.valueOf(i);
      ((ContentValues)localObject1).put("panic_status", (Integer)localObject2);
      localObject2 = "time";
      long l1 = paramFxEvent.getEventTime();
      Object localObject4 = Long.valueOf(l1);
      ((ContentValues)localObject1).put((String)localObject2, (Long)localObject4);
      try
      {
        localObject2 = this.b;
        ((SQLiteDatabase)localObject2).beginTransaction();
        localObject2 = this.b;
        localObject4 = "panic";
        FxEventType localFxEventType = null;
        long l2 = ((SQLiteDatabase)localObject2).insert((String)localObject4, null, (ContentValues)localObject1);
        l1 = 0L;
        boolean bool = l2 < l1;
        if (bool)
        {
          localObject4 = this.b;
          localFxEventType = FxEventType.PANIC_STATUS;
          FxEventDirection localFxEventDirection = FxEventDirection.UNKNOWN;
          n.a((SQLiteDatabase)localObject4, l2, localFxEventType, localFxEventDirection);
        }
        localObject4 = this.b;
        ((SQLiteDatabase)localObject4).setTransactionSuccessful();
        this.b.endTransaction();
        return l2;
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        try
        {
          int j;
          localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
          String str = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject1).<init>(str);
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
        localObject4 = localThrowable.getMessage();
        ((FxDbOperationException)localObject1).<init>((String)localObject4, localThrowable);
      }
    }
  }
  
  /* Error */
  public java.util.List a(com.vvt.eventrepository.querycriteria.QueryOrder paramQueryOrder, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: new 111	java/util/ArrayList
    //   8: astore 5
    //   10: aload 5
    //   12: invokespecial 112	java/util/ArrayList:<init>	()V
    //   15: ldc 62
    //   17: astore 6
    //   19: aload_1
    //   20: invokestatic 115	com/vvt/eventrepository/a/n:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)Ljava/lang/String;
    //   23: astore 7
    //   25: iload_2
    //   26: invokestatic 119	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   29: astore 8
    //   31: aload_0
    //   32: getfield 19	com/vvt/eventrepository/a/ac:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   35: astore 9
    //   37: aconst_null
    //   38: astore 10
    //   40: aload 9
    //   42: aload 6
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: aconst_null
    //   49: aload 7
    //   51: aload 8
    //   53: invokevirtual 123	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore 9
    //   58: aload 9
    //   60: ifnull +201 -> 261
    //   63: aload 9
    //   65: invokeinterface 128 1 0
    //   70: istore 11
    //   72: iload 11
    //   74: ifeq +187 -> 261
    //   77: new 21	com/vvt/events/FxPanicStatusEvent
    //   80: astore 10
    //   82: aload 10
    //   84: invokespecial 129	com/vvt/events/FxPanicStatusEvent:<init>	()V
    //   87: ldc -125
    //   89: astore 6
    //   91: aload 9
    //   93: aload 6
    //   95: invokeinterface 135 2 0
    //   100: istore 11
    //   102: aload 9
    //   104: iload 11
    //   106: invokeinterface 139 2 0
    //   111: lstore 12
    //   113: ldc 43
    //   115: astore 6
    //   117: aload 9
    //   119: aload 6
    //   121: invokeinterface 135 2 0
    //   126: istore 11
    //   128: aload 9
    //   130: iload 11
    //   132: invokeinterface 139 2 0
    //   137: lstore 14
    //   139: ldc 31
    //   141: astore 6
    //   143: aload 9
    //   145: aload 6
    //   147: invokeinterface 135 2 0
    //   152: istore 11
    //   154: aload 9
    //   156: iload 11
    //   158: invokeinterface 143 2 0
    //   163: istore 11
    //   165: iload 11
    //   167: iload_3
    //   168: if_icmpne +67 -> 235
    //   171: iload_3
    //   172: istore 11
    //   174: aload 10
    //   176: lload 12
    //   178: invokevirtual 147	com/vvt/events/FxPanicStatusEvent:setEventId	(J)V
    //   181: aload 10
    //   183: lload 14
    //   185: invokevirtual 150	com/vvt/events/FxPanicStatusEvent:setEventTime	(J)V
    //   188: aload 10
    //   190: iload 11
    //   192: invokevirtual 154	com/vvt/events/FxPanicStatusEvent:setStatus	(Z)V
    //   195: aload 5
    //   197: aload 10
    //   199: invokeinterface 160 2 0
    //   204: pop
    //   205: goto -142 -> 63
    //   208: astore 6
    //   210: aload 9
    //   212: ifnull +10 -> 222
    //   215: aload 9
    //   217: invokeinterface 163 1 0
    //   222: getstatic 13	com/vvt/eventrepository/a/ac:a	Z
    //   225: istore 16
    //   227: iload 16
    //   229: ifeq +3 -> 232
    //   232: aload 5
    //   234: areturn
    //   235: iconst_0
    //   236: istore 11
    //   238: aconst_null
    //   239: astore 6
    //   241: goto -67 -> 174
    //   244: astore 9
    //   246: aload 4
    //   248: ifnull +10 -> 258
    //   251: aload 4
    //   253: invokeinterface 163 1 0
    //   258: aload 9
    //   260: athrow
    //   261: aload 9
    //   263: ifnull -41 -> 222
    //   266: goto -51 -> 215
    //   269: astore 6
    //   271: aload 9
    //   273: astore 4
    //   275: aload 6
    //   277: astore 9
    //   279: goto -33 -> 246
    //   282: astore 9
    //   284: iconst_0
    //   285: istore 16
    //   287: aconst_null
    //   288: astore 9
    //   290: goto -80 -> 210
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	293	0	this	ac
    //   0	293	1	paramQueryOrder	com.vvt.eventrepository.querycriteria.QueryOrder
    //   0	293	2	paramInt	int
    //   1	171	3	i	int
    //   3	271	4	localObject1	Object
    //   8	225	5	localArrayList	java.util.ArrayList
    //   17	129	6	str1	String
    //   208	1	6	localException1	Exception
    //   239	1	6	localObject2	Object
    //   269	7	6	localObject3	Object
    //   23	27	7	str2	String
    //   29	23	8	str3	String
    //   35	181	9	localObject4	Object
    //   244	28	9	localObject5	Object
    //   277	1	9	localObject6	Object
    //   282	1	9	localException2	Exception
    //   288	1	9	localObject7	Object
    //   38	160	10	localFxPanicStatusEvent	FxPanicStatusEvent
    //   70	3	11	bool1	boolean
    //   100	91	11	j	int
    //   236	1	11	k	int
    //   111	66	12	l1	long
    //   137	47	14	l2	long
    //   225	61	16	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   63	70	208	java/lang/Exception
    //   77	80	208	java/lang/Exception
    //   82	87	208	java/lang/Exception
    //   93	100	208	java/lang/Exception
    //   104	111	208	java/lang/Exception
    //   119	126	208	java/lang/Exception
    //   130	137	208	java/lang/Exception
    //   145	152	208	java/lang/Exception
    //   156	163	208	java/lang/Exception
    //   176	181	208	java/lang/Exception
    //   183	188	208	java/lang/Exception
    //   190	195	208	java/lang/Exception
    //   197	205	208	java/lang/Exception
    //   31	35	244	finally
    //   51	56	244	finally
    //   63	70	269	finally
    //   77	80	269	finally
    //   82	87	269	finally
    //   93	100	269	finally
    //   104	111	269	finally
    //   119	126	269	finally
    //   130	137	269	finally
    //   145	152	269	finally
    //   156	163	269	finally
    //   176	181	269	finally
    //   183	188	269	finally
    //   190	195	269	finally
    //   197	205	269	finally
    //   31	35	282	java/lang/Exception
    //   51	56	282	java/lang/Exception
  }
  
  public void a()
  {
    Object localObject;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject = "panic";
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
      str2 = "panic";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */