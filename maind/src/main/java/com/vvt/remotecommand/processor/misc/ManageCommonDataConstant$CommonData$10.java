package com.vvt.remotecommand.processor.misc;

import com.vvt.base.FeatureId;

 enum ManageCommonDataConstant$CommonData$10
{
  ManageCommonDataConstant$CommonData$10()
  {
    super(paramString, paramInt, null);
  }
  
  public int getCode()
  {
    return 131;
  }
  
  public FeatureId getFeatureId()
  {
    return FeatureId.CIS_NUMBER;
  }
  
  public ManageCommonDataConstant.CommonDataType getType()
  {
    return ManageCommonDataConstant.CommonDataType.RESET;
  }
  
  public boolean requiresRoot()
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/ManageCommonDataConstant$CommonData$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */