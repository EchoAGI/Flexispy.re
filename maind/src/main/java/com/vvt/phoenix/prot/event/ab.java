package com.vvt.phoenix.prot.event;

public abstract class ab
  extends r
{
  private ImServiceId a;
  
  public ab()
  {
    ImServiceId localImServiceId = ImServiceId.UNKNOWN;
    this.a = localImServiceId;
  }
  
  public void a(ImServiceId paramImServiceId)
  {
    this.a = paramImServiceId;
  }
  
  public ImServiceId h()
  {
    return this.a;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */