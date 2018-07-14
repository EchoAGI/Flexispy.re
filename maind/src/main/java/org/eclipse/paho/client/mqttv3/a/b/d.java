package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.k;

public class d
  extends u
{
  private String c;
  private boolean d;
  private k e;
  private String f;
  private char[] g;
  private int h;
  private String i;
  private int j;
  
  public d(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)1);
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>((InputStream)localObject);
    b(localDataInputStream);
    localDataInputStream.readByte();
    localDataInputStream.readByte();
    int k = localDataInputStream.readUnsignedShort();
    this.h = k;
    localObject = b(localDataInputStream);
    this.c = ((String)localObject);
    localDataInputStream.close();
  }
  
  public d(String paramString1, int paramInt1, boolean paramBoolean, int paramInt2, String paramString2, char[] paramArrayOfChar, k paramk, String paramString3)
  {
    super((byte)1);
    this.c = paramString1;
    this.d = paramBoolean;
    this.h = paramInt2;
    this.f = paramString2;
    this.g = paramArrayOfChar;
    this.e = paramk;
    this.i = paramString3;
    this.j = paramInt1;
  }
  
  protected byte d_()
  {
    return 0;
  }
  
  public String e()
  {
    return "Con";
  }
  
  public byte[] e_()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localObject1 = new java/io/DataOutputStream;
      ((DataOutputStream)localObject1).<init>(localByteArrayOutputStream);
      Object localObject2 = this.c;
      a((DataOutputStream)localObject1, (String)localObject2);
      localObject2 = this.e;
      if (localObject2 != null)
      {
        localObject2 = this.i;
        a((DataOutputStream)localObject1, (String)localObject2);
        localObject2 = this.e;
        localObject2 = ((k)localObject2).a();
        int k = localObject2.length;
        ((DataOutputStream)localObject1).writeShort(k);
        localObject2 = this.e;
        localObject2 = ((k)localObject2).a();
        ((DataOutputStream)localObject1).write((byte[])localObject2);
      }
      localObject2 = this.f;
      if (localObject2 != null)
      {
        localObject2 = this.f;
        a((DataOutputStream)localObject1, (String)localObject2);
        localObject2 = this.g;
        if (localObject2 != null)
        {
          localObject2 = new java/lang/String;
          char[] arrayOfChar = this.g;
          ((String)localObject2).<init>(arrayOfChar);
          a((DataOutputStream)localObject1, (String)localObject2);
        }
      }
      ((DataOutputStream)localObject1).flush();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      Object localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
  }
  
  /* Error */
  protected byte[] f_()
  {
    // Byte code:
    //   0: new 68	java/io/ByteArrayOutputStream
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 70	java/io/ByteArrayOutputStream:<init>	()V
    //   8: new 72	java/io/DataOutputStream
    //   11: astore_2
    //   12: aload_2
    //   13: aload_1
    //   14: invokespecial 75	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   17: aload_0
    //   18: getfield 64	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:j	I
    //   21: istore_3
    //   22: iconst_3
    //   23: istore 4
    //   25: iload_3
    //   26: iload 4
    //   28: if_icmpne +163 -> 191
    //   31: ldc 112
    //   33: astore 5
    //   35: aload_0
    //   36: aload_2
    //   37: aload 5
    //   39: invokevirtual 79	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:a	(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield 64	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:j	I
    //   46: istore_3
    //   47: aload_2
    //   48: iload_3
    //   49: invokevirtual 114	java/io/DataOutputStream:write	(I)V
    //   52: iconst_0
    //   53: istore_3
    //   54: aconst_null
    //   55: astore 5
    //   57: aload_0
    //   58: getfield 54	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:d	Z
    //   61: istore 4
    //   63: iload 4
    //   65: ifeq +6 -> 71
    //   68: iconst_2
    //   69: i2b
    //   70: istore_3
    //   71: aload_0
    //   72: getfield 60	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:e	Lorg/eclipse/paho/client/mqttv3/k;
    //   75: astore 6
    //   77: aload 6
    //   79: ifnull +53 -> 132
    //   82: iload_3
    //   83: iconst_4
    //   84: ior
    //   85: i2b
    //   86: istore_3
    //   87: aload_0
    //   88: getfield 60	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:e	Lorg/eclipse/paho/client/mqttv3/k;
    //   91: astore 6
    //   93: aload 6
    //   95: invokevirtual 117	org/eclipse/paho/client/mqttv3/k:MyUncaughtExceptionHandler	()I
    //   98: iconst_3
    //   99: ishl
    //   100: istore 4
    //   102: iload_3
    //   103: iload 4
    //   105: ior
    //   106: i2b
    //   107: istore_3
    //   108: aload_0
    //   109: getfield 60	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:e	Lorg/eclipse/paho/client/mqttv3/k;
    //   112: astore 6
    //   114: aload 6
    //   116: invokevirtual 120	org/eclipse/paho/client/mqttv3/k:removeFromPath	()Z
    //   119: istore 4
    //   121: iload 4
    //   123: ifeq +9 -> 132
    //   126: iload_3
    //   127: bipush 32
    //   129: ior
    //   130: i2b
    //   131: istore_3
    //   132: aload_0
    //   133: getfield 56	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:f	Ljava/lang/String;
    //   136: astore 6
    //   138: aload 6
    //   140: ifnull +27 -> 167
    //   143: iload_3
    //   144: sipush 128
    //   147: ior
    //   148: i2b
    //   149: istore_3
    //   150: aload_0
    //   151: getfield 58	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:FxFileObserverWorker	[C
    //   154: astore 6
    //   156: aload 6
    //   158: ifnull +9 -> 167
    //   161: iload_3
    //   162: bipush 64
    //   164: ior
    //   165: i2b
    //   166: istore_3
    //   167: aload_2
    //   168: iload_3
    //   169: invokevirtual 114	java/io/DataOutputStream:write	(I)V
    //   172: aload_0
    //   173: getfield 46	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:AppEngine1	I
    //   176: istore_3
    //   177: aload_2
    //   178: iload_3
    //   179: invokevirtual 88	java/io/DataOutputStream:writeShort	(I)V
    //   182: aload_2
    //   183: invokevirtual 99	java/io/DataOutputStream:flush	()V
    //   186: aload_1
    //   187: invokevirtual 102	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   190: areturn
    //   191: aload_0
    //   192: getfield 64	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:j	I
    //   195: istore_3
    //   196: iconst_4
    //   197: istore 4
    //   199: iload_3
    //   200: iload 4
    //   202: if_icmpne -160 -> 42
    //   205: ldc 123
    //   207: astore 5
    //   209: aload_0
    //   210: aload_2
    //   211: aload 5
    //   213: invokevirtual 79	org/eclipse/paho/client/mqttv3/a/removeFromPath/d:a	(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    //   216: goto -174 -> 42
    //   219: astore 5
    //   221: new 104	org/eclipse/paho/client/mqttv3/MqttException
    //   224: astore_1
    //   225: aload_1
    //   226: aload 5
    //   228: invokespecial 107	org/eclipse/paho/client/mqttv3/MqttException:<init>	(Ljava/lang/Throwable;)V
    //   231: aload_1
    //   232: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	this	d
    //   3	229	1	localObject1	Object
    //   11	200	2	localDataOutputStream	DataOutputStream
    //   21	182	3	k	int
    //   23	6	4	m	int
    //   61	3	4	bool1	boolean
    //   100	6	4	n	int
    //   119	3	4	bool2	boolean
    //   197	6	4	i1	int
    //   33	179	5	str	String
    //   219	8	5	localIOException	IOException
    //   75	82	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	3	219	java/io/IOException
    //   4	8	219	java/io/IOException
    //   8	11	219	java/io/IOException
    //   13	17	219	java/io/IOException
    //   17	21	219	java/io/IOException
    //   37	42	219	java/io/IOException
    //   42	46	219	java/io/IOException
    //   48	52	219	java/io/IOException
    //   57	61	219	java/io/IOException
    //   71	75	219	java/io/IOException
    //   87	91	219	java/io/IOException
    //   93	98	219	java/io/IOException
    //   108	112	219	java/io/IOException
    //   114	119	219	java/io/IOException
    //   132	136	219	java/io/IOException
    //   150	154	219	java/io/IOException
    //   168	172	219	java/io/IOException
    //   172	176	219	java/io/IOException
    //   178	182	219	java/io/IOException
    //   182	186	219	java/io/IOException
    //   186	190	219	java/io/IOException
    //   191	195	219	java/io/IOException
    //   211	216	219	java/io/IOException
  }
  
  public boolean g_()
  {
    return false;
  }
  
  public String toString()
  {
    Object localObject1 = super.toString();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(" clientId ");
    localObject2 = this.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" keepAliveInterval ");
    int k = this.h;
    return k;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */