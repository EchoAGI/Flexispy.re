package com.vvt.base;

import java.io.Serializable;

public class FxActionParameter
  implements Serializable
{
  private static final long serialVersionUID = 6862951843645258964L;
  private long mParameterSize;
  
  public long getParameterSize()
  {
    return this.mParameterSize;
  }
  
  public void setParameterSize(long paramLong)
  {
    this.mParameterSize = paramLong;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/FxActionParameter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */