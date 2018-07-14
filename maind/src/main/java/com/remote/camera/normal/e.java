package com.remote.camera.normal;

import android.os.Bundle;

class e
  implements b
{
  e(RemoteCameraActivity paramRemoteCameraActivity) {}
  
  public void a(String paramString) {}
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      RemoteCameraActivity localRemoteCameraActivity = this.a;
      Object localObject = RemoteCameraActivity.b(this.a);
      String str = "path_front";
      localObject = ((Bundle)localObject).getString(str);
      RemoteCameraActivity.a(localRemoteCameraActivity, (String)localObject, i);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/remote/camera/normal/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */