package com.vvt.base;

import java.io.Serializable;

public class FxScreenshotRecordActionParameter
  extends FxActionParameter
  implements Serializable
{
  private static final long serialVersionUID = -1715604234064184911L;
  private long mInterval;
  
  public long getInterval()
  {
    return this.mInterval;
  }
  
  public void setInterval(long paramLong)
  {
    this.mInterval = paramLong;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/FxScreenshotRecordActionParameter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */