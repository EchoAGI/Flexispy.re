package com.remote.camera.normal;

import android.os.Bundle;

class d
  implements Runnable
{
  d(RemoteCameraActivity paramRemoteCameraActivity) {}
  
  public void run()
  {
    Object localObject1 = this.a;
    int i = RemoteCameraActivity.a((RemoteCameraActivity)localObject1);
    boolean bool1;
    if (i == 0)
    {
      localObject1 = RemoteCameraActivity.b(this.a);
      Object localObject2 = "path_front";
      bool1 = ((Bundle)localObject1).containsKey((String)localObject2);
      if (!bool1) {
        break label78;
      }
      localObject1 = RemoteCameraActivity.b(this.a);
      localObject2 = "path_front";
      localObject1 = ((Bundle)localObject1).getString((String)localObject2);
      boolean bool2 = RemoteCameraActivity.a();
      if (bool2) {}
      localObject2 = this.a;
      int j = 1;
      RemoteCameraActivity.a((RemoteCameraActivity)localObject2, (String)localObject1, j);
    }
    for (;;)
    {
      return;
      label78:
      bool1 = RemoteCameraActivity.b();
      if (bool1) {}
      localObject1 = this.a;
      ((RemoteCameraActivity)localObject1).finish();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/remote/camera/normal/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */