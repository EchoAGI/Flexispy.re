package com.vvt.qq.internal.pb;

public abstract class PBPrimitiveField
  extends PBField
{
  private boolean hasFlag = false;
  
  public final boolean has()
  {
    return this.hasFlag;
  }
  
  public final void setHasFlag(boolean paramBoolean)
  {
    this.hasFlag = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBPrimitiveField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */