package com.vvt.callhandler;

import android.content.Context;
import com.vvt.base.FeatureId;
import com.vvt.base.RunningMode;
import com.vvt.events.FxAudioConversationEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.preference.FxPrefCommonList;
import com.vvt.preference.FxPreferenceException;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefCallRecordingWatchFlag;
import com.vvt.preference.PrefCallRecordingWatchNumber;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.preference.PrefSpyCall;
import com.vvt.preference.PrefWatchList;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private static final FxPreferenceType[] d;
  
  static
  {
    FxPreferenceType[] arrayOfFxPreferenceType = new FxPreferenceType[5];
    FxPreferenceType localFxPreferenceType = FxPreferenceType.CIS_NUMBER;
    arrayOfFxPreferenceType[0] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.EMERGENCY_NUMBER;
    arrayOfFxPreferenceType[1] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.HOME_NUMBER;
    arrayOfFxPreferenceType[2] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.MONITOR_NUMBER;
    arrayOfFxPreferenceType[3] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.NOTIFICATION_NUMBER;
    arrayOfFxPreferenceType[4] = localFxPreferenceType;
    d = arrayOfFxPreferenceType;
  }
  
  protected static String a()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("conversation_rec_");
    Object localObject2 = new java/text/SimpleDateFormat;
    ((SimpleDateFormat)localObject2).<init>("yyyyMMdd_HHmmss");
    Date localDate = new java/util/Date;
    localDate.<init>();
    localObject2 = ((SimpleDateFormat)localObject2).format(localDate);
    localObject1 = (String)localObject2;
    boolean bool = a;
    if (bool) {}
    return (String)localObject1;
  }
  
  protected static String a(String paramString)
  {
    Object localObject1 = c(paramString);
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool1 = ((File)localObject2).exists();
    if (!bool1)
    {
      bool1 = a;
      if (bool1) {}
      ((File)localObject2).mkdirs();
    }
    localObject2 = File.separator;
    boolean bool2 = ((String)localObject1).endsWith((String)localObject2);
    if (!bool2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = File.separator;
      localObject1 = (String)localObject2;
    }
    bool2 = a;
    if (bool2) {}
    return (String)localObject1;
  }
  
  private static List a(com.vvt.preference.b paramb)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      FxPreferenceType[] arrayOfFxPreferenceType = d;
      int i = arrayOfFxPreferenceType.length;
      int j = 0;
      Object localObject = null;
      for (int k = 0; k < i; k = j)
      {
        localObject = arrayOfFxPreferenceType[k];
        localObject = paramb.a((FxPreferenceType)localObject);
        localObject = (FxPrefCommonList)localObject;
        localObject = ((FxPrefCommonList)localObject).getList();
        localArrayList.addAll((Collection)localObject);
        j = k + 1;
      }
      bool = a;
      if (!bool) {}
    }
    catch (FxPreferenceException localFxPreferenceException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return localArrayList;
  }
  
  protected static void a(com.vvt.base.a parama, String paramString)
  {
    boolean bool = a;
    if (bool) {}
    FxSystemEvent localFxSystemEvent = new com/vvt/events/FxSystemEvent;
    localFxSystemEvent.<init>();
    Object localObject = FxEventDirection.OUT;
    localFxSystemEvent.setDirection((FxEventDirection)localObject);
    long l = System.currentTimeMillis();
    localFxSystemEvent.setEventTime(l);
    localObject = FxSystemEventCategories.CATEGORY_CALL_RECORDING;
    localFxSystemEvent.setLogType((FxSystemEventCategories)localObject);
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramString;
    localObject = String.format("Cannot start the recording.\nReason:%s.", arrayOfObject);
    localFxSystemEvent.setMessage((String)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    ((List)localObject).add(localFxSystemEvent);
    parama.a((List)localObject);
    bool = a;
    if (bool) {}
  }
  
  protected static void a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, long paramLong, com.vvt.base.a parama, FxMediaType paramFxMediaType, String paramString4)
  {
    boolean bool1 = a;
    if (bool1) {}
    FxAudioConversationEvent localFxAudioConversationEvent = new com/vvt/events/FxAudioConversationEvent;
    localFxAudioConversationEvent.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = c(paramString1);
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = "call_rec_id.id";
    long l1 = d((String)localObject2);
    localFxAudioConversationEvent.setEventId(l1);
    long l2 = System.currentTimeMillis();
    localFxAudioConversationEvent.setEventTime(l2);
    localFxAudioConversationEvent.setParingId(l1);
    localFxAudioConversationEvent.setFormat(paramFxMediaType);
    localObject1 = new com/vvt/events/b;
    ((com.vvt.events.b)localObject1).<init>();
    if (paramBoolean)
    {
      localObject2 = FxEventDirection.IN;
      ((com.vvt.events.b)localObject1).a((FxEventDirection)localObject2);
    }
    for (;;)
    {
      boolean bool2 = com.vvt.ah.a.c(paramString3);
      if (bool2)
      {
        paramString4 = "private/unknown";
        paramString3 = paramString4;
      }
      ((com.vvt.events.b)localObject1).a(paramString3);
      ((com.vvt.events.b)localObject1).b(paramString4);
      ((com.vvt.events.b)localObject1).a(paramLong);
      localFxAudioConversationEvent.setEmbededCallInfo((com.vvt.events.b)localObject1);
      localObject1 = e(paramString2);
      localFxAudioConversationEvent.setFileName((String)localObject1);
      localFxAudioConversationEvent.setFilePath(paramString2);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      ((List)localObject1).add(localFxAudioConversationEvent);
      parama.a((List)localObject1);
      bool1 = a;
      if (bool1) {}
      return;
      localObject2 = FxEventDirection.OUT;
      ((com.vvt.events.b)localObject1).a((FxEventDirection)localObject2);
    }
  }
  
  protected static boolean a(Context paramContext, RunningMode paramRunningMode, com.vvt.preference.b paramb, String paramString)
  {
    boolean bool1 = false;
    ArrayList localArrayList = null;
    Object localObject1 = RunningMode.NORMAL;
    Object localObject4;
    boolean bool4;
    if (paramRunningMode != localObject1)
    {
      localObject1 = RunningMode.LIMITED_1;
      if (paramRunningMode != localObject1) {}
    }
    else
    {
      try
      {
        localObject1 = FxPreferenceType.EVENTS_CTRL;
        localObject1 = paramb.a((FxPreferenceType)localObject1);
        localObject1 = (PrefEventsCapture)localObject1;
        localObject4 = FeatureId.CAPTURE_CALL_RECORDING;
        bool2 = ((PrefEventsCapture)localObject1).isCapture((FeatureId)localObject4);
        bool4 = a;
        if ((!bool4) || (!bool2)) {
          return bool1;
        }
      }
      catch (Exception localException)
      {
        bool2 = c;
        if (!bool2) {}
      }
    }
    boolean bool2 = com.vvt.ah.a.c(paramString);
    l locall;
    List localList;
    if (!bool2)
    {
      bool2 = b(paramString);
      if (!bool2) {}
    }
    else
    {
      locall = new com/vvt/callhandler/l;
      locall.<init>(paramContext, paramRunningMode);
      localList = a(paramb);
    }
    for (;;)
    {
      try
      {
        Object localObject2 = FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
        localObject2 = paramb.a((FxPreferenceType)localObject2);
        localObject2 = (PrefCallRecordingWatchFlag)localObject2;
        localObject4 = FxPreferenceType.CALL_RECORDING_WATCH_NUMBER;
        localObject4 = paramb.a((FxPreferenceType)localObject4);
        localObject4 = (PrefCallRecordingWatchNumber)localObject4;
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject4 = ((PrefCallRecordingWatchNumber)localObject4).getList();
        localArrayList.addAll((Collection)localObject4);
        int i = ((PrefCallRecordingWatchFlag)localObject2).getCallRecWatchFlag();
        bool3 = k.a(locall, localList, i, localArrayList, paramString);
        bool4 = a;
        if ((!bool4) || (!bool3))
        {
          bool3 = k.a(paramString, paramb);
          bool4 = a;
          if (!bool4) {}
        }
        bool4 = a;
        if (bool4) {}
        bool1 = bool3;
      }
      catch (FxPreferenceException localFxPreferenceException)
      {
        bool3 = c;
      }
      if (!bool3) {
        break;
      }
      break;
      boolean bool3 = false;
      Object localObject3 = null;
    }
  }
  
  protected static boolean a(Context paramContext, RunningMode paramRunningMode, com.vvt.preference.b paramb, String paramString, List paramList)
  {
    for (;;)
    {
      try
      {
        localObject1 = FxPreferenceType.SPY_CALL;
        localObject1 = paramb.a((FxPreferenceType)localObject1);
        localObject1 = (PrefSpyCall)localObject1;
        bool = ((PrefSpyCall)localObject1).isSpyCallEnabled();
        if (!bool) {
          continue;
        }
        bool = a;
        if (bool) {}
        locall = new com/vvt/callhandler/l;
        locall.<init>(paramContext, paramRunningMode);
        localList = a(paramb);
      }
      catch (FxPreferenceException localFxPreferenceException1)
      {
        Object localObject1;
        l locall;
        List localList;
        boolean bool = c;
        if (bool) {}
        bool = false;
        Object localObject2 = null;
        continue;
        bool = a;
        if (!bool) {
          continue;
        }
        bool = false;
        Object localObject3 = null;
        continue;
      }
      try
      {
        localObject1 = FxPreferenceType.WATCH_LIST;
        localObject1 = paramb.a((FxPreferenceType)localObject1);
        localObject1 = (PrefWatchList)localObject1;
        bool = k.a(locall, localList, (PrefWatchList)localObject1, paramString);
        if (!bool) {
          continue;
        }
        bool = com.vvt.ah.a.a(paramList, paramString);
        if (!bool) {
          continue;
        }
        bool = a;
        if (bool) {}
        bool = false;
        localObject1 = null;
      }
      catch (FxPreferenceException localFxPreferenceException2)
      {
        bool = c;
        if (!bool) {
          continue;
        }
        bool = false;
        localObject3 = null;
        continue;
        bool = a;
        if (!bool) {
          continue;
        }
        bool = true;
        continue;
        bool = a;
        if (!bool) {
          continue;
        }
        bool = false;
        localObject3 = null;
      }
    }
    return bool;
  }
  
  protected static void b(com.vvt.base.a parama, String paramString)
  {
    boolean bool = a;
    if (bool) {}
    FxSystemEvent localFxSystemEvent = new com/vvt/events/FxSystemEvent;
    localFxSystemEvent.<init>();
    Object localObject = FxEventDirection.OUT;
    localFxSystemEvent.setDirection((FxEventDirection)localObject);
    long l = System.currentTimeMillis();
    localFxSystemEvent.setEventTime(l);
    localObject = FxSystemEventCategories.CATEGORY_CALL_NOTIFICATION_HOME_IN;
    localFxSystemEvent.setLogType((FxSystemEventCategories)localObject);
    localFxSystemEvent.setMessage(paramString);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    ((List)localObject).add(localFxSystemEvent);
    parama.a((List)localObject);
    bool = a;
    if (bool) {}
  }
  
  private static boolean b(String paramString)
  {
    boolean bool = false;
    if (paramString != null)
    {
      int i = paramString.charAt(0);
      int j = 43;
      if (i != j)
      {
        j = 48;
        if (i >= j)
        {
          j = 57;
          if (i > j) {}
        }
      }
      else
      {
        bool = true;
      }
    }
    return bool;
  }
  
  private static String c(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append(paramString);
    String str = File.separator;
    localStringBuilder = localStringBuilder.append(str).append("cr");
    str = File.separator;
    return str;
  }
  
  /* Error */
  private static long d(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_m1
    //   3: i2l
    //   4: lstore_2
    //   5: new 84	java/io/File
    //   8: astore 4
    //   10: aload 4
    //   12: aload_0
    //   13: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: aload 4
    //   18: invokevirtual 89	java/io/File:exists	()Z
    //   21: istore 5
    //   23: iload 5
    //   25: ifeq +191 -> 216
    //   28: new 317	java/io/FileInputStream
    //   31: astore 6
    //   33: aload 6
    //   35: aload 4
    //   37: invokespecial 320	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   40: new 322	java/io/DataInputStream
    //   43: astore 7
    //   45: aload 7
    //   47: aload 6
    //   49: invokespecial 325	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   52: aload 7
    //   54: invokevirtual 328	java/io/DataInputStream:readLong	()J
    //   57: lstore 8
    //   59: aload 7
    //   61: invokevirtual 331	java/io/DataInputStream:close	()V
    //   64: aload 6
    //   66: invokestatic 335	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   69: getstatic 15	com/vvt/callhandler/removeFromPath:a	Z
    //   72: istore 10
    //   74: iload 10
    //   76: ifeq +3 -> 79
    //   79: lconst_1
    //   80: lstore_2
    //   81: lload 8
    //   83: lload_2
    //   84: ladd
    //   85: lstore 11
    //   87: new 339	java/io/FileOutputStream
    //   90: astore 13
    //   92: iconst_0
    //   93: istore 14
    //   95: aconst_null
    //   96: astore 15
    //   98: aload 13
    //   100: aload 4
    //   102: iconst_0
    //   103: invokespecial 342	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   106: new 344	java/io/DataOutputStream
    //   109: astore 15
    //   111: aload 15
    //   113: aload 13
    //   115: invokespecial 347	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   118: aload 15
    //   120: lload 11
    //   122: invokevirtual 350	java/io/DataOutputStream:writeLong	(J)V
    //   125: aload 15
    //   127: invokevirtual 351	java/io/DataOutputStream:close	()V
    //   130: aload 13
    //   132: invokestatic 353	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   135: getstatic 15	com/vvt/callhandler/removeFromPath:a	Z
    //   138: istore 5
    //   140: iload 5
    //   142: ifeq +3 -> 145
    //   145: lload 11
    //   147: lreturn
    //   148: astore 13
    //   150: iconst_0
    //   151: istore 5
    //   153: aconst_null
    //   154: astore 13
    //   156: getstatic 24	com/vvt/callhandler/removeFromPath:MyUncaughtExceptionHandler	Z
    //   159: istore 16
    //   161: iload 16
    //   163: ifeq +3 -> 166
    //   166: aload 13
    //   168: invokestatic 335	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   171: lload_2
    //   172: lstore 8
    //   174: goto -105 -> 69
    //   177: astore 13
    //   179: aconst_null
    //   180: astore 6
    //   182: getstatic 24	com/vvt/callhandler/removeFromPath:MyUncaughtExceptionHandler	Z
    //   185: istore 5
    //   187: iload 5
    //   189: ifeq +3 -> 192
    //   192: aload 6
    //   194: invokestatic 335	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   197: lload_2
    //   198: lstore 8
    //   200: goto -131 -> 69
    //   203: astore 13
    //   205: aconst_null
    //   206: astore 6
    //   208: aload 6
    //   210: invokestatic 335	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   213: aload 13
    //   215: athrow
    //   216: getstatic 19	com/vvt/callhandler/removeFromPath:removeFromPath	Z
    //   219: istore 5
    //   221: iload 5
    //   223: ifeq +3 -> 226
    //   226: lload_2
    //   227: lstore 8
    //   229: goto -150 -> 79
    //   232: astore 13
    //   234: getstatic 24	com/vvt/callhandler/removeFromPath:MyUncaughtExceptionHandler	Z
    //   237: istore 5
    //   239: iload 5
    //   241: ifeq +3 -> 244
    //   244: aload_1
    //   245: invokestatic 353	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   248: goto -113 -> 135
    //   251: astore 13
    //   253: iconst_0
    //   254: istore 5
    //   256: aconst_null
    //   257: astore 13
    //   259: getstatic 24	com/vvt/callhandler/removeFromPath:MyUncaughtExceptionHandler	Z
    //   262: istore 14
    //   264: iload 14
    //   266: ifeq -136 -> 130
    //   269: goto -139 -> 130
    //   272: astore 13
    //   274: aload_1
    //   275: invokestatic 353	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   278: aload 13
    //   280: athrow
    //   281: astore 17
    //   283: aload 13
    //   285: astore_1
    //   286: aload 17
    //   288: astore 13
    //   290: goto -16 -> 274
    //   293: astore 15
    //   295: goto -36 -> 259
    //   298: astore 15
    //   300: aload 13
    //   302: astore_1
    //   303: goto -69 -> 234
    //   306: astore 13
    //   308: goto -100 -> 208
    //   311: astore 17
    //   313: aload 13
    //   315: astore 6
    //   317: aload 17
    //   319: astore 13
    //   321: goto -113 -> 208
    //   324: astore 13
    //   326: goto -144 -> 182
    //   329: astore 13
    //   331: aload 6
    //   333: astore 13
    //   335: goto -179 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	338	0	paramString	String
    //   1	302	1	localObject1	Object
    //   4	223	2	l1	long
    //   8	93	4	localFile	File
    //   21	234	5	bool1	boolean
    //   31	301	6	localObject2	Object
    //   43	17	7	localDataInputStream	java.io.DataInputStream
    //   57	171	8	l2	long
    //   72	3	10	bool2	boolean
    //   85	61	11	l3	long
    //   90	41	13	localFileOutputStream	java.io.FileOutputStream
    //   148	1	13	localFileNotFoundException1	java.io.FileNotFoundException
    //   154	13	13	localInputStream	java.io.InputStream
    //   177	1	13	localIOException1	java.io.IOException
    //   203	11	13	localObject3	Object
    //   232	1	13	localFileNotFoundException2	java.io.FileNotFoundException
    //   251	1	13	localIOException2	java.io.IOException
    //   257	1	13	localObject4	Object
    //   272	12	13	localObject5	Object
    //   288	13	13	localObject6	Object
    //   306	8	13	localObject7	Object
    //   319	1	13	localObject8	Object
    //   324	1	13	localIOException3	java.io.IOException
    //   329	1	13	localFileNotFoundException3	java.io.FileNotFoundException
    //   333	1	13	localObject9	Object
    //   93	172	14	bool3	boolean
    //   96	30	15	localDataOutputStream	java.io.DataOutputStream
    //   293	1	15	localIOException4	java.io.IOException
    //   298	1	15	localFileNotFoundException4	java.io.FileNotFoundException
    //   159	3	16	bool4	boolean
    //   281	6	17	localObject10	Object
    //   311	7	17	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   28	31	148	java/io/FileNotFoundException
    //   35	40	148	java/io/FileNotFoundException
    //   28	31	177	java/io/IOException
    //   35	40	177	java/io/IOException
    //   28	31	203	finally
    //   35	40	203	finally
    //   87	90	232	java/io/FileNotFoundException
    //   102	106	232	java/io/FileNotFoundException
    //   87	90	251	java/io/IOException
    //   102	106	251	java/io/IOException
    //   87	90	272	finally
    //   102	106	272	finally
    //   234	237	272	finally
    //   106	109	281	finally
    //   113	118	281	finally
    //   120	125	281	finally
    //   125	130	281	finally
    //   259	262	281	finally
    //   106	109	293	java/io/IOException
    //   113	118	293	java/io/IOException
    //   120	125	293	java/io/IOException
    //   125	130	293	java/io/IOException
    //   106	109	298	java/io/FileNotFoundException
    //   113	118	298	java/io/FileNotFoundException
    //   120	125	298	java/io/FileNotFoundException
    //   125	130	298	java/io/FileNotFoundException
    //   40	43	306	finally
    //   47	52	306	finally
    //   52	57	306	finally
    //   59	64	306	finally
    //   182	185	306	finally
    //   156	159	311	finally
    //   40	43	324	java/io/IOException
    //   47	52	324	java/io/IOException
    //   52	57	324	java/io/IOException
    //   59	64	324	java/io/IOException
    //   40	43	329	java/io/FileNotFoundException
    //   47	52	329	java/io/FileNotFoundException
    //   52	57	329	java/io/FileNotFoundException
    //   59	64	329	java/io/FileNotFoundException
  }
  
  private static String e(String paramString)
  {
    String[] arrayOfString = paramString.split("/");
    int i = arrayOfString.length + -1;
    return arrayOfString[i];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */