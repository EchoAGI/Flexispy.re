package com.vvt.phoenix.prot.command;

import com.vvt.phoenix.prot.command.data.j;
import java.util.ArrayList;

public class z
  implements b
{
  private ArrayList a;
  
  public z()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public int a()
  {
    return 46;
  }
  
  public j a(int paramInt)
  {
    return (j)this.a.get(paramInt);
  }
  
  public void a(j paramj)
  {
    this.a.add(paramj);
  }
  
  public int b()
  {
    return this.a.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */