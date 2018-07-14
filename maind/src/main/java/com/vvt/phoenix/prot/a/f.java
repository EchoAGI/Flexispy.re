package com.vvt.phoenix.prot.a;

import com.vvt.phoenix.prot.command.a.aa;
import com.vvt.phoenix.prot.command.a.ab;
import com.vvt.phoenix.prot.command.a.ac;
import com.vvt.phoenix.prot.command.a.ad;
import com.vvt.phoenix.prot.command.a.ae;
import com.vvt.phoenix.prot.command.a.af;
import com.vvt.phoenix.prot.command.a.ag;
import com.vvt.phoenix.prot.command.a.ah;
import com.vvt.phoenix.prot.command.a.ai;
import com.vvt.phoenix.prot.command.a.aj;
import com.vvt.phoenix.prot.command.a.ak;
import com.vvt.phoenix.prot.command.a.al;
import com.vvt.phoenix.prot.command.a.am;
import com.vvt.phoenix.prot.command.a.b;
import com.vvt.phoenix.prot.command.a.c;
import com.vvt.phoenix.prot.command.a.e;
import com.vvt.phoenix.prot.command.a.h;
import com.vvt.phoenix.prot.command.a.j;
import com.vvt.phoenix.prot.command.a.l;
import com.vvt.phoenix.prot.command.a.m;
import com.vvt.phoenix.prot.command.a.n;
import com.vvt.phoenix.prot.command.a.o;
import com.vvt.phoenix.prot.command.a.p;
import com.vvt.phoenix.prot.command.a.r;
import com.vvt.phoenix.prot.command.a.s;
import com.vvt.phoenix.prot.command.a.u;
import com.vvt.phoenix.prot.command.a.v;
import com.vvt.phoenix.prot.command.a.w;
import com.vvt.phoenix.prot.command.a.x;
import com.vvt.phoenix.prot.command.a.y;
import com.vvt.phoenix.prot.command.a.z;
import com.vvt.phoenix.prot.command.data.Criteria;
import com.vvt.phoenix.prot.command.data.Criteria.Recurrence;
import com.vvt.phoenix.prot.command.data.TemporalControl;
import com.vvt.phoenix.prot.command.data.TemporalControl.Action;
import com.vvt.phoenix.prot.command.data.i;
import com.vvt.phoenix.prot.event.AppProfileAction;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class f
{
  private static final boolean a;
  
  static
  {
    boolean bool = com.vvt.phoenix.a.b;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private static s A(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 4;
    int j = 2;
    m localm = new com/vvt/phoenix/prot/command/a/m;
    localm.<init>();
    a(paramByteArrayInputStream, localm);
    int k = paramByteArrayInputStream.available();
    if (k > 0)
    {
      byte[] arrayOfByte1 = new byte[j];
      paramByteArrayInputStream.read(arrayOfByte1, 0, j);
      int m = com.vvt.phoenix.a.a.a(arrayOfByte1);
      k = 0;
      arrayOfByte1 = null;
      while (k < m)
      {
        com.vvt.phoenix.prot.command.data.k localk = new com/vvt/phoenix/prot/command/data/k;
        localk.<init>();
        int n = paramByteArrayInputStream.read();
        byte[] arrayOfByte2 = new byte[n];
        paramByteArrayInputStream.read(arrayOfByte2, 0, n);
        Object localObject = com.vvt.phoenix.a.a.d(arrayOfByte2);
        localk.a((String)localObject);
        localObject = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject, 0, i);
        long l = com.vvt.phoenix.a.a.b((byte[])localObject);
        localk.a(l);
        localObject = new byte[j];
        paramByteArrayInputStream.read((byte[])localObject, 0, j);
        n = com.vvt.phoenix.a.a.a((byte[])localObject);
        arrayOfByte2 = new byte[n];
        paramByteArrayInputStream.read(arrayOfByte2, 0, n);
        localObject = com.vvt.phoenix.a.a.d(arrayOfByte2);
        localk.b((String)localObject);
        localObject = new byte[j];
        paramByteArrayInputStream.read((byte[])localObject, 0, j);
        n = com.vvt.phoenix.a.a.a((byte[])localObject);
        arrayOfByte2 = new byte[n];
        paramByteArrayInputStream.read(arrayOfByte2, 0, n);
        localObject = com.vvt.phoenix.a.a.d(arrayOfByte2);
        localk.c((String)localObject);
        localObject = new byte[j];
        paramByteArrayInputStream.read((byte[])localObject, 0, j);
        n = com.vvt.phoenix.a.a.a((byte[])localObject);
        arrayOfByte2 = new byte[n];
        paramByteArrayInputStream.read(arrayOfByte2, 0, n);
        localObject = com.vvt.phoenix.a.a.d(arrayOfByte2);
        localk.d((String)localObject);
        localm.a(localk);
        k += 1;
      }
    }
    boolean bool = a;
    if (bool) {}
    return localm;
  }
  
  private static s B(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 2;
    int j = 10;
    int k = 5;
    int m = 4;
    n localn = new com/vvt/phoenix/prot/command/a/n;
    localn.<init>();
    a(paramByteArrayInputStream, localn);
    int n = paramByteArrayInputStream.available();
    if (n > 0)
    {
      Object localObject1 = new byte[i];
      paramByteArrayInputStream.read((byte[])localObject1, 0, i);
      int i1 = com.vvt.phoenix.a.a.a((byte[])localObject1);
      for (i = 0; i < i1; i = n)
      {
        TemporalControl localTemporalControl = new com/vvt/phoenix/prot/command/data/TemporalControl;
        localTemporalControl.<init>();
        n = paramByteArrayInputStream.read();
        Object localObject2 = TemporalControl.Action.forValue(n);
        localTemporalControl.a((TemporalControl.Action)localObject2);
        localObject1 = new com/vvt/phoenix/prot/command/data/a;
        ((com.vvt.phoenix.prot.command.data.a)localObject1).<init>();
        byte[] arrayOfByte = new byte[m];
        paramByteArrayInputStream.read(arrayOfByte, 0, m);
        long l1 = com.vvt.phoenix.a.a.b(arrayOfByte);
        long l2 = 0L;
        boolean bool2 = l1 < l2;
        if (bool2)
        {
          TemporalControl.Action localAction = TemporalControl.Action.RECORD_SCREENSHOT;
          if (localObject2 == localAction)
          {
            localObject1 = new byte[m];
            paramByteArrayInputStream.read((byte[])localObject1, 0, m);
            l2 = com.vvt.phoenix.a.a.b((byte[])localObject1);
            localObject1 = new com/vvt/phoenix/prot/command/data/i;
            ((i)localObject1).<init>();
            ((i)localObject1).b(l2);
            ((i)localObject1).a(l1);
          }
        }
        localTemporalControl.a((com.vvt.phoenix.prot.command.data.a)localObject1);
        localObject1 = new com/vvt/phoenix/prot/command/data/Criteria;
        ((Criteria)localObject1).<init>();
        localObject2 = Criteria.Recurrence.forValue(paramByteArrayInputStream.read());
        ((Criteria)localObject1).a((Criteria.Recurrence)localObject2);
        int i2 = paramByteArrayInputStream.read();
        ((Criteria)localObject1).a(i2);
        i2 = paramByteArrayInputStream.read();
        ((Criteria)localObject1).b(i2);
        i2 = paramByteArrayInputStream.read();
        ((Criteria)localObject1).c(i2);
        i2 = paramByteArrayInputStream.read();
        ((Criteria)localObject1).d(i2);
        localTemporalControl.a((Criteria)localObject1);
        localObject1 = new byte[j];
        paramByteArrayInputStream.read((byte[])localObject1, 0, j);
        localObject2 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localTemporalControl.a((String)localObject2);
        paramByteArrayInputStream.read((byte[])localObject1, 0, j);
        localObject1 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localTemporalControl.b((String)localObject1);
        localObject1 = new byte[k];
        paramByteArrayInputStream.read((byte[])localObject1, 0, k);
        localObject2 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localTemporalControl.c((String)localObject2);
        paramByteArrayInputStream.read((byte[])localObject1, 0, k);
        localObject1 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localTemporalControl.d((String)localObject1);
        localn.a(localTemporalControl);
        n = i + 1;
      }
    }
    boolean bool1 = a;
    if (bool1) {}
    return localn;
  }
  
  private static long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int i = 4096;
    byte[] arrayOfByte = new byte[i];
    long l2;
    for (long l1 = 0L;; l1 += l2)
    {
      int j = paramInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        return l1;
      }
      k = 0;
      paramOutputStream.write(arrayOfByte, 0, j);
      l2 = j;
    }
  }
  
  private static s a(ByteArrayInputStream paramByteArrayInputStream)
  {
    al localal = new com/vvt/phoenix/prot/command/a/al;
    localal.<init>();
    a(paramByteArrayInputStream, localal);
    return localal;
  }
  
  /* Error */
  private static s a(DataInputStream paramDataInputStream, String paramString)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: new 147	com/vvt/phoenix/prot/command/a/i
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 148	com/vvt/phoenix/prot/command/a/i:<init>	()V
    //   16: iconst_0
    //   17: istore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_0
    //   23: aload_3
    //   24: invokestatic 151	com/vvt/phoenix/prot/a/f:a	(Ljava/io/DataInputStream;Lcom/vvt/phoenix/prot/command/a/s;)V
    //   27: aload_0
    //   28: invokevirtual 154	java/io/DataInputStream:available	()I
    //   31: istore 6
    //   33: iload 6
    //   35: ifle +234 -> 269
    //   38: aload_0
    //   39: invokevirtual 155	java/io/DataInputStream:read	()I
    //   42: istore 6
    //   44: iload 6
    //   46: newarray <illegal type>
    //   48: astore 7
    //   50: iconst_0
    //   51: istore 8
    //   53: aconst_null
    //   54: astore 9
    //   56: aload 7
    //   58: arraylength
    //   59: istore 10
    //   61: aload_0
    //   62: aload 7
    //   64: iconst_0
    //   65: iload 10
    //   67: invokevirtual 156	java/io/DataInputStream:read	([BII)I
    //   70: pop
    //   71: aload 7
    //   73: invokestatic 49	com/vvt/phoenix/a/a:d	([B)Ljava/lang/String;
    //   76: astore 7
    //   78: aload_3
    //   79: aload 7
    //   81: invokevirtual 157	com/vvt/phoenix/prot/command/a/i:a	(Ljava/lang/String;)V
    //   84: bipush 8
    //   86: istore 6
    //   88: iload 6
    //   90: newarray <illegal type>
    //   92: astore 7
    //   94: iconst_4
    //   95: istore 8
    //   97: iconst_4
    //   98: istore 10
    //   100: aload_0
    //   101: aload 7
    //   103: iload 8
    //   105: iload 10
    //   107: invokevirtual 156	java/io/DataInputStream:read	([BII)I
    //   110: pop
    //   111: aload 7
    //   113: invokestatic 160	com/vvt/phoenix/a/a:MyUncaughtExceptionHandler	([B)J
    //   116: lstore 11
    //   118: aload_3
    //   119: lload 11
    //   121: invokevirtual 161	com/vvt/phoenix/prot/command/a/i:a	(J)V
    //   124: aload_3
    //   125: invokevirtual 164	com/vvt/phoenix/prot/command/a/i:removeFromPath	()Ljava/lang/String;
    //   128: astore 7
    //   130: aload_1
    //   131: aload 7
    //   133: invokestatic 169	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   136: astore 9
    //   138: new 171	java/io/File
    //   141: astore 13
    //   143: aload 13
    //   145: aload 9
    //   147: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   150: aload 13
    //   152: invokevirtual 177	java/io/File:delete	()Z
    //   155: pop
    //   156: new 179	java/io/DataOutputStream
    //   159: astore 7
    //   161: new 181	java/io/FileOutputStream
    //   164: astore 14
    //   166: aload 14
    //   168: aload 13
    //   170: invokespecial 184	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   173: aload 7
    //   175: aload 14
    //   177: invokespecial 187	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   180: aload_0
    //   181: invokevirtual 190	java/io/DataInputStream:readInt	()I
    //   184: istore 4
    //   186: iload 4
    //   188: i2l
    //   189: pop2
    //   190: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   193: istore 4
    //   195: iload 4
    //   197: ifeq +3 -> 200
    //   200: aload_0
    //   201: aload 7
    //   203: invokestatic 193	com/vvt/phoenix/prot/a/f:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   206: pop2
    //   207: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   210: istore 4
    //   212: iload 4
    //   214: ifeq +3 -> 217
    //   217: aload_3
    //   218: aload 9
    //   220: invokevirtual 194	com/vvt/phoenix/prot/command/a/i:removeFromPath	(Ljava/lang/String;)V
    //   223: aload 7
    //   225: invokestatic 198	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   228: aload_3
    //   229: areturn
    //   230: astore_3
    //   231: iconst_0
    //   232: istore 6
    //   234: aconst_null
    //   235: astore 7
    //   237: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   240: istore 4
    //   242: iload 4
    //   244: ifeq +3 -> 247
    //   247: aload_3
    //   248: athrow
    //   249: astore_3
    //   250: aload 7
    //   252: astore 5
    //   254: aload 5
    //   256: invokestatic 198	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   259: aload_3
    //   260: athrow
    //   261: astore_3
    //   262: goto -8 -> 254
    //   265: astore_3
    //   266: goto -29 -> 237
    //   269: iconst_0
    //   270: istore 6
    //   272: aconst_null
    //   273: astore 7
    //   275: goto -52 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	paramDataInputStream	DataInputStream
    //   0	278	1	paramString	String
    //   3	2	2	bool1	boolean
    //   11	218	3	locali	com.vvt.phoenix.prot.command.a.i
    //   230	18	3	localIOException1	java.io.IOException
    //   249	11	3	localObject1	Object
    //   261	1	3	localObject2	Object
    //   265	1	3	localIOException2	java.io.IOException
    //   17	170	4	i	int
    //   193	50	4	bool2	boolean
    //   20	235	5	localObject3	Object
    //   31	240	6	j	int
    //   48	226	7	localObject4	Object
    //   51	53	8	k	int
    //   54	165	9	str	String
    //   59	47	10	m	int
    //   116	4	11	l	long
    //   141	28	13	localFile	java.io.File
    //   164	12	14	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   23	27	230	java/io/IOException
    //   27	31	230	java/io/IOException
    //   38	42	230	java/io/IOException
    //   44	48	230	java/io/IOException
    //   56	59	230	java/io/IOException
    //   65	71	230	java/io/IOException
    //   71	76	230	java/io/IOException
    //   79	84	230	java/io/IOException
    //   88	92	230	java/io/IOException
    //   105	111	230	java/io/IOException
    //   111	116	230	java/io/IOException
    //   119	124	230	java/io/IOException
    //   124	128	230	java/io/IOException
    //   131	136	230	java/io/IOException
    //   138	141	230	java/io/IOException
    //   145	150	230	java/io/IOException
    //   150	156	230	java/io/IOException
    //   156	159	230	java/io/IOException
    //   161	164	230	java/io/IOException
    //   168	173	230	java/io/IOException
    //   175	180	230	java/io/IOException
    //   180	184	249	finally
    //   190	193	249	finally
    //   201	207	249	finally
    //   207	210	249	finally
    //   218	223	249	finally
    //   237	240	249	finally
    //   247	249	249	finally
    //   23	27	261	finally
    //   27	31	261	finally
    //   38	42	261	finally
    //   44	48	261	finally
    //   56	59	261	finally
    //   65	71	261	finally
    //   71	76	261	finally
    //   79	84	261	finally
    //   88	92	261	finally
    //   105	111	261	finally
    //   111	116	261	finally
    //   119	124	261	finally
    //   124	128	261	finally
    //   131	136	261	finally
    //   138	141	261	finally
    //   145	150	261	finally
    //   150	156	261	finally
    //   156	159	261	finally
    //   161	164	261	finally
    //   168	173	261	finally
    //   175	180	261	finally
    //   180	184	265	java/io/IOException
    //   190	193	265	java/io/IOException
    //   201	207	265	java/io/IOException
    //   207	210	265	java/io/IOException
    //   218	223	265	java/io/IOException
  }
  
  /* Error */
  public static s a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   15: istore_3
    //   16: iload_3
    //   17: ifeq +3 -> 20
    //   20: new 171	java/io/File
    //   23: astore 4
    //   25: aload 4
    //   27: aload_0
    //   28: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: new 202	java/io/FileInputStream
    //   34: astore 5
    //   36: aload 5
    //   38: aload 4
    //   40: invokespecial 203	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   43: new 153	java/io/DataInputStream
    //   46: astore 6
    //   48: aload 6
    //   50: aload 5
    //   52: invokespecial 206	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: iconst_4
    //   56: istore 7
    //   58: aload 6
    //   60: iload 7
    //   62: invokevirtual 210	java/io/DataInputStream:skipBytes	(I)I
    //   65: pop
    //   66: aload 6
    //   68: invokevirtual 214	java/io/DataInputStream:readShort	()S
    //   71: istore 7
    //   73: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   76: istore 8
    //   78: iload 8
    //   80: ifeq +3 -> 83
    //   83: aload 6
    //   85: invokevirtual 214	java/io/DataInputStream:readShort	()S
    //   88: istore 8
    //   90: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   93: istore 9
    //   95: iload 9
    //   97: ifeq +3 -> 100
    //   100: iload 8
    //   102: lookupswitch	default:+26->128, 9:+51->153, 40:+107->209
    //   128: iconst_0
    //   129: istore_3
    //   130: aconst_null
    //   131: astore 4
    //   133: aload 4
    //   135: iload 7
    //   137: invokevirtual 217	com/vvt/phoenix/prot/command/a/s:removeFromPath	(I)V
    //   140: aload 5
    //   142: invokestatic 219	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   145: aload 6
    //   147: invokestatic 219	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   150: aload 4
    //   152: areturn
    //   153: new 221	java/lang/StringBuilder
    //   156: astore 4
    //   158: aload 4
    //   160: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   163: aload 4
    //   165: aload_0
    //   166: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: astore 4
    //   171: ldc -28
    //   173: astore_2
    //   174: aload 4
    //   176: aload_2
    //   177: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: astore 4
    //   182: aload 4
    //   184: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: astore 4
    //   189: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   192: istore_1
    //   193: iload_1
    //   194: ifeq +3 -> 197
    //   197: aload 6
    //   199: aload 4
    //   201: invokestatic 234	com/vvt/phoenix/prot/a/f:removeFromPath	(Ljava/io/DataInputStream;Ljava/lang/String;)Lcom/vvt/phoenix/prot/command/a/FxFileObserverWorker;
    //   204: astore 4
    //   206: goto -73 -> 133
    //   209: aload 4
    //   211: invokevirtual 237	java/io/File:getParent	()Ljava/lang/String;
    //   214: astore 4
    //   216: aload 6
    //   218: aload 4
    //   220: invokestatic 240	com/vvt/phoenix/prot/a/f:a	(Ljava/io/DataInputStream;Ljava/lang/String;)Lcom/vvt/phoenix/prot/command/a/s;
    //   223: astore 4
    //   225: aload 4
    //   227: checkcast 147	com/vvt/phoenix/prot/command/a/i
    //   230: astore 4
    //   232: goto -99 -> 133
    //   235: astore 4
    //   237: aconst_null
    //   238: astore 6
    //   240: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   243: istore 10
    //   245: iload 10
    //   247: ifeq +3 -> 250
    //   250: aload 4
    //   252: athrow
    //   253: astore 4
    //   255: aload_2
    //   256: astore 5
    //   258: aload 5
    //   260: invokestatic 219	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   263: aload 6
    //   265: invokestatic 219	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   268: aload 4
    //   270: athrow
    //   271: astore 4
    //   273: aconst_null
    //   274: astore 6
    //   276: iconst_0
    //   277: istore 10
    //   279: aconst_null
    //   280: astore 5
    //   282: goto -24 -> 258
    //   285: astore 4
    //   287: aconst_null
    //   288: astore 6
    //   290: goto -32 -> 258
    //   293: astore 4
    //   295: goto -37 -> 258
    //   298: astore 4
    //   300: aconst_null
    //   301: astore 6
    //   303: aload 5
    //   305: astore_2
    //   306: goto -66 -> 240
    //   309: astore 4
    //   311: aload 5
    //   313: astore_2
    //   314: goto -74 -> 240
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	317	0	paramString	String
    //   1	193	1	bool1	boolean
    //   3	311	2	localObject1	Object
    //   7	123	3	bool2	boolean
    //   23	208	4	localObject2	Object
    //   235	16	4	localIOException1	java.io.IOException
    //   253	16	4	localObject3	Object
    //   271	1	4	localObject4	Object
    //   285	1	4	localObject5	Object
    //   293	1	4	localObject6	Object
    //   298	1	4	localIOException2	java.io.IOException
    //   309	1	4	localIOException3	java.io.IOException
    //   34	278	5	localObject7	Object
    //   46	256	6	localDataInputStream	DataInputStream
    //   56	80	7	i	int
    //   76	3	8	bool3	boolean
    //   88	13	8	j	int
    //   93	3	9	bool4	boolean
    //   243	35	10	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   12	15	235	java/io/IOException
    //   20	23	235	java/io/IOException
    //   27	31	235	java/io/IOException
    //   31	34	235	java/io/IOException
    //   38	43	235	java/io/IOException
    //   240	243	253	finally
    //   250	253	253	finally
    //   12	15	271	finally
    //   20	23	271	finally
    //   27	31	271	finally
    //   31	34	271	finally
    //   38	43	271	finally
    //   43	46	285	finally
    //   50	55	285	finally
    //   60	66	293	finally
    //   66	71	293	finally
    //   73	76	293	finally
    //   83	88	293	finally
    //   90	93	293	finally
    //   135	140	293	finally
    //   153	156	293	finally
    //   158	163	293	finally
    //   165	169	293	finally
    //   176	180	293	finally
    //   182	187	293	finally
    //   189	192	293	finally
    //   199	204	293	finally
    //   209	214	293	finally
    //   218	223	293	finally
    //   225	230	293	finally
    //   43	46	298	java/io/IOException
    //   50	55	298	java/io/IOException
    //   60	66	309	java/io/IOException
    //   66	71	309	java/io/IOException
    //   73	76	309	java/io/IOException
    //   83	88	309	java/io/IOException
    //   90	93	309	java/io/IOException
    //   135	140	309	java/io/IOException
    //   153	156	309	java/io/IOException
    //   158	163	309	java/io/IOException
    //   165	169	309	java/io/IOException
    //   176	180	309	java/io/IOException
    //   182	187	309	java/io/IOException
    //   189	192	309	java/io/IOException
    //   199	204	309	java/io/IOException
    //   209	214	309	java/io/IOException
    //   218	223	309	java/io/IOException
    //   225	230	309	java/io/IOException
  }
  
  /* Error */
  public static s a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: iconst_0
    //   9: istore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: new 27	java/io/ByteArrayInputStream
    //   15: astore 4
    //   17: aload 4
    //   19: aload_0
    //   20: invokespecial 243	java/io/ByteArrayInputStream:<init>	([B)V
    //   23: iconst_0
    //   24: istore 5
    //   26: aconst_null
    //   27: astore 6
    //   29: aload 4
    //   31: iconst_0
    //   32: invokevirtual 246	java/io/ByteArrayInputStream:mark	(I)V
    //   35: iconst_2
    //   36: i2l
    //   37: lstore 7
    //   39: aload 4
    //   41: lload 7
    //   43: invokevirtual 252	java/io/ByteArrayInputStream:skip	(J)J
    //   46: pop2
    //   47: iconst_2
    //   48: istore 5
    //   50: iload 5
    //   52: newarray <illegal type>
    //   54: astore 6
    //   56: iconst_2
    //   57: istore 9
    //   59: aload 4
    //   61: aload 6
    //   63: iconst_0
    //   64: iload 9
    //   66: invokevirtual 35	java/io/ByteArrayInputStream:read	([BII)I
    //   69: pop
    //   70: aload 4
    //   72: invokevirtual 255	java/io/ByteArrayInputStream:reset	()V
    //   75: aload 6
    //   77: invokestatic 40	com/vvt/phoenix/a/a:a	([B)I
    //   80: istore 5
    //   82: iload 5
    //   84: tableswitch	default:+212->296, 0:+219->303, 1:+259->343, 2:+241->325, 3:+250->334, 4:+277->361, 5:+340->424, 6:+313->397, 7:+268->352, 8:+349->433, 9:+212->296, 10:+304->388, 11:+295->379, 12:+212->296, 13:+212->296, 14:+212->296, 15:+212->296, 16:+331->415, 17:+322->406, 18:+212->296, 19:+212->296, 20:+286->370, 21:+212->296, 22:+212->296, 23:+212->296, 24:+212->296, 25:+367->451, 26:+212->296, 27:+376->460, 28:+212->296, 29:+358->442, 30:+212->296, 31:+394->478, 32:+385->469, 33:+212->296, 34:+403->487, 35:+212->296, 36:+412->496, 37:+421->505, 38:+212->296, 39:+212->296, 40:+212->296, 41:+212->296, 42:+448->532, 43:+439->523, 44:+212->296, 45:+212->296, 46:+430->514, 47:+457->541, 48:+466->550
    //   296: aload 4
    //   298: invokestatic 219	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   301: aload_3
    //   302: areturn
    //   303: iload_1
    //   304: ifeq +12 -> 316
    //   307: aload 4
    //   309: invokestatic 258	com/vvt/phoenix/prot/a/f:removeFromPath	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   312: astore_3
    //   313: goto -17 -> 296
    //   316: aload 4
    //   318: invokestatic 260	com/vvt/phoenix/prot/a/f:a	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   321: astore_3
    //   322: goto -26 -> 296
    //   325: aload 4
    //   327: invokestatic 262	com/vvt/phoenix/prot/a/f:MyUncaughtExceptionHandler	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   330: astore_3
    //   331: goto -35 -> 296
    //   334: aload 4
    //   336: invokestatic 264	com/vvt/phoenix/prot/a/f:d	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   339: astore_3
    //   340: goto -44 -> 296
    //   343: aload 4
    //   345: invokestatic 267	com/vvt/phoenix/prot/a/f:e	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   348: astore_3
    //   349: goto -53 -> 296
    //   352: aload 4
    //   354: invokestatic 270	com/vvt/phoenix/prot/a/f:f	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   357: astore_3
    //   358: goto -62 -> 296
    //   361: aload 4
    //   363: invokestatic 273	com/vvt/phoenix/prot/a/f:FxFileObserverWorker	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   366: astore_3
    //   367: goto -71 -> 296
    //   370: aload 4
    //   372: invokestatic 276	com/vvt/phoenix/prot/a/f:AppEngine1	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   375: astore_3
    //   376: goto -80 -> 296
    //   379: aload 4
    //   381: invokestatic 279	com/vvt/phoenix/prot/a/f:i	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   384: astore_3
    //   385: goto -89 -> 296
    //   388: aload 4
    //   390: invokestatic 282	com/vvt/phoenix/prot/a/f:j	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   393: astore_3
    //   394: goto -98 -> 296
    //   397: aload 4
    //   399: invokestatic 285	com/vvt/phoenix/prot/a/f:s	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   402: astore_3
    //   403: goto -107 -> 296
    //   406: aload 4
    //   408: invokestatic 288	com/vvt/phoenix/prot/a/f:t	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   411: astore_3
    //   412: goto -116 -> 296
    //   415: aload 4
    //   417: invokestatic 291	com/vvt/phoenix/prot/a/f:u	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   420: astore_3
    //   421: goto -125 -> 296
    //   424: aload 4
    //   426: invokestatic 294	com/vvt/phoenix/prot/a/f:v	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   429: astore_3
    //   430: goto -134 -> 296
    //   433: aload 4
    //   435: invokestatic 297	com/vvt/phoenix/prot/a/f:w	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   438: astore_3
    //   439: goto -143 -> 296
    //   442: aload 4
    //   444: invokestatic 300	com/vvt/phoenix/prot/a/f:k	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   447: astore_3
    //   448: goto -152 -> 296
    //   451: aload 4
    //   453: invokestatic 303	com/vvt/phoenix/prot/a/f:l	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   456: astore_3
    //   457: goto -161 -> 296
    //   460: aload 4
    //   462: invokestatic 306	com/vvt/phoenix/prot/a/f:m	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   465: astore_3
    //   466: goto -170 -> 296
    //   469: aload 4
    //   471: invokestatic 309	com/vvt/phoenix/prot/a/f:x	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   474: astore_3
    //   475: goto -179 -> 296
    //   478: aload 4
    //   480: invokestatic 312	com/vvt/phoenix/prot/a/f:y	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   483: astore_3
    //   484: goto -188 -> 296
    //   487: aload 4
    //   489: invokestatic 315	com/vvt/phoenix/prot/a/f:n	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   492: astore_3
    //   493: goto -197 -> 296
    //   496: aload 4
    //   498: invokestatic 318	com/vvt/phoenix/prot/a/f:o	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   501: astore_3
    //   502: goto -206 -> 296
    //   505: aload 4
    //   507: invokestatic 321	com/vvt/phoenix/prot/a/f:p	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   510: astore_3
    //   511: goto -215 -> 296
    //   514: aload 4
    //   516: invokestatic 324	com/vvt/phoenix/prot/a/f:q	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   519: astore_3
    //   520: goto -224 -> 296
    //   523: aload 4
    //   525: invokestatic 327	com/vvt/phoenix/prot/a/f:z	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   528: astore_3
    //   529: goto -233 -> 296
    //   532: aload 4
    //   534: invokestatic 330	com/vvt/phoenix/prot/a/f:A	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   537: astore_3
    //   538: goto -242 -> 296
    //   541: aload 4
    //   543: invokestatic 333	com/vvt/phoenix/prot/a/f:r	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   546: astore_3
    //   547: goto -251 -> 296
    //   550: aload 4
    //   552: invokestatic 336	com/vvt/phoenix/prot/a/f:B	(Ljava/io/ByteArrayInputStream;)Lcom/vvt/phoenix/prot/command/a/s;
    //   555: astore_3
    //   556: goto -260 -> 296
    //   559: astore_3
    //   560: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   563: istore 5
    //   565: iload 5
    //   567: ifeq +3 -> 570
    //   570: aload_3
    //   571: athrow
    //   572: astore_3
    //   573: aload 4
    //   575: invokestatic 219	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   578: aload_3
    //   579: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	580	0	paramArrayOfByte	byte[]
    //   0	580	1	paramBoolean	boolean
    //   3	7	2	bool1	boolean
    //   11	545	3	locals	s
    //   559	12	3	localIOException	java.io.IOException
    //   572	7	3	localObject	Object
    //   15	559	4	localByteArrayInputStream	ByteArrayInputStream
    //   24	59	5	i	int
    //   563	3	5	bool2	boolean
    //   27	49	6	arrayOfByte	byte[]
    //   37	5	7	l	long
    //   57	8	9	j	int
    // Exception table:
    //   from	to	target	type
    //   31	35	559	java/io/IOException
    //   41	47	559	java/io/IOException
    //   50	54	559	java/io/IOException
    //   64	70	559	java/io/IOException
    //   70	75	559	java/io/IOException
    //   75	80	559	java/io/IOException
    //   307	312	559	java/io/IOException
    //   316	321	559	java/io/IOException
    //   325	330	559	java/io/IOException
    //   334	339	559	java/io/IOException
    //   343	348	559	java/io/IOException
    //   352	357	559	java/io/IOException
    //   361	366	559	java/io/IOException
    //   370	375	559	java/io/IOException
    //   379	384	559	java/io/IOException
    //   388	393	559	java/io/IOException
    //   397	402	559	java/io/IOException
    //   406	411	559	java/io/IOException
    //   415	420	559	java/io/IOException
    //   424	429	559	java/io/IOException
    //   433	438	559	java/io/IOException
    //   442	447	559	java/io/IOException
    //   451	456	559	java/io/IOException
    //   460	465	559	java/io/IOException
    //   469	474	559	java/io/IOException
    //   478	483	559	java/io/IOException
    //   487	492	559	java/io/IOException
    //   496	501	559	java/io/IOException
    //   505	510	559	java/io/IOException
    //   514	519	559	java/io/IOException
    //   523	528	559	java/io/IOException
    //   532	537	559	java/io/IOException
    //   541	546	559	java/io/IOException
    //   550	555	559	java/io/IOException
    //   31	35	572	finally
    //   41	47	572	finally
    //   50	54	572	finally
    //   64	70	572	finally
    //   70	75	572	finally
    //   75	80	572	finally
    //   307	312	572	finally
    //   316	321	572	finally
    //   325	330	572	finally
    //   334	339	572	finally
    //   343	348	572	finally
    //   352	357	572	finally
    //   361	366	572	finally
    //   370	375	572	finally
    //   379	384	572	finally
    //   388	393	572	finally
    //   397	402	572	finally
    //   406	411	572	finally
    //   415	420	572	finally
    //   424	429	572	finally
    //   433	438	572	finally
    //   442	447	572	finally
    //   451	456	572	finally
    //   460	465	572	finally
    //   469	474	572	finally
    //   478	483	572	finally
    //   487	492	572	finally
    //   496	501	572	finally
    //   505	510	572	finally
    //   514	519	572	finally
    //   523	528	572	finally
    //   532	537	572	finally
    //   541	546	572	finally
    //   550	555	572	finally
    //   560	563	572	finally
    //   570	572	572	finally
  }
  
  private static void a(ByteArrayInputStream paramByteArrayInputStream, s params)
  {
    int i = 4;
    int j = 2;
    Object localObject = new byte[j];
    paramByteArrayInputStream.read((byte[])localObject, 0, j);
    int k = com.vvt.phoenix.a.a.a((byte[])localObject);
    params.b(k);
    paramByteArrayInputStream.skip(2);
    paramByteArrayInputStream.read((byte[])localObject, 0, j);
    k = com.vvt.phoenix.a.a.a((byte[])localObject);
    params.c(k);
    paramByteArrayInputStream.read((byte[])localObject, 0, j);
    int m = com.vvt.phoenix.a.a.a((byte[])localObject);
    byte[] arrayOfByte = new byte[m];
    paramByteArrayInputStream.read(arrayOfByte, 0, m);
    localObject = com.vvt.phoenix.a.a.d(arrayOfByte);
    params.c((String)localObject);
    localObject = new byte[i];
    paramByteArrayInputStream.read((byte[])localObject, 0, i);
    long l = com.vvt.phoenix.a.a.b((byte[])localObject);
    params.c(l);
    d.a(paramByteArrayInputStream, params);
  }
  
  private static void a(DataInputStream paramDataInputStream, s params)
  {
    boolean bool = a;
    if (bool) {}
    int i = paramDataInputStream.readShort();
    params.c(i);
    byte[] arrayOfByte = new byte[paramDataInputStream.readShort()];
    paramDataInputStream.read(arrayOfByte);
    String str = new java/lang/String;
    str.<init>(arrayOfByte);
    params.c(str);
    long l = paramDataInputStream.readInt();
    params.c(l);
    d.a(paramDataInputStream, params);
  }
  
  private static void a(String paramString, int paramInt, DataInputStream paramDataInputStream, DataOutputStream paramDataOutputStream)
  {
    int i = a;
    if (i != 0) {}
    i = 0;
    while (i < paramInt)
    {
      int j = paramDataInputStream.readInt();
      paramDataOutputStream.writeInt(j);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      byte[] arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.read();
      paramDataOutputStream.write(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.readShort();
      paramDataOutputStream.writeShort(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.readInt();
      paramDataOutputStream.writeInt(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      j = paramDataInputStream.readInt();
      paramDataOutputStream.writeInt(j);
      arrayOfByte = new byte[j];
      paramDataInputStream.read(arrayOfByte);
      paramDataOutputStream.write(arrayOfByte);
      i += 1;
    }
  }
  
  /* Error */
  private static com.vvt.phoenix.prot.command.a.g b(DataInputStream paramDataInputStream, String paramString)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: new 360	com/vvt/phoenix/prot/command/a/FxFileObserverWorker
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 361	com/vvt/phoenix/prot/command/a/FxFileObserverWorker:<init>	()V
    //   16: iconst_0
    //   17: istore 4
    //   19: new 171	java/io/File
    //   22: astore 5
    //   24: aload 5
    //   26: aload_1
    //   27: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: aload 5
    //   32: invokevirtual 177	java/io/File:delete	()Z
    //   35: pop
    //   36: new 179	java/io/DataOutputStream
    //   39: astore 6
    //   41: new 181	java/io/FileOutputStream
    //   44: astore 7
    //   46: aload 7
    //   48: aload 5
    //   50: invokespecial 184	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   53: aload 6
    //   55: aload 7
    //   57: invokespecial 187	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   60: aload_0
    //   61: aload_3
    //   62: invokestatic 151	com/vvt/phoenix/prot/a/f:a	(Ljava/io/DataInputStream;Lcom/vvt/phoenix/prot/command/a/s;)V
    //   65: aload_0
    //   66: invokevirtual 155	java/io/DataInputStream:read	()I
    //   69: istore 4
    //   71: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   74: istore_2
    //   75: iload_2
    //   76: ifeq +3 -> 79
    //   79: iconst_0
    //   80: istore_2
    //   81: aconst_null
    //   82: astore 7
    //   84: iload_2
    //   85: iload 4
    //   87: if_icmpge +196 -> 283
    //   90: new 363	com/vvt/phoenix/prot/event/removeFromPath
    //   93: astore 8
    //   95: aload 8
    //   97: invokespecial 364	com/vvt/phoenix/prot/event/removeFromPath:<init>	()V
    //   100: aload_0
    //   101: invokevirtual 190	java/io/DataInputStream:readInt	()I
    //   104: istore 9
    //   106: iload 9
    //   108: i2l
    //   109: lstore 10
    //   111: aload 8
    //   113: lload 10
    //   115: invokevirtual 365	com/vvt/phoenix/prot/event/removeFromPath:a	(J)V
    //   118: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   121: istore 9
    //   123: iload 9
    //   125: ifeq +3 -> 128
    //   128: aload_0
    //   129: invokevirtual 155	java/io/DataInputStream:read	()I
    //   132: istore 9
    //   134: iload 9
    //   136: newarray <illegal type>
    //   138: astore 12
    //   140: aload_0
    //   141: aload 12
    //   143: invokevirtual 344	java/io/DataInputStream:read	([B)I
    //   146: pop
    //   147: new 346	java/lang/String
    //   150: astore 13
    //   152: aload 13
    //   154: aload 12
    //   156: invokespecial 347	java/lang/String:<init>	([B)V
    //   159: aload 8
    //   161: aload 13
    //   163: invokevirtual 366	com/vvt/phoenix/prot/event/removeFromPath:a	(Ljava/lang/String;)V
    //   166: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   169: istore 9
    //   171: iload 9
    //   173: ifeq +3 -> 176
    //   176: aload_0
    //   177: invokevirtual 214	java/io/DataInputStream:readShort	()S
    //   180: istore 9
    //   182: aload 8
    //   184: iload 9
    //   186: invokevirtual 367	com/vvt/phoenix/prot/event/removeFromPath:a	(I)V
    //   189: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   192: istore 14
    //   194: iload 14
    //   196: ifeq +3 -> 199
    //   199: new 369	com/vvt/phoenix/prot/command/a/t
    //   202: astore 13
    //   204: aload 5
    //   206: invokevirtual 373	java/io/File:length	()J
    //   209: lstore 15
    //   211: lload 15
    //   213: l2i
    //   214: istore 17
    //   216: aload 13
    //   218: aload_1
    //   219: iload 17
    //   221: iload 9
    //   223: invokespecial 376	com/vvt/phoenix/prot/command/a/t:<init>	(Ljava/lang/String;II)V
    //   226: aload 8
    //   228: aload 13
    //   230: invokevirtual 379	com/vvt/phoenix/prot/event/removeFromPath:a	(Lcom/vvt/phoenix/prot/command/e;)V
    //   233: aload_1
    //   234: iload 9
    //   236: aload_0
    //   237: aload 6
    //   239: invokestatic 382	com/vvt/phoenix/prot/a/f:a	(Ljava/lang/String;ILjava/io/DataInputStream;Ljava/io/DataOutputStream;)V
    //   242: aload_3
    //   243: aload 8
    //   245: invokevirtual 385	com/vvt/phoenix/prot/command/a/FxFileObserverWorker:a	(Lcom/vvt/phoenix/prot/event/removeFromPath;)V
    //   248: iload_2
    //   249: iconst_1
    //   250: iadd
    //   251: istore_2
    //   252: goto -168 -> 84
    //   255: astore 7
    //   257: aconst_null
    //   258: astore 6
    //   260: getstatic 14	com/vvt/phoenix/prot/a/f:a	Z
    //   263: istore 4
    //   265: iload 4
    //   267: ifeq +3 -> 270
    //   270: aload 7
    //   272: athrow
    //   273: astore 7
    //   275: aload 6
    //   277: invokestatic 198	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   280: aload 7
    //   282: athrow
    //   283: aload 6
    //   285: invokestatic 198	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   288: aload_3
    //   289: areturn
    //   290: astore 7
    //   292: aconst_null
    //   293: astore 6
    //   295: goto -20 -> 275
    //   298: astore 7
    //   300: goto -40 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	303	0	paramDataInputStream	DataInputStream
    //   0	303	1	paramString	String
    //   3	248	2	i	int
    //   251	1	2	j	int
    //   11	278	3	localg	com.vvt.phoenix.prot.command.a.FxFileObserverWorker
    //   17	71	4	k	int
    //   263	3	4	bool1	boolean
    //   22	183	5	localFile	java.io.File
    //   39	255	6	localDataOutputStream	DataOutputStream
    //   44	39	7	localFileOutputStream	java.io.FileOutputStream
    //   255	16	7	localIOException1	java.io.IOException
    //   273	8	7	localObject1	Object
    //   290	1	7	localObject2	Object
    //   298	1	7	localIOException2	java.io.IOException
    //   93	151	8	localb	com.vvt.phoenix.prot.event.removeFromPath
    //   104	3	9	m	int
    //   121	3	9	bool2	boolean
    //   132	3	9	n	int
    //   169	3	9	bool3	boolean
    //   180	55	9	i1	int
    //   109	5	10	l1	long
    //   138	17	12	arrayOfByte	byte[]
    //   150	79	13	localObject3	Object
    //   192	3	14	bool4	boolean
    //   209	3	15	l2	long
    //   214	6	17	i2	int
    // Exception table:
    //   from	to	target	type
    //   19	22	255	java/io/IOException
    //   26	30	255	java/io/IOException
    //   30	36	255	java/io/IOException
    //   36	39	255	java/io/IOException
    //   41	44	255	java/io/IOException
    //   48	53	255	java/io/IOException
    //   55	60	255	java/io/IOException
    //   61	65	273	finally
    //   65	69	273	finally
    //   71	74	273	finally
    //   90	93	273	finally
    //   95	100	273	finally
    //   100	104	273	finally
    //   113	118	273	finally
    //   118	121	273	finally
    //   128	132	273	finally
    //   134	138	273	finally
    //   141	147	273	finally
    //   147	150	273	finally
    //   154	159	273	finally
    //   161	166	273	finally
    //   166	169	273	finally
    //   176	180	273	finally
    //   184	189	273	finally
    //   189	192	273	finally
    //   199	202	273	finally
    //   204	209	273	finally
    //   221	226	273	finally
    //   228	233	273	finally
    //   237	242	273	finally
    //   243	248	273	finally
    //   260	263	273	finally
    //   270	273	273	finally
    //   19	22	290	finally
    //   26	30	290	finally
    //   30	36	290	finally
    //   36	39	290	finally
    //   41	44	290	finally
    //   48	53	290	finally
    //   55	60	290	finally
    //   61	65	298	java/io/IOException
    //   65	69	298	java/io/IOException
    //   71	74	298	java/io/IOException
    //   90	93	298	java/io/IOException
    //   95	100	298	java/io/IOException
    //   100	104	298	java/io/IOException
    //   113	118	298	java/io/IOException
    //   118	121	298	java/io/IOException
    //   128	132	298	java/io/IOException
    //   134	138	298	java/io/IOException
    //   141	147	298	java/io/IOException
    //   147	150	298	java/io/IOException
    //   154	159	298	java/io/IOException
    //   161	166	298	java/io/IOException
    //   166	169	298	java/io/IOException
    //   176	180	298	java/io/IOException
    //   184	189	298	java/io/IOException
    //   189	192	298	java/io/IOException
    //   199	202	298	java/io/IOException
    //   204	209	298	java/io/IOException
    //   221	226	298	java/io/IOException
    //   228	233	298	java/io/IOException
    //   237	242	298	java/io/IOException
    //   243	248	298	java/io/IOException
  }
  
  private static s b(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 4;
    r localr = new com/vvt/phoenix/prot/command/a/r;
    localr.<init>();
    a(paramByteArrayInputStream, localr);
    int j = paramByteArrayInputStream.available();
    if (j > 0)
    {
      byte[] arrayOfByte = new byte[i];
      paramByteArrayInputStream.read(arrayOfByte, 0, i);
      long l = com.vvt.phoenix.a.a.b(arrayOfByte);
      localr.a(l);
    }
    for (;;)
    {
      return localr;
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  private static s c(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 16;
    int j = 2;
    u localu = new com/vvt/phoenix/prot/command/a/u;
    localu.<init>();
    a(paramByteArrayInputStream, localu);
    int k = paramByteArrayInputStream.available();
    if (k > 0)
    {
      byte[] arrayOfByte = new byte[i];
      paramByteArrayInputStream.read(arrayOfByte, 0, i);
      localu.a(arrayOfByte);
      arrayOfByte = new byte[j];
      paramByteArrayInputStream.read(arrayOfByte, 0, j);
      k = com.vvt.phoenix.a.a.a(arrayOfByte);
      localu.a(k);
    }
    for (;;)
    {
      return localu;
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  private static s d(ByteArrayInputStream paramByteArrayInputStream)
  {
    ab localab = new com/vvt/phoenix/prot/command/a/ab;
    localab.<init>();
    a(paramByteArrayInputStream, localab);
    return localab;
  }
  
  private static s e(ByteArrayInputStream paramByteArrayInputStream)
  {
    ad localad = new com/vvt/phoenix/prot/command/a/ad;
    localad.<init>();
    a(paramByteArrayInputStream, localad);
    return localad;
  }
  
  private static s f(ByteArrayInputStream paramByteArrayInputStream)
  {
    aa localaa = new com/vvt/phoenix/prot/command/a/aa;
    localaa.<init>();
    a(paramByteArrayInputStream, localaa);
    return localaa;
  }
  
  private static s g(ByteArrayInputStream paramByteArrayInputStream)
  {
    ae localae = new com/vvt/phoenix/prot/command/a/ae;
    localae.<init>();
    a(paramByteArrayInputStream, localae);
    return localae;
  }
  
  private static s h(ByteArrayInputStream paramByteArrayInputStream)
  {
    ai localai = new com/vvt/phoenix/prot/command/a/ai;
    localai.<init>();
    a(paramByteArrayInputStream, localai);
    return localai;
  }
  
  private static s i(ByteArrayInputStream paramByteArrayInputStream)
  {
    w localw = new com/vvt/phoenix/prot/command/a/w;
    localw.<init>();
    a(paramByteArrayInputStream, localw);
    return localw;
  }
  
  private static s j(ByteArrayInputStream paramByteArrayInputStream)
  {
    v localv = new com/vvt/phoenix/prot/command/a/v;
    localv.<init>();
    a(paramByteArrayInputStream, localv);
    return localv;
  }
  
  private static s k(ByteArrayInputStream paramByteArrayInputStream)
  {
    y localy = new com/vvt/phoenix/prot/command/a/y;
    localy.<init>();
    a(paramByteArrayInputStream, localy);
    return localy;
  }
  
  private static s l(ByteArrayInputStream paramByteArrayInputStream)
  {
    af localaf = new com/vvt/phoenix/prot/command/a/af;
    localaf.<init>();
    a(paramByteArrayInputStream, localaf);
    return localaf;
  }
  
  private static s m(ByteArrayInputStream paramByteArrayInputStream)
  {
    ah localah = new com/vvt/phoenix/prot/command/a/ah;
    localah.<init>();
    a(paramByteArrayInputStream, localah);
    return localah;
  }
  
  private static s n(ByteArrayInputStream paramByteArrayInputStream)
  {
    x localx = new com/vvt/phoenix/prot/command/a/x;
    localx.<init>();
    a(paramByteArrayInputStream, localx);
    return localx;
  }
  
  private static s o(ByteArrayInputStream paramByteArrayInputStream)
  {
    z localz = new com/vvt/phoenix/prot/command/a/z;
    localz.<init>();
    a(paramByteArrayInputStream, localz);
    return localz;
  }
  
  private static s p(ByteArrayInputStream paramByteArrayInputStream)
  {
    ag localag = new com/vvt/phoenix/prot/command/a/ag;
    localag.<init>();
    a(paramByteArrayInputStream, localag);
    return localag;
  }
  
  private static s q(ByteArrayInputStream paramByteArrayInputStream)
  {
    ac localac = new com/vvt/phoenix/prot/command/a/ac;
    localac.<init>();
    a(paramByteArrayInputStream, localac);
    return localac;
  }
  
  private static s r(ByteArrayInputStream paramByteArrayInputStream)
  {
    ak localak = new com/vvt/phoenix/prot/command/a/ak;
    localak.<init>();
    a(paramByteArrayInputStream, localak);
    return localak;
  }
  
  private static s s(ByteArrayInputStream paramByteArrayInputStream)
  {
    j localj = new com/vvt/phoenix/prot/command/a/j;
    localj.<init>();
    a(paramByteArrayInputStream, localj);
    int i = paramByteArrayInputStream.available();
    if (i > 0)
    {
      int j = paramByteArrayInputStream.read();
      i = 0;
      while (i < j)
      {
        int k = paramByteArrayInputStream.read();
        localj.a(k);
        i += 1;
      }
    }
    boolean bool = a;
    if (bool) {}
    return localj;
  }
  
  private static s t(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 19;
    o localo = new com/vvt/phoenix/prot/command/a/o;
    localo.<init>();
    a(paramByteArrayInputStream, localo);
    int j = paramByteArrayInputStream.available();
    if (j > 0)
    {
      Object localObject = new byte[i];
      paramByteArrayInputStream.read((byte[])localObject, 0, i);
      localObject = com.vvt.phoenix.a.a.d((byte[])localObject);
      localo.a((String)localObject);
      j = paramByteArrayInputStream.read();
      localo.a(j);
      j = paramByteArrayInputStream.read();
      localObject = new byte[j];
      i = localObject.length;
      paramByteArrayInputStream.read((byte[])localObject, 0, i);
      localObject = com.vvt.phoenix.a.a.d((byte[])localObject);
      localo.b((String)localObject);
    }
    for (;;)
    {
      return localo;
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  private static s u(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 10;
    int j = 5;
    int k = 2;
    com.vvt.phoenix.prot.command.a.k localk = new com/vvt/phoenix/prot/command/a/k;
    localk.<init>();
    a(paramByteArrayInputStream, localk);
    int m = paramByteArrayInputStream.available();
    if (m > 0)
    {
      byte[] arrayOfByte1 = new byte[k];
      paramByteArrayInputStream.read(arrayOfByte1, 0, k);
      int n = com.vvt.phoenix.a.a.a(arrayOfByte1);
      m = 0;
      arrayOfByte1 = null;
      while (m < n)
      {
        c localc = new com/vvt/phoenix/prot/command/a/c;
        localc.<init>();
        int i1 = paramByteArrayInputStream.read();
        localc.a(i1);
        Object localObject1 = new com/vvt/phoenix/prot/command/a/d;
        ((com.vvt.phoenix.prot.command.a.d)localObject1).<init>();
        int i2 = paramByteArrayInputStream.read();
        ((com.vvt.phoenix.prot.command.a.d)localObject1).a(i2);
        i2 = paramByteArrayInputStream.read();
        ((com.vvt.phoenix.prot.command.a.d)localObject1).b(i2);
        i2 = paramByteArrayInputStream.read();
        ((com.vvt.phoenix.prot.command.a.d)localObject1).c(i2);
        i2 = paramByteArrayInputStream.read();
        ((com.vvt.phoenix.prot.command.a.d)localObject1).d(i2);
        localc.a((com.vvt.phoenix.prot.command.a.d)localObject1);
        Object localObject2 = new com/vvt/phoenix/prot/command/a/e;
        ((e)localObject2).<init>();
        byte[] arrayOfByte2 = new byte[k];
        paramByteArrayInputStream.read(arrayOfByte2, 0, k);
        int i3 = com.vvt.phoenix.a.a.a(arrayOfByte2);
        i1 = 0;
        localObject1 = null;
        while (i1 < i3)
        {
          paramByteArrayInputStream.read(arrayOfByte2, 0, k);
          int i4 = com.vvt.phoenix.a.a.a(arrayOfByte2);
          ((e)localObject2).a(i4);
          i1 += 1;
        }
        localc.a((e)localObject2);
        localObject1 = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject1, 0, i);
        localObject2 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localc.a((String)localObject2);
        paramByteArrayInputStream.read((byte[])localObject1, 0, i);
        localObject1 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localc.b((String)localObject1);
        localObject1 = new byte[j];
        paramByteArrayInputStream.read((byte[])localObject1, 0, j);
        localObject2 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localc.c((String)localObject2);
        paramByteArrayInputStream.read((byte[])localObject1, 0, j);
        localObject1 = com.vvt.phoenix.a.a.d((byte[])localObject1);
        localc.d((String)localObject1);
        i1 = paramByteArrayInputStream.read();
        localc.b(i1);
        i1 = paramByteArrayInputStream.read();
        localc.c(i1);
        localk.a(localc);
        m += 1;
      }
    }
    boolean bool = a;
    if (bool) {}
    return localk;
  }
  
  private static s v(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 16;
    int j = 2;
    l locall = new com/vvt/phoenix/prot/command/a/l;
    locall.<init>();
    a(paramByteArrayInputStream, locall);
    int k = paramByteArrayInputStream.available();
    if (k > 0)
    {
      byte[] arrayOfByte = new byte[i];
      paramByteArrayInputStream.read(arrayOfByte, 0, i);
      locall.a(arrayOfByte);
      arrayOfByte = new byte[j];
      paramByteArrayInputStream.read(arrayOfByte, 0, j);
      k = com.vvt.phoenix.a.a.a(arrayOfByte);
      locall.a(k);
    }
    for (;;)
    {
      return locall;
      boolean bool = a;
      if (!bool) {}
    }
  }
  
  private static s w(ByteArrayInputStream paramByteArrayInputStream)
  {
    com.vvt.phoenix.prot.command.a.f localf = new com/vvt/phoenix/prot/command/a/f;
    localf.<init>();
    a(paramByteArrayInputStream, localf);
    int i = paramByteArrayInputStream.available();
    String str;
    if (i > 0)
    {
      i = paramByteArrayInputStream.read();
      byte[] arrayOfByte = new byte[i];
      paramByteArrayInputStream.read(arrayOfByte, 0, i);
      str = com.vvt.phoenix.a.a.d(arrayOfByte);
      localf.a(str);
    }
    for (;;)
    {
      return localf;
      boolean bool = a;
      if (bool) {}
      str = new java/lang/String;
      str.<init>();
      localf.a(str);
    }
  }
  
  private static s x(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 2;
    p localp = new com/vvt/phoenix/prot/command/a/p;
    localp.<init>();
    a(paramByteArrayInputStream, localp);
    int j = paramByteArrayInputStream.available();
    if (j > 0)
    {
      j = paramByteArrayInputStream.read();
      localp.a(j);
      Object localObject1 = new byte[paramByteArrayInputStream.read()];
      int k = localObject1.length;
      paramByteArrayInputStream.read((byte[])localObject1, 0, k);
      localObject1 = com.vvt.phoenix.a.a.d((byte[])localObject1);
      localp.a((String)localObject1);
      localObject1 = new byte[i];
      paramByteArrayInputStream.read((byte[])localObject1, 0, i);
      k = com.vvt.phoenix.a.a.a((byte[])localObject1);
      j = 0;
      localObject1 = null;
      am localam;
      Object localObject2;
      int m;
      byte[] arrayOfByte;
      int n;
      while (j < k)
      {
        localam = new com/vvt/phoenix/prot/command/a/am;
        localam.<init>();
        localObject2 = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject2, 0, i);
        m = com.vvt.phoenix.a.a.a((byte[])localObject2);
        arrayOfByte = new byte[m];
        paramByteArrayInputStream.read(arrayOfByte, 0, m);
        localObject2 = com.vvt.phoenix.a.a.d(arrayOfByte);
        localam.a((String)localObject2);
        m = paramByteArrayInputStream.read();
        localObject2 = new byte[m];
        n = localObject2.length;
        paramByteArrayInputStream.read((byte[])localObject2, 0, n);
        localObject2 = com.vvt.phoenix.a.a.d((byte[])localObject2);
        localam.b((String)localObject2);
        localp.a(localam);
        j += 1;
      }
      localObject1 = new byte[i];
      paramByteArrayInputStream.read((byte[])localObject1, 0, i);
      k = com.vvt.phoenix.a.a.a((byte[])localObject1);
      j = 0;
      localObject1 = null;
      while (j < k)
      {
        localam = new com/vvt/phoenix/prot/command/a/am;
        localam.<init>();
        localObject2 = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject2, 0, i);
        m = com.vvt.phoenix.a.a.a((byte[])localObject2);
        arrayOfByte = new byte[m];
        paramByteArrayInputStream.read(arrayOfByte, 0, m);
        localObject2 = com.vvt.phoenix.a.a.d(arrayOfByte);
        localam.a((String)localObject2);
        m = paramByteArrayInputStream.read();
        localObject2 = new byte[m];
        n = localObject2.length;
        paramByteArrayInputStream.read((byte[])localObject2, 0, n);
        localObject2 = com.vvt.phoenix.a.a.d((byte[])localObject2);
        localam.b((String)localObject2);
        localp.b(localam);
        j += 1;
      }
    }
    boolean bool = a;
    if (bool) {}
    return localp;
  }
  
  private static s y(ByteArrayInputStream paramByteArrayInputStream)
  {
    int i = 2;
    h localh = new com/vvt/phoenix/prot/command/a/h;
    localh.<init>();
    a(paramByteArrayInputStream, localh);
    int j = paramByteArrayInputStream.available();
    if (j > 0)
    {
      Object localObject1 = AppProfileAction.forValue(paramByteArrayInputStream.read());
      localh.a((AppProfileAction)localObject1);
      localObject1 = new byte[i];
      paramByteArrayInputStream.read((byte[])localObject1, 0, i);
      j = com.vvt.phoenix.a.a.a((byte[])localObject1);
      byte[] arrayOfByte1 = new byte[j];
      paramByteArrayInputStream.read(arrayOfByte1, 0, j);
      localObject1 = new byte[i];
      paramByteArrayInputStream.read((byte[])localObject1, 0, i);
      int k = com.vvt.phoenix.a.a.a((byte[])localObject1);
      int m = 0;
      arrayOfByte1 = null;
      while (m < k)
      {
        b localb = new com/vvt/phoenix/prot/command/a/b;
        localb.<init>();
        localObject1 = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject1, 0, i);
        j = com.vvt.phoenix.a.a.a((byte[])localObject1);
        byte[] arrayOfByte2 = new byte[j];
        paramByteArrayInputStream.read(arrayOfByte2, 0, j);
        localObject1 = com.vvt.phoenix.a.a.d(arrayOfByte2);
        localb.a((String)localObject1);
        localObject1 = AppProfileAction.forValue(paramByteArrayInputStream.read());
        localb.a((AppProfileAction)localObject1);
        localObject1 = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject1, 0, i);
        j = com.vvt.phoenix.a.a.a((byte[])localObject1);
        arrayOfByte2 = new byte[j];
        paramByteArrayInputStream.read(arrayOfByte2, 0, j);
        localObject1 = com.vvt.phoenix.a.a.d(arrayOfByte2);
        localb.b((String)localObject1);
        localObject1 = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject1, 0, i);
        int n = com.vvt.phoenix.a.a.a((byte[])localObject1);
        j = 0;
        localObject1 = null;
        while (j < n)
        {
          com.vvt.phoenix.prot.command.a.a locala = new com/vvt/phoenix/prot/command/a/a;
          locala.<init>();
          Object localObject2 = new byte[i];
          paramByteArrayInputStream.read((byte[])localObject2, 0, i);
          int i1 = com.vvt.phoenix.a.a.a((byte[])localObject2);
          byte[] arrayOfByte3 = new byte[i1];
          paramByteArrayInputStream.read(arrayOfByte3, 0, i1);
          localObject2 = com.vvt.phoenix.a.a.d(arrayOfByte3);
          locala.a((String)localObject2);
          localObject2 = new byte[i];
          paramByteArrayInputStream.read((byte[])localObject2, 0, i);
          i1 = com.vvt.phoenix.a.a.a((byte[])localObject2);
          arrayOfByte3 = new byte[i1];
          paramByteArrayInputStream.read(arrayOfByte3, 0, i1);
          localObject2 = com.vvt.phoenix.a.a.d(arrayOfByte3);
          locala.b((String)localObject2);
          localb.a(locala);
          j += 1;
        }
        localh.a(localb);
        j = m + 1;
        m = j;
      }
    }
    boolean bool = a;
    if (bool) {}
    return localh;
  }
  
  private static s z(ByteArrayInputStream paramByteArrayInputStream)
  {
    aj localaj = new com/vvt/phoenix/prot/command/a/aj;
    localaj.<init>();
    a(paramByteArrayInputStream, localaj);
    return localaj;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */