package com.vvt.phoenix.prot.command;

import com.vvt.phoenix.prot.command.data.InstalledApplication;
import java.util.ArrayList;

public class ac
  implements b
{
  private ArrayList a;
  
  public ac()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public int a()
  {
    return 25;
  }
  
  public InstalledApplication a(int paramInt)
  {
    return (InstalledApplication)this.a.get(paramInt);
  }
  
  public void a(InstalledApplication paramInstalledApplication)
  {
    this.a.add(paramInstalledApplication);
  }
  
  public int b()
  {
    return this.a.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */