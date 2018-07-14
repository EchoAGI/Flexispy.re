package com.vvt.eventrepository.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class u
  extends o
{
  private static final boolean a = a.a;
  private SQLiteDatabase b;
  
  public u(SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramSQLiteDatabase;
  }
  
  private void a(Cursor paramCursor)
  {
    if (paramCursor != null) {
      for (;;)
      {
        boolean bool1 = paramCursor.moveToNext();
        if (!bool1) {
          break;
        }
        int i = paramCursor.getColumnIndex("profile_picture_path");
        String str1 = paramCursor.getString(i);
        if (str1 != null)
        {
          String str2 = "";
          boolean bool2 = str1.equals(str2);
          if (!bool2) {
            try
            {
              d.b(str1);
            }
            catch (IllegalArgumentException localIllegalArgumentException) {}
          }
        }
      }
    }
  }
  
  /* Error */
  public long a(com.vvt.base.FxEvent paramFxEvent)
  {
    // Byte code:
    //   0: aload_1
    //   1: checkcast 52	com/vvt/events/FxIMConversationEvent
    //   4: astore_1
    //   5: new 54	android/content/ContentValues
    //   8: astore_2
    //   9: aload_2
    //   10: invokespecial 55	android/content/ContentValues:<init>	()V
    //   13: aload_1
    //   14: invokevirtual 61	com/vvt/events/FxIMConversationEvent:getEventTime	()J
    //   17: lstore_3
    //   18: lload_3
    //   19: invokestatic 67	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   22: astore 5
    //   24: aload_2
    //   25: ldc 57
    //   27: aload 5
    //   29: invokevirtual 71	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   32: aload_1
    //   33: invokevirtual 77	com/vvt/events/FxIMConversationEvent:getImServiceId	()I
    //   36: istore 6
    //   38: iload 6
    //   40: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: astore 5
    //   45: aload_2
    //   46: ldc 73
    //   48: aload 5
    //   50: invokevirtual 85	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   53: aload_1
    //   54: invokevirtual 91	com/vvt/events/FxIMConversationEvent:getOwnerId	()Ljava/lang/String;
    //   57: astore 5
    //   59: aload_2
    //   60: ldc 87
    //   62: aload 5
    //   64: invokevirtual 94	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   67: aload_1
    //   68: invokevirtual 99	com/vvt/events/FxIMConversationEvent:getConversationId	()Ljava/lang/String;
    //   71: astore 5
    //   73: aload_2
    //   74: ldc 96
    //   76: aload 5
    //   78: invokevirtual 94	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload_1
    //   82: invokevirtual 102	com/vvt/events/FxIMConversationEvent:getConversationProfilePicturePath	()Ljava/lang/String;
    //   85: astore 5
    //   87: aload_2
    //   88: ldc 27
    //   90: aload 5
    //   92: invokevirtual 94	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload_1
    //   96: invokevirtual 107	com/vvt/events/FxIMConversationEvent:getConversationTitle	()Ljava/lang/String;
    //   99: astore 5
    //   101: aload_2
    //   102: ldc 104
    //   104: aload 5
    //   106: invokevirtual 94	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: ldc 109
    //   111: astore 7
    //   113: aload_1
    //   114: invokevirtual 112	com/vvt/events/FxIMConversationEvent:getConversationStatusMessage	()Ljava/lang/String;
    //   117: astore 5
    //   119: aload_2
    //   120: aload 7
    //   122: aload 5
    //   124: invokevirtual 94	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: aload_0
    //   128: getfield 19	com/vvt/eventrepository/a/u:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   131: astore 7
    //   133: aload 7
    //   135: invokevirtual 117	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   138: aload_0
    //   139: getfield 19	com/vvt/eventrepository/a/u:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   142: astore 7
    //   144: ldc 119
    //   146: astore 5
    //   148: aconst_null
    //   149: astore 8
    //   151: aload 7
    //   153: aload 5
    //   155: aconst_null
    //   156: aload_2
    //   157: invokevirtual 123	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   160: lstore 9
    //   162: aload_1
    //   163: invokevirtual 127	com/vvt/events/FxIMConversationEvent:getParticipantContactIds	()Ljava/util/HashSet;
    //   166: astore_2
    //   167: aload_2
    //   168: invokevirtual 133	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   171: astore 8
    //   173: aload 8
    //   175: invokeinterface 138 1 0
    //   180: istore 11
    //   182: iload 11
    //   184: ifeq +113 -> 297
    //   187: aload 8
    //   189: invokeinterface 142 1 0
    //   194: astore_2
    //   195: aload_2
    //   196: checkcast 39	java/lang/String
    //   199: astore_2
    //   200: new 54	android/content/ContentValues
    //   203: astore 12
    //   205: aload 12
    //   207: invokespecial 55	android/content/ContentValues:<init>	()V
    //   210: ldc -112
    //   212: astore 13
    //   214: lload 9
    //   216: invokestatic 67	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   219: astore 14
    //   221: aload 12
    //   223: aload 13
    //   225: aload 14
    //   227: invokevirtual 71	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   230: ldc -110
    //   232: astore 13
    //   234: aload 12
    //   236: aload 13
    //   238: aload_2
    //   239: invokevirtual 94	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   242: aload_0
    //   243: getfield 19	com/vvt/eventrepository/a/u:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   246: astore_2
    //   247: ldc -108
    //   249: astore 13
    //   251: aconst_null
    //   252: astore 14
    //   254: aload_2
    //   255: aload 13
    //   257: aconst_null
    //   258: aload 12
    //   260: invokevirtual 123	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   263: pop2
    //   264: goto -91 -> 173
    //   267: astore_2
    //   268: new 150	com/vvt/exceptions/database/FxDbCorruptException
    //   271: astore 7
    //   273: aload_2
    //   274: invokevirtual 155	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   277: astore_2
    //   278: aload 7
    //   280: aload_2
    //   281: invokespecial 157	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   284: aload 7
    //   286: athrow
    //   287: astore_2
    //   288: aload_0
    //   289: getfield 19	com/vvt/eventrepository/a/u:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   292: invokevirtual 160	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   295: aload_2
    //   296: athrow
    //   297: lconst_0
    //   298: lstore 15
    //   300: lload 9
    //   302: lload 15
    //   304: lcmp
    //   305: istore 11
    //   307: iload 11
    //   309: ifle +29 -> 338
    //   312: aload_0
    //   313: getfield 19	com/vvt/eventrepository/a/u:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   316: astore_2
    //   317: getstatic 166	com/vvt/base/FxEventType:IM_CONVERSATION	Lcom/vvt/base/FxEventType;
    //   320: astore 8
    //   322: getstatic 172	com/vvt/events/FxEventDirection:UNKNOWN	Lcom/vvt/events/FxEventDirection;
    //   325: astore 12
    //   327: aload_2
    //   328: lload 9
    //   330: aload 8
    //   332: aload 12
    //   334: invokestatic 177	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;JLcom/vvt/base/FxEventType;Lcom/vvt/events/FxEventDirection;)J
    //   337: pop2
    //   338: aload_0
    //   339: getfield 19	com/vvt/eventrepository/a/u:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   342: astore_2
    //   343: aload_2
    //   344: invokevirtual 180	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   347: aload_0
    //   348: getfield 19	com/vvt/eventrepository/a/u:removeFromPath	Landroid/database/sqlite/SQLiteDatabase;
    //   351: invokevirtual 160	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   354: lload 9
    //   356: lreturn
    //   357: astore_2
    //   358: new 182	com/vvt/exceptions/database/FxDbOperationException
    //   361: astore 7
    //   363: aload_2
    //   364: invokevirtual 185	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   367: astore 5
    //   369: aload 7
    //   371: aload 5
    //   373: aload_2
    //   374: invokespecial 188	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   377: aload 7
    //   379: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	380	0	this	u
    //   0	380	1	paramFxEvent	com.vvt.base.FxEvent
    //   8	247	2	localObject1	Object
    //   267	7	2	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   277	4	2	str1	String
    //   287	9	2	localObject2	Object
    //   316	28	2	localSQLiteDatabase	SQLiteDatabase
    //   357	17	2	localThrowable	Throwable
    //   17	2	3	l1	long
    //   22	350	5	localObject3	Object
    //   36	3	6	i	int
    //   111	267	7	localObject4	Object
    //   149	182	8	localObject5	Object
    //   160	195	9	l2	long
    //   180	128	11	bool	boolean
    //   203	130	12	localObject6	Object
    //   212	44	13	str2	String
    //   219	34	14	localLong	Long
    //   298	5	15	l3	long
    // Exception table:
    //   from	to	target	type
    //   127	131	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   133	138	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   138	142	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   156	160	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   162	166	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   167	171	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   173	180	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   187	194	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   195	199	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   200	203	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   205	210	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   214	219	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   225	230	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   238	242	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   242	246	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   258	264	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   312	316	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   317	320	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   322	325	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   332	338	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   338	342	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   343	347	267	android/database/sqlite/SQLiteDatabaseCorruptException
    //   268	271	287	finally
    //   273	277	287	finally
    //   280	284	287	finally
    //   284	287	287	finally
    //   358	361	287	finally
    //   363	367	287	finally
    //   373	377	287	finally
    //   377	380	287	finally
    //   127	131	357	finally
    //   133	138	357	finally
    //   138	142	357	finally
    //   156	160	357	finally
    //   162	166	357	finally
    //   167	171	357	finally
    //   173	180	357	finally
    //   187	194	357	finally
    //   195	199	357	finally
    //   200	203	357	finally
    //   205	210	357	finally
    //   214	219	357	finally
    //   225	230	357	finally
    //   238	242	357	finally
    //   242	246	357	finally
    //   258	264	357	finally
    //   312	316	357	finally
    //   317	320	357	finally
    //   322	325	357	finally
    //   332	338	357	finally
    //   338	342	357	finally
    //   343	347	357	finally
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = false;
    Cursor localCursor = null;
    Object localObject2 = "im_conversation";
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
          localObject2 = new com/vvt/events/FxIMConversationEvent;
          ((FxIMConversationEvent)localObject2).<init>();
          str2 = "_id";
          int j = localCursor.getColumnIndex(str2);
          long l1 = localCursor.getLong(j);
          str4 = "time";
          i = localCursor.getColumnIndex(str4);
          long l2 = localCursor.getLong(i);
          String str5 = "im_service_id";
          int k = localCursor.getColumnIndex(str5);
          k = localCursor.getInt(k);
          String str6 = "owner_id";
          int m = localCursor.getColumnIndex(str6);
          str6 = localCursor.getString(m);
          String str7 = "conversation_id";
          int n = localCursor.getColumnIndex(str7);
          str7 = localCursor.getString(n);
          String str8 = "profile_picture_path";
          int i1 = localCursor.getColumnIndex(str8);
          str8 = localCursor.getString(i1);
          String str9 = "title";
          int i2 = localCursor.getColumnIndex(str9);
          str9 = localCursor.getString(i2);
          String str10 = "status_message";
          int i3 = localCursor.getColumnIndex(str10);
          str10 = localCursor.getString(i3);
          Object localObject3 = "%s = '%s'";
          int i4 = 2;
          Object localObject4 = new Object[i4];
          int i5 = 0;
          Object localObject5 = "conversation_rowid";
          localObject4[0] = localObject5;
          i5 = 1;
          localObject5 = Long.valueOf(l1);
          localObject4[i5] = localObject5;
          localObject3 = String.format((String)localObject3, (Object[])localObject4);
          localObject4 = this.b;
          localObject3 = n.d((SQLiteDatabase)localObject4, (String)localObject3);
          ((FxIMConversationEvent)localObject2).setEventId(l1);
          ((FxIMConversationEvent)localObject2).setEventTime(l2);
          ((FxIMConversationEvent)localObject2).setImServiceId(k);
          ((FxIMConversationEvent)localObject2).setOwnerId(str6);
          ((FxIMConversationEvent)localObject2).setConversationId(str7);
          ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath(str8);
          ((FxIMConversationEvent)localObject2).setConversationTitle(str9);
          ((FxIMConversationEvent)localObject2).setConversationStatusMessage(str10);
          ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
          localArrayList.add(localObject2);
        }
      }
      String str1;
      if (localCursor == null) {
        break label506;
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
    label506:
    bool1 = a;
    if (bool1) {}
    return localThrowable;
  }
  
  public void a()
  {
    Cursor localCursor = null;
    Object localObject2;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b;
      localObject2 = "im_conversation";
      str2 = null;
      localCursor = n.a(localSQLiteDatabase, (String)localObject2, null, null, null);
      a(localCursor);
      localSQLiteDatabase = this.b;
      localObject2 = "im_conversation";
      str2 = null;
      localSQLiteDatabase.delete((String)localObject2, null, null);
      if (localCursor != null) {
        localCursor.close();
      }
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
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
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
  }
  
  public int b(long paramLong)
  {
    Cursor localCursor = null;
    Object localObject3;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = this.b;
      str2 = "im_conversation";
      localCursor = n.a((SQLiteDatabase)localObject3, str2, (String)localObject1, null, null);
      boolean bool = a;
      if (bool) {}
      a(localCursor);
      localObject3 = this.b;
      str2 = "im_conversation";
      int i = ((SQLiteDatabase)localObject3).delete(str2, (String)localObject1, null);
      if (localCursor != null) {
        localCursor.close();
      }
      return i;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject3).<init>(str1);
        throw ((Throwable)localObject3);
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
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>(str2, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */