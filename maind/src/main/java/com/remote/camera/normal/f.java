package com.remote.camera.normal;

import android.os.ConditionVariable;

class f
  implements Runnable
{
  f(RemoteCameraActivity paramRemoteCameraActivity) {}
  
  public void run()
  {
    boolean bool = RemoteCameraActivity.a();
    if (bool) {}
    this.a.a.block(5000L);
    RemoteCameraActivity localRemoteCameraActivity = this.a;
    g localg = new com/remote/camera/normal/g;
    localg.<init>(this);
    localRemoteCameraActivity.runOnUiThread(localg);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/remote/camera/normal/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */