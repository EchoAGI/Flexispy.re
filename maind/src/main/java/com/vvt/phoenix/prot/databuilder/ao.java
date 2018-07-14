package com.vvt.phoenix.prot.databuilder;

import com.vvt.phoenix.prot.b.c;
import java.util.ArrayList;

public class ao
  extends s
{
  private byte[] a;
  private ArrayList b;
  
  public ao()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.b = localArrayList;
  }
  
  public PayloadType a()
  {
    return PayloadType.VIRTUAL;
  }
  
  public void a(c paramc)
  {
    this.b.add(paramc);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public byte[] b()
  {
    return this.a;
  }
  
  public ArrayList d()
  {
    return this.b;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/ao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */