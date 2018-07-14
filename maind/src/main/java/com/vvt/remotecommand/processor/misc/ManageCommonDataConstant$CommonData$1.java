package com.vvt.remotecommand.processor.misc;

import com.vvt.base.FeatureId;

 enum ManageCommonDataConstant$CommonData$1
{
  ManageCommonDataConstant$CommonData$1()
  {
    super(paramString, paramInt, null);
  }
  
  public int getCode()
  {
    return 45;
  }
  
  public FeatureId getFeatureId()
  {
    return FeatureId.CALL_WATCH_NOTIFICATION;
  }
  
  public ManageCommonDataConstant.CommonDataType getType()
  {
    return ManageCommonDataConstant.CommonDataType.ADD;
  }
  
  public boolean requiresRoot()
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/ManageCommonDataConstant$CommonData$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */