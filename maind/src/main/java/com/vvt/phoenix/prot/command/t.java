package com.vvt.phoenix.prot.command;

import java.util.ArrayList;

public class t
  implements b
{
  private ArrayList a;
  
  public t()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public int a()
  {
    return 11;
  }
  
  public com.vvt.phoenix.prot.event.b a(int paramInt)
  {
    return (com.vvt.phoenix.prot.event.b)this.a.get(paramInt);
  }
  
  public int b()
  {
    return this.a.size();
  }
  
  public void b(com.vvt.phoenix.prot.event.b paramb)
  {
    this.a.add(paramb);
  }
  
  protected void c()
  {
    this.a.clear();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */