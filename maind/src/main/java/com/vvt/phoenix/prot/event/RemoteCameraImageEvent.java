package com.vvt.phoenix.prot.event;

public class RemoteCameraImageEvent
  extends a
{
  private t a;
  private String b;
  private RemoteCameraImageEvent.CameraType c;
  
  public int a()
  {
    return 43;
  }
  
  public void a(RemoteCameraImageEvent.CameraType paramCameraType)
  {
    this.c = paramCameraType;
  }
  
  public void a(t paramt)
  {
    this.a = paramt;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public t d()
  {
    return this.a;
  }
  
  public String e()
  {
    return this.b;
  }
  
  public RemoteCameraImageEvent.CameraType f()
  {
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/RemoteCameraImageEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */