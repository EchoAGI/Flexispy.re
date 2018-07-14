package com.vvt.remotecontrol.input;

import java.io.Serializable;
import java.util.ArrayList;

public class RmtCtrlInputRequestHistoricalEvents
  implements Serializable
{
  private static final long serialVersionUID = 3977716668008892524L;
  private ArrayList mSettingIds;
  private int mTotalNumber = -1;
  
  public ArrayList getSettingIds()
  {
    return this.mSettingIds;
  }
  
  public int getTotalNumber()
  {
    return this.mTotalNumber;
  }
  
  public void setSettingIds(ArrayList paramArrayList)
  {
    this.mSettingIds = paramArrayList;
  }
  
  public void setTotalNumber(int paramInt)
  {
    this.mTotalNumber = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputRequestHistoricalEvents.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */