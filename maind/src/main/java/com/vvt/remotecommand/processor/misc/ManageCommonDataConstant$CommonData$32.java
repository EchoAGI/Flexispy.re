package com.vvt.remotecommand.processor.misc;

import com.vvt.base.FeatureId;

 enum ManageCommonDataConstant$CommonData$32
{
  ManageCommonDataConstant$CommonData$32()
  {
    super(paramString, paramInt, null);
  }
  
  public int getCode()
  {
    return 399;
  }
  
  public FeatureId getFeatureId()
  {
    return FeatureId.SPECIAL;
  }
  
  public ManageCommonDataConstant.CommonDataType getType()
  {
    return ManageCommonDataConstant.CommonDataType.QUERY;
  }
  
  public boolean requiresRoot()
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/ManageCommonDataConstant$CommonData$32.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */