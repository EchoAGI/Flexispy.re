package com.krecorder.call.callrecorder;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import com.krecorder.call.recording.MediaFormat;
import com.vvt.ak.a;
import com.vvt.io.p;
import java.io.File;

public class f
{
  private static final boolean b = a.a;
  private static final boolean c = a.e;
  private static f d;
  public boolean a;
  private File e;
  private String f;
  private MediaFormat g;
  private int h;
  private int i;
  private Context j;
  private h k;
  private boolean l;
  private Object m;
  private i n;
  private HandlerThread o;
  private String p;
  private m q;
  private n r;
  
  private f()
  {
    Object localObject = new com/krecorder/call/callrecorder/g;
    ((g)localObject).<init>(this);
    this.r = ((n)localObject);
    boolean bool = b;
    if (bool) {}
    this.i = i1;
    bool = false;
    this.a = false;
    this.e = null;
    this.f = null;
    this.h = i1;
    this.g = null;
    this.j = null;
    localObject = this.o;
    if (localObject == null)
    {
      localObject = new android/os/HandlerThread;
      ((HandlerThread)localObject).<init>("MessageHandlerThread");
      this.o = ((HandlerThread)localObject);
      this.o.start();
      localObject = new com/krecorder/call/callrecorder/i;
      localLooper = this.o.getLooper();
      ((i)localObject).<init>(this, localLooper);
      this.n = ((i)localObject);
    }
  }
  
  public static f a()
  {
    f localf = d;
    if (localf == null)
    {
      localf = new com/krecorder/call/callrecorder/f;
      localf.<init>();
      d = localf;
    }
    return d;
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    this.m = localObject1;
    localObject1 = new com/krecorder/call/callrecorder/b;
    Object localObject2 = this.j;
    Object localObject3 = this.m;
    Object localObject4 = this.p;
    ((b)localObject1).<init>((Context)localObject2, localObject3, paramBoolean, (String)localObject4);
    this.q = ((m)localObject1);
    localObject1 = this.q;
    localObject2 = this.e.getAbsolutePath();
    localObject3 = this.f;
    localObject4 = this.g;
    int i1 = this.h;
    ((m)localObject1).a((String)localObject2, (String)localObject3, (MediaFormat)localObject4, i1);
    this.q.b(0);
    localObject1 = this.q;
    localObject2 = this.r;
    ((m)localObject1).a((n)localObject2);
  }
  
  private void b(boolean paramBoolean)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject1 = new com/krecorder/call/callrecorder/o;
    Object localObject2 = this.j;
    String str = this.p;
    ((o)localObject1).<init>((Context)localObject2, paramBoolean, str);
    this.q = ((m)localObject1);
    localObject1 = this.q;
    localObject2 = this.e.getAbsolutePath();
    str = this.f;
    MediaFormat localMediaFormat = this.g;
    int i1 = this.h;
    ((m)localObject1).a((String)localObject2, str, localMediaFormat, i1);
    this.q.b(0);
    localObject1 = this.q;
    localObject2 = this.r;
    ((m)localObject1).a((n)localObject2);
  }
  
  private boolean h()
  {
    int i1 = this.i;
    int i3 = 2;
    if (i1 == i3) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  private boolean i()
  {
    int i1 = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.j;
    if (localObject2 == null)
    {
      i1 = c;
      if (i1 == 0) {}
    }
    for (;;)
    {
      return bool1;
      localObject2 = this.g;
      if (localObject2 == null)
      {
        i1 = c;
        if (i1 == 0) {}
      }
      else
      {
        localObject2 = this.f;
        if (localObject2 == null)
        {
          i1 = c;
          if (i1 == 0) {}
        }
        else
        {
          localObject2 = this.e;
          if (localObject2 != null)
          {
            localObject2 = this.e;
            boolean bool3 = ((File)localObject2).exists();
            if (!bool3)
            {
              localObject2 = this.e;
              bool3 = ((File)localObject2).mkdirs();
              if (bool3) {}
            }
          }
          else
          {
            i1 = c;
            if (i1 == 0) {
              continue;
            }
            continue;
          }
          int i3 = this.h;
          int i4 = -1;
          if (i3 == i4)
          {
            i1 = c;
            if (i1 == 0) {}
          }
          else
          {
            int i2 = this.h;
            i3 = 7;
            if (i2 == i3)
            {
              bool2 = c;
              if (bool2) {}
              localObject1 = MediaFormat.AMR;
              this.g = ((MediaFormat)localObject1);
            }
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = this.f;
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = this.g.getFileExtention();
            localObject1 = (String)localObject2;
            this.f = ((String)localObject1);
            boolean bool2 = j();
            if (bool2)
            {
              bool2 = b;
              if (bool2) {}
              this.h = i1;
              d();
            }
            bool2 = i1;
          }
        }
      }
    }
  }
  
  private boolean j()
  {
    int i1 = 1;
    boolean bool1 = h();
    if (bool1)
    {
      int i2 = Build.VERSION.SDK_INT;
      int i5 = 19;
      if (i2 >= i5)
      {
        String str1 = Build.DEVICE.toLowerCase();
        String str2 = "htc_m8";
        boolean bool2 = str1.contains(str2);
        if (bool2)
        {
          str1 = Build.MODEL.toLowerCase();
          str2 = "htc6525lvw";
          bool2 = str1.contains(str2);
          if (!bool2)
          {
            int i3 = this.h;
            i5 = 4;
            if (i3 != i5)
            {
              i3 = this.h;
              if (i3 != i1)
              {
                int i4 = this.h;
                int i6 = 7;
                if (i4 != i6) {
                  break label108;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return i1;
      label108:
      i1 = 0;
    }
  }
  
  private void k()
  {
    try
    {
      m localm = this.q;
      if (localm != null)
      {
        boolean bool = j();
        if (bool)
        {
          bool = b;
          if (bool) {}
          e();
        }
        bool = b;
        if (bool) {}
        localm = this.q;
        localm.d();
        bool = false;
        localm = null;
        this.q = null;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public void a(int paramInt, MediaFormat paramMediaFormat, File paramFile, String paramString1, Context paramContext, h paramh, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload 5
    //   5: putfield 69	com/krecorder/call/callrecorder/f:j	Landroid/content/Context;
    //   8: iconst_2
    //   9: istore 8
    //   11: aload_0
    //   12: iload 8
    //   14: putfield 58	com/krecorder/call/callrecorder/f:i	I
    //   17: aload_0
    //   18: iload_1
    //   19: putfield 65	com/krecorder/call/callrecorder/f:AppEngine1	I
    //   22: aload_0
    //   23: aload 4
    //   25: putfield 63	com/krecorder/call/callrecorder/f:f	Ljava/lang/String;
    //   28: aload_0
    //   29: aload_2
    //   30: putfield 67	com/krecorder/call/callrecorder/f:FxFileObserverWorker	Lcom/krecorder/call/recording/MediaFormat;
    //   33: aload_0
    //   34: aload_3
    //   35: putfield 61	com/krecorder/call/callrecorder/f:e	Ljava/io/File;
    //   38: aload_0
    //   39: aload 6
    //   41: putfield 138	com/krecorder/call/callrecorder/f:k	Lcom/krecorder/call/callrecorder/AppEngine1;
    //   44: aload_0
    //   45: aload 7
    //   47: putfield 101	com/krecorder/call/callrecorder/f:p	Ljava/lang/String;
    //   50: aload_0
    //   51: getfield 106	com/krecorder/call/callrecorder/f:q	Lcom/krecorder/call/callrecorder/m;
    //   54: astore 9
    //   56: aload 9
    //   58: ifnull +26 -> 84
    //   61: aload_0
    //   62: getfield 106	com/krecorder/call/callrecorder/f:q	Lcom/krecorder/call/callrecorder/m;
    //   65: astore 9
    //   67: aload 9
    //   69: invokeinterface 206 1 0
    //   74: istore 8
    //   76: iload 8
    //   78: ifeq +6 -> 84
    //   81: aload_0
    //   82: monitorexit
    //   83: return
    //   84: aload_0
    //   85: getfield 92	com/krecorder/call/callrecorder/f:n	Lcom/krecorder/call/callrecorder/i;
    //   88: astore 9
    //   90: iconst_1
    //   91: istore 10
    //   93: aload 9
    //   95: iload 10
    //   97: invokevirtual 210	com/krecorder/call/callrecorder/i:sendEmptyMessage	(I)Z
    //   100: pop
    //   101: goto -20 -> 81
    //   104: astore 9
    //   106: aload_0
    //   107: monitorexit
    //   108: aload 9
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	f
    //   0	111	1	paramInt	int
    //   0	111	2	paramMediaFormat	MediaFormat
    //   0	111	3	paramFile	File
    //   0	111	4	paramString1	String
    //   0	111	5	paramContext	Context
    //   0	111	6	paramh	AppEngine1
    //   0	111	7	paramString2	String
    //   9	4	8	i1	int
    //   74	3	8	bool	boolean
    //   54	40	9	localObject1	Object
    //   104	5	9	localObject2	Object
    //   91	5	10	i2	int
    // Exception table:
    //   from	to	target	type
    //   3	8	104	finally
    //   12	17	104	finally
    //   18	22	104	finally
    //   23	28	104	finally
    //   29	33	104	finally
    //   34	38	104	finally
    //   39	44	104	finally
    //   45	50	104	finally
    //   50	54	104	finally
    //   61	65	104	finally
    //   67	74	104	finally
    //   84	88	104	finally
    //   95	101	104	finally
  }
  
  public boolean a(String paramString)
  {
    boolean bool1 = o.a(paramString);
    boolean bool2 = b.a(paramString);
    boolean bool3 = b;
    if ((!bool3) || ((bool1) && (bool2))) {}
    for (bool1 = true;; bool1 = false) {
      return bool1;
    }
  }
  
  public void b()
  {
    try
    {
      Object localObject1 = this.q;
      if (localObject1 != null)
      {
        localObject1 = this.q;
        boolean bool = ((m)localObject1).b();
        if (bool)
        {
          localObject1 = this.n;
          int i1 = 2;
          ((i)localObject1).sendEmptyMessage(i1);
        }
      }
      return;
    }
    finally {}
  }
  
  public void c()
  {
    int i1 = this.h;
    switch (i1)
    {
    }
    for (;;)
    {
      return;
      i1 = this.h;
      int i2 = 100;
      if (i1 == i2)
      {
        i1 = 1;
        this.a = i1;
      }
      b(false);
      continue;
      a(false);
    }
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: getstatic 41	com/krecorder/call/callrecorder/f:removeFromPath	Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +3 -> 8
    //   8: aload_0
    //   9: getfield 69	com/krecorder/call/callrecorder/f:j	Landroid/content/Context;
    //   12: astore_2
    //   13: ldc -37
    //   15: astore_3
    //   16: aload_2
    //   17: aload_3
    //   18: invokevirtual 225	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   21: astore_2
    //   22: aload_2
    //   23: checkcast 227	android/media/AudioManager
    //   26: astore_2
    //   27: ldc -27
    //   29: astore_3
    //   30: aload_2
    //   31: aload_3
    //   32: invokevirtual 232	android/media/AudioManager:setParameters	(Ljava/lang/String;)V
    //   35: getstatic 41	com/krecorder/call/callrecorder/f:removeFromPath	Z
    //   38: istore_1
    //   39: iload_1
    //   40: ifeq +3 -> 43
    //   43: aload_0
    //   44: getfield 69	com/krecorder/call/callrecorder/f:j	Landroid/content/Context;
    //   47: astore_2
    //   48: ldc -37
    //   50: astore_3
    //   51: aload_2
    //   52: aload_3
    //   53: invokevirtual 225	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   56: astore_2
    //   57: aload_2
    //   58: checkcast 227	android/media/AudioManager
    //   61: astore_2
    //   62: ldc -22
    //   64: astore_3
    //   65: aload_2
    //   66: aload_3
    //   67: invokevirtual 232	android/media/AudioManager:setParameters	(Ljava/lang/String;)V
    //   70: return
    //   71: astore_2
    //   72: getstatic 45	com/krecorder/call/callrecorder/f:MyUncaughtExceptionHandler	Z
    //   75: istore_1
    //   76: iload_1
    //   77: ifeq -42 -> 35
    //   80: goto -45 -> 35
    //   83: astore_2
    //   84: getstatic 45	com/krecorder/call/callrecorder/f:MyUncaughtExceptionHandler	Z
    //   87: istore_1
    //   88: iload_1
    //   89: ifeq -19 -> 70
    //   92: goto -22 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	f
    //   3	86	1	bool	boolean
    //   12	54	2	localObject	Object
    //   71	1	2	localException1	Exception
    //   83	1	2	localException2	Exception
    //   15	52	3	str	String
    // Exception table:
    //   from	to	target	type
    //   0	3	71	java/lang/Exception
    //   8	12	71	java/lang/Exception
    //   17	21	71	java/lang/Exception
    //   22	26	71	java/lang/Exception
    //   31	35	71	java/lang/Exception
    //   35	38	83	java/lang/Exception
    //   43	47	83	java/lang/Exception
    //   52	56	83	java/lang/Exception
    //   57	61	83	java/lang/Exception
    //   66	70	83	java/lang/Exception
  }
  
  /* Error */
  public void e()
  {
    // Byte code:
    //   0: getstatic 41	com/krecorder/call/callrecorder/f:removeFromPath	Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +3 -> 8
    //   8: aload_0
    //   9: getfield 69	com/krecorder/call/callrecorder/f:j	Landroid/content/Context;
    //   12: astore_2
    //   13: ldc -37
    //   15: astore_3
    //   16: aload_2
    //   17: aload_3
    //   18: invokevirtual 225	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   21: astore_2
    //   22: aload_2
    //   23: checkcast 227	android/media/AudioManager
    //   26: astore_2
    //   27: ldc -18
    //   29: astore_3
    //   30: aload_2
    //   31: aload_3
    //   32: invokevirtual 232	android/media/AudioManager:setParameters	(Ljava/lang/String;)V
    //   35: getstatic 41	com/krecorder/call/callrecorder/f:removeFromPath	Z
    //   38: istore_1
    //   39: iload_1
    //   40: ifeq +3 -> 43
    //   43: aload_0
    //   44: getfield 69	com/krecorder/call/callrecorder/f:j	Landroid/content/Context;
    //   47: astore_2
    //   48: ldc -37
    //   50: astore_3
    //   51: aload_2
    //   52: aload_3
    //   53: invokevirtual 225	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   56: astore_2
    //   57: aload_2
    //   58: checkcast 227	android/media/AudioManager
    //   61: astore_2
    //   62: ldc -16
    //   64: astore_3
    //   65: aload_2
    //   66: aload_3
    //   67: invokevirtual 232	android/media/AudioManager:setParameters	(Ljava/lang/String;)V
    //   70: return
    //   71: astore_2
    //   72: getstatic 45	com/krecorder/call/callrecorder/f:MyUncaughtExceptionHandler	Z
    //   75: istore_1
    //   76: iload_1
    //   77: ifeq -42 -> 35
    //   80: goto -45 -> 35
    //   83: astore_2
    //   84: getstatic 45	com/krecorder/call/callrecorder/f:MyUncaughtExceptionHandler	Z
    //   87: istore_1
    //   88: iload_1
    //   89: ifeq -19 -> 70
    //   92: goto -22 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	f
    //   3	86	1	bool	boolean
    //   12	54	2	localObject	Object
    //   71	1	2	localException1	Exception
    //   83	1	2	localException2	Exception
    //   15	52	3	str	String
    // Exception table:
    //   from	to	target	type
    //   0	3	71	java/lang/Exception
    //   8	12	71	java/lang/Exception
    //   17	21	71	java/lang/Exception
    //   22	26	71	java/lang/Exception
    //   31	35	71	java/lang/Exception
    //   35	38	83	java/lang/Exception
    //   43	47	83	java/lang/Exception
    //   52	56	83	java/lang/Exception
    //   57	61	83	java/lang/Exception
    //   66	70	83	java/lang/Exception
  }
  
  public String f()
  {
    String str = null;
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = this.f;
      boolean bool = com.vvt.ag.b.a((String)localObject);
      if (!bool)
      {
        str = this.e.getAbsolutePath();
        localObject = this.f;
        str = p.a(str, (String)localObject);
      }
    }
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */