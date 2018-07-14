package com.vvt.phoenix.prot.command.a;

import com.vvt.phoenix.prot.event.b;
import java.util.ArrayList;

public class g
  extends s
{
  private ArrayList a;
  
  public g()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public int a()
  {
    return 9;
  }
  
  public b a(int paramInt)
  {
    return (b)this.a.get(paramInt);
  }
  
  public void a(b paramb)
  {
    this.a.add(paramb);
  }
  
  public int b()
  {
    return this.a.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */