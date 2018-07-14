package com.vvt.phoenix.prot.command.a;

import java.util.ArrayList;

public class q
{
  private int a;
  private ArrayList b;
  
  public q(int paramInt)
  {
    this.a = paramInt;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.b = localArrayList;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String a(int paramInt)
  {
    return (String)this.b.get(paramInt);
  }
  
  public void a(String paramString)
  {
    this.b.add(paramString);
  }
  
  public int b()
  {
    return this.b.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/a/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */