package com.vvt.phoenix.prot.command;

import com.vvt.phoenix.prot.command.data.c;
import java.util.ArrayList;

public class v
  implements b
{
  private ArrayList a;
  
  public v()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public int a()
  {
    return 29;
  }
  
  public c a(int paramInt)
  {
    return (c)this.a.get(paramInt);
  }
  
  public void a(c paramc)
  {
    this.a.add(paramc);
  }
  
  public int b()
  {
    return this.a.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */