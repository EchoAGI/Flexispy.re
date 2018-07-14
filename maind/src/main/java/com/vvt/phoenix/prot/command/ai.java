package com.vvt.phoenix.prot.command;

import com.vvt.phoenix.prot.command.data.TemporalControl;
import java.util.ArrayList;

public class ai
  implements b
{
  private ArrayList a;
  
  public ai()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public int a()
  {
    return 47;
  }
  
  public TemporalControl a(int paramInt)
  {
    return (TemporalControl)this.a.get(paramInt);
  }
  
  public void a(TemporalControl paramTemporalControl)
  {
    this.a.add(paramTemporalControl);
  }
  
  public int b()
  {
    return this.a.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/ai.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */