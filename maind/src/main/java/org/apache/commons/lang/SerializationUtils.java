package org.apache.commons.lang;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;

public class SerializationUtils
{
  public static Object clone(Serializable paramSerializable)
  {
    return deserialize(serialize(paramSerializable));
  }
  
  /* Error */
  public static Object deserialize(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +15 -> 16
    //   4: new 18	java/lang/IllegalArgumentException
    //   7: astore_1
    //   8: aload_1
    //   9: ldc 20
    //   11: invokespecial 23	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: athrow
    //   16: aconst_null
    //   17: astore_2
    //   18: new 25	java/io/ObjectInputStream
    //   21: astore_3
    //   22: aload_3
    //   23: aload_0
    //   24: invokespecial 28	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   27: aload_3
    //   28: invokevirtual 32	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   31: astore_1
    //   32: aload_3
    //   33: ifnull +7 -> 40
    //   36: aload_3
    //   37: invokevirtual 35	java/io/ObjectInputStream:close	()V
    //   40: aload_1
    //   41: areturn
    //   42: astore 4
    //   44: new 37	org/apache/commons/lang/SerializationException
    //   47: astore_1
    //   48: aload_1
    //   49: aload 4
    //   51: invokespecial 40	org/apache/commons/lang/SerializationException:<init>	(Ljava/lang/Throwable;)V
    //   54: aload_1
    //   55: athrow
    //   56: astore_1
    //   57: aload_2
    //   58: ifnull +7 -> 65
    //   61: aload_2
    //   62: invokevirtual 35	java/io/ObjectInputStream:close	()V
    //   65: aload_1
    //   66: athrow
    //   67: astore 4
    //   69: new 37	org/apache/commons/lang/SerializationException
    //   72: astore_1
    //   73: aload_1
    //   74: aload 4
    //   76: invokespecial 40	org/apache/commons/lang/SerializationException:<init>	(Ljava/lang/Throwable;)V
    //   79: aload_1
    //   80: athrow
    //   81: pop
    //   82: goto -42 -> 40
    //   85: pop
    //   86: goto -21 -> 65
    //   89: astore_1
    //   90: aload_3
    //   91: astore_2
    //   92: goto -35 -> 57
    //   95: astore 4
    //   97: aload_3
    //   98: astore_2
    //   99: goto -30 -> 69
    //   102: astore 4
    //   104: aload_3
    //   105: astore_2
    //   106: goto -62 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	paramInputStream	java.io.InputStream
    //   7	48	1	localObject1	Object
    //   56	10	1	localObject2	Object
    //   72	8	1	localSerializationException	SerializationException
    //   89	1	1	localObject3	Object
    //   17	89	2	localObject4	Object
    //   21	84	3	localObjectInputStream	java.io.ObjectInputStream
    //   42	8	4	localClassNotFoundException1	ClassNotFoundException
    //   67	8	4	localIOException1	java.io.IOException
    //   95	1	4	localIOException2	java.io.IOException
    //   102	1	4	localClassNotFoundException2	ClassNotFoundException
    //   81	1	11	localIOException3	java.io.IOException
    //   85	1	12	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   18	21	42	java/lang/ClassNotFoundException
    //   23	27	42	java/lang/ClassNotFoundException
    //   18	21	56	finally
    //   23	27	56	finally
    //   44	47	56	finally
    //   49	54	56	finally
    //   54	56	56	finally
    //   69	72	56	finally
    //   74	79	56	finally
    //   79	81	56	finally
    //   18	21	67	java/io/IOException
    //   23	27	67	java/io/IOException
    //   36	40	81	java/io/IOException
    //   61	65	85	java/io/IOException
    //   27	31	89	finally
    //   27	31	95	java/io/IOException
    //   27	31	102	java/lang/ClassNotFoundException
  }
  
  public static Object deserialize(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The byte[] must not be null");
      throw localIllegalArgumentException;
    }
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    return deserialize(localByteArrayInputStream);
  }
  
  /* Error */
  public static void serialize(Serializable paramSerializable, java.io.OutputStream paramOutputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +15 -> 16
    //   4: new 18	java/lang/IllegalArgumentException
    //   7: astore_2
    //   8: aload_2
    //   9: ldc 56
    //   11: invokespecial 23	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: athrow
    //   16: aconst_null
    //   17: astore_3
    //   18: new 58	java/io/ObjectOutputStream
    //   21: astore 4
    //   23: aload 4
    //   25: aload_1
    //   26: invokespecial 61	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   29: aload 4
    //   31: aload_0
    //   32: invokevirtual 65	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   35: aload 4
    //   37: ifnull +8 -> 45
    //   40: aload 4
    //   42: invokevirtual 66	java/io/ObjectOutputStream:close	()V
    //   45: return
    //   46: astore 5
    //   48: new 37	org/apache/commons/lang/SerializationException
    //   51: astore_2
    //   52: aload_2
    //   53: aload 5
    //   55: invokespecial 40	org/apache/commons/lang/SerializationException:<init>	(Ljava/lang/Throwable;)V
    //   58: aload_2
    //   59: athrow
    //   60: astore_2
    //   61: aload_3
    //   62: ifnull +7 -> 69
    //   65: aload_3
    //   66: invokevirtual 66	java/io/ObjectOutputStream:close	()V
    //   69: aload_2
    //   70: athrow
    //   71: astore_2
    //   72: goto -27 -> 45
    //   75: pop
    //   76: goto -7 -> 69
    //   79: astore_2
    //   80: aload 4
    //   82: astore_3
    //   83: goto -22 -> 61
    //   86: astore 5
    //   88: aload 4
    //   90: astore_3
    //   91: goto -43 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	paramSerializable	Serializable
    //   0	94	1	paramOutputStream	java.io.OutputStream
    //   7	52	2	localObject1	Object
    //   60	10	2	localObject2	Object
    //   71	1	2	localIOException1	java.io.IOException
    //   79	1	2	localObject3	Object
    //   17	74	3	localObject4	Object
    //   21	68	4	localObjectOutputStream	java.io.ObjectOutputStream
    //   46	8	5	localIOException2	java.io.IOException
    //   86	1	5	localIOException3	java.io.IOException
    //   75	1	10	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   18	21	46	java/io/IOException
    //   25	29	46	java/io/IOException
    //   18	21	60	finally
    //   25	29	60	finally
    //   48	51	60	finally
    //   53	58	60	finally
    //   58	60	60	finally
    //   40	45	71	java/io/IOException
    //   65	69	75	java/io/IOException
    //   31	35	79	finally
    //   31	35	86	java/io/IOException
  }
  
  public static byte[] serialize(Serializable paramSerializable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>(512);
    serialize(paramSerializable, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/SerializationUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */