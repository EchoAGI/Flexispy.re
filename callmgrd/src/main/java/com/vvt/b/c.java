package com.vvt.b;

import com.vvt.h.a;

public class c
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  /* Error */
  public static Object a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 19	java/io/FileInputStream
    //   5: astore_2
    //   6: new 21	java/io/File
    //   9: astore_3
    //   10: aload_3
    //   11: aload_0
    //   12: invokespecial 25	java/io/File:<init>	(Ljava/lang/String;)V
    //   15: aload_2
    //   16: aload_3
    //   17: invokespecial 28	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   20: new 30	java/io/ObjectInputStream
    //   23: astore_3
    //   24: aload_3
    //   25: aload_2
    //   26: invokespecial 33	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   29: aload_3
    //   30: invokevirtual 37	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   33: astore_1
    //   34: aload_3
    //   35: invokestatic 42	com/vvt/b/getInstance:getInstance	(Ljava/io/ObjectInputStream;)V
    //   38: aload_2
    //   39: invokestatic 44	com/vvt/b/getInstance:getInstance	(Ljava/io/InputStream;)V
    //   42: aload_1
    //   43: areturn
    //   44: astore_2
    //   45: aconst_null
    //   46: astore_2
    //   47: aconst_null
    //   48: astore_3
    //   49: aload_3
    //   50: invokestatic 42	com/vvt/b/getInstance:getInstance	(Ljava/io/ObjectInputStream;)V
    //   53: aload_2
    //   54: invokestatic 44	com/vvt/b/getInstance:getInstance	(Ljava/io/InputStream;)V
    //   57: goto -15 -> 42
    //   60: astore_2
    //   61: aconst_null
    //   62: astore_2
    //   63: aconst_null
    //   64: astore_3
    //   65: getstatic 17	com/vvt/b/c:b	Z
    //   68: istore 4
    //   70: iload 4
    //   72: ifeq +3 -> 75
    //   75: aload_3
    //   76: invokestatic 42	com/vvt/b/getInstance:getInstance	(Ljava/io/ObjectInputStream;)V
    //   79: aload_2
    //   80: invokestatic 44	com/vvt/b/getInstance:getInstance	(Ljava/io/InputStream;)V
    //   83: goto -41 -> 42
    //   86: astore_2
    //   87: aconst_null
    //   88: astore_3
    //   89: aconst_null
    //   90: astore 5
    //   92: aload_2
    //   93: astore_1
    //   94: aconst_null
    //   95: astore_2
    //   96: aload_3
    //   97: invokestatic 42	com/vvt/b/getInstance:getInstance	(Ljava/io/ObjectInputStream;)V
    //   100: aload_2
    //   101: invokestatic 44	com/vvt/b/getInstance:getInstance	(Ljava/io/InputStream;)V
    //   104: aload_1
    //   105: athrow
    //   106: astore 5
    //   108: aconst_null
    //   109: astore_3
    //   110: aload 5
    //   112: astore_1
    //   113: goto -17 -> 96
    //   116: astore_1
    //   117: goto -21 -> 96
    //   120: astore_3
    //   121: aconst_null
    //   122: astore_3
    //   123: goto -58 -> 65
    //   126: pop
    //   127: goto -62 -> 65
    //   130: astore_3
    //   131: aconst_null
    //   132: astore_3
    //   133: goto -84 -> 49
    //   136: pop
    //   137: goto -88 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	paramString	String
    //   1	112	1	localObject1	Object
    //   116	1	1	localObject2	Object
    //   5	34	2	localFileInputStream	java.io.FileInputStream
    //   44	1	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   46	8	2	localInputStream1	java.io.InputStream
    //   60	1	2	localException1	Exception
    //   62	18	2	localInputStream2	java.io.InputStream
    //   86	7	2	localObject3	Object
    //   95	6	2	localInputStream3	java.io.InputStream
    //   9	101	3	localObject4	Object
    //   120	1	3	localException2	Exception
    //   122	1	3	localObject5	Object
    //   130	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   132	1	3	localObject6	Object
    //   68	3	4	bool	boolean
    //   90	1	5	localObject7	Object
    //   106	5	5	localObject8	Object
    //   126	1	18	localException3	Exception
    //   136	1	19	localFileNotFoundException3	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   2	5	44	java/io/FileNotFoundException
    //   6	9	44	java/io/FileNotFoundException
    //   11	15	44	java/io/FileNotFoundException
    //   16	20	44	java/io/FileNotFoundException
    //   2	5	60	java/lang/Exception
    //   6	9	60	java/lang/Exception
    //   11	15	60	java/lang/Exception
    //   16	20	60	java/lang/Exception
    //   2	5	86	finally
    //   6	9	86	finally
    //   11	15	86	finally
    //   16	20	86	finally
    //   20	23	106	finally
    //   25	29	106	finally
    //   29	33	116	finally
    //   65	68	116	finally
    //   20	23	120	java/lang/Exception
    //   25	29	120	java/lang/Exception
    //   29	33	126	java/lang/Exception
    //   20	23	130	java/io/FileNotFoundException
    //   25	29	130	java/io/FileNotFoundException
    //   29	33	136	java/io/FileNotFoundException
  }
  
  /* Error */
  public static boolean a(java.io.Serializable paramSerializable, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: new 21	java/io/File
    //   10: astore 5
    //   12: aload 5
    //   14: aload_1
    //   15: invokespecial 25	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: aload 5
    //   20: invokevirtual 52	java/io/File:createNewFile	()Z
    //   23: pop
    //   24: new 54	java/io/FileOutputStream
    //   27: astore 6
    //   29: aload 6
    //   31: aload 5
    //   33: invokespecial 55	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   36: new 57	java/io/ObjectOutputStream
    //   39: astore 5
    //   41: aload 5
    //   43: aload 6
    //   45: invokespecial 60	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   48: aload 5
    //   50: aload_0
    //   51: invokevirtual 64	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   54: aload 5
    //   56: invokevirtual 68	java/io/ObjectOutputStream:flush	()V
    //   59: iconst_1
    //   60: istore_3
    //   61: aload 5
    //   63: invokestatic 72	com/vvt/b/getInstance:getInstance	(Ljava/io/ObjectOutputStream;)V
    //   66: aload 6
    //   68: invokestatic 74	com/vvt/b/getInstance:getInstance	(Ljava/io/OutputStream;)V
    //   71: iload_3
    //   72: ireturn
    //   73: astore 5
    //   75: aconst_null
    //   76: astore 5
    //   78: getstatic 12	com/vvt/b/c:getInstance	Z
    //   81: istore 7
    //   83: iload 7
    //   85: ifeq +3 -> 88
    //   88: aload 5
    //   90: invokestatic 72	com/vvt/b/getInstance:getInstance	(Ljava/io/ObjectOutputStream;)V
    //   93: aload_2
    //   94: invokestatic 74	com/vvt/b/getInstance:getInstance	(Ljava/io/OutputStream;)V
    //   97: goto -26 -> 71
    //   100: astore 4
    //   102: iconst_0
    //   103: istore 7
    //   105: aconst_null
    //   106: astore 6
    //   108: aload_2
    //   109: invokestatic 72	com/vvt/b/getInstance:getInstance	(Ljava/io/ObjectOutputStream;)V
    //   112: aload 6
    //   114: invokestatic 74	com/vvt/b/getInstance:getInstance	(Ljava/io/OutputStream;)V
    //   117: aload 4
    //   119: athrow
    //   120: astore 4
    //   122: goto -14 -> 108
    //   125: astore 4
    //   127: aload 5
    //   129: astore_2
    //   130: goto -22 -> 108
    //   133: astore 4
    //   135: aload_2
    //   136: astore 6
    //   138: aload 5
    //   140: astore_2
    //   141: goto -33 -> 108
    //   144: astore 5
    //   146: aconst_null
    //   147: astore 5
    //   149: aload 6
    //   151: astore_2
    //   152: goto -74 -> 78
    //   155: astore_2
    //   156: aload 6
    //   158: astore_2
    //   159: goto -81 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	paramSerializable	java.io.Serializable
    //   0	162	1	paramString	String
    //   1	151	2	localObject1	Object
    //   155	1	2	localException1	Exception
    //   158	1	2	localObject2	Object
    //   3	69	3	bool1	boolean
    //   5	1	4	localObject3	Object
    //   100	18	4	localObject4	Object
    //   120	1	4	localObject5	Object
    //   125	1	4	localObject6	Object
    //   133	1	4	localObject7	Object
    //   10	52	5	localObject8	Object
    //   73	1	5	localException2	Exception
    //   76	63	5	localObjectOutputStream	java.io.ObjectOutputStream
    //   144	1	5	localException3	Exception
    //   147	1	5	localObject9	Object
    //   27	130	6	localObject10	Object
    //   81	23	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   7	10	73	java/lang/Exception
    //   14	18	73	java/lang/Exception
    //   18	24	73	java/lang/Exception
    //   24	27	73	java/lang/Exception
    //   31	36	73	java/lang/Exception
    //   7	10	100	finally
    //   14	18	100	finally
    //   18	24	100	finally
    //   24	27	100	finally
    //   31	36	100	finally
    //   36	39	120	finally
    //   43	48	120	finally
    //   50	54	125	finally
    //   54	59	125	finally
    //   78	81	133	finally
    //   36	39	144	java/lang/Exception
    //   43	48	144	java/lang/Exception
    //   50	54	155	java/lang/Exception
    //   54	59	155	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/b/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */