package com.vvt.appengine;

class n
{
  private String b;
  
  public n(l paraml, String paramString)
  {
    this.b = paramString;
  }
  
  public int a()
  {
    Thread localThread = new java/lang/Thread;
    o localo = new com/vvt/appengine/o;
    localo.<init>(this);
    localThread.<init>(localo);
    localThread.setPriority(10);
    localThread.start();
    return localThread.getPriority();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */