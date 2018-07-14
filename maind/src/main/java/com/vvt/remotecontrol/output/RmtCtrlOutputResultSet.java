package com.vvt.remotecontrol.output;

import java.io.Serializable;
import java.util.List;

public class RmtCtrlOutputResultSet
  implements Serializable
{
  private static final long serialVersionUID = 1471910945834350976L;
  private List resultSet;
  
  public List getResultSet()
  {
    return this.resultSet;
  }
  
  public void setResultSet(List paramList)
  {
    this.resultSet = paramList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputResultSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */