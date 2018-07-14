package com.vvt.capture.viber.mode.full;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import android.os.SystemClock;
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
import com.vvt.im.events.info.f;
import com.vvt.io.o;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.b;
      c = com.vvt.ak.a.e;
      return;
    }
  }
  
  static int a(String paramString, ViberMessageType paramViberMessageType)
  {
    MessageType.none.getNumber();
    Object localObject = d.a;
    int i = paramViberMessageType.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      localObject = MessageType.none;
      j = ((MessageType)localObject).getNumber();
    }
    for (;;)
    {
      return j;
      localObject = MessageType.Text;
      j = ((MessageType)localObject).getNumber();
      continue;
      if (paramString != null)
      {
        j = paramString.length();
        if (j > 0)
        {
          localObject = MessageType.Text;
          j = ((MessageType)localObject).getNumber();
          continue;
        }
      }
      localObject = MessageType.none;
      j = ((MessageType)localObject).getNumber();
      continue;
      localObject = MessageType.Sticker;
      j = ((MessageType)localObject).getNumber();
      continue;
      localObject = MessageType.ShareLocation;
      j = ((MessageType)localObject).getNumber();
      continue;
      localObject = MessageType.Contact;
      j = ((MessageType)localObject).getNumber();
    }
  }
  
  /* Error */
  static long a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 61
    //   4: astore_2
    //   5: ldc 63
    //   7: astore_3
    //   8: aload_2
    //   9: aload_3
    //   10: invokestatic 68	com/vvt/af/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/af/a/a;
    //   13: astore_3
    //   14: aload_3
    //   15: iload_0
    //   16: invokestatic 71	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(Lcom/vvt/af/a/a;I)J
    //   19: lstore 4
    //   21: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   24: istore 6
    //   26: iload 6
    //   28: ifeq +3 -> 31
    //   31: aload_3
    //   32: ifnull +7 -> 39
    //   35: aload_3
    //   36: invokevirtual 74	com/vvt/af/a/a:a	()V
    //   39: lload 4
    //   41: lreturn
    //   42: astore_2
    //   43: aconst_null
    //   44: astore_3
    //   45: iconst_m1
    //   46: i2l
    //   47: lstore 4
    //   49: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   52: istore 6
    //   54: iload 6
    //   56: ifeq +3 -> 59
    //   59: aload_3
    //   60: ifnull -21 -> 39
    //   63: goto -28 -> 35
    //   66: astore_2
    //   67: aconst_null
    //   68: astore_3
    //   69: aload_2
    //   70: astore_1
    //   71: aload_3
    //   72: ifnull +7 -> 79
    //   75: aload_3
    //   76: invokevirtual 74	com/vvt/af/a/a:a	()V
    //   79: aload_1
    //   80: athrow
    //   81: astore_1
    //   82: goto -11 -> 71
    //   85: astore_1
    //   86: goto -41 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	paramInt	int
    //   1	79	1	localObject1	Object
    //   81	1	1	localObject2	Object
    //   85	1	1	localException1	Exception
    //   4	5	2	str	String
    //   42	1	2	localException2	Exception
    //   66	4	2	localObject3	Object
    //   7	69	3	localObject4	Object
    //   19	29	4	l	long
    //   24	31	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	13	42	java/lang/Exception
    //   9	13	66	finally
    //   15	19	81	finally
    //   21	24	81	finally
    //   49	52	81	finally
    //   15	19	85	java/lang/Exception
    //   21	24	85	java/lang/Exception
  }
  
  /* Error */
  private static long a(com.vvt.af.a.a parama)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: ldc 78
    //   5: astore_3
    //   6: ldc 80
    //   8: astore 4
    //   10: aconst_null
    //   11: astore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: ldc 82
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
    //   34: invokevirtual 85	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 5
    //   39: aload 5
    //   41: ifnull +157 -> 198
    //   44: aload 5
    //   46: invokeinterface 91 1 0
    //   51: istore 9
    //   53: iload 9
    //   55: ifeq +54 -> 109
    //   58: ldc 93
    //   60: astore 8
    //   62: aload 5
    //   64: aload 8
    //   66: invokeinterface 97 2 0
    //   71: istore 9
    //   73: aload 5
    //   75: iload 9
    //   77: invokeinterface 101 2 0
    //   82: lstore 10
    //   84: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   87: istore 6
    //   89: iload 6
    //   91: ifeq +3 -> 94
    //   94: aload 5
    //   96: ifnull +10 -> 106
    //   99: aload 5
    //   101: invokeinterface 104 1 0
    //   106: lload 10
    //   108: lreturn
    //   109: lconst_0
    //   110: lstore 10
    //   112: goto -28 -> 84
    //   115: astore 8
    //   117: iconst_0
    //   118: istore 9
    //   120: aconst_null
    //   121: astore 8
    //   123: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   126: istore 12
    //   128: iload 12
    //   130: ifeq +3 -> 133
    //   133: aload 8
    //   135: ifnull +10 -> 145
    //   138: aload 8
    //   140: invokeinterface 104 1 0
    //   145: lload_1
    //   146: lstore 10
    //   148: goto -42 -> 106
    //   151: astore 8
    //   153: aconst_null
    //   154: astore 5
    //   156: aload 5
    //   158: ifnull +10 -> 168
    //   161: aload 5
    //   163: invokeinterface 104 1 0
    //   168: aload 8
    //   170: athrow
    //   171: astore 8
    //   173: goto -17 -> 156
    //   176: astore 4
    //   178: aload 8
    //   180: astore 5
    //   182: aload 4
    //   184: astore 8
    //   186: goto -30 -> 156
    //   189: astore 8
    //   191: aload 5
    //   193: astore 8
    //   195: goto -72 -> 123
    //   198: lload_1
    //   199: lstore 10
    //   201: goto -117 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	parama	com.vvt.af.a.a
    //   2	197	1	l1	long
    //   5	27	3	str1	String
    //   8	17	4	str2	String
    //   176	7	4	localObject1	Object
    //   11	181	5	localObject2	Object
    //   14	76	6	bool1	boolean
    //   18	15	7	str3	String
    //   21	44	8	localObject3	Object
    //   115	1	8	localException1	Exception
    //   121	18	8	localObject4	Object
    //   151	18	8	localObject5	Object
    //   171	8	8	localObject6	Object
    //   184	1	8	localObject7	Object
    //   189	1	8	localException2	Exception
    //   193	1	8	localObject8	Object
    //   51	3	9	bool2	boolean
    //   71	48	9	i	int
    //   82	118	10	l2	long
    //   126	3	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   32	37	115	java/lang/Exception
    //   32	37	151	finally
    //   44	51	171	finally
    //   64	71	171	finally
    //   75	82	171	finally
    //   84	87	171	finally
    //   123	126	176	finally
    //   44	51	189	java/lang/Exception
    //   64	71	189	java/lang/Exception
    //   75	82	189	java/lang/Exception
    //   84	87	189	java/lang/Exception
  }
  
  /* Error */
  static long a(com.vvt.af.a.a parama, int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: lconst_0
    //   6: lstore 5
    //   8: iload_3
    //   9: anewarray 4	java/lang/Object
    //   12: astore 7
    //   14: ldc 93
    //   16: astore 8
    //   18: aload 7
    //   20: iconst_0
    //   21: aload 8
    //   23: aastore
    //   24: ldc 106
    //   26: aload 7
    //   28: invokestatic 110	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore 9
    //   33: iload_3
    //   34: anewarray 47	java/lang/String
    //   37: astore 10
    //   39: new 112	java/lang/StringBuilder
    //   42: astore 11
    //   44: aload 11
    //   46: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   49: aload 11
    //   51: iload_1
    //   52: invokevirtual 119	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: astore 11
    //   57: ldc 121
    //   59: astore 7
    //   61: aload 11
    //   63: aload 7
    //   65: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore 11
    //   73: aload 10
    //   75: iconst_0
    //   76: aload 11
    //   78: aastore
    //   79: ldc 78
    //   81: astore 12
    //   83: aload_0
    //   84: ifnull +178 -> 262
    //   87: ldc 80
    //   89: astore 7
    //   91: aconst_null
    //   92: astore 8
    //   94: aload_0
    //   95: astore 11
    //   97: aload_0
    //   98: aload 7
    //   100: aconst_null
    //   101: aload 9
    //   103: aload 10
    //   105: aconst_null
    //   106: aconst_null
    //   107: aload 12
    //   109: invokevirtual 131	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   112: astore 11
    //   114: aload 11
    //   116: ifnull +135 -> 251
    //   119: aload 11
    //   121: invokeinterface 134 1 0
    //   126: istore 13
    //   128: iload 13
    //   130: ifeq +121 -> 251
    //   133: aload 11
    //   135: aload_2
    //   136: invokeinterface 97 2 0
    //   141: istore 13
    //   143: aload 11
    //   145: iload 13
    //   147: invokeinterface 138 2 0
    //   152: istore 13
    //   154: iload 13
    //   156: i2l
    //   157: lstore 5
    //   159: aload 11
    //   161: astore 4
    //   163: lload 5
    //   165: lstore 14
    //   167: aload 4
    //   169: ifnull +10 -> 179
    //   172: aload 4
    //   174: invokeinterface 104 1 0
    //   179: lload 14
    //   181: lreturn
    //   182: astore 11
    //   184: aconst_null
    //   185: astore 11
    //   187: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   190: istore 13
    //   192: iload 13
    //   194: ifeq +3 -> 197
    //   197: aload 11
    //   199: ifnull +10 -> 209
    //   202: aload 11
    //   204: invokeinterface 104 1 0
    //   209: lload 5
    //   211: lstore 14
    //   213: goto -34 -> 179
    //   216: astore 11
    //   218: aload 4
    //   220: ifnull +10 -> 230
    //   223: aload 4
    //   225: invokeinterface 104 1 0
    //   230: aload 11
    //   232: athrow
    //   233: astore 7
    //   235: aload 11
    //   237: astore 4
    //   239: aload 7
    //   241: astore 11
    //   243: goto -25 -> 218
    //   246: astore 7
    //   248: goto -61 -> 187
    //   251: aload 11
    //   253: astore 4
    //   255: lload 5
    //   257: lstore 14
    //   259: goto -92 -> 167
    //   262: lload 5
    //   264: lstore 14
    //   266: goto -99 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	269	0	parama	com.vvt.af.a.a
    //   0	269	1	paramInt	int
    //   0	269	2	paramString	String
    //   1	33	3	i	int
    //   3	251	4	localObject1	Object
    //   6	257	5	l1	long
    //   12	87	7	localObject2	Object
    //   233	7	7	localObject3	Object
    //   246	1	7	localException1	Exception
    //   16	77	8	str1	String
    //   31	71	9	str2	String
    //   37	67	10	arrayOfString	String[]
    //   42	118	11	localObject4	Object
    //   182	1	11	localException2	Exception
    //   185	18	11	localObject5	Object
    //   216	20	11	localObject6	Object
    //   241	11	11	localObject7	Object
    //   81	27	12	str3	String
    //   126	3	13	bool1	boolean
    //   141	14	13	j	int
    //   190	3	13	bool2	boolean
    //   165	100	14	l2	long
    // Exception table:
    //   from	to	target	type
    //   107	112	182	java/lang/Exception
    //   107	112	216	finally
    //   119	126	233	finally
    //   135	141	233	finally
    //   145	152	233	finally
    //   187	190	233	finally
    //   119	126	246	java/lang/Exception
    //   135	141	246	java/lang/Exception
    //   145	152	246	java/lang/Exception
  }
  
  public static long a(String paramString)
  {
    locala = null;
    long l = -1;
    try
    {
      locala = com.vvt.af.a.a.a(paramString);
      l = a(locala);
      bool = a;
      if (bool) {}
      if (locala == null) {
        break label33;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label33:
        if (locala != null) {
          locala.a();
        }
        boolean bool = c;
        if ((bool) && (locala == null)) {}
      }
    }
    finally
    {
      if (locala == null) {
        break label71;
      }
      locala.a();
    }
    locala.a();
    return l;
  }
  
  public static long a(String paramString, int paramInt)
  {
    locala = null;
    long l = -1;
    try
    {
      locala = com.vvt.af.a.a.a(paramString);
      l = c(locala, paramInt);
      bool = a;
      if (bool) {}
      if (locala == null) {
        break label34;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label34:
        if (locala != null) {
          locala.a();
        }
        boolean bool = c;
        if ((bool) && (locala == null)) {}
      }
    }
    finally
    {
      if (locala == null) {
        break label72;
      }
      locala.a();
    }
    locala.a();
    return l;
  }
  
  private static com.vvt.im.events.info.a a(String paramString1, long paramLong, String paramString2)
  {
    bool1 = false;
    localObject1 = null;
    localObject2 = "/sdcard/viber/media/.stickers";
    try
    {
      localObject2 = com.vvt.io.d.h((String)localObject2);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append(paramLong);
      Object localObject5 = "_scaled_";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).toString();
      localObject5 = "_frame";
      localObject5 = new java/io/File;
      ((File)localObject5).<init>((String)localObject2);
      bool2 = ((File)localObject5).exists();
      if (!bool2) {
        break label408;
      }
      localObject2 = com.vvt.io.d.c((File)localObject5);
      if (localObject2 == null) {
        break label408;
      }
      localObject5 = ((List)localObject2).iterator();
      boolean bool3;
      do
      {
        do
        {
          bool2 = ((Iterator)localObject5).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = ((Iterator)localObject5).next();
          localObject2 = (File)localObject2;
          localObject6 = ((File)localObject2).getName();
          bool3 = ((String)localObject6).contains((CharSequence)localObject4);
        } while (!bool3);
        localObject6 = ((File)localObject2).getName();
        String str = "_frame";
        bool3 = ((String)localObject6).contains(str);
      } while (bool3);
      localObject4 = ImType.VIBER;
      localObject5 = ImMediaFileType.ATTACHMENT;
      localObject4 = com.vvt.im.a.c.a(paramString1, (ImType)localObject4, (ImMediaFileType)localObject5);
      localObject5 = ImMediaFileType.ATTACHMENT;
      localObject5 = com.vvt.im.a.c.a((ImMediaFileType)localObject5);
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject4 = ((StringBuilder)localObject6).append((String)localObject4);
      localObject6 = File.separator;
      localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).toString();
      boolean bool4 = b;
      if (bool4) {}
      localObject2 = ((File)localObject2).getAbsolutePath();
      com.vvt.io.d.a((String)localObject2, (String)localObject4);
      ShellUtil.b(paramString2, (String)localObject4);
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject4;
        try
        {
          ((com.vvt.im.events.info.a)localObject2).a(null);
          localObject1 = "image/png";
          ((com.vvt.im.events.info.a)localObject2).b((String)localObject1);
          ((com.vvt.im.events.info.a)localObject2).d((String)localObject4);
          bool1 = false;
          localObject1 = null;
          localObject1 = new byte[0];
          ((com.vvt.im.events.info.a)localObject2).a((byte[])localObject1);
          bool1 = false;
          localObject1 = null;
          ((com.vvt.im.events.info.a)localObject2).c(null);
          bool1 = false;
          localObject1 = null;
          localObject1 = new byte[0];
          ((com.vvt.im.events.info.a)localObject2).b((byte[])localObject1);
          return (com.vvt.im.events.info.a)localObject2;
        }
        catch (Exception localException1)
        {
          boolean bool2;
          Object localObject3;
          continue;
        }
        localException2 = localException2;
        bool2 = false;
        localObject3 = null;
        bool1 = c;
        if (bool1)
        {
          continue;
          localObject4 = null;
        }
      }
    }
    localObject2 = new com/vvt/im/events/info/a;
    ((com.vvt.im.events.info.a)localObject2).<init>();
    bool1 = false;
    localObject1 = null;
  }
  
  private static com.vvt.im.events.info.a a(String paramString1, String paramString2, String paramString3, ViberMessageType paramViberMessageType, Context paramContext, com.vvt.base.b paramb)
  {
    com.vvt.im.events.info.a locala = null;
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = ViberMessageType.VIDEO_WINK;
    label72:
    String str1;
    String str2;
    if (paramViberMessageType != localObject1)
    {
      localObject1 = ViberMessageType.IMAGE_WINK;
      if (paramViberMessageType != localObject1) {}
    }
    else
    {
      bool2 = bool1;
      if (paramString2 != null)
      {
        int i = paramString2.length();
        if (i > 0) {}
      }
      else
      {
        if (!bool2) {
          break label242;
        }
      }
      if (paramString3 == null) {
        break label264;
      }
      localObject1 = d(paramString3);
      str1 = a(paramString1, paramString2, bool1, paramViberMessageType, paramb);
      if (paramString3 == null) {
        break label464;
      }
      str2 = "content://media";
      bool1 = paramString3.startsWith(str2);
      if (!bool1) {
        break label273;
      }
      str2 = a.a(paramString1, paramString3, paramViberMessageType, paramContext, paramb);
    }
    for (;;)
    {
      label118:
      boolean bool3 = a;
      Object localObject2;
      String str3;
      if ((!bool3) || (str2 == null))
      {
        localObject2 = ViberMessageType.VIDEO;
        if (paramViberMessageType != localObject2)
        {
          localObject2 = ViberMessageType.VIDEO_WINK;
          if (paramViberMessageType != localObject2) {}
        }
        else
        {
          str3 = "video/mp4";
          localObject2 = localObject1;
          localObject1 = str3;
        }
      }
      for (;;)
      {
        boolean bool4 = com.vvt.ag.b.a(str2);
        if (!bool4)
        {
          locala = new com/vvt/im/events/info/a;
          locala.<init>();
          locala.a((String)localObject2);
          locala.b((String)localObject1);
          locala.d(str1);
          localObject1 = new byte[0];
          locala.a((byte[])localObject1);
          locala.c(str2);
          localObject1 = new byte[0];
          locala.b((byte[])localObject1);
        }
        label242:
        bool2 = a;
        if (bool2) {}
        return locala;
        bool2 = false;
        localObject1 = null;
        break;
        label264:
        localObject1 = d(paramString2);
        break label72;
        label273:
        str2 = a(paramString1, paramString3, false, paramViberMessageType, paramb);
        break label118;
        localObject2 = ViberMessageType.IMAGE;
        if (paramViberMessageType != localObject2)
        {
          localObject2 = ViberMessageType.IMAGE_WINK;
          if (paramViberMessageType != localObject2) {}
        }
        else
        {
          str3 = "image/jpg";
          localObject2 = localObject1;
          localObject1 = str3;
          continue;
        }
        str3 = "application/x-binary";
        localObject2 = localObject1;
        localObject1 = str3;
        continue;
        localObject2 = "content://media";
        bool3 = paramString3.startsWith((String)localObject2);
        if (bool3)
        {
          localObject1 = com.vvt.io.d.i(str2);
          localObject2 = d(str2);
        }
        for (;;)
        {
          if (localObject1 != null) {
            break label424;
          }
          localObject1 = ViberMessageType.VIDEO;
          if (paramViberMessageType != localObject1)
          {
            localObject1 = ViberMessageType.VIDEO_WINK;
            if (paramViberMessageType != localObject1) {
              break label426;
            }
          }
          localObject1 = "video/mp4";
          break;
          str3 = com.vvt.io.d.i((String)localObject1);
          localObject2 = localObject1;
          localObject1 = str3;
        }
        label424:
        continue;
        label426:
        localObject1 = ViberMessageType.IMAGE;
        if (paramViberMessageType != localObject1)
        {
          localObject1 = ViberMessageType.IMAGE_WINK;
          if (paramViberMessageType != localObject1) {}
        }
        else
        {
          localObject1 = "image/jpg";
          continue;
        }
        localObject1 = "application/x-binary";
      }
      label464:
      bool1 = false;
      str2 = null;
    }
  }
  
  /* Error */
  static com.vvt.im.events.info.c a(com.vvt.af.a.a parama, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc2_w 290
    //   5: dstore_3
    //   6: dconst_0
    //   7: dstore 5
    //   9: aconst_null
    //   10: astore 7
    //   12: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   15: istore 8
    //   17: iload 8
    //   19: ifeq +3 -> 22
    //   22: new 293	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   25: astore 9
    //   27: aload 9
    //   29: invokespecial 294	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   32: iload_2
    //   33: anewarray 4	java/lang/Object
    //   36: astore 10
    //   38: ldc 93
    //   40: astore 11
    //   42: aload 10
    //   44: iconst_0
    //   45: aload 11
    //   47: aastore
    //   48: ldc 106
    //   50: aload 10
    //   52: invokestatic 110	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   55: astore 12
    //   57: iload_2
    //   58: anewarray 47	java/lang/String
    //   61: astore 13
    //   63: new 112	java/lang/StringBuilder
    //   66: astore 14
    //   68: aload 14
    //   70: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   73: aload 14
    //   75: iload_1
    //   76: invokevirtual 119	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   79: astore 14
    //   81: ldc 121
    //   83: astore 10
    //   85: aload 14
    //   87: aload 10
    //   89: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: astore 14
    //   97: aload 13
    //   99: iconst_0
    //   100: aload 14
    //   102: aastore
    //   103: ldc 78
    //   105: astore 15
    //   107: aload_0
    //   108: ifnull +279 -> 387
    //   111: ldc 80
    //   113: astore 10
    //   115: iconst_0
    //   116: istore 16
    //   118: aconst_null
    //   119: astore 11
    //   121: iconst_0
    //   122: istore 17
    //   124: aload_0
    //   125: astore 14
    //   127: aload_0
    //   128: aload 10
    //   130: aconst_null
    //   131: aload 12
    //   133: aload 13
    //   135: aconst_null
    //   136: aconst_null
    //   137: aload 15
    //   139: invokevirtual 131	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   142: astore 14
    //   144: aload 14
    //   146: ifnull +155 -> 301
    //   149: aload 14
    //   151: invokeinterface 134 1 0
    //   156: istore 18
    //   158: iload 18
    //   160: ifeq +141 -> 301
    //   163: ldc_w 296
    //   166: astore 10
    //   168: aload 14
    //   170: aload 10
    //   172: invokeinterface 97 2 0
    //   177: istore 18
    //   179: aload 14
    //   181: iload 18
    //   183: invokeinterface 300 2 0
    //   188: astore 10
    //   190: ldc_w 302
    //   193: astore 11
    //   195: aload 14
    //   197: aload 11
    //   199: invokeinterface 97 2 0
    //   204: istore 16
    //   206: aload 14
    //   208: iload 16
    //   210: invokeinterface 101 2 0
    //   215: lstore 19
    //   217: lload 19
    //   219: l2d
    //   220: dload_3
    //   221: ddiv
    //   222: dstore 21
    //   224: ldc_w 304
    //   227: astore 13
    //   229: aload 14
    //   231: aload 13
    //   233: invokeinterface 97 2 0
    //   238: istore_2
    //   239: aload 14
    //   241: iload_2
    //   242: invokeinterface 101 2 0
    //   247: lstore 23
    //   249: lload 23
    //   251: l2d
    //   252: dload_3
    //   253: ddiv
    //   254: dstore 25
    //   256: dload 25
    //   258: dload 5
    //   260: dcmpl
    //   261: istore 17
    //   263: iload 17
    //   265: ifeq +36 -> 301
    //   268: dload 21
    //   270: dload 5
    //   272: dcmpl
    //   273: istore 17
    //   275: iload 17
    //   277: ifeq +24 -> 301
    //   280: aload 9
    //   282: aload 10
    //   284: invokevirtual 305	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   287: aload 9
    //   289: dload 21
    //   291: invokevirtual 308	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   294: aload 9
    //   296: dload 25
    //   298: invokevirtual 310	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
    //   301: aload 14
    //   303: ifnull +10 -> 313
    //   306: aload 14
    //   308: invokeinterface 104 1 0
    //   313: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   316: istore 8
    //   318: iload 8
    //   320: ifeq +3 -> 323
    //   323: aload 9
    //   325: areturn
    //   326: astore 14
    //   328: iconst_0
    //   329: istore 8
    //   331: aconst_null
    //   332: astore 14
    //   334: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   337: istore 18
    //   339: iload 18
    //   341: ifeq +3 -> 344
    //   344: aload 14
    //   346: ifnull -33 -> 313
    //   349: goto -43 -> 306
    //   352: astore 14
    //   354: aload 7
    //   356: ifnull +10 -> 366
    //   359: aload 7
    //   361: invokeinterface 104 1 0
    //   366: aload 14
    //   368: athrow
    //   369: astore 10
    //   371: aload 14
    //   373: astore 7
    //   375: aload 10
    //   377: astore 14
    //   379: goto -25 -> 354
    //   382: astore 10
    //   384: goto -50 -> 334
    //   387: iconst_0
    //   388: istore 8
    //   390: aconst_null
    //   391: astore 14
    //   393: goto -92 -> 301
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	396	0	parama	com.vvt.af.a.a
    //   0	396	1	paramInt	int
    //   1	241	2	i	int
    //   5	248	3	d1	double
    //   7	264	5	d2	double
    //   10	364	7	localObject1	Object
    //   15	374	8	bool1	boolean
    //   25	299	9	localc	com.vvt.im.events.info.MyUncaughtExceptionHandler
    //   36	247	10	localObject2	Object
    //   369	7	10	localObject3	Object
    //   382	1	10	localException1	Exception
    //   40	158	11	str1	String
    //   55	77	12	str2	String
    //   61	171	13	localObject4	Object
    //   66	241	14	localObject5	Object
    //   326	1	14	localException2	Exception
    //   332	13	14	localObject6	Object
    //   352	20	14	localObject7	Object
    //   377	15	14	localObject8	Object
    //   105	33	15	str3	String
    //   116	93	16	j	int
    //   122	154	17	bool2	boolean
    //   156	3	18	bool3	boolean
    //   177	5	18	k	int
    //   337	3	18	bool4	boolean
    //   215	3	19	l1	long
    //   222	68	21	d3	double
    //   247	3	23	l2	long
    //   254	43	25	d4	double
    // Exception table:
    //   from	to	target	type
    //   137	142	326	java/lang/Exception
    //   137	142	352	finally
    //   149	156	369	finally
    //   170	177	369	finally
    //   181	188	369	finally
    //   197	204	369	finally
    //   208	215	369	finally
    //   231	238	369	finally
    //   241	247	369	finally
    //   282	287	369	finally
    //   289	294	369	finally
    //   296	301	369	finally
    //   334	337	369	finally
    //   149	156	382	java/lang/Exception
    //   170	177	382	java/lang/Exception
    //   181	188	382	java/lang/Exception
    //   197	204	382	java/lang/Exception
    //   208	215	382	java/lang/Exception
    //   231	238	382	java/lang/Exception
    //   241	247	382	java/lang/Exception
    //   282	287	382	java/lang/Exception
    //   289	294	382	java/lang/Exception
    //   296	301	382	java/lang/Exception
  }
  
  public static com.vvt.im.events.info.d a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    String str1 = "owner";
    a(paramString1, paramString4, locald);
    String str2 = locald.g();
    boolean bool2 = com.vvt.ag.b.a(str2);
    if (!bool2)
    {
      str2 = locald.a();
      bool2 = com.vvt.ag.b.a(str2);
      if (!bool2) {}
    }
    else
    {
      a(paramString1, paramString2, paramString3, locald);
    }
    str2 = locald.a();
    bool2 = com.vvt.ag.b.a(str2);
    if (bool2) {
      locald.a(str1);
    }
    locald.b(str1);
    str1 = null;
    locald.c(null);
    boolean bool3 = a;
    if (bool3) {}
    bool3 = a;
    if (bool3) {}
    bool3 = a;
    if (bool3) {}
    bool3 = a;
    if (bool3) {}
    return locald;
  }
  
  static String a(com.vvt.af.a.a parama, int paramInt1, String paramString, int paramInt2)
  {
    String str = null;
    int i = 0;
    while (str == null)
    {
      int j = paramInt2 * 10;
      if (i >= j) {
        break;
      }
      str = b(parama, paramInt1, paramString);
      long l = 6000L;
      SystemClock.sleep(l);
      boolean bool = a;
      if (bool) {}
      i += 1;
    }
    return str;
  }
  
  /* Error */
  private static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: aload_1
    //   11: invokestatic 277	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   14: istore_3
    //   15: iload_3
    //   16: ifne +363 -> 379
    //   19: new 161	java/io/File
    //   22: astore 4
    //   24: aload 4
    //   26: aload_1
    //   27: invokespecial 164	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: aload 4
    //   32: invokevirtual 167	java/io/File:exists	()Z
    //   35: istore_3
    //   36: iload_3
    //   37: ifeq +342 -> 379
    //   40: new 344	java/io/FileReader
    //   43: astore 4
    //   45: aload 4
    //   47: aload_1
    //   48: invokespecial 345	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   51: new 347	java/io/BufferedReader
    //   54: astore 5
    //   56: sipush 256
    //   59: istore 6
    //   61: aload 5
    //   63: aload 4
    //   65: iload 6
    //   67: invokespecial 351	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   70: aload 5
    //   72: invokevirtual 354	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   75: astore 7
    //   77: aload 7
    //   79: ifnull +459 -> 538
    //   82: ldc_w 356
    //   85: astore 8
    //   87: aload 7
    //   89: aload 8
    //   91: invokevirtual 359	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   94: istore 9
    //   96: iconst_m1
    //   97: istore 10
    //   99: iload 9
    //   101: iload 10
    //   103: if_icmple -33 -> 70
    //   106: new 112	java/lang/StringBuilder
    //   109: astore 11
    //   111: aload 11
    //   113: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   116: ldc_w 361
    //   119: astore 12
    //   121: aload 11
    //   123: aload 12
    //   125: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: astore 11
    //   130: getstatic 216	java/io/File:separator	Ljava/lang/String;
    //   133: astore 12
    //   135: aload 11
    //   137: aload 12
    //   139: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: astore 11
    //   144: iload 9
    //   146: iconst_1
    //   147: iadd
    //   148: istore 9
    //   150: aload 7
    //   152: iload 9
    //   154: invokevirtual 364	java/lang/String:substring	(I)Ljava/lang/String;
    //   157: astore 7
    //   159: aload 7
    //   161: invokestatic 367	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:f	(Ljava/lang/String;)Ljava/lang/String;
    //   164: astore 7
    //   166: aload 11
    //   168: aload 7
    //   170: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: astore 7
    //   175: ldc_w 369
    //   178: astore 8
    //   180: aload 7
    //   182: aload 8
    //   184: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: astore 7
    //   189: aload 7
    //   191: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: astore 7
    //   196: aload 7
    //   198: ifnull +161 -> 359
    //   201: aload 7
    //   203: invokestatic 152	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   206: astore 7
    //   208: ldc_w 371
    //   211: astore 8
    //   213: ldc_w 373
    //   216: astore 11
    //   218: aload 7
    //   220: aload 8
    //   222: aload 11
    //   224: invokevirtual 377	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   227: astore 8
    //   229: getstatic 198	com/vvt/im/events/ImType:VIBER	Lcom/vvt/im/events/ImType;
    //   232: astore 7
    //   234: getstatic 380	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   237: astore 11
    //   239: aload_0
    //   240: aload 7
    //   242: aload 11
    //   244: invokestatic 209	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   247: astore 7
    //   249: getstatic 380	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   252: astore 11
    //   254: aload 11
    //   256: invokestatic 212	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   259: astore 11
    //   261: new 112	java/lang/StringBuilder
    //   264: astore 12
    //   266: aload 12
    //   268: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   271: aload 12
    //   273: aload 7
    //   275: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: astore 7
    //   280: getstatic 216	java/io/File:separator	Ljava/lang/String;
    //   283: astore 12
    //   285: aload 7
    //   287: aload 12
    //   289: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: astore 7
    //   294: aload 7
    //   296: aload 11
    //   298: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: astore 7
    //   303: aload 7
    //   305: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   308: astore 7
    //   310: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   313: istore 10
    //   315: iload 10
    //   317: ifeq +3 -> 320
    //   320: new 161	java/io/File
    //   323: astore 11
    //   325: aload 11
    //   327: aload 8
    //   329: invokespecial 164	java/io/File:<init>	(Ljava/lang/String;)V
    //   332: aload 11
    //   334: invokevirtual 167	java/io/File:exists	()Z
    //   337: istore 9
    //   339: iload 9
    //   341: ifeq +18 -> 359
    //   344: aload 11
    //   346: invokevirtual 219	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   349: astore_2
    //   350: aload_2
    //   351: aload 7
    //   353: invokestatic 222	com/vvt/io/d:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   356: aload 7
    //   358: astore_2
    //   359: aload 4
    //   361: ifnull +8 -> 369
    //   364: aload 4
    //   366: invokevirtual 381	java/io/FileReader:close	()V
    //   369: aload 5
    //   371: ifnull +8 -> 379
    //   374: aload 5
    //   376: invokevirtual 382	java/io/BufferedReader:close	()V
    //   379: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   382: istore_3
    //   383: iload_3
    //   384: ifeq +3 -> 387
    //   387: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   390: istore_3
    //   391: iload_3
    //   392: ifeq +3 -> 395
    //   395: aload_2
    //   396: areturn
    //   397: astore 4
    //   399: iconst_0
    //   400: istore_3
    //   401: aconst_null
    //   402: astore 4
    //   404: aconst_null
    //   405: astore 5
    //   407: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   410: istore 6
    //   412: iload 6
    //   414: ifeq +3 -> 417
    //   417: aload 4
    //   419: ifnull +8 -> 427
    //   422: aload 4
    //   424: invokevirtual 381	java/io/FileReader:close	()V
    //   427: aload 5
    //   429: ifnull -50 -> 379
    //   432: aload 5
    //   434: invokevirtual 382	java/io/BufferedReader:close	()V
    //   437: goto -58 -> 379
    //   440: astore 4
    //   442: goto -63 -> 379
    //   445: astore 4
    //   447: aconst_null
    //   448: astore 5
    //   450: aconst_null
    //   451: astore 13
    //   453: aload 4
    //   455: astore_2
    //   456: iconst_0
    //   457: istore_3
    //   458: aconst_null
    //   459: astore 4
    //   461: aload 4
    //   463: ifnull +8 -> 471
    //   466: aload 4
    //   468: invokevirtual 381	java/io/FileReader:close	()V
    //   471: aload 5
    //   473: ifnull +8 -> 481
    //   476: aload 5
    //   478: invokevirtual 382	java/io/BufferedReader:close	()V
    //   481: aload_2
    //   482: athrow
    //   483: astore 4
    //   485: goto -14 -> 471
    //   488: astore 4
    //   490: goto -9 -> 481
    //   493: astore 4
    //   495: goto -68 -> 427
    //   498: astore 4
    //   500: goto -131 -> 369
    //   503: astore 13
    //   505: aconst_null
    //   506: astore 5
    //   508: aload 13
    //   510: astore_2
    //   511: goto -50 -> 461
    //   514: astore_2
    //   515: goto -54 -> 461
    //   518: astore 5
    //   520: aconst_null
    //   521: astore 5
    //   523: goto -116 -> 407
    //   526: astore 7
    //   528: goto -121 -> 407
    //   531: astore_2
    //   532: aload 7
    //   534: astore_2
    //   535: goto -128 -> 407
    //   538: iconst_0
    //   539: istore 6
    //   541: aconst_null
    //   542: astore 7
    //   544: goto -348 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	547	0	paramString1	String
    //   0	547	1	paramString2	String
    //   1	510	2	localObject1	Object
    //   514	1	2	localObject2	Object
    //   531	1	2	localException1	Exception
    //   534	1	2	localObject3	Object
    //   5	453	3	bool1	boolean
    //   22	343	4	localObject4	Object
    //   397	1	4	localException2	Exception
    //   402	21	4	localObject5	Object
    //   440	1	4	localIOException1	IOException
    //   445	9	4	localObject6	Object
    //   459	8	4	localObject7	Object
    //   483	1	4	localIOException2	IOException
    //   488	1	4	localIOException3	IOException
    //   493	1	4	localIOException4	IOException
    //   498	1	4	localIOException5	IOException
    //   54	453	5	localBufferedReader	java.io.BufferedReader
    //   518	1	5	localException3	Exception
    //   521	1	5	localObject8	Object
    //   59	7	6	i	int
    //   410	130	6	bool2	boolean
    //   75	282	7	localObject9	Object
    //   526	7	7	localException4	Exception
    //   542	1	7	localObject10	Object
    //   85	243	8	str	String
    //   94	59	9	j	int
    //   337	3	9	bool3	boolean
    //   97	7	10	k	int
    //   313	3	10	bool4	boolean
    //   109	236	11	localObject11	Object
    //   119	169	12	localObject12	Object
    //   451	1	13	localObject13	Object
    //   503	6	13	localObject14	Object
    // Exception table:
    //   from	to	target	type
    //   40	43	397	java/lang/Exception
    //   47	51	397	java/lang/Exception
    //   374	379	440	java/io/IOException
    //   432	437	440	java/io/IOException
    //   40	43	445	finally
    //   47	51	445	finally
    //   466	471	483	java/io/IOException
    //   476	481	488	java/io/IOException
    //   422	427	493	java/io/IOException
    //   364	369	498	java/io/IOException
    //   51	54	503	finally
    //   65	70	503	finally
    //   70	75	514	finally
    //   89	94	514	finally
    //   106	109	514	finally
    //   111	116	514	finally
    //   123	128	514	finally
    //   130	133	514	finally
    //   137	142	514	finally
    //   152	157	514	finally
    //   159	164	514	finally
    //   168	173	514	finally
    //   182	187	514	finally
    //   189	194	514	finally
    //   201	206	514	finally
    //   222	227	514	finally
    //   229	232	514	finally
    //   234	237	514	finally
    //   242	247	514	finally
    //   249	252	514	finally
    //   254	259	514	finally
    //   261	264	514	finally
    //   266	271	514	finally
    //   273	278	514	finally
    //   280	283	514	finally
    //   287	292	514	finally
    //   296	301	514	finally
    //   303	308	514	finally
    //   310	313	514	finally
    //   320	323	514	finally
    //   327	332	514	finally
    //   332	337	514	finally
    //   344	349	514	finally
    //   351	356	514	finally
    //   407	410	514	finally
    //   51	54	518	java/lang/Exception
    //   65	70	518	java/lang/Exception
    //   70	75	526	java/lang/Exception
    //   89	94	526	java/lang/Exception
    //   106	109	526	java/lang/Exception
    //   111	116	526	java/lang/Exception
    //   123	128	526	java/lang/Exception
    //   130	133	526	java/lang/Exception
    //   137	142	526	java/lang/Exception
    //   152	157	526	java/lang/Exception
    //   159	164	526	java/lang/Exception
    //   168	173	526	java/lang/Exception
    //   182	187	526	java/lang/Exception
    //   189	194	526	java/lang/Exception
    //   201	206	526	java/lang/Exception
    //   222	227	526	java/lang/Exception
    //   229	232	526	java/lang/Exception
    //   234	237	526	java/lang/Exception
    //   242	247	526	java/lang/Exception
    //   249	252	526	java/lang/Exception
    //   254	259	526	java/lang/Exception
    //   261	264	526	java/lang/Exception
    //   266	271	526	java/lang/Exception
    //   273	278	526	java/lang/Exception
    //   280	283	526	java/lang/Exception
    //   287	292	526	java/lang/Exception
    //   296	301	526	java/lang/Exception
    //   303	308	526	java/lang/Exception
    //   310	313	531	java/lang/Exception
    //   320	323	531	java/lang/Exception
    //   327	332	531	java/lang/Exception
    //   332	337	531	java/lang/Exception
    //   344	349	531	java/lang/Exception
    //   351	356	531	java/lang/Exception
  }
  
  static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    Object localObject2;
    if (paramString2 != null) {
      localObject2 = "/";
    }
    for (;;)
    {
      try
      {
        int i = paramString2.lastIndexOf((String)localObject2);
        int j = -1;
        if (i <= j) {
          continue;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        Object localObject5 = "/sdcard/viber/media/User photos";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = File.separator;
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        i += 1;
        localObject2 = paramString2.substring(i);
        localObject2 = f((String)localObject2);
        localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
        localObject4 = ".jpg";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject2 = com.vvt.io.d.h((String)localObject2);
        localObject4 = localObject2;
        bool1 = a;
        if ((bool1) && (localObject4 == null)) {
          break label307;
        }
        localObject2 = ImType.VIBER;
        localObject5 = ImMediaFileType.USER_PROFILE;
        localObject2 = com.vvt.im.a.c.a(paramString1, (ImType)localObject2, (ImMediaFileType)localObject5);
        localObject5 = ImMediaFileType.USER_PROFILE;
        localObject5 = com.vvt.im.a.c.a((ImMediaFileType)localObject5);
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject2 = ((StringBuilder)localObject6).append((String)localObject2);
        localObject6 = File.separator;
        localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
        localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject5 = new java/io/File;
        ((File)localObject5).<init>((String)localObject4);
        bool2 = ((File)localObject5).exists();
        if (!bool2) {
          continue;
        }
        localObject4 = ((File)localObject5).getAbsolutePath();
        com.vvt.io.d.a((String)localObject4, (String)localObject2);
        ShellUtil.b(paramString3, (String)localObject2);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        Object localObject4;
        boolean bool2;
        bool1 = a;
        if (!bool1) {
          continue;
        }
        continue;
      }
      return (String)localObject1;
      bool2 = false;
      localObject4 = null;
      continue;
      boolean bool1 = false;
      localObject2 = null;
      continue;
      label307:
      bool1 = false;
      Object localObject3 = null;
    }
  }
  
  private static String a(String paramString1, String paramString2, boolean paramBoolean, ViberMessageType paramViberMessageType, com.vvt.base.b paramb)
  {
    Object localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    Object localObject2;
    if ((!bool1) || (paramString2 != null)) {
      localObject2 = "/";
    }
    for (;;)
    {
      try
      {
        int i = paramString2.lastIndexOf((String)localObject2);
        int m = -1;
        if (i <= m) {
          continue;
        }
        if (!paramBoolean) {
          continue;
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "/sdcard/viber/media/.thumbnails";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject2 = paramString2.substring(i);
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).toString();
        bool3 = a;
        if ((!bool3) || (localObject2 != null))
        {
          localObject3 = com.vvt.io.d.h((String)localObject2);
          j = a;
          if ((j != 0) && (!paramBoolean)) {
            continue;
          }
          localObject2 = ImMediaFileType.THUMBMAIL;
          localObject4 = ImType.VIBER;
          localObject4 = com.vvt.im.a.c.a(paramString1, (ImType)localObject4, (ImMediaFileType)localObject2);
          localObject2 = com.vvt.im.a.c.a((ImMediaFileType)localObject2);
          Object localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject5 = File.separator;
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject4 = new java/io/File;
          ((File)localObject4).<init>((String)localObject3);
          bool3 = a;
          if (bool3) {}
          bool3 = a;
          if (bool3) {}
          bool3 = ((File)localObject4).exists();
          boolean bool4 = a;
          if ((!bool4) || (bool3))
          {
            long l = ((File)localObject4).length();
            bool3 = a(paramViberMessageType, paramb, l);
            if (!bool3) {
              continue;
            }
            bool3 = a;
            if (bool3) {}
            localObject3 = ((File)localObject4).getAbsolutePath();
            com.vvt.io.d.a((String)localObject3, (String)localObject2);
            localObject3 = paramb.f();
            ShellUtil.b((String)localObject3, (String)localObject2);
            localObject1 = localObject2;
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject3;
        Object localObject4;
        boolean bool3;
        int j;
        int k;
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      j = a;
      if (j != 0) {}
      j = a;
      if (j != 0) {}
      return (String)localObject1;
      localObject3 = ViberMessageType.IMAGE;
      if (paramViberMessageType == localObject3)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "/sdcard/viber/media/Viber Images";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject2 = paramString2.substring(j);
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      else
      {
        localObject3 = ViberMessageType.VIDEO;
        if (paramViberMessageType == localObject3)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "/sdcard/viber/media/";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject4 = e();
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject2 = paramString2.substring(j);
          localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
          localObject2 = ((StringBuilder)localObject2).toString();
        }
        else
        {
          localObject3 = ViberMessageType.VIDEO_WINK;
          if (paramViberMessageType != localObject3)
          {
            localObject3 = ViberMessageType.IMAGE_WINK;
            if (paramViberMessageType != localObject3) {}
          }
          else
          {
            localObject3 = "com.viber.wink";
            bool3 = paramString2.contains((CharSequence)localObject3);
            if (bool3)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject4 = "/data/data/com.viber.wink/files/Wink/";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
              j += 1;
              localObject2 = paramString2.substring(k);
              localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
              localObject2 = ((StringBuilder)localObject2).toString();
              continue;
            }
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "/data/data/com.viber.voip/files/Wink/";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            k += 1;
            localObject2 = paramString2.substring(k);
            localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
            localObject2 = ((StringBuilder)localObject2).toString();
            continue;
          }
          k = 0;
          localObject2 = null;
          continue;
          k = 0;
          localObject2 = null;
          continue;
          localObject2 = ImMediaFileType.ATTACHMENT;
          continue;
          bool2 = a;
          if (bool2) {}
          bool2 = false;
          localObject2 = null;
        }
      }
    }
  }
  
  static String a(String paramString, byte[] paramArrayOfByte)
  {
    String str = null;
    if (paramArrayOfByte != null) {}
    try
    {
      int i = paramArrayOfByte.length;
      if (i > 0)
      {
        Object localObject1 = ImType.VIBER;
        Object localObject2 = ImMediaFileType.USER_PROFILE;
        localObject1 = com.vvt.im.a.c.a(paramString, (ImType)localObject1, (ImMediaFileType)localObject2);
        localObject2 = ImMediaFileType.USER_PROFILE;
        localObject2 = com.vvt.im.a.c.a((ImMediaFileType)localObject2);
        str = com.vvt.io.d.a(paramArrayOfByte, (String)localObject1, (String)localObject2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return str;
  }
  
  static List a(com.vvt.af.a.a parama, String paramString1, long paramLong, int paramInt, String paramString2)
  {
    long l1 = 0L;
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = false;
    com.vvt.im.events.info.a locala = null;
    int i = paramLong < l1;
    if (i > 0) {
      locala = a(paramString1, paramLong, paramString2);
    }
    for (;;)
    {
      if (locala != null) {
        localArrayList.add(locala);
      }
      bool1 = b;
      if (bool1) {}
      return localArrayList;
      long l2 = d(parama, paramInt);
      i = 0;
      for (;;)
      {
        boolean bool3 = l2 < l1;
        if (bool3) {
          break;
        }
        int k = 10;
        if (i >= k) {
          break;
        }
        l2 = d(parama, paramInt);
        int j;
        i += 1;
        long l3 = 6000L;
        SystemClock.sleep(l3);
      }
      boolean bool2 = paramLong < l1;
      if (bool2) {
        locala = a(paramString1, paramLong, paramString2);
      }
    }
  }
  
  static List a(com.vvt.af.a.a parama, String paramString1, String paramString2, int paramInt, String paramString3, com.vvt.base.b paramb)
  {
    Object localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = com.vvt.ag.b.a(paramString2);
    String str1;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      str1 = "extra_uri";
      int j = 1;
      paramString2 = a(parama, paramInt, str1, j);
    }
    bool1 = com.vvt.ag.b.a(paramString2);
    String str2;
    Object localObject2;
    Object localObject3;
    boolean bool5;
    Object localObject4;
    Object localObject5;
    int m;
    if (!bool1)
    {
      str1 = "file://";
      boolean bool3 = paramString2.startsWith(str1);
      if (bool3)
      {
        int k = paramString2.indexOf(str1);
        int n = -1;
        if (k != n)
        {
          int i = str1.length() + k;
          paramString2 = paramString2.substring(i);
        }
      }
      str2 = com.vvt.io.d.h(paramString2);
      str1 = com.vvt.io.d.i(str2);
      boolean bool4 = a;
      if ((!bool4) || (str1 == null)) {
        str1 = "application/x-binary";
      }
      localObject2 = c(str1);
      localObject3 = new java/io/File;
      ((File)localObject3).<init>(str2);
      long l = ((File)localObject3).length();
      bool5 = a((ViberMessageType)localObject2, paramb, l);
      boolean bool6 = a;
      if ((!bool6) || (bool5))
      {
        localObject3 = ImType.VIBER;
        localObject4 = ImMediaFileType.THUMBMAIL;
        localObject3 = com.vvt.im.a.c.a(paramString1, (ImType)localObject3, (ImMediaFileType)localObject4);
        localObject4 = com.vvt.im.a.c.a(ImMediaFileType.THUMBMAIL);
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject3 = ((StringBuilder)localObject5).append((String)localObject3);
        localObject5 = File.separator;
        localObject3 = (String)localObject5 + (String)localObject4;
        localObject4 = ViberMessageType.IMAGE;
        if (localObject2 != localObject4) {
          break label463;
        }
        m = 800;
        localObject2 = o.a(str2, (String)localObject3, m);
      }
    }
    for (;;)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = ImType.VIBER;
      localObject5 = ImMediaFileType.ATTACHMENT;
      localObject4 = com.vvt.im.a.c.a(paramString1, (ImType)localObject4, (ImMediaFileType)localObject5);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = File.separator;
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = com.vvt.im.a.c.a(ImMediaFileType.ATTACHMENT);
      localObject3 = (String)localObject4;
      try
      {
        com.vvt.io.d.a(str2, (String)localObject3);
        localObject1 = localObject3;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          boolean bool2;
          bool5 = c;
          if (!bool5) {}
        }
        m = 0;
        localObject2 = null;
      }
      localObject3 = new com/vvt/im/events/info/a;
      ((com.vvt.im.events.info.a)localObject3).<init>();
      ((com.vvt.im.events.info.a)localObject3).b(str1);
      ((com.vvt.im.events.info.a)localObject3).d((String)localObject2);
      ((com.vvt.im.events.info.a)localObject3).c((String)localObject1);
      ((com.vvt.im.events.info.a)localObject3).a(paramString3);
      localArrayList.add(localObject3);
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      label463:
      localObject4 = ViberMessageType.VIDEO;
      if (localObject2 == localObject4) {
        localObject2 = c(paramString1, str2, (String)localObject3);
      }
    }
  }
  
  static List a(com.vvt.af.a.a parama, String paramString1, String paramString2, String paramString3, int paramInt, ViberMessageType paramViberMessageType, Context paramContext, com.vvt.base.b paramb)
  {
    int i = 3;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = a;
    boolean bool2;
    String str1;
    Object localObject;
    if ((!bool1) || (paramString2 != null))
    {
      int j = paramString2.length();
      if (j > 0)
      {
        if (paramString3 != null) {
          break label252;
        }
        bool2 = a;
        if (bool2) {}
        str1 = a(parama, paramInt, "extra_uri", i);
        localObject = "body";
      }
    }
    for (String str2 = b(parama, paramInt, (String)localObject);; str2 = paramString2)
    {
      localObject = paramString1;
      localObject = a(paramString1, str2, str1, paramViberMessageType, paramContext, paramb);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      b(parama, paramInt);
      if (paramString3 == null) {
        localObject = "extra_uri";
      }
      for (str1 = a(parama, paramInt, (String)localObject, i);; str1 = paramString3)
      {
        localObject = "body";
        str2 = b(parama, paramInt, (String)localObject);
        bool2 = a;
        if (bool2) {}
        localObject = paramString1;
        localObject = a(paramString1, str2, str1, paramViberMessageType, paramContext, paramb);
        if (localObject == null) {
          break;
        }
        localArrayList.add(localObject);
        break;
      }
      label252:
      str1 = paramString3;
    }
  }
  
  public static List a(com.vvt.capture.viber.d paramd)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramd.h();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.VIBER.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramd.c().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramd.c().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramd.c().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramd.c().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramd.c().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramd.f().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramd.f().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramd.f().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramd.f().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramd.f().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramd.h();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.VIBER.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramd.c().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramd.b();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramd.c().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (!bool4)
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramd.b();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramd.c().b();
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
        long l2 = paramd.h();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.VIBER.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramd.c().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramd.e();
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
    i = paramd.g();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      f = paramd.j().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramd.j().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramd.j().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramd.j().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject5 = new com/vvt/events/e;
    ((com.vvt.events.e)localObject5).<init>();
    localObject2 = paramd.d().d().c();
    ((com.vvt.events.e)localObject5).a((String)localObject2);
    double d2 = paramd.d().d().a();
    ((com.vvt.events.e)localObject5).a(d2);
    d2 = paramd.d().d().b();
    ((com.vvt.events.e)localObject5).b(d2);
    float f = paramd.d().d().d();
    ((com.vvt.events.e)localObject5).a(f);
    localObject2 = paramd.f().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramd.i();
    Object localObject6 = ICallLogData.Direction.IN;
    if (localObject2 == localObject6) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramd.h();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.VIBER.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramd.a();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject5);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramd.g();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramd.i();
      localObject2 = ICallLogData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramd.d().a();
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
  
  private static void a(String paramString1, String paramString2, com.vvt.im.events.info.d paramd)
  {
    boolean bool = com.vvt.ag.b.a(paramString2);
    if (!bool)
    {
      bool = ShellUtil.b(paramString2);
      if (bool)
      {
        Object localObject = g(paramString2);
        if (localObject != null)
        {
          String str = localObject[0];
          paramd.a(str);
          int i = 1;
          localObject = localObject[i];
          localObject = b(paramString1, (String)localObject);
          paramd.f((String)localObject);
        }
      }
    }
  }
  
  private static void a(String paramString1, String paramString2, String paramString3, com.vvt.im.events.info.d paramd)
  {
    String str = paramd.a();
    boolean bool = com.vvt.ag.b.a(str);
    if (bool)
    {
      str = e(paramString2);
      paramd.a(str);
    }
    str = paramd.g();
    bool = com.vvt.ag.b.a(str);
    if (bool)
    {
      str = a(paramString1, paramString3);
      paramd.f(str);
    }
  }
  
  static boolean a(ViberMessageType paramViberMessageType, com.vvt.base.b paramb, long paramLong)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    long l = 0L;
    boolean bool3 = paramLong < l;
    if (!bool3) {
      bool2 = false;
    }
    ViberMessageType localViberMessageType = ViberMessageType.IMAGE;
    if (paramViberMessageType == localViberMessageType)
    {
      l = paramb.b();
      bool3 = paramLong < l;
      if (!bool3) {
        break label92;
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return bool1;
      localViberMessageType = ViberMessageType.AUDIO;
      if (paramViberMessageType == localViberMessageType)
      {
        l = paramb.d();
        bool3 = paramLong < l;
        if (bool3) {}
      }
      else
      {
        label92:
        label130:
        do
        {
          do
          {
            bool1 = bool2;
            break;
            localViberMessageType = ViberMessageType.VIDEO;
            if (paramViberMessageType != localViberMessageType) {
              break label130;
            }
            l = paramb.c();
            bool3 = paramLong < l;
          } while (!bool3);
          break;
          l = paramb.e();
          bool3 = paramLong < l;
        } while (!bool3);
      }
    }
  }
  
  public static String[] a()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[i];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.viber.voip";
    String str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[0] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.viber.voip";
    str = String.format("%s/%s", arrayOfObject);
    arrayOfString[j] = str;
    return arrayOfString;
  }
  
  static com.vvt.im.events.info.d b(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = a;
    if (bool) {}
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    String str1 = "owner";
    bool = false;
    byte[] arrayOfByte = new byte[0];
    String str2 = e(paramString2);
    if (str2 != null)
    {
      int i = str2.length();
      int j = 1;
      if (i >= j) {}
    }
    else
    {
      str2 = str1;
    }
    String str3 = a(paramString1, paramString3);
    locald.d(null);
    locald.a(str2);
    locald.b(str1);
    locald.c(null);
    locald.f(str3);
    locald.a(arrayOfByte);
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    return locald;
  }
  
  /* Error */
  static String b(com.vvt.af.a.a parama, int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iload_3
    //   6: anewarray 4	java/lang/Object
    //   9: astore 5
    //   11: ldc 93
    //   13: astore 6
    //   15: aload 5
    //   17: iconst_0
    //   18: aload 6
    //   20: aastore
    //   21: ldc 106
    //   23: aload 5
    //   25: invokestatic 110	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   28: astore 7
    //   30: iload_3
    //   31: anewarray 47	java/lang/String
    //   34: astore 8
    //   36: new 112	java/lang/StringBuilder
    //   39: astore 9
    //   41: aload 9
    //   43: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   46: aload 9
    //   48: iload_1
    //   49: invokevirtual 119	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: astore 9
    //   54: ldc 121
    //   56: astore 5
    //   58: aload 9
    //   60: aload 5
    //   62: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: astore 9
    //   70: aload 8
    //   72: iconst_0
    //   73: aload 9
    //   75: aastore
    //   76: ldc 78
    //   78: astore 10
    //   80: aload_0
    //   81: ifnull +179 -> 260
    //   84: ldc 80
    //   86: astore 5
    //   88: aconst_null
    //   89: astore 6
    //   91: aload_0
    //   92: astore 9
    //   94: aload_0
    //   95: aload 5
    //   97: aconst_null
    //   98: aload 7
    //   100: aload 8
    //   102: aconst_null
    //   103: aconst_null
    //   104: aload 10
    //   106: invokevirtual 131	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   109: astore 9
    //   111: aload 9
    //   113: ifnull +133 -> 246
    //   116: aload 9
    //   118: invokeinterface 134 1 0
    //   123: istore 11
    //   125: iload 11
    //   127: ifeq +119 -> 246
    //   130: aload 9
    //   132: aload_2
    //   133: invokeinterface 97 2 0
    //   138: istore 11
    //   140: aload 9
    //   142: iload 11
    //   144: invokeinterface 300 2 0
    //   149: astore 4
    //   151: aload 9
    //   153: astore 12
    //   155: aload 4
    //   157: astore 9
    //   159: aload 12
    //   161: astore 4
    //   163: aload 4
    //   165: ifnull +10 -> 175
    //   168: aload 4
    //   170: invokeinterface 104 1 0
    //   175: aload 9
    //   177: areturn
    //   178: astore 9
    //   180: aconst_null
    //   181: astore 9
    //   183: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   186: istore 11
    //   188: iload 11
    //   190: ifeq +3 -> 193
    //   193: aload 9
    //   195: ifnull +10 -> 205
    //   198: aload 9
    //   200: invokeinterface 104 1 0
    //   205: aconst_null
    //   206: astore 9
    //   208: goto -33 -> 175
    //   211: astore 9
    //   213: aload 4
    //   215: ifnull +10 -> 225
    //   218: aload 4
    //   220: invokeinterface 104 1 0
    //   225: aload 9
    //   227: athrow
    //   228: astore 5
    //   230: aload 9
    //   232: astore 4
    //   234: aload 5
    //   236: astore 9
    //   238: goto -25 -> 213
    //   241: astore 5
    //   243: goto -60 -> 183
    //   246: aload 9
    //   248: astore 12
    //   250: aconst_null
    //   251: astore 9
    //   253: aload 12
    //   255: astore 4
    //   257: goto -94 -> 163
    //   260: aconst_null
    //   261: astore 9
    //   263: goto -100 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	parama	com.vvt.af.a.a
    //   0	266	1	paramInt	int
    //   0	266	2	paramString	String
    //   1	30	3	i	int
    //   3	253	4	localObject1	Object
    //   9	87	5	localObject2	Object
    //   228	7	5	localObject3	Object
    //   241	1	5	localException1	Exception
    //   13	77	6	str1	String
    //   28	71	7	str2	String
    //   34	67	8	arrayOfString	String[]
    //   39	137	9	localObject4	Object
    //   178	1	9	localException2	Exception
    //   181	26	9	localObject5	Object
    //   211	20	9	localObject6	Object
    //   236	26	9	localObject7	Object
    //   78	27	10	str3	String
    //   123	3	11	bool1	boolean
    //   138	5	11	j	int
    //   186	3	11	bool2	boolean
    //   153	101	12	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   104	109	178	java/lang/Exception
    //   104	109	211	finally
    //   116	123	228	finally
    //   132	138	228	finally
    //   142	149	228	finally
    //   183	186	228	finally
    //   116	123	241	java/lang/Exception
    //   132	138	241	java/lang/Exception
    //   142	149	241	java/lang/Exception
  }
  
  static String b(String paramString)
  {
    str1 = null;
    for (;;)
    {
      try
      {
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>(paramString);
        bool1 = false;
        localObject2 = null;
        localObject1 = ((JSONArray)localObject1).getJSONObject(0);
        localObject2 = "Action";
        localObject1 = ((JSONObject)localObject1).getJSONObject((String)localObject2);
        localObject2 = "parameters";
        localObject2 = ((JSONObject)localObject1).getJSONObject((String)localObject2);
        localObject1 = "contact_name";
        localObject1 = ((JSONObject)localObject2).get((String)localObject1);
        localObject1 = (String)localObject1;
        localObject3 = "contact_number";
        localObject2 = ((JSONObject)localObject2).get((String)localObject3);
        localObject2 = (String)localObject2;
        str1 = "Name:";
      }
      catch (JSONException localJSONException1)
      {
        boolean bool1;
        Object localObject2;
        Object localObject3;
        boolean bool2;
        String str2;
        int i;
        Object[] arrayOfObject;
        int j = 0;
        localObject1 = null;
        localJSONException1.printStackTrace();
        continue;
      }
      try
      {
        bool2 = ((String)localObject1).equals(localObject2);
        if ((bool2) && (localObject2 != null))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append(str1);
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          str1 = ((StringBuilder)localObject1).toString();
          localObject1 = str1;
        }
      }
      catch (JSONException localJSONException2)
      {
        localObject1 = str1;
        continue;
        continue;
      }
      try
      {
        bool1 = b;
        if (bool1) {}
        return (String)localObject1;
      }
      catch (JSONException localJSONException3)
      {
        continue;
        localObject1 = str1;
      }
      if ((localObject1 == null) || (localObject2 == null)) {
        break label257;
      }
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(str1);
      str2 = "%s(%s)";
      i = 2;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = localObject1;
      j = 1;
      arrayOfObject[j] = localObject2;
      localObject1 = String.format(str2, arrayOfObject);
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      str1 = ((StringBuilder)localObject1).toString();
      localObject1 = str1;
    }
  }
  
  private static String b(String paramString1, String paramString2)
  {
    String str = null;
    for (;;)
    {
      try
      {
        boolean bool1 = com.vvt.ag.b.a(paramString2);
        if (bool1) {
          continue;
        }
        localObject1 = "file://";
        boolean bool4 = paramString2.startsWith((String)localObject1);
        if (!bool4) {
          continue;
        }
        int i = ((String)localObject1).length();
        int k = paramString2.length();
        localObject1 = paramString2.substring(i, k);
      }
      catch (Exception localException)
      {
        Object localObject1;
        boolean bool5;
        Object localObject3;
        Object localObject4;
        boolean bool2;
        Object localObject5;
        int j;
        int m;
        boolean bool3 = c;
        if (!bool3) {
          continue;
        }
        continue;
        bool3 = false;
        Object localObject2 = null;
        continue;
      }
      bool5 = com.vvt.ag.b.a((String)localObject1);
      if (!bool5)
      {
        localObject3 = "%20";
        localObject4 = " ";
        localObject1 = ((String)localObject1).replace((CharSequence)localObject3, (CharSequence)localObject4);
        localObject1 = com.vvt.io.d.h((String)localObject1);
        bool5 = a;
        if (bool5) {}
        localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject1);
        bool2 = ((File)localObject3).exists();
        if (bool2)
        {
          localObject1 = ImType.VIBER;
          localObject4 = ImMediaFileType.OWNER_PROFILE;
          localObject1 = com.vvt.im.a.c.a(paramString1, (ImType)localObject1, (ImMediaFileType)localObject4);
          localObject4 = ImMediaFileType.OWNER_PROFILE;
          localObject4 = com.vvt.im.a.c.a((ImMediaFileType)localObject4);
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
          localObject5 = File.separator;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          str = ((StringBuilder)localObject1).toString();
          localObject1 = ((File)localObject3).getAbsolutePath();
          com.vvt.io.d.a((String)localObject1, str);
        }
      }
      return str;
      localObject1 = "/";
      j = paramString2.lastIndexOf((String)localObject1);
      m = -1;
      if (j == m) {
        continue;
      }
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "/sdcard/viber/media/User photos";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = File.separator;
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      j += 1;
      localObject1 = paramString2.substring(j);
      localObject1 = f((String)localObject1);
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = ".jpg";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
  }
  
  public static List b()
  {
    int i = 3;
    int j = 2;
    int k = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[k] = "com.viber.voip";
    arrayOfObject[j] = "viber_messages";
    String str = String.format("%s/%s/databases/%s", arrayOfObject);
    localArrayList.add(str);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[k] = "com.viber.voip";
    arrayOfObject[j] = "viber_messages";
    str = String.format("%s/%s/databases/%s", arrayOfObject);
    localArrayList.add(str);
    return localArrayList;
  }
  
  static void b(com.vvt.af.a.a parama, int paramInt)
  {
    int i = 0;
    int j = 0;
    String str = null;
    for (;;)
    {
      int k = 2;
      if (j <= k)
      {
        k = 1;
        if (j >= k) {
          break;
        }
      }
      j = 10;
      if (i >= j) {
        break;
      }
      str = "status";
      j = c(parama, paramInt, str);
      long l = 6000L;
      SystemClock.sleep(l);
      boolean bool = a;
      if (bool) {}
      i += 1;
    }
  }
  
  /* Error */
  private static boolean b(com.vvt.af.a.a parama)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: ifnull +94 -> 105
    //   14: ldc 80
    //   16: astore_3
    //   17: iconst_0
    //   18: istore 4
    //   20: aload_0
    //   21: astore 5
    //   23: aload_0
    //   24: aload_3
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: aconst_null
    //   31: aconst_null
    //   32: invokevirtual 85	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   35: astore 5
    //   37: ldc_w 765
    //   40: astore_3
    //   41: aload 5
    //   43: aload_3
    //   44: invokeinterface 97 2 0
    //   49: istore 6
    //   51: iload 6
    //   53: ifle +44 -> 97
    //   56: iconst_1
    //   57: istore 6
    //   59: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   62: istore 4
    //   64: iload 4
    //   66: ifeq +121 -> 187
    //   69: aload 5
    //   71: astore_1
    //   72: iload 6
    //   74: istore_2
    //   75: aload_1
    //   76: ifnull +9 -> 85
    //   79: aload_1
    //   80: invokeinterface 104 1 0
    //   85: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   88: istore 6
    //   90: iload 6
    //   92: ifeq +3 -> 95
    //   95: iload_2
    //   96: ireturn
    //   97: iconst_0
    //   98: istore 6
    //   100: aconst_null
    //   101: astore_3
    //   102: goto -43 -> 59
    //   105: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   108: istore_2
    //   109: iload_2
    //   110: ifeq +3 -> 113
    //   113: iconst_0
    //   114: istore_2
    //   115: aconst_null
    //   116: astore 5
    //   118: goto -43 -> 75
    //   121: astore 5
    //   123: iconst_0
    //   124: istore_2
    //   125: aconst_null
    //   126: astore 5
    //   128: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   131: istore 6
    //   133: iload 6
    //   135: ifeq +3 -> 138
    //   138: aload 5
    //   140: ifnull +10 -> 150
    //   143: aload 5
    //   145: invokeinterface 104 1 0
    //   150: iconst_0
    //   151: istore_2
    //   152: aconst_null
    //   153: astore 5
    //   155: goto -70 -> 85
    //   158: astore 5
    //   160: aload_1
    //   161: ifnull +9 -> 170
    //   164: aload_1
    //   165: invokeinterface 104 1 0
    //   170: aload 5
    //   172: athrow
    //   173: astore_3
    //   174: aload 5
    //   176: astore_1
    //   177: aload_3
    //   178: astore 5
    //   180: goto -20 -> 160
    //   183: astore_3
    //   184: goto -56 -> 128
    //   187: aload 5
    //   189: astore_1
    //   190: iload 6
    //   192: istore_2
    //   193: goto -118 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	parama	com.vvt.af.a.a
    //   1	189	1	localObject1	Object
    //   5	188	2	bool1	boolean
    //   16	86	3	str	String
    //   173	5	3	localObject2	Object
    //   183	1	3	localException1	Exception
    //   18	47	4	bool2	boolean
    //   21	96	5	localObject3	Object
    //   121	1	5	localException2	Exception
    //   126	28	5	localObject4	Object
    //   158	17	5	localObject5	Object
    //   178	10	5	localObject6	Object
    //   49	24	6	i	int
    //   88	103	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   31	35	121	java/lang/Exception
    //   105	108	121	java/lang/Exception
    //   31	35	158	finally
    //   105	108	158	finally
    //   43	49	173	finally
    //   59	62	173	finally
    //   128	131	173	finally
    //   43	49	183	java/lang/Exception
    //   59	62	183	java/lang/Exception
  }
  
  /* Error */
  private static int c(com.vvt.af.a.a parama, int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: iload_3
    //   9: anewarray 4	java/lang/Object
    //   12: astore 6
    //   14: ldc 93
    //   16: astore 7
    //   18: aload 6
    //   20: iconst_0
    //   21: aload 7
    //   23: aastore
    //   24: ldc 106
    //   26: aload 6
    //   28: invokestatic 110	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore 8
    //   33: iload_3
    //   34: anewarray 47	java/lang/String
    //   37: astore 9
    //   39: new 112	java/lang/StringBuilder
    //   42: astore 10
    //   44: aload 10
    //   46: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   49: aload 10
    //   51: iload_1
    //   52: invokevirtual 119	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: astore 10
    //   57: ldc 121
    //   59: astore 6
    //   61: aload 10
    //   63: aload 6
    //   65: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore 10
    //   73: aload 9
    //   75: iconst_0
    //   76: aload 10
    //   78: aastore
    //   79: ldc 78
    //   81: astore 11
    //   83: aload_0
    //   84: ifnull +180 -> 264
    //   87: ldc 80
    //   89: astore 6
    //   91: aconst_null
    //   92: astore 7
    //   94: aload_0
    //   95: astore 10
    //   97: aload_0
    //   98: aload 6
    //   100: aconst_null
    //   101: aload 8
    //   103: aload 9
    //   105: aconst_null
    //   106: aconst_null
    //   107: aload 11
    //   109: invokevirtual 131	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   112: astore 10
    //   114: aload 10
    //   116: ifnull +135 -> 251
    //   119: aload 10
    //   121: invokeinterface 134 1 0
    //   126: istore 12
    //   128: iload 12
    //   130: ifeq +121 -> 251
    //   133: aload 10
    //   135: aload_2
    //   136: invokeinterface 97 2 0
    //   141: istore 12
    //   143: aload 10
    //   145: iload 12
    //   147: invokeinterface 138 2 0
    //   152: istore 4
    //   154: aload 10
    //   156: astore 5
    //   158: iload 4
    //   160: istore 13
    //   162: aload 5
    //   164: ifnull +10 -> 174
    //   167: aload 5
    //   169: invokeinterface 104 1 0
    //   174: iload 13
    //   176: ireturn
    //   177: astore 10
    //   179: iconst_0
    //   180: istore 13
    //   182: aconst_null
    //   183: astore 10
    //   185: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   188: istore 12
    //   190: iload 12
    //   192: ifeq +3 -> 195
    //   195: aload 10
    //   197: ifnull +10 -> 207
    //   200: aload 10
    //   202: invokeinterface 104 1 0
    //   207: iconst_0
    //   208: istore 13
    //   210: aconst_null
    //   211: astore 10
    //   213: goto -39 -> 174
    //   216: astore 10
    //   218: aload 5
    //   220: ifnull +10 -> 230
    //   223: aload 5
    //   225: invokeinterface 104 1 0
    //   230: aload 10
    //   232: athrow
    //   233: astore 6
    //   235: aload 10
    //   237: astore 5
    //   239: aload 6
    //   241: astore 10
    //   243: goto -25 -> 218
    //   246: astore 6
    //   248: goto -63 -> 185
    //   251: aload 10
    //   253: astore 5
    //   255: iconst_0
    //   256: istore 13
    //   258: aconst_null
    //   259: astore 10
    //   261: goto -99 -> 162
    //   264: iconst_0
    //   265: istore 13
    //   267: aconst_null
    //   268: astore 10
    //   270: goto -108 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	parama	com.vvt.af.a.a
    //   0	273	1	paramInt	int
    //   0	273	2	paramString	String
    //   1	33	3	i	int
    //   3	156	4	j	int
    //   6	248	5	localObject1	Object
    //   12	87	6	localObject2	Object
    //   233	7	6	localObject3	Object
    //   246	1	6	localException1	Exception
    //   16	77	7	str1	String
    //   31	71	8	str2	String
    //   37	67	9	arrayOfString	String[]
    //   42	113	10	localObject4	Object
    //   177	1	10	localException2	Exception
    //   183	29	10	localObject5	Object
    //   216	20	10	localObject6	Object
    //   241	28	10	localObject7	Object
    //   81	27	11	str3	String
    //   126	3	12	bool1	boolean
    //   141	5	12	k	int
    //   188	3	12	bool2	boolean
    //   160	106	13	m	int
    // Exception table:
    //   from	to	target	type
    //   107	112	177	java/lang/Exception
    //   107	112	216	finally
    //   119	126	233	finally
    //   135	141	233	finally
    //   145	152	233	finally
    //   185	188	233	finally
    //   119	126	246	java/lang/Exception
    //   135	141	246	java/lang/Exception
    //   145	152	246	java/lang/Exception
  }
  
  /* Error */
  static long c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 61
    //   4: astore_1
    //   5: ldc 63
    //   7: astore_2
    //   8: aload_1
    //   9: aload_2
    //   10: invokestatic 68	com/vvt/af/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/af/a/a;
    //   13: astore_2
    //   14: aload_2
    //   15: invokestatic 144	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;)J
    //   18: lstore_3
    //   19: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   22: istore 5
    //   24: iload 5
    //   26: ifeq +3 -> 29
    //   29: aload_2
    //   30: ifnull +7 -> 37
    //   33: aload_2
    //   34: invokevirtual 74	com/vvt/af/a/a:a	()V
    //   37: lload_3
    //   38: lreturn
    //   39: astore_1
    //   40: aconst_null
    //   41: astore_2
    //   42: iconst_m1
    //   43: i2l
    //   44: lstore_3
    //   45: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   48: istore 5
    //   50: iload 5
    //   52: ifeq +3 -> 55
    //   55: aload_2
    //   56: ifnull -19 -> 37
    //   59: goto -26 -> 33
    //   62: astore_1
    //   63: aconst_null
    //   64: astore_2
    //   65: aload_1
    //   66: astore_0
    //   67: aload_2
    //   68: ifnull +7 -> 75
    //   71: aload_2
    //   72: invokevirtual 74	com/vvt/af/a/a:a	()V
    //   75: aload_0
    //   76: athrow
    //   77: astore_0
    //   78: goto -11 -> 67
    //   81: astore_0
    //   82: goto -40 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	75	0	localObject1	Object
    //   77	1	0	localObject2	Object
    //   81	1	0	localException1	Exception
    //   4	5	1	str	String
    //   39	1	1	localException2	Exception
    //   62	4	1	localObject3	Object
    //   7	65	2	localObject4	Object
    //   18	27	3	l	long
    //   22	29	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	13	39	java/lang/Exception
    //   9	13	62	finally
    //   14	18	77	finally
    //   19	22	77	finally
    //   45	48	77	finally
    //   14	18	81	java/lang/Exception
    //   19	22	81	java/lang/Exception
  }
  
  /* Error */
  private static long c(com.vvt.af.a.a parama, int paramInt)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_2
    //   3: aconst_null
    //   4: astore 4
    //   6: iconst_m1
    //   7: istore 5
    //   9: iload_1
    //   10: iload 5
    //   12: if_icmpeq +225 -> 237
    //   15: ldc 78
    //   17: astore 6
    //   19: ldc 80
    //   21: astore 7
    //   23: aconst_null
    //   24: astore 8
    //   26: iconst_0
    //   27: istore 9
    //   29: iload_1
    //   30: invokestatic 769	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   33: astore 10
    //   35: aload_0
    //   36: astore 11
    //   38: aload_0
    //   39: aload 7
    //   41: aconst_null
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: aload 6
    //   48: aload 10
    //   50: invokevirtual 85	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   53: astore 11
    //   55: aload 11
    //   57: ifnull +170 -> 227
    //   60: aload 11
    //   62: invokeinterface 772 1 0
    //   67: istore 12
    //   69: iload 12
    //   71: ifeq +62 -> 133
    //   74: ldc 93
    //   76: astore 7
    //   78: aload 11
    //   80: aload 7
    //   82: invokeinterface 97 2 0
    //   87: istore 12
    //   89: aload 11
    //   91: iload 12
    //   93: invokeinterface 101 2 0
    //   98: lstore 13
    //   100: lload 13
    //   102: lstore 15
    //   104: aload 11
    //   106: astore 8
    //   108: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   111: istore 9
    //   113: iload 9
    //   115: ifeq +3 -> 118
    //   118: aload 8
    //   120: ifnull +10 -> 130
    //   123: aload 8
    //   125: invokeinterface 104 1 0
    //   130: lload 15
    //   132: lreturn
    //   133: lconst_0
    //   134: lstore 13
    //   136: lload 13
    //   138: lstore 15
    //   140: aload 11
    //   142: astore 8
    //   144: goto -36 -> 108
    //   147: astore 11
    //   149: aconst_null
    //   150: astore 8
    //   152: iconst_m1
    //   153: i2l
    //   154: lstore 15
    //   156: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   159: istore 9
    //   161: iload 9
    //   163: ifeq +3 -> 166
    //   166: aload 8
    //   168: ifnull -38 -> 130
    //   171: goto -48 -> 123
    //   174: astore 11
    //   176: aload 4
    //   178: ifnull +10 -> 188
    //   181: aload 4
    //   183: invokeinterface 104 1 0
    //   188: aload 11
    //   190: athrow
    //   191: astore 7
    //   193: aload 11
    //   195: astore 4
    //   197: aload 7
    //   199: astore 11
    //   201: goto -25 -> 176
    //   204: astore 11
    //   206: aload 8
    //   208: astore 4
    //   210: goto -34 -> 176
    //   213: astore 7
    //   215: aload 11
    //   217: astore 8
    //   219: goto -67 -> 152
    //   222: astore 11
    //   224: goto -72 -> 152
    //   227: aload 11
    //   229: astore 8
    //   231: lload_2
    //   232: lstore 15
    //   234: goto -126 -> 108
    //   237: aconst_null
    //   238: astore 8
    //   240: lload_2
    //   241: lstore 15
    //   243: goto -135 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	246	0	parama	com.vvt.af.a.a
    //   0	246	1	paramInt	int
    //   2	239	2	l1	long
    //   4	205	4	localObject1	Object
    //   7	6	5	i	int
    //   17	30	6	str1	String
    //   21	60	7	str2	String
    //   191	7	7	localObject2	Object
    //   213	1	7	localException1	Exception
    //   24	215	8	localObject3	Object
    //   27	135	9	bool1	boolean
    //   33	16	10	str3	String
    //   36	105	11	localObject4	Object
    //   147	1	11	localException2	Exception
    //   174	20	11	localObject5	Object
    //   199	1	11	localObject6	Object
    //   204	12	11	localObject7	Object
    //   222	6	11	localException3	Exception
    //   67	3	12	bool2	boolean
    //   87	5	12	j	int
    //   98	39	13	l2	long
    //   102	140	15	l3	long
    // Exception table:
    //   from	to	target	type
    //   29	33	147	java/lang/Exception
    //   48	53	147	java/lang/Exception
    //   29	33	174	finally
    //   48	53	174	finally
    //   60	67	191	finally
    //   80	87	191	finally
    //   91	98	191	finally
    //   108	111	204	finally
    //   156	159	204	finally
    //   60	67	213	java/lang/Exception
    //   80	87	213	java/lang/Exception
    //   91	98	213	java/lang/Exception
    //   108	111	222	java/lang/Exception
  }
  
  private static ViberMessageType c(String paramString)
  {
    ViberMessageType localViberMessageType = ViberMessageType.FILE;
    String str = "image";
    boolean bool = paramString.contains(str);
    if (bool) {
      localViberMessageType = ViberMessageType.IMAGE;
    }
    for (;;)
    {
      return localViberMessageType;
      str = "audio";
      bool = paramString.contains(str);
      if (bool)
      {
        localViberMessageType = ViberMessageType.AUDIO;
      }
      else
      {
        str = "video";
        bool = paramString.contains(str);
        if (bool) {
          localViberMessageType = ViberMessageType.VIDEO;
        }
      }
    }
  }
  
  private static String c(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    int i = 3;
    Bitmap localBitmap = ThumbnailUtils.createVideoThumbnail(paramString2, i);
    Object localObject = new java/io/File;
    ((File)localObject).<init>(paramString3);
    if (localBitmap != null) {}
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject);
      localObject = Bitmap.CompressFormat.JPEG;
      int j = 40;
      bool = localBitmap.compress((Bitmap.CompressFormat)localObject, j, localFileOutputStream);
      if (bool) {
        str = paramString3;
      }
      localFileOutputStream.flush();
      localFileOutputStream.close();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return str;
  }
  
  /* Error */
  private static long d(com.vvt.af.a.a parama, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: lconst_0
    //   5: lstore 4
    //   7: iload_2
    //   8: anewarray 4	java/lang/Object
    //   11: astore 6
    //   13: ldc 93
    //   15: astore 7
    //   17: aload 6
    //   19: iconst_0
    //   20: aload 7
    //   22: aastore
    //   23: ldc 106
    //   25: aload 6
    //   27: invokestatic 110	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   30: astore 8
    //   32: iload_2
    //   33: anewarray 47	java/lang/String
    //   36: astore 9
    //   38: new 112	java/lang/StringBuilder
    //   41: astore 10
    //   43: aload 10
    //   45: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   48: aload 10
    //   50: iload_1
    //   51: invokevirtual 119	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: astore 10
    //   56: ldc 121
    //   58: astore 6
    //   60: aload 10
    //   62: aload 6
    //   64: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: astore 10
    //   72: aload 9
    //   74: iconst_0
    //   75: aload 10
    //   77: aastore
    //   78: ldc 78
    //   80: astore 11
    //   82: aload_0
    //   83: ifnull +172 -> 255
    //   86: ldc 80
    //   88: astore 6
    //   90: aconst_null
    //   91: astore 7
    //   93: aload_0
    //   94: astore 10
    //   96: aload_0
    //   97: aload 6
    //   99: aconst_null
    //   100: aload 8
    //   102: aload 9
    //   104: aconst_null
    //   105: aconst_null
    //   106: aload 11
    //   108: invokevirtual 131	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   111: astore 10
    //   113: aload 10
    //   115: ifnull +130 -> 245
    //   118: aload 10
    //   120: invokeinterface 134 1 0
    //   125: istore 12
    //   127: iload 12
    //   129: ifeq +116 -> 245
    //   132: ldc_w 811
    //   135: astore 6
    //   137: aload 10
    //   139: aload 6
    //   141: invokeinterface 97 2 0
    //   146: istore 12
    //   148: aload 10
    //   150: iload 12
    //   152: invokeinterface 101 2 0
    //   157: lstore 4
    //   159: aload 10
    //   161: astore_3
    //   162: lload 4
    //   164: lstore 13
    //   166: aload_3
    //   167: ifnull +9 -> 176
    //   170: aload_3
    //   171: invokeinterface 104 1 0
    //   176: lload 13
    //   178: lreturn
    //   179: astore 10
    //   181: aconst_null
    //   182: astore 10
    //   184: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   187: istore 12
    //   189: iload 12
    //   191: ifeq +3 -> 194
    //   194: aload 10
    //   196: ifnull +10 -> 206
    //   199: aload 10
    //   201: invokeinterface 104 1 0
    //   206: lload 4
    //   208: lstore 13
    //   210: goto -34 -> 176
    //   213: astore 10
    //   215: aload_3
    //   216: ifnull +9 -> 225
    //   219: aload_3
    //   220: invokeinterface 104 1 0
    //   225: aload 10
    //   227: athrow
    //   228: astore 6
    //   230: aload 10
    //   232: astore_3
    //   233: aload 6
    //   235: astore 10
    //   237: goto -22 -> 215
    //   240: astore 6
    //   242: goto -58 -> 184
    //   245: aload 10
    //   247: astore_3
    //   248: lload 4
    //   250: lstore 13
    //   252: goto -86 -> 166
    //   255: lload 4
    //   257: lstore 13
    //   259: goto -93 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	parama	com.vvt.af.a.a
    //   0	262	1	paramInt	int
    //   1	32	2	i	int
    //   3	245	3	localObject1	Object
    //   5	251	4	l1	long
    //   11	129	6	localObject2	Object
    //   228	6	6	localObject3	Object
    //   240	1	6	localException1	Exception
    //   15	77	7	str1	String
    //   30	71	8	str2	String
    //   36	67	9	arrayOfString	String[]
    //   41	119	10	localObject4	Object
    //   179	1	10	localException2	Exception
    //   182	18	10	localObject5	Object
    //   213	18	10	localObject6	Object
    //   235	11	10	localObject7	Object
    //   80	27	11	str3	String
    //   125	3	12	bool1	boolean
    //   146	5	12	j	int
    //   187	3	12	bool2	boolean
    //   164	94	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   106	111	179	java/lang/Exception
    //   106	111	213	finally
    //   118	125	228	finally
    //   139	146	228	finally
    //   150	157	228	finally
    //   184	187	228	finally
    //   118	125	240	java/lang/Exception
    //   139	146	240	java/lang/Exception
    //   150	157	240	java/lang/Exception
  }
  
  private static String d(String paramString)
  {
    int i = 0;
    String str = null;
    if (paramString != null)
    {
      String[] arrayOfString = paramString.split("/");
      if (arrayOfString != null)
      {
        int j = arrayOfString.length;
        if (j > 0)
        {
          i = arrayOfString.length + -1;
          str = arrayOfString[i];
        }
      }
    }
    return str;
  }
  
  static boolean d()
  {
    boolean bool1 = a;
    if (bool1) {}
    boolean bool2 = false;
    com.vvt.af.a.a locala = null;
    String str1 = "com.viber.voip";
    String str2 = "viber_messages";
    try
    {
      locala = com.vvt.af.a.a.a(str1, str2);
      bool1 = b(locala);
      if (locala != null) {
        locala.a();
      }
      bool2 = a;
      if (bool2) {}
      return bool1;
    }
    finally
    {
      if (locala != null) {
        locala.a();
      }
    }
  }
  
  private static String e()
  {
    String str = com.vvt.io.d.h("/sdcard/viber/media/Viber Video");
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (bool) {}
    for (str = "Viber Video";; str = "Viber Videos") {
      return str;
    }
  }
  
  /* Error */
  private static String e(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: invokestatic 277	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   14: istore_2
    //   15: iload_2
    //   16: ifne +107 -> 123
    //   19: new 347	java/io/BufferedReader
    //   22: astore_3
    //   23: new 344	java/io/FileReader
    //   26: astore 4
    //   28: aload 4
    //   30: aload_0
    //   31: invokespecial 345	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   34: aload_3
    //   35: aload 4
    //   37: invokespecial 826	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   40: aload_3
    //   41: invokevirtual 354	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   44: astore 4
    //   46: aload 4
    //   48: ifnull +71 -> 119
    //   51: getstatic 17	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	Z
    //   54: istore 5
    //   56: iload 5
    //   58: ifeq +3 -> 61
    //   61: aload 4
    //   63: invokevirtual 50	java/lang/String:length	()I
    //   66: istore 5
    //   68: bipush 8
    //   70: istore 6
    //   72: iload 5
    //   74: iload 6
    //   76: if_icmplt -36 -> 40
    //   79: bipush 7
    //   81: istore 5
    //   83: aload 4
    //   85: iload 5
    //   87: invokevirtual 364	java/lang/String:substring	(I)Ljava/lang/String;
    //   90: astore_1
    //   91: getstatic 17	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	Z
    //   94: istore 7
    //   96: iload 7
    //   98: ifeq -58 -> 40
    //   101: goto -61 -> 40
    //   104: astore_3
    //   105: iconst_0
    //   106: istore_2
    //   107: aconst_null
    //   108: astore_3
    //   109: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   112: istore 7
    //   114: iload 7
    //   116: ifeq +3 -> 119
    //   119: aload_3
    //   120: invokestatic 831	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   123: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   126: istore_2
    //   127: iload_2
    //   128: ifeq +3 -> 131
    //   131: getstatic 14	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	Z
    //   134: istore_2
    //   135: iload_2
    //   136: ifeq +3 -> 139
    //   139: aload_1
    //   140: areturn
    //   141: astore 8
    //   143: iconst_0
    //   144: istore_2
    //   145: aconst_null
    //   146: astore_3
    //   147: aload 8
    //   149: astore_1
    //   150: aload_3
    //   151: invokestatic 831	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   154: aload_1
    //   155: athrow
    //   156: astore_1
    //   157: goto -7 -> 150
    //   160: astore 4
    //   162: goto -53 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	paramString	String
    //   1	154	1	localObject1	Object
    //   156	1	1	localObject2	Object
    //   5	140	2	bool1	boolean
    //   22	19	3	localBufferedReader1	java.io.BufferedReader
    //   104	1	3	localException1	Exception
    //   108	43	3	localBufferedReader2	java.io.BufferedReader
    //   26	58	4	localObject3	Object
    //   160	1	4	localException2	Exception
    //   54	3	5	bool2	boolean
    //   66	20	5	i	int
    //   70	7	6	j	int
    //   94	21	7	bool3	boolean
    //   141	7	8	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   19	22	104	java/lang/Exception
    //   23	26	104	java/lang/Exception
    //   30	34	104	java/lang/Exception
    //   35	40	104	java/lang/Exception
    //   19	22	141	finally
    //   23	26	141	finally
    //   30	34	141	finally
    //   35	40	141	finally
    //   40	44	156	finally
    //   51	54	156	finally
    //   61	66	156	finally
    //   85	90	156	finally
    //   91	94	156	finally
    //   109	112	156	finally
    //   40	44	160	java/lang/Exception
    //   51	54	160	java/lang/Exception
    //   61	66	160	java/lang/Exception
    //   85	90	160	java/lang/Exception
    //   91	94	160	java/lang/Exception
  }
  
  private static String f(String paramString)
  {
    String str1 = null;
    Object localObject = "MD5";
    try
    {
      localObject = MessageDigest.getInstance((String)localObject);
      byte[] arrayOfByte = paramString.getBytes();
      ((MessageDigest)localObject).update(arrayOfByte);
      arrayOfByte = ((MessageDigest)localObject).digest();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      int i = 32;
      localStringBuilder.<init>(i);
      i = 0;
      localObject = null;
      for (;;)
      {
        int j = arrayOfByte.length;
        if (i >= j) {
          break;
        }
        j = arrayOfByte[i] & 0xFF;
        String str2 = Integer.toHexString(j);
        localStringBuilder.append(str2);
        i += 1;
      }
      str1 = localStringBuilder.toString();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
    return str1;
  }
  
  /* Error */
  private static String[] g(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 2
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: iconst_2
    //   8: istore_3
    //   9: iload_3
    //   10: anewarray 47	java/lang/String
    //   13: astore 4
    //   15: iconst_0
    //   16: istore 5
    //   18: aconst_null
    //   19: astore 6
    //   21: invokestatic 862	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   24: astore 7
    //   26: new 161	java/io/File
    //   29: astore 8
    //   31: aload 8
    //   33: aload_0
    //   34: invokespecial 164	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: aload 8
    //   39: invokevirtual 167	java/io/File:exists	()Z
    //   42: istore_3
    //   43: iload_3
    //   44: ifeq +255 -> 299
    //   47: new 864	java/io/FileInputStream
    //   50: astore 9
    //   52: aload 9
    //   54: aload 8
    //   56: invokespecial 865	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   59: aload 7
    //   61: invokevirtual 869	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   64: astore 6
    //   66: new 871	org/xml/sax/InputSource
    //   69: astore 7
    //   71: aload 7
    //   73: aload 9
    //   75: invokespecial 874	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   78: aload 6
    //   80: aload 7
    //   82: invokevirtual 880	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   85: astore 6
    //   87: aload 6
    //   89: invokeinterface 886 1 0
    //   94: astore 7
    //   96: aload 7
    //   98: invokeinterface 891 1 0
    //   103: ldc_w 893
    //   106: astore 7
    //   108: aload 6
    //   110: aload 7
    //   112: invokeinterface 897 2 0
    //   117: astore 7
    //   119: aload 7
    //   121: invokeinterface 902 1 0
    //   126: istore 10
    //   128: iconst_0
    //   129: istore 5
    //   131: aconst_null
    //   132: astore 6
    //   134: iload 5
    //   136: iload 10
    //   138: if_icmpge +183 -> 321
    //   141: aload 7
    //   143: iload 5
    //   145: invokeinterface 906 2 0
    //   150: astore_1
    //   151: aload_1
    //   152: invokeinterface 912 1 0
    //   157: astore 11
    //   159: ldc_w 914
    //   162: astore 12
    //   164: aload 11
    //   166: aload 12
    //   168: invokeinterface 920 2 0
    //   173: astore 11
    //   175: aload 11
    //   177: invokeinterface 923 1 0
    //   182: astore 11
    //   184: ldc_w 925
    //   187: astore 12
    //   189: aload 11
    //   191: aload 12
    //   193: invokevirtual 746	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   196: istore 13
    //   198: iload 13
    //   200: ifeq +37 -> 237
    //   203: iconst_0
    //   204: istore 14
    //   206: aconst_null
    //   207: astore 11
    //   209: aload_1
    //   210: invokeinterface 929 1 0
    //   215: astore_1
    //   216: aload_1
    //   217: invokeinterface 923 1 0
    //   222: astore_1
    //   223: aload 4
    //   225: iconst_0
    //   226: aload_1
    //   227: aastore
    //   228: iload 5
    //   230: iconst_1
    //   231: iadd
    //   232: istore 5
    //   234: goto -100 -> 134
    //   237: ldc_w 931
    //   240: astore 12
    //   242: aload 11
    //   244: aload 12
    //   246: invokevirtual 746	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   249: istore 14
    //   251: iload 14
    //   253: ifeq -25 -> 228
    //   256: iconst_1
    //   257: istore 14
    //   259: aload_1
    //   260: invokeinterface 929 1 0
    //   265: astore_1
    //   266: aload_1
    //   267: invokeinterface 923 1 0
    //   272: astore_1
    //   273: aload 4
    //   275: iload 14
    //   277: aload_1
    //   278: aastore
    //   279: goto -51 -> 228
    //   282: astore 6
    //   284: getstatic 22	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   287: istore 5
    //   289: iload 5
    //   291: ifeq +3 -> 294
    //   294: aload 9
    //   296: invokestatic 933	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   299: aload_2
    //   300: monitorexit
    //   301: aload 4
    //   303: areturn
    //   304: astore 9
    //   306: aload 6
    //   308: invokestatic 933	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   311: aload 9
    //   313: athrow
    //   314: astore 9
    //   316: aload_2
    //   317: monitorexit
    //   318: aload 9
    //   320: athrow
    //   321: aload 9
    //   323: invokestatic 933	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   326: goto -27 -> 299
    //   329: astore 15
    //   331: aload 9
    //   333: astore 6
    //   335: aload 15
    //   337: astore 9
    //   339: goto -33 -> 306
    //   342: astore 9
    //   344: iconst_0
    //   345: istore_3
    //   346: aconst_null
    //   347: astore 9
    //   349: goto -65 -> 284
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	352	0	paramString	String
    //   1	277	1	localObject1	Object
    //   4	313	2	localClass	Class
    //   8	2	3	i	int
    //   42	304	3	bool1	boolean
    //   13	289	4	arrayOfString	String[]
    //   16	217	5	j	int
    //   287	3	5	bool2	boolean
    //   19	114	6	localObject2	Object
    //   282	25	6	localException1	Exception
    //   333	1	6	localObject3	Object
    //   24	118	7	localObject4	Object
    //   29	26	8	localFile	File
    //   50	245	9	localFileInputStream	java.io.FileInputStream
    //   304	8	9	localObject5	Object
    //   314	18	9	localInputStream	java.io.InputStream
    //   337	1	9	localObject6	Object
    //   342	1	9	localException2	Exception
    //   347	1	9	localObject7	Object
    //   126	13	10	k	int
    //   157	86	11	localObject8	Object
    //   162	83	12	str	String
    //   196	3	13	bool3	boolean
    //   204	72	14	bool4	boolean
    //   329	7	15	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   59	64	282	java/lang/Exception
    //   66	69	282	java/lang/Exception
    //   73	78	282	java/lang/Exception
    //   80	85	282	java/lang/Exception
    //   87	94	282	java/lang/Exception
    //   96	103	282	java/lang/Exception
    //   110	117	282	java/lang/Exception
    //   119	126	282	java/lang/Exception
    //   143	150	282	java/lang/Exception
    //   151	157	282	java/lang/Exception
    //   166	173	282	java/lang/Exception
    //   175	182	282	java/lang/Exception
    //   191	196	282	java/lang/Exception
    //   209	215	282	java/lang/Exception
    //   216	222	282	java/lang/Exception
    //   226	228	282	java/lang/Exception
    //   244	249	282	java/lang/Exception
    //   259	265	282	java/lang/Exception
    //   266	272	282	java/lang/Exception
    //   277	279	282	java/lang/Exception
    //   47	50	304	finally
    //   54	59	304	finally
    //   9	13	314	finally
    //   21	24	314	finally
    //   26	29	314	finally
    //   33	37	314	finally
    //   37	42	314	finally
    //   294	299	314	finally
    //   306	311	314	finally
    //   311	314	314	finally
    //   321	326	314	finally
    //   59	64	329	finally
    //   66	69	329	finally
    //   73	78	329	finally
    //   80	85	329	finally
    //   87	94	329	finally
    //   96	103	329	finally
    //   110	117	329	finally
    //   119	126	329	finally
    //   143	150	329	finally
    //   151	157	329	finally
    //   166	173	329	finally
    //   175	182	329	finally
    //   191	196	329	finally
    //   209	215	329	finally
    //   216	222	329	finally
    //   226	228	329	finally
    //   244	249	329	finally
    //   259	265	329	finally
    //   266	272	329	finally
    //   277	279	329	finally
    //   284	287	329	finally
    //   47	50	342	java/lang/Exception
    //   54	59	342	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */